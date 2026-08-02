package Sh;

import Ph.M0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt;

/* renamed from: Sh.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1582u {

    /* renamed from: a, reason: collision with root package name */
    public static final C1582u f10819a;

    /* renamed from: b, reason: collision with root package name */
    public static final M0 f10820b;

    static {
        C1582u c1582u = new C1582u();
        f10819a = c1582u;
        H.f("kotlinx.coroutines.fast.service.loader", true);
        f10820b = c1582u.a();
    }

    public final M0 a() {
        Object next;
        M0 e10;
        try {
            List list = SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(InterfaceC1581t.class, InterfaceC1581t.class.getClassLoader()).iterator()));
            Iterator it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c10 = ((InterfaceC1581t) next).c();
                    do {
                        Object next2 = it.next();
                        int c11 = ((InterfaceC1581t) next2).c();
                        if (c10 < c11) {
                            next = next2;
                            c10 = c11;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC1581t interfaceC1581t = (InterfaceC1581t) next;
            if (interfaceC1581t != null && (e10 = AbstractC1583v.e(interfaceC1581t, list)) != null) {
                return e10;
            }
            return AbstractC1583v.b(null, null, 3, null);
        } catch (Throwable th2) {
            return AbstractC1583v.b(th2, null, 2, null);
        }
    }
}
