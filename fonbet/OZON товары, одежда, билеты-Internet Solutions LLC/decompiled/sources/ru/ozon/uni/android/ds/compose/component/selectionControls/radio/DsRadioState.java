package ru.ozon.uni.android.ds.compose.component.selectionControls.radio;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "ERROR", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsRadioState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsRadioState[] $VALUES;
    public static final DsRadioState ENABLED = new DsRadioState("ENABLED", 0);
    public static final DsRadioState DISABLED = new DsRadioState("DISABLED", 1);
    public static final DsRadioState ERROR = new DsRadioState("ERROR", 2);

    private static final /* synthetic */ DsRadioState[] $values() {
        return new DsRadioState[]{ENABLED, DISABLED, ERROR};
    }

    static {
        DsRadioState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsRadioState(String str, int i11) {
    }

    public static DsRadioState valueOf(String str) {
        return (DsRadioState) Enum.valueOf(DsRadioState.class, str);
    }

    public static DsRadioState[] values() {
        return (DsRadioState[]) $VALUES.clone();
    }
}
