package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b7d extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float t;
    public final /* synthetic */ o0h u;
    public final /* synthetic */ trg v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7d(float f, float f2, o0h o0hVar, trg trgVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = f;
        this.t = f2;
        this.u = o0hVar;
        this.v = trgVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new b7d(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b7d) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r2.b0(r7.v, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r2.X(r3, ((defpackage.eoh) r2.c).getValue(), r7) == r0) goto L20;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        o0h o0hVar = this.u;
        float f = this.s;
        float f2 = this.t;
        if (i == 0) {
            y6a.M(obj);
            if (f != f2) {
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
        if (f == f2) {
            this.r = 2;
        }
        return Unit.a;
    }
}
