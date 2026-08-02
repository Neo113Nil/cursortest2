package defpackage;

import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wbl {
    public final sz8 a(icl iclVar) {
        iclVar.getClass();
        List c = a.c(iclVar);
        xbl xblVar = (xbl) this;
        if (!c.isEmpty()) {
            return new lbl(xblVar, null, nf6.b, c, 0).a();
        }
        a70.p("enqueue needs at least one WorkRequest.");
        return null;
    }

    public final sz8 b(String str, nf6 nf6Var, ltd ltdVar) {
        ltdVar.getClass();
        return new lbl((xbl) this, str, nf6Var, a.c(ltdVar), 0).a();
    }
}
