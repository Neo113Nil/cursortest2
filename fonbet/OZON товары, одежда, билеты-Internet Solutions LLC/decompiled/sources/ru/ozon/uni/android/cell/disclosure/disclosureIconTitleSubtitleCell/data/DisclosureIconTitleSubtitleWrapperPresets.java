package ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.disclosure.data.DisclosureAddonWrapperPreset;
import ru.ozon.uni.android.cell.disclosure.data.DisclosureAddonWrapperPresets;
import ru.ozon.uni.android.cell.icon.data.IconTitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/data/DisclosureIconTitleSubtitleWrapperPresets;", "", "<init>", "()V", "noShape500TopStart500Default500", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/data/DisclosureIconTitleSubtitleWrapperPreset;", "getNoShape500TopStart500Default500", "()Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/data/DisclosureIconTitleSubtitleWrapperPreset;", "noShape400TopStart400Default400", "getNoShape400TopStart400Default400", "shape400Center500Control500", "getShape400Center500Control500", "shape400TopStart500Default500", "getShape400TopStart500Default500", "shape500TopStart500Default500", "getShape500TopStart500Default500", "shape600CenterStart500Default500", "getShape600CenterStart500Default500", "noShape500TopStart500Control500", "getNoShape500TopStart500Control500", "noShape400TopStart400Control400", "getNoShape400TopStart400Control400", "shape400TopStart500Control500", "getShape400TopStart500Control500", "shape500TopStart500Control500", "getShape500TopStart500Control500", "shape600CenterStart500Control500", "getShape600CenterStart500Control500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DisclosureIconTitleSubtitleWrapperPresets {

    @NotNull
    public static final DisclosureIconTitleSubtitleWrapperPresets INSTANCE = new DisclosureIconTitleSubtitleWrapperPresets();

    @NotNull
    private static final DisclosureIconTitleSubtitleWrapperPreset noShape400TopStart400Control400;

    @NotNull
    private static final DisclosureIconTitleSubtitleWrapperPreset noShape400TopStart400Default400;

    @NotNull
    private static final DisclosureIconTitleSubtitleWrapperPreset noShape500TopStart500Control500;

    @NotNull
    private static final DisclosureIconTitleSubtitleWrapperPreset noShape500TopStart500Default500;

    @NotNull
    private static final DisclosureIconTitleSubtitleWrapperPreset shape400Center500Control500;

    @NotNull
    private static final DisclosureIconTitleSubtitleWrapperPreset shape400TopStart500Control500;

    @NotNull
    private static final DisclosureIconTitleSubtitleWrapperPreset shape400TopStart500Default500;

    @NotNull
    private static final DisclosureIconTitleSubtitleWrapperPreset shape500TopStart500Control500;

    @NotNull
    private static final DisclosureIconTitleSubtitleWrapperPreset shape500TopStart500Default500;

    @NotNull
    private static final DisclosureIconTitleSubtitleWrapperPreset shape600CenterStart500Control500;

    @NotNull
    private static final DisclosureIconTitleSubtitleWrapperPreset shape600CenterStart500Default500;

    static {
        DisclosureAddonWrapperPresets disclosureAddonWrapperPresets = DisclosureAddonWrapperPresets.INSTANCE;
        DisclosureAddonWrapperPreset image500CenterEnd = disclosureAddonWrapperPresets.getImage500CenterEnd();
        IconTitleSubtitleWrapperPresets iconTitleSubtitleWrapperPresets = IconTitleSubtitleWrapperPresets.INSTANCE;
        noShape500TopStart500Default500 = new DisclosureIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getNoShape500TopStart500Default500(), image500CenterEnd);
        noShape400TopStart400Default400 = new DisclosureIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getNoShape400TopStart400Default400(), disclosureAddonWrapperPresets.getImage400CenterEnd());
        shape400Center500Control500 = new DisclosureIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape400Center500LeadingControl700Control500(), disclosureAddonWrapperPresets.getImage500CenterEnd());
        shape400TopStart500Default500 = new DisclosureIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape500TopStart500Default500(), disclosureAddonWrapperPresets.getImage500CenterEnd());
        shape500TopStart500Default500 = new DisclosureIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape500TopStart500Default500(), disclosureAddonWrapperPresets.getImage500CenterEnd());
        shape600CenterStart500Default500 = new DisclosureIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape600CenterStart500Default500(), disclosureAddonWrapperPresets.getImage500CenterEnd());
        noShape500TopStart500Control500 = new DisclosureIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getNoShape500TopStart500Control500(), disclosureAddonWrapperPresets.getImage500CenterEnd());
        noShape400TopStart400Control400 = new DisclosureIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getNoShape400TopStart400Control400(), disclosureAddonWrapperPresets.getImage400CenterEnd());
        shape400TopStart500Control500 = new DisclosureIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape400TopStart500Control500(), disclosureAddonWrapperPresets.getImage500CenterEnd());
        shape500TopStart500Control500 = new DisclosureIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape500TopStart500Control500(), disclosureAddonWrapperPresets.getImage500CenterEnd());
        shape600CenterStart500Control500 = new DisclosureIconTitleSubtitleWrapperPreset(iconTitleSubtitleWrapperPresets.getShape600CenterStart500Control500(), disclosureAddonWrapperPresets.getImage500CenterEnd());
    }

    private DisclosureIconTitleSubtitleWrapperPresets() {
    }

    @NotNull
    public final DisclosureIconTitleSubtitleWrapperPreset getNoShape400TopStart400Control400() {
        return noShape400TopStart400Control400;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleWrapperPreset getNoShape400TopStart400Default400() {
        return noShape400TopStart400Default400;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleWrapperPreset getNoShape500TopStart500Control500() {
        return noShape500TopStart500Control500;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleWrapperPreset getNoShape500TopStart500Default500() {
        return noShape500TopStart500Default500;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleWrapperPreset getShape400Center500Control500() {
        return shape400Center500Control500;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleWrapperPreset getShape400TopStart500Control500() {
        return shape400TopStart500Control500;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleWrapperPreset getShape400TopStart500Default500() {
        return shape400TopStart500Default500;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleWrapperPreset getShape500TopStart500Control500() {
        return shape500TopStart500Control500;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleWrapperPreset getShape500TopStart500Default500() {
        return shape500TopStart500Default500;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleWrapperPreset getShape600CenterStart500Control500() {
        return shape600CenterStart500Control500;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleWrapperPreset getShape600CenterStart500Default500() {
        return shape600CenterStart500Default500;
    }
}
