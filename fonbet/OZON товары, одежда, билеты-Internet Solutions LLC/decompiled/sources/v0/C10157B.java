package v0;

import B1.AbstractC2531a;
import B1.W;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* renamed from: v0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10157B implements y, W {

    /* renamed from: a, reason: collision with root package name */
    private final C10158C f101417a;

    /* renamed from: b, reason: collision with root package name */
    private int f101418b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f101419c;

    /* renamed from: d, reason: collision with root package name */
    private float f101420d;

    /* renamed from: e, reason: collision with root package name */
    private final float f101421e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f101422f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final xe.M f101423g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Z1.d f101424h;

    /* renamed from: i, reason: collision with root package name */
    private final long f101425i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f101426j;

    /* renamed from: k, reason: collision with root package name */
    private final int f101427k;

    /* renamed from: l, reason: collision with root package name */
    private final int f101428l;

    /* renamed from: m, reason: collision with root package name */
    private final int f101429m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final EnumC9142v f101430n;

    /* renamed from: o, reason: collision with root package name */
    private final int f101431o;

    /* renamed from: p, reason: collision with root package name */
    private final int f101432p;

    /* renamed from: q, reason: collision with root package name */
    private final /* synthetic */ W f101433q;

    private C10157B() {
        throw null;
    }

    public C10157B(C10158C c10158c, int i11, boolean z11, float f7, W w11, float f11, boolean z12, xe.M m11, Z1.d dVar, long j11, List list, int i12, int i13, int i14, EnumC9142v enumC9142v, int i15, int i16) {
        this.f101417a = c10158c;
        this.f101418b = i11;
        this.f101419c = z11;
        this.f101420d = f7;
        this.f101421e = f11;
        this.f101422f = z12;
        this.f101423g = m11;
        this.f101424h = dVar;
        this.f101425i = j11;
        this.f101426j = list;
        this.f101427k = i12;
        this.f101428l = i13;
        this.f101429m = i14;
        this.f101430n = enumC9142v;
        this.f101431o = i15;
        this.f101432p = i16;
        this.f101433q = w11;
    }

    @Override // v0.y
    public final long a() {
        W w11 = this.f101433q;
        return Z1.r.a(w11.getWidth(), w11.getHeight());
    }

    @Override // v0.y
    public final int b() {
        return this.f101431o;
    }

    @Override // v0.y
    public final int c() {
        return -this.f101427k;
    }

    @Override // v0.y
    public final int d() {
        return this.f101429m;
    }

    @Override // v0.y
    public final int e() {
        return this.f101432p;
    }

    @Override // v0.y
    public final int f() {
        return this.f101427k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<v0.C>] */
    @Override // v0.y
    @NotNull
    public final List<C10158C> g() {
        return this.f101426j;
    }

    @Override // B1.W
    public final int getHeight() {
        return this.f101433q.getHeight();
    }

    @Override // v0.y
    @NotNull
    public final EnumC9142v getOrientation() {
        return this.f101430n;
    }

    @Override // B1.W
    public final int getWidth() {
        return this.f101433q.getWidth();
    }

    @Override // v0.y
    public final int h() {
        return this.f101428l;
    }

    public final boolean i() {
        C10158C c10158c = this.f101417a;
        return ((c10158c != null ? c10158c.getIndex() : 0) == 0 && this.f101418b == 0) ? false : true;
    }

    public final boolean j() {
        return this.f101419c;
    }

    public final long k() {
        return this.f101425i;
    }

    public final float l() {
        return this.f101420d;
    }

    @NotNull
    public final xe.M m() {
        return this.f101423g;
    }

    @NotNull
    public final Z1.d n() {
        return this.f101424h;
    }

    public final C10158C o() {
        return this.f101417a;
    }

    public final int p() {
        return this.f101418b;
    }

    public final float q() {
        return this.f101421e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (java.lang.Math.min((r2.j() + r2.getOffset()) - r5, (r3.j() + r3.getOffset()) - r4) > (-r8)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        r7.f101418b -= r8;
        r2 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r1 >= r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        ((v0.C10158C) r0.get(r1)).a(r8, r9);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r7.f101420d = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r7.f101419c != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r8 <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        r7.f101419c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (java.lang.Math.min(r5 - r2.getOffset(), r4 - r3.getOffset()) > r8) goto L23;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(int i11, boolean z11) {
        C10158C c10158c;
        int i12 = 0;
        if (!this.f101422f) {
            ?? r02 = this.f101426j;
            if (!r02.isEmpty() && (c10158c = this.f101417a) != null) {
                int j11 = c10158c.j();
                int i13 = this.f101418b - i11;
                if (i13 >= 0 && i13 < j11) {
                    C10158C c10158c2 = (C10158C) C7714v.K(r02);
                    C10158C c10158c3 = (C10158C) C7714v.X(r02);
                    if (!c10158c2.i() && !c10158c3.i()) {
                        int i14 = this.f101428l;
                        int i15 = this.f101427k;
                        if (i11 < 0) {
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // B1.W
    @NotNull
    public final Map<AbstractC2531a, Integer> s() {
        return this.f101433q.s();
    }

    @Override // B1.W
    public final Function1<Object, Unit> t() {
        return this.f101433q.t();
    }

    @Override // B1.W
    public final void u() {
        this.f101433q.u();
    }
}
