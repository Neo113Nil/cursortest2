package Qg;

import Ph.A;
import Ph.C0;
import Ph.F0;
import Ph.O;
import ah.C2023o;
import ch.C2924a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final O f9738a = new O("call-context");

    /* renamed from: b, reason: collision with root package name */
    public static final C2924a f9739b = new C2924a("client-config");

    public static final Object b(b bVar, C0 c02, Continuation continuation) {
        A a10 = F0.a(c02);
        CoroutineContext plus = bVar.getCoroutineContext().plus(a10).plus(f9738a);
        C0 c03 = (C0) continuation.get$context().get(C0.f9001U2);
        if (c03 == null) {
            return plus;
        }
        a10.invokeOnCompletion(new k(C0.a.e(c03, true, false, new l(a10), 2, null)));
        return plus;
    }

    public static final C2924a c() {
        return f9739b;
    }

    public static final void d(Wg.d dVar) {
        Set names = dVar.e().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : names) {
            if (C2023o.f16113a.o().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new ah.O(arrayList.toString());
        }
    }
}
