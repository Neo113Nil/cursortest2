package ru.ozon.android.hardwareinfo.powermanager;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/hardwareinfo/powermanager/PowerSaveState;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "PERFORMANCE", "POWER_SAVE", FraudMonInfo.UNKNOWN, "hardware-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PowerSaveState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PowerSaveState[] $VALUES;
    public static final PowerSaveState DEFAULT = new PowerSaveState("DEFAULT", 0);
    public static final PowerSaveState PERFORMANCE = new PowerSaveState("PERFORMANCE", 1);
    public static final PowerSaveState POWER_SAVE = new PowerSaveState("POWER_SAVE", 2);
    public static final PowerSaveState UNKNOWN = new PowerSaveState(FraudMonInfo.UNKNOWN, 3);

    private static final /* synthetic */ PowerSaveState[] $values() {
        return new PowerSaveState[]{DEFAULT, PERFORMANCE, POWER_SAVE, UNKNOWN};
    }

    static {
        PowerSaveState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PowerSaveState(String str, int i11) {
    }

    @NotNull
    public static a<PowerSaveState> getEntries() {
        return $ENTRIES;
    }

    public static PowerSaveState valueOf(String str) {
        return (PowerSaveState) Enum.valueOf(PowerSaveState.class, str);
    }

    public static PowerSaveState[] values() {
        return (PowerSaveState[]) $VALUES.clone();
    }
}
