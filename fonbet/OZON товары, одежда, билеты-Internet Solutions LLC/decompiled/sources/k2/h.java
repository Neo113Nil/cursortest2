package k2;

/* loaded from: classes8.dex */
public final class h implements e, j2.e {

    /* renamed from: a, reason: collision with root package name */
    final j2.f f70347a;

    /* renamed from: b, reason: collision with root package name */
    private int f70348b;

    /* renamed from: c, reason: collision with root package name */
    private m2.h f70349c;

    /* renamed from: d, reason: collision with root package name */
    private int f70350d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f70351e = -1;

    /* renamed from: f, reason: collision with root package name */
    private float f70352f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private String f70353g;

    public h(j2.f fVar) {
        this.f70347a = fVar;
    }

    @Override // j2.e
    public final void a(m2.e eVar) {
        if (eVar instanceof m2.h) {
            this.f70349c = (m2.h) eVar;
        } else {
            this.f70349c = null;
        }
    }

    @Override // k2.e, j2.e
    public final void apply() {
        this.f70349c.i1(this.f70348b);
        int i11 = this.f70350d;
        if (i11 != -1) {
            this.f70349c.f1(i11);
            return;
        }
        int i12 = this.f70351e;
        if (i12 != -1) {
            this.f70349c.g1(i12);
        } else {
            this.f70349c.h1(this.f70352f);
        }
    }

    @Override // j2.e
    public final m2.e b() {
        if (this.f70349c == null) {
            this.f70349c = new m2.h();
        }
        return this.f70349c;
    }

    @Override // j2.e
    public final e c() {
        return null;
    }

    public final void d(Float f7) {
        this.f70350d = -1;
        this.f70351e = this.f70347a.d(f7);
        this.f70352f = 0.0f;
    }

    public final void e(float f7) {
        this.f70350d = -1;
        this.f70351e = -1;
        this.f70352f = f7;
    }

    public final void f(Object obj) {
        this.f70353g = (String) obj;
    }

    public final void g(int i11) {
        this.f70348b = i11;
    }

    @Override // j2.e
    public final Object getKey() {
        return this.f70353g;
    }

    public final void h(Float f7) {
        this.f70350d = this.f70347a.d(f7);
        this.f70351e = -1;
        this.f70352f = 0.0f;
    }
}
