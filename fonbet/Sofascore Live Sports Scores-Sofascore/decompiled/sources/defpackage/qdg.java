package defpackage;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qdg extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ eig t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qdg(eig eigVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = eigVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        eig eigVar = this.t;
        switch (i) {
            case 0:
                return new qdg(eigVar, rq3Var, 0);
            case 1:
                return new qdg(eigVar, rq3Var, 1);
            default:
                return new qdg(eigVar, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((qdg) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        eig eigVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(1000L, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                jeg.d.f(1);
                ((WebView) eigVar.b.b).destroy();
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(1000L, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                jeg.d.f(1);
                ((WebView) eigVar.b.b).destroy();
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                try {
                    if (i4 == 0) {
                        y6a.M(obj);
                        g62 g62Var = eigVar.f;
                        this.s = 1;
                        if (g62Var.q(this, null) == lu3Var3) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        y6a.M(obj);
                    }
                } catch (Exception unused) {
                }
                break;
        }
        return Unit.a;
    }
}
