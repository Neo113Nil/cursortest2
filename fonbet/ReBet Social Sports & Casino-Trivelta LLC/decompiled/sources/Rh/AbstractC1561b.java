package Rh;

import Ph.J;
import Ph.P;
import Ph.S;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: Rh.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1561b {
    public static final B a(P p10, CoroutineContext coroutineContext, int i10, S s10, Function1 function1, Function2 function2) {
        CoroutineContext j10 = J.j(p10, coroutineContext);
        j b10 = m.b(i10, null, null, 6, null);
        C1560a vVar = s10.c() ? new v(j10, b10, function2) : new C1560a(j10, b10, true);
        if (function1 != null) {
            vVar.invokeOnCompletion(function1);
        }
        vVar.N0(s10, vVar, function2);
        return vVar;
    }

    public static /* synthetic */ B b(P p10, CoroutineContext coroutineContext, int i10, S s10, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            s10 = S.f9047a;
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        S s11 = s10;
        return a(p10, coroutineContext, i10, s11, function1, function2);
    }
}
