package ru.ozon.uni.android.cell.listItem.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPresets;", "", "<init>", "()V", "centerEndNoTrailing500", "Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "getCenterEndNoTrailing500", "()Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "centerEndTrailing500", "getCenterEndTrailing500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListCellWrapperPresets {

    @NotNull
    public static final ListCellWrapperPresets INSTANCE = new ListCellWrapperPresets();

    @NotNull
    private static final ListCellWrapperPreset centerEndNoTrailing500;

    @NotNull
    private static final ListCellWrapperPreset centerEndTrailing500;

    static {
        ListAddonWrapperPresets listAddonWrapperPresets = ListAddonWrapperPresets.INSTANCE;
        ListAddonWrapperPreset cellEndNoTrailing500 = listAddonWrapperPresets.getCellEndNoTrailing500();
        TitleSubtitleWrapperPresets titleSubtitleWrapperPresets = TitleSubtitleWrapperPresets.INSTANCE;
        centerEndNoTrailing500 = new ListCellWrapperPreset(cellEndNoTrailing500, titleSubtitleWrapperPresets.getContentDefault500());
        centerEndTrailing500 = new ListCellWrapperPreset(listAddonWrapperPresets.getCellEndTrailing500(), titleSubtitleWrapperPresets.getContentDefault500());
    }

    private ListCellWrapperPresets() {
    }

    @NotNull
    public final ListCellWrapperPreset getCenterEndNoTrailing500() {
        return centerEndNoTrailing500;
    }

    @NotNull
    public final ListCellWrapperPreset getCenterEndTrailing500() {
        return centerEndTrailing500;
    }
}
