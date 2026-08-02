package com.ironsource;

import com.ironsource.C2623r0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class C {
    private final AbstractC2731x0 a;
    private final NetworkSettings b;
    private final C2554n2 c;
    private final C2392e1 d;
    private C2608q2 e;
    private final int f;
    private final boolean g;
    private final J h;
    private final IronSource.a i;
    private final JSONObject j;
    private final String k;
    private final int l;
    private final String m;
    private final C2608q2 n;
    private final String o;
    private final String p;
    private final int q;
    private final AdData r;

    public C(AbstractC2731x0 adUnitData, NetworkSettings providerSettings, C2554n2 auctionData, C2392e1 adapterConfig, C2608q2 auctionResponseItem, int i, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        this.a = adUnitData;
        this.b = providerSettings;
        this.c = auctionData;
        this.d = adapterConfig;
        this.e = auctionResponseItem;
        this.f = i;
        this.g = z;
        this.h = new J(C2623r0.a.DidntAttemptToLoad);
        IronSource.a a = adUnitData.b().a();
        this.i = a;
        this.j = auctionData.h();
        this.k = auctionData.g();
        this.l = auctionData.i();
        this.m = auctionData.f();
        this.n = auctionData.j();
        String f = adapterConfig.f();
        Intrinsics.checkNotNullExpressionValue(f, "adapterConfig.providerName");
        this.o = f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{f, Integer.valueOf(hashCode())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        this.p = format;
        this.q = adapterConfig.d();
        String k = this.e.k();
        Map<String, Object> a2 = C2455ha.a(this.e.a());
        Intrinsics.checkNotNullExpressionValue(a2, "jsonObjectToMap(auctionResponseItem.adData)");
        a2.put("adUnit", a);
        HashMap hashMap = new HashMap();
        Map<String, Object> a3 = C2455ha.a(adapterConfig.c());
        Intrinsics.checkNotNullExpressionValue(a3, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        hashMap.putAll(a3);
        a2.put("userId", adUnitData.r());
        a2.put("adUnitId", adUnitData.b().c());
        a2.put("isMultipleAdUnits", Boolean.TRUE);
        this.r = new AdData(k, hashMap, a2);
    }

    public final AbstractC2731x0 a() {
        return this.a;
    }

    public final NetworkSettings b() {
        return this.b;
    }

    public final C2554n2 c() {
        return this.c;
    }

    public final C2392e1 d() {
        return this.d;
    }

    public final C2608q2 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c = (C) obj;
        return Intrinsics.areEqual(this.a, c.a) && Intrinsics.areEqual(this.b, c.b) && Intrinsics.areEqual(this.c, c.c) && Intrinsics.areEqual(this.d, c.d) && Intrinsics.areEqual(this.e, c.e) && this.f == c.f && this.g == c.g;
    }

    public final int f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final AdData h() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.f)) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final IronSource.a i() {
        return this.i;
    }

    public final AbstractC2731x0 j() {
        return this.a;
    }

    public final C2392e1 k() {
        return this.d;
    }

    public final C2554n2 l() {
        return this.c;
    }

    public final String m() {
        return this.m;
    }

    public final String n() {
        return this.k;
    }

    public final C2608q2 o() {
        return this.e;
    }

    public final int p() {
        return this.l;
    }

    public final C2608q2 q() {
        return this.n;
    }

    public final JSONObject r() {
        return this.j;
    }

    public final String s() {
        return this.o;
    }

    public final int t() {
        return this.q;
    }

    public String toString() {
        return "AdInstanceData(adUnitData=" + this.a + ", providerSettings=" + this.b + ", auctionData=" + this.c + ", adapterConfig=" + this.d + ", auctionResponseItem=" + this.e + ", sessionDepth=" + this.f + ", isPreloaded=" + this.g + ")";
    }

    public final J u() {
        return this.h;
    }

    public final NetworkSettings v() {
        return this.b;
    }

    public final int w() {
        return this.f;
    }

    public final String x() {
        return this.p;
    }

    public final boolean y() {
        return this.g;
    }

    public final C a(AbstractC2731x0 adUnitData, NetworkSettings providerSettings, C2554n2 auctionData, C2392e1 adapterConfig, C2608q2 auctionResponseItem, int i, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        return new C(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, i, z);
    }

    public static /* synthetic */ C a(C c, AbstractC2731x0 abstractC2731x0, NetworkSettings networkSettings, C2554n2 c2554n2, C2392e1 c2392e1, C2608q2 c2608q2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC2731x0 = c.a;
        }
        if ((i2 & 2) != 0) {
            networkSettings = c.b;
        }
        if ((i2 & 4) != 0) {
            c2554n2 = c.c;
        }
        if ((i2 & 8) != 0) {
            c2392e1 = c.d;
        }
        if ((i2 & 16) != 0) {
            c2608q2 = c.e;
        }
        if ((i2 & 32) != 0) {
            i = c.f;
        }
        if ((i2 & 64) != 0) {
            z = c.g;
        }
        int i3 = i;
        boolean z2 = z;
        C2608q2 c2608q22 = c2608q2;
        C2554n2 c2554n22 = c2554n2;
        return c.a(abstractC2731x0, networkSettings, c2554n22, c2392e1, c2608q22, i3, z2);
    }

    public final void a(C2608q2 c2608q2) {
        Intrinsics.checkNotNullParameter(c2608q2, "<set-?>");
        this.e = c2608q2;
    }

    public final void a(C2623r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.h.b(performance);
    }

    public /* synthetic */ C(AbstractC2731x0 abstractC2731x0, NetworkSettings networkSettings, C2554n2 c2554n2, C2392e1 c2392e1, C2608q2 c2608q2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC2731x0, networkSettings, c2554n2, c2392e1, c2608q2, i, (i2 & 64) != 0 ? false : z);
    }
}
