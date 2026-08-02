package com.yandex.runtime.sensors.internal.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import com.yandex.runtime.Runtime;
import com.yandex.runtime.sensors.internal.PermissionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class WifiSubscription extends BroadcastReceiver {
    private static final String ACCESS_WIFI_STATE = "android.permission.ACCESS_WIFI_STATE";
    private static final String CHANGE_WIFI_STATE = "android.permission.CHANGE_WIFI_STATE";
    private long nativePromise;
    private final String TAG = getClass().getCanonicalName();
    private boolean isRegistered = false;
    private WifiManager wifiManager = (WifiManager) Runtime.getApplicationContext().getSystemService("wifi");

    static native void deleteNativePromise(long j11);

    private void getScanResults() {
        try {
            List<ScanResult> scanResults = this.wifiManager.getScanResults();
            if (scanResults != null) {
                ArrayList arrayList = new ArrayList(scanResults.size());
                Iterator<ScanResult> it = scanResults.iterator();
                while (it.hasNext()) {
                    arrayList.add(WifiUtils.convert(it.next()));
                }
                scanResultsAvailable(this.nativePromise, arrayList);
            }
        } catch (SecurityException e11) {
            Log.e(this.TAG, "onReceive: SecurityException: " + e11.toString());
        }
    }

    public static boolean isWifiScanAvailable() {
        return PermissionHelper.checkPermissions(new String[]{ACCESS_WIFI_STATE, CHANGE_WIFI_STATE});
    }

    public static boolean isWifiThrottlingEnabled() {
        boolean isScanThrottleEnabled;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            return false;
        }
        if (i11 != 28) {
            if (i11 == 29) {
                try {
                    if (Settings.Global.getInt(Runtime.getApplicationContext().getContentResolver(), "wifi_scan_throttle_enabled") != 1) {
                        return false;
                    }
                } catch (Settings.SettingNotFoundException unused) {
                }
            } else if (i11 >= 30) {
                isScanThrottleEnabled = ((WifiManager) Runtime.getApplicationContext().getSystemService("wifi")).isScanThrottleEnabled();
                return isScanThrottleEnabled;
            }
        }
        return true;
    }

    static native void scanResultsAvailable(long j11, List<WifiPointInfo> list);

    /* JADX INFO: Access modifiers changed from: private */
    public void startScanImpl(long j11) {
        this.nativePromise = j11;
        Context applicationContext = Runtime.getApplicationContext();
        applicationContext.registerReceiver(this, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
        this.isRegistered = true;
        if (this.wifiManager.startScan()) {
            return;
        }
        unregister(applicationContext);
        scanResultsAvailable(this.nativePromise, new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregister(Context context) {
        if (this.isRegistered) {
            context.unregisterReceiver(this);
            this.isRegistered = false;
        }
    }

    public void cancel() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.runtime.sensors.internal.wifi.WifiSubscription.1
            @Override // java.lang.Runnable
            public void run() {
                WifiSubscription.this.unregister(Runtime.getApplicationContext());
            }
        });
    }

    protected void finalize() {
        deleteNativePromise(this.nativePromise);
    }

    native void getScanResultsAsync();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        unregister(context);
        getScanResultsAsync();
    }

    public void startScan(long j11) {
        new Handler(Looper.getMainLooper()).post(new Runnable(j11) { // from class: com.yandex.runtime.sensors.internal.wifi.WifiSubscription.1StartTask
            long promise;

            {
                this.promise = j11;
            }

            @Override // java.lang.Runnable
            public void run() {
                WifiSubscription.this.startScanImpl(this.promise);
            }
        });
    }
}
