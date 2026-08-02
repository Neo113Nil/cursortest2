package com.sports.insider.data.entity.prediction;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u0000BE\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\\\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0002\u001a\u00020\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010$\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010'R\"\u0010\u0003\u001a\u00020\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010$\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010'R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010-R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010-R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u00103R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u0017\"\u0004\b6\u00107R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u00104\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u00107¨\u0006:"}, d2 = {"Lcom/sports/insider/data/entity/prediction/Game;", "Lcom/sports/insider/data/entity/prediction/Team;", "guestTeam", "homeTeam", "Lcom/sports/insider/data/entity/prediction/Score;", "score", "scoreExtra", "", "startTimeSec", "", "time", "leagueName", "<init>", "(Lcom/sports/insider/data/entity/prediction/Team;Lcom/sports/insider/data/entity/prediction/Team;Lcom/sports/insider/data/entity/prediction/Score;Lcom/sports/insider/data/entity/prediction/Score;JLjava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/sports/insider/data/entity/prediction/Team;", "component2", "component3", "()Lcom/sports/insider/data/entity/prediction/Score;", "component4", "component5", "()J", "component6", "()Ljava/lang/String;", "component7", "copy", "(Lcom/sports/insider/data/entity/prediction/Team;Lcom/sports/insider/data/entity/prediction/Team;Lcom/sports/insider/data/entity/prediction/Score;Lcom/sports/insider/data/entity/prediction/Score;JLjava/lang/String;Ljava/lang/String;)Lcom/sports/insider/data/entity/prediction/Game;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sports/insider/data/entity/prediction/Team;", "getGuestTeam", "setGuestTeam", "(Lcom/sports/insider/data/entity/prediction/Team;)V", "getHomeTeam", "setHomeTeam", "Lcom/sports/insider/data/entity/prediction/Score;", "getScore", "setScore", "(Lcom/sports/insider/data/entity/prediction/Score;)V", "getScoreExtra", "setScoreExtra", "J", "getStartTimeSec", "setStartTimeSec", "(J)V", "Ljava/lang/String;", "getTime", "setTime", "(Ljava/lang/String;)V", "getLeagueName", "setLeagueName", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Game {

    @NotNull
    private Team guestTeam;

    @NotNull
    private Team homeTeam;

    @Nullable
    private String leagueName;

    @Nullable
    private Score score;

    @Nullable
    private Score scoreExtra;
    private long startTimeSec;

    @NotNull
    private String time;

    public Game(@NotNull Team guestTeam, @NotNull Team homeTeam, @Nullable Score score, @Nullable Score score2, long j, @NotNull String time, @Nullable String str) {
        Intrinsics.checkNotNullParameter(guestTeam, "guestTeam");
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(time, "time");
        this.guestTeam = guestTeam;
        this.homeTeam = homeTeam;
        this.score = score;
        this.scoreExtra = score2;
        this.startTimeSec = j;
        this.time = time;
        this.leagueName = str;
    }

    public static /* synthetic */ Game copy$default(Game game, Team team, Team team2, Score score, Score score2, long j, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            team = game.guestTeam;
        }
        if ((i5 & 2) != 0) {
            team2 = game.homeTeam;
        }
        if ((i5 & 4) != 0) {
            score = game.score;
        }
        if ((i5 & 8) != 0) {
            score2 = game.scoreExtra;
        }
        if ((i5 & 16) != 0) {
            j = game.startTimeSec;
        }
        if ((i5 & 32) != 0) {
            str = game.time;
        }
        if ((i5 & 64) != 0) {
            str2 = game.leagueName;
        }
        long j6 = j;
        Score score3 = score;
        Score score4 = score2;
        return game.copy(team, team2, score3, score4, j6, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Team getGuestTeam() {
        return this.guestTeam;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Team getHomeTeam() {
        return this.homeTeam;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Score getScore() {
        return this.score;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Score getScoreExtra() {
        return this.scoreExtra;
    }

    /* renamed from: component5, reason: from getter */
    public final long getStartTimeSec() {
        return this.startTimeSec;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    @NotNull
    public final Game copy(@NotNull Team guestTeam, @NotNull Team homeTeam, @Nullable Score score, @Nullable Score scoreExtra, long startTimeSec, @NotNull String time, @Nullable String leagueName) {
        Intrinsics.checkNotNullParameter(guestTeam, "guestTeam");
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(time, "time");
        return new Game(guestTeam, homeTeam, score, scoreExtra, startTimeSec, time, leagueName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Game)) {
            return false;
        }
        Game game = (Game) other;
        return Intrinsics.areEqual(this.guestTeam, game.guestTeam) && Intrinsics.areEqual(this.homeTeam, game.homeTeam) && Intrinsics.areEqual(this.score, game.score) && Intrinsics.areEqual(this.scoreExtra, game.scoreExtra) && this.startTimeSec == game.startTimeSec && Intrinsics.areEqual(this.time, game.time) && Intrinsics.areEqual(this.leagueName, game.leagueName);
    }

    /* renamed from: getGuestTeam, reason: collision with other method in class */
    public /* bridge */ e m93getGuestTeam() {
        return getGuestTeam();
    }

    /* renamed from: getHomeTeam, reason: collision with other method in class */
    public /* bridge */ e m94getHomeTeam() {
        return getHomeTeam();
    }

    @Nullable
    public String getLeagueName() {
        return this.leagueName;
    }

    public long getStartTimeSec() {
        return this.startTimeSec;
    }

    @NotNull
    public String getTime() {
        return this.time;
    }

    public int hashCode() {
        int hashCode = (this.homeTeam.hashCode() + (this.guestTeam.hashCode() * 31)) * 31;
        Score score = this.score;
        int hashCode2 = (hashCode + (score == null ? 0 : score.hashCode())) * 31;
        Score score2 = this.scoreExtra;
        int hashCode3 = score2 == null ? 0 : score2.hashCode();
        long j = this.startTimeSec;
        int j6 = k.j((((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31, this.time);
        String str = this.leagueName;
        return j6 + (str != null ? str.hashCode() : 0);
    }

    public void setGuestTeam(@NotNull Team team) {
        Intrinsics.checkNotNullParameter(team, "<set-?>");
        this.guestTeam = team;
    }

    public void setHomeTeam(@NotNull Team team) {
        Intrinsics.checkNotNullParameter(team, "<set-?>");
        this.homeTeam = team;
    }

    public void setLeagueName(@Nullable String str) {
        this.leagueName = str;
    }

    public void setScore(@Nullable Score score) {
        this.score = score;
    }

    public void setScoreExtra(@Nullable Score score) {
        this.scoreExtra = score;
    }

    public void setStartTimeSec(long j) {
        this.startTimeSec = j;
    }

    public void setTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.time = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Game(guestTeam=");
        sb2.append(this.guestTeam);
        sb2.append(", homeTeam=");
        sb2.append(this.homeTeam);
        sb2.append(", score=");
        sb2.append(this.score);
        sb2.append(", scoreExtra=");
        sb2.append(this.scoreExtra);
        sb2.append(", startTimeSec=");
        sb2.append(this.startTimeSec);
        sb2.append(", time=");
        sb2.append(this.time);
        sb2.append(", leagueName=");
        return d9.e.k(sb2, this.leagueName, ')');
    }

    @NotNull
    public Team getGuestTeam() {
        return this.guestTeam;
    }

    @NotNull
    public Team getHomeTeam() {
        return this.homeTeam;
    }

    @Nullable
    /* renamed from: getScore, reason: merged with bridge method [inline-methods] */
    public Score m95getScore() {
        return this.score;
    }

    @Nullable
    /* renamed from: getScoreExtra, reason: merged with bridge method [inline-methods] */
    public Score m96getScoreExtra() {
        return this.scoreExtra;
    }
}
