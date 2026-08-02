package eg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class u {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z5) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) coroutineContext.O(bool, new c1.k(1))).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.O(bool, new c1.k(1))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.t(coroutineContext2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f19227a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.O(gVar, new c1.k(2));
        if (booleanValue2) {
            objectRef.element = ((CoroutineContext) objectRef.element).O(gVar, new c1.k(3));
        }
        return coroutineContext3.t((CoroutineContext) objectRef.element);
    }

    public static final CoroutineContext b(z zVar, CoroutineContext coroutineContext) {
        CoroutineContext a7 = a(zVar.C(), coroutineContext, true);
        lg.e eVar = m0.f9201a;
        return (a7 == eVar || a7.r(kotlin.coroutines.d.f19226f0) != null) ? a7 : a7.t(eVar);
    }

    public static final d2 c(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        d2 d2Var = null;
        if ((continuation instanceof mf.d) && coroutineContext.r(e2.f9169a) != null) {
            mf.d dVar = (mf.d) continuation;
            while (true) {
                if ((dVar instanceof j0) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof d2) {
                    d2Var = (d2) dVar;
                    break;
                }
            }
            if (d2Var != null) {
                d2Var.n0(coroutineContext, obj);
            }
        }
        return d2Var;
    }
}
