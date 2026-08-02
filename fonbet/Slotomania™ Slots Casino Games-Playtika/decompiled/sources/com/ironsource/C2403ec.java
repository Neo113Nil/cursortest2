package com.ironsource;

import com.ironsource.AbstractC2731x0;
import com.ironsource.O0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2403ec extends AbstractC2731x0 {
    public static final a y = new a(null);
    private final C2445h0 t;
    private final C2713w0 u;
    private final Pb v;
    private final String w;
    private final String x;

    /* renamed from: com.ironsource.ec$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2403ec a(C2445h0 adProperties, Ua ua) {
            List<C2743xc> emptyList;
            Ve d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC2731x0.a aVar = AbstractC2731x0.r;
            N3 c = (ua == null || (d = ua.d()) == null) ? null : d.c();
            Pb e = c != null ? c.e() : null;
            if (e == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (ua == null || (emptyList = ua.d(adProperties.e(), adProperties.c())) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            String f = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(emptyList, 10));
            Iterator<T> it = emptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2743xc) it.next()).f());
            }
            C2526la b = C2526la.b();
            Intrinsics.checkNotNullExpressionValue(b, "getInstance()");
            return new C2403ec(adProperties, new C2713w0(f, arrayList, b), e);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2403ec(C2445h0 adProperties, C2713w0 adUnitCommonData, Pb configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new O0(O0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.t = adProperties;
        this.u = adUnitCommonData;
        this.v = configs;
        this.w = "NA";
        this.x = Va.e;
    }

    public final Pb A() {
        return this.v;
    }

    public final C2403ec a(C2445h0 adProperties, C2713w0 adUnitCommonData, Pb configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C2403ec(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC2731x0
    public C2445h0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC2731x0
    public String c() {
        return this.w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2403ec)) {
            return false;
        }
        C2403ec c2403ec = (C2403ec) obj;
        return Intrinsics.areEqual(this.t, c2403ec.t) && Intrinsics.areEqual(this.u, c2403ec.u) && Intrinsics.areEqual(this.v, c2403ec.v);
    }

    public int hashCode() {
        return (((this.t.hashCode() * 31) + this.u.hashCode()) * 31) + this.v.hashCode();
    }

    @Override // com.ironsource.AbstractC2731x0
    public String j() {
        return this.x;
    }

    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.t + ", adUnitCommonData=" + this.u + ", configs=" + this.v + ")";
    }

    public final C2445h0 w() {
        return this.t;
    }

    public final C2713w0 x() {
        return this.u;
    }

    public final Pb y() {
        return this.v;
    }

    public final C2713w0 z() {
        return this.u;
    }

    public static /* synthetic */ C2403ec a(C2403ec c2403ec, C2445h0 c2445h0, C2713w0 c2713w0, Pb pb, int i, Object obj) {
        if ((i & 1) != 0) {
            c2445h0 = c2403ec.t;
        }
        if ((i & 2) != 0) {
            c2713w0 = c2403ec.u;
        }
        if ((i & 4) != 0) {
            pb = c2403ec.v;
        }
        return c2403ec.a(c2445h0, c2713w0, pb);
    }

    @Override // com.ironsource.AbstractC2731x0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
