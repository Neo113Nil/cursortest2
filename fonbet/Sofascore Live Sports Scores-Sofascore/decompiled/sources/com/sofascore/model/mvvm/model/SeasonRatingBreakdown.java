package com.sofascore.model.mvvm.model;

import com.ironsource.U3;
import defpackage.fc6;
import defpackage.h75;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0007=>?@AB<BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JL\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010%¨\u0006C"}, d2 = {"Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Shot;", "shot", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Pass;", "pass", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;", "dribble", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Defending;", "defending", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Goalkeeping;", "goalkeeping", "<init>", "(Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Shot;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Pass;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Defending;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Goalkeeping;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Shot;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Pass;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Defending;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Goalkeeping;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Shot;", "component2", "()Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Pass;", "component3", "()Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;", "component4", "()Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Defending;", "component5", "()Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Goalkeeping;", "copy", "(Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Shot;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Pass;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Defending;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Goalkeeping;)Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Shot;", "getShot", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Pass;", "getPass", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;", "getDribble", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Defending;", "getDefending", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Goalkeeping;", "getGoalkeeping", "Companion", "Shot", "Pass", "Dribble", "Defending", "Goalkeeping", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SeasonRatingBreakdown implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Defending defending;

    @Nullable
    private final Dribble dribble;

    @Nullable
    private final Goalkeeping goalkeeping;

    @Nullable
    private final Pass pass;

    @Nullable
    private final Shot shot;

    public /* synthetic */ SeasonRatingBreakdown(int i, Shot shot, Pass pass, Dribble dribble, Defending defending, Goalkeeping goalkeeping, t5h t5hVar) {
        if ((i & 1) == 0) {
            this.shot = null;
        } else {
            this.shot = shot;
        }
        if ((i & 2) == 0) {
            this.pass = null;
        } else {
            this.pass = pass;
        }
        if ((i & 4) == 0) {
            this.dribble = null;
        } else {
            this.dribble = dribble;
        }
        if ((i & 8) == 0) {
            this.defending = null;
        } else {
            this.defending = defending;
        }
        if ((i & 16) == 0) {
            this.goalkeeping = null;
        } else {
            this.goalkeeping = goalkeeping;
        }
    }

    public static /* synthetic */ SeasonRatingBreakdown copy$default(SeasonRatingBreakdown seasonRatingBreakdown, Shot shot, Pass pass, Dribble dribble, Defending defending, Goalkeeping goalkeeping, int i, Object obj) {
        if ((i & 1) != 0) {
            shot = seasonRatingBreakdown.shot;
        }
        if ((i & 2) != 0) {
            pass = seasonRatingBreakdown.pass;
        }
        if ((i & 4) != 0) {
            dribble = seasonRatingBreakdown.dribble;
        }
        if ((i & 8) != 0) {
            defending = seasonRatingBreakdown.defending;
        }
        if ((i & 16) != 0) {
            goalkeeping = seasonRatingBreakdown.goalkeeping;
        }
        Goalkeeping goalkeeping2 = goalkeeping;
        Dribble dribble2 = dribble;
        return seasonRatingBreakdown.copy(shot, pass, dribble2, defending, goalkeeping2);
    }

    public static final /* synthetic */ void write$Self$model_release(SeasonRatingBreakdown self, wf3 output, SerialDescriptor serialDesc) {
        if (output.o(serialDesc) || self.shot != null) {
            output.h(serialDesc, 0, SeasonRatingBreakdown$Shot$$serializer.INSTANCE, self.shot);
        }
        if (output.o(serialDesc) || self.pass != null) {
            output.h(serialDesc, 1, SeasonRatingBreakdown$Pass$$serializer.INSTANCE, self.pass);
        }
        if (output.o(serialDesc) || self.dribble != null) {
            output.h(serialDesc, 2, SeasonRatingBreakdown$Dribble$$serializer.INSTANCE, self.dribble);
        }
        if (output.o(serialDesc) || self.defending != null) {
            output.h(serialDesc, 3, SeasonRatingBreakdown$Defending$$serializer.INSTANCE, self.defending);
        }
        if (!output.o(serialDesc) && self.goalkeeping == null) {
            return;
        }
        output.h(serialDesc, 4, SeasonRatingBreakdown$Goalkeeping$$serializer.INSTANCE, self.goalkeeping);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Shot getShot() {
        return this.shot;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Pass getPass() {
        return this.pass;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Dribble getDribble() {
        return this.dribble;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Defending getDefending() {
        return this.defending;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Goalkeeping getGoalkeeping() {
        return this.goalkeeping;
    }

    @NotNull
    public final SeasonRatingBreakdown copy(@Nullable Shot shot, @Nullable Pass pass, @Nullable Dribble dribble, @Nullable Defending defending, @Nullable Goalkeeping goalkeeping) {
        return new SeasonRatingBreakdown(shot, pass, dribble, defending, goalkeeping);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonRatingBreakdown)) {
            return false;
        }
        SeasonRatingBreakdown seasonRatingBreakdown = (SeasonRatingBreakdown) other;
        return Intrinsics.c(this.shot, seasonRatingBreakdown.shot) && Intrinsics.c(this.pass, seasonRatingBreakdown.pass) && Intrinsics.c(this.dribble, seasonRatingBreakdown.dribble) && Intrinsics.c(this.defending, seasonRatingBreakdown.defending) && Intrinsics.c(this.goalkeeping, seasonRatingBreakdown.goalkeeping);
    }

    @Nullable
    public final Defending getDefending() {
        return this.defending;
    }

    @Nullable
    public final Dribble getDribble() {
        return this.dribble;
    }

    @Nullable
    public final Goalkeeping getGoalkeeping() {
        return this.goalkeeping;
    }

    @Nullable
    public final Pass getPass() {
        return this.pass;
    }

    @Nullable
    public final Shot getShot() {
        return this.shot;
    }

    public int hashCode() {
        Shot shot = this.shot;
        int hashCode = (shot == null ? 0 : shot.hashCode()) * 31;
        Pass pass = this.pass;
        int hashCode2 = (hashCode + (pass == null ? 0 : pass.hashCode())) * 31;
        Dribble dribble = this.dribble;
        int hashCode3 = (hashCode2 + (dribble == null ? 0 : dribble.hashCode())) * 31;
        Defending defending = this.defending;
        int hashCode4 = (hashCode3 + (defending == null ? 0 : defending.hashCode())) * 31;
        Goalkeeping goalkeeping = this.goalkeeping;
        return hashCode4 + (goalkeeping != null ? goalkeeping.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SeasonRatingBreakdown(shot=" + this.shot + ", pass=" + this.pass + ", dribble=" + this.dribble + ", defending=" + this.defending + ", goalkeeping=" + this.goalkeeping + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006,"}, d2 = {"Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Defending;", "Ljava/io/Serializable;", "", U3.i.X, "defensiveContributionsPerGame", "duelsWonPerGame", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Defending;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Defending;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getValue", "getDefensiveContributionsPerGame", "getDuelsWonPerGame", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Defending implements Serializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Double defensiveContributionsPerGame;

        @Nullable
        private final Double duelsWonPerGame;

        @Nullable
        private final Double value;

        public /* synthetic */ Defending(int i, Double d, Double d2, Double d3, t5h t5hVar) {
            if ((i & 1) == 0) {
                this.value = null;
            } else {
                this.value = d;
            }
            if ((i & 2) == 0) {
                this.defensiveContributionsPerGame = null;
            } else {
                this.defensiveContributionsPerGame = d2;
            }
            if ((i & 4) == 0) {
                this.duelsWonPerGame = null;
            } else {
                this.duelsWonPerGame = d3;
            }
        }

        public static /* synthetic */ Defending copy$default(Defending defending, Double d, Double d2, Double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                d = defending.value;
            }
            if ((i & 2) != 0) {
                d2 = defending.defensiveContributionsPerGame;
            }
            if ((i & 4) != 0) {
                d3 = defending.duelsWonPerGame;
            }
            return defending.copy(d, d2, d3);
        }

        public static final /* synthetic */ void write$Self$model_release(Defending self, wf3 output, SerialDescriptor serialDesc) {
            if (output.o(serialDesc) || self.value != null) {
                output.h(serialDesc, 0, h75.a, self.value);
            }
            if (output.o(serialDesc) || self.defensiveContributionsPerGame != null) {
                output.h(serialDesc, 1, h75.a, self.defensiveContributionsPerGame);
            }
            if (!output.o(serialDesc) && self.duelsWonPerGame == null) {
                return;
            }
            output.h(serialDesc, 2, h75.a, self.duelsWonPerGame);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Double getValue() {
            return this.value;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Double getDefensiveContributionsPerGame() {
            return this.defensiveContributionsPerGame;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Double getDuelsWonPerGame() {
            return this.duelsWonPerGame;
        }

        @NotNull
        public final Defending copy(@Nullable Double value, @Nullable Double defensiveContributionsPerGame, @Nullable Double duelsWonPerGame) {
            return new Defending(value, defensiveContributionsPerGame, duelsWonPerGame);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Defending)) {
                return false;
            }
            Defending defending = (Defending) other;
            return Intrinsics.c(this.value, defending.value) && Intrinsics.c(this.defensiveContributionsPerGame, defending.defensiveContributionsPerGame) && Intrinsics.c(this.duelsWonPerGame, defending.duelsWonPerGame);
        }

        @Nullable
        public final Double getDefensiveContributionsPerGame() {
            return this.defensiveContributionsPerGame;
        }

        @Nullable
        public final Double getDuelsWonPerGame() {
            return this.duelsWonPerGame;
        }

        @Nullable
        public final Double getValue() {
            return this.value;
        }

        public int hashCode() {
            Double d = this.value;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d2 = this.defensiveContributionsPerGame;
            int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.duelsWonPerGame;
            return hashCode2 + (d3 != null ? d3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Defending(value=" + this.value + ", defensiveContributionsPerGame=" + this.defensiveContributionsPerGame + ", duelsWonPerGame=" + this.duelsWonPerGame + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Defending$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Defending;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return SeasonRatingBreakdown$Defending$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Defending() {
            this((Double) null, (Double) null, (Double) null, 7, (DefaultConstructorMarker) null);
        }

        public Defending(@Nullable Double d, @Nullable Double d2, @Nullable Double d3) {
            this.value = d;
            this.defensiveContributionsPerGame = d2;
            this.duelsWonPerGame = d3;
        }

        public /* synthetic */ Defending(Double d, Double d2, Double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006,"}, d2 = {"Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;", "Ljava/io/Serializable;", "", U3.i.X, "successfulDribblesPerGame", "touchesPerGame", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getValue", "getSuccessfulDribblesPerGame", "getTouchesPerGame", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dribble implements Serializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Double successfulDribblesPerGame;

        @Nullable
        private final Double touchesPerGame;

        @Nullable
        private final Double value;

        public /* synthetic */ Dribble(int i, Double d, Double d2, Double d3, t5h t5hVar) {
            if ((i & 1) == 0) {
                this.value = null;
            } else {
                this.value = d;
            }
            if ((i & 2) == 0) {
                this.successfulDribblesPerGame = null;
            } else {
                this.successfulDribblesPerGame = d2;
            }
            if ((i & 4) == 0) {
                this.touchesPerGame = null;
            } else {
                this.touchesPerGame = d3;
            }
        }

        public static /* synthetic */ Dribble copy$default(Dribble dribble, Double d, Double d2, Double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                d = dribble.value;
            }
            if ((i & 2) != 0) {
                d2 = dribble.successfulDribblesPerGame;
            }
            if ((i & 4) != 0) {
                d3 = dribble.touchesPerGame;
            }
            return dribble.copy(d, d2, d3);
        }

        public static final /* synthetic */ void write$Self$model_release(Dribble self, wf3 output, SerialDescriptor serialDesc) {
            if (output.o(serialDesc) || self.value != null) {
                output.h(serialDesc, 0, h75.a, self.value);
            }
            if (output.o(serialDesc) || self.successfulDribblesPerGame != null) {
                output.h(serialDesc, 1, h75.a, self.successfulDribblesPerGame);
            }
            if (!output.o(serialDesc) && self.touchesPerGame == null) {
                return;
            }
            output.h(serialDesc, 2, h75.a, self.touchesPerGame);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Double getValue() {
            return this.value;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Double getSuccessfulDribblesPerGame() {
            return this.successfulDribblesPerGame;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Double getTouchesPerGame() {
            return this.touchesPerGame;
        }

        @NotNull
        public final Dribble copy(@Nullable Double value, @Nullable Double successfulDribblesPerGame, @Nullable Double touchesPerGame) {
            return new Dribble(value, successfulDribblesPerGame, touchesPerGame);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dribble)) {
                return false;
            }
            Dribble dribble = (Dribble) other;
            return Intrinsics.c(this.value, dribble.value) && Intrinsics.c(this.successfulDribblesPerGame, dribble.successfulDribblesPerGame) && Intrinsics.c(this.touchesPerGame, dribble.touchesPerGame);
        }

        @Nullable
        public final Double getSuccessfulDribblesPerGame() {
            return this.successfulDribblesPerGame;
        }

        @Nullable
        public final Double getTouchesPerGame() {
            return this.touchesPerGame;
        }

        @Nullable
        public final Double getValue() {
            return this.value;
        }

        public int hashCode() {
            Double d = this.value;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d2 = this.successfulDribblesPerGame;
            int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.touchesPerGame;
            return hashCode2 + (d3 != null ? d3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Dribble(value=" + this.value + ", successfulDribblesPerGame=" + this.successfulDribblesPerGame + ", touchesPerGame=" + this.touchesPerGame + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return SeasonRatingBreakdown$Dribble$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Dribble() {
            this((Double) null, (Double) null, (Double) null, 7, (DefaultConstructorMarker) null);
        }

        public Dribble(@Nullable Double d, @Nullable Double d2, @Nullable Double d3) {
            this.value = d;
            this.successfulDribblesPerGame = d2;
            this.touchesPerGame = d3;
        }

        public /* synthetic */ Dribble(Double d, Double d2, Double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006,"}, d2 = {"Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Goalkeeping;", "Ljava/io/Serializable;", "", U3.i.X, "goalsPrevented", "savesPerGame", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Goalkeeping;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Goalkeeping;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getValue", "getGoalsPrevented", "getSavesPerGame", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Goalkeeping implements Serializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Double goalsPrevented;

        @Nullable
        private final Double savesPerGame;

        @Nullable
        private final Double value;

        public /* synthetic */ Goalkeeping(int i, Double d, Double d2, Double d3, t5h t5hVar) {
            if ((i & 1) == 0) {
                this.value = null;
            } else {
                this.value = d;
            }
            if ((i & 2) == 0) {
                this.goalsPrevented = null;
            } else {
                this.goalsPrevented = d2;
            }
            if ((i & 4) == 0) {
                this.savesPerGame = null;
            } else {
                this.savesPerGame = d3;
            }
        }

        public static /* synthetic */ Goalkeeping copy$default(Goalkeeping goalkeeping, Double d, Double d2, Double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                d = goalkeeping.value;
            }
            if ((i & 2) != 0) {
                d2 = goalkeeping.goalsPrevented;
            }
            if ((i & 4) != 0) {
                d3 = goalkeeping.savesPerGame;
            }
            return goalkeeping.copy(d, d2, d3);
        }

        public static final /* synthetic */ void write$Self$model_release(Goalkeeping self, wf3 output, SerialDescriptor serialDesc) {
            if (output.o(serialDesc) || self.value != null) {
                output.h(serialDesc, 0, h75.a, self.value);
            }
            if (output.o(serialDesc) || self.goalsPrevented != null) {
                output.h(serialDesc, 1, h75.a, self.goalsPrevented);
            }
            if (!output.o(serialDesc) && self.savesPerGame == null) {
                return;
            }
            output.h(serialDesc, 2, h75.a, self.savesPerGame);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Double getValue() {
            return this.value;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Double getGoalsPrevented() {
            return this.goalsPrevented;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Double getSavesPerGame() {
            return this.savesPerGame;
        }

        @NotNull
        public final Goalkeeping copy(@Nullable Double value, @Nullable Double goalsPrevented, @Nullable Double savesPerGame) {
            return new Goalkeeping(value, goalsPrevented, savesPerGame);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Goalkeeping)) {
                return false;
            }
            Goalkeeping goalkeeping = (Goalkeeping) other;
            return Intrinsics.c(this.value, goalkeeping.value) && Intrinsics.c(this.goalsPrevented, goalkeeping.goalsPrevented) && Intrinsics.c(this.savesPerGame, goalkeeping.savesPerGame);
        }

        @Nullable
        public final Double getGoalsPrevented() {
            return this.goalsPrevented;
        }

        @Nullable
        public final Double getSavesPerGame() {
            return this.savesPerGame;
        }

        @Nullable
        public final Double getValue() {
            return this.value;
        }

        public int hashCode() {
            Double d = this.value;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d2 = this.goalsPrevented;
            int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.savesPerGame;
            return hashCode2 + (d3 != null ? d3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Goalkeeping(value=" + this.value + ", goalsPrevented=" + this.goalsPrevented + ", savesPerGame=" + this.savesPerGame + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Goalkeeping$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Goalkeeping;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return SeasonRatingBreakdown$Goalkeeping$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Goalkeeping() {
            this((Double) null, (Double) null, (Double) null, 7, (DefaultConstructorMarker) null);
        }

        public Goalkeeping(@Nullable Double d, @Nullable Double d2, @Nullable Double d3) {
            this.value = d;
            this.goalsPrevented = d2;
            this.savesPerGame = d3;
        }

        public /* synthetic */ Goalkeeping(Double d, Double d2, Double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0018¨\u0006/"}, d2 = {"Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Pass;", "Ljava/io/Serializable;", "", U3.i.X, "expectedAssists", "accuratePassesPerGame", "keyPassesPerGame", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Pass;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Pass;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getValue", "getExpectedAssists", "getAccuratePassesPerGame", "getKeyPassesPerGame", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Pass implements Serializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Double accuratePassesPerGame;

        @Nullable
        private final Double expectedAssists;

        @Nullable
        private final Double keyPassesPerGame;

        @Nullable
        private final Double value;

        public /* synthetic */ Pass(int i, Double d, Double d2, Double d3, Double d4, t5h t5hVar) {
            if ((i & 1) == 0) {
                this.value = null;
            } else {
                this.value = d;
            }
            if ((i & 2) == 0) {
                this.expectedAssists = null;
            } else {
                this.expectedAssists = d2;
            }
            if ((i & 4) == 0) {
                this.accuratePassesPerGame = null;
            } else {
                this.accuratePassesPerGame = d3;
            }
            if ((i & 8) == 0) {
                this.keyPassesPerGame = null;
            } else {
                this.keyPassesPerGame = d4;
            }
        }

        public static /* synthetic */ Pass copy$default(Pass pass, Double d, Double d2, Double d3, Double d4, int i, Object obj) {
            if ((i & 1) != 0) {
                d = pass.value;
            }
            if ((i & 2) != 0) {
                d2 = pass.expectedAssists;
            }
            if ((i & 4) != 0) {
                d3 = pass.accuratePassesPerGame;
            }
            if ((i & 8) != 0) {
                d4 = pass.keyPassesPerGame;
            }
            return pass.copy(d, d2, d3, d4);
        }

        public static final /* synthetic */ void write$Self$model_release(Pass self, wf3 output, SerialDescriptor serialDesc) {
            if (output.o(serialDesc) || self.value != null) {
                output.h(serialDesc, 0, h75.a, self.value);
            }
            if (output.o(serialDesc) || self.expectedAssists != null) {
                output.h(serialDesc, 1, h75.a, self.expectedAssists);
            }
            if (output.o(serialDesc) || self.accuratePassesPerGame != null) {
                output.h(serialDesc, 2, h75.a, self.accuratePassesPerGame);
            }
            if (!output.o(serialDesc) && self.keyPassesPerGame == null) {
                return;
            }
            output.h(serialDesc, 3, h75.a, self.keyPassesPerGame);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Double getValue() {
            return this.value;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Double getExpectedAssists() {
            return this.expectedAssists;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Double getAccuratePassesPerGame() {
            return this.accuratePassesPerGame;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Double getKeyPassesPerGame() {
            return this.keyPassesPerGame;
        }

        @NotNull
        public final Pass copy(@Nullable Double value, @Nullable Double expectedAssists, @Nullable Double accuratePassesPerGame, @Nullable Double keyPassesPerGame) {
            return new Pass(value, expectedAssists, accuratePassesPerGame, keyPassesPerGame);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pass)) {
                return false;
            }
            Pass pass = (Pass) other;
            return Intrinsics.c(this.value, pass.value) && Intrinsics.c(this.expectedAssists, pass.expectedAssists) && Intrinsics.c(this.accuratePassesPerGame, pass.accuratePassesPerGame) && Intrinsics.c(this.keyPassesPerGame, pass.keyPassesPerGame);
        }

        @Nullable
        public final Double getAccuratePassesPerGame() {
            return this.accuratePassesPerGame;
        }

        @Nullable
        public final Double getExpectedAssists() {
            return this.expectedAssists;
        }

        @Nullable
        public final Double getKeyPassesPerGame() {
            return this.keyPassesPerGame;
        }

        @Nullable
        public final Double getValue() {
            return this.value;
        }

        public int hashCode() {
            Double d = this.value;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d2 = this.expectedAssists;
            int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.accuratePassesPerGame;
            int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
            Double d4 = this.keyPassesPerGame;
            return hashCode3 + (d4 != null ? d4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Pass(value=" + this.value + ", expectedAssists=" + this.expectedAssists + ", accuratePassesPerGame=" + this.accuratePassesPerGame + ", keyPassesPerGame=" + this.keyPassesPerGame + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Pass$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Pass;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return SeasonRatingBreakdown$Pass$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Pass() {
            this((Double) null, (Double) null, (Double) null, (Double) null, 15, (DefaultConstructorMarker) null);
        }

        public Pass(@Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4) {
            this.value = d;
            this.expectedAssists = d2;
            this.accuratePassesPerGame = d3;
            this.keyPassesPerGame = d4;
        }

        public /* synthetic */ Pass(Double d, Double d2, Double d3, Double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u0019¨\u00062"}, d2 = {"Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Shot;", "Ljava/io/Serializable;", "", U3.i.X, "expectedGoals", "expectedGoalsOnTarget", "totalShotsPerGame", "shotsOnTargetPerGame", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Shot;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Shot;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getValue", "getExpectedGoals", "getExpectedGoalsOnTarget", "getTotalShotsPerGame", "getShotsOnTargetPerGame", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Shot implements Serializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Double expectedGoals;

        @Nullable
        private final Double expectedGoalsOnTarget;

        @Nullable
        private final Double shotsOnTargetPerGame;

        @Nullable
        private final Double totalShotsPerGame;

        @Nullable
        private final Double value;

        public /* synthetic */ Shot(int i, Double d, Double d2, Double d3, Double d4, Double d5, t5h t5hVar) {
            if ((i & 1) == 0) {
                this.value = null;
            } else {
                this.value = d;
            }
            if ((i & 2) == 0) {
                this.expectedGoals = null;
            } else {
                this.expectedGoals = d2;
            }
            if ((i & 4) == 0) {
                this.expectedGoalsOnTarget = null;
            } else {
                this.expectedGoalsOnTarget = d3;
            }
            if ((i & 8) == 0) {
                this.totalShotsPerGame = null;
            } else {
                this.totalShotsPerGame = d4;
            }
            if ((i & 16) == 0) {
                this.shotsOnTargetPerGame = null;
            } else {
                this.shotsOnTargetPerGame = d5;
            }
        }

        public static /* synthetic */ Shot copy$default(Shot shot, Double d, Double d2, Double d3, Double d4, Double d5, int i, Object obj) {
            if ((i & 1) != 0) {
                d = shot.value;
            }
            if ((i & 2) != 0) {
                d2 = shot.expectedGoals;
            }
            if ((i & 4) != 0) {
                d3 = shot.expectedGoalsOnTarget;
            }
            if ((i & 8) != 0) {
                d4 = shot.totalShotsPerGame;
            }
            if ((i & 16) != 0) {
                d5 = shot.shotsOnTargetPerGame;
            }
            Double d6 = d5;
            Double d7 = d3;
            return shot.copy(d, d2, d7, d4, d6);
        }

        public static final /* synthetic */ void write$Self$model_release(Shot self, wf3 output, SerialDescriptor serialDesc) {
            if (output.o(serialDesc) || self.value != null) {
                output.h(serialDesc, 0, h75.a, self.value);
            }
            if (output.o(serialDesc) || self.expectedGoals != null) {
                output.h(serialDesc, 1, h75.a, self.expectedGoals);
            }
            if (output.o(serialDesc) || self.expectedGoalsOnTarget != null) {
                output.h(serialDesc, 2, h75.a, self.expectedGoalsOnTarget);
            }
            if (output.o(serialDesc) || self.totalShotsPerGame != null) {
                output.h(serialDesc, 3, h75.a, self.totalShotsPerGame);
            }
            if (!output.o(serialDesc) && self.shotsOnTargetPerGame == null) {
                return;
            }
            output.h(serialDesc, 4, h75.a, self.shotsOnTargetPerGame);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Double getValue() {
            return this.value;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Double getExpectedGoals() {
            return this.expectedGoals;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Double getExpectedGoalsOnTarget() {
            return this.expectedGoalsOnTarget;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Double getTotalShotsPerGame() {
            return this.totalShotsPerGame;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Double getShotsOnTargetPerGame() {
            return this.shotsOnTargetPerGame;
        }

        @NotNull
        public final Shot copy(@Nullable Double value, @Nullable Double expectedGoals, @Nullable Double expectedGoalsOnTarget, @Nullable Double totalShotsPerGame, @Nullable Double shotsOnTargetPerGame) {
            return new Shot(value, expectedGoals, expectedGoalsOnTarget, totalShotsPerGame, shotsOnTargetPerGame);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Shot)) {
                return false;
            }
            Shot shot = (Shot) other;
            return Intrinsics.c(this.value, shot.value) && Intrinsics.c(this.expectedGoals, shot.expectedGoals) && Intrinsics.c(this.expectedGoalsOnTarget, shot.expectedGoalsOnTarget) && Intrinsics.c(this.totalShotsPerGame, shot.totalShotsPerGame) && Intrinsics.c(this.shotsOnTargetPerGame, shot.shotsOnTargetPerGame);
        }

        @Nullable
        public final Double getExpectedGoals() {
            return this.expectedGoals;
        }

        @Nullable
        public final Double getExpectedGoalsOnTarget() {
            return this.expectedGoalsOnTarget;
        }

        @Nullable
        public final Double getShotsOnTargetPerGame() {
            return this.shotsOnTargetPerGame;
        }

        @Nullable
        public final Double getTotalShotsPerGame() {
            return this.totalShotsPerGame;
        }

        @Nullable
        public final Double getValue() {
            return this.value;
        }

        public int hashCode() {
            Double d = this.value;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d2 = this.expectedGoals;
            int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.expectedGoalsOnTarget;
            int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
            Double d4 = this.totalShotsPerGame;
            int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
            Double d5 = this.shotsOnTargetPerGame;
            return hashCode4 + (d5 != null ? d5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Double d = this.value;
            Double d2 = this.expectedGoals;
            Double d3 = this.expectedGoalsOnTarget;
            Double d4 = this.totalShotsPerGame;
            Double d5 = this.shotsOnTargetPerGame;
            StringBuilder sb = new StringBuilder("Shot(value=");
            sb.append(d);
            sb.append(", expectedGoals=");
            sb.append(d2);
            sb.append(", expectedGoalsOnTarget=");
            fc6.A(sb, d3, ", totalShotsPerGame=", d4, ", shotsOnTargetPerGame=");
            sb.append(d5);
            sb.append(")");
            return sb.toString();
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Shot$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Shot;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return SeasonRatingBreakdown$Shot$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Shot() {
            this((Double) null, (Double) null, (Double) null, (Double) null, (Double) null, 31, (DefaultConstructorMarker) null);
        }

        public Shot(@Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5) {
            this.value = d;
            this.expectedGoals = d2;
            this.expectedGoalsOnTarget = d3;
            this.totalShotsPerGame = d4;
            this.shotsOnTargetPerGame = d5;
        }

        public /* synthetic */ Shot(Double d, Double d2, Double d3, Double d4, Double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4, (i & 16) != 0 ? null : d5);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SeasonRatingBreakdown$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SeasonRatingBreakdown() {
        this((Shot) null, (Pass) null, (Dribble) null, (Defending) null, (Goalkeeping) null, 31, (DefaultConstructorMarker) null);
    }

    public SeasonRatingBreakdown(@Nullable Shot shot, @Nullable Pass pass, @Nullable Dribble dribble, @Nullable Defending defending, @Nullable Goalkeeping goalkeeping) {
        this.shot = shot;
        this.pass = pass;
        this.dribble = dribble;
        this.defending = defending;
        this.goalkeeping = goalkeeping;
    }

    public /* synthetic */ SeasonRatingBreakdown(Shot shot, Pass pass, Dribble dribble, Defending defending, Goalkeeping goalkeeping, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : shot, (i & 2) != 0 ? null : pass, (i & 4) != 0 ? null : dribble, (i & 8) != 0 ? null : defending, (i & 16) != 0 ? null : goalkeeping);
    }
}
