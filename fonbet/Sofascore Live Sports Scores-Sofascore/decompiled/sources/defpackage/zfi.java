package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zfi extends hoi implements Function2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ q50 B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ ig5 D;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ q50 t;
    public final /* synthetic */ float u;
    public final /* synthetic */ q50 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ q50 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ q50 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfi(q50 q50Var, float f, q50 q50Var2, float f2, q50 q50Var3, float f3, q50 q50Var4, float f4, q50 q50Var5, Function0 function0, ig5 ig5Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = q50Var;
        this.u = f;
        this.v = q50Var2;
        this.w = f2;
        this.x = q50Var3;
        this.y = f3;
        this.z = q50Var4;
        this.A = f4;
        this.B = q50Var5;
        this.C = function0;
        this.D = ig5Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        zfi zfiVar = new zfi(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, rq3Var);
        zfiVar.s = obj;
        return zfiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zfi) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var = (ku3) this.s;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            int m = tba.m(((Number) this.t.d()).floatValue(), this.u, 0.1f, 2000);
            int m2 = tba.m(((Number) this.v.d()).floatValue(), this.w, 0.1f, 2000);
            int m3 = tba.m(((Number) this.x.d()).floatValue(), this.y, 0.1f, 2000);
            int m4 = tba.m(((Number) this.z.d()).floatValue(), this.A, 1.0f, 2000);
            q50 q50Var = this.B;
            int m5 = tba.m(((Number) q50Var.d()).floatValue(), 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 950);
            if (m > 0) {
                xw3.L(ku3Var, null, null, new yfi(this.t, this.u, m, this.D, null, 0), 3);
            }
            if (m2 > 0) {
                xw3.L(ku3Var, null, null, new yfi(this.v, this.w, m2, this.D, null, 1), 3);
            }
            if (m3 > 0) {
                xw3.L(ku3Var, null, null, new yfi(this.x, this.y, m3, this.D, null, 2), 3);
            }
            if (m5 > 0) {
                xw3.L(ku3Var, null, null, new bce(q50Var, m5, null, 4), 3);
            }
            if (m4 > 0) {
                g9i L = xw3.L(ku3Var, null, null, new yfi(this.z, this.A, m4, this.D, null, 3), 3);
                this.s = null;
                this.r = 1;
                if (L.Z(this) == lu3Var) {
                    return lu3Var;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        this.C.invoke();
        return Unit.a;
    }
}
