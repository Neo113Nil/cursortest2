package ru.ozon.uni.android.ds.compose.component.selectionControls.checkbox;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "ERROR", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsCheckboxState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsCheckboxState[] $VALUES;
    public static final DsCheckboxState ENABLED = new DsCheckboxState("ENABLED", 0);
    public static final DsCheckboxState DISABLED = new DsCheckboxState("DISABLED", 1);
    public static final DsCheckboxState ERROR = new DsCheckboxState("ERROR", 2);

    private static final /* synthetic */ DsCheckboxState[] $values() {
        return new DsCheckboxState[]{ENABLED, DISABLED, ERROR};
    }

    static {
        DsCheckboxState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsCheckboxState(String str, int i11) {
    }

    public static DsCheckboxState valueOf(String str) {
        return (DsCheckboxState) Enum.valueOf(DsCheckboxState.class, str);
    }

    public static DsCheckboxState[] values() {
        return (DsCheckboxState[]) $VALUES.clone();
    }
}
