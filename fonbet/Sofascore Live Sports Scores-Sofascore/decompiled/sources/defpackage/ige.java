package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ige extends ffb {
    public final f6a g;
    public o6a h;
    public rk3 i;

    public ige(f6a f6aVar) {
        super(0);
        this.i = rk3.d;
        this.g = f6aVar;
    }

    @Override // defpackage.ffb
    public final xei a(cfb cfbVar) {
        Boolean bool;
        List list = cfbVar.a;
        if (list.isEmpty()) {
            xei h = xei.m.h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + cfbVar.b);
            o(h);
            return h;
        }
        Object obj = cfbVar.c;
        if ((obj instanceof gge) && (bool = ((gge) obj).a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        o6a o6aVar = this.h;
        if (o6aVar == null) {
            hcc x = ejg.x();
            x.X(list);
            ejg ejgVar = new ejg((List) x.b, (sm0) x.c, (Object[][]) x.d);
            f6a f6aVar = this.g;
            o6a l = f6aVar.l(ejgVar);
            l.M(new x89(2, this, l));
            this.h = l;
            hge hgeVar = new hge(bfb.b(l, null));
            rk3 rk3Var = rk3.a;
            this.i = rk3Var;
            f6aVar.M(rk3Var, hgeVar);
            l.K();
        } else {
            o6aVar.O(list);
        }
        return xei.e;
    }

    @Override // defpackage.ffb
    public final void o(xei xeiVar) {
        o6a o6aVar = this.h;
        if (o6aVar != null) {
            o6aVar.L();
            this.h = null;
        }
        hge hgeVar = new hge(bfb.a(xeiVar));
        rk3 rk3Var = rk3.c;
        this.i = rk3Var;
        this.g.M(rk3Var, hgeVar);
    }

    @Override // defpackage.ffb
    public final void y() {
        o6a o6aVar = this.h;
        if (o6aVar != null) {
            o6aVar.K();
        }
    }

    @Override // defpackage.ffb
    public final void z() {
        o6a o6aVar = this.h;
        if (o6aVar != null) {
            o6aVar.L();
        }
    }
}
