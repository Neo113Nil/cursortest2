package io.radar.sdk;

import Gh.B;
import Gh.C1164a;
import Gh.C1165b;
import Gh.h;
import Gh.y;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import io.radar.sdk.C4589c;
import io.radar.sdk.H0;
import io.radar.sdk.N0;
import io.radar.sdk.T;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: io.radar.sdk.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4589c {

    /* renamed from: a, reason: collision with root package name */
    public static final C4589c f49918a = new C4589c();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f49919b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f49920c;

    /* renamed from: d, reason: collision with root package name */
    public static Context f49921d;

    /* renamed from: e, reason: collision with root package name */
    public static Activity f49922e;

    /* renamed from: f, reason: collision with root package name */
    public static Handler f49923f;

    /* renamed from: g, reason: collision with root package name */
    public static K0 f49924g;

    /* renamed from: h, reason: collision with root package name */
    public static b1 f49925h;

    /* renamed from: i, reason: collision with root package name */
    public static G0 f49926i;

    /* renamed from: j, reason: collision with root package name */
    public static io.radar.sdk.T f49927j;

    /* renamed from: k, reason: collision with root package name */
    public static E0 f49928k;

    /* renamed from: l, reason: collision with root package name */
    public static C4629j0 f49929l;

    /* renamed from: m, reason: collision with root package name */
    public static Hh.d f49930m;

    /* renamed from: n, reason: collision with root package name */
    public static Hh.e f49931n;

    /* renamed from: o, reason: collision with root package name */
    public static C4619e0 f49932o;

    /* renamed from: p, reason: collision with root package name */
    public static X0 f49933p;

    /* renamed from: io.radar.sdk.c$A */
    public static final class A implements T.n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4610v f49934a;

        public A(InterfaceC4610v interfaceC4610v) {
            this.f49934a = interfaceC4610v;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC4610v interfaceC4610v, EnumC4607s status, Gh.B b10, Gh.h[] hVarArr) {
            Intrinsics.checkNotNullParameter(status, "$status");
            if (interfaceC4610v != null) {
                interfaceC4610v.a(status, b10, hVarArr);
            }
        }

        @Override // io.radar.sdk.T.n
        public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.B b10, final Gh.h[] hVarArr) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == EnumC4607s.SUCCESS || status == EnumC4607s.ERROR_NOT_FOUND) {
                L0 l02 = L0.f49705a;
                Context context = C4589c.f49921d;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                l02.a0(context, null);
                C4589c c4589c = C4589c.f49918a;
                c4589c.x().D();
                c4589c.x().m(null);
            }
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4610v interfaceC4610v = this.f49934a;
            t10.post(new Runnable() { // from class: io.radar.sdk.f
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.A.c(C4589c.InterfaceC4610v.this, status, b10, hVarArr);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$B */
    public static final class B implements T.InterfaceC4582f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Hh.b f49935a;

        public B(Hh.b bVar) {
            this.f49935a = bVar;
        }

        @Override // io.radar.sdk.T.InterfaceC4582f
        public void a(EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f49935a.a(status == EnumC4607s.SUCCESS);
        }
    }

    /* renamed from: io.radar.sdk.c$C */
    public static final class C implements T.InterfaceC4584h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Hh.b f49936a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f49937b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4608t f49938c;

        public C(Hh.b bVar, JSONObject jSONObject, InterfaceC4608t interfaceC4608t) {
            this.f49936a = bVar;
            this.f49937b = jSONObject;
            this.f49938c = interfaceC4608t;
        }

        public static final void c(InterfaceC4608t interfaceC4608t, EnumC4607s status) {
            Intrinsics.checkNotNullParameter(status, "$status");
            if (interfaceC4608t != null) {
                InterfaceC4608t.a.a(interfaceC4608t, status, null, null, null, 14, null);
            }
        }

        @Override // io.radar.sdk.T.InterfaceC4584h
        public void a(final EnumC4607s status, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == EnumC4607s.SUCCESS) {
                G0.b(C4589c.f49918a.y(), "Successfully flushed replays", null, null, 6, null);
                this.f49936a.a(true);
                C4589c.h();
            } else if (this.f49937b != null) {
                G0.b(C4589c.f49918a.y(), "Failed to flush replays, adding track update to buffer", null, null, 6, null);
                C4589c.c(this.f49937b);
            }
            C4589c c4589c = C4589c.f49918a;
            c4589c.A0(false);
            Handler t10 = c4589c.t();
            final InterfaceC4608t interfaceC4608t = this.f49938c;
            t10.post(new Runnable() { // from class: io.radar.sdk.g
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.C.c(C4589c.InterfaceC4608t.this, status);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$D */
    public static final class D implements T.InterfaceC4579c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4593e f49939a;

        public D(InterfaceC4593e interfaceC4593e) {
            this.f49939a = interfaceC4593e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC4593e callback, EnumC4607s status, C1164a[] c1164aArr) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            callback.a(status, c1164aArr);
        }

        @Override // io.radar.sdk.T.InterfaceC4579c
        public void a(final EnumC4607s status, JSONObject jSONObject, final C1164a[] c1164aArr) {
            Intrinsics.checkNotNullParameter(status, "status");
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4593e interfaceC4593e = this.f49939a;
            t10.post(new Runnable() { // from class: io.radar.sdk.h
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.D.c(C4589c.InterfaceC4593e.this, status, c1164aArr);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$E */
    public static final class E implements InterfaceC4595g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4592d f49940a;

        /* renamed from: io.radar.sdk.c$E$a */
        public static final class a implements T.InterfaceC4577a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4592d f49941a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Location f49942b;

            public a(InterfaceC4592d interfaceC4592d, Location location) {
                this.f49941a = interfaceC4592d;
                this.f49942b = location;
            }

            public static final void c(InterfaceC4592d callback, EnumC4607s status, Location location, Gh.f fVar) {
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(status, "$status");
                callback.a(status, location, fVar);
            }

            @Override // io.radar.sdk.T.InterfaceC4577a
            public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.f fVar) {
                Intrinsics.checkNotNullParameter(status, "status");
                Handler t10 = C4589c.f49918a.t();
                final InterfaceC4592d interfaceC4592d = this.f49941a;
                final Location location = this.f49942b;
                t10.post(new Runnable() { // from class: io.radar.sdk.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4589c.E.a.c(C4589c.InterfaceC4592d.this, status, location, fVar);
                    }
                });
            }
        }

        public E(InterfaceC4592d interfaceC4592d) {
            this.f49940a = interfaceC4592d;
        }

        public static final void c(InterfaceC4592d callback, EnumC4607s status) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            InterfaceC4592d.a.a(callback, status, null, null, 6, null);
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4595g
        public void a(final EnumC4607s status, Location location, boolean z10) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == EnumC4607s.SUCCESS && location != null) {
                C4589c.f49918a.l().g(location, new a(this.f49940a, location));
                return;
            }
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4592d interfaceC4592d = this.f49940a;
            t10.post(new Runnable() { // from class: io.radar.sdk.i
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.E.c(C4589c.InterfaceC4592d.this, status);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$F */
    public static final class F implements T.InterfaceC4577a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4592d f49943a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Location f49944b;

        public F(InterfaceC4592d interfaceC4592d, Location location) {
            this.f49943a = interfaceC4592d;
            this.f49944b = location;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC4592d callback, EnumC4607s status, Location location, Gh.f fVar) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            Intrinsics.checkNotNullParameter(location, "$location");
            callback.a(status, location, fVar);
        }

        @Override // io.radar.sdk.T.InterfaceC4577a
        public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.f fVar) {
            Intrinsics.checkNotNullParameter(status, "status");
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4592d interfaceC4592d = this.f49943a;
            final Location location = this.f49944b;
            t10.post(new Runnable() { // from class: io.radar.sdk.k
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.F.c(C4589c.InterfaceC4592d.this, status, location, fVar);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$G */
    public static final class G implements InterfaceC4595g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Location f49945a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EnumSet f49946b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EnumC4604p f49947c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4602n f49948d;

        /* renamed from: io.radar.sdk.c$G$a */
        public static final class a implements T.InterfaceC4578b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4602n f49949a;

            public a(InterfaceC4602n interfaceC4602n) {
                this.f49949a = interfaceC4602n;
            }

            public static final void c(InterfaceC4602n callback, EnumC4607s status, Gh.x xVar) {
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(status, "$status");
                callback.a(status, xVar);
            }

            @Override // io.radar.sdk.T.InterfaceC4578b
            public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.x xVar) {
                Intrinsics.checkNotNullParameter(status, "status");
                Handler t10 = C4589c.f49918a.t();
                final InterfaceC4602n interfaceC4602n = this.f49949a;
                t10.post(new Runnable() { // from class: io.radar.sdk.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4589c.G.a.c(C4589c.InterfaceC4602n.this, status, xVar);
                    }
                });
            }
        }

        public G(Location location, EnumSet enumSet, EnumC4604p enumC4604p, InterfaceC4602n interfaceC4602n) {
            this.f49945a = location;
            this.f49946b = enumSet;
            this.f49947c = enumC4604p;
            this.f49948d = interfaceC4602n;
        }

        public static final void c(InterfaceC4602n callback, EnumC4607s status) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            InterfaceC4602n.a.a(callback, status, null, 2, null);
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4595g
        public void a(final EnumC4607s status, Location location, boolean z10) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == EnumC4607s.SUCCESS && location != null) {
                C4589c.f49918a.l().h(location, this.f49945a, this.f49946b, this.f49947c, -1, new a(this.f49948d));
                return;
            }
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4602n interfaceC4602n = this.f49948d;
            t10.post(new Runnable() { // from class: io.radar.sdk.l
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.G.c(C4589c.InterfaceC4602n.this, status);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$H */
    public static final class H implements T.InterfaceC4578b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4602n f49950a;

        public H(InterfaceC4602n interfaceC4602n) {
            this.f49950a = interfaceC4602n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC4602n callback, EnumC4607s status, Gh.x xVar) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            callback.a(status, xVar);
        }

        @Override // io.radar.sdk.T.InterfaceC4578b
        public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.x xVar) {
            Intrinsics.checkNotNullParameter(status, "status");
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4602n interfaceC4602n = this.f49950a;
            t10.post(new Runnable() { // from class: io.radar.sdk.n
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.H.c(C4589c.InterfaceC4602n.this, status, xVar);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$I */
    public static final class I implements InterfaceC4595g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4595g f49951a;

        public I(InterfaceC4595g interfaceC4595g) {
            this.f49951a = interfaceC4595g;
        }

        public static final void c(InterfaceC4595g interfaceC4595g, EnumC4607s status, Location location, boolean z10) {
            Intrinsics.checkNotNullParameter(status, "$status");
            if (interfaceC4595g != null) {
                interfaceC4595g.a(status, location, z10);
            }
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4595g
        public void a(final EnumC4607s status, final Location location, final boolean z10) {
            Intrinsics.checkNotNullParameter(status, "status");
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4595g interfaceC4595g = this.f49951a;
            t10.post(new Runnable() { // from class: io.radar.sdk.o
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.I.c(C4589c.InterfaceC4595g.this, status, location, z10);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$J */
    public static final class J implements T.InterfaceC4583g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4601m f49952a;

        public J(InterfaceC4601m interfaceC4601m) {
            this.f49952a = interfaceC4601m;
        }

        public static final void c(InterfaceC4601m callback, EnumC4607s status, Gh.w wVar) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            callback.a(status, wVar);
        }

        @Override // io.radar.sdk.T.InterfaceC4583g
        public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.w wVar) {
            Intrinsics.checkNotNullParameter(status, "status");
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4601m interfaceC4601m = this.f49952a;
            t10.post(new Runnable() { // from class: io.radar.sdk.p
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.J.c(C4589c.InterfaceC4601m.this, status, wVar);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$K */
    public static final class K implements T.InterfaceC4580d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f49953a;

        public K(Context context) {
            this.f49953a = context;
        }

        @Override // io.radar.sdk.T.InterfaceC4580d
        public void a(EnumC4607s status, Gh.e eVar) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (eVar == null) {
                return;
            }
            if (status == EnumC4607s.SUCCESS) {
                C4589c.f49918a.x().O(eVar.b());
                L0.f49705a.W(this.f49953a, eVar.b().b());
            }
            L0 l02 = L0.f49705a;
            Gh.y s10 = l02.s(this.f49953a);
            if (s10.f() && !l02.w(this.f49953a)) {
                C4589c.N0(C4589c.C());
            }
            if (s10.g()) {
                C4589c.Y0(null, 1, null);
            }
        }
    }

    /* renamed from: io.radar.sdk.c$L */
    public static final class L implements T.InterfaceC4581e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4594f f49954a;

        public L(InterfaceC4594f interfaceC4594f) {
            this.f49954a = interfaceC4594f;
        }

        public static final void c(InterfaceC4594f callback, EnumC4607s status, C1164a c1164a, boolean z10) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            callback.a(status, c1164a, z10);
        }

        @Override // io.radar.sdk.T.InterfaceC4581e
        public void a(final EnumC4607s status, JSONObject jSONObject, final C1164a c1164a, final boolean z10) {
            Intrinsics.checkNotNullParameter(status, "status");
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4594f interfaceC4594f = this.f49954a;
            t10.post(new Runnable() { // from class: io.radar.sdk.q
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.L.c(C4589c.InterfaceC4594f.this, status, c1164a, z10);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$M */
    public static final class M implements InterfaceC4608t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49955a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f49956b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4598j f49957c;

        public M(String str, JSONObject jSONObject, InterfaceC4598j interfaceC4598j) {
            this.f49955a = str;
            this.f49956b = jSONObject;
            this.f49957c = interfaceC4598j;
        }

        public static final void c(InterfaceC4598j callback, EnumC4607s status) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            InterfaceC4598j.a.a(callback, status, null, 2, null);
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4608t
        public void a(final EnumC4607s status, Location location, Gh.h[] hVarArr, Gh.C c10) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == EnumC4607s.SUCCESS && location != null) {
                C4589c.s0(this.f49955a, this.f49956b, this.f49957c);
                return;
            }
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4598j interfaceC4598j = this.f49957c;
            t10.post(new Runnable() { // from class: io.radar.sdk.r
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.M.c(C4589c.InterfaceC4598j.this, status);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$N */
    public static final class N implements InterfaceC4598j {
        @Override // io.radar.sdk.C4589c.InterfaceC4598j
        public void a(EnumC4607s status, Gh.h hVar) {
            Intrinsics.checkNotNullParameter(status, "status");
            G0 y10 = C4589c.f49918a.y();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Conversion name = ");
            sb2.append(hVar != null ? hVar.b() : null);
            sb2.append(": status = ");
            sb2.append(status);
            sb2.append("; event = ");
            sb2.append(hVar);
            G0.g(y10, sb2.toString(), null, null, 6, null);
        }
    }

    /* renamed from: io.radar.sdk.c$O */
    public static final class O implements T.InterfaceC4578b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EnumC4603o f49958a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f49959b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4608t f49960c;

        /* renamed from: io.radar.sdk.c$O$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC4603o.values().length];
                iArr[EnumC4603o.FOOT.ordinal()] = 1;
                iArr[EnumC4603o.BIKE.ordinal()] = 2;
                iArr[EnumC4603o.CAR.ordinal()] = 3;
                iArr[EnumC4603o.TRUCK.ordinal()] = 4;
                iArr[EnumC4603o.MOTORBIKE.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: io.radar.sdk.c$O$b */
        public static final class b implements Runnable {
            final /* synthetic */ Gh.g[] $coordinates;

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f49961a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f49962b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4608t f49963c;

            /* renamed from: io.radar.sdk.c$O$b$a */
            public static final class a implements T.m {
                final /* synthetic */ Gh.g[] $coordinates;

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Ref.IntRef f49964a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f49965b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Ref.IntRef f49966c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ InterfaceC4608t f49967d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Location f49968e;

                public a(Ref.IntRef intRef, Gh.g[] gVarArr, b bVar, Ref.IntRef intRef2, InterfaceC4608t interfaceC4608t, Location location) {
                    this.f49964a = intRef;
                    this.$coordinates = gVarArr;
                    this.f49965b = bVar;
                    this.f49966c = intRef2;
                    this.f49967d = interfaceC4608t;
                    this.f49968e = location;
                }

                public static final void c(InterfaceC4608t interfaceC4608t, EnumC4607s status, Location location, Gh.h[] hVarArr, Gh.C c10) {
                    Intrinsics.checkNotNullParameter(status, "$status");
                    Intrinsics.checkNotNullParameter(location, "$location");
                    if (interfaceC4608t != null) {
                        interfaceC4608t.a(status, location, hVarArr, c10);
                    }
                }

                @Override // io.radar.sdk.T.m
                public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.h[] hVarArr, final Gh.C c10, Gh.j[] jVarArr, Gh.e eVar, Gh.D d10) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    C4589c c4589c = C4589c.f49918a;
                    Handler t10 = c4589c.t();
                    final InterfaceC4608t interfaceC4608t = this.f49967d;
                    final Location location = this.f49968e;
                    t10.post(new Runnable() { // from class: io.radar.sdk.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4589c.O.b.a.c(C4589c.InterfaceC4608t.this, status, location, hVarArr, c10);
                        }
                    });
                    if (this.f49964a.element < this.$coordinates.length - 1) {
                        c4589c.t().postDelayed(this.f49965b, this.f49966c.element * 1000);
                    }
                    this.f49964a.element++;
                }
            }

            public b(Gh.g[] gVarArr, Ref.IntRef intRef, Ref.IntRef intRef2, InterfaceC4608t interfaceC4608t) {
                this.$coordinates = gVarArr;
                this.f49961a = intRef;
                this.f49962b = intRef2;
                this.f49963c = interfaceC4608t;
            }

            @Override // java.lang.Runnable
            public void run() {
                Gh.g gVar = this.$coordinates[this.f49961a.element];
                Location location = new Location("RadarSDK");
                location.setLatitude(gVar.a());
                location.setLongitude(gVar.b());
                location.setAccuracy(5.0f);
                int i10 = this.f49961a.element;
                boolean z10 = true;
                if (i10 != 0 && i10 != this.$coordinates.length - 1) {
                    z10 = false;
                }
                io.radar.sdk.T.t(C4589c.f49918a.l(), location, z10, false, EnumC4597i.MOCK_LOCATION, false, null, false, null, null, null, null, null, null, null, new a(this.f49961a, this.$coordinates, this, this.f49962b, this.f49963c, location), 16320, null);
            }
        }

        public O(EnumC4603o enumC4603o, int i10, InterfaceC4608t interfaceC4608t) {
            this.f49958a = enumC4603o;
            this.f49959b = i10;
            this.f49960c = interfaceC4608t;
        }

        public static final void c(InterfaceC4608t interfaceC4608t, EnumC4607s status) {
            Intrinsics.checkNotNullParameter(status, "$status");
            if (interfaceC4608t != null) {
                InterfaceC4608t.a.a(interfaceC4608t, status, null, null, null, 14, null);
            }
        }

        @Override // io.radar.sdk.T.InterfaceC4578b
        public void a(final EnumC4607s status, JSONObject jSONObject, Gh.x xVar) {
            Gh.s c10;
            Gh.v a10;
            Gh.s a11;
            Gh.v a12;
            Gh.s b10;
            Gh.v a13;
            Gh.s e10;
            Gh.v a14;
            Gh.s d10;
            Gh.v a15;
            Intrinsics.checkNotNullParameter(status, "status");
            int i10 = a.$EnumSwitchMapping$0[this.f49958a.ordinal()];
            Gh.g[] gVarArr = null;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (xVar != null && (d10 = xVar.d()) != null && (a15 = d10.a()) != null) {
                                gVarArr = a15.a();
                            }
                        } else if (xVar != null && (e10 = xVar.e()) != null && (a14 = e10.a()) != null) {
                            gVarArr = a14.a();
                        }
                    } else if (xVar != null && (b10 = xVar.b()) != null && (a13 = b10.a()) != null) {
                        gVarArr = a13.a();
                    }
                } else if (xVar != null && (a11 = xVar.a()) != null && (a12 = a11.a()) != null) {
                    gVarArr = a12.a();
                }
            } else if (xVar != null && (c10 = xVar.c()) != null && (a10 = c10.a()) != null) {
                gVarArr = a10.a();
            }
            if (gVarArr == null) {
                Handler t10 = C4589c.f49918a.t();
                final InterfaceC4608t interfaceC4608t = this.f49960c;
                t10.post(new Runnable() { // from class: io.radar.sdk.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4589c.O.c(C4589c.InterfaceC4608t.this, status);
                    }
                });
                return;
            }
            Ref.IntRef intRef = new Ref.IntRef();
            int i11 = this.f49959b;
            intRef.element = i11;
            if (i11 < 1) {
                intRef.element = 1;
            } else if (i11 > 60) {
                intRef.element = 60;
            }
            C4589c.f49918a.t().post(new b(gVarArr, new Ref.IntRef(), intRef, this.f49960c));
        }
    }

    /* renamed from: io.radar.sdk.c$P */
    public static final class P implements InterfaceC4595g {
        final /* synthetic */ String[] $layers;

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4593e f49969a;

        /* renamed from: io.radar.sdk.c$P$a */
        public static final class a implements T.InterfaceC4579c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4593e f49970a;

            public a(InterfaceC4593e interfaceC4593e) {
                this.f49970a = interfaceC4593e;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(InterfaceC4593e callback, EnumC4607s status, C1164a[] c1164aArr) {
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(status, "$status");
                callback.a(status, c1164aArr);
            }

            @Override // io.radar.sdk.T.InterfaceC4579c
            public void a(final EnumC4607s status, JSONObject jSONObject, final C1164a[] c1164aArr) {
                Intrinsics.checkNotNullParameter(status, "status");
                Handler t10 = C4589c.f49918a.t();
                final InterfaceC4593e interfaceC4593e = this.f49970a;
                t10.post(new Runnable() { // from class: io.radar.sdk.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4589c.P.a.c(C4589c.InterfaceC4593e.this, status, c1164aArr);
                    }
                });
            }
        }

        public P(String[] strArr, InterfaceC4593e interfaceC4593e) {
            this.$layers = strArr;
            this.f49969a = interfaceC4593e;
        }

        public static final void c(InterfaceC4593e callback, EnumC4607s status) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            InterfaceC4593e.a.a(callback, status, null, 2, null);
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4595g
        public void a(final EnumC4607s status, Location location, boolean z10) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == EnumC4607s.SUCCESS && location != null) {
                C4589c.f49918a.l().n(location, this.$layers, new a(this.f49969a));
                return;
            }
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4593e interfaceC4593e = this.f49969a;
            t10.post(new Runnable() { // from class: io.radar.sdk.u
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.P.c(C4589c.InterfaceC4593e.this, status);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$Q */
    public static final class Q implements T.InterfaceC4579c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4593e f49971a;

        public Q(InterfaceC4593e interfaceC4593e) {
            this.f49971a = interfaceC4593e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC4593e callback, EnumC4607s status, C1164a[] c1164aArr) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            callback.a(status, c1164aArr);
        }

        @Override // io.radar.sdk.T.InterfaceC4579c
        public void a(final EnumC4607s status, JSONObject jSONObject, final C1164a[] c1164aArr) {
            Intrinsics.checkNotNullParameter(status, "status");
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4593e interfaceC4593e = this.f49971a;
            t10.post(new Runnable() { // from class: io.radar.sdk.w
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.Q.c(C4589c.InterfaceC4593e.this, status, c1164aArr);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$R */
    public static final class R implements InterfaceC4595g {
        final /* synthetic */ String[] $tags;

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Integer f49972a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f49973b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Integer f49974c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Boolean f49975d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4605q f49976e;

        /* renamed from: io.radar.sdk.c$R$a */
        public static final class a implements T.j {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4605q f49977a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Location f49978b;

            public a(InterfaceC4605q interfaceC4605q, Location location) {
                this.f49977a = interfaceC4605q;
                this.f49978b = location;
            }

            public static final void c(InterfaceC4605q callback, EnumC4607s status, Location location, Gh.j[] jVarArr) {
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(status, "$status");
                callback.a(status, location, jVarArr);
            }

            @Override // io.radar.sdk.T.j
            public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.j[] jVarArr) {
                Intrinsics.checkNotNullParameter(status, "status");
                Handler t10 = C4589c.f49918a.t();
                final InterfaceC4605q interfaceC4605q = this.f49977a;
                final Location location = this.f49978b;
                t10.post(new Runnable() { // from class: io.radar.sdk.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4589c.R.a.c(C4589c.InterfaceC4605q.this, status, location, jVarArr);
                    }
                });
            }
        }

        public R(Integer num, String[] strArr, JSONObject jSONObject, Integer num2, Boolean bool, InterfaceC4605q interfaceC4605q) {
            this.f49972a = num;
            this.$tags = strArr;
            this.f49973b = jSONObject;
            this.f49974c = num2;
            this.f49975d = bool;
            this.f49976e = interfaceC4605q;
        }

        public static final void c(InterfaceC4605q callback, EnumC4607s status) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            InterfaceC4605q.a.a(callback, status, null, null, 6, null);
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4595g
        public void a(final EnumC4607s status, Location location, boolean z10) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == EnumC4607s.SUCCESS && location != null) {
                C4589c.f49918a.l().p(location, this.f49972a, this.$tags, this.f49973b, this.f49974c, this.f49975d, new a(this.f49976e, location));
                return;
            }
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4605q interfaceC4605q = this.f49976e;
            t10.post(new Runnable() { // from class: io.radar.sdk.x
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.R.c(C4589c.InterfaceC4605q.this, status);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$S */
    public static final class S implements T.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4605q f49979a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Location f49980b;

        public S(InterfaceC4605q interfaceC4605q, Location location) {
            this.f49979a = interfaceC4605q;
            this.f49980b = location;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC4605q callback, EnumC4607s status, Location near, Gh.j[] jVarArr) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            Intrinsics.checkNotNullParameter(near, "$near");
            callback.a(status, near, jVarArr);
        }

        @Override // io.radar.sdk.T.j
        public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.j[] jVarArr) {
            Intrinsics.checkNotNullParameter(status, "status");
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4605q interfaceC4605q = this.f49979a;
            final Location location = this.f49980b;
            t10.post(new Runnable() { // from class: io.radar.sdk.z
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.S.c(C4589c.InterfaceC4605q.this, status, location, jVarArr);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$T */
    public static final class T implements InterfaceC4595g {
        final /* synthetic */ String[] $categories;
        final /* synthetic */ String[] $chains;
        final /* synthetic */ String[] $countryCodes;
        final /* synthetic */ String[] $groups;

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f49981a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f49982b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Integer f49983c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4606r f49984d;

        /* renamed from: io.radar.sdk.c$T$a */
        public static final class a implements T.k {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4606r f49985a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Location f49986b;

            public a(InterfaceC4606r interfaceC4606r, Location location) {
                this.f49985a = interfaceC4606r;
                this.f49986b = location;
            }

            public static final void c(InterfaceC4606r callback, EnumC4607s status, Location location, Gh.o[] oVarArr) {
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(status, "$status");
                callback.a(status, location, oVarArr);
            }

            @Override // io.radar.sdk.T.k
            public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.o[] oVarArr) {
                Intrinsics.checkNotNullParameter(status, "status");
                Handler t10 = C4589c.f49918a.t();
                final InterfaceC4606r interfaceC4606r = this.f49985a;
                final Location location = this.f49986b;
                t10.post(new Runnable() { // from class: io.radar.sdk.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4589c.T.a.c(C4589c.InterfaceC4606r.this, status, location, oVarArr);
                    }
                });
            }
        }

        public T(int i10, String[] strArr, Map map, String[] strArr2, String[] strArr3, String[] strArr4, Integer num, InterfaceC4606r interfaceC4606r) {
            this.f49981a = i10;
            this.$chains = strArr;
            this.f49982b = map;
            this.$categories = strArr2;
            this.$groups = strArr3;
            this.$countryCodes = strArr4;
            this.f49983c = num;
            this.f49984d = interfaceC4606r;
        }

        public static final void c(InterfaceC4606r callback, EnumC4607s status) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            InterfaceC4606r.a.a(callback, status, null, null, 6, null);
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4595g
        public void a(final EnumC4607s status, Location location, boolean z10) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == EnumC4607s.SUCCESS && location != null) {
                C4589c.f49918a.l().q(location, this.f49981a, this.$chains, this.f49982b, this.$categories, this.$groups, this.$countryCodes, this.f49983c, new a(this.f49984d, location));
                return;
            }
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4606r interfaceC4606r = this.f49984d;
            t10.post(new Runnable() { // from class: io.radar.sdk.A
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.T.c(C4589c.InterfaceC4606r.this, status);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$U */
    public static final class U implements T.k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4606r f49987a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Location f49988b;

        public U(InterfaceC4606r interfaceC4606r, Location location) {
            this.f49987a = interfaceC4606r;
            this.f49988b = location;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC4606r callback, EnumC4607s status, Location near, Gh.o[] oVarArr) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            Intrinsics.checkNotNullParameter(near, "$near");
            callback.a(status, near, oVarArr);
        }

        @Override // io.radar.sdk.T.k
        public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.o[] oVarArr) {
            Intrinsics.checkNotNullParameter(status, "status");
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4606r interfaceC4606r = this.f49987a;
            final Location location = this.f49988b;
            t10.post(new Runnable() { // from class: io.radar.sdk.C
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.U.c(C4589c.InterfaceC4606r.this, status, location, oVarArr);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$V */
    public static final class V implements T.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4598j f49989a;

        public V(InterfaceC4598j interfaceC4598j) {
            this.f49989a = interfaceC4598j;
        }

        public static final void d(InterfaceC4598j callback, EnumC4607s status) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            InterfaceC4598j.a.a(callback, status, null, 2, null);
        }

        public static final void e(InterfaceC4598j callback, EnumC4607s status, Gh.h hVar) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            callback.a(status, hVar);
        }

        @Override // io.radar.sdk.T.l
        public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.h hVar) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status != EnumC4607s.SUCCESS) {
                Handler t10 = C4589c.f49918a.t();
                final InterfaceC4598j interfaceC4598j = this.f49989a;
                t10.post(new Runnable() { // from class: io.radar.sdk.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4589c.V.d(C4589c.InterfaceC4598j.this, status);
                    }
                });
            } else {
                Handler t11 = C4589c.f49918a.t();
                final InterfaceC4598j interfaceC4598j2 = this.f49989a;
                t11.post(new Runnable() { // from class: io.radar.sdk.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4589c.V.e(C4589c.InterfaceC4598j.this, status, hVar);
                    }
                });
            }
        }
    }

    /* renamed from: io.radar.sdk.c$W */
    public static final class W implements T.n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O0 f49990a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N0 f49991b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4610v f49992c;

        public W(O0 o02, N0 n02, InterfaceC4610v interfaceC4610v) {
            this.f49990a = o02;
            this.f49991b = n02;
            this.f49992c = interfaceC4610v;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC4610v interfaceC4610v, EnumC4607s status, Gh.B b10, Gh.h[] hVarArr) {
            Intrinsics.checkNotNullParameter(status, "$status");
            if (interfaceC4610v != null) {
                interfaceC4610v.a(status, b10, hVarArr);
            }
        }

        @Override // io.radar.sdk.T.n
        public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.B b10, final Gh.h[] hVarArr) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == EnumC4607s.SUCCESS) {
                L0 l02 = L0.f49705a;
                Context context = C4589c.f49921d;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                l02.a0(context, this.f49990a);
                boolean R10 = C4589c.R();
                if (R10) {
                    Context context2 = C4589c.f49921d;
                    if (context2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("context");
                        context2 = null;
                    }
                    N0 x10 = l02.x(context2);
                    Context context3 = C4589c.f49921d;
                    if (context3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("context");
                        context3 = null;
                    }
                    l02.S(context3, x10);
                } else {
                    Context context4 = C4589c.f49921d;
                    if (context4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("context");
                        context4 = null;
                    }
                    l02.G(context4);
                }
                N0 n02 = this.f49991b;
                if (n02 != null && n02.l() == null) {
                    C4589c.N0(this.f49991b);
                } else if (this.f49991b != null) {
                    Context context5 = C4589c.f49921d;
                    if (context5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("context");
                        context5 = null;
                    }
                    l02.Z(context5, this.f49991b);
                } else if (!R10 && this.f49990a.i()) {
                    Context context6 = C4589c.f49921d;
                    if (context6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("context");
                        context6 = null;
                    }
                    N0 r10 = l02.r(context6);
                    if (r10 == null) {
                        Context context7 = C4589c.f49921d;
                        if (context7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                            context7 = null;
                        }
                        r10 = l02.x(context7);
                    }
                    C4589c.N0(r10);
                }
                C4589c.f49918a.x().m(null);
            }
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4610v interfaceC4610v = this.f49992c;
            t10.post(new Runnable() { // from class: io.radar.sdk.F
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.W.c(C4589c.InterfaceC4610v.this, status, b10, hVarArr);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$X */
    public static final class X implements InterfaceC4595g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f49993a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4608t f49994b;

        /* renamed from: io.radar.sdk.c$X$a */
        public static final class a implements T.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function1 f49995a;

            /* renamed from: io.radar.sdk.c$X$a$a, reason: collision with other inner class name */
            public static final class C0743a implements InterfaceC0745c {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Function1 f49996a;

                public C0743a(Function1 function1) {
                    this.f49996a = function1;
                }

                @Override // io.radar.sdk.C4589c.InterfaceC0745c
                public void a(EnumC4607s status, C1165b[] c1165bArr) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    if (status != EnumC4607s.SUCCESS || c1165bArr == null) {
                        this.f49996a.invoke(null);
                    } else {
                        this.f49996a.invoke(c1165bArr);
                    }
                }
            }

            /* renamed from: io.radar.sdk.c$X$a$b */
            public static final class b implements InterfaceC0745c {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Function1 f49997a;

                public b(Function1 function1) {
                    this.f49997a = function1;
                }

                @Override // io.radar.sdk.C4589c.InterfaceC0745c
                public void a(EnumC4607s status, C1165b[] c1165bArr) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    if (status != EnumC4607s.SUCCESS || c1165bArr == null) {
                        this.f49997a.invoke(null);
                    } else {
                        this.f49997a.invoke(c1165bArr);
                    }
                }
            }

            public a(Function1 function1) {
                this.f49995a = function1;
            }

            @Override // io.radar.sdk.T.i
            public void a(EnumC4607s status, JSONObject jSONObject, C1165b[] c1165bArr, String[] strArr, String[] strArr2) {
                Intrinsics.checkNotNullParameter(status, "status");
                if ((strArr != null && strArr.length != 0) || (strArr2 != null && strArr2.length != 0)) {
                    C4589c c4589c = C4589c.f49918a;
                    c4589c.n().q(strArr, strArr2);
                    c4589c.n().m(strArr, strArr2, false, new C0743a(this.f49995a));
                } else {
                    if (c1165bArr == null) {
                        this.f49995a.invoke(new C1165b[0]);
                        return;
                    }
                    C4589c c4589c2 = C4589c.f49918a;
                    c4589c2.n().r(c1165bArr);
                    c4589c2.n().o(c1165bArr, false, new b(this.f49995a));
                }
            }
        }

        /* renamed from: io.radar.sdk.c$X$b */
        public static final class b extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Location f49998d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f49999e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4608t f50000f;

            /* renamed from: io.radar.sdk.c$X$b$a */
            public static final class a implements T.m {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC4608t f50001a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Location f50002b;

                public a(InterfaceC4608t interfaceC4608t, Location location) {
                    this.f50001a = interfaceC4608t;
                    this.f50002b = location;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void c(InterfaceC4608t interfaceC4608t, EnumC4607s status, Location location, Gh.h[] hVarArr, Gh.C c10) {
                    Intrinsics.checkNotNullParameter(status, "$status");
                    if (interfaceC4608t != null) {
                        interfaceC4608t.a(status, location, hVarArr, c10);
                    }
                }

                @Override // io.radar.sdk.T.m
                public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.h[] hVarArr, final Gh.C c10, Gh.j[] jVarArr, Gh.e eVar, Gh.D d10) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    if (status == EnumC4607s.SUCCESS) {
                        C4589c.f49918a.x().O(eVar != null ? eVar.b() : null);
                    }
                    Handler t10 = C4589c.f49918a.t();
                    final InterfaceC4608t interfaceC4608t = this.f50001a;
                    final Location location = this.f50002b;
                    t10.post(new Runnable() { // from class: io.radar.sdk.H
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4589c.X.b.a.c(C4589c.InterfaceC4608t.this, status, location, hVarArr, c10);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Location location, boolean z10, InterfaceC4608t interfaceC4608t) {
                super(1);
                this.f49998d = location;
                this.f49999e = z10;
                this.f50000f = interfaceC4608t;
            }

            public final void a(C1165b[] c1165bArr) {
                io.radar.sdk.T l10 = C4589c.f49918a.l();
                Location location = this.f49998d;
                io.radar.sdk.T.t(l10, location, this.f49999e, true, EnumC4597i.FOREGROUND_LOCATION, false, c1165bArr, false, null, null, null, null, null, null, null, new a(this.f50000f, location), 16320, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C1165b[]) obj);
                return Unit.INSTANCE;
            }
        }

        public X(boolean z10, InterfaceC4608t interfaceC4608t) {
            this.f49993a = z10;
            this.f49994b = interfaceC4608t;
        }

        public static final void c(InterfaceC4608t interfaceC4608t, EnumC4607s status) {
            Intrinsics.checkNotNullParameter(status, "$status");
            if (interfaceC4608t != null) {
                InterfaceC4608t.a.a(interfaceC4608t, status, null, null, null, 14, null);
            }
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4595g
        public void a(final EnumC4607s status, Location location, boolean z10) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status != EnumC4607s.SUCCESS || location == null) {
                Handler t10 = C4589c.f49918a.t();
                final InterfaceC4608t interfaceC4608t = this.f49994b;
                t10.post(new Runnable() { // from class: io.radar.sdk.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4589c.X.c(C4589c.InterfaceC4608t.this, status);
                    }
                });
            } else {
                b bVar = new b(location, z10, this.f49994b);
                if (!this.f49993a || Build.VERSION.SDK_INT < 26) {
                    bVar.invoke(null);
                } else {
                    C4589c.f49918a.l().o(location, 1000, 10, new a(bVar), false);
                }
            }
        }
    }

    /* renamed from: io.radar.sdk.c$Y */
    public static final class Y implements T.m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4608t f50003a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Location f50004b;

        public Y(InterfaceC4608t interfaceC4608t, Location location) {
            this.f50003a = interfaceC4608t;
            this.f50004b = location;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC4608t interfaceC4608t, EnumC4607s status, Location location, Gh.h[] hVarArr, Gh.C c10) {
            Intrinsics.checkNotNullParameter(status, "$status");
            Intrinsics.checkNotNullParameter(location, "$location");
            if (interfaceC4608t != null) {
                interfaceC4608t.a(status, location, hVarArr, c10);
            }
        }

        @Override // io.radar.sdk.T.m
        public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.h[] hVarArr, final Gh.C c10, Gh.j[] jVarArr, Gh.e eVar, Gh.D d10) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == EnumC4607s.SUCCESS) {
                C4589c.f49918a.x().O(eVar != null ? eVar.b() : null);
            }
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4608t interfaceC4608t = this.f50003a;
            final Location location = this.f50004b;
            t10.post(new Runnable() { // from class: io.radar.sdk.I
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.Y.c(C4589c.InterfaceC4608t.this, status, location, hVarArr, c10);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$Z */
    public static final class Z implements T.n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O0 f50005a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4610v f50006b;

        public Z(O0 o02, InterfaceC4610v interfaceC4610v) {
            this.f50005a = o02;
            this.f50006b = interfaceC4610v;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC4610v interfaceC4610v, EnumC4607s status, Gh.B b10, Gh.h[] hVarArr) {
            Intrinsics.checkNotNullParameter(status, "$status");
            if (interfaceC4610v != null) {
                interfaceC4610v.a(status, b10, hVarArr);
            }
        }

        @Override // io.radar.sdk.T.n
        public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.B b10, final Gh.h[] hVarArr) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == EnumC4607s.SUCCESS) {
                L0 l02 = L0.f49705a;
                Context context = C4589c.f49921d;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                l02.a0(context, this.f50005a);
                C4589c.f49918a.x().m(null);
            }
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4610v interfaceC4610v = this.f50006b;
            t10.post(new Runnable() { // from class: io.radar.sdk.J
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.Z.c(C4589c.InterfaceC4610v.this, status, b10, hVarArr);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$a, reason: case insensitive filesystem */
    public enum EnumC4590a {
        UNKNOWN,
        STATIONARY,
        FOOT,
        RUN,
        BIKE,
        CAR;


        /* renamed from: a, reason: collision with root package name */
        public static final C0744a f50007a = new C0744a(null);

        /* renamed from: io.radar.sdk.c$a$a, reason: collision with other inner class name */
        public static final class C0744a {
            public /* synthetic */ C0744a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final EnumC4590a a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                switch (value.hashCode()) {
                    case -284840886:
                        if (value.equals("unknown")) {
                            return EnumC4590a.UNKNOWN;
                        }
                        break;
                    case -98468684:
                        if (value.equals("stationary")) {
                            return EnumC4590a.STATIONARY;
                        }
                        break;
                    case 98260:
                        if (value.equals("car")) {
                            return EnumC4590a.CAR;
                        }
                        break;
                    case 113291:
                        if (value.equals("run")) {
                            return EnumC4590a.RUN;
                        }
                        break;
                    case 3023841:
                        if (value.equals("bike")) {
                            return EnumC4590a.BIKE;
                        }
                        break;
                    case 3148910:
                        if (value.equals("foot")) {
                            return EnumC4590a.FOOT;
                        }
                        break;
                }
                return EnumC4590a.UNKNOWN;
            }

            public C0744a() {
            }
        }

        /* renamed from: io.radar.sdk.c$a$b */
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC4590a.values().length];
                iArr[EnumC4590a.UNKNOWN.ordinal()] = 1;
                iArr[EnumC4590a.STATIONARY.ordinal()] = 2;
                iArr[EnumC4590a.FOOT.ordinal()] = 3;
                iArr[EnumC4590a.RUN.ordinal()] = 4;
                iArr[EnumC4590a.BIKE.ordinal()] = 5;
                iArr[EnumC4590a.CAR.ordinal()] = 6;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (b.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    return "unknown";
                case 2:
                    return "stationary";
                case 3:
                    return "foot";
                case 4:
                    return "run";
                case 5:
                    return "bike";
                case 6:
                    return "car";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: io.radar.sdk.c$a0 */
    public static final class a0 implements T.o {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4611w f50014a;

        public a0(InterfaceC4611w interfaceC4611w) {
            this.f50014a = interfaceC4611w;
        }

        public static final void c(InterfaceC4611w callback, EnumC4607s status, C1164a c1164a, EnumC4591b enumC4591b) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            callback.a(status, c1164a, enumC4591b);
        }

        @Override // io.radar.sdk.T.o
        public void a(final EnumC4607s status, JSONObject jSONObject, final C1164a c1164a, final EnumC4591b enumC4591b) {
            Intrinsics.checkNotNullParameter(status, "status");
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4611w interfaceC4611w = this.f50014a;
            t10.post(new Runnable() { // from class: io.radar.sdk.K
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.a0.c(C4589c.InterfaceC4611w.this, status, c1164a, enumC4591b);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$b, reason: case insensitive filesystem */
    public enum EnumC4591b {
        VERIFIED,
        PARTIALLY_VERIFIED,
        AMBIGUOUS,
        UNVERIFIED,
        NONE
    }

    /* renamed from: io.radar.sdk.c$c, reason: collision with other inner class name */
    public interface InterfaceC0745c {

        /* renamed from: io.radar.sdk.c$c$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC0745c interfaceC0745c, EnumC4607s enumC4607s, C1165b[] c1165bArr, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    c1165bArr = null;
                }
                interfaceC0745c.a(enumC4607s, c1165bArr);
            }
        }

        void a(EnumC4607s enumC4607s, C1165b[] c1165bArr);
    }

    /* renamed from: io.radar.sdk.c$d, reason: case insensitive filesystem */
    public interface InterfaceC4592d {

        /* renamed from: io.radar.sdk.c$d$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4592d interfaceC4592d, EnumC4607s enumC4607s, Location location, Gh.f fVar, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    location = null;
                }
                if ((i10 & 4) != 0) {
                    fVar = null;
                }
                interfaceC4592d.a(enumC4607s, location, fVar);
            }
        }

        void a(EnumC4607s enumC4607s, Location location, Gh.f fVar);
    }

    /* renamed from: io.radar.sdk.c$e, reason: case insensitive filesystem */
    public interface InterfaceC4593e {

        /* renamed from: io.radar.sdk.c$e$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4593e interfaceC4593e, EnumC4607s enumC4607s, C1164a[] c1164aArr, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    c1164aArr = null;
                }
                interfaceC4593e.a(enumC4607s, c1164aArr);
            }
        }

        void a(EnumC4607s enumC4607s, C1164a[] c1164aArr);
    }

    /* renamed from: io.radar.sdk.c$f, reason: case insensitive filesystem */
    public interface InterfaceC4594f {

        /* renamed from: io.radar.sdk.c$f$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4594f interfaceC4594f, EnumC4607s enumC4607s, C1164a c1164a, boolean z10, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    c1164a = null;
                }
                if ((i10 & 4) != 0) {
                    z10 = false;
                }
                interfaceC4594f.a(enumC4607s, c1164a, z10);
            }
        }

        void a(EnumC4607s enumC4607s, C1164a c1164a, boolean z10);
    }

    /* renamed from: io.radar.sdk.c$g, reason: case insensitive filesystem */
    public interface InterfaceC4595g {

        /* renamed from: io.radar.sdk.c$g$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4595g interfaceC4595g, EnumC4607s enumC4607s, Location location, boolean z10, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    location = null;
                }
                if ((i10 & 4) != 0) {
                    z10 = false;
                }
                interfaceC4595g.a(enumC4607s, location, z10);
            }
        }

        void a(EnumC4607s enumC4607s, Location location, boolean z10);
    }

    /* renamed from: io.radar.sdk.c$h, reason: case insensitive filesystem */
    public enum EnumC4596h {
        GOOGLE,
        HUAWEI
    }

    /* renamed from: io.radar.sdk.c$i, reason: case insensitive filesystem */
    public enum EnumC4597i {
        FOREGROUND_LOCATION,
        BACKGROUND_LOCATION,
        MANUAL_LOCATION,
        GEOFENCE_ENTER,
        GEOFENCE_DWELL,
        GEOFENCE_EXIT,
        MOCK_LOCATION,
        BEACON_ENTER,
        BEACON_EXIT,
        UNKNOWN
    }

    /* renamed from: io.radar.sdk.c$j, reason: case insensitive filesystem */
    public interface InterfaceC4598j {

        /* renamed from: io.radar.sdk.c$j$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4598j interfaceC4598j, EnumC4607s enumC4607s, Gh.h hVar, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    hVar = null;
                }
                interfaceC4598j.a(enumC4607s, hVar);
            }
        }

        void a(EnumC4607s enumC4607s, Gh.h hVar);
    }

    /* renamed from: io.radar.sdk.c$k, reason: case insensitive filesystem */
    public enum EnumC4599k {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4);


        /* renamed from: b, reason: collision with root package name */
        public static final a f50032b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f50038a;

        /* renamed from: io.radar.sdk.c$k$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC4599k a(int i10) {
                for (EnumC4599k enumC4599k : EnumC4599k.values()) {
                    if (enumC4599k.b() == i10) {
                        return enumC4599k;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            public a() {
            }
        }

        EnumC4599k(int i10) {
            this.f50038a = i10;
        }

        public final int b() {
            return this.f50038a;
        }
    }

    /* renamed from: io.radar.sdk.c$l, reason: case insensitive filesystem */
    public enum EnumC4600l {
        NONE(0),
        SDK_CALL(1),
        SDK_ERROR(2),
        SDK_EXCEPTION(3),
        APP_LIFECYCLE_EVENT(4),
        PERMISSION_EVENT(5);


        /* renamed from: b, reason: collision with root package name */
        public static final a f50039b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f50046a;

        /* renamed from: io.radar.sdk.c$l$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        EnumC4600l(int i10) {
            this.f50046a = i10;
        }
    }

    /* renamed from: io.radar.sdk.c$m, reason: case insensitive filesystem */
    public interface InterfaceC4601m {

        /* renamed from: io.radar.sdk.c$m$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4601m interfaceC4601m, EnumC4607s enumC4607s, Gh.w wVar, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    wVar = null;
                }
                interfaceC4601m.a(enumC4607s, wVar);
            }
        }

        void a(EnumC4607s enumC4607s, Gh.w wVar);
    }

    /* renamed from: io.radar.sdk.c$n, reason: case insensitive filesystem */
    public interface InterfaceC4602n {

        /* renamed from: io.radar.sdk.c$n$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4602n interfaceC4602n, EnumC4607s enumC4607s, Gh.x xVar, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    xVar = null;
                }
                interfaceC4602n.a(enumC4607s, xVar);
            }
        }

        void a(EnumC4607s enumC4607s, Gh.x xVar);
    }

    /* renamed from: io.radar.sdk.c$o, reason: case insensitive filesystem */
    public enum EnumC4603o {
        FOOT,
        BIKE,
        CAR,
        TRUCK,
        MOTORBIKE
    }

    /* renamed from: io.radar.sdk.c$p, reason: case insensitive filesystem */
    public enum EnumC4604p {
        IMPERIAL,
        METRIC
    }

    /* renamed from: io.radar.sdk.c$q, reason: case insensitive filesystem */
    public interface InterfaceC4605q {

        /* renamed from: io.radar.sdk.c$q$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4605q interfaceC4605q, EnumC4607s enumC4607s, Location location, Gh.j[] jVarArr, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    location = null;
                }
                if ((i10 & 4) != 0) {
                    jVarArr = null;
                }
                interfaceC4605q.a(enumC4607s, location, jVarArr);
            }
        }

        void a(EnumC4607s enumC4607s, Location location, Gh.j[] jVarArr);
    }

    /* renamed from: io.radar.sdk.c$r, reason: case insensitive filesystem */
    public interface InterfaceC4606r {

        /* renamed from: io.radar.sdk.c$r$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4606r interfaceC4606r, EnumC4607s enumC4607s, Location location, Gh.o[] oVarArr, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    location = null;
                }
                if ((i10 & 4) != 0) {
                    oVarArr = null;
                }
                interfaceC4606r.a(enumC4607s, location, oVarArr);
            }
        }

        void a(EnumC4607s enumC4607s, Location location, Gh.o[] oVarArr);
    }

    /* renamed from: io.radar.sdk.c$s, reason: case insensitive filesystem */
    public enum EnumC4607s {
        SUCCESS,
        ERROR_PUBLISHABLE_KEY,
        ERROR_PERMISSIONS,
        ERROR_LOCATION,
        ERROR_BLUETOOTH,
        ERROR_NETWORK,
        ERROR_BAD_REQUEST,
        ERROR_UNAUTHORIZED,
        ERROR_PAYMENT_REQUIRED,
        ERROR_FORBIDDEN,
        ERROR_NOT_FOUND,
        ERROR_RATE_LIMIT,
        ERROR_SERVER,
        ERROR_UNKNOWN
    }

    /* renamed from: io.radar.sdk.c$t, reason: case insensitive filesystem */
    public interface InterfaceC4608t {

        /* renamed from: io.radar.sdk.c$t$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4608t interfaceC4608t, EnumC4607s enumC4607s, Location location, Gh.h[] hVarArr, Gh.C c10, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    location = null;
                }
                if ((i10 & 4) != 0) {
                    hVarArr = null;
                }
                if ((i10 & 8) != 0) {
                    c10 = null;
                }
                interfaceC4608t.a(enumC4607s, location, hVarArr, c10);
            }
        }

        void a(EnumC4607s enumC4607s, Location location, Gh.h[] hVarArr, Gh.C c10);
    }

    /* renamed from: io.radar.sdk.c$u, reason: case insensitive filesystem */
    public interface InterfaceC4609u {

        /* renamed from: io.radar.sdk.c$u$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4609u interfaceC4609u, EnumC4607s enumC4607s, Gh.D d10, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    d10 = null;
                }
                interfaceC4609u.a(enumC4607s, d10);
            }
        }

        void a(EnumC4607s enumC4607s, Gh.D d10);
    }

    /* renamed from: io.radar.sdk.c$v, reason: case insensitive filesystem */
    public interface InterfaceC4610v {
        void a(EnumC4607s enumC4607s, Gh.B b10, Gh.h[] hVarArr);
    }

    /* renamed from: io.radar.sdk.c$w, reason: case insensitive filesystem */
    public interface InterfaceC4611w {

        /* renamed from: io.radar.sdk.c$w$a */
        public static final class a {
            public static /* synthetic */ void a(InterfaceC4611w interfaceC4611w, EnumC4607s enumC4607s, C1164a c1164a, EnumC4591b enumC4591b, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i10 & 2) != 0) {
                    c1164a = null;
                }
                if ((i10 & 4) != 0) {
                    enumC4591b = null;
                }
                interfaceC4611w.a(enumC4607s, c1164a, enumC4591b);
            }
        }

        void a(EnumC4607s enumC4607s, C1164a c1164a, EnumC4591b enumC4591b);
    }

    /* renamed from: io.radar.sdk.c$x, reason: case insensitive filesystem */
    public /* synthetic */ class C4612x {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[EnumC4597i.values().length];
            iArr[EnumC4597i.FOREGROUND_LOCATION.ordinal()] = 1;
            iArr[EnumC4597i.BACKGROUND_LOCATION.ordinal()] = 2;
            iArr[EnumC4597i.MANUAL_LOCATION.ordinal()] = 3;
            iArr[EnumC4597i.GEOFENCE_ENTER.ordinal()] = 4;
            iArr[EnumC4597i.GEOFENCE_DWELL.ordinal()] = 5;
            iArr[EnumC4597i.GEOFENCE_EXIT.ordinal()] = 6;
            iArr[EnumC4597i.MOCK_LOCATION.ordinal()] = 7;
            iArr[EnumC4597i.BEACON_ENTER.ordinal()] = 8;
            iArr[EnumC4597i.BEACON_EXIT.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC4603o.values().length];
            iArr2[EnumC4603o.FOOT.ordinal()] = 1;
            iArr2[EnumC4603o.BIKE.ordinal()] = 2;
            iArr2[EnumC4603o.CAR.ordinal()] = 3;
            iArr2[EnumC4603o.TRUCK.ordinal()] = 4;
            iArr2[EnumC4603o.MOTORBIKE.ordinal()] = 5;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EnumC4591b.values().length];
            iArr3[EnumC4591b.VERIFIED.ordinal()] = 1;
            iArr3[EnumC4591b.PARTIALLY_VERIFIED.ordinal()] = 2;
            iArr3[EnumC4591b.AMBIGUOUS.ordinal()] = 3;
            iArr3[EnumC4591b.UNVERIFIED.ordinal()] = 4;
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[B.b.values().length];
            iArr4[B.b.STARTED.ordinal()] = 1;
            iArr4[B.b.APPROACHING.ordinal()] = 2;
            iArr4[B.b.ARRIVED.ordinal()] = 3;
            iArr4[B.b.EXPIRED.ordinal()] = 4;
            iArr4[B.b.COMPLETED.ordinal()] = 5;
            iArr4[B.b.CANCELED.ordinal()] = 6;
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* renamed from: io.radar.sdk.c$y, reason: case insensitive filesystem */
    public static final class C4613y implements T.InterfaceC4579c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4593e f50068a;

        public C4613y(InterfaceC4593e interfaceC4593e) {
            this.f50068a = interfaceC4593e;
        }

        public static final void c(InterfaceC4593e callback, EnumC4607s status, C1164a[] c1164aArr) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(status, "$status");
            callback.a(status, c1164aArr);
        }

        @Override // io.radar.sdk.T.InterfaceC4579c
        public void a(final EnumC4607s status, JSONObject jSONObject, final C1164a[] c1164aArr) {
            Intrinsics.checkNotNullParameter(status, "status");
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4593e interfaceC4593e = this.f50068a;
            t10.post(new Runnable() { // from class: io.radar.sdk.d
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.C4613y.c(C4589c.InterfaceC4593e.this, status, c1164aArr);
                }
            });
        }
    }

    /* renamed from: io.radar.sdk.c$z, reason: case insensitive filesystem */
    public static final class C4614z implements T.n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4610v f50069a;

        public C4614z(InterfaceC4610v interfaceC4610v) {
            this.f50069a = interfaceC4610v;
        }

        public static final void c(InterfaceC4610v interfaceC4610v, EnumC4607s status, Gh.B b10, Gh.h[] hVarArr) {
            Intrinsics.checkNotNullParameter(status, "$status");
            if (interfaceC4610v != null) {
                interfaceC4610v.a(status, b10, hVarArr);
            }
        }

        @Override // io.radar.sdk.T.n
        public void a(final EnumC4607s status, JSONObject jSONObject, final Gh.B b10, final Gh.h[] hVarArr) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == EnumC4607s.SUCCESS || status == EnumC4607s.ERROR_NOT_FOUND) {
                L0 l02 = L0.f49705a;
                Context context = C4589c.f49921d;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                l02.a0(context, null);
                C4589c c4589c = C4589c.f49918a;
                c4589c.x().D();
                c4589c.x().m(null);
            }
            Handler t10 = C4589c.f49918a.t();
            final InterfaceC4610v interfaceC4610v = this.f50069a;
            t10.post(new Runnable() { // from class: io.radar.sdk.e
                @Override // java.lang.Runnable
                public final void run() {
                    C4589c.C4614z.c(C4589c.InterfaceC4610v.this, status, b10, hVarArr);
                }
            });
        }
    }

    public static final JSONObject A() {
        Context context = null;
        if (!f49919b) {
            return null;
        }
        L0 l02 = L0.f49705a;
        Context context2 = f49921d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context = context2;
        }
        return l02.l(context);
    }

    public static final String B() {
        Context context = null;
        if (!f49919b) {
            return null;
        }
        L0 l02 = L0.f49705a;
        Context context2 = f49921d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context = context2;
        }
        return l02.q(context);
    }

    public static final void B0(N0.c options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (f49919b) {
            L0 l02 = L0.f49705a;
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            l02.L(context, options);
        }
    }

    public static final N0 C() {
        L0 l02 = L0.f49705a;
        Context context = f49921d;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        N0 r10 = l02.r(context);
        if (r10 != null) {
            return r10;
        }
        Context context3 = f49921d;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context2 = context3;
        }
        return l02.x(context2);
    }

    public static final O0 D() {
        Context context = null;
        if (!f49919b) {
            return null;
        }
        L0 l02 = L0.f49705a;
        Context context2 = f49921d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context = context2;
        }
        return l02.z(context);
    }

    public static final String E() {
        Context context = null;
        if (!f49919b) {
            return null;
        }
        L0 l02 = L0.f49705a;
        Context context2 = f49921d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context = context2;
        }
        return l02.B(context);
    }

    public static final void E0(EnumC4599k level) {
        Intrinsics.checkNotNullParameter(level, "level");
        if (f49919b) {
            L0 l02 = L0.f49705a;
            Context context = f49921d;
            Context context2 = null;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            JSONObject b10 = l02.b(context);
            String optString = b10.optString("logLevel");
            String obj = level.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (Intrinsics.areEqual(optString, lowerCase)) {
                return;
            }
            String lowerCase2 = level.toString().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            b10.put("logLevel", lowerCase2);
            Context context3 = f49921d;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context3 = null;
            }
            l02.J(context3, b10);
            Context context4 = f49921d;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context4 = null;
            }
            if (l02.k(context4) == level) {
                return;
            }
            y.a aVar = Gh.y.f4201n;
            Context context5 = f49921d;
            if (context5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            } else {
                context2 = context5;
            }
            aVar.b(context2);
        }
    }

    public static final void F(InterfaceC4609u interfaceC4609u) {
        G(false, N0.b.MEDIUM, interfaceC4609u);
    }

    public static final void G(boolean z10, N0.b desiredAccuracy, InterfaceC4609u interfaceC4609u) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        X0 x02 = null;
        if (!f49919b) {
            if (interfaceC4609u != null) {
                InterfaceC4609u.a.a(interfaceC4609u, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
                return;
            }
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "getVerifiedLocationToken()", EnumC4600l.SDK_CALL, null, 4, null);
        if (f49933p == null) {
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            f49933p = new X0(context, c4589c.y());
        }
        X0 x03 = f49933p;
        if (x03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verificationManager");
        } else {
            x02 = x03;
        }
        x02.y(z10, desiredAccuracy, interfaceC4609u);
    }

    public static final void H0(JSONObject jSONObject) {
        if (f49919b) {
            L0 l02 = L0.f49705a;
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            l02.P(context, jSONObject);
        }
    }

    public static final void I0(I0 options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (f49919b) {
            L0 l02 = L0.f49705a;
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            l02.Q(context, options);
        }
    }

    public static final void J0(String str) {
        if (f49919b) {
            L0 l02 = L0.f49705a;
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            l02.T(context, str);
        }
    }

    public static final boolean K() {
        Hh.e eVar = f49931n;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("replayBuffer");
            eVar = null;
        }
        return eVar.getSize() > 0;
    }

    public static final void K0(K0 k02) {
        if (f49919b) {
            f49924g = k02;
        }
    }

    public static final void L(Context context, String str) {
        O(context, str, null, null, false, 24, null);
    }

    public static final void L0(String str) {
        if (f49919b) {
            L0 l02 = L0.f49705a;
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            l02.c0(context, str);
        }
    }

    public static final void M(Context context, String str, K0 k02, EnumC4596h provider, boolean z10) {
        Context context2;
        Context context3;
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        f49921d = applicationContext;
        C4589c c4589c = f49918a;
        Context context4 = f49921d;
        Context context5 = null;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context4 = null;
        }
        c4589c.C0(new Handler(context4.getMainLooper()));
        if (context instanceof Activity) {
            f49922e = (Activity) context;
        }
        if (k02 != null) {
            f49924g = k02;
        }
        if (f49930m == null) {
            Context context6 = f49921d;
            if (context6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context6 = null;
            }
            f49930m = new Hh.h(context6);
        }
        if (f49931n == null) {
            Context context7 = f49921d;
            if (context7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context7 = null;
            }
            f49931n = new Hh.i(context7);
        }
        if (f49926i == null) {
            Context context8 = f49921d;
            if (context8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context8 = null;
            }
            c4589c.G0(new G0(context8));
        }
        if (str != null) {
            L0 l02 = L0.f49705a;
            Context context9 = f49921d;
            if (context9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context9 = null;
            }
            l02.U(context9, str);
        }
        if (f49927j == null) {
            Context context10 = f49921d;
            if (context10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context3 = null;
            } else {
                context3 = context10;
            }
            c4589c.w0(new io.radar.sdk.T(context3, c4589c.y(), null, 4, null));
        }
        if (io.radar.sdk.M.f49706d.a()) {
            G0.b(c4589c.y(), "App is foregrounded", null, null, 6, null);
            L0 l03 = L0.f49705a;
            Context context11 = f49921d;
            if (context11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context11 = null;
            }
            l03.f0(context11);
        } else {
            G0.b(c4589c.y(), "App is backgrounded, not updating session ID", null, null, 6, null);
        }
        if (f49932o == null) {
            Context context12 = f49921d;
            if (context12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context12 = null;
            }
            c4589c.x0(new C4619e0(context12));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && f49929l == null) {
            Context context13 = f49921d;
            if (context13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context2 = null;
            } else {
                context2 = context13;
            }
            c4589c.y0(new C4629j0(context2, c4589c.y(), null, 4, null));
        }
        if (f49928k == null) {
            Context context14 = f49921d;
            if (context14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context14 = null;
            }
            c4589c.D0(new E0(context14, c4589c.l(), c4589c.y(), c4589c.m(), provider, null, 32, null));
            L0 l04 = L0.f49705a;
            Context context15 = f49921d;
            if (context15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context15 = null;
            }
            l04.N(context15, provider);
            E0.N(c4589c.x(), null, 1, null);
        }
        G0.g(c4589c.y(), "initialize()", EnumC4600l.SDK_CALL, null, 4, null);
        if (provider == EnumC4596h.GOOGLE) {
            G0.b(c4589c.y(), "Using Google location services", null, null, 6, null);
        } else if (provider == EnumC4596h.HUAWEI) {
            G0.b(c4589c.y(), "Using Huawei location services", null, null, 6, null);
        }
        Context context16 = f49921d;
        if (context16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context16 = null;
        }
        Application application = context16 instanceof Application ? (Application) context16 : null;
        if (z10) {
            L0 l05 = L0.f49705a;
            Context context17 = f49921d;
            if (context17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context17 = null;
            }
            l05.X(context17, false);
        }
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new io.radar.sdk.M(z10));
        }
        L0 l06 = L0.f49705a;
        Context context18 = f49921d;
        if (context18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context5 = context18;
        }
        if (l06.s(context5).l()) {
            V();
        }
        c4589c.l().e("initialize", false, new K(context));
        if (i10 >= 30) {
            c4589c.y().i();
        }
        f49919b = true;
        G0.g(c4589c.y(), "📍️ Radar initialized", null, null, 6, null);
    }

    public static final void M0(b1 b1Var) {
        if (f49919b) {
            f49925h = b1Var;
        }
    }

    public static /* synthetic */ void N(Context context, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        L(context, str);
    }

    public static final void N0(N0 options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (f49919b) {
            C4589c c4589c = f49918a;
            G0.g(c4589c.y(), "startTracking()", EnumC4600l.SDK_CALL, null, 4, null);
            c4589c.x().H(options);
        }
    }

    public static /* synthetic */ void O(Context context, String str, K0 k02, EnumC4596h enumC4596h, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            k02 = null;
        }
        if ((i10 & 8) != 0) {
            enumC4596h = EnumC4596h.GOOGLE;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        M(context, str, k02, enumC4596h, z10);
    }

    public static final void O0(int i10, boolean z10) {
        if (f49919b) {
            C4589c c4589c = f49918a;
            G0.g(c4589c.y(), "startTrackingVerified()", EnumC4600l.SDK_CALL, null, 4, null);
            X0 x02 = null;
            if (f49933p == null) {
                Context context = f49921d;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                f49933p = new X0(context, c4589c.y());
            }
            X0 x03 = f49933p;
            if (x03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verificationManager");
            } else {
                x02 = x03;
            }
            x02.D(i10, z10);
        }
    }

    public static final void P(InterfaceC4594f callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4594f.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, false, 6, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "ipGeocode()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.l().k(new L(callback));
    }

    public static final void P0(O0 options, N0 n02, InterfaceC4610v interfaceC4610v) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (f49919b) {
            C4589c c4589c = f49918a;
            G0.g(c4589c.y(), "startTrip()", EnumC4600l.SDK_CALL, null, 4, null);
            c4589c.l().c(options, new W(options, n02, interfaceC4610v));
        }
    }

    public static final boolean Q() {
        L0 l02 = L0.f49705a;
        Context context = f49921d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        String q10 = l02.q(context);
        Context context2 = f49921d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context2 = null;
        }
        boolean A10 = l02.A(context2);
        if (q10 == null) {
            return false;
        }
        return StringsKt.startsWith$default(q10, "prj_test", false, 2, (Object) null) || StringsKt.startsWith$default(q10, "org_test", false, 2, (Object) null) || A10;
    }

    public static final void Q0() {
        if (f49919b) {
            C4589c c4589c = f49918a;
            G0.g(c4589c.y(), "stopTracking()", EnumC4600l.SDK_CALL, null, 4, null);
            c4589c.x().K();
        }
    }

    public static final boolean R() {
        if (!f49919b) {
            return false;
        }
        L0 l02 = L0.f49705a;
        Context context = f49921d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        return l02.w(context);
    }

    public static final void R0() {
        if (f49919b) {
            C4589c c4589c = f49918a;
            G0.g(c4589c.y(), "stopTrackingVerified()", EnumC4600l.SDK_CALL, null, 4, null);
            X0 x02 = null;
            if (f49933p == null) {
                Context context = f49921d;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                f49933p = new X0(context, c4589c.y());
            }
            X0 x03 = f49933p;
            if (x03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verificationManager");
            } else {
                x02 = x03;
            }
            x02.E();
        }
    }

    public static final boolean S() {
        if (!f49919b) {
            return false;
        }
        X0 x02 = null;
        if (f49933p == null) {
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            f49933p = new X0(context, f49918a.y());
        }
        X0 x03 = f49933p;
        if (x03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verificationManager");
        } else {
            x02 = x03;
        }
        return x02.x();
    }

    public static final String S0(EnumC4603o mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i10 = C4612x.$EnumSwitchMapping$1[mode.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "car" : "motorbike" : "truck" : "car" : "bike" : "foot";
    }

    public static final boolean T() {
        if (!f49919b) {
            return false;
        }
        L0 l02 = L0.f49705a;
        Context context = f49921d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        return l02.r(context) != null;
    }

    public static final String T0(EnumC4597i source) {
        Intrinsics.checkNotNullParameter(source, "source");
        switch (C4612x.$EnumSwitchMapping$0[source.ordinal()]) {
            case 1:
                return "FOREGROUND_LOCATION";
            case 2:
                return "BACKGROUND_LOCATION";
            case 3:
                return "MANUAL_LOCATION";
            case 4:
                return "GEOFENCE_ENTER";
            case 5:
                return "GEOFENCE_DWELL";
            case 6:
                return "GEOFENCE_EXIT";
            case 7:
                return "MOCK_LOCATION";
            case 8:
                return "BEACON_ENTER";
            case 9:
                return "BEACON_EXIT";
            default:
                return "UNKNOWN";
        }
    }

    public static final JSONObject U(Location location) {
        float verticalAccuracyMeters;
        float speedAccuracyMetersPerSecond;
        float bearingAccuracyDegrees;
        Intrinsics.checkNotNullParameter(location, "location");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("latitude", location.getLatitude());
        jSONObject.put("longitude", location.getLongitude());
        jSONObject.put("accuracy", Float.valueOf(location.getAccuracy()));
        jSONObject.put("altitude", location.getAltitude());
        jSONObject.put("speed", Float.valueOf(location.getSpeed()));
        jSONObject.put("course", Float.valueOf(location.getBearing()));
        if (Build.VERSION.SDK_INT >= 26) {
            verticalAccuracyMeters = location.getVerticalAccuracyMeters();
            jSONObject.put("verticalAccuracy", Float.valueOf(verticalAccuracyMeters));
            speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
            jSONObject.put("speedAccuracy", Float.valueOf(speedAccuracyMetersPerSecond));
            bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
            jSONObject.put("courseAccuracy", Float.valueOf(bearingAccuracyDegrees));
        }
        jSONObject.put("mocked", location.isFromMockProvider());
        return jSONObject;
    }

    public static final String U0(B.b status) {
        Intrinsics.checkNotNullParameter(status, "status");
        switch (C4612x.$EnumSwitchMapping$3[status.ordinal()]) {
            case 1:
                return "started";
            case 2:
                return "approaching";
            case 3:
                return "arrived";
            case 4:
                return "expired";
            case 5:
                return "completed";
            case 6:
                return "canceled";
            default:
                return "unknown";
        }
    }

    public static final void V() {
        Hh.e eVar = f49931n;
        Hh.e eVar2 = null;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("replayBuffer");
            eVar = null;
        }
        eVar.c();
        Hh.e eVar3 = f49931n;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("replayBuffer");
        } else {
            eVar2 = eVar3;
        }
        int size = eVar2.getSize();
        G0.b(f49918a.y(), "Loaded replays | replayCount = " + size, null, null, 6, null);
    }

    public static final void V0(Location location, InterfaceC4608t interfaceC4608t) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (f49919b) {
            io.radar.sdk.T.t(f49918a.l(), location, false, true, EnumC4597i.MANUAL_LOCATION, false, null, false, null, null, null, null, null, null, null, new Y(interfaceC4608t, location), 16320, null);
        } else if (interfaceC4608t != null) {
            InterfaceC4608t.a.a(interfaceC4608t, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, null, 14, null);
        }
    }

    public static final void W() {
        if (f49919b) {
            f49918a.y().h();
            Hh.d dVar = f49930m;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("logBuffer");
                dVar = null;
            }
            dVar.a();
        }
    }

    public static final void W0(InterfaceC4608t interfaceC4608t) {
        N0.b bVar = N0.b.MEDIUM;
        if (R0.f49781a.m()) {
            bVar = N0.b.HIGH;
        }
        X0(bVar, false, interfaceC4608t);
    }

    public static final void X(String name, double d10, JSONObject jSONObject, InterfaceC4598j callback) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("revenue", d10);
        Y(name, jSONObject, callback);
    }

    public static final void X0(N0.b desiredAccuracy, boolean z10, InterfaceC4608t interfaceC4608t) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        if (f49919b) {
            C4589c c4589c = f49918a;
            G0.g(c4589c.y(), "trackOnce()", EnumC4600l.SDK_CALL, null, 4, null);
            c4589c.x().n(desiredAccuracy, EnumC4597i.FOREGROUND_LOCATION, new X(z10, interfaceC4608t));
        } else if (interfaceC4608t != null) {
            InterfaceC4608t.a.a(interfaceC4608t, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, null, 14, null);
        }
    }

    public static final void Y(String name, JSONObject jSONObject, InterfaceC4598j callback) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Context context = null;
        if (!f49919b) {
            InterfaceC4598j.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        L0 l02 = L0.f49705a;
        Context context2 = f49921d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context2 = null;
        }
        long i10 = currentTimeMillis - l02.i(context2);
        boolean z10 = false;
        boolean z11 = i10 < 60;
        C4589c c4589c = f49918a;
        J0 r10 = c4589c.x().r();
        Context context3 = f49921d;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context3 = null;
        }
        if (!r10.c(context3)) {
            J0 r11 = c4589c.x().r();
            Context context4 = f49921d;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            } else {
                context = context4;
            }
            if (!r11.b(context)) {
                z10 = true;
            }
        }
        if (z11 || z10) {
            s0(name, jSONObject, callback);
        } else {
            W0(new M(name, jSONObject, callback));
        }
    }

    public static /* synthetic */ void Y0(InterfaceC4608t interfaceC4608t, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC4608t = null;
        }
        W0(interfaceC4608t);
    }

    public static final void Z0(boolean z10, N0.b desiredAccuracy, InterfaceC4609u interfaceC4609u) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        a1(false, N0.b.MEDIUM, null, null, interfaceC4609u);
    }

    public static final void a(String eventId, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        if (f49919b) {
            f49918a.l().w(eventId, h.d.ACCEPT, str);
        }
    }

    public static final void a0() {
        if (f49919b) {
            f49918a.y().j();
        }
    }

    public static final void a1(boolean z10, N0.b desiredAccuracy, String str, String str2, InterfaceC4609u interfaceC4609u) {
        X0 x02;
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        if (!f49919b) {
            if (interfaceC4609u != null) {
                InterfaceC4609u.a.a(interfaceC4609u, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
                return;
            }
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "trackVerified()", EnumC4600l.SDK_CALL, null, 4, null);
        if (f49933p == null) {
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            f49933p = new X0(context, c4589c.y());
        }
        X0 x03 = f49933p;
        if (x03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verificationManager");
            x02 = null;
        } else {
            x02 = x03;
        }
        x02.F(z10, desiredAccuracy, str, str2, interfaceC4609u);
    }

    public static final void b0(Location origin, Location destination, EnumC4603o mode, int i10, int i11, InterfaceC4608t interfaceC4608t) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (f49919b) {
            io.radar.sdk.T l10 = f49918a.l();
            EnumSet of2 = EnumSet.of(mode);
            Intrinsics.checkNotNullExpressionValue(of2, "of(mode)");
            l10.h(origin, destination, of2, EnumC4604p.METRIC, i10, new O(mode, i11, interfaceC4608t));
        }
    }

    public static final void b1(O0 options, B.b bVar, InterfaceC4610v interfaceC4610v) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (f49919b) {
            C4589c c4589c = f49918a;
            G0.g(c4589c.y(), "updateTrip()", EnumC4600l.SDK_CALL, null, 4, null);
            c4589c.l().u(options, bVar, new Z(options, interfaceC4610v));
        }
    }

    public static final void c(JSONObject replayParams) {
        Intrinsics.checkNotNullParameter(replayParams, "replayParams");
        Hh.e eVar = f49931n;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("replayBuffer");
            eVar = null;
        }
        eVar.a(replayParams);
    }

    public static final void c0(String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        if (f49919b) {
            io.radar.sdk.T.x(f49918a.l(), eventId, h.d.REJECT, null, 4, null);
        }
    }

    public static final void c1(C1164a c1164a, InterfaceC4611w callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4611w.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
        } else if (c1164a == null) {
            InterfaceC4611w.a.a(callback, EnumC4607s.ERROR_BAD_REQUEST, null, null, 4, null);
        } else {
            f49918a.l().v(c1164a, new a0(callback));
        }
    }

    public static final void d(String query, Location location, String[] strArr, Integer num, String str, Boolean bool, Boolean bool2, InterfaceC4593e callback) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (f49919b) {
            f49918a.l().b(query, location, strArr, num, str, bool2, new C4613y(callback));
        } else {
            InterfaceC4593e.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
        }
    }

    public static final void d0(Location location, String[] strArr, InterfaceC4593e callback) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4593e.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "reverseGeocode()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.l().n(location, strArr, new Q(callback));
    }

    public static final void e(InterfaceC4610v interfaceC4610v) {
        if (f49919b) {
            C4589c c4589c = f49918a;
            G0.g(c4589c.y(), "cancelTrip()", EnumC4600l.SDK_CALL, null, 4, null);
            L0 l02 = L0.f49705a;
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            c4589c.l().u(l02.z(context), B.b.CANCELED, new C4614z(interfaceC4610v));
        }
    }

    public static final void e0(String[] strArr, InterfaceC4593e callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4593e.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "reverseGeocode()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.x().m(new P(strArr, callback));
    }

    public static final void f() {
        if (f49919b) {
            C4589c c4589c = f49918a;
            G0.g(c4589c.y(), "clearVerifiedLocationToken()", EnumC4600l.SDK_CALL, null, 4, null);
            X0 x02 = null;
            if (f49933p == null) {
                Context context = f49921d;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                f49933p = new X0(context, c4589c.y());
            }
            X0 x03 = f49933p;
            if (x03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verificationManager");
            } else {
                x02 = x03;
            }
            x02.q();
        }
    }

    public static final String f0() {
        return "3.21.3";
    }

    public static final void g(InterfaceC4610v interfaceC4610v) {
        if (f49919b) {
            C4589c c4589c = f49918a;
            G0.g(c4589c.y(), "completeTrip()", EnumC4600l.SDK_CALL, null, 4, null);
            L0 l02 = L0.f49705a;
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            c4589c.l().u(l02.z(context), B.b.COMPLETED, new A(interfaceC4610v));
        }
    }

    public static final void g0(Location near, Integer num, String[] strArr, JSONObject jSONObject, Integer num2, Boolean bool, InterfaceC4605q callback) {
        Intrinsics.checkNotNullParameter(near, "near");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4605q.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "searchGeofences()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.l().p(near, num, strArr, jSONObject, num2, bool, new S(callback, near));
    }

    public static final void h() {
        if (f49919b && Q()) {
            Hh.d dVar = f49930m;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("logBuffer");
                dVar = null;
            }
            Hh.b d10 = dVar.d();
            List list = d10.get();
            if (list.isEmpty()) {
                return;
            }
            f49918a.l().l(list, new B(d10));
        }
    }

    public static final void h0(Integer num, String[] strArr, JSONObject jSONObject, Integer num2, Boolean bool, InterfaceC4605q callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4605q.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "searchGeofences()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.x().m(new R(num, strArr, jSONObject, num2, bool, callback));
    }

    public static final void i(JSONObject jSONObject, InterfaceC4608t interfaceC4608t) {
        if (f49919b) {
            if (f49920c) {
                G0.b(f49918a.y(), "Already flushing replays", null, null, 6, null);
                if (interfaceC4608t != null) {
                    InterfaceC4608t.a.a(interfaceC4608t, EnumC4607s.ERROR_SERVER, null, null, null, 14, null);
                    return;
                }
                return;
            }
            if (!K() && jSONObject == null) {
                G0.b(f49918a.y(), "No replays to flush", null, null, 6, null);
                return;
            }
            f49920c = true;
            Hh.e eVar = f49931n;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("replayBuffer");
                eVar = null;
            }
            Hh.b b10 = eVar.b();
            List mutableList = CollectionsKt.toMutableList((Collection) b10.get());
            if (jSONObject != null) {
                jSONObject.putOpt("replayed", Boolean.TRUE);
                jSONObject.putOpt("updatedAtMs", Long.valueOf(System.currentTimeMillis()));
                jSONObject.remove("updatedAtMsDiff");
                mutableList.add(new Gh.r(jSONObject));
            }
            int size = mutableList.size();
            C4589c c4589c = f49918a;
            G0.b(c4589c.y(), "Flushing " + size + " replays", null, null, 6, null);
            c4589c.l().m(mutableList, new C(b10, jSONObject, interfaceC4608t));
        }
    }

    public static final void i0(int i10, String[] strArr, Map map, String[] strArr2, String[] strArr3, String[] strArr4, Integer num, InterfaceC4606r callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4606r.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "searchPlaces()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.x().m(new T(i10, strArr, map, strArr2, strArr3, strArr4, num, callback));
    }

    public static /* synthetic */ void j(JSONObject jSONObject, InterfaceC4608t interfaceC4608t, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC4608t = null;
        }
        i(jSONObject, interfaceC4608t);
    }

    public static final void j0(Location near, int i10, String[] strArr, Map map, String[] strArr2, String[] strArr3, String[] strArr4, Integer num, InterfaceC4606r callback) {
        Intrinsics.checkNotNullParameter(near, "near");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4606r.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "searchPlaces()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.l().q(near, i10, strArr, map, strArr2, strArr3, strArr4, num, new U(callback, near));
    }

    public static final void k(String query, String[] strArr, String[] strArr2, InterfaceC4593e callback) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4593e.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "geocode()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.l().d(query, strArr, strArr2, new D(callback));
    }

    public static /* synthetic */ void m0(C4589c c4589c, EnumC4607s enumC4607s, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        c4589c.l0(enumC4607s, str);
    }

    public static final void o(Location location, InterfaceC4592d callback) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4592d.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "getContext()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.l().g(location, new F(callback, location));
    }

    public static /* synthetic */ void o0(C4589c c4589c, Gh.h[] hVarArr, Gh.C c10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c10 = null;
        }
        c4589c.n0(hVarArr, c10);
    }

    public static final void p(InterfaceC4592d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4592d.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "getContext()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.x().m(new E(callback));
    }

    public static final String q() {
        Context context = null;
        if (!f49919b) {
            return null;
        }
        L0 l02 = L0.f49705a;
        Context context2 = f49921d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context = context2;
        }
        return l02.c(context);
    }

    public static final void r(Location origin, Location destination, EnumSet modes, EnumC4604p units, InterfaceC4602n callback) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(modes, "modes");
        Intrinsics.checkNotNullParameter(units, "units");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4602n.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "getDistance()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.l().h(origin, destination, modes, units, -1, new H(callback));
    }

    public static /* synthetic */ void r0(C4589c c4589c, EnumC4599k enumC4599k, String str, EnumC4600l enumC4600l, Date date, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            date = new Date();
        }
        c4589c.q0(enumC4599k, str, enumC4600l, date);
    }

    public static final void s(Location destination, EnumSet modes, EnumC4604p units, InterfaceC4602n callback) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(modes, "modes");
        Intrinsics.checkNotNullParameter(units, "units");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4602n.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "getDistance()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.x().m(new G(destination, modes, units, callback));
    }

    public static final void s0(String name, JSONObject jSONObject, InterfaceC4598j callback) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(callback, "callback");
        f49918a.l().r(name, jSONObject, new V(callback));
    }

    public static /* synthetic */ void t0(String str, JSONObject jSONObject, InterfaceC4598j interfaceC4598j, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            jSONObject = null;
        }
        s0(str, jSONObject, interfaceC4598j);
    }

    public static final String u() {
        Context context = null;
        if (!f49919b) {
            return null;
        }
        L0 l02 = L0.f49705a;
        Context context2 = f49921d;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context = context2;
        }
        return l02.e(context);
    }

    public static final void v0(boolean z10) {
        L0 l02 = L0.f49705a;
        Context context = f49921d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        l02.I(context, z10);
    }

    public static final void w(N0.b desiredAccuracy, InterfaceC4595g interfaceC4595g) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        if (f49919b) {
            C4589c c4589c = f49918a;
            G0.g(c4589c.y(), "getLocation()", EnumC4600l.SDK_CALL, null, 4, null);
            c4589c.x().n(desiredAccuracy, EnumC4597i.FOREGROUND_LOCATION, new I(interfaceC4595g));
        } else if (interfaceC4595g != null) {
            InterfaceC4595g.a.a(interfaceC4595g, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, false, 6, null);
        }
    }

    public static final void z(Location[] origins, Location[] destinations, EnumC4603o mode, EnumC4604p units, InterfaceC4601m callback) {
        Intrinsics.checkNotNullParameter(origins, "origins");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(units, "units");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!f49919b) {
            InterfaceC4601m.a.a(callback, EnumC4607s.ERROR_PUBLISHABLE_KEY, null, 2, null);
            return;
        }
        C4589c c4589c = f49918a;
        G0.g(c4589c.y(), "getMatrix()", EnumC4600l.SDK_CALL, null, 4, null);
        c4589c.l().i(origins, destinations, mode, units, new J(callback));
    }

    public static final void z0(String str) {
        if (f49919b) {
            L0 l02 = L0.f49705a;
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            l02.K(context, str);
        }
    }

    public final void A0(boolean z10) {
        f49920c = z10;
    }

    public final void C0(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        f49923f = handler;
    }

    public final void D0(E0 e02) {
        Intrinsics.checkNotNullParameter(e02, "<set-?>");
        f49928k = e02;
    }

    public final void F0(boolean z10) {
        Hh.d dVar = f49930m;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logBuffer");
            dVar = null;
        }
        dVar.c(z10);
    }

    public final void G0(G0 g02) {
        Intrinsics.checkNotNullParameter(g02, "<set-?>");
        f49926i = g02;
    }

    public final void H(Context context, C1165b[] c1165bArr, EnumC4597i source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!f49919b) {
            N(context, null, 2, null);
        }
        x().t(c1165bArr, source);
    }

    public final void I(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!f49919b) {
            N(context, null, 2, null);
        }
        x().u();
    }

    public final void J(Context context, Location location, EnumC4597i source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!f49919b) {
            N(context, null, 2, null);
        }
        x().v(location, source);
    }

    public final void Z() {
        L0 l02 = L0.f49705a;
        Context context = f49921d;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        if (l02.s(context).k()) {
            long currentTimeMillis = System.currentTimeMillis();
            Context context2 = f49921d;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context2 = null;
            }
            if (currentTimeMillis - l02.h(context2) > 1000) {
                Context context3 = f49921d;
                if (context3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context3 = null;
                }
                l02.d0(context3);
                t0("opened_app", null, new N(), 2, null);
            }
        }
    }

    public final void k0(Location location, boolean z10, EnumC4597i source) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(source, "source");
        K0 k02 = f49924g;
        if (k02 != null) {
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            k02.a(context, location, z10, source);
        }
    }

    public final io.radar.sdk.T l() {
        io.radar.sdk.T t10 = f49927j;
        if (t10 != null) {
            return t10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("apiClient");
        return null;
    }

    public final void l0(EnumC4607s status, String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (str != null) {
            G0.d(y(), "📍️ Radar error received | status = " + status + " | error message = " + str, EnumC4600l.SDK_ERROR, null, 4, null);
        } else {
            G0.d(y(), "📍️ Radar error received | status = " + status, EnumC4600l.SDK_ERROR, null, 4, null);
        }
        if (f49919b) {
            h();
        }
        K0 k02 = f49924g;
        if (k02 != null) {
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            k02.b(context, status);
        }
    }

    public final C4619e0 m() {
        C4619e0 c4619e0 = f49932o;
        if (c4619e0 != null) {
            return c4619e0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("batteryManager");
        return null;
    }

    public final C4629j0 n() {
        C4629j0 c4629j0 = f49929l;
        if (c4629j0 != null) {
            return c4629j0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("beaconManager");
        return null;
    }

    public final void n0(Gh.h[] events, Gh.C c10) {
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.length == 0) {
            return;
        }
        K0 k02 = f49924g;
        Context context = null;
        if (k02 != null) {
            Context context2 = f49921d;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context2 = null;
            }
            k02.c(context2, events, c10);
        }
        H0.a aVar = H0.f49673a;
        Context context3 = f49921d;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            context = context3;
        }
        aVar.a(context, events);
        for (Gh.h hVar : events) {
            G0.g(y(), "📍 Radar event received | type = " + Gh.h.f4075t.c(hVar.f()) + "; replayed = " + hVar.d() + "; link = https://radar.com/dashboard/events/" + hVar.g(), null, null, 6, null);
        }
    }

    public final void p0(Location location, Gh.C user) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(user, "user");
        K0 k02 = f49924g;
        if (k02 != null) {
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            k02.d(context, location, user);
        }
        G0.g(y(), "📍 Radar location updated | coordinates = (" + location.getLatitude() + ", " + location.getLongitude() + "); accuracy = " + location.getAccuracy() + " meters; link = https://radar.com/dashboard/users/" + user.j(), null, null, 6, null);
    }

    public final void q0(EnumC4599k level, String message, EnumC4600l enumC4600l, Date createdAt) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        K0 k02 = f49924g;
        Hh.d dVar = null;
        if (k02 != null) {
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            k02.e(context, message);
        }
        Hh.d dVar2 = f49930m;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logBuffer");
        } else {
            dVar = dVar2;
        }
        dVar.b(level, enumC4600l, message, createdAt);
    }

    public final Handler t() {
        Handler handler = f49923f;
        if (handler != null) {
            return handler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("handler");
        return null;
    }

    public final void u0(Gh.D token) {
        Intrinsics.checkNotNullParameter(token, "token");
        b1 b1Var = f49925h;
        if (b1Var != null) {
            Context context = f49921d;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            b1Var.a(context, token);
        }
        G0.g(y(), "📍️ Radar token updated | passed = " + token.c() + "; expiresAt = " + token.a() + "; expiresIn = " + token.b() + "; token = " + token.d(), null, null, 6, null);
    }

    public final boolean v() {
        return f49919b;
    }

    public final void w0(io.radar.sdk.T t10) {
        Intrinsics.checkNotNullParameter(t10, "<set-?>");
        f49927j = t10;
    }

    public final E0 x() {
        E0 e02 = f49928k;
        if (e02 != null) {
            return e02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationManager");
        return null;
    }

    public final void x0(C4619e0 c4619e0) {
        Intrinsics.checkNotNullParameter(c4619e0, "<set-?>");
        f49932o = c4619e0;
    }

    public final G0 y() {
        G0 g02 = f49926i;
        if (g02 != null) {
            return g02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logger");
        return null;
    }

    public final void y0(C4629j0 c4629j0) {
        Intrinsics.checkNotNullParameter(c4629j0, "<set-?>");
        f49929l = c4629j0;
    }
}
