package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oeh extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ seh t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oeh(seh sehVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = sehVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        seh sehVar = this.t;
        switch (i) {
            case 0:
                return new oeh(sehVar, rq3Var, 0);
            default:
                return new oeh(sehVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((oeh) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        seh sehVar = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    t98 t98Var = new t98(sehVar.e.getData(), new tl(sehVar, rq3Var, 22), 1);
                    f10 f10Var = new f10(sehVar, 20);
                    this.s = 1;
                    if (t98Var.collect(f10Var, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                try {
                    if (i3 == 0) {
                        y6a.M(obj);
                        ye4 ye4Var = sehVar.e;
                        qeh qehVar = new qeh(sehVar, rq3Var, 0);
                        this.s = 1;
                        if (ye4Var.a(qehVar, this) == lu3Var2) {
                            return lu3Var2;
                        }
                    } else {
                        if (i3 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                } catch (Exception e) {
                    e.getMessage();
                    s7h s7hVar = sehVar.h;
                    if (s7hVar == null) {
                        Intrinsics.i("localSessionData");
                        throw null;
                    }
                    sehVar.d.getClass();
                    sehVar.h = s7h.a(s7hVar, null, vhj.a(), null, 5);
                }
                return Unit.a;
        }
    }
}
