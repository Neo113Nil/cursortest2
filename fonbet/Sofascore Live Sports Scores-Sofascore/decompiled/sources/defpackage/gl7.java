package defpackage;

import android.content.res.Resources;
import com.sofascore.model.database.DbFeedPostFeedback;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.welcome.FantasyWelcomeActivity;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class gl7 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ gl7(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int id;
        String str;
        String j;
        switch (this.a) {
            case 0:
                wn1 wn1Var = (wn1) obj;
                wn1Var.getClass();
                return Integer.valueOf(wn1Var.a);
            case 1:
                ((r60) obj).getClass();
                int i = 12;
                return new pp3(uo5.n(s02.h0(250, 0, null, 6), new yt6(i)), uo5.p(s02.h0(250, 0, null, 6), new yt6(i)), 12);
            case 2:
                FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) obj;
                fantasyPlayerFixtureUiModel.getClass();
                return fantasyPlayerFixtureUiModel.h;
            case 3:
                ro7 ro7Var = (ro7) obj;
                ro7Var.getClass();
                return ro7Var.getClass().getName();
            case 4:
                ((vl7) obj).getClass();
                return Unit.a;
            case 5:
                int i2 = FantasyWelcomeActivity.M;
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            case 6:
                List list = (List) obj;
                list.getClass();
                return Boolean.valueOf(list.size() > 2);
            case 7:
                List list2 = (List) obj;
                list2.getClass();
                return Boolean.valueOf(list2.size() > 2);
            case 8:
                ((bef) obj).getClass();
                return Unit.a;
            case 9:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("SELECT * FROM feed_post_feedback");
                try {
                    int r = w1a.r(V0, "postId");
                    int r2 = w1a.r(V0, "feedbackTimestamp");
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(new DbFeedPostFeedback((int) V0.getLong(r), V0.getLong(r2)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 10:
                int intValue = ((Integer) obj).intValue();
                ia0 ia0Var = ia0.q;
                return (!mz1.C() || (intValue != 7 && (intValue <= 7 || intValue % 10 != 6))) ? "posts" : "ad";
            case 11:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new gih(absolutePath);
            case 12:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                float H0 = ha5Var.H0(8.0f);
                long j2 = r13.b;
                ha5.g0(ha5Var, wxf.s(b.j(new r13(r13.c(j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new r13(r13.c(j2, 0.05f))), Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - H0, Float.intBitsToFloat((int) (ha5Var.n() >> 32)), 8), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - H0) << 32), (Float.floatToRawIntBits(H0) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L))) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                return Unit.a;
            case 13:
                ha5 ha5Var2 = (ha5) obj;
                ha5Var2.getClass();
                float H02 = ha5Var2.H0(8.0f);
                long j3 = r13.b;
                ha5.g0(ha5Var2, wxf.s(b.j(new r13(r13.c(j3, 0.05f)), new r13(r13.c(j3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, H02, 8), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32), (Float.floatToRawIntBits(H02) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L))) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                return Unit.a;
            case 14:
                ((uu3) obj).getClass();
                return mx9.h;
            case 15:
                y3h.j((b4h) obj, 0);
                return Unit.a;
            case 16:
                return Unit.a;
            case 17:
                return Unit.a;
            case 18:
                obj.getClass();
                if (obj instanceof Player) {
                    id = ((Player) obj).getId();
                    str = "player_";
                } else if (obj instanceof Team) {
                    id = ((Team) obj).getId();
                    str = "team_";
                } else {
                    if (!(obj instanceof UniqueTournament)) {
                        return Integer.valueOf(obj.hashCode());
                    }
                    id = ((UniqueTournament) obj).getId();
                    str = "ut_";
                }
                return ljg.j(id, str);
            case 19:
                return new q9k(R.string.football_accurate_crosses_short);
            case 20:
                return new q9k(R.string.football_accurate_crosses);
            case 21:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics.getClass();
                String y0 = o02.y0(footballPlayerSeasonStatistics.getAccurateCrosses());
                Regex regex = yid.a;
                return y0;
            case 22:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics2 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics2.getClass();
                Integer accurateCrosses = footballPlayerSeasonStatistics2.getAccurateCrosses();
                j = accurateCrosses != null ? fc6.j(footballPlayerSeasonStatistics2, Integer.valueOf(accurateCrosses.intValue())) : null;
                Regex regex2 = yid.a;
                return j == null ? "-" : j;
            case 23:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics3 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics3.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics3.getAccurateCrosses()));
            case 24:
                return new q9k(R.string.football_accurate_long_balls_short);
            case 25:
                return new q9k(R.string.football_accurate_long_balls);
            case 26:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics4 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics4.getClass();
                String y02 = o02.y0(footballPlayerSeasonStatistics4.getAccurateLongBalls());
                Regex regex3 = yid.a;
                return y02;
            case 27:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics5 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics5.getClass();
                Integer accurateLongBalls = footballPlayerSeasonStatistics5.getAccurateLongBalls();
                j = accurateLongBalls != null ? fc6.j(footballPlayerSeasonStatistics5, Integer.valueOf(accurateLongBalls.intValue())) : null;
                Regex regex4 = yid.a;
                return j == null ? "-" : j;
            case 28:
                FootballPlayerSeasonStatistics footballPlayerSeasonStatistics6 = (FootballPlayerSeasonStatistics) obj;
                footballPlayerSeasonStatistics6.getClass();
                return Integer.valueOf(yid.m(footballPlayerSeasonStatistics6.getAccurateLongBalls()));
            default:
                return new q9k(R.string.football_accurate_passes_short);
        }
    }
}
