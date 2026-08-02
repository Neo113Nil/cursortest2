package defpackage;

import android.content.Context;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class bfm implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BlazeTextWithIconButton b;
    public final /* synthetic */ efm c;
    public final /* synthetic */ n4m d;

    public /* synthetic */ bfm(BlazeTextWithIconButton blazeTextWithIconButton, efm efmVar, n4m n4mVar, int i) {
        this.a = i;
        this.b = blazeTextWithIconButton;
        this.c = efmVar;
        this.d = n4mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        BlazeTextWithIconButton blazeTextWithIconButton = this.b;
        n4m n4mVar = this.d;
        efm efmVar = this.c;
        switch (i) {
            case 0:
                if (efm.u(n4mVar)) {
                    Context context = blazeTextWithIconButton.getContext();
                    context.getClass();
                    cnb.triggerHapticFeedback$default(context, null, 1, null);
                    ((obm) efmVar.c).F(n4mVar);
                }
                break;
            case 1:
                boolean z = efm.j;
                evl.animateAndVibrate$default(this.b, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                ((obm) efmVar.c).E(n4mVar);
                break;
            case 2:
                boolean z2 = efm.j;
                evl.animateAndVibrate$default(this.b, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                ((obm) efmVar.c).E(n4mVar);
                break;
            default:
                boolean z3 = efm.j;
                efmVar.j(n4mVar, new bfm(efmVar, n4mVar, blazeTextWithIconButton, 0));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bfm(efm efmVar, n4m n4mVar, BlazeTextWithIconButton blazeTextWithIconButton, int i) {
        this.a = i;
        this.c = efmVar;
        this.d = n4mVar;
        this.b = blazeTextWithIconButton;
    }
}
