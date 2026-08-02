package com.sofascore.model.database;

import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/sofascore/model/database/DbEventAll;", "", "event", "Lcom/sofascore/model/database/DbEvent;", "homeTeam", "Lcom/sofascore/model/mvvm/model/Team;", "awayTeam", "tournament", "Lcom/sofascore/model/mvvm/model/Tournament;", "score", "Lcom/sofascore/model/database/DbEventScore;", "<init>", "(Lcom/sofascore/model/database/DbEvent;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Tournament;Lcom/sofascore/model/database/DbEventScore;)V", "getEvent", "()Lcom/sofascore/model/database/DbEvent;", "getHomeTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "getAwayTeam", "getTournament", "()Lcom/sofascore/model/mvvm/model/Tournament;", "getScore", "()Lcom/sofascore/model/database/DbEventScore;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbEventAll {

    @Nullable
    private final Team awayTeam;

    @NotNull
    private final DbEvent event;

    @Nullable
    private final Team homeTeam;

    @Nullable
    private final DbEventScore score;

    @Nullable
    private final Tournament tournament;

    public DbEventAll(@NotNull DbEvent dbEvent, @Nullable Team team, @Nullable Team team2, @Nullable Tournament tournament, @Nullable DbEventScore dbEventScore) {
        dbEvent.getClass();
        this.event = dbEvent;
        this.homeTeam = team;
        this.awayTeam = team2;
        this.tournament = tournament;
        this.score = dbEventScore;
    }

    public static /* synthetic */ DbEventAll copy$default(DbEventAll dbEventAll, DbEvent dbEvent, Team team, Team team2, Tournament tournament, DbEventScore dbEventScore, int i, Object obj) {
        if ((i & 1) != 0) {
            dbEvent = dbEventAll.event;
        }
        if ((i & 2) != 0) {
            team = dbEventAll.homeTeam;
        }
        if ((i & 4) != 0) {
            team2 = dbEventAll.awayTeam;
        }
        if ((i & 8) != 0) {
            tournament = dbEventAll.tournament;
        }
        if ((i & 16) != 0) {
            dbEventScore = dbEventAll.score;
        }
        DbEventScore dbEventScore2 = dbEventScore;
        Team team3 = team2;
        return dbEventAll.copy(dbEvent, team, team3, tournament, dbEventScore2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DbEvent getEvent() {
        return this.event;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Team getHomeTeam() {
        return this.homeTeam;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Team getAwayTeam() {
        return this.awayTeam;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Tournament getTournament() {
        return this.tournament;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final DbEventScore getScore() {
        return this.score;
    }

    @NotNull
    public final DbEventAll copy(@NotNull DbEvent event, @Nullable Team homeTeam, @Nullable Team awayTeam, @Nullable Tournament tournament, @Nullable DbEventScore score) {
        event.getClass();
        return new DbEventAll(event, homeTeam, awayTeam, tournament, score);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbEventAll)) {
            return false;
        }
        DbEventAll dbEventAll = (DbEventAll) other;
        return Intrinsics.c(this.event, dbEventAll.event) && Intrinsics.c(this.homeTeam, dbEventAll.homeTeam) && Intrinsics.c(this.awayTeam, dbEventAll.awayTeam) && Intrinsics.c(this.tournament, dbEventAll.tournament) && Intrinsics.c(this.score, dbEventAll.score);
    }

    @Nullable
    public final Team getAwayTeam() {
        return this.awayTeam;
    }

    @NotNull
    public final DbEvent getEvent() {
        return this.event;
    }

    @Nullable
    public final Team getHomeTeam() {
        return this.homeTeam;
    }

    @Nullable
    public final DbEventScore getScore() {
        return this.score;
    }

    @Nullable
    public final Tournament getTournament() {
        return this.tournament;
    }

    public int hashCode() {
        int hashCode = this.event.hashCode() * 31;
        Team team = this.homeTeam;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        Team team2 = this.awayTeam;
        int hashCode3 = (hashCode2 + (team2 == null ? 0 : team2.hashCode())) * 31;
        Tournament tournament = this.tournament;
        int hashCode4 = (hashCode3 + (tournament == null ? 0 : tournament.hashCode())) * 31;
        DbEventScore dbEventScore = this.score;
        return hashCode4 + (dbEventScore != null ? dbEventScore.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DbEventAll(event=" + this.event + ", homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ", tournament=" + this.tournament + ", score=" + this.score + ")";
    }
}
