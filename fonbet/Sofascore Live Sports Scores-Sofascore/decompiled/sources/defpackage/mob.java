package defpackage;

import com.sofascore.results.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mob extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ MainActivity t;
    public final /* synthetic */ b1d u;
    public final /* synthetic */ MainActivity v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mob(MainActivity mainActivity, b1d b1dVar, rq3 rq3Var, MainActivity mainActivity2, int i) {
        super(2, rq3Var);
        this.r = i;
        switch (i) {
            case 1:
                e6b e6bVar = e6b.a;
                this.t = mainActivity;
                this.u = b1dVar;
                this.v = mainActivity2;
                super(2, rq3Var);
                break;
            case 2:
                e6b e6bVar2 = e6b.a;
                this.t = mainActivity;
                this.u = b1dVar;
                this.v = mainActivity2;
                super(2, rq3Var);
                break;
            default:
                e6b e6bVar3 = e6b.a;
                this.t = mainActivity;
                this.u = b1dVar;
                this.v = mainActivity2;
                break;
        }
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                e6b e6bVar = e6b.a;
                return new mob(this.t, this.u, rq3Var, this.v, 0);
            case 1:
                e6b e6bVar2 = e6b.a;
                return new mob(this.t, this.u, rq3Var, this.v, 1);
            default:
                e6b e6bVar3 = e6b.a;
                return new mob(this.t, this.u, rq3Var, this.v, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((mob) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        MainActivity mainActivity = this.v;
        b1d b1dVar = this.u;
        MainActivity mainActivity2 = this.t;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    e6b e6bVar = e6b.e;
                    lob lobVar = new lob(b1dVar, rq3Var, mainActivity, 0);
                    this.s = 1;
                    if (b6a.A(mainActivity2, e6bVar, lobVar, this) == lu3Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    e6b e6bVar2 = e6b.d;
                    lob lobVar2 = new lob(b1dVar, rq3Var, mainActivity, i2);
                    this.s = 1;
                    if (b6a.A(mainActivity2, e6bVar2, lobVar2, this) == lu3Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    e6b e6bVar3 = e6b.c;
                    lob lobVar3 = new lob(b1dVar, rq3Var, mainActivity, 2);
                    this.s = 1;
                    if (b6a.A(mainActivity2, e6bVar3, lobVar3, this) == lu3Var3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
