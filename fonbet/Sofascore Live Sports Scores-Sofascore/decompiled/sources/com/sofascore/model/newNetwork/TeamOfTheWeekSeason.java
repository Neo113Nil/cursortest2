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
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q5h(TeamOfTheWeekRoundsResponseKt.TOTW_SEASON)
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%JP\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b3\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010%¨\u0006<"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamOfTheWeekSeason;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekItem;", "", "id", "", "type", "periodName", "tournamentId", "", "createdAtTimestamp", "startDateTimestamp", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/Long;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/Long;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamOfTheWeekSeason;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getItemName", "()Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()J", "component6", "()Ljava/lang/Long;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/Long;)Lcom/sofascore/model/newNetwork/TeamOfTheWeekSeason;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getType", "getPeriodName", "Ljava/lang/Integer;", "getTournamentId", "J", "getCreatedAtTimestamp", "Ljava/lang/Long;", "getStartDateTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamOfTheWeekSeason implements TeamOfTheWeekItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
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

    public /* synthetic */ TeamOfTheWeekSeason(int i, int i2, String str, String str2, Integer num, long j, Long l, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, TeamOfTheWeekSeason$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.type = str;
        this.periodName = str2;
        this.tournamentId = num;
        this.createdAtTimestamp = j;
        this.startDateTimestamp = l;
    }

    public static /* synthetic */ TeamOfTheWeekSeason copy$default(TeamOfTheWeekSeason teamOfTheWeekSeason, int i, String str, String str2, Integer num, long j, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = teamOfTheWeekSeason.id;
        }
        if ((i2 & 2) != 0) {
            str = teamOfTheWeekSeason.type;
        }
        if ((i2 & 4) != 0) {
            str2 = teamOfTheWeekSeason.periodName;
        }
        if ((i2 & 8) != 0) {
            num = teamOfTheWeekSeason.tournamentId;
        }
        if ((i2 & 16) != 0) {
            j = teamOfTheWeekSeason.createdAtTimestamp;
        }
        if ((i2 & 32) != 0) {
            l = teamOfTheWeekSeason.startDateTimestamp;
        }
        Long l2 = l;
        long j2 = j;
        return teamOfTheWeekSeason.copy(i, str, str2, num, j2, l2);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamOfTheWeekSeason self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.getType());
        output.y(serialDesc, 2, self.getPeriodName());
        output.h(serialDesc, 3, a7a.a, self.getTournamentId());
        output.E(serialDesc, 4, self.getCreatedAtTimestamp());
        output.h(serialDesc, 5, lkb.a, self.getStartDateTimestamp());
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

    @NotNull
    public final TeamOfTheWeekSeason copy(int id, @NotNull String type, @NotNull String periodName, @Nullable Integer tournamentId, long createdAtTimestamp, @Nullable Long startDateTimestamp) {
        type.getClass();
        periodName.getClass();
        return new TeamOfTheWeekSeason(id, type, periodName, tournamentId, createdAtTimestamp, startDateTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamOfTheWeekSeason)) {
            return false;
        }
        TeamOfTheWeekSeason teamOfTheWeekSeason = (TeamOfTheWeekSeason) other;
        return this.id == teamOfTheWeekSeason.id && Intrinsics.c(this.type, teamOfTheWeekSeason.type) && Intrinsics.c(this.periodName, teamOfTheWeekSeason.periodName) && Intrinsics.c(this.tournamentId, teamOfTheWeekSeason.tournamentId) && this.createdAtTimestamp == teamOfTheWeekSeason.createdAtTimestamp && Intrinsics.c(this.startDateTimestamp, teamOfTheWeekSeason.startDateTimestamp);
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
        return c2 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        String str2 = this.periodName;
        Integer num = this.tournamentId;
        long j = this.createdAtTimestamp;
        Long l = this.startDateTimestamp;
        StringBuilder t = dmi.t(i, "TeamOfTheWeekSeason(id=", ", type=", str, ", periodName=");
        me4.o(num, str2, ", tournamentId=", ", createdAtTimestamp=", t);
        t.append(j);
        t.append(", startDateTimestamp=");
        t.append(l);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamOfTheWeekSeason$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekSeason;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamOfTheWeekSeason$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamOfTheWeekSeason(int i, @NotNull String str, @NotNull String str2, @Nullable Integer num, long j, @Nullable Long l) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.type = str;
        this.periodName = str2;
        this.tournamentId = num;
        this.createdAtTimestamp = j;
        this.startDateTimestamp = l;
    }
}
