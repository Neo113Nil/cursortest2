package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j0n extends hoi implements Function2 {
    public obm r;
    public orm s;
    public long t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ obm w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0n(obm obmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = obmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        j0n j0nVar = new j0n(this.w, rq3Var);
        j0nVar.v = obj;
        return j0nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        j0n j0nVar = new j0n(this.w, (rq3) obj2);
        j0nVar.v = (Pair) obj;
        return j0nVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c9, code lost:
    
        if (r13.x(r4, r14, r12) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cb, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (r13.z(r9, r8, r12) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        if (r6.t(r7, r8, r10, r12) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        obm obmVar;
        orm ormVar;
        j0n j0nVar;
        orm ormVar2;
        long j;
        urm urmVar;
        long j2;
        obm obmVar2;
        urm urmVar2;
        lu3 lu3Var = lu3.a;
        int i = this.u;
        if (i == 0) {
            y6a.M(obj);
            Pair pair = (Pair) this.v;
            long longValue = ((Number) pair.a).longValue();
            long longValue2 = ((Number) pair.b).longValue();
            obmVar = this.w;
            ormVar = obmVar.q;
            if (obmVar.G()) {
                urm urmVar3 = obmVar.r;
                if (urmVar3 != null) {
                    int currentItem = ormVar.e.getCurrentItem();
                    this.v = ormVar;
                    this.r = obmVar;
                    this.s = ormVar;
                    this.t = longValue;
                    this.u = 1;
                    j0nVar = this;
                } else {
                    j0nVar = this;
                }
                ormVar2 = ormVar;
                j = longValue;
                urmVar = obmVar.r;
                if (urmVar != null) {
                }
                j2 = j;
                obmVar2 = obmVar;
                urmVar2 = obmVar2.r;
                if (urmVar2 != null) {
                }
            }
        } else if (i == 1) {
            j = this.t;
            ormVar = this.s;
            obm obmVar3 = this.r;
            orm ormVar3 = (orm) this.v;
            y6a.M(obj);
            j0nVar = this;
            obmVar = obmVar3;
            ormVar2 = ormVar3;
            urmVar = obmVar.r;
            if (urmVar != null) {
                int currentItem2 = ormVar.e.getCurrentItem();
                Boolean bool = (Boolean) ((ilm) obmVar.getViewModel()).H.d();
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                j0nVar.v = ormVar2;
                j0nVar.r = obmVar;
                j0nVar.s = ormVar;
                j0nVar.t = j;
                j0nVar.u = 2;
            }
            j2 = j;
            obmVar2 = obmVar;
            urmVar2 = obmVar2.r;
            if (urmVar2 != null) {
            }
        } else if (i == 2) {
            j2 = this.t;
            ormVar = this.s;
            obmVar2 = this.r;
            ormVar2 = (orm) this.v;
            y6a.M(obj);
            j0nVar = this;
            urmVar2 = obmVar2.r;
            if (urmVar2 != null) {
                int currentItem3 = ormVar.e.getCurrentItem();
                j0nVar.v = ormVar2;
                j0nVar.r = null;
                j0nVar.s = null;
                j0nVar.u = 3;
            }
        } else {
            if (i != 3) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
