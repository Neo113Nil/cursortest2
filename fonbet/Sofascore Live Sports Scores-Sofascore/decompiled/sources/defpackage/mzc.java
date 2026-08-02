package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mzc implements Function1 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public mzc(y6 y6Var) {
        this.a = 1;
        this.c = y6Var;
        this.b = true;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                kl3 kl3Var = (kl3) obj;
                kl3Var.getClass();
                rl3.d(kl3Var.f, kl3Var.c.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                ll3 ll3Var = (ll3) obj2;
                rl3.c(kl3Var.e, ll3Var.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.c(kl3Var.g, ll3Var.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                kl3Var.d(new c35("preferWrap"));
                kl3Var.c(this.b ? 0.0f : 1.0f);
                break;
            case 1:
                p33 p33Var = (p33) obj;
                y6 y6Var = (y6) obj2;
                p33Var.getClass();
                if (this.b) {
                    this.b = false;
                } else if (p33Var.d.a instanceof pfb) {
                    if (y6Var.getStateRestorationPolicy() == wqf.c && !y6Var.a) {
                        y6Var.setStateRestorationPolicy(wqf.a);
                    }
                    pk0 pk0Var = y6Var.b;
                    pk0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList = pk0Var.l;
                    copyOnWriteArrayList.remove(this);
                    if (copyOnWriteArrayList.isEmpty() && (function1 = (Function1) pk0Var.k.get()) != null) {
                        lk0 lk0Var = pk0Var.h;
                        lk0Var.getClass();
                        hcc hccVar = lk0Var.e;
                        hccVar.getClass();
                        ((CopyOnWriteArrayList) ((nh0) hccVar.b).b).remove(function1);
                    }
                }
                break;
            default:
                kl3 kl3Var2 = (kl3) obj;
                kl3Var2.getClass();
                rl3 rl3Var = kl3Var2.e;
                ll3 ll3Var2 = kl3Var2.c;
                rl3.c(rl3Var, ll3Var2.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var2.d, ll3Var2.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                rl3.d(kl3Var2.f, (xl3) obj2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                kl3Var2.d(new c35("preferWrap"));
                kl3Var2.c(this.b ? 1.0f : 0.0f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mzc(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }
}
