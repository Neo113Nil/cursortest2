package ru.ozon.uni.android.cell.badge.badgeIconTitleSubtitleCell.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.badge.data.BadgeAddonWrapperPreset;
import ru.ozon.uni.android.cell.icon.data.IconTitleSubtitleWrapperPreset;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/cell/badge/badgeIconTitleSubtitleCell/data/BadgeIconTitleSubtitleWrapperPreset;", "", "Lru/ozon/uni/android/cell/badge/data/BadgeAddonWrapperPreset;", "badgeAddonWrapperPreset", "Lru/ozon/uni/android/cell/icon/data/IconTitleSubtitleWrapperPreset;", "iconTitleSubtitleWrapperPreset", "<init>", "(Lru/ozon/uni/android/cell/badge/data/BadgeAddonWrapperPreset;Lru/ozon/uni/android/cell/icon/data/IconTitleSubtitleWrapperPreset;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/cell/badge/data/BadgeAddonWrapperPreset;", "getBadgeAddonWrapperPreset", "()Lru/ozon/uni/android/cell/badge/data/BadgeAddonWrapperPreset;", "Lru/ozon/uni/android/cell/icon/data/IconTitleSubtitleWrapperPreset;", "getIconTitleSubtitleWrapperPreset", "()Lru/ozon/uni/android/cell/icon/data/IconTitleSubtitleWrapperPreset;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BadgeIconTitleSubtitleWrapperPreset {

    @NotNull
    private final BadgeAddonWrapperPreset badgeAddonWrapperPreset;

    @NotNull
    private final IconTitleSubtitleWrapperPreset iconTitleSubtitleWrapperPreset;

    public BadgeIconTitleSubtitleWrapperPreset(@NotNull BadgeAddonWrapperPreset badgeAddonWrapperPreset, @NotNull IconTitleSubtitleWrapperPreset iconTitleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(badgeAddonWrapperPreset, "badgeAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(iconTitleSubtitleWrapperPreset, "iconTitleSubtitleWrapperPreset");
        this.badgeAddonWrapperPreset = badgeAddonWrapperPreset;
        this.iconTitleSubtitleWrapperPreset = iconTitleSubtitleWrapperPreset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeIconTitleSubtitleWrapperPreset)) {
            return false;
        }
        BadgeIconTitleSubtitleWrapperPreset badgeIconTitleSubtitleWrapperPreset = (BadgeIconTitleSubtitleWrapperPreset) other;
        return Intrinsics.d(this.badgeAddonWrapperPreset, badgeIconTitleSubtitleWrapperPreset.badgeAddonWrapperPreset) && Intrinsics.d(this.iconTitleSubtitleWrapperPreset, badgeIconTitleSubtitleWrapperPreset.iconTitleSubtitleWrapperPreset);
    }

    @NotNull
    public final BadgeAddonWrapperPreset getBadgeAddonWrapperPreset() {
        return this.badgeAddonWrapperPreset;
    }

    @NotNull
    public final IconTitleSubtitleWrapperPreset getIconTitleSubtitleWrapperPreset() {
        return this.iconTitleSubtitleWrapperPreset;
    }

    public int hashCode() {
        return this.iconTitleSubtitleWrapperPreset.hashCode() + (this.badgeAddonWrapperPreset.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BadgeIconTitleSubtitleWrapperPreset(badgeAddonWrapperPreset=" + this.badgeAddonWrapperPreset + ", iconTitleSubtitleWrapperPreset=" + this.iconTitleSubtitleWrapperPreset + ")";
    }
}
