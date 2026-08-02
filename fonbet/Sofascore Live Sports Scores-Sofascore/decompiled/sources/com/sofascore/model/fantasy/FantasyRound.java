package com.sofascore.model.fantasy;

import defpackage.a7a;
import defpackage.c88;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 V2\u00020\u0001:\u0002WVB\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b1\u0010/J®\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b4\u0010 J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\u001dJ\u001a\u00107\u001a\u00020\u00122\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108J'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010B\u001a\u0004\bD\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bF\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bH\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bJ\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bK\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bM\u0010'R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bN\u0010'R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bO\u0010'R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bP\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bQ\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\bS\u0010-R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010T\u001a\u0004\b\u0013\u0010/R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010T\u001a\u0004\b\u0014\u0010/R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010T\u001a\u0004\bU\u0010/¨\u0006X"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyRound;", "", "", "id", "sequence", "", "name", "", "averageScore", "highScore", "maxPointsUserAccountId", "", "startTimestamp", "endTimestamp", "deadlineTimestamp", "fantasyCompetitionId", "maxPlayersFromSameTeam", "revealTimestamp", "", "isPlaceholderRound", "isFinalized", "rebuildSquadActive", "<init>", "(IILjava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;JJJIILjava/lang/Long;ZZZ)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;JJJIILjava/lang/Long;ZZZLt5h;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Float;", "component5", "()Ljava/lang/Integer;", "component6", "component7", "()J", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Long;", "component13", "()Z", "component14", "component15", "copy", "(IILjava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;JJJIILjava/lang/Long;ZZZ)Lcom/sofascore/model/fantasy/FantasyRound;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyRound;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "getSequence", "Ljava/lang/String;", "getName", "Ljava/lang/Float;", "getAverageScore", "Ljava/lang/Integer;", "getHighScore", "getMaxPointsUserAccountId", "J", "getStartTimestamp", "getEndTimestamp", "getDeadlineTimestamp", "getFantasyCompetitionId", "getMaxPlayersFromSameTeam", "Ljava/lang/Long;", "getRevealTimestamp", "Z", "getRebuildSquadActive", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyRound {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float averageScore;
    private final long deadlineTimestamp;
    private final long endTimestamp;
    private final int fantasyCompetitionId;

    @Nullable
    private final Integer highScore;
    private final int id;
    private final boolean isFinalized;
    private final boolean isPlaceholderRound;
    private final int maxPlayersFromSameTeam;

    @Nullable
    private final String maxPointsUserAccountId;

    @NotNull
    private final String name;
    private final boolean rebuildSquadActive;

    @Nullable
    private final Long revealTimestamp;
    private final int sequence;
    private final long startTimestamp;

    public /* synthetic */ FantasyRound(int i, int i2, int i3, String str, Float f, Integer num, String str2, long j, long j2, long j3, int i4, int i5, Long l, boolean z, boolean z2, boolean z3, t5h t5hVar) {
        if (32767 != (i & 32767)) {
            oea.z(i, 32767, FantasyRound$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.sequence = i3;
        this.name = str;
        this.averageScore = f;
        this.highScore = num;
        this.maxPointsUserAccountId = str2;
        this.startTimestamp = j;
        this.endTimestamp = j2;
        this.deadlineTimestamp = j3;
        this.fantasyCompetitionId = i4;
        this.maxPlayersFromSameTeam = i5;
        this.revealTimestamp = l;
        this.isPlaceholderRound = z;
        this.isFinalized = z2;
        this.rebuildSquadActive = z3;
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyRound self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.u(1, self.sequence, serialDesc);
        output.y(serialDesc, 2, self.name);
        output.h(serialDesc, 3, c88.a, self.averageScore);
        output.h(serialDesc, 4, a7a.a, self.highScore);
        output.h(serialDesc, 5, uhi.a, self.maxPointsUserAccountId);
        output.E(serialDesc, 6, self.startTimestamp);
        output.E(serialDesc, 7, self.endTimestamp);
        output.E(serialDesc, 8, self.deadlineTimestamp);
        output.u(9, self.fantasyCompetitionId, serialDesc);
        output.u(10, self.maxPlayersFromSameTeam, serialDesc);
        output.h(serialDesc, 11, lkb.a, self.revealTimestamp);
        output.x(serialDesc, 12, self.isPlaceholderRound);
        output.x(serialDesc, 13, self.isFinalized);
        output.x(serialDesc, 14, self.rebuildSquadActive);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getFantasyCompetitionId() {
        return this.fantasyCompetitionId;
    }

    /* renamed from: component11, reason: from getter */
    public final int getMaxPlayersFromSameTeam() {
        return this.maxPlayersFromSameTeam;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Long getRevealTimestamp() {
        return this.revealTimestamp;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsPlaceholderRound() {
        return this.isPlaceholderRound;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsFinalized() {
        return this.isFinalized;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getRebuildSquadActive() {
        return this.rebuildSquadActive;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSequence() {
        return this.sequence;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Float getAverageScore() {
        return this.averageScore;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getHighScore() {
        return this.highScore;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getMaxPointsUserAccountId() {
        return this.maxPointsUserAccountId;
    }

    /* renamed from: component7, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* renamed from: component8, reason: from getter */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* renamed from: component9, reason: from getter */
    public final long getDeadlineTimestamp() {
        return this.deadlineTimestamp;
    }

    @NotNull
    public final FantasyRound copy(int id, int sequence, @NotNull String name, @Nullable Float averageScore, @Nullable Integer highScore, @Nullable String maxPointsUserAccountId, long startTimestamp, long endTimestamp, long deadlineTimestamp, int fantasyCompetitionId, int maxPlayersFromSameTeam, @Nullable Long revealTimestamp, boolean isPlaceholderRound, boolean isFinalized, boolean rebuildSquadActive) {
        name.getClass();
        return new FantasyRound(id, sequence, name, averageScore, highScore, maxPointsUserAccountId, startTimestamp, endTimestamp, deadlineTimestamp, fantasyCompetitionId, maxPlayersFromSameTeam, revealTimestamp, isPlaceholderRound, isFinalized, rebuildSquadActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyRound)) {
            return false;
        }
        FantasyRound fantasyRound = (FantasyRound) other;
        return this.id == fantasyRound.id && this.sequence == fantasyRound.sequence && Intrinsics.c(this.name, fantasyRound.name) && Intrinsics.c(this.averageScore, fantasyRound.averageScore) && Intrinsics.c(this.highScore, fantasyRound.highScore) && Intrinsics.c(this.maxPointsUserAccountId, fantasyRound.maxPointsUserAccountId) && this.startTimestamp == fantasyRound.startTimestamp && this.endTimestamp == fantasyRound.endTimestamp && this.deadlineTimestamp == fantasyRound.deadlineTimestamp && this.fantasyCompetitionId == fantasyRound.fantasyCompetitionId && this.maxPlayersFromSameTeam == fantasyRound.maxPlayersFromSameTeam && Intrinsics.c(this.revealTimestamp, fantasyRound.revealTimestamp) && this.isPlaceholderRound == fantasyRound.isPlaceholderRound && this.isFinalized == fantasyRound.isFinalized && this.rebuildSquadActive == fantasyRound.rebuildSquadActive;
    }

    @Nullable
    public final Float getAverageScore() {
        return this.averageScore;
    }

    public final long getDeadlineTimestamp() {
        return this.deadlineTimestamp;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getFantasyCompetitionId() {
        return this.fantasyCompetitionId;
    }

    @Nullable
    public final Integer getHighScore() {
        return this.highScore;
    }

    public final int getId() {
        return this.id;
    }

    public final int getMaxPlayersFromSameTeam() {
        return this.maxPlayersFromSameTeam;
    }

    @Nullable
    public final String getMaxPointsUserAccountId() {
        return this.maxPointsUserAccountId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getRebuildSquadActive() {
        return this.rebuildSquadActive;
    }

    @Nullable
    public final Long getRevealTimestamp() {
        return this.revealTimestamp;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int hashCode() {
        int c = dmi.c(wv8.a(this.sequence, Integer.hashCode(this.id) * 31, 31), 31, this.name);
        Float f = this.averageScore;
        int hashCode = (c + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.highScore;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.maxPointsUserAccountId;
        int a = wv8.a(this.maxPlayersFromSameTeam, wv8.a(this.fantasyCompetitionId, ljg.c(ljg.c(ljg.c((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.startTimestamp), 31, this.endTimestamp), 31, this.deadlineTimestamp), 31), 31);
        Long l = this.revealTimestamp;
        return Boolean.hashCode(this.rebuildSquadActive) + dmi.e(dmi.e((a + (l != null ? l.hashCode() : 0)) * 31, 31, this.isPlaceholderRound), 31, this.isFinalized);
    }

    public final boolean isFinalized() {
        return this.isFinalized;
    }

    public final boolean isPlaceholderRound() {
        return this.isPlaceholderRound;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.sequence;
        String str = this.name;
        Float f = this.averageScore;
        Integer num = this.highScore;
        String str2 = this.maxPointsUserAccountId;
        long j = this.startTimestamp;
        long j2 = this.endTimestamp;
        long j3 = this.deadlineTimestamp;
        int i3 = this.fantasyCompetitionId;
        int i4 = this.maxPlayersFromSameTeam;
        Long l = this.revealTimestamp;
        boolean z = this.isPlaceholderRound;
        boolean z2 = this.isFinalized;
        boolean z3 = this.rebuildSquadActive;
        StringBuilder s = lnb.s(i, i2, "FantasyRound(id=", ", sequence=", ", name=");
        s.append(str);
        s.append(", averageScore=");
        s.append(f);
        s.append(", highScore=");
        vxd.s(num, ", maxPointsUserAccountId=", str2, ", startTimestamp=", s);
        s.append(j);
        fn0.t(j2, ", endTimestamp=", ", deadlineTimestamp=", s);
        s.append(j3);
        s.append(", fantasyCompetitionId=");
        s.append(i3);
        s.append(", maxPlayersFromSameTeam=");
        s.append(i4);
        s.append(", revealTimestamp=");
        s.append(l);
        fn0.y(", isPlaceholderRound=", ", isFinalized=", s, z, z2);
        s.append(", rebuildSquadActive=");
        s.append(z3);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyRound$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyRound$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyRound(int i, int i2, @NotNull String str, @Nullable Float f, @Nullable Integer num, @Nullable String str2, long j, long j2, long j3, int i3, int i4, @Nullable Long l, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.id = i;
        this.sequence = i2;
        this.name = str;
        this.averageScore = f;
        this.highScore = num;
        this.maxPointsUserAccountId = str2;
        this.startTimestamp = j;
        this.endTimestamp = j2;
        this.deadlineTimestamp = j3;
        this.fantasyCompetitionId = i3;
        this.maxPlayersFromSameTeam = i4;
        this.revealTimestamp = l;
        this.isPlaceholderRound = z;
        this.isFinalized = z2;
        this.rebuildSquadActive = z3;
    }
}
