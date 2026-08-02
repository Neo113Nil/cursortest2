package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lzc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll3 b;
    public final /* synthetic */ ll3 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ lzc(ll3 ll3Var, ll3 ll3Var2, boolean z, int i) {
        this.a = i;
        this.b = ll3Var;
        this.c = ll3Var2;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.d;
        ll3 ll3Var = this.c;
        ll3 ll3Var2 = this.b;
        switch (i) {
            case 0:
                kl3 kl3Var = (kl3) obj;
                kl3Var.getClass();
                rl3.d(kl3Var.d, ll3Var2.f, 8.0f, 4);
                rl3.d(kl3Var.f, ll3Var.d, 8.0f, 4);
                rl3.c(kl3Var.e, ll3Var2.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var.g, ll3Var2.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                kl3Var.d(new c35("preferWrap"));
                kl3Var.c(z ? 1.0f : 0.0f);
                break;
            case 1:
                kl3 kl3Var2 = (kl3) obj;
                kl3Var2.getClass();
                rl3.c(kl3Var2.e, ll3Var2.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var2.f, ll3Var.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var2.g, ll3Var2.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var2.d, ll3Var2.f, 8.0f, 4);
                kl3Var2.d(new c35("preferWrap"));
                kl3Var2.c(z ? 1.0f : 0.0f);
                break;
            default:
                kl3 kl3Var3 = (kl3) obj;
                kl3Var3.getClass();
                rl3.c(kl3Var3.e, ll3Var2.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var3.g, ll3Var2.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var3.d, ll3Var2.f, 8.0f, 4);
                rl3.d(kl3Var3.f, ll3Var.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                kl3Var3.d(new c35("preferWrap"));
                kl3Var3.c(z ? 1.0f : 0.0f);
                break;
        }
        return Unit.a;
    }
}
