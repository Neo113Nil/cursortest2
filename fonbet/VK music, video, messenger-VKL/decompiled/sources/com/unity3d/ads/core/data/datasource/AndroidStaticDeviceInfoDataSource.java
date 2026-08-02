package com.unity3d.ads.core.data.datasource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.webkit.WebSettings;
import com.unity3d.ads.core.data.model.StorageType;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.UUID;
import javax.security.auth.x500.X500Principal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.an10;
import xsna.brm0;
import xsna.drm0;
import xsna.e43;
import xsna.emb;
import xsna.epx;
import xsna.j5g;
import xsna.n6j;
import xsna.nbr;
import xsna.ozl;
import xsna.s3q0;
import xsna.spj;
import xsna.wk3;
import xsna.zcl;

/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidStaticDeviceInfoDataSource implements StaticDeviceInfoDataSource {
    public static final String ALGORITHM_SHA1 = "SHA-1";
    public static final String APP_VERSION_FAKE = "FakeVersionName";
    public static final String BINARY_SU = "su";
    public static final String CERTIFICATE_TYPE_X509 = "X.509";
    public static final Companion Companion = new Companion(null);
    public static final String ENVIRONMENT_VARIABLE_PATH = "PATH";
    public static final String PLATFORM_ANDROID = "android";
    public static final String STORE_GOOGLE = "google";
    private final X500Principal DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
    private final AnalyticsDataSource analyticsDataSource;
    private final Context context;
    private final ByteStringDataSource glInfoStore;
    private final Logger logger;
    private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;
    private final StoreDataSource storeDataSource;
    private final UnityBootConfigDataSource unityBootConfigDataSource;

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StorageType.values().length];
            try {
                iArr2[StorageType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StorageType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidStaticDeviceInfoDataSource(Context context, ByteStringDataSource byteStringDataSource, AnalyticsDataSource analyticsDataSource, StoreDataSource storeDataSource, UnityBootConfigDataSource unityBootConfigDataSource, Logger logger) {
        this.context = context;
        this.glInfoStore = byteStringDataSource;
        this.analyticsDataSource = analyticsDataSource;
        this.storeDataSource = storeDataSource;
        this.unityBootConfigDataSource = unityBootConfigDataSource;
        this.logger = logger;
        StaticDeviceInfoKt.Dsl _create = StaticDeviceInfoKt.Dsl.Companion._create(StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder());
        _create.setBundleId(getAppName());
        _create.setBundleVersion(getAppVersion());
        _create.setAppDebuggable(isAppDebuggable());
        _create.setRooted(isRooted());
        _create.setOsVersion(getOsVersion());
        _create.setDeviceMake(getManufacturer());
        _create.setDeviceModel(getModel());
        _create.setWebviewUa(getWebViewUserAgent());
        _create.setScreenDensity(getScreenDensity());
        _create.setScreenWidth(getScreenWidth());
        _create.setScreenHeight(getScreenHeight());
        _create.setScreenSize(getScreenLayout());
        _create.plusAssignAllStores(_create.getStores(), getStores$default(this, null, 1, null));
        StorageType storageType = StorageType.EXTERNAL;
        _create.setTotalDiskSpace(getTotalSpace(getFileForStorageType(storageType)));
        _create.setTotalDiskSpaceBytes(getTotalSpaceBytes(getFileForStorageType(storageType)));
        _create.plusAssignAllKeyboardLanguages(_create.getKeyboardLanguages(), getKeyboardLanguages());
        _create.setTotalRamMemory(getTotalMemory());
        _create.setCpuModel(getCPUModel());
        _create.setCpuCount(getCPUCount());
        _create.setAndroid(fetchAndroidStaticDeviceInfo());
        _create.setMadeWithUnity(MadeWithUnityDetector.isMadeWithUnity());
        this.staticDeviceInfo = _create._build();
    }

    private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android fetchAndroidStaticDeviceInfo() {
        StaticDeviceInfoKt staticDeviceInfoKt = StaticDeviceInfoKt.INSTANCE;
        StaticDeviceInfoKt.AndroidKt.Dsl _create = StaticDeviceInfoKt.AndroidKt.Dsl.Companion._create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder());
        _create.setApiLevel(getApiLevel());
        _create.setVersionCode(getVersionCode());
        _create.setAndroidFingerprint(getFingerprint());
        _create.setAppInstaller(getInstallerPackageName());
        _create.setApkDeveloperSigningCertificateHash(getCertificateFingerprint());
        _create.setBuildBoard(getBoard());
        _create.setBuildBrand(getBrand());
        _create.setBuildDevice(getDevice());
        _create.setBuildDisplay(getDisplay());
        _create.setBuildFingerprint(getFingerprint());
        _create.setBuildHardware(getHardware());
        _create.setBuildHost(getHost());
        _create.setBuildBootloader(getBootloader());
        _create.setBuildProduct(getProduct());
        _create.setExtensionVersion(getExtensionVersion());
        String buildId = getBuildId();
        if (buildId != null) {
            _create.setBuildId(buildId);
        }
        _create.setPhoneType(getPhoneType());
        _create.setSimOperator(getSimOperator());
        _create.setJvmMaxMemory(getJvmMaxMemory());
        return _create._build();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    private final long getAppStartTime() {
        return SdkProperties.getInitializationTimeEpoch();
    }

    private final String getAppVersion() {
        String packageName = this.context.getPackageName();
        PackageManager packageManager = this.context.getPackageManager();
        try {
            return packageManager.getPackageInfo(packageName, 0).versionName == null ? APP_VERSION_FAKE : packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            this.logger.error("Error getting package info", e);
            return "";
        }
    }

    private final long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    private final String getCPUModel() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SOC_MODEL;
            return str;
        }
        try {
            return (String) j5g.i0(nbr.q(new File("/proc/cpuinfo")));
        } catch (FileNotFoundException e) {
            this.logger.error("Error reading CPU model", e);
            return "";
        }
    }

    @ozl
    @SuppressLint({"PackageManagerGetSignatures"})
    private final String getCertificateFingerprint() {
        try {
            Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr == null) {
                return "";
            }
            if (signatureArr.length == 0) {
                return "";
            }
            return Utilities.toHexString(MessageDigest.getInstance(ALGORITHM_SHA1).digest(((X509Certificate) CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded()));
        } catch (Exception e) {
            this.logger.error("Exception when signing certificate fingerprint", e);
            return "";
        }
    }

    private final float getDisplayMetricDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        return (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : displayMetrics.density;
    }

    private final int getExtensionVersion() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT < 30) {
            return -1;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(30);
        return extensionVersion;
    }

    private final File getFileForStorageType(StorageType storageType) {
        int i = WhenMappings.$EnumSwitchMapping$1[storageType.ordinal()];
        if (i == 1) {
            return this.context.getCacheDir();
        }
        if (i == 2) {
            return this.context.getExternalCacheDir();
        }
        Logger.DefaultImpls.error$default(this.logger, "Unhandled storagetype: " + storageType, null, 2, null);
        return null;
    }

    private final String getFingerprint() {
        String str = Build.FINGERPRINT;
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getGPUModel(spj<? super String> spjVar) {
        AndroidStaticDeviceInfoDataSource$getGPUModel$1 androidStaticDeviceInfoDataSource$getGPUModel$1;
        int i;
        if (spjVar instanceof AndroidStaticDeviceInfoDataSource$getGPUModel$1) {
            androidStaticDeviceInfoDataSource$getGPUModel$1 = (AndroidStaticDeviceInfoDataSource$getGPUModel$1) spjVar;
            int i2 = androidStaticDeviceInfoDataSource$getGPUModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidStaticDeviceInfoDataSource$getGPUModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidStaticDeviceInfoDataSource$getGPUModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidStaticDeviceInfoDataSource$getGPUModel$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ByteStringDataSource byteStringDataSource = this.glInfoStore;
                    androidStaticDeviceInfoDataSource$getGPUModel$1.label = 1;
                    obj = byteStringDataSource.get(androidStaticDeviceInfoDataSource$getGPUModel$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((ByteStringStoreOuterClass.ByteStringStore) obj).getData().toString(emb.b);
            }
        }
        androidStaticDeviceInfoDataSource$getGPUModel$1 = new AndroidStaticDeviceInfoDataSource$getGPUModel$1(this, spjVar);
        Object obj2 = androidStaticDeviceInfoDataSource$getGPUModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidStaticDeviceInfoDataSource$getGPUModel$1.label;
        if (i != 0) {
        }
        return ((ByteStringStoreOuterClass.ByteStringStore) obj2).getData().toString(emb.b);
    }

    private final String getGameId() {
        String gameId = ClientProperties.getGameId();
        return gameId == null ? "" : gameId;
    }

    @ozl
    private final String getInstallerPackageName() {
        String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    private final long getJvmMaxMemory() {
        return Runtime.getRuntime().maxMemory();
    }

    private final List<String> getKeyboardLanguages() {
        try {
            Object systemService = this.context.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager == null) {
                return EmptyList.b;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = inputMethodManager.getInputMethodList().iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = inputMethodManager.getEnabledInputMethodSubtypeList((InputMethodInfo) it.next(), true).iterator();
                while (it2.hasNext()) {
                    String locale = ((InputMethodSubtype) it2.next()).getLocale();
                    if (locale.length() > 0) {
                        linkedHashSet.add(locale);
                    }
                }
            }
            return j5g.O0(linkedHashSet);
        } catch (Exception e) {
            this.logger.error("Error getting keyboard languages", e);
            return EmptyList.b;
        }
    }

    private final long getMemoryInfo(Device.MemoryInfoType memoryInfoType) {
        int i = WhenMappings.$EnumSwitchMapping$0[memoryInfoType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        String str = null;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
            for (int i3 = 0; i3 < i2; i3++) {
                try {
                    str = randomAccessFile.readLine();
                } finally {
                }
            }
            s3q0 s3q0Var = s3q0.a;
            randomAccessFile.close();
        } catch (FileNotFoundException e) {
            this.logger.error("Error reading memory info", e);
        }
        return GetMemoryValueFromStringKt.getMemoryValueFromString(str);
    }

    @TargetApi(21)
    private final ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = Build.SUPPORTED_ABIS;
        arrayList.addAll(e43.l(Arrays.copyOf(strArr, strArr.length)));
        return arrayList;
    }

    private final List<String> getOldAbiList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Build.CPU_ABI);
        arrayList.add(Build.CPU_ABI2);
        return arrayList;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    private final int getPhoneType() {
        return ((TelephonyManager) this.context.getSystemService("phone")).getPhoneType();
    }

    private final String getPlatform() {
        return "android";
    }

    private final int getScreenDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.densityDpi;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final String getSimOperator() {
        return ((TelephonyManager) this.context.getSystemService("phone")).getSimOperator();
    }

    private final List<String> getStores(List<String> list) {
        return this.storeDataSource.fetchStores(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List getStores$default(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = EmptyList.b;
        }
        return androidStaticDeviceInfoDataSource.getStores(list);
    }

    private final long getTotalSpaceBytes(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return file.getTotalSpace();
    }

    private final int getVersionCode() {
        return 41900;
    }

    private final String getVersionName() {
        return "4.19.0";
    }

    private final String getWebViewUserAgent() {
        try {
            return WebSettings.getDefaultUserAgent(this.context);
        } catch (Exception e) {
            this.logger.error("Exception getting webview user agent", e);
            return "";
        }
    }

    private final boolean isAppDebuggable() {
        PackageManager packageManager = this.context.getPackageManager();
        String packageName = this.context.getPackageName();
        boolean z = true;
        boolean z2 = false;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            int i = applicationInfo.flags & 2;
            applicationInfo.flags = i;
            if (i != 0) {
                z2 = true;
                z = false;
            } else {
                z = false;
            }
        } catch (PackageManager.NameNotFoundException e) {
            this.logger.error("Could not find name", e);
        }
        if (z) {
            try {
                wk3 wk3Var = new wk3(packageManager.getPackageInfo(packageName, 64).signatures);
                while (wk3Var.hasNext()) {
                    z2 = epx.f(((X509Certificate) CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(((Signature) wk3Var.next()).toByteArray()))).getSubjectX500Principal(), this.DEBUG_CERT);
                    if (z2) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                this.logger.error("Could not find name", e2);
            } catch (CertificateException e3) {
                this.logger.error("Certificate exception", e3);
            }
        }
        return z2;
    }

    private final boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo, String str) {
        return getApiLevel() >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo, str);
    }

    @TargetApi(29)
    private final boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    private final boolean isRooted() {
        try {
            return searchPathForBinary("su");
        } catch (Exception e) {
            this.logger.error("Rooted check failed", e);
            return false;
        }
    }

    private final boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo, String str) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.ROOT);
        if (!brm0.B(lowerCase, "arc.", false)) {
            if (brm0.B(lowerCase, "omx.google.", false) || brm0.B(lowerCase, "omx.ffmpeg.", false)) {
                return true;
            }
            if ((brm0.B(lowerCase, "omx.sec.", false) && drm0.D(lowerCase, ".sw.", false)) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || brm0.B(lowerCase, "c2.android.", false) || brm0.B(lowerCase, "c2.google.", false)) {
                return true;
            }
            if (!brm0.B(lowerCase, "omx.", false) && !brm0.B(lowerCase, "c2.", false)) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(29)
    private final boolean isSoftwareOnlyV29(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    private final boolean isTestMode() {
        return SdkProperties.isTestMode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean searchPathForBinary(String str) {
        Collection collection;
        String[] strArr;
        File[] listFiles;
        String str2 = System.getenv(ENVIRONMENT_VARIABLE_PATH);
        if (str2 != null) {
            List a = n6j.a(0, StringUtils.PROCESS_POSTFIX_DELIMITER, str2);
            if (!a.isEmpty()) {
                ListIterator listIterator = a.listIterator(a.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = j5g.H0(a, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = EmptyList.b;
            if (collection != null && (strArr = (String[]) collection.toArray(new String[0])) != null) {
                for (String str3 : strArr) {
                    File file = new File(str3);
                    if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        int i = 0;
                        while (true) {
                            if (i < listFiles.length) {
                                int i2 = i + 1;
                                try {
                                    if (epx.f(listFiles[i].getName(), str)) {
                                        return true;
                                    }
                                    i = i2;
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    throw new NoSuchElementException(e.getMessage());
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final List<MediaCodecInfo> selectAllDecodeCodecs(String str) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (brm0.w(str2, str, true) && isHardwareAccelerated(codecInfoAt, str)) {
                        arrayList.add(codecInfoAt);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetch(List<String> list, spj<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> spjVar) {
        AndroidStaticDeviceInfoDataSource$fetch$1 androidStaticDeviceInfoDataSource$fetch$1;
        int i;
        String str;
        if (spjVar instanceof AndroidStaticDeviceInfoDataSource$fetch$1) {
            androidStaticDeviceInfoDataSource$fetch$1 = (AndroidStaticDeviceInfoDataSource$fetch$1) spjVar;
            int i2 = androidStaticDeviceInfoDataSource$fetch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidStaticDeviceInfoDataSource$fetch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidStaticDeviceInfoDataSource$fetch$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidStaticDeviceInfoDataSource$fetch$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    String gpuModel = this.staticDeviceInfo.getGpuModel();
                    if (gpuModel != null && gpuModel.length() != 0) {
                        return this.staticDeviceInfo;
                    }
                    androidStaticDeviceInfoDataSource$fetch$1.L$0 = list;
                    androidStaticDeviceInfoDataSource$fetch$1.label = 1;
                    obj = getGPUModel(androidStaticDeviceInfoDataSource$fetch$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) androidStaticDeviceInfoDataSource$fetch$1.L$0;
                    kotlin.a.a(obj);
                }
                str = (String) obj;
                if (str != null || str.length() == 0) {
                    return this.staticDeviceInfo;
                }
                StaticDeviceInfoKt.Dsl _create = StaticDeviceInfoKt.Dsl.Companion._create(this.staticDeviceInfo.toBuilder());
                _create.setGpuModel(str);
                _create.clearStores(_create.getStores());
                _create.plusAssignAllStores(_create.getStores(), getStores(list));
                StaticDeviceInfoOuterClass.StaticDeviceInfo _build = _create._build();
                this.staticDeviceInfo = _build;
                return _build;
            }
        }
        androidStaticDeviceInfoDataSource$fetch$1 = new AndroidStaticDeviceInfoDataSource$fetch$1(this, spjVar);
        Object obj3 = androidStaticDeviceInfoDataSource$fetch$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidStaticDeviceInfoDataSource$fetch$1.label;
        if (i != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
        return this.staticDeviceInfo;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached() {
        return this.staticDeviceInfo;
    }

    public final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAppName() {
        return this.context.getPackageName();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getAuid(spj<? super String> spjVar) {
        String string = AndroidPreferences.getString("supersonic_shared_preferen", "auid");
        if (string == null) {
            return null;
        }
        return string;
    }

    public final String getBoard() {
        String str = Build.BOARD;
        return str == null ? "" : str;
    }

    public final String getBootloader() {
        String str = Build.BOOTLOADER;
        return str == null ? "" : str;
    }

    public final String getBrand() {
        String str = Build.BRAND;
        return str == null ? "" : str;
    }

    public final String getBuildId() {
        return Build.ID;
    }

    public final String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDevice() {
        String str = Build.DEVICE;
        return str == null ? "" : str;
    }

    public final String getDisplay() {
        String str = Build.DISPLAY;
        return str == null ? "" : str;
    }

    public final String getHardware() {
        String str = Build.HARDWARE;
        return str == null ? "" : str;
    }

    public final String getHost() {
        String str = Build.HOST;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getIdfi(spj<? super String> spjVar) {
        String string = AndroidPreferences.getString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = null;
        }
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        AndroidPreferences.setString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI, uuid);
        return uuid;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getManufacturer() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getModel() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        return str == null ? "" : str;
    }

    public final String getProduct() {
        String str = Build.PRODUCT;
        return str == null ? "" : str;
    }

    public final List<Sensor> getSensorList() {
        return ((SensorManager) this.context.getSystemService("sensor")).getSensorList(-1);
    }

    public final List<String> getSupportedAbis() {
        return getApiLevel() < 21 ? getOldAbiList() : getNewAbiList();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getSystemBootTime() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public final long getTotalSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return an10.b(file.getTotalSpace() / 1024);
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getUnityBuildGuid(spj<? super String> spjVar) {
        return this.unityBootConfigDataSource.getValue("build-guid");
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs("video/avc").isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs("video/hevc").isEmpty();
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }
}
