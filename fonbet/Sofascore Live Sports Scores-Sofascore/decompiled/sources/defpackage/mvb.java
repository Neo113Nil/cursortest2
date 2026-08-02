package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mvb extends mn8 {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public mvb(lij lijVar, Object obj, Object obj2) {
        super(lijVar);
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.mn8, defpackage.lij
    public final int b(Object obj) {
        Object obj2;
        if (e == obj && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // defpackage.mn8, defpackage.lij
    public final hij f(int i, hij hijVar, boolean z) {
        this.b.f(i, hijVar, z);
        if (lik.a(hijVar.b, this.d) && z) {
            hijVar.b = e;
        }
        return hijVar;
    }

    @Override // defpackage.mn8, defpackage.lij
    public final Object l(int i) {
        Object l = this.b.l(i);
        return lik.a(l, this.d) ? e : l;
    }

    @Override // defpackage.mn8, defpackage.lij
    public final jij m(int i, jij jijVar, long j) {
        this.b.m(i, jijVar, j);
        if (lik.a(jijVar.a, this.c)) {
            jijVar.a = jij.p;
        }
        return jijVar;
    }
}
