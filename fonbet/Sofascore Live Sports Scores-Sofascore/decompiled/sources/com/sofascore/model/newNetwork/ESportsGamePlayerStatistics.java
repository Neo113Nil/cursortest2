package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.h75;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 p2\u00020\u0001:\u0002qpBë\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u0081\u0002\b\u0010\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010&J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010&J\u0012\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010&J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010&J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010&J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010&J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010&J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010&J\u0012\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010&J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010&J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010&J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010&J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010&J\u0012\u0010<\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\b@\u0010AJ¢\u0002\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dHÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bD\u0010?J\u0010\u0010E\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\n2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IJ'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bP\u0010QR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010S\u001a\u0004\bU\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010S\u001a\u0004\bV\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010S\u001a\u0004\bW\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010S\u001a\u0004\bX\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010S\u001a\u0004\bY\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010S\u001a\u0004\bZ\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010[\u001a\u0004\b\\\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010S\u001a\u0004\b]\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010S\u001a\u0004\b^\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\b_\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\b`\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\ba\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bb\u0010&R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010c\u001a\u0004\bd\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010S\u001a\u0004\be\u0010&R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bf\u0010&R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bg\u0010&R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010S\u001a\u0004\bh\u0010&R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010S\u001a\u0004\bi\u0010&R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010j\u001a\u0004\bk\u0010=R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010l\u001a\u0004\bm\u0010?R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010n\u001a\u0004\bo\u0010A¨\u0006r"}, d2 = {"Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;", "", "", "assists", "deaths", "goldEarned", "health", "kills", "level", "minionsKilled", "", "alive", "denies", "goldPerMin", "heroLevel", "lastHits", "netWorth", "xpPerMin", "", "adr", "firstKillsDiff", "flashAssists", "headshots", "kdDiff", "kast", "Lcom/sofascore/model/newNetwork/ESportCharacter;", "character", "", "role", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/ESportCharacter;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/ESportCharacter;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;Lt5h;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "()Ljava/lang/Double;", "component16", "component17", "component18", "component19", "component20", "component21", "()Lcom/sofascore/model/newNetwork/ESportCharacter;", "component22", "()Ljava/lang/String;", "component23", "()Lcom/sofascore/model/mvvm/model/Player;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/ESportCharacter;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;)Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getAssists", "getDeaths", "getGoldEarned", "getHealth", "getKills", "getLevel", "getMinionsKilled", "Ljava/lang/Boolean;", "getAlive", "getDenies", "getGoldPerMin", "getHeroLevel", "getLastHits", "getNetWorth", "getXpPerMin", "Ljava/lang/Double;", "getAdr", "getFirstKillsDiff", "getFlashAssists", "getHeadshots", "getKdDiff", "getKast", "Lcom/sofascore/model/newNetwork/ESportCharacter;", "getCharacter", "Ljava/lang/String;", "getRole", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ESportsGamePlayerStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Double adr;

    @Nullable
    private final Boolean alive;

    @Nullable
    private final Integer assists;

    @Nullable
    private final ESportCharacter character;

    @Nullable
    private final Integer deaths;

    @Nullable
    private final Integer denies;

    @Nullable
    private final Integer firstKillsDiff;

    @Nullable
    private final Integer flashAssists;

    @Nullable
    private final Integer goldEarned;

    @Nullable
    private final Integer goldPerMin;

    @Nullable
    private final Integer headshots;

    @Nullable
    private final Integer health;

    @Nullable
    private final Integer heroLevel;

    @Nullable
    private final Integer kast;

    @Nullable
    private final Integer kdDiff;

    @Nullable
    private final Integer kills;

    @Nullable
    private final Integer lastHits;

    @Nullable
    private final Integer level;

    @Nullable
    private final Integer minionsKilled;

    @Nullable
    private final Integer netWorth;

    @NotNull
    private final Player player;

    @Nullable
    private final String role;

    @Nullable
    private final Integer xpPerMin;

    public /* synthetic */ ESportsGamePlayerStatistics(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Double d, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, ESportCharacter eSportCharacter, String str, Player player, t5h t5hVar) {
        if (8388607 != (i & 8388607)) {
            oea.z(i, 8388607, ESportsGamePlayerStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.assists = num;
        this.deaths = num2;
        this.goldEarned = num3;
        this.health = num4;
        this.kills = num5;
        this.level = num6;
        this.minionsKilled = num7;
        this.alive = bool;
        this.denies = num8;
        this.goldPerMin = num9;
        this.heroLevel = num10;
        this.lastHits = num11;
        this.netWorth = num12;
        this.xpPerMin = num13;
        this.adr = d;
        this.firstKillsDiff = num14;
        this.flashAssists = num15;
        this.headshots = num16;
        this.kdDiff = num17;
        this.kast = num18;
        this.character = eSportCharacter;
        this.role = str;
        this.player = player;
    }

    public static /* synthetic */ ESportsGamePlayerStatistics copy$default(ESportsGamePlayerStatistics eSportsGamePlayerStatistics, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Double d, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, ESportCharacter eSportCharacter, String str, Player player, int i, Object obj) {
        Player player2;
        String str2;
        Integer num19 = (i & 1) != 0 ? eSportsGamePlayerStatistics.assists : num;
        Integer num20 = (i & 2) != 0 ? eSportsGamePlayerStatistics.deaths : num2;
        Integer num21 = (i & 4) != 0 ? eSportsGamePlayerStatistics.goldEarned : num3;
        Integer num22 = (i & 8) != 0 ? eSportsGamePlayerStatistics.health : num4;
        Integer num23 = (i & 16) != 0 ? eSportsGamePlayerStatistics.kills : num5;
        Integer num24 = (i & 32) != 0 ? eSportsGamePlayerStatistics.level : num6;
        Integer num25 = (i & 64) != 0 ? eSportsGamePlayerStatistics.minionsKilled : num7;
        Boolean bool2 = (i & 128) != 0 ? eSportsGamePlayerStatistics.alive : bool;
        Integer num26 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? eSportsGamePlayerStatistics.denies : num8;
        Integer num27 = (i & 512) != 0 ? eSportsGamePlayerStatistics.goldPerMin : num9;
        Integer num28 = (i & 1024) != 0 ? eSportsGamePlayerStatistics.heroLevel : num10;
        Integer num29 = (i & a.o) != 0 ? eSportsGamePlayerStatistics.lastHits : num11;
        Integer num30 = (i & 4096) != 0 ? eSportsGamePlayerStatistics.netWorth : num12;
        Integer num31 = (i & 8192) != 0 ? eSportsGamePlayerStatistics.xpPerMin : num13;
        Integer num32 = num19;
        Double d2 = (i & 16384) != 0 ? eSportsGamePlayerStatistics.adr : d;
        Integer num33 = (i & 32768) != 0 ? eSportsGamePlayerStatistics.firstKillsDiff : num14;
        Integer num34 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? eSportsGamePlayerStatistics.flashAssists : num15;
        Integer num35 = (i & 131072) != 0 ? eSportsGamePlayerStatistics.headshots : num16;
        Integer num36 = (i & 262144) != 0 ? eSportsGamePlayerStatistics.kdDiff : num17;
        Integer num37 = (i & 524288) != 0 ? eSportsGamePlayerStatistics.kast : num18;
        ESportCharacter eSportCharacter2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? eSportsGamePlayerStatistics.character : eSportCharacter;
        String str3 = (i & 2097152) != 0 ? eSportsGamePlayerStatistics.role : str;
        if ((i & 4194304) != 0) {
            str2 = str3;
            player2 = eSportsGamePlayerStatistics.player;
        } else {
            player2 = player;
            str2 = str3;
        }
        return eSportsGamePlayerStatistics.copy(num32, num20, num21, num22, num23, num24, num25, bool2, num26, num27, num28, num29, num30, num31, d2, num33, num34, num35, num36, num37, eSportCharacter2, str2, player2);
    }

    public static final /* synthetic */ void write$Self$model_release(ESportsGamePlayerStatistics self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.assists);
        output.h(serialDesc, 1, a7aVar, self.deaths);
        output.h(serialDesc, 2, a7aVar, self.goldEarned);
        output.h(serialDesc, 3, a7aVar, self.health);
        output.h(serialDesc, 4, a7aVar, self.kills);
        output.h(serialDesc, 5, a7aVar, self.level);
        output.h(serialDesc, 6, a7aVar, self.minionsKilled);
        output.h(serialDesc, 7, gz1.a, self.alive);
        output.h(serialDesc, 8, a7aVar, self.denies);
        output.h(serialDesc, 9, a7aVar, self.goldPerMin);
        output.h(serialDesc, 10, a7aVar, self.heroLevel);
        output.h(serialDesc, 11, a7aVar, self.lastHits);
        output.h(serialDesc, 12, a7aVar, self.netWorth);
        output.h(serialDesc, 13, a7aVar, self.xpPerMin);
        output.h(serialDesc, 14, h75.a, self.adr);
        output.h(serialDesc, 15, a7aVar, self.firstKillsDiff);
        output.h(serialDesc, 16, a7aVar, self.flashAssists);
        output.h(serialDesc, 17, a7aVar, self.headshots);
        output.h(serialDesc, 18, a7aVar, self.kdDiff);
        output.h(serialDesc, 19, a7aVar, self.kast);
        output.h(serialDesc, 20, ESportCharacter$$serializer.INSTANCE, self.character);
        output.h(serialDesc, 21, uhi.a, self.role);
        output.f(serialDesc, 22, Player$$serializer.INSTANCE, self.player);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getGoldPerMin() {
        return this.goldPerMin;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getHeroLevel() {
        return this.heroLevel;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getLastHits() {
        return this.lastHits;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getNetWorth() {
        return this.netWorth;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getXpPerMin() {
        return this.xpPerMin;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Double getAdr() {
        return this.adr;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getFirstKillsDiff() {
        return this.firstKillsDiff;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getFlashAssists() {
        return this.flashAssists;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getHeadshots() {
        return this.headshots;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getKdDiff() {
        return this.kdDiff;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getDeaths() {
        return this.deaths;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getKast() {
        return this.kast;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final ESportCharacter getCharacter() {
        return this.character;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    @NotNull
    /* renamed from: component23, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getGoldEarned() {
        return this.goldEarned;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getHealth() {
        return this.health;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getKills() {
        return this.kills;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getLevel() {
        return this.level;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getMinionsKilled() {
        return this.minionsKilled;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getAlive() {
        return this.alive;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getDenies() {
        return this.denies;
    }

    @NotNull
    public final ESportsGamePlayerStatistics copy(@Nullable Integer assists, @Nullable Integer deaths, @Nullable Integer goldEarned, @Nullable Integer health, @Nullable Integer kills, @Nullable Integer level, @Nullable Integer minionsKilled, @Nullable Boolean alive, @Nullable Integer denies, @Nullable Integer goldPerMin, @Nullable Integer heroLevel, @Nullable Integer lastHits, @Nullable Integer netWorth, @Nullable Integer xpPerMin, @Nullable Double adr, @Nullable Integer firstKillsDiff, @Nullable Integer flashAssists, @Nullable Integer headshots, @Nullable Integer kdDiff, @Nullable Integer kast, @Nullable ESportCharacter character, @Nullable String role, @NotNull Player player) {
        player.getClass();
        return new ESportsGamePlayerStatistics(assists, deaths, goldEarned, health, kills, level, minionsKilled, alive, denies, goldPerMin, heroLevel, lastHits, netWorth, xpPerMin, adr, firstKillsDiff, flashAssists, headshots, kdDiff, kast, character, role, player);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESportsGamePlayerStatistics)) {
            return false;
        }
        ESportsGamePlayerStatistics eSportsGamePlayerStatistics = (ESportsGamePlayerStatistics) other;
        return Intrinsics.c(this.assists, eSportsGamePlayerStatistics.assists) && Intrinsics.c(this.deaths, eSportsGamePlayerStatistics.deaths) && Intrinsics.c(this.goldEarned, eSportsGamePlayerStatistics.goldEarned) && Intrinsics.c(this.health, eSportsGamePlayerStatistics.health) && Intrinsics.c(this.kills, eSportsGamePlayerStatistics.kills) && Intrinsics.c(this.level, eSportsGamePlayerStatistics.level) && Intrinsics.c(this.minionsKilled, eSportsGamePlayerStatistics.minionsKilled) && Intrinsics.c(this.alive, eSportsGamePlayerStatistics.alive) && Intrinsics.c(this.denies, eSportsGamePlayerStatistics.denies) && Intrinsics.c(this.goldPerMin, eSportsGamePlayerStatistics.goldPerMin) && Intrinsics.c(this.heroLevel, eSportsGamePlayerStatistics.heroLevel) && Intrinsics.c(this.lastHits, eSportsGamePlayerStatistics.lastHits) && Intrinsics.c(this.netWorth, eSportsGamePlayerStatistics.netWorth) && Intrinsics.c(this.xpPerMin, eSportsGamePlayerStatistics.xpPerMin) && Intrinsics.c(this.adr, eSportsGamePlayerStatistics.adr) && Intrinsics.c(this.firstKillsDiff, eSportsGamePlayerStatistics.firstKillsDiff) && Intrinsics.c(this.flashAssists, eSportsGamePlayerStatistics.flashAssists) && Intrinsics.c(this.headshots, eSportsGamePlayerStatistics.headshots) && Intrinsics.c(this.kdDiff, eSportsGamePlayerStatistics.kdDiff) && Intrinsics.c(this.kast, eSportsGamePlayerStatistics.kast) && Intrinsics.c(this.character, eSportsGamePlayerStatistics.character) && Intrinsics.c(this.role, eSportsGamePlayerStatistics.role) && Intrinsics.c(this.player, eSportsGamePlayerStatistics.player);
    }

    @Nullable
    public final Double getAdr() {
        return this.adr;
    }

    @Nullable
    public final Boolean getAlive() {
        return this.alive;
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final ESportCharacter getCharacter() {
        return this.character;
    }

    @Nullable
    public final Integer getDeaths() {
        return this.deaths;
    }

    @Nullable
    public final Integer getDenies() {
        return this.denies;
    }

    @Nullable
    public final Integer getFirstKillsDiff() {
        return this.firstKillsDiff;
    }

    @Nullable
    public final Integer getFlashAssists() {
        return this.flashAssists;
    }

    @Nullable
    public final Integer getGoldEarned() {
        return this.goldEarned;
    }

    @Nullable
    public final Integer getGoldPerMin() {
        return this.goldPerMin;
    }

    @Nullable
    public final Integer getHeadshots() {
        return this.headshots;
    }

    @Nullable
    public final Integer getHealth() {
        return this.health;
    }

    @Nullable
    public final Integer getHeroLevel() {
        return this.heroLevel;
    }

    @Nullable
    public final Integer getKast() {
        return this.kast;
    }

    @Nullable
    public final Integer getKdDiff() {
        return this.kdDiff;
    }

    @Nullable
    public final Integer getKills() {
        return this.kills;
    }

    @Nullable
    public final Integer getLastHits() {
        return this.lastHits;
    }

    @Nullable
    public final Integer getLevel() {
        return this.level;
    }

    @Nullable
    public final Integer getMinionsKilled() {
        return this.minionsKilled;
    }

    @Nullable
    public final Integer getNetWorth() {
        return this.netWorth;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final String getRole() {
        return this.role;
    }

    @Nullable
    public final Integer getXpPerMin() {
        return this.xpPerMin;
    }

    public int hashCode() {
        Integer num = this.assists;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.deaths;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.goldEarned;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.health;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.kills;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.level;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.minionsKilled;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool = this.alive;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num8 = this.denies;
        int hashCode9 = (hashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.goldPerMin;
        int hashCode10 = (hashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.heroLevel;
        int hashCode11 = (hashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.lastHits;
        int hashCode12 = (hashCode11 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.netWorth;
        int hashCode13 = (hashCode12 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.xpPerMin;
        int hashCode14 = (hashCode13 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Double d = this.adr;
        int hashCode15 = (hashCode14 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num14 = this.firstKillsDiff;
        int hashCode16 = (hashCode15 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.flashAssists;
        int hashCode17 = (hashCode16 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.headshots;
        int hashCode18 = (hashCode17 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.kdDiff;
        int hashCode19 = (hashCode18 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.kast;
        int hashCode20 = (hashCode19 + (num18 == null ? 0 : num18.hashCode())) * 31;
        ESportCharacter eSportCharacter = this.character;
        int hashCode21 = (hashCode20 + (eSportCharacter == null ? 0 : eSportCharacter.hashCode())) * 31;
        String str = this.role;
        return this.player.hashCode() + ((hashCode21 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        Integer num = this.assists;
        Integer num2 = this.deaths;
        Integer num3 = this.goldEarned;
        Integer num4 = this.health;
        Integer num5 = this.kills;
        Integer num6 = this.level;
        Integer num7 = this.minionsKilled;
        Boolean bool = this.alive;
        Integer num8 = this.denies;
        Integer num9 = this.goldPerMin;
        Integer num10 = this.heroLevel;
        Integer num11 = this.lastHits;
        Integer num12 = this.netWorth;
        Integer num13 = this.xpPerMin;
        Double d = this.adr;
        Integer num14 = this.firstKillsDiff;
        Integer num15 = this.flashAssists;
        Integer num16 = this.headshots;
        Integer num17 = this.kdDiff;
        Integer num18 = this.kast;
        ESportCharacter eSportCharacter = this.character;
        String str = this.role;
        Player player = this.player;
        StringBuilder k = wv8.k(num, "ESportsGamePlayerStatistics(assists=", ", deaths=", ", goldEarned=", num2);
        vxd.r(num3, num4, ", health=", ", kills=", k);
        vxd.r(num5, num6, ", level=", ", minionsKilled=", k);
        vxd.v(k, num7, ", alive=", bool, ", denies=");
        vxd.r(num8, num9, ", goldPerMin=", ", heroLevel=", k);
        vxd.r(num10, num11, ", lastHits=", ", netWorth=", k);
        vxd.r(num12, num13, ", xpPerMin=", ", adr=", k);
        mz1.x(d, num14, ", firstKillsDiff=", ", flashAssists=", k);
        vxd.r(num15, num16, ", headshots=", ", kdDiff=", k);
        vxd.r(num17, num18, ", kast=", ", character=", k);
        k.append(eSportCharacter);
        k.append(", role=");
        k.append(str);
        k.append(", player=");
        k.append(player);
        k.append(")");
        return k.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ESportsGamePlayerStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ESportsGamePlayerStatistics(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Boolean bool, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Double d, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable ESportCharacter eSportCharacter, @Nullable String str, @NotNull Player player) {
        player.getClass();
        this.assists = num;
        this.deaths = num2;
        this.goldEarned = num3;
        this.health = num4;
        this.kills = num5;
        this.level = num6;
        this.minionsKilled = num7;
        this.alive = bool;
        this.denies = num8;
        this.goldPerMin = num9;
        this.heroLevel = num10;
        this.lastHits = num11;
        this.netWorth = num12;
        this.xpPerMin = num13;
        this.adr = d;
        this.firstKillsDiff = num14;
        this.flashAssists = num15;
        this.headshots = num16;
        this.kdDiff = num17;
        this.kast = num18;
        this.character = eSportCharacter;
        this.role = str;
        this.player = player;
    }
}
