package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class atc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q50 b;

    public /* synthetic */ atc(q50 q50Var, int i) {
        this.a = i;
        this.b = q50Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        q50 q50Var = this.b;
        f4g f4gVar = (f4g) obj;
        switch (i) {
            case 0:
                float floatValue = ((Number) q50Var.d()).floatValue();
                float e = ctc.e(f4gVar, floatValue);
                float f = ctc.f(f4gVar, floatValue);
                f4gVar.l(f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f : e / f);
                f4gVar.s(ctc.a);
                break;
            case 1:
                f4gVar.getClass();
                f4gVar.b(((Number) q50Var.d()).floatValue());
                f4gVar.e(1);
                break;
            default:
                f4gVar.getClass();
                f4gVar.b(((Number) q50Var.d()).floatValue());
                break;
        }
        return Unit.a;
    }
}
