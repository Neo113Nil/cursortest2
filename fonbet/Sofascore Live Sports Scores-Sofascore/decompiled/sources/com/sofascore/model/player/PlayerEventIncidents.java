package com.sofascore.model.player;

import defpackage.a7a;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002?>B±\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aBÍ\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010*J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010*J\u000f\u0010.\u001a\u00020\u0007H\u0016¢\u0006\u0004\b.\u0010*J\u000f\u0010/\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u0010*J\u000f\u00100\u001a\u00020\u0007H\u0016¢\u0006\u0004\b0\u0010*J\u000f\u00101\u001a\u00020\u0007H\u0016¢\u0006\u0004\b1\u0010*J\u000f\u00102\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u0010*J\u000f\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b3\u0010*J\u000f\u00104\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u0010*J\u000f\u00105\u001a\u00020\u0007H\u0016¢\u0006\u0004\b5\u0010*J\u000f\u00106\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u0010*J\u000f\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u0010*J\u000f\u00108\u001a\u00020\u0007H\u0016¢\u0006\u0004\b8\u0010*J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010*J\u000f\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u0010*R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010;R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010;R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010;R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010;R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010;R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010;R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010;R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010;R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010;R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010;R\u001a\u0010\u001c\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010<\u001a\u0004\b=\u0010*¨\u0006@"}, d2 = {"Lcom/sofascore/model/player/PlayerEventIncidents;", "Ljava/io/Serializable;", "Lcom/sofascore/model/player/AmericanFootballPlayerEventIncidents;", "Lcom/sofascore/model/player/HandballPlayerEventIncidents;", "Lcom/sofascore/model/player/IceHockeyPlayerEventIncidents;", "Lcom/sofascore/model/player/FootballPlayerEventIncidents;", "Lcom/sofascore/model/player/MinifootballPlayerEventIncidents;", "", "goals", "assists", "yellowCards", "redCards", "yellowRedCards", "ownGoals", "penaltyGoals", "kickingFgMade", "passingTouchdowns", "defensiveInterceptionsTouchdowns", "fumbleTouchdownReturns", "kickReturnsTouchdowns", "rushingTouchdowns", "puntingReturnTouchdowns", "puntReturnsTouchdowns", "receivingTouchdowns", "kickingExtraMade", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "accumulatedPenaltyGoals", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/player/PlayerEventIncidents;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getGoals", "()I", "getAssists", "getYellowCards", "getRedCards", "getYellowRedCards", "getOwnGoals", "getPenaltyGoals", "getKickingFgMade", "getPassingTouchdowns", "getDefensiveInterceptionsTouchdowns", "getFumbleTouchdownReturns", "getKickReturnsTouchdowns", "getRushingTouchdowns", "getPuntingReturnTouchdowns", "getPuntReturnsTouchdowns", "getReceivingTouchdowns", "getKickingExtraMade", "Ljava/lang/Integer;", "I", "getAccumulatedPenaltyGoals", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlayerEventIncidents implements Serializable, AmericanFootballPlayerEventIncidents, HandballPlayerEventIncidents, IceHockeyPlayerEventIncidents, FootballPlayerEventIncidents, MinifootballPlayerEventIncidents {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int accumulatedPenaltyGoals;

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer defensiveInterceptionsTouchdowns;

    @Nullable
    private final Integer fumbleTouchdownReturns;

    @Nullable
    private final Integer goals;

    @Nullable
    private final Integer kickReturnsTouchdowns;

    @Nullable
    private final Integer kickingExtraMade;

    @Nullable
    private final Integer kickingFgMade;

    @Nullable
    private final Integer ownGoals;

    @Nullable
    private final Integer passingTouchdowns;

    @Nullable
    private final Integer penaltyGoals;

    @Nullable
    private final Integer puntReturnsTouchdowns;

    @Nullable
    private final Integer puntingReturnTouchdowns;

    @Nullable
    private final Integer receivingTouchdowns;

    @Nullable
    private final Integer redCards;

    @Nullable
    private final Integer rushingTouchdowns;

    @Nullable
    private final Integer yellowCards;

    @Nullable
    private final Integer yellowRedCards;

    public /* synthetic */ PlayerEventIncidents(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, int i2, t5h t5hVar) {
        if (131071 != (i & 131071)) {
            oea.z(i, 131071, PlayerEventIncidents$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.goals = num;
        this.assists = num2;
        this.yellowCards = num3;
        this.redCards = num4;
        this.yellowRedCards = num5;
        this.ownGoals = num6;
        this.penaltyGoals = num7;
        this.kickingFgMade = num8;
        this.passingTouchdowns = num9;
        this.defensiveInterceptionsTouchdowns = num10;
        this.fumbleTouchdownReturns = num11;
        this.kickReturnsTouchdowns = num12;
        this.rushingTouchdowns = num13;
        this.puntingReturnTouchdowns = num14;
        this.puntReturnsTouchdowns = num15;
        this.receivingTouchdowns = num16;
        this.kickingExtraMade = num17;
        this.accumulatedPenaltyGoals = (i & 131072) == 0 ? 0 : i2;
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerEventIncidents self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.goals);
        output.h(serialDesc, 1, a7aVar, self.assists);
        output.h(serialDesc, 2, a7aVar, self.yellowCards);
        output.h(serialDesc, 3, a7aVar, self.redCards);
        output.h(serialDesc, 4, a7aVar, self.yellowRedCards);
        output.h(serialDesc, 5, a7aVar, self.ownGoals);
        output.h(serialDesc, 6, a7aVar, self.penaltyGoals);
        output.h(serialDesc, 7, a7aVar, self.kickingFgMade);
        output.h(serialDesc, 8, a7aVar, self.passingTouchdowns);
        output.h(serialDesc, 9, a7aVar, self.defensiveInterceptionsTouchdowns);
        output.h(serialDesc, 10, a7aVar, self.fumbleTouchdownReturns);
        output.h(serialDesc, 11, a7aVar, self.kickReturnsTouchdowns);
        output.h(serialDesc, 12, a7aVar, self.rushingTouchdowns);
        output.h(serialDesc, 13, a7aVar, self.puntingReturnTouchdowns);
        output.h(serialDesc, 14, a7aVar, self.puntReturnsTouchdowns);
        output.h(serialDesc, 15, a7aVar, self.receivingTouchdowns);
        output.h(serialDesc, 16, a7aVar, self.kickingExtraMade);
        if (!output.o(serialDesc) && self.getAccumulatedPenaltyGoals() == 0) {
            return;
        }
        output.u(17, self.getAccumulatedPenaltyGoals(), serialDesc);
    }

    @Override // com.sofascore.model.player.MinifootballPlayerEventIncidents
    public int getAccumulatedPenaltyGoals() {
        return this.accumulatedPenaltyGoals;
    }

    @Override // com.sofascore.model.player.IceHockeyPlayerEventIncidents, com.sofascore.model.player.FootballPlayerEventIncidents
    public int getAssists() {
        Integer num = this.assists;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.AmericanFootballPlayerEventIncidents
    public int getDefensiveInterceptionsTouchdowns() {
        Integer num = this.defensiveInterceptionsTouchdowns;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.AmericanFootballPlayerEventIncidents
    public int getFumbleTouchdownReturns() {
        Integer num = this.fumbleTouchdownReturns;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.HandballPlayerEventIncidents, com.sofascore.model.player.IceHockeyPlayerEventIncidents, com.sofascore.model.player.FootballPlayerEventIncidents
    public int getGoals() {
        if (this.goals == null) {
            return 0;
        }
        Integer num = this.penaltyGoals;
        return (this.goals.intValue() - (num != null ? num.intValue() : 0)) - getAccumulatedPenaltyGoals();
    }

    @Override // com.sofascore.model.player.AmericanFootballPlayerEventIncidents
    public int getKickReturnsTouchdowns() {
        Integer num = this.kickReturnsTouchdowns;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.AmericanFootballPlayerEventIncidents
    public int getKickingExtraMade() {
        Integer num = this.kickingExtraMade;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.AmericanFootballPlayerEventIncidents
    public int getKickingFgMade() {
        Integer num = this.kickingFgMade;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.FootballPlayerEventIncidents
    public int getOwnGoals() {
        Integer num = this.ownGoals;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.AmericanFootballPlayerEventIncidents
    public int getPassingTouchdowns() {
        Integer num = this.passingTouchdowns;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.FootballPlayerEventIncidents
    public int getPenaltyGoals() {
        Integer num = this.penaltyGoals;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.AmericanFootballPlayerEventIncidents
    public int getPuntReturnsTouchdowns() {
        Integer num = this.puntReturnsTouchdowns;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.AmericanFootballPlayerEventIncidents
    public int getPuntingReturnTouchdowns() {
        Integer num = this.puntingReturnTouchdowns;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.AmericanFootballPlayerEventIncidents
    public int getReceivingTouchdowns() {
        Integer num = this.receivingTouchdowns;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.FootballPlayerEventIncidents
    public int getRedCards() {
        Integer num = this.redCards;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.AmericanFootballPlayerEventIncidents
    public int getRushingTouchdowns() {
        Integer num = this.rushingTouchdowns;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.FootballPlayerEventIncidents
    public int getYellowCards() {
        Integer num = this.yellowCards;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.sofascore.model.player.FootballPlayerEventIncidents
    public int getYellowRedCards() {
        Integer num = this.yellowRedCards;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/player/PlayerEventIncidents$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/player/PlayerEventIncidents;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerEventIncidents$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerEventIncidents(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17) {
        this.goals = num;
        this.assists = num2;
        this.yellowCards = num3;
        this.redCards = num4;
        this.yellowRedCards = num5;
        this.ownGoals = num6;
        this.penaltyGoals = num7;
        this.kickingFgMade = num8;
        this.passingTouchdowns = num9;
        this.defensiveInterceptionsTouchdowns = num10;
        this.fumbleTouchdownReturns = num11;
        this.kickReturnsTouchdowns = num12;
        this.rushingTouchdowns = num13;
        this.puntingReturnTouchdowns = num14;
        this.puntReturnsTouchdowns = num15;
        this.receivingTouchdowns = num16;
        this.kickingExtraMade = num17;
    }
}
