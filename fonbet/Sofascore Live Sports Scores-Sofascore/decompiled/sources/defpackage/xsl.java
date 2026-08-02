package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xsl extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Function1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsl(boolean z, Function1 function1, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = z;
        this.u = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        xsl xslVar = new xsl(this.t, this.u, rq3Var);
        xslVar.s = obj;
        return xslVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xsl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r7 == r0) goto L22;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        try {
            if (i == 0) {
                y6a.M(obj);
                ku3Var = (ku3) this.s;
                if (this.t) {
                    bwm bwmVar = bwm.a;
                    this.s = ku3Var;
                    this.r = 1;
                    if (bwmVar.a(this) == lu3Var) {
                        return lu3Var;
                    }
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    c2g c2gVar = (c2g) obj;
                    if (c2gVar == null) {
                        return new kvm(null, null, null, 7, null);
                    }
                    d2g d2gVar = c2gVar.a;
                    if (!d2gVar.q) {
                        return rwl.a(new wi9(c2gVar));
                    }
                    Object obj2 = c2gVar.b;
                    return obj2 == null ? new clm(new Integer(d2gVar.d), d2gVar.c, null, 4, null) : new qbm(obj2);
                }
                ku3Var = (ku3) this.s;
                y6a.M(obj);
            }
            Function1 function1 = this.u;
            this.s = ku3Var;
            this.r = 2;
            obj = function1.invoke(this);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return rwl.a(e2);
        }
    }
}
