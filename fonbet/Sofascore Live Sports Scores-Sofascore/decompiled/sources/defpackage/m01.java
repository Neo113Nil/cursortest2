package defpackage;

import com.sofascore.results.base.BaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m01 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ b1d t;
    public final /* synthetic */ BaseActivity u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m01(b1d b1dVar, rq3 rq3Var, BaseActivity baseActivity, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = b1dVar;
        this.u = baseActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        BaseActivity baseActivity = this.u;
        b1d b1dVar = this.t;
        switch (i) {
            case 0:
                return new m01(b1dVar, rq3Var, baseActivity, 0);
            case 1:
                return new m01(b1dVar, rq3Var, baseActivity, 1);
            case 2:
                return new m01(b1dVar, rq3Var, baseActivity, 2);
            default:
                return new m01(b1dVar, rq3Var, baseActivity, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                ((m01) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            case 1:
                ((m01) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            case 2:
                ((m01) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            default:
                ((m01) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
        }
        return lu3.a;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        BaseActivity baseActivity = this.u;
        b1d b1dVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    l01 l01Var = new l01(baseActivity, 0);
                    this.s = 1;
                    if (b1dVar.collect(l01Var, this) == lu3Var) {
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
                    l01 l01Var2 = new l01(baseActivity, 1);
                    this.s = 1;
                    if (b1dVar.collect(l01Var2, this) == lu3Var2) {
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
                    l01 l01Var3 = new l01(baseActivity, 2);
                    this.s = 1;
                    if (b1dVar.collect(l01Var3, this) == lu3Var3) {
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
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    l01 l01Var4 = new l01(baseActivity, 3);
                    this.s = 1;
                    if (b1dVar.collect(l01Var4, this) == lu3Var4) {
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
        }
        return null;
    }
}
