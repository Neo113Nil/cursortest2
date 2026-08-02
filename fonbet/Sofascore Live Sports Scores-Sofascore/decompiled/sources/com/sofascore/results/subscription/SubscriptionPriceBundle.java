package com.sofascore.results.subscription;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.bf3;
import defpackage.cu;
import defpackage.dmi;
import defpackage.dyh;
import defpackage.iyf;
import defpackage.w1l;
import defpackage.wt3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/subscription/SubscriptionPriceBundle;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SubscriptionPriceBundle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SubscriptionPriceBundle> CREATOR = new dyh(3);
    public final String a;
    public final double b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final String f;
    public final String g;
    public final String h;
    public final cu i;
    public final iyf j;
    public final iyf k;
    public final Double l;
    public final String m;

    public /* synthetic */ SubscriptionPriceBundle(String str, double d, Double d2, Double d3, Double d4, String str2, String str3, String str4, cu cuVar, iyf iyfVar, iyf iyfVar2, Double d5, String str5, int i) {
        this(str, d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : d3, (i & 16) != 0 ? null : d4, str2, str3, (i & 128) != 0 ? "" : str4, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : cuVar, (i & 512) != 0 ? null : iyfVar, (i & 1024) != 0 ? null : iyfVar2, (i & a.o) != 0 ? null : d5, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionPriceBundle)) {
            return false;
        }
        SubscriptionPriceBundle subscriptionPriceBundle = (SubscriptionPriceBundle) obj;
        return Intrinsics.c(this.a, subscriptionPriceBundle.a) && Double.compare(this.b, subscriptionPriceBundle.b) == 0 && Intrinsics.c(this.c, subscriptionPriceBundle.c) && Intrinsics.c(this.d, subscriptionPriceBundle.d) && Intrinsics.c(this.e, subscriptionPriceBundle.e) && Intrinsics.c(this.f, subscriptionPriceBundle.f) && Intrinsics.c(this.g, subscriptionPriceBundle.g) && Intrinsics.c(this.h, subscriptionPriceBundle.h) && this.i == subscriptionPriceBundle.i && this.j == subscriptionPriceBundle.j && this.k == subscriptionPriceBundle.k && Intrinsics.c(this.l, subscriptionPriceBundle.l) && Intrinsics.c(this.m, subscriptionPriceBundle.m);
    }

    public final int hashCode() {
        int b = dmi.b(this.a.hashCode() * 31, 31, this.b);
        Double d = this.c;
        int hashCode = (b + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.e;
        int c = dmi.c(dmi.c(dmi.c((hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        cu cuVar = this.i;
        int hashCode3 = (c + (cuVar == null ? 0 : cuVar.hashCode())) * 31;
        iyf iyfVar = this.j;
        int hashCode4 = (hashCode3 + (iyfVar == null ? 0 : iyfVar.hashCode())) * 31;
        iyf iyfVar2 = this.k;
        int hashCode5 = (hashCode4 + (iyfVar2 == null ? 0 : iyfVar2.hashCode())) * 31;
        Double d4 = this.l;
        int hashCode6 = (hashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str = this.m;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionPriceBundle(productId=");
        sb.append(this.a);
        sb.append(", monthlyValue=");
        sb.append(this.b);
        sb.append(", fullMonthly=");
        sb.append(this.c);
        sb.append(", yearlyValue=");
        sb.append(this.d);
        sb.append(", fullYearly=");
        sb.append(this.e);
        sb.append(", currencyCode=");
        sb.append(this.f);
        bf3.v(sb, ", monthlyOfferToken=", this.g, ", yearlyOfferToken=", this.h);
        sb.append(", analystOffer=");
        sb.append(this.i);
        sb.append(", adsMonthlyOffer=");
        sb.append(this.j);
        sb.append(", adsYearlyOffer=");
        sb.append(this.k);
        sb.append(", featuredOfferValue=");
        sb.append(this.l);
        return wt3.m(", featuredOfferToken=", this.m, sb, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeDouble(this.b);
        Double d = this.c;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.d;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.e;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        cu cuVar = this.i;
        if (cuVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cuVar.name());
        }
        iyf iyfVar = this.j;
        if (iyfVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iyfVar.name());
        }
        iyf iyfVar2 = this.k;
        if (iyfVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iyfVar2.name());
        }
        Double d4 = this.l;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        parcel.writeString(this.m);
    }

    public SubscriptionPriceBundle(String str, double d, Double d2, Double d3, Double d4, String str2, String str3, String str4, cu cuVar, iyf iyfVar, iyf iyfVar2, Double d5, String str5) {
        w1l.y(str, str2, str3, str4);
        this.a = str;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = cuVar;
        this.j = iyfVar;
        this.k = iyfVar2;
        this.l = d5;
        this.m = str5;
    }
}
