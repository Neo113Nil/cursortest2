package ru.ozon.uni.android.atom.aspect;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/atom/aspect/AspectViewState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "SELECTED", "UNAVAILABLE", "SELECTED_UNAVAILABLE", "PARTIALLY_AVAILABLE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AspectViewState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AspectViewState[] $VALUES;
    public static final AspectViewState ENABLED = new AspectViewState("ENABLED", 0);
    public static final AspectViewState SELECTED = new AspectViewState("SELECTED", 1);
    public static final AspectViewState UNAVAILABLE = new AspectViewState("UNAVAILABLE", 2);
    public static final AspectViewState SELECTED_UNAVAILABLE = new AspectViewState("SELECTED_UNAVAILABLE", 3);
    public static final AspectViewState PARTIALLY_AVAILABLE = new AspectViewState("PARTIALLY_AVAILABLE", 4);

    private static final /* synthetic */ AspectViewState[] $values() {
        return new AspectViewState[]{ENABLED, SELECTED, UNAVAILABLE, SELECTED_UNAVAILABLE, PARTIALLY_AVAILABLE};
    }

    static {
        AspectViewState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AspectViewState(String str, int i11) {
    }

    public static AspectViewState valueOf(String str) {
        return (AspectViewState) Enum.valueOf(AspectViewState.class, str);
    }

    public static AspectViewState[] values() {
        return (AspectViewState[]) $VALUES.clone();
    }
}
