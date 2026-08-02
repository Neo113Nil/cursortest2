package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.me4;
import defpackage.oea;
import defpackage.q5h;
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
@q5h(TeamOfTheWeekRoundsResponseKt.TOTW_TIMESPAN)
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b*\u0010+Jn\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010\u001eJ\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010 J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b<\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b?\u0010'R\u001a\u0010\f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b@\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010+¨\u0006E"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamOfTheWeekTimespan;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekItem;", "", "id", "", "type", "periodName", "tournamentId", "sequence", "", "dateFrom", "dateTo", "createdAtTimestamp", "startDateTimestamp", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IJJJLjava/lang/Long;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IJJJLjava/lang/Long;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamOfTheWeekTimespan;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getItemName", "()Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "()J", "component7", "component8", "component9", "()Ljava/lang/Long;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IJJJLjava/lang/Long;)Lcom/sofascore/model/newNetwork/TeamOfTheWeekTimespan;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getType", "getPeriodName", "Ljava/lang/Integer;", "getTournamentId", "getSequence", "J", "getDateFrom", "getDateTo", "getCreatedAtTimestamp", "Ljava/lang/Long;", "getStartDateTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamOfTheWeekTimespan implements TeamOfTheWeekItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long createdAtTimestamp;
    private final long dateFrom;
    private final long dateTo;
    private final int id;

    @NotNull
    private final String periodName;
    private final int sequence;

    @Nullable
    private final Long startDateTimestamp;

    @Nullable
    private final Integer tournamentId;

    @NotNull
    private final String type;

    public /* synthetic */ TeamOfTheWeekTimespan(int i, int i2, String str, String str2, Integer num, int i3, long j, long j2, long j3, Long l, t5h t5hVar) {
        if (511 != (i & 511)) {
            oea.z(i, 511, TeamOfTheWeekTimespan$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.type = str;
        this.periodName = str2;
        this.tournamentId = num;
        this.sequence = i3;
        this.dateFrom = j;
        this.dateTo = j2;
        this.createdAtTimestamp = j3;
        this.startDateTimestamp = l;
    }

    public static /* synthetic */ TeamOfTheWeekTimespan copy$default(TeamOfTheWeekTimespan teamOfTheWeekTimespan, int i, String str, String str2, Integer num, int i2, long j, long j2, long j3, Long l, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = teamOfTheWeekTimespan.id;
        }
        if ((i3 & 2) != 0) {
            str = teamOfTheWeekTimespan.type;
        }
        if ((i3 & 4) != 0) {
            str2 = teamOfTheWeekTimespan.periodName;
        }
        if ((i3 & 8) != 0) {
            num = teamOfTheWeekTimespan.tournamentId;
        }
        if ((i3 & 16) != 0) {
            i2 = teamOfTheWeekTimespan.sequence;
        }
        if ((i3 & 32) != 0) {
            j = teamOfTheWeekTimespan.dateFrom;
        }
        if ((i3 & 64) != 0) {
            j2 = teamOfTheWeekTimespan.dateTo;
        }
        if ((i3 & 128) != 0) {
            j3 = teamOfTheWeekTimespan.createdAtTimestamp;
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            l = teamOfTheWeekTimespan.startDateTimestamp;
        }
        Long l2 = l;
        long j4 = j3;
        long j5 = j2;
        long j6 = j;
        int i4 = i2;
        String str3 = str2;
        return teamOfTheWeekTimespan.copy(i, str, str3, num, i4, j6, j5, j4, l2);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamOfTheWeekTimespan self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.getType());
        output.y(serialDesc, 2, self.getPeriodName());
        output.h(serialDesc, 3, a7a.a, self.getTournamentId());
        output.u(4, self.sequence, serialDesc);
        output.E(serialDesc, 5, self.dateFrom);
        output.E(serialDesc, 6, self.dateTo);
        output.E(serialDesc, 7, self.getCreatedAtTimestamp());
        output.h(serialDesc, 8, lkb.a, self.getStartDateTimestamp());
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
    public final int getSequence() {
        return this.sequence;
    }

    /* renamed from: component6, reason: from getter */
    public final long getDateFrom() {
        return this.dateFrom;
    }

    /* renamed from: component7, reason: from getter */
    public final long getDateTo() {
        return this.dateTo;
    }

    /* renamed from: component8, reason: from getter */
    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @NotNull
    public final TeamOfTheWeekTimespan copy(int id, @NotNull String type, @NotNull String periodName, @Nullable Integer tournamentId, int sequence, long dateFrom, long dateTo, long createdAtTimestamp, @Nullable Long startDateTimestamp) {
        type.getClass();
        periodName.getClass();
        return new TeamOfTheWeekTimespan(id, type, periodName, tournamentId, sequence, dateFrom, dateTo, createdAtTimestamp, startDateTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamOfTheWeekTimespan)) {
            return false;
        }
        TeamOfTheWeekTimespan teamOfTheWeekTimespan = (TeamOfTheWeekTimespan) other;
        return this.id == teamOfTheWeekTimespan.id && Intrinsics.c(this.type, teamOfTheWeekTimespan.type) && Intrinsics.c(this.periodName, teamOfTheWeekTimespan.periodName) && Intrinsics.c(this.tournamentId, teamOfTheWeekTimespan.tournamentId) && this.sequence == teamOfTheWeekTimespan.sequence && this.dateFrom == teamOfTheWeekTimespan.dateFrom && this.dateTo == teamOfTheWeekTimespan.dateTo && this.createdAtTimestamp == teamOfTheWeekTimespan.createdAtTimestamp && Intrinsics.c(this.startDateTimestamp, teamOfTheWeekTimespan.startDateTimestamp);
    }

    @Override // com.sofascore.model.newNetwork.TeamOfTheWeekItem
    public long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    public final long getDateFrom() {
        return this.dateFrom;
    }

    public final long getDateTo() {
        return this.dateTo;
    }

    @Override // com.sofascore.model.newNetwork.TeamOfTheWeekItem
    public int getId() {
        return this.id;
    }

    @Override // com.sofascore.model.newNetwork.TeamOfTheWeekItem
    @NotNull
    public String getItemName() {
        return String.valueOf(this.sequence);
    }

    @Override // com.sofascore.model.newNetwork.TeamOfTheWeekItem
    @NotNull
    public String getPeriodName() {
        return this.periodName;
    }

    public final int getSequence() {
        return this.sequence;
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
        int c2 = ljg.c(ljg.c(ljg.c(wv8.a(this.sequence, (c + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.dateFrom), 31, this.dateTo), 31, this.createdAtTimestamp);
        Long l = this.startDateTimestamp;
        return c2 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        String str2 = this.periodName;
        Integer num = this.tournamentId;
        int i2 = this.sequence;
        long j = this.dateFrom;
        long j2 = this.dateTo;
        long j3 = this.createdAtTimestamp;
        Long l = this.startDateTimestamp;
        StringBuilder t = dmi.t(i, "TeamOfTheWeekTimespan(id=", ", type=", str, ", periodName=");
        me4.o(num, str2, ", tournamentId=", ", sequence=", t);
        t.append(i2);
        t.append(", dateFrom=");
        t.append(j);
        fn0.t(j2, ", dateTo=", ", createdAtTimestamp=", t);
        t.append(j3);
        t.append(", startDateTimestamp=");
        t.append(l);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamOfTheWeekTimespan$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekTimespan;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamOfTheWeekTimespan$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamOfTheWeekTimespan(int i, @NotNull String str, @NotNull String str2, @Nullable Integer num, int i2, long j, long j2, long j3, @Nullable Long l) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.type = str;
        this.periodName = str2;
        this.tournamentId = num;
        this.sequence = i2;
        this.dateFrom = j;
        this.dateTo = j2;
        this.createdAtTimestamp = j3;
        this.startDateTimestamp = l;
    }
}
