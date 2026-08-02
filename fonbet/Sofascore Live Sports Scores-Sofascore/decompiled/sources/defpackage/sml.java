package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sml extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ a t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sml(a aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        sml smlVar = new sml(this.t, rq3Var);
        smlVar.s = obj;
        return smlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        sml smlVar = new sml(this.t, (rq3) obj2);
        smlVar.s = (e0m) obj;
        return smlVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r1.H(r6, r2, r8) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r1.B(r6, r2, r8) == r0) goto L27;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            e0m e0mVar = (e0m) this.s;
            int i2 = a.I;
            a aVar = this.t;
            if (!aVar.J()) {
                return Unit.a;
            }
            dxm dxmVar = aVar.q;
            if (e0mVar instanceof cwl) {
                lzm lzmVar = aVar.r;
                if (lzmVar != null) {
                    int currentItem = dxmVar.e.getCurrentItem();
                    long j = ((cwl) e0mVar).a;
                    this.s = dxmVar;
                    this.r = 1;
                }
            } else {
                if (!(e0mVar instanceof esl)) {
                    zzl.b();
                    return null;
                }
                lzm lzmVar2 = aVar.r;
                if (lzmVar2 != null) {
                    int currentItem2 = dxmVar.e.getCurrentItem();
                    long j2 = ((esl) e0mVar).a;
                    this.s = dxmVar;
                    this.r = 2;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
