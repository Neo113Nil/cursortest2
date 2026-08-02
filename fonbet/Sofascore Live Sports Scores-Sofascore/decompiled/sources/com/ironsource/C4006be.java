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
/* renamed from: com.ironsource.be, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4006be extends AbstractC4386x0 {

    @NotNull
    public static final a z = new a(null);

    @NotNull
    private final C4100h0 t;
    private final boolean u;

    @NotNull
    private final C4368w0 v;

    @NotNull
    private final C4042de w;

    @NotNull
    private final String x;

    @NotNull
    private final String y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4006be(@NotNull C4100h0 c4100h0, boolean z2, @NotNull C4368w0 c4368w0, @NotNull C4042de c4042de) {
        super(c4100h0, z2, r3, r4, r5, r6, c4042de.g(), c4042de.h(), c4042de.j(), c4042de.b(), c4042de.c(), new M0(M0.a.MANUAL, c4042de.k().j(), c4042de.k().b(), -1L), c4042de.l(), c4042de.f(), c4042de.o(), c4042de.n(), false, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        c4100h0.getClass();
        c4368w0.getClass();
        c4042de.getClass();
        String f = c4368w0.f();
        List<NetworkSettings> d = c4368w0.d();
        C4181la e = c4368w0.e();
        C4263q2 k = c4042de.k();
        k.getClass();
        this.t = c4100h0;
        this.u = z2;
        this.v = c4368w0;
        this.w = c4042de;
        this.x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.y = Ta.b;
    }

    public static /* synthetic */ C4006be a(C4006be c4006be, C4100h0 c4100h0, boolean z2, C4368w0 c4368w0, C4042de c4042de, int i, Object obj) {
        if ((i & 1) != 0) {
            c4100h0 = c4006be.t;
        }
        if ((i & 2) != 0) {
            z2 = c4006be.u;
        }
        if ((i & 4) != 0) {
            c4368w0 = c4006be.v;
        }
        if ((i & 8) != 0) {
            c4042de = c4006be.w;
        }
        return c4006be.a(c4100h0, z2, c4368w0, c4042de);
    }

    @NotNull
    public final C4368w0 A() {
        return this.v;
    }

    @NotNull
    public final C4042de B() {
        return this.w;
    }

    @Override // com.ironsource.AbstractC4386x0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings networkSettings) {
        networkSettings.getClass();
        JSONObject rewardedVideoSettings = networkSettings.getRewardedVideoSettings();
        rewardedVideoSettings.getClass();
        return rewardedVideoSettings;
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
        if (!(obj instanceof C4006be)) {
            return false;
        }
        C4006be c4006be = (C4006be) obj;
        return Intrinsics.c(this.t, c4006be.t) && this.u == c4006be.u && Intrinsics.c(this.v, c4006be.v) && Intrinsics.c(this.w, c4006be.w);
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
        return "RewardedAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
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
    public final C4042de z() {
        return this.w;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.be$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C4006be a(@NotNull C4100h0 c4100h0, @Nullable Sa sa, boolean z) {
            List<C4398xc> list;
            Te d;
            c4100h0.getClass();
            AbstractC4386x0.a aVar = AbstractC4386x0.r;
            K3 c = (sa == null || (d = sa.d()) == null) ? null : d.c();
            C4042de f = c != null ? c.f() : null;
            if (f == null) {
                a70.l(c4100h0.a(), " configurations", "Error getting ");
                return null;
            }
            if (sa == null || (list = sa.d(c4100h0.e(), c4100h0.c())) == null) {
                list = km5.a;
            }
            String f2 = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4398xc) it.next()).f());
            }
            C4181la b = C4181la.b();
            b.getClass();
            return new C4006be(c4100h0, z, new C4368w0(f2, arrayList, b), f);
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
    public final C4006be a(@NotNull C4100h0 c4100h0, boolean z2, @NotNull C4368w0 c4368w0, @NotNull C4042de c4042de) {
        c4100h0.getClass();
        c4368w0.getClass();
        c4042de.getClass();
        return new C4006be(c4100h0, z2, c4368w0, c4042de);
    }
}
