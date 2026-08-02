package ru.ozon.uni.android.cell.listItem.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.SmartLabelPreset;
import ru.ozon.uni.android.cell.label.data.SmartLabelPresets;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonWrapperSettings;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/cell/listItem/data/ListAddonWrapperPresets;", "", "<init>", "()V", "cellEndNoTrailing500", "Lru/ozon/uni/android/cell/listItem/data/ListAddonWrapperPreset;", "getCellEndNoTrailing500", "()Lru/ozon/uni/android/cell/listItem/data/ListAddonWrapperPreset;", "cellEndTrailing500", "getCellEndTrailing500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListAddonWrapperPresets {

    @NotNull
    public static final ListAddonWrapperPresets INSTANCE = new ListAddonWrapperPresets();

    @NotNull
    private static final ListAddonWrapperPreset cellEndNoTrailing500;

    @NotNull
    private static final ListAddonWrapperPreset cellEndTrailing500;

    static {
        SmartLabelPresets smartLabelPresets = SmartLabelPresets.INSTANCE;
        SmartLabelPreset leadingNumeric500 = smartLabelPresets.getLeadingNumeric500();
        MainAddonWrapperSettings mainAddonWrapperSettings = MainAddonWrapperSettings.INSTANCE;
        cellEndNoTrailing500 = new ListAddonWrapperPreset(leadingNumeric500, mainAddonWrapperSettings.getCellEndNoTrailing500());
        cellEndTrailing500 = new ListAddonWrapperPreset(smartLabelPresets.getLeadingNumeric500(), mainAddonWrapperSettings.getCellEndTrailing500());
    }

    private ListAddonWrapperPresets() {
    }

    @NotNull
    public final ListAddonWrapperPreset getCellEndNoTrailing500() {
        return cellEndNoTrailing500;
    }

    @NotNull
    public final ListAddonWrapperPreset getCellEndTrailing500() {
        return cellEndTrailing500;
    }
}
