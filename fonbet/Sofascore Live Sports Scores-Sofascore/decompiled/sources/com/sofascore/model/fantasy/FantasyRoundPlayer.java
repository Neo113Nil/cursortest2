package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.C4227o2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Team;
import defpackage.a7a;
import defpackage.c88;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.jf7;
import defpackage.joa;
import defpackage.lkb;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wt3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0002hgB½\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dBÍ\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010#J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b3\u0010-J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u00100J\u0012\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b5\u0010-J\u0012\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b6\u0010-J\u0012\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b7\u0010-J\u0010\u00108\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b:\u00109J\u0010\u0010;\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b;\u00109Jà\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bA\u0010#J\u001a\u0010C\u001a\u00020\u00182\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bC\u0010DJ'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010N\u001a\u0004\bO\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010P\u001a\u0004\bQ\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010R\u001a\u0004\bS\u0010'R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010T\u001a\u0004\bU\u0010)R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\bW\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\bY\u0010-R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\bZ\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010[\u001a\u0004\b\\\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010]\u001a\u0004\b^\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010X\u001a\u0004\b_\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010[\u001a\u0004\b`\u00100R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\ba\u0010-R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010X\u001a\u0004\bb\u0010-R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010X\u001a\u0004\bc\u0010-R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010d\u001a\u0004\be\u00109R\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010d\u001a\u0004\bf\u00109R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010d\u001a\u0004\b\u001b\u00109¨\u0006i"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyRoundPlayer;", "", "", "id", "Lcom/sofascore/model/fantasy/FantasyPlayer;", "fantasyPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "team", "", "Lcom/sofascore/model/fantasy/FantasyPlayerFixture;", "fixtures", "", "", "priceHistory", "price", C4227o2.u, "score", "", "lockedFrom", "expectedPoints", "expectedPointsRank", "goalProbability", "assistProbability", "cleanSheetProbability", "", "substitute", "captain", "isLive", "<init>", "(ILcom/sofascore/model/fantasy/FantasyPlayer;Lcom/sofascore/model/mvvm/model/Team;Ljava/util/List;Ljava/util/Map;Ljava/lang/Float;ILjava/lang/Integer;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZZZ)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/fantasy/FantasyPlayer;Lcom/sofascore/model/mvvm/model/Team;Ljava/util/List;Ljava/util/Map;Ljava/lang/Float;ILjava/lang/Integer;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZZZLt5h;)V", "component1", "()I", "component2", "()Lcom/sofascore/model/fantasy/FantasyPlayer;", "component3", "()Lcom/sofascore/model/mvvm/model/Team;", "component4", "()Ljava/util/List;", "component5", "()Ljava/util/Map;", "component6", "()Ljava/lang/Float;", "component7", "component8", "()Ljava/lang/Integer;", "component9", "()Ljava/lang/Long;", "component10", "component11", "component12", "component13", "component14", "component15", "()Z", "component16", "component17", "copy", "(ILcom/sofascore/model/fantasy/FantasyPlayer;Lcom/sofascore/model/mvvm/model/Team;Ljava/util/List;Ljava/util/Map;Ljava/lang/Float;ILjava/lang/Integer;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZZZ)Lcom/sofascore/model/fantasy/FantasyRoundPlayer;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyRoundPlayer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/fantasy/FantasyPlayer;", "getFantasyPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Ljava/util/List;", "getFixtures", "Ljava/util/Map;", "getPriceHistory", "Ljava/lang/Float;", "getPrice", "getOrder", "Ljava/lang/Integer;", "getScore", "Ljava/lang/Long;", "getLockedFrom", "getExpectedPoints", "getExpectedPointsRank", "getGoalProbability", "getAssistProbability", "getCleanSheetProbability", "Z", "getSubstitute", "getCaptain", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyRoundPlayer {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float assistProbability;
    private final boolean captain;

    @Nullable
    private final Float cleanSheetProbability;

    @Nullable
    private final Float expectedPoints;

    @Nullable
    private final Integer expectedPointsRank;

    @NotNull
    private final FantasyPlayer fantasyPlayer;

    @Nullable
    private final List<FantasyPlayerFixture> fixtures;

    @Nullable
    private final Float goalProbability;
    private final int id;
    private final boolean isLive;

    @Nullable
    private final Long lockedFrom;
    private final int order;

    @Nullable
    private final Float price;

    @Nullable
    private final Map<Integer, Float> priceHistory;

    @Nullable
    private final Integer score;
    private final boolean substitute;

    @NotNull
    private final Team team;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new jf7(3)), ypa.a(ysaVar, new jf7(4)), ypa.a(ysaVar, new jf7(5)), null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ FantasyRoundPlayer(int i, int i2, FantasyPlayer fantasyPlayer, Team team, List list, Map map, Float f, int i3, Integer num, Long l, Float f2, Integer num2, Float f3, Float f4, Float f5, boolean z, boolean z2, boolean z3, t5h t5hVar) {
        if (16319 != (i & 16319)) {
            oea.z(i, 16319, FantasyRoundPlayer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.fantasyPlayer = fantasyPlayer;
        this.team = team;
        this.fixtures = list;
        this.priceHistory = map;
        this.price = f;
        if ((i & 64) == 0) {
            this.order = 0;
        } else {
            this.order = i3;
        }
        this.score = num;
        this.lockedFrom = l;
        this.expectedPoints = f2;
        this.expectedPointsRank = num2;
        this.goalProbability = f3;
        this.assistProbability = f4;
        this.cleanSheetProbability = f5;
        if ((i & 16384) == 0) {
            this.substitute = false;
        } else {
            this.substitute = z;
        }
        if ((32768 & i) == 0) {
            this.captain = false;
        } else {
            this.captain = z2;
        }
        if ((i & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0) {
            this.isLive = false;
        } else {
            this.isLive = z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(FantasyPlayerFixture$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new q79(a7a.a, c88.a, 1);
    }

    public static /* synthetic */ FantasyRoundPlayer copy$default(FantasyRoundPlayer fantasyRoundPlayer, int i, FantasyPlayer fantasyPlayer, Team team, List list, Map map, Float f, int i2, Integer num, Long l, Float f2, Integer num2, Float f3, Float f4, Float f5, boolean z, boolean z2, boolean z3, int i3, Object obj) {
        boolean z4;
        boolean z5;
        int i4;
        FantasyRoundPlayer fantasyRoundPlayer2;
        boolean z6;
        FantasyPlayer fantasyPlayer2;
        Team team2;
        List list2;
        Map map2;
        Float f6;
        int i5;
        Integer num3;
        Long l2;
        Float f7;
        Integer num4;
        Float f8;
        Float f9;
        Float f10;
        int i6 = (i3 & 1) != 0 ? fantasyRoundPlayer.id : i;
        FantasyPlayer fantasyPlayer3 = (i3 & 2) != 0 ? fantasyRoundPlayer.fantasyPlayer : fantasyPlayer;
        Team team3 = (i3 & 4) != 0 ? fantasyRoundPlayer.team : team;
        List list3 = (i3 & 8) != 0 ? fantasyRoundPlayer.fixtures : list;
        Map map3 = (i3 & 16) != 0 ? fantasyRoundPlayer.priceHistory : map;
        Float f11 = (i3 & 32) != 0 ? fantasyRoundPlayer.price : f;
        int i7 = (i3 & 64) != 0 ? fantasyRoundPlayer.order : i2;
        Integer num5 = (i3 & 128) != 0 ? fantasyRoundPlayer.score : num;
        Long l3 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? fantasyRoundPlayer.lockedFrom : l;
        Float f12 = (i3 & 512) != 0 ? fantasyRoundPlayer.expectedPoints : f2;
        Integer num6 = (i3 & 1024) != 0 ? fantasyRoundPlayer.expectedPointsRank : num2;
        Float f13 = (i3 & a.o) != 0 ? fantasyRoundPlayer.goalProbability : f3;
        Float f14 = (i3 & 4096) != 0 ? fantasyRoundPlayer.assistProbability : f4;
        Float f15 = (i3 & 8192) != 0 ? fantasyRoundPlayer.cleanSheetProbability : f5;
        int i8 = i6;
        boolean z7 = (i3 & 16384) != 0 ? fantasyRoundPlayer.substitute : z;
        boolean z8 = (i3 & 32768) != 0 ? fantasyRoundPlayer.captain : z2;
        if ((i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            z5 = z8;
            z4 = fantasyRoundPlayer.isLive;
            z6 = z7;
            fantasyPlayer2 = fantasyPlayer3;
            team2 = team3;
            list2 = list3;
            map2 = map3;
            f6 = f11;
            i5 = i7;
            num3 = num5;
            l2 = l3;
            f7 = f12;
            num4 = num6;
            f8 = f13;
            f9 = f14;
            f10 = f15;
            i4 = i8;
            fantasyRoundPlayer2 = fantasyRoundPlayer;
        } else {
            z4 = z3;
            z5 = z8;
            i4 = i8;
            fantasyRoundPlayer2 = fantasyRoundPlayer;
            z6 = z7;
            fantasyPlayer2 = fantasyPlayer3;
            team2 = team3;
            list2 = list3;
            map2 = map3;
            f6 = f11;
            i5 = i7;
            num3 = num5;
            l2 = l3;
            f7 = f12;
            num4 = num6;
            f8 = f13;
            f9 = f14;
            f10 = f15;
        }
        return fantasyRoundPlayer2.copy(i4, fantasyPlayer2, team2, list2, map2, f6, i5, num3, l2, f7, num4, f8, f9, f10, z6, z5, z4);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyRoundPlayer self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, FantasyPlayer$$serializer.INSTANCE, self.fantasyPlayer);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.team);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.fixtures);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.priceHistory);
        c88 c88Var = c88.a;
        output.h(serialDesc, 5, c88Var, self.price);
        if (output.o(serialDesc) || self.order != 0) {
            output.u(6, self.order, serialDesc);
        }
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 7, a7aVar, self.score);
        output.h(serialDesc, 8, lkb.a, self.lockedFrom);
        output.h(serialDesc, 9, c88Var, self.expectedPoints);
        output.h(serialDesc, 10, a7aVar, self.expectedPointsRank);
        output.h(serialDesc, 11, c88Var, self.goalProbability);
        output.h(serialDesc, 12, c88Var, self.assistProbability);
        output.h(serialDesc, 13, c88Var, self.cleanSheetProbability);
        if (output.o(serialDesc) || self.substitute) {
            output.x(serialDesc, 14, self.substitute);
        }
        if (output.o(serialDesc) || self.captain) {
            output.x(serialDesc, 15, self.captain);
        }
        if (output.o(serialDesc) || self.isLive) {
            output.x(serialDesc, 16, self.isLive);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Float getExpectedPoints() {
        return this.expectedPoints;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getExpectedPointsRank() {
        return this.expectedPointsRank;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Float getGoalProbability() {
        return this.goalProbability;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Float getAssistProbability() {
        return this.assistProbability;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Float getCleanSheetProbability() {
        return this.cleanSheetProbability;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getSubstitute() {
        return this.substitute;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getCaptain() {
        return this.captain;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FantasyPlayer getFantasyPlayer() {
        return this.fantasyPlayer;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final List<FantasyPlayerFixture> component4() {
        return this.fixtures;
    }

    @Nullable
    public final Map<Integer, Float> component5() {
        return this.priceHistory;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getPrice() {
        return this.price;
    }

    /* renamed from: component7, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Long getLockedFrom() {
        return this.lockedFrom;
    }

    @NotNull
    public final FantasyRoundPlayer copy(int id, @NotNull FantasyPlayer fantasyPlayer, @NotNull Team team, @Nullable List<FantasyPlayerFixture> fixtures, @Nullable Map<Integer, Float> priceHistory, @Nullable Float price, int order, @Nullable Integer score, @Nullable Long lockedFrom, @Nullable Float expectedPoints, @Nullable Integer expectedPointsRank, @Nullable Float goalProbability, @Nullable Float assistProbability, @Nullable Float cleanSheetProbability, boolean substitute, boolean captain, boolean isLive) {
        fantasyPlayer.getClass();
        team.getClass();
        return new FantasyRoundPlayer(id, fantasyPlayer, team, fixtures, priceHistory, price, order, score, lockedFrom, expectedPoints, expectedPointsRank, goalProbability, assistProbability, cleanSheetProbability, substitute, captain, isLive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyRoundPlayer)) {
            return false;
        }
        FantasyRoundPlayer fantasyRoundPlayer = (FantasyRoundPlayer) other;
        return this.id == fantasyRoundPlayer.id && Intrinsics.c(this.fantasyPlayer, fantasyRoundPlayer.fantasyPlayer) && Intrinsics.c(this.team, fantasyRoundPlayer.team) && Intrinsics.c(this.fixtures, fantasyRoundPlayer.fixtures) && Intrinsics.c(this.priceHistory, fantasyRoundPlayer.priceHistory) && Intrinsics.c(this.price, fantasyRoundPlayer.price) && this.order == fantasyRoundPlayer.order && Intrinsics.c(this.score, fantasyRoundPlayer.score) && Intrinsics.c(this.lockedFrom, fantasyRoundPlayer.lockedFrom) && Intrinsics.c(this.expectedPoints, fantasyRoundPlayer.expectedPoints) && Intrinsics.c(this.expectedPointsRank, fantasyRoundPlayer.expectedPointsRank) && Intrinsics.c(this.goalProbability, fantasyRoundPlayer.goalProbability) && Intrinsics.c(this.assistProbability, fantasyRoundPlayer.assistProbability) && Intrinsics.c(this.cleanSheetProbability, fantasyRoundPlayer.cleanSheetProbability) && this.substitute == fantasyRoundPlayer.substitute && this.captain == fantasyRoundPlayer.captain && this.isLive == fantasyRoundPlayer.isLive;
    }

    @Nullable
    public final Float getAssistProbability() {
        return this.assistProbability;
    }

    public final boolean getCaptain() {
        return this.captain;
    }

    @Nullable
    public final Float getCleanSheetProbability() {
        return this.cleanSheetProbability;
    }

    @Nullable
    public final Float getExpectedPoints() {
        return this.expectedPoints;
    }

    @Nullable
    public final Integer getExpectedPointsRank() {
        return this.expectedPointsRank;
    }

    @NotNull
    public final FantasyPlayer getFantasyPlayer() {
        return this.fantasyPlayer;
    }

    @Nullable
    public final List<FantasyPlayerFixture> getFixtures() {
        return this.fixtures;
    }

    @Nullable
    public final Float getGoalProbability() {
        return this.goalProbability;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Long getLockedFrom() {
        return this.lockedFrom;
    }

    public final int getOrder() {
        return this.order;
    }

    @Nullable
    public final Float getPrice() {
        return this.price;
    }

    @Nullable
    public final Map<Integer, Float> getPriceHistory() {
        return this.priceHistory;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    public final boolean getSubstitute() {
        return this.substitute;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        int b = fc6.b((this.fantasyPlayer.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.team);
        List<FantasyPlayerFixture> list = this.fixtures;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        Map<Integer, Float> map = this.priceHistory;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Float f = this.price;
        int a = wv8.a(this.order, (hashCode2 + (f == null ? 0 : f.hashCode())) * 31, 31);
        Integer num = this.score;
        int hashCode3 = (a + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.lockedFrom;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Float f2 = this.expectedPoints;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num2 = this.expectedPointsRank;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f3 = this.goalProbability;
        int hashCode7 = (hashCode6 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.assistProbability;
        int hashCode8 = (hashCode7 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.cleanSheetProbability;
        return Boolean.hashCode(this.isLive) + dmi.e(dmi.e((hashCode8 + (f5 != null ? f5.hashCode() : 0)) * 31, 31, this.substitute), 31, this.captain);
    }

    public final boolean isLive() {
        return this.isLive;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        FantasyPlayer fantasyPlayer = this.fantasyPlayer;
        Team team = this.team;
        List<FantasyPlayerFixture> list = this.fixtures;
        Map<Integer, Float> map = this.priceHistory;
        Float f = this.price;
        int i2 = this.order;
        Integer num = this.score;
        Long l = this.lockedFrom;
        Float f2 = this.expectedPoints;
        Integer num2 = this.expectedPointsRank;
        Float f3 = this.goalProbability;
        Float f4 = this.assistProbability;
        Float f5 = this.cleanSheetProbability;
        boolean z = this.substitute;
        boolean z2 = this.captain;
        boolean z3 = this.isLive;
        StringBuilder sb = new StringBuilder("FantasyRoundPlayer(id=");
        sb.append(i);
        sb.append(", fantasyPlayer=");
        sb.append(fantasyPlayer);
        sb.append(", team=");
        sb.append(team);
        sb.append(", fixtures=");
        sb.append(list);
        sb.append(", priceHistory=");
        sb.append(map);
        sb.append(", price=");
        sb.append(f);
        sb.append(", order=");
        sb.append(i2);
        sb.append(", score=");
        sb.append(num);
        sb.append(", lockedFrom=");
        sb.append(l);
        sb.append(", expectedPoints=");
        sb.append(f2);
        sb.append(", expectedPointsRank=");
        sb.append(num2);
        sb.append(", goalProbability=");
        sb.append(f3);
        sb.append(", assistProbability=");
        sb.append(f4);
        sb.append(", cleanSheetProbability=");
        sb.append(f5);
        sb.append(", substitute=");
        vxd.t(", captain=", ", isLive=", sb, z, z2);
        return wt3.p(sb, z3, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyRoundPlayer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyRoundPlayer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyRoundPlayer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyRoundPlayer(int i, @NotNull FantasyPlayer fantasyPlayer, @NotNull Team team, @Nullable List<FantasyPlayerFixture> list, @Nullable Map<Integer, Float> map, @Nullable Float f, int i2, @Nullable Integer num, @Nullable Long l, @Nullable Float f2, @Nullable Integer num2, @Nullable Float f3, @Nullable Float f4, @Nullable Float f5, boolean z, boolean z2, boolean z3) {
        fantasyPlayer.getClass();
        team.getClass();
        this.id = i;
        this.fantasyPlayer = fantasyPlayer;
        this.team = team;
        this.fixtures = list;
        this.priceHistory = map;
        this.price = f;
        this.order = i2;
        this.score = num;
        this.lockedFrom = l;
        this.expectedPoints = f2;
        this.expectedPointsRank = num2;
        this.goalProbability = f3;
        this.assistProbability = f4;
        this.cleanSheetProbability = f5;
        this.substitute = z;
        this.captain = z2;
        this.isLive = z3;
    }

    public /* synthetic */ FantasyRoundPlayer(int i, FantasyPlayer fantasyPlayer, Team team, List list, Map map, Float f, int i2, Integer num, Long l, Float f2, Integer num2, Float f3, Float f4, Float f5, boolean z, boolean z2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, fantasyPlayer, team, list, map, f, (i3 & 64) != 0 ? 0 : i2, num, l, f2, num2, f3, f4, f5, (i3 & 16384) != 0 ? false : z, (32768 & i3) != 0 ? false : z2, (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z3);
    }
}
