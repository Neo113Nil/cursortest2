package ru.ozon.uni.android.atom.labelRating.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.LabelAddonWrapperPreset;
import ru.ozon.uni.android.cell.label.data.LabelAddonWrapperPresets;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/android/atom/labelRating/data/LabelRatingPresets;", "", "<init>", "()V", "HorizontalEnd200", "Lru/ozon/uni/android/atom/labelRating/data/LabelRatingPreset;", "getHorizontalEnd200", "()Lru/ozon/uni/android/atom/labelRating/data/LabelRatingPreset;", "HorizontalStart200", "getHorizontalStart200", "VerticalEnd200Leading", "getVerticalEnd200Leading", "VerticalEnd200Center", "getVerticalEnd200Center", "HorizontalEnd300", "getHorizontalEnd300", "HorizontalStart300", "getHorizontalStart300", "VerticalEnd300Leading", "getVerticalEnd300Leading", "VerticalEnd300Center", "getVerticalEnd300Center", "HorizontalEnd500", "getHorizontalEnd500", "HorizontalStart500", "getHorizontalStart500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LabelRatingPresets {

    @NotNull
    private static final LabelRatingPreset HorizontalEnd200;

    @NotNull
    private static final LabelRatingPreset HorizontalEnd300;

    @NotNull
    private static final LabelRatingPreset HorizontalEnd500;

    @NotNull
    private static final LabelRatingPreset HorizontalStart200;

    @NotNull
    private static final LabelRatingPreset HorizontalStart300;

    @NotNull
    private static final LabelRatingPreset HorizontalStart500;

    @NotNull
    public static final LabelRatingPresets INSTANCE = new LabelRatingPresets();

    @NotNull
    private static final LabelRatingPreset VerticalEnd200Center;

    @NotNull
    private static final LabelRatingPreset VerticalEnd200Leading;

    @NotNull
    private static final LabelRatingPreset VerticalEnd300Center;

    @NotNull
    private static final LabelRatingPreset VerticalEnd300Leading;

    static {
        LabelAddonWrapperPresets labelAddonWrapperPresets = LabelAddonWrapperPresets.INSTANCE;
        LabelAddonWrapperPreset centerEnd400Height500 = labelAddonWrapperPresets.getCenterEnd400Height500();
        RatingDTO.RatingSize ratingSize = RatingDTO.RatingSize.SIZE_200;
        HorizontalEnd200 = new LabelRatingPreset(centerEnd400Height500, ratingSize);
        HorizontalStart200 = new LabelRatingPreset(labelAddonWrapperPresets.getCenterStart400Height500(), ratingSize);
        VerticalEnd200Leading = new LabelRatingPreset(labelAddonWrapperPresets.getVerticalEnd400Leading(), ratingSize);
        VerticalEnd200Center = new LabelRatingPreset(labelAddonWrapperPresets.getVerticalEnd400Center(), ratingSize);
        LabelAddonWrapperPreset centerEnd500Height550 = labelAddonWrapperPresets.getCenterEnd500Height550();
        RatingDTO.RatingSize ratingSize2 = RatingDTO.RatingSize.SIZE_300;
        HorizontalEnd300 = new LabelRatingPreset(centerEnd500Height550, ratingSize2);
        HorizontalStart300 = new LabelRatingPreset(labelAddonWrapperPresets.getCenterStart500Height550(), ratingSize2);
        VerticalEnd300Leading = new LabelRatingPreset(labelAddonWrapperPresets.getVerticalEnd500Leading(), ratingSize2);
        VerticalEnd300Center = new LabelRatingPreset(labelAddonWrapperPresets.getVerticalEnd500Center(), ratingSize2);
        LabelAddonWrapperPreset centerEnd500Height5502 = labelAddonWrapperPresets.getCenterEnd500Height550();
        RatingDTO.RatingSize ratingSize3 = RatingDTO.RatingSize.SIZE_500;
        HorizontalEnd500 = new LabelRatingPreset(centerEnd500Height5502, ratingSize3);
        HorizontalStart500 = new LabelRatingPreset(labelAddonWrapperPresets.getCenterStart500Height550(), ratingSize3);
    }

    private LabelRatingPresets() {
    }

    @NotNull
    public final LabelRatingPreset getHorizontalEnd200() {
        return HorizontalEnd200;
    }

    @NotNull
    public final LabelRatingPreset getHorizontalEnd300() {
        return HorizontalEnd300;
    }

    @NotNull
    public final LabelRatingPreset getHorizontalEnd500() {
        return HorizontalEnd500;
    }

    @NotNull
    public final LabelRatingPreset getHorizontalStart200() {
        return HorizontalStart200;
    }

    @NotNull
    public final LabelRatingPreset getHorizontalStart300() {
        return HorizontalStart300;
    }

    @NotNull
    public final LabelRatingPreset getHorizontalStart500() {
        return HorizontalStart500;
    }

    @NotNull
    public final LabelRatingPreset getVerticalEnd200Center() {
        return VerticalEnd200Center;
    }

    @NotNull
    public final LabelRatingPreset getVerticalEnd200Leading() {
        return VerticalEnd200Leading;
    }

    @NotNull
    public final LabelRatingPreset getVerticalEnd300Center() {
        return VerticalEnd300Center;
    }

    @NotNull
    public final LabelRatingPreset getVerticalEnd300Leading() {
        return VerticalEnd300Leading;
    }
}
