package defpackage;

import com.sofascore.model.mvvm.model.AiAnalystDemoEvent;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vdk extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ xdk u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vdk(xdk xdkVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = xdkVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        xdk xdkVar = this.u;
        switch (i) {
            case 0:
                vdk vdkVar = new vdk(xdkVar, rq3Var, 0);
                vdkVar.t = obj;
                return vdkVar;
            default:
                vdk vdkVar2 = new vdk(xdkVar, rq3Var, 1);
                vdkVar2.t = obj;
                return vdkVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((vdk) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return lu3.a;
            default:
                return ((vdk) create((eli) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
    
        if (defpackage.fcp.c0(r10, r0, r9) == r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        if (r10 == r6) goto L38;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.r;
        xdk xdkVar = this.u;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    xw3.L(ku3Var, null, null, new udk(xdkVar, rq3Var, 0), 3);
                    jof jofVar = xdkVar.g.k;
                    iz2 z = un0.z(xdkVar);
                    this.t = null;
                    this.s = 1;
                    obj = un0.L(jofVar, z, this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        a70.r("SharedFlow never completes, this call should never return.");
                        return null;
                    }
                    y6a.M(obj);
                }
                xdh xdhVar = (xdh) obj;
                pdk pdkVar = new pdk(xdkVar, rq3Var, i2);
                xdhVar.getClass();
                this.t = null;
                this.s = 2;
                break;
            default:
                fdi fdiVar = xdkVar.h;
                eli eliVar = (eli) this.t;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    int i5 = eliVar == null ? -1 : wdk.a[eliVar.ordinal()];
                    if (i5 == 1) {
                        do {
                            value = fdiVar.getValue();
                        } while (!fdiVar.k(value, y9h.g((Set) value, new gli(eli.ADS, true))));
                    } else if (i5 == 2) {
                        aeh aehVar = xdkVar.j;
                        AiAnalystDemoEvent aiAnalystDemoEvent = xdkVar.l;
                        this.t = null;
                        this.s = 1;
                        if (aehVar.emit(aiAnalystDemoEvent, this) == lu3Var2) {
                            return lu3Var2;
                        }
                    }
                    return Unit.a;
                }
                if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                do {
                    value2 = fdiVar.getValue();
                } while (!fdiVar.k(value2, y9h.g((Set) value2, new gli(eli.AI, true))));
                return Unit.a;
        }
    }
}
