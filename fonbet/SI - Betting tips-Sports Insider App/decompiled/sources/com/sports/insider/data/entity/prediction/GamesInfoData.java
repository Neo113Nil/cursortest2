package com.sports.insider.data.entity.prediction;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000B+\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ:\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\"R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Lcom/sports/insider/data/entity/prediction/GamesInfoData;", "", "Lcom/sports/insider/data/entity/prediction/Game;", "gamesData", "Lcom/sports/insider/data/entity/prediction/LastGames;", "homeTeamData", "guestTeamData", "<init>", "(Ljava/util/List;Lcom/sports/insider/data/entity/prediction/LastGames;Lcom/sports/insider/data/entity/prediction/LastGames;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/sports/insider/data/entity/prediction/LastGames;", "component3", "copy", "(Ljava/util/List;Lcom/sports/insider/data/entity/prediction/LastGames;Lcom/sports/insider/data/entity/prediction/LastGames;)Lcom/sports/insider/data/entity/prediction/GamesInfoData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getGamesData", "setGamesData", "(Ljava/util/List;)V", "Lcom/sports/insider/data/entity/prediction/LastGames;", "getHomeTeamData", "setHomeTeamData", "(Lcom/sports/insider/data/entity/prediction/LastGames;)V", "getGuestTeamData", "setGuestTeamData", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GamesInfoData {

    @Nullable
    private List<Game> gamesData;

    @Nullable
    private LastGames guestTeamData;

    @Nullable
    private LastGames homeTeamData;

    public GamesInfoData(@Nullable List<Game> list, @Nullable LastGames lastGames, @Nullable LastGames lastGames2) {
        this.gamesData = list;
        this.homeTeamData = lastGames;
        this.guestTeamData = lastGames2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GamesInfoData copy$default(GamesInfoData gamesInfoData, List list, LastGames lastGames, LastGames lastGames2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = gamesInfoData.gamesData;
        }
        if ((i5 & 2) != 0) {
            lastGames = gamesInfoData.homeTeamData;
        }
        if ((i5 & 4) != 0) {
            lastGames2 = gamesInfoData.guestTeamData;
        }
        return gamesInfoData.copy(list, lastGames, lastGames2);
    }

    @Nullable
    public final List<Game> component1() {
        return this.gamesData;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final LastGames getHomeTeamData() {
        return this.homeTeamData;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final LastGames getGuestTeamData() {
        return this.guestTeamData;
    }

    @NotNull
    public final GamesInfoData copy(@Nullable List<Game> gamesData, @Nullable LastGames homeTeamData, @Nullable LastGames guestTeamData) {
        return new GamesInfoData(gamesData, homeTeamData, guestTeamData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GamesInfoData)) {
            return false;
        }
        GamesInfoData gamesInfoData = (GamesInfoData) other;
        return Intrinsics.areEqual(this.gamesData, gamesInfoData.gamesData) && Intrinsics.areEqual(this.homeTeamData, gamesInfoData.homeTeamData) && Intrinsics.areEqual(this.guestTeamData, gamesInfoData.guestTeamData);
    }

    @Nullable
    public List<Game> getGamesData() {
        return this.gamesData;
    }

    /* renamed from: getGuestTeamData, reason: collision with other method in class */
    public /* bridge */ c m97getGuestTeamData() {
        return getGuestTeamData();
    }

    /* renamed from: getHomeTeamData, reason: collision with other method in class */
    public /* bridge */ c m98getHomeTeamData() {
        return getHomeTeamData();
    }

    public int hashCode() {
        List<Game> list = this.gamesData;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        LastGames lastGames = this.homeTeamData;
        int hashCode2 = (hashCode + (lastGames == null ? 0 : lastGames.hashCode())) * 31;
        LastGames lastGames2 = this.guestTeamData;
        return hashCode2 + (lastGames2 != null ? lastGames2.hashCode() : 0);
    }

    public void setGamesData(@Nullable List<Game> list) {
        this.gamesData = list;
    }

    public void setGuestTeamData(@Nullable LastGames lastGames) {
        this.guestTeamData = lastGames;
    }

    public void setHomeTeamData(@Nullable LastGames lastGames) {
        this.homeTeamData = lastGames;
    }

    @NotNull
    public String toString() {
        return "GamesInfoData(gamesData=" + this.gamesData + ", homeTeamData=" + this.homeTeamData + ", guestTeamData=" + this.guestTeamData + ')';
    }

    @Nullable
    public LastGames getGuestTeamData() {
        return this.guestTeamData;
    }

    @Nullable
    public LastGames getHomeTeamData() {
        return this.homeTeamData;
    }
}
