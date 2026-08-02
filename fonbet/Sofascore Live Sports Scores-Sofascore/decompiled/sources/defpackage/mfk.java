package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mfk implements Function1 {
    public static final mfk b = new mfk(0);
    public static final mfk c = new mfk(1);
    public final /* synthetic */ int a;

    public /* synthetic */ mfk(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                kl3 kl3Var = (kl3) obj;
                kl3Var.getClass();
                rl3 rl3Var = kl3Var.e;
                ll3 ll3Var = kl3Var.c;
                rl3.c(rl3Var, ll3Var.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var.d, ll3Var.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var.f, ll3Var.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var.g, ll3Var.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                kl3Var.b(new c35("wrap"));
                return Unit.a;
            default:
                return null;
        }
    }
}
