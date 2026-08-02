package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class yt3 {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 1;
        boolean booleanValue = ((Boolean) coroutineContext.fold(bool, new xt3(i))).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.fold(bool, new xt3(i))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        fsf fsfVar = new fsf();
        fsfVar.a = coroutineContext2;
        g gVar = g.a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(gVar, new xt3(2));
        if (booleanValue2) {
            fsfVar.a = ((CoroutineContext) fsfVar.a).fold(gVar, new xt3(3));
        }
        return coroutineContext3.plus((CoroutineContext) fsfVar.a);
    }

    public static final CoroutineContext b(ku3 ku3Var, CoroutineContext coroutineContext) {
        CoroutineContext a = a(ku3Var.getCoroutineContext(), coroutineContext, true);
        hs4 hs4Var = z45.a;
        return (a == hs4Var || a.get(d.Q7) != null) ? a : a.plus(hs4Var);
    }

    public static final x9k c(rq3 rq3Var, CoroutineContext coroutineContext, Object obj) {
        x9k x9kVar = null;
        if ((rq3Var instanceof mu3) && coroutineContext.get(y9k.a) != null) {
            mu3 mu3Var = (mu3) rq3Var;
            while (true) {
                if ((mu3Var instanceof u45) || (mu3Var = mu3Var.getCallerFrame()) == null) {
                    break;
                }
                if (mu3Var instanceof x9k) {
                    x9kVar = (x9k) mu3Var;
                    break;
                }
            }
            if (x9kVar != null) {
                x9kVar.p0(coroutineContext, obj);
            }
        }
        return x9kVar;
    }
}
