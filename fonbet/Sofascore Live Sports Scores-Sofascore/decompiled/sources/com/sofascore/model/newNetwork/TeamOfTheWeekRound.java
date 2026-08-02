package com.sofascore.model.newNetwork;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.me4;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q5h(TeamOfTheWeekRoundsResponseKt.TOTW_ROUND)
@r5h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)JZ\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001fJ\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010)¨\u0006B"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamOfTheWeekRound;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekItem;", "", "id", "", "type", "periodName", "tournamentId", "Lcom/sofascore/model/newNetwork/TOTWRound;", TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, "", "createdAtTimestamp", "startDateTimestamp", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/TOTWRound;JLjava/lang/Long;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/TOTWRound;JLjava/lang/Long;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamOfTheWeekRound;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getItemName", "()Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Lcom/sofascore/model/newNetwork/TOTWRound;", "component6", "()J", "component7", "()Ljava/lang/Long;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/TOTWRound;JLjava/lang/Long;)Lcom/sofascore/model/newNetwork/TeamOfTheWeekRound;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getType", "getPeriodName", "Ljava/lang/Integer;", "getTournamentId", "Lcom/sofascore/model/newNetwork/TOTWRound;", "getRound", "J", "getCreatedAtTimestamp", "Ljava/lang/Long;", "getStartDateTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamOfTheWeekRound implements TeamOfTheWeekItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long createdAtTimestamp;
    private final int id;

    @NotNull
    private final String periodName;

    @NotNull
    private final TOTWRound round;

    @Nullable
    private final Long startDateTimestamp;

    @Nullable
    private final Integer tournamentId;

    @NotNull
    private final String type;

    public /* synthetic */ TeamOfTheWeekRound(int i, int i2, String str, String str2, Integer num, TOTWRound tOTWRound, long j, Long l, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, TeamOfTheWeekRound$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.type = str;
        this.periodName = str2;
        this.tournamentId = num;
        this.round = tOTWRound;
        this.createdAtTimestamp = j;
        this.startDateTimestamp = l;
    }

    public static /* synthetic */ TeamOfTheWeekRound copy$default(TeamOfTheWeekRound teamOfTheWeekRound, int i, String str, String str2, Integer num, TOTWRound tOTWRound, long j, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = teamOfTheWeekRound.id;
        }
        if ((i2 & 2) != 0) {
            str = teamOfTheWeekRound.type;
        }
        if ((i2 & 4) != 0) {
            str2 = teamOfTheWeekRound.periodName;
        }
        if ((i2 & 8) != 0) {
            num = teamOfTheWeekRound.tournamentId;
        }
        if ((i2 & 16) != 0) {
            tOTWRound = teamOfTheWeekRound.round;
        }
        if ((i2 & 32) != 0) {
            j = teamOfTheWeekRound.createdAtTimestamp;
        }
        if ((i2 & 64) != 0) {
            l = teamOfTheWeekRound.startDateTimestamp;
        }
        Long l2 = l;
        long j2 = j;
        TOTWRound tOTWRound2 = tOTWRound;
        String str3 = str2;
        return teamOfTheWeekRound.copy(i, str, str3, num, tOTWRound2, j2, l2);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamOfTheWeekRound self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.getType());
        output.y(serialDesc, 2, self.getPeriodName());
        output.h(serialDesc, 3, a7a.a, self.getTournamentId());
        output.f(serialDesc, 4, TOTWRound$$serializer.INSTANCE, self.round);
        output.E(serialDesc, 5, self.getCreatedAtTimestamp());
        output.h(serialDesc, 6, lkb.a, self.getStartDateTimestamp());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPeriodName() {
        return this.periodName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getTournamentId() {
        return this.tournamentId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TOTWRound getRound() {
        return this.round;
    }

    /* renamed from: component6, reason: from getter */
    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @NotNull
    public final TeamOfTheWeekRound copy(int id, @NotNull String type, @NotNull String periodName, @Nullable Integer tournamentId, @NotNull TOTWRound round, long createdAtTimestamp, @Nullable Long startDateTimestamp) {
        type.getClass();
        periodName.getClass();
        round.getClass();
        return new TeamOfTheWeekRound(id, type, periodName, tournamentId, round, createdAtTimestamp, startDateTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamOfTheWeekRound)) {
            return false;
        }
        TeamOfTheWeekRound teamOfTheWeekRound = (TeamOfTheWeekRound) other;
        return this.id == teamOfTheWeekRound.id && Intrinsics.c(this.type, teamOfTheWeekRound.type) && Intrinsics.c(this.periodName, teamOfTheWeekRound.periodName) && Intrinsics.c(this.tournamentId, teamOfTheWeekRound.tournamentId) && Intrinsics.c(this.round, teamOfTheWeekRound.round) && this.createdAtTimestamp == teamOfTheWeekRound.createdAtTimestamp && Intrinsics.c(this.startDateTimestamp, teamOfTheWeekRound.startDateTimestamp);
    }

    @Override // com.sofascore.model.newNetwork.TeamOfTheWeekItem
    public long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @Override // com.sofascore.model.newNetwork.TeamOfTheWeekItem
    public int getId() {
        return this.id;
    }

    @Override // com.sofascore.model.newNetwork.TeamOfTheWeekItem
    @NotNull
    public String getItemName() {
        return getPeriodName();
    }

    @Override // com.sofascore.model.newNetwork.TeamOfTheWeekItem
    @NotNull
    public String getPeriodName() {
        return this.periodName;
    }

    @NotNull
    public final TOTWRound getRound() {
        return this.round;
    }

    @Override // com.sofascore.model.newNetwork.TeamOfTheWeekItem
    @Nullable
    public Long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @Override // com.sofascore.model.newNetwork.TeamOfTheWeekItem
    @Nullable
    public Integer getTournamentId() {
        return this.tournamentId;
    }

    @Override // com.sofascore.model.newNetwork.TeamOfTheWeekItem
    @NotNull
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.type), 31, this.periodName);
        Integer num = this.tournamentId;
        int c2 = ljg.c((this.round.hashCode() + ((c + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.createdAtTimestamp);
        Long l = this.startDateTimestamp;
        return c2 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        String str2 = this.periodName;
        Integer num = this.tournamentId;
        TOTWRound tOTWRound = this.round;
        long j = this.createdAtTimestamp;
        Long l = this.startDateTimestamp;
        StringBuilder t = dmi.t(i, "TeamOfTheWeekRound(id=", ", type=", str, ", periodName=");
        me4.o(num, str2, ", tournamentId=", ", round=", t);
        t.append(tOTWRound);
        t.append(", createdAtTimestamp=");
        t.append(j);
        t.append(", startDateTimestamp=");
        t.append(l);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamOfTheWeekRound$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamOfTheWeekRound$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamOfTheWeekRound(int i, @NotNull String str, @NotNull String str2, @Nullable Integer num, @NotNull TOTWRound tOTWRound, long j, @Nullable Long l) {
        str.getClass();
        str2.getClass();
        tOTWRound.getClass();
        this.id = i;
        this.type = str;
        this.periodName = str2;
        this.tournamentId = num;
        this.round = tOTWRound;
        this.createdAtTimestamp = j;
        this.startDateTimestamp = l;
    }
}
