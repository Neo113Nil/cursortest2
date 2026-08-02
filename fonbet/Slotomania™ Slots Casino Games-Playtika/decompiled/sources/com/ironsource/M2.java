package com.ironsource;

import com.ironsource.AbstractC2731x0;
import com.ironsource.O0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class M2 extends AbstractC2731x0 {
    public static final a z = new a(null);
    private final J2 t;
    private final boolean u;
    private final C2713w0 v;
    private final U2 w;
    private final String x;
    private final String y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final M2 a(J2 adProperties, Ua ua, boolean z) {
            List<C2743xc> emptyList;
            Ve d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC2731x0.a aVar = AbstractC2731x0.r;
            N3 c = (ua == null || (d = ua.d()) == null) ? null : d.c();
            U2 c2 = c != null ? c.c() : null;
            if (c2 == null) {
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
            return new M2(adProperties, z, new C2713w0(f, arrayList, b), c2);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public M2(J2 adProperties, boolean z2, C2713w0 adUnitCommonData, U2 configs) {
        super(adProperties, z2, r3, r4, r5, r6, configs.a(), (int) (configs.b() / 1000), configs.c(), configs.f(), -1, new O0(O0.a.MANUAL_WITH_AUTOMATIC_RELOAD, configs.d().j(), configs.d().b(), 1000 * configs.h()), configs.e(), configs.l(), configs.n(), configs.m(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String f = adUnitCommonData.f();
        List<NetworkSettings> d = adUnitCommonData.d();
        C2526la e = adUnitCommonData.e();
        C2643s2 d2 = configs.d();
        Intrinsics.checkNotNullExpressionValue(d2, "configs.bannerAuctionSettings");
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = "BN";
        this.y = Va.d;
    }

    @Override // com.ironsource.AbstractC2731x0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public J2 b() {
        return this.t;
    }

    public final C2713w0 B() {
        return this.v;
    }

    public final U2 C() {
        return this.w;
    }

    public final M2 a(J2 adProperties, boolean z2, C2713w0 adUnitCommonData, U2 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new M2(adProperties, z2, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC2731x0
    public String c() {
        return this.x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2)) {
            return false;
        }
        M2 m2 = (M2) obj;
        return Intrinsics.areEqual(this.t, m2.t) && this.u == m2.u && Intrinsics.areEqual(this.v, m2.v) && Intrinsics.areEqual(this.w, m2.w);
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
        return "BannerAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC2731x0
    public boolean u() {
        return this.u;
    }

    public final J2 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    public final C2713w0 y() {
        return this.v;
    }

    public final U2 z() {
        return this.w;
    }

    public static /* synthetic */ M2 a(M2 m2, J2 j2, boolean z2, C2713w0 c2713w0, U2 u2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = m2.t;
        }
        if ((i & 2) != 0) {
            z2 = m2.u;
        }
        if ((i & 4) != 0) {
            c2713w0 = m2.v;
        }
        if ((i & 8) != 0) {
            u2 = m2.w;
        }
        return m2.a(j2, z2, c2713w0, u2);
    }

    @Override // com.ironsource.AbstractC2731x0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject bannerSettings = providerSettings.getBannerSettings();
        Intrinsics.checkNotNullExpressionValue(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC2731x0
    public AdData a(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        AdData createAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), r(), new com.ironsource.mediationsdk.o(ContextProvider.getInstance().getApplicationContext(), new C2534m0().b(b().i())));
        Intrinsics.checkNotNullExpressionValue(createAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return createAdDataForNetworkAdapter;
    }
}
