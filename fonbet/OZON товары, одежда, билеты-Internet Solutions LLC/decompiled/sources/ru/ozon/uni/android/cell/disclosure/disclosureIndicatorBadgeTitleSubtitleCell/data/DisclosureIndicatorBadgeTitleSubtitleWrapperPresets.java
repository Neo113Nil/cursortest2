package ru.ozon.uni.android.cell.disclosure.disclosureIndicatorBadgeTitleSubtitleCell.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.disclosure.data.DisclosureAddonWrapperPresets;
import ru.ozon.uni.android.cell.indicator.indicatorBadgeTitleSubtitleCell.data.IndicatorBadgeTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.indicator.indicatorBadgeTitleSubtitleCell.data.IndicatorBadgeTitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/cell/disclosure/disclosureIndicatorBadgeTitleSubtitleCell/data/DisclosureIndicatorBadgeTitleSubtitleWrapperPresets;", "", "<init>", "()V", "centerEnd500CenterStart500Default500", "Lru/ozon/uni/android/cell/disclosure/disclosureIndicatorBadgeTitleSubtitleCell/data/DisclosureIndicatorBadgeTitleSubtitleWrapperPreset;", "getCenterEnd500CenterStart500Default500", "()Lru/ozon/uni/android/cell/disclosure/disclosureIndicatorBadgeTitleSubtitleCell/data/DisclosureIndicatorBadgeTitleSubtitleWrapperPreset;", "centerEnd500CenterStart500Control500", "getCenterEnd500CenterStart500Control500", "centerEnd400CenterStart400Default400", "getCenterEnd400CenterStart400Default400", "centerEnd400CenterStart400Control400", "getCenterEnd400CenterStart400Control400", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DisclosureIndicatorBadgeTitleSubtitleWrapperPresets {

    @NotNull
    public static final DisclosureIndicatorBadgeTitleSubtitleWrapperPresets INSTANCE = new DisclosureIndicatorBadgeTitleSubtitleWrapperPresets();

    @NotNull
    private static final DisclosureIndicatorBadgeTitleSubtitleWrapperPreset centerEnd400CenterStart400Control400;

    @NotNull
    private static final DisclosureIndicatorBadgeTitleSubtitleWrapperPreset centerEnd400CenterStart400Default400;

    @NotNull
    private static final DisclosureIndicatorBadgeTitleSubtitleWrapperPreset centerEnd500CenterStart500Control500;

    @NotNull
    private static final DisclosureIndicatorBadgeTitleSubtitleWrapperPreset centerEnd500CenterStart500Default500;

    static {
        IndicatorBadgeTitleSubtitleWrapperPresets indicatorBadgeTitleSubtitleWrapperPresets = IndicatorBadgeTitleSubtitleWrapperPresets.INSTANCE;
        IndicatorBadgeTitleSubtitleWrapperPreset centerEnd500CenterStart500Default5002 = indicatorBadgeTitleSubtitleWrapperPresets.getCenterEnd500CenterStart500Default500();
        DisclosureAddonWrapperPresets disclosureAddonWrapperPresets = DisclosureAddonWrapperPresets.INSTANCE;
        centerEnd500CenterStart500Default500 = new DisclosureIndicatorBadgeTitleSubtitleWrapperPreset(disclosureAddonWrapperPresets.getImage500CenterEnd(), centerEnd500CenterStart500Default5002);
        centerEnd500CenterStart500Control500 = new DisclosureIndicatorBadgeTitleSubtitleWrapperPreset(disclosureAddonWrapperPresets.getImage500CenterEnd(), indicatorBadgeTitleSubtitleWrapperPresets.getCenterEnd500CenterStart500Control500());
        centerEnd400CenterStart400Default400 = new DisclosureIndicatorBadgeTitleSubtitleWrapperPreset(disclosureAddonWrapperPresets.getImage400CenterEnd(), indicatorBadgeTitleSubtitleWrapperPresets.getCenterEnd400CenterStart400Default400());
        centerEnd400CenterStart400Control400 = new DisclosureIndicatorBadgeTitleSubtitleWrapperPreset(disclosureAddonWrapperPresets.getImage400CenterEnd(), indicatorBadgeTitleSubtitleWrapperPresets.getCenterEnd400CenterStart400Control400());
    }

    private DisclosureIndicatorBadgeTitleSubtitleWrapperPresets() {
    }

    @NotNull
    public final DisclosureIndicatorBadgeTitleSubtitleWrapperPreset getCenterEnd400CenterStart400Control400() {
        return centerEnd400CenterStart400Control400;
    }

    @NotNull
    public final DisclosureIndicatorBadgeTitleSubtitleWrapperPreset getCenterEnd400CenterStart400Default400() {
        return centerEnd400CenterStart400Default400;
    }

    @NotNull
    public final DisclosureIndicatorBadgeTitleSubtitleWrapperPreset getCenterEnd500CenterStart500Control500() {
        return centerEnd500CenterStart500Control500;
    }

    @NotNull
    public final DisclosureIndicatorBadgeTitleSubtitleWrapperPreset getCenterEnd500CenterStart500Default500() {
        return centerEnd500CenterStart500Default500;
    }
}
