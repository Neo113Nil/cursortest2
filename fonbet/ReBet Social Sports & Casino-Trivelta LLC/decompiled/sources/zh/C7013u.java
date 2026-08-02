package zh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import yh.AbstractC6897f;

/* renamed from: zh.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7013u {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC7011s f69216a;

    /* renamed from: b, reason: collision with root package name */
    public Object f69217b;

    /* renamed from: c, reason: collision with root package name */
    public final List f69218c = new ArrayList();

    /* renamed from: zh.u$a */
    public static final class a {
        public static /* synthetic */ Predicate a(a aVar) {
            throw null;
        }

        public static /* synthetic */ Object b(a aVar) {
            throw null;
        }
    }

    public C7013u(InterfaceC7011s interfaceC7011s) {
        this.f69216a = interfaceC7011s;
    }

    public static /* synthetic */ Object a(C7013u c7013u, AbstractC6897f abstractC6897f) {
        Object apply = c7013u.f69216a.apply(abstractC6897f);
        if (apply != null) {
            return apply;
        }
        Iterator it = c7013u.f69218c.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (a.a(null).test(abstractC6897f)) {
                return a.b(null);
            }
        }
        return c7013u.f69217b;
    }

    public InterfaceC7011s b() {
        return new InterfaceC7011s() { // from class: zh.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7013u.a(C7013u.this, (AbstractC6897f) obj);
            }
        };
    }
}
