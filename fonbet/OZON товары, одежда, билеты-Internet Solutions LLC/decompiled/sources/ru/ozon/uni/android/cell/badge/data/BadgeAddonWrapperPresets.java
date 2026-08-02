package ru.ozon.uni.android.cell.badge.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonWrapperSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/cell/badge/data/BadgeAddonWrapperPresets;", "", "<init>", "()V", "badge500CenterEnd500", "Lru/ozon/uni/android/cell/badge/data/BadgeAddonWrapperPreset;", "getBadge500CenterEnd500", "()Lru/ozon/uni/android/cell/badge/data/BadgeAddonWrapperPreset;", "badge500CenterStart500", "getBadge500CenterStart500", "badge400CenterEnd400", "getBadge400CenterEnd400", "badge400CenterStart400", "getBadge400CenterStart400", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BadgeAddonWrapperPresets {

    @NotNull
    public static final BadgeAddonWrapperPresets INSTANCE = new BadgeAddonWrapperPresets();

    @NotNull
    private static final BadgeAddonWrapperPreset badge400CenterEnd400;

    @NotNull
    private static final BadgeAddonWrapperPreset badge400CenterStart400;

    @NotNull
    private static final BadgeAddonWrapperPreset badge500CenterEnd500;

    @NotNull
    private static final BadgeAddonWrapperPreset badge500CenterStart500;

    static {
        BadgeDTO.BadgeSize badgeSize = BadgeDTO.BadgeSize.SIZE_500;
        MainAddonWrapperSettings mainAddonWrapperSettings = MainAddonWrapperSettings.INSTANCE;
        badge500CenterEnd500 = new BadgeAddonWrapperPreset(badgeSize, mainAddonWrapperSettings.getCenterEnd500());
        badge500CenterStart500 = new BadgeAddonWrapperPreset(badgeSize, mainAddonWrapperSettings.getCenterStart500());
        BadgeDTO.BadgeSize badgeSize2 = BadgeDTO.BadgeSize.SIZE_400;
        badge400CenterEnd400 = new BadgeAddonWrapperPreset(badgeSize2, mainAddonWrapperSettings.getCenterEnd400());
        badge400CenterStart400 = new BadgeAddonWrapperPreset(badgeSize2, mainAddonWrapperSettings.getCenterStart400());
    }

    private BadgeAddonWrapperPresets() {
    }

    @NotNull
    public final BadgeAddonWrapperPreset getBadge400CenterEnd400() {
        return badge400CenterEnd400;
    }

    @NotNull
    public final BadgeAddonWrapperPreset getBadge400CenterStart400() {
        return badge400CenterStart400;
    }

    @NotNull
    public final BadgeAddonWrapperPreset getBadge500CenterEnd500() {
        return badge500CenterEnd500;
    }

    @NotNull
    public final BadgeAddonWrapperPreset getBadge500CenterStart500() {
        return badge500CenterStart500;
    }
}
