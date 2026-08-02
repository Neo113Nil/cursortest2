package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.WorkerParameters;
import com.sofascore.localPersistence.database.AppDatabase;
import com.sofascore.network.api.NetworkCoroutineAPI;
import com.sofascore.results.branding.BrandingConfigWorker;
import com.sofascore.results.fantasy.shared.FantasyWorker;
import com.sofascore.results.league.service.LeagueWorker;
import com.sofascore.results.player.PlayerWorker;
import com.sofascore.results.service.ChatMessageWorker;
import com.sofascore.results.service.FavoriteWorker;
import com.sofascore.results.service.InfoWorker;
import com.sofascore.results.service.MuteStageWorker;
import com.sofascore.results.service.NewlyAddedEventsWorker;
import com.sofascore.results.service.NotificationWorker;
import com.sofascore.results.service.OrderedSportsWorker;
import com.sofascore.results.service.PinnedLeagueWorker;
import com.sofascore.results.service.PlayerOfTheMatchVoteWorker;
import com.sofascore.results.service.ProfileWorker;
import com.sofascore.results.service.RegistrationWorker;
import com.sofascore.results.service.StageWorker;
import com.sofascore.results.service.StartWorker;
import com.sofascore.results.service.SyncWorker;
import com.sofascore.results.service.VideoWorker;
import com.sofascore.results.service.VoteWorker;
import com.sofascore.results.service.WeeklyChallengeWorker;
import com.sofascore.results.service.WidgetFavoriteWorker;
import com.sofascore.results.service.WidgetPeriodicRefreshWorker;
import com.sofascore.results.service.game.SyncEventsWorker;
import com.sofascore.results.service.game.SyncMutedEventsWorker;
import com.sofascore.results.sofaSeason.SofaSeasonWorker;
import com.sofascore.results.team.TeamWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ab9 extends ucl {
    public final awf a;

    public ab9(awf awfVar) {
        this.a = awfVar;
    }

    @Override // defpackage.ucl
    public final kdb a(Context context, String str, WorkerParameters workerParameters) {
        kdb pinnedLeagueWorker;
        yff yffVar = (yff) this.a.get(str);
        if (yffVar == null) {
            return null;
        }
        lc4 lc4Var = (lc4) yffVar.get();
        switch (lc4Var.a) {
            case 0:
                return new OrderedSportsWorker(context, workerParameters, (gzh) lc4Var.b.b.d0.get());
            case 1:
                mc4 mc4Var = lc4Var.b.b;
                pinnedLeagueWorker = new PinnedLeagueWorker(context, workerParameters, (w3b) mc4Var.H.get(), (vrj) mc4Var.f0.get(), (dhk) mc4Var.N.get(), (SharedPreferences) mc4Var.l.get());
                break;
            case 2:
                return new PlayerOfTheMatchVoteWorker(context, workerParameters, (zte) lc4Var.b.b.R.get());
            case 3:
                mc4 mc4Var2 = lc4Var.b.b;
                pinnedLeagueWorker = new PlayerWorker(context, workerParameters, (wve) mc4Var2.J.get(), (jid) mc4Var2.O.get(), (udl) mc4Var2.S.get());
                break;
            case 4:
                mc4 mc4Var3 = lc4Var.b.b;
                return new ProfileWorker(context, workerParameters, (dhk) mc4Var3.N.get(), (bfk) mc4Var3.k.get());
            case 5:
                mc4 mc4Var4 = lc4Var.b.b;
                pinnedLeagueWorker = new RegistrationWorker(context, workerParameters, (bfk) mc4Var4.k.get(), (dhk) mc4Var4.N.get(), (SharedPreferences) mc4Var4.l.get(), (fyk) mc4Var4.Q.get(), (zte) mc4Var4.R.get(), (a3l) mc4Var4.k0.get(), (jid) mc4Var4.O.get());
                break;
            case 6:
                mc4 mc4Var5 = lc4Var.b.b;
                return new SofaSeasonWorker(context, workerParameters, (SharedPreferences) mc4Var5.l.get(), (dhk) mc4Var5.N.get());
            case 7:
                mc4 mc4Var6 = lc4Var.b.b;
                pinnedLeagueWorker = new StageWorker(context, workerParameters, (qa6) mc4Var6.K.get(), (s96) mc4Var6.U.get(), (tak) mc4Var6.L.get(), (jid) mc4Var6.O.get());
                break;
            case 8:
                mc4 mc4Var7 = lc4Var.b.b;
                dhk dhkVar = (dhk) mc4Var7.N.get();
                m7c m7cVar = (m7c) mc4Var7.o0.get();
                fyk fykVar = (fyk) mc4Var7.Q.get();
                zte zteVar = (zte) mc4Var7.R.get();
                irk irkVar = (irk) mc4Var7.P.get();
                cs2 cs2Var = (cs2) mc4Var7.C.get();
                z3k z3kVar = (z3k) mc4Var7.p0.get();
                qa6 qa6Var = (qa6) mc4Var7.K.get();
                e64 e64Var = (e64) mc4Var7.q0.get();
                el elVar = (el) mc4Var7.w.get();
                jid jidVar = (jid) mc4Var7.O.get();
                w00 w00Var = mc4Var7.c;
                wld wldVar = new wld(w00Var.b, (umd) mc4Var7.r0.get());
                jx9 jx9Var = new jx9(w00Var.b);
                nge ngeVar = new nge((NetworkCoroutineAPI) mc4Var7.G.get(), (udl) mc4Var7.S.get());
                fkk fkkVar = new fkk((dhk) mc4Var7.N.get(), w00Var.b, (SharedPreferences) mc4Var7.l.get());
                ihk ihkVar = new ihk(w00Var.b, (dhk) mc4Var7.N.get());
                AppDatabase appDatabase = (AppDatabase) mc4Var7.z.get();
                appDatabase.getClass();
                z4d l = appDatabase.l();
                w3a.q(l);
                return new StartWorker(context, workerParameters, dhkVar, m7cVar, fykVar, zteVar, irkVar, cs2Var, z3kVar, qa6Var, e64Var, elVar, jidVar, wldVar, jx9Var, ngeVar, fkkVar, ihkVar, l, (udl) mc4Var7.S.get());
            case 9:
                mc4 mc4Var8 = lc4Var.b.b;
                return new SyncEventsWorker(context, workerParameters, (qa6) mc4Var8.K.get(), (dhk) mc4Var8.N.get());
            case 10:
                mc4 mc4Var9 = lc4Var.b.b;
                return new BrandingConfigWorker(context, workerParameters, (el) mc4Var9.w.get(), (ye4) mc4Var9.x.get());
            case 11:
                mc4 mc4Var10 = lc4Var.b.b;
                return new SyncMutedEventsWorker(context, workerParameters, (qa6) mc4Var10.K.get(), (dhk) mc4Var10.N.get());
            case 12:
                mc4 mc4Var11 = lc4Var.b.b;
                pinnedLeagueWorker = new SyncWorker(context, workerParameters, (ku3) mc4Var11.j.get(), (bfk) mc4Var11.k.get(), (w3b) mc4Var11.H.get(), (qa6) mc4Var11.K.get(), (s96) mc4Var11.U.get(), (wve) mc4Var11.J.get(), (j0j) mc4Var11.I.get(), (dhk) mc4Var11.N.get(), (tak) mc4Var11.L.get(), (wi7) mc4Var11.F.get(), (el) mc4Var11.w.get(), (udl) mc4Var11.S.get(), (jid) mc4Var11.O.get(), (SharedPreferences) mc4Var11.l.get());
                break;
            case 13:
                mc4 mc4Var12 = lc4Var.b.b;
                pinnedLeagueWorker = new TeamWorker(context, workerParameters, (j0j) mc4Var12.I.get(), (qa6) mc4Var12.K.get(), (s96) mc4Var12.U.get(), (jid) mc4Var12.O.get(), (udl) mc4Var12.S.get());
                break;
            case 14:
                mc4 mc4Var13 = lc4Var.b.b;
                return new VideoWorker(context, workerParameters, (irk) mc4Var13.P.get(), (udl) mc4Var13.S.get());
            case 15:
                return new VoteWorker(context, workerParameters, (fyk) lc4Var.b.b.Q.get());
            case 16:
                mc4 mc4Var14 = lc4Var.b.b;
                return new WeeklyChallengeWorker(context, workerParameters, (bfk) mc4Var14.k.get(), (a3l) mc4Var14.k0.get());
            case 17:
                mc4 mc4Var15 = lc4Var.b.b;
                return new WidgetFavoriteWorker(context, workerParameters, new i7l((qa6) mc4Var15.K.get(), mc4Var15.a()));
            case 18:
                mc4 mc4Var16 = lc4Var.b.b;
                return new WidgetPeriodicRefreshWorker(context, workerParameters, new i7l((qa6) mc4Var16.K.get(), mc4Var16.a()));
            case 19:
                return new ChatMessageWorker(context, workerParameters, (cs2) lc4Var.b.b.C.get());
            case 20:
                mc4 mc4Var17 = lc4Var.b.b;
                pinnedLeagueWorker = new FantasyWorker(context, workerParameters, (wi7) mc4Var17.F.get(), (jid) mc4Var17.O.get(), (udl) mc4Var17.S.get());
                break;
            case 21:
                mc4 mc4Var18 = lc4Var.b.b;
                pinnedLeagueWorker = new FavoriteWorker(context, workerParameters, (qa6) mc4Var18.K.get(), (dhk) mc4Var18.N.get(), mc4Var18.a());
                break;
            case 22:
                mc4 mc4Var19 = lc4Var.b.b;
                return new InfoWorker(context, workerParameters, (z2a) mc4Var19.W.get(), (SharedPreferences) mc4Var19.l.get());
            case 23:
                mc4 mc4Var20 = lc4Var.b.b;
                pinnedLeagueWorker = new LeagueWorker(context, workerParameters, (w3b) mc4Var20.H.get(), (qa6) mc4Var20.K.get(), (s96) mc4Var20.U.get(), (jid) mc4Var20.O.get(), (udl) mc4Var20.S.get());
                break;
            case 24:
                mc4 mc4Var21 = lc4Var.b.b;
                pinnedLeagueWorker = new MuteStageWorker(context, workerParameters, (qa6) mc4Var21.K.get(), (s96) mc4Var21.U.get(), (jid) mc4Var21.O.get(), (udl) mc4Var21.S.get());
                break;
            case 25:
                mc4 mc4Var22 = lc4Var.b.b;
                pinnedLeagueWorker = new NewlyAddedEventsWorker(context, workerParameters, (s96) mc4Var22.U.get(), (qa6) mc4Var22.K.get(), (j0j) mc4Var22.I.get(), (w3b) mc4Var22.H.get());
                break;
            default:
                mc4 mc4Var23 = lc4Var.b.b;
                return new NotificationWorker(context, workerParameters, (yhd) mc4Var23.b0.get(), (jid) mc4Var23.O.get());
        }
        return pinnedLeagueWorker;
    }
}
