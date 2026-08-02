package com.sports.insider.data.entity.prediction;

import androidx.annotation.Keep;
import d9.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ@\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001fR*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u001fR\"\u0010\b\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u001f¨\u0006("}, d2 = {"Lcom/sports/insider/data/entity/prediction/LastGames;", "Lnc/c;", "", "draws", "", "Lcom/sports/insider/data/entity/prediction/Game;", "games", "loses", "wins", "<init>", "(ILjava/util/List;II)V", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "component4", "copy", "(ILjava/util/List;II)Lcom/sports/insider/data/entity/prediction/LastGames;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getDraws", "setDraws", "(I)V", "Ljava/util/List;", "getGames", "setGames", "(Ljava/util/List;)V", "getLoses", "setLoses", "getWins", "setWins", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LastGames implements c {
    private int draws;

    @Nullable
    private List<Game> games;
    private int loses;
    private int wins;

    public LastGames(int i5, @Nullable List<Game> list, int i10, int i11) {
        this.draws = i5;
        this.games = list;
        this.loses = i10;
        this.wins = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LastGames copy$default(LastGames lastGames, int i5, List list, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i5 = lastGames.draws;
        }
        if ((i12 & 2) != 0) {
            list = lastGames.games;
        }
        if ((i12 & 4) != 0) {
            i10 = lastGames.loses;
        }
        if ((i12 & 8) != 0) {
            i11 = lastGames.wins;
        }
        return lastGames.copy(i5, list, i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDraws() {
        return this.draws;
    }

    @Nullable
    public final List<Game> component2() {
        return this.games;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLoses() {
        return this.loses;
    }

    /* renamed from: component4, reason: from getter */
    public final int getWins() {
        return this.wins;
    }

    @NotNull
    public final LastGames copy(int draws, @Nullable List<Game> games, int loses, int wins) {
        return new LastGames(draws, games, loses, wins);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastGames)) {
            return false;
        }
        LastGames lastGames = (LastGames) other;
        return this.draws == lastGames.draws && Intrinsics.areEqual(this.games, lastGames.games) && this.loses == lastGames.loses && this.wins == lastGames.wins;
    }

    @Override // nc.c
    public int getDraws() {
        return this.draws;
    }

    @Override // nc.c
    @Nullable
    public List<Game> getGames() {
        return this.games;
    }

    @Override // nc.c
    public int getLoses() {
        return this.loses;
    }

    @Override // nc.c
    public int getWins() {
        return this.wins;
    }

    public int hashCode() {
        int i5 = this.draws * 31;
        List<Game> list = this.games;
        return ((((i5 + (list == null ? 0 : list.hashCode())) * 31) + this.loses) * 31) + this.wins;
    }

    public void setDraws(int i5) {
        this.draws = i5;
    }

    public void setGames(@Nullable List<Game> list) {
        this.games = list;
    }

    public void setLoses(int i5) {
        this.loses = i5;
    }

    public void setWins(int i5) {
        this.wins = i5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LastGames(draws=");
        sb2.append(this.draws);
        sb2.append(", games=");
        sb2.append(this.games);
        sb2.append(", loses=");
        sb2.append(this.loses);
        sb2.append(", wins=");
        return e.i(sb2, this.wins, ')');
    }
}
