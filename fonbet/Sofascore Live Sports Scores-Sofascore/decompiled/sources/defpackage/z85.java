package defpackage;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z85 extends m2g implements Function2 {
    public final /* synthetic */ int s;
    public int t;
    public Object u;
    public Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z85(wc4 wc4Var, y47 y47Var, Function2 function2, Function0 function0, ma0 ma0Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = 0;
        this.v = wc4Var;
        this.w = y47Var;
        this.x = function2;
        this.y = function0;
        this.z = ma0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.s;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                z85 z85Var = new z85((wc4) this.v, (y47) this.w, (Function2) obj4, (Function0) obj3, (ma0) obj2, rq3Var);
                z85Var.u = obj;
                return z85Var;
            case 1:
                z85 z85Var2 = new z85((qz4) this.w, (vm7) obj4, (wc4) obj3, (wc4) obj2, rq3Var, 1);
                z85Var2.u = obj;
                return z85Var2;
            case 2:
                z85 z85Var3 = new z85((Pair) obj4, (a65) obj3, (qs2) obj2, rq3Var);
                z85Var3.w = obj;
                return z85Var3;
            default:
                z85 z85Var4 = new z85((ku3) this.w, (ct8) obj4, (Function1) obj3, (j6f) obj2, rq3Var, 3);
                z85Var4.u = obj;
                return z85Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.s) {
            case 0:
                return ((z85) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((z85) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((z85) create((x4h) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((z85) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r6 == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0198, code lost:
    
        if (r0 == r12) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014c, code lost:
    
        if (r1 == r12) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fd, code lost:
    
        if (defpackage.e95.j(r0, (defpackage.mze) r2, (defpackage.wc4) r19.v, (defpackage.y47) r19.w, (kotlin.jvm.functions.Function2) r4, (kotlin.jvm.functions.Function0) r1, (defpackage.ma0) r3, r19) == r11) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d9, code lost:
    
        if (r2 == r11) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noi noiVar;
        Object a;
        noi noiVar2;
        Object b;
        Object b2;
        noi noiVar3;
        csf csfVar;
        mze mzeVar;
        Object g;
        Iterator it;
        noi noiVar4;
        g9i L;
        Object b3;
        Object i;
        yda ydaVar;
        mze mzeVar2;
        int i2 = this.s;
        Object obj2 = this.y;
        int i3 = 0;
        Object obj3 = this.z;
        Object obj4 = this.x;
        int i4 = 1;
        switch (i2) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i5 = this.t;
                if (i5 == 0) {
                    y6a.M(obj);
                    noiVar = (noi) this.u;
                    gze gzeVar = gze.a;
                    this.u = noiVar;
                    this.t = 1;
                    a = rti.a(noiVar, false, gzeVar, this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    noiVar = (noi) this.u;
                    y6a.M(obj);
                    a = obj;
                }
                this.u = null;
                this.t = 2;
                break;
            case 1:
                vm7 vm7Var = (vm7) obj4;
                lu3 lu3Var2 = lu3.a;
                int i6 = this.t;
                if (i6 == 0) {
                    y6a.M(obj);
                    noiVar2 = (noi) this.u;
                    this.u = noiVar2;
                    this.t = 1;
                    b = rti.b(noiVar2, this, 2);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            g = obj;
                            if (((Boolean) g).booleanValue()) {
                                Unit unit = Unit.a;
                            } else {
                                Unit unit2 = Unit.a;
                            }
                            return Unit.a;
                        }
                        csfVar = (csf) this.v;
                        noi noiVar5 = (noi) this.u;
                        y6a.M(obj);
                        noiVar3 = noiVar5;
                        b2 = obj;
                        mzeVar = (mze) b2;
                        if (mzeVar != null) {
                            Unit unit3 = Unit.a;
                            vm7Var.invoke(mzeVar, new Float(csfVar.a));
                            long j = mzeVar.a;
                            kz3 kz3Var = new kz3(vm7Var, 13);
                            this.u = null;
                            this.v = null;
                            this.t = 3;
                            g = e95.g(noiVar3, j, kz3Var, this);
                            break;
                        }
                        return Unit.a;
                    }
                    noiVar2 = (noi) this.u;
                    y6a.M(obj);
                    b = obj;
                }
                mze mzeVar3 = (mze) b;
                csf csfVar2 = new csf();
                long j2 = mzeVar3.a;
                int i7 = mzeVar3.i;
                fv2 fv2Var = new fv2(csfVar2, 11);
                this.u = noiVar2;
                this.v = csfVar2;
                this.t = 2;
                b2 = e95.b(noiVar2, j2, i7, fv2Var, this);
                if (b2 != lu3Var2) {
                    noiVar3 = noiVar2;
                    csfVar = csfVar2;
                    mzeVar = (mze) b2;
                    if (mzeVar != null) {
                    }
                    return Unit.a;
                }
                return lu3Var2;
            case 2:
                Object obj5 = (Pair) obj4;
                x4h x4hVar = (x4h) this.w;
                lu3 lu3Var3 = lu3.a;
                int i8 = this.t;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        it = ((a65) obj2).iterator();
                    } else {
                        if (i8 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (Iterator) this.v;
                        obj5 = this.u;
                        y6a.M(obj);
                    }
                    if (!it.hasNext()) {
                        return Unit.a;
                    }
                    Object invoke = ((qs2) obj3).invoke(obj5, it.next());
                    this.w = x4hVar;
                    this.u = invoke;
                    this.v = it;
                    this.t = 2;
                    x4hVar.d(this, invoke);
                } else {
                    y6a.M(obj);
                    this.w = x4hVar;
                    this.t = 1;
                    x4hVar.d(this, obj5);
                }
                return lu3Var3;
            default:
                ku3 ku3Var = (ku3) this.w;
                j6f j6fVar = (j6f) obj3;
                lu3 lu3Var4 = lu3.a;
                int i9 = this.t;
                rq3 rq3Var = null;
                if (i9 == 0) {
                    y6a.M(obj);
                    noiVar4 = (noi) this.u;
                    L = xw3.L(ku3Var, null, nu3.d, new mti(j6fVar, rq3Var, i3), 1);
                    this.u = noiVar4;
                    this.v = L;
                    this.t = 1;
                    b3 = rti.b(noiVar4, this, 3);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ydaVar = (yda) this.u;
                        y6a.M(obj);
                        i = obj;
                        mzeVar2 = (mze) i;
                        if (mzeVar2 != null) {
                            rti.f(ku3Var, ydaVar, new lti(j6fVar, rq3Var, i3));
                        } else {
                            mzeVar2.a();
                            rti.f(ku3Var, ydaVar, new lti(j6fVar, rq3Var, i4));
                            ((Function1) obj2).invoke(new dnd(mzeVar2.c));
                        }
                        return Unit.a;
                    }
                    g9i g9iVar = (g9i) this.v;
                    noiVar4 = (noi) this.u;
                    y6a.M(obj);
                    L = g9iVar;
                    b3 = obj;
                }
                mze mzeVar4 = (mze) b3;
                mzeVar4.a();
                ct8 ct8Var = (ct8) obj4;
                if (ct8Var != rti.a) {
                    rti.f(ku3Var, L, new kti(ct8Var, j6fVar, mzeVar4, rq3Var, 0));
                }
                this.u = L;
                this.v = null;
                this.t = 2;
                i = rti.i(noiVar4, gze.b, this);
                if (i != lu3Var4) {
                    ydaVar = L;
                    mzeVar2 = (mze) i;
                    if (mzeVar2 != null) {
                    }
                    return Unit.a;
                }
                return lu3Var4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z85(Object obj, dt8 dt8Var, dt8 dt8Var2, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.s = i;
        this.w = obj;
        this.x = dt8Var;
        this.y = dt8Var2;
        this.z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z85(Pair pair, a65 a65Var, qs2 qs2Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = 2;
        this.x = pair;
        this.y = a65Var;
        this.z = qs2Var;
    }
}
