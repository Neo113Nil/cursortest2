package com.vk.metrics.performance.thermal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: DeviceThermalStatusChecker.kt */
/* loaded from: classes3.dex */
public final class DeviceThermalStatusChecker {
    public final Context a;
    public volatile float b = Float.NaN;
    public final DeviceThermalStatusChecker$batteryStatusReceiver$1 c = new BroadcastReceiver() { // from class: com.vk.metrics.performance.thermal.DeviceThermalStatusChecker$batteryStatusReceiver$1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            DeviceThermalStatusChecker deviceThermalStatusChecker = DeviceThermalStatusChecker.this;
            int intExtra = intent != null ? intent.getIntExtra("temperature", Integer.MIN_VALUE) : Integer.MIN_VALUE;
            if (intExtra != Integer.MIN_VALUE) {
                deviceThermalStatusChecker.b = intExtra / 10.0f;
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [com.vk.metrics.performance.thermal.DeviceThermalStatusChecker$batteryStatusReceiver$1] */
    public DeviceThermalStatusChecker(Context context) {
        this.a = context;
    }
}
