package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ev5 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float t;
    public final /* synthetic */ kx4 u;
    public final /* synthetic */ qug v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ gv9 x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev5(float f, float f2, kx4 kx4Var, qug qugVar, Function1 function1, gv9 gv9Var, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = f;
        this.t = f2;
        this.u = kx4Var;
        this.v = qugVar;
        this.w = function1;
        this.x = gv9Var;
        this.y = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ev5(this.s, this.t, this.u, this.v, this.w, this.x, this.y, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ev5) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        if (r5.f(r13, r14, r11) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003f, code lost:
    
        if (defpackage.d2a.m(r7, r8, r9, r10, r11, 4) == r0) goto L32;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ev5 ev5Var;
        kx4 kx4Var;
        float f;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            float f2 = this.s;
            float f3 = this.t;
            if (f2 > f3) {
                i4k h0 = s02.h0(300, 0, null, 6);
                o34 o34Var = new o34(3, this.w);
                this.r = 1;
                ev5Var = this;
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
        ev5Var = this;
        gv9 gv9Var = ev5Var.x;
        int i2 = ev5Var.y;
        Iterator it = CollectionsKt.L0(gv9Var, i2).iterator();
        double d = 0.0d;
        while (true) {
            boolean hasNext = it.hasNext();
            kx4Var = ev5Var.u;
            if (!hasNext) {
                break;
            }
            if (((w12) it.next()).b) {
                r9 = 40.0f;
            }
            d += kx4Var.H0(r9);
        }
        float f4 = (float) d;
        w12 w12Var = (w12) CollectionsKt.a0(i2, gv9Var);
        if (w12Var != null) {
            f = kx4Var.H0(w12Var.b ? 40.0f : 32.0f);
        } else {
            f = 0.0f;
        }
        qug qugVar = ev5Var.v;
        int b = (int) llf.b(f4 - ((qugVar.b.h() / 2.0f) - (f / 2.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, qugVar.e.h());
        i4k h02 = s02.h0(500, 0, null, 6);
        ev5Var.r = 2;
    }
}
