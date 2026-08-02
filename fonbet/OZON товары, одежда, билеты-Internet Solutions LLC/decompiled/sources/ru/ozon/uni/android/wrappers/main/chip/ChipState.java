package ru.ozon.uni.android.wrappers.main.chip;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/wrappers/main/chip/ChipState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "PRESSED", "SELECTED", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChipState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ChipState[] $VALUES;
    public static final ChipState ENABLED = new ChipState("ENABLED", 0);
    public static final ChipState DISABLED = new ChipState("DISABLED", 1);
    public static final ChipState PRESSED = new ChipState("PRESSED", 2);
    public static final ChipState SELECTED = new ChipState("SELECTED", 3);

    private static final /* synthetic */ ChipState[] $values() {
        return new ChipState[]{ENABLED, DISABLED, PRESSED, SELECTED};
    }

    static {
        ChipState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ChipState(String str, int i11) {
    }

    @NotNull
    public static a<ChipState> getEntries() {
        return $ENTRIES;
    }

    public static ChipState valueOf(String str) {
        return (ChipState) Enum.valueOf(ChipState.class, str);
    }

    public static ChipState[] values() {
        return (ChipState[]) $VALUES.clone();
    }
}
