package com.vk.dto.market.catalog;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Currency;
import com.vk.dto.market.catalog.CatalogMarketCategoryContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.fw3;

/* compiled from: CatalogMarketFilter.kt */
/* loaded from: classes18.dex */
public final class CatalogMarketFilter extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogMarketFilter> CREATOR = new b();
    public final CatalogMarketCategoryContext.Context b;
    public final Long c;
    public final Long d;
    public final Currency e;
    public final String f;
    public final List<CatalogMarketCategoryContext> g;
    public final Integer h;
    public final Integer i;
    public final List<CatalogMarketDistanceOption> j;
    public final String k;
    public final List<CatalogMarketStatusOption> l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;
    public final Boolean p;
    public final Boolean q;
    public final CatalogMarketDeliveryTypeDto r;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogMarketFilter> {
        @Override // xsna.aay
        public final CatalogMarketFilter a(JSONObject jSONObject) {
            return new CatalogMarketFilter(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogMarketFilter> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogMarketFilter a(Serializer serializer) {
            return new CatalogMarketFilter(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogMarketFilter[i];
        }
    }

    static {
        new a();
    }

    public CatalogMarketFilter(CatalogMarketCategoryContext.Context context, Long l, Long l2, Currency currency, String str, List<CatalogMarketCategoryContext> list, Integer num, Integer num2, List<CatalogMarketDistanceOption> list2, String str2, List<CatalogMarketStatusOption> list3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto) {
        this.b = context;
        this.c = l;
        this.d = l2;
        this.e = currency;
        this.f = str;
        this.g = list;
        this.h = num;
        this.i = num2;
        this.j = list2;
        this.k = str2;
        this.l = list3;
        this.m = bool;
        this.n = bool2;
        this.o = bool3;
        this.p = bool4;
        this.q = bool5;
        this.r = catalogMarketDeliveryTypeDto;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.h());
        serializer.b0(this.c);
        serializer.b0(this.d);
        serializer.i0(this.e);
        serializer.j0(this.f);
        serializer.f0(this.g);
        serializer.V(this.h);
        serializer.V(this.i);
        serializer.f0(this.j);
        serializer.j0(this.k);
        serializer.f0(this.l);
        serializer.J(this.m);
        serializer.J(this.n);
        serializer.J(this.o);
        serializer.J(this.p);
        serializer.J(this.q);
        serializer.g0(this.r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogMarketFilter)) {
            return false;
        }
        CatalogMarketFilter catalogMarketFilter = (CatalogMarketFilter) obj;
        return this.b == catalogMarketFilter.b && epx.f(this.c, catalogMarketFilter.c) && epx.f(this.d, catalogMarketFilter.d) && epx.f(this.e, catalogMarketFilter.e) && epx.f(this.f, catalogMarketFilter.f) && epx.f(this.g, catalogMarketFilter.g) && epx.f(this.h, catalogMarketFilter.h) && epx.f(this.i, catalogMarketFilter.i) && epx.f(this.j, catalogMarketFilter.j) && epx.f(this.k, catalogMarketFilter.k) && epx.f(this.l, catalogMarketFilter.l) && epx.f(this.m, catalogMarketFilter.m) && epx.f(this.n, catalogMarketFilter.n) && epx.f(this.o, catalogMarketFilter.o) && epx.f(this.p, catalogMarketFilter.p) && epx.f(this.q, catalogMarketFilter.q) && this.r == catalogMarketFilter.r;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        String str = this.f;
        int a2 = fw3.a((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        Integer num = this.h;
        int hashCode4 = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<CatalogMarketDistanceOption> list = this.j;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.k;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CatalogMarketStatusOption> list2 = this.l;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.m;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.n;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.o;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.p;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.q;
        int hashCode13 = (hashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto = this.r;
        return hashCode13 + (catalogMarketDeliveryTypeDto != null ? catalogMarketDeliveryTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogMarketFilter(context=" + this.b + ", priceFrom=" + this.c + ", priceTo=" + this.d + ", priceCurrency=" + this.e + ", classifiedsCityId=" + this.f + ", categories=" + this.g + ", distance=" + this.h + ", distanceDefault=" + this.i + ", distanceOptions=" + this.j + ", statusOptionId=" + this.k + ", statusOptions=" + this.l + ", onlinePaymentEnabled=" + this.m + ", discountEnabled=" + this.n + ", sellerHighRatingEnabled=" + this.o + ", friendsReviewsEnabled=" + this.p + ", friendsWishlistEnabled=" + this.q + ", deliveryType=" + this.r + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public CatalogMarketFilter(org.json.JSONObject r22) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.market.catalog.CatalogMarketFilter.<init>(org.json.JSONObject):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogMarketFilter(Serializer serializer) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r0 instanceof CatalogMarketDeliveryTypeDto ? (CatalogMarketDeliveryTypeDto) r0 : null);
        String H = serializer.H();
        CatalogMarketCategoryContext.Context.Companion.getClass();
        CatalogMarketCategoryContext.Context a2 = CatalogMarketCategoryContext.Context.a.a(H);
        Long x = serializer.x();
        Long x2 = serializer.x();
        Currency currency = (Currency) serializer.G(Currency.class.getClassLoader());
        String H2 = serializer.H();
        ArrayList B = serializer.B(CatalogMarketCategoryContext.class.getClassLoader());
        Integer v = serializer.v();
        Integer v2 = serializer.v();
        ArrayList B2 = serializer.B(CatalogMarketDistanceOption.class.getClassLoader());
        String H3 = serializer.H();
        ArrayList B3 = serializer.B(CatalogMarketStatusOption.class.getClassLoader());
        Boolean n = serializer.n();
        Boolean n2 = serializer.n();
        Boolean n3 = serializer.n();
        Boolean n4 = serializer.n();
        Boolean n5 = serializer.n();
        Serializable C = serializer.C();
    }
}
