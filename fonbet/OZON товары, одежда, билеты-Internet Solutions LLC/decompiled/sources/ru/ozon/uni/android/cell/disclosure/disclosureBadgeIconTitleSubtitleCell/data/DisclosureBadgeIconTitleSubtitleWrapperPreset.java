package ru.ozon.uni.android.cell.disclosure.disclosureBadgeIconTitleSubtitleCell.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.badge.badgeIconTitleSubtitleCell.data.BadgeIconTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.disclosure.data.DisclosureAddonWrapperPreset;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/cell/disclosure/disclosureBadgeIconTitleSubtitleCell/data/DisclosureBadgeIconTitleSubtitleWrapperPreset;", "", "Lru/ozon/uni/android/cell/disclosure/data/DisclosureAddonWrapperPreset;", "disclosureAddonWrapperPreset", "Lru/ozon/uni/android/cell/badge/badgeIconTitleSubtitleCell/data/BadgeIconTitleSubtitleWrapperPreset;", "badgeIconTitleSubtitleWrapperPreset", "<init>", "(Lru/ozon/uni/android/cell/disclosure/data/DisclosureAddonWrapperPreset;Lru/ozon/uni/android/cell/badge/badgeIconTitleSubtitleCell/data/BadgeIconTitleSubtitleWrapperPreset;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/cell/disclosure/data/DisclosureAddonWrapperPreset;", "getDisclosureAddonWrapperPreset", "()Lru/ozon/uni/android/cell/disclosure/data/DisclosureAddonWrapperPreset;", "Lru/ozon/uni/android/cell/badge/badgeIconTitleSubtitleCell/data/BadgeIconTitleSubtitleWrapperPreset;", "getBadgeIconTitleSubtitleWrapperPreset", "()Lru/ozon/uni/android/cell/badge/badgeIconTitleSubtitleCell/data/BadgeIconTitleSubtitleWrapperPreset;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DisclosureBadgeIconTitleSubtitleWrapperPreset {

    @NotNull
    private final BadgeIconTitleSubtitleWrapperPreset badgeIconTitleSubtitleWrapperPreset;

    @NotNull
    private final DisclosureAddonWrapperPreset disclosureAddonWrapperPreset;

    public DisclosureBadgeIconTitleSubtitleWrapperPreset(@NotNull DisclosureAddonWrapperPreset disclosureAddonWrapperPreset, @NotNull BadgeIconTitleSubtitleWrapperPreset badgeIconTitleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(disclosureAddonWrapperPreset, "disclosureAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(badgeIconTitleSubtitleWrapperPreset, "badgeIconTitleSubtitleWrapperPreset");
        this.disclosureAddonWrapperPreset = disclosureAddonWrapperPreset;
        this.badgeIconTitleSubtitleWrapperPreset = badgeIconTitleSubtitleWrapperPreset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureBadgeIconTitleSubtitleWrapperPreset)) {
            return false;
        }
        DisclosureBadgeIconTitleSubtitleWrapperPreset disclosureBadgeIconTitleSubtitleWrapperPreset = (DisclosureBadgeIconTitleSubtitleWrapperPreset) other;
        return Intrinsics.d(this.disclosureAddonWrapperPreset, disclosureBadgeIconTitleSubtitleWrapperPreset.disclosureAddonWrapperPreset) && Intrinsics.d(this.badgeIconTitleSubtitleWrapperPreset, disclosureBadgeIconTitleSubtitleWrapperPreset.badgeIconTitleSubtitleWrapperPreset);
    }

    @NotNull
    public final BadgeIconTitleSubtitleWrapperPreset getBadgeIconTitleSubtitleWrapperPreset() {
        return this.badgeIconTitleSubtitleWrapperPreset;
    }

    @NotNull
    public final DisclosureAddonWrapperPreset getDisclosureAddonWrapperPreset() {
        return this.disclosureAddonWrapperPreset;
    }

    public int hashCode() {
        return this.badgeIconTitleSubtitleWrapperPreset.hashCode() + (this.disclosureAddonWrapperPreset.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DisclosureBadgeIconTitleSubtitleWrapperPreset(disclosureAddonWrapperPreset=" + this.disclosureAddonWrapperPreset + ", badgeIconTitleSubtitleWrapperPreset=" + this.badgeIconTitleSubtitleWrapperPreset + ")";
    }
}
