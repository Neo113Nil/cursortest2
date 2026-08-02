package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ftk extends m2g implements Function2 {
    public int s;
    public /* synthetic */ Object t;
    final /* synthetic */ View u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftk(View view, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = view;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        ftk ftkVar = new ftk(this.u, rq3Var);
        ftkVar.t = obj;
        return ftkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ftk) create((x4h) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            x4h x4hVar = (x4h) this.t;
            View view = this.u;
            this.t = x4hVar;
            this.s = 1;
            x4hVar.d(this, view);
            return lu3Var;
        }
        if (i == 1) {
            x4h x4hVar2 = (x4h) this.t;
            y6a.M(obj);
            View view2 = this.u;
            if (view2 instanceof ViewGroup) {
                this.t = null;
                this.s = 2;
                x4hVar2.getClass();
                if (x4hVar2.e(new zv4(wca.B((ViewGroup) view2)), this) == lu3Var) {
                    return lu3Var;
                }
            }
        } else {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
