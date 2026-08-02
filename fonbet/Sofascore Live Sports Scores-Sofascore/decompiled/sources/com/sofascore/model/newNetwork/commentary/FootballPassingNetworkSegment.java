package com.sofascore.model.newNetwork.commentary;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Point2D$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.hz8;
import defpackage.joa;
import defpackage.lj8;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMBq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0090\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\b\u0007\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bG\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bH\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bI\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bJ\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\b\u0010\u0010\u001eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010)¨\u0006O"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/newNetwork/commentary/SegmentEventType;", "eventType", "", "isAssist", "", "time", "Lcom/sofascore/model/mvvm/model/Point2D;", "playerCoordinates", "gkCoordinates", "goalMouthCoordinates", "goalShotCoordinates", Incident.GoalIncident.TYPE_GOALKEEPER, "isHome", "Lcom/sofascore/model/newNetwork/commentary/AnimatedGoalType;", "goalType", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/newNetwork/commentary/SegmentEventType;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Boolean;Lcom/sofascore/model/newNetwork/commentary/AnimatedGoalType;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/newNetwork/commentary/SegmentEventType;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Boolean;Lcom/sofascore/model/newNetwork/commentary/AnimatedGoalType;Lt5h;)V", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Lcom/sofascore/model/newNetwork/commentary/SegmentEventType;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/Integer;", "component5", "()Lcom/sofascore/model/mvvm/model/Point2D;", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/sofascore/model/newNetwork/commentary/AnimatedGoalType;", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/newNetwork/commentary/SegmentEventType;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Point2D;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Boolean;Lcom/sofascore/model/newNetwork/commentary/AnimatedGoalType;)Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/newNetwork/commentary/SegmentEventType;", "getEventType", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getTime", "Lcom/sofascore/model/mvvm/model/Point2D;", "getPlayerCoordinates", "getGkCoordinates", "getGoalMouthCoordinates", "getGoalShotCoordinates", "getGoalkeeper", "Lcom/sofascore/model/newNetwork/commentary/AnimatedGoalType;", "getGoalType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FootballPassingNetworkSegment implements Serializable {

    @Nullable
    private final SegmentEventType eventType;

    @Nullable
    private final Point2D gkCoordinates;

    @Nullable
    private final Point2D goalMouthCoordinates;

    @Nullable
    private final Point2D goalShotCoordinates;

    @Nullable
    private final AnimatedGoalType goalType;

    @Nullable
    private final Player goalkeeper;

    @Nullable
    private final Boolean isAssist;

    @Nullable
    private final Boolean isHome;

    @NotNull
    private final Player player;

    @NotNull
    private final Point2D playerCoordinates;

    @Nullable
    private final Integer time;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, ypa.a(ysa.b, new lj8(8))};

    public /* synthetic */ FootballPassingNetworkSegment(int i, Player player, SegmentEventType segmentEventType, Boolean bool, Integer num, Point2D point2D, Point2D point2D2, Point2D point2D3, Point2D point2D4, Player player2, Boolean bool2, AnimatedGoalType animatedGoalType, t5h t5hVar) {
        if (2047 != (i & 2047)) {
            oea.z(i, 2047, FootballPassingNetworkSegment$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.eventType = segmentEventType;
        this.isAssist = bool;
        this.time = num;
        this.playerCoordinates = point2D;
        this.gkCoordinates = point2D2;
        this.goalMouthCoordinates = point2D3;
        this.goalShotCoordinates = point2D4;
        this.goalkeeper = player2;
        this.isHome = bool2;
        this.goalType = animatedGoalType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return hz8.F("com.sofascore.model.newNetwork.commentary.AnimatedGoalType", AnimatedGoalType.values(), new String[]{"regular", FootballShotmapItem.GOAL_TYPE_OWN, "penalty"}, new Annotation[][]{null, null, null});
    }

    public static /* synthetic */ FootballPassingNetworkSegment copy$default(FootballPassingNetworkSegment footballPassingNetworkSegment, Player player, SegmentEventType segmentEventType, Boolean bool, Integer num, Point2D point2D, Point2D point2D2, Point2D point2D3, Point2D point2D4, Player player2, Boolean bool2, AnimatedGoalType animatedGoalType, int i, Object obj) {
        if ((i & 1) != 0) {
            player = footballPassingNetworkSegment.player;
        }
        if ((i & 2) != 0) {
            segmentEventType = footballPassingNetworkSegment.eventType;
        }
        if ((i & 4) != 0) {
            bool = footballPassingNetworkSegment.isAssist;
        }
        if ((i & 8) != 0) {
            num = footballPassingNetworkSegment.time;
        }
        if ((i & 16) != 0) {
            point2D = footballPassingNetworkSegment.playerCoordinates;
        }
        if ((i & 32) != 0) {
            point2D2 = footballPassingNetworkSegment.gkCoordinates;
        }
        if ((i & 64) != 0) {
            point2D3 = footballPassingNetworkSegment.goalMouthCoordinates;
        }
        if ((i & 128) != 0) {
            point2D4 = footballPassingNetworkSegment.goalShotCoordinates;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            player2 = footballPassingNetworkSegment.goalkeeper;
        }
        if ((i & 512) != 0) {
            bool2 = footballPassingNetworkSegment.isHome;
        }
        if ((i & 1024) != 0) {
            animatedGoalType = footballPassingNetworkSegment.goalType;
        }
        Boolean bool3 = bool2;
        AnimatedGoalType animatedGoalType2 = animatedGoalType;
        Point2D point2D5 = point2D4;
        Player player3 = player2;
        Point2D point2D6 = point2D2;
        Point2D point2D7 = point2D3;
        Point2D point2D8 = point2D;
        Boolean bool4 = bool;
        return footballPassingNetworkSegment.copy(player, segmentEventType, bool4, num, point2D8, point2D6, point2D7, point2D5, player3, bool3, animatedGoalType2);
    }

    public static final /* synthetic */ void write$Self$model_release(FootballPassingNetworkSegment self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        output.f(serialDesc, 0, player$$serializer, self.player);
        output.h(serialDesc, 1, SegmentEventTypeSerializer.INSTANCE, self.eventType);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 2, gz1Var, self.isAssist);
        output.h(serialDesc, 3, a7a.a, self.time);
        Point2D$$serializer point2D$$serializer = Point2D$$serializer.INSTANCE;
        output.f(serialDesc, 4, point2D$$serializer, self.playerCoordinates);
        output.h(serialDesc, 5, point2D$$serializer, self.gkCoordinates);
        output.h(serialDesc, 6, point2D$$serializer, self.goalMouthCoordinates);
        output.h(serialDesc, 7, point2D$$serializer, self.goalShotCoordinates);
        output.h(serialDesc, 8, player$$serializer, self.goalkeeper);
        output.h(serialDesc, 9, gz1Var, self.isHome);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.goalType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Boolean getIsHome() {
        return this.isHome;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final AnimatedGoalType getGoalType() {
        return this.goalType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final SegmentEventType getEventType() {
        return this.eventType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsAssist() {
        return this.isAssist;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getTime() {
        return this.time;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Point2D getPlayerCoordinates() {
        return this.playerCoordinates;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Point2D getGkCoordinates() {
        return this.gkCoordinates;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Point2D getGoalMouthCoordinates() {
        return this.goalMouthCoordinates;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Point2D getGoalShotCoordinates() {
        return this.goalShotCoordinates;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Player getGoalkeeper() {
        return this.goalkeeper;
    }

    @NotNull
    public final FootballPassingNetworkSegment copy(@NotNull Player player, @Nullable SegmentEventType eventType, @Nullable Boolean isAssist, @Nullable Integer time, @NotNull Point2D playerCoordinates, @Nullable Point2D gkCoordinates, @Nullable Point2D goalMouthCoordinates, @Nullable Point2D goalShotCoordinates, @Nullable Player goalkeeper, @Nullable Boolean isHome, @Nullable AnimatedGoalType goalType) {
        player.getClass();
        playerCoordinates.getClass();
        return new FootballPassingNetworkSegment(player, eventType, isAssist, time, playerCoordinates, gkCoordinates, goalMouthCoordinates, goalShotCoordinates, goalkeeper, isHome, goalType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FootballPassingNetworkSegment)) {
            return false;
        }
        FootballPassingNetworkSegment footballPassingNetworkSegment = (FootballPassingNetworkSegment) other;
        return Intrinsics.c(this.player, footballPassingNetworkSegment.player) && this.eventType == footballPassingNetworkSegment.eventType && Intrinsics.c(this.isAssist, footballPassingNetworkSegment.isAssist) && Intrinsics.c(this.time, footballPassingNetworkSegment.time) && Intrinsics.c(this.playerCoordinates, footballPassingNetworkSegment.playerCoordinates) && Intrinsics.c(this.gkCoordinates, footballPassingNetworkSegment.gkCoordinates) && Intrinsics.c(this.goalMouthCoordinates, footballPassingNetworkSegment.goalMouthCoordinates) && Intrinsics.c(this.goalShotCoordinates, footballPassingNetworkSegment.goalShotCoordinates) && Intrinsics.c(this.goalkeeper, footballPassingNetworkSegment.goalkeeper) && Intrinsics.c(this.isHome, footballPassingNetworkSegment.isHome) && this.goalType == footballPassingNetworkSegment.goalType;
    }

    @Nullable
    public final SegmentEventType getEventType() {
        return this.eventType;
    }

    @Nullable
    public final Point2D getGkCoordinates() {
        return this.gkCoordinates;
    }

    @Nullable
    public final Point2D getGoalMouthCoordinates() {
        return this.goalMouthCoordinates;
    }

    @Nullable
    public final Point2D getGoalShotCoordinates() {
        return this.goalShotCoordinates;
    }

    @Nullable
    public final AnimatedGoalType getGoalType() {
        return this.goalType;
    }

    @Nullable
    public final Player getGoalkeeper() {
        return this.goalkeeper;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    public final Point2D getPlayerCoordinates() {
        return this.playerCoordinates;
    }

    @Nullable
    public final Integer getTime() {
        return this.time;
    }

    public int hashCode() {
        int hashCode = this.player.hashCode() * 31;
        SegmentEventType segmentEventType = this.eventType;
        int hashCode2 = (hashCode + (segmentEventType == null ? 0 : segmentEventType.hashCode())) * 31;
        Boolean bool = this.isAssist;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.time;
        int hashCode4 = (this.playerCoordinates.hashCode() + ((hashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        Point2D point2D = this.gkCoordinates;
        int hashCode5 = (hashCode4 + (point2D == null ? 0 : point2D.hashCode())) * 31;
        Point2D point2D2 = this.goalMouthCoordinates;
        int hashCode6 = (hashCode5 + (point2D2 == null ? 0 : point2D2.hashCode())) * 31;
        Point2D point2D3 = this.goalShotCoordinates;
        int hashCode7 = (hashCode6 + (point2D3 == null ? 0 : point2D3.hashCode())) * 31;
        Player player = this.goalkeeper;
        int hashCode8 = (hashCode7 + (player == null ? 0 : player.hashCode())) * 31;
        Boolean bool2 = this.isHome;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AnimatedGoalType animatedGoalType = this.goalType;
        return hashCode9 + (animatedGoalType != null ? animatedGoalType.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAssist() {
        return this.isAssist;
    }

    @Nullable
    public final Boolean isHome() {
        return this.isHome;
    }

    @NotNull
    public String toString() {
        return "FootballPassingNetworkSegment(player=" + this.player + ", eventType=" + this.eventType + ", isAssist=" + this.isAssist + ", time=" + this.time + ", playerCoordinates=" + this.playerCoordinates + ", gkCoordinates=" + this.gkCoordinates + ", goalMouthCoordinates=" + this.goalMouthCoordinates + ", goalShotCoordinates=" + this.goalShotCoordinates + ", goalkeeper=" + this.goalkeeper + ", isHome=" + this.isHome + ", goalType=" + this.goalType + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FootballPassingNetworkSegment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FootballPassingNetworkSegment(@NotNull Player player, @Nullable SegmentEventType segmentEventType, @Nullable Boolean bool, @Nullable Integer num, @NotNull Point2D point2D, @Nullable Point2D point2D2, @Nullable Point2D point2D3, @Nullable Point2D point2D4, @Nullable Player player2, @Nullable Boolean bool2, @Nullable AnimatedGoalType animatedGoalType) {
        player.getClass();
        point2D.getClass();
        this.player = player;
        this.eventType = segmentEventType;
        this.isAssist = bool;
        this.time = num;
        this.playerCoordinates = point2D;
        this.gkCoordinates = point2D2;
        this.goalMouthCoordinates = point2D3;
        this.goalShotCoordinates = point2D4;
        this.goalkeeper = player2;
        this.isHome = bool2;
        this.goalType = animatedGoalType;
    }
}
