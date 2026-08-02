package com.sofascore.model.fantasy;

import defpackage.a7a;
import defpackage.dmi;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBO\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00065"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPlayerCompetitionIds;", "", "", "competitionId", "", "seasonName", "fantasyPlayerId", "uniqueTournamentId", "seasonId", "globalLeagueId", "<init>", "(ILjava/lang/String;IIILjava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;IIILjava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyPlayerCompetitionIds;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/String;IIILjava/lang/Integer;)Lcom/sofascore/model/fantasy/FantasyPlayerCompetitionIds;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCompetitionId", "Ljava/lang/String;", "getSeasonName", "getFantasyPlayerId", "getUniqueTournamentId", "getSeasonId", "Ljava/lang/Integer;", "getGlobalLeagueId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPlayerCompetitionIds {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int competitionId;
    private final int fantasyPlayerId;

    @Nullable
    private final Integer globalLeagueId;
    private final int seasonId;

    @NotNull
    private final String seasonName;
    private final int uniqueTournamentId;

    public /* synthetic */ FantasyPlayerCompetitionIds(int i, int i2, String str, int i3, int i4, int i5, Integer num, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, FantasyPlayerCompetitionIds$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.competitionId = i2;
        this.seasonName = str;
        this.fantasyPlayerId = i3;
        this.uniqueTournamentId = i4;
        this.seasonId = i5;
        this.globalLeagueId = num;
    }

    public static /* synthetic */ FantasyPlayerCompetitionIds copy$default(FantasyPlayerCompetitionIds fantasyPlayerCompetitionIds, int i, String str, int i2, int i3, int i4, Integer num, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = fantasyPlayerCompetitionIds.competitionId;
        }
        if ((i5 & 2) != 0) {
            str = fantasyPlayerCompetitionIds.seasonName;
        }
        if ((i5 & 4) != 0) {
            i2 = fantasyPlayerCompetitionIds.fantasyPlayerId;
        }
        if ((i5 & 8) != 0) {
            i3 = fantasyPlayerCompetitionIds.uniqueTournamentId;
        }
        if ((i5 & 16) != 0) {
            i4 = fantasyPlayerCompetitionIds.seasonId;
        }
        if ((i5 & 32) != 0) {
            num = fantasyPlayerCompetitionIds.globalLeagueId;
        }
        int i6 = i4;
        Integer num2 = num;
        return fantasyPlayerCompetitionIds.copy(i, str, i2, i3, i6, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyPlayerCompetitionIds self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.competitionId, serialDesc);
        output.y(serialDesc, 1, self.seasonName);
        output.u(2, self.fantasyPlayerId, serialDesc);
        output.u(3, self.uniqueTournamentId, serialDesc);
        output.u(4, self.seasonId, serialDesc);
        output.h(serialDesc, 5, a7a.a, self.globalLeagueId);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCompetitionId() {
        return this.competitionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSeasonName() {
        return this.seasonName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFantasyPlayerId() {
        return this.fantasyPlayerId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSeasonId() {
        return this.seasonId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getGlobalLeagueId() {
        return this.globalLeagueId;
    }

    @NotNull
    public final FantasyPlayerCompetitionIds copy(int competitionId, @NotNull String seasonName, int fantasyPlayerId, int uniqueTournamentId, int seasonId, @Nullable Integer globalLeagueId) {
        seasonName.getClass();
        return new FantasyPlayerCompetitionIds(competitionId, seasonName, fantasyPlayerId, uniqueTournamentId, seasonId, globalLeagueId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyPlayerCompetitionIds)) {
            return false;
        }
        FantasyPlayerCompetitionIds fantasyPlayerCompetitionIds = (FantasyPlayerCompetitionIds) other;
        return this.competitionId == fantasyPlayerCompetitionIds.competitionId && Intrinsics.c(this.seasonName, fantasyPlayerCompetitionIds.seasonName) && this.fantasyPlayerId == fantasyPlayerCompetitionIds.fantasyPlayerId && this.uniqueTournamentId == fantasyPlayerCompetitionIds.uniqueTournamentId && this.seasonId == fantasyPlayerCompetitionIds.seasonId && Intrinsics.c(this.globalLeagueId, fantasyPlayerCompetitionIds.globalLeagueId);
    }

    public final int getCompetitionId() {
        return this.competitionId;
    }

    public final int getFantasyPlayerId() {
        return this.fantasyPlayerId;
    }

    @Nullable
    public final Integer getGlobalLeagueId() {
        return this.globalLeagueId;
    }

    public final int getSeasonId() {
        return this.seasonId;
    }

    @NotNull
    public final String getSeasonName() {
        return this.seasonName;
    }

    public final int getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    public int hashCode() {
        int a = wv8.a(this.seasonId, wv8.a(this.uniqueTournamentId, wv8.a(this.fantasyPlayerId, dmi.c(Integer.hashCode(this.competitionId) * 31, 31, this.seasonName), 31), 31), 31);
        Integer num = this.globalLeagueId;
        return a + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.competitionId;
        String str = this.seasonName;
        int i2 = this.fantasyPlayerId;
        int i3 = this.uniqueTournamentId;
        int i4 = this.seasonId;
        Integer num = this.globalLeagueId;
        StringBuilder t = dmi.t(i, "FantasyPlayerCompetitionIds(competitionId=", ", seasonName=", str, ", fantasyPlayerId=");
        me4.q(t, i2, ", uniqueTournamentId=", i3, ", seasonId=");
        t.append(i4);
        t.append(", globalLeagueId=");
        t.append(num);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPlayerCompetitionIds$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPlayerCompetitionIds;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyPlayerCompetitionIds$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyPlayerCompetitionIds(int i, @NotNull String str, int i2, int i3, int i4, @Nullable Integer num) {
        str.getClass();
        this.competitionId = i;
        this.seasonName = str;
        this.fantasyPlayerId = i2;
        this.uniqueTournamentId = i3;
        this.seasonId = i4;
        this.globalLeagueId = num;
    }
}
