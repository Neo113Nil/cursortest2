package w0;

import B1.AbstractC2531a;
import B1.W;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* renamed from: w0.D, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10377D implements InterfaceC10374A, W {

    /* renamed from: a, reason: collision with root package name */
    private final C10379F f103133a;

    /* renamed from: b, reason: collision with root package name */
    private int f103134b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f103135c;

    /* renamed from: d, reason: collision with root package name */
    private float f103136d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f103137e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final xe.M f103138f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Z1.d f103139g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f103140h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f103141i;

    /* renamed from: j, reason: collision with root package name */
    private final int f103142j;

    /* renamed from: k, reason: collision with root package name */
    private final int f103143k;

    /* renamed from: l, reason: collision with root package name */
    private final int f103144l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final EnumC9142v f103145m;

    /* renamed from: n, reason: collision with root package name */
    private final int f103146n;

    /* renamed from: o, reason: collision with root package name */
    private final int f103147o;

    /* renamed from: p, reason: collision with root package name */
    private final /* synthetic */ W f103148p;

    /* JADX WARN: Multi-variable type inference failed */
    public C10377D(C10379F c10379f, int i11, boolean z11, float f7, @NotNull W w11, boolean z12, @NotNull xe.M m11, @NotNull Z1.d dVar, int i12, @NotNull Function1 function1, @NotNull List list, int i13, int i14, int i15, @NotNull EnumC9142v enumC9142v, int i16, int i17) {
        this.f103133a = c10379f;
        this.f103134b = i11;
        this.f103135c = z11;
        this.f103136d = f7;
        this.f103137e = z12;
        this.f103138f = m11;
        this.f103139g = dVar;
        this.f103140h = (AbstractC7737t) function1;
        this.f103141i = list;
        this.f103142j = i13;
        this.f103143k = i14;
        this.f103144l = i15;
        this.f103145m = enumC9142v;
        this.f103146n = i16;
        this.f103147o = i17;
        this.f103148p = w11;
    }

    @Override // w0.InterfaceC10374A
    public final long a() {
        W w11 = this.f103148p;
        return Z1.r.a(w11.getWidth(), w11.getHeight());
    }

    @Override // w0.InterfaceC10374A
    public final int b() {
        return this.f103146n;
    }

    @Override // w0.InterfaceC10374A
    public final int c() {
        return -this.f103142j;
    }

    @Override // w0.InterfaceC10374A
    public final int d() {
        return this.f103144l;
    }

    @Override // w0.InterfaceC10374A
    public final int e() {
        return this.f103147o;
    }

    @Override // w0.InterfaceC10374A
    public final int f() {
        return this.f103142j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<w0.E>] */
    @Override // w0.InterfaceC10374A
    @NotNull
    public final List<C10378E> g() {
        return this.f103141i;
    }

    @Override // B1.W
    public final int getHeight() {
        return this.f103148p.getHeight();
    }

    @Override // w0.InterfaceC10374A
    @NotNull
    public final EnumC9142v getOrientation() {
        return this.f103145m;
    }

    @Override // B1.W
    public final int getWidth() {
        return this.f103148p.getWidth();
    }

    @Override // w0.InterfaceC10374A
    public final int h() {
        return this.f103143k;
    }

    public final boolean i() {
        C10379F c10379f = this.f103133a;
        return ((c10379f != null ? c10379f.a() : 0) == 0 && this.f103134b == 0) ? false : true;
    }

    public final boolean j() {
        return this.f103135c;
    }

    public final float k() {
        return this.f103136d;
    }

    public final C10379F l() {
        return this.f103133a;
    }

    public final int m() {
        return this.f103134b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<java.lang.Integer, java.util.List<kotlin.Pair<java.lang.Integer, Z1.b>>>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function1<Integer, List<Pair<Integer, Z1.b>>> n() {
        return this.f103140h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (java.lang.Math.min((r2.j() + s0.C9561d.a(r2, r6)) - r5, (r3.j() + s0.C9561d.a(r3, r6)) - r4) > (-r9)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r8.f103134b -= r9;
        r2 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r1 >= r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        ((w0.C10378E) r0.get(r1)).o(r9);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        r8.f103136d = r9;
        r1 = true;
        r1 = true;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        if (r8.f103135c != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r9 <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        r8.f103135c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (java.lang.Math.min(r5 - s0.C9561d.a(r2, r6), r4 - s0.C9561d.a(r3, r6)) > r9) goto L23;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(int i11) {
        C10379F c10379f;
        boolean z11 = false;
        z11 = false;
        int i12 = 0;
        z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        if (!this.f103137e) {
            ?? r02 = this.f103141i;
            if (!r02.isEmpty() && (c10379f = this.f103133a) != null) {
                int d11 = c10379f.d();
                int i13 = this.f103134b - i11;
                if (i13 >= 0 && i13 < d11) {
                    C10378E c10378e = (C10378E) C7714v.K(r02);
                    C10378E c10378e2 = (C10378E) C7714v.X(r02);
                    if (!c10378e.r() && !c10378e2.r()) {
                        int i14 = this.f103143k;
                        int i15 = this.f103142j;
                        EnumC9142v enumC9142v = this.f103145m;
                        if (i11 < 0) {
                        }
                    }
                }
            }
        }
        return z11;
    }

    @Override // B1.W
    @NotNull
    public final Map<AbstractC2531a, Integer> s() {
        return this.f103148p.s();
    }

    @Override // B1.W
    public final Function1<Object, Unit> t() {
        return this.f103148p.t();
    }

    @Override // B1.W
    public final void u() {
        this.f103148p.u();
    }
}
