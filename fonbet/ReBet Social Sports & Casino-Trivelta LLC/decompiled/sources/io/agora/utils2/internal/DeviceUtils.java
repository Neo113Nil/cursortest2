package io.agora.utils2.internal;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class DeviceUtils {
    private static final List<String> CPU_TEMP_FILE_PATHS = Arrays.asList("/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp", "/sys/devices/system/cpu/cpu0/cpufreq/FakeShmoo_cpu_temp", "/sys/class/thermal/thermal_zone0/temp", "/sys/class/i2c-adapter/i2c-4/4-004c/temperature", "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature", "/sys/devices/platform/omap/omap_temp_sensor.0/temperature", "/sys/devices/platform/tegra_tmon/temp1_input", "/sys/kernel/debug/tegra_thermal/temp_tj", "/sys/devices/platform/s5p-tmu/temperature", "/sys/class/thermal/thermal_zone1/temp", "/sys/class/hwmon/hwmon0/device/temp1_input", "/sys/devices/virtual/thermal/thermal_zone1/temp", "/sys/devices/virtual/thermal/thermal_zone0/temp", "/sys/class/thermal/thermal_zone3/temp", "/sys/class/thermal/thermal_zone4/temp", "/sys/class/hwmon/hwmonX/temp1_input", "/sys/devices/platform/s5p-tmu/curr_temp");
    private static double INVALIED_TMPERATURE = -100000.0d;
    private static final String TAG = "DeviceUtils";
    private static double TMPERATURE_HIGH_THR = 250.0d;
    private static double TMPERATURE_LOW_THR = -30.0d;

    public static int getCpuTemperature() {
        return getCpuTemperature(CPU_TEMP_FILE_PATHS);
    }

    public static String getDeviceId() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            str = str.replace('/', '_');
        }
        String str2 = Build.MODEL;
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.replace('/', '_');
        }
        String str3 = Build.PRODUCT;
        if (!TextUtils.isEmpty(str3)) {
            str3 = str3.replace('/', '_');
        }
        String str4 = Build.HARDWARE;
        if (!TextUtils.isEmpty(str4)) {
            str4 = str4.replace('/', '_');
        }
        String lowerCase = (str + "/" + str2 + "/" + str3 + "/" + Build.VERSION.SDK_INT + "/" + str4).toLowerCase();
        Matcher matcher = Pattern.compile(".*[A-Z][A-M][0-9]$").matcher(Build.ID);
        if (Build.BRAND.toLowerCase().equals("samsung") && Build.DEVICE.toLowerCase().startsWith("cs02")) {
            matcher.find();
        }
        return lowerCase;
    }

    public static String getDeviceInfo() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            str = str.replace('/', '_');
        }
        String str2 = Build.MODEL;
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.replace('/', '_');
        }
        return (str + "/" + str2).toLowerCase();
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER.toLowerCase();
    }

    public static String getSystemInfo() {
        return "Android/" + Build.VERSION.RELEASE;
    }

    public static double getValidateTemperature(double d10) {
        if (Math.abs(d10) > 1000.0d) {
            double d11 = d10 / 1000.0d;
            if (isTemperatureValid(d11)) {
                return d11;
            }
        } else if (isTemperatureValid(d10)) {
            return d10;
        }
        throw new IllegalArgumentException("not a validate temperature value");
    }

    public static boolean isTemperatureValid(double d10) {
        return d10 >= TMPERATURE_LOW_THR && d10 <= TMPERATURE_HIGH_THR;
    }

    public static double parseDouble(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (Exception e10) {
            Logging.d(TAG, "failed to conver string to double " + e10.toString());
            return d10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r4.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double readDoubleValueFromFileFirstLine(String str, double d10) {
        Throwable th2;
        BufferedReader bufferedReader;
        IOException e10;
        FileNotFoundException e11;
        File file = new File(str);
        if (file.exists()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                    try {
                        double parseDouble = parseDouble(bufferedReader.readLine(), d10);
                        try {
                            bufferedReader.close();
                            return parseDouble;
                        } catch (IOException e12) {
                            e12.printStackTrace();
                            return parseDouble;
                        }
                    } catch (FileNotFoundException e13) {
                        e11 = e13;
                        Logging.d(TAG, "failed to read from file", e11);
                    } catch (IOException e14) {
                        e10 = e14;
                        Logging.d(TAG, "failed to read from file " + e10.toString());
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (0 != 0) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e16) {
                bufferedReader = null;
                e11 = e16;
            } catch (IOException e17) {
                bufferedReader = null;
                e10 = e17;
            } catch (Throwable th4) {
                th2 = th4;
                if (0 != 0) {
                }
                throw th2;
            }
        }
        return d10;
    }

    public static int getCpuTemperature(@NonNull List<String> list) {
        double d10 = 0.0d;
        for (String str : list) {
            try {
                d10 = getValidateTemperature(readDoubleValueFromFileFirstLine(str, INVALIED_TMPERATURE));
                Logging.d(TAG, "getCpuTemperature from file: " + str);
                break;
            } catch (IllegalArgumentException unused) {
                Logging.d(TAG, "can't getCpuTemperature from file: " + str);
            }
        }
        return (int) (d10 * 1000.0d);
    }
}
