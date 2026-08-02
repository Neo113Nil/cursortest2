package com.sofascore.network.api;

import defpackage.c2g;
import defpackage.rq3;
import defpackage.s59;
import defpackage.vae;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\rJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0010\u0010\rJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/sofascore/network/api/FantasyHeadAPI;", "", "", "userId", "", "roundId", "Lc2g;", "", "hasUserRound", "(Ljava/lang/String;ILrq3;)Ljava/lang/Object;", "hasUserRoundRankings", "playerId", "hasPlayer", "(ILrq3;)Ljava/lang/Object;", "hasTeamOfTheRound", "competitionId", "hasTopPlayersPerRound", "id", "getHasUserFinishedCompetitions", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FantasyHeadAPI {
    @s59("api/v1/fantasy/user/{id}/finished-competitions")
    @Nullable
    Object getHasUserFinishedCompetitions(@NotNull @vae("id") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/fantasy/player/{id}")
    @Nullable
    Object hasPlayer(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/fantasy/round/{roundId}/team-of-the-round")
    @Nullable
    Object hasTeamOfTheRound(@vae("roundId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/fantasy/competition/{competitionId}/top-players-per-round")
    @Nullable
    Object hasTopPlayersPerRound(@vae("competitionId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/fantasy/user/{userId}/round/{roundId}")
    @Nullable
    Object hasUserRound(@NotNull @vae("userId") String str, @vae("roundId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/fantasy/user/{userId}/round/{roundId}/ranking-overview")
    @Nullable
    Object hasUserRoundRankings(@NotNull @vae("userId") String str, @vae("roundId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);
}
