package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.historical.LeagueHistoricalDataActivity;
import com.sofascore.results.manager.ManagerActivity;
import com.sofascore.results.manager.details.ManagerDetailsFragment;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.player.details.PlayerDetailsFragment;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFragment;
import com.sofascore.results.venue.VenueActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class l8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l8(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                m8 m8Var = (m8) obj;
                Integer num = m8Var.d;
                m8Var.j((num != null && num.intValue() == i2) ? -1 : i2);
                m8Var.getOnClickListener().a(i2, m8Var.getTypesList().get(i2));
                Function2<String, Integer, Unit> onSelectedCallback = m8Var.getOnSelectedCallback();
                if (onSelectedCallback != null) {
                    onSelectedCallback.invoke(m8Var.getTypesList().get(i2), Integer.valueOf(i2));
                    break;
                }
                break;
            case 1:
                int i3 = TeamActivity.Z;
                Context context = ((r63) obj).getContext();
                context.getClass();
                jle.r(context, this.b, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 2:
                wxf wxfVar = EventActivity.h0;
                Context context2 = ((c68) obj).getContext();
                context2.getClass();
                wxf.B(context2, this.b, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 3:
                ib9 ib9Var = (ib9) obj;
                Context context3 = ib9Var.getContext();
                context3.getClass();
                nv.z0(context3, kv.CLICK, "explore_button", "historical_data");
                int i4 = LeagueHistoricalDataActivity.Q;
                Context context4 = ib9Var.getContext();
                context4.getClass();
                Intent intent = new Intent(context4, (Class<?>) LeagueHistoricalDataActivity.class);
                intent.putExtra("uniqueTournamentId", i2);
                intent.putExtra("seasonId", (Serializable) null);
                context4.startActivity(intent);
                break;
            case 4:
                int i5 = PlayerActivity.Z;
                Context requireContext = ((ManagerDetailsFragment) obj).requireContext();
                requireContext.getClass();
                jle.q(requireContext, this.b, 0, null, null, false, null, null, 472);
                break;
            case 5:
                int i6 = VenueActivity.Q;
                Context context5 = ((xvb) obj).getContext();
                context5.getClass();
                Intent intent2 = new Intent(context5, (Class<?>) VenueActivity.class);
                intent2.putExtra("venue_id", i2);
                context5.startActivity(intent2);
                break;
            case 6:
                gne gneVar = (gne) obj;
                one oneVar = (one) gneVar.e;
                if (i2 != gneVar.d) {
                    oneVar.setPlaybackSpeed(gneVar.c[i2]);
                }
                oneVar.r.dismiss();
                break;
            case 7:
                int i7 = ManagerActivity.R;
                Context requireContext2 = ((PlayerDetailsFragment) obj).requireContext();
                requireContext2.getClass();
                bea.M(i2, requireContext2);
                break;
            case 8:
                int i8 = TeamActivity.Z;
                Context context6 = ((u5f) obj).getContext();
                context6.getClass();
                jle.r(context6, this.b, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 9:
                kf8 kf8Var = (kf8) obj;
                kf8Var.d(i2);
                ((mme) kf8Var.f).invoke(Integer.valueOf(i2));
                break;
            case 10:
                int i9 = TeamActivity.Z;
                Context context7 = ((TextView) obj).getContext();
                context7.getClass();
                jle.r(context7, this.b, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 11:
                ((a8i) obj).n.invoke(Integer.valueOf(i2));
                break;
            case 12:
                gne gneVar2 = (gne) obj;
                cji cjiVar = (cji) gneVar2.e;
                if (i2 != gneVar2.d) {
                    cjiVar.setPlaybackSpeed(gneVar2.c[i2]);
                }
                cjiVar.k.dismiss();
                break;
            default:
                TeamPlayerStatsFragment teamPlayerStatsFragment = (TeamPlayerStatsFragment) obj;
                tyi F = teamPlayerStatsFragment.F();
                F.o = i2;
                yzc yzcVar = F.i;
                List list = (List) yzcVar.d();
                if (list != null) {
                    yzcVar.j(CollectionsKt.H0(list, new d5c(F.o, 4)));
                }
                nk2 nk2Var = teamPlayerStatsFragment.F().n;
                if (nk2Var != null) {
                    teamPlayerStatsFragment.G(nk2Var, (tug) teamPlayerStatsFragment.C.getValue(), i2, false);
                }
                krk krkVar = teamPlayerStatsFragment.l;
                krkVar.getClass();
                ((xq8) krkVar).c.scrollToPosition(0);
                break;
        }
    }
}
