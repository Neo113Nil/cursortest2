package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wa4 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ syl s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa4(syl sylVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = sylVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new wa4(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new wa4(this.s, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r6.B(r1, r5) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r6.z(r1, r5) == r0) goto L23;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        syl sylVar = this.s;
        if (i == 0) {
            y6a.M(obj);
            int i2 = syl.C;
            if (!sylVar.H()) {
                return Unit.a;
            }
            mpm mpmVar = sylVar.t;
            if (mpmVar != null) {
                int currentItem = sylVar.q.j.getCurrentItem();
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
        mpm mpmVar2 = sylVar.t;
        if (mpmVar2 != null) {
            int currentItem2 = sylVar.q.j.getCurrentItem();
            this.r = 2;
        }
        return Unit.a;
    }
}
