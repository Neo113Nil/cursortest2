package ru.ozon.uni.android.ds.compose.component.tagbutton;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "Selected", "Loading", "LoadingSelected", "Disabled", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTagButtonState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsTagButtonState[] $VALUES;
    public static final DsTagButtonState Default = new DsTagButtonState("Default", 0);
    public static final DsTagButtonState Selected = new DsTagButtonState("Selected", 1);
    public static final DsTagButtonState Loading = new DsTagButtonState("Loading", 2);
    public static final DsTagButtonState LoadingSelected = new DsTagButtonState("LoadingSelected", 3);
    public static final DsTagButtonState Disabled = new DsTagButtonState("Disabled", 4);

    private static final /* synthetic */ DsTagButtonState[] $values() {
        return new DsTagButtonState[]{Default, Selected, Loading, LoadingSelected, Disabled};
    }

    static {
        DsTagButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsTagButtonState(String str, int i11) {
    }

    public static DsTagButtonState valueOf(String str) {
        return (DsTagButtonState) Enum.valueOf(DsTagButtonState.class, str);
    }

    public static DsTagButtonState[] values() {
        return (DsTagButtonState[]) $VALUES.clone();
    }
}
