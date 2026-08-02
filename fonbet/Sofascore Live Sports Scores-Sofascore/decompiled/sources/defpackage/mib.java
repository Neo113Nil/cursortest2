package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mib implements e1g, tm6 {
    public static final sx2 e = m6k.d0(20, new zic(27));
    public final tdi a = new tdi();
    public e1g b;
    public boolean c;
    public boolean d;

    @Override // defpackage.e1g
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.tm6
    public final tdi b() {
        return this.a;
    }

    @Override // defpackage.e1g
    public final synchronized void c() {
        this.a.a();
        this.d = true;
        if (!this.c) {
            this.b.c();
            this.b = null;
            e.b(this);
        }
    }

    @Override // defpackage.e1g
    public final Class d() {
        return this.b.d();
    }

    public final synchronized void e() {
        this.a.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            c();
        }
    }

    @Override // defpackage.e1g
    public final Object get() {
        return this.b.get();
    }
}
