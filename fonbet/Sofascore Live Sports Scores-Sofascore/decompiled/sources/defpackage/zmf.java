package defpackage;

import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zmf {
    public static final umf d = umf.h();
    public final eff a;
    public final igf b;
    public g0c c = j0c.a;

    public zmf(eff effVar, igf igfVar) {
        this.a = effVar;
        this.b = igfVar;
    }

    public final x0c a() {
        g0c g0cVar = this.c;
        Parser parser = umf.parser();
        eff effVar = this.a;
        effVar.getClass();
        q0c q0cVar = new q0c(new c00(5, effVar, parser));
        ymf ymfVar = new ymf(this, 0);
        p4h p4hVar = un0.m;
        x0c x0cVar = new x0c(q0cVar, ymfVar, p4hVar);
        g0cVar.getClass();
        return new x0c(new l0c(g0cVar, x0cVar, 2), p4hVar, new ymf(this, 1));
    }

    public final rmf b() {
        qmf j = rmf.j();
        j.k(0L);
        this.b.getClass();
        j.j(System.currentTimeMillis());
        return (rmf) j.build();
    }
}
