package ch;

import Ph.C0;
import Ph.M;
import Ph.X0;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class o {
    public static final CoroutineContext a(C0 c02) {
        return X0.a(c02).plus(new a(M.f9041T2));
    }

    public static /* synthetic */ CoroutineContext b(C0 c02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c02 = null;
        }
        return a(c02);
    }

    public static final class a extends AbstractCoroutineContextElement implements M {
        public a(M.a aVar) {
            super(aVar);
        }

        @Override // Ph.M
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }
}
