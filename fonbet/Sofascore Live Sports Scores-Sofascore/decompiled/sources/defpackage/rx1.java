package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.blaze.blazesdk.features.shared.ui.BlazeLikesContainerView;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerButtonStyle;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentOddsView;
import com.sofascore.results.player.PlayerActivity;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class rx1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rx1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ytm ytmVar = (ytm) obj5;
                ImageView imageView = (ImageView) obj4;
                BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle = (BlazeMomentsPlayerButtonStyle) obj3;
                BlazeLikesContainerView blazeLikesContainerView = (BlazeLikesContainerView) obj2;
                zkm zkmVar = (zkm) obj;
                int i2 = BlazeLikesContainerView.b;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                ytmVar.a(!ytmVar.getV());
                if (ytmVar.getV()) {
                    ytmVar.a(ytmVar.getW() + 1);
                } else {
                    ytmVar.a(ytmVar.getW() - 1);
                }
                imageView.setSelected(ytmVar.getV());
                ctl.b(imageView, blazeMomentsPlayerButtonStyle.getCustomImage());
                blazeLikesContainerView.a(ytmVar);
                zkmVar.invoke(ytmVar);
                break;
            case 1:
                Event event = (Event) obj5;
                od5 od5Var = (od5) obj4;
                EventBestPlayer eventBestPlayer = (EventBestPlayer) obj3;
                Team team = (Team) obj2;
                Double d = (Double) obj;
                if (!Intrinsics.c(event.getHasEventPlayerStatistics(), Boolean.TRUE)) {
                    int i3 = PlayerActivity.Z;
                    Context context = od5Var.getContext();
                    context.getClass();
                    jle.q(context, eventBestPlayer.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                    break;
                } else {
                    Context context2 = od5Var.getContext();
                    if (context2 != null) {
                        PlayerEventStatisticsModal c = jpe.c(f8h.i(event, eventBestPlayer.getPlayer(), team, ok3.u(team.getId(), event), d, 96), null);
                        if (context2 instanceof csk) {
                            context2 = ((csk) context2).getBaseContext();
                        }
                        AppCompatActivity appCompatActivity = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                        if (appCompatActivity != null) {
                            me4.n(c, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                            break;
                        }
                    }
                }
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) obj5;
                OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) obj3;
                int i4 = FeaturedTournamentOddsView.d;
                Context context3 = linearLayout.getContext();
                context3.getClass();
                nv.b0(context3, ((ProviderOdds) obj4).getMarketName(), oddsCountryProvider.getProvider().getSlug(), "featured", Integer.valueOf(((Event) obj2).getId()), vmd.FEATURED_TOURNAMENT, "odds_value", oddsCountryProvider.getType());
                Context context4 = linearLayout.getContext();
                context4.getClass();
                bea.G(context4, (String) obj);
                break;
        }
    }
}
