package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gpl extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ a s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpl(a aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new gpl(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new gpl(this.s, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r6.J(r1, r5) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r6.F(r1, r5) == r0) goto L23;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        a aVar = this.s;
        if (i == 0) {
            y6a.M(obj);
            int i2 = a.I;
            if (!aVar.J()) {
                return Unit.a;
            }
            lzm lzmVar = aVar.r;
            if (lzmVar != null) {
                int currentItem = aVar.q.e.getCurrentItem();
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
        lzm lzmVar2 = aVar.r;
        if (lzmVar2 != null) {
            int currentItem2 = aVar.q.e.getCurrentItem();
            this.r = 2;
        }
        return Unit.a;
    }
}
