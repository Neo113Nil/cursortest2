package xe;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* renamed from: xe.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10742p0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CoroutineContext.Element element = (CoroutineContext.Element) obj;
        if (element instanceof AbstractC10744q0) {
            return (AbstractC10744q0) element;
        }
        return null;
    }
}
