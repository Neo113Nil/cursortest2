package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n59 extends hoi implements Function1 {
    public int r;
    public int s;
    public final /* synthetic */ syl t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n59(syl sylVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.t = sylVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new n59(this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new n59(this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r6.B(r1, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r6.z(r1, r5) == r0) goto L19;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int currentItem;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        syl sylVar = this.t;
        if (i == 0) {
            y6a.M(obj);
            currentItem = sylVar.q.j.getCurrentItem();
            mpm mpmVar = sylVar.t;
            if (mpmVar != null) {
                this.r = currentItem;
                this.s = 1;
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
            currentItem = this.r;
            y6a.M(obj);
        }
        mpm mpmVar2 = sylVar.t;
        if (mpmVar2 != null) {
            this.s = 2;
        }
        return Unit.a;
    }
}
