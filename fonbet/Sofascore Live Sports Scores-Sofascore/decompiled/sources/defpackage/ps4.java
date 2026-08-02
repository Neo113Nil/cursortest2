package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.shared.FantasyTransfersSquadInfoDisplayModeBottomSheet;
import com.sofascore.results.fantasy.teammanagement.player.FantasyFootballPlayerTransfersBottomSheet;
import com.sofascore.results.fantasy.teammanagement.transfers.review.FantasyTransfersReviewFragment;
import com.sofascore.results.fantasy.teammanagement.transfers.selectreplacement.FantasyTransfersSelectReplacementDialogFragment;
import com.sofascore.results.league.fragment.standings.LeagueStandingsFragment;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ps4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ps4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer valueOf;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zkj zkjVar = ((iih) obj).h;
                return new r13(hkg.d0(zkjVar.a, zkjVar.b, jg5.c.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
            case 1:
                return yqo.A((FantasyFootballPlayerTransfersBottomSheet) obj).b.e(R.id.nav_graph_transfers);
            case 2:
                return yqo.A((FantasyTransfersReviewFragment) obj).b.e(R.id.nav_graph_transfers);
            case 3:
                return yqo.A((FantasyTransfersSelectReplacementDialogFragment) obj).b.e(R.id.nav_graph_transfers);
            case 4:
                return yqo.A((FantasyTransfersSquadInfoDisplayModeBottomSheet) obj).b.e(R.id.nav_graph_transfers);
            case 5:
                my7 my7Var = (my7) obj;
                u8c u8cVar = my7Var.c;
                fdi fdiVar = my7Var.l;
                return new qx7(u8cVar, (k6c) fdiVar.getValue(), my7Var.d.b((k6c) fdiVar.getValue()));
            case 6:
                ArrayList arrayList = ((dv8) obj).a;
                x0d x0dVar = new x0d(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    uia uiaVar = (uia) arrayList.get(i2);
                    Object obj2 = uiaVar.b;
                    int i3 = uiaVar.a;
                    uyc.a(x0dVar, obj2 != null ? new tea(Integer.valueOf(i3), uiaVar.b) : Integer.valueOf(i3), uiaVar);
                }
                return new uyc(x0dVar);
            case 7:
                Context context = ((lxa) obj).getContext();
                context.getClass();
                nv.S(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, lv.LEAGUE_DETAILS, context, "nba_goat");
                return Unit.a;
            case 8:
                LeagueStandingsFragment leagueStandingsFragment = (LeagueStandingsFragment) obj;
                joa joaVar = leagueStandingsFragment.u;
                if (((String) joaVar.getValue()) != null) {
                    jai D = leagueStandingsFragment.D();
                    String str = (String) joaVar.getValue();
                    if (str == null) {
                        str = "";
                    }
                    int G = D.G(str);
                    valueOf = G > 0 ? Integer.valueOf(G) : null;
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        krk krkVar = leagueStandingsFragment.l;
                        krkVar.getClass();
                        n layoutManager = ((oo8) krkVar).d.getLayoutManager();
                        layoutManager.getClass();
                        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(intValue, 0);
                    }
                } else {
                    int H = leagueStandingsFragment.D().H(leagueStandingsFragment.E().getId());
                    valueOf = H > 0 ? Integer.valueOf(H) : null;
                    if (valueOf != null) {
                        int intValue2 = valueOf.intValue();
                        krk krkVar2 = leagueStandingsFragment.l;
                        krkVar2.getClass();
                        n layoutManager2 = ((oo8) krkVar2).d.getLayoutManager();
                        layoutManager2.getClass();
                        ((LinearLayoutManager) layoutManager2).scrollToPositionWithOffset(intValue2, 0);
                    }
                }
                return Unit.a;
            case 9:
                return new c2e(((m2e) obj).e);
            case 10:
                ((Function0) obj).invoke();
                return Unit.a;
            case 11:
                long currentTimeMillis = System.currentTimeMillis();
                boh bohVar = (boh) obj;
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                }
                return Unit.a;
            case 12:
                lmj lmjVar = (lmj) obj;
                Context context2 = lmjVar.getContext();
                context2.getClass();
                nv.S(lmjVar.n, lv.EVENT_DETAILS, context2, "POTMVote");
                return Unit.a;
            case 13:
                return new jn3[((z88[]) obj).length];
            default:
                return gvd.v((Context) obj, "ad_quality_data.pb");
        }
    }
}
