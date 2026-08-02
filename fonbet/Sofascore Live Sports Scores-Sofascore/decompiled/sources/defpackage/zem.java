package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsStory;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.BlazeShareParams;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zem implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ efm b;

    public /* synthetic */ zem(efm efmVar, int i) {
        this.a = i;
        this.b = efmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n4m D;
        int i = this.a;
        efm efmVar = this.b;
        switch (i) {
            case 0:
                boolean z = efm.j;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                ilm ilmVar = (ilm) ((obm) efmVar.c).getViewModel();
                ilmVar.getClass();
                try {
                    n4m D2 = ilmVar.D();
                    gim gimVar = D2 != null ? D2.b : null;
                    if (gimVar instanceof gim.d) {
                        gim.d dVar = (gim.d) gimVar;
                        AnalyticsPropsStory createStoryPlayerProps$default = jom.createStoryPlayerProps$default(ilmVar, dVar, null, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, null);
                        EventActionName eventActionName = EventActionName.SHARE_CLICK;
                        jom.e(ilmVar, eventActionName, createStoryPlayerProps$default);
                        if (dVar.b.l != null) {
                            jom.d(ilmVar, eventActionName, jom.createStoryPlayerInteractionProps$default(ilmVar, dVar, null, 2, null));
                        }
                    }
                    xlm i0 = ilmVar.i0();
                    if (i0 != null && (D = ilmVar.D()) != null) {
                        ilmVar.m(BlazePlayerType.STORIES, new BlazeShareParams.BlazeShareContentType.Story(D.a), nxl.b(D, i0), i0.a, D.d, D.f);
                        break;
                    }
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                    return;
                }
                break;
            case 1:
                obm obmVar = (obm) efmVar.c;
                ViewPager2 viewPager2 = obmVar.q.e;
                viewPager2.getClass();
                if (evl.n(viewPager2)) {
                    ilm ilmVar2 = (ilm) obmVar.getViewModel();
                    ilmVar2.getClass();
                    cxl cxlVar = cxl.PREV;
                    n4m D3 = ilmVar2.D();
                    if (D3 == null || D3.l) {
                        ilmVar2.a0(cxlVar);
                        break;
                    }
                }
                break;
            case 2:
                obm obmVar2 = (obm) efmVar.c;
                ViewPager2 viewPager22 = obmVar2.q.e;
                viewPager22.getClass();
                if (evl.n(viewPager22)) {
                    ilm ilmVar3 = (ilm) obmVar2.getViewModel();
                    ilmVar3.getClass();
                    cxl cxlVar2 = cxl.NEXT;
                    n4m D4 = ilmVar3.D();
                    if (D4 == null || D4.l) {
                        ilmVar3.a0(cxlVar2);
                        break;
                    }
                }
                break;
            case 3:
                obm obmVar3 = (obm) efmVar.c;
                obmVar3.getClass();
                obmVar3.j(H.CLOSE_BUTTON);
                break;
            default:
                boolean z2 = efm.j;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                url urlVar = efmVar.c;
                efmVar.getAbsoluteAdapterPosition();
                ((ilm) ((obm) urlVar).getViewModel()).h0(!efm.j);
                break;
        }
    }
}
