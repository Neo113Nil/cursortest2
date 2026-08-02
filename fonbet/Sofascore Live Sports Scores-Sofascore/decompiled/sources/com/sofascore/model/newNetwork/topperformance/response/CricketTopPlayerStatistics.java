package com.sofascore.model.newNetwork.topperformance.response;

import com.sofascore.model.newNetwork.topperformance.topPlayers.items.CricketTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.CricketTopPlayersStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import defpackage.fc6;
import defpackage.g14;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.t63;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QPBÑ\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015Bå\u0002\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u001e\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u001e\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u001e\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u001e\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u001e\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u001e\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u001e\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u001e\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u001e\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u001e\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u001e\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u001e\u0010(\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u001e\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u001e\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001cJø\u0002\u0010+\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010\u001cR%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bB\u0010\u001cR%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bC\u0010\u001cR%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bD\u0010\u001cR%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bE\u0010\u001cR%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bF\u0010\u001cR%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bG\u0010\u001cR%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bH\u0010\u001cR%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bI\u0010\u001cR%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bJ\u0010\u001cR%\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bK\u0010\u001cR%\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bL\u0010\u001cR%\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bM\u0010\u001cR%\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bN\u0010\u001cR%\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bO\u0010\u001c¨\u0006R"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/CricketTopPlayerStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/CricketTopPlayersStatisticsItem;", "runsScored", "highestScore", "battingAverage", "battingStrikeRate", "hundreds", "fifties", "sixes", "fours", "nineties", "wickets", "bowlingAverage", "bowling", "fiveWicketsHaul", "economy", "bowlingStrikeRate", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/CricketTopPlayerStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/CricketTopPlayerStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getRunsScored", "getHighestScore", "getBattingAverage", "getBattingStrikeRate", "getHundreds", "getFifties", "getSixes", "getFours", "getNineties", "getWickets", "getBowlingAverage", "getBowling", "getFiveWicketsHaul", "getEconomy", "getBowlingStrikeRate", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CricketTopPlayerStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> battingAverage;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> battingStrikeRate;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> bowling;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> bowlingAverage;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> bowlingStrikeRate;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> economy;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> fifties;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> fiveWicketsHaul;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> fours;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> highestScore;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> hundreds;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> nineties;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> runsScored;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> sixes;

    @Nullable
    private final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> wickets;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new t63(28)), ypa.a(ysaVar, new g14(9)), ypa.a(ysaVar, new g14(10)), ypa.a(ysaVar, new g14(11)), ypa.a(ysaVar, new g14(12)), ypa.a(ysaVar, new t63(29)), ypa.a(ysaVar, new g14(0)), ypa.a(ysaVar, new g14(1)), ypa.a(ysaVar, new g14(2)), ypa.a(ysaVar, new g14(3)), ypa.a(ysaVar, new g14(4)), ypa.a(ysaVar, new g14(5)), ypa.a(ysaVar, new g14(6)), ypa.a(ysaVar, new g14(7)), ypa.a(ysaVar, new g14(8))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CricketTopPlayerStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, t5h t5hVar) {
        super(i, t5hVar);
        if (32767 != (i & 32767)) {
            oea.z(i, 32767, CricketTopPlayerStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.runsScored = list;
        this.highestScore = list2;
        this.battingAverage = list3;
        this.battingStrikeRate = list4;
        this.hundreds = list5;
        this.fifties = list6;
        this.sixes = list7;
        this.fours = list8;
        this.nineties = list9;
        this.wickets = list10;
        this.bowlingAverage = list11;
        this.bowling = list12;
        this.fiveWicketsHaul = list13;
        this.economy = list14;
        this.bowlingStrikeRate = list15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$13() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(CricketTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static final /* synthetic */ void write$Self$model_release(CricketTopPlayerStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.runsScored);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.highestScore);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.battingAverage);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.battingStrikeRate);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.hundreds);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.fifties);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.sixes);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.fours);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.nineties);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.wickets);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.bowlingAverage);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.bowling);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.fiveWicketsHaul);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.economy);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.bowlingStrikeRate);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component1() {
        return this.runsScored;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component10() {
        return this.wickets;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component11() {
        return this.bowlingAverage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component12() {
        return this.bowling;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component13() {
        return this.fiveWicketsHaul;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component14() {
        return this.economy;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component15() {
        return this.bowlingStrikeRate;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component2() {
        return this.highestScore;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component3() {
        return this.battingAverage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component4() {
        return this.battingStrikeRate;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component5() {
        return this.hundreds;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component6() {
        return this.fifties;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component7() {
        return this.sixes;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component8() {
        return this.fours;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> component9() {
        return this.nineties;
    }

    @NotNull
    public final CricketTopPlayerStatistics copy(@Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> runsScored, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> highestScore, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> battingAverage, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> battingStrikeRate, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> hundreds, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> fifties, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> sixes, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> fours, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> nineties, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> wickets, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> bowlingAverage, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> bowling, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> fiveWicketsHaul, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> economy, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> bowlingStrikeRate) {
        return new CricketTopPlayerStatistics(runsScored, highestScore, battingAverage, battingStrikeRate, hundreds, fifties, sixes, fours, nineties, wickets, bowlingAverage, bowling, fiveWicketsHaul, economy, bowlingStrikeRate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CricketTopPlayerStatistics)) {
            return false;
        }
        CricketTopPlayerStatistics cricketTopPlayerStatistics = (CricketTopPlayerStatistics) other;
        return Intrinsics.c(this.runsScored, cricketTopPlayerStatistics.runsScored) && Intrinsics.c(this.highestScore, cricketTopPlayerStatistics.highestScore) && Intrinsics.c(this.battingAverage, cricketTopPlayerStatistics.battingAverage) && Intrinsics.c(this.battingStrikeRate, cricketTopPlayerStatistics.battingStrikeRate) && Intrinsics.c(this.hundreds, cricketTopPlayerStatistics.hundreds) && Intrinsics.c(this.fifties, cricketTopPlayerStatistics.fifties) && Intrinsics.c(this.sixes, cricketTopPlayerStatistics.sixes) && Intrinsics.c(this.fours, cricketTopPlayerStatistics.fours) && Intrinsics.c(this.nineties, cricketTopPlayerStatistics.nineties) && Intrinsics.c(this.wickets, cricketTopPlayerStatistics.wickets) && Intrinsics.c(this.bowlingAverage, cricketTopPlayerStatistics.bowlingAverage) && Intrinsics.c(this.bowling, cricketTopPlayerStatistics.bowling) && Intrinsics.c(this.fiveWicketsHaul, cricketTopPlayerStatistics.fiveWicketsHaul) && Intrinsics.c(this.economy, cricketTopPlayerStatistics.economy) && Intrinsics.c(this.bowlingStrikeRate, cricketTopPlayerStatistics.bowlingStrikeRate);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getBattingAverage() {
        return this.battingAverage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getBattingStrikeRate() {
        return this.battingStrikeRate;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getBowling() {
        return this.bowling;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getBowlingAverage() {
        return this.bowlingAverage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getBowlingStrikeRate() {
        return this.bowlingStrikeRate;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getEconomy() {
        return this.economy;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getFifties() {
        return this.fifties;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getFiveWicketsHaul() {
        return this.fiveWicketsHaul;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getFours() {
        return this.fours;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getHighestScore() {
        return this.highestScore;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getHundreds() {
        return this.hundreds;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getNineties() {
        return this.nineties;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getRunsScored() {
        return this.runsScored;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getSixes() {
        return this.sixes;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> getWickets() {
        return this.wickets;
    }

    public int hashCode() {
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list = this.runsScored;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list2 = this.highestScore;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list3 = this.battingAverage;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list4 = this.battingStrikeRate;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list5 = this.hundreds;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list6 = this.fifties;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list7 = this.sixes;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list8 = this.fours;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list9 = this.nineties;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list10 = this.wickets;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list11 = this.bowlingAverage;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list12 = this.bowling;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list13 = this.fiveWicketsHaul;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list14 = this.economy;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list15 = this.bowlingStrikeRate;
        return hashCode14 + (list15 != null ? list15.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list = this.runsScored;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list2 = this.highestScore;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list3 = this.battingAverage;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list4 = this.battingStrikeRate;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list5 = this.hundreds;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list6 = this.fifties;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list7 = this.sixes;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list8 = this.fours;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list9 = this.nineties;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list10 = this.wickets;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list11 = this.bowlingAverage;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list12 = this.bowling;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list13 = this.fiveWicketsHaul;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list14 = this.economy;
        List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list15 = this.bowlingStrikeRate;
        StringBuilder s = fc6.s("CricketTopPlayerStatistics(runsScored=", ", highestScore=", ", battingAverage=", list, list2);
        vxd.w(s, list3, ", battingStrikeRate=", list4, ", hundreds=");
        vxd.w(s, list5, ", fifties=", list6, ", sixes=");
        vxd.w(s, list7, ", fours=", list8, ", nineties=");
        vxd.w(s, list9, ", wickets=", list10, ", bowlingAverage=");
        vxd.w(s, list11, ", bowling=", list12, ", fiveWicketsHaul=");
        vxd.w(s, list13, ", economy=", list14, ", bowlingStrikeRate=");
        return mz1.p(s, list15, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/CricketTopPlayerStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/CricketTopPlayerStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CricketTopPlayerStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CricketTopPlayerStatistics(@Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list2, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list3, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list4, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list5, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list6, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list7, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list8, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list9, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list10, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list11, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list12, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list13, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list14, @Nullable List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> list15) {
        super(null);
        this.runsScored = list;
        this.highestScore = list2;
        this.battingAverage = list3;
        this.battingStrikeRate = list4;
        this.hundreds = list5;
        this.fifties = list6;
        this.sixes = list7;
        this.fours = list8;
        this.nineties = list9;
        this.wickets = list10;
        this.bowlingAverage = list11;
        this.bowling = list12;
        this.fiveWicketsHaul = list13;
        this.economy = list14;
        this.bowlingStrikeRate = list15;
    }
}
