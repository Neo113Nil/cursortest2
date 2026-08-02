package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a7a;
import defpackage.ag5;
import defpackage.fc6;
import defpackage.gz1;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 f2\u00020\u0001:\u0002gfBÕ\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bBý\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001a\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0012\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b.\u0010'J\u0012\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b/\u0010'J\u0012\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b1\u0010'J\u0012\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b2\u0010'J\u0012\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b3\u0010'J\u0012\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b4\u0010'J\u0012\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b5\u0010'J\u0012\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b6\u0010'J\u0012\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b7\u0010'J\u0012\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b8\u0010,J\u0012\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b9\u0010'J\u0012\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b:\u0010'J\u0086\u0002\u0010;\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010>\u001a\u00020=HÖ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010D\u001a\u00020\n2\b\u0010C\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bD\u0010EJ'\u0010N\u001a\u00020K2\u0006\u0010F\u001a\u00020\u00002\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020IH\u0001¢\u0006\u0004\bL\u0010MR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bP\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010Q\u001a\u0004\bR\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010Q\u001a\u0004\bS\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010Q\u001a\u0004\bT\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010Q\u001a\u0004\bU\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\bW\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bX\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\bY\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bZ\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010Q\u001a\u0004\b[\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010Q\u001a\u0004\b\\\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\b]\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\b^\u0010'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010Q\u001a\u0004\b_\u0010'R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\b`\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010Q\u001a\u0004\ba\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010Q\u001a\u0004\bb\u0010'R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\bc\u0010,R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010Q\u001a\u0004\bd\u0010'R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010Q\u001a\u0004\be\u0010'¨\u0006h"}, d2 = {"Lcom/sofascore/model/newNetwork/EsportsGameStatistics;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/newNetwork/ESportCharacter;", "bans", "", "cloudDrakeKills", "dragonKills", "elderDrakeKills", "goldEarned", "", "heraldKilled", "infernalDrakeKills", "chemtechDrakeKills", "hextechDrakeKills", "inhibitorKills", "kills", "mountainDrakeKills", "nashorKills", "oceanDrakeKills", "towerKills", "barracksDestroyed", "barracksRemaining", "firstBlood", "towersDestroyed", "towersRemaining", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/EsportsGameStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/EsportsGameStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getBans", "Ljava/lang/Integer;", "getCloudDrakeKills", "getDragonKills", "getElderDrakeKills", "getGoldEarned", "Ljava/lang/Boolean;", "getHeraldKilled", "getInfernalDrakeKills", "getChemtechDrakeKills", "getHextechDrakeKills", "getInhibitorKills", "getKills", "getMountainDrakeKills", "getNashorKills", "getOceanDrakeKills", "getTowerKills", "getBarracksDestroyed", "getBarracksRemaining", "getFirstBlood", "getTowersDestroyed", "getTowersRemaining", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EsportsGameStatistics extends NetworkResponse {

    @Nullable
    private final List<ESportCharacter> bans;

    @Nullable
    private final Integer barracksDestroyed;

    @Nullable
    private final Integer barracksRemaining;

    @Nullable
    private final Integer chemtechDrakeKills;

    @Nullable
    private final Integer cloudDrakeKills;

    @Nullable
    private final Integer dragonKills;

    @Nullable
    private final Integer elderDrakeKills;

    @Nullable
    private final Boolean firstBlood;

    @Nullable
    private final Integer goldEarned;

    @Nullable
    private final Boolean heraldKilled;

    @Nullable
    private final Integer hextechDrakeKills;

    @Nullable
    private final Integer infernalDrakeKills;

    @Nullable
    private final Integer inhibitorKills;

    @Nullable
    private final Integer kills;

    @Nullable
    private final Integer mountainDrakeKills;

    @Nullable
    private final Integer nashorKills;

    @Nullable
    private final Integer oceanDrakeKills;

    @Nullable
    private final Integer towerKills;

    @Nullable
    private final Integer towersDestroyed;

    @Nullable
    private final Integer towersRemaining;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new ag5(23)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EsportsGameStatistics(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Boolean bool2, Integer num16, Integer num17, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (4194300 != (i & 4194300)) {
            oea.z(i, 4194300, EsportsGameStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.bans = list;
        this.cloudDrakeKills = num;
        this.dragonKills = num2;
        this.elderDrakeKills = num3;
        this.goldEarned = num4;
        this.heraldKilled = bool;
        this.infernalDrakeKills = num5;
        this.chemtechDrakeKills = num6;
        this.hextechDrakeKills = num7;
        this.inhibitorKills = num8;
        this.kills = num9;
        this.mountainDrakeKills = num10;
        this.nashorKills = num11;
        this.oceanDrakeKills = num12;
        this.towerKills = num13;
        this.barracksDestroyed = num14;
        this.barracksRemaining = num15;
        this.firstBlood = bool2;
        this.towersDestroyed = num16;
        this.towersRemaining = num17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(ESportCharacter$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ EsportsGameStatistics copy$default(EsportsGameStatistics esportsGameStatistics, List list, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Boolean bool2, Integer num16, Integer num17, int i, Object obj) {
        Integer num18;
        Integer num19;
        List list2 = (i & 1) != 0 ? esportsGameStatistics.bans : list;
        Integer num20 = (i & 2) != 0 ? esportsGameStatistics.cloudDrakeKills : num;
        Integer num21 = (i & 4) != 0 ? esportsGameStatistics.dragonKills : num2;
        Integer num22 = (i & 8) != 0 ? esportsGameStatistics.elderDrakeKills : num3;
        Integer num23 = (i & 16) != 0 ? esportsGameStatistics.goldEarned : num4;
        Boolean bool3 = (i & 32) != 0 ? esportsGameStatistics.heraldKilled : bool;
        Integer num24 = (i & 64) != 0 ? esportsGameStatistics.infernalDrakeKills : num5;
        Integer num25 = (i & 128) != 0 ? esportsGameStatistics.chemtechDrakeKills : num6;
        Integer num26 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? esportsGameStatistics.hextechDrakeKills : num7;
        Integer num27 = (i & 512) != 0 ? esportsGameStatistics.inhibitorKills : num8;
        Integer num28 = (i & 1024) != 0 ? esportsGameStatistics.kills : num9;
        Integer num29 = (i & a.o) != 0 ? esportsGameStatistics.mountainDrakeKills : num10;
        Integer num30 = (i & 4096) != 0 ? esportsGameStatistics.nashorKills : num11;
        Integer num31 = (i & 8192) != 0 ? esportsGameStatistics.oceanDrakeKills : num12;
        List list3 = list2;
        Integer num32 = (i & 16384) != 0 ? esportsGameStatistics.towerKills : num13;
        Integer num33 = (i & 32768) != 0 ? esportsGameStatistics.barracksDestroyed : num14;
        Integer num34 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? esportsGameStatistics.barracksRemaining : num15;
        Boolean bool4 = (i & 131072) != 0 ? esportsGameStatistics.firstBlood : bool2;
        Integer num35 = (i & 262144) != 0 ? esportsGameStatistics.towersDestroyed : num16;
        if ((i & 524288) != 0) {
            num19 = num35;
            num18 = esportsGameStatistics.towersRemaining;
        } else {
            num18 = num17;
            num19 = num35;
        }
        return esportsGameStatistics.copy(list3, num20, num21, num22, num23, bool3, num24, num25, num26, num27, num28, num29, num30, num31, num32, num33, num34, bool4, num19, num18);
    }

    public static final /* synthetic */ void write$Self$model_release(EsportsGameStatistics self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        output.h(serialDesc, 2, (KSerializer) $childSerializers[2].getValue(), self.bans);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 3, a7aVar, self.cloudDrakeKills);
        output.h(serialDesc, 4, a7aVar, self.dragonKills);
        output.h(serialDesc, 5, a7aVar, self.elderDrakeKills);
        output.h(serialDesc, 6, a7aVar, self.goldEarned);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 7, gz1Var, self.heraldKilled);
        output.h(serialDesc, 8, a7aVar, self.infernalDrakeKills);
        output.h(serialDesc, 9, a7aVar, self.chemtechDrakeKills);
        output.h(serialDesc, 10, a7aVar, self.hextechDrakeKills);
        output.h(serialDesc, 11, a7aVar, self.inhibitorKills);
        output.h(serialDesc, 12, a7aVar, self.kills);
        output.h(serialDesc, 13, a7aVar, self.mountainDrakeKills);
        output.h(serialDesc, 14, a7aVar, self.nashorKills);
        output.h(serialDesc, 15, a7aVar, self.oceanDrakeKills);
        output.h(serialDesc, 16, a7aVar, self.towerKills);
        output.h(serialDesc, 17, a7aVar, self.barracksDestroyed);
        output.h(serialDesc, 18, a7aVar, self.barracksRemaining);
        output.h(serialDesc, 19, gz1Var, self.firstBlood);
        output.h(serialDesc, 20, a7aVar, self.towersDestroyed);
        output.h(serialDesc, 21, a7aVar, self.towersRemaining);
    }

    @Nullable
    public final List<ESportCharacter> component1() {
        return this.bans;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getInhibitorKills() {
        return this.inhibitorKills;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getKills() {
        return this.kills;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getMountainDrakeKills() {
        return this.mountainDrakeKills;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getNashorKills() {
        return this.nashorKills;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getOceanDrakeKills() {
        return this.oceanDrakeKills;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getTowerKills() {
        return this.towerKills;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getBarracksDestroyed() {
        return this.barracksDestroyed;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getBarracksRemaining() {
        return this.barracksRemaining;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Boolean getFirstBlood() {
        return this.firstBlood;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getTowersDestroyed() {
        return this.towersDestroyed;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getCloudDrakeKills() {
        return this.cloudDrakeKills;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getTowersRemaining() {
        return this.towersRemaining;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getDragonKills() {
        return this.dragonKills;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getElderDrakeKills() {
        return this.elderDrakeKills;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getGoldEarned() {
        return this.goldEarned;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getHeraldKilled() {
        return this.heraldKilled;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getInfernalDrakeKills() {
        return this.infernalDrakeKills;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getChemtechDrakeKills() {
        return this.chemtechDrakeKills;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getHextechDrakeKills() {
        return this.hextechDrakeKills;
    }

    @NotNull
    public final EsportsGameStatistics copy(@Nullable List<ESportCharacter> bans, @Nullable Integer cloudDrakeKills, @Nullable Integer dragonKills, @Nullable Integer elderDrakeKills, @Nullable Integer goldEarned, @Nullable Boolean heraldKilled, @Nullable Integer infernalDrakeKills, @Nullable Integer chemtechDrakeKills, @Nullable Integer hextechDrakeKills, @Nullable Integer inhibitorKills, @Nullable Integer kills, @Nullable Integer mountainDrakeKills, @Nullable Integer nashorKills, @Nullable Integer oceanDrakeKills, @Nullable Integer towerKills, @Nullable Integer barracksDestroyed, @Nullable Integer barracksRemaining, @Nullable Boolean firstBlood, @Nullable Integer towersDestroyed, @Nullable Integer towersRemaining) {
        return new EsportsGameStatistics(bans, cloudDrakeKills, dragonKills, elderDrakeKills, goldEarned, heraldKilled, infernalDrakeKills, chemtechDrakeKills, hextechDrakeKills, inhibitorKills, kills, mountainDrakeKills, nashorKills, oceanDrakeKills, towerKills, barracksDestroyed, barracksRemaining, firstBlood, towersDestroyed, towersRemaining);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EsportsGameStatistics)) {
            return false;
        }
        EsportsGameStatistics esportsGameStatistics = (EsportsGameStatistics) other;
        return Intrinsics.c(this.bans, esportsGameStatistics.bans) && Intrinsics.c(this.cloudDrakeKills, esportsGameStatistics.cloudDrakeKills) && Intrinsics.c(this.dragonKills, esportsGameStatistics.dragonKills) && Intrinsics.c(this.elderDrakeKills, esportsGameStatistics.elderDrakeKills) && Intrinsics.c(this.goldEarned, esportsGameStatistics.goldEarned) && Intrinsics.c(this.heraldKilled, esportsGameStatistics.heraldKilled) && Intrinsics.c(this.infernalDrakeKills, esportsGameStatistics.infernalDrakeKills) && Intrinsics.c(this.chemtechDrakeKills, esportsGameStatistics.chemtechDrakeKills) && Intrinsics.c(this.hextechDrakeKills, esportsGameStatistics.hextechDrakeKills) && Intrinsics.c(this.inhibitorKills, esportsGameStatistics.inhibitorKills) && Intrinsics.c(this.kills, esportsGameStatistics.kills) && Intrinsics.c(this.mountainDrakeKills, esportsGameStatistics.mountainDrakeKills) && Intrinsics.c(this.nashorKills, esportsGameStatistics.nashorKills) && Intrinsics.c(this.oceanDrakeKills, esportsGameStatistics.oceanDrakeKills) && Intrinsics.c(this.towerKills, esportsGameStatistics.towerKills) && Intrinsics.c(this.barracksDestroyed, esportsGameStatistics.barracksDestroyed) && Intrinsics.c(this.barracksRemaining, esportsGameStatistics.barracksRemaining) && Intrinsics.c(this.firstBlood, esportsGameStatistics.firstBlood) && Intrinsics.c(this.towersDestroyed, esportsGameStatistics.towersDestroyed) && Intrinsics.c(this.towersRemaining, esportsGameStatistics.towersRemaining);
    }

    @Nullable
    public final List<ESportCharacter> getBans() {
        return this.bans;
    }

    @Nullable
    public final Integer getBarracksDestroyed() {
        return this.barracksDestroyed;
    }

    @Nullable
    public final Integer getBarracksRemaining() {
        return this.barracksRemaining;
    }

    @Nullable
    public final Integer getChemtechDrakeKills() {
        return this.chemtechDrakeKills;
    }

    @Nullable
    public final Integer getCloudDrakeKills() {
        return this.cloudDrakeKills;
    }

    @Nullable
    public final Integer getDragonKills() {
        return this.dragonKills;
    }

    @Nullable
    public final Integer getElderDrakeKills() {
        return this.elderDrakeKills;
    }

    @Nullable
    public final Boolean getFirstBlood() {
        return this.firstBlood;
    }

    @Nullable
    public final Integer getGoldEarned() {
        return this.goldEarned;
    }

    @Nullable
    public final Boolean getHeraldKilled() {
        return this.heraldKilled;
    }

    @Nullable
    public final Integer getHextechDrakeKills() {
        return this.hextechDrakeKills;
    }

    @Nullable
    public final Integer getInfernalDrakeKills() {
        return this.infernalDrakeKills;
    }

    @Nullable
    public final Integer getInhibitorKills() {
        return this.inhibitorKills;
    }

    @Nullable
    public final Integer getKills() {
        return this.kills;
    }

    @Nullable
    public final Integer getMountainDrakeKills() {
        return this.mountainDrakeKills;
    }

    @Nullable
    public final Integer getNashorKills() {
        return this.nashorKills;
    }

    @Nullable
    public final Integer getOceanDrakeKills() {
        return this.oceanDrakeKills;
    }

    @Nullable
    public final Integer getTowerKills() {
        return this.towerKills;
    }

    @Nullable
    public final Integer getTowersDestroyed() {
        return this.towersDestroyed;
    }

    @Nullable
    public final Integer getTowersRemaining() {
        return this.towersRemaining;
    }

    public int hashCode() {
        List<ESportCharacter> list = this.bans;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.cloudDrakeKills;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.dragonKills;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.elderDrakeKills;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.goldEarned;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.heraldKilled;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num5 = this.infernalDrakeKills;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.chemtechDrakeKills;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.hextechDrakeKills;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.inhibitorKills;
        int hashCode10 = (hashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.kills;
        int hashCode11 = (hashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.mountainDrakeKills;
        int hashCode12 = (hashCode11 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.nashorKills;
        int hashCode13 = (hashCode12 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.oceanDrakeKills;
        int hashCode14 = (hashCode13 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.towerKills;
        int hashCode15 = (hashCode14 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.barracksDestroyed;
        int hashCode16 = (hashCode15 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.barracksRemaining;
        int hashCode17 = (hashCode16 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Boolean bool2 = this.firstBlood;
        int hashCode18 = (hashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num16 = this.towersDestroyed;
        int hashCode19 = (hashCode18 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.towersRemaining;
        return hashCode19 + (num17 != null ? num17.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ESportCharacter> list = this.bans;
        Integer num = this.cloudDrakeKills;
        Integer num2 = this.dragonKills;
        Integer num3 = this.elderDrakeKills;
        Integer num4 = this.goldEarned;
        Boolean bool = this.heraldKilled;
        Integer num5 = this.infernalDrakeKills;
        Integer num6 = this.chemtechDrakeKills;
        Integer num7 = this.hextechDrakeKills;
        Integer num8 = this.inhibitorKills;
        Integer num9 = this.kills;
        Integer num10 = this.mountainDrakeKills;
        Integer num11 = this.nashorKills;
        Integer num12 = this.oceanDrakeKills;
        Integer num13 = this.towerKills;
        Integer num14 = this.barracksDestroyed;
        Integer num15 = this.barracksRemaining;
        Boolean bool2 = this.firstBlood;
        Integer num16 = this.towersDestroyed;
        Integer num17 = this.towersRemaining;
        StringBuilder sb = new StringBuilder("EsportsGameStatistics(bans=");
        sb.append(list);
        sb.append(", cloudDrakeKills=");
        sb.append(num);
        sb.append(", dragonKills=");
        vxd.r(num2, num3, ", elderDrakeKills=", ", goldEarned=", sb);
        vxd.v(sb, num4, ", heraldKilled=", bool, ", infernalDrakeKills=");
        vxd.r(num5, num6, ", chemtechDrakeKills=", ", hextechDrakeKills=", sb);
        vxd.r(num7, num8, ", inhibitorKills=", ", kills=", sb);
        vxd.r(num9, num10, ", mountainDrakeKills=", ", nashorKills=", sb);
        vxd.r(num11, num12, ", oceanDrakeKills=", ", towerKills=", sb);
        vxd.r(num13, num14, ", barracksDestroyed=", ", barracksRemaining=", sb);
        vxd.v(sb, num15, ", firstBlood=", bool2, ", towersDestroyed=");
        return fc6.l(num16, num17, ", towersRemaining=", ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/EsportsGameStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/EsportsGameStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EsportsGameStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EsportsGameStatistics(@Nullable List<ESportCharacter> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Boolean bool, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Boolean bool2, @Nullable Integer num16, @Nullable Integer num17) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.bans = list;
        this.cloudDrakeKills = num;
        this.dragonKills = num2;
        this.elderDrakeKills = num3;
        this.goldEarned = num4;
        this.heraldKilled = bool;
        this.infernalDrakeKills = num5;
        this.chemtechDrakeKills = num6;
        this.hextechDrakeKills = num7;
        this.inhibitorKills = num8;
        this.kills = num9;
        this.mountainDrakeKills = num10;
        this.nashorKills = num11;
        this.oceanDrakeKills = num12;
        this.towerKills = num13;
        this.barracksDestroyed = num14;
        this.barracksRemaining = num15;
        this.firstBlood = bool2;
        this.towersDestroyed = num16;
        this.towersRemaining = num17;
    }
}
