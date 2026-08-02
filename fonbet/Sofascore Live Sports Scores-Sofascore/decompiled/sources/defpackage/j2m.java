package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j2m extends hoi implements Function2 {
    public j2d r;
    public int s;

    public j2m(rq3 rq3Var) {
        super(2, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new j2m(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j2m((rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        j2d j2dVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            j2d j2dVar2 = wdm.c;
            this.r = j2dVar2;
            this.s = 1;
            if (j2dVar2.e(this) == lu3Var) {
                return lu3Var;
            }
            j2dVar = j2dVar2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2dVar = this.r;
            y6a.M(obj);
        }
        try {
            return tub.p(wdm.b);
        } finally {
            j2dVar.f(null);
        }
    }
}
