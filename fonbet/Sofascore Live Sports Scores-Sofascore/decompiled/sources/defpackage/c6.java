package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blaze.blazesdk.features.moments.widgets.row.BlazeMomentsWidgetRowView;
import com.blaze.blazesdk.features.stories.widgets.row.BlazeStoriesWidgetRowView;
import com.blaze.blazesdk.features.videos.widgets.row.BlazeVideosWidgetRowView;
import com.sofascore.results.R;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.chat.view.ChatMessageInputView;
import com.sofascore.results.dialog.TeamRatingCalculationInfoBottomSheet;
import com.sofascore.results.event.graphs.view.CricketBowlerGraphView;
import com.sofascore.results.fantasy.finished.FantasyFinishedCompetitionsActivity;
import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatFullPlayersBottomSheet;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import com.sofascore.results.player.fantasy.bottomsheet.FantasyPriceGraphInfoBottomSheet;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardsActivity;
import com.sofascore.results.view.DividerLinearLayout;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class c6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ c6(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Drawable mutate;
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        Context context = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(context.getColor(R.color.primary_default));
            case 1:
                return Integer.valueOf(context.getColor(R.color.success));
            case 2:
                return Integer.valueOf(context.getColor(R.color.neutral_default));
            case 3:
                return new htg(context);
            case 4:
                nv.z0(context, kv.IMPRESSION, "ai_insights", "odds_tab");
                return Unit.a;
            case 5:
                return new au1(context);
            case 6:
                return new au1(context);
            case 7:
                int i3 = BlazeMomentsWidgetRowView.w;
                return new LinearLayoutManager(0, false);
            case 8:
                int i4 = BlazeStoriesWidgetRowView.w;
                return new LinearLayoutManager(0, false);
            case 9:
                int i5 = BlazeVideosWidgetRowView.w;
                return new LinearLayoutManager(0, false);
            case 10:
                return LayoutInflater.from(context);
            case 11:
                int i6 = ChatMessageInputView.x;
                Drawable drawable = context.getDrawable(R.drawable.ic_translate);
                if (drawable == null || (mutate = drawable.mutate()) == null) {
                    return null;
                }
                mutate.setTintList(eq3.q(R.color.primary_default, context));
                return mutate;
            case 12:
                TeamRatingCalculationInfoBottomSheet teamRatingCalculationInfoBottomSheet = new TeamRatingCalculationInfoBottomSheet();
                context.getClass();
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(teamRatingCalculationInfoBottomSheet, appCompatActivity, rq3Var, i2));
                }
                return Unit.a;
            case 13:
                nv.e0(context, hta.TOP_CONTRIBUTORS, "contributions");
                int i7 = ProfileTopLeaderboardsActivity.N;
                yfa.I(context, baf.b);
                return Unit.a;
            case 14:
                int i8 = CricketBowlerGraphView.k;
                Drawable drawable2 = context.getDrawable(hkg.c0(context) ? R.drawable.rectangle_8dp_corners_left : R.drawable.rectangle_8dp_corners_right);
                if (drawable2 == null) {
                    return null;
                }
                drawable2.setColorFilter(new PorterDuffColorFilter(context.getColor(R.color.cricket_terrain), PorterDuff.Mode.SRC_IN));
                return drawable2;
            case 15:
                int i9 = CupTreeExtendedView.p;
                return Integer.valueOf(ao2.s(62, context));
            case 16:
                return hkg.Y(R.font.sofascore_sans_medium, context);
            case 17:
                int i10 = DividerLinearLayout.f;
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(context.getColor(R.color.n_lv_4));
                paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return paint;
            case 18:
                int i11 = UpgradeSofascoreActivity.M;
                e2f.k(context, false);
                return Unit.a;
            case 19:
                return LayoutInflater.from(context);
            case 20:
                return LayoutInflater.from(context);
            case 21:
                int i12 = FantasyFinishedCompetitionsActivity.M;
                context.getClass();
                context.startActivity(new Intent(context, (Class<?>) FantasyFinishedCompetitionsActivity.class));
                return Unit.a;
            case 22:
                FragmentActivity O = hkg.O(context);
                if (O != null) {
                    FantasyPriceGraphInfoBottomSheet fantasyPriceGraphInfoBottomSheet = new FantasyPriceGraphInfoBottomSheet();
                    AppCompatActivity appCompatActivity2 = O instanceof AppCompatActivity ? (AppCompatActivity) O : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(fantasyPriceGraphInfoBottomSheet, appCompatActivity2, rq3Var, i2));
                    }
                }
                return Unit.a;
            case 23:
                FragmentActivity O2 = hkg.O(context);
                if (O2 != null) {
                    String string = context.getString(R.string.fantasy_lineup_view_expected_fantasy_points_title);
                    string.getClass();
                    String string2 = context.getString(R.string.fantasy_expected_fantasy_points_explained);
                    string2.getClass();
                    f7a.w(O2, string, string2, "ExpectedPointsModal", null);
                }
                return Unit.a;
            case 24:
                nv.z0(context, kv.IMPRESSION, "primary_card", "feed");
                return Unit.a;
            case 25:
                File v = gvd.v(context, "firebaseSessions/sessionConfigsDataStore.data");
                ug5.y(v);
                return v;
            case 26:
                File v2 = gvd.v(context, "firebaseSessions/sessionDataStore.data");
                ug5.y(v2);
                return v2;
            case 27:
                LeagueGoatFullPlayersBottomSheet leagueGoatFullPlayersBottomSheet = new LeagueGoatFullPlayersBottomSheet();
                leagueGoatFullPlayersBottomSheet.setArguments(fz8.C(fz8.H("ANALYTICS_SOURCE", "click")));
                context.getClass();
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity3 = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity3 != null) {
                    wca.x(appCompatActivity3.getLifecycle()).b(new r1(leagueGoatFullPlayersBottomSheet, appCompatActivity3, rq3Var, i2));
                }
                return Unit.a;
            case 28:
                return LayoutInflater.from(context);
            default:
                return q5a.A(context);
        }
    }
}
