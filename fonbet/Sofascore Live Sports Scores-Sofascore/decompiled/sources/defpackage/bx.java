package defpackage;

import android.os.Bundle;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bx extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(f4a f4aVar, rh4 rh4Var, rq3 rq3Var) {
        super(3, rq3Var);
        this.r = 0;
        this.t = f4aVar;
        this.u = rh4Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.r) {
            case 0:
                return new bx((f4a) this.t, (rh4) this.u, (rq3) obj3).invokeSuspend(Unit.a);
            case 1:
                bx bxVar = new bx(i, (rq3) obj3, 1);
                bxVar.t = (yyc) obj;
                bxVar.u = (yyc) obj2;
                return bxVar.invokeSuspend(Unit.a);
            case 2:
                bx bxVar2 = new bx(i, (rq3) obj3, 2);
                bxVar2.t = (ghe) obj;
                bxVar2.u = obj2;
                return bxVar2.invokeSuspend(Unit.a);
            case 3:
                bx bxVar3 = new bx(i, (rq3) obj3, i);
                bxVar3.t = (ghe) obj;
                bxVar3.u = (ik9) obj2;
                return bxVar3.invokeSuspend(Unit.a);
            case 4:
                bx bxVar4 = new bx((Bundle) this.u, (rq3) obj3, 4);
                bxVar4.t = (af0) obj2;
                return bxVar4.invokeSuspend(Unit.a);
            case 5:
                bx bxVar5 = new bx((String) this.u, (rq3) obj3, 5);
                bxVar5.t = (af0) obj2;
                return bxVar5.invokeSuspend(Unit.a);
            case 6:
                bx bxVar6 = new bx((vh9) this.u, (rq3) obj3, 6);
                bxVar6.t = (ghe) obj;
                return bxVar6.invokeSuspend(Unit.a);
            case 7:
                bx bxVar7 = new bx((et8) this.u, (rq3) obj3, 7);
                bxVar7.t = (ghe) obj;
                return bxVar7.invokeSuspend(Unit.a);
            case 8:
                bx bxVar8 = new bx(i, (rq3) obj3, 8);
                bxVar8.t = (URL) obj;
                bxVar8.u = (String[]) obj2;
                return bxVar8.invokeSuspend(Unit.a);
            default:
                bx bxVar9 = new bx((Function2) this.u, (rq3) obj3, 9);
                bxVar9.t = (ghe) obj;
                return bxVar9.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        swd ku4Var;
        ghe gheVar;
        Throwable th;
        rq3 rq3Var = null;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    cx cxVar = (cx) ((f4a) this.t).b;
                    rh4 rh4Var = (rh4) this.u;
                    this.s = 1;
                    if (rh4Var.invoke(cxVar, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yyc yycVar = (yyc) this.t;
                    y6a.M(obj);
                    return yycVar;
                }
                y6a.M(obj);
                yyc yycVar2 = (yyc) this.t;
                yyc yycVar3 = (yyc) this.u;
                this.t = yycVar3;
                this.s = 1;
                ((g9i) yycVar2.b.e).e(null);
                return Unit.a == lu3Var2 ? lu3Var2 : yycVar3;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    ghe gheVar2 = (ghe) this.t;
                    Object obj2 = this.u;
                    Object obj3 = gheVar2.a;
                    t89 t89Var = ((yj9) obj3).c;
                    List list = zi9.a;
                    if (t89Var.t("Accept") == null) {
                        ((yj9) obj3).c.i("Accept", "*/*");
                    }
                    up3 C = xw3.C((hj9) obj3);
                    if (obj2 instanceof String) {
                        String str = (String) obj2;
                        if (C == null) {
                            C = tp3.a;
                        }
                        ku4Var = new c8j(str, C);
                    } else if (obj2 instanceof byte[]) {
                        ku4Var = new ju4(C, obj2);
                    } else if (obj2 instanceof db2) {
                        ku4Var = new ku4(gheVar2, C, obj2);
                    } else if (obj2 instanceof swd) {
                        ku4Var = (swd) obj2;
                    } else {
                        yj9 yj9Var = (yj9) obj3;
                        yj9Var.getClass();
                        obj2.getClass();
                        ku4Var = obj2 instanceof InputStream ? new ku4(yj9Var, C, obj2) : null;
                    }
                    if ((ku4Var != null ? ku4Var.b() : null) != null) {
                        yj9 yj9Var2 = (yj9) obj3;
                        ((Map) yj9Var2.c.b).remove("Content-Type");
                        lu4.a.l("Transformed with default transformers request body for " + yj9Var2.a + " from " + duf.a.getOrCreateKotlinClass(obj2.getClass()));
                        this.t = null;
                        this.s = 1;
                        if (gheVar2.d(this, ku4Var) == lu3Var3) {
                            return lu3Var3;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    ghe gheVar3 = (ghe) this.t;
                    ik9 ik9Var = (ik9) this.u;
                    h5k h5kVar = ik9Var.a;
                    Object obj4 = ik9Var.b;
                    if (!(obj4 instanceof db2)) {
                        return Unit.a;
                    }
                    if (Intrinsics.c(h5kVar.a, duf.a.getOrCreateKotlinClass(InputStream.class))) {
                        ik9 ik9Var2 = new ik9(h5kVar, new oy1(new oy1((db2) obj4, 0), 2));
                        this.t = null;
                        this.s = 1;
                        if (gheVar3.d(this, ik9Var2) == lu3Var4) {
                            return lu3Var4;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    af0 af0Var = (af0) this.t;
                    Bundle bundle = (Bundle) this.u;
                    this.s = 1;
                    af0Var.getClass();
                    Object e = af0Var.e(new te0(bundle), this);
                    if (e != lu3Var5) {
                        e = Unit.a;
                    }
                    if (e == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    af0 af0Var2 = (af0) this.t;
                    String str2 = (String) this.u;
                    this.s = 1;
                    af0Var2.getClass();
                    Object e2 = af0Var2.e(new se0(str2), this);
                    if (e2 != lu3Var6) {
                        e2 = Unit.a;
                    }
                    if (e2 == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    ghe gheVar4 = (ghe) this.t;
                    try {
                        this.t = gheVar4;
                        this.s = 1;
                        Object c = gheVar4.c(this);
                        if (c == lu3Var7) {
                            return lu3Var7;
                        }
                        gheVar = gheVar4;
                        obj = c;
                    } catch (Throwable th2) {
                        gheVar = gheVar4;
                        th = th2;
                        de0 de0Var = ((vh9) this.u).j;
                        p4h p4hVar = n4o.d;
                        ((xh9) gheVar.a).d();
                        de0Var.getClass();
                        wt3.z(((zs3) de0Var.b).a(p4hVar));
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gheVar = (ghe) this.t;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        de0 de0Var2 = ((vh9) this.u).j;
                        p4h p4hVar2 = n4o.d;
                        ((xh9) gheVar.a).d();
                        de0Var2.getClass();
                        wt3.z(((zs3) de0Var2.b).a(p4hVar2));
                        throw th;
                    }
                }
                return Unit.a;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    ghe gheVar5 = (ghe) this.t;
                    et8 et8Var = (et8) this.u;
                    nqd nqdVar = new nqd();
                    Object obj5 = gheVar5.a;
                    Object b = gheVar5.b();
                    this.s = 1;
                    if (et8Var.invoke(nqdVar, obj5, b, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                URL url = (URL) this.t;
                String[] strArr = (String[]) this.u;
                hs4 hs4Var = z45.a;
                hq4 hq4Var = hq4.c;
                m1f m1fVar = new m1f(url, strArr, rq3Var, 10);
                this.t = null;
                this.s = 1;
                Object R = xw3.R(hq4Var, m1fVar, this);
                return R == lu3Var9 ? lu3Var9 : R;
            default:
                lu3 lu3Var10 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    ghe gheVar6 = (ghe) this.t;
                    Function2 function2 = (Function2) this.u;
                    Object obj6 = gheVar6.a;
                    this.s = 1;
                    if (function2.invoke(obj6, this) == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx(Object obj, rq3 rq3Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.u = obj;
    }
}
