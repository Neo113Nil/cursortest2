package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h07 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ j07 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h07(j07 j07Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = j07Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        j07 j07Var = this.t;
        switch (i) {
            case 0:
                return new h07(j07Var, rq3Var, 0);
            case 1:
                return new h07(j07Var, rq3Var, 1);
            case 2:
                return new h07(j07Var, rq3Var, 2);
            default:
                return new h07(j07Var, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((h07) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        j07 j07Var = this.t;
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
                wi7 wi7Var = j07Var.c;
                String str = j07Var.f;
                int i3 = j07Var.e;
                this.s = 1;
                Object b0 = wi7Var.b0(i3, str, this);
                return b0 == lu3Var ? lu3Var : b0;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var2 = j07Var.c;
                int i5 = j07Var.d.c;
                this.s = 1;
                Object a0 = wi7Var2.a0(i5, this);
                return a0 == lu3Var2 ? lu3Var2 : a0;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var3 = j07Var.c;
                String str2 = j07Var.f;
                int i7 = j07Var.e;
                this.s = 1;
                Object c0 = wi7Var3.c0(i7, str2, this);
                return c0 == lu3Var3 ? lu3Var3 : c0;
            default:
                lu3 lu3Var4 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var4 = j07Var.c;
                int i9 = j07Var.e;
                this.s = 1;
                Object Z = wi7Var4.Z(i9, this);
                return Z == lu3Var4 ? lu3Var4 : Z;
        }
    }
}
