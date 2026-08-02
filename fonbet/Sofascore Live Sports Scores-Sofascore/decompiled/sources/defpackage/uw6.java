package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.weekly.FantasyEliteFaceoffRevealDialog;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class uw6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyEliteFaceoffRevealDialog b;

    public /* synthetic */ uw6(FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog, int i) {
        this.a = i;
        this.b = fantasyEliteFaceoffRevealDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog = this.b;
        int i2 = 1;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1135257028, av8Var, new uw6(fantasyEliteFaceoffRevealDialog, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ht9 ht9Var = new ht9((Context) av8Var2.k(nz.b));
                    ht9Var.c = Integer.valueOf(R.drawable.fantasy_elite_faceoff);
                    awj[] awjVarArr = {new ty1(-16777216, 20.0f, 1.5f)};
                    sl6 sl6Var = st9.a;
                    st9.b(ht9Var, ph0.X(awjVarArr));
                    wkn.a(Boolean.valueOf(fantasyEliteFaceoffRevealDialog.v().k().b), ml4.q0(n9e.q(fz8.Z(utc.a, uaa.w(ht9Var.a(), av8Var2, 22), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 54), lz.D(R.color.darken_overlay_2, av8Var2), oyn.e)), null, null, yqo.H(529707835, av8Var2, new vw6(fantasyEliteFaceoffRevealDialog, objArr == true ? 1 : 0)), av8Var2, 24576, 12);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
