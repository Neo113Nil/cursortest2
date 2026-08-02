package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.StageDriverPerformanceGraphResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c3i extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ d3i t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3i(d3i d3iVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = d3iVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        d3i d3iVar = this.t;
        switch (i) {
            case 0:
                return new c3i(d3iVar, rq3Var, 0);
            default:
                return new c3i(d3iVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((c3i) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        if (r0 == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        if (r1 == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0073, code lost:
    
        if (r2.equals(com.sofascore.model.Sports.FORMULA_1) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007f, code lost:
    
        r2 = r3.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0081, code lost:
    
        if (r2 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
    
        r1 = r1.getId();
        r17.s = 1;
        r1 = defpackage.s9a.r(new defpackage.qu1(r3, r1, r4, 28), r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        if (r1 != r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007c, code lost:
    
        if (r2.equals("MotoGP") == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Object r;
        Object P;
        Object R;
        int i = this.r;
        d3i d3iVar = this.t;
        rq3 rq3Var = null;
        int i2 = 1;
        switch (i) {
            case 0:
                Object obj2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r2 = s9a.r(new c3i(d3iVar, rq3Var, i2), this);
                    if (r2 != obj2) {
                        r2 = Unit.a;
                    }
                    if (r2 == obj2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                Stage stage = d3iVar.m;
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    UniqueStage uniqueStage = stage.getUniqueStage();
                    String name = uniqueStage != null ? uniqueStage.getName() : null;
                    if (name != null) {
                        int hashCode = name.hashCode();
                        if (hashCode == -1984447130) {
                            break;
                        } else if (hashCode == -461196329) {
                            break;
                        } else if (hashCode == 86216 && name.equals("WRC")) {
                            num = new Integer(stage.getId());
                            if (num != null) {
                                s96 s96Var = d3iVar.l;
                                int intValue = num.intValue();
                                this.s = 2;
                                P = s96Var.P(intValue, this);
                                break;
                            }
                        }
                    }
                    num = null;
                    if (num != null) {
                    }
                } else if (i4 == 1) {
                    y6a.M(obj);
                    r = obj;
                } else if (i4 == 2) {
                    y6a.M(obj);
                    P = obj;
                    StageDriverPerformanceGraphResponse stageDriverPerformanceGraphResponse = (StageDriverPerformanceGraphResponse) P;
                    if (stageDriverPerformanceGraphResponse != null) {
                        Context i5 = d3iVar.i();
                        this.s = 3;
                        R = xw3.R(z45.a, new big(stageDriverPerformanceGraphResponse, i5, rq3Var, 19), this);
                        break;
                    }
                } else if (i4 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    R = obj;
                    a3i a3iVar = (a3i) R;
                    if (a3iVar != null) {
                        d3iVar.n(new a3i(a3iVar.a, null, null, null, l6g.W(d3i.t(a3iVar)), a3iVar.c, false, 0, 0, 16286), new g2i(a3iVar, i2));
                    }
                    break;
                }
                num = (Integer) r;
                if (num != null) {
                    d3iVar.n = new Integer(num.intValue());
                    if (num != null) {
                    }
                }
                num = null;
                if (num != null) {
                }
                break;
        }
        return Unit.a;
    }
}
