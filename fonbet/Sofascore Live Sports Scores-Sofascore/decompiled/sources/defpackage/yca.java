package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yca extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ obm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yca(obm obmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = obmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new yca(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new yca(this.s, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r6.D(r1, r5) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r6.A(r1, r5) == r0) goto L23;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        obm obmVar = this.s;
        if (i == 0) {
            y6a.M(obj);
            int i2 = obm.D;
            if (!obmVar.G()) {
                return Unit.a;
            }
            urm urmVar = obmVar.r;
            if (urmVar != null) {
                int currentItem = obmVar.q.e.getCurrentItem();
                this.r = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        urm urmVar2 = obmVar.r;
        if (urmVar2 != null) {
            int currentItem2 = obmVar.q.e.getCurrentItem();
            this.r = 2;
        }
        return Unit.a;
    }
}
