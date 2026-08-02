package m2;

import m2.e;
import n2.C8420b;

/* loaded from: classes.dex */
public class m extends j {

    /* renamed from: x0, reason: collision with root package name */
    private int f74250x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    private int f74251y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    private int f74252z0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    private int f74242A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    private int f74243B0 = 0;

    /* renamed from: C0, reason: collision with root package name */
    private int f74244C0 = 0;

    /* renamed from: D0, reason: collision with root package name */
    private boolean f74245D0 = false;

    /* renamed from: E0, reason: collision with root package name */
    private int f74246E0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    private int f74247F0 = 0;

    /* renamed from: G0, reason: collision with root package name */
    protected C8420b.a f74248G0 = new C8420b.a();

    /* renamed from: H0, reason: collision with root package name */
    C8420b.InterfaceC1286b f74249H0 = null;

    public final void a1(boolean z11) {
        int i11 = this.f74252z0;
        if (i11 > 0 || this.f74242A0 > 0) {
            if (z11) {
                this.f74243B0 = this.f74242A0;
                this.f74244C0 = i11;
            } else {
                this.f74243B0 = i11;
                this.f74244C0 = this.f74242A0;
            }
        }
    }

    public final int b1() {
        return this.f74247F0;
    }

    @Override // m2.j, m2.i
    public final void c() {
        for (int i11 = 0; i11 < this.f74240w0; i11++) {
            e eVar = this.f74239v0[i11];
            if (eVar != null) {
                eVar.G0();
            }
        }
    }

    public final int c1() {
        return this.f74246E0;
    }

    public final int d1() {
        return this.f74251y0;
    }

    public final int e1() {
        return this.f74243B0;
    }

    public final int f1() {
        return this.f74244C0;
    }

    public final int g1() {
        return this.f74250x0;
    }

    public void h1(int i11, int i12, int i13, int i14) {
    }

    protected final void i1(e eVar, e.b bVar, int i11, e.b bVar2, int i12) {
        C8420b.InterfaceC1286b interfaceC1286b;
        e eVar2;
        while (true) {
            interfaceC1286b = this.f74249H0;
            if (interfaceC1286b != null || (eVar2 = this.f74116W) == null) {
                break;
            } else {
                this.f74249H0 = ((f) eVar2).f74188z0;
            }
        }
        C8420b.a aVar = this.f74248G0;
        aVar.f76296a = bVar;
        aVar.f76297b = bVar2;
        aVar.f76298c = i11;
        aVar.f76299d = i12;
        interfaceC1286b.b(eVar, aVar);
        eVar.T0(aVar.f76300e);
        eVar.z0(aVar.f76301f);
        eVar.y0(aVar.f76303h);
        eVar.p0(aVar.f76302g);
    }

    public final boolean j1() {
        return this.f74245D0;
    }

    protected final void k1(boolean z11) {
        this.f74245D0 = z11;
    }

    public final void l1(int i11, int i12) {
        this.f74246E0 = i11;
        this.f74247F0 = i12;
    }

    public final void m1(int i11) {
        this.f74250x0 = i11;
        this.f74251y0 = i11;
        this.f74252z0 = i11;
        this.f74242A0 = i11;
    }

    public final void n1(int i11) {
        this.f74251y0 = i11;
    }

    public final void o1(int i11) {
        this.f74242A0 = i11;
    }

    public final void p1(int i11) {
        this.f74243B0 = i11;
    }

    public final void q1(int i11) {
        this.f74244C0 = i11;
    }

    public final void r1(int i11) {
        this.f74252z0 = i11;
        this.f74243B0 = i11;
        this.f74244C0 = i11;
    }

    public final void s1(int i11) {
        this.f74250x0 = i11;
    }
}
