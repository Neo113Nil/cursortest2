package com.ironsource;

import com.ironsource.AbstractC4386x0;
import com.ironsource.M0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
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
public final class B9 extends AbstractC4386x0 {

    @NotNull
    public static final a z = new a(null);

    @NotNull
    private final C4100h0 t;
    private final boolean u;

    @NotNull
    private final C4368w0 v;

    @NotNull
    private final D9 w;

    @NotNull
    private final String x;

    @NotNull
    private final String y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B9(@NotNull C4100h0 c4100h0, boolean z2, @NotNull C4368w0 c4368w0, @NotNull D9 d9) {
        super(c4100h0, z2, r3, r4, r5, r6, d9.c(), d9.d(), d9.f(), d9.b(), -1, new M0(M0.a.MANUAL, d9.g().j(), d9.g().b(), -1L), d9.h(), d9.k(), d9.m(), d9.l(), false, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        c4100h0.getClass();
        c4368w0.getClass();
        d9.getClass();
        String f = c4368w0.f();
        List<NetworkSettings> d = c4368w0.d();
        C4181la e = c4368w0.e();
        C4263q2 g = d9.g();
        g.getClass();
        this.t = c4100h0;
        this.u = z2;
        this.v = c4368w0;
        this.w = d9;
        this.x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.y = Ta.c;
    }

    public static /* synthetic */ B9 a(B9 b9, C4100h0 c4100h0, boolean z2, C4368w0 c4368w0, D9 d9, int i, Object obj) {
        if ((i & 1) != 0) {
            c4100h0 = b9.t;
        }
        if ((i & 2) != 0) {
            z2 = b9.u;
        }
        if ((i & 4) != 0) {
            c4368w0 = b9.v;
        }
        if ((i & 8) != 0) {
            d9 = b9.w;
        }
        return b9.a(c4100h0, z2, c4368w0, d9);
    }

    @NotNull
    public final C4368w0 A() {
        return this.v;
    }

    @NotNull
    public final D9 B() {
        return this.w;
    }

    @Override // com.ironsource.AbstractC4386x0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings networkSettings) {
        networkSettings.getClass();
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        interstitialSettings.getClass();
        return interstitialSettings;
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
        if (!(obj instanceof B9)) {
            return false;
        }
        B9 b9 = (B9) obj;
        return Intrinsics.c(this.t, b9.t) && this.u == b9.u && Intrinsics.c(this.v, b9.v) && Intrinsics.c(this.w, b9.w);
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
        return "InterstitialAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC4386x0
    public boolean u() {
        return this.u;
    }

    @NotNull
    public final C4100h0 w() {
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
    public final D9 z() {
        return this.w;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final B9 a(@NotNull C4100h0 c4100h0, @Nullable Sa sa, boolean z) {
            List<C4398xc> list;
            Te d;
            c4100h0.getClass();
            AbstractC4386x0.a aVar = AbstractC4386x0.r;
            K3 c = (sa == null || (d = sa.d()) == null) ? null : d.c();
            D9 d2 = c != null ? c.d() : null;
            if (d2 == null) {
                a70.l(c4100h0.a(), " configurations", "Error getting ");
                return null;
            }
            if (sa == null || (list = sa.d(c4100h0.e(), c4100h0.c())) == null) {
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
            return new B9(c4100h0, z, new C4368w0(f, arrayList, b), d2);
        }

        private a() {
        }
    }

    @Override // com.ironsource.AbstractC4386x0
    @NotNull
    public C4100h0 b() {
        return this.t;
    }

    @NotNull
    public final B9 a(@NotNull C4100h0 c4100h0, boolean z2, @NotNull C4368w0 c4368w0, @NotNull D9 d9) {
        c4100h0.getClass();
        c4368w0.getClass();
        d9.getClass();
        return new B9(c4100h0, z2, c4368w0, d9);
    }
}
