package cordova.device.extended.information;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ExtendedDevice extends CordovaPlugin {
    public static final String TAG = "ExtendedDevice";

    @Override // org.apache.cordova.CordovaPlugin
    public void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) {
        super.initialize(cordovaInterface, cordovaWebView);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        if ("getExtendedDeviceInfo".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("memory", getMemorySize());
            jSONObject.put("cpumhz", getCpuMhz());
            jSONObject.put("totalstorage", getTotalSystemStorage());
            jSONObject.put("freestorage", getFreeSystemStorage());
            callbackContext.success(jSONObject);
            return true;
        }
        if (!"getPerformanceMetrics".equals(str)) {
            return false;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("memory", getCurrentMemorySize());
        jSONObject2.put("memoryTotal", getTotalMemorySize());
        jSONObject2.put("memoryUsage", getCurrentMemoryUsage());
        jSONObject2.put("memorySharedUsage", getSharedMemoryUsage());
        jSONObject2.put("nativeHeapAllocatedSize", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("nativeHeapSize", Debug.getNativeHeapSize());
        jSONObject2.put("threadExternalAllocSize", Debug.getThreadExternalAllocSize());
        jSONObject2.put("globalExternalAllocSize", Debug.getGlobalExternalAllocSize());
        jSONObject2.put("globalAllocSize", Debug.getGlobalAllocSize());
        jSONObject2.put("cpu", getCurrentCpuUsage());
        callbackContext.success(jSONObject2);
        return true;
    }

    private String getTotalSystemStorage() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return Long.toString((statFs.getBlockSize() * statFs.getBlockCount()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    private long getFreeSystemStorage() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private Number getTotalMemorySize() {
        ActivityManager activityManager = (ActivityManager) this.f3354cordova.getActivity().getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return Long.valueOf(memoryInfo.totalMem);
    }

    private Number getCurrentMemoryUsage() {
        ActivityManager activityManager = (ActivityManager) this.f3354cordova.getActivity().getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        int[] iArr = new int[runningAppProcesses.size()];
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().pid;
            i++;
        }
        long j = 0;
        for (Debug.MemoryInfo memoryInfo : activityManager.getProcessMemoryInfo(iArr)) {
            j = j + memoryInfo.getTotalPrivateDirty() + memoryInfo.getTotalPrivateClean();
        }
        return Long.valueOf(j * 1024);
    }

    private Number getSharedMemoryUsage() {
        ActivityManager activityManager = (ActivityManager) this.f3354cordova.getActivity().getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        int[] iArr = new int[runningAppProcesses.size()];
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().pid;
            i++;
        }
        long j = 0;
        for (Debug.MemoryInfo memoryInfo : activityManager.getProcessMemoryInfo(iArr)) {
            j = j + memoryInfo.getTotalSharedDirty() + memoryInfo.getTotalSharedClean();
        }
        return Long.valueOf(j * 1024);
    }

    private Number getCurrentMemorySize() {
        ActivityManager activityManager = (ActivityManager) this.f3354cordova.getActivity().getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return Long.valueOf(memoryInfo.totalMem - memoryInfo.availMem);
    }

    private String getMemorySize() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            Matcher matcher = Pattern.compile("(\\d+)").matcher(randomAccessFile.readLine());
            String str = "";
            while (matcher.find()) {
                str = matcher.group(1);
            }
            randomAccessFile.close();
            return decimalFormat.format(Double.parseDouble(str) / 1024.0d);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private Number getCpuMhz() {
        Long l = null;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            l = Long.valueOf(Long.parseLong(randomAccessFile.readLine()));
            randomAccessFile.close();
            return l;
        } catch (IOException e) {
            e.printStackTrace();
            return l;
        }
    }

    private Number getCurrentCpuUsage() {
        if (Build.VERSION.SDK_INT >= 26) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/stat", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            String readLine = randomAccessFile.readLine();
            randomAccessFile.close();
            String[] split = readLine.split(" +");
            long parseLong = Long.parseLong(split[1]);
            long parseLong2 = Long.parseLong(split[2]);
            long parseLong3 = Long.parseLong(split[3]);
            long parseLong4 = Long.parseLong(split[4]);
            long parseLong5 = Long.parseLong(split[5]);
            long parseLong6 = parseLong + parseLong2 + parseLong3 + parseLong4 + parseLong5 + Long.parseLong(split[6]) + Long.parseLong(split[7]);
            return Long.valueOf(((parseLong6 - parseLong4) * 100) / parseLong6);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
