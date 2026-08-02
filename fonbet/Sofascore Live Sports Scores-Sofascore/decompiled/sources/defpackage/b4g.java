package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b4g extends w1a {
    public final w1a k;
    public final /* synthetic */ c4g l;

    public b4g(c4g c4gVar, w1a w1aVar) {
        this.l = c4gVar;
        this.k = w1aVar;
    }

    @Override // defpackage.w1a
    public final void A(k3d k3dVar) {
        sm0 sm0Var = k3dVar.b;
        IdentityHashMap identityHashMap = sm0Var.a;
        rm0 rm0Var = c4g.l;
        if (identityHashMap.get(rm0Var) != null) {
            a70.r("RetryingNameResolver can only be used once to wrap a NameResolver");
            return;
        }
        List list = Collections.EMPTY_LIST;
        sm0 sm0Var2 = sm0.b;
        List list2 = k3dVar.a;
        j3d j3dVar = k3dVar.c;
        sm0Var.getClass();
        a4g a4gVar = new a4g(this.l);
        IdentityHashMap identityHashMap2 = new IdentityHashMap(1);
        identityHashMap2.put(rm0Var, a4gVar);
        for (Map.Entry entry : sm0Var.a.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey())) {
                identityHashMap2.put((rm0) entry.getKey(), entry.getValue());
            }
        }
        this.k.A(new k3d(list2, new sm0(identityHashMap2), j3dVar));
    }

    @Override // defpackage.w1a
    public final void z(xei xeiVar) {
        this.k.z(xeiVar);
        this.l.k.execute(new t4f(this, 3));
    }
}
