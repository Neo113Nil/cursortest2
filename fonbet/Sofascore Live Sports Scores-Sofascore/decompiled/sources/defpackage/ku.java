package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku implements n32, mu, yu4 {
    public final /* synthetic */ lu a;

    public /* synthetic */ ku(lu luVar) {
        this.a = luVar;
    }

    @Override // defpackage.yu4
    public void b(vff vffVar) {
        lu luVar = this.a;
        iu iuVar = (iu) vffVar.get();
        hpo hpoVar = new hpo(iuVar);
        z41 z41Var = new z41(17, false);
        fu f = iuVar.f("clx", z41Var);
        if (f == null) {
            f = iuVar.f("crash", z41Var);
        }
        if (f != null) {
            dad dadVar = new dad(11);
            x6k x6kVar = new x6k(hpoVar);
            synchronized (luVar) {
                try {
                    Iterator it = ((ArrayList) luVar.a).iterator();
                    while (it.hasNext()) {
                        dadVar.b = (mw3) it.next();
                    }
                    z41Var.c = dadVar;
                    z41Var.b = x6kVar;
                    luVar.c = dadVar;
                    luVar.b = x6kVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.mu
    public void j(Bundle bundle) {
        ((mu) this.a.b).j(bundle);
    }

    @Override // defpackage.n32
    public void q(mw3 mw3Var) {
        lu luVar = this.a;
        synchronized (luVar) {
            try {
                if (((n32) luVar.c) instanceof p35) {
                    ((ArrayList) luVar.a).add(mw3Var);
                }
                ((n32) luVar.c).q(mw3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
