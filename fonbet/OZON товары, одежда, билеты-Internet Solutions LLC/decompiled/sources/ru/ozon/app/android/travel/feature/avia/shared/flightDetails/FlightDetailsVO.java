package ru.ozon.app.android.travel.feature.avia.shared.flightDetails;

import Kk.C3532b;
import Pk0.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsVO;", "", "", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem;", "list", "", "areTopCornersRounded", "areBottomCornersRounded", "<init>", "(Ljava/util/List;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getList", "()Ljava/util/List;", "Z", "getAreTopCornersRounded", "()Z", "getAreBottomCornersRounded", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FlightDetailsVO {
    private final boolean areBottomCornersRounded;
    private final boolean areTopCornersRounded;

    @NotNull
    private final List<AviaDetailsItem> list;

    /* JADX WARN: Multi-variable type inference failed */
    public FlightDetailsVO(@NotNull List<? extends AviaDetailsItem> list, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
        this.areTopCornersRounded = z11;
        this.areBottomCornersRounded = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightDetailsVO)) {
            return false;
        }
        FlightDetailsVO flightDetailsVO = (FlightDetailsVO) other;
        return Intrinsics.d(this.list, flightDetailsVO.list) && this.areTopCornersRounded == flightDetailsVO.areTopCornersRounded && this.areBottomCornersRounded == flightDetailsVO.areBottomCornersRounded;
    }

    public final boolean getAreBottomCornersRounded() {
        return this.areBottomCornersRounded;
    }

    public final boolean getAreTopCornersRounded() {
        return this.areTopCornersRounded;
    }

    @NotNull
    public final List<AviaDetailsItem> getList() {
        return this.list;
    }

    public int hashCode() {
        return Boolean.hashCode(this.areBottomCornersRounded) + C3532b.a(this.list.hashCode() * 31, 31, this.areTopCornersRounded);
    }

    @NotNull
    public String toString() {
        List<AviaDetailsItem> list = this.list;
        boolean z11 = this.areTopCornersRounded;
        boolean z12 = this.areBottomCornersRounded;
        StringBuilder sb2 = new StringBuilder("FlightDetailsVO(list=");
        sb2.append(list);
        sb2.append(", areTopCornersRounded=");
        sb2.append(z11);
        sb2.append(", areBottomCornersRounded=");
        return a.a(")", sb2, z12);
    }
}
