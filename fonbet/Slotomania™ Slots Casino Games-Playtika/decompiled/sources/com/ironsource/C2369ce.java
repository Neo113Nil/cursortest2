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

/* renamed from: com.ironsource.ce, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2369ce extends AbstractC2731x0 {
    public static final a z = new a(null);
    private final C2445h0 t;
    private final boolean u;
    private final C2713w0 v;
    private final C2405ee w;
    private final String x;
    private final String y;

    /* renamed from: com.ironsource.ce$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2369ce a(C2445h0 adProperties, Ua ua, boolean z) {
            List<C2743xc> emptyList;
            Ve d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC2731x0.a aVar = AbstractC2731x0.r;
            N3 c = (ua == null || (d = ua.d()) == null) ? null : d.c();
            C2405ee f = c != null ? c.f() : null;
            if (f == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (ua == null || (emptyList = ua.d(adProperties.e(), adProperties.c())) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            String f2 = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(emptyList, 10));
            Iterator<T> it = emptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2743xc) it.next()).f());
            }
            C2526la b = C2526la.b();
            Intrinsics.checkNotNullExpressionValue(b, "getInstance()");
            return new C2369ce(adProperties, z, new C2713w0(f2, arrayList, b), f);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2369ce(C2445h0 adProperties, boolean z2, C2713w0 adUnitCommonData, C2405ee configs) {
        super(adProperties, z2, r3, r4, r5, r6, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), new O0(O0.a.MANUAL, configs.k().j(), configs.k().b(), -1L), configs.l(), configs.f(), configs.o(), configs.n(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String f = adUnitCommonData.f();
        List<NetworkSettings> d = adUnitCommonData.d();
        C2526la e = adUnitCommonData.e();
        C2643s2 k = configs.k();
        Intrinsics.checkNotNullExpressionValue(k, "configs.rewardedVideoAuctionSettings");
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.y = Va.b;
    }

    public final C2713w0 A() {
        return this.v;
    }

    public final C2405ee B() {
        return this.w;
    }

    public final C2369ce a(C2445h0 adProperties, boolean z2, C2713w0 adUnitCommonData, C2405ee configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C2369ce(adProperties, z2, adUnitCommonData, configs);
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
        if (!(obj instanceof C2369ce)) {
            return false;
        }
        C2369ce c2369ce = (C2369ce) obj;
        return Intrinsics.areEqual(this.t, c2369ce.t) && this.u == c2369ce.u && Intrinsics.areEqual(this.v, c2369ce.v) && Intrinsics.areEqual(this.w, c2369ce.w);
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
        return "RewardedAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
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

    public final C2405ee z() {
        return this.w;
    }

    public static /* synthetic */ C2369ce a(C2369ce c2369ce, C2445h0 c2445h0, boolean z2, C2713w0 c2713w0, C2405ee c2405ee, int i, Object obj) {
        if ((i & 1) != 0) {
            c2445h0 = c2369ce.t;
        }
        if ((i & 2) != 0) {
            z2 = c2369ce.u;
        }
        if ((i & 4) != 0) {
            c2713w0 = c2369ce.v;
        }
        if ((i & 8) != 0) {
            c2405ee = c2369ce.w;
        }
        return c2369ce.a(c2445h0, z2, c2713w0, c2405ee);
    }

    @Override // com.ironsource.AbstractC2731x0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject rewardedVideoSettings = providerSettings.getRewardedVideoSettings();
        Intrinsics.checkNotNullExpressionValue(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }
}
