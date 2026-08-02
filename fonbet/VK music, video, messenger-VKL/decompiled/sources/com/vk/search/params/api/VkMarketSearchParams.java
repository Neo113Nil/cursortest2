package com.vk.search.params.api;

import com.vk.core.serialize.Serializer;
import com.vk.search.params.api.domain.model.MarketSearchDeliveryType;
import com.vk.search.params.api.domain.model.MarketSearchSortingOptions;
import java.util.Objects;
import xsna.epx;
import xsna.fxh0;

/* compiled from: VkMarketSearchParams.kt */
/* loaded from: classes5.dex */
public final class VkMarketSearchParams extends SearchParamsWithCity {
    public static final Serializer.c<VkMarketSearchParams> CREATOR = new a();
    public String c;
    public fxh0<Integer> d;
    public String e;
    public String f;
    public Integer g;
    public Integer h;
    public Float i;
    public Float j;
    public Boolean k;
    public Integer l;
    public String m;
    public Boolean n;
    public Boolean o;
    public Boolean p;
    public Boolean q;
    public Boolean r;
    public MarketSearchDeliveryType s;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkMarketSearchParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkMarketSearchParams a(Serializer serializer) {
            fxh0<Integer> fxh0Var;
            VkMarketSearchParams vkMarketSearchParams = new VkMarketSearchParams();
            vkMarketSearchParams.b = (City) serializer.A(City.class.getClassLoader());
            if (serializer.m()) {
                Integer valueOf = Integer.valueOf(serializer.u());
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                fxh0Var = new fxh0<>(valueOf, H);
            } else {
                fxh0Var = null;
            }
            vkMarketSearchParams.d = fxh0Var;
            vkMarketSearchParams.e = serializer.I();
            vkMarketSearchParams.f = serializer.I();
            vkMarketSearchParams.g = serializer.v();
            vkMarketSearchParams.h = serializer.v();
            vkMarketSearchParams.i = serializer.t();
            vkMarketSearchParams.j = serializer.t();
            vkMarketSearchParams.k = serializer.n();
            vkMarketSearchParams.l = serializer.v();
            vkMarketSearchParams.m = serializer.I();
            vkMarketSearchParams.n = serializer.n();
            vkMarketSearchParams.o = serializer.n();
            vkMarketSearchParams.p = serializer.n();
            vkMarketSearchParams.q = serializer.n();
            vkMarketSearchParams.r = serializer.n();
            vkMarketSearchParams.s = (MarketSearchDeliveryType) serializer.C();
            vkMarketSearchParams.c = serializer.I();
            return vkMarketSearchParams;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkMarketSearchParams[i];
        }
    }

    public VkMarketSearchParams() {
        super(null);
        this.c = MarketSearchSortingOptions.DEFAULT.i();
        Boolean bool = Boolean.FALSE;
        this.n = bool;
        this.o = bool;
        this.p = bool;
        this.q = bool;
        this.r = bool;
        this.s = MarketSearchDeliveryType.ANY;
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity, com.vk.search.params.api.SearchParams
    public final boolean I() {
        if (!super.I() || this.g != null || this.h != null || this.d != null || this.e != null || this.f != null || this.i != null || this.j != null || this.k != null || this.l != null || this.m != null) {
            return false;
        }
        Boolean bool = this.n;
        Boolean bool2 = Boolean.TRUE;
        if (epx.f(bool, bool2) || epx.f(this.o, bool2) || epx.f(this.p, bool2) || epx.f(this.q, bool2) || epx.f(this.r, bool2)) {
            return false;
        }
        MarketSearchDeliveryType marketSearchDeliveryType = this.s;
        if (marketSearchDeliveryType != null && marketSearchDeliveryType != MarketSearchDeliveryType.ANY) {
            return false;
        }
        String str = this.c;
        return str == null || epx.f(str, MarketSearchSortingOptions.DEFAULT.i());
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        fxh0<Integer> fxh0Var = this.d;
        if (fxh0Var != null) {
            serializer.L((byte) 1);
            serializer.S(fxh0Var.a.intValue());
            serializer.j0(fxh0Var.b);
        } else {
            serializer.L((byte) 0);
        }
        serializer.m0(this.e);
        serializer.m0(this.f);
        serializer.V(this.g);
        serializer.V(this.h);
        serializer.R(this.i);
        serializer.R(this.j);
        serializer.J(this.k);
        serializer.V(this.l);
        serializer.m0(this.m);
        serializer.J(this.n);
        serializer.J(this.o);
        serializer.J(this.p);
        serializer.J(this.q);
        serializer.J(this.r);
        serializer.g0(this.s);
        serializer.m0(this.c);
    }

    @Override // com.vk.search.params.api.SearchParams
    public final SearchParams copy() {
        VkMarketSearchParams vkMarketSearchParams = new VkMarketSearchParams();
        vkMarketSearchParams.h5(this);
        return vkMarketSearchParams;
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!VkMarketSearchParams.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        VkMarketSearchParams vkMarketSearchParams = (VkMarketSearchParams) obj;
        return epx.f(this.g, vkMarketSearchParams.g) && epx.f(this.h, vkMarketSearchParams.h) && epx.f(this.d, vkMarketSearchParams.d) && epx.f(this.e, vkMarketSearchParams.e) && epx.f(this.f, vkMarketSearchParams.f) && epx.e(this.i, vkMarketSearchParams.i) && epx.e(this.j, vkMarketSearchParams.j) && epx.f(this.k, vkMarketSearchParams.k) && epx.f(this.l, vkMarketSearchParams.l) && epx.f(this.m, vkMarketSearchParams.m) && epx.f(this.n, vkMarketSearchParams.n) && epx.f(this.o, vkMarketSearchParams.o) && epx.f(this.p, vkMarketSearchParams.p) && epx.f(this.q, vkMarketSearchParams.q) && epx.f(this.r, vkMarketSearchParams.r) && this.s == vkMarketSearchParams.s && epx.f(this.c, vkMarketSearchParams.c);
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity, com.vk.search.params.api.SearchParams
    public final <T extends SearchParams> void h5(T t) {
        super.h5(t);
        if (t instanceof VkMarketSearchParams) {
            VkMarketSearchParams vkMarketSearchParams = (VkMarketSearchParams) t;
            this.g = vkMarketSearchParams.g;
            this.h = vkMarketSearchParams.h;
            this.d = vkMarketSearchParams.d;
            this.e = vkMarketSearchParams.e;
            this.f = vkMarketSearchParams.f;
            this.i = vkMarketSearchParams.i;
            this.j = vkMarketSearchParams.j;
            this.k = vkMarketSearchParams.k;
            this.l = vkMarketSearchParams.l;
            this.m = vkMarketSearchParams.m;
            this.n = vkMarketSearchParams.n;
            this.o = vkMarketSearchParams.o;
            this.p = vkMarketSearchParams.p;
            this.q = vkMarketSearchParams.q;
            this.r = vkMarketSearchParams.r;
            this.s = vkMarketSearchParams.s;
            this.c = vkMarketSearchParams.c;
        }
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(d()), this.g, this.h, this.d, this.e, this.f, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.c);
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity, com.vk.search.params.api.SearchParams
    public final void reset() {
        this.b = null;
        this.g = null;
        this.h = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        Boolean bool = Boolean.FALSE;
        this.n = bool;
        this.o = bool;
        this.p = bool;
        this.q = bool;
        this.r = bool;
        this.s = MarketSearchDeliveryType.ANY;
        this.c = MarketSearchSortingOptions.DEFAULT.i();
    }
}
