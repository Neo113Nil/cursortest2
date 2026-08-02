package ru.ozon.uni.android.cell.indicator.indicatorBadgeTitleSubtitleCell.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.badge.badgeTitleSubtitleCell.data.BadgeTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.indicator.data.IndicatorAddonWrapperPreset;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/cell/indicator/indicatorBadgeTitleSubtitleCell/data/IndicatorBadgeTitleSubtitleWrapperPreset;", "", "Lru/ozon/uni/android/cell/indicator/data/IndicatorAddonWrapperPreset;", "indicatorAddonWrapperPreset", "Lru/ozon/uni/android/cell/badge/badgeTitleSubtitleCell/data/BadgeTitleSubtitleWrapperPreset;", "badgeTitleSubtitleWrapperPreset", "<init>", "(Lru/ozon/uni/android/cell/indicator/data/IndicatorAddonWrapperPreset;Lru/ozon/uni/android/cell/badge/badgeTitleSubtitleCell/data/BadgeTitleSubtitleWrapperPreset;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/cell/indicator/data/IndicatorAddonWrapperPreset;", "getIndicatorAddonWrapperPreset", "()Lru/ozon/uni/android/cell/indicator/data/IndicatorAddonWrapperPreset;", "Lru/ozon/uni/android/cell/badge/badgeTitleSubtitleCell/data/BadgeTitleSubtitleWrapperPreset;", "getBadgeTitleSubtitleWrapperPreset", "()Lru/ozon/uni/android/cell/badge/badgeTitleSubtitleCell/data/BadgeTitleSubtitleWrapperPreset;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IndicatorBadgeTitleSubtitleWrapperPreset {

    @NotNull
    private final BadgeTitleSubtitleWrapperPreset badgeTitleSubtitleWrapperPreset;

    @NotNull
    private final IndicatorAddonWrapperPreset indicatorAddonWrapperPreset;

    public IndicatorBadgeTitleSubtitleWrapperPreset(@NotNull IndicatorAddonWrapperPreset indicatorAddonWrapperPreset, @NotNull BadgeTitleSubtitleWrapperPreset badgeTitleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(indicatorAddonWrapperPreset, "indicatorAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(badgeTitleSubtitleWrapperPreset, "badgeTitleSubtitleWrapperPreset");
        this.indicatorAddonWrapperPreset = indicatorAddonWrapperPreset;
        this.badgeTitleSubtitleWrapperPreset = badgeTitleSubtitleWrapperPreset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorBadgeTitleSubtitleWrapperPreset)) {
            return false;
        }
        IndicatorBadgeTitleSubtitleWrapperPreset indicatorBadgeTitleSubtitleWrapperPreset = (IndicatorBadgeTitleSubtitleWrapperPreset) other;
        return Intrinsics.d(this.indicatorAddonWrapperPreset, indicatorBadgeTitleSubtitleWrapperPreset.indicatorAddonWrapperPreset) && Intrinsics.d(this.badgeTitleSubtitleWrapperPreset, indicatorBadgeTitleSubtitleWrapperPreset.badgeTitleSubtitleWrapperPreset);
    }

    @NotNull
    public final BadgeTitleSubtitleWrapperPreset getBadgeTitleSubtitleWrapperPreset() {
        return this.badgeTitleSubtitleWrapperPreset;
    }

    @NotNull
    public final IndicatorAddonWrapperPreset getIndicatorAddonWrapperPreset() {
        return this.indicatorAddonWrapperPreset;
    }

    public int hashCode() {
        return this.badgeTitleSubtitleWrapperPreset.hashCode() + (this.indicatorAddonWrapperPreset.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "IndicatorBadgeTitleSubtitleWrapperPreset(indicatorAddonWrapperPreset=" + this.indicatorAddonWrapperPreset + ", badgeTitleSubtitleWrapperPreset=" + this.badgeTitleSubtitleWrapperPreset + ")";
    }
}
