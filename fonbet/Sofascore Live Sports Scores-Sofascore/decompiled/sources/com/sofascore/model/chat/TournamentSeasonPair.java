package com.sofascore.model.chat;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.model.util.ChatInterface;
import defpackage.dmi;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J3\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f¨\u0006("}, d2 = {"Lcom/sofascore/model/chat/TournamentSeasonPair;", "Lcom/sofascore/model/util/ChatInterface;", "Ljava/io/Serializable;", "uniqueTournamentId", "", "tournamentTranslatedName", "", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "Lcom/sofascore/model/mvvm/model/Season;", "sportSlug", "<init>", "(ILjava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Ljava/lang/String;)V", "getUniqueTournamentId", "()I", "getTournamentTranslatedName", "()Ljava/lang/String;", "getSeason", "()Lcom/sofascore/model/mvvm/model/Season;", "getSportSlug", "chatId", "getChatId", "timestamp", "", "getTimestamp", "()J", "statusType", "getStatusType", "channelName", "getChannelName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TournamentSeasonPair implements ChatInterface, Serializable {

    @Nullable
    private final Season season;

    @NotNull
    private final String sportSlug;

    @NotNull
    private final String tournamentTranslatedName;
    private final int uniqueTournamentId;

    public TournamentSeasonPair(int i, @NotNull String str, @Nullable Season season, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.uniqueTournamentId = i;
        this.tournamentTranslatedName = str;
        this.season = season;
        this.sportSlug = str2;
    }

    public static /* synthetic */ TournamentSeasonPair copy$default(TournamentSeasonPair tournamentSeasonPair, int i, String str, Season season, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tournamentSeasonPair.uniqueTournamentId;
        }
        if ((i2 & 2) != 0) {
            str = tournamentSeasonPair.tournamentTranslatedName;
        }
        if ((i2 & 4) != 0) {
            season = tournamentSeasonPair.season;
        }
        if ((i2 & 8) != 0) {
            str2 = tournamentSeasonPair.sportSlug;
        }
        return tournamentSeasonPair.copy(i, str, season, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTournamentTranslatedName() {
        return this.tournamentTranslatedName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Season getSeason() {
        return this.season;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSportSlug() {
        return this.sportSlug;
    }

    @NotNull
    public final TournamentSeasonPair copy(int uniqueTournamentId, @NotNull String tournamentTranslatedName, @Nullable Season season, @NotNull String sportSlug) {
        tournamentTranslatedName.getClass();
        sportSlug.getClass();
        return new TournamentSeasonPair(uniqueTournamentId, tournamentTranslatedName, season, sportSlug);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentSeasonPair)) {
            return false;
        }
        TournamentSeasonPair tournamentSeasonPair = (TournamentSeasonPair) other;
        return this.uniqueTournamentId == tournamentSeasonPair.uniqueTournamentId && Intrinsics.c(this.tournamentTranslatedName, tournamentSeasonPair.tournamentTranslatedName) && Intrinsics.c(this.season, tournamentSeasonPair.season) && Intrinsics.c(this.sportSlug, tournamentSeasonPair.sportSlug);
    }

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getChannelName() {
        return "unique_tournament";
    }

    @Override // com.sofascore.model.util.ChatInterface
    public int getChatId() {
        return this.uniqueTournamentId;
    }

    @Nullable
    public final Season getSeason() {
        return this.season;
    }

    @NotNull
    public final String getSportSlug() {
        return this.sportSlug;
    }

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getStatusType() {
        return "";
    }

    @Override // com.sofascore.model.util.ChatInterface
    public long getTimestamp() {
        return 0L;
    }

    @NotNull
    public final String getTournamentTranslatedName() {
        return this.tournamentTranslatedName;
    }

    public final int getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.uniqueTournamentId) * 31, 31, this.tournamentTranslatedName);
        Season season = this.season;
        return this.sportSlug.hashCode() + ((c + (season == null ? 0 : season.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.uniqueTournamentId;
        String str = this.tournamentTranslatedName;
        Season season = this.season;
        String str2 = this.sportSlug;
        StringBuilder t = dmi.t(i, "TournamentSeasonPair(uniqueTournamentId=", ", tournamentTranslatedName=", str, ", season=");
        t.append(season);
        t.append(", sportSlug=");
        t.append(str2);
        t.append(")");
        return t.toString();
    }
}
