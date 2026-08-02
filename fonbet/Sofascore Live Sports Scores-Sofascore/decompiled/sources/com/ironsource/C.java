package com.ironsource;

import com.ironsource.C4278r0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import defpackage.wt3;
import defpackage.wv8;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class C {

    @NotNull
    private final AbstractC4386x0 a;

    @NotNull
    private final NetworkSettings b;

    @NotNull
    private final C4173l2 c;

    @NotNull
    private final C4011c1 d;

    @NotNull
    private C4227o2 e;
    private final int f;
    private final boolean g;

    @NotNull
    private final J h;

    @NotNull
    private final IronSource.a i;

    @Nullable
    private final JSONObject j;

    @NotNull
    private final String k;
    private final int l;

    @NotNull
    private final String m;

    @Nullable
    private final C4227o2 n;

    @NotNull
    private final String o;

    @NotNull
    private final String p;
    private final int q;

    @NotNull
    private final AdData r;

    public C(@NotNull AbstractC4386x0 abstractC4386x0, @NotNull NetworkSettings networkSettings, @NotNull C4173l2 c4173l2, @NotNull C4011c1 c4011c1, @NotNull C4227o2 c4227o2, int i, boolean z) {
        abstractC4386x0.getClass();
        networkSettings.getClass();
        c4173l2.getClass();
        c4011c1.getClass();
        c4227o2.getClass();
        this.a = abstractC4386x0;
        this.b = networkSettings;
        this.c = c4173l2;
        this.d = c4011c1;
        this.e = c4227o2;
        this.f = i;
        this.g = z;
        this.h = new J(C4278r0.a.DidntAttemptToLoad);
        IronSource.a a = abstractC4386x0.b().a();
        this.i = a;
        this.j = c4173l2.h();
        this.k = c4173l2.g();
        this.l = c4173l2.i();
        this.m = c4173l2.f();
        this.n = c4173l2.j();
        String f = c4011c1.f();
        f.getClass();
        this.o = f;
        this.p = String.format("%s %s", Arrays.copyOf(new Object[]{f, Integer.valueOf(hashCode())}, 2));
        this.q = c4011c1.d();
        String k = this.e.k();
        Map<String, Object> a2 = C4110ha.a(this.e.a());
        a2.getClass();
        a2.put("adUnit", a);
        HashMap hashMap = new HashMap();
        Map<String, Object> a3 = C4110ha.a(c4011c1.c());
        a3.getClass();
        hashMap.putAll(a3);
        a2.put("userId", abstractC4386x0.r());
        a2.put("adUnitId", abstractC4386x0.b().c());
        a2.put("isMultipleAdUnits", Boolean.TRUE);
        this.r = new AdData(k, hashMap, a2);
    }

    public static /* synthetic */ C a(C c, AbstractC4386x0 abstractC4386x0, NetworkSettings networkSettings, C4173l2 c4173l2, C4011c1 c4011c1, C4227o2 c4227o2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC4386x0 = c.a;
        }
        if ((i2 & 2) != 0) {
            networkSettings = c.b;
        }
        if ((i2 & 4) != 0) {
            c4173l2 = c.c;
        }
        if ((i2 & 8) != 0) {
            c4011c1 = c.d;
        }
        if ((i2 & 16) != 0) {
            c4227o2 = c.e;
        }
        if ((i2 & 32) != 0) {
            i = c.f;
        }
        if ((i2 & 64) != 0) {
            z = c.g;
        }
        int i3 = i;
        boolean z2 = z;
        C4227o2 c4227o22 = c4227o2;
        C4173l2 c4173l22 = c4173l2;
        return c.a(abstractC4386x0, networkSettings, c4173l22, c4011c1, c4227o22, i3, z2);
    }

    @NotNull
    public final NetworkSettings b() {
        return this.b;
    }

    @NotNull
    public final C4173l2 c() {
        return this.c;
    }

    @NotNull
    public final C4011c1 d() {
        return this.d;
    }

    @NotNull
    public final C4227o2 e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c = (C) obj;
        return Intrinsics.c(this.a, c.a) && Intrinsics.c(this.b, c.b) && Intrinsics.c(this.c, c.c) && Intrinsics.c(this.d, c.d) && Intrinsics.c(this.e, c.e) && this.f == c.f && this.g == c.g;
    }

    public final int f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    @NotNull
    public final AdData h() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = wv8.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a + i;
    }

    @NotNull
    public final IronSource.a i() {
        return this.i;
    }

    @NotNull
    public final AbstractC4386x0 j() {
        return this.a;
    }

    @NotNull
    public final C4011c1 k() {
        return this.d;
    }

    @NotNull
    public final C4173l2 l() {
        return this.c;
    }

    @NotNull
    public final String m() {
        return this.m;
    }

    @NotNull
    public final String n() {
        return this.k;
    }

    @NotNull
    public final C4227o2 o() {
        return this.e;
    }

    public final int p() {
        return this.l;
    }

    @Nullable
    public final C4227o2 q() {
        return this.n;
    }

    @Nullable
    public final JSONObject r() {
        return this.j;
    }

    @NotNull
    public final String s() {
        return this.o;
    }

    public final int t() {
        return this.q;
    }

    @NotNull
    public String toString() {
        AbstractC4386x0 abstractC4386x0 = this.a;
        NetworkSettings networkSettings = this.b;
        C4173l2 c4173l2 = this.c;
        C4011c1 c4011c1 = this.d;
        C4227o2 c4227o2 = this.e;
        int i = this.f;
        boolean z = this.g;
        StringBuilder sb = new StringBuilder("AdInstanceData(adUnitData=");
        sb.append(abstractC4386x0);
        sb.append(", providerSettings=");
        sb.append(networkSettings);
        sb.append(", auctionData=");
        sb.append(c4173l2);
        sb.append(", adapterConfig=");
        sb.append(c4011c1);
        sb.append(", auctionResponseItem=");
        sb.append(c4227o2);
        sb.append(", sessionDepth=");
        sb.append(i);
        sb.append(", isPreloaded=");
        return wt3.p(sb, z, ")");
    }

    @NotNull
    public final J u() {
        return this.h;
    }

    @NotNull
    public final NetworkSettings v() {
        return this.b;
    }

    public final int w() {
        return this.f;
    }

    @NotNull
    public final String x() {
        return this.p;
    }

    public final boolean y() {
        return this.g;
    }

    @NotNull
    public final C a(@NotNull AbstractC4386x0 abstractC4386x0, @NotNull NetworkSettings networkSettings, @NotNull C4173l2 c4173l2, @NotNull C4011c1 c4011c1, @NotNull C4227o2 c4227o2, int i, boolean z) {
        abstractC4386x0.getClass();
        networkSettings.getClass();
        c4173l2.getClass();
        c4011c1.getClass();
        c4227o2.getClass();
        return new C(abstractC4386x0, networkSettings, c4173l2, c4011c1, c4227o2, i, z);
    }

    @NotNull
    public final AbstractC4386x0 a() {
        return this.a;
    }

    public final void a(@NotNull C4227o2 c4227o2) {
        c4227o2.getClass();
        this.e = c4227o2;
    }

    public final void a(@NotNull C4278r0.a aVar) {
        aVar.getClass();
        this.h.b(aVar);
    }

    public /* synthetic */ C(AbstractC4386x0 abstractC4386x0, NetworkSettings networkSettings, C4173l2 c4173l2, C4011c1 c4011c1, C4227o2 c4227o2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4386x0, networkSettings, c4173l2, c4011c1, c4227o2, i, (i2 & 64) != 0 ? false : z);
    }
}
