package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class id3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xl3 b;
    public final /* synthetic */ ll3 c;

    public /* synthetic */ id3(ll3 ll3Var, xl3 xl3Var, int i) {
        this.a = i;
        this.c = ll3Var;
        this.b = xl3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ll3 ll3Var = this.c;
        xl3 xl3Var = this.b;
        switch (i) {
            case 0:
                kl3 kl3Var = (kl3) obj;
                kl3Var.getClass();
                rl3.d(kl3Var.d, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var.f, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var.g, ll3Var.e, -16.0f, 4);
                break;
            case 1:
                kl3 kl3Var2 = (kl3) obj;
                kl3Var2.getClass();
                rl3.d(kl3Var2.f, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var2.d, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var2.e, ll3Var.g, -16.0f, 4);
                break;
            case 2:
                kl3 kl3Var3 = (kl3) obj;
                kl3Var3.getClass();
                rl3.d(kl3Var3.d, ll3Var.f, 14.0f, 4);
                rl3 rl3Var = kl3Var3.e;
                ll3 ll3Var2 = kl3Var3.c;
                rl3.c(rl3Var, ll3Var2.e, 8.0f, 4);
                rl3.c(kl3Var3.g, ll3Var2.g, 8.0f, 4);
                rl3.d(kl3Var3.f, xl3Var, 4.0f, 4);
                kl3Var3.d(new c35("spread"));
                break;
            case 3:
                kl3 kl3Var4 = (kl3) obj;
                kl3Var4.getClass();
                rl3.d(kl3Var4.d, ll3Var.f, 14.0f, 4);
                rl3 rl3Var2 = kl3Var4.e;
                ll3 ll3Var3 = kl3Var4.c;
                rl3.c(rl3Var2, ll3Var3.e, 8.0f, 4);
                rl3.c(kl3Var4.g, ll3Var3.g, 8.0f, 4);
                rl3.d(kl3Var4.f, xl3Var, 4.0f, 4);
                kl3Var4.d(new c35("spread"));
                break;
            case 4:
                kl3 kl3Var5 = (kl3) obj;
                kl3Var5.getClass();
                rl3.d(kl3Var5.d, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var5.f, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var5.g, ll3Var.e, 4.0f, 4);
                break;
            case 5:
                kl3 kl3Var6 = (kl3) obj;
                kl3Var6.getClass();
                rl3.d(kl3Var6.d, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var6.f, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var6.g, ll3Var.e, 4.0f, 4);
                break;
            case 6:
                kl3 kl3Var7 = (kl3) obj;
                kl3Var7.getClass();
                rl3.d(kl3Var7.f, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var7.d, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var7.e, ll3Var.g, 4.0f, 4);
                break;
            case 7:
                kl3 kl3Var8 = (kl3) obj;
                kl3Var8.getClass();
                rl3.d(kl3Var8.d, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var8.f, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var8.g, ll3Var.e, 4.0f, 4);
                break;
            default:
                kl3 kl3Var9 = (kl3) obj;
                kl3Var9.getClass();
                rl3.d(kl3Var9.f, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var9.d, xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var9.e, ll3Var.g, 4.0f, 4);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ id3(xl3 xl3Var, ll3 ll3Var, int i) {
        this.a = i;
        this.b = xl3Var;
        this.c = ll3Var;
    }
}
