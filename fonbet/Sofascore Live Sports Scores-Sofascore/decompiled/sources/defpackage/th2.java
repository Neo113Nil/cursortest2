package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class th2 extends sn2 {
    public final Function2 f;

    public th2(Function2 function2, CoroutineContext coroutineContext, int i, a62 a62Var) {
        super(function2, coroutineContext, i, a62Var, 0);
        this.f = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.sn2, defpackage.rn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(k8f k8fVar, rq3 rq3Var) {
        sh2 sh2Var;
        int i;
        if (rq3Var instanceof sh2) {
            sh2Var = (sh2) rq3Var;
            int i2 = sh2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sh2Var.u = i2 - Integer.MIN_VALUE;
                Object obj = sh2Var.s;
                Object obj2 = lu3.a;
                i = sh2Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    sh2Var.r = k8fVar;
                    sh2Var.u = 1;
                    if (super.g(k8fVar, sh2Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k8fVar = sh2Var.r;
                    y6a.M(obj);
                }
                if (!((j8f) k8fVar).e.B()) {
                    return Unit.a;
                }
                a70.r("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                return null;
            }
        }
        sh2Var = new sh2(this, (sq3) rq3Var);
        Object obj3 = sh2Var.s;
        Object obj22 = lu3.a;
        i = sh2Var.u;
        if (i != 0) {
        }
        if (!((j8f) k8fVar).e.B()) {
        }
    }

    @Override // defpackage.sn2, defpackage.rn2
    public final rn2 h(CoroutineContext coroutineContext, int i, a62 a62Var) {
        return new th2(this.f, coroutineContext, i, a62Var);
    }
}
