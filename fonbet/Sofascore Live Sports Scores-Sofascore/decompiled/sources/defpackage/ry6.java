package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ry6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll3 b;
    public final /* synthetic */ double c;

    public /* synthetic */ ry6(ll3 ll3Var, double d, int i) {
        this.a = i;
        this.b = ll3Var;
        this.c = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        double d = this.c;
        ll3 ll3Var = this.b;
        switch (i) {
            case 0:
                kl3 kl3Var = (kl3) obj;
                kl3Var.getClass();
                rl3.c(kl3Var.e, ll3Var.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var.f, ll3Var.d, (float) ((-4.0d) * d), 4);
                break;
            case 1:
                kl3 kl3Var2 = (kl3) obj;
                kl3Var2.getClass();
                rl3.c(kl3Var2.g, ll3Var.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var2.f, ll3Var.d, (float) ((-4.0d) * d), 4);
                break;
            case 2:
                kl3 kl3Var3 = (kl3) obj;
                kl3Var3.getClass();
                rl3.c(kl3Var3.e, ll3Var.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var3.d, ll3Var.f, (float) ((-4.0d) * d), 4);
                break;
            case 3:
                kl3 kl3Var4 = (kl3) obj;
                kl3Var4.getClass();
                rl3.c(kl3Var4.g, ll3Var.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var4.d, ll3Var.f, (float) ((-4.0d) * d), 4);
                break;
            default:
                kl3 kl3Var5 = (kl3) obj;
                kl3Var5.getClass();
                rl3.c(kl3Var5.g, ll3Var.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var5.f, ll3Var.d, (float) ((-4.0d) * d), 4);
                break;
        }
        return Unit.a;
    }
}
