package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import com.blaze.blazesdk.features.search.ui.SearchActivity;
import com.blaze.blazesdk.players.ui.n;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.widgets.ui.WidgetItemCustomView;
import com.inmobi.media.C3360d6;
import com.inmobi.media.C3381e2;
import com.inmobi.media.C3649ob;
import com.inmobi.media.C3693q3;
import com.inmobi.media.C3754sd;
import com.inmobi.media.C3829va;
import com.inmobi.media.C3842vn;
import com.inmobi.media.Vc;
import com.inmobi.media.Z2;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.newNetwork.WSCGameData;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.notifications.NotificationSettingsActivity;
import com.sofascore.results.profile.view.WeeklyStreaksExplanationModal;
import com.sofascore.results.wc26.bottomSheet.WorldCupAddWidgetBottomSheet;
import com.sofascore.results.weeklyChallenge.leaderboard.UpcomingMatchesModal;
import com.sofascore.results.weeklyChallenge.ui.components.bottomSheet.WeeklyChallengeNotificationsBottomSheet;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import java.math.BigInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ndk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ndk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WebViewEvent sendOfferwallEvent$lambda$13;
        Unit playAnimatedThumbnail$lambda$24;
        int i = this.a;
        boolean z = false;
        Object[] objArr = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = UpgradeSofascoreActivity.M;
                return yd3.a(((UpgradeSofascoreActivity) obj).getLayoutInflater());
            case 1:
                return Vc.a((Vc) obj);
            case 2:
                hok hokVar = (hok) obj;
                return BigInteger.valueOf(hokVar.a).shiftLeft(32).or(BigInteger.valueOf(hokVar.b)).shiftLeft(32).or(BigInteger.valueOf(hokVar.c));
            case 3:
                sendOfferwallEvent$lambda$13 = WebViewAdPlayer.sendOfferwallEvent$lambda$13((OfferwallEvent) obj);
                return sendOfferwallEvent$lambda$13;
            case 4:
                ((WebChromeClient.CustomViewCallback) obj).onCustomViewHidden();
                return Unit.a;
            case 5:
                WeeklyChallengeNotificationsBottomSheet weeklyChallengeNotificationsBottomSheet = (WeeklyChallengeNotificationsBottomSheet) obj;
                int i3 = NotificationSettingsActivity.O;
                Context requireContext = weeklyChallengeNotificationsBottomSheet.requireContext();
                requireContext.getClass();
                Intent intent = new Intent(requireContext, (Class<?>) NotificationSettingsActivity.class);
                intent.putExtra("PRESELECTED_SETTING_NAME", "weekly_challenge");
                intent.putExtra("PRESELECTED_GROUP_NAME", "user");
                requireContext.startActivity(intent);
                weeklyChallengeNotificationsBottomSheet.j();
                return Unit.a;
            case 6:
                Context context = ((ComposeView) obj).getContext();
                context.getClass();
                UpcomingMatchesModal upcomingMatchesModal = new UpcomingMatchesModal();
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(upcomingMatchesModal, appCompatActivity, objArr == true ? 1 : 0, 3));
                }
                return Unit.a;
            case 7:
                l5l l5lVar = (l5l) obj;
                a3l a3lVar = l5lVar.e;
                fyk fykVar = l5lVar.f;
                UserAccount userAccount = l5lVar.h;
                return new y57(a3lVar, fykVar, userAccount.getId(), userAccount.getLeaderboardId(), l5lVar.g);
            case 8:
                Bundle arguments = ((WeeklyStreaksExplanationModal) obj).getArguments();
                if (arguments != null && arguments.getBoolean("VISITING_PROFILE")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                playAnimatedThumbnail$lambda$24 = WidgetItemCustomView.playAnimatedThumbnail$lambda$24((WidgetItemCustomView) obj);
                return playAnimatedThumbnail$lambda$24;
            case 10:
                no5.a((lbl) obj);
                return Unit.a;
            case 11:
                ((WorldCupAddWidgetBottomSheet) obj).j();
                return Unit.a;
            case 12:
                vt2 vt2Var = (vt2) CollectionsKt.firstOrNull(((ofl) obj).a);
                return e.f(vt2Var != null ? (String) vt2Var.a : null);
            case 13:
                WSCGameData game = ((n5c) obj).a.getGame();
                if (game != null) {
                    return Integer.valueOf(game.getEventId());
                }
                return null;
            case 14:
                ((SearchActivity) obj).finish();
                return Unit.a;
            case 15:
                j1m j1mVar = j1m.a;
                return ((g0) obj).toString();
            case 16:
                int i4 = syl.C;
                ((sqm) ((syl) obj).getViewModel()).V.l(ztm.a);
                return Unit.a;
            case 17:
                return C3360d6.a((C3360d6) obj);
            case 18:
                return C3381e2.e((C3381e2) obj);
            case 19:
                int i5 = obm.D;
                ((ilm) ((obm) obj).getViewModel()).V.l(ztm.a);
                return Unit.a;
            case 20:
                ((n) obj).k(false, false);
                return Unit.a;
            case 21:
                return C3649ob.a((C3649ob) obj);
            case 22:
                return C3693q3.b((Z2) obj);
            case 23:
                return C3754sd.a((C3754sd) obj);
            case 24:
                return C3829va.d((C3829va) obj);
            default:
                return C3842vn.a((C3842vn) obj);
        }
    }
}
