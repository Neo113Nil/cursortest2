package nd;

import ce.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import nd.X;
import td.InterfaceC9839e;
import td.InterfaceC9845k;

/* renamed from: nd.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8521S implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final X.a f76912a;

    public C8521S(X.a aVar) {
        this.f76912a = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Collection a11 = o.a.a(this.f76912a.j().H(), null, 3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a11) {
            if (!Vd.i.v((InterfaceC9845k) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC9845k interfaceC9845k = (InterfaceC9845k) it.next();
            InterfaceC9839e interfaceC9839e = interfaceC9845k instanceof InterfaceC9839e ? (InterfaceC9839e) interfaceC9845k : null;
            Class<?> l11 = interfaceC9839e != null ? g1.l(interfaceC9839e) : null;
            X x11 = l11 != null ? new X(l11) : null;
            if (x11 != null) {
                arrayList2.add(x11);
            }
        }
        return arrayList2;
    }
}
