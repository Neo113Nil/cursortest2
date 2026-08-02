package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.h75;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0002bcB\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B«\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b/\u00100J¶\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u0010 J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010\u001eJ\u001a\u00107\u001a\u00020\u00132\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0015HÂ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010F\u001a\u0004\bH\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bI\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bJ\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bK\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bM\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bN\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bO\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bP\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Q\u001a\u0004\bR\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Q\u001a\u0004\bS\u0010+R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010T\u001a\u0004\bU\u0010.R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\b\u0014\u00100R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010WR\u0011\u0010[\u001a\u00020X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0013\u0010]\u001a\u0004\u0018\u00010X8F¢\u0006\u0006\u001a\u0004\b\\\u0010ZR\u0013\u0010_\u001a\u0004\u0018\u00010X8F¢\u0006\u0006\u001a\u0004\b^\u0010ZR\u0011\u0010`\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b`\u00100R\u0011\u0010a\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\ba\u00100¨\u0006d"}, d2 = {"Lcom/sofascore/model/newNetwork/FootballShotmapItem;", "Ljava/io/Serializable;", "", "id", "", "shotType", "goalType", "situation", "bodyPart", "goalMouthLocation", "shootoutOrder", "time", "timeSeconds", "addedTime", "", "xg", "xgot", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", "isHome", "Lcom/sofascore/model/newNetwork/Coordinates;", "draw", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/Player;ZLcom/sofascore/model/newNetwork/Coordinates;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/Player;ZLcom/sofascore/model/newNetwork/Coordinates;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "component11", "()Ljava/lang/Double;", "component12", "component13", "()Lcom/sofascore/model/mvvm/model/Player;", "component14", "()Z", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/Player;ZLcom/sofascore/model/newNetwork/Coordinates;)Lcom/sofascore/model/newNetwork/FootballShotmapItem;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "component15", "()Lcom/sofascore/model/newNetwork/Coordinates;", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/FootballShotmapItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getShotType", "getGoalType", "getSituation", "getBodyPart", "getGoalMouthLocation", "Ljava/lang/Integer;", "getShootoutOrder", "getTime", "getTimeSeconds", "getAddedTime", "Ljava/lang/Double;", "getXg", "getXgot", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Z", "Lcom/sofascore/model/newNetwork/Coordinates;", "Lcom/sofascore/model/mvvm/model/Point2D;", "getShotOriginPoint", "()Lcom/sofascore/model/mvvm/model/Point2D;", "shotOriginPoint", "getShotEndPoint", "shotEndPoint", "getGoalPoint", "goalPoint", "isBlocked", "isOwnGoal", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FootballShotmapItem implements Serializable {

    @NotNull
    public static final String BODY_PART_HEAD = "head";

    @NotNull
    public static final String BODY_PART_LEFT_FOOT = "left-foot";

    @NotNull
    public static final String BODY_PART_OTHER = "other";

    @NotNull
    public static final String BODY_PART_RIGHT_FOOT = "right-foot";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String GOAL_CLOSE_HIGH = "close-high";

    @NotNull
    public static final String GOAL_CLOSE_HIGH_LEFT = "close-high-left";

    @NotNull
    public static final String GOAL_CLOSE_HIGH_RIGHT = "close-high-right";

    @NotNull
    public static final String GOAL_CLOSE_LEFT = "close-left";

    @NotNull
    public static final String GOAL_CLOSE_RIGHT = "close-right";

    @NotNull
    public static final String GOAL_HIGH = "high";

    @NotNull
    public static final String GOAL_HIGH_CENTRE = "high-centre";

    @NotNull
    public static final String GOAL_HIGH_LEFT = "high-left";

    @NotNull
    public static final String GOAL_HIGH_RIGHT = "high-right";

    @NotNull
    public static final String GOAL_LEFT = "left";

    @NotNull
    public static final String GOAL_LOW_CENTRE = "low-centre";

    @NotNull
    public static final String GOAL_LOW_LEFT = "low-left";

    @NotNull
    public static final String GOAL_LOW_RIGHT = "low-right";

    @NotNull
    public static final String GOAL_RIGHT = "right";

    @NotNull
    public static final String GOAL_TYPE_OWN = "own";

    @NotNull
    public static final String GOAL_TYPE_PENALTY = "penalty";

    @NotNull
    public static final String GOAL_TYPE_REGULAR = "regular";
    public static final int PROVIDER_FIELD_HEIGHT = 100;
    public static final int PROVIDER_FIELD_WIDTH = 100;

    @NotNull
    public static final String SHOT_TYPE_BLOCK = "block";

    @NotNull
    public static final String SHOT_TYPE_BLOCKED_OFF_LINE = "blocked-off-line";

    @NotNull
    public static final String SHOT_TYPE_GOAL = "goal";

    @NotNull
    public static final String SHOT_TYPE_MISS = "miss";

    @NotNull
    public static final String SHOT_TYPE_POST = "post";

    @NotNull
    public static final String SHOT_TYPE_SAVE = "save";

    @NotNull
    public static final String SITUATION_TYPE_ASSISTED = "assisted";

    @NotNull
    public static final String SITUATION_TYPE_CORNER = "corner";

    @NotNull
    public static final String SITUATION_TYPE_FAST_BREAK = "fast-break";

    @NotNull
    public static final String SITUATION_TYPE_FREE_KICK = "free-kick";

    @NotNull
    public static final String SITUATION_TYPE_OWN_GOAL = "own-goal";

    @NotNull
    public static final String SITUATION_TYPE_PENALTY = "penalty";

    @NotNull
    public static final String SITUATION_TYPE_REGULAR = "regular";

    @NotNull
    public static final String SITUATION_TYPE_SCRAMBLE = "scramble";

    @NotNull
    public static final String SITUATION_TYPE_SET_PIECE = "set-piece";

    @NotNull
    public static final String SITUATION_TYPE_SHOOTOUT = "shootout";

    @NotNull
    public static final String SITUATION_TYPE_THROW_IN = "throw-in-set-piece";

    @Nullable
    private final Integer addedTime;

    @Nullable
    private final String bodyPart;

    @NotNull
    private final Coordinates draw;

    @Nullable
    private final String goalMouthLocation;

    @Nullable
    private final String goalType;
    private final int id;
    private final boolean isHome;

    @NotNull
    private final Player player;

    @Nullable
    private final Integer shootoutOrder;

    @NotNull
    private final String shotType;

    @NotNull
    private final String situation;
    private final int time;

    @Nullable
    private final Integer timeSeconds;

    @Nullable
    private final Double xg;

    @Nullable
    private final Double xgot;

    public /* synthetic */ FootballShotmapItem(int i, int i2, String str, String str2, String str3, String str4, String str5, Integer num, int i3, Integer num2, Integer num3, Double d, Double d2, Player player, boolean z, Coordinates coordinates, t5h t5hVar) {
        if (32767 != (i & 32767)) {
            oea.z(i, 32767, FootballShotmapItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.shotType = str;
        this.goalType = str2;
        this.situation = str3;
        this.bodyPart = str4;
        this.goalMouthLocation = str5;
        this.shootoutOrder = num;
        this.time = i3;
        this.timeSeconds = num2;
        this.addedTime = num3;
        this.xg = d;
        this.xgot = d2;
        this.player = player;
        this.isHome = z;
        this.draw = coordinates;
    }

    /* renamed from: component15, reason: from getter */
    private final Coordinates getDraw() {
        return this.draw;
    }

    public static final /* synthetic */ void write$Self$model_release(FootballShotmapItem self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.shotType);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.goalType);
        output.y(serialDesc, 3, self.situation);
        output.h(serialDesc, 4, uhiVar, self.bodyPart);
        output.h(serialDesc, 5, uhiVar, self.goalMouthLocation);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 6, a7aVar, self.shootoutOrder);
        output.u(7, self.time, serialDesc);
        output.h(serialDesc, 8, a7aVar, self.timeSeconds);
        output.h(serialDesc, 9, a7aVar, self.addedTime);
        h75 h75Var = h75.a;
        output.h(serialDesc, 10, h75Var, self.xg);
        output.h(serialDesc, 11, h75Var, self.xgot);
        output.f(serialDesc, 12, Player$$serializer.INSTANCE, self.player);
        output.x(serialDesc, 13, self.isHome);
        output.f(serialDesc, 14, Coordinates$$serializer.INSTANCE, self.draw);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getAddedTime() {
        return this.addedTime;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Double getXg() {
        return this.xg;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getXgot() {
        return this.xgot;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsHome() {
        return this.isHome;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getShotType() {
        return this.shotType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getGoalType() {
        return this.goalType;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSituation() {
        return this.situation;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getBodyPart() {
        return this.bodyPart;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getGoalMouthLocation() {
        return this.goalMouthLocation;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getShootoutOrder() {
        return this.shootoutOrder;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getTimeSeconds() {
        return this.timeSeconds;
    }

    @NotNull
    public final FootballShotmapItem copy(int id, @NotNull String shotType, @Nullable String goalType, @NotNull String situation, @Nullable String bodyPart, @Nullable String goalMouthLocation, @Nullable Integer shootoutOrder, int time, @Nullable Integer timeSeconds, @Nullable Integer addedTime, @Nullable Double xg, @Nullable Double xgot, @NotNull Player player, boolean isHome, @NotNull Coordinates draw) {
        shotType.getClass();
        situation.getClass();
        player.getClass();
        draw.getClass();
        return new FootballShotmapItem(id, shotType, goalType, situation, bodyPart, goalMouthLocation, shootoutOrder, time, timeSeconds, addedTime, xg, xgot, player, isHome, draw);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FootballShotmapItem)) {
            return false;
        }
        FootballShotmapItem footballShotmapItem = (FootballShotmapItem) other;
        return this.id == footballShotmapItem.id && Intrinsics.c(this.shotType, footballShotmapItem.shotType) && Intrinsics.c(this.goalType, footballShotmapItem.goalType) && Intrinsics.c(this.situation, footballShotmapItem.situation) && Intrinsics.c(this.bodyPart, footballShotmapItem.bodyPart) && Intrinsics.c(this.goalMouthLocation, footballShotmapItem.goalMouthLocation) && Intrinsics.c(this.shootoutOrder, footballShotmapItem.shootoutOrder) && this.time == footballShotmapItem.time && Intrinsics.c(this.timeSeconds, footballShotmapItem.timeSeconds) && Intrinsics.c(this.addedTime, footballShotmapItem.addedTime) && Intrinsics.c(this.xg, footballShotmapItem.xg) && Intrinsics.c(this.xgot, footballShotmapItem.xgot) && Intrinsics.c(this.player, footballShotmapItem.player) && this.isHome == footballShotmapItem.isHome && Intrinsics.c(this.draw, footballShotmapItem.draw);
    }

    @Nullable
    public final Integer getAddedTime() {
        return this.addedTime;
    }

    @Nullable
    public final String getBodyPart() {
        return this.bodyPart;
    }

    @Nullable
    public final String getGoalMouthLocation() {
        return this.goalMouthLocation;
    }

    @Nullable
    public final Point2D getGoalPoint() {
        return this.draw.getGoal();
    }

    @Nullable
    public final String getGoalType() {
        return this.goalType;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final Integer getShootoutOrder() {
        return this.shootoutOrder;
    }

    @Nullable
    public final Point2D getShotEndPoint() {
        boolean isBlocked = isBlocked();
        Coordinates coordinates = this.draw;
        return isBlocked ? coordinates.getBlock() : coordinates.getEnd();
    }

    @NotNull
    public final Point2D getShotOriginPoint() {
        return this.draw.getStart();
    }

    @NotNull
    public final String getShotType() {
        return this.shotType;
    }

    @NotNull
    public final String getSituation() {
        return this.situation;
    }

    public final int getTime() {
        return this.time;
    }

    @Nullable
    public final Integer getTimeSeconds() {
        return this.timeSeconds;
    }

    @Nullable
    public final Double getXg() {
        return this.xg;
    }

    @Nullable
    public final Double getXgot() {
        return this.xgot;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.shotType);
        String str = this.goalType;
        int c2 = dmi.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.situation);
        String str2 = this.bodyPart;
        int hashCode = (c2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.goalMouthLocation;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.shootoutOrder;
        int a = wv8.a(this.time, (hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.timeSeconds;
        int hashCode3 = (a + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.addedTime;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d = this.xg;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.xgot;
        return this.draw.hashCode() + dmi.e((this.player.hashCode() + ((hashCode5 + (d2 != null ? d2.hashCode() : 0)) * 31)) * 31, 31, this.isHome);
    }

    public final boolean isBlocked() {
        return Intrinsics.c(this.shotType, "block") || Intrinsics.c(this.shotType, SHOT_TYPE_BLOCKED_OFF_LINE);
    }

    public final boolean isHome() {
        return this.isHome;
    }

    public final boolean isOwnGoal() {
        return Intrinsics.c(this.shotType, "goal") && Intrinsics.c(this.goalType, GOAL_TYPE_OWN);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.shotType;
        String str2 = this.goalType;
        String str3 = this.situation;
        String str4 = this.bodyPart;
        String str5 = this.goalMouthLocation;
        Integer num = this.shootoutOrder;
        int i2 = this.time;
        Integer num2 = this.timeSeconds;
        Integer num3 = this.addedTime;
        Double d = this.xg;
        Double d2 = this.xgot;
        Player player = this.player;
        boolean z = this.isHome;
        Coordinates coordinates = this.draw;
        StringBuilder t = dmi.t(i, "FootballShotmapItem(id=", ", shotType=", str, ", goalType=");
        bf3.v(t, str2, ", situation=", str3, ", bodyPart=");
        bf3.v(t, str4, ", goalMouthLocation=", str5, ", shootoutOrder=");
        t.append(num);
        t.append(", time=");
        t.append(i2);
        t.append(", timeSeconds=");
        vxd.r(num2, num3, ", addedTime=", ", xg=", t);
        fc6.A(t, d, ", xgot=", d2, ", player=");
        t.append(player);
        t.append(", isHome=");
        t.append(z);
        t.append(", draw=");
        t.append(coordinates);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0086T¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/sofascore/model/newNetwork/FootballShotmapItem$Companion;", "", "<init>", "()V", "SHOT_TYPE_GOAL", "", "SHOT_TYPE_MISS", "SHOT_TYPE_POST", "SHOT_TYPE_SAVE", "SHOT_TYPE_BLOCK", "SHOT_TYPE_BLOCKED_OFF_LINE", "GOAL_TYPE_REGULAR", "GOAL_TYPE_PENALTY", "GOAL_TYPE_OWN", "SITUATION_TYPE_REGULAR", "SITUATION_TYPE_CORNER", "SITUATION_TYPE_FREE_KICK", "SITUATION_TYPE_FAST_BREAK", "SITUATION_TYPE_SET_PIECE", "SITUATION_TYPE_ASSISTED", "SITUATION_TYPE_SCRAMBLE", "SITUATION_TYPE_PENALTY", "SITUATION_TYPE_SHOOTOUT", "SITUATION_TYPE_OWN_GOAL", "SITUATION_TYPE_THROW_IN", "BODY_PART_HEAD", "BODY_PART_RIGHT_FOOT", "BODY_PART_LEFT_FOOT", "BODY_PART_OTHER", "GOAL_LEFT", "GOAL_RIGHT", "GOAL_HIGH", "GOAL_CLOSE_LEFT", "GOAL_CLOSE_RIGHT", "GOAL_CLOSE_HIGH_LEFT", "GOAL_CLOSE_HIGH_RIGHT", "GOAL_CLOSE_HIGH", "GOAL_LOW_LEFT", "GOAL_HIGH_LEFT", "GOAL_LOW_RIGHT", "GOAL_HIGH_RIGHT", "GOAL_LOW_CENTRE", "GOAL_HIGH_CENTRE", "PROVIDER_FIELD_WIDTH", "", "PROVIDER_FIELD_HEIGHT", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/FootballShotmapItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FootballShotmapItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FootballShotmapItem(int i, @NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, int i2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Double d, @Nullable Double d2, @NotNull Player player, boolean z, @NotNull Coordinates coordinates) {
        str.getClass();
        str3.getClass();
        player.getClass();
        coordinates.getClass();
        this.id = i;
        this.shotType = str;
        this.goalType = str2;
        this.situation = str3;
        this.bodyPart = str4;
        this.goalMouthLocation = str5;
        this.shootoutOrder = num;
        this.time = i2;
        this.timeSeconds = num2;
        this.addedTime = num3;
        this.xg = d;
        this.xgot = d2;
        this.player = player;
        this.isHome = z;
        this.draw = coordinates;
    }
}
