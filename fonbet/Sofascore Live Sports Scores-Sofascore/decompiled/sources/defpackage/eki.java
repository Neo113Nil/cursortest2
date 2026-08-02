package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class eki implements b98 {
    public final b98 a;
    public final Function2 b;

    public eki(b98 b98Var, Function2 function2) {
        this.a = b98Var;
        this.b = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (((defpackage.eki) r4).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        dki dkiVar;
        int i;
        b98 b98Var;
        Throwable th;
        kog kogVar;
        if (sq3Var instanceof dki) {
            dkiVar = (dki) sq3Var;
            int i2 = dkiVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dkiVar.u = i2 - Integer.MIN_VALUE;
                Object obj = dkiVar.s;
                lu3 lu3Var = lu3.a;
                i = dkiVar.u;
                b98Var = this.a;
                if (i != 0) {
                    y6a.M(obj);
                    kog kogVar2 = new kog(b98Var, dkiVar.getContext());
                    try {
                        Function2 function2 = this.b;
                        dkiVar.r = kogVar2;
                        dkiVar.u = 1;
                        if (function2.invoke(kogVar2, dkiVar) != lu3Var) {
                            kogVar = kogVar2;
                        }
                        return lu3Var;
                    } catch (Throwable th2) {
                        th = th2;
                        kogVar = kogVar2;
                        kogVar.releaseIntercepted();
                        throw th;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kogVar = dkiVar.r;
                try {
                    y6a.M(obj);
                } catch (Throwable th3) {
                    th = th3;
                    kogVar.releaseIntercepted();
                    throw th;
                }
                kogVar.releaseIntercepted();
                if (b98Var instanceof eki) {
                    return Unit.a;
                }
                dkiVar.r = null;
                dkiVar.u = 2;
            }
        }
        dkiVar = new dki(this, sq3Var);
        Object obj2 = dkiVar.s;
        lu3 lu3Var2 = lu3.a;
        i = dkiVar.u;
        b98Var = this.a;
        if (i != 0) {
        }
        kogVar.releaseIntercepted();
        if (b98Var instanceof eki) {
        }
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        return this.a.emit(obj, rq3Var);
    }
}
