package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.c88;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.joa;
import defpackage.m97;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0002dcB½\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bB×\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0012\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u0010'J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010*J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010*J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010*J\u0010\u00103\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010*J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010*J\u0012\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b7\u0010'J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010*Jì\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b;\u0010%J\u0010\u0010<\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b<\u0010!J\u001a\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@J'\u0010I\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0001¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bQ\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bR\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010S\u001a\u0004\bT\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010P\u001a\u0004\bU\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010S\u001a\u0004\bV\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\bW\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bX\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\bY\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bZ\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010S\u001a\u0004\b[\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010S\u001a\u0004\b\\\u0010*R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010]\u001a\u0004\b^\u00104R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\b_\u0010*R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010S\u001a\u0004\b`\u0010*R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010P\u001a\u0004\ba\u0010'R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010S\u001a\u0004\bb\u0010*¨\u0006e"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPlayer;", "", "", "id", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", "position", "", "price", "averageScore", "averageScoreRank", "form", "formRank", "totalScore", "totalScoreRank", "ownedPercentage", "ownedRank", "ownedCount", "totalPlayersOnPosition", "Lcom/sofascore/model/mvvm/model/Team;", "team", "goals", "assists", "averageRating", "averageRatingRank", "<init>", "(ILcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "()Lcom/sofascore/model/mvvm/model/Player;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Float;", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "()Lcom/sofascore/model/mvvm/model/Team;", "component16", "component17", "component18", "component19", "copy", "(ILcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;)Lcom/sofascore/model/fantasy/FantasyPlayer;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyPlayer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Ljava/lang/String;", "getPosition", "Ljava/lang/Float;", "getPrice", "getAverageScore", "Ljava/lang/Integer;", "getAverageScoreRank", "getForm", "getFormRank", "getTotalScore", "getTotalScoreRank", "getOwnedPercentage", "getOwnedRank", "getOwnedCount", "getTotalPlayersOnPosition", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "getGoals", "getAssists", "getAverageRating", "getAverageRatingRank", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPlayer {

    @Nullable
    private final Integer assists;

    @Nullable
    private final Float averageRating;

    @Nullable
    private final Integer averageRatingRank;

    @Nullable
    private final Float averageScore;

    @Nullable
    private final Integer averageScoreRank;

    @Nullable
    private final Float form;

    @Nullable
    private final Integer formRank;

    @Nullable
    private final Integer goals;
    private final int id;

    @Nullable
    private final Integer ownedCount;

    @Nullable
    private final Float ownedPercentage;

    @Nullable
    private final Integer ownedRank;

    @NotNull
    private final Player player;

    @NotNull
    private final String position;

    @Nullable
    private final Float price;

    @NotNull
    private final Team team;

    @Nullable
    private final Integer totalPlayersOnPosition;

    @Nullable
    private final Integer totalScore;

    @Nullable
    private final Integer totalScoreRank;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysa.b, new m97(5)), null, null, null, null};

    public /* synthetic */ FantasyPlayer(int i, int i2, Player player, String str, Float f, Float f2, Integer num, Float f3, Integer num2, Integer num3, Integer num4, Float f4, Integer num5, Integer num6, Integer num7, Team team, Integer num8, Integer num9, Float f5, Integer num10, t5h t5hVar) {
        if (524287 != (i & 524287)) {
            oea.z(i, 524287, FantasyPlayer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.player = player;
        this.position = str;
        this.price = f;
        this.averageScore = f2;
        this.averageScoreRank = num;
        this.form = f3;
        this.formRank = num2;
        this.totalScore = num3;
        this.totalScoreRank = num4;
        this.ownedPercentage = f4;
        this.ownedRank = num5;
        this.ownedCount = num6;
        this.totalPlayersOnPosition = num7;
        this.team = team;
        this.goals = num8;
        this.assists = num9;
        this.averageRating = f5;
        this.averageRatingRank = num10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ FantasyPlayer copy$default(FantasyPlayer fantasyPlayer, int i, Player player, String str, Float f, Float f2, Integer num, Float f3, Integer num2, Integer num3, Integer num4, Float f4, Integer num5, Integer num6, Integer num7, Team team, Integer num8, Integer num9, Float f5, Integer num10, int i2, Object obj) {
        Integer num11;
        Float f6;
        int i3 = (i2 & 1) != 0 ? fantasyPlayer.id : i;
        Player player2 = (i2 & 2) != 0 ? fantasyPlayer.player : player;
        String str2 = (i2 & 4) != 0 ? fantasyPlayer.position : str;
        Float f7 = (i2 & 8) != 0 ? fantasyPlayer.price : f;
        Float f8 = (i2 & 16) != 0 ? fantasyPlayer.averageScore : f2;
        Integer num12 = (i2 & 32) != 0 ? fantasyPlayer.averageScoreRank : num;
        Float f9 = (i2 & 64) != 0 ? fantasyPlayer.form : f3;
        Integer num13 = (i2 & 128) != 0 ? fantasyPlayer.formRank : num2;
        Integer num14 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? fantasyPlayer.totalScore : num3;
        Integer num15 = (i2 & 512) != 0 ? fantasyPlayer.totalScoreRank : num4;
        Float f10 = (i2 & 1024) != 0 ? fantasyPlayer.ownedPercentage : f4;
        Integer num16 = (i2 & a.o) != 0 ? fantasyPlayer.ownedRank : num5;
        Integer num17 = (i2 & 4096) != 0 ? fantasyPlayer.ownedCount : num6;
        Integer num18 = (i2 & 8192) != 0 ? fantasyPlayer.totalPlayersOnPosition : num7;
        int i4 = i3;
        Team team2 = (i2 & 16384) != 0 ? fantasyPlayer.team : team;
        Integer num19 = (i2 & 32768) != 0 ? fantasyPlayer.goals : num8;
        Integer num20 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? fantasyPlayer.assists : num9;
        Float f11 = (i2 & 131072) != 0 ? fantasyPlayer.averageRating : f5;
        if ((i2 & 262144) != 0) {
            f6 = f11;
            num11 = fantasyPlayer.averageRatingRank;
        } else {
            num11 = num10;
            f6 = f11;
        }
        return fantasyPlayer.copy(i4, player2, str2, f7, f8, num12, f9, num13, num14, num15, f10, num16, num17, num18, team2, num19, num20, f6, num11);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyPlayer self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, Player$$serializer.INSTANCE, self.player);
        output.y(serialDesc, 2, self.position);
        c88 c88Var = c88.a;
        output.h(serialDesc, 3, c88Var, self.price);
        output.h(serialDesc, 4, c88Var, self.averageScore);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 5, a7aVar, self.averageScoreRank);
        output.h(serialDesc, 6, c88Var, self.form);
        output.h(serialDesc, 7, a7aVar, self.formRank);
        output.h(serialDesc, 8, a7aVar, self.totalScore);
        output.h(serialDesc, 9, a7aVar, self.totalScoreRank);
        output.h(serialDesc, 10, c88Var, self.ownedPercentage);
        output.h(serialDesc, 11, a7aVar, self.ownedRank);
        output.h(serialDesc, 12, a7aVar, self.ownedCount);
        output.h(serialDesc, 13, a7aVar, self.totalPlayersOnPosition);
        output.f(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.team);
        output.h(serialDesc, 15, a7aVar, self.goals);
        output.h(serialDesc, 16, a7aVar, self.assists);
        output.h(serialDesc, 17, c88Var, self.averageRating);
        output.h(serialDesc, 18, a7aVar, self.averageRatingRank);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getTotalScoreRank() {
        return this.totalScoreRank;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Float getOwnedPercentage() {
        return this.ownedPercentage;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getOwnedRank() {
        return this.ownedRank;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getOwnedCount() {
        return this.ownedCount;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getTotalPlayersOnPosition() {
        return this.totalPlayersOnPosition;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Float getAverageRating() {
        return this.averageRating;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getAverageRatingRank() {
        return this.averageRatingRank;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Float getPrice() {
        return this.price;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getAverageScore() {
        return this.averageScore;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getAverageScoreRank() {
        return this.averageScoreRank;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Float getForm() {
        return this.form;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getFormRank() {
        return this.formRank;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getTotalScore() {
        return this.totalScore;
    }

    @NotNull
    public final FantasyPlayer copy(int id, @NotNull Player player, @NotNull String position, @Nullable Float price, @Nullable Float averageScore, @Nullable Integer averageScoreRank, @Nullable Float form, @Nullable Integer formRank, @Nullable Integer totalScore, @Nullable Integer totalScoreRank, @Nullable Float ownedPercentage, @Nullable Integer ownedRank, @Nullable Integer ownedCount, @Nullable Integer totalPlayersOnPosition, @NotNull Team team, @Nullable Integer goals, @Nullable Integer assists, @Nullable Float averageRating, @Nullable Integer averageRatingRank) {
        player.getClass();
        position.getClass();
        team.getClass();
        return new FantasyPlayer(id, player, position, price, averageScore, averageScoreRank, form, formRank, totalScore, totalScoreRank, ownedPercentage, ownedRank, ownedCount, totalPlayersOnPosition, team, goals, assists, averageRating, averageRatingRank);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyPlayer)) {
            return false;
        }
        FantasyPlayer fantasyPlayer = (FantasyPlayer) other;
        return this.id == fantasyPlayer.id && Intrinsics.c(this.player, fantasyPlayer.player) && Intrinsics.c(this.position, fantasyPlayer.position) && Intrinsics.c(this.price, fantasyPlayer.price) && Intrinsics.c(this.averageScore, fantasyPlayer.averageScore) && Intrinsics.c(this.averageScoreRank, fantasyPlayer.averageScoreRank) && Intrinsics.c(this.form, fantasyPlayer.form) && Intrinsics.c(this.formRank, fantasyPlayer.formRank) && Intrinsics.c(this.totalScore, fantasyPlayer.totalScore) && Intrinsics.c(this.totalScoreRank, fantasyPlayer.totalScoreRank) && Intrinsics.c(this.ownedPercentage, fantasyPlayer.ownedPercentage) && Intrinsics.c(this.ownedRank, fantasyPlayer.ownedRank) && Intrinsics.c(this.ownedCount, fantasyPlayer.ownedCount) && Intrinsics.c(this.totalPlayersOnPosition, fantasyPlayer.totalPlayersOnPosition) && Intrinsics.c(this.team, fantasyPlayer.team) && Intrinsics.c(this.goals, fantasyPlayer.goals) && Intrinsics.c(this.assists, fantasyPlayer.assists) && Intrinsics.c(this.averageRating, fantasyPlayer.averageRating) && Intrinsics.c(this.averageRatingRank, fantasyPlayer.averageRatingRank);
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final Float getAverageRating() {
        return this.averageRating;
    }

    @Nullable
    public final Integer getAverageRatingRank() {
        return this.averageRatingRank;
    }

    @Nullable
    public final Float getAverageScore() {
        return this.averageScore;
    }

    @Nullable
    public final Integer getAverageScoreRank() {
        return this.averageScoreRank;
    }

    @Nullable
    public final Float getForm() {
        return this.form;
    }

    @Nullable
    public final Integer getFormRank() {
        return this.formRank;
    }

    @Nullable
    public final Integer getGoals() {
        return this.goals;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getOwnedCount() {
        return this.ownedCount;
    }

    @Nullable
    public final Float getOwnedPercentage() {
        return this.ownedPercentage;
    }

    @Nullable
    public final Integer getOwnedRank() {
        return this.ownedRank;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    public final Float getPrice() {
        return this.price;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final Integer getTotalPlayersOnPosition() {
        return this.totalPlayersOnPosition;
    }

    @Nullable
    public final Integer getTotalScore() {
        return this.totalScore;
    }

    @Nullable
    public final Integer getTotalScoreRank() {
        return this.totalScoreRank;
    }

    public int hashCode() {
        int c = dmi.c((this.player.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.position);
        Float f = this.price;
        int hashCode = (c + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.averageScore;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.averageScoreRank;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Float f3 = this.form;
        int hashCode4 = (hashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num2 = this.formRank;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalScore;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.totalScoreRank;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f4 = this.ownedPercentage;
        int hashCode8 = (hashCode7 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num5 = this.ownedRank;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.ownedCount;
        int hashCode10 = (hashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.totalPlayersOnPosition;
        int b = fc6.b((hashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31, 31, this.team);
        Integer num8 = this.goals;
        int hashCode11 = (b + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.assists;
        int hashCode12 = (hashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Float f5 = this.averageRating;
        int hashCode13 = (hashCode12 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Integer num10 = this.averageRatingRank;
        return hashCode13 + (num10 != null ? num10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Player player = this.player;
        String str = this.position;
        Float f = this.price;
        Float f2 = this.averageScore;
        Integer num = this.averageScoreRank;
        Float f3 = this.form;
        Integer num2 = this.formRank;
        Integer num3 = this.totalScore;
        Integer num4 = this.totalScoreRank;
        Float f4 = this.ownedPercentage;
        Integer num5 = this.ownedRank;
        Integer num6 = this.ownedCount;
        Integer num7 = this.totalPlayersOnPosition;
        Team team = this.team;
        Integer num8 = this.goals;
        Integer num9 = this.assists;
        Float f5 = this.averageRating;
        Integer num10 = this.averageRatingRank;
        StringBuilder sb = new StringBuilder("FantasyPlayer(id=");
        sb.append(i);
        sb.append(", player=");
        sb.append(player);
        sb.append(", position=");
        sb.append(str);
        sb.append(", price=");
        sb.append(f);
        sb.append(", averageScore=");
        sb.append(f2);
        sb.append(", averageScoreRank=");
        sb.append(num);
        sb.append(", form=");
        sb.append(f3);
        sb.append(", formRank=");
        sb.append(num2);
        sb.append(", totalScore=");
        vxd.r(num3, num4, ", totalScoreRank=", ", ownedPercentage=", sb);
        sb.append(f4);
        sb.append(", ownedRank=");
        sb.append(num5);
        sb.append(", ownedCount=");
        vxd.r(num6, num7, ", totalPlayersOnPosition=", ", team=", sb);
        sb.append(team);
        sb.append(", goals=");
        sb.append(num8);
        sb.append(", assists=");
        sb.append(num9);
        sb.append(", averageRating=");
        sb.append(f5);
        sb.append(", averageRatingRank=");
        return vxd.n(sb, num10, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPlayer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPlayer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyPlayer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyPlayer(int i, @NotNull Player player, @NotNull String str, @Nullable Float f, @Nullable Float f2, @Nullable Integer num, @Nullable Float f3, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Float f4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @NotNull Team team, @Nullable Integer num8, @Nullable Integer num9, @Nullable Float f5, @Nullable Integer num10) {
        player.getClass();
        str.getClass();
        team.getClass();
        this.id = i;
        this.player = player;
        this.position = str;
        this.price = f;
        this.averageScore = f2;
        this.averageScoreRank = num;
        this.form = f3;
        this.formRank = num2;
        this.totalScore = num3;
        this.totalScoreRank = num4;
        this.ownedPercentage = f4;
        this.ownedRank = num5;
        this.ownedCount = num6;
        this.totalPlayersOnPosition = num7;
        this.team = team;
        this.goals = num8;
        this.assists = num9;
        this.averageRating = f5;
        this.averageRatingRank = num10;
    }
}
