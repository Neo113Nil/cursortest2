package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dgi extends hoi implements Function2 {
    public final /* synthetic */ q50 A;
    public final /* synthetic */ q50 B;
    public final /* synthetic */ q50 C;
    public final /* synthetic */ q50 D;
    public final /* synthetic */ q50 E;
    public final /* synthetic */ q50 F;
    public final /* synthetic */ q50 G;
    public final /* synthetic */ float H;
    public final /* synthetic */ float I;
    public final /* synthetic */ Function0 J;
    public int r;
    public final /* synthetic */ hth s;
    public final /* synthetic */ tfi t;
    public final /* synthetic */ tfi u;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;
    public final /* synthetic */ q50 x;
    public final /* synthetic */ q50 y;
    public final /* synthetic */ q50 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgi(hth hthVar, tfi tfiVar, tfi tfiVar2, float f, float f2, q50 q50Var, q50 q50Var2, q50 q50Var3, q50 q50Var4, q50 q50Var5, q50 q50Var6, q50 q50Var7, q50 q50Var8, q50 q50Var9, q50 q50Var10, float f3, float f4, Function0 function0, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = hthVar;
        this.t = tfiVar;
        this.u = tfiVar2;
        this.v = f;
        this.w = f2;
        this.x = q50Var;
        this.y = q50Var2;
        this.z = q50Var3;
        this.A = q50Var4;
        this.B = q50Var5;
        this.C = q50Var6;
        this.D = q50Var7;
        this.E = q50Var8;
        this.F = q50Var9;
        this.G = q50Var10;
        this.H = f3;
        this.I = f4;
        this.J = function0;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new dgi(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dgi) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (defpackage.s9a.r(r8, r22) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (defpackage.s9a.r(r6, r22) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (defpackage.s9a.r(r6, r22) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
    
        if (defpackage.s9a.r(r4, r22) == r1) goto L41;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return Unit.a;
            }
            if (i == 2) {
                y6a.M(obj);
                return Unit.a;
            }
            if (i == 3 || i == 4) {
                y6a.M(obj);
                return Unit.a;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        hth hthVar = this.s;
        if (hthVar.e) {
            wfi wfiVar = new wfi(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, null);
            this.r = 1;
        } else if (hthVar.f) {
            tfi tfiVar = this.t;
            if (!(tfiVar instanceof eaa)) {
                if (tfiVar instanceof n2k) {
                    tfi tfiVar2 = this.u;
                    if ((tfiVar2 instanceof n2k) && !Intrinsics.c(((n2k) tfiVar).f(), ((n2k) tfiVar2).f())) {
                        h74 h74Var = new h74(0.48f, 0.16f, 0.49f, 1.0f);
                        h74 h74Var2 = new h74(0.42f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f);
                        float max = 4.0f * Math.max(this.v, this.w);
                        float f = this.w;
                        float f2 = this.v;
                        q50 q50Var = this.C;
                        cgi cgiVar = new cgi(this.A, max, this.H, f * 8.0f, f, f2 * 8.0f, f2, this.D, this.E, this.F, this.G, this.J, h74Var, this.B, q50Var, h74Var2, null);
                        this.r = 4;
                    }
                }
                return Unit.a;
            }
            h74 h74Var3 = jg5.a;
            zfi zfiVar = new zfi(this.y, this.H, this.E, this.w, this.F, this.v, this.x, this.I, this.z, this.J, h74Var3, null);
            this.r = 3;
        } else {
            xfi xfiVar = new xfi(this.x, this.y, this.z, this.A, this.H, this.B, this.C, this.D, this.E, this.F, this.G, null);
            this.r = 2;
        }
        return lu3Var;
    }
}
