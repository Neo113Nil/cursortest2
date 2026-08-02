package defpackage;

import com.sofascore.results.profile.LoginScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ijb extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ b1d t;
    public final /* synthetic */ LoginScreenActivity u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ijb(b1d b1dVar, rq3 rq3Var, LoginScreenActivity loginScreenActivity, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = b1dVar;
        this.u = loginScreenActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        LoginScreenActivity loginScreenActivity = this.u;
        b1d b1dVar = this.t;
        switch (i) {
            case 0:
                return new ijb(b1dVar, rq3Var, loginScreenActivity, 0);
            case 1:
                return new ijb(b1dVar, rq3Var, loginScreenActivity, 1);
            case 2:
                return new ijb(b1dVar, rq3Var, loginScreenActivity, 2);
            case 3:
                return new ijb(b1dVar, rq3Var, loginScreenActivity, 3);
            default:
                return new ijb(b1dVar, rq3Var, loginScreenActivity, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                ((ijb) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            case 1:
                ((ijb) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            case 2:
                ((ijb) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            case 3:
                ((ijb) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            default:
                ((ijb) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
        }
        return lu3.a;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        LoginScreenActivity loginScreenActivity = this.u;
        b1d b1dVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    hjb hjbVar = new hjb(loginScreenActivity, 0);
                    this.s = 1;
                    if (b1dVar.collect(hjbVar, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                pvd.x();
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    hjb hjbVar2 = new hjb(loginScreenActivity, 1);
                    this.s = 1;
                    if (b1dVar.collect(hjbVar2, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                pvd.x();
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    hjb hjbVar3 = new hjb(loginScreenActivity, 2);
                    this.s = 1;
                    if (b1dVar.collect(hjbVar3, this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                pvd.x();
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    hjb hjbVar4 = new hjb(loginScreenActivity, 3);
                    this.s = 1;
                    if (b1dVar.collect(hjbVar4, this) == lu3Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                pvd.x();
                break;
            default:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    ueb uebVar = new ueb(loginScreenActivity);
                    this.s = 1;
                    if (b1dVar.collect(uebVar, this) == lu3Var5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                pvd.x();
                break;
        }
        return null;
    }
}
