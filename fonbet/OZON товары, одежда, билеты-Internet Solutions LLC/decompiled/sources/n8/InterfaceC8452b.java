package n8;

import java.util.Set;
import y8.InterfaceC10861a;

/* renamed from: n8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8452b {
    default <T> T a(Class<T> cls) {
        return (T) e(w.a(cls));
    }

    <T> InterfaceC10861a<T> b(w<T> wVar);

    default <T> Set<T> c(w<T> wVar) {
        return f(wVar).get();
    }

    default <T> InterfaceC10861a<T> d(Class<T> cls) {
        return b(w.a(cls));
    }

    default <T> T e(w<T> wVar) {
        InterfaceC10861a<T> b11 = b(wVar);
        if (b11 == null) {
            return null;
        }
        return b11.get();
    }

    <T> InterfaceC10861a<Set<T>> f(w<T> wVar);
}
