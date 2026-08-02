package io.agora.rtc2.internal.gdp;

import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.opengl.GLES20;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.HdrUtil;
import io.agora.utils2.internal.CommonUtility;
import io.agora.utils2.internal.Logging;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes3.dex */
public class GDPAndroid {
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: io.agora.rtc2.internal.gdp.GDPAndroid.2
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i10 = 3; i10 < name.length(); i10++) {
                if (!Character.isDigit(name.charAt(i10))) {
                    return false;
                }
            }
            return true;
        }
    };
    private static final List<String> CPU_TEMP_FILE_PATHS = Arrays.asList("/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp", "/sys/devices/system/cpu/cpu0/cpufreq/FakeShmoo_cpu_temp", "/sys/class/thermal/thermal_zone0/temp", "/sys/class/i2c-adapter/i2c-4/4-004c/temperature", "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature", "/sys/devices/platform/omap/omap_temp_sensor.0/temperature", "/sys/devices/platform/tegra_tmon/temp1_input", "/sys/kernel/debug/tegra_thermal/temp_tj", "/sys/devices/platform/s5p-tmu/temperature", "/sys/class/thermal/thermal_zone1/temp", "/sys/class/hwmon/hwmon0/device/temp1_input", "/sys/devices/virtual/thermal/thermal_zone1/temp", "/sys/devices/virtual/thermal/thermal_zone0/temp", "/sys/class/thermal/thermal_zone3/temp", "/sys/class/thermal/thermal_zone4/temp", "/sys/class/hwmon/hwmonX/temp1_input", "/sys/devices/platform/s5p-tmu/curr_temp");
    private static final int DEVICEINFO_UNKNOWN = -1;
    private static final int OP_TIMEOUT_MS = 100;
    private static final String TAG = "GDPAndroid";
    private static volatile int mCores = 0;
    private static volatile int mFreq = 0;
    private static volatile String mGpuRenderer = "unkown";
    private static volatile String mGpuVendor = "unkown";
    private static volatile int mTotalMemory = 0;
    private static boolean mockGDPAndroid = false;

    public static class BackGround implements Runnable {

        /* renamed from: bg, reason: collision with root package name */
        static boolean f49176bg = false;
        final CountDownLatch runDone = new CountDownLatch(1);

        public boolean checkBackgroundSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.e(GDPAndroid.TAG, "checkBackgroundSafe timeout");
            }
            return f49176bg;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i10 = runningAppProcessInfo.importance;
            f49176bg = (i10 == 100 || i10 == 200) ? false : true;
            this.runDone.countDown();
        }
    }

    public static class BatteryLevel implements Runnable {
        static int batt;
        final CountDownLatch runDone = new CountDownLatch(1);

        public int getBatteryLevelSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.e(GDPAndroid.TAG, "getBatteryLevelSafe timeout");
            }
            return batt;
        }

        @Override // java.lang.Runnable
        public void run() {
            batt = GDPAndroid.getBatteryLevel();
            this.runDone.countDown();
        }
    }

    public static class CPUMaxFreqKHz implements Runnable {
        static int freq = -1;
        final CountDownLatch runDone = new CountDownLatch(1);

        public int getCPUMaxFreqKHzSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.e(GDPAndroid.TAG, "getCPUMaxFreqKHzSafe timeout");
            }
            return freq;
        }

        @Override // java.lang.Runnable
        public void run() {
            freq = GDPAndroid.getCPUMaxFreqKHz();
            this.runDone.countDown();
        }
    }

    public static class CPUTemperature implements Runnable {
        static double currentTemp;
        final CountDownLatch runDone = new CountDownLatch(1);

        public int getCpuTemperatureSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.e(GDPAndroid.TAG, "getCpuTemperatureSafe timeout");
            }
            return (int) (currentTemp * 1000.0d);
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb2;
            for (int i10 = 0; i10 < GDPAndroid.CPU_TEMP_FILE_PATHS.size(); i10++) {
                String str = (String) GDPAndroid.CPU_TEMP_FILE_PATHS.get(i10);
                double readOneLine = GDPAndroid.readOneLine(new File(str));
                if (GDPAndroid.isTemperatureValid(readOneLine) || GDPAndroid.mockGDPAndroid) {
                    currentTemp = readOneLine;
                    sb2 = new StringBuilder();
                } else {
                    double d10 = readOneLine / 1000.0d;
                    if (GDPAndroid.isTemperatureValid(d10)) {
                        currentTemp = d10;
                        sb2 = new StringBuilder();
                    }
                }
                sb2.append("getCpuTemperature valid path:");
                sb2.append(str);
                Logging.d(GDPAndroid.TAG, sb2.toString());
            }
            this.runDone.countDown();
        }
    }

    public static class NumberOfCpuCores implements Runnable {
        static int cores = -1;
        final CountDownLatch runDone = new CountDownLatch(1);

        public int getNumberOfCpuCoresSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.e(GDPAndroid.TAG, "getNumberOfCpuCoresSafe timeout");
            }
            return cores;
        }

        @Override // java.lang.Runnable
        public void run() {
            cores = GDPAndroid.getNumberOfCPUCores();
            this.runDone.countDown();
        }
    }

    public static class TotalMemory implements Runnable {
        static int mem;
        final CountDownLatch runDone = new CountDownLatch(1);

        public int getTotalMemorySafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.e(GDPAndroid.TAG, "getTotalMemorySafe timeout");
            }
            return mem;
        }

        @Override // java.lang.Runnable
        public void run() {
            mem = (int) (GDPAndroid.getTotalMemory(ContextUtils.getApplicationContext()) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
            this.runDone.countDown();
        }
    }

    @CalledByNative
    public GDPAndroid() {
    }

    private static int extractValue(byte[] bArr, int i10) {
        byte b10;
        while (i10 < bArr.length && (b10 = bArr[i10]) != 10) {
            if (Character.isDigit(b10)) {
                int i11 = i10 + 1;
                while (i11 < bArr.length && Character.isDigit(bArr[i11])) {
                    i11++;
                }
                return Integer.parseInt(new String(bArr, 0, i10, i11 - i10));
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gatherGlInfo() {
        try {
            EglCore eglCore = new EglCore(null, 2);
            OffscreenSurface offscreenSurface = new OffscreenSurface(eglCore, 1, 1);
            offscreenSurface.makeCurrent();
            mGpuVendor = GLES20.glGetString(7936);
            mGpuRenderer = GLES20.glGetString(7937);
            offscreenSurface.release();
            eglCore.release();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getBatteryLevel() {
        if (ContextUtils.getApplicationContext() == null) {
            return 0;
        }
        if (mockGDPAndroid) {
            Intent registerReceiver = new ContextWrapper(ContextUtils.getApplicationContext()).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                return (registerReceiver.getIntExtra("level", -1) * 100) / registerReceiver.getIntExtra("scale", -1);
            }
            return 0;
        }
        BatteryManager batteryManager = (BatteryManager) ContextUtils.getApplicationContext().getSystemService("batterymanager");
        if (batteryManager != null) {
            return batteryManager.getIntProperty(4);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCPUMaxFreqKHz() {
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < getNumberOfCPUCores(); i12++) {
            try {
                i11 = getMaxFreq(i12, i11);
            } catch (IOException unused) {
            }
        }
        if (i11 != -1 && !mockGDPAndroid) {
            i10 = i11;
            Logging.d(TAG, "max freq:" + i10);
            return i10;
        }
        i10 = getUnknowCPUMax(i11);
        Logging.d(TAG, "max freq:" + i10);
        return i10;
    }

    private static int getCoresFromCPUFileList() {
        return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
    }

    private static int getCoresFromFileInfo(String str) {
        FileInputStream fileInputStream;
        Throwable th2;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    int coresFromFileString = getCoresFromFileString(bufferedReader.readLine());
                    try {
                        fileInputStream.close();
                        bufferedReader.close();
                        return coresFromFileString;
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        return coresFromFileString;
                    }
                } catch (IOException unused) {
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                            return -1;
                        }
                    }
                    if (bufferedReader == null) {
                        return -1;
                    }
                    bufferedReader.close();
                    return -1;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                            throw th2;
                        }
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th2;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
            } catch (Throwable th4) {
                th2 = th4;
                bufferedReader = null;
            }
        } catch (IOException unused3) {
            bufferedReader = null;
        } catch (Throwable th5) {
            fileInputStream = null;
            th2 = th5;
            bufferedReader = null;
        }
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    private static int getMaxFreq(int i10, int i11) {
        File file = new File("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_max_freq");
        if (file.exists() && file.canRead()) {
            byte[] bArr = new byte[128];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    int read = fileInputStream.read(bArr);
                    int i12 = 0;
                    while (Character.isDigit(bArr[i12]) && i12 < read) {
                        i12++;
                    }
                    int parseInt = Integer.parseInt(new String(bArr, 0, i12));
                    if (parseInt > i11) {
                        i11 = parseInt;
                    }
                    return i11;
                } finally {
                    fileInputStream.close();
                }
            } catch (FileNotFoundException | NumberFormatException | SecurityException unused) {
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNumberOfCPUCores() {
        AtomicInteger atomicInteger = new AtomicInteger();
        try {
            atomicInteger.set(getCoresFromFileInfo("/sys/devices/system/cpu/possible"));
            if (atomicInteger.get() == -1 || mockGDPAndroid) {
                atomicInteger.set(getCoresFromFileInfo("/sys/devices/system/cpu/present"));
            }
            if (atomicInteger.get() == -1 || mockGDPAndroid) {
                atomicInteger.set(getCoresFromCPUFileList());
            }
        } catch (NullPointerException | SecurityException unused) {
            atomicInteger.set(-1);
        }
        Logging.d(TAG, "cores:" + atomicInteger);
        return atomicInteger.get();
    }

    public static String getSocName() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method method = cls.getMethod("get", String.class);
            return ((String) method.invoke(cls, "ro.soc.manufacturer")) + " " + ((String) method.invoke(cls, "ro.soc.model"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getTotalMemory(Context context) {
        if (context == null) {
            return 0L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        Logging.d(TAG, "total mem:" + memoryInfo.totalMem);
        return memoryInfo.totalMem;
    }

    public static int getUnknowCPUMax(int i10) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/cpuinfo");
            int parseFileForValue = parseFileForValue("cpu MHz", fileInputStream);
            try {
                fileInputStream.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            int i11 = parseFileForValue * 1000;
            if (i11 > i10) {
                return i11;
            }
            return -1;
        } catch (IOException | SecurityException unused) {
            return -1;
        }
    }

    @CalledByNative
    public static void init() {
        try {
            HandlerThread handlerThread = new HandlerThread("GDPAndroid_thread");
            handlerThread.start();
            ThreadUtils.invokeAtFrontUninterruptibly(new Handler(handlerThread.getLooper()), 2000L, new Callable<Void>() { // from class: io.agora.rtc2.internal.gdp.GDPAndroid.1
                @Override // java.util.concurrent.Callable
                public Void call() {
                    int unused = GDPAndroid.mFreq = GDPAndroid.getCPUMaxFreqKHz();
                    int unused2 = GDPAndroid.mCores = GDPAndroid.getNumberOfCPUCores();
                    int unused3 = GDPAndroid.mTotalMemory = (int) (GDPAndroid.getTotalMemory(ContextUtils.getApplicationContext()) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
                    if (!GDPAndroid.isEGL14SupportedHere() || CommonUtility.isSimulator()) {
                        return null;
                    }
                    GDPAndroid.gatherGlInfo();
                    return null;
                }
            });
            handlerThread.quit();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isEGL14SupportedHere() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isTemperatureValid(double d10) {
        return d10 >= -30.0d && d10 <= 250.0d;
    }

    private static int match(int i10, String str, int i11, byte[] bArr) {
        for (int i12 = i10; i12 < i11; i12++) {
            int i13 = i12 - i10;
            if (bArr[i12] != str.charAt(i13)) {
                return -1;
            }
            if (i13 == str.length() - 1) {
                return extractValue(bArr, i12);
            }
        }
        return -1;
    }

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i10 = 0;
            while (i10 < read) {
                byte b10 = bArr[i10];
                if (b10 == 10 || i10 == 0) {
                    if (b10 == 10) {
                        i10++;
                    }
                    int match = match(i10, str, read, bArr);
                    if (match > 0) {
                        return match;
                    }
                }
                i10++;
            }
            return -1;
        } catch (IOException | NumberFormatException e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r4 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        if (r4 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        if (r4 != null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[Catch: IOException -> 0x0036, TRY_ENTER, TryCatch #0 {IOException -> 0x0036, blocks: (B:16:0x002b, B:18:0x0031, B:41:0x007e, B:43:0x0083, B:34:0x008e, B:36:0x0093, B:27:0x009e, B:29:0x00a3), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3 A[Catch: IOException -> 0x0036, TRY_LEAVE, TryCatch #0 {IOException -> 0x0036, blocks: (B:16:0x002b, B:18:0x0031, B:41:0x007e, B:43:0x0083, B:34:0x008e, B:36:0x0093, B:27:0x009e, B:29:0x00a3), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[Catch: IOException -> 0x0036, TRY_ENTER, TryCatch #0 {IOException -> 0x0036, blocks: (B:16:0x002b, B:18:0x0031, B:41:0x007e, B:43:0x0083, B:34:0x008e, B:36:0x0093, B:27:0x009e, B:29:0x00a3), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: IOException -> 0x0036, TRY_LEAVE, TryCatch #0 {IOException -> 0x0036, blocks: (B:16:0x002b, B:18:0x0031, B:41:0x007e, B:43:0x0083, B:34:0x008e, B:36:0x0093, B:27:0x009e, B:29:0x00a3), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b4 A[Catch: IOException -> 0x00b0, TryCatch #6 {IOException -> 0x00b0, blocks: (B:64:0x00ac, B:55:0x00b4, B:57:0x00b9), top: B:63:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9 A[Catch: IOException -> 0x00b0, TRY_LEAVE, TryCatch #6 {IOException -> 0x00b0, blocks: (B:64:0x00ac, B:55:0x00b4, B:57:0x00b9), top: B:63:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.io.InputStreamReader, java.io.Reader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double readOneLine(File file) {
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        IOException e10;
        FileNotFoundException e11;
        double d10 = -100000.0d;
        if (!file.exists() || !file.canRead()) {
            return -100000.0d;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream((File) file);
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            } catch (FileNotFoundException e13) {
                e = e13;
                fileInputStream = null;
                bufferedReader = null;
            } catch (IOException e14) {
                e = e14;
                fileInputStream = null;
                bufferedReader = null;
            } catch (SecurityException unused) {
                inputStreamReader = null;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            file = new InputStreamReader(fileInputStream);
            try {
                bufferedReader = new BufferedReader(file);
                try {
                    d10 = Double.parseDouble(bufferedReader.readLine());
                    fileInputStream.close();
                    file.close();
                } catch (FileNotFoundException e15) {
                    e11 = e15;
                    e11.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (file != 0) {
                        file.close();
                    }
                } catch (IOException e16) {
                    e10 = e16;
                    e10.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (file != 0) {
                        file.close();
                    }
                } catch (SecurityException unused2) {
                    fileInputStream2 = fileInputStream;
                    inputStreamReader = file;
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                }
            } catch (FileNotFoundException e17) {
                bufferedReader = null;
                e11 = e17;
            } catch (IOException e18) {
                bufferedReader = null;
                e10 = e18;
            } catch (SecurityException unused3) {
                bufferedReader = null;
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e19) {
                        e19.printStackTrace();
                        throw th;
                    }
                }
                if (file != 0) {
                    file.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (FileNotFoundException e20) {
            e = e20;
            bufferedReader = null;
            e11 = e;
            file = bufferedReader;
            e11.printStackTrace();
            if (fileInputStream != null) {
            }
            if (file != 0) {
            }
        } catch (IOException e21) {
            e = e21;
            bufferedReader = null;
            e10 = e;
            file = bufferedReader;
            e10.printStackTrace();
            if (fileInputStream != null) {
            }
            if (file != 0) {
            }
        } catch (SecurityException unused4) {
            file = 0;
            bufferedReader = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            th = th;
            file = bufferedReader;
            if (fileInputStream != null) {
            }
            if (file != 0) {
            }
            if (bufferedReader != null) {
            }
            throw th;
        }
        bufferedReader.close();
        return d10;
    }

    public static void setMockGDPAndroid(boolean z10) {
        mockGDPAndroid = z10;
    }

    @CalledByNative
    public boolean checkBackground() {
        return new BackGround().checkBackgroundSafe();
    }

    @CalledByNative
    public int getBattery() {
        return new BatteryLevel().getBatteryLevelSafe();
    }

    @CalledByNative
    public int getCpuClock() {
        return mFreq > 0 ? mFreq : new CPUMaxFreqKHz().getCPUMaxFreqKHzSafe();
    }

    @CalledByNative
    public int getCpuCores() {
        return mCores > 0 ? mCores : new NumberOfCpuCores().getNumberOfCpuCoresSafe();
    }

    public int getCpuTemperature() {
        return new CPUTemperature().getCpuTemperatureSafe();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r4 == null) goto L36;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x002b: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:39:0x002b */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getCpuVendor() {
        FileReader fileReader;
        IOException e10;
        FileNotFoundException e11;
        Reader reader;
        String readLine;
        String str = "";
        Reader reader2 = null;
        try {
            try {
                fileReader = new FileReader("/proc/cpuinfo");
                try {
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    do {
                        readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            if (readLine.contains("Hardware")) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } while (!readLine.contains("hardware"));
                    str = readLine.split(":\\s+", 2)[1];
                    fileReader.close();
                } catch (FileNotFoundException e12) {
                    e11 = e12;
                    Logging.e(TAG, "getCpuName failed, no /proc/cpuinfo found in system", e11);
                } catch (IOException e13) {
                    e10 = e13;
                    Logging.e(TAG, "getCpuName failed,", e10);
                    if (fileReader != null) {
                        fileReader.close();
                    }
                    return (getSocName() + " " + str + " " + Build.HARDWARE).trim().toLowerCase();
                }
            } catch (Throwable th2) {
                th = th2;
                reader2 = reader;
                if (reader2 != null) {
                    try {
                        reader2.close();
                    } catch (IOException e14) {
                        Logging.e(TAG, "failed to close proc file", e14);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e15) {
            fileReader = null;
            e11 = e15;
        } catch (IOException e16) {
            fileReader = null;
            e10 = e16;
        } catch (Throwable th3) {
            th = th3;
            if (reader2 != null) {
            }
            throw th;
        }
        try {
            fileReader.close();
        } catch (IOException e17) {
            Logging.e(TAG, "failed to close proc file", e17);
        }
        return (getSocName() + " " + str + " " + Build.HARDWARE).trim().toLowerCase();
    }

    @CalledByNative
    public String getGpuRenderer() {
        return mGpuRenderer;
    }

    @CalledByNative
    public String getGpuVendor() {
        return mGpuVendor;
    }

    @CalledByNative
    public int getOsVersion() {
        return Build.VERSION.SDK_INT;
    }

    @CalledByNative
    public int getRam() {
        return mTotalMemory > 0 ? mTotalMemory : new TotalMemory().getTotalMemorySafe();
    }

    @CalledByNative
    public boolean isScreenSupportHdrVision() {
        return HdrUtil.getSupportHDR();
    }
}
