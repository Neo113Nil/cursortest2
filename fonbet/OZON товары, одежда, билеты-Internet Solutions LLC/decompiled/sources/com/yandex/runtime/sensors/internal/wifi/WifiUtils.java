package com.yandex.runtime.sensors.internal.wifi;

import android.net.wifi.ScanResult;
import android.os.SystemClock;

/* loaded from: classes9.dex */
public class WifiUtils {
    public static WifiPointInfo convert(ScanResult scanResult) {
        return new WifiPointInfo(scanResult.BSSID, scanResult.SSID, scanResult.level, eventMicrosToTimestampMilliseconds(scanResult.timestamp));
    }

    private static long eventMicrosToTimestampMilliseconds(long j11) {
        return (j11 / 1000) + (System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }
}
