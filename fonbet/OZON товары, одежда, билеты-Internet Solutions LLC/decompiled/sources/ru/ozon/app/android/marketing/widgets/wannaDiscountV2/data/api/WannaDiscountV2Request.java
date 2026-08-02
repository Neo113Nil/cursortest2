package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.api;

import Ds.C2880a;
import G.g;
import Kk.C3532b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJR\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\u000f¨\u0006'"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Request;", "", "sku", "", "userPrice", "", "pressedDiscount", "", "doesAddSellerNotification", "", "userQuantityMin", "userQuantityMax", "<init>", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)V", "getSku", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPressedDiscount", "()Ljava/lang/String;", "getDoesAddSellerNotification", "()Z", "getUserQuantityMin", "getUserQuantityMax", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Request;", "equals", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WannaDiscountV2Request {
    public static final int $stable = 0;
    private final boolean doesAddSellerNotification;

    @NotNull
    private final String pressedDiscount;
    private final Long sku;
    private final Double userPrice;
    private final Long userQuantityMax;
    private final Long userQuantityMin;

    public WannaDiscountV2Request(Long l11, Double d11, @NotNull String pressedDiscount, boolean z11, Long l12, Long l13) {
        Intrinsics.checkNotNullParameter(pressedDiscount, "pressedDiscount");
        this.sku = l11;
        this.userPrice = d11;
        this.pressedDiscount = pressedDiscount;
        this.doesAddSellerNotification = z11;
        this.userQuantityMin = l12;
        this.userQuantityMax = l13;
    }

    public static /* synthetic */ WannaDiscountV2Request copy$default(WannaDiscountV2Request wannaDiscountV2Request, Long l11, Double d11, String str, boolean z11, Long l12, Long l13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = wannaDiscountV2Request.sku;
        }
        if ((i11 & 2) != 0) {
            d11 = wannaDiscountV2Request.userPrice;
        }
        if ((i11 & 4) != 0) {
            str = wannaDiscountV2Request.pressedDiscount;
        }
        if ((i11 & 8) != 0) {
            z11 = wannaDiscountV2Request.doesAddSellerNotification;
        }
        if ((i11 & 16) != 0) {
            l12 = wannaDiscountV2Request.userQuantityMin;
        }
        if ((i11 & 32) != 0) {
            l13 = wannaDiscountV2Request.userQuantityMax;
        }
        Long l14 = l12;
        Long l15 = l13;
        return wannaDiscountV2Request.copy(l11, d11, str, z11, l14, l15);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getSku() {
        return this.sku;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getUserPrice() {
        return this.userPrice;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPressedDiscount() {
        return this.pressedDiscount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDoesAddSellerNotification() {
        return this.doesAddSellerNotification;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getUserQuantityMin() {
        return this.userQuantityMin;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getUserQuantityMax() {
        return this.userQuantityMax;
    }

    @NotNull
    public final WannaDiscountV2Request copy(Long sku, Double userPrice, @NotNull String pressedDiscount, boolean doesAddSellerNotification, Long userQuantityMin, Long userQuantityMax) {
        Intrinsics.checkNotNullParameter(pressedDiscount, "pressedDiscount");
        return new WannaDiscountV2Request(sku, userPrice, pressedDiscount, doesAddSellerNotification, userQuantityMin, userQuantityMax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WannaDiscountV2Request)) {
            return false;
        }
        WannaDiscountV2Request wannaDiscountV2Request = (WannaDiscountV2Request) other;
        return Intrinsics.d(this.sku, wannaDiscountV2Request.sku) && Intrinsics.d(this.userPrice, wannaDiscountV2Request.userPrice) && Intrinsics.d(this.pressedDiscount, wannaDiscountV2Request.pressedDiscount) && this.doesAddSellerNotification == wannaDiscountV2Request.doesAddSellerNotification && Intrinsics.d(this.userQuantityMin, wannaDiscountV2Request.userQuantityMin) && Intrinsics.d(this.userQuantityMax, wannaDiscountV2Request.userQuantityMax);
    }

    public final boolean getDoesAddSellerNotification() {
        return this.doesAddSellerNotification;
    }

    @NotNull
    public final String getPressedDiscount() {
        return this.pressedDiscount;
    }

    public final Long getSku() {
        return this.sku;
    }

    public final Double getUserPrice() {
        return this.userPrice;
    }

    public final Long getUserQuantityMax() {
        return this.userQuantityMax;
    }

    public final Long getUserQuantityMin() {
        return this.userQuantityMin;
    }

    public int hashCode() {
        Long l11 = this.sku;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Double d11 = this.userPrice;
        int a11 = C3532b.a(g.a((hashCode + (d11 == null ? 0 : d11.hashCode())) * 31, 31, this.pressedDiscount), 31, this.doesAddSellerNotification);
        Long l12 = this.userQuantityMin;
        int hashCode2 = (a11 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.userQuantityMax;
        return hashCode2 + (l13 != null ? l13.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Long l11 = this.sku;
        Double d11 = this.userPrice;
        String str = this.pressedDiscount;
        boolean z11 = this.doesAddSellerNotification;
        Long l12 = this.userQuantityMin;
        Long l13 = this.userQuantityMax;
        StringBuilder sb2 = new StringBuilder("WannaDiscountV2Request(sku=");
        sb2.append(l11);
        sb2.append(", userPrice=");
        sb2.append(d11);
        sb2.append(", pressedDiscount=");
        C2880a.c(str, ", doesAddSellerNotification=", ", userQuantityMin=", sb2, z11);
        sb2.append(l12);
        sb2.append(", userQuantityMax=");
        sb2.append(l13);
        sb2.append(")");
        return sb2.toString();
    }
}
