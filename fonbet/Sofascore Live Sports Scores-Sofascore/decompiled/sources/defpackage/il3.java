package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class il3 extends lkd {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ kl3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il3(kl3 kl3Var) {
        super(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.c = kl3Var;
    }

    @Override // defpackage.lkd
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        dd2 dd2Var;
        int i = this.b;
        kl3 kl3Var = this.c;
        switch (i) {
            case 0:
                c35 c35Var = (c35) obj2;
                hd2 hd2Var = kl3Var.b;
                String name = kProperty.getName();
                c35Var.getClass();
                fp4 fp4Var = c35Var.a;
                fp4 fp4Var2 = c35Var.c;
                fp4 fp4Var3 = c35Var.b;
                if (((p75) fp4Var3.b) == null && ((String) fp4Var3.c) == null && ((p75) fp4Var2.b) == null && ((String) fp4Var2.c) == null) {
                    dd2Var = fp4Var.g();
                } else {
                    hd2 hd2Var2 = new hd2(new char[0]);
                    if (((p75) fp4Var3.b) != null || ((String) fp4Var3.c) != null) {
                        hd2Var2.C("min", fp4Var3.g());
                    }
                    if (((p75) fp4Var2.b) != null || ((String) fp4Var2.c) != null) {
                        hd2Var2.C(InneractiveMediationNameConsts.MAX, fp4Var2.g());
                    }
                    hd2Var2.C(U3.i.X, fp4Var.g());
                    dd2Var = hd2Var2;
                }
                hd2Var.C(name, dd2Var);
                break;
            default:
                float f = ((p75) obj).a;
                float f2 = ((p75) obj2).a;
                if (!Float.isNaN(f2)) {
                    kl3Var.b.C(kProperty.getName(), new fd2(f2));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il3(kl3 kl3Var, c35 c35Var) {
        super(c35Var);
        this.c = kl3Var;
    }
}
