package defpackage;

import android.view.textclassifier.TextClassifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ije extends hoi implements Function2 {
    public h2d r;
    public kje s;
    public int t;
    public final /* synthetic */ kje u;
    public final /* synthetic */ Function2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ije(kje kjeVar, Function2 function2, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = kjeVar;
        this.v = function2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ije(this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ije) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x003d, code lost:
    
        if (r11.e(r10) == r0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [h2d] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [h2d] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v7, types: [h2d] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kje kjeVar;
        j2d j2dVar;
        ?? r1;
        TextClassifier textClassifier;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        int i2 = 0;
        rq3 rq3Var = null;
        try {
            if (i == 0) {
                y6a.M(obj);
                kjeVar = this.u;
                j2dVar = kjeVar.e;
                this.r = j2dVar;
                this.s = kjeVar;
                this.t = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r1 = this.r;
                    try {
                        y6a.M(obj);
                        r1 = r1;
                        textClassifier = (TextClassifier) obj;
                        j2dVar = r1;
                        j2dVar.f(null);
                        gje gjeVar = new gje(textClassifier, this.v, rq3Var, i2);
                        this.r = null;
                        this.s = null;
                        this.t = 3;
                        Object V = wba.V(200L, gjeVar, this);
                        return V == lu3Var ? lu3Var : V;
                    } catch (Throwable th) {
                        th = th;
                        r1.f(null);
                        throw th;
                    }
                }
                kjeVar = this.s;
                ?? r5 = this.r;
                y6a.M(obj);
                j2dVar = r5;
            }
            textClassifier = kjeVar.f;
            if (textClassifier != null) {
                if (textClassifier.isDestroyed()) {
                }
                j2dVar.f(null);
                gje gjeVar2 = new gje(textClassifier, this.v, rq3Var, i2);
                this.r = null;
                this.s = null;
                this.t = 3;
                Object V2 = wba.V(200L, gjeVar2, this);
                if (V2 == lu3Var) {
                }
            }
            hje hjeVar = new hje(kjeVar, rq3Var, i2);
            this.r = j2dVar;
            this.s = null;
            this.t = 2;
            Object V3 = wba.V(300L, hjeVar, this);
            if (V3 != lu3Var) {
                r1 = j2dVar;
                obj = V3;
                textClassifier = (TextClassifier) obj;
                j2dVar = r1;
                j2dVar.f(null);
                gje gjeVar22 = new gje(textClassifier, this.v, rq3Var, i2);
                this.r = null;
                this.s = null;
                this.t = 3;
                Object V22 = wba.V(200L, gjeVar22, this);
                if (V22 == lu3Var) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = j2dVar;
            r1.f(null);
            throw th;
        }
    }
}
