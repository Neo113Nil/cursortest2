package com.sofascore.model.util;

import com.appsflyer.internal.i;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.dmi;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/sofascore/model/util/ComebackScheduleTournament;", "Ljava/io/Serializable;", "uniqueTournamentId", "", SearchResponseKt.SPORT_ENTITY, "", "tournamentName", "startTimestamp", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;J)V", "getUniqueTournamentId", "()I", "getSport", "()Ljava/lang/String;", "getTournamentName", "getStartTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ComebackScheduleTournament implements Serializable {

    @NotNull
    private final String sport;
    private final long startTimestamp;

    @NotNull
    private final String tournamentName;
    private final int uniqueTournamentId;

    public ComebackScheduleTournament(int i, @NotNull String str, @NotNull String str2, long j) {
        str.getClass();
        str2.getClass();
        this.uniqueTournamentId = i;
        this.sport = str;
        this.tournamentName = str2;
        this.startTimestamp = j;
    }

    public static /* synthetic */ ComebackScheduleTournament copy$default(ComebackScheduleTournament comebackScheduleTournament, int i, String str, String str2, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = comebackScheduleTournament.uniqueTournamentId;
        }
        if ((i2 & 2) != 0) {
            str = comebackScheduleTournament.sport;
        }
        if ((i2 & 4) != 0) {
            str2 = comebackScheduleTournament.tournamentName;
        }
        if ((i2 & 8) != 0) {
            j = comebackScheduleTournament.startTimestamp;
        }
        String str3 = str2;
        return comebackScheduleTournament.copy(i, str, str3, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSport() {
        return this.sport;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTournamentName() {
        return this.tournamentName;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @NotNull
    public final ComebackScheduleTournament copy(int uniqueTournamentId, @NotNull String sport, @NotNull String tournamentName, long startTimestamp) {
        sport.getClass();
        tournamentName.getClass();
        return new ComebackScheduleTournament(uniqueTournamentId, sport, tournamentName, startTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComebackScheduleTournament)) {
            return false;
        }
        ComebackScheduleTournament comebackScheduleTournament = (ComebackScheduleTournament) other;
        return this.uniqueTournamentId == comebackScheduleTournament.uniqueTournamentId && Intrinsics.c(this.sport, comebackScheduleTournament.sport) && Intrinsics.c(this.tournamentName, comebackScheduleTournament.tournamentName) && this.startTimestamp == comebackScheduleTournament.startTimestamp;
    }

    @NotNull
    public final String getSport() {
        return this.sport;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @NotNull
    public final String getTournamentName() {
        return this.tournamentName;
    }

    public final int getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    public int hashCode() {
        return Long.hashCode(this.startTimestamp) + dmi.c(dmi.c(Integer.hashCode(this.uniqueTournamentId) * 31, 31, this.sport), 31, this.tournamentName);
    }

    @NotNull
    public String toString() {
        int i = this.uniqueTournamentId;
        String str = this.sport;
        String str2 = this.tournamentName;
        long j = this.startTimestamp;
        StringBuilder t = dmi.t(i, "ComebackScheduleTournament(uniqueTournamentId=", ", sport=", str, ", tournamentName=");
        i.n(j, str2, ", startTimestamp=", t);
        t.append(")");
        return t.toString();
    }
}
