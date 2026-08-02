package org.chromium.base.memory;

import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import io.radar.sdk.RadarTrackingOptions;
import org.chromium.base.ContextUtils;

/* loaded from: classes10.dex */
public class MemoryInfoBridge {
    public static Debug.MemoryInfo getActivityManagerMemoryInfoForSelf() {
        try {
            Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) ContextUtils.getApplicationContext().getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY)).getProcessMemoryInfo(new int[]{Process.myPid()});
            if (processMemoryInfo == null) {
                return null;
            }
            return processMemoryInfo[0];
        } catch (SecurityException unused) {
            return null;
        }
    }
}
