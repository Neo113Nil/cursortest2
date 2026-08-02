package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w07 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ q50 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w07(q50 q50Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = q50Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new w07(this.t, rq3Var, 0);
            case 1:
                return new w07(this.t, rq3Var, 1);
            case 2:
                return new w07(this.t, rq3Var, 2);
            case 3:
                return new w07(this.t, rq3Var, 3);
            case 4:
                return new w07(this.t, rq3Var, 4);
            case 5:
                return new w07(this.t, rq3Var, 5);
            case 6:
                return new w07(this.t, rq3Var, 6);
            case 7:
                return new w07(this.t, rq3Var, 7);
            case 8:
                return new w07(this.t, rq3Var, 8);
            case 9:
                return new w07(this.t, rq3Var, 9);
            case 10:
                return new w07(this.t, rq3Var, 10);
            case 11:
                return new w07(this.t, rq3Var, 11);
            case 12:
                return new w07(this.t, rq3Var, 12);
            case 13:
                return new w07(this.t, rq3Var, 13);
            case 14:
                return new w07(this.t, rq3Var, 14);
            case 15:
                return new w07(this.t, rq3Var, 15);
            case 16:
                return new w07(this.t, rq3Var, 16);
            case 17:
                return new w07(this.t, rq3Var, 17);
            case 18:
                return new w07(this.t, rq3Var, 18);
            case 19:
                return new w07(this.t, rq3Var, 19);
            case 20:
                return new w07(this.t, rq3Var, 20);
            case 21:
                return new w07(this.t, rq3Var, 21);
            case 22:
                return new w07(this.t, rq3Var, 22);
            case 23:
                return new w07(this.t, rq3Var, 23);
            case 24:
                return new w07(this.t, rq3Var, 24);
            case 25:
                return new w07(this.t, rq3Var, 25);
            case 26:
                return new w07(this.t, rq3Var, 26);
            case 27:
                return new w07(this.t, rq3Var, 27);
            default:
                return new w07(this.t, rq3Var, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((w07) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (defpackage.q50.a(r14.t, r9, r10, null, r14, 12) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r8.f(r14, r15) == r0) goto L16;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        q50 q50Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    Float f = new Float(1.0f);
                    i4k h0 = s02.h0(500, 0, null, 6);
                    this.s = 1;
                    if (q50.a(this.t, f, h0, null, this, 12) == lu3Var) {
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
                    Float f2 = new Float(0.15f);
                    i4k i4kVar = new i4k(600, (ig5) null, 6);
                    this.s = 1;
                    Object a = q50.a(this.t, f2, i4kVar, null, this, 12);
                    if (a == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    Float f3 = new Float(1.0f);
                    i4k i4kVar2 = new i4k(600, (ig5) null, 6);
                    this.s = 1;
                    Object a2 = q50.a(this.t, f3, i4kVar2, null, this, 12);
                    if (a2 == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    Float f4 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.s = 1;
                    if (q50.a(this.t, f4, null, null, this, 14) == lu3Var4) {
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
                    if (q50Var.g(this) == lu3Var5) {
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
                    if (q50Var.g(this) == lu3Var6) {
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
                    if (q50Var.g(this) == lu3Var7) {
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
                    Float f5 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.s = 1;
                    if (q50Var.f(this, f5) == lu3Var8) {
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
                    Float f6 = new Float(1.0f);
                    this.s = 1;
                    if (q50Var.f(this, f6) == lu3Var9) {
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
                lu3 lu3Var10 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    Float f7 = new Float(1.0f);
                    this.s = 1;
                    if (q50Var.f(this, f7) == lu3Var10) {
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
                lu3 lu3Var11 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    Float f8 = new Float(360.0f);
                    i4k h02 = s02.h0(5000, 0, jg5.d, 2);
                    this.s = 1;
                    if (q50.a(this.t, f8, h02, null, this, 12) == lu3Var11) {
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
                lu3 lu3Var12 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (q50Var.g(this) == lu3Var12) {
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
                lu3 lu3Var13 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (q50Var.g(this) == lu3Var13) {
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
                lu3 lu3Var14 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (q50Var.g(this) == lu3Var14) {
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
                lu3 lu3Var15 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (q50Var.g(this) == lu3Var15) {
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
                lu3 lu3Var16 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (q50Var.g(this) == lu3Var16) {
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
                lu3 lu3Var17 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (q50Var.g(this) == lu3Var17) {
                        break;
                    }
                } else if (i18 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (q50Var.g(this) == lu3Var18) {
                        break;
                    }
                } else if (i19 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (q50Var.g(this) == lu3Var19) {
                        break;
                    }
                } else if (i20 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (q50Var.g(this) == lu3Var20) {
                        break;
                    }
                } else if (i21 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (q50Var.g(this) == lu3Var21) {
                        break;
                    }
                } else if (i22 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    Float f9 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.s = 1;
                    if (q50Var.f(this, f9) == lu3Var22) {
                        break;
                    }
                } else if (i23 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    Float f10 = new Float(1.0f);
                    this.s = 1;
                    if (q50Var.f(this, f10) == lu3Var23) {
                        break;
                    }
                } else if (i24 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    Float f11 = new Float(0.1f);
                    this.s = 1;
                    if (q50Var.f(this, f11) == lu3Var24) {
                        break;
                    }
                } else if (i25 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 24:
                lu3 lu3Var25 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    Float f12 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.s = 1;
                    if (q50Var.f(this, f12) == lu3Var25) {
                        break;
                    }
                } else if (i26 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 25:
                lu3 lu3Var26 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    Float f13 = new Float(1.0f);
                    this.s = 1;
                    if (q50Var.f(this, f13) == lu3Var26) {
                        break;
                    }
                } else if (i27 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 26:
                lu3 lu3Var27 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    Float f14 = new Float(0.1f);
                    this.s = 1;
                    if (q50Var.f(this, f14) == lu3Var27) {
                        break;
                    }
                } else if (i28 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 27:
                lu3 lu3Var28 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    Float f15 = new Float(0.1f);
                    this.s = 1;
                    if (q50Var.f(this, f15) == lu3Var28) {
                        break;
                    }
                } else if (i29 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var29 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    Float f16 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.s = 1;
                    break;
                } else if (i30 == 1) {
                    y6a.M(obj);
                } else if (i30 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                Float f17 = new Float(1.0f);
                i4k h03 = s02.h0(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 0, jg5.d, 2);
                this.s = 2;
                break;
        }
        return Unit.a;
    }
}
