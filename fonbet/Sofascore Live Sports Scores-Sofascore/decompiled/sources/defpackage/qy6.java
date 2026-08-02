package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qy6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;

    public /* synthetic */ qy6(double d, int i) {
        this.a = i;
        this.b = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        double d = this.b;
        switch (i) {
            case 0:
                kl3 kl3Var = (kl3) obj;
                kl3Var.getClass();
                rl3 rl3Var = kl3Var.e;
                ll3 ll3Var = kl3Var.c;
                rl3.c(rl3Var, ll3Var.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var.d, ll3Var.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var.f, ll3Var.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var.g, ll3Var.g, (float) (2.0d * d), 4);
                break;
            default:
                kl3 kl3Var2 = (kl3) obj;
                kl3Var2.getClass();
                rl3 rl3Var2 = kl3Var2.e;
                ll3 ll3Var2 = kl3Var2.c;
                rl3.c(rl3Var2, ll3Var2.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var2.d, ll3Var2.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var2.f, ll3Var2.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var2.g, ll3Var2.g, (float) (2.0d * d), 4);
                break;
        }
        return Unit.a;
    }
}
