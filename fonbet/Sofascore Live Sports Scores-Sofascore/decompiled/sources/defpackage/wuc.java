package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface wuc extends CoroutineContext.Element {
    @Override // kotlin.coroutines.CoroutineContext.Element
    default f getKey() {
        return hjg.e;
    }

    Object p(Function1 function1, rq3 rq3Var);
}
