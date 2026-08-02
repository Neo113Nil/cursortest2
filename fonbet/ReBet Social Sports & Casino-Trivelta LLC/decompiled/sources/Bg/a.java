package Bg;

import Cg.c;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: Bg.a$a, reason: collision with other inner class name */
    public static final class C0025a {
        public static /* synthetic */ Object a(a aVar, Object obj, String str, Continuation continuation, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFailure");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            return aVar.c(obj, str, continuation);
        }
    }

    Object a(int i10, String str, boolean z10, Continuation continuation);

    Object b(c cVar, Continuation continuation);

    Object c(Object obj, String str, Continuation continuation);
}
