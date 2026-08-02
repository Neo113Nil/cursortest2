package x1;

import java.util.ArrayList;
import java.util.List;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final long f104913a;

    /* renamed from: b, reason: collision with root package name */
    private final long f104914b;

    /* renamed from: c, reason: collision with root package name */
    private final long f104915c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f104916d;

    /* renamed from: e, reason: collision with root package name */
    private final float f104917e;

    /* renamed from: f, reason: collision with root package name */
    private final long f104918f;

    /* renamed from: g, reason: collision with root package name */
    private final long f104919g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f104920h;

    /* renamed from: i, reason: collision with root package name */
    private final int f104921i;

    /* renamed from: j, reason: collision with root package name */
    private final long f104922j;

    /* renamed from: k, reason: collision with root package name */
    private List<C10631f> f104923k;

    /* renamed from: l, reason: collision with root package name */
    private long f104924l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private C10630e f104925m;

    private x() {
        throw null;
    }

    public x(long j11, long j12, long j13, boolean z11, float f7, long j14, long j15, boolean z12, boolean z13, int i11, long j16) {
        this.f104913a = j11;
        this.f104914b = j12;
        this.f104915c = j13;
        this.f104916d = z11;
        this.f104917e = f7;
        this.f104918f = j14;
        this.f104919g = j15;
        this.f104920h = z12;
        this.f104921i = i11;
        this.f104922j = j16;
        this.f104924l = 0L;
        this.f104925m = new C10630e(z13, z13);
    }

    public static x b(x xVar, long j11, long j12, ArrayList arrayList) {
        x xVar2 = new x(xVar.f104913a, xVar.f104914b, j11, xVar.f104916d, xVar.f104917e, xVar.f104918f, j12, xVar.f104920h, xVar.f104921i, arrayList, xVar.f104922j, xVar.f104924l);
        xVar2.f104925m = xVar.f104925m;
        return xVar2;
    }

    public final void a() {
        this.f104925m.c();
        this.f104925m.d();
    }

    @NotNull
    public final List<C10631f> c() {
        List<C10631f> list = this.f104923k;
        return list == null ? kotlin.collections.K.f71697a : list;
    }

    public final long d() {
        return this.f104913a;
    }

    public final long e() {
        return this.f104924l;
    }

    public final long f() {
        return this.f104915c;
    }

    public final boolean g() {
        return this.f104916d;
    }

    public final float h() {
        return this.f104917e;
    }

    public final long i() {
        return this.f104919g;
    }

    public final boolean j() {
        return this.f104920h;
    }

    public final long k() {
        return this.f104922j;
    }

    public final int l() {
        return this.f104921i;
    }

    public final long m() {
        return this.f104914b;
    }

    public final boolean n() {
        return this.f104925m.a() || this.f104925m.b();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) w.d(this.f104913a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f104914b);
        sb2.append(", position=");
        sb2.append((Object) C7459e.m(this.f104915c));
        sb2.append(", pressed=");
        sb2.append(this.f104916d);
        sb2.append(", pressure=");
        sb2.append(this.f104917e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f104918f);
        sb2.append(", previousPosition=");
        sb2.append((Object) C7459e.m(this.f104919g));
        sb2.append(", previousPressed=");
        sb2.append(this.f104920h);
        sb2.append(", isConsumed=");
        sb2.append(n());
        sb2.append(", type=");
        int i11 = this.f104921i;
        sb2.append((Object) (i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", historical=");
        sb2.append(c());
        sb2.append(",scrollDelta=");
        sb2.append((Object) C7459e.m(this.f104922j));
        sb2.append(')');
        return sb2.toString();
    }

    public x(long j11, long j12, long j13, boolean z11, float f7, long j14, long j15, boolean z12, int i11, List list, long j16, long j17) {
        this(j11, j12, j13, z11, f7, j14, j15, z12, false, i11, j16);
        this.f104923k = list;
        this.f104924l = j17;
    }
}
