package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class yyf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o85 b;

    public /* synthetic */ yyf(o85 o85Var, int i) {
        this.a = i;
        this.b = o85Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        o85 o85Var = this.b;
        switch (i) {
            case 0:
                ((eoh) o85Var.d).setValue(null);
                ((eoh) o85Var.c).setValue(null);
                o85Var.f.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ((eoh) o85Var.e).setValue(null);
                break;
            default:
                ((eoh) o85Var.d).setValue(null);
                ((eoh) o85Var.c).setValue(null);
                o85Var.f.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ((eoh) o85Var.e).setValue(null);
                break;
        }
        return Unit.a;
    }
}
