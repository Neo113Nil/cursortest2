package io.radar.sdk;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import io.radar.sdk.util.BatteryState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarBatteryManager.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000f\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lio/radar/sdk/RadarBatteryManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "powerManager", "Landroid/os/PowerManager;", "usageStatsManager", "Landroid/app/usage/UsageStatsManager;", "getAppStandbyBucket", "", "()Ljava/lang/Integer;", "getBatteryState", "Lio/radar/sdk/util/BatteryState;", "getLocationPowerSaveMode", "isDeviceIdleMode", "", "isIgnoringBatteryOptimizations", "isPowerSaveMode", "()Ljava/lang/Boolean;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarBatteryManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int locationUnaffected = 0;
    private final Context context;
    private final PowerManager powerManager;
    private final UsageStatsManager usageStatsManager;

    public RadarBatteryManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.powerManager = (PowerManager) context.getSystemService("power");
        this.usageStatsManager = Build.VERSION.SDK_INT >= 28 ? (UsageStatsManager) context.getSystemService("usagestats") : null;
    }

    /* compiled from: RadarBatteryManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/radar/sdk/RadarBatteryManager$Companion;", "", "()V", "locationUnaffected", "", "getLocationUnaffected", "()I", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getLocationUnaffected() {
            return RadarBatteryManager.locationUnaffected;
        }
    }

    public final BatteryState getBatteryState() {
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        boolean z = intExtra == 2 || intExtra == 5;
        Float valueOf = registerReceiver != null ? Float.valueOf((registerReceiver.getIntExtra("level", -1) * 100) / registerReceiver.getIntExtra("scale", -1)) : null;
        return new BatteryState(z, valueOf != null ? valueOf.floatValue() : 0.0f, isPowerSaveMode(), isIgnoringBatteryOptimizations(), getLocationPowerSaveMode(), isDeviceIdleMode());
    }

    public final Integer getAppStandbyBucket() {
        int appStandbyBucket;
        UsageStatsManager usageStatsManager = this.usageStatsManager;
        if (usageStatsManager == null) {
            return null;
        }
        appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        return Integer.valueOf(appStandbyBucket);
    }

    private final Boolean isPowerSaveMode() {
        PowerManager powerManager = this.powerManager;
        if (powerManager != null) {
            return Boolean.valueOf(powerManager.isPowerSaveMode());
        }
        return null;
    }

    private final int getLocationPowerSaveMode() {
        PowerManager powerManager;
        int locationPowerSaveMode;
        if (Build.VERSION.SDK_INT >= 28 && (powerManager = this.powerManager) != null) {
            locationPowerSaveMode = powerManager.getLocationPowerSaveMode();
            return locationPowerSaveMode;
        }
        return locationUnaffected;
    }

    private final boolean isDeviceIdleMode() {
        PowerManager powerManager = this.powerManager;
        if (powerManager != null) {
            return powerManager.isDeviceIdleMode();
        }
        return false;
    }

    private final boolean isIgnoringBatteryOptimizations() {
        PowerManager powerManager = this.powerManager;
        if (powerManager != null) {
            return powerManager.isIgnoringBatteryOptimizations(this.context.getPackageName());
        }
        return false;
    }
}
