package he;

import ce.o;
import he.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import je.AbstractC7394n;
import je.N;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9831W;
import td.InterfaceC9836b;
import td.InterfaceC9845k;
import td.c0;

/* loaded from: classes10.dex */
final class q implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final n.c f65465a;

    public q(n.c cVar) {
        this.f65465a = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n.c cVar = this.f65465a;
        cVar.getClass();
        HashSet hashSet = new HashSet();
        n nVar = n.this;
        Iterator<N> it = ((AbstractC7394n) nVar.k()).o().iterator();
        while (it.hasNext()) {
            for (InterfaceC9845k interfaceC9845k : o.a.a(it.next().p(), null, 3)) {
                if ((interfaceC9845k instanceof c0) || (interfaceC9845k instanceof InterfaceC9831W)) {
                    hashSet.add(((InterfaceC9836b) interfaceC9845k).getName());
                }
            }
        }
        List<Nd.h> v02 = nVar.Q0().v0();
        Intrinsics.checkNotNullExpressionValue(v02, "getFunctionList(...)");
        Iterator<T> it2 = v02.iterator();
        while (it2.hasNext()) {
            hashSet.add(fe.L.b(nVar.P0().g(), ((Nd.h) it2.next()).X()));
        }
        List<Nd.m> G02 = nVar.Q0().G0();
        Intrinsics.checkNotNullExpressionValue(G02, "getPropertyList(...)");
        Iterator<T> it3 = G02.iterator();
        while (it3.hasNext()) {
            hashSet.add(fe.L.b(nVar.P0().g(), ((Nd.m) it3.next()).W()));
        }
        return e0.f(hashSet, hashSet);
    }
}
