package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.InterfaceC5321f;

/* loaded from: classes5.dex */
public interface q extends InterfaceC5321f {

    public static final class a {
        public static /* synthetic */ InterfaceC5321f a(q qVar, CoroutineContext coroutineContext, int i10, Rh.d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.INSTANCE;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                dVar = Rh.d.f10307a;
            }
            return qVar.b(coroutineContext, i10, dVar);
        }
    }

    InterfaceC5321f b(CoroutineContext coroutineContext, int i10, Rh.d dVar);
}
