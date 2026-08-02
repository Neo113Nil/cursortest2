package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class o9a extends wtc implements oma {
    public final /* synthetic */ int o;

    @Override // defpackage.oma
    public int b(tkb tkbVar, g1c g1cVar, int i) {
        switch (this.o) {
        }
        return g1cVar.G(i);
    }

    public int e(tkb tkbVar, g1c g1cVar, int i) {
        switch (this.o) {
        }
        return g1cVar.b(i);
    }

    @Override // defpackage.oma
    public int h(tkb tkbVar, g1c g1cVar, int i) {
        switch (this.o) {
        }
        return g1cVar.B(i);
    }

    @Override // defpackage.oma
    public l1c k(m1c m1cVar, g1c g1cVar, long j) {
        long k1 = k1(g1cVar, j);
        if (l1()) {
            k1 = cn3.e(j, k1);
        }
        qhe J = g1cVar.J(k1);
        return m1c.G0(m1cVar, J.a, J.b, new b3(J, 9));
    }

    public abstract long k1(g1c g1cVar, long j);

    public abstract boolean l1();

    public int m(tkb tkbVar, g1c g1cVar, int i) {
        switch (this.o) {
        }
        return g1cVar.s(i);
    }
}
