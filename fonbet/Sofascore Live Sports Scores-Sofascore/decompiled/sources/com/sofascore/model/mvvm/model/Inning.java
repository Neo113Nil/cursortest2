package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.h75;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.us9;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 k2\u00020\u0001:\u0002lkB×\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010\u001fBñ\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0012\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010'J\u0012\u00102\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010'J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010'J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010'J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010'J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010'J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010'J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010'J\u0012\u0010;\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b=\u0010<J\u0088\u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bC\u0010%J\u001a\u0010G\u001a\u00020F2\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bG\u0010HJ'\u0010Q\u001a\u00020N2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0001¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010%R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010T\u001a\u0004\bU\u0010'R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010R\u001a\u0004\bV\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010W\u001a\u0004\bX\u0010*R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010W\u001a\u0004\bY\u0010*R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\bZ\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010[\u001a\u0004\b\\\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010[\u001a\u0004\b]\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010T\u001a\u0004\b^\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010T\u001a\u0004\b_\u0010'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010`\u001a\u0004\ba\u00103R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010T\u001a\u0004\bb\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010T\u001a\u0004\bc\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010T\u001a\u0004\bd\u0010'R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010T\u001a\u0004\be\u0010'R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010T\u001a\u0004\bf\u0010'R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010T\u001a\u0004\bg\u0010'R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010T\u001a\u0004\b\u001a\u0010'R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010h\u001a\u0004\bi\u0010<R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010h\u001a\u0004\bj\u0010<¨\u0006m"}, d2 = {"Lcom/sofascore/model/mvvm/model/Inning;", "Ljava/io/Serializable;", "", "id", "superOver", "number", "", "Lcom/sofascore/model/mvvm/model/Bowler;", "bowlingLine", "Lcom/sofascore/model/mvvm/model/Batsman;", "battingLine", "Lcom/sofascore/model/mvvm/model/Partnership;", "partnerships", "Lcom/sofascore/model/mvvm/model/Team;", "battingTeam", "bowlingTeam", "score", "wickets", "", "overs", "extra", "wide", "noBall", "bye", "legBye", "penalty", "isInningDeclare", "Lcom/sofascore/model/mvvm/model/Player;", "currentBatsman", "currentBowler", "<init>", "(ILjava/lang/Integer;ILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;ILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()Lcom/sofascore/model/mvvm/model/Team;", "component8", "component9", "component10", "component11", "()Ljava/lang/Double;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Lcom/sofascore/model/mvvm/model/Player;", "component20", "copy", "(ILjava/lang/Integer;ILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;)Lcom/sofascore/model/mvvm/model/Inning;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Inning;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/Integer;", "getSuperOver", "getNumber", "Ljava/util/List;", "getBowlingLine", "getBattingLine", "getPartnerships", "Lcom/sofascore/model/mvvm/model/Team;", "getBattingTeam", "getBowlingTeam", "getScore", "getWickets", "Ljava/lang/Double;", "getOvers", "getExtra", "getWide", "getNoBall", "getBye", "getLegBye", "getPenalty", "Lcom/sofascore/model/mvvm/model/Player;", "getCurrentBatsman", "getCurrentBowler", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Inning implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Batsman> battingLine;

    @Nullable
    private final Team battingTeam;

    @NotNull
    private final List<Bowler> bowlingLine;

    @Nullable
    private final Team bowlingTeam;

    @Nullable
    private final Integer bye;

    @Nullable
    private final Player currentBatsman;

    @Nullable
    private final Player currentBowler;

    @Nullable
    private final Integer extra;
    private final int id;

    @Nullable
    private final Integer isInningDeclare;

    @Nullable
    private final Integer legBye;

    @Nullable
    private final Integer noBall;
    private final int number;

    @Nullable
    private final Double overs;

    @NotNull
    private final List<Partnership> partnerships;

    @Nullable
    private final Integer penalty;

    @Nullable
    private final Integer score;

    @Nullable
    private final Integer superOver;

    @Nullable
    private final Integer wickets;

    @Nullable
    private final Integer wide;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, ypa.a(ysaVar, new us9(15)), ypa.a(ysaVar, new us9(16)), ypa.a(ysaVar, new us9(17)), ypa.a(ysaVar, new us9(18)), ypa.a(ysaVar, new us9(19)), null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ Inning(int i, int i2, Integer num, int i3, List list, List list2, List list3, Team team, Team team2, Integer num2, Integer num3, Double d, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Player player, Player player2, t5h t5hVar) {
        if (1048575 != (i & 1048575)) {
            oea.z(i, 1048575, Inning$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.superOver = num;
        this.number = i3;
        this.bowlingLine = list;
        this.battingLine = list2;
        this.partnerships = list3;
        this.battingTeam = team;
        this.bowlingTeam = team2;
        this.score = num2;
        this.wickets = num3;
        this.overs = d;
        this.extra = num4;
        this.wide = num5;
        this.noBall = num6;
        this.bye = num7;
        this.legBye = num8;
        this.penalty = num9;
        this.isInningDeclare = num10;
        this.currentBatsman = player;
        this.currentBowler = player2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(Bowler$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Batsman$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(Partnership$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ Inning copy$default(Inning inning, int i, Integer num, int i2, List list, List list2, List list3, Team team, Team team2, Integer num2, Integer num3, Double d, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Player player, Player player2, int i3, Object obj) {
        Player player3;
        Player player4;
        int i4 = (i3 & 1) != 0 ? inning.id : i;
        Integer num11 = (i3 & 2) != 0 ? inning.superOver : num;
        int i5 = (i3 & 4) != 0 ? inning.number : i2;
        List list4 = (i3 & 8) != 0 ? inning.bowlingLine : list;
        List list5 = (i3 & 16) != 0 ? inning.battingLine : list2;
        List list6 = (i3 & 32) != 0 ? inning.partnerships : list3;
        Team team3 = (i3 & 64) != 0 ? inning.battingTeam : team;
        Team team4 = (i3 & 128) != 0 ? inning.bowlingTeam : team2;
        Integer num12 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? inning.score : num2;
        Integer num13 = (i3 & 512) != 0 ? inning.wickets : num3;
        Double d2 = (i3 & 1024) != 0 ? inning.overs : d;
        Integer num14 = (i3 & a.o) != 0 ? inning.extra : num4;
        Integer num15 = (i3 & 4096) != 0 ? inning.wide : num5;
        Integer num16 = (i3 & 8192) != 0 ? inning.noBall : num6;
        int i6 = i4;
        Integer num17 = (i3 & 16384) != 0 ? inning.bye : num7;
        Integer num18 = (i3 & 32768) != 0 ? inning.legBye : num8;
        Integer num19 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? inning.penalty : num9;
        Integer num20 = (i3 & 131072) != 0 ? inning.isInningDeclare : num10;
        Player player5 = (i3 & 262144) != 0 ? inning.currentBatsman : player;
        if ((i3 & 524288) != 0) {
            player4 = player5;
            player3 = inning.currentBowler;
        } else {
            player3 = player2;
            player4 = player5;
        }
        return inning.copy(i6, num11, i5, list4, list5, list6, team3, team4, num12, num13, d2, num14, num15, num16, num17, num18, num19, num20, player4, player3);
    }

    public static final /* synthetic */ void write$Self$model_release(Inning self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.superOver);
        output.u(2, self.number, serialDesc);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.bowlingLine);
        output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.battingLine);
        output.f(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.partnerships);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.battingTeam);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.bowlingTeam);
        output.h(serialDesc, 8, a7aVar, self.score);
        output.h(serialDesc, 9, a7aVar, self.wickets);
        output.h(serialDesc, 10, h75.a, self.overs);
        output.h(serialDesc, 11, a7aVar, self.extra);
        output.h(serialDesc, 12, a7aVar, self.wide);
        output.h(serialDesc, 13, a7aVar, self.noBall);
        output.h(serialDesc, 14, a7aVar, self.bye);
        output.h(serialDesc, 15, a7aVar, self.legBye);
        output.h(serialDesc, 16, a7aVar, self.penalty);
        output.h(serialDesc, 17, a7aVar, self.isInningDeclare);
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        output.h(serialDesc, 18, player$$serializer, self.currentBatsman);
        output.h(serialDesc, 19, player$$serializer, self.currentBowler);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getWickets() {
        return this.wickets;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Double getOvers() {
        return this.overs;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getExtra() {
        return this.extra;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getWide() {
        return this.wide;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getNoBall() {
        return this.noBall;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getBye() {
        return this.bye;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getLegBye() {
        return this.legBye;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getPenalty() {
        return this.penalty;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getIsInningDeclare() {
        return this.isInningDeclare;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Player getCurrentBatsman() {
        return this.currentBatsman;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getSuperOver() {
        return this.superOver;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Player getCurrentBowler() {
        return this.currentBowler;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    @NotNull
    public final List<Bowler> component4() {
        return this.bowlingLine;
    }

    @NotNull
    public final List<Batsman> component5() {
        return this.battingLine;
    }

    @NotNull
    public final List<Partnership> component6() {
        return this.partnerships;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Team getBattingTeam() {
        return this.battingTeam;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Team getBowlingTeam() {
        return this.bowlingTeam;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    @NotNull
    public final Inning copy(int id, @Nullable Integer superOver, int number, @NotNull List<Bowler> bowlingLine, @NotNull List<Batsman> battingLine, @NotNull List<Partnership> partnerships, @Nullable Team battingTeam, @Nullable Team bowlingTeam, @Nullable Integer score, @Nullable Integer wickets, @Nullable Double overs, @Nullable Integer extra, @Nullable Integer wide, @Nullable Integer noBall, @Nullable Integer bye, @Nullable Integer legBye, @Nullable Integer penalty, @Nullable Integer isInningDeclare, @Nullable Player currentBatsman, @Nullable Player currentBowler) {
        bowlingLine.getClass();
        battingLine.getClass();
        partnerships.getClass();
        return new Inning(id, superOver, number, bowlingLine, battingLine, partnerships, battingTeam, bowlingTeam, score, wickets, overs, extra, wide, noBall, bye, legBye, penalty, isInningDeclare, currentBatsman, currentBowler);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Inning)) {
            return false;
        }
        Inning inning = (Inning) other;
        return this.id == inning.id && Intrinsics.c(this.superOver, inning.superOver) && this.number == inning.number && Intrinsics.c(this.bowlingLine, inning.bowlingLine) && Intrinsics.c(this.battingLine, inning.battingLine) && Intrinsics.c(this.partnerships, inning.partnerships) && Intrinsics.c(this.battingTeam, inning.battingTeam) && Intrinsics.c(this.bowlingTeam, inning.bowlingTeam) && Intrinsics.c(this.score, inning.score) && Intrinsics.c(this.wickets, inning.wickets) && Intrinsics.c(this.overs, inning.overs) && Intrinsics.c(this.extra, inning.extra) && Intrinsics.c(this.wide, inning.wide) && Intrinsics.c(this.noBall, inning.noBall) && Intrinsics.c(this.bye, inning.bye) && Intrinsics.c(this.legBye, inning.legBye) && Intrinsics.c(this.penalty, inning.penalty) && Intrinsics.c(this.isInningDeclare, inning.isInningDeclare) && Intrinsics.c(this.currentBatsman, inning.currentBatsman) && Intrinsics.c(this.currentBowler, inning.currentBowler);
    }

    @NotNull
    public final List<Batsman> getBattingLine() {
        return this.battingLine;
    }

    @Nullable
    public final Team getBattingTeam() {
        return this.battingTeam;
    }

    @NotNull
    public final List<Bowler> getBowlingLine() {
        return this.bowlingLine;
    }

    @Nullable
    public final Team getBowlingTeam() {
        return this.bowlingTeam;
    }

    @Nullable
    public final Integer getBye() {
        return this.bye;
    }

    @Nullable
    public final Player getCurrentBatsman() {
        return this.currentBatsman;
    }

    @Nullable
    public final Player getCurrentBowler() {
        return this.currentBowler;
    }

    @Nullable
    public final Integer getExtra() {
        return this.extra;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getLegBye() {
        return this.legBye;
    }

    @Nullable
    public final Integer getNoBall() {
        return this.noBall;
    }

    public final int getNumber() {
        return this.number;
    }

    @Nullable
    public final Double getOvers() {
        return this.overs;
    }

    @NotNull
    public final List<Partnership> getPartnerships() {
        return this.partnerships;
    }

    @Nullable
    public final Integer getPenalty() {
        return this.penalty;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    public final Integer getSuperOver() {
        return this.superOver;
    }

    @Nullable
    public final Integer getWickets() {
        return this.wickets;
    }

    @Nullable
    public final Integer getWide() {
        return this.wide;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.superOver;
        int d = dmi.d(dmi.d(dmi.d(wv8.a(this.number, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.bowlingLine), 31, this.battingLine), 31, this.partnerships);
        Team team = this.battingTeam;
        int hashCode2 = (d + (team == null ? 0 : team.hashCode())) * 31;
        Team team2 = this.bowlingTeam;
        int hashCode3 = (hashCode2 + (team2 == null ? 0 : team2.hashCode())) * 31;
        Integer num2 = this.score;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.wickets;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d2 = this.overs;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num4 = this.extra;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.wide;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.noBall;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.bye;
        int hashCode10 = (hashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.legBye;
        int hashCode11 = (hashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.penalty;
        int hashCode12 = (hashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.isInningDeclare;
        int hashCode13 = (hashCode12 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Player player = this.currentBatsman;
        int hashCode14 = (hashCode13 + (player == null ? 0 : player.hashCode())) * 31;
        Player player2 = this.currentBowler;
        return hashCode14 + (player2 != null ? player2.hashCode() : 0);
    }

    @Nullable
    public final Integer isInningDeclare() {
        return this.isInningDeclare;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Integer num = this.superOver;
        int i2 = this.number;
        List<Bowler> list = this.bowlingLine;
        List<Batsman> list2 = this.battingLine;
        List<Partnership> list3 = this.partnerships;
        Team team = this.battingTeam;
        Team team2 = this.bowlingTeam;
        Integer num2 = this.score;
        Integer num3 = this.wickets;
        Double d = this.overs;
        Integer num4 = this.extra;
        Integer num5 = this.wide;
        Integer num6 = this.noBall;
        Integer num7 = this.bye;
        Integer num8 = this.legBye;
        Integer num9 = this.penalty;
        Integer num10 = this.isInningDeclare;
        Player player = this.currentBatsman;
        Player player2 = this.currentBowler;
        StringBuilder r = fc6.r("Inning(id=", ", superOver=", ", number=", num, i);
        r.append(i2);
        r.append(", bowlingLine=");
        r.append(list);
        r.append(", battingLine=");
        vxd.w(r, list2, ", partnerships=", list3, ", battingTeam=");
        r.append(team);
        r.append(", bowlingTeam=");
        r.append(team2);
        r.append(", score=");
        vxd.r(num2, num3, ", wickets=", ", overs=", r);
        mz1.x(d, num4, ", extra=", ", wide=", r);
        vxd.r(num5, num6, ", noBall=", ", bye=", r);
        vxd.r(num7, num8, ", legBye=", ", penalty=", r);
        vxd.r(num9, num10, ", isInningDeclare=", ", currentBatsman=", r);
        r.append(player);
        r.append(", currentBowler=");
        r.append(player2);
        r.append(")");
        return r.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Inning$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Inning;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Inning$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Inning(int i, @Nullable Integer num, int i2, @NotNull List<Bowler> list, @NotNull List<Batsman> list2, @NotNull List<Partnership> list3, @Nullable Team team, @Nullable Team team2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Double d, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Player player, @Nullable Player player2) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.id = i;
        this.superOver = num;
        this.number = i2;
        this.bowlingLine = list;
        this.battingLine = list2;
        this.partnerships = list3;
        this.battingTeam = team;
        this.bowlingTeam = team2;
        this.score = num2;
        this.wickets = num3;
        this.overs = d;
        this.extra = num4;
        this.wide = num5;
        this.noBall = num6;
        this.bye = num7;
        this.legBye = num8;
        this.penalty = num9;
        this.isInningDeclare = num10;
        this.currentBatsman = player;
        this.currentBowler = player2;
    }
}
