package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class db4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public Object s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db4(boolean z, boolean z2, List list, ho7 ho7Var, pu6 pu6Var, List list2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.v = z;
        this.w = z2;
        this.s = list;
        this.u = ho7Var;
        this.x = pu6Var;
        this.y = list2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case 0:
                db4 db4Var = new db4(this.v, this.w, (k6g) obj3, rq3Var, (Function1) obj2, 0);
                db4Var.u = obj;
                return db4Var;
            case 1:
                db4 db4Var2 = new db4(this.v, this.w, (k6g) obj3, rq3Var, (Function1) obj2, 1);
                db4Var2.u = obj;
                return db4Var2;
            default:
                return new db4(this.v, this.w, (List) this.s, (ho7) this.u, (pu6) obj3, (List) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((db4) create((avj) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((db4) create((avj) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((db4) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f1, code lost:
    
        if (r15 != r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bd, code lost:
    
        if (r15 != r0) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zuj zujVar;
        avj avjVar;
        avj avjVar2;
        zuj zujVar2;
        avj avjVar3;
        Object obj2;
        zuj zujVar3;
        avj avjVar4;
        avj avjVar5;
        zuj zujVar4;
        avj avjVar6;
        Object obj3;
        int i = this.r;
        int i2 = 0;
        Object obj4 = this.y;
        Object obj5 = this.x;
        boolean z = this.w;
        boolean z2 = this.v;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj4;
                k6g k6gVar = (k6g) obj5;
                lu3 lu3Var = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    avj avjVar7 = (avj) this.u;
                    if (!z2) {
                        avjVar7.getClass();
                        return function1.invoke(((enf) avjVar7).d());
                    }
                    zujVar = z ? zuj.a : zuj.b;
                    if (!z) {
                        this.u = avjVar7;
                        this.s = zujVar;
                        this.t = 1;
                        Boolean b = avjVar7.b(this);
                        if (b != lu3Var) {
                            avjVar2 = avjVar7;
                            obj = b;
                        }
                        return lu3Var;
                    }
                    avjVar = avjVar7;
                    cb4 cb4Var = new cb4((rq3) null, function1, 0);
                    this.u = avjVar;
                    this.s = null;
                    this.t = 3;
                    obj = avjVar.a(zujVar, cb4Var, this);
                } else if (i3 == 1) {
                    zujVar = (zuj) this.s;
                    avjVar2 = (avj) this.u;
                    y6a.M(obj);
                } else if (i3 == 2) {
                    zujVar2 = (zuj) this.s;
                    avjVar3 = (avj) this.u;
                    y6a.M(obj);
                    avj avjVar8 = avjVar3;
                    zujVar = zujVar2;
                    avjVar = avjVar8;
                    cb4 cb4Var2 = new cb4((rq3) null, function1, 0);
                    this.u = avjVar;
                    this.s = null;
                    this.t = 3;
                    obj = avjVar.a(zujVar, cb4Var2, this);
                    break;
                } else {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj6 = this.u;
                        y6a.M(obj);
                        obj2 = obj6;
                        if (!((Boolean) obj).booleanValue()) {
                            return obj2;
                        }
                        taa invalidationTracker = k6gVar.getInvalidationTracker();
                        invalidationTracker.c.e(invalidationTracker.f, invalidationTracker.g);
                        return obj2;
                    }
                    avjVar = (avj) this.u;
                    y6a.M(obj);
                    if (z) {
                        return obj;
                    }
                    this.u = obj;
                    this.t = 4;
                    Boolean b2 = avjVar.b(this);
                    if (b2 != lu3Var) {
                        obj2 = obj;
                        obj = b2;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                    return lu3Var;
                }
                if (!((Boolean) obj).booleanValue()) {
                    taa invalidationTracker2 = k6gVar.getInvalidationTracker();
                    this.u = avjVar2;
                    this.s = zujVar;
                    this.t = 2;
                    if (invalidationTracker2.a(this) != lu3Var) {
                        zujVar2 = zujVar;
                        avjVar3 = avjVar2;
                        avj avjVar82 = avjVar3;
                        zujVar = zujVar2;
                        avjVar = avjVar82;
                        cb4 cb4Var22 = new cb4((rq3) null, function1, 0);
                        this.u = avjVar;
                        this.s = null;
                        this.t = 3;
                        obj = avjVar.a(zujVar, cb4Var22, this);
                    }
                    return lu3Var;
                }
                avjVar = avjVar2;
                cb4 cb4Var222 = new cb4((rq3) null, function1, 0);
                this.u = avjVar;
                this.s = null;
                this.t = 3;
                obj = avjVar.a(zujVar, cb4Var222, this);
            case 1:
                Function1 function12 = (Function1) obj4;
                k6g k6gVar2 = (k6g) obj5;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.t;
                if (i4 == 0) {
                    y6a.M(obj);
                    avj avjVar9 = (avj) this.u;
                    if (!z2) {
                        avjVar9.getClass();
                        return function12.invoke(((enf) avjVar9).d());
                    }
                    zujVar3 = z ? zuj.a : zuj.b;
                    if (!z) {
                        this.u = avjVar9;
                        this.s = zujVar3;
                        this.t = 1;
                        Boolean b3 = avjVar9.b(this);
                        if (b3 != lu3Var2) {
                            avjVar5 = avjVar9;
                            obj = b3;
                        }
                        return lu3Var2;
                    }
                    avjVar4 = avjVar9;
                    cb4 cb4Var3 = new cb4((rq3) null, function12, 1);
                    this.u = avjVar4;
                    this.s = null;
                    this.t = 3;
                    obj = avjVar4.a(zujVar3, cb4Var3, this);
                } else if (i4 == 1) {
                    zujVar3 = (zuj) this.s;
                    avjVar5 = (avj) this.u;
                    y6a.M(obj);
                } else if (i4 == 2) {
                    zujVar4 = (zuj) this.s;
                    avjVar6 = (avj) this.u;
                    y6a.M(obj);
                    avj avjVar10 = avjVar6;
                    zujVar3 = zujVar4;
                    avjVar4 = avjVar10;
                    cb4 cb4Var32 = new cb4((rq3) null, function12, 1);
                    this.u = avjVar4;
                    this.s = null;
                    this.t = 3;
                    obj = avjVar4.a(zujVar3, cb4Var32, this);
                    break;
                } else {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj7 = this.u;
                        y6a.M(obj);
                        obj3 = obj7;
                        if (!((Boolean) obj).booleanValue()) {
                            return obj3;
                        }
                        taa invalidationTracker3 = k6gVar2.getInvalidationTracker();
                        invalidationTracker3.c.e(invalidationTracker3.f, invalidationTracker3.g);
                        return obj3;
                    }
                    avjVar4 = (avj) this.u;
                    y6a.M(obj);
                    if (z) {
                        return obj;
                    }
                    this.u = obj;
                    this.t = 4;
                    Boolean b4 = avjVar4.b(this);
                    if (b4 != lu3Var2) {
                        obj3 = obj;
                        obj = b4;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                    return lu3Var2;
                }
                if (!((Boolean) obj).booleanValue()) {
                    taa invalidationTracker4 = k6gVar2.getInvalidationTracker();
                    this.u = avjVar5;
                    this.s = zujVar3;
                    this.t = 2;
                    if (invalidationTracker4.a(this) != lu3Var2) {
                        zujVar4 = zujVar3;
                        avjVar6 = avjVar5;
                        avj avjVar102 = avjVar6;
                        zujVar3 = zujVar4;
                        avjVar4 = avjVar102;
                        cb4 cb4Var322 = new cb4((rq3) null, function12, 1);
                        this.u = avjVar4;
                        this.s = null;
                        this.t = 3;
                        obj = avjVar4.a(zujVar3, cb4Var322, this);
                    }
                    return lu3Var2;
                }
                avjVar4 = avjVar5;
                cb4 cb4Var3222 = new cb4((rq3) null, function12, 1);
                this.u = avjVar4;
                this.s = null;
                this.t = 3;
                obj = avjVar4.a(zujVar3, cb4Var3222, this);
            default:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.t;
                if (i5 == 0) {
                    y6a.M(obj);
                    if (!z2 || !z || ((List) this.s).isEmpty() || ((ho7) this.u).a.h()) {
                        return null;
                    }
                    this.t = 1;
                    ((pu6) obj5).getClass();
                    obj = xw3.R(z45.a, new ju6(i2, (List) obj4, rq3Var), this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (rx6) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db4(boolean z, boolean z2, k6g k6gVar, rq3 rq3Var, Function1 function1, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = z;
        this.w = z2;
        this.x = k6gVar;
        this.y = function1;
    }
}
