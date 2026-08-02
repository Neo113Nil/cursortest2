package ru.ozon.uni.android.cell.badge.badgeIconTitleSubtitleCell.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.badge.data.BadgeAddonWrapperPreset;
import ru.ozon.uni.android.cell.badge.data.BadgeAddonWrapperPresets;
import ru.ozon.uni.android.cell.icon.data.IconTitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/android/cell/badge/badgeIconTitleSubtitleCell/data/BadgeIconTitleSubtitleWrapperPresets;", "", "<init>", "()V", "centerEnd500NoShape500TopStart500Default500", "Lru/ozon/uni/android/cell/badge/badgeIconTitleSubtitleCell/data/BadgeIconTitleSubtitleWrapperPreset;", "getCenterEnd500NoShape500TopStart500Default500", "()Lru/ozon/uni/android/cell/badge/badgeIconTitleSubtitleCell/data/BadgeIconTitleSubtitleWrapperPreset;", "centerEnd400NoShape400TopStart400Default400", "getCenterEnd400NoShape400TopStart400Default400", "centerEnd500Shape400TopStart500Default500", "getCenterEnd500Shape400TopStart500Default500", "centerEnd500Shape500TopStart500Default500", "getCenterEnd500Shape500TopStart500Default500", "centerEnd500Shape600CenterStart500Default500", "getCenterEnd500Shape600CenterStart500Default500", "centerEnd500NoShape500TopStart500Control500", "getCenterEnd500NoShape500TopStart500Control500", "centerEnd400NoShape400TopStart400Control400", "getCenterEnd400NoShape400TopStart400Control400", "centerEnd500Shape400TopStart500Control500", "getCenterEnd500Shape400TopStart500Control500", "centerEnd500Shape500TopStart500Control500", "getCenterEnd500Shape500TopStart500Control500", "centerEnd500Shape600CenterStart500Control500", "getCenterEnd500Shape600CenterStart500Control500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BadgeIconTitleSubtitleWrapperPresets {

    @NotNull
    public static final BadgeIconTitleSubtitleWrapperPresets INSTANCE = new BadgeIconTitleSubtitleWrapperPresets();

    @NotNull
    private static final BadgeIconTitleSubtitleWrapperPreset centerEnd400NoShape400TopStart400Control400;

    @NotNull
    private static final BadgeIconTitleSubtitleWrapperPreset centerEnd400NoShape400TopStart400Default400;

    @NotNull
    private static final BadgeIconTitleSubtitleWrapperPreset centerEnd500NoShape500TopStart500Control500;

    @NotNull
    private static final BadgeIconTitleSubtitleWrapperPreset centerEnd500NoShape500TopStart500Default500;

    @NotNull
    private static final BadgeIconTitleSubtitleWrapperPreset centerEnd500Shape400TopStart500Control500;

    @NotNull
    private static final BadgeIconTitleSubtitleWrapperPreset centerEnd500Shape400TopStart500Default500;

    @NotNull
    private static final BadgeIconTitleSubtitleWrapperPreset centerEnd500Shape500TopStart500Control500;

    @NotNull
    private static final BadgeIconTitleSubtitleWrapperPreset centerEnd500Shape500TopStart500Default500;

    @NotNull
    private static final BadgeIconTitleSubtitleWrapperPreset centerEnd500Shape600CenterStart500Control500;

    @NotNull
    private static final BadgeIconTitleSubtitleWrapperPreset centerEnd500Shape600CenterStart500Default500;

    static {
        BadgeAddonWrapperPresets badgeAddonWrapperPresets = BadgeAddonWrapperPresets.INSTANCE;
        BadgeAddonWrapperPreset badge500CenterEnd500 = badgeAddonWrapperPresets.getBadge500CenterEnd500();
        IconTitleSubtitleWrapperPresets iconTitleSubtitleWrapperPresets = IconTitleSubtitleWrapperPresets.INSTANCE;
        centerEnd500NoShape500TopStart500Default500 = new BadgeIconTitleSubtitleWrapperPreset(badge500CenterEnd500, iconTitleSubtitleWrapperPresets.getNoShape500TopStart500Default500());
        centerEnd400NoShape400TopStart400Default400 = new BadgeIconTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge400CenterEnd400(), iconTitleSubtitleWrapperPresets.getNoShape400TopStart400Default400());
        centerEnd500Shape400TopStart500Default500 = new BadgeIconTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge500CenterEnd500(), iconTitleSubtitleWrapperPresets.getShape400TopStart500Default500());
        centerEnd500Shape500TopStart500Default500 = new BadgeIconTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge500CenterEnd500(), iconTitleSubtitleWrapperPresets.getShape500TopStart500Default500());
        centerEnd500Shape600CenterStart500Default500 = new BadgeIconTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge500CenterEnd500(), iconTitleSubtitleWrapperPresets.getShape600CenterStart500Default500());
        centerEnd500NoShape500TopStart500Control500 = new BadgeIconTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge500CenterEnd500(), iconTitleSubtitleWrapperPresets.getNoShape500TopStart500Control500());
        centerEnd400NoShape400TopStart400Control400 = new BadgeIconTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge400CenterEnd400(), iconTitleSubtitleWrapperPresets.getNoShape400TopStart400Control400());
        centerEnd500Shape400TopStart500Control500 = new BadgeIconTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge500CenterEnd500(), iconTitleSubtitleWrapperPresets.getShape400TopStart500Control500());
        centerEnd500Shape500TopStart500Control500 = new BadgeIconTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge500CenterEnd500(), iconTitleSubtitleWrapperPresets.getShape500TopStart500Control500());
        centerEnd500Shape600CenterStart500Control500 = new BadgeIconTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge500CenterEnd500(), iconTitleSubtitleWrapperPresets.getShape600CenterStart500Control500());
    }

    private BadgeIconTitleSubtitleWrapperPresets() {
    }

    @NotNull
    public final BadgeIconTitleSubtitleWrapperPreset getCenterEnd400NoShape400TopStart400Control400() {
        return centerEnd400NoShape400TopStart400Control400;
    }

    @NotNull
    public final BadgeIconTitleSubtitleWrapperPreset getCenterEnd400NoShape400TopStart400Default400() {
        return centerEnd400NoShape400TopStart400Default400;
    }

    @NotNull
    public final BadgeIconTitleSubtitleWrapperPreset getCenterEnd500NoShape500TopStart500Control500() {
        return centerEnd500NoShape500TopStart500Control500;
    }

    @NotNull
    public final BadgeIconTitleSubtitleWrapperPreset getCenterEnd500NoShape500TopStart500Default500() {
        return centerEnd500NoShape500TopStart500Default500;
    }

    @NotNull
    public final BadgeIconTitleSubtitleWrapperPreset getCenterEnd500Shape400TopStart500Control500() {
        return centerEnd500Shape400TopStart500Control500;
    }

    @NotNull
    public final BadgeIconTitleSubtitleWrapperPreset getCenterEnd500Shape400TopStart500Default500() {
        return centerEnd500Shape400TopStart500Default500;
    }

    @NotNull
    public final BadgeIconTitleSubtitleWrapperPreset getCenterEnd500Shape500TopStart500Control500() {
        return centerEnd500Shape500TopStart500Control500;
    }

    @NotNull
    public final BadgeIconTitleSubtitleWrapperPreset getCenterEnd500Shape500TopStart500Default500() {
        return centerEnd500Shape500TopStart500Default500;
    }

    @NotNull
    public final BadgeIconTitleSubtitleWrapperPreset getCenterEnd500Shape600CenterStart500Control500() {
        return centerEnd500Shape600CenterStart500Control500;
    }

    @NotNull
    public final BadgeIconTitleSubtitleWrapperPreset getCenterEnd500Shape600CenterStart500Default500() {
        return centerEnd500Shape600CenterStart500Default500;
    }
}
