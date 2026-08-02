package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.fc6;
import defpackage.joa;
import defpackage.lkb;
import defpackage.mz1;
import defpackage.oea;
import defpackage.pxk;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JP\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\"¨\u00068"}, d2 = {"Lcom/sofascore/model/newNetwork/WSCGameData;", "", "", "eventId", "uniqueTournamentId", "seasonId", "", "gameDate", "", "Lcom/sofascore/model/newNetwork/WSCTeamData;", "teams", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/WSCGameData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/lang/Long;", "component5", "()Ljava/util/List;", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;)Lcom/sofascore/model/newNetwork/WSCGameData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getEventId", "Ljava/lang/Integer;", "getUniqueTournamentId", "getSeasonId", "Ljava/lang/Long;", "getGameDate", "Ljava/util/List;", "getTeams", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WSCGameData {
    private final int eventId;

    @Nullable
    private final Long gameDate;

    @Nullable
    private final Integer seasonId;

    @Nullable
    private final List<WSCTeamData> teams;

    @Nullable
    private final Integer uniqueTournamentId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, ypa.a(ysa.b, new pxk(27))};

    public /* synthetic */ WSCGameData(int i, int i2, Integer num, Integer num2, Long l, List list, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, WSCGameData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventId = i2;
        this.uniqueTournamentId = num;
        this.seasonId = num2;
        this.gameDate = l;
        this.teams = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(WSCTeamData$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ WSCGameData copy$default(WSCGameData wSCGameData, int i, Integer num, Integer num2, Long l, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wSCGameData.eventId;
        }
        if ((i2 & 2) != 0) {
            num = wSCGameData.uniqueTournamentId;
        }
        if ((i2 & 4) != 0) {
            num2 = wSCGameData.seasonId;
        }
        if ((i2 & 8) != 0) {
            l = wSCGameData.gameDate;
        }
        if ((i2 & 16) != 0) {
            list = wSCGameData.teams;
        }
        List list2 = list;
        Integer num3 = num2;
        return wSCGameData.copy(i, num, num3, l, list2);
    }

    public static final /* synthetic */ void write$Self$model_release(WSCGameData self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.eventId, serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.uniqueTournamentId);
        output.h(serialDesc, 2, a7aVar, self.seasonId);
        output.h(serialDesc, 3, lkb.a, self.gameDate);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.teams);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getSeasonId() {
        return this.seasonId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getGameDate() {
        return this.gameDate;
    }

    @Nullable
    public final List<WSCTeamData> component5() {
        return this.teams;
    }

    @NotNull
    public final WSCGameData copy(int eventId, @Nullable Integer uniqueTournamentId, @Nullable Integer seasonId, @Nullable Long gameDate, @Nullable List<WSCTeamData> teams) {
        return new WSCGameData(eventId, uniqueTournamentId, seasonId, gameDate, teams);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WSCGameData)) {
            return false;
        }
        WSCGameData wSCGameData = (WSCGameData) other;
        return this.eventId == wSCGameData.eventId && Intrinsics.c(this.uniqueTournamentId, wSCGameData.uniqueTournamentId) && Intrinsics.c(this.seasonId, wSCGameData.seasonId) && Intrinsics.c(this.gameDate, wSCGameData.gameDate) && Intrinsics.c(this.teams, wSCGameData.teams);
    }

    public final int getEventId() {
        return this.eventId;
    }

    @Nullable
    public final Long getGameDate() {
        return this.gameDate;
    }

    @Nullable
    public final Integer getSeasonId() {
        return this.seasonId;
    }

    @Nullable
    public final List<WSCTeamData> getTeams() {
        return this.teams;
    }

    @Nullable
    public final Integer getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.eventId) * 31;
        Integer num = this.uniqueTournamentId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.seasonId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.gameDate;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        List<WSCTeamData> list = this.teams;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.eventId;
        Integer num = this.uniqueTournamentId;
        Integer num2 = this.seasonId;
        Long l = this.gameDate;
        List<WSCTeamData> list = this.teams;
        StringBuilder r = fc6.r("WSCGameData(eventId=", ", uniqueTournamentId=", ", seasonId=", num, i);
        r.append(num2);
        r.append(", gameDate=");
        r.append(l);
        r.append(", teams=");
        return mz1.p(r, list, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/WSCGameData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/WSCGameData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return WSCGameData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WSCGameData(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l, @Nullable List<WSCTeamData> list) {
        this.eventId = i;
        this.uniqueTournamentId = num;
        this.seasonId = num2;
        this.gameDate = l;
        this.teams = list;
    }
}
