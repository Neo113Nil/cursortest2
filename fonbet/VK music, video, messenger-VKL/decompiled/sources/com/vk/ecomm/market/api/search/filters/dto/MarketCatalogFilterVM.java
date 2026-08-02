package com.vk.ecomm.market.api.search.filters.dto;

import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import java.util.List;
import java.util.Map;
import xsna.asp;
import xsna.dz00;
import xsna.epx;
import xsna.k73;
import xsna.ms9;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MarketCatalogFilterVM.kt */
/* loaded from: classes18.dex */
public final class MarketCatalogFilterVM {
    public final FilterContextType a;
    public final FilterContextType b;
    public final d c;
    public final a d;
    public final dz00 e;
    public final Long f;
    public final Long g;
    public final String h;
    public final CatalogMarketStatusOption i;
    public final List<CatalogMarketStatusOption> j;
    public final Boolean k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;
    public final MarketDeliveryType p;
    public final Object q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketCatalogFilterVM.kt */
    public static final class FilterContextType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FilterContextType[] $VALUES;
        public static final FilterContextType CLASSIFIEDS;
        public static final FilterContextType MARKET;

        static {
            FilterContextType filterContextType = new FilterContextType("MARKET", 0);
            MARKET = filterContextType;
            FilterContextType filterContextType2 = new FilterContextType("CLASSIFIEDS", 1);
            CLASSIFIEDS = filterContextType2;
            FilterContextType[] filterContextTypeArr = {filterContextType, filterContextType2};
            $VALUES = filterContextTypeArr;
            $ENTRIES = new asp(filterContextTypeArr);
        }

        public FilterContextType() {
            throw null;
        }

        public static FilterContextType valueOf(String str) {
            return (FilterContextType) Enum.valueOf(FilterContextType.class, str);
        }

