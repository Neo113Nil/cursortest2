package Wh;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public interface a {

    /* renamed from: Wh.a$a, reason: collision with other inner class name */
    public static final class C0274a {
        public static /* synthetic */ boolean a(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.c(obj);
        }

        public static /* synthetic */ void b(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            aVar.g(obj);
        }
    }

    boolean c(Object obj);

    boolean d();

    Object f(Object obj, Continuation continuation);

    void g(Object obj);
}
