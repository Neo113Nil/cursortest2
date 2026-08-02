package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ck1 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ksa t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck1(int i, rq3 rq3Var, ksa ksaVar) {
        super(2, rq3Var);
        this.r = i;
        this.t = ksaVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ksa ksaVar = this.t;
        switch (i) {
            case 0:
                return new ck1(0, rq3Var, ksaVar);
            case 1:
                return new ck1(1, rq3Var, ksaVar);
            case 2:
                return new ck1(2, rq3Var, ksaVar);
            case 3:
                return new ck1(3, rq3Var, ksaVar);
            case 4:
                return new ck1(4, rq3Var, ksaVar);
            case 5:
                return new ck1(5, rq3Var, ksaVar);
            case 6:
                return new ck1(6, rq3Var, ksaVar);
            case 7:
                return new ck1(7, rq3Var, ksaVar);
            case 8:
                return new ck1(8, rq3Var, ksaVar);
            case 9:
                return new ck1(9, rq3Var, ksaVar);
            case 10:
                return new ck1(10, rq3Var, ksaVar);
            case 11:
                return new ck1(11, rq3Var, ksaVar);
            case 12:
                return new ck1(12, rq3Var, ksaVar);
            case 13:
                return new ck1(13, rq3Var, ksaVar);
            case 14:
                return new ck1(14, rq3Var, ksaVar);
            case 15:
                return new ck1(15, rq3Var, ksaVar);
            case 16:
                return new ck1(16, rq3Var, ksaVar);
            default:
                return new ck1(17, rq3Var, ksaVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 1:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 2:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 3:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 4:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 5:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 6:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 7:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 8:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 9:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 10:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 11:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 12:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 13:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 14:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 15:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 16:
                ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            default:
                return ((ck1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0174, code lost:
    
        if (r3.f(0, 0, r8) == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0169, code lost:
    
        if (defpackage.ksa.l(10, r8, r3) == r0) goto L103;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ksa ksaVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ksa.l(0, this, ksaVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    y3g y3gVar = ksa.y;
                    if (ksaVar.f(0, 0, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                try {
                    if (i4 == 0) {
                        y6a.M(obj);
                        int h = ksaVar.h() + 1;
                        this.s = 1;
                        if (ksaVar.f(h, 0, this) == lu3Var3) {
                            return lu3Var3;
                        }
                    } else {
                        if (i4 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                } catch (IllegalArgumentException unused) {
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                try {
                    if (i5 == 0) {
                        y6a.M(obj);
                        int h2 = ksaVar.h() - 1;
                        this.s = 1;
                        if (ksaVar.f(h2, 0, this) == lu3Var4) {
                            return lu3Var4;
                        }
                    } else {
                        if (i5 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                } catch (IllegalArgumentException unused2) {
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ksa.l(0, this, ksaVar) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ksa.l(0, this, ksaVar) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ksa.l(0, this, ksaVar) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ksa.l(0, this, ksaVar) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ksa.l(0, this, ksaVar) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    if (ksaVar.h() > 11) {
                        this.s = 1;
                        break;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                this.s = 2;
                y3g y3gVar2 = ksa.y;
                break;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ksa.l(0, this, ksaVar) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (v8a.i(ksaVar, 300.0f, s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7), this) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ksa.l(0, this, ksaVar) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    if (!ksaVar.j.b()) {
                        this.s = 1;
                        if (ksaVar.f(0, 0, this) == lu3Var14) {
                            return lu3Var14;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ksa.l(0, this, ksaVar) == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ksa.l(0, this, ksaVar) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    ad2 ad2Var = qv5.a;
                    LinkedHashMap linkedHashMap = qv5.b;
                    KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(e52.class);
                    Object obj2 = linkedHashMap.get(orCreateKotlinClass);
                    if (obj2 == null) {
                        obj2 = beh.b(0, 0, null, 7);
                        linkedHashMap.put(orCreateKotlinClass, obj2);
                    }
                    f10 f10Var = new f10(ksaVar, 24);
                    this.s = 1;
                    if (((b1d) obj2).collect(f10Var, this) == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            default:
                lu3 lu3Var18 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (ksa.l(0, this, ksaVar) == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }
}
