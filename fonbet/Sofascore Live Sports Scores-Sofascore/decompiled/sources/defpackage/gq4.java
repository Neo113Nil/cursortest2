package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gq4 implements g1c {
    public final /* synthetic */ int a;
    public final g1c b;
    public final Enum c;
    public final Enum d;

    public /* synthetic */ gq4(g1c g1cVar, Enum r2, Enum r3, int i) {
        this.a = i;
        this.b = g1cVar;
        this.c = r2;
        this.d = r3;
    }

    @Override // defpackage.g1c
    public final int B(int i) {
        switch (this.a) {
        }
        return this.b.B(i);
    }

    @Override // defpackage.g1c
    public final int G(int i) {
        switch (this.a) {
        }
        return this.b.G(i);
    }

    @Override // defpackage.g1c
    public final qhe J(long j) {
        int i = this.a;
        Enum r1 = this.c;
        Enum r2 = this.d;
        g1c g1cVar = this.b;
        switch (i) {
            case 0:
                m9a m9aVar = (m9a) r1;
                if (((q9a) r2) == q9a.a) {
                    return new m68(m9aVar == m9a.b ? g1cVar.G(an3.g(j)) : g1cVar.B(an3.g(j)), an3.c(j) ? an3.g(j) : 32767, 0);
                }
                return new m68(an3.d(j) ? an3.h(j) : 32767, m9aVar == m9a.b ? g1cVar.b(an3.h(j)) : g1cVar.s(an3.h(j)), 0);
            case 1:
                u1c u1cVar = (u1c) r1;
                if (((v1c) r2) == v1c.a) {
                    return new m68(u1cVar == u1c.b ? g1cVar.G(an3.g(j)) : g1cVar.B(an3.g(j)), an3.c(j) ? an3.g(j) : 32767, 1);
                }
                return new m68(an3.d(j) ? an3.h(j) : 32767, u1cVar == u1c.b ? g1cVar.b(an3.h(j)) : g1cVar.s(an3.h(j)), 1);
            default:
                zdd zddVar = (zdd) r1;
                if (((aed) r2) == aed.a) {
                    return new m68(zddVar == zdd.b ? g1cVar.G(an3.g(j)) : g1cVar.B(an3.g(j)), an3.c(j) ? an3.g(j) : 32767, 2);
                }
                return new m68(an3.d(j) ? an3.h(j) : 32767, zddVar == zdd.b ? g1cVar.b(an3.h(j)) : g1cVar.s(an3.h(j)), 2);
        }
    }

    @Override // defpackage.g1c
    public final int b(int i) {
        switch (this.a) {
        }
        return this.b.b(i);
    }

    @Override // defpackage.g1c
    public final Object h() {
        switch (this.a) {
        }
        return this.b.h();
    }

    @Override // defpackage.g1c
    public final int s(int i) {
        switch (this.a) {
        }
        return this.b.s(i);
    }
}
