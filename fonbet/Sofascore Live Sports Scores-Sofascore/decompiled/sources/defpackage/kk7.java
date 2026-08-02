package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.sofascore.results.R;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kk7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ho7 t;
    public final /* synthetic */ do7 u;
    public final /* synthetic */ Context v;
    public final /* synthetic */ Bitmap w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk7(ho7 ho7Var, do7 do7Var, Context context, Bitmap bitmap, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = ho7Var;
        this.u = do7Var;
        this.v = context;
        this.w = bitmap;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new kk7(this.t, this.u, this.v, this.w, rq3Var, 0);
            default:
                return new kk7(this.t, this.u, this.v, this.w, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((kk7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Bitmap bitmap = this.w;
        do7 do7Var = this.u;
        ho7 ho7Var = this.t;
        Context context = this.v;
        switch (i) {
            case 0:
                Object obj2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    nv.x(context, "fantasy_squad", ho7Var.a.m.b, do7Var.c.c, null);
                    this.s = 1;
                    hs4 hs4Var = z45.a;
                    Object R = xw3.R(hq4.c, new rch(context, bitmap, null, 1), this);
                    if (R != obj2) {
                        R = Unit.a;
                    }
                    if (R == obj2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                Calendar calendar = ke0.a;
                ke0.f(R.string.save_image_confirmation, context);
                break;
            default:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    nv.t0(context, "fantasy_squad", ho7Var.a.m.b, do7Var.c.c, null);
                    zic zicVar = zic.g;
                    this.s = 1;
                    if (zicVar.L(context, bitmap, "", this) == lu3Var) {
                        break;
                    }
                } else if (i3 != 1) {
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
