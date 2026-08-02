package p1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f21429a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21430b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21431c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21432d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21433e;

    /* renamed from: f, reason: collision with root package name */
    public final float f21434f;

    /* renamed from: g, reason: collision with root package name */
    public final float f21435g;

    /* renamed from: h, reason: collision with root package name */
    public final float f21436h;

    /* renamed from: i, reason: collision with root package name */
    public long f21437i;

    public n(long j, long j6, long j10, b bVar) {
        this.f21429a = j;
        this.f21430b = j6;
        this.f21431c = j10;
        long r5 = ci.c.r(ci.c.K(j, j6));
        this.f21432d = r5;
        long r6 = ci.c.r(ci.c.K(j10, j6));
        this.f21433e = r6;
        float f6 = bVar != null ? bVar.f21408a : 0.0f;
        this.f21434f = f6;
        this.f21435g = bVar != null ? bVar.f21409b : 0.0f;
        float o3 = ci.c.o(r5, r6);
        float f10 = 1;
        float f11 = p.f21444b;
        float sqrt = (float) Math.sqrt(f10 - (o3 * o3));
        this.f21436h = ((double) sqrt) > 0.001d ? ((o3 + f10) * f6) / sqrt : 0.0f;
        this.f21437i = s.g.a(0.0f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c b(float f6, float f10, long j, long j6, long j10, long j11, long j12, float f11) {
        s.g gVar;
        long r5 = ci.c.r(ci.c.K(j6, j));
        long V = ci.c.V(j, ci.c.Z(ci.c.Z(r5, f6), 1 + f10));
        long n9 = ci.c.n(ci.c.V(j10, j11), 2.0f);
        long a7 = s.g.a(p.c(ci.c.y(j10), ci.c.y(n9), f10), p.c(ci.c.z(j10), ci.c.z(n9), f10));
        long V2 = ci.c.V(j12, ci.c.Z(p.b(ci.c.y(a7) - ci.c.y(j12), ci.c.z(a7) - ci.c.z(j12)), f11));
        long K = ci.c.K(V2, j12);
        long a10 = s.g.a(-ci.c.z(K), ci.c.y(K));
        long a11 = s.g.a(-ci.c.z(a10), ci.c.y(a10));
        float o3 = ci.c.o(r5, a11);
        if (Math.abs(o3) >= 1.0E-4f) {
            float o4 = ci.c.o(ci.c.K(V2, j6), a11);
            if (Math.abs(o3) >= Math.abs(o4) * 1.0E-4f) {
                gVar = new s.g(ci.c.V(j6, ci.c.Z(r5, o4 / o3)));
                long j13 = gVar == null ? gVar.f22556a : j10;
                long n10 = ci.c.n(ci.c.V(V, ci.c.Z(j13, 2.0f)), 3.0f);
                return new c(new float[]{ci.c.y(V), ci.c.z(V), ci.c.y(n10), ci.c.z(n10), ci.c.y(j13), ci.c.z(j13), ci.c.y(V2), ci.c.z(V2)});
            }
        }
        gVar = null;
        if (gVar == null) {
        }
        long n102 = ci.c.n(ci.c.V(V, ci.c.Z(j13, 2.0f)), 3.0f);
        return new c(new float[]{ci.c.y(V), ci.c.z(V), ci.c.y(n102), ci.c.z(n102), ci.c.y(j13), ci.c.z(j13), ci.c.y(V2), ci.c.z(V2)});
    }

    public final float a(float f6) {
        float c2 = c();
        float f10 = this.f21435g;
        if (f6 > c2) {
            return f10;
        }
        float f11 = this.f21436h;
        if (f6 > f11) {
            return ((f6 - f11) * f10) / (c() - f11);
        }
        return 0.0f;
    }

    public final float c() {
        return (1 + this.f21435g) * this.f21436h;
    }
}
