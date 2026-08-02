package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y40 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ b50 t;
    public final /* synthetic */ long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y40(boolean z, b50 b50Var, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = z;
        this.t = b50Var;
        this.u = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new y40(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y40) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r11 == r0) goto L18;
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
            h9d h9dVar = this.t.a;
            if (this.s) {
                this.r = 2;
                obj = h9dVar.a(this.u, 0L, this);
            } else {
                this.r = 1;
                obj = h9dVar.a(0L, this.u, this);
            }
            return lu3Var;
        }
        if (i == 1) {
            y6a.M(obj);
            long j = ((vmk) obj).a;
        } else {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            long j2 = ((vmk) obj).a;
        }
        return Unit.a;
    }
}
