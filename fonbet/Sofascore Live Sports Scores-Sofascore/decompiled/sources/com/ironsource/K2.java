package com.ironsource;

import com.ironsource.AbstractC4386x0;
import com.ironsource.M0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.a70;
import defpackage.k13;
import defpackage.km5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class K2 extends AbstractC4386x0 {

    @NotNull
    public static final a z = new a(null);

    @NotNull
    private final H2 t;
    private final boolean u;

    @NotNull
    private final C4368w0 v;

    @NotNull
    private final S2 w;

    @NotNull
    private final String x;

    @NotNull
    private final String y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public K2(@NotNull H2 h2, boolean z2, @NotNull C4368w0 c4368w0, @NotNull S2 s2) {
        super(h2, z2, r3, r4, r5, r6, s2.a(), (int) (s2.b() / 1000), s2.c(), s2.f(), -1, new M0(M0.a.MANUAL_WITH_AUTOMATIC_RELOAD, s2.d().j(), s2.d().b(), 1000 * s2.h()), s2.e(), s2.l(), s2.n(), s2.m(), false, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        h2.getClass();
        c4368w0.getClass();
        s2.getClass();
        String f = c4368w0.f();
        List<NetworkSettings> d = c4368w0.d();
        C4181la e = c4368w0.e();
        C4263q2 d2 = s2.d();
        d2.getClass();
        this.t = h2;
        this.u = z2;
        this.v = c4368w0;
        this.w = s2;
        this.x = "BN";
        this.y = Ta.d;
    }

    @Override // com.ironsource.AbstractC4386x0
    @NotNull
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public H2 b() {
        return this.t;
    }

    @NotNull
    public final C4368w0 B() {
        return this.v;
    }

    @NotNull
    public final S2 C() {
        return this.w;
    }

    @Override // com.ironsource.AbstractC4386x0
    @NotNull
    public AdData a(@NotNull NetworkSettings networkSettings) {
        networkSettings.getClass();
        AdData createAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(networkSettings), b().a(), r(), new com.ironsource.mediationsdk.o(ContextProvider.getInstance().getApplicationContext(), new C4189m0().b(b().i())));
        createAdDataForNetworkAdapter.getClass();
        return createAdDataForNetworkAdapter;
    }

    @Override // com.ironsource.AbstractC4386x0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings networkSettings) {
        networkSettings.getClass();
        JSONObject bannerSettings = networkSettings.getBannerSettings();
        bannerSettings.getClass();
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC4386x0
    @NotNull
    public String c() {
        return this.x;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K2)) {
            return false;
        }
        K2 k2 = (K2) obj;
        return Intrinsics.c(this.t, k2.t) && this.u == k2.u && Intrinsics.c(this.v, k2.v) && Intrinsics.c(this.w, k2.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.t.hashCode() * 31;
        boolean z2 = this.u;
        int i = z2;
        if (z2 != 0) {
            i = 1;
        }
        return this.w.hashCode() + ((this.v.hashCode() + ((hashCode + i) * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC4386x0
    @NotNull
    public String j() {
        return this.y;
    }

    @NotNull
    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC4386x0
    public boolean u() {
        return this.u;
    }

    @NotNull
    public final H2 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    @NotNull
    public final C4368w0 y() {
        return this.v;
    }

    @NotNull
    public final S2 z() {
        return this.w;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final K2 a(@NotNull H2 h2, @Nullable Sa sa, boolean z) {
            List<C4398xc> list;
            Te d;
            h2.getClass();
            AbstractC4386x0.a aVar = AbstractC4386x0.r;
            K3 c = (sa == null || (d = sa.d()) == null) ? null : d.c();
            S2 c2 = c != null ? c.c() : null;
            if (c2 == null) {
                a70.l(h2.a(), " configurations", "Error getting ");
                return null;
            }
            if (sa == null || (list = sa.d(h2.e(), h2.c())) == null) {
                list = km5.a;
            }
            String f = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4398xc) it.next()).f());
            }
            C4181la b = C4181la.b();
            b.getClass();
            return new K2(h2, z, new C4368w0(f, arrayList, b), c2);
        }

        private a() {
        }
    }

    public static /* synthetic */ K2 a(K2 k2, H2 h2, boolean z2, C4368w0 c4368w0, S2 s2, int i, Object obj) {
        if ((i & 1) != 0) {
            h2 = k2.t;
        }
        if ((i & 2) != 0) {
            z2 = k2.u;
        }
        if ((i & 4) != 0) {
            c4368w0 = k2.v;
        }
        if ((i & 8) != 0) {
            s2 = k2.w;
        }
        return k2.a(h2, z2, c4368w0, s2);
    }

    @NotNull
    public final K2 a(@NotNull H2 h2, boolean z2, @NotNull C4368w0 c4368w0, @NotNull S2 s2) {
        h2.getClass();
        c4368w0.getClass();
        s2.getClass();
        return new K2(h2, z2, c4368w0, s2);
    }
}
