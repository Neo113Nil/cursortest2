package com.sofascore.model.database;

import com.sofascore.model.mvvm.model.Score;
import defpackage.me4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sofascore/model/database/DbEventScore;", "", "eventId", "", "homeScore", "Lcom/sofascore/model/mvvm/model/Score;", "awayScore", "<init>", "(ILcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;)V", "getEventId", "()I", "getHomeScore", "()Lcom/sofascore/model/mvvm/model/Score;", "getAwayScore", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbEventScore {

    @NotNull
    private final Score awayScore;
    private final int eventId;

    @NotNull
    private final Score homeScore;

    public DbEventScore(int i, @NotNull Score score, @NotNull Score score2) {
        score.getClass();
        score2.getClass();
        this.eventId = i;
        this.homeScore = score;
        this.awayScore = score2;
    }

    public static /* synthetic */ DbEventScore copy$default(DbEventScore dbEventScore, int i, Score score, Score score2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dbEventScore.eventId;
        }
        if ((i2 & 2) != 0) {
            score = dbEventScore.homeScore;
        }
        if ((i2 & 4) != 0) {
            score2 = dbEventScore.awayScore;
        }
        return dbEventScore.copy(i, score, score2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Score getHomeScore() {
        return this.homeScore;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Score getAwayScore() {
        return this.awayScore;
    }

    @NotNull
    public final DbEventScore copy(int eventId, @NotNull Score homeScore, @NotNull Score awayScore) {
        homeScore.getClass();
        awayScore.getClass();
        return new DbEventScore(eventId, homeScore, awayScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbEventScore)) {
            return false;
        }
        DbEventScore dbEventScore = (DbEventScore) other;
        return this.eventId == dbEventScore.eventId && Intrinsics.c(this.homeScore, dbEventScore.homeScore) && Intrinsics.c(this.awayScore, dbEventScore.awayScore);
    }

    @NotNull
    public final Score getAwayScore() {
        return this.awayScore;
    }

    public final int getEventId() {
        return this.eventId;
    }

    @NotNull
    public final Score getHomeScore() {
        return this.homeScore;
    }

    public int hashCode() {
        return this.awayScore.hashCode() + me4.c(this.homeScore, Integer.hashCode(this.eventId) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "DbEventScore(eventId=" + this.eventId + ", homeScore=" + this.homeScore + ", awayScore=" + this.awayScore + ")";
    }
}
