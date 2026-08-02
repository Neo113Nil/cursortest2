package zendesk.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.twilio.voice.EventKeys;
import io.sentry.F3;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import ld.AbstractC5459a;

/* loaded from: classes5.dex */
class DeviceInfo {
    private static final int BAD_VALUE = -1;
    private static final long BYTES_MULTIPLIER = 1024;
    private static final int EXPECTED_TOKEN_COUNT = 3;
    private static final String LOG_TAG = "DeviceInfo";
    private static final String PLATFORM_ANDROID = "Android";
    private final ActivityManager activityManager;
    private final Context context;

    public DeviceInfo(Context context) {
        this.context = context;
        this.activityManager = (ActivityManager) context.getSystemService("activity");
    }

    private long getAvailableInternalDiskMemory() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    private int getBatteryLevel() {
        Intent registerReceiver = this.context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("level", -1);
        }
        return -1;
    }

    private String getBytesInMb(long j10) {
        return String.valueOf(j10 / F3.MAX_EVENT_SIZE_BYTES);
    }

    public static Locale getCurrentLocale(Context context) {
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    private long getDiskSize() {
        return getTotalInternalDiskSize();
    }

    private String getManufacturer() {
        String str = Build.MANUFACTURER;
        return ("unknown".equals(str) || com.zendesk.util.d.c(str)) ? "" : str;
    }

    private String getOS() {
        String str = Build.VERSION.RELEASE;
        if (!"unknown".equals(str)) {
            com.zendesk.util.d.c(str);
        }
        return String.format(Locale.US, "%s/%s", str, Integer.valueOf(Build.VERSION.SDK_INT));
    }

    private long getTotalInternalDiskSize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    private long getTotalMemory() {
        AbstractC5459a.b("DeviceInfo", "Using getTotalMemoryApi() to determine memory", new Object[0]);
        return getTotalMemoryApi();
    }

    private long getTotalMemoryApi() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    private long getUsedDiskSpace() {
        return getDiskSize() - getAvailableInternalDiskMemory();
    }

    private long getUsedMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return getTotalMemory() - memoryInfo.availMem;
    }

    public Map<String, String> getInfo() {
        HashMap hashMap = new HashMap();
        String os = getOS();
        String model = getModel();
        long usedMemory = getUsedMemory();
        long totalMemory = getTotalMemory();
        long diskSize = getDiskSize();
        long usedDiskSpace = getUsedDiskSpace();
        int batteryLevel = getBatteryLevel();
        String locale = getLocale();
        String manufacturer = getManufacturer();
        if (!com.zendesk.util.d.c(os)) {
            hashMap.put("os", os);
        }
        if (!com.zendesk.util.d.c(model)) {
            hashMap.put("model", model);
        }
        if (usedMemory != -1) {
            hashMap.put("memory_used", getBytesInMb(usedMemory));
        }
        if (totalMemory != -1) {
            hashMap.put("memory_total", getBytesInMb(totalMemory));
        }
        if (diskSize != -1) {
            hashMap.put("disk_total", getBytesInMb(diskSize));
        }
        if (usedDiskSpace != -1) {
            hashMap.put("disk_used", getBytesInMb(usedDiskSpace));
        }
        if (batteryLevel != -1) {
            hashMap.put("battery_level", String.valueOf(batteryLevel));
        }
        if (!com.zendesk.util.d.c(locale)) {
            hashMap.put("sys_locale", locale);
        }
        if (!com.zendesk.util.d.c(manufacturer)) {
            hashMap.put("manufacturer", manufacturer);
        }
        hashMap.put(EventKeys.PLATFORM, PLATFORM_ANDROID);
        return hashMap;
    }

    public String getLocale() {
        return com.zendesk.util.c.a(Locale.getDefault());
    }

    public String getModel() {
        String str = Build.MODEL;
        boolean z10 = true;
        boolean z11 = "unknown".equals(str) || com.zendesk.util.d.c(str);
        String str2 = Build.DEVICE;
        if (!"unknown".equals(str2) && !com.zendesk.util.d.c(str2)) {
            z10 = false;
        }
        return (z11 && z10) ? "" : str.equals(str2) ? str : String.format(Locale.US, "%s/%s", str, str2);
    }
}
