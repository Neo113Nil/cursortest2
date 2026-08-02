package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p59 extends hoi implements Function2 {
    public a r;
    public dxm s;
    public long t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ a w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p59(a aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        p59 p59Var = new p59(this.w, rq3Var);
        p59Var.v = obj;
        return p59Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        p59 p59Var = new p59(this.w, (rq3) obj2);
        p59Var.v = (Pair) obj;
        return p59Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        if (r0.u(r1, r2, r6, r14) == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r0.t(r4, r2, r10, r14) == r7) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        a aVar;
        dxm dxmVar;
        dxm dxmVar2;
        lzm lzmVar;
        lu3 lu3Var = lu3.a;
        int i = this.u;
        if (i == 0) {
            y6a.M(obj);
            Pair pair = (Pair) this.v;
            longValue = ((Number) pair.a).longValue();
            long longValue2 = ((Number) pair.b).longValue();
            aVar = this.w;
            dxmVar = aVar.q;
            if (aVar.J()) {
                lzm lzmVar2 = aVar.r;
                if (lzmVar2 != null) {
                    int currentItem = dxmVar.e.getCurrentItem();
                    this.v = dxmVar;
                    this.r = aVar;
                    this.s = dxmVar;
                    this.t = longValue;
                    this.u = 1;
                }
                dxmVar2 = dxmVar;
                lzmVar = aVar.r;
                if (lzmVar != null) {
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            return Unit.a;
        }
        long j = this.t;
        dxm dxmVar3 = this.s;
        a aVar2 = this.r;
        dxmVar2 = (dxm) this.v;
        y6a.M(obj);
        dxmVar = dxmVar3;
        aVar = aVar2;
        longValue = j;
        lzmVar = aVar.r;
        if (lzmVar != null) {
            int currentItem2 = dxmVar.e.getCurrentItem();
            boolean L = ((w3m) aVar.getViewModel()).L();
            this.v = dxmVar2;
            this.r = null;
            this.s = null;
            this.u = 2;
        }
        return Unit.a;
    }
}
