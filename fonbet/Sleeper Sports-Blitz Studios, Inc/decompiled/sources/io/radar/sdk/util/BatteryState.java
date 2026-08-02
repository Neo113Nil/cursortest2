package io.radar.sdk.util;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.radar.sdk.RadarBatteryManager;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatteryState.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001&B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\"\u001a\u00020#J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lio/radar/sdk/util/BatteryState;", "", "isCharging", "", "percent", "", "powerSaveMode", "isIgnoringBatteryOptimizations", "locationPowerSaveMode", "", "isDeviceIdleMode", "(ZFLjava/lang/Boolean;ZIZ)V", "()Z", "getLocationPowerSaveMode", "()I", "getPercent", "()F", "performanceState", "Lio/radar/sdk/util/BatteryState$PerformanceState;", "getPerformanceState", "()Lio/radar/sdk/util/BatteryState$PerformanceState;", "getPowerSaveMode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZFLjava/lang/Boolean;ZIZ)Lio/radar/sdk/util/BatteryState;", "equals", "other", "getPowerLocationPowerSaveModeString", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "PerformanceState", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class BatteryState {
    private final boolean isCharging;
    private final boolean isDeviceIdleMode;
    private final boolean isIgnoringBatteryOptimizations;
    private final int locationPowerSaveMode;
    private final float percent;
    private final PerformanceState performanceState;
    private final Boolean powerSaveMode;

    public static /* synthetic */ BatteryState copy$default(BatteryState batteryState, boolean z, float f, Boolean bool, boolean z2, int i, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = batteryState.isCharging;
        }
        if ((i2 & 2) != 0) {
            f = batteryState.percent;
        }
        if ((i2 & 4) != 0) {
            bool = batteryState.powerSaveMode;
        }
        if ((i2 & 8) != 0) {
            z2 = batteryState.isIgnoringBatteryOptimizations;
        }
        if ((i2 & 16) != 0) {
            i = batteryState.locationPowerSaveMode;
        }
        if ((i2 & 32) != 0) {
            z3 = batteryState.isDeviceIdleMode;
        }
        int i3 = i;
        boolean z4 = z3;
        return batteryState.copy(z, f, bool, z2, i3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCharging() {
        return this.isCharging;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPercent() {
        return this.percent;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getPowerSaveMode() {
        return this.powerSaveMode;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsIgnoringBatteryOptimizations() {
        return this.isIgnoringBatteryOptimizations;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLocationPowerSaveMode() {
        return this.locationPowerSaveMode;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsDeviceIdleMode() {
        return this.isDeviceIdleMode;
    }

    public final BatteryState copy(boolean isCharging, float percent, Boolean powerSaveMode, boolean isIgnoringBatteryOptimizations, int locationPowerSaveMode, boolean isDeviceIdleMode) {
        return new BatteryState(isCharging, percent, powerSaveMode, isIgnoringBatteryOptimizations, locationPowerSaveMode, isDeviceIdleMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatteryState)) {
            return false;
        }
        BatteryState batteryState = (BatteryState) other;
        return this.isCharging == batteryState.isCharging && Float.compare(this.percent, batteryState.percent) == 0 && Intrinsics.areEqual(this.powerSaveMode, batteryState.powerSaveMode) && this.isIgnoringBatteryOptimizations == batteryState.isIgnoringBatteryOptimizations && this.locationPowerSaveMode == batteryState.locationPowerSaveMode && this.isDeviceIdleMode == batteryState.isDeviceIdleMode;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.isCharging) * 31) + Float.hashCode(this.percent)) * 31;
        Boolean bool = this.powerSaveMode;
        return ((((((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isIgnoringBatteryOptimizations)) * 31) + Integer.hashCode(this.locationPowerSaveMode)) * 31) + Boolean.hashCode(this.isDeviceIdleMode);
    }

    public String toString() {
        return "BatteryState(isCharging=" + this.isCharging + ", percent=" + this.percent + ", powerSaveMode=" + this.powerSaveMode + ", isIgnoringBatteryOptimizations=" + this.isIgnoringBatteryOptimizations + ", locationPowerSaveMode=" + this.locationPowerSaveMode + ", isDeviceIdleMode=" + this.isDeviceIdleMode + ')';
    }

    public BatteryState(boolean z, float f, Boolean bool, boolean z2, int i, boolean z3) {
        PerformanceState performanceState;
        PerformanceState performanceState2;
        this.isCharging = z;
        this.percent = f;
        this.powerSaveMode = bool;
        this.isIgnoringBatteryOptimizations = z2;
        this.locationPowerSaveMode = i;
        this.isDeviceIdleMode = z3;
        if (bool != null) {
            boolean z4 = bool.booleanValue() && !z2;
            boolean z5 = i != RadarBatteryManager.INSTANCE.getLocationUnaffected();
            if (z3) {
                if (!z4) {
                    performanceState2 = PerformanceState.IDLE;
                } else if (z5) {
                    performanceState2 = PerformanceState.LOWEST;
                } else {
                    performanceState2 = PerformanceState.LOW;
                }
                this.performanceState = performanceState2;
                return;
            }
            if (z4) {
                if (z5) {
                    performanceState = PerformanceState.LOCATIONS_LOW_PERFORMANCE;
                } else {
                    performanceState = PerformanceState.OPTIMIZED;
                }
                this.performanceState = performanceState;
                return;
            }
            this.performanceState = PerformanceState.OK;
            return;
        }
        this.performanceState = PerformanceState.OK;
    }

    public final boolean isCharging() {
        return this.isCharging;
    }

    public final float getPercent() {
        return this.percent;
    }

    public final Boolean getPowerSaveMode() {
        return this.powerSaveMode;
    }

    public final boolean isIgnoringBatteryOptimizations() {
        return this.isIgnoringBatteryOptimizations;
    }

    public final int getLocationPowerSaveMode() {
        return this.locationPowerSaveMode;
    }

    public final boolean isDeviceIdleMode() {
        return this.isDeviceIdleMode;
    }

    public final PerformanceState getPerformanceState() {
        return this.performanceState;
    }

    public final String getPowerLocationPowerSaveModeString() {
        int i = this.locationPowerSaveMode;
        if (i == 0) {
            return "LOCATION_MODE_NO_CHANGE";
        }
        if (i == 1) {
            return "LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF";
        }
        if (i == 2) {
            return "LOCATION_MODE_ALL_DISABLED_WHEN_SCREEN_OFF";
        }
        if (i == 3) {
            return "LOCATION_MODE_FOREGROUND_ONLY";
        }
        if (i == 4) {
            return "LOCATION_MODE_THROTTLE_REQUESTS_WHEN_SCREEN_OFF";
        }
        return String.valueOf(i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BatteryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/radar/sdk/util/BatteryState$PerformanceState;", "", "(Ljava/lang/String;I)V", "OK", "OPTIMIZED", "LOCATIONS_LOW_PERFORMANCE", "IDLE", "LOW", "LOWEST", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PerformanceState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PerformanceState[] $VALUES;
        public static final PerformanceState OK = new PerformanceState("OK", 0);
        public static final PerformanceState OPTIMIZED = new PerformanceState("OPTIMIZED", 1);
        public static final PerformanceState LOCATIONS_LOW_PERFORMANCE = new PerformanceState("LOCATIONS_LOW_PERFORMANCE", 2);
        public static final PerformanceState IDLE = new PerformanceState("IDLE", 3);
        public static final PerformanceState LOW = new PerformanceState("LOW", 4);
        public static final PerformanceState LOWEST = new PerformanceState("LOWEST", 5);

        private static final /* synthetic */ PerformanceState[] $values() {
            return new PerformanceState[]{OK, OPTIMIZED, LOCATIONS_LOW_PERFORMANCE, IDLE, LOW, LOWEST};
        }

        public static EnumEntries<PerformanceState> getEntries() {
            return $ENTRIES;
        }

        public static PerformanceState valueOf(String str) {
            return (PerformanceState) Enum.valueOf(PerformanceState.class, str);
        }

        public static PerformanceState[] values() {
            return (PerformanceState[]) $VALUES.clone();
        }

        private PerformanceState(String str, int i) {
        }

        static {
            PerformanceState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }
}
