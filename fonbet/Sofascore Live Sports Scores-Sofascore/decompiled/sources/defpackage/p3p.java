package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p3p extends q3p {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ q3p e;

    public p3p(q3p q3pVar, int i, int i2) {
        this.e = q3pVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jca.e0(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.j3p
    public final Object[] m() {
        return this.e.m();
    }

    @Override // defpackage.j3p
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // defpackage.j3p
    public final int o() {
        return this.e.n() + this.c + this.d;
    }

    @Override // defpackage.j3p
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.q3p, java.util.List
    /* renamed from: t */
    public final q3p subList(int i, int i2) {
        jca.g0(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }
}
