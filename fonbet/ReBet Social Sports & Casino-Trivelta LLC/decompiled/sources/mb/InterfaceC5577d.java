package mb;

import java.util.Set;
import wb.InterfaceC6736b;

/* renamed from: mb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5577d {
    default Object a(Class cls) {
        return c(D.b(cls));
    }

    InterfaceC6736b b(D d10);

    default Object c(D d10) {
        InterfaceC6736b g10 = g(d10);
        if (g10 == null) {
            return null;
        }
        return g10.get();
    }

    default Set d(Class cls) {
        return e(D.b(cls));
    }

    default Set e(D d10) {
        return (Set) b(d10).get();
    }

    default InterfaceC6736b f(Class cls) {
        return g(D.b(cls));
    }

    InterfaceC6736b g(D d10);
}
