package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.blaze.blazesdk.players.ui.BackToLiveButtonView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.IPlayerCustomActionButton;
import com.google.android.material.button.MaterialButton;
import com.inmobi.media.Vj;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.view.tv.dialog.TvChannelContributionDialog;
import com.sofascore.results.league.LeagueActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.gim;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ivj implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ivj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [dqk] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        YouTubePlayerView youTubePlayerView;
        String url;
        String str;
        FragmentActivity O;
        int i = this.a;
        final int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                jvj jvjVar = (jvj) obj2;
                Calendar calendar = ke0.a;
                Context context = jvjVar.getContext();
                context.getClass();
                Context context2 = jvjVar.getContext();
                context2.getClass();
                ke0.g(context, v8a.t(context2, (Transfer) obj), 0);
                break;
            case 1:
                k04 k04Var = (k04) obj2;
                wxf wxfVar = EventActivity.h0;
                wxf.B(k04Var.b, k04Var.d, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                zu1 zu1Var = ((l0k) obj).l;
                if (zu1Var != null) {
                    Context context3 = k04Var.b;
                    yu1[] yu1VarArr = yu1.a;
                    nv.n(context3, "trending_odds_event", zu1Var.a, Integer.valueOf(k04Var.d), null);
                    break;
                }
                break;
            case 2:
                LeagueActivity.h0.z(((k04) obj2).b, ((vd6) obj).a.getTournament());
                break;
            case 3:
                TvChannelContributionDialog tvChannelContributionDialog = (TvChannelContributionDialog) obj2;
                MaterialButton materialButton = (MaterialButton) obj;
                Integer num = ((f3k) tvChannelContributionDialog.G.getValue()).m;
                if (num != null) {
                    int intValue = num.intValue();
                    Calendar calendar2 = ke0.a;
                    Context context4 = materialButton.getContext();
                    context4.getClass();
                    ke0.f(R.string.thank_you_contribution, context4);
                    Function1 function1 = tvChannelContributionDialog.H;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(intValue));
                    }
                }
                tvChannelContributionDialog.j();
                break;
            case 4:
                final eqk eqkVar = (eqk) obj2;
                Context context5 = (Context) obj;
                if (!eqkVar.h) {
                    final int i3 = 1;
                    if (!eqkVar.j) {
                        eqkVar.j = true;
                        yu yuVar = yu.HIGHLIGHTS;
                        Integer valueOf = Integer.valueOf(eqkVar.k);
                        Highlight highlight = eqkVar.g;
                        if (highlight != null) {
                            str = rfo.s(highlight);
                        } else {
                            zu[] zuVarArr = zu.a;
                            str = "youtube";
                        }
                        nv.g0(context5, yuVar, valueOf, "event", "details", str);
                    }
                    if (!eqkVar.l) {
                        ((Group) eqkVar.d.k).setVisibility(8);
                        fye fyeVar = eqkVar.e;
                        if ((fyeVar != null ? fyeVar.a : null) == null && eqkVar.f != null && (youTubePlayerView = eqkVar.m) != null) {
                            youTubePlayerView.setVisibility(0);
                            Context applicationContext = eqkVar.getContext().getApplicationContext();
                            applicationContext.getClass();
                            de0 i4 = new hpo(applicationContext).i();
                            hol holVar = new hol(new WeakReference(eqkVar.getContext()), new WeakReference(qea.t(eqkVar)), new WeakReference(eqkVar.e), new WeakReference(youTubePlayerView), eqkVar.f, null, new Function1() { // from class: dqk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i5 = i2;
                                    eqk eqkVar2 = eqkVar;
                                    switch (i5) {
                                        case 0:
                                            bne bneVar = (bne) obj3;
                                            bneVar.getClass();
                                            int ordinal = bneVar.ordinal();
                                            boolean z = (ordinal == 1 || ordinal == 3 || ordinal == 5) ? false : true;
                                            bu1 bu1Var = eqkVar2.d;
                                            ((LinearLayout) bu1Var.b).setVisibility(z ? 0 : 8);
                                            ((TextView) bu1Var.e).setVisibility((eqkVar2.i || !z) ? 8 : 0);
                                            ((TextView) bu1Var.g).setVisibility((eqkVar2.i && z) ? 0 : 8);
                                            break;
                                        default:
                                            ((ane) obj3).getClass();
                                            eqkVar2.h = true;
                                            bu1 bu1Var2 = eqkVar2.d;
                                            ((Group) bu1Var2.k).setVisibility(0);
                                            ((TextView) bu1Var2.g).setVisibility(eqkVar2.i ? 0 : 8);
                                            ((TextView) bu1Var2.e).setVisibility(eqkVar2.i ? 8 : 0);
                                            Highlight highlight2 = eqkVar2.g;
                                            if (highlight2 != null) {
                                                Context context6 = eqkVar2.getContext();
                                                context6.getClass();
                                                FragmentActivity K = hkg.K(context6);
                                                if (K != null) {
                                                    rfo.G(highlight2, K, new khk(23), "Event - details fragment");
                                                }
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, new Function1() { // from class: dqk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i5 = i3;
                                    eqk eqkVar2 = eqkVar;
                                    switch (i5) {
                                        case 0:
                                            bne bneVar = (bne) obj3;
                                            bneVar.getClass();
                                            int ordinal = bneVar.ordinal();
                                            boolean z = (ordinal == 1 || ordinal == 3 || ordinal == 5) ? false : true;
                                            bu1 bu1Var = eqkVar2.d;
                                            ((LinearLayout) bu1Var.b).setVisibility(z ? 0 : 8);
                                            ((TextView) bu1Var.e).setVisibility((eqkVar2.i || !z) ? 8 : 0);
                                            ((TextView) bu1Var.g).setVisibility((eqkVar2.i && z) ? 0 : 8);
                                            break;
                                        default:
                                            ((ane) obj3).getClass();
                                            eqkVar2.h = true;
                                            bu1 bu1Var2 = eqkVar2.d;
                                            ((Group) bu1Var2.k).setVisibility(0);
                                            ((TextView) bu1Var2.g).setVisibility(eqkVar2.i ? 0 : 8);
                                            ((TextView) bu1Var2.e).setVisibility(eqkVar2.i ? 8 : 0);
                                            Highlight highlight2 = eqkVar2.g;
                                            if (highlight2 != null) {
                                                Context context6 = eqkVar2.getContext();
                                                context6.getClass();
                                                FragmentActivity K = hkg.K(context6);
                                                if (K != null) {
                                                    rfo.G(highlight2, K, new khk(23), "Event - details fragment");
                                                }
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, 32);
                            YouTubePlayerView youTubePlayerView2 = eqkVar.m;
                            if (youTubePlayerView2 != null) {
                                youTubePlayerView2.a(holVar, i4);
                            }
                            eqkVar.n = holVar;
                            break;
                        }
                    } else {
                        Highlight highlight2 = eqkVar.g;
                        if (highlight2 != null && (url = highlight2.getUrl()) != null) {
                            p4h.w(context5, url);
                            break;
                        }
                    }
                } else {
                    Highlight highlight3 = eqkVar.g;
                    if (highlight3 != null && (O = hkg.O(context5)) != null) {
                        rfo.G(highlight3, O, new khk(24), "Event - details fragment");
                        break;
                    }
                }
                break;
            case 5:
                Vj.a((Vj) obj2, (Image) obj, view);
                break;
            case 6:
                h8l.t((h8l) obj2, (js2) obj);
                break;
            case 7:
                sal.l((sal) obj2, (li6) obj);
                break;
            case 8:
                n4m n4mVar = (n4m) obj;
                int i5 = dlm.o;
                view.getClass();
                evl.animateAndVibrate$default(view, false, 1.03f, 1.08f, 0L, 9, null);
                syl sylVar = (syl) ((dlm) obj2).c;
                sylVar.getClass();
                try {
                    sqm sqmVar = (sqm) sylVar.getViewModel();
                    sqmVar.getClass();
                    try {
                        n4m D = sqmVar.D();
                        gim gimVar = D != null ? D.b : null;
                        if (gimVar instanceof gim.b) {
                            ysm.d(sqmVar, EventActionName.CTA_CLICK, ysm.createMomentsPlayerProps$default(sqmVar, (gim.b) gimVar, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null));
                        } else if (gimVar instanceof gim.a) {
                            sqmVar.s0.g();
                            ysm.b(sqmVar, EventActionName.AD_CLICK, ysm.createMomentsPlayerAdProps$default(sqmVar, (gim.a) gimVar, null, null, false, false, 30, null));
                        }
                    } catch (Throwable th) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                    }
                    sylVar.m(n4mVar, BlazePlayerType.MOMENTS);
                    break;
                } catch (Throwable th2) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                    return;
                }
            case 9:
                ((Function1) obj2).invoke(((IPlayerCustomActionButton) obj).getCustomParams());
                break;
            case 10:
                n4m n4mVar2 = (n4m) obj;
                boolean z = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, 1.03f, 1.08f, 0L, 9, null);
                a aVar = (a) ((e0n) obj2).c;
                aVar.getClass();
                n4mVar2.getClass();
                try {
                    aVar.u();
                    w3m w3mVar = (w3m) aVar.getViewModel();
                    w3mVar.getClass();
                    try {
                        n4m D2 = w3mVar.D();
                        gim gimVar2 = D2 != null ? D2.b : null;
                        if (gimVar2 instanceof gim.e) {
                            mzm.b(w3mVar, EventActionName.CTA_CLICK, mzm.createVideosPlayerProps$default(w3mVar, (gim.e) gimVar2, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
                        }
                    } catch (Throwable th3) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
                    }
                    aVar.m(n4mVar2, BlazePlayerType.VIDEOS);
                    break;
                } catch (Throwable th4) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th4, null);
                    return;
                }
            default:
                e0n e0nVar = (e0n) obj;
                boolean z2 = e0n.n;
                if (((BackToLiveButtonView) obj2).isBehindLive()) {
                    view.getClass();
                    evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                    fam famVar = ((w3m) ((a) e0nVar.c).getViewModel()).e;
                    if (famVar != null) {
                        famVar.o();
                        break;
                    }
                }
                break;
        }
    }
}
