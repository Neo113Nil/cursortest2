package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ldg extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ldg(Context context, Function1 function1, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = context;
        this.t = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new ldg(this.s, this.t, rq3Var, 0);
            default:
                return new ldg(this.s, this.t, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ldg) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Function1 function1 = this.t;
        Context context = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                return new eig(context, function1);
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                eig eigVar = new eig(context, function1);
                eigVar.c.setBackgroundColor(-16777216);
                return eigVar;
        }
    }
}
