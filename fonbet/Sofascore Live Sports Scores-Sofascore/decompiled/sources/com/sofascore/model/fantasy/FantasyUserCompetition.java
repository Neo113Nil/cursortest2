package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.a7a;
import defpackage.c88;
import defpackage.dmi;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001aJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0090\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001aJ\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bH\u0010\"R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bI\u0010 R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bJ\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bK\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bL\u0010\u001aR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bM\u0010\"¨\u0006P"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUserCompetition;", "", "", "id", "Lcom/sofascore/model/fantasy/FantasyCompetition;", "fantasyCompetition", "Lcom/sofascore/model/fantasy/FantasyRound;", "joinedInRound", "", "name", "score", "", "averageScore", "currentRoundScore", "userName", "tripleCaptains", "freeHits", "wildcards", "globalRank", "<init>", "(ILcom/sofascore/model/fantasy/FantasyCompetition;Lcom/sofascore/model/fantasy/FantasyRound;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;IIILjava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/fantasy/FantasyCompetition;Lcom/sofascore/model/fantasy/FantasyRound;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;IIILjava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "()Lcom/sofascore/model/fantasy/FantasyCompetition;", "component3", "()Lcom/sofascore/model/fantasy/FantasyRound;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/lang/Integer;", "component6", "()Ljava/lang/Float;", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(ILcom/sofascore/model/fantasy/FantasyCompetition;Lcom/sofascore/model/fantasy/FantasyRound;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;IIILjava/lang/Integer;)Lcom/sofascore/model/fantasy/FantasyUserCompetition;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyUserCompetition;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/fantasy/FantasyCompetition;", "getFantasyCompetition", "Lcom/sofascore/model/fantasy/FantasyRound;", "getJoinedInRound", "Ljava/lang/String;", "getName", "Ljava/lang/Integer;", "getScore", "Ljava/lang/Float;", "getAverageScore", "getCurrentRoundScore", "getUserName", "getTripleCaptains", "getFreeHits", "getWildcards", "getGlobalRank", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyUserCompetition {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float averageScore;

    @Nullable
    private final Integer currentRoundScore;

    @NotNull
    private final FantasyCompetition fantasyCompetition;
    private final int freeHits;

    @Nullable
    private final Integer globalRank;
    private final int id;

    @NotNull
    private final FantasyRound joinedInRound;

    @NotNull
    private final String name;

    @Nullable
    private final Integer score;
    private final int tripleCaptains;

    @NotNull
    private final String userName;
    private final int wildcards;

    public /* synthetic */ FantasyUserCompetition(int i, int i2, FantasyCompetition fantasyCompetition, FantasyRound fantasyRound, String str, Integer num, Float f, Integer num2, String str2, int i3, int i4, int i5, Integer num3, t5h t5hVar) {
        if (4095 != (i & 4095)) {
            oea.z(i, 4095, FantasyUserCompetition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.fantasyCompetition = fantasyCompetition;
        this.joinedInRound = fantasyRound;
        this.name = str;
        this.score = num;
        this.averageScore = f;
        this.currentRoundScore = num2;
        this.userName = str2;
        this.tripleCaptains = i3;
        this.freeHits = i4;
        this.wildcards = i5;
        this.globalRank = num3;
    }

    public static /* synthetic */ FantasyUserCompetition copy$default(FantasyUserCompetition fantasyUserCompetition, int i, FantasyCompetition fantasyCompetition, FantasyRound fantasyRound, String str, Integer num, Float f, Integer num2, String str2, int i2, int i3, int i4, Integer num3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = fantasyUserCompetition.id;
        }
        if ((i5 & 2) != 0) {
            fantasyCompetition = fantasyUserCompetition.fantasyCompetition;
        }
        if ((i5 & 4) != 0) {
            fantasyRound = fantasyUserCompetition.joinedInRound;
        }
        if ((i5 & 8) != 0) {
            str = fantasyUserCompetition.name;
        }
        if ((i5 & 16) != 0) {
            num = fantasyUserCompetition.score;
        }
        if ((i5 & 32) != 0) {
            f = fantasyUserCompetition.averageScore;
        }
        if ((i5 & 64) != 0) {
            num2 = fantasyUserCompetition.currentRoundScore;
        }
        if ((i5 & 128) != 0) {
            str2 = fantasyUserCompetition.userName;
        }
        if ((i5 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i2 = fantasyUserCompetition.tripleCaptains;
        }
        if ((i5 & 512) != 0) {
            i3 = fantasyUserCompetition.freeHits;
        }
        if ((i5 & 1024) != 0) {
            i4 = fantasyUserCompetition.wildcards;
        }
        if ((i5 & a.o) != 0) {
            num3 = fantasyUserCompetition.globalRank;
        }
        int i6 = i4;
        Integer num4 = num3;
        int i7 = i2;
        int i8 = i3;
        Integer num5 = num2;
        String str3 = str2;
        Integer num6 = num;
        Float f2 = f;
        return fantasyUserCompetition.copy(i, fantasyCompetition, fantasyRound, str, num6, f2, num5, str3, i7, i8, i6, num4);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyUserCompetition self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, FantasyCompetition$$serializer.INSTANCE, self.fantasyCompetition);
        output.f(serialDesc, 2, FantasyRound$$serializer.INSTANCE, self.joinedInRound);
        output.y(serialDesc, 3, self.name);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.score);
        output.h(serialDesc, 5, c88.a, self.averageScore);
        output.h(serialDesc, 6, a7aVar, self.currentRoundScore);
        output.y(serialDesc, 7, self.userName);
        output.u(8, self.tripleCaptains, serialDesc);
        output.u(9, self.freeHits, serialDesc);
        output.u(10, self.wildcards, serialDesc);
        output.h(serialDesc, 11, a7aVar, self.globalRank);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getFreeHits() {
        return this.freeHits;
    }

    /* renamed from: component11, reason: from getter */
    public final int getWildcards() {
        return this.wildcards;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getGlobalRank() {
        return this.globalRank;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FantasyCompetition getFantasyCompetition() {
        return this.fantasyCompetition;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FantasyRound getJoinedInRound() {
        return this.joinedInRound;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getAverageScore() {
        return this.averageScore;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getCurrentRoundScore() {
        return this.currentRoundScore;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* renamed from: component9, reason: from getter */
    public final int getTripleCaptains() {
        return this.tripleCaptains;
    }

    @NotNull
    public final FantasyUserCompetition copy(int id, @NotNull FantasyCompetition fantasyCompetition, @NotNull FantasyRound joinedInRound, @NotNull String name, @Nullable Integer score, @Nullable Float averageScore, @Nullable Integer currentRoundScore, @NotNull String userName, int tripleCaptains, int freeHits, int wildcards, @Nullable Integer globalRank) {
        fantasyCompetition.getClass();
        joinedInRound.getClass();
        name.getClass();
        userName.getClass();
        return new FantasyUserCompetition(id, fantasyCompetition, joinedInRound, name, score, averageScore, currentRoundScore, userName, tripleCaptains, freeHits, wildcards, globalRank);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyUserCompetition)) {
            return false;
        }
        FantasyUserCompetition fantasyUserCompetition = (FantasyUserCompetition) other;
        return this.id == fantasyUserCompetition.id && Intrinsics.c(this.fantasyCompetition, fantasyUserCompetition.fantasyCompetition) && Intrinsics.c(this.joinedInRound, fantasyUserCompetition.joinedInRound) && Intrinsics.c(this.name, fantasyUserCompetition.name) && Intrinsics.c(this.score, fantasyUserCompetition.score) && Intrinsics.c(this.averageScore, fantasyUserCompetition.averageScore) && Intrinsics.c(this.currentRoundScore, fantasyUserCompetition.currentRoundScore) && Intrinsics.c(this.userName, fantasyUserCompetition.userName) && this.tripleCaptains == fantasyUserCompetition.tripleCaptains && this.freeHits == fantasyUserCompetition.freeHits && this.wildcards == fantasyUserCompetition.wildcards && Intrinsics.c(this.globalRank, fantasyUserCompetition.globalRank);
    }

    @Nullable
    public final Float getAverageScore() {
        return this.averageScore;
    }

    @Nullable
    public final Integer getCurrentRoundScore() {
        return this.currentRoundScore;
    }

    @NotNull
    public final FantasyCompetition getFantasyCompetition() {
        return this.fantasyCompetition;
    }

    public final int getFreeHits() {
        return this.freeHits;
    }

    @Nullable
    public final Integer getGlobalRank() {
        return this.globalRank;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final FantasyRound getJoinedInRound() {
        return this.joinedInRound;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    public final int getTripleCaptains() {
        return this.tripleCaptains;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public final int getWildcards() {
        return this.wildcards;
    }

    public int hashCode() {
        int c = dmi.c((this.joinedInRound.hashCode() + ((this.fantasyCompetition.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31, 31, this.name);
        Integer num = this.score;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.averageScore;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.currentRoundScore;
        int a = wv8.a(this.wildcards, wv8.a(this.freeHits, wv8.a(this.tripleCaptains, dmi.c((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.userName), 31), 31), 31);
        Integer num3 = this.globalRank;
        return a + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        FantasyCompetition fantasyCompetition = this.fantasyCompetition;
        FantasyRound fantasyRound = this.joinedInRound;
        String str = this.name;
        Integer num = this.score;
        Float f = this.averageScore;
        Integer num2 = this.currentRoundScore;
        String str2 = this.userName;
        int i2 = this.tripleCaptains;
        int i3 = this.freeHits;
        int i4 = this.wildcards;
        Integer num3 = this.globalRank;
        StringBuilder sb = new StringBuilder("FantasyUserCompetition(id=");
        sb.append(i);
        sb.append(", fantasyCompetition=");
        sb.append(fantasyCompetition);
        sb.append(", joinedInRound=");
        sb.append(fantasyRound);
        sb.append(", name=");
        sb.append(str);
        sb.append(", score=");
        sb.append(num);
        sb.append(", averageScore=");
        sb.append(f);
        sb.append(", currentRoundScore=");
        vxd.s(num2, ", userName=", str2, ", tripleCaptains=", sb);
        me4.q(sb, i2, ", freeHits=", i3, ", wildcards=");
        sb.append(i4);
        sb.append(", globalRank=");
        sb.append(num3);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUserCompetition$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyUserCompetition;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyUserCompetition$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyUserCompetition(int i, @NotNull FantasyCompetition fantasyCompetition, @NotNull FantasyRound fantasyRound, @NotNull String str, @Nullable Integer num, @Nullable Float f, @Nullable Integer num2, @NotNull String str2, int i2, int i3, int i4, @Nullable Integer num3) {
        fantasyCompetition.getClass();
        fantasyRound.getClass();
        str.getClass();
        str2.getClass();
        this.id = i;
        this.fantasyCompetition = fantasyCompetition;
        this.joinedInRound = fantasyRound;
        this.name = str;
        this.score = num;
        this.averageScore = f;
        this.currentRoundScore = num2;
        this.userName = str2;
        this.tripleCaptains = i2;
        this.freeHits = i3;
        this.wildcards = i4;
        this.globalRank = num3;
    }
}
