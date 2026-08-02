package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class s81 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ s81(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = this.b;
        switch (i) {
            case 0:
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                f4gVar.b(1.0f - f);
                return Unit.a;
            case 1:
                f4g f4gVar2 = (f4g) obj;
                f4gVar2.getClass();
                f4gVar2.b(1.0f - f);
                return Unit.a;
            case 2:
                f4g f4gVar3 = (f4g) obj;
                f4gVar3.getClass();
                f4gVar3.b(f);
                return Unit.a;
            case 3:
                f4g f4gVar4 = (f4g) obj;
                f4gVar4.getClass();
                f4gVar4.b(f);
                f4gVar4.y(f4gVar4.s.j() * 8.0f);
                return Unit.a;
            case 4:
                f4g f4gVar5 = (f4g) obj;
                f4gVar5.getClass();
                f4gVar5.w(f);
                return Unit.a;
            case 5:
                f4g f4gVar6 = (f4g) obj;
                f4gVar6.getClass();
                f4gVar6.b(f);
                return Unit.a;
            case 6:
                f4g f4gVar7 = (f4g) obj;
                f4gVar7.getClass();
                f4gVar7.b(f);
                return Unit.a;
            case 7:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                ha5.g0(ha5Var, wxf.E(b.j(new r13(r13.c(r13.b, 0.12f)), new r13(r13.h)), Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)), Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) + ha5Var.H0(f), 8), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() >> 32))) << 32) | (Float.floatToRawIntBits(r10) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                return Unit.a;
            case 8:
                f4g f4gVar8 = (f4g) obj;
                f4gVar8.getClass();
                f4gVar8.k(f);
                f4gVar8.l(f);
                return Unit.a;
            default:
                ((Float) obj).floatValue();
                double d = f;
                return Boolean.valueOf(0.0d <= d && d <= 1.0d && !ph0.v(new Float[]{Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Float.valueOf(1.0f)}, Float.valueOf(f)));
        }
    }
}
