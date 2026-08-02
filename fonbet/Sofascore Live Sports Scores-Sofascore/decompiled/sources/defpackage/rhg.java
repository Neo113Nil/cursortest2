package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rhg extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ yhg t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rhg(yhg yhgVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = yhgVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        yhg yhgVar = this.t;
        switch (i) {
            case 0:
                return new rhg(yhgVar, rq3Var, 0);
            default:
                return new rhg(yhgVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((rhg) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        yhg yhgVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    eig eigVar = yhgVar.y;
                    if (eigVar != null) {
                        this.s = 1;
                        obj = eigVar.a("instance.pause();", this);
                        if (obj == lu3Var) {
                            break;
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    eig eigVar2 = yhgVar.y;
                    if (eigVar2 != null) {
                        this.s = 1;
                        obj = eigVar2.a("instance.play();", this);
                        if (obj == lu3Var2) {
                            break;
                        }
                    }
                    break;
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
        }
        return Unit.a;
    }
}
