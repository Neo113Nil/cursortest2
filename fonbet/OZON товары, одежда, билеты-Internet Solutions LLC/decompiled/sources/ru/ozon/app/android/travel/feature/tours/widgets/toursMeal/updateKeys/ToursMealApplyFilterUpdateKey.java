package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.updateKeys;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/updateKeys/ToursMealApplyFilterUpdateKey;", "LA00/a$J$a;", "", "filterKey", "", "composerHeight", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFilterKey", "Ljava/lang/Integer;", "getComposerHeight", "()Ljava/lang/Integer;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ToursMealApplyFilterUpdateKey implements a.J.InterfaceC0007a {
    private final Integer composerHeight;
    private final String filterKey;

    public ToursMealApplyFilterUpdateKey(String str, Integer num) {
        this.filterKey = str;
        this.composerHeight = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursMealApplyFilterUpdateKey)) {
            return false;
        }
        ToursMealApplyFilterUpdateKey toursMealApplyFilterUpdateKey = (ToursMealApplyFilterUpdateKey) other;
        return Intrinsics.d(this.filterKey, toursMealApplyFilterUpdateKey.filterKey) && Intrinsics.d(this.composerHeight, toursMealApplyFilterUpdateKey.composerHeight);
    }

    public final Integer getComposerHeight() {
        return this.composerHeight;
    }

    public final String getFilterKey() {
        return this.filterKey;
    }

    public int hashCode() {
        String str = this.filterKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.composerHeight;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ToursMealApplyFilterUpdateKey(filterKey=" + this.filterKey + ", composerHeight=" + this.composerHeight + ")";
    }
}
