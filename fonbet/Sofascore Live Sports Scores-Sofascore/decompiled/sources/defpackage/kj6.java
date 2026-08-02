package defpackage;

import com.facebook.appevents.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kj6 extends m2g implements Function2 {
    public final /* synthetic */ int s;
    public int t;
    public Object u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj6(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.s = i;
        this.v = obj;
        this.w = obj2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.s;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                kj6 kj6Var = new kj6((String) this.v, (b93) obj2, rq3Var, 0);
                kj6Var.u = obj;
                return kj6Var;
            case 1:
                kj6 kj6Var2 = new kj6((CoroutineContext) this.v, (Function2) obj2, rq3Var, 1);
                kj6Var2.u = obj;
                return kj6Var2;
            case 2:
                kj6 kj6Var3 = new kj6((b9j) obj2, rq3Var, 2);
                kj6Var3.u = obj;
                return kj6Var3;
            case 3:
                kj6 kj6Var4 = new kj6((Function0) obj2, rq3Var, 3);
                kj6Var4.v = obj;
                return kj6Var4;
            case 4:
                kj6 kj6Var5 = new kj6((gze) this.v, (fsf) obj2, rq3Var, 4);
                kj6Var5.u = obj;
                return kj6Var5;
            default:
                kj6 kj6Var6 = new kj6((b) this.v, (Function2) obj2, rq3Var, 5);
                kj6Var6.u = obj;
                return kj6Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.s) {
        }
        return ((kj6) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01dc, code lost:
    
        if (r7 != r0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c1, code lost:
    
        if (r6 == r0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0261, code lost:
    
        if (r0 != r8) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0274, code lost:
    
        if (r0 == r8) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02c9, code lost:
    
        if (r1 == r0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02ab, code lost:
    
        if (r5 == r0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r2 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        if (r7 != r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011c, code lost:
    
        if (r7 == r0) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0249 A[Catch: CancellationException -> 0x0230, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0230, blocks: (B:128:0x0249, B:133:0x0257, B:141:0x022c, B:143:0x0237), top: B:119:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0261 -> B:107:0x0243). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0274 -> B:107:0x0243). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x011c -> B:31:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0184 -> B:68:0x0185). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x01dc -> B:82:0x01e0). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noi noiVar;
        Object b;
        Object i;
        noi noiVar2;
        noi noiVar3;
        noi noiVar4;
        Object b2;
        noi noiVar5;
        mze mzeVar;
        Object b3;
        x4h x4hVar;
        Object invoke;
        noi noiVar6;
        Object obj2;
        Object b4;
        noi noiVar7;
        Object a;
        Object m;
        mze mzeVar2;
        mze mzeVar3;
        int i2 = this.s;
        Object obj3 = this.w;
        noi noiVar8 = "call to 'resume' before 'invoke' with coroutine";
        switch (i2) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    noiVar = (noi) this.u;
                    gze gzeVar = gze.a;
                    this.u = noiVar;
                    this.t = 1;
                    b = rti.b(noiVar, this, 1);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        i = obj;
                        if (((mze) i) != null) {
                            ((b93) obj3).invoke();
                        }
                        return Unit.a;
                    }
                    noiVar = (noi) this.u;
                    y6a.M(obj);
                    b = obj;
                }
                mze mzeVar4 = (mze) b;
                if (((String) this.v).equals("SecondaryEditable")) {
                    mzeVar4.a();
                }
                gze gzeVar2 = gze.a;
                this.u = null;
                this.t = 2;
                i = rti.i(noiVar, gzeVar2, this);
                break;
            case 1:
                CoroutineContext coroutineContext = (CoroutineContext) this.v;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.t;
                try {
                } catch (CancellationException e) {
                    if (!bea.B(coroutineContext)) {
                        throw e;
                    }
                    this.u = noiVar8;
                    this.t = 3;
                    Object r = oyn.r(noiVar8, gze.c, this);
                    noiVar8 = noiVar8;
                    break;
                }
                if (i4 == 0) {
                    y6a.M(obj);
                    noiVar3 = (noi) this.u;
                } else if (i4 == 1) {
                    noi noiVar9 = (noi) this.u;
                    y6a.M(obj);
                    noiVar2 = noiVar9;
                    this.u = noiVar2;
                    this.t = 2;
                    Object r2 = oyn.r(noiVar2, gze.c, this);
                    noiVar8 = noiVar2;
                } else if (i4 == 2) {
                    noi noiVar10 = (noi) this.u;
                    y6a.M(obj);
                    noiVar8 = noiVar10;
                    if (bea.B(coroutineContext)) {
                        return Unit.a;
                    }
                    this.u = noiVar8;
                    this.t = 1;
                    Object invoke2 = ((Function2) obj3).invoke(noiVar8, this);
                    noiVar2 = noiVar8;
                    if (invoke2 == lu3Var2) {
                        return lu3Var2;
                    }
                    this.u = noiVar2;
                    this.t = 2;
                    Object r22 = oyn.r(noiVar2, gze.c, this);
                    noiVar8 = noiVar2;
                    break;
                } else {
                    if (i4 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    noiVar3 = (noi) this.u;
                    y6a.M(obj);
                }
                noiVar8 = noiVar3;
                if (bea.B(coroutineContext)) {
                }
            case 2:
                b9j b9jVar = (b9j) obj3;
                lu3 lu3Var3 = lu3.a;
                int i5 = this.t;
                if (i5 == 0) {
                    y6a.M(obj);
                    noiVar4 = (noi) this.u;
                    this.u = noiVar4;
                    this.t = 1;
                    b2 = rti.b(noiVar4, this, 2);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mzeVar = (mze) this.v;
                        noiVar5 = (noi) this.u;
                        y6a.M(obj);
                        b3 = obj;
                        List list = ((fze) b3).a;
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            mze mzeVar5 = (mze) list.get(i6);
                            if (ufa.o(mzeVar5.a, mzeVar.a) && mzeVar5.d) {
                                this.u = noiVar5;
                                this.v = mzeVar;
                                this.t = 2;
                                b3 = noiVar5.b(gze.b, this);
                                break;
                            }
                        }
                        b9jVar.c();
                        return Unit.a;
                    }
                    noiVar4 = (noi) this.u;
                    y6a.M(obj);
                    b2 = obj;
                }
                mze mzeVar6 = (mze) b2;
                long j = mzeVar6.c;
                b9jVar.b();
                noiVar5 = noiVar4;
                mzeVar = mzeVar6;
                this.u = noiVar5;
                this.v = mzeVar;
                this.t = 2;
                b3 = noiVar5.b(gze.b, this);
                break;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.t;
                if (i7 == 0) {
                    y6a.M(obj);
                    x4hVar = (x4h) this.v;
                    invoke = ((Function0) obj3).invoke();
                    if (invoke != null) {
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj4 = this.u;
                    x4hVar = (x4h) this.v;
                    y6a.M(obj);
                    if (obj4 == null) {
                        return Unit.a;
                    }
                    invoke = ((Function0) obj3).invoke();
                    if (invoke != null) {
                        this.v = x4hVar;
                        this.u = invoke;
                        this.t = 1;
                        x4hVar.d(this, invoke);
                        lu3 lu3Var5 = lu3.a;
                        return lu3Var4;
                    }
                    obj4 = null;
                    if (obj4 == null) {
                    }
                    invoke = ((Function0) obj3).invoke();
                    if (invoke != null) {
                    }
                }
            case 4:
                fsf fsfVar = (fsf) obj3;
                lu3 lu3Var6 = lu3.a;
                int i8 = this.t;
                xjb xjbVar = xjb.a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        noiVar6 = (noi) this.u;
                        y6a.M(obj);
                        obj2 = obj;
                        fze fzeVar = (fze) obj2;
                        List list2 = fzeVar.a;
                        int size2 = list2.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size2) {
                                fsfVar.a = new yjb((mze) list2.get(0));
                            } else if (qea.m((mze) list2.get(i9))) {
                                i9++;
                            } else if (fzeVar.c != 2) {
                                int size3 = list2.size();
                                for (int i10 = 0; i10 < size3; i10++) {
                                    mze mzeVar7 = (mze) list2.get(i10);
                                    if (mzeVar7.b() || qea.z(mzeVar7, noiVar6.f.x, noiVar6.d())) {
                                        fsfVar.a = xjbVar;
                                    }
                                }
                                gze gzeVar3 = gze.c;
                                this.u = noiVar6;
                                this.t = 2;
                                b4 = noiVar6.b(gzeVar3, this);
                                break;
                            } else {
                                fsfVar.a = zjb.a;
                            }
                        }
                        return lu3Var6;
                    }
                    if (i8 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    noiVar6 = (noi) this.u;
                    y6a.M(obj);
                    b4 = obj;
                    List list3 = ((fze) b4).a;
                    int size4 = list3.size();
                    for (int i11 = 0; i11 < size4; i11++) {
                        if (((mze) list3.get(i11)).b()) {
                            fsfVar.a = xjbVar;
                            return Unit.a;
                        }
                    }
                    gze gzeVar4 = (gze) this.v;
                    this.u = noiVar6;
                    this.t = 1;
                    obj2 = noiVar6.b(gzeVar4, this);
                    break;
                } else {
                    y6a.M(obj);
                    noiVar6 = (noi) this.u;
                    gze gzeVar42 = (gze) this.v;
                    this.u = noiVar6;
                    this.t = 1;
                    obj2 = noiVar6.b(gzeVar42, this);
                }
                break;
            default:
                lu3 lu3Var7 = lu3.a;
                int i12 = this.t;
                if (i12 == 0) {
                    y6a.M(obj);
                    noiVar7 = (noi) this.u;
                    this.u = noiVar7;
                    this.t = 1;
                    xf2 xf2Var = rti.a;
                    a = rti.a(noiVar7, false, gze.b, this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mzeVar2 = (mze) this.u;
                        y6a.M(obj);
                        m = obj;
                        mzeVar3 = (mze) m;
                        b bVar = (b) this.v;
                        j2d j2dVar = bVar.d;
                        if (mzeVar3 != null) {
                            bVar.c = true;
                            j2dVar.f(null);
                        } else {
                            bVar.b = true;
                            j2dVar.f(null);
                            ((Function2) obj3).invoke(new dnd(mzeVar2.c), new dnd(mzeVar3.c));
                        }
                        return Unit.a;
                    }
                    noi noiVar11 = (noi) this.u;
                    y6a.M(obj);
                    noiVar7 = noiVar11;
                    a = obj;
                }
                mze mzeVar8 = (mze) a;
                if (mzeVar8.d != mzeVar8.h) {
                    mzeVar8.a();
                }
                this.u = mzeVar8;
                this.t = 2;
                m = n.m(noiVar7, this);
                if (m != lu3Var7) {
                    mzeVar2 = mzeVar8;
                    mzeVar3 = (mze) m;
                    b bVar2 = (b) this.v;
                    j2d j2dVar2 = bVar2.d;
                    if (mzeVar3 != null) {
                    }
                    return Unit.a;
                }
                return lu3Var7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj6(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.s = i;
        this.w = obj;
    }
}
