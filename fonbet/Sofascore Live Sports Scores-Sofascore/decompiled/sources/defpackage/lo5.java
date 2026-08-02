package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lo5 implements e1g {
    public final boolean a;
    public final boolean b;
    public final e1g c;
    public final sn5 d;
    public final pia e;
    public int f;
    public boolean g;

    public lo5(e1g e1gVar, boolean z, boolean z2, pia piaVar, sn5 sn5Var) {
        w1a.m(e1gVar, "Argument must not be null");
        this.c = e1gVar;
        this.a = z;
        this.b = z2;
        this.e = piaVar;
        w1a.m(sn5Var, "Argument must not be null");
        this.d = sn5Var;
    }

    @Override // defpackage.e1g
    public final int a() {
        return this.c.a();
    }

    public final synchronized void b() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    @Override // defpackage.e1g
    public final synchronized void c() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.g = true;
        if (this.b) {
            this.c.c();
        }
    }

    @Override // defpackage.e1g
    public final Class d() {
        return this.c.d();
    }

    public final void e() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.d.d(this.e, this);
        }
    }

    @Override // defpackage.e1g
    public final Object get() {
        return this.c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + '}';
    }
}
