package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class whe extends o02 {
    public final /* synthetic */ f5e m;
    public final /* synthetic */ f5e n;
    public final /* synthetic */ j25 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    public whe(f5e f5eVar, f5e f5eVar2, j25 j25Var, int i, int i2) {
        this.m = f5eVar;
        this.n = f5eVar2;
        this.o = j25Var;
        this.p = i;
        this.q = i2;
    }

    @Override // defpackage.o02
    public final boolean H(int i, int i2) {
        Object c = this.m.c(i);
        Object c2 = this.n.c(i2);
        if (c == c2) {
            return true;
        }
        return this.o.a(c, c2);
    }

    @Override // defpackage.o02
    public final boolean I(int i, int i2) {
        Object c = this.m.c(i);
        Object c2 = this.n.c(i2);
        if (c == c2) {
            return true;
        }
        return this.o.b(c, c2);
    }

    @Override // defpackage.o02
    public final Object R(int i, int i2) {
        if (this.m.c(i) == this.n.c(i2)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // defpackage.o02
    public final int W() {
        return this.q;
    }

    @Override // defpackage.o02
    public final int X() {
        return this.p;
    }
}
