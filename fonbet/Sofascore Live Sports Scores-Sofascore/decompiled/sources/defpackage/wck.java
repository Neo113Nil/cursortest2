package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class wck extends l3 {
    public final gef a;
    public final int b;
    public final int c;
    public final String d;
    public final Integer e;
    public final jnd f;
    public final int g;

    public wck(gef gefVar, int i, int i2, jnd jndVar, int i3) {
        int i4;
        String str = gefVar.b;
        Integer num = (i3 & 16) != 0 ? null : 0;
        jndVar = (i3 & 32) != 0 ? null : jndVar;
        str.getClass();
        this.a = gefVar;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = num;
        this.f = jndVar;
        if (i2 < 10) {
            i4 = 1;
        } else if (i2 < 100) {
            i4 = 2;
        } else {
            if (i2 >= 1000) {
                a70.p(lnb.k(i2, "Max value ", " is too large"));
                throw null;
            }
            i4 = 3;
        }
        this.g = i4;
    }

    @Override // defpackage.l3
    public final gef a() {
        return this.a;
    }

    @Override // defpackage.l3
    public final Object b() {
        return this.e;
    }

    @Override // defpackage.l3
    public final String c() {
        return this.d;
    }

    @Override // defpackage.l3
    public final jnd d() {
        return this.f;
    }
}
