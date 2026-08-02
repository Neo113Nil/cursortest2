package com.sofascore.results;

import android.content.SharedPreferences;
import defpackage.ab9;
import defpackage.b10;
import defpackage.bfk;
import defpackage.gf0;
import defpackage.ia0;
import defpackage.lv9;
import defpackage.mc4;
import defpackage.pwf;
import defpackage.t9d;
import defpackage.ti6;
import defpackage.v38;
import defpackage.vv8;
import defpackage.y65;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/ReleaseApp;", "Lia0;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReleaseApp extends ia0 implements vv8 {
    public boolean s = false;
    public final gf0 t = new gf0(new t9d(this));

    @Override // defpackage.uv8
    public final Object f() {
        return this.t.f();
    }

    @Override // defpackage.ia0, android.app.Application
    public final void onCreate() {
        if (!this.s) {
            this.s = true;
            mc4 mc4Var = (mc4) ((pwf) this.t.f());
            mc4Var.getClass();
            b10 e = lv9.e(27);
            e.A("com.sofascore.results.branding.BrandingConfigWorker", mc4Var.y);
            e.A("com.sofascore.results.service.ChatMessageWorker", mc4Var.D);
            e.A("com.sofascore.results.fantasy.shared.FantasyWorker", mc4Var.T);
            e.A("com.sofascore.results.service.FavoriteWorker", mc4Var.V);
            e.A("com.sofascore.results.service.InfoWorker", mc4Var.X);
            e.A("com.sofascore.results.league.service.LeagueWorker", mc4Var.Y);
            e.A("com.sofascore.results.service.MuteStageWorker", mc4Var.Z);
            e.A("com.sofascore.results.service.NewlyAddedEventsWorker", mc4Var.a0);
            e.A("com.sofascore.results.service.NotificationWorker", mc4Var.c0);
            e.A("com.sofascore.results.service.OrderedSportsWorker", mc4Var.e0);
            e.A("com.sofascore.results.service.PinnedLeagueWorker", mc4Var.g0);
            e.A("com.sofascore.results.service.PlayerOfTheMatchVoteWorker", mc4Var.h0);
            e.A("com.sofascore.results.player.PlayerWorker", mc4Var.i0);
            e.A("com.sofascore.results.service.ProfileWorker", mc4Var.j0);
            e.A("com.sofascore.results.service.RegistrationWorker", mc4Var.l0);
            e.A("com.sofascore.results.sofaSeason.SofaSeasonWorker", mc4Var.m0);
            e.A("com.sofascore.results.service.StageWorker", mc4Var.n0);
            e.A("com.sofascore.results.service.StartWorker", mc4Var.s0);
            e.A("com.sofascore.results.service.game.SyncEventsWorker", mc4Var.t0);
            e.A("com.sofascore.results.service.game.SyncMutedEventsWorker", mc4Var.u0);
            e.A("com.sofascore.results.service.SyncWorker", mc4Var.v0);
            e.A("com.sofascore.results.team.TeamWorker", mc4Var.w0);
            e.A("com.sofascore.results.service.VideoWorker", mc4Var.x0);
            e.A("com.sofascore.results.service.VoteWorker", mc4Var.y0);
            e.A("com.sofascore.results.service.WeeklyChallengeWorker", mc4Var.z0);
            e.A("com.sofascore.results.service.WidgetFavoriteWorker", mc4Var.A0);
            e.A("com.sofascore.results.service.WidgetPeriodicRefreshWorker", mc4Var.B0);
            this.d = new ab9(e.c(true));
            this.e = y65.a(mc4Var.S);
            this.f = y65.a(mc4Var.z);
            this.g = y65.a(mc4Var.o);
            this.h = (ti6) mc4Var.C0.get();
            this.i = (bfk) mc4Var.k.get();
            this.j = y65.a(mc4Var.D0);
            this.k = (v38) mc4Var.E0.get();
            this.l = (SharedPreferences) mc4Var.l.get();
            this.n = y65.a(mc4Var.H0);
            this.o = y65.a(mc4Var.I0);
        }
        super.onCreate();
    }
}
