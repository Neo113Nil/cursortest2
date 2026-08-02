package com.ironsource;

import com.ironsource.AbstractC2731x0;
import com.ironsource.O0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class B9 extends AbstractC2731x0 {
    public static final a z = new a(null);
    private final C2445h0 t;
    private final boolean u;
    private final C2713w0 v;
    private final D9 w;
    private final String x;
    private final String y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final B9 a(C2445h0 adProperties, Ua ua, boolean z) {
            List<C2743xc> emptyList;
            Ve d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC2731x0.a aVar = AbstractC2731x0.r;
            N3 c = (ua == null || (d = ua.d()) == null) ? null : d.c();
            D9 d2 = c != null ? c.d() : null;
            if (d2 == null) {
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
            return new B9(adProperties, z, new C2713w0(f, arrayList, b), d2);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B9(C2445h0 adProperties, boolean z2, C2713w0 adUnitCommonData, D9 configs) {
        super(adProperties, z2, r3, r4, r5, r6, configs.c(), configs.d(), configs.f(), configs.b(), -1, new O0(O0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String f = adUnitCommonData.f();
        List<NetworkSettings> d = adUnitCommonData.d();
        C2526la e = adUnitCommonData.e();
        C2643s2 g = configs.g();
        Intrinsics.checkNotNullExpressionValue(g, "configs.interstitialAuctionSettings");
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.y = Va.c;
    }

    public final C2713w0 A() {
        return this.v;
    }

    public final D9 B() {
        return this.w;
    }

    public final B9 a(C2445h0 adProperties, boolean z2, C2713w0 adUnitCommonData, D9 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new B9(adProperties, z2, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC2731x0
    public C2445h0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC2731x0
    public String c() {
        return this.x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B9)) {
            return false;
        }
        B9 b9 = (B9) obj;
        return Intrinsics.areEqual(this.t, b9.t) && this.u == b9.u && Intrinsics.areEqual(this.v, b9.v) && Intrinsics.areEqual(this.w, b9.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.t.hashCode() * 31;
        boolean z2 = this.u;
        int i = z2;
        if (z2 != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.v.hashCode()) * 31) + this.w.hashCode();
    }

    @Override // com.ironsource.AbstractC2731x0
    public String j() {
        return this.y;
    }

    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC2731x0
    public boolean u() {
        return this.u;
    }

    public final C2445h0 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    public final C2713w0 y() {
        return this.v;
    }

    public final D9 z() {
        return this.w;
    }

    public static /* synthetic */ B9 a(B9 b9, C2445h0 c2445h0, boolean z2, C2713w0 c2713w0, D9 d9, int i, Object obj) {
        if ((i & 1) != 0) {
            c2445h0 = b9.t;
        }
        if ((i & 2) != 0) {
            z2 = b9.u;
        }
        if ((i & 4) != 0) {
            c2713w0 = b9.v;
        }
        if ((i & 8) != 0) {
            d9 = b9.w;
        }
        return b9.a(c2445h0, z2, c2713w0, d9);
    }

    @Override // com.ironsource.AbstractC2731x0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
