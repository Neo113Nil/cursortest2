package io.ktor.utils.io;

import kh.AbstractC5255a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public interface i {

    public static final class a {
        public static /* synthetic */ Object a(i iVar, int i10, Function1 function1, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
            }
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return iVar.i(i10, function1, continuation);
        }
    }

    boolean a(Throwable th2);

    void flush();

    Object h(byte[] bArr, int i10, int i11, Continuation continuation);

    Object i(int i10, Function1 function1, Continuation continuation);

    Object k(AbstractC5255a abstractC5255a, Continuation continuation);

    boolean l();
}
