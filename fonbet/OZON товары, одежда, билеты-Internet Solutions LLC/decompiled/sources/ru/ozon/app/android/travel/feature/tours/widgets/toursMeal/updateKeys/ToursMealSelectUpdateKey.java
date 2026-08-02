package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.updateKeys;

import A00.a;
import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/updateKeys/ToursMealSelectUpdateKey;", "LA00/a$J$a;", "", "selectLink", "selectButtonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectLink", "getSelectButtonTitle", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ToursMealSelectUpdateKey implements a.J.InterfaceC0007a {
    private final String selectButtonTitle;
    private final String selectLink;

    public ToursMealSelectUpdateKey(String str, String str2) {
        this.selectLink = str;
        this.selectButtonTitle = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursMealSelectUpdateKey)) {
            return false;
        }
        ToursMealSelectUpdateKey toursMealSelectUpdateKey = (ToursMealSelectUpdateKey) other;
        return Intrinsics.d(this.selectLink, toursMealSelectUpdateKey.selectLink) && Intrinsics.d(this.selectButtonTitle, toursMealSelectUpdateKey.selectButtonTitle);
    }

    public final String getSelectButtonTitle() {
        return this.selectButtonTitle;
    }

    public final String getSelectLink() {
        return this.selectLink;
    }

    public int hashCode() {
        String str = this.selectLink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.selectButtonTitle;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return e.a("ToursMealSelectUpdateKey(selectLink=", this.selectLink, ", selectButtonTitle=", this.selectButtonTitle, ")");
    }
}
