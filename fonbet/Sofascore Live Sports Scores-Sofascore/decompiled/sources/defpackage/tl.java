package defpackage;

import com.sofascore.results.onboarding.OnboardingViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tl extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public Object u;
    public Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(j95 j95Var, sw swVar, rq3 rq3Var) {
        super(3, rq3Var);
        this.r = 1;
        this.u = j95Var;
        this.v = swVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.r) {
            case 0:
                tl tlVar = new tl((Function2) this.v, (rq3) obj3, 0);
                tlVar.t = (ghe) obj;
                tlVar.u = (aq4) obj2;
                return tlVar.invokeSuspend(Unit.a);
            case 1:
                tl tlVar2 = new tl((j95) this.u, (sw) this.v, (rq3) obj3);
                tlVar2.t = (ax) obj;
                return tlVar2.invokeSuspend(Unit.a);
            case 2:
                tl tlVar3 = new tl((rq3) obj3, (iz2) this.v, 2);
                tlVar3.t = (b98) obj;
                tlVar3.u = obj2;
                return tlVar3.invokeSuspend(Unit.a);
            case 3:
                tl tlVar4 = new tl((p63) this.v, (rq3) obj3, i);
                tlVar4.t = (String) obj;
                tlVar4.u = (List) obj2;
                return tlVar4.invokeSuspend(Unit.a);
            case 4:
                tl tlVar5 = new tl((rq3) obj3, (tr3) this.v, 4);
                tlVar5.t = (b98) obj;
                tlVar5.u = obj2;
                return tlVar5.invokeSuspend(Unit.a);
            case 5:
                tl tlVar6 = new tl(i, (rq3) obj3);
                tlVar6.t = (ghe) obj;
                tlVar6.u = (aq4) obj2;
                return tlVar6.invokeSuspend(Unit.a);
            case 6:
                tl tlVar7 = new tl((rq3) obj3, (e37) this.v, 6);
                tlVar7.t = (b98) obj;
                tlVar7.u = obj2;
                return tlVar7.invokeSuspend(Unit.a);
            case 7:
                tl tlVar8 = new tl((rq3) obj3, (od7) this.v, 7);
                tlVar8.t = (b98) obj;
                tlVar8.u = (Object[]) obj2;
                return tlVar8.invokeSuspend(Unit.a);
            case 8:
                tl tlVar9 = new tl((rq3) obj3, (od7) this.v, 8);
                tlVar9.t = (b98) obj;
                tlVar9.u = obj2;
                return tlVar9.invokeSuspend(Unit.a);
            case 9:
                tl tlVar10 = new tl((rr7) this.v, (rq3) obj3, 9);
                tlVar10.t = (List) obj;
                tlVar10.u = (List) obj2;
                return tlVar10.invokeSuspend(Unit.a);
            case 10:
                tl tlVar11 = new tl((rq3) obj3, (my7) this.v, 10);
                tlVar11.t = (b98) obj;
                tlVar11.u = obj2;
                return tlVar11.invokeSuspend(Unit.a);
            case 11:
                tl tlVar12 = new tl((List) this.v, (rq3) obj3, 11);
                tlVar12.t = (k4h) obj;
                tlVar12.u = (yj9) obj2;
                return tlVar12.invokeSuspend(Unit.a);
            case 12:
                tl tlVar13 = new tl((vh9) this.v, (rq3) obj3, 12);
                tlVar13.t = (ghe) obj;
                tlVar13.u = obj2;
                return tlVar13.invokeSuspend(Unit.a);
            case 13:
                tl tlVar14 = new tl((rx2) this.v, (rq3) obj3, 13);
                tlVar14.t = (k4h) obj;
                tlVar14.u = (yj9) obj2;
                return tlVar14.invokeSuspend(Unit.a);
            case 14:
                tl tlVar15 = new tl((rx2) this.v, (rq3) obj3, 14);
                tlVar15.t = (yj9) obj;
                tlVar15.u = (Function1) obj2;
                return tlVar15.invokeSuspend(Unit.a);
            case 15:
                tl tlVar16 = new tl((rq3) obj3, (o4b) this.v, 15);
                tlVar16.t = (b98) obj;
                tlVar16.u = obj2;
                return tlVar16.invokeSuspend(Unit.a);
            case 16:
                tl tlVar17 = new tl((rq3) obj3, (s5d) this.v, 16);
                tlVar17.t = (b98) obj;
                tlVar17.u = obj2;
                return tlVar17.invokeSuspend(Unit.a);
            case 17:
                tl tlVar18 = new tl((rq3) obj3, (OnboardingViewModel) this.v, 17);
                tlVar18.t = (b98) obj;
                tlVar18.u = obj2;
                return tlVar18.invokeSuspend(Unit.a);
            case 18:
                tl tlVar19 = new tl((rq3) obj3, (v1e) this.v, 18);
                tlVar19.t = (b98) obj;
                tlVar19.u = obj2;
                return tlVar19.invokeSuspend(Unit.a);
            case 19:
                tl tlVar20 = new tl((rq3) obj3, (m2e) this.v, 19);
                tlVar20.t = (b98) obj;
                tlVar20.u = obj2;
                return tlVar20.invokeSuspend(Unit.a);
            case 20:
                tl tlVar21 = new tl((rq3) obj3, (k4e) this.v, 20);
                tlVar21.t = (b98) obj;
                tlVar21.u = obj2;
                return tlVar21.invokeSuspend(Unit.a);
            case 21:
                tl tlVar22 = new tl(this.v, (rq3) obj3, 21);
                tlVar22.t = obj;
                tlVar22.u = obj2;
                return tlVar22.invokeSuspend(Unit.a);
            case 22:
                tl tlVar23 = new tl((seh) this.v, (rq3) obj3, 22);
                tlVar23.t = (b98) obj;
                tlVar23.u = (Throwable) obj2;
                return tlVar23.invokeSuspend(Unit.a);
            case 23:
                tl tlVar24 = new tl((ft8) this.v, (rq3) obj3, 23);
                tlVar24.t = (ghe) obj;
                return tlVar24.invokeSuspend(Unit.a);
            default:
                tl tlVar25 = new tl((rq3) obj3, (qkl) this.v, 24);
                tlVar25.t = (b98) obj;
                tlVar25.u = obj2;
                return tlVar25.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:296|297|(1:(2:300|(3:302|303|304)(2:305|306))(3:307|308|309))(2:324|(4:326|(1:328)|329|330)(4:331|(1:333)|334|(3:336|319|320)))|310|312|313|314|(1:316)|317) */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x046f, code lost:
    
        if (r2.d(r24, r1) == r0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0455, code lost:
    
        if (r3 == r0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04db, code lost:
    
        if (r1 == r0) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x078f, code lost:
    
        if (r3.d(r24, r4) == r1) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0761, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0762, code lost:
    
        r2 = defpackage.w2g.b;
        r0 = new defpackage.u2g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
    
        if (r1.d(r24, r2) == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0912, code lost:
    
        if (r1.d(r24, r2) == r0) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0902, code lost:
    
        if (r2 == r0) goto L364;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32, types: [aq4] */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ghe gheVar;
        Object invoke;
        z88 q;
        ghe gheVar2;
        xh3 attributes;
        Object Q;
        Object m;
        Object a;
        ghe gheVar3;
        Object obj2;
        Object a2;
        k4h k4hVar;
        yj9 yj9Var;
        Object a3;
        xa3 xa3Var;
        h5k h5kVar;
        Object invoke2;
        ghe gheVar4;
        int i = 25;
        int i2 = 12;
        int i3 = 24;
        int i4 = 0;
        int i5 = 10;
        int i6 = 3;
        int i7 = 6;
        int i8 = 2;
        rq3 rq3Var = null;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    gheVar = (ghe) this.t;
                    aq4 aq4Var = (aq4) this.u;
                    Function2 function2 = (Function2) this.v;
                    this.t = gheVar;
                    this.s = 1;
                    invoke = function2.invoke(aq4Var, this);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gheVar = (ghe) this.t;
                    y6a.M(obj);
                    invoke = obj;
                }
                aq4 aq4Var2 = (aq4) invoke;
                if (aq4Var2 != null) {
                    this.t = null;
                    this.s = 2;
                    break;
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    ax axVar = (ax) this.t;
                    j95 j95Var = (j95) this.u;
                    s1 s1Var = new s1(8, (sw) this.v, axVar);
                    this.s = 1;
                    if (j95Var.invoke(s1Var, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    b98 b98Var = (b98) this.t;
                    yyc yycVar = new yyc((iz2) this.v, (f6e) this.u);
                    this.s = 1;
                    if (b98Var.emit(yycVar, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 3:
                p63 p63Var = (p63) this.v;
                String str = (String) this.t;
                List list = (List) this.u;
                lu3 lu3Var4 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    uwg uwgVar = p63Var.c;
                    this.t = str;
                    this.u = list;
                    this.s = 1;
                    if (uwgVar.a(this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return new g5e(new k9(50, 58), new mi(i2, p63Var, list, str));
            case 4:
                tr3 tr3Var = (tr3) this.v;
                b98 b98Var2 = (b98) this.t;
                Object obj3 = this.u;
                lu3 lu3Var5 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    int ordinal = ((l64) obj3).ordinal();
                    if (ordinal == 0) {
                        q = dy0.q(tr3Var.n, tr3Var.t, tr3Var.m, tr3Var.o, tr3Var.s, new kr3(tr3Var, null));
                    } else if (ordinal == 1) {
                        q = dy0.r(tr3Var.n, tr3Var.t, tr3Var.m, new lr3(tr3Var, rq3Var, i4));
                    } else {
                        if (ordinal != 2) {
                            zzl.b();
                            return null;
                        }
                        q = new wf2(h64.a, i7);
                    }
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var2, q, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                aq4 aq4Var3 = this.s;
                try {
                    if (aq4Var3 == 0) {
                        y6a.M(obj);
                        gheVar2 = (ghe) this.t;
                        aq4 aq4Var4 = (aq4) this.u;
                        xh9 b = aq4Var4.b();
                        attributes = b.getAttributes();
                        pm0 pm0Var = g75.a;
                        attributes.getClass();
                        pm0Var.getClass();
                        if (attributes.c().containsKey(pm0Var)) {
                            bjb bjbVar = (bjb) g75.c.getValue();
                            bjbVar.getClass();
                            if (bjbVar.i()) {
                                bjbVar.l("Skipping body saving for " + b.c().getUrl());
                            }
                            return Unit.a;
                        }
                        bjb bjbVar2 = (bjb) g75.c.getValue();
                        bjbVar2.getClass();
                        if (bjbVar2.i()) {
                            bjbVar2.l("Saving body for " + b.c().getUrl());
                        }
                        this.t = gheVar2;
                        this.u = aq4Var4;
                        this.v = attributes;
                        this.s = 1;
                        Q = x2a.Q(b, this);
                        aq4Var3 = aq4Var4;
                        if (Q == lu3Var6) {
                            return lu3Var6;
                        }
                    } else {
                        if (aq4Var3 != 1) {
                            if (aq4Var3 == 2) {
                                y6a.M(obj);
                                return Unit.a;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xh3 xh3Var = (xh3) this.v;
                        aq4 aq4Var5 = (aq4) this.u;
                        gheVar2 = (ghe) this.t;
                        y6a.M(obj);
                        attributes = xh3Var;
                        Q = obj;
                        aq4Var3 = aq4Var5;
                    }
                    aq4 d = ((xh9) Q).d();
                    p2g p2gVar = w2g.b;
                    fkf.y(aq4Var3.c());
                    Object u2gVar = Unit.a;
                    Throwable a4 = w2g.a(u2gVar);
                    if (a4 != null) {
                        ((bjb) g75.c.getValue()).j(a4);
                    }
                    attributes.e(g75.b, Unit.a);
                    this.t = null;
                    this.u = null;
                    this.v = null;
                    this.s = 2;
                    break;
                } finally {
                }
            case 6:
                b98 b98Var3 = (b98) this.t;
                Object obj4 = this.u;
                lu3 lu3Var7 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    e37 e37Var = (e37) this.v;
                    zn2 a5 = la8.a(e37Var.h, new c37((rq3) null, (j67) obj4, e37Var));
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var3, a5, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 7:
                b98 b98Var4 = (b98) this.t;
                Object[] objArr = (Object[]) this.u;
                lu3 lu3Var8 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    Object obj5 = objArr[0];
                    String str2 = (String) obj5;
                    g5e g5eVar = new g5e(new k9(30, 58), new kd7((od7) this.v, (ho1) objArr[1], (mei) objArr[4], (nei) objArr[5], (Float) objArr[2], (String) objArr[3], str2));
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (b98Var4.emit(g5eVar, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                od7 od7Var = (od7) this.v;
                b98 b98Var5 = (b98) this.t;
                Object obj6 = this.u;
                lu3 lu3Var9 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    Pair pair = (Pair) obj6;
                    hof w = pco.w(la8.a(new o63(i6, new z88[]{hkg.F(od7Var.n, rg2.i), od7Var.o, od7Var.p, od7Var.q, od7Var.r, od7Var.s}, od7Var), new f61(null, od7Var, (List) pair.b, (Map) pair.a)), un0.z(od7Var));
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var5, w, this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                List list2 = (List) this.t;
                List list3 = (List) this.u;
                lu3 lu3Var10 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    rr7 rr7Var = (rr7) this.v;
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    m = rr7Var.m(list2, list3, null, this);
                    if (m == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    m = obj;
                }
                return CollectionsKt.L0((Iterable) m, 10);
            case 10:
                b98 b98Var6 = (b98) this.t;
                lu3 lu3Var11 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    k4e k4eVar = new k4e(new ej(new ps4((my7) this.v, 5), rq3Var, i7), new k9(5, 48));
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var6, k4eVar.e, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    k4h k4hVar2 = (k4h) ((ku3) this.t);
                    yj9 yj9Var2 = (yj9) this.u;
                    this.t = null;
                    this.s = 1;
                    a = k4hVar2.a.a(yj9Var2, this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xh9 xh9Var = (xh9) ((ku3) this.t);
                        y6a.M(obj);
                        return xh9Var;
                    }
                    y6a.M(obj);
                    a = obj;
                }
                xh9 xh9Var2 = (xh9) a;
                List list4 = (List) this.v;
                aq4 d2 = xh9Var2.d();
                this.t = xh9Var2;
                this.s = 2;
                if (sh9.b(list4, d2, this) != lu3Var12) {
                    return xh9Var2;
                }
                return lu3Var12;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    gheVar3 = (ghe) this.t;
                    obj2 = this.u;
                    if (!(obj2 instanceof xh9)) {
                        StringBuilder sb = new StringBuilder("Error: HttpClientCall expected, but found ");
                        sb.append(obj2);
                        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(obj2.getClass());
                        sb.append('(');
                        sb.append(orCreateKotlinClass);
                        sb.append(").");
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    rj9 rj9Var = ((vh9) this.v).h;
                    Unit unit = Unit.a;
                    aq4 d3 = ((xh9) obj2).d();
                    this.t = gheVar3;
                    this.u = obj2;
                    this.s = 1;
                    a2 = rj9Var.a(unit, d3, this);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.u;
                    gheVar3 = (ghe) this.t;
                    y6a.M(obj);
                    a2 = obj;
                }
                aq4 aq4Var6 = (aq4) a2;
                xh9 xh9Var3 = (xh9) obj2;
                xh9Var3.getClass();
                aq4Var6.getClass();
                xh9Var3.c = aq4Var6;
                this.t = null;
                this.u = null;
                this.s = 2;
                break;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    k4hVar = (k4h) this.t;
                    yj9Var = (yj9) this.u;
                    this.t = k4hVar;
                    this.u = yj9Var;
                    this.s = 1;
                    a3 = k4hVar.a.a(yj9Var, this);
                    if (a3 == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yj9Var = (yj9) this.u;
                    k4hVar = (k4h) this.t;
                    y6a.M(obj);
                    a3 = obj;
                }
                xh9 xh9Var4 = (xh9) a3;
                if (!vj9.a.contains(xh9Var4.c().getMethod())) {
                    return xh9Var4;
                }
                vh9 vh9Var = ((rx2) this.v).a;
                this.t = null;
                this.u = null;
                this.s = 2;
                Object a6 = vj9.a(k4hVar, yj9Var, xh9Var4, vh9Var, this);
                return a6 == lu3Var14 ? lu3Var14 : a6;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    yj9 yj9Var3 = (yj9) this.t;
                    Function1 function1 = (Function1) this.u;
                    smi smiVar = new smi(yj9Var3.e);
                    CoroutineContext.Element element = ((rx2) this.v).a.d.get(uic.g);
                    element.getClass();
                    bjb bjbVar3 = bk9.a;
                    smiVar.n(new yx7(((yda) element).n(new yx7(smiVar, i3)), i));
                    try {
                        yj9Var3.e = smiVar;
                        this.t = smiVar;
                        this.s = 1;
                        if (function1.invoke(this) == lu3Var15) {
                            return lu3Var15;
                        }
                        xa3Var = smiVar;
                    } catch (Throwable th) {
                        th = th;
                        xa3Var = smiVar;
                        aea aeaVar = (aea) xa3Var;
                        aeaVar.getClass();
                        aeaVar.V(new eb3(th, false));
                        throw th;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xa3Var = (xa3) this.t;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            aea aeaVar2 = (aea) xa3Var;
                            aeaVar2.getClass();
                            aeaVar2.V(new eb3(th, false));
                            throw th;
                        } catch (Throwable th3) {
                            ((aea) xa3Var).j0();
                            throw th3;
                        }
                    }
                }
                ((aea) xa3Var).j0();
                return Unit.a;
            case 15:
                b98 b98Var7 = (b98) this.t;
                Object obj7 = this.u;
                lu3 lu3Var16 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    k4e k4eVar2 = new k4e(new ej(new pi(19, (m4b) obj7, (o4b) this.v), rq3Var, i7), new k9(25, 58));
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var7, k4eVar2.e, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i23 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 16:
                b98 b98Var8 = (b98) this.t;
                Object obj8 = this.u;
                lu3 lu3Var17 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    fgf fgfVar = (fgf) obj8;
                    z88 g0 = k53.g0(new wj0(new o63(i5, yso.q(new j8c((s5d) this.v, ljg.j(fgfVar.a, "odds."), rq3Var, i2)), fgfVar), 3), z45.a);
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var8, g0, this) == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 17:
                b98 b98Var9 = (b98) this.t;
                Object obj9 = this.u;
                lu3 lu3Var18 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    k4e k4eVar3 = new k4e(new ej(new pi(23, (OnboardingViewModel) this.v, (String) obj9), rq3Var, i7), new k9(50, 58));
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var9, k4eVar3.e, this) == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 18:
                b98 b98Var10 = (b98) this.t;
                Object obj10 = this.u;
                lu3 lu3Var19 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    q1e q1eVar = (q1e) obj10;
                    boolean c = Intrinsics.c(q1eVar.b, n1e.a);
                    k4e k4eVar4 = new k4e(new ej(new pi(i3, (v1e) this.v, q1eVar), rq3Var, i7), new k9(10, 58));
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    kik.n(b98Var10);
                    Object collect = k4eVar4.e.collect(new u1e(b98Var10, c), this);
                    if (collect != lu3Var19) {
                        collect = Unit.a;
                    }
                    if (collect != lu3Var19) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 19:
                b98 b98Var11 = (b98) this.t;
                Object obj11 = this.u;
                lu3 lu3Var20 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    k4e k4eVar5 = new k4e(new ej(new ps4((m2e) this.v, 9), rq3Var, i7), new k9(10, 58));
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var11, k4eVar5.e, this) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 20:
                k4e k4eVar6 = (k4e) this.v;
                lu3 lu3Var21 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    b98 b98Var12 = (b98) this.t;
                    f4e f4eVar = (f4e) this.u;
                    f6e f6eVar = new f6e(new v98(f4eVar.a.k, new d11(i8, rq3Var, 11), i6), new k1d(k4eVar6, k4eVar6.d), new cqa(f4eVar.a), jxa.D);
                    this.s = 1;
                    if (b98Var12.emit(f6eVar, this) == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i29 = this.s;
                if (i29 != 0) {
                    if (i29 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Object obj12 = this.t;
                Object obj13 = this.u;
                br3 br3Var = (br3) this.v;
                this.t = null;
                this.s = 1;
                Object invoke3 = br3Var.invoke(obj12, obj13, this);
                return invoke3 == lu3Var22 ? lu3Var22 : invoke3;
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    b98 b98Var13 = (b98) this.t;
                    Throwable th4 = (Throwable) this.u;
                    s7h s7hVar = new s7h(((seh) this.v).b.a(null), null, null);
                    th4.getMessage();
                    this.t = null;
                    this.s = 1;
                    if (b98Var13.emit(s7hVar, this) == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i30 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    ghe gheVar5 = (ghe) this.t;
                    ik9 ik9Var = (ik9) gheVar5.b();
                    h5kVar = ik9Var.a;
                    Object obj14 = ik9Var.b;
                    if (!(obj14 instanceof db2)) {
                        return Unit.a;
                    }
                    ft8 ft8Var = (ft8) this.v;
                    yvj yvjVar = new yvj();
                    aq4 d4 = ((xh9) gheVar5.a).d();
                    this.t = gheVar5;
                    this.u = h5kVar;
                    this.s = 1;
                    invoke2 = ft8Var.invoke(yvjVar, d4, obj14, h5kVar, this);
                    if (invoke2 != lu3Var24) {
                        gheVar4 = gheVar5;
                    }
                    return lu3Var24;
                }
                if (i31 != 1) {
                    if (i31 == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h5k h5kVar2 = (h5k) this.u;
                gheVar4 = (ghe) this.t;
                y6a.M(obj);
                h5kVar = h5kVar2;
                invoke2 = obj;
                if (invoke2 == null) {
                    return Unit.a;
                }
                if (!(invoke2 instanceof kid) && !h5kVar.a.isInstance(invoke2)) {
                    zzl.l("transformResponseBody returned ", invoke2, " but expected value of type ", h5kVar);
                    return null;
                }
                ik9 ik9Var2 = new ik9(h5kVar, invoke2);
                this.t = null;
                this.u = null;
                this.s = 2;
                break;
            default:
                b98 b98Var14 = (b98) this.t;
                Object obj15 = this.u;
                lu3 lu3Var25 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    Integer num = (Integer) obj15;
                    z88 b2 = num != null ? ((qkl) this.v).o.b(num.intValue()) : new wf2(rq3Var, i7);
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var14, b2, this) == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl(rq3 rq3Var, Object obj, int i) {
        super(3, rq3Var);
        this.r = i;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl(int i, rq3 rq3Var) {
        super(i, rq3Var);
        this.r = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl(Object obj, rq3 rq3Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.v = obj;
    }
}
