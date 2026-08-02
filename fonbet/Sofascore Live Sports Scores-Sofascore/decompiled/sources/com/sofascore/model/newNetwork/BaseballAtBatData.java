package com.sofascore.model.newNetwork;

import defpackage.c88;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010#JT\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010 J\u001a\u0010/\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b6\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b7\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b8\u0010#¨\u0006;"}, d2 = {"Lcom/sofascore/model/newNetwork/BaseballAtBatData;", "Ljava/io/Serializable;", "", "id", "inning", "", "homeTeamWinningProbability", "awayTeamWinningProbability", "homeTeamWinningProbabilityStart", "awayTeamWinningProbabilityStart", "<init>", "(IILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lt5h;)V", "", "forHomeTeam", "getProbabilityOnAtBatStart", "(Z)Ljava/lang/Float;", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/BaseballAtBatData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getProbability", "getProbabilityChange", "component1", "()I", "component2", "component3", "()Ljava/lang/Float;", "component4", "component5", "component6", "copy", "(IILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/sofascore/model/newNetwork/BaseballAtBatData;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getInning", "Ljava/lang/Float;", "getHomeTeamWinningProbability", "getAwayTeamWinningProbability", "getHomeTeamWinningProbabilityStart", "getAwayTeamWinningProbabilityStart", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BaseballAtBatData implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float awayTeamWinningProbability;

    @Nullable
    private final Float awayTeamWinningProbabilityStart;

    @Nullable
    private final Float homeTeamWinningProbability;

    @Nullable
    private final Float homeTeamWinningProbabilityStart;
    private final int id;
    private final int inning;

    public /* synthetic */ BaseballAtBatData(int i, int i2, int i3, Float f, Float f2, Float f3, Float f4, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, BaseballAtBatData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.inning = i3;
        this.homeTeamWinningProbability = f;
        this.awayTeamWinningProbability = f2;
        this.homeTeamWinningProbabilityStart = f3;
        this.awayTeamWinningProbabilityStart = f4;
    }

    public static /* synthetic */ BaseballAtBatData copy$default(BaseballAtBatData baseballAtBatData, int i, int i2, Float f, Float f2, Float f3, Float f4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = baseballAtBatData.id;
        }
        if ((i3 & 2) != 0) {
            i2 = baseballAtBatData.inning;
        }
        if ((i3 & 4) != 0) {
            f = baseballAtBatData.homeTeamWinningProbability;
        }
        if ((i3 & 8) != 0) {
            f2 = baseballAtBatData.awayTeamWinningProbability;
        }
        if ((i3 & 16) != 0) {
            f3 = baseballAtBatData.homeTeamWinningProbabilityStart;
        }
        if ((i3 & 32) != 0) {
            f4 = baseballAtBatData.awayTeamWinningProbabilityStart;
        }
        Float f5 = f3;
        Float f6 = f4;
        return baseballAtBatData.copy(i, i2, f, f2, f5, f6);
    }

    private final Float getProbabilityOnAtBatStart(boolean forHomeTeam) {
        return forHomeTeam ? this.homeTeamWinningProbabilityStart : this.awayTeamWinningProbabilityStart;
    }

    public static final /* synthetic */ void write$Self$model_release(BaseballAtBatData self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.u(1, self.inning, serialDesc);
        c88 c88Var = c88.a;
        output.h(serialDesc, 2, c88Var, self.homeTeamWinningProbability);
        output.h(serialDesc, 3, c88Var, self.awayTeamWinningProbability);
        output.h(serialDesc, 4, c88Var, self.homeTeamWinningProbabilityStart);
        output.h(serialDesc, 5, c88Var, self.awayTeamWinningProbabilityStart);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getInning() {
        return this.inning;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Float getHomeTeamWinningProbability() {
        return this.homeTeamWinningProbability;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Float getAwayTeamWinningProbability() {
        return this.awayTeamWinningProbability;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getHomeTeamWinningProbabilityStart() {
        return this.homeTeamWinningProbabilityStart;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getAwayTeamWinningProbabilityStart() {
        return this.awayTeamWinningProbabilityStart;
    }

    @NotNull
    public final BaseballAtBatData copy(int id, int inning, @Nullable Float homeTeamWinningProbability, @Nullable Float awayTeamWinningProbability, @Nullable Float homeTeamWinningProbabilityStart, @Nullable Float awayTeamWinningProbabilityStart) {
        return new BaseballAtBatData(id, inning, homeTeamWinningProbability, awayTeamWinningProbability, homeTeamWinningProbabilityStart, awayTeamWinningProbabilityStart);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseballAtBatData)) {
            return false;
        }
        BaseballAtBatData baseballAtBatData = (BaseballAtBatData) other;
        return this.id == baseballAtBatData.id && this.inning == baseballAtBatData.inning && Intrinsics.c(this.homeTeamWinningProbability, baseballAtBatData.homeTeamWinningProbability) && Intrinsics.c(this.awayTeamWinningProbability, baseballAtBatData.awayTeamWinningProbability) && Intrinsics.c(this.homeTeamWinningProbabilityStart, baseballAtBatData.homeTeamWinningProbabilityStart) && Intrinsics.c(this.awayTeamWinningProbabilityStart, baseballAtBatData.awayTeamWinningProbabilityStart);
    }

    @Nullable
    public final Float getAwayTeamWinningProbability() {
        return this.awayTeamWinningProbability;
    }

    @Nullable
    public final Float getAwayTeamWinningProbabilityStart() {
        return this.awayTeamWinningProbabilityStart;
    }

    @Nullable
    public final Float getHomeTeamWinningProbability() {
        return this.homeTeamWinningProbability;
    }

    @Nullable
    public final Float getHomeTeamWinningProbabilityStart() {
        return this.homeTeamWinningProbabilityStart;
    }

    public final int getId() {
        return this.id;
    }

    public final int getInning() {
        return this.inning;
    }

    @Nullable
    public final Float getProbability(boolean forHomeTeam) {
        return forHomeTeam ? this.homeTeamWinningProbability : this.awayTeamWinningProbability;
    }

    @Nullable
    public final Float getProbabilityChange(boolean forHomeTeam) {
        Float probability = getProbability(forHomeTeam);
        if (probability != null) {
            float floatValue = probability.floatValue();
            Float probabilityOnAtBatStart = getProbabilityOnAtBatStart(forHomeTeam);
            if (probabilityOnAtBatStart != null) {
                return Float.valueOf(floatValue - probabilityOnAtBatStart.floatValue());
            }
        }
        return null;
    }

    public int hashCode() {
        int a = wv8.a(this.inning, Integer.hashCode(this.id) * 31, 31);
        Float f = this.homeTeamWinningProbability;
        int hashCode = (a + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.awayTeamWinningProbability;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.homeTeamWinningProbabilityStart;
        int hashCode3 = (hashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.awayTeamWinningProbabilityStart;
        return hashCode3 + (f4 != null ? f4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.inning;
        Float f = this.homeTeamWinningProbability;
        Float f2 = this.awayTeamWinningProbability;
        Float f3 = this.homeTeamWinningProbabilityStart;
        Float f4 = this.awayTeamWinningProbabilityStart;
        StringBuilder s = lnb.s(i, i2, "BaseballAtBatData(id=", ", inning=", ", homeTeamWinningProbability=");
        s.append(f);
        s.append(", awayTeamWinningProbability=");
        s.append(f2);
        s.append(", homeTeamWinningProbabilityStart=");
        s.append(f3);
        s.append(", awayTeamWinningProbabilityStart=");
        s.append(f4);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/BaseballAtBatData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/BaseballAtBatData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballAtBatData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BaseballAtBatData(int i, int i2, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4) {
        this.id = i;
        this.inning = i2;
        this.homeTeamWinningProbability = f;
        this.awayTeamWinningProbability = f2;
        this.homeTeamWinningProbabilityStart = f3;
        this.awayTeamWinningProbabilityStart = f4;
    }
}
