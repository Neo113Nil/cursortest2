package se0;

import Ae.C0;
import Ae.E0;
import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import ne0.C8583b;
import ne0.C8584c;
import ne0.C8586e;
import ne0.g;
import org.jetbrains.annotations.NotNull;
import re0.InterfaceC9261d;
import we0.InterfaceC10542A;
import we0.InterfaceC10545a;
import we0.m;
import we0.p;
import we0.u;
import we0.z;

/* renamed from: se0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9672a implements se0.c, InterfaceC9261d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C0 f98631a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C0 f98632b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f98633c;

    /* renamed from: d, reason: collision with root package name */
    private p f98634d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private g f98635e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f98636f;

    /* renamed from: se0.a$a, reason: collision with other inner class name */
    public static final class C2169a extends g {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C2169a f98637c = new C2169a();

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private static final u f98638d;

        static {
            u uVar = new u(new m(0.0d, 0.0d), new z(new InterfaceC10542A.a(new InterfaceC10545a.d(false)), new PointF(0.5f, 0.5f), false, false, 0.0f, 0.0f, 0.0f, 252), null, "USER_PLACEMARK_PIN_ID", null, 756);
            uVar.m("userLocationIcon");
            f98638d = uVar;
        }

        private C2169a() {
        }

        @NotNull
        public static u d() {
            return f98638d;
        }
    }

    /* renamed from: se0.a$b */
    public static abstract class b extends g {
        public abstract void d(Object obj);
    }

    /* renamed from: se0.a$c */
    public static final class c extends g {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final c f98639c = new c();

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private static final u f98640d;

        static {
            u uVar = new u(new m(0.0d, 0.0d), new z(new InterfaceC10542A.a(new InterfaceC10545a.d(true)), new PointF(0.5f, 0.5f), false, false, 0.0f, 0.0f, 0.0f, 252), null, "USER_PLACEMARK_PIN_ID", null, 756);
            uVar.m("userLocationIcon");
            f98640d = uVar;
        }

        private c() {
        }

        @NotNull
        public static u d() {
            return f98640d;
        }

        @Override // ne0.g
        public final boolean c() {
            return true;
        }
    }

    public AbstractC9672a() {
        C0 b11 = E0.b(0, 0, null, 7);
        this.f98631a = b11;
        this.f98632b = b11;
        this.f98635e = C2169a.f98637c;
    }

    @Override // se0.c
    public void a(@NotNull p location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f98634d = location;
        n(this.f98635e);
    }

    @Override // se0.c
    public void b(@NotNull g userMode) {
        u uVar;
        u uVar2;
        g gVar;
        u uVar3;
        Intrinsics.checkNotNullParameter(userMode, "userMode");
        if (userMode instanceof C8586e) {
            C8586e c8586e = (C8586e) userMode;
            u d11 = c8586e.d();
            uVar3 = g.f77085b;
            gVar = userMode;
            if (Intrinsics.d(d11, uVar3)) {
                c cVar = c.f98639c;
                cVar.getClass();
                u d12 = c.d();
                Object b11 = c8586e.d().b();
                d12.m(b11 != null ? b11 : "userLocationIcon");
                gVar = cVar;
            }
        } else if (userMode instanceof C8583b) {
            C8583b c8583b = (C8583b) userMode;
            u d13 = c8583b.d();
            uVar2 = g.f77084a;
            gVar = userMode;
            if (Intrinsics.d(d13, uVar2)) {
                C2169a c2169a = C2169a.f98637c;
                c2169a.getClass();
                u d14 = C2169a.d();
                Object b12 = c8583b.d().b();
                d14.m(b12 != null ? b12 : "userLocationIcon");
                gVar = c2169a;
            }
        } else if (userMode instanceof C8584c) {
            C8584c c8584c = (C8584c) userMode;
            u d15 = c8584c.d();
            uVar = g.f77084a;
            gVar = userMode;
            if (Intrinsics.d(d15, uVar)) {
                b e11 = e();
                Object b13 = c8584c.d().b();
                e11.d(b13 != null ? b13 : "userLocationIcon");
                gVar = e11;
            }
        } else {
            gVar = C2169a.f98637c;
        }
        this.f98635e = gVar;
        n(gVar);
    }

    public final p c() {
        return this.f98634d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final g d() {
        return this.f98635e;
    }

    @NotNull
    protected abstract b e();

    @NotNull
    public final C0 f() {
        return this.f98632b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final C0 g() {
        return this.f98631a;
    }

    public abstract void h(@NotNull u uVar);

    public final boolean i() {
        return this.f98633c;
    }

    protected final boolean j() {
        return this.f98636f;
    }

    @NotNull
    protected final u k(@NotNull u uVar, @NotNull String id2, z zVar) {
        m c11;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        p pVar = this.f98634d;
        if (pVar == null || (c11 = pVar.e()) == null) {
            c11 = uVar.c();
        }
        m mVar = c11;
        if (zVar == null) {
            zVar = uVar.d();
        }
        z zVar2 = zVar;
        Object b11 = uVar.b();
        if (b11 == null) {
            b11 = uVar.k();
        }
        u a11 = u.a(uVar, mVar, z.a(zVar2, null, null, zVar2.h() && this.f98633c, 0.0f, 0.0f, 247), null, id2, 756);
        a11.m(b11);
        return a11;
    }

    protected final void l(@NotNull u headingPlacemark) {
        Float d11;
        Intrinsics.checkNotNullParameter(headingPlacemark, "headingPlacemark");
        z d12 = headingPlacemark.d();
        p pVar = this.f98634d;
        h(k(headingPlacemark, "USER_BEARING_STATIC_IMAGE", z.a(d12, null, null, false, 0.0f, (pVar == null || (d11 = pVar.d()) == null) ? 0.0f : d11.floatValue(), 191)));
    }

    protected abstract void m(@NotNull b bVar);

    protected final void n(@NotNull g userMode) {
        Intrinsics.checkNotNullParameter(userMode, "userMode");
        p pVar = this.f98634d;
        if (pVar == null || Intrinsics.d(pVar.e(), new m(0.0d, 0.0d))) {
            return;
        }
        if (userMode instanceof C8583b) {
            h(k(((C8583b) userMode).d(), "USER_PLACEMARK_PIN_ID", null));
            return;
        }
        if (userMode instanceof C2169a) {
            ((C2169a) userMode).getClass();
            h(k(C2169a.d(), "USER_PLACEMARK_PIN_ID", null));
            return;
        }
        if (userMode instanceof C8586e) {
            C8586e c8586e = (C8586e) userMode;
            c8586e.getClass();
            C2169a.f98637c.getClass();
            h(this.f98636f ? k(c8586e.d(), "USER_PLACEMARK_PIN_ID", null) : k(C2169a.d(), "USER_PLACEMARK_PIN_ID", null));
            return;
        }
        if (userMode instanceof c) {
            ((c) userMode).getClass();
            h(k(c.d(), "USER_PLACEMARK_PIN_ID", null));
        } else if (userMode instanceof C8584c) {
            l(((C8584c) userMode).d());
        } else if (Intrinsics.d(userMode, e())) {
            m(e());
        }
    }

    public final void o(boolean z11) {
        if (z11 == this.f98633c) {
            return;
        }
        this.f98633c = z11;
        q(z11);
    }

    public final void p(boolean z11) {
        Object obj;
        this.f98636f = z11;
        g gVar = this.f98635e;
        if (gVar instanceof C8586e) {
            obj = ((C8586e) gVar).d().d().d();
        } else if (gVar instanceof c) {
            ((c) gVar).getClass();
            obj = c.d().d().d();
        } else {
            obj = null;
        }
        InterfaceC10542A.a aVar = obj instanceof InterfaceC10542A.a ? (InterfaceC10542A.a) obj : null;
        if (aVar == null) {
            b(this.f98635e);
        } else if (z11) {
            aVar.a().play();
        } else {
            aVar.a().stop();
        }
    }

    protected abstract void q(boolean z11);
}
