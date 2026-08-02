package r1;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7786D;
import l1.C7789G;
import l1.C7790H;
import l1.u0;
import n1.C8416i;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: b, reason: collision with root package name */
    private AbstractC7799Q f82717b;

    /* renamed from: c, reason: collision with root package name */
    private float f82718c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private List<? extends g> f82719d;

    /* renamed from: e, reason: collision with root package name */
    private float f82720e;

    /* renamed from: f, reason: collision with root package name */
    private float f82721f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC7799Q f82722g;

    /* renamed from: h, reason: collision with root package name */
    private int f82723h;

    /* renamed from: i, reason: collision with root package name */
    private int f82724i;

    /* renamed from: j, reason: collision with root package name */
    private float f82725j;

    /* renamed from: k, reason: collision with root package name */
    private float f82726k;

    /* renamed from: l, reason: collision with root package name */
    private float f82727l;

    /* renamed from: m, reason: collision with root package name */
    private float f82728m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f82729n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f82730o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f82731p;

    /* renamed from: q, reason: collision with root package name */
    private C8416i f82732q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C7786D f82733r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private C7786D f82734s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final Object f82735t;

    static final class a extends AbstractC7737t implements Function0<u0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f82736b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final u0 invoke() {
            return C7789G.a();
        }
    }

    public f() {
        super(0);
        this.f82718c = 1.0f;
        this.f82719d = m.a();
        this.f82720e = 1.0f;
        this.f82723h = 0;
        this.f82724i = 0;
        this.f82725j = 4.0f;
        this.f82727l = 1.0f;
        this.f82729n = true;
        this.f82730o = true;
        C7786D a11 = C7790H.a();
        this.f82733r = a11;
        this.f82734s = a11;
        this.f82735t = Sc.k.a(Sc.n.NONE, a.f82736b);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Sc.j, java.lang.Object] */
    private final void t() {
        float f7 = this.f82726k;
        C7786D c7786d = this.f82733r;
        if (f7 == 0.0f && this.f82727l == 1.0f) {
            this.f82734s = c7786d;
            return;
        }
        if (Intrinsics.d(this.f82734s, c7786d)) {
            this.f82734s = C7790H.a();
        } else {
            int m11 = this.f82734s.m();
            this.f82734s.h();
            this.f82734s.q(m11);
        }
        ?? r02 = this.f82735t;
        ((u0) r02.getValue()).b(c7786d);
        float length = ((u0) r02.getValue()).getLength();
        float f11 = this.f82726k;
        float f12 = this.f82728m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f82727l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((u0) r02.getValue()).a(f13, f14, this.f82734s);
        } else {
            ((u0) r02.getValue()).a(f13, length, this.f82734s);
            ((u0) r02.getValue()).a(0.0f, f14, this.f82734s);
        }
    }

    @Override // r1.j
    public final void a(@NotNull InterfaceC8412e interfaceC8412e) {
        C8416i c8416i;
        if (this.f82729n) {
            i.b(this.f82719d, this.f82733r);
            t();
        } else if (this.f82731p) {
            t();
        }
        this.f82729n = false;
        this.f82731p = false;
        AbstractC7799Q abstractC7799Q = this.f82717b;
        if (abstractC7799Q != null) {
            InterfaceC8412e.x1(interfaceC8412e, this.f82734s, abstractC7799Q, this.f82718c, null, 56);
        }
        AbstractC7799Q abstractC7799Q2 = this.f82722g;
        if (abstractC7799Q2 != null) {
            C8416i c8416i2 = this.f82732q;
            if (this.f82730o || c8416i2 == null) {
                C8416i c8416i3 = new C8416i(this.f82721f, this.f82725j, this.f82723h, this.f82724i, null, 16);
                this.f82732q = c8416i3;
                this.f82730o = false;
                c8416i = c8416i3;
            } else {
                c8416i = c8416i2;
            }
            InterfaceC8412e.x1(interfaceC8412e, this.f82734s, abstractC7799Q2, this.f82720e, c8416i, 48);
        }
    }

    public final AbstractC7799Q e() {
        return this.f82717b;
    }

    public final AbstractC7799Q f() {
        return this.f82722g;
    }

    public final void g(AbstractC7799Q abstractC7799Q) {
        this.f82717b = abstractC7799Q;
        c();
    }

    public final void h(float f7) {
        this.f82718c = f7;
        c();
    }

    public final void i(@NotNull List<? extends g> list) {
        this.f82719d = list;
        this.f82729n = true;
        c();
    }

    public final void j(int i11) {
        this.f82734s.q(i11);
        c();
    }

    public final void k(AbstractC7799Q abstractC7799Q) {
        this.f82722g = abstractC7799Q;
        c();
    }

    public final void l(float f7) {
        this.f82720e = f7;
        c();
    }

    public final void m(int i11) {
        this.f82723h = i11;
        this.f82730o = true;
        c();
    }

    public final void n(int i11) {
        this.f82724i = i11;
        this.f82730o = true;
        c();
    }

    public final void o(float f7) {
        this.f82725j = f7;
        this.f82730o = true;
        c();
    }

    public final void p(float f7) {
        this.f82721f = f7;
        this.f82730o = true;
        c();
    }

    public final void q(float f7) {
        this.f82727l = f7;
        this.f82731p = true;
        c();
    }

    public final void r(float f7) {
        this.f82728m = f7;
        this.f82731p = true;
        c();
    }

    public final void s(float f7) {
        this.f82726k = f7;
        this.f82731p = true;
        c();
    }

    @NotNull
    public final String toString() {
        return this.f82733r.toString();
    }
}
