package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cgi extends hoi implements Function2 {
    public final /* synthetic */ q50 A;
    public final /* synthetic */ q50 B;
    public final /* synthetic */ q50 C;
    public final /* synthetic */ q50 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ h74 F;
    public final /* synthetic */ q50 G;
    public final /* synthetic */ q50 H;
    public final /* synthetic */ h74 I;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ q50 t;
    public final /* synthetic */ float u;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;
    public final /* synthetic */ float y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgi(q50 q50Var, float f, float f2, float f3, float f4, float f5, float f6, q50 q50Var2, q50 q50Var3, q50 q50Var4, q50 q50Var5, Function0 function0, h74 h74Var, q50 q50Var6, q50 q50Var7, h74 h74Var2, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = q50Var;
        this.u = f;
        this.v = f2;
        this.w = f3;
        this.x = f4;
        this.y = f5;
        this.z = f6;
        this.A = q50Var2;
        this.B = q50Var3;
        this.C = q50Var4;
        this.D = q50Var5;
        this.E = function0;
        this.F = h74Var;
        this.G = q50Var6;
        this.H = q50Var7;
        this.I = h74Var2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        cgi cgiVar = new cgi(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, rq3Var);
        cgiVar.s = obj;
        return cgiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cgi) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.coroutines.CoroutineContext, nu3] */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlin.coroutines.CoroutineContext, nu3] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.coroutines.CoroutineContext, nu3] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        q50 q50Var;
        int i;
        ?? r3;
        h74 h74Var;
        h74 h74Var2;
        h74 h74Var3;
        rq3 rq3Var;
        ku3 ku3Var = (ku3) this.s;
        lu3 lu3Var = lu3.a;
        int i2 = this.r;
        Function0 function0 = this.E;
        if (i2 == 0) {
            y6a.M(obj);
            q50 q50Var2 = this.t;
            int m = tba.m(((Number) q50Var2.d()).floatValue(), this.u, this.v, 2600);
            float floatValue = ((Number) q50Var2.d()).floatValue();
            float f = this.w;
            float f2 = this.x;
            int m2 = tba.m(floatValue, f, f2, 2600);
            float floatValue2 = ((Number) q50Var2.d()).floatValue();
            float f3 = this.y;
            float f4 = this.z;
            int m3 = tba.m(floatValue2, f3, f4, 2600);
            q50 q50Var3 = this.A;
            int m4 = tba.m(((Number) q50Var3.d()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1000);
            int m5 = tba.m(((Number) this.B.d()).floatValue(), f2, 0.1f, 2600);
            int m6 = tba.m(((Number) this.C.d()).floatValue(), f4, 0.1f, 2600);
            q50 q50Var4 = this.D;
            int m7 = tba.m(((Number) q50Var4.d()).floatValue(), 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1000);
            h74 h74Var4 = this.F;
            if (m > 0) {
                q50Var = q50Var3;
                i = 3;
                r3 = 0;
                h74Var = h74Var4;
                xw3.L(ku3Var, null, null, new agi(this.t, this.u, m, h74Var4, null, 0), 3);
            } else {
                q50Var = q50Var3;
                i = 3;
                r3 = 0;
                h74Var = h74Var4;
            }
            if (m2 > 0) {
                xw3.L(ku3Var, r3, r3, new agi(this.G, this.w, m2, h74Var, null, 1), i);
            }
            if (m3 > 0) {
                h74 h74Var5 = h74Var;
                h74Var2 = h74Var5;
                xw3.L(ku3Var, r3, r3, new agi(this.H, this.y, m3, h74Var5, null, 2), i);
            } else {
                h74Var2 = h74Var;
            }
            h74 h74Var6 = this.I;
            if (m4 > 0) {
                rq3 rq3Var2 = r3;
                bgi bgiVar = new bgi(q50Var, m4, h74Var6, rq3Var2, 0);
                h74Var3 = h74Var6;
                ?? r10 = rq3Var2;
                xw3.L(ku3Var, r10, r10, bgiVar, i);
                rq3Var = r10;
            } else {
                h74Var3 = h74Var6;
                rq3Var = r3;
            }
            if (m6 > 0) {
                xw3.L(ku3Var, rq3Var, rq3Var, new agi(this.C, this.z, m6, h74Var2, null, 3), i);
            }
            if (m7 > 0) {
                xw3.L(ku3Var, rq3Var, rq3Var, new bgi(q50Var4, m7, h74Var3, rq3Var, 1), i);
            }
            if (m5 <= 0) {
                function0.invoke();
                return Unit.a;
            }
            g9i L = xw3.L(ku3Var, rq3Var, rq3Var, new agi(this.B, this.x, m5, h74Var2, null, 4), i);
            this.s = rq3Var;
            this.r = 1;
            if (L.Z(this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i2 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        function0.invoke();
        return Unit.a;
    }
}
