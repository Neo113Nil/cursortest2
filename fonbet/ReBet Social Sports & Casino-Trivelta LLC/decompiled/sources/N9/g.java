package N9;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f7971a;

    public g(a aVar) {
        this.f7971a = aVar;
    }

    @Override // N9.e
    public final void a(c cVar) {
        LinkedList linkedList;
        LinkedList linkedList2;
        c cVar2;
        this.f7971a.f7964a = cVar;
        linkedList = this.f7971a.f7966c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            cVar2 = this.f7971a.f7964a;
            kVar.b(cVar2);
        }
        linkedList2 = this.f7971a.f7966c;
        linkedList2.clear();
        this.f7971a.f7965b = null;
    }
}
