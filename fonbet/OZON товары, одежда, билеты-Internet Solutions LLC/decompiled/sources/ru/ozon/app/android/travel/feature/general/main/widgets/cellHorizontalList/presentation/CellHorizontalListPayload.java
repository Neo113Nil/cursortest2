package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListPayload;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "CELLS", "CELL_GAP", "SETTINGS", "CELL_SETTINGS", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellHorizontalListPayload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CellHorizontalListPayload[] $VALUES;
    public static final CellHorizontalListPayload TITLE = new CellHorizontalListPayload(SelectionItemDescriptionDTO.TITLE, 0);
    public static final CellHorizontalListPayload CELLS = new CellHorizontalListPayload("CELLS", 1);
    public static final CellHorizontalListPayload CELL_GAP = new CellHorizontalListPayload("CELL_GAP", 2);
    public static final CellHorizontalListPayload SETTINGS = new CellHorizontalListPayload("SETTINGS", 3);
    public static final CellHorizontalListPayload CELL_SETTINGS = new CellHorizontalListPayload("CELL_SETTINGS", 4);

    private static final /* synthetic */ CellHorizontalListPayload[] $values() {
        return new CellHorizontalListPayload[]{TITLE, CELLS, CELL_GAP, SETTINGS, CELL_SETTINGS};
    }

    static {
        CellHorizontalListPayload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CellHorizontalListPayload(String str, int i11) {
    }

    public static CellHorizontalListPayload valueOf(String str) {
        return (CellHorizontalListPayload) Enum.valueOf(CellHorizontalListPayload.class, str);
    }

    public static CellHorizontalListPayload[] values() {
        return (CellHorizontalListPayload[]) $VALUES.clone();
    }
}
