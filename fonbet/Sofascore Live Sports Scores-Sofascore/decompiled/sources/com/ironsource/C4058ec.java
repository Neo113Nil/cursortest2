package com.ironsource;

import com.ironsource.AbstractC4386x0;
import com.ironsource.M0;
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
/* renamed from: com.ironsource.ec, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4058ec extends AbstractC4386x0 {

    @NotNull
    public static final a y = new a(null);

    @NotNull
    private final C4100h0 t;

    @NotNull
    private final C4368w0 u;

    @NotNull
    private final Pb v;

    @NotNull
    private final String w;

    @NotNull
    private final String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4058ec(@NotNull C4100h0 c4100h0, @NotNull C4368w0 c4368w0, @NotNull Pb pb) {
        super(c4100h0, true, c4368w0.f(), c4368w0.d(), c4368w0.e(), pb.d(), pb.b(), (int) (pb.c() / 1000), pb.a(), pb.f(), -1, new M0(M0.a.MANUAL, pb.d().j(), pb.d().b(), -1L), pb.h(), pb.i(), pb.k(), pb.j(), false, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        c4100h0.getClass();
        c4368w0.getClass();
        pb.getClass();
        this.t = c4100h0;
        this.u = c4368w0;
        this.v = pb;
        this.w = "NA";
        this.x = Ta.e;
    }

    public static /* synthetic */ C4058ec a(C4058ec c4058ec, C4100h0 c4100h0, C4368w0 c4368w0, Pb pb, int i, Object obj) {
        if ((i & 1) != 0) {
            c4100h0 = c4058ec.t;
        }
        if ((i & 2) != 0) {
            c4368w0 = c4058ec.u;
        }
        if ((i & 4) != 0) {
            pb = c4058ec.v;
        }
        return c4058ec.a(c4100h0, c4368w0, pb);
    }

    @NotNull
    public final Pb A() {
        return this.v;
    }

    @Override // com.ironsource.AbstractC4386x0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings networkSettings) {
        networkSettings.getClass();
        JSONObject nativeAdSettings = networkSettings.getNativeAdSettings();
        nativeAdSettings.getClass();
        return nativeAdSettings;
    }

    @Override // com.ironsource.AbstractC4386x0
    @NotNull
    public String c() {
        return this.w;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4058ec)) {
            return false;
        }
        C4058ec c4058ec = (C4058ec) obj;
        return Intrinsics.c(this.t, c4058ec.t) && Intrinsics.c(this.u, c4058ec.u) && Intrinsics.c(this.v, c4058ec.v);
    }

    public int hashCode() {
        return this.v.hashCode() + ((this.u.hashCode() + (this.t.hashCode() * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC4386x0
    @NotNull
    public String j() {
        return this.x;
    }

    @NotNull
    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.t + ", adUnitCommonData=" + this.u + ", configs=" + this.v + ")";
    }

    @NotNull
    public final C4100h0 w() {
        return this.t;
    }

    @NotNull
    public final C4368w0 x() {
        return this.u;
    }

    @NotNull
    public final Pb y() {
        return this.v;
    }

    @NotNull
    public final C4368w0 z() {
        return this.u;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ec$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C4058ec a(@NotNull C4100h0 c4100h0, @Nullable Sa sa) {
            List<C4398xc> list;
            Te d;
            c4100h0.getClass();
            AbstractC4386x0.a aVar = AbstractC4386x0.r;
            K3 c = (sa == null || (d = sa.d()) == null) ? null : d.c();
            Pb e = c != null ? c.e() : null;
            if (e == null) {
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
            return new C4058ec(c4100h0, new C4368w0(f, arrayList, b), e);
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
    public final C4058ec a(@NotNull C4100h0 c4100h0, @NotNull C4368w0 c4368w0, @NotNull Pb pb) {
        c4100h0.getClass();
        c4368w0.getClass();
        pb.getClass();
        return new C4058ec(c4100h0, c4368w0, pb);
    }
}
