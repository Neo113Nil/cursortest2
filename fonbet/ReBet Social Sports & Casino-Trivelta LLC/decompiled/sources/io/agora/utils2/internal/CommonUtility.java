package io.agora.utils2.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.Constants;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.ThreadUtils;
import io.agora.utils2.internal.ConnectivityUtility;
import io.agora.utils2.internal.NetworkTracker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

@TargetApi(17)
/* loaded from: classes3.dex */
public class CommonUtility implements ConnectivityUtility.NetworkListener {
    private static final int INTERNAL_UPDATE_ROTATION = 200;
    private static final String LENGTH_SEPARATOR_CHARACTER = "agora_length_&&_";
    private static final String OFFSET_SEPARATOR_CHARACTER = "agora_offset_&&_";
    public static final String PREFIX_ASSETS = "/assets/";
    public static final String PREFIX_URI = "content://";
    private static final String TAG = "CommonUtility";
    static final int UNKNOWN_BATTERY_PERCENTAGE = 255;
    private static final String URI_PROTOCOL_HEAD = "/proc/";
    private static boolean ignoreMonitor = false;
    private static String mLoadLibraryPath = null;
    private static Handler mProcessInfoHandler = null;
    static String nativeLibraryPrefix = "lib";
    static String nativeLibrarySurffix = ".so";
    private static volatile CommonUtility sInstance;
    private ConnectivityUtility mConnectivityUtility;
    private final WeakReference<Context> mContext;
    private final Handler mHandler;
    private Listener mListener;
    private final ThreadUtils.ThreadChecker mThreadChecker;
    private ConnectivityManager.NetworkCallback mobileNetworkCallback = null;
    private volatile int mBatteryPercentage = 255;
    private boolean mDisposed = false;
    private volatile boolean mUpdateRotationTrigger = false;
    private volatile int lastOrientation = -1;
    private AgoraPhoneStateListener mPhoneStateListener = null;
    private PowerChangeReceiver mPowerChangeReceiver = null;
    private ProcessLifecycleOwner mProcessLifecycleOwner = null;
    private OrientationEventListener mOrientationListener = null;
    private DisplayManager.DisplayListener mDisplayListener = null;
    private BroadcastReceiver mOrientationObserver = null;
    private int mLastOrientation = -1;
    private NetworkTracker mNetworkTracker = null;
    private int mMultipathDisabledReason = 0;
    private AtomicInteger reference = new AtomicInteger(0);
    private ArrayList<SystemEventListener> systemEventListeners = new ArrayList<>();
    private final Runnable rotationRunnable = new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.12
        @Override // java.lang.Runnable
        public void run() {
            if (((Context) CommonUtility.this.mContext.get()) == null) {
                return;
            }
            CommonUtility.this.getDisplayRotation();
            CommonUtility.this.mUpdateRotationTrigger = false;
        }
    };

    public static class AgoraPhoneStateListener extends PhoneStateListener {
        private final WeakReference<CommonUtility> mCommonUtilityRef;
        private final WeakReference<Handler> mHandlerRef;
        private SignalStrength mSignalStrength;
        private volatile boolean phoneStatusNeedResume = false;

        public AgoraPhoneStateListener(CommonUtility commonUtility, Handler handler) {
            this.mCommonUtilityRef = new WeakReference<>(commonUtility);
            this.mHandlerRef = new WeakReference<>(handler);
        }

        private int invokeMethod(String str) {
            try {
                SignalStrength signalStrength = this.mSignalStrength;
                if (signalStrength != null) {
                    return ((Integer) signalStrength.getClass().getDeclaredMethod(str, null).invoke(this.mSignalStrength, null)).intValue();
                }
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }

        public void fillCellInfoByNetworkType(@NonNull List<CellSignalStrength> list, @NonNull MediaNetworkInfo mediaNetworkInfo) {
            int rssnr;
            int dbm;
            int level;
            for (CellSignalStrength cellSignalStrength : list) {
                if (cellSignalStrength instanceof CellSignalStrengthLte) {
                    CellSignalStrengthLte cellSignalStrengthLte = (CellSignalStrengthLte) cellSignalStrength;
                    mediaNetworkInfo.rssi = cellSignalStrengthLte.getDbm();
                    mediaNetworkInfo.signalLevel = cellSignalStrengthLte.getLevel();
                    rssnr = cellSignalStrengthLte.getRssnr();
                    mediaNetworkInfo.snr = rssnr;
                    return;
                }
                if ((cellSignalStrength instanceof CellSignalStrengthGsm) || (cellSignalStrength instanceof CellSignalStrengthCdma) || (cellSignalStrength instanceof CellSignalStrengthWcdma)) {
                    mediaNetworkInfo.rssi = cellSignalStrength.getDbm();
                    mediaNetworkInfo.signalLevel = cellSignalStrength.getLevel();
                    return;
                } else if (Build.VERSION.SDK_INT >= 29 && b.a(cellSignalStrength)) {
                    CellSignalStrengthNr a10 = c.a(cellSignalStrength);
                    dbm = a10.getDbm();
                    mediaNetworkInfo.rssi = dbm;
                    level = a10.getLevel();
                    mediaNetworkInfo.signalLevel = level;
                    return;
                }
            }
        }

        public void fillCellInfoHighLevel(@NonNull MediaNetworkInfo mediaNetworkInfo) {
            SignalStrength signalStrength = this.mSignalStrength;
            if (signalStrength != null) {
                try {
                    Method declaredMethod = signalStrength.getClass().getDeclaredMethod("getCellSignalStrengths", null);
                    if (declaredMethod != null) {
                        fillCellInfoByNetworkType((List) declaredMethod.invoke(this.mSignalStrength, null), mediaNetworkInfo);
                    }
                } catch (Exception unused) {
                    Logging.e(CommonUtility.TAG, "fillCellInfoHighLevel getDeclareMethod:getCellSignalStrengths failed! ");
                    fillCellInfoLowLevel(mediaNetworkInfo);
                }
            }
        }

        public void fillCellInfoIfPossible(Context context, MediaNetworkInfo mediaNetworkInfo) {
            if (Build.VERSION.SDK_INT <= 28) {
                fillCellInfoLowLevel(mediaNetworkInfo);
            } else {
                fillCellInfoHighLevel(mediaNetworkInfo);
            }
        }

        public void fillCellInfoLowLevel(@NonNull MediaNetworkInfo mediaNetworkInfo) {
            mediaNetworkInfo.rssi = getRssi();
            mediaNetworkInfo.signalLevel = getLevel();
        }

        public int getAsuLevel() {
            return invokeMethod("getAsuLevel");
        }

        public int getLevel() {
            return invokeMethod("getLevel");
        }

        public int getRssi() {
            return invokeMethod("getDbm");
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i10, String str) {
            super.onCallStateChanged(i10, str);
            final CommonUtility commonUtility = this.mCommonUtilityRef.get();
            Handler handler = this.mHandlerRef.get();
            if (commonUtility == null || handler == null) {
                return;
            }
            if (i10 == 0) {
                if (this.phoneStatusNeedResume) {
                    this.phoneStatusNeedResume = false;
                    Logging.d(CommonUtility.TAG, "system phone call end delay 1000ms");
                    handler.postDelayed(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.AgoraPhoneStateListener.1
                        @Override // java.lang.Runnable
                        public void run() {
                            commonUtility.onAudioRoutingPhoneChanged(true, 22, 0);
                        }
                    }, 1000L);
                    return;
                }
                return;
            }
            if (i10 == 1) {
                Logging.d(CommonUtility.TAG, "system phone call ring");
                this.phoneStatusNeedResume = true;
                commonUtility.onAudioRoutingPhoneChanged(false, 22, 1);
            } else if (i10 == 2) {
                Logging.d(CommonUtility.TAG, "system phone call start");
                this.phoneStatusNeedResume = true;
                commonUtility.onAudioRoutingPhoneChanged(false, 22, 2);
            }
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            this.mSignalStrength = signalStrength;
        }
    }

    public static class AndroidContextInfo {
        public String configDir;
        public String dataDir;
        public String device;
        public String deviceInfo;
        public String manufacturer;
        public String pkgName;
        public String pluginDir;
        public String systemInfo;

        @CalledByNative("AndroidContextInfo")
        public String getConfigDir() {
            return this.configDir;
        }

        @CalledByNative("AndroidContextInfo")
        public String getDataDir() {
            return this.dataDir;
        }

        @CalledByNative("AndroidContextInfo")
        public String getDevice() {
            return this.device;
        }

        @CalledByNative("AndroidContextInfo")
        public String getDeviceInfo() {
            return this.deviceInfo;
        }

        @CalledByNative("AndroidContextInfo")
        public String getManufacturer() {
            return this.manufacturer;
        }

        @CalledByNative("AndroidContextInfo")
        public String getPkgName() {
            return this.pkgName;
        }

        @CalledByNative("AndroidContextInfo")
        public String getPluginDir() {
            return this.pluginDir;
        }

        @CalledByNative("AndroidContextInfo")
        public String getSystemInfo() {
            return this.systemInfo;
        }
    }

    public interface Listener {
        void onAudioRoutingPhoneChanged(boolean z10, int i10, int i11);

        void onDispose();

        void onForegroundChanged(boolean z10);

        void onNetworkChange(MediaNetworkInfo mediaNetworkInfo);
    }

    public static class MediaNetworkInfo {
        String localIp4 = "";
        String gatewayIp4 = "";
        String localIp6 = "";
        String gatewayIp6 = "";
        int networkType = -1;
        int networkSubtype = -1;
        int signalLevel = 0;
        int rssi = 0;
        int snr = -100;
        ArrayList<String> dnsList = null;
        int linkspeed = 0;
        int frequency = 0;
        ArrayList<String> ifconfigs = null;

        @CalledByNative("MediaNetworkInfo")
        public int getAsu() {
            return this.snr;
        }

        @CalledByNative("MediaNetworkInfo")
        public ArrayList<String> getDnsList() {
            return this.dnsList;
        }

        @CalledByNative("MediaNetworkInfo")
        public int getFrequency() {
            return this.frequency;
        }

        @CalledByNative("MediaNetworkInfo")
        public String getGatewayIp4() {
            return this.gatewayIp4;
        }

        @CalledByNative("MediaNetworkInfo")
        public String getGatewayIp6() {
            return this.gatewayIp6;
        }

        @CalledByNative("MediaNetworkInfo")
        public int getLinkspeed() {
            return this.linkspeed;
        }

        @CalledByNative("MediaNetworkInfo")
        public String getLocalIp4() {
            return this.localIp4;
        }

        @CalledByNative("MediaNetworkInfo")
        public String getLocalIp6() {
            return this.localIp6;
        }

        @CalledByNative("MediaNetworkInfo")
        public int getNetworkSubtype() {
            return this.networkSubtype;
        }

        @CalledByNative("MediaNetworkInfo")
        public int getNetworkType() {
            return this.networkType;
        }

        @CalledByNative("MediaNetworkInfo")
        public int getRssi() {
            return this.rssi;
        }

        @CalledByNative("MediaNetworkInfo")
        public int getSignalLevel() {
            return this.signalLevel;
        }

        @CalledByNative("MediaNetworkInfo")
        public ArrayList<String> getVpnIfconfigs() {
            return this.ifconfigs;
        }

        public String toString() {
            return "MediaNetworkInfo{localIp4='" + this.localIp4 + "', gatewayIp4='" + this.gatewayIp4 + "', localIp6='" + this.localIp6 + "', gatewayIp6='" + this.gatewayIp6 + "', networkType=" + this.networkType + ", networkSubtype=" + this.networkSubtype + ", signalLevel=" + this.signalLevel + ", rssi=" + this.rssi + ", snr=" + this.snr + ", dnsList=" + this.dnsList + ", linkspeed=" + this.linkspeed + ", frequency=" + this.frequency + ", ifconfigs=" + this.ifconfigs + '}';
        }
    }

    public interface SystemEventListener {
        void onActiveNetworkChange(NetworkTracker.ActiveNetworkInfo[] activeNetworkInfoArr);

        void onAddressBound(String str);

        void onAudioRoutingPhoneChanged(boolean z10, int i10, int i11);

        void onBindSocket2NetworkIdResult(int i10, boolean z10);

        void onForegroundChanged(boolean z10);

        void onGravityOriChange(int i10);

        void onNetworkChange(MediaNetworkInfo mediaNetworkInfo);
    }

    private CommonUtility(Context context) {
        Logging.d(TAG, "constructor()");
        this.mContext = new WeakReference<>(context);
        this.mThreadChecker = new ThreadUtils.ThreadChecker();
        ConnectivityUtility connectivityUtility = new ConnectivityUtility(context);
        this.mConnectivityUtility = connectivityUtility;
        connectivityUtility.addNetworkListener(this);
        HandlerThread handlerThread = new HandlerThread("UtilityThread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mHandler = handler;
        handler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.1
            @Override // java.lang.Runnable
            public void run() {
                CommonUtility.this.startMonitor();
            }
        });
    }

    public static boolean checkAccessWifiState(Context context) {
        return context != null && context.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    private void disableDisplayListener() {
        Context context = this.mContext.get();
        if (context == null) {
            return;
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService(ViewProps.DISPLAY);
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.mDisplayListener);
            this.mDisplayListener = null;
        }
        Logging.d(TAG, "[disableDisplayListener] done!");
    }

    private void enableDisplayListener(Context context) {
        DisplayManager displayManager;
        if (context == null || this.mDisplayListener != null || (displayManager = (DisplayManager) context.getSystemService(ViewProps.DISPLAY)) == null) {
            return;
        }
        DisplayManager.DisplayListener displayListener = new DisplayManager.DisplayListener() { // from class: io.agora.utils2.internal.CommonUtility.11
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayAdded(int i10) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayChanged(int i10) {
                CommonUtility.this.updateOrientationManual();
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayRemoved(int i10) {
            }
        };
        this.mDisplayListener = displayListener;
        displayManager.registerDisplayListener(displayListener, this.mHandler);
        Logging.d(TAG, "[enableDisplayListener] done!");
    }

    @CalledByNative
    public static int getAndroidVersion() {
        return Build.VERSION.SDK_INT;
    }

    private static String getAppPrivateStorageDir(Context context) {
        File externalFilesDir;
        return (!"mounted".equals(Environment.getExternalStorageState()) || (externalFilesDir = context.getExternalFilesDir(null)) == null) ? context.getFilesDir().getAbsolutePath() : externalFilesDir.getAbsolutePath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    public static String getAssetsFilePath(Context context, String str) {
        String str2;
        AssetFileDescriptor openFd;
        int fd2;
        AssetFileDescriptor assetFileDescriptor = 0;
        String str3 = null;
        AssetFileDescriptor assetFileDescriptor2 = null;
        if (context == null || TextUtils.isEmpty(str)) {
            Logging.e(TAG, "getAssetsFilePath failed for init error");
            return null;
        }
        try {
            try {
                openFd = context.getAssets().openFd(str.substring(str.indexOf("/assets/") + 8));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
            str2 = null;
        }
        try {
            fd2 = ParcelFileDescriptor.dup(openFd.getFileDescriptor()).getFd();
        } catch (Exception e11) {
            e = e11;
            String str4 = str3;
            assetFileDescriptor2 = openFd;
            str2 = str4;
            e.printStackTrace();
            if (assetFileDescriptor2 != null) {
                try {
                    assetFileDescriptor2.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            assetFileDescriptor = str2;
            Logging.d(TAG, "getAssetsFilePath is: " + ((String) assetFileDescriptor));
            return assetFileDescriptor;
        } catch (Throwable th3) {
            th = th3;
            assetFileDescriptor = openFd;
            if (assetFileDescriptor != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            throw th;
        }
        if (fd2 < 0) {
            try {
                openFd.close();
                return null;
            } catch (IOException e14) {
                e14.printStackTrace();
                return null;
            }
        }
        str3 = "/assets/" + fd2 + OFFSET_SEPARATOR_CHARACTER + openFd.getStartOffset() + LENGTH_SEPARATOR_CHARACTER + openFd.getDeclaredLength();
        Logging.d(TAG, "getAssetsFilePath for init offset:" + openFd.getStartOffset() + "," + openFd.getDeclaredLength());
        try {
            openFd.close();
            assetFileDescriptor = str3;
        } catch (IOException e15) {
            e15.printStackTrace();
            assetFileDescriptor = str3;
        }
        Logging.d(TAG, "getAssetsFilePath is: " + ((String) assetFileDescriptor));
        return assetFileDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getContentFilePath(Context context, Uri uri) {
        AssetFileDescriptor assetFileDescriptor;
        int i10;
        AssetFileDescriptor assetFileDescriptor2 = null;
        if (context == null || uri == null) {
            Logging.e(TAG, "getContentFilePath failed for init error");
            return null;
        }
        try {
            assetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            try {
                try {
                    i10 = ParcelFileDescriptor.dup(assetFileDescriptor.getFileDescriptor()).getFd();
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    if (assetFileDescriptor != null) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    i10 = -1;
                    if (i10 >= 0) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                assetFileDescriptor2 = assetFileDescriptor;
                if (assetFileDescriptor2 != null) {
                    try {
                        assetFileDescriptor2.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            assetFileDescriptor = null;
        } catch (Throwable th3) {
            th = th3;
            if (assetFileDescriptor2 != null) {
            }
            throw th;
        }
        if (i10 >= 0) {
            return null;
        }
        String str = URI_PROTOCOL_HEAD + Process.myPid() + "/fd/" + i10;
        Logging.d(TAG, "getContentFilePath is: " + str);
        return str;
    }

    @CalledByNative
    public static AndroidContextInfo getContextInfo(Context context) {
        if (context == null) {
            Logging.w(TAG, "fail to getContextInfo, context null");
            return null;
        }
        AndroidContextInfo androidContextInfo = new AndroidContextInfo();
        androidContextInfo.device = DeviceUtils.getDeviceId();
        androidContextInfo.configDir = getAppPrivateStorageDir(context);
        androidContextInfo.dataDir = context.getCacheDir().getAbsolutePath();
        androidContextInfo.pluginDir = context.getApplicationInfo().nativeLibraryDir;
        androidContextInfo.deviceInfo = DeviceUtils.getDeviceInfo();
        androidContextInfo.systemInfo = DeviceUtils.getSystemInfo();
        androidContextInfo.manufacturer = DeviceUtils.getManufacturer();
        androidContextInfo.pkgName = context.getPackageName();
        return androidContextInfo;
    }

    private static String getCpuModelName() {
        String cpuinfo = getCpuinfo();
        if (cpuinfo.isEmpty()) {
            return "";
        }
        for (String str : cpuinfo.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE)) {
            if (str.toLowerCase().startsWith("model name")) {
                String[] split = str.split(":");
                if (split.length >= 2) {
                    return split[split.length - 1].trim();
                }
            }
        }
        return "";
    }

    @CalledByNative
    public static int getCpuTemperature() {
        return DeviceUtils.getCpuTemperature();
    }

    private static String getCpuinfo() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/cpuinfo")));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        String sb3 = sb2.toString();
                        bufferedReader.close();
                        return sb3;
                    }
                    sb2.append(readLine);
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    Logging.d(TAG, "cpuinfo line = " + readLine);
                }
            } finally {
            }
        } catch (IOException e10) {
            Logging.e(TAG, "get cpuinfo failed", e10);
            return "";
        }
    }

    @CalledByNative
    public static int[] getDisplayMetrics() {
        Display defaultDisplay;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return new int[]{0, 0};
        }
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealMetrics(displayMetrics);
            Logging.d(TAG, "getDisplayMetrics widthPixel: " + displayMetrics.heightPixels + " , heightPixel: " + displayMetrics.widthPixels);
            return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
        }
        return new int[]{0, 0};
    }

    @CalledByNative
    public static float[] getDisplayXYDpi() {
        Display defaultDisplay;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext != null) {
            WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getRealMetrics(displayMetrics);
                Logging.d(TAG, "getDisplayXYDpi xdpi: " + displayMetrics.xdpi + " , ydpi: " + displayMetrics.ydpi);
                return new float[]{displayMetrics.xdpi, displayMetrics.ydpi};
            }
        }
        return new float[]{0.0f, 0.0f};
    }

    @CalledByNative
    public static CommonUtility getInstance(Context context) {
        if (sInstance == null) {
            synchronized (CommonUtility.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new CommonUtility(context);
                    }
                } finally {
                }
            }
        }
        sInstance.reference.getAndIncrement();
        return sInstance;
    }

    private static String getIpAddressByType(InetAddress inetAddress, boolean z10, StringBuilder sb2) {
        if (z10 && (inetAddress instanceof Inet4Address)) {
            String publicIpAddress = getPublicIpAddress(inetAddress);
            if (!TextUtils.isEmpty(publicIpAddress) && sb2.length() == 0) {
                sb2.append(publicIpAddress);
            }
            return publicIpAddress;
        }
        if (z10 || !(inetAddress instanceof Inet6Address)) {
            return null;
        }
        String publicIpAddress2 = getPublicIpAddress(inetAddress);
        if (!TextUtils.isEmpty(publicIpAddress2) && sb2.length() == 0) {
            sb2.append(publicIpAddress2);
        }
        return publicIpAddress2;
    }

    @CalledByNative
    public static String getLocalHost(boolean z10) {
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            StringBuilder sb2 = new StringBuilder();
            for (NetworkInterface networkInterface : list) {
                if (!networkInterface.getName().startsWith("usb")) {
                    Iterator it = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (it.hasNext()) {
                        String ipAddressByType = getIpAddressByType((InetAddress) it.next(), z10, sb2);
                        if (!TextUtils.isEmpty(ipAddressByType)) {
                            return ipAddressByType;
                        }
                    }
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
            return null;
        } catch (Exception e10) {
            Logging.w(TAG, "fail to getLocalHost", e10);
            return null;
        }
    }

    @CalledByNative
    public static String[] getLocalHostList() {
        int i10 = 0;
        if (sInstance != null) {
            List<ConnectivityUtility.AgoraNetworkInfo> currentActiveInfo = sInstance.mConnectivityUtility.getCurrentActiveInfo();
            ArrayList arrayList = new ArrayList();
            for (ConnectivityUtility.AgoraNetworkInfo agoraNetworkInfo : currentActiveInfo) {
                StringBuilder sb2 = new StringBuilder();
                String str = agoraNetworkInfo.localAddressIpV4;
                if (str == null) {
                    str = agoraNetworkInfo.localAddressIpV6;
                }
                sb2.append(str);
                sb2.append(agoraNetworkInfo.interfaceName);
                String sb3 = sb2.toString();
                if (!TextUtils.isEmpty(sb3)) {
                    arrayList.add(sb3);
                }
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            ArrayList arrayList2 = new ArrayList();
            for (NetworkInterface networkInterface : list) {
                String name = networkInterface.getName();
                if (!name.startsWith("usb")) {
                    Iterator it = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (it.hasNext()) {
                        String inetAddressToIpAddress = inetAddressToIpAddress((InetAddress) it.next());
                        if (!TextUtils.isEmpty(inetAddressToIpAddress)) {
                            arrayList2.add(inetAddressToIpAddress + "+" + name);
                        }
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            String[] strArr = new String[arrayList2.size()];
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                strArr[i10] = (String) it2.next();
                i10++;
            }
            return strArr;
        } catch (Exception e10) {
            Logging.w(TAG, "fail to getLocalHostList", e10);
            return null;
        }
    }

    public static String getNativeLibFullPath(String str, String str2) {
        String str3 = nativeLibraryPrefix + str2 + nativeLibrarySurffix;
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        String str4 = File.separator;
        if (str.endsWith(str4)) {
            return str + str3;
        }
        return str + str4 + str3;
    }

    private static String getPublicIpAddress(InetAddress inetAddress) {
        if (inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress()) {
            return null;
        }
        return inetAddress.getHostAddress();
    }

    private int getRotationByDM() {
        Display display;
        DisplayManager displayManager = ContextUtils.getApplicationContext() != null ? (DisplayManager) ContextUtils.getApplicationContext().getSystemService(ViewProps.DISPLAY) : null;
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return -1;
        }
        return display.getRotation();
    }

    private int getRotationByWM() {
        Display defaultDisplay;
        WindowManager windowManager = ContextUtils.getApplicationContext() != null ? (WindowManager) ContextUtils.getApplicationContext().getSystemService("window") : null;
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }

    private static String getSystemProperty(String str) {
        Class<?> cls = Class.forName("android.os.SystemProperties");
        return (String) cls.getMethod("get", String.class).invoke(cls, str);
    }

    @CalledByNative
    public static Object getSystemService(Context context, String str) {
        return context.getSystemService(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String inetAddressToIpAddress(InetAddress inetAddress) {
        if (inetAddress.isLoopbackAddress() || !(inetAddress instanceof Inet4Address)) {
            return null;
        }
        return ((Inet4Address) inetAddress).getHostAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void innerStopNetworkTracker() {
        NetworkTracker networkTracker = this.mNetworkTracker;
        if (networkTracker == null) {
            return;
        }
        try {
            networkTracker.StopTrack();
            this.mNetworkTracker = null;
            this.mMultipathDisabledReason = 0;
        } catch (Exception e10) {
            Logging.e(TAG, "Unable to stop network tracker, ", e10);
        }
    }

    @CalledByNative
    public static boolean isAppInForeground() {
        final ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Runnable runnable = new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                } catch (Exception e10) {
                    Logging.e(CommonUtility.TAG, "get App InForeground state failed.", e10);
                }
                countDownLatch.countDown();
            }
        };
        if (mProcessInfoHandler == null) {
            HandlerThread handlerThread = new HandlerThread("processInfo");
            handlerThread.start();
            mProcessInfoHandler = new Handler(handlerThread.getLooper());
        }
        mProcessInfoHandler.post(runnable);
        if (ThreadUtils.awaitUninterruptibly(countDownLatch, 100L)) {
            int i10 = runningAppProcessInfo.importance;
            return i10 == 100 || i10 == 200;
        }
        Logging.e(TAG, "get App InForeground state timeout.");
        mProcessInfoHandler.removeCallbacksAndMessages(null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    @CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isSimulator() {
        String str;
        boolean z10;
        int i10;
        String cpuModelName = getCpuModelName();
        try {
            str = Build.MANUFACTURER;
        } catch (Exception unused) {
            str = "";
        }
        try {
            z10 = str.toLowerCase().contains("netease");
            try {
                Logging.d(TAG, "manufacturer = " + str);
                i10 = z10;
            } catch (Exception unused2) {
                Logging.e(TAG, "get manufacturer info fail.");
                i10 = z10;
                int i11 = i10;
                if (isSimulatorProperty()) {
                }
                Logging.d(TAG, "cpuModelName = " + cpuModelName);
                int i12 = i11;
                if (isX86MobileCpuModel(cpuModelName)) {
                }
                if (Build.VERSION.SDK_INT > 28) {
                }
                return false;
            }
        } catch (Exception unused3) {
            z10 = false;
            Logging.e(TAG, "get manufacturer info fail.");
            i10 = z10;
            int i112 = i10;
            if (isSimulatorProperty()) {
            }
            Logging.d(TAG, "cpuModelName = " + cpuModelName);
            int i122 = i112;
            if (isX86MobileCpuModel(cpuModelName)) {
            }
            if (Build.VERSION.SDK_INT > 28) {
            }
            return false;
        }
        int i1122 = i10;
        if (isSimulatorProperty()) {
            i1122 = i10 + 1;
        }
        Logging.d(TAG, "cpuModelName = " + cpuModelName);
        int i1222 = i1122;
        if (isX86MobileCpuModel(cpuModelName)) {
            i1222 = i1122 - 1;
        }
        if (Build.VERSION.SDK_INT > 28) {
            if ((!"nokia".equalsIgnoreCase(str) || (!"Nokia_N1".equalsIgnoreCase(Build.DEVICE) && !"N1".equalsIgnoreCase(Build.MODEL))) && i1222 > 0 && !str.toLowerCase().contains("welldo")) {
                return true;
            }
        } else if (("".toLowerCase().equals("unknown") || i1222 > 0) && !str.toLowerCase().contains("welldo")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (r12.contains(com.twilio.voice.Constants.PLATFORM_ANDROID) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        if (r11.contains("goldfish") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a5, code lost:
    
        if (r10.contains("sdk_gphone") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0062, code lost:
    
        if (r3.toLowerCase().contains("asus") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0039, code lost:
    
        if (r8.toLowerCase().contains("x86") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x001c, code lost:
    
        if (r6.toLowerCase().equals("intel") != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean isSimulatorProperty() {
        String str;
        int i10;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = Build.MANUFACTURER;
        try {
            str = getSystemProperty("ro.hardware");
            if (str != null) {
                try {
                } catch (Exception unused) {
                    Logging.e(TAG, "get property hardware fail.");
                    i10 = 0;
                    str2 = getSystemProperty("ro.product.cpu.abi");
                    if (str2 != null) {
                    }
                    i10++;
                    str3 = System.getProperty("os.arch");
                    if (str3 != null) {
                    }
                    i10++;
                    if (Build.VERSION.SDK_INT > 28) {
                    }
                    Logging.d(TAG, "suspectCount = " + i10 + ", hardware = " + str + ", abi = " + str2 + ", arch = " + str3 + ", baseBandVersion = , buildFlavor = " + str4 + ", productBoard = " + str5 + ", boardPlatform = " + str6 + ", manufacturer = " + str7);
                    if (i10 <= 0) {
                    }
                }
            }
            i10 = 1;
        } catch (Exception unused2) {
            str = "";
        }
        try {
            str2 = getSystemProperty("ro.product.cpu.abi");
            if (str2 != null) {
                try {
                } catch (Exception unused3) {
                    Logging.e(TAG, "get property abi fail.");
                    str3 = System.getProperty("os.arch");
                    if (str3 != null) {
                    }
                    i10++;
                    if (Build.VERSION.SDK_INT > 28) {
                    }
                    Logging.d(TAG, "suspectCount = " + i10 + ", hardware = " + str + ", abi = " + str2 + ", arch = " + str3 + ", baseBandVersion = , buildFlavor = " + str4 + ", productBoard = " + str5 + ", boardPlatform = " + str6 + ", manufacturer = " + str7);
                    if (i10 <= 0) {
                    }
                }
            }
            i10++;
        } catch (Exception unused4) {
            str2 = "";
        }
        try {
            str3 = System.getProperty("os.arch");
        } catch (Exception unused5) {
            str3 = "";
        }
        if (str3 != null) {
            try {
                if (str3.toLowerCase().equals("i686")) {
                }
            } catch (Exception unused6) {
                Logging.e(TAG, "get property arch fail.");
                if (Build.VERSION.SDK_INT > 28) {
                }
                Logging.d(TAG, "suspectCount = " + i10 + ", hardware = " + str + ", abi = " + str2 + ", arch = " + str3 + ", baseBandVersion = , buildFlavor = " + str4 + ", productBoard = " + str5 + ", boardPlatform = " + str6 + ", manufacturer = " + str7);
                if (i10 <= 0) {
                }
            }
            if (Build.VERSION.SDK_INT > 28) {
                if (str == null || str.toLowerCase().contains("ttvm") || str.toLowerCase().contains("nox")) {
                    i10++;
                }
                try {
                    str4 = getSystemProperty("ro.build.flavor");
                    if (str4 != null) {
                        try {
                            if (!str4.contains("vbox")) {
                            }
                        } catch (Exception unused7) {
                            Logging.e(TAG, "get property buildFlavor fail.");
                            str5 = getSystemProperty("ro.product.board");
                            if (str5 != null) {
                            }
                            i10++;
                            str6 = getSystemProperty("ro.board.platform");
                            if (str6 != null) {
                            }
                            i10++;
                            Logging.d(TAG, "suspectCount = " + i10 + ", hardware = " + str + ", abi = " + str2 + ", arch = " + str3 + ", baseBandVersion = , buildFlavor = " + str4 + ", productBoard = " + str5 + ", boardPlatform = " + str6 + ", manufacturer = " + str7);
                            if (i10 <= 0) {
                            }
                        }
                    }
                    i10++;
                } catch (Exception unused8) {
                    str4 = "";
                }
                try {
                    str5 = getSystemProperty("ro.product.board");
                    if (str5 != null) {
                        try {
                            if (!str5.contains(Constants.PLATFORM_ANDROID)) {
                            }
                        } catch (Exception unused9) {
                            Logging.e(TAG, "get property productBoard fail.");
                            str6 = getSystemProperty("ro.board.platform");
                            if (str6 != null) {
                            }
                            i10++;
                            Logging.d(TAG, "suspectCount = " + i10 + ", hardware = " + str + ", abi = " + str2 + ", arch = " + str3 + ", baseBandVersion = , buildFlavor = " + str4 + ", productBoard = " + str5 + ", boardPlatform = " + str6 + ", manufacturer = " + str7);
                            if (i10 <= 0) {
                            }
                        }
                    }
                    i10++;
                } catch (Exception unused10) {
                    str5 = "";
                }
                try {
                    str6 = getSystemProperty("ro.board.platform");
                    if (str6 != null) {
                        try {
                        } catch (Exception unused11) {
                            Logging.e(TAG, "get property boardPlatform fail.");
                            Logging.d(TAG, "suspectCount = " + i10 + ", hardware = " + str + ", abi = " + str2 + ", arch = " + str3 + ", baseBandVersion = , buildFlavor = " + str4 + ", productBoard = " + str5 + ", boardPlatform = " + str6 + ", manufacturer = " + str7);
                            if (i10 <= 0) {
                            }
                        }
                    }
                    i10++;
                } catch (Exception unused12) {
                    str6 = "";
                }
            } else {
                str4 = "";
                str5 = str4;
                str6 = str5;
            }
            Logging.d(TAG, "suspectCount = " + i10 + ", hardware = " + str + ", abi = " + str2 + ", arch = " + str3 + ", baseBandVersion = , buildFlavor = " + str4 + ", productBoard = " + str5 + ", boardPlatform = " + str6 + ", manufacturer = " + str7);
            return i10 <= 0;
        }
        i10++;
        if (Build.VERSION.SDK_INT > 28) {
        }
        Logging.d(TAG, "suspectCount = " + i10 + ", hardware = " + str + ", abi = " + str2 + ", arch = " + str3 + ", baseBandVersion = , buildFlavor = " + str4 + ", productBoard = " + str5 + ", boardPlatform = " + str6 + ", manufacturer = " + str7);
        if (i10 <= 0) {
        }
    }

    @CalledByNative
    public static int isSpeakerphoneEnabled(Context context) {
        if (context != null) {
            return ((AudioManager) context.getSystemService("audio")).isSpeakerphoneOn() ? 1 : 0;
        }
        Logging.w(TAG, "fail to isSpeakerphoneEnabled, context null");
        return -1;
    }

    private static boolean isX86MobileCpuModel(String str) {
        return str.toLowerCase().contains("atom");
    }

    private void monitorOrientationChange(Context context, boolean z10) {
        if (z10) {
            enableDisplayListener(context);
            regiseterBroadcaster(context);
        } else {
            disableDisplayListener();
            unregisterBroadcaster(context);
        }
    }

    private void regiseterBroadcaster(Context context) {
        if (context != null && this.mOrientationObserver == null) {
            this.mOrientationObserver = new BroadcastReceiver() { // from class: io.agora.utils2.internal.CommonUtility.13
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    if (intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED")) {
                        CommonUtility.this.updateOrientationManual();
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
            context.registerReceiver(this.mOrientationObserver, intentFilter);
            Logging.d(TAG, "[regiseterBroadcaster] done!");
        }
    }

    @CalledByNative
    public static int safeLoadLibrary(String str) {
        Logging.w(TAG, "try load library " + str + " from " + mLoadLibraryPath);
        if (TextUtils.isEmpty(str)) {
            Logging.w(TAG, "load library " + str + " failed for empty");
            return -2;
        }
        int i10 = -1;
        try {
            if (TextUtils.isEmpty(mLoadLibraryPath)) {
                System.loadLibrary(str);
            } else {
                System.load(getNativeLibFullPath(mLoadLibraryPath, str));
            }
            i10 = 0;
        } catch (NullPointerException | SecurityException | Exception | UnsatisfiedLinkError unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("load library ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(i10 == 0 ? "success" : "failed");
        Logging.w(TAG, sb2.toString());
        return i10;
    }

    public static void setIgnoreMonitor(boolean z10) {
        ignoreMonitor = z10;
    }

    @CalledByNative
    public static int setLoadLibraryPath(String str) {
        mLoadLibraryPath = str;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopMonitor() {
        Logging.d(TAG, "stopMonitor()");
        Context context = this.mContext.get();
        if (context == null) {
            return;
        }
        this.mConnectivityUtility.stopMonitor(context);
        this.mConnectivityUtility.removeNetworkListener(this);
        try {
            if (this.mPhoneStateListener != null) {
                ((TelephonyManager) context.getSystemService("phone")).listen(this.mPhoneStateListener, 0);
                this.mPhoneStateListener = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            PowerChangeReceiver powerChangeReceiver = this.mPowerChangeReceiver;
            if (powerChangeReceiver != null) {
                context.unregisterReceiver(powerChangeReceiver);
                this.mPowerChangeReceiver = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            if (this.mProcessLifecycleOwner != null) {
                ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.mProcessLifecycleOwner);
                this.mProcessLifecycleOwner = null;
            }
        } catch (Exception e12) {
            Logging.e(TAG, "unregister ProcessLifecycleOwner failed ", e12);
        }
        try {
            monitorOrientationChange(context, false);
        } catch (Exception e13) {
            Logging.e(TAG, "Unable to monitorOrientationChange, ", e13);
        }
        closeGravityMonitor();
        innerStopNetworkTracker();
    }

    private void unregisterBroadcaster(Context context) {
        BroadcastReceiver broadcastReceiver;
        if (context == null || (broadcastReceiver = this.mOrientationObserver) == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
        Logging.d(TAG, "[unregisterBroadcaster] done!");
    }

    @CalledByNative
    public int GetMultipathDisabledReason() {
        return this.mMultipathDisabledReason;
    }

    @CalledByNative
    public void StartNetworkTracker() {
        this.mHandler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.7
            @Override // java.lang.Runnable
            public void run() {
                Context context = (Context) CommonUtility.this.mContext.get();
                if (context == null || CommonUtility.this.mNetworkTracker != null) {
                    return;
                }
                try {
                    CommonUtility commonUtility = CommonUtility.this;
                    commonUtility.mNetworkTracker = new NetworkTracker(commonUtility, context, commonUtility.mHandler);
                    CommonUtility.this.mNetworkTracker.StartTrack();
                } catch (Exception e10) {
                    Logging.e(CommonUtility.TAG, "Unable to start network tracker, ", e10);
                }
                if (CommonUtility.this.mNetworkTracker != null) {
                    CommonUtility commonUtility2 = CommonUtility.this;
                    commonUtility2.mMultipathDisabledReason = commonUtility2.mNetworkTracker.GetMultipathDisabledReason();
                }
            }
        });
    }

    @CalledByNative
    public void StopNetworkTracker() {
        this.mHandler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.8
            @Override // java.lang.Runnable
            public void run() {
                CommonUtility.this.innerStopNetworkTracker();
            }
        });
    }

    @CalledByNative
    public int VPNBehindAddress() {
        if (this.mContext.get() == null) {
            return 1;
        }
        return this.mConnectivityUtility.isVpnEnabled() ? 1 : 0;
    }

    @CalledByNative
    public void bindSocket2Network(final int i10, String str) {
        final ConnectivityManager connectivityManager = (ConnectivityManager) this.mContext.get().getSystemService("connectivity");
        NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).build();
        final String str2 = str.toString();
        ConnectivityManager.NetworkCallback networkCallback = this.mobileNetworkCallback;
        if (networkCallback != null) {
            connectivityManager.unregisterNetworkCallback(networkCallback);
        }
        ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: io.agora.utils2.internal.CommonUtility.6
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                if (linkProperties == null || linkProperties.getLinkAddresses().isEmpty()) {
                    Logging.e(CommonUtility.TAG, "onAvailable: prop is null or empty!");
                    return;
                }
                String inetAddressToIpAddress = CommonUtility.inetAddressToIpAddress(linkProperties.getLinkAddresses().get(0).getAddress());
                if (inetAddressToIpAddress == null || !inetAddressToIpAddress.equals(str2)) {
                    return;
                }
                Logging.d(CommonUtility.TAG, "start bindSocket2Network");
                Logging.d(CommonUtility.TAG, "addressInner" + str2);
                FileDescriptor fileDescriptor = new FileDescriptor();
                try {
                    Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                    declaredField.setAccessible(true);
                    declaredField.setInt(fileDescriptor, i10);
                    network.bindSocket(fileDescriptor);
                    this.notifyAddressBound(str2);
                    Logging.d(CommonUtility.TAG, "bindSocket2Network success: network" + network + "+socketfd" + i10);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        };
        this.mobileNetworkCallback = networkCallback2;
        try {
            connectivityManager.requestNetwork(build, networkCallback2);
        } catch (Exception e10) {
            this.mobileNetworkCallback = null;
            Logging.e(TAG, "requestNetwork failed " + e10.toString());
        }
    }

    @CalledByNative
    public void bindSocket2NetworkId(int i10, int i11, int i12) {
        NetworkTracker networkTracker = this.mNetworkTracker;
        if (networkTracker == null) {
            notifyBindSocket2NetworkIdResult(i12, false);
        } else {
            networkTracker.BindSocket2NetworkId(i10, i11, i12);
        }
    }

    public boolean checkAccessNetworkState(Context context) {
        if (context == null) {
            return false;
        }
        return this.mConnectivityUtility.checkAccessNetworkStatePermission(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r2.mLastOrientation != 180) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0012, code lost:
    
        r2.mLastOrientation = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0030, code lost:
    
        if (r2.mLastOrientation != 90) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0010, code lost:
    
        if (r2.mLastOrientation != 270) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int checkOrientation(int i10) {
        int i11;
        if (i10 == -1) {
            return -1;
        }
        if (i10 > 340 || i10 < 20) {
            i11 = 270;
        }
        if (i10 > 70 && i10 < 110) {
            i11 = 180;
        }
        if (i10 > 160 && i10 < 200) {
            i11 = 90;
        }
        if (i10 > 250 && i10 < 290 && this.mLastOrientation != 0) {
            this.mLastOrientation = 0;
        }
        synchronized (this) {
            try {
                Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
                while (it.hasNext()) {
                    it.next().onGravityOriChange(this.mLastOrientation);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.mLastOrientation;
    }

    @CalledByNative
    public int closeGravityMonitor() {
        OrientationEventListener orientationEventListener;
        if (this.mContext.get() == null) {
            return -1;
        }
        try {
            orientationEventListener = this.mOrientationListener;
        } catch (Exception e10) {
            Logging.e(TAG, "Unable to close OrientationEventListener, ", e10);
        }
        if (orientationEventListener == null) {
            Logging.e(TAG, "[closeGravityMonitor] mOrientationListener is null!");
            return -1;
        }
        orientationEventListener.disable();
        this.mOrientationListener = null;
        Logging.d(TAG, "[closeGravityMonitor] done!");
        return 0;
    }

    @CalledByNative
    public void dispose() {
        if (sInstance == null || sInstance.reference.decrementAndGet() > 0) {
            return;
        }
        this.mThreadChecker.checkIsOnValidThread();
        if (this.mDisposed) {
            return;
        }
        this.mDisposed = true;
        Logging.d(TAG, "dispose()");
        this.mHandler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.3
            @Override // java.lang.Runnable
            public void run() {
                CommonUtility.this.stopMonitor();
            }
        });
        Handler handler = mProcessInfoHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.4
                @Override // java.lang.Runnable
                public void run() {
                    CommonUtility.mProcessInfoHandler.getLooper().quit();
                    Handler unused = CommonUtility.mProcessInfoHandler = null;
                }
            });
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.mHandler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.5
            @Override // java.lang.Runnable
            public void run() {
                countDownLatch.countDown();
                CommonUtility.this.mHandler.getLooper().quit();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onDispose();
        }
        synchronized (this) {
            this.systemEventListeners.clear();
        }
        synchronized (CommonUtility.class) {
            sInstance = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6 A[Catch: IOException -> 0x00d2, TRY_LEAVE, TryCatch #1 {IOException -> 0x00d2, blocks: (B:65:0x00ce, B:58:0x00d6), top: B:64:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.FileOutputStream] */
    @CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getAssetsCacheFile(Context context, String str, String str2) {
        ?? r72;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        FileOutputStream fileOutputStream2;
        InputStream inputStream2;
        Logging.d(TAG, "getAssetsCacheFile filePath: " + str);
        ?? startsWith = str.startsWith(PREFIX_URI);
        File file = new File(context.getCacheDir(), str2);
        InputStream inputStream3 = null;
        try {
            if (file.exists()) {
                file.delete();
            }
            try {
                try {
                    startsWith = startsWith != 0 ? new FileInputStream(context.getContentResolver().openFileDescriptor(Uri.parse(str), "r").getFileDescriptor()) : context.getAssets().open(str);
                    try {
                        ?? fileOutputStream3 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = startsWith.read(bArr);
                                if (read > 0) {
                                    fileOutputStream3.write(bArr, 0, read);
                                } else {
                                    try {
                                        break;
                                    } catch (IOException e10) {
                                        e10.printStackTrace();
                                    }
                                }
                            }
                            startsWith.close();
                            fileOutputStream3.close();
                            return file.getAbsolutePath();
                        } catch (IOException e11) {
                            fileOutputStream2 = fileOutputStream3;
                            e = e11;
                            inputStream2 = startsWith;
                            e.printStackTrace();
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                    return null;
                                }
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            return null;
                        } catch (SecurityException e13) {
                            fileOutputStream = fileOutputStream3;
                            e = e13;
                            inputStream = startsWith;
                            e.printStackTrace();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e14) {
                                    e14.printStackTrace();
                                    return null;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            str = fileOutputStream3;
                            th = th2;
                            inputStream3 = startsWith;
                            r72 = str;
                            if (inputStream3 != null) {
                            }
                            if (r72 != 0) {
                            }
                            throw th;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        fileOutputStream2 = null;
                        inputStream2 = startsWith;
                    } catch (SecurityException e16) {
                        e = e16;
                        fileOutputStream = null;
                        inputStream = startsWith;
                    } catch (Throwable th3) {
                        th = th3;
                        str = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException e17) {
                e = e17;
                fileOutputStream2 = null;
                inputStream2 = null;
            } catch (SecurityException e18) {
                e = e18;
                fileOutputStream = null;
                inputStream = null;
            } catch (Throwable th5) {
                th = th5;
                r72 = 0;
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException e19) {
                        e19.printStackTrace();
                        throw th;
                    }
                }
                if (r72 != 0) {
                    r72.close();
                }
                throw th;
            }
        } catch (SecurityException e20) {
            e20.printStackTrace();
            return null;
        }
    }

    @CalledByNative
    public int getBatteryLifePercent() {
        if (this.mContext.get() != null) {
            return this.mBatteryPercentage;
        }
        return 255;
    }

    @CalledByNative
    public int getDisplayRotation() {
        if (!this.mUpdateRotationTrigger && this.lastOrientation != -1) {
            return this.lastOrientation;
        }
        int rotationByDM = getRotationByDM();
        if (rotationByDM < 0) {
            rotationByDM = getRotationByWM();
        }
        this.lastOrientation = rotationByDM;
        return rotationByDM;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    @CalledByNative
    public MediaNetworkInfo getNetworkInfo() {
        Context context = this.mContext.get();
        if (context != null) {
            return getNetworkInfo(context);
        }
        return null;
    }

    public int getNetworkType() {
        return this.mConnectivityUtility.getNetworkType();
    }

    public ProcessLifecycleOwner getProcessLifecycleOwner() {
        return this.mProcessLifecycleOwner;
    }

    @CalledByNative
    public String getRealFilePath(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Logging.e(TAG, "getRealFilePath failed for init error");
            return "";
        }
        String assetsFilePath = str.startsWith("/assets/") ? getAssetsFilePath(context, str) : str.startsWith(PREFIX_URI) ? getContentFilePath(context, Uri.parse(str)) : null;
        return assetsFilePath != null ? assetsFilePath : "";
    }

    public ArrayList<String> getVpnIfconfigs() {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                String name = ((NetworkInterface) it.next()).getName();
                if (!name.contains("tun") && !name.contains("ppp") && !name.contains("ipsec") && !name.contains("tap")) {
                }
                arrayList.add(name);
            }
            return arrayList;
        } catch (Exception e10) {
            Logging.e(TAG, "Fail to get network interfaces array list. ", e10);
            return arrayList;
        }
    }

    public void notifyActiveNetworkChange(NetworkTracker.ActiveNetworkInfo[] activeNetworkInfoArr) {
        synchronized (this) {
            try {
                Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
                while (it.hasNext()) {
                    it.next().onActiveNetworkChange(activeNetworkInfoArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void notifyAddressBound(String str) {
        synchronized (this) {
            try {
                Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
                while (it.hasNext()) {
                    it.next().onAddressBound(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void notifyBindSocket2NetworkIdResult(int i10, boolean z10) {
        synchronized (this) {
            try {
                Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
                while (it.hasNext()) {
                    it.next().onBindSocket2NetworkIdResult(i10, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onAudioRoutingPhoneChanged(boolean z10, int i10, int i11) {
        if (this.mDisposed) {
            return;
        }
        Logging.d(TAG, "onAudioRoutingPhoneChanged() enableAudio:" + z10 + ", event:" + i10 + ", arg: " + i11);
        synchronized (this) {
            try {
                Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
                while (it.hasNext()) {
                    SystemEventListener next = it.next();
                    next.getClass();
                    next.onAudioRoutingPhoneChanged(z10, i10, i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onAudioRoutingPhoneChanged(z10, i10, i11);
        }
    }

    @Override // io.agora.utils2.internal.ConnectivityUtility.NetworkListener
    public void onDefaultNetworkChanged() {
        onNetworkChange();
    }

    public void onForegroundChanged(boolean z10) {
        if (this.mDisposed) {
            return;
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onForegroundChanged(z10);
        }
        synchronized (this) {
            try {
                Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
                while (it.hasNext()) {
                    it.next().onForegroundChanged(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onNetworkChange() {
        if (this.mDisposed) {
            return;
        }
        Logging.d(TAG, "onNetworkChange()");
        MediaNetworkInfo networkInfo = getNetworkInfo(this.mContext.get());
        synchronized (this) {
            try {
                Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
                while (it.hasNext()) {
                    SystemEventListener next = it.next();
                    next.getClass();
                    next.onNetworkChange(networkInfo);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onNetworkChange(networkInfo);
        }
    }

    public void onPowerChange(int i10) {
        Logging.d(TAG, "onPowerChange() " + i10);
        this.mBatteryPercentage = i10;
    }

    @CalledByNative
    public void registerSystemEventListener(SystemEventListener systemEventListener) {
        systemEventListener.getClass();
        synchronized (this) {
            try {
                if (!this.systemEventListeners.contains(systemEventListener)) {
                    this.systemEventListeners.add(systemEventListener);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    public void setmConnectivityUtility(ConnectivityUtility connectivityUtility) {
        this.mConnectivityUtility = connectivityUtility;
    }

    @CalledByNative
    public int setupGravityMonitor() {
        Context context = this.mContext.get();
        if (context == null) {
            return -1;
        }
        try {
            if (this.mOrientationListener == null) {
                this.mOrientationListener = new OrientationEventListener(context, 2) { // from class: io.agora.utils2.internal.CommonUtility.9
                    @Override // android.view.OrientationEventListener
                    public void onOrientationChanged(int i10) {
                        if (i10 == -1) {
                            return;
                        }
                        CommonUtility.this.checkOrientation(i10);
                    }
                };
            }
            this.mOrientationListener.enable();
            Logging.d(TAG, "[setupGravityMonitor] done!");
        } catch (Exception e10) {
            Logging.e(TAG, "Unable to create OrientationEventListener, ", e10);
        }
        return -1;
    }

    public void startMonitor() {
        Logging.d(TAG, "startMonitor()");
        if (ignoreMonitor) {
            Logging.e(TAG, "ignoreMonitor in simulator, just for ut");
            return;
        }
        Context context = this.mContext.get();
        if (context == null) {
            return;
        }
        this.mConnectivityUtility.startMonitor(context);
        try {
            this.mPhoneStateListener = new AgoraPhoneStateListener(this, this.mHandler);
            ((TelephonyManager) context.getSystemService("phone")).listen(this.mPhoneStateListener, EnumC3631g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);
        } catch (Exception e10) {
            Logging.e(TAG, "Unable to create PhoneStateListener, ", e10);
        }
        try {
            this.mPowerChangeReceiver = new PowerChangeReceiver(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            context.registerReceiver(this.mPowerChangeReceiver, intentFilter);
        } catch (Exception e11) {
            Logging.e(TAG, "Unable to create PowerChangeReceiver, ", e11);
        }
        try {
            this.mProcessLifecycleOwner = new ProcessLifecycleOwner(isAppInForeground(), this);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.mProcessLifecycleOwner);
        } catch (Exception e12) {
            Logging.e(TAG, "Unable to registerActivityLifecycleCallbacks, ", e12);
        }
        try {
            monitorOrientationChange(context, true);
        } catch (Exception e13) {
            Logging.e(TAG, "Unable to monitorOrientationChange, ", e13);
        }
    }

    @CalledByNative
    public void unregisterSystemEventListener(SystemEventListener systemEventListener) {
        if (systemEventListener == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.systemEventListeners.contains(systemEventListener)) {
                    this.systemEventListeners.remove(systemEventListener);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void updateOrientationManual() {
        if (this.mHandler == null || this.mDisposed) {
            return;
        }
        this.mUpdateRotationTrigger = true;
        this.mHandler.postDelayed(this.rotationRunnable, 200L);
    }

    private CommonUtility(Context context, long j10) {
        Logging.d(TAG, "constructor()");
        this.mContext = new WeakReference<>(context);
        this.mThreadChecker = new ThreadUtils.ThreadChecker();
        ConnectivityUtility connectivityUtility = new ConnectivityUtility(context);
        this.mConnectivityUtility = connectivityUtility;
        connectivityUtility.addNetworkListener(this);
        HandlerThread handlerThread = new HandlerThread("UtilityThread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mHandler = handler;
        handler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.2
            @Override // java.lang.Runnable
            public void run() {
                CommonUtility.this.startMonitor();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private MediaNetworkInfo getNetworkInfo(Context context) {
        StringBuilder sb2;
        String str;
        List<ConnectivityUtility.AgoraNetworkInfo> currentActiveInfo = this.mConnectivityUtility.getCurrentActiveInfo();
        MediaNetworkInfo mediaNetworkInfo = new MediaNetworkInfo();
        if (currentActiveInfo.isEmpty()) {
            return mediaNetworkInfo;
        }
        ConnectivityUtility.AgoraNetworkInfo agoraNetworkInfo = currentActiveInfo.get(0);
        if (currentActiveInfo.size() > 1) {
            Iterator<ConnectivityUtility.AgoraNetworkInfo> it = currentActiveInfo.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ConnectivityUtility.AgoraNetworkInfo next = it.next();
                if (next.transportType > agoraNetworkInfo.transportType) {
                    agoraNetworkInfo = next;
                    break;
                }
            }
        }
        if (!TextUtils.isEmpty(agoraNetworkInfo.localAddressIpV4)) {
            mediaNetworkInfo.localIp4 = agoraNetworkInfo.localAddressIpV4;
        }
        if (!TextUtils.isEmpty(agoraNetworkInfo.localAddressIpV6)) {
            mediaNetworkInfo.localIp6 = agoraNetworkInfo.localAddressIpV6;
        }
        int i10 = agoraNetworkInfo.networkType;
        mediaNetworkInfo.networkType = i10;
        int i11 = agoraNetworkInfo.networkSubtype;
        mediaNetworkInfo.networkSubtype = i11;
        if (i10 != 2) {
            AgoraPhoneStateListener agoraPhoneStateListener = this.mPhoneStateListener;
            if (agoraPhoneStateListener != null) {
                agoraPhoneStateListener.fillCellInfoIfPossible(context, mediaNetworkInfo);
                sb2 = new StringBuilder();
                str = "networkType from Phone State Listener， rssi = ";
            }
            ArrayList<String> arrayList = new ArrayList<>();
            if (this.mConnectivityUtility.isVpnEnabled()) {
                arrayList.add("tun");
            }
            mediaNetworkInfo.ifconfigs = arrayList;
            return mediaNetworkInfo;
        }
        mediaNetworkInfo.linkspeed = agoraNetworkInfo.linkSpeed;
        mediaNetworkInfo.frequency = agoraNetworkInfo.frequency;
        mediaNetworkInfo.signalLevel = agoraNetworkInfo.signalLevel;
        mediaNetworkInfo.networkSubtype = i11;
        mediaNetworkInfo.rssi = agoraNetworkInfo.rssi;
        sb2 = new StringBuilder();
        str = "networkType from WIFI, rssi = ";
        sb2.append(str);
        sb2.append(mediaNetworkInfo.rssi);
        sb2.append(" level = ");
        sb2.append(mediaNetworkInfo.signalLevel);
        Logging.d(TAG, sb2.toString());
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (this.mConnectivityUtility.isVpnEnabled()) {
        }
        mediaNetworkInfo.ifconfigs = arrayList2;
        return mediaNetworkInfo;
    }
}
