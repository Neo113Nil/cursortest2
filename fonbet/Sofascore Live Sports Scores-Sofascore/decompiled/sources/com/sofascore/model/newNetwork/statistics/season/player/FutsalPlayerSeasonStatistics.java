package com.sofascore.model.newNetwork.statistics.season.player;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0002KJB{\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u009c\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b*\u0010\u001bJ\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010\u0019J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bB\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bC\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bD\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bE\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bF\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bG\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bH\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bI\u0010\u001d¨\u0006L"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/FutsalPlayerSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "Ljava/io/Serializable;", "", "id", "", "type", "appearances", "", CampaignEx.JSON_KEY_STAR, "yellowCards", "redCards", "goals", "assists", "penaltyGoals", "penaltyAttempts", "accumulatedPenaltyGoals", "ownGoals", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/statistics/season/player/FutsalPlayerSeasonStatistics;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/FutsalPlayerSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getType", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/Double;", "getRating", "getYellowCards", "getRedCards", "getGoals", "getAssists", "getPenaltyGoals", "getPenaltyAttempts", "getAccumulatedPenaltyGoals", "getOwnGoals", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FutsalPlayerSeasonStatistics extends AbstractPlayerSeasonStatistics implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer accumulatedPenaltyGoals;

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer goals;
    private final int id;

    @Nullable
    private final Integer ownGoals;

    @Nullable
    private final Integer penaltyAttempts;

    @Nullable
    private final Integer penaltyGoals;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer redCards;

    @NotNull
    private final String type;

    @Nullable
    private final Integer yellowCards;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FutsalPlayerSeasonStatistics(int i, int i2, String str, Integer num, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, t5h t5hVar) {
        super(i, t5hVar);
        if (4095 != (i & 4095)) {
            oea.z(i, 4095, FutsalPlayerSeasonStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.yellowCards = num2;
        this.redCards = num3;
        this.goals = num4;
        this.assists = num5;
        this.penaltyGoals = num6;
        this.penaltyAttempts = num7;
        this.accumulatedPenaltyGoals = num8;
        this.ownGoals = num9;
    }

    public static /* synthetic */ FutsalPlayerSeasonStatistics copy$default(FutsalPlayerSeasonStatistics futsalPlayerSeasonStatistics, int i, String str, Integer num, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = futsalPlayerSeasonStatistics.id;
        }
        if ((i2 & 2) != 0) {
            str = futsalPlayerSeasonStatistics.type;
        }
        if ((i2 & 4) != 0) {
            num = futsalPlayerSeasonStatistics.appearances;
        }
        if ((i2 & 8) != 0) {
            d = futsalPlayerSeasonStatistics.rating;
        }
        if ((i2 & 16) != 0) {
            num2 = futsalPlayerSeasonStatistics.yellowCards;
        }
        if ((i2 & 32) != 0) {
            num3 = futsalPlayerSeasonStatistics.redCards;
        }
        if ((i2 & 64) != 0) {
            num4 = futsalPlayerSeasonStatistics.goals;
        }
        if ((i2 & 128) != 0) {
            num5 = futsalPlayerSeasonStatistics.assists;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num6 = futsalPlayerSeasonStatistics.penaltyGoals;
        }
        if ((i2 & 512) != 0) {
            num7 = futsalPlayerSeasonStatistics.penaltyAttempts;
        }
        if ((i2 & 1024) != 0) {
            num8 = futsalPlayerSeasonStatistics.accumulatedPenaltyGoals;
        }
        if ((i2 & a.o) != 0) {
            num9 = futsalPlayerSeasonStatistics.ownGoals;
        }
        Integer num10 = num8;
        Integer num11 = num9;
        Integer num12 = num6;
        Integer num13 = num7;
        Integer num14 = num4;
        Integer num15 = num5;
        Integer num16 = num2;
        Integer num17 = num3;
        return futsalPlayerSeasonStatistics.copy(i, str, num, d, num16, num17, num14, num15, num12, num13, num10, num11);
    }

    public static final /* synthetic */ void write$Self$model_release(FutsalPlayerSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
        AbstractPlayerSeasonStatistics.write$Self(self, output, serialDesc);
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.getType());
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.getAppearances());
        output.h(serialDesc, 3, h75.a, self.getRating());
        output.h(serialDesc, 4, a7aVar, self.yellowCards);
        output.h(serialDesc, 5, a7aVar, self.redCards);
        output.h(serialDesc, 6, a7aVar, self.goals);
        output.h(serialDesc, 7, a7aVar, self.assists);
        output.h(serialDesc, 8, a7aVar, self.penaltyGoals);
        output.h(serialDesc, 9, a7aVar, self.penaltyAttempts);
        output.h(serialDesc, 10, a7aVar, self.accumulatedPenaltyGoals);
        output.h(serialDesc, 11, a7aVar, self.ownGoals);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getPenaltyAttempts() {
        return this.penaltyAttempts;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getAccumulatedPenaltyGoals() {
        return this.accumulatedPenaltyGoals;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getOwnGoals() {
        return this.ownGoals;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @NotNull
    public final FutsalPlayerSeasonStatistics copy(int id, @NotNull String type, @Nullable Integer appearances, @Nullable Double rating, @Nullable Integer yellowCards, @Nullable Integer redCards, @Nullable Integer goals, @Nullable Integer assists, @Nullable Integer penaltyGoals, @Nullable Integer penaltyAttempts, @Nullable Integer accumulatedPenaltyGoals, @Nullable Integer ownGoals) {
        type.getClass();
        return new FutsalPlayerSeasonStatistics(id, type, appearances, rating, yellowCards, redCards, goals, assists, penaltyGoals, penaltyAttempts, accumulatedPenaltyGoals, ownGoals);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FutsalPlayerSeasonStatistics)) {
            return false;
        }
        FutsalPlayerSeasonStatistics futsalPlayerSeasonStatistics = (FutsalPlayerSeasonStatistics) other;
        return this.id == futsalPlayerSeasonStatistics.id && Intrinsics.c(this.type, futsalPlayerSeasonStatistics.type) && Intrinsics.c(this.appearances, futsalPlayerSeasonStatistics.appearances) && Intrinsics.c(this.rating, futsalPlayerSeasonStatistics.rating) && Intrinsics.c(this.yellowCards, futsalPlayerSeasonStatistics.yellowCards) && Intrinsics.c(this.redCards, futsalPlayerSeasonStatistics.redCards) && Intrinsics.c(this.goals, futsalPlayerSeasonStatistics.goals) && Intrinsics.c(this.assists, futsalPlayerSeasonStatistics.assists) && Intrinsics.c(this.penaltyGoals, futsalPlayerSeasonStatistics.penaltyGoals) && Intrinsics.c(this.penaltyAttempts, futsalPlayerSeasonStatistics.penaltyAttempts) && Intrinsics.c(this.accumulatedPenaltyGoals, futsalPlayerSeasonStatistics.accumulatedPenaltyGoals) && Intrinsics.c(this.ownGoals, futsalPlayerSeasonStatistics.ownGoals);
    }

    @Nullable
    public final Integer getAccumulatedPenaltyGoals() {
        return this.accumulatedPenaltyGoals;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final Integer getGoals() {
        return this.goals;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getOwnGoals() {
        return this.ownGoals;
    }

    @Nullable
    public final Integer getPenaltyAttempts() {
        return this.penaltyAttempts;
    }

    @Nullable
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @NotNull
    public String getType() {
        return this.type;
    }

    @Nullable
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.type);
        Integer num = this.appearances;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.rating;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.yellowCards;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.redCards;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.goals;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.assists;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.penaltyGoals;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.penaltyAttempts;
        int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.accumulatedPenaltyGoals;
        int hashCode9 = (hashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.ownGoals;
        return hashCode9 + (num9 != null ? num9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        Integer num = this.appearances;
        Double d = this.rating;
        Integer num2 = this.yellowCards;
        Integer num3 = this.redCards;
        Integer num4 = this.goals;
        Integer num5 = this.assists;
        Integer num6 = this.penaltyGoals;
        Integer num7 = this.penaltyAttempts;
        Integer num8 = this.accumulatedPenaltyGoals;
        Integer num9 = this.ownGoals;
        StringBuilder t = dmi.t(i, "FutsalPlayerSeasonStatistics(id=", ", type=", str, ", appearances=");
        fn0.v(d, num, ", rating=", ", yellowCards=", t);
        vxd.r(num2, num3, ", redCards=", ", goals=", t);
        vxd.r(num4, num5, ", assists=", ", penaltyGoals=", t);
        vxd.r(num6, num7, ", penaltyAttempts=", ", accumulatedPenaltyGoals=", t);
        return fc6.l(num8, num9, ", ownGoals=", ")", t);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/FutsalPlayerSeasonStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/player/FutsalPlayerSeasonStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FutsalPlayerSeasonStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FutsalPlayerSeasonStatistics(int i, @NotNull String str, @Nullable Integer num, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9) {
        str.getClass();
        this.id = i;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.yellowCards = num2;
        this.redCards = num3;
        this.goals = num4;
        this.assists = num5;
        this.penaltyGoals = num6;
        this.penaltyAttempts = num7;
        this.accumulatedPenaltyGoals = num8;
        this.ownGoals = num9;
    }
}
