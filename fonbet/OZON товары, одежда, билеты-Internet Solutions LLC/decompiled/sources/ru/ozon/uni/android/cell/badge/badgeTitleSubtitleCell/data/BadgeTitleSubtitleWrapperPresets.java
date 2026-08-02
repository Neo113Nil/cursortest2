package ru.ozon.uni.android.cell.badge.badgeTitleSubtitleCell.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.badge.data.BadgeAddonWrapperPreset;
import ru.ozon.uni.android.cell.badge.data.BadgeAddonWrapperPresets;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/cell/badge/badgeTitleSubtitleCell/data/BadgeTitleSubtitleWrapperPresets;", "", "<init>", "()V", "centerEnd500Default500", "Lru/ozon/uni/android/cell/badge/badgeTitleSubtitleCell/data/BadgeTitleSubtitleWrapperPreset;", "getCenterEnd500Default500", "()Lru/ozon/uni/android/cell/badge/badgeTitleSubtitleCell/data/BadgeTitleSubtitleWrapperPreset;", "centerStart500Default500", "getCenterStart500Default500", "centerEnd500Control500", "getCenterEnd500Control500", "centerStart500Control500", "getCenterStart500Control500", "centerEnd400Default400", "getCenterEnd400Default400", "centerStart400Default400", "getCenterStart400Default400", "centerEnd400Control400", "getCenterEnd400Control400", "centerStart400Control400", "getCenterStart400Control400", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeTitleSubtitleWrapperPresets {

    @NotNull
    public static final BadgeTitleSubtitleWrapperPresets INSTANCE = new BadgeTitleSubtitleWrapperPresets();

    @NotNull
    private static final BadgeTitleSubtitleWrapperPreset centerEnd400Control400;

    @NotNull
    private static final BadgeTitleSubtitleWrapperPreset centerEnd400Default400;

    @NotNull
    private static final BadgeTitleSubtitleWrapperPreset centerEnd500Control500;

    @NotNull
    private static final BadgeTitleSubtitleWrapperPreset centerEnd500Default500;

    @NotNull
    private static final BadgeTitleSubtitleWrapperPreset centerStart400Control400;

    @NotNull
    private static final BadgeTitleSubtitleWrapperPreset centerStart400Default400;

    @NotNull
    private static final BadgeTitleSubtitleWrapperPreset centerStart500Control500;

    @NotNull
    private static final BadgeTitleSubtitleWrapperPreset centerStart500Default500;

    static {
        BadgeAddonWrapperPresets badgeAddonWrapperPresets = BadgeAddonWrapperPresets.INSTANCE;
        BadgeAddonWrapperPreset badge500CenterEnd500 = badgeAddonWrapperPresets.getBadge500CenterEnd500();
        TitleSubtitleWrapperPresets titleSubtitleWrapperPresets = TitleSubtitleWrapperPresets.INSTANCE;
        centerEnd500Default500 = new BadgeTitleSubtitleWrapperPreset(badge500CenterEnd500, titleSubtitleWrapperPresets.getDefault500());
        centerStart500Default500 = new BadgeTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge500CenterStart500(), titleSubtitleWrapperPresets.getDefault500());
        centerEnd500Control500 = new BadgeTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge500CenterEnd500(), titleSubtitleWrapperPresets.getControl500());
        centerStart500Control500 = new BadgeTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge500CenterStart500(), titleSubtitleWrapperPresets.getControl500());
        centerEnd400Default400 = new BadgeTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge400CenterEnd400(), titleSubtitleWrapperPresets.getDefault400());
        centerStart400Default400 = new BadgeTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge400CenterStart400(), titleSubtitleWrapperPresets.getDefault400());
        centerEnd400Control400 = new BadgeTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge400CenterEnd400(), titleSubtitleWrapperPresets.getControl400());
        centerStart400Control400 = new BadgeTitleSubtitleWrapperPreset(badgeAddonWrapperPresets.getBadge400CenterStart400(), titleSubtitleWrapperPresets.getControl400());
    }

    private BadgeTitleSubtitleWrapperPresets() {
    }

    @NotNull
    public final BadgeTitleSubtitleWrapperPreset getCenterEnd400Control400() {
        return centerEnd400Control400;
    }

    @NotNull
    public final BadgeTitleSubtitleWrapperPreset getCenterEnd400Default400() {
        return centerEnd400Default400;
    }

    @NotNull
    public final BadgeTitleSubtitleWrapperPreset getCenterEnd500Control500() {
        return centerEnd500Control500;
    }

    @NotNull
    public final BadgeTitleSubtitleWrapperPreset getCenterEnd500Default500() {
        return centerEnd500Default500;
    }

    @NotNull
    public final BadgeTitleSubtitleWrapperPreset getCenterStart400Control400() {
        return centerStart400Control400;
    }

    @NotNull
    public final BadgeTitleSubtitleWrapperPreset getCenterStart400Default400() {
        return centerStart400Default400;
    }

    @NotNull
    public final BadgeTitleSubtitleWrapperPreset getCenterStart500Control500() {
        return centerStart500Control500;
    }

    @NotNull
    public final BadgeTitleSubtitleWrapperPreset getCenterStart500Default500() {
        return centerStart500Default500;
    }
}
