package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jhd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ khd t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jhd(khd khdVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = khdVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        khd khdVar = this.t;
        switch (i) {
            case 0:
                return new jhd(khdVar, rq3Var, 0);
            case 1:
                return new jhd(khdVar, rq3Var, 1);
            case 2:
                return new jhd(khdVar, rq3Var, 2);
            default:
                return new jhd(khdVar, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((jhd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        khd khdVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(500, be5.MILLISECONDS);
                    this.s = 1;
                    if (n4o.z(R, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                khdVar.n(null, new a7d(17));
                khdVar.k(new ahd(R.string.error_import_failed));
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var2 = xd5.b;
                    long R2 = wkn.R(500, be5.MILLISECONDS);
                    this.s = 1;
                    if (n4o.z(R2, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                khdVar.n(null, new a7d(18));
                khdVar.k(new ahd(R.string.confirmation_sounds_imported));
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    g62 g62Var = khdVar.n;
                    Unit unit = Unit.a;
                    this.s = 1;
                    if (g62Var.q(this, unit) == lu3Var3) {
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
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    yhd yhdVar = khdVar.l;
                    Context i6 = khdVar.i();
                    List a = ir4.a();
                    this.s = 1;
                    if (yhdVar.b(i6, a, this) == lu3Var4) {
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
