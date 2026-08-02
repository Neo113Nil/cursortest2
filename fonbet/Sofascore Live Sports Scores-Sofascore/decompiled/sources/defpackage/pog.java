package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class pog implements z88, nj2 {
    public final Function2 a;

    public pog(Function2 function2) {
        this.a = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.z88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        m3 m3Var;
        int i;
        kog kogVar;
        if (rq3Var instanceof m3) {
            m3Var = (m3) rq3Var;
            int i2 = m3Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m3Var.u = i2 - Integer.MIN_VALUE;
                Object obj = m3Var.s;
                lu3 lu3Var = lu3.a;
                i = m3Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    kog kogVar2 = new kog(b98Var, m3Var.getContext());
                    try {
                        m3Var.r = kogVar2;
                        m3Var.u = 1;
                        try {
                            Object invoke = this.a.invoke(kogVar2, m3Var);
                            if (invoke != lu3Var) {
                                invoke = Unit.a;
                            }
                            if (invoke == lu3Var) {
                                return lu3Var;
                            }
                            kogVar = kogVar2;
                        } catch (Throwable th) {
                            th = th;
                            kogVar = kogVar2;
                            kogVar.releaseIntercepted();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kogVar = m3Var.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        kogVar.releaseIntercepted();
                        throw th;
                    }
                }
                kogVar.releaseIntercepted();
                return Unit.a;
            }
        }
        m3Var = new m3(this, rq3Var);
        Object obj2 = m3Var.s;
        lu3 lu3Var2 = lu3.a;
        i = m3Var.u;
        if (i != 0) {
        }
        kogVar.releaseIntercepted();
        return Unit.a;
    }
}