        public static FilterContextType[] values() {
            return (FilterContextType[]) $VALUES.clone();
        }
    }

    /* compiled from: MarketCatalogFilterVM.kt */
    public static final class a extends c {
        public final MarketBridgeCategory a;
        public final MarketBridgeCategory b;
        public final Integer c;
        public final Integer d;
        public final List<b> e;

        public a(MarketBridgeCategory marketBridgeCategory, MarketBridgeCategory marketBridgeCategory2, Integer num, Integer num2, List<b> list) {
            this.a = marketBridgeCategory;
            this.b = marketBridgeCategory2;
            this.c = num;
            this.d = num2;
            this.e = list;
        }

        public static a d(a aVar, MarketBridgeCategory marketBridgeCategory, Integer num, int i) {
            MarketBridgeCategory marketBridgeCategory2 = aVar.a;
            if ((i & 2) != 0) {
                marketBridgeCategory = aVar.b;
            }
            MarketBridgeCategory marketBridgeCategory3 = marketBridgeCategory;
            if ((i & 4) != 0) {
                num = aVar.c;
            }
            Integer num2 = aVar.d;
            List<b> list = aVar.e;
            aVar.getClass();
            return new a(marketBridgeCategory2, marketBridgeCategory3, num, num2, list);
        }

        @Override // com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM.c
        public final MarketBridgeCategory a() {
            return this.a;
        }

        @Override // com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM.c
        public final MarketBridgeCategory b() {
            return this.b;
        }

        @Override // com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM.c
        public final c c(MarketBridgeCategory marketBridgeCategory) {
            return d(this, marketBridgeCategory, null, 29);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            MarketBridgeCategory marketBridgeCategory = this.b;
            int hashCode2 = (hashCode + (marketBridgeCategory == null ? 0 : marketBridgeCategory.hashCode())) * 31;
            Integer num = this.c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.d;
            return this.e.hashCode() + ((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClassifiedsContext(categoryTree=");
            sb.append(this.a);
            sb.append(", currentCategory=");
            sb.append(this.b);
            sb.append(", distance=");
            sb.append(this.c);
            sb.append(", distanceDefault=");
            sb.append(this.d);
            sb.append(", distanceOptions=");
            return ms9.a(')', sb, this.e);
        }
    }

    /* compiled from: MarketCatalogFilterVM.kt */
    public static final class b {
        public final String a;
        public final int b;

        public b(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DistanceOption(title=");
            sb.append(this.a);
            sb.append(", value=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: MarketCatalogFilterVM.kt */
    public static abstract class c {
        public abstract MarketBridgeCategory a();

        public abstract MarketBridgeCategory b();

        public abstract c c(MarketBridgeCategory marketBridgeCategory);
    }

    /* compiled from: MarketCatalogFilterVM.kt */
    public static final class d extends c {
        public final MarketBridgeCategory a;
        public final MarketBridgeCategory b;

        public d(MarketBridgeCategory marketBridgeCategory, MarketBridgeCategory marketBridgeCategory2) {
            this.a = marketBridgeCategory;
            this.b = marketBridgeCategory2;
        }

        @Override // com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM.c
        public final MarketBridgeCategory a() {
            return this.a;
        }

        @Override // com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM.c
        public final MarketBridgeCategory b() {
            return this.b;
        }

        @Override // com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM.c
        public final c c(MarketBridgeCategory marketBridgeCategory) {
            return new d(this.a, marketBridgeCategory);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            MarketBridgeCategory marketBridgeCategory = this.b;
            return hashCode + (marketBridgeCategory == null ? 0 : marketBridgeCategory.hashCode());
        }

        public final String toString() {
            return "MarketContext(categoryTree=" + this.a + ", currentCategory=" + this.b + ')';
        }
    }

    public MarketCatalogFilterVM(FilterContextType filterContextType, FilterContextType filterContextType2, d dVar, a aVar, dz00 dz00Var, Long l, Long l2, String str, CatalogMarketStatusOption catalogMarketStatusOption, List<CatalogMarketStatusOption> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, MarketDeliveryType marketDeliveryType, Map<FilterContextType, ? extends Map<FilterContextType, ? extends Map<Integer, Integer>>> map) {
        this.a = filterContextType;
        this.b = filterContextType2;
        this.c = dVar;
        this.d = aVar;
        this.e = dz00Var;
        this.f = l;
        this.g = l2;
        this.h = str;
        this.i = catalogMarketStatusOption;
        this.j = list;
        this.k = bool;
        this.l = bool2;
        this.m = bool3;
        this.n = bool4;
        this.o = bool5;
        this.p = marketDeliveryType;
        this.q = map;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public static MarketCatalogFilterVM a(MarketCatalogFilterVM marketCatalogFilterVM, FilterContextType filterContextType, d dVar, a aVar, dz00 dz00Var, Long l, Long l2, CatalogMarketStatusOption catalogMarketStatusOption, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, MarketDeliveryType marketDeliveryType, int i) {
        FilterContextType filterContextType2 = (i & 1) != 0 ? marketCatalogFilterVM.a : filterContextType;
        FilterContextType filterContextType3 = marketCatalogFilterVM.b;
        d dVar2 = (i & 4) != 0 ? marketCatalogFilterVM.c : dVar;
        a aVar2 = (i & 8) != 0 ? marketCatalogFilterVM.d : aVar;
        dz00 dz00Var2 = (i & 16) != 0 ? marketCatalogFilterVM.e : dz00Var;
        Long l3 = (i & 32) != 0 ? marketCatalogFilterVM.f : l;
        Long l4 = (i & 64) != 0 ? marketCatalogFilterVM.g : l2;
        String str = marketCatalogFilterVM.h;
        CatalogMarketStatusOption catalogMarketStatusOption2 = (i & 256) != 0 ? marketCatalogFilterVM.i : catalogMarketStatusOption;
        List list2 = (i & 512) != 0 ? marketCatalogFilterVM.j : list;
        Boolean bool6 = (i & 1024) != 0 ? marketCatalogFilterVM.k : bool;
        Boolean bool7 = (i & 2048) != 0 ? marketCatalogFilterVM.l : bool2;
        Boolean bool8 = (i & 4096) != 0 ? marketCatalogFilterVM.m : bool3;
        Boolean bool9 = (i & 8192) != 0 ? marketCatalogFilterVM.n : bool4;
        Boolean bool10 = (i & 16384) != 0 ? marketCatalogFilterVM.o : bool5;
        MarketDeliveryType marketDeliveryType2 = (i & 32768) != 0 ? marketCatalogFilterVM.p : marketDeliveryType;
        ?? r1 = marketCatalogFilterVM.q;
        marketCatalogFilterVM.getClass();
        return new MarketCatalogFilterVM(filterContextType2, filterContextType3, dVar2, aVar2, dz00Var2, l3, l4, str, catalogMarketStatusOption2, list2, bool6, bool7, bool8, bool9, bool10, marketDeliveryType2, r1);
    }

    public final c b(FilterContextType filterContextType) {
        return filterContextType == FilterContextType.CLASSIFIEDS ? this.d : this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCatalogFilterVM)) {
            return false;
        }
        MarketCatalogFilterVM marketCatalogFilterVM = (MarketCatalogFilterVM) obj;
        return this.a == marketCatalogFilterVM.a && this.b == marketCatalogFilterVM.b && epx.f(this.c, marketCatalogFilterVM.c) && epx.f(this.d, marketCatalogFilterVM.d) && epx.f(this.e, marketCatalogFilterVM.e) && epx.f(this.f, marketCatalogFilterVM.f) && epx.f(this.g, marketCatalogFilterVM.g) && this.h.equals(marketCatalogFilterVM.h) && epx.f(this.i, marketCatalogFilterVM.i) && epx.f(this.j, marketCatalogFilterVM.j) && epx.f(this.k, marketCatalogFilterVM.k) && epx.f(this.l, marketCatalogFilterVM.l) && epx.f(this.m, marketCatalogFilterVM.m) && epx.f(this.n, marketCatalogFilterVM.n) && epx.f(this.o, marketCatalogFilterVM.o) && this.p == marketCatalogFilterVM.p && this.q.equals(marketCatalogFilterVM.q);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        d dVar = this.c;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.d;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        dz00 dz00Var = this.e;
        int hashCode4 = (hashCode3 + (dz00Var == null ? 0 : dz00Var.hashCode())) * 31;
        Long l = this.f;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        int a2 = urd0.a((hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.h);
        CatalogMarketStatusOption catalogMarketStatusOption = this.i;
        int hashCode6 = (a2 + (catalogMarketStatusOption == null ? 0 : catalogMarketStatusOption.hashCode())) * 31;
        List<CatalogMarketStatusOption> list = this.j;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.k;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.l;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.m;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.n;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.o;
        int hashCode12 = (hashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        MarketDeliveryType marketDeliveryType = this.p;
        return this.q.hashCode() + ((hashCode12 + (marketDeliveryType != null ? marketDeliveryType.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCatalogFilterVM(currentContextType=");
        sb.append(this.a);
        sb.append(", defaultContextType=");
        sb.append(this.b);
        sb.append(", marketContext=");
        sb.append(this.c);
        sb.append(", classifiedsContext=");
        sb.append(this.d);
        sb.append(", location=");
        sb.append(this.e);
        sb.append(", priceFrom=");
        sb.append(this.f);
        sb.append(", priceTo=");
        sb.append(this.g);
        sb.append(", priceCurrency=");
        sb.append(this.h);
        sb.append(", currentProductStatus=");
        sb.append(this.i);
        sb.append(", productStatusOptions=");
        sb.append(this.j);
        sb.append(", onlinePaymentEnabled=");
        sb.append(this.k);
        sb.append(", discountEnabled=");
        sb.append(this.l);
        sb.append(", sellerHighRatingEnabled=");
        sb.append(this.m);
        sb.append(", friendsReviewsEnabled=");
        sb.append(this.n);
        sb.append(", friendsWishlistEnabled=");
        sb.append(this.o);
        sb.append(", deliveryType=");
        sb.append(this.p);
        sb.append(", categoryMappings=");
        return k73.c(sb, this.q, ')');
    }
}
