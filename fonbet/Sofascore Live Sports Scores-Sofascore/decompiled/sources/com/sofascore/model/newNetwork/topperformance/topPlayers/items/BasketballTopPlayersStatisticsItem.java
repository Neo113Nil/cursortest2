package com.sofascore.model.newNetwork.topperformance.topPlayers.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
import defpackage.me4;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 \u007f2\u00020\u0001:\u0003\u0080\u0001\u007fB¯\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b#\u0010$BÅ\u0002\b\u0010\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010,J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010,J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010,J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010,J\u0012\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010,J\u0012\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b6\u00104J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010,J\u0012\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b8\u00104J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010,J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010,J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010,J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010,J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010,J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010,J\u0012\u0010?\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b?\u00104J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010,J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010,J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010,J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010,J\u0012\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bD\u00104J\u0012\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bE\u00104J\u0012\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bF\u00104J\u0012\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bG\u00104J\u0012\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bH\u00104J\u0012\u0010I\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bI\u00104J\u0012\u0010J\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bJ\u00104Jô\u0002\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bM\u0010.J\u0010\u0010N\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bN\u0010*J\u001a\u0010R\u001a\u00020Q2\b\u0010P\u001a\u0004\u0018\u00010OHÖ\u0003¢\u0006\u0004\bR\u0010SJ'\u0010\\\u001a\u00020Y2\u0006\u0010T\u001a\u00020\u00002\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020WH\u0001¢\u0006\u0004\bZ\u0010[R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010]\u001a\u0004\b^\u0010*R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010_\u001a\u0004\b`\u0010,R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010a\u001a\u0004\bb\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010_\u001a\u0004\bc\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010_\u001a\u0004\bd\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010_\u001a\u0004\be\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010_\u001a\u0004\bf\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010g\u001a\u0004\bh\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010_\u001a\u0004\bi\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010g\u001a\u0004\bj\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010_\u001a\u0004\bk\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010g\u001a\u0004\bl\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010_\u001a\u0004\bm\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010_\u001a\u0004\bn\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010_\u001a\u0004\bo\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010_\u001a\u0004\bp\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\bq\u0010,R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010_\u001a\u0004\br\u0010,R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010g\u001a\u0004\bs\u00104R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010_\u001a\u0004\bt\u0010,R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010_\u001a\u0004\bu\u0010,R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010_\u001a\u0004\bv\u0010,R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010_\u001a\u0004\bw\u0010,R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010g\u001a\u0004\bx\u00104R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010g\u001a\u0004\by\u00104R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010g\u001a\u0004\bz\u00104R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010g\u001a\u0004\b{\u00104R\u0019\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b \u0010g\u001a\u0004\b|\u00104R\u0019\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010g\u001a\u0004\b}\u00104R\u0019\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010g\u001a\u0004\b~\u00104¨\u0006\u0081\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BasketballTopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseTopPlayersStatisticsItem;", "", "id", "appearances", "", "type", "points", "rebounds", "assists", "secondsPlayed", "", "fieldGoalsPercentage", "fieldGoalsMade", "freeThrowsPercentage", "freeThrowsMade", "threePointsPercentage", "threePointsMade", "defensiveRebounds", "offensiveRebounds", "steals", "turnovers", "blocks", "assistTurnoverRatio", "plusMinus", "pir", "doubleDoubles", "tripleDoubles", CampaignEx.JSON_KEY_STAR, "trueShootingPercentage", "effectiveFieldGoalPercentage", "usage", "individualOffensiveRating", "individualDefensiveRating", "playerEfficiencyRating", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Double;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BasketballTopPlayersStatisticsItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BasketballTopPlayersStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/String;", "getType", "getPoints", "getRebounds", "getAssists", "getSecondsPlayed", "Ljava/lang/Double;", "getFieldGoalsPercentage", "getFieldGoalsMade", "getFreeThrowsPercentage", "getFreeThrowsMade", "getThreePointsPercentage", "getThreePointsMade", "getDefensiveRebounds", "getOffensiveRebounds", "getSteals", "getTurnovers", "getBlocks", "getAssistTurnoverRatio", "getPlusMinus", "getPir", "getDoubleDoubles", "getTripleDoubles", "getRating", "getTrueShootingPercentage", "getEffectiveFieldGoalPercentage", "getUsage", "getIndividualOffensiveRating", "getIndividualDefensiveRating", "getPlayerEfficiencyRating", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BasketballTopPlayersStatisticsItem extends BaseTopPlayersStatisticsItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Double assistTurnoverRatio;

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer blocks;

    @Nullable
    private final Integer defensiveRebounds;

    @Nullable
    private final Integer doubleDoubles;

    @Nullable
    private final Double effectiveFieldGoalPercentage;

    @Nullable
    private final Integer fieldGoalsMade;

    @Nullable
    private final Double fieldGoalsPercentage;

    @Nullable
    private final Integer freeThrowsMade;

    @Nullable
    private final Double freeThrowsPercentage;
    private final int id;

    @Nullable
    private final Double individualDefensiveRating;

    @Nullable
    private final Double individualOffensiveRating;

    @Nullable
    private final Integer offensiveRebounds;

    @Nullable
    private final Integer pir;

    @Nullable
    private final Double playerEfficiencyRating;

    @Nullable
    private final Integer plusMinus;

    @Nullable
    private final Integer points;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer rebounds;

    @Nullable
    private final Integer secondsPlayed;

    @Nullable
    private final Integer steals;

    @Nullable
    private final Integer threePointsMade;

    @Nullable
    private final Double threePointsPercentage;

    @Nullable
    private final Integer tripleDoubles;

    @Nullable
    private final Double trueShootingPercentage;

    @Nullable
    private final Integer turnovers;

    @NotNull
    private final String type;

    @Nullable
    private final Double usage;

    public /* synthetic */ BasketballTopPlayersStatisticsItem(int i, int i2, Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Double d, Integer num6, Double d2, Integer num7, Double d3, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Double d4, Integer num14, Integer num15, Integer num16, Integer num17, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, t5h t5hVar) {
        if (1073741823 != (i & 1073741823)) {
            oea.z(i, 1073741823, BasketballTopPlayersStatisticsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.appearances = num;
        this.type = str;
        this.points = num2;
        this.rebounds = num3;
        this.assists = num4;
        this.secondsPlayed = num5;
        this.fieldGoalsPercentage = d;
        this.fieldGoalsMade = num6;
        this.freeThrowsPercentage = d2;
        this.freeThrowsMade = num7;
        this.threePointsPercentage = d3;
        this.threePointsMade = num8;
        this.defensiveRebounds = num9;
        this.offensiveRebounds = num10;
        this.steals = num11;
        this.turnovers = num12;
        this.blocks = num13;
        this.assistTurnoverRatio = d4;
        this.plusMinus = num14;
        this.pir = num15;
        this.doubleDoubles = num16;
        this.tripleDoubles = num17;
        this.rating = d5;
        this.trueShootingPercentage = d6;
        this.effectiveFieldGoalPercentage = d7;
        this.usage = d8;
        this.individualOffensiveRating = d9;
        this.individualDefensiveRating = d10;
        this.playerEfficiencyRating = d11;
    }

    public static /* synthetic */ BasketballTopPlayersStatisticsItem copy$default(BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem, int i, Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Double d, Integer num6, Double d2, Integer num7, Double d3, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Double d4, Integer num14, Integer num15, Integer num16, Integer num17, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, int i2, Object obj) {
        Double d12;
        Double d13;
        int i3 = (i2 & 1) != 0 ? basketballTopPlayersStatisticsItem.id : i;
        Integer num18 = (i2 & 2) != 0 ? basketballTopPlayersStatisticsItem.appearances : num;
        String str2 = (i2 & 4) != 0 ? basketballTopPlayersStatisticsItem.type : str;
        Integer num19 = (i2 & 8) != 0 ? basketballTopPlayersStatisticsItem.points : num2;
        Integer num20 = (i2 & 16) != 0 ? basketballTopPlayersStatisticsItem.rebounds : num3;
        Integer num21 = (i2 & 32) != 0 ? basketballTopPlayersStatisticsItem.assists : num4;
        Integer num22 = (i2 & 64) != 0 ? basketballTopPlayersStatisticsItem.secondsPlayed : num5;
        Double d14 = (i2 & 128) != 0 ? basketballTopPlayersStatisticsItem.fieldGoalsPercentage : d;
        Integer num23 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? basketballTopPlayersStatisticsItem.fieldGoalsMade : num6;
        Double d15 = (i2 & 512) != 0 ? basketballTopPlayersStatisticsItem.freeThrowsPercentage : d2;
        Integer num24 = (i2 & 1024) != 0 ? basketballTopPlayersStatisticsItem.freeThrowsMade : num7;
        Double d16 = (i2 & a.o) != 0 ? basketballTopPlayersStatisticsItem.threePointsPercentage : d3;
        Integer num25 = (i2 & 4096) != 0 ? basketballTopPlayersStatisticsItem.threePointsMade : num8;
        Integer num26 = (i2 & 8192) != 0 ? basketballTopPlayersStatisticsItem.defensiveRebounds : num9;
        int i4 = i3;
        Integer num27 = (i2 & 16384) != 0 ? basketballTopPlayersStatisticsItem.offensiveRebounds : num10;
        Integer num28 = (i2 & 32768) != 0 ? basketballTopPlayersStatisticsItem.steals : num11;
        Integer num29 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? basketballTopPlayersStatisticsItem.turnovers : num12;
        Integer num30 = (i2 & 131072) != 0 ? basketballTopPlayersStatisticsItem.blocks : num13;
        Double d17 = (i2 & 262144) != 0 ? basketballTopPlayersStatisticsItem.assistTurnoverRatio : d4;
        Integer num31 = (i2 & 524288) != 0 ? basketballTopPlayersStatisticsItem.plusMinus : num14;
        Integer num32 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? basketballTopPlayersStatisticsItem.pir : num15;
        Integer num33 = (i2 & 2097152) != 0 ? basketballTopPlayersStatisticsItem.doubleDoubles : num16;
        Integer num34 = (i2 & 4194304) != 0 ? basketballTopPlayersStatisticsItem.tripleDoubles : num17;
        Double d18 = (i2 & 8388608) != 0 ? basketballTopPlayersStatisticsItem.rating : d5;
        Double d19 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? basketballTopPlayersStatisticsItem.trueShootingPercentage : d6;
        Double d20 = (i2 & 33554432) != 0 ? basketballTopPlayersStatisticsItem.effectiveFieldGoalPercentage : d7;
        Double d21 = (i2 & 67108864) != 0 ? basketballTopPlayersStatisticsItem.usage : d8;
        Double d22 = (i2 & 134217728) != 0 ? basketballTopPlayersStatisticsItem.individualOffensiveRating : d9;
        Double d23 = (i2 & 268435456) != 0 ? basketballTopPlayersStatisticsItem.individualDefensiveRating : d10;
        if ((i2 & 536870912) != 0) {
            d13 = d23;
            d12 = basketballTopPlayersStatisticsItem.playerEfficiencyRating;
        } else {
            d12 = d11;
            d13 = d23;
        }
        return basketballTopPlayersStatisticsItem.copy(i4, num18, str2, num19, num20, num21, num22, d14, num23, d15, num24, d16, num25, num26, num27, num28, num29, num30, d17, num31, num32, num33, num34, d18, d19, d20, d21, d22, d13, d12);
    }

    public static final /* synthetic */ void write$Self$model_release(BasketballTopPlayersStatisticsItem self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.getAppearances());
        output.y(serialDesc, 2, self.getType());
        output.h(serialDesc, 3, a7aVar, self.points);
        output.h(serialDesc, 4, a7aVar, self.rebounds);
        output.h(serialDesc, 5, a7aVar, self.assists);
        output.h(serialDesc, 6, a7aVar, self.secondsPlayed);
        h75 h75Var = h75.a;
        output.h(serialDesc, 7, h75Var, self.fieldGoalsPercentage);
        output.h(serialDesc, 8, a7aVar, self.fieldGoalsMade);
        output.h(serialDesc, 9, h75Var, self.freeThrowsPercentage);
        output.h(serialDesc, 10, a7aVar, self.freeThrowsMade);
        output.h(serialDesc, 11, h75Var, self.threePointsPercentage);
        output.h(serialDesc, 12, a7aVar, self.threePointsMade);
        output.h(serialDesc, 13, a7aVar, self.defensiveRebounds);
        output.h(serialDesc, 14, a7aVar, self.offensiveRebounds);
        output.h(serialDesc, 15, a7aVar, self.steals);
        output.h(serialDesc, 16, a7aVar, self.turnovers);
        output.h(serialDesc, 17, a7aVar, self.blocks);
        output.h(serialDesc, 18, h75Var, self.assistTurnoverRatio);
        output.h(serialDesc, 19, a7aVar, self.plusMinus);
        output.h(serialDesc, 20, a7aVar, self.pir);
        output.h(serialDesc, 21, a7aVar, self.doubleDoubles);
        output.h(serialDesc, 22, a7aVar, self.tripleDoubles);
        output.h(serialDesc, 23, h75Var, self.getRating());
        output.h(serialDesc, 24, h75Var, self.trueShootingPercentage);
        output.h(serialDesc, 25, h75Var, self.effectiveFieldGoalPercentage);
        output.h(serialDesc, 26, h75Var, self.usage);
        output.h(serialDesc, 27, h75Var, self.individualOffensiveRating);
        output.h(serialDesc, 28, h75Var, self.individualDefensiveRating);
        output.h(serialDesc, 29, h75Var, self.playerEfficiencyRating);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getFreeThrowsPercentage() {
        return this.freeThrowsPercentage;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getFreeThrowsMade() {
        return this.freeThrowsMade;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getThreePointsPercentage() {
        return this.threePointsPercentage;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getTurnovers() {
        return this.turnovers;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getBlocks() {
        return this.blocks;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Double getAssistTurnoverRatio() {
        return this.assistTurnoverRatio;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getPir() {
        return this.pir;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getDoubleDoubles() {
        return this.doubleDoubles;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getTripleDoubles() {
        return this.tripleDoubles;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Double getTrueShootingPercentage() {
        return this.trueShootingPercentage;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Double getEffectiveFieldGoalPercentage() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Double getUsage() {
        return this.usage;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Double getIndividualOffensiveRating() {
        return this.individualOffensiveRating;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Double getIndividualDefensiveRating() {
        return this.individualDefensiveRating;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Double getPlayerEfficiencyRating() {
        return this.playerEfficiencyRating;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getRebounds() {
        return this.rebounds;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getSecondsPlayed() {
        return this.secondsPlayed;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getFieldGoalsPercentage() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getFieldGoalsMade() {
        return this.fieldGoalsMade;
    }

    @NotNull
    public final BasketballTopPlayersStatisticsItem copy(int id, @Nullable Integer appearances, @NotNull String type, @Nullable Integer points, @Nullable Integer rebounds, @Nullable Integer assists, @Nullable Integer secondsPlayed, @Nullable Double fieldGoalsPercentage, @Nullable Integer fieldGoalsMade, @Nullable Double freeThrowsPercentage, @Nullable Integer freeThrowsMade, @Nullable Double threePointsPercentage, @Nullable Integer threePointsMade, @Nullable Integer defensiveRebounds, @Nullable Integer offensiveRebounds, @Nullable Integer steals, @Nullable Integer turnovers, @Nullable Integer blocks, @Nullable Double assistTurnoverRatio, @Nullable Integer plusMinus, @Nullable Integer pir, @Nullable Integer doubleDoubles, @Nullable Integer tripleDoubles, @Nullable Double rating, @Nullable Double trueShootingPercentage, @Nullable Double effectiveFieldGoalPercentage, @Nullable Double usage, @Nullable Double individualOffensiveRating, @Nullable Double individualDefensiveRating, @Nullable Double playerEfficiencyRating) {
        type.getClass();
        return new BasketballTopPlayersStatisticsItem(id, appearances, type, points, rebounds, assists, secondsPlayed, fieldGoalsPercentage, fieldGoalsMade, freeThrowsPercentage, freeThrowsMade, threePointsPercentage, threePointsMade, defensiveRebounds, offensiveRebounds, steals, turnovers, blocks, assistTurnoverRatio, plusMinus, pir, doubleDoubles, tripleDoubles, rating, trueShootingPercentage, effectiveFieldGoalPercentage, usage, individualOffensiveRating, individualDefensiveRating, playerEfficiencyRating);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketballTopPlayersStatisticsItem)) {
            return false;
        }
        BasketballTopPlayersStatisticsItem basketballTopPlayersStatisticsItem = (BasketballTopPlayersStatisticsItem) other;
        return this.id == basketballTopPlayersStatisticsItem.id && Intrinsics.c(this.appearances, basketballTopPlayersStatisticsItem.appearances) && Intrinsics.c(this.type, basketballTopPlayersStatisticsItem.type) && Intrinsics.c(this.points, basketballTopPlayersStatisticsItem.points) && Intrinsics.c(this.rebounds, basketballTopPlayersStatisticsItem.rebounds) && Intrinsics.c(this.assists, basketballTopPlayersStatisticsItem.assists) && Intrinsics.c(this.secondsPlayed, basketballTopPlayersStatisticsItem.secondsPlayed) && Intrinsics.c(this.fieldGoalsPercentage, basketballTopPlayersStatisticsItem.fieldGoalsPercentage) && Intrinsics.c(this.fieldGoalsMade, basketballTopPlayersStatisticsItem.fieldGoalsMade) && Intrinsics.c(this.freeThrowsPercentage, basketballTopPlayersStatisticsItem.freeThrowsPercentage) && Intrinsics.c(this.freeThrowsMade, basketballTopPlayersStatisticsItem.freeThrowsMade) && Intrinsics.c(this.threePointsPercentage, basketballTopPlayersStatisticsItem.threePointsPercentage) && Intrinsics.c(this.threePointsMade, basketballTopPlayersStatisticsItem.threePointsMade) && Intrinsics.c(this.defensiveRebounds, basketballTopPlayersStatisticsItem.defensiveRebounds) && Intrinsics.c(this.offensiveRebounds, basketballTopPlayersStatisticsItem.offensiveRebounds) && Intrinsics.c(this.steals, basketballTopPlayersStatisticsItem.steals) && Intrinsics.c(this.turnovers, basketballTopPlayersStatisticsItem.turnovers) && Intrinsics.c(this.blocks, basketballTopPlayersStatisticsItem.blocks) && Intrinsics.c(this.assistTurnoverRatio, basketballTopPlayersStatisticsItem.assistTurnoverRatio) && Intrinsics.c(this.plusMinus, basketballTopPlayersStatisticsItem.plusMinus) && Intrinsics.c(this.pir, basketballTopPlayersStatisticsItem.pir) && Intrinsics.c(this.doubleDoubles, basketballTopPlayersStatisticsItem.doubleDoubles) && Intrinsics.c(this.tripleDoubles, basketballTopPlayersStatisticsItem.tripleDoubles) && Intrinsics.c(this.rating, basketballTopPlayersStatisticsItem.rating) && Intrinsics.c(this.trueShootingPercentage, basketballTopPlayersStatisticsItem.trueShootingPercentage) && Intrinsics.c(this.effectiveFieldGoalPercentage, basketballTopPlayersStatisticsItem.effectiveFieldGoalPercentage) && Intrinsics.c(this.usage, basketballTopPlayersStatisticsItem.usage) && Intrinsics.c(this.individualOffensiveRating, basketballTopPlayersStatisticsItem.individualOffensiveRating) && Intrinsics.c(this.individualDefensiveRating, basketballTopPlayersStatisticsItem.individualDefensiveRating) && Intrinsics.c(this.playerEfficiencyRating, basketballTopPlayersStatisticsItem.playerEfficiencyRating);
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @Nullable
    public Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    public final Double getAssistTurnoverRatio() {
        return this.assistTurnoverRatio;
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final Integer getBlocks() {
        return this.blocks;
    }

    @Nullable
    public final Integer getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    public final Integer getDoubleDoubles() {
        return this.doubleDoubles;
    }

    @Nullable
    public final Double getEffectiveFieldGoalPercentage() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    public final Integer getFieldGoalsMade() {
        return this.fieldGoalsMade;
    }

    @Nullable
    public final Double getFieldGoalsPercentage() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    public final Integer getFreeThrowsMade() {
        return this.freeThrowsMade;
    }

    @Nullable
    public final Double getFreeThrowsPercentage() {
        return this.freeThrowsPercentage;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Double getIndividualDefensiveRating() {
        return this.individualDefensiveRating;
    }

    @Nullable
    public final Double getIndividualOffensiveRating() {
        return this.individualOffensiveRating;
    }

    @Nullable
    public final Integer getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    public final Integer getPir() {
        return this.pir;
    }

    @Nullable
    public final Double getPlayerEfficiencyRating() {
        return this.playerEfficiencyRating;
    }

    @Nullable
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getRebounds() {
        return this.rebounds;
    }

    @Nullable
    public final Integer getSecondsPlayed() {
        return this.secondsPlayed;
    }

    @Nullable
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    public final Integer getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    public final Double getThreePointsPercentage() {
        return this.threePointsPercentage;
    }

    @Nullable
    public final Integer getTripleDoubles() {
        return this.tripleDoubles;
    }

    @Nullable
    public final Double getTrueShootingPercentage() {
        return this.trueShootingPercentage;
    }

    @Nullable
    public final Integer getTurnovers() {
        return this.turnovers;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @NotNull
    public String getType() {
        return this.type;
    }

    @Nullable
    public final Double getUsage() {
        return this.usage;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.appearances;
        int c = dmi.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.type);
        Integer num2 = this.points;
        int hashCode2 = (c + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rebounds;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.assists;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.secondsPlayed;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d = this.fieldGoalsPercentage;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num6 = this.fieldGoalsMade;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Double d2 = this.freeThrowsPercentage;
        int hashCode8 = (hashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num7 = this.freeThrowsMade;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Double d3 = this.threePointsPercentage;
        int hashCode10 = (hashCode9 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num8 = this.threePointsMade;
        int hashCode11 = (hashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.defensiveRebounds;
        int hashCode12 = (hashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.offensiveRebounds;
        int hashCode13 = (hashCode12 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.steals;
        int hashCode14 = (hashCode13 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.turnovers;
        int hashCode15 = (hashCode14 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.blocks;
        int hashCode16 = (hashCode15 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Double d4 = this.assistTurnoverRatio;
        int hashCode17 = (hashCode16 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num14 = this.plusMinus;
        int hashCode18 = (hashCode17 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.pir;
        int hashCode19 = (hashCode18 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.doubleDoubles;
        int hashCode20 = (hashCode19 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.tripleDoubles;
        int hashCode21 = (hashCode20 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Double d5 = this.rating;
        int hashCode22 = (hashCode21 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.trueShootingPercentage;
        int hashCode23 = (hashCode22 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.effectiveFieldGoalPercentage;
        int hashCode24 = (hashCode23 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.usage;
        int hashCode25 = (hashCode24 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.individualOffensiveRating;
        int hashCode26 = (hashCode25 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d10 = this.individualDefensiveRating;
        int hashCode27 = (hashCode26 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.playerEfficiencyRating;
        return hashCode27 + (d11 != null ? d11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Integer num = this.appearances;
        String str = this.type;
        Integer num2 = this.points;
        Integer num3 = this.rebounds;
        Integer num4 = this.assists;
        Integer num5 = this.secondsPlayed;
        Double d = this.fieldGoalsPercentage;
        Integer num6 = this.fieldGoalsMade;
        Double d2 = this.freeThrowsPercentage;
        Integer num7 = this.freeThrowsMade;
        Double d3 = this.threePointsPercentage;
        Integer num8 = this.threePointsMade;
        Integer num9 = this.defensiveRebounds;
        Integer num10 = this.offensiveRebounds;
        Integer num11 = this.steals;
        Integer num12 = this.turnovers;
        Integer num13 = this.blocks;
        Double d4 = this.assistTurnoverRatio;
        Integer num14 = this.plusMinus;
        Integer num15 = this.pir;
        Integer num16 = this.doubleDoubles;
        Integer num17 = this.tripleDoubles;
        Double d5 = this.rating;
        Double d6 = this.trueShootingPercentage;
        Double d7 = this.effectiveFieldGoalPercentage;
        Double d8 = this.usage;
        Double d9 = this.individualOffensiveRating;
        Double d10 = this.individualDefensiveRating;
        Double d11 = this.playerEfficiencyRating;
        StringBuilder r = fc6.r("BasketballTopPlayersStatisticsItem(id=", ", appearances=", ", type=", num, i);
        me4.o(num2, str, ", points=", ", rebounds=", r);
        vxd.r(num3, num4, ", assists=", ", secondsPlayed=", r);
        fn0.v(d, num5, ", fieldGoalsPercentage=", ", fieldGoalsMade=", r);
        fn0.v(d2, num6, ", freeThrowsPercentage=", ", freeThrowsMade=", r);
        fn0.v(d3, num7, ", threePointsPercentage=", ", threePointsMade=", r);
        vxd.r(num8, num9, ", defensiveRebounds=", ", offensiveRebounds=", r);
        vxd.r(num10, num11, ", steals=", ", turnovers=", r);
        vxd.r(num12, num13, ", blocks=", ", assistTurnoverRatio=", r);
        mz1.x(d4, num14, ", plusMinus=", ", pir=", r);
        vxd.r(num15, num16, ", doubleDoubles=", ", tripleDoubles=", r);
        fn0.v(d5, num17, ", rating=", ", trueShootingPercentage=", r);
        fc6.A(r, d6, ", effectiveFieldGoalPercentage=", d7, ", usage=");
        fc6.A(r, d8, ", individualOffensiveRating=", d9, ", individualDefensiveRating=");
        r.append(d10);
        r.append(", playerEfficiencyRating=");
        r.append(d11);
        r.append(")");
        return r.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BasketballTopPlayersStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BasketballTopPlayersStatisticsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketballTopPlayersStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BasketballTopPlayersStatisticsItem(int i, @Nullable Integer num, @NotNull String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Double d, @Nullable Integer num6, @Nullable Double d2, @Nullable Integer num7, @Nullable Double d3, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Double d4, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Double d5, @Nullable Double d6, @Nullable Double d7, @Nullable Double d8, @Nullable Double d9, @Nullable Double d10, @Nullable Double d11) {
        str.getClass();
        this.id = i;
        this.appearances = num;
        this.type = str;
        this.points = num2;
        this.rebounds = num3;
        this.assists = num4;
        this.secondsPlayed = num5;
        this.fieldGoalsPercentage = d;
        this.fieldGoalsMade = num6;
        this.freeThrowsPercentage = d2;
        this.freeThrowsMade = num7;
        this.threePointsPercentage = d3;
        this.threePointsMade = num8;
        this.defensiveRebounds = num9;
        this.offensiveRebounds = num10;
        this.steals = num11;
        this.turnovers = num12;
        this.blocks = num13;
        this.assistTurnoverRatio = d4;
        this.plusMinus = num14;
        this.pir = num15;
        this.doubleDoubles = num16;
        this.tripleDoubles = num17;
        this.rating = d5;
        this.trueShootingPercentage = d6;
        this.effectiveFieldGoalPercentage = d7;
        this.usage = d8;
        this.individualOffensiveRating = d9;
        this.individualDefensiveRating = d10;
        this.playerEfficiencyRating = d11;
    }
}
