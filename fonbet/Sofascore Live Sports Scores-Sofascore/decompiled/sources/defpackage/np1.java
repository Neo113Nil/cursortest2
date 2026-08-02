package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class np1 extends m2g implements Function2 {
    public f1d s;
    public gze t;
    public long u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ku3 x;
    public final /* synthetic */ ykj y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np1(ku3 ku3Var, ykj ykjVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = ku3Var;
        this.y = ykjVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        np1 np1Var = new np1(this.x, this.y, rq3Var);
        np1Var.w = obj;
        return np1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((np1) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #3 {all -> 0x0019, blocks: (B:9:0x0014, B:10:0x00c3, B:12:0x00c7), top: B:8:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [f1d] */
    /* JADX WARN: Type inference failed for: r8v3, types: [f1d] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f1d f1dVar;
        gze gzeVar;
        long j;
        noi noiVar;
        fdi fdiVar;
        ?? r2;
        mze mzeVar;
        lu3 lu3Var = lu3.a;
        ?? r1 = this.v;
        int i = 1;
        rq3 rq3Var = null;
        try {
            if (r1 == 0) {
                y6a.M(obj);
                noi noiVar2 = (noi) this.w;
                fdi a = gdi.a(Boolean.FALSE);
                long b = noiVar2.e().b();
                gzeVar = gze.a;
                this.w = noiVar2;
                this.s = a;
                this.t = gzeVar;
                this.u = b;
                this.v = 1;
                Object b2 = rti.b(noiVar2, this, 1);
                if (b2 != lu3Var) {
                    j = b;
                    noiVar = noiVar2;
                    obj = b2;
                    fdiVar = a;
                }
                return lu3Var;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    if (r1 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f1dVar = (f1d) this.w;
                    try {
                        y6a.M(obj);
                        mzeVar = (mze) obj;
                        if (mzeVar != null) {
                            mzeVar.a();
                        }
                        Boolean bool = Boolean.FALSE;
                        fdi fdiVar2 = (fdi) f1dVar;
                        fdiVar2.getClass();
                        fdiVar2.m(null, bool);
                        return Unit.a;
                    } catch (Throwable th) {
                        th = th;
                        Boolean bool2 = Boolean.FALSE;
                        fdi fdiVar3 = (fdi) f1dVar;
                        fdiVar3.getClass();
                        fdiVar3.m(null, bool2);
                        throw th;
                    }
                }
                gze gzeVar2 = this.t;
                r2 = this.s;
                noiVar = (noi) this.w;
                try {
                    y6a.M(obj);
                    Boolean bool3 = Boolean.FALSE;
                    fdi fdiVar4 = (fdi) r2;
                    fdiVar4.getClass();
                    fdiVar4.m(null, bool3);
                } catch (hze unused) {
                    gzeVar = gzeVar2;
                    fdiVar = r2;
                    xw3.L(this.x, null, nu3.d, new g2(fdiVar, this.y, rq3Var, 15), 1);
                    this.w = fdiVar;
                    this.s = null;
                    this.t = null;
                    this.v = 3;
                    obj = rti.i(noiVar, gzeVar, this);
                    r1 = fdiVar;
                    if (obj != lu3Var) {
                    }
                    return lu3Var;
                } catch (Throwable th2) {
                    th = th2;
                    f1dVar = r2;
                    Boolean bool22 = Boolean.FALSE;
                    fdi fdiVar32 = (fdi) f1dVar;
                    fdiVar32.getClass();
                    fdiVar32.m(null, bool22);
                    throw th;
                }
                return Unit.a;
            }
            long j2 = this.u;
            gze gzeVar3 = this.t;
            ?? r8 = this.s;
            noi noiVar3 = (noi) this.w;
            y6a.M(obj);
            gzeVar = gzeVar3;
            fdiVar = r8;
            j = j2;
            noiVar = noiVar3;
            long j3 = j;
            int i2 = ((mze) obj).i;
            if (i2 == 1 || i2 == 3) {
                try {
                    l00 l00Var = new l00(gzeVar, rq3Var, i);
                    this.w = noiVar;
                    this.s = fdiVar;
                    this.t = gzeVar;
                    this.v = 2;
                    r1 = fdiVar;
                    if (noiVar.f(j3, l00Var, this) != lu3Var) {
                        r2 = fdiVar;
                        Boolean bool32 = Boolean.FALSE;
                        fdi fdiVar42 = (fdi) r2;
                        fdiVar42.getClass();
                        fdiVar42.m(null, bool32);
                    }
                } catch (hze unused2) {
                    xw3.L(this.x, null, nu3.d, new g2(fdiVar, this.y, rq3Var, 15), 1);
                    this.w = fdiVar;
                    this.s = null;
                    this.t = null;
                    this.v = 3;
                    obj = rti.i(noiVar, gzeVar, this);
                    r1 = fdiVar;
                    if (obj != lu3Var) {
                        f1dVar = fdiVar;
                        mzeVar = (mze) obj;
                        if (mzeVar != null) {
                        }
                        Boolean bool4 = Boolean.FALSE;
                        fdi fdiVar22 = (fdi) f1dVar;
                        fdiVar22.getClass();
                        fdiVar22.m(null, bool4);
                        return Unit.a;
                    }
                    return lu3Var;
                }
                return lu3Var;
            }
            return Unit.a;
        } catch (Throwable th3) {
            th = th3;
            f1dVar = r1;
        }
    }
}
