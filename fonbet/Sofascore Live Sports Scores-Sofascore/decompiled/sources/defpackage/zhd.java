package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zhd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ jid t;
    public final /* synthetic */ Context u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zhd(jid jidVar, Context context, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = jidVar;
        this.u = context;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Context context = this.u;
        jid jidVar = this.t;
        switch (i) {
            case 0:
                return new zhd(jidVar, context, rq3Var, 0);
            case 1:
                return new zhd(jidVar, context, rq3Var, 1);
            case 2:
                return new zhd(jidVar, context, rq3Var, 2);
            case 3:
                return new zhd(jidVar, context, rq3Var, 3);
            case 4:
                return new zhd(jidVar, context, rq3Var, 4);
            case 5:
                return new zhd(jidVar, context, rq3Var, 5);
            case 6:
                return new zhd(jidVar, context, rq3Var, 6);
            case 7:
                return new zhd(jidVar, context, rq3Var, 7);
            case 8:
                return new zhd(jidVar, context, rq3Var, 8);
            case 9:
                return new zhd(jidVar, context, rq3Var, 9);
            case 10:
                return new zhd(jidVar, context, rq3Var, 10);
            case 11:
                return new zhd(jidVar, context, rq3Var, 11);
            case 12:
                return new zhd(jidVar, context, rq3Var, 12);
            case 13:
                return new zhd(jidVar, context, rq3Var, 13);
            case 14:
                return new zhd(jidVar, context, rq3Var, 14);
            case 15:
                return new zhd(jidVar, context, rq3Var, 15);
            case 16:
                return new zhd(jidVar, context, rq3Var, 16);
            default:
                return new zhd(jidVar, context, rq3Var, 17);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((zhd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Context context = this.u;
        jid jidVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.a(context, false, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.d(context, false, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jid.c(jidVar, context, this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jid.i(jidVar, context, this) == lu3Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jid.g(jidVar, context, this) == lu3Var5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.h(context, false, this) == lu3Var6) {
                        break;
                    }
                } else if (i7 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.e(context, false, this) == lu3Var7) {
                        break;
                    }
                } else if (i8 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.b(context, false, this) == lu3Var8) {
                        break;
                    }
                } else if (i9 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.f(context, this) == lu3Var9) {
                        break;
                    }
                } else if (i10 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 9:
                Object obj2 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    jidVar.getClass();
                    Object r = s9a.r(new kv7(context, jidVar, true, null), this);
                    if (r != obj2) {
                        r = Unit.a;
                    }
                    if (r == obj2) {
                        break;
                    }
                } else if (i11 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 10:
                Object obj3 = lu3.a;
                int i12 = this.s;
                boolean z = true;
                if (i12 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    jid jidVar2 = this.t;
                    jidVar2.getClass();
                    Object r2 = s9a.r(new w21(this.u, jidVar2, z, (rq3) null, 3), this);
                    if (r2 != obj3) {
                        r2 = Unit.a;
                    }
                    if (r2 == obj3) {
                        break;
                    }
                } else if (i12 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 11:
                lu3 lu3Var10 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.h(context, true, this) == lu3Var10) {
                        break;
                    }
                } else if (i13 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 12:
                lu3 lu3Var11 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.e(context, true, this) == lu3Var11) {
                        break;
                    }
                } else if (i14 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 13:
                lu3 lu3Var12 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.j(context, true, this) == lu3Var12) {
                        break;
                    }
                } else if (i15 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 14:
                lu3 lu3Var13 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.a(context, true, this) == lu3Var13) {
                        break;
                    }
                } else if (i16 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 15:
                lu3 lu3Var14 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.d(context, true, this) == lu3Var14) {
                        break;
                    }
                } else if (i17 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 16:
                lu3 lu3Var15 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.f(context, this) == lu3Var15) {
                        break;
                    }
                } else if (i18 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var16 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (jidVar.b(context, true, this) == lu3Var16) {
                        break;
                    }
                } else if (i19 != 1) {
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
