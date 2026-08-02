package com.sofascore.model.newNetwork.topperformance.topPlayers.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002YXB¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017BÃ\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010#J\u0012\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b.\u0010#J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001fJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001fJØ\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b3\u0010!J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010\u001dJ\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109J'\u0010B\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bK\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bL\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bM\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bN\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bO\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bP\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bQ\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bR\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bS\u0010\u001fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bT\u0010\u001fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bU\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bV\u0010\u001fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bW\u0010\u001f¨\u0006Z"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/AmericanFootballTopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseTopPlayersStatisticsItem;", "", "id", "appearances", "", "type", "", CampaignEx.JSON_KEY_STAR, "passingTouchdowns", "rushingTouchdowns", "receivingTouchdowns", "passingCompletionPercentage", "passingCompletions", "passingTouchdownInterceptionRatio", "rushingYardsPerAttempt", "receivingYardsPerReception", "defensiveInterceptions", "defensiveTotalTackles", "defensiveSacks", "kickingFgMade", "kickingFgAttempts", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/AmericanFootballTopPlayersStatisticsItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/AmericanFootballTopPlayersStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/String;", "getType", "Ljava/lang/Double;", "getRating", "getPassingTouchdowns", "getRushingTouchdowns", "getReceivingTouchdowns", "getPassingCompletionPercentage", "getPassingCompletions", "getPassingTouchdownInterceptionRatio", "getRushingYardsPerAttempt", "getReceivingYardsPerReception", "getDefensiveInterceptions", "getDefensiveTotalTackles", "getDefensiveSacks", "getKickingFgMade", "getKickingFgAttempts", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AmericanFootballTopPlayersStatisticsItem extends BaseTopPlayersStatisticsItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Integer defensiveInterceptions;

    @Nullable
    private final Double defensiveSacks;

    @Nullable
    private final Integer defensiveTotalTackles;
    private final int id;

    @Nullable
    private final Integer kickingFgAttempts;

    @Nullable
    private final Integer kickingFgMade;

    @Nullable
    private final Double passingCompletionPercentage;

    @Nullable
    private final Integer passingCompletions;

    @Nullable
    private final Double passingTouchdownInterceptionRatio;

    @Nullable
    private final Integer passingTouchdowns;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer receivingTouchdowns;

    @Nullable
    private final Double receivingYardsPerReception;

    @Nullable
    private final Integer rushingTouchdowns;

    @Nullable
    private final Double rushingYardsPerAttempt;

    @NotNull
    private final String type;

    public /* synthetic */ AmericanFootballTopPlayersStatisticsItem(int i, int i2, Integer num, String str, Double d, Integer num2, Integer num3, Integer num4, Double d2, Integer num5, Double d3, Double d4, Double d5, Integer num6, Integer num7, Double d6, Integer num8, Integer num9, t5h t5hVar) {
        if (131063 != (i & 131063)) {
            oea.z(i, 131063, AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.appearances = num;
        this.type = str;
        if ((i & 8) == 0) {
            this.rating = null;
        } else {
            this.rating = d;
        }
        this.passingTouchdowns = num2;
        this.rushingTouchdowns = num3;
        this.receivingTouchdowns = num4;
        this.passingCompletionPercentage = d2;
        this.passingCompletions = num5;
        this.passingTouchdownInterceptionRatio = d3;
        this.rushingYardsPerAttempt = d4;
        this.receivingYardsPerReception = d5;
        this.defensiveInterceptions = num6;
        this.defensiveTotalTackles = num7;
        this.defensiveSacks = d6;
        this.kickingFgMade = num8;
        this.kickingFgAttempts = num9;
    }

    public static /* synthetic */ AmericanFootballTopPlayersStatisticsItem copy$default(AmericanFootballTopPlayersStatisticsItem americanFootballTopPlayersStatisticsItem, int i, Integer num, String str, Double d, Integer num2, Integer num3, Integer num4, Double d2, Integer num5, Double d3, Double d4, Double d5, Integer num6, Integer num7, Double d6, Integer num8, Integer num9, int i2, Object obj) {
        Integer num10;
        Integer num11;
        int i3;
        AmericanFootballTopPlayersStatisticsItem americanFootballTopPlayersStatisticsItem2;
        Double d7;
        Integer num12;
        String str2;
        Double d8;
        Integer num13;
        Integer num14;
        Integer num15;
        Double d9;
        Integer num16;
        Double d10;
        Double d11;
        Double d12;
        Integer num17;
        Integer num18;
        int i4 = (i2 & 1) != 0 ? americanFootballTopPlayersStatisticsItem.id : i;
        Integer num19 = (i2 & 2) != 0 ? americanFootballTopPlayersStatisticsItem.appearances : num;
        String str3 = (i2 & 4) != 0 ? americanFootballTopPlayersStatisticsItem.type : str;
        Double d13 = (i2 & 8) != 0 ? americanFootballTopPlayersStatisticsItem.rating : d;
        Integer num20 = (i2 & 16) != 0 ? americanFootballTopPlayersStatisticsItem.passingTouchdowns : num2;
        Integer num21 = (i2 & 32) != 0 ? americanFootballTopPlayersStatisticsItem.rushingTouchdowns : num3;
        Integer num22 = (i2 & 64) != 0 ? americanFootballTopPlayersStatisticsItem.receivingTouchdowns : num4;
        Double d14 = (i2 & 128) != 0 ? americanFootballTopPlayersStatisticsItem.passingCompletionPercentage : d2;
        Integer num23 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? americanFootballTopPlayersStatisticsItem.passingCompletions : num5;
        Double d15 = (i2 & 512) != 0 ? americanFootballTopPlayersStatisticsItem.passingTouchdownInterceptionRatio : d3;
        Double d16 = (i2 & 1024) != 0 ? americanFootballTopPlayersStatisticsItem.rushingYardsPerAttempt : d4;
        Double d17 = (i2 & a.o) != 0 ? americanFootballTopPlayersStatisticsItem.receivingYardsPerReception : d5;
        Integer num24 = (i2 & 4096) != 0 ? americanFootballTopPlayersStatisticsItem.defensiveInterceptions : num6;
        Integer num25 = (i2 & 8192) != 0 ? americanFootballTopPlayersStatisticsItem.defensiveTotalTackles : num7;
        int i5 = i4;
        Double d18 = (i2 & 16384) != 0 ? americanFootballTopPlayersStatisticsItem.defensiveSacks : d6;
        Integer num26 = (i2 & 32768) != 0 ? americanFootballTopPlayersStatisticsItem.kickingFgMade : num8;
        if ((i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            num11 = num26;
            num10 = americanFootballTopPlayersStatisticsItem.kickingFgAttempts;
            d7 = d18;
            num12 = num19;
            str2 = str3;
            d8 = d13;
            num13 = num20;
            num14 = num21;
            num15 = num22;
            d9 = d14;
            num16 = num23;
            d10 = d15;
            d11 = d16;
            d12 = d17;
            num17 = num24;
            num18 = num25;
            i3 = i5;
            americanFootballTopPlayersStatisticsItem2 = americanFootballTopPlayersStatisticsItem;
        } else {
            num10 = num9;
            num11 = num26;
            i3 = i5;
            americanFootballTopPlayersStatisticsItem2 = americanFootballTopPlayersStatisticsItem;
            d7 = d18;
            num12 = num19;
            str2 = str3;
            d8 = d13;
            num13 = num20;
            num14 = num21;
            num15 = num22;
            d9 = d14;
            num16 = num23;
            d10 = d15;
            d11 = d16;
            d12 = d17;
            num17 = num24;
            num18 = num25;
        }
        return americanFootballTopPlayersStatisticsItem2.copy(i3, num12, str2, d8, num13, num14, num15, d9, num16, d10, d11, d12, num17, num18, d7, num11, num10);
    }

    public static final /* synthetic */ void write$Self$model_release(AmericanFootballTopPlayersStatisticsItem self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.getAppearances());
        output.y(serialDesc, 2, self.getType());
        if (output.o(serialDesc) || self.getRating() != null) {
            output.h(serialDesc, 3, h75.a, self.getRating());
        }
        output.h(serialDesc, 4, a7aVar, self.passingTouchdowns);
        output.h(serialDesc, 5, a7aVar, self.rushingTouchdowns);
        output.h(serialDesc, 6, a7aVar, self.receivingTouchdowns);
        h75 h75Var = h75.a;
        output.h(serialDesc, 7, h75Var, self.passingCompletionPercentage);
        output.h(serialDesc, 8, a7aVar, self.passingCompletions);
        output.h(serialDesc, 9, h75Var, self.passingTouchdownInterceptionRatio);
        output.h(serialDesc, 10, h75Var, self.rushingYardsPerAttempt);
        output.h(serialDesc, 11, h75Var, self.receivingYardsPerReception);
        output.h(serialDesc, 12, a7aVar, self.defensiveInterceptions);
        output.h(serialDesc, 13, a7aVar, self.defensiveTotalTackles);
        output.h(serialDesc, 14, h75Var, self.defensiveSacks);
        output.h(serialDesc, 15, a7aVar, self.kickingFgMade);
        output.h(serialDesc, 16, a7aVar, self.kickingFgAttempts);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getPassingTouchdownInterceptionRatio() {
        return this.passingTouchdownInterceptionRatio;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Double getRushingYardsPerAttempt() {
        return this.rushingYardsPerAttempt;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getReceivingYardsPerReception() {
        return this.receivingYardsPerReception;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getDefensiveInterceptions() {
        return this.defensiveInterceptions;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getDefensiveTotalTackles() {
        return this.defensiveTotalTackles;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Double getDefensiveSacks() {
        return this.defensiveSacks;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getKickingFgMade() {
        return this.kickingFgMade;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getKickingFgAttempts() {
        return this.kickingFgAttempts;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getPassingTouchdowns() {
        return this.passingTouchdowns;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getRushingTouchdowns() {
        return this.rushingTouchdowns;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getReceivingTouchdowns() {
        return this.receivingTouchdowns;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getPassingCompletionPercentage() {
        return this.passingCompletionPercentage;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getPassingCompletions() {
        return this.passingCompletions;
    }

    @NotNull
    public final AmericanFootballTopPlayersStatisticsItem copy(int id, @Nullable Integer appearances, @NotNull String type, @Nullable Double rating, @Nullable Integer passingTouchdowns, @Nullable Integer rushingTouchdowns, @Nullable Integer receivingTouchdowns, @Nullable Double passingCompletionPercentage, @Nullable Integer passingCompletions, @Nullable Double passingTouchdownInterceptionRatio, @Nullable Double rushingYardsPerAttempt, @Nullable Double receivingYardsPerReception, @Nullable Integer defensiveInterceptions, @Nullable Integer defensiveTotalTackles, @Nullable Double defensiveSacks, @Nullable Integer kickingFgMade, @Nullable Integer kickingFgAttempts) {
        type.getClass();
        return new AmericanFootballTopPlayersStatisticsItem(id, appearances, type, rating, passingTouchdowns, rushingTouchdowns, receivingTouchdowns, passingCompletionPercentage, passingCompletions, passingTouchdownInterceptionRatio, rushingYardsPerAttempt, receivingYardsPerReception, defensiveInterceptions, defensiveTotalTackles, defensiveSacks, kickingFgMade, kickingFgAttempts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmericanFootballTopPlayersStatisticsItem)) {
            return false;
        }
        AmericanFootballTopPlayersStatisticsItem americanFootballTopPlayersStatisticsItem = (AmericanFootballTopPlayersStatisticsItem) other;
        return this.id == americanFootballTopPlayersStatisticsItem.id && Intrinsics.c(this.appearances, americanFootballTopPlayersStatisticsItem.appearances) && Intrinsics.c(this.type, americanFootballTopPlayersStatisticsItem.type) && Intrinsics.c(this.rating, americanFootballTopPlayersStatisticsItem.rating) && Intrinsics.c(this.passingTouchdowns, americanFootballTopPlayersStatisticsItem.passingTouchdowns) && Intrinsics.c(this.rushingTouchdowns, americanFootballTopPlayersStatisticsItem.rushingTouchdowns) && Intrinsics.c(this.receivingTouchdowns, americanFootballTopPlayersStatisticsItem.receivingTouchdowns) && Intrinsics.c(this.passingCompletionPercentage, americanFootballTopPlayersStatisticsItem.passingCompletionPercentage) && Intrinsics.c(this.passingCompletions, americanFootballTopPlayersStatisticsItem.passingCompletions) && Intrinsics.c(this.passingTouchdownInterceptionRatio, americanFootballTopPlayersStatisticsItem.passingTouchdownInterceptionRatio) && Intrinsics.c(this.rushingYardsPerAttempt, americanFootballTopPlayersStatisticsItem.rushingYardsPerAttempt) && Intrinsics.c(this.receivingYardsPerReception, americanFootballTopPlayersStatisticsItem.receivingYardsPerReception) && Intrinsics.c(this.defensiveInterceptions, americanFootballTopPlayersStatisticsItem.defensiveInterceptions) && Intrinsics.c(this.defensiveTotalTackles, americanFootballTopPlayersStatisticsItem.defensiveTotalTackles) && Intrinsics.c(this.defensiveSacks, americanFootballTopPlayersStatisticsItem.defensiveSacks) && Intrinsics.c(this.kickingFgMade, americanFootballTopPlayersStatisticsItem.kickingFgMade) && Intrinsics.c(this.kickingFgAttempts, americanFootballTopPlayersStatisticsItem.kickingFgAttempts);
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @Nullable
    public Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    public final Integer getDefensiveInterceptions() {
        return this.defensiveInterceptions;
    }

    @Nullable
    public final Double getDefensiveSacks() {
        return this.defensiveSacks;
    }

    @Nullable
    public final Integer getDefensiveTotalTackles() {
        return this.defensiveTotalTackles;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getKickingFgAttempts() {
        return this.kickingFgAttempts;
    }

    @Nullable
    public final Integer getKickingFgMade() {
        return this.kickingFgMade;
    }

    @Nullable
    public final Double getPassingCompletionPercentage() {
        return this.passingCompletionPercentage;
    }

    @Nullable
    public final Integer getPassingCompletions() {
        return this.passingCompletions;
    }

    @Nullable
    public final Double getPassingTouchdownInterceptionRatio() {
        return this.passingTouchdownInterceptionRatio;
    }

    @Nullable
    public final Integer getPassingTouchdowns() {
        return this.passingTouchdowns;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getReceivingTouchdowns() {
        return this.receivingTouchdowns;
    }

    @Nullable
    public final Double getReceivingYardsPerReception() {
        return this.receivingYardsPerReception;
    }

    @Nullable
    public final Integer getRushingTouchdowns() {
        return this.rushingTouchdowns;
    }

    @Nullable
    public final Double getRushingYardsPerAttempt() {
        return this.rushingYardsPerAttempt;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @NotNull
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.appearances;
        int c = dmi.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.type);
        Double d = this.rating;
        int hashCode2 = (c + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.passingTouchdowns;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rushingTouchdowns;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.receivingTouchdowns;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d2 = this.passingCompletionPercentage;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num5 = this.passingCompletions;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d3 = this.passingTouchdownInterceptionRatio;
        int hashCode8 = (hashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.rushingYardsPerAttempt;
        int hashCode9 = (hashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.receivingYardsPerReception;
        int hashCode10 = (hashCode9 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num6 = this.defensiveInterceptions;
        int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.defensiveTotalTackles;
        int hashCode12 = (hashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Double d6 = this.defensiveSacks;
        int hashCode13 = (hashCode12 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num8 = this.kickingFgMade;
        int hashCode14 = (hashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.kickingFgAttempts;
        return hashCode14 + (num9 != null ? num9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Integer num = this.appearances;
        String str = this.type;
        Double d = this.rating;
        Integer num2 = this.passingTouchdowns;
        Integer num3 = this.rushingTouchdowns;
        Integer num4 = this.receivingTouchdowns;
        Double d2 = this.passingCompletionPercentage;
        Integer num5 = this.passingCompletions;
        Double d3 = this.passingTouchdownInterceptionRatio;
        Double d4 = this.rushingYardsPerAttempt;
        Double d5 = this.receivingYardsPerReception;
        Integer num6 = this.defensiveInterceptions;
        Integer num7 = this.defensiveTotalTackles;
        Double d6 = this.defensiveSacks;
        Integer num8 = this.kickingFgMade;
        Integer num9 = this.kickingFgAttempts;
        StringBuilder r = fc6.r("AmericanFootballTopPlayersStatisticsItem(id=", ", appearances=", ", type=", num, i);
        r.append(str);
        r.append(", rating=");
        r.append(d);
        r.append(", passingTouchdowns=");
        vxd.r(num2, num3, ", rushingTouchdowns=", ", receivingTouchdowns=", r);
        fn0.v(d2, num4, ", passingCompletionPercentage=", ", passingCompletions=", r);
        fn0.v(d3, num5, ", passingTouchdownInterceptionRatio=", ", rushingYardsPerAttempt=", r);
        fc6.A(r, d4, ", receivingYardsPerReception=", d5, ", defensiveInterceptions=");
        vxd.r(num6, num7, ", defensiveTotalTackles=", ", defensiveSacks=", r);
        mz1.x(d6, num8, ", kickingFgMade=", ", kickingFgAttempts=", r);
        return vxd.n(r, num9, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/AmericanFootballTopPlayersStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/AmericanFootballTopPlayersStatisticsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AmericanFootballTopPlayersStatisticsItem(int i, @Nullable Integer num, @NotNull String str, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Double d2, @Nullable Integer num5, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Double d6, @Nullable Integer num8, @Nullable Integer num9) {
        str.getClass();
        this.id = i;
        this.appearances = num;
        this.type = str;
        this.rating = d;
        this.passingTouchdowns = num2;
        this.rushingTouchdowns = num3;
        this.receivingTouchdowns = num4;
        this.passingCompletionPercentage = d2;
        this.passingCompletions = num5;
        this.passingTouchdownInterceptionRatio = d3;
        this.rushingYardsPerAttempt = d4;
        this.receivingYardsPerReception = d5;
        this.defensiveInterceptions = num6;
        this.defensiveTotalTackles = num7;
        this.defensiveSacks = d6;
        this.kickingFgMade = num8;
        this.kickingFgAttempts = num9;
    }

    public /* synthetic */ AmericanFootballTopPlayersStatisticsItem(int i, Integer num, String str, Double d, Integer num2, Integer num3, Integer num4, Double d2, Integer num5, Double d3, Double d4, Double d5, Integer num6, Integer num7, Double d6, Integer num8, Integer num9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, str, (i2 & 8) != 0 ? null : d, num2, num3, num4, d2, num5, d3, d4, d5, num6, num7, d6, num8, num9);
    }
}
