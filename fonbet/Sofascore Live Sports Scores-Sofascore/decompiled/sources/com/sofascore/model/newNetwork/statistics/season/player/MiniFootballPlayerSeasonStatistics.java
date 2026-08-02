package com.sofascore.model.newNetwork.statistics.season.player;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.a7a;
import defpackage.dmi;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0002KJBq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0090\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010\u001aJ\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b)\u0010\u0018J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b@\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\bA\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bB\u0010\u001cR$\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010<\u001a\u0004\bC\u0010\u001c\"\u0004\bD\u0010ER$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010<\u001a\u0004\bF\u0010\u001c\"\u0004\bG\u0010ER\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bH\u0010\u001cR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bI\u0010\u001c¨\u0006L"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/MiniFootballPlayerSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "Ljava/io/Serializable;", "", "id", "", "type", "appearances", "", CampaignEx.JSON_KEY_STAR, "goals", "accumulatedPenaltyGoals", "assists", "penaltyGoals", "penaltyAttempts", "ownGoals", "redCards", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/statistics/season/player/MiniFootballPlayerSeasonStatistics;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/MiniFootballPlayerSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getType", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/Double;", "getRating", "getGoals", "getAccumulatedPenaltyGoals", "getAssists", "getPenaltyGoals", "setPenaltyGoals", "(Ljava/lang/Integer;)V", "getPenaltyAttempts", "setPenaltyAttempts", "getOwnGoals", "getRedCards", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MiniFootballPlayerSeasonStatistics extends AbstractPlayerSeasonStatistics implements Serializable {

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
    private Integer penaltyAttempts;

    @Nullable
    private Integer penaltyGoals;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer redCards;

    @NotNull
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MiniFootballPlayerSeasonStatistics(int i, int i2, String str, Integer num, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, t5h t5hVar) {
        super(i, t5hVar);
        if (2047 != (i & 2047)) {
            oea.z(i, 2047, MiniFootballPlayerSeasonStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.goals = num2;
        this.accumulatedPenaltyGoals = num3;
        this.assists = num4;
        this.penaltyGoals = num5;
        this.penaltyAttempts = num6;
        this.ownGoals = num7;
        this.redCards = num8;
    }

    public static /* synthetic */ MiniFootballPlayerSeasonStatistics copy$default(MiniFootballPlayerSeasonStatistics miniFootballPlayerSeasonStatistics, int i, String str, Integer num, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = miniFootballPlayerSeasonStatistics.id;
        }
        if ((i2 & 2) != 0) {
            str = miniFootballPlayerSeasonStatistics.type;
        }
        if ((i2 & 4) != 0) {
            num = miniFootballPlayerSeasonStatistics.appearances;
        }
        if ((i2 & 8) != 0) {
            d = miniFootballPlayerSeasonStatistics.rating;
        }
        if ((i2 & 16) != 0) {
            num2 = miniFootballPlayerSeasonStatistics.goals;
        }
        if ((i2 & 32) != 0) {
            num3 = miniFootballPlayerSeasonStatistics.accumulatedPenaltyGoals;
        }
        if ((i2 & 64) != 0) {
            num4 = miniFootballPlayerSeasonStatistics.assists;
        }
        if ((i2 & 128) != 0) {
            num5 = miniFootballPlayerSeasonStatistics.penaltyGoals;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num6 = miniFootballPlayerSeasonStatistics.penaltyAttempts;
        }
        if ((i2 & 512) != 0) {
            num7 = miniFootballPlayerSeasonStatistics.ownGoals;
        }
        if ((i2 & 1024) != 0) {
            num8 = miniFootballPlayerSeasonStatistics.redCards;
        }
        Integer num9 = num7;
        Integer num10 = num8;
        Integer num11 = num5;
        Integer num12 = num6;
        Integer num13 = num3;
        Integer num14 = num4;
        Integer num15 = num2;
        Integer num16 = num;
        return miniFootballPlayerSeasonStatistics.copy(i, str, num16, d, num15, num13, num14, num11, num12, num9, num10);
    }

    public static final /* synthetic */ void write$Self$model_release(MiniFootballPlayerSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
        AbstractPlayerSeasonStatistics.write$Self(self, output, serialDesc);
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.getType());
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.getAppearances());
        output.h(serialDesc, 3, h75.a, self.getRating());
        output.h(serialDesc, 4, a7aVar, self.goals);
        output.h(serialDesc, 5, a7aVar, self.accumulatedPenaltyGoals);
        output.h(serialDesc, 6, a7aVar, self.assists);
        output.h(serialDesc, 7, a7aVar, self.penaltyGoals);
        output.h(serialDesc, 8, a7aVar, self.penaltyAttempts);
        output.h(serialDesc, 9, a7aVar, self.ownGoals);
        output.h(serialDesc, 10, a7aVar, self.redCards);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getOwnGoals() {
        return this.ownGoals;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getRedCards() {
        return this.redCards;
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
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getAccumulatedPenaltyGoals() {
        return this.accumulatedPenaltyGoals;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getPenaltyAttempts() {
        return this.penaltyAttempts;
    }

    @NotNull
    public final MiniFootballPlayerSeasonStatistics copy(int id, @NotNull String type, @Nullable Integer appearances, @Nullable Double rating, @Nullable Integer goals, @Nullable Integer accumulatedPenaltyGoals, @Nullable Integer assists, @Nullable Integer penaltyGoals, @Nullable Integer penaltyAttempts, @Nullable Integer ownGoals, @Nullable Integer redCards) {
        type.getClass();
        return new MiniFootballPlayerSeasonStatistics(id, type, appearances, rating, goals, accumulatedPenaltyGoals, assists, penaltyGoals, penaltyAttempts, ownGoals, redCards);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniFootballPlayerSeasonStatistics)) {
            return false;
        }
        MiniFootballPlayerSeasonStatistics miniFootballPlayerSeasonStatistics = (MiniFootballPlayerSeasonStatistics) other;
        return this.id == miniFootballPlayerSeasonStatistics.id && Intrinsics.c(this.type, miniFootballPlayerSeasonStatistics.type) && Intrinsics.c(this.appearances, miniFootballPlayerSeasonStatistics.appearances) && Intrinsics.c(this.rating, miniFootballPlayerSeasonStatistics.rating) && Intrinsics.c(this.goals, miniFootballPlayerSeasonStatistics.goals) && Intrinsics.c(this.accumulatedPenaltyGoals, miniFootballPlayerSeasonStatistics.accumulatedPenaltyGoals) && Intrinsics.c(this.assists, miniFootballPlayerSeasonStatistics.assists) && Intrinsics.c(this.penaltyGoals, miniFootballPlayerSeasonStatistics.penaltyGoals) && Intrinsics.c(this.penaltyAttempts, miniFootballPlayerSeasonStatistics.penaltyAttempts) && Intrinsics.c(this.ownGoals, miniFootballPlayerSeasonStatistics.ownGoals) && Intrinsics.c(this.redCards, miniFootballPlayerSeasonStatistics.redCards);
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

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.type);
        Integer num = this.appearances;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.rating;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.goals;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.accumulatedPenaltyGoals;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.assists;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.penaltyGoals;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.penaltyAttempts;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.ownGoals;
        int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.redCards;
        return hashCode8 + (num8 != null ? num8.hashCode() : 0);
    }

    public final void setPenaltyAttempts(@Nullable Integer num) {
        this.penaltyAttempts = num;
    }

    public final void setPenaltyGoals(@Nullable Integer num) {
        this.penaltyGoals = num;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        Integer num = this.appearances;
        Double d = this.rating;
        Integer num2 = this.goals;
        Integer num3 = this.accumulatedPenaltyGoals;
        Integer num4 = this.assists;
        Integer num5 = this.penaltyGoals;
        Integer num6 = this.penaltyAttempts;
        Integer num7 = this.ownGoals;
        Integer num8 = this.redCards;
        StringBuilder t = dmi.t(i, "MiniFootballPlayerSeasonStatistics(id=", ", type=", str, ", appearances=");
        fn0.v(d, num, ", rating=", ", goals=", t);
        vxd.r(num2, num3, ", accumulatedPenaltyGoals=", ", assists=", t);
        vxd.r(num4, num5, ", penaltyGoals=", ", penaltyAttempts=", t);
        vxd.r(num6, num7, ", ownGoals=", ", redCards=", t);
        return vxd.n(t, num8, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/MiniFootballPlayerSeasonStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/player/MiniFootballPlayerSeasonStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MiniFootballPlayerSeasonStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MiniFootballPlayerSeasonStatistics(int i, @NotNull String str, @Nullable Integer num, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8) {
        str.getClass();
        this.id = i;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.goals = num2;
        this.accumulatedPenaltyGoals = num3;
        this.assists = num4;
        this.penaltyGoals = num5;
        this.penaltyAttempts = num6;
        this.ownGoals = num7;
        this.redCards = num8;
    }
}
