package ru.ozon.app.android.search.widgets.expandableCells.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/CellState;", "", "<init>", "(Ljava/lang/String;I)V", "EXPANDED", "COLLAPSED", "LOADING", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CellState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CellState[] $VALUES;
    public static final CellState EXPANDED = new CellState("EXPANDED", 0);
    public static final CellState COLLAPSED = new CellState("COLLAPSED", 1);
    public static final CellState LOADING = new CellState("LOADING", 2);

    private static final /* synthetic */ CellState[] $values() {
        return new CellState[]{EXPANDED, COLLAPSED, LOADING};
    }

    static {
        CellState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CellState(String str, int i11) {
    }

    public static CellState valueOf(String str) {
        return (CellState) Enum.valueOf(CellState.class, str);
    }

    public static CellState[] values() {
        return (CellState[]) $VALUES.clone();
    }
}
