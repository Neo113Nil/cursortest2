package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.dmi;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.me4;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q5h("period")
@r5h
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJh\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010\u001eJ\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010 J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\bB\u0010\u001e¨\u0006E"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamOfThePeriodRound;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekItem;", "", "id", "", "type", "periodName", "tournamentId", "", "createdAtTimestamp", "startDateTimestamp", "Lcom/sofascore/model/newNetwork/UniqueTournamentTeamAwardType;", "awardType", "awardName", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/Long;Lcom/sofascore/model/newNetwork/UniqueTournamentTeamAwardType;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/Long;Lcom/sofascore/model/newNetwork/UniqueTournamentTeamAwardType;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamOfThePeriodRound;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getItemName", "()Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()J", "component6", "()Ljava/lang/Long;", "component7", "()Lcom/sofascore/model/newNetwork/UniqueTournamentTeamAwardType;", "component8", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/Long;Lcom/sofascore/model/newNetwork/UniqueTournamentTeamAwardType;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/TeamOfThePeriodRound;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getType", "getPeriodName", "Ljava/lang/Integer;", "getTournamentId", "J", "getCreatedAtTimestamp", "Ljava/lang/Long;", "getStartDateTimestamp", "Lcom/sofascore/model/newNetwork/UniqueTournamentTeamAwardType;", "getAwardType", "getAwardName", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamOfThePeriodRound implements TeamOfTheWeekItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String awardName;

    @Nullable
    private final UniqueTournamentTeamAwardType awardType;
    private final long createdAtTimestamp;
    private final int id;

    @NotNull
    private final String periodName;

    @Nullable
    private final Long startDateTimestamp;

    @Nullable
    private final Integer tournamentId;

    @NotNull
    private final String type;

    public /* synthetic */ TeamOfThePeriodRound(int i, int i2, String str, String str2, Integer num, long j, Long l, UniqueTournamentTeamAwardType uniqueTournamentTeamAwardType, String str3, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, TeamOfThePeriodRound$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.type = str;
        this.periodName = str2;
        this.tournamentId = num;
        this.createdAtTimestamp = j;
        this.startDateTimestamp = l;
        this.awardType = uniqueTournamentTeamAwardType;
        this.awardName = str3;
    }

    public static /* synthetic */ TeamOfThePeriodRound copy$default(TeamOfThePeriodRound teamOfThePeriodRound, int i, String str, String str2, Integer num, long j, Long l, UniqueTournamentTeamAwardType uniqueTournamentTeamAwardType, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = teamOfThePeriodRound.id;
        }
        if ((i2 & 2) != 0) {
            str = teamOfThePeriodRound.type;
        }
        if ((i2 & 4) != 0) {
            str2 = teamOfThePeriodRound.periodName;
        }
        if ((i2 & 8) != 0) {
            num = teamOfThePeriodRound.tournamentId;
        }
        if ((i2 & 16) != 0) {
            j = teamOfThePeriodRound.createdAtTimestamp;
        }
        if ((i2 & 32) != 0) {
            l = teamOfThePeriodRound.startDateTimestamp;
        }
        if ((i2 & 64) != 0) {
            uniqueTournamentTeamAwardType = teamOfThePeriodRound.awardType;
        }
        if ((i2 & 128) != 0) {
            str3 = teamOfThePeriodRound.awardName;
        }
        String str4 = str3;
        Long l2 = l;
        long j2 = j;
        String str5 = str2;
        Integer num2 = num;
        return teamOfThePeriodRound.copy(i, str, str5, num2, j2, l2, uniqueTournamentTeamAwardType, str4);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamOfThePeriodRound self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.getType());
        output.y(serialDesc, 2, self.getPeriodName());
        output.h(serialDesc, 3, a7a.a, self.getTournamentId());
        output.E(serialDesc, 4, self.getCreatedAtTimestamp());
        output.h(serialDesc, 5, lkb.a, self.getStartDateTimestamp());
        output.h(serialDesc, 6, UniqueTournamentTeamAwardTypeSerializer.INSTANCE, self.awardType);
        output.h(serialDesc, 7, uhi.a, self.awardName);
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

    /* renamed from: component5, reason: from getter */
    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final UniqueTournamentTeamAwardType getAwardType() {
        return this.awardType;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getAwardName() {
        return this.awardName;
    }

    @NotNull
    public final TeamOfThePeriodRound copy(int id, @NotNull String type, @NotNull String periodName, @Nullable Integer tournamentId, long createdAtTimestamp, @Nullable Long startDateTimestamp, @Nullable UniqueTournamentTeamAwardType awardType, @Nullable String awardName) {
        type.getClass();
        periodName.getClass();
        return new TeamOfThePeriodRound(id, type, periodName, tournamentId, createdAtTimestamp, startDateTimestamp, awardType, awardName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamOfThePeriodRound)) {
            return false;
        }
        TeamOfThePeriodRound teamOfThePeriodRound = (TeamOfThePeriodRound) other;
        return this.id == teamOfThePeriodRound.id && Intrinsics.c(this.type, teamOfThePeriodRound.type) && Intrinsics.c(this.periodName, teamOfThePeriodRound.periodName) && Intrinsics.c(this.tournamentId, teamOfThePeriodRound.tournamentId) && this.createdAtTimestamp == teamOfThePeriodRound.createdAtTimestamp && Intrinsics.c(this.startDateTimestamp, teamOfThePeriodRound.startDateTimestamp) && this.awardType == teamOfThePeriodRound.awardType && Intrinsics.c(this.awardName, teamOfThePeriodRound.awardName);
    }

    @Nullable
    public final String getAwardName() {
        return this.awardName;
    }

    @Nullable
    public final UniqueTournamentTeamAwardType getAwardType() {
        return this.awardType;
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
        int c2 = ljg.c((c + (num == null ? 0 : num.hashCode())) * 31, 31, this.createdAtTimestamp);
        Long l = this.startDateTimestamp;
        int hashCode = (c2 + (l == null ? 0 : l.hashCode())) * 31;
        UniqueTournamentTeamAwardType uniqueTournamentTeamAwardType = this.awardType;
        int hashCode2 = (hashCode + (uniqueTournamentTeamAwardType == null ? 0 : uniqueTournamentTeamAwardType.hashCode())) * 31;
        String str = this.awardName;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        String str2 = this.periodName;
        Integer num = this.tournamentId;
        long j = this.createdAtTimestamp;
        Long l = this.startDateTimestamp;
        UniqueTournamentTeamAwardType uniqueTournamentTeamAwardType = this.awardType;
        String str3 = this.awardName;
        StringBuilder t = dmi.t(i, "TeamOfThePeriodRound(id=", ", type=", str, ", periodName=");
        me4.o(num, str2, ", tournamentId=", ", createdAtTimestamp=", t);
        t.append(j);
        t.append(", startDateTimestamp=");
        t.append(l);
        t.append(", awardType=");
        t.append(uniqueTournamentTeamAwardType);
        t.append(", awardName=");
        t.append(str3);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamOfThePeriodRound$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamOfThePeriodRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamOfThePeriodRound$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamOfThePeriodRound(int i, @NotNull String str, @NotNull String str2, @Nullable Integer num, long j, @Nullable Long l, @Nullable UniqueTournamentTeamAwardType uniqueTournamentTeamAwardType, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.type = str;
        this.periodName = str2;
        this.tournamentId = num;
        this.createdAtTimestamp = j;
        this.startDateTimestamp = l;
        this.awardType = uniqueTournamentTeamAwardType;
        this.awardName = str3;
    }
}
