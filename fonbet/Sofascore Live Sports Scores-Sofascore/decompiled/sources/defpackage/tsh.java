package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tsh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll3 b;
    public final /* synthetic */ ll3 c;

    public /* synthetic */ tsh(ll3 ll3Var, ll3 ll3Var2, int i) {
        this.a = i;
        this.b = ll3Var;
        this.c = ll3Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ll3 ll3Var = this.c;
        ll3 ll3Var2 = this.b;
        switch (i) {
            case 0:
                kl3 kl3Var = (kl3) obj;
                kl3Var.getClass();
                rl3.c(kl3Var.e, ll3Var2.g, 20.0f, 4);
                rl3.d(kl3Var.d, ll3Var.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var.g, kl3Var.c.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                break;
            case 1:
                kl3 kl3Var2 = (kl3) obj;
                kl3Var2.getClass();
                rl3.d(kl3Var2.d, ll3Var2.f, 8.0f, 4);
                rl3.c(kl3Var2.e, ll3Var2.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var2.g, ll3Var.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                kl3Var2.b(new c35("spread"));
                break;
            case 2:
                kl3 kl3Var3 = (kl3) obj;
                kl3Var3.getClass();
                rl3.c(kl3Var3.e, ll3Var2.g, 4.0f, 4);
                rl3.d(kl3Var3.d, ll3Var.f, 8.0f, 4);
                break;
            default:
                kl3 kl3Var4 = (kl3) obj;
                kl3Var4.getClass();
                rl3.d(kl3Var4.d, ll3Var2.f, 8.0f, 4);
                rl3.c(kl3Var4.e, kl3Var4.c.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var4.f, ll3Var.d, 8.0f, 4);
                kl3Var4.d(new c35("spread"));
                break;
        }
        return Unit.a;
    }
}
