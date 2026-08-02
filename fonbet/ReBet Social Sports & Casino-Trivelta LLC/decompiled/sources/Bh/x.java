package Bh;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import uh.InterfaceC6579c;
import yh.C6896e;

/* loaded from: classes3.dex */
public interface x extends Closeable {
    static x s1(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((x) it.next());
        }
        return arrayList.isEmpty() ? i.d() : arrayList.size() == 1 ? (x) arrayList.get(0) : h.d(arrayList);
    }

    void D1(InterfaceC6579c interfaceC6579c, k kVar);

    boolean F();

    void M1(l lVar);

    boolean S1();

    default C6896e T() {
        return C6896e.j();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().g(10L, TimeUnit.SECONDS);
    }

    default C6896e shutdown() {
        return T();
    }
}
