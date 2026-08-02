package defpackage;

import com.sofascore.model.firebase.AdType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g11 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ u11 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g11(u11 u11Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = u11Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new g11(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g11) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (defpackage.rd0.z(r9, r1, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        if (defpackage.n4o.y(r6, r8) == r0) goto L15;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        rq3 rq3Var = null;
        int i2 = 1;
        u11 u11Var = this.s;
        int i3 = 2;
        if (i == 0) {
            y6a.M(obj);
            long j = u11Var.F;
            this.r = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                AdType.Banner banner = u11Var.t;
                if (banner != null) {
                    u11Var.j(banner);
                }
                return Unit.a;
            }
            y6a.M(obj);
        }
        jof c = u11Var.c.getLifecycle().c();
        d11 d11Var = new d11(i3, rq3Var, i2);
        this.r = 2;
    }
}
