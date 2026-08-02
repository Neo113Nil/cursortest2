package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hll extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ill t;
    public final /* synthetic */ uv3 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hll(ill illVar, uv3 uv3Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = illVar;
        this.u = uv3Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        uv3 uv3Var = this.u;
        ill illVar = this.t;
        switch (i) {
            case 0:
                return new hll(illVar, uv3Var, rq3Var, 0);
            default:
                return new hll(illVar, uv3Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((hll) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object u;
        int i = this.r;
        uv3 uv3Var = this.u;
        ill illVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                tll tllVar = illVar.n;
                String str = uv3Var.b;
                this.s = 1;
                tllVar.getClass();
                Object r = s9a.r(new do5(str, tllVar, null), this);
                return r == lu3Var ? lu3Var : r;
            default:
                Object obj3 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                tll tllVar2 = illVar.n;
                String str2 = uv3Var.b;
                this.s = 1;
                tllVar2.getClass();
                Integer b = vel.b(str2);
                if (b != null) {
                    int intValue = b.intValue();
                    Context context = tllVar2.a;
                    int s = ao2.s(48, context);
                    u = inb.g.u(context, pco.R(intValue), aba.g(s, s), Bitmap.Config.ARGB_8888, this);
                    obj2 = u;
                } else {
                    obj2 = null;
                }
                return obj2 == obj3 ? obj3 : obj2;
        }
    }
}
