package com.sofascore.model.newNetwork.hockeyplaybyplay;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Point2D$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.BaseHockeyShotmapItem;
import com.sofascore.model.newNetwork.HockeyShotmapItem;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.ljg;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.wzb;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u0099\u00012\u00020\u0001:\u0004\u009a\u0001\u0099\u0001Bå\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$B\u0085\u0002\b\u0010\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010&\u001a\u00020\u000b\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b#\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b*\u0010+J%\u00100\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0004¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b6\u00103J\u0010\u00107\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b;\u00103J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b>\u00105J\u0012\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bA\u0010@J\u0012\u0010B\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bB\u0010@J\u0012\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bC\u0010@J\u0012\u0010D\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bD\u0010@J\u0012\u0010E\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bE\u0010@J\u0012\u0010F\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bF\u0010@J\u0012\u0010G\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bG\u0010@J\u0012\u0010H\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u009c\u0002\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0001¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bR\u00103J\u0010\u0010S\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bS\u00105J\u001a\u0010U\u001a\u00020\u000b2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bU\u0010VJ#\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020X0.2\u0006\u0010W\u001a\u00020\u0019H\u0002¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\u000bHÂ\u0003¢\u0006\u0004\b[\u0010+J\u0012\u0010\\\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\\\u0010=J\u0012\u0010]\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b]\u0010=J\u0012\u0010^\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b^\u0010=J'\u0010g\u001a\u00020d2\u0006\u0010_\u001a\u00020\u00002\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020bH\u0001¢\u0006\u0004\be\u0010fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010h\u001a\u0004\bi\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010j\u001a\u0004\bk\u00103R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010l\u001a\u0004\bm\u00108R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010n\u001a\u0004\bo\u0010:R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010j\u001a\u0004\bp\u00103R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010qR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010r\u001a\u0004\bs\u0010=R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010h\u001a\u0004\bt\u00105R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010u\u001a\u0004\bv\u0010@R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010u\u001a\u0004\bw\u0010@R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010u\u001a\u0004\bx\u0010@R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010u\u001a\u0004\by\u0010@R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010u\u001a\u0004\bz\u0010@R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010u\u001a\u0004\b{\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010u\u001a\u0004\b|\u0010@R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u0010u\u001a\u0004\b}\u0010@R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010~\u001a\u0004\b\u007f\u0010IR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010rR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010rR&\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001e\u0010\u0080\u0001\u0012\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\b\u0081\u0001\u0010KR&\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b \u0010\u0084\u0001\u0012\u0006\b\u0086\u0001\u0010\u0083\u0001\u001a\u0005\b\u0085\u0001\u0010MR&\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\"\u0010\u0087\u0001\u0012\u0006\b\u0089\u0001\u0010\u0083\u0001\u001a\u0005\b\u0088\u0001\u0010OR'\u0010&\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b&\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0015\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010=R\u0017\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0091\u00018F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0095\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u009b\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncident;", "", "", "id", "", "text", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncidentType;", "type", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyGoalType;", "goalType", "periodName", "", "isHome", "time", "reversedPeriodTimeSeconds", IronSourceConstants.EVENTS_DURATION, "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "penalizedPlayer", "penaltyServedByPlayer", "playerIn", "penaltyDrawnByPlayer", Incident.GoalIncident.TYPE_GOALKEEPER, "assist1", "assist2", "Lcom/sofascore/model/mvvm/model/Point2D;", "location", "homeScore", "awayScore", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyFaceOffZone;", "faceoffZone", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyPlayType;", "playType", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeySuspension;", "suspensionInfo", "<init>", "(ILjava/lang/String;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncidentType;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyGoalType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Point2D;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyFaceOffZone;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyPlayType;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeySuspension;)V", "seen0", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncidentType;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyGoalType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Point2D;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyFaceOffZone;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyPlayType;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeySuspension;ZLt5h;)V", "getIsHome", "()Ljava/lang/Boolean;", "Lcom/sofascore/model/mvvm/model/Event;", "event", "Lkotlin/Pair;", "Lcom/sofascore/model/mvvm/model/Team;", "getTeams", "(Lcom/sofascore/model/mvvm/model/Event;)Lkotlin/Pair;", "getScoreDisplay", "()Ljava/lang/String;", "component1", "()I", "component2", "component3", "()Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncidentType;", "component4", "()Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyGoalType;", "component5", "component7", "()Ljava/lang/Integer;", "component8", "component10", "()Lcom/sofascore/model/mvvm/model/Player;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "()Lcom/sofascore/model/mvvm/model/Point2D;", "component21", "()Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyFaceOffZone;", "component22", "()Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyPlayType;", "component23", "()Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeySuspension;", "copy", "(ILjava/lang/String;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncidentType;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyGoalType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Point2D;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyFaceOffZone;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyPlayType;Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeySuspension;)Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncident;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "point", "", "mapFaceOffPoint", "(Lcom/sofascore/model/mvvm/model/Point2D;)Lkotlin/Pair;", "component6", "component9", "component19", "component20", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncident;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getText", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncidentType;", "getType", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyGoalType;", "getGoalType", "getPeriodName", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getTime", "getReversedPeriodTimeSeconds", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "getPenalizedPlayer", "getPenaltyServedByPlayer", "getPlayerIn", "getPenaltyDrawnByPlayer", "getGoalkeeper", "getAssist1", "getAssist2", "Lcom/sofascore/model/mvvm/model/Point2D;", "getLocation", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyFaceOffZone;", "getFaceoffZone", "getFaceoffZone$annotations", "()V", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyPlayType;", "getPlayType", "getPlayType$annotations", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeySuspension;", "getSuspensionInfo", "getSuspensionInfo$annotations", "Z", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "getPenaltyDuration", "penaltyDuration", "Lcom/sofascore/model/newNetwork/HockeyShotmapItem;", "getEventMapItem", "()Lcom/sofascore/model/newNetwork/HockeyShotmapItem;", "eventMapItem", "Lcom/sofascore/model/newNetwork/BaseHockeyShotmapItem$ShotmapItemType;", "getEventMapIncidentType", "()Lcom/sofascore/model/newNetwork/BaseHockeyShotmapItem$ShotmapItemType;", "eventMapIncidentType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HockeyIncident {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Player assist1;

    @Nullable
    private final Player assist2;

    @Nullable
    private final Integer awayScore;

    @Nullable
    private final Integer duration;

    @Nullable
    private final HockeyFaceOffZone faceoffZone;

    @Nullable
    private final HockeyGoalType goalType;

    @Nullable
    private final Player goalkeeper;

    @Nullable
    private final Integer homeScore;
    private final int id;

    @Nullable
    private final Boolean isHome;

    @Nullable
    private final Point2D location;

    @Nullable
    private final Player penalizedPlayer;

    @Nullable
    private final Player penaltyDrawnByPlayer;

    @Nullable
    private final Player penaltyServedByPlayer;

    @Nullable
    private final String periodName;

    @Nullable
    private final HockeyPlayType playType;

    @Nullable
    private final Player player;

    @Nullable
    private final Player playerIn;
    private final int reversedPeriodTimeSeconds;
    private boolean shouldReverseTeams;

    @Nullable
    private final HockeySuspension suspensionInfo;

    @NotNull
    private final String text;

    @Nullable
    private final Integer time;

    @NotNull
    private final HockeyIncidentType type;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HockeyIncidentType.values().length];
            try {
                iArr[HockeyIncidentType.GOAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HockeyIncidentType.PENALTY_SCORED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HockeyIncidentType.SHOT_SAVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HockeyIncidentType.PENALTY_SAVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HockeyIncidentType.SHOT_MISSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HockeyIncidentType.PENALTY_MISSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HockeyIncidentType.SHOT_BLOCKED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HockeyIncidentType.FACEOFF.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HockeyIncidentType.SUSPENSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HockeyIncidentType.HIT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ HockeyIncident(int i, int i2, String str, HockeyIncidentType hockeyIncidentType, HockeyGoalType hockeyGoalType, String str2, Boolean bool, Integer num, int i3, Integer num2, Player player, Player player2, Player player3, Player player4, Player player5, Player player6, Player player7, Player player8, Point2D point2D, Integer num3, Integer num4, HockeyFaceOffZone hockeyFaceOffZone, HockeyPlayType hockeyPlayType, HockeySuspension hockeySuspension, boolean z, t5h t5hVar) {
        if (8388607 != (i & 8388607)) {
            oea.z(i, 8388607, HockeyIncident$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.text = str;
        this.type = hockeyIncidentType;
        this.goalType = hockeyGoalType;
        this.periodName = str2;
        this.isHome = bool;
        this.time = num;
        this.reversedPeriodTimeSeconds = i3;
        this.duration = num2;
        this.player = player;
        this.penalizedPlayer = player2;
        this.penaltyServedByPlayer = player3;
        this.playerIn = player4;
        this.penaltyDrawnByPlayer = player5;
        this.goalkeeper = player6;
        this.assist1 = player7;
        this.assist2 = player8;
        this.location = point2D;
        this.homeScore = num3;
        this.awayScore = num4;
        this.faceoffZone = hockeyFaceOffZone;
        this.playType = hockeyPlayType;
        this.suspensionInfo = hockeySuspension;
        this.shouldReverseTeams = (i & 8388608) == 0 ? false : z;
    }

    /* renamed from: component19, reason: from getter */
    private final Integer getHomeScore() {
        return this.homeScore;
    }

    /* renamed from: component20, reason: from getter */
    private final Integer getAwayScore() {
        return this.awayScore;
    }

    /* renamed from: component6, reason: from getter */
    private final Boolean getIsHome() {
        return this.isHome;
    }

    /* renamed from: component9, reason: from getter */
    private final Integer getDuration() {
        return this.duration;
    }

    public static /* synthetic */ HockeyIncident copy$default(HockeyIncident hockeyIncident, int i, String str, HockeyIncidentType hockeyIncidentType, HockeyGoalType hockeyGoalType, String str2, Boolean bool, Integer num, int i2, Integer num2, Player player, Player player2, Player player3, Player player4, Player player5, Player player6, Player player7, Player player8, Point2D point2D, Integer num3, Integer num4, HockeyFaceOffZone hockeyFaceOffZone, HockeyPlayType hockeyPlayType, HockeySuspension hockeySuspension, int i3, Object obj) {
        HockeySuspension hockeySuspension2;
        HockeyPlayType hockeyPlayType2;
        int i4 = (i3 & 1) != 0 ? hockeyIncident.id : i;
        String str3 = (i3 & 2) != 0 ? hockeyIncident.text : str;
        HockeyIncidentType hockeyIncidentType2 = (i3 & 4) != 0 ? hockeyIncident.type : hockeyIncidentType;
        HockeyGoalType hockeyGoalType2 = (i3 & 8) != 0 ? hockeyIncident.goalType : hockeyGoalType;
        String str4 = (i3 & 16) != 0 ? hockeyIncident.periodName : str2;
        Boolean bool2 = (i3 & 32) != 0 ? hockeyIncident.isHome : bool;
        Integer num5 = (i3 & 64) != 0 ? hockeyIncident.time : num;
        int i5 = (i3 & 128) != 0 ? hockeyIncident.reversedPeriodTimeSeconds : i2;
        Integer num6 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? hockeyIncident.duration : num2;
        Player player9 = (i3 & 512) != 0 ? hockeyIncident.player : player;
        Player player10 = (i3 & 1024) != 0 ? hockeyIncident.penalizedPlayer : player2;
        Player player11 = (i3 & a.o) != 0 ? hockeyIncident.penaltyServedByPlayer : player3;
        Player player12 = (i3 & 4096) != 0 ? hockeyIncident.playerIn : player4;
        Player player13 = (i3 & 8192) != 0 ? hockeyIncident.penaltyDrawnByPlayer : player5;
        int i6 = i4;
        Player player14 = (i3 & 16384) != 0 ? hockeyIncident.goalkeeper : player6;
        Player player15 = (i3 & 32768) != 0 ? hockeyIncident.assist1 : player7;
        Player player16 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? hockeyIncident.assist2 : player8;
        Point2D point2D2 = (i3 & 131072) != 0 ? hockeyIncident.location : point2D;
        Integer num7 = (i3 & 262144) != 0 ? hockeyIncident.homeScore : num3;
        Integer num8 = (i3 & 524288) != 0 ? hockeyIncident.awayScore : num4;
        HockeyFaceOffZone hockeyFaceOffZone2 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? hockeyIncident.faceoffZone : hockeyFaceOffZone;
        HockeyPlayType hockeyPlayType3 = (i3 & 2097152) != 0 ? hockeyIncident.playType : hockeyPlayType;
        if ((i3 & 4194304) != 0) {
            hockeyPlayType2 = hockeyPlayType3;
            hockeySuspension2 = hockeyIncident.suspensionInfo;
        } else {
            hockeySuspension2 = hockeySuspension;
            hockeyPlayType2 = hockeyPlayType3;
        }
        return hockeyIncident.copy(i6, str3, hockeyIncidentType2, hockeyGoalType2, str4, bool2, num5, i5, num6, player9, player10, player11, player12, player13, player14, player15, player16, point2D2, num7, num8, hockeyFaceOffZone2, hockeyPlayType2, hockeySuspension2);
    }

    private final BaseHockeyShotmapItem.ShotmapItemType getEventMapIncidentType() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1:
            case 2:
                return BaseHockeyShotmapItem.ShotmapItemType.GOAL;
            case 3:
            case 4:
                return BaseHockeyShotmapItem.ShotmapItemType.SAVED_SHOT;
            case 5:
            case 6:
                return BaseHockeyShotmapItem.ShotmapItemType.MISSED_SHOT;
            case 7:
                return BaseHockeyShotmapItem.ShotmapItemType.BLOCKED_SHOT;
            case 8:
                return BaseHockeyShotmapItem.ShotmapItemType.FACEOFF;
            case 9:
                return BaseHockeyShotmapItem.ShotmapItemType.SUSPENSION;
            case 10:
                return BaseHockeyShotmapItem.ShotmapItemType.HIT;
            default:
                return null;
        }
    }

    private final Pair<Float, Float> mapFaceOffPoint(Point2D point) {
        Float valueOf = Float.valueOf(93.6f);
        Float valueOf2 = Float.valueOf(146.4f);
        Float valueOf3 = Float.valueOf(202.6f);
        Float valueOf4 = Float.valueOf(38.0f);
        Float valueOf5 = Float.valueOf(77.5f);
        Float valueOf6 = Float.valueOf(24.5f);
        Integer valueOf7 = Integer.valueOf(wzb.b(point.getX()));
        Integer valueOf8 = Integer.valueOf(wzb.b(point.getY()));
        int intValue = valueOf7.intValue();
        int intValue2 = valueOf8.intValue();
        return (intValue == 119 && intValue2 == 50) ? new Pair<>(Float.valueOf(120.0f), Float.valueOf(51.0f)) : (intValue == 36 && intValue2 == 24) ? new Pair<>(valueOf4, valueOf6) : (intValue == 202 && intValue2 == 24) ? new Pair<>(valueOf3, valueOf6) : (intValue == 36 && intValue2 == 77) ? new Pair<>(valueOf4, valueOf5) : (intValue == 202 && intValue2 == 77) ? new Pair<>(valueOf3, valueOf5) : (intValue == 143 && intValue2 == 24) ? new Pair<>(valueOf2, valueOf6) : (intValue == 95 && intValue2 == 24) ? new Pair<>(valueOf, valueOf6) : (intValue == 143 && intValue2 == 77) ? new Pair<>(valueOf2, valueOf5) : (intValue == 95 && intValue2 == 77) ? new Pair<>(valueOf, valueOf5) : new Pair<>(Float.valueOf(intValue), Float.valueOf(intValue2));
    }

    public static final /* synthetic */ void write$Self$model_release(HockeyIncident self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.text);
        output.f(serialDesc, 2, HockeyIncidentTypeSerializer.INSTANCE, self.type);
        output.h(serialDesc, 3, HockeyGoalTypeSerializer.INSTANCE, self.goalType);
        output.h(serialDesc, 4, uhi.a, self.periodName);
        output.h(serialDesc, 5, gz1.a, self.isHome);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 6, a7aVar, self.time);
        output.u(7, self.reversedPeriodTimeSeconds, serialDesc);
        output.h(serialDesc, 8, a7aVar, self.duration);
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        output.h(serialDesc, 9, player$$serializer, self.player);
        output.h(serialDesc, 10, player$$serializer, self.penalizedPlayer);
        output.h(serialDesc, 11, player$$serializer, self.penaltyServedByPlayer);
        output.h(serialDesc, 12, player$$serializer, self.playerIn);
        output.h(serialDesc, 13, player$$serializer, self.penaltyDrawnByPlayer);
        output.h(serialDesc, 14, player$$serializer, self.goalkeeper);
        output.h(serialDesc, 15, player$$serializer, self.assist1);
        output.h(serialDesc, 16, player$$serializer, self.assist2);
        output.h(serialDesc, 17, Point2D$$serializer.INSTANCE, self.location);
        output.h(serialDesc, 18, a7aVar, self.homeScore);
        output.h(serialDesc, 19, a7aVar, self.awayScore);
        output.h(serialDesc, 20, HockeyFaceOffZoneSerializer.INSTANCE, self.faceoffZone);
        output.h(serialDesc, 21, HockeyPlayTypeSerializer.INSTANCE, self.playType);
        output.h(serialDesc, 22, HockeySuspension$$serializer.INSTANCE, self.suspensionInfo);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 23, self.shouldReverseTeams);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Player getPenalizedPlayer() {
        return this.penalizedPlayer;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Player getPenaltyServedByPlayer() {
        return this.penaltyServedByPlayer;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Player getPlayerIn() {
        return this.playerIn;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Player getPenaltyDrawnByPlayer() {
        return this.penaltyDrawnByPlayer;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Player getGoalkeeper() {
        return this.goalkeeper;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Player getAssist1() {
        return this.assist1;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Player getAssist2() {
        return this.assist2;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Point2D getLocation() {
        return this.location;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final HockeyFaceOffZone getFaceoffZone() {
        return this.faceoffZone;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final HockeyPlayType getPlayType() {
        return this.playType;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final HockeySuspension getSuspensionInfo() {
        return this.suspensionInfo;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final HockeyIncidentType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final HockeyGoalType getGoalType() {
        return this.goalType;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPeriodName() {
        return this.periodName;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getTime() {
        return this.time;
    }

    /* renamed from: component8, reason: from getter */
    public final int getReversedPeriodTimeSeconds() {
        return this.reversedPeriodTimeSeconds;
    }

    @NotNull
    public final HockeyIncident copy(int id, @NotNull String text, @NotNull HockeyIncidentType type, @Nullable HockeyGoalType goalType, @Nullable String periodName, @Nullable Boolean isHome, @Nullable Integer time, int reversedPeriodTimeSeconds, @Nullable Integer duration, @Nullable Player player, @Nullable Player penalizedPlayer, @Nullable Player penaltyServedByPlayer, @Nullable Player playerIn, @Nullable Player penaltyDrawnByPlayer, @Nullable Player goalkeeper, @Nullable Player assist1, @Nullable Player assist2, @Nullable Point2D location, @Nullable Integer homeScore, @Nullable Integer awayScore, @Nullable HockeyFaceOffZone faceoffZone, @Nullable HockeyPlayType playType, @Nullable HockeySuspension suspensionInfo) {
        text.getClass();
        type.getClass();
        return new HockeyIncident(id, text, type, goalType, periodName, isHome, time, reversedPeriodTimeSeconds, duration, player, penalizedPlayer, penaltyServedByPlayer, playerIn, penaltyDrawnByPlayer, goalkeeper, assist1, assist2, location, homeScore, awayScore, faceoffZone, playType, suspensionInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HockeyIncident)) {
            return false;
        }
        HockeyIncident hockeyIncident = (HockeyIncident) other;
        return this.id == hockeyIncident.id && Intrinsics.c(this.text, hockeyIncident.text) && this.type == hockeyIncident.type && this.goalType == hockeyIncident.goalType && Intrinsics.c(this.periodName, hockeyIncident.periodName) && Intrinsics.c(this.isHome, hockeyIncident.isHome) && Intrinsics.c(this.time, hockeyIncident.time) && this.reversedPeriodTimeSeconds == hockeyIncident.reversedPeriodTimeSeconds && Intrinsics.c(this.duration, hockeyIncident.duration) && Intrinsics.c(this.player, hockeyIncident.player) && Intrinsics.c(this.penalizedPlayer, hockeyIncident.penalizedPlayer) && Intrinsics.c(this.penaltyServedByPlayer, hockeyIncident.penaltyServedByPlayer) && Intrinsics.c(this.playerIn, hockeyIncident.playerIn) && Intrinsics.c(this.penaltyDrawnByPlayer, hockeyIncident.penaltyDrawnByPlayer) && Intrinsics.c(this.goalkeeper, hockeyIncident.goalkeeper) && Intrinsics.c(this.assist1, hockeyIncident.assist1) && Intrinsics.c(this.assist2, hockeyIncident.assist2) && Intrinsics.c(this.location, hockeyIncident.location) && Intrinsics.c(this.homeScore, hockeyIncident.homeScore) && Intrinsics.c(this.awayScore, hockeyIncident.awayScore) && this.faceoffZone == hockeyIncident.faceoffZone && this.playType == hockeyIncident.playType && Intrinsics.c(this.suspensionInfo, hockeyIncident.suspensionInfo);
    }

    @Nullable
    public final Player getAssist1() {
        return this.assist1;
    }

    @Nullable
    public final Player getAssist2() {
        return this.assist2;
    }

    @Nullable
    public final HockeyShotmapItem getEventMapItem() {
        Point2D point2D;
        BaseHockeyShotmapItem.ShotmapItemType eventMapIncidentType = getEventMapIncidentType();
        if (eventMapIncidentType == null || (point2D = this.location) == null) {
            return null;
        }
        Pair<Float, Float> mapFaceOffPoint = eventMapIncidentType == BaseHockeyShotmapItem.ShotmapItemType.FACEOFF ? mapFaceOffPoint(point2D) : new Pair<>(Float.valueOf(point2D.getX()), Float.valueOf(this.location.getY()));
        return new HockeyShotmapItem(this.id, ((Number) mapFaceOffPoint.a).floatValue(), ((Number) mapFaceOffPoint.b).floatValue(), eventMapIncidentType.getId(), this.periodName);
    }

    @Nullable
    public final HockeyFaceOffZone getFaceoffZone() {
        return this.faceoffZone;
    }

    @Nullable
    public final HockeyGoalType getGoalType() {
        return this.goalType;
    }

    @Nullable
    public final Player getGoalkeeper() {
        return this.goalkeeper;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getIsHome() {
        Boolean bool = this.isHome;
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(this.shouldReverseTeams ^ bool.booleanValue());
    }

    @Nullable
    public final Point2D getLocation() {
        return this.location;
    }

    @Nullable
    public final Player getPenalizedPlayer() {
        return this.penalizedPlayer;
    }

    @Nullable
    public final Player getPenaltyDrawnByPlayer() {
        return this.penaltyDrawnByPlayer;
    }

    @Nullable
    public final Integer getPenaltyDuration() {
        if (this.duration != null) {
            return Integer.valueOf(wzb.b(r1.intValue() / 60.0f));
        }
        return null;
    }

    @Nullable
    public final Player getPenaltyServedByPlayer() {
        return this.penaltyServedByPlayer;
    }

    @Nullable
    public final String getPeriodName() {
        return this.periodName;
    }

    @Nullable
    public final HockeyPlayType getPlayType() {
        return this.playType;
    }

    @Nullable
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final Player getPlayerIn() {
        return this.playerIn;
    }

    public final int getReversedPeriodTimeSeconds() {
        return this.reversedPeriodTimeSeconds;
    }

    @NotNull
    public final String getScoreDisplay() {
        return this.shouldReverseTeams ? ljg.m(this.awayScore, this.homeScore, "-") : ljg.m(this.homeScore, this.awayScore, "-");
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    @Nullable
    public final HockeySuspension getSuspensionInfo() {
        return this.suspensionInfo;
    }

    @NotNull
    public final Pair<Team, Team> getTeams(@NotNull Event event) {
        event.getClass();
        Boolean isHome = getIsHome();
        return Intrinsics.c(isHome, Boolean.TRUE) ? new Pair<>(Event.getHomeTeam$default(event, null, 1, null), Event.getAwayTeam$default(event, null, 1, null)) : Intrinsics.c(isHome, Boolean.FALSE) ? new Pair<>(Event.getAwayTeam$default(event, null, 1, null), Event.getHomeTeam$default(event, null, 1, null)) : new Pair<>(null, null);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getTime() {
        return this.time;
    }

    @NotNull
    public final HockeyIncidentType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + dmi.c(Integer.hashCode(this.id) * 31, 31, this.text)) * 31;
        HockeyGoalType hockeyGoalType = this.goalType;
        int hashCode2 = (hashCode + (hockeyGoalType == null ? 0 : hockeyGoalType.hashCode())) * 31;
        String str = this.periodName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isHome;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.time;
        int a = wv8.a(this.reversedPeriodTimeSeconds, (hashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.duration;
        int hashCode5 = (a + (num2 == null ? 0 : num2.hashCode())) * 31;
        Player player = this.player;
        int hashCode6 = (hashCode5 + (player == null ? 0 : player.hashCode())) * 31;
        Player player2 = this.penalizedPlayer;
        int hashCode7 = (hashCode6 + (player2 == null ? 0 : player2.hashCode())) * 31;
        Player player3 = this.penaltyServedByPlayer;
        int hashCode8 = (hashCode7 + (player3 == null ? 0 : player3.hashCode())) * 31;
        Player player4 = this.playerIn;
        int hashCode9 = (hashCode8 + (player4 == null ? 0 : player4.hashCode())) * 31;
        Player player5 = this.penaltyDrawnByPlayer;
        int hashCode10 = (hashCode9 + (player5 == null ? 0 : player5.hashCode())) * 31;
        Player player6 = this.goalkeeper;
        int hashCode11 = (hashCode10 + (player6 == null ? 0 : player6.hashCode())) * 31;
        Player player7 = this.assist1;
        int hashCode12 = (hashCode11 + (player7 == null ? 0 : player7.hashCode())) * 31;
        Player player8 = this.assist2;
        int hashCode13 = (hashCode12 + (player8 == null ? 0 : player8.hashCode())) * 31;
        Point2D point2D = this.location;
        int hashCode14 = (hashCode13 + (point2D == null ? 0 : point2D.hashCode())) * 31;
        Integer num3 = this.homeScore;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.awayScore;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        HockeyFaceOffZone hockeyFaceOffZone = this.faceoffZone;
        int hashCode17 = (hashCode16 + (hockeyFaceOffZone == null ? 0 : hockeyFaceOffZone.hashCode())) * 31;
        HockeyPlayType hockeyPlayType = this.playType;
        int hashCode18 = (hashCode17 + (hockeyPlayType == null ? 0 : hockeyPlayType.hashCode())) * 31;
        HockeySuspension hockeySuspension = this.suspensionInfo;
        return hashCode18 + (hockeySuspension != null ? hockeySuspension.hashCode() : 0);
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.text;
        HockeyIncidentType hockeyIncidentType = this.type;
        HockeyGoalType hockeyGoalType = this.goalType;
        String str2 = this.periodName;
        Boolean bool = this.isHome;
        Integer num = this.time;
        int i2 = this.reversedPeriodTimeSeconds;
        Integer num2 = this.duration;
        Player player = this.player;
        Player player2 = this.penalizedPlayer;
        Player player3 = this.penaltyServedByPlayer;
        Player player4 = this.playerIn;
        Player player5 = this.penaltyDrawnByPlayer;
        Player player6 = this.goalkeeper;
        Player player7 = this.assist1;
        Player player8 = this.assist2;
        Point2D point2D = this.location;
        Integer num3 = this.homeScore;
        Integer num4 = this.awayScore;
        HockeyFaceOffZone hockeyFaceOffZone = this.faceoffZone;
        HockeyPlayType hockeyPlayType = this.playType;
        HockeySuspension hockeySuspension = this.suspensionInfo;
        StringBuilder t = dmi.t(i, "HockeyIncident(id=", ", text=", str, ", type=");
        t.append(hockeyIncidentType);
        t.append(", goalType=");
        t.append(hockeyGoalType);
        t.append(", periodName=");
        t.append(str2);
        t.append(", isHome=");
        t.append(bool);
        t.append(", time=");
        t.append(num);
        t.append(", reversedPeriodTimeSeconds=");
        t.append(i2);
        t.append(", duration=");
        t.append(num2);
        t.append(", player=");
        t.append(player);
        t.append(", penalizedPlayer=");
        t.append(player2);
        t.append(", penaltyServedByPlayer=");
        t.append(player3);
        t.append(", playerIn=");
        t.append(player4);
        t.append(", penaltyDrawnByPlayer=");
        t.append(player5);
        t.append(", goalkeeper=");
        t.append(player6);
        t.append(", assist1=");
        t.append(player7);
        t.append(", assist2=");
        t.append(player8);
        t.append(", location=");
        t.append(point2D);
        t.append(", homeScore=");
        vxd.r(num3, num4, ", awayScore=", ", faceoffZone=", t);
        t.append(hockeyFaceOffZone);
        t.append(", playType=");
        t.append(hockeyPlayType);
        t.append(", suspensionInfo=");
        t.append(hockeySuspension);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncident$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncident;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HockeyIncident$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @q5h("zone")
    public static /* synthetic */ void getFaceoffZone$annotations() {
    }

    @q5h("strength")
    public static /* synthetic */ void getPlayType$annotations() {
    }

    @q5h("penaltyType")
    public static /* synthetic */ void getSuspensionInfo$annotations() {
    }

    public HockeyIncident(int i, @NotNull String str, @NotNull HockeyIncidentType hockeyIncidentType, @Nullable HockeyGoalType hockeyGoalType, @Nullable String str2, @Nullable Boolean bool, @Nullable Integer num, int i2, @Nullable Integer num2, @Nullable Player player, @Nullable Player player2, @Nullable Player player3, @Nullable Player player4, @Nullable Player player5, @Nullable Player player6, @Nullable Player player7, @Nullable Player player8, @Nullable Point2D point2D, @Nullable Integer num3, @Nullable Integer num4, @Nullable HockeyFaceOffZone hockeyFaceOffZone, @Nullable HockeyPlayType hockeyPlayType, @Nullable HockeySuspension hockeySuspension) {
        str.getClass();
        hockeyIncidentType.getClass();
        this.id = i;
        this.text = str;
        this.type = hockeyIncidentType;
        this.goalType = hockeyGoalType;
        this.periodName = str2;
        this.isHome = bool;
        this.time = num;
        this.reversedPeriodTimeSeconds = i2;
        this.duration = num2;
        this.player = player;
        this.penalizedPlayer = player2;
        this.penaltyServedByPlayer = player3;
        this.playerIn = player4;
        this.penaltyDrawnByPlayer = player5;
        this.goalkeeper = player6;
        this.assist1 = player7;
        this.assist2 = player8;
        this.location = point2D;
        this.homeScore = num3;
        this.awayScore = num4;
        this.faceoffZone = hockeyFaceOffZone;
        this.playType = hockeyPlayType;
        this.suspensionInfo = hockeySuspension;
    }
}
