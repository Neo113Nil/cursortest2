package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public interface yda extends CoroutineContext.Element {
    jt2 C(kea keaVar);

    q55 H(Function1 function1, boolean z, boolean z2);

    Object Z(rq3 rq3Var);

    void e(CancellationException cancellationException);

    boolean isActive();

    boolean isCancelled();

    CancellationException k();

    q55 n(Function1 function1);

    boolean start();

    boolean t();
}
