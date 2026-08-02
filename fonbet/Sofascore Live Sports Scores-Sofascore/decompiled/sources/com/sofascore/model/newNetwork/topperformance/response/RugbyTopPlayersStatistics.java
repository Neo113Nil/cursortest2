package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.RugbyTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.RugbyTopPlayersStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import defpackage.fc6;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.t9g;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wtf;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 z2\u00020\u0001:\u0002{zB\u0085\u0005\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#B\u0099\u0005\b\u0010\u0012\u0006\u0010%\u001a\u00020$\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b\"\u0010(J\u001e\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u001e\u0010+\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010*J\u001e\u0010,\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010*J\u001e\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010*J\u001e\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010*J\u001e\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010*J\u001e\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010*J\u001e\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010*J\u001e\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010*J\u001e\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010*J\u001e\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010*J\u001e\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010*J\u001e\u00106\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010*J\u001e\u00107\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010*J\u001e\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010*J\u001e\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010*J\u001e\u0010:\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010*J\u001e\u0010;\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010*J\u001e\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010*J\u001e\u0010=\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010*J\u001e\u0010>\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010*J\u001e\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010*J\u001e\u0010@\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010*J\u001e\u0010A\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010*J\u001e\u0010B\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010*J\u001e\u0010C\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010*J\u001e\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010*J\u001e\u0010E\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010*J\u001e\u0010F\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010*JÈ\u0005\u0010G\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010J\u001a\u00020IHÖ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020$HÖ\u0001¢\u0006\u0004\bL\u0010MJ\u001a\u0010Q\u001a\u00020P2\b\u0010O\u001a\u0004\u0018\u00010NHÖ\u0003¢\u0006\u0004\bQ\u0010RJ'\u0010[\u001a\u00020X2\u0006\u0010S\u001a\u00020\u00002\u0006\u0010U\u001a\u00020T2\u0006\u0010W\u001a\u00020VH\u0001¢\u0006\u0004\bY\u0010ZR%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\\\u001a\u0004\b]\u0010*R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\\\u001a\u0004\b^\u0010*R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\\\u001a\u0004\b_\u0010*R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\\\u001a\u0004\b`\u0010*R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\\\u001a\u0004\ba\u0010*R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\\\u001a\u0004\bb\u0010*R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\\\u001a\u0004\bc\u0010*R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\\\u001a\u0004\bd\u0010*R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\\\u001a\u0004\be\u0010*R%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\\\u001a\u0004\bf\u0010*R%\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\\\u001a\u0004\bg\u0010*R%\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\\\u001a\u0004\bh\u0010*R%\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\\\u001a\u0004\bi\u0010*R%\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\\\u001a\u0004\bj\u0010*R%\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\\\u001a\u0004\bk\u0010*R%\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\\\u001a\u0004\bl\u0010*R%\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\\\u001a\u0004\bm\u0010*R%\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\bn\u0010*R%\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\\\u001a\u0004\bo\u0010*R%\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\\\u001a\u0004\bp\u0010*R%\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\\\u001a\u0004\bq\u0010*R%\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\\\u001a\u0004\br\u0010*R%\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\\\u001a\u0004\bs\u0010*R%\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\\\u001a\u0004\bt\u0010*R%\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\\\u001a\u0004\bu\u0010*R%\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\\\u001a\u0004\bv\u0010*R%\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\\\u001a\u0004\bw\u0010*R%\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\\\u001a\u0004\bx\u0010*R%\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\\\u001a\u0004\by\u0010*¨\u0006|"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/RugbyTopPlayersStatisticsItem;", "points", "tries", "penaltyGoals", "conversions", "dropGoals", "passesSuccessful", "offloads", "carries", "cleanBreaks", "defendersBeaten", "metresMade", "handlingError", "carriesCrossedGainLine", "carriesNotMadeGainLine", "kickMetres", "kicksFromHand", "postContactMetres", "tryAssist", "tackles", "dominantTackles", "penDefs", "penOffs", "lineoutsWon", "lineoutWonSteal", "ruckArrival", "ruckArrivalAttack", "ruckArrivalDefence", "yellowCards", "redCards", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopPlayersStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopPlayersStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPoints", "getTries", "getPenaltyGoals", "getConversions", "getDropGoals", "getPassesSuccessful", "getOffloads", "getCarries", "getCleanBreaks", "getDefendersBeaten", "getMetresMade", "getHandlingError", "getCarriesCrossedGainLine", "getCarriesNotMadeGainLine", "getKickMetres", "getKicksFromHand", "getPostContactMetres", "getTryAssist", "getTackles", "getDominantTackles", "getPenDefs", "getPenOffs", "getLineoutsWon", "getLineoutWonSteal", "getRuckArrival", "getRuckArrivalAttack", "getRuckArrivalDefence", "getYellowCards", "getRedCards", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RugbyTopPlayersStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> carries;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> carriesCrossedGainLine;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> carriesNotMadeGainLine;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> cleanBreaks;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> conversions;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> defendersBeaten;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> dominantTackles;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> dropGoals;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> handlingError;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> kickMetres;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> kicksFromHand;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> lineoutWonSteal;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> lineoutsWon;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> metresMade;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> offloads;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> passesSuccessful;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> penDefs;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> penOffs;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> penaltyGoals;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> points;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> postContactMetres;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> redCards;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> ruckArrival;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> ruckArrivalAttack;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> ruckArrivalDefence;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> tackles;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> tries;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> tryAssist;

    @Nullable
    private final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> yellowCards;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new wtf(10)), ypa.a(ysaVar, new wtf(12)), ypa.a(ysaVar, new wtf(23)), ypa.a(ysaVar, new wtf(24)), ypa.a(ysaVar, new wtf(25)), ypa.a(ysaVar, new wtf(26)), ypa.a(ysaVar, new wtf(27)), ypa.a(ysaVar, new wtf(28)), ypa.a(ysaVar, new wtf(29)), ypa.a(ysaVar, new t9g(0)), ypa.a(ysaVar, new wtf(21)), ypa.a(ysaVar, new t9g(1)), ypa.a(ysaVar, new t9g(2)), ypa.a(ysaVar, new t9g(3)), ypa.a(ysaVar, new t9g(4)), ypa.a(ysaVar, new t9g(5)), ypa.a(ysaVar, new t9g(6)), ypa.a(ysaVar, new t9g(7)), ypa.a(ysaVar, new t9g(8)), ypa.a(ysaVar, new wtf(11)), ypa.a(ysaVar, new wtf(13)), ypa.a(ysaVar, new wtf(14)), ypa.a(ysaVar, new wtf(15)), ypa.a(ysaVar, new wtf(16)), ypa.a(ysaVar, new wtf(17)), ypa.a(ysaVar, new wtf(18)), ypa.a(ysaVar, new wtf(19)), ypa.a(ysaVar, new wtf(20)), ypa.a(ysaVar, new wtf(22))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RugbyTopPlayersStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, t5h t5hVar) {
        super(i, t5hVar);
        if (536870911 != (i & 536870911)) {
            oea.z(i, 536870911, RugbyTopPlayersStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = list;
        this.tries = list2;
        this.penaltyGoals = list3;
        this.conversions = list4;
        this.dropGoals = list5;
        this.passesSuccessful = list6;
        this.offloads = list7;
        this.carries = list8;
        this.cleanBreaks = list9;
        this.defendersBeaten = list10;
        this.metresMade = list11;
        this.handlingError = list12;
        this.carriesCrossedGainLine = list13;
        this.carriesNotMadeGainLine = list14;
        this.kickMetres = list15;
        this.kicksFromHand = list16;
        this.postContactMetres = list17;
        this.tryAssist = list18;
        this.tackles = list19;
        this.dominantTackles = list20;
        this.penDefs = list21;
        this.penOffs = list22;
        this.lineoutsWon = list23;
        this.lineoutWonSteal = list24;
        this.ruckArrival = list25;
        this.ruckArrivalAttack = list26;
        this.ruckArrivalDefence = list27;
        this.yellowCards = list28;
        this.redCards = list29;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$13() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$14() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$15() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$16() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$17() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$18() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$19() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$20() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$21() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$22() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$23() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$24() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$25() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$26() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$27() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(RugbyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ RugbyTopPlayersStatistics copy$default(RugbyTopPlayersStatistics rugbyTopPlayersStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, int i, Object obj) {
        List list30;
        List list31;
        List list32 = (i & 1) != 0 ? rugbyTopPlayersStatistics.points : list;
        List list33 = (i & 2) != 0 ? rugbyTopPlayersStatistics.tries : list2;
        List list34 = (i & 4) != 0 ? rugbyTopPlayersStatistics.penaltyGoals : list3;
        List list35 = (i & 8) != 0 ? rugbyTopPlayersStatistics.conversions : list4;
        List list36 = (i & 16) != 0 ? rugbyTopPlayersStatistics.dropGoals : list5;
        List list37 = (i & 32) != 0 ? rugbyTopPlayersStatistics.passesSuccessful : list6;
        List list38 = (i & 64) != 0 ? rugbyTopPlayersStatistics.offloads : list7;
        List list39 = (i & 128) != 0 ? rugbyTopPlayersStatistics.carries : list8;
        List list40 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? rugbyTopPlayersStatistics.cleanBreaks : list9;
        List list41 = (i & 512) != 0 ? rugbyTopPlayersStatistics.defendersBeaten : list10;
        List list42 = (i & 1024) != 0 ? rugbyTopPlayersStatistics.metresMade : list11;
        List list43 = (i & a.o) != 0 ? rugbyTopPlayersStatistics.handlingError : list12;
        List list44 = (i & 4096) != 0 ? rugbyTopPlayersStatistics.carriesCrossedGainLine : list13;
        List list45 = (i & 8192) != 0 ? rugbyTopPlayersStatistics.carriesNotMadeGainLine : list14;
        List list46 = list32;
        List list47 = (i & 16384) != 0 ? rugbyTopPlayersStatistics.kickMetres : list15;
        List list48 = (i & 32768) != 0 ? rugbyTopPlayersStatistics.kicksFromHand : list16;
        List list49 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? rugbyTopPlayersStatistics.postContactMetres : list17;
        List list50 = (i & 131072) != 0 ? rugbyTopPlayersStatistics.tryAssist : list18;
        List list51 = (i & 262144) != 0 ? rugbyTopPlayersStatistics.tackles : list19;
        List list52 = (i & 524288) != 0 ? rugbyTopPlayersStatistics.dominantTackles : list20;
        List list53 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? rugbyTopPlayersStatistics.penDefs : list21;
        List list54 = (i & 2097152) != 0 ? rugbyTopPlayersStatistics.penOffs : list22;
        List list55 = (i & 4194304) != 0 ? rugbyTopPlayersStatistics.lineoutsWon : list23;
        List list56 = (i & 8388608) != 0 ? rugbyTopPlayersStatistics.lineoutWonSteal : list24;
        List list57 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? rugbyTopPlayersStatistics.ruckArrival : list25;
        List list58 = (i & 33554432) != 0 ? rugbyTopPlayersStatistics.ruckArrivalAttack : list26;
        List list59 = (i & 67108864) != 0 ? rugbyTopPlayersStatistics.ruckArrivalDefence : list27;
        List list60 = (i & 134217728) != 0 ? rugbyTopPlayersStatistics.yellowCards : list28;
        if ((i & 268435456) != 0) {
            list31 = list60;
            list30 = rugbyTopPlayersStatistics.redCards;
        } else {
            list30 = list29;
            list31 = list60;
        }
        return rugbyTopPlayersStatistics.copy(list46, list33, list34, list35, list36, list37, list38, list39, list40, list41, list42, list43, list44, list45, list47, list48, list49, list50, list51, list52, list53, list54, list55, list56, list57, list58, list59, list31, list30);
    }

    public static final /* synthetic */ void write$Self$model_release(RugbyTopPlayersStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.points);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.tries);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.penaltyGoals);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.conversions);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.dropGoals);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.passesSuccessful);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.offloads);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.carries);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.cleanBreaks);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.defendersBeaten);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.metresMade);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.handlingError);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.carriesCrossedGainLine);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.carriesNotMadeGainLine);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.kickMetres);
        output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.kicksFromHand);
        output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.postContactMetres);
        output.h(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.tryAssist);
        output.h(serialDesc, 18, (KSerializer) joaVarArr[18].getValue(), self.tackles);
        output.h(serialDesc, 19, (KSerializer) joaVarArr[19].getValue(), self.dominantTackles);
        output.h(serialDesc, 20, (KSerializer) joaVarArr[20].getValue(), self.penDefs);
        output.h(serialDesc, 21, (KSerializer) joaVarArr[21].getValue(), self.penOffs);
        output.h(serialDesc, 22, (KSerializer) joaVarArr[22].getValue(), self.lineoutsWon);
        output.h(serialDesc, 23, (KSerializer) joaVarArr[23].getValue(), self.lineoutWonSteal);
        output.h(serialDesc, 24, (KSerializer) joaVarArr[24].getValue(), self.ruckArrival);
        output.h(serialDesc, 25, (KSerializer) joaVarArr[25].getValue(), self.ruckArrivalAttack);
        output.h(serialDesc, 26, (KSerializer) joaVarArr[26].getValue(), self.ruckArrivalDefence);
        output.h(serialDesc, 27, (KSerializer) joaVarArr[27].getValue(), self.yellowCards);
        output.h(serialDesc, 28, (KSerializer) joaVarArr[28].getValue(), self.redCards);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component1() {
        return this.points;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component10() {
        return this.defendersBeaten;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component11() {
        return this.metresMade;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component12() {
        return this.handlingError;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component13() {
        return this.carriesCrossedGainLine;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component14() {
        return this.carriesNotMadeGainLine;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component15() {
        return this.kickMetres;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component16() {
        return this.kicksFromHand;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component17() {
        return this.postContactMetres;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component18() {
        return this.tryAssist;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component19() {
        return this.tackles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component2() {
        return this.tries;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component20() {
        return this.dominantTackles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component21() {
        return this.penDefs;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component22() {
        return this.penOffs;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component23() {
        return this.lineoutsWon;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component24() {
        return this.lineoutWonSteal;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component25() {
        return this.ruckArrival;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component26() {
        return this.ruckArrivalAttack;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component27() {
        return this.ruckArrivalDefence;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component28() {
        return this.yellowCards;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component29() {
        return this.redCards;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component3() {
        return this.penaltyGoals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component4() {
        return this.conversions;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component5() {
        return this.dropGoals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component6() {
        return this.passesSuccessful;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component7() {
        return this.offloads;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component8() {
        return this.carries;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> component9() {
        return this.cleanBreaks;
    }

    @NotNull
    public final RugbyTopPlayersStatistics copy(@Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> points, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> tries, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> penaltyGoals, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> conversions, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> dropGoals, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> passesSuccessful, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> offloads, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> carries, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> cleanBreaks, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> defendersBeaten, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> metresMade, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> handlingError, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> carriesCrossedGainLine, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> carriesNotMadeGainLine, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> kickMetres, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> kicksFromHand, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> postContactMetres, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> tryAssist, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> tackles, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> dominantTackles, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> penDefs, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> penOffs, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> lineoutsWon, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> lineoutWonSteal, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> ruckArrival, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> ruckArrivalAttack, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> ruckArrivalDefence, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> yellowCards, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> redCards) {
        return new RugbyTopPlayersStatistics(points, tries, penaltyGoals, conversions, dropGoals, passesSuccessful, offloads, carries, cleanBreaks, defendersBeaten, metresMade, handlingError, carriesCrossedGainLine, carriesNotMadeGainLine, kickMetres, kicksFromHand, postContactMetres, tryAssist, tackles, dominantTackles, penDefs, penOffs, lineoutsWon, lineoutWonSteal, ruckArrival, ruckArrivalAttack, ruckArrivalDefence, yellowCards, redCards);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RugbyTopPlayersStatistics)) {
            return false;
        }
        RugbyTopPlayersStatistics rugbyTopPlayersStatistics = (RugbyTopPlayersStatistics) other;
        return Intrinsics.c(this.points, rugbyTopPlayersStatistics.points) && Intrinsics.c(this.tries, rugbyTopPlayersStatistics.tries) && Intrinsics.c(this.penaltyGoals, rugbyTopPlayersStatistics.penaltyGoals) && Intrinsics.c(this.conversions, rugbyTopPlayersStatistics.conversions) && Intrinsics.c(this.dropGoals, rugbyTopPlayersStatistics.dropGoals) && Intrinsics.c(this.passesSuccessful, rugbyTopPlayersStatistics.passesSuccessful) && Intrinsics.c(this.offloads, rugbyTopPlayersStatistics.offloads) && Intrinsics.c(this.carries, rugbyTopPlayersStatistics.carries) && Intrinsics.c(this.cleanBreaks, rugbyTopPlayersStatistics.cleanBreaks) && Intrinsics.c(this.defendersBeaten, rugbyTopPlayersStatistics.defendersBeaten) && Intrinsics.c(this.metresMade, rugbyTopPlayersStatistics.metresMade) && Intrinsics.c(this.handlingError, rugbyTopPlayersStatistics.handlingError) && Intrinsics.c(this.carriesCrossedGainLine, rugbyTopPlayersStatistics.carriesCrossedGainLine) && Intrinsics.c(this.carriesNotMadeGainLine, rugbyTopPlayersStatistics.carriesNotMadeGainLine) && Intrinsics.c(this.kickMetres, rugbyTopPlayersStatistics.kickMetres) && Intrinsics.c(this.kicksFromHand, rugbyTopPlayersStatistics.kicksFromHand) && Intrinsics.c(this.postContactMetres, rugbyTopPlayersStatistics.postContactMetres) && Intrinsics.c(this.tryAssist, rugbyTopPlayersStatistics.tryAssist) && Intrinsics.c(this.tackles, rugbyTopPlayersStatistics.tackles) && Intrinsics.c(this.dominantTackles, rugbyTopPlayersStatistics.dominantTackles) && Intrinsics.c(this.penDefs, rugbyTopPlayersStatistics.penDefs) && Intrinsics.c(this.penOffs, rugbyTopPlayersStatistics.penOffs) && Intrinsics.c(this.lineoutsWon, rugbyTopPlayersStatistics.lineoutsWon) && Intrinsics.c(this.lineoutWonSteal, rugbyTopPlayersStatistics.lineoutWonSteal) && Intrinsics.c(this.ruckArrival, rugbyTopPlayersStatistics.ruckArrival) && Intrinsics.c(this.ruckArrivalAttack, rugbyTopPlayersStatistics.ruckArrivalAttack) && Intrinsics.c(this.ruckArrivalDefence, rugbyTopPlayersStatistics.ruckArrivalDefence) && Intrinsics.c(this.yellowCards, rugbyTopPlayersStatistics.yellowCards) && Intrinsics.c(this.redCards, rugbyTopPlayersStatistics.redCards);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getCarries() {
        return this.carries;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getCarriesCrossedGainLine() {
        return this.carriesCrossedGainLine;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getCarriesNotMadeGainLine() {
        return this.carriesNotMadeGainLine;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getCleanBreaks() {
        return this.cleanBreaks;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getConversions() {
        return this.conversions;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getDefendersBeaten() {
        return this.defendersBeaten;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getDominantTackles() {
        return this.dominantTackles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getDropGoals() {
        return this.dropGoals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getHandlingError() {
        return this.handlingError;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getKickMetres() {
        return this.kickMetres;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getKicksFromHand() {
        return this.kicksFromHand;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getLineoutWonSteal() {
        return this.lineoutWonSteal;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getLineoutsWon() {
        return this.lineoutsWon;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getMetresMade() {
        return this.metresMade;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getOffloads() {
        return this.offloads;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getPassesSuccessful() {
        return this.passesSuccessful;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getPenDefs() {
        return this.penDefs;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getPenOffs() {
        return this.penOffs;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getPoints() {
        return this.points;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getPostContactMetres() {
        return this.postContactMetres;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getRedCards() {
        return this.redCards;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getRuckArrival() {
        return this.ruckArrival;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getRuckArrivalAttack() {
        return this.ruckArrivalAttack;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getRuckArrivalDefence() {
        return this.ruckArrivalDefence;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getTackles() {
        return this.tackles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getTries() {
        return this.tries;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getTryAssist() {
        return this.tryAssist;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list = this.points;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list2 = this.tries;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list3 = this.penaltyGoals;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list4 = this.conversions;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list5 = this.dropGoals;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list6 = this.passesSuccessful;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list7 = this.offloads;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list8 = this.carries;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list9 = this.cleanBreaks;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list10 = this.defendersBeaten;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list11 = this.metresMade;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list12 = this.handlingError;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list13 = this.carriesCrossedGainLine;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list14 = this.carriesNotMadeGainLine;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list15 = this.kickMetres;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list16 = this.kicksFromHand;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list17 = this.postContactMetres;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list18 = this.tryAssist;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list19 = this.tackles;
        int hashCode19 = (hashCode18 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list20 = this.dominantTackles;
        int hashCode20 = (hashCode19 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list21 = this.penDefs;
        int hashCode21 = (hashCode20 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list22 = this.penOffs;
        int hashCode22 = (hashCode21 + (list22 == null ? 0 : list22.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list23 = this.lineoutsWon;
        int hashCode23 = (hashCode22 + (list23 == null ? 0 : list23.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list24 = this.lineoutWonSteal;
        int hashCode24 = (hashCode23 + (list24 == null ? 0 : list24.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list25 = this.ruckArrival;
        int hashCode25 = (hashCode24 + (list25 == null ? 0 : list25.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list26 = this.ruckArrivalAttack;
        int hashCode26 = (hashCode25 + (list26 == null ? 0 : list26.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list27 = this.ruckArrivalDefence;
        int hashCode27 = (hashCode26 + (list27 == null ? 0 : list27.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list28 = this.yellowCards;
        int hashCode28 = (hashCode27 + (list28 == null ? 0 : list28.hashCode())) * 31;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list29 = this.redCards;
        return hashCode28 + (list29 != null ? list29.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list = this.points;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list2 = this.tries;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list3 = this.penaltyGoals;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list4 = this.conversions;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list5 = this.dropGoals;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list6 = this.passesSuccessful;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list7 = this.offloads;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list8 = this.carries;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list9 = this.cleanBreaks;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list10 = this.defendersBeaten;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list11 = this.metresMade;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list12 = this.handlingError;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list13 = this.carriesCrossedGainLine;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list14 = this.carriesNotMadeGainLine;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list15 = this.kickMetres;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list16 = this.kicksFromHand;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list17 = this.postContactMetres;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list18 = this.tryAssist;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list19 = this.tackles;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list20 = this.dominantTackles;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list21 = this.penDefs;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list22 = this.penOffs;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list23 = this.lineoutsWon;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list24 = this.lineoutWonSteal;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list25 = this.ruckArrival;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list26 = this.ruckArrivalAttack;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list27 = this.ruckArrivalDefence;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list28 = this.yellowCards;
        List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list29 = this.redCards;
        StringBuilder s = fc6.s("RugbyTopPlayersStatistics(points=", ", tries=", ", penaltyGoals=", list, list2);
        vxd.w(s, list3, ", conversions=", list4, ", dropGoals=");
        vxd.w(s, list5, ", passesSuccessful=", list6, ", offloads=");
        vxd.w(s, list7, ", carries=", list8, ", cleanBreaks=");
        vxd.w(s, list9, ", defendersBeaten=", list10, ", metresMade=");
        vxd.w(s, list11, ", handlingError=", list12, ", carriesCrossedGainLine=");
        vxd.w(s, list13, ", carriesNotMadeGainLine=", list14, ", kickMetres=");
        vxd.w(s, list15, ", kicksFromHand=", list16, ", postContactMetres=");
        vxd.w(s, list17, ", tryAssist=", list18, ", tackles=");
        vxd.w(s, list19, ", dominantTackles=", list20, ", penDefs=");
        vxd.w(s, list21, ", penOffs=", list22, ", lineoutsWon=");
        vxd.w(s, list23, ", lineoutWonSteal=", list24, ", ruckArrival=");
        vxd.w(s, list25, ", ruckArrivalAttack=", list26, ", ruckArrivalDefence=");
        vxd.w(s, list27, ", yellowCards=", list28, ", redCards=");
        return mz1.p(s, list29, ")");
    }

    public RugbyTopPlayersStatistics(@Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list2, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list3, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list4, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list5, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list6, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list7, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list8, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list9, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list10, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list11, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list12, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list13, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list14, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list15, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list16, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list17, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list18, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list19, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list20, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list21, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list22, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list23, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list24, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list25, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list26, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list27, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list28, @Nullable List<TopPlayersStatisticsItem<RugbyTopPlayersStatisticsItem>> list29) {
        super(null);
        this.points = list;
        this.tries = list2;
        this.penaltyGoals = list3;
        this.conversions = list4;
        this.dropGoals = list5;
        this.passesSuccessful = list6;
        this.offloads = list7;
        this.carries = list8;
        this.cleanBreaks = list9;
        this.defendersBeaten = list10;
        this.metresMade = list11;
        this.handlingError = list12;
        this.carriesCrossedGainLine = list13;
        this.carriesNotMadeGainLine = list14;
        this.kickMetres = list15;
        this.kicksFromHand = list16;
        this.postContactMetres = list17;
        this.tryAssist = list18;
        this.tackles = list19;
        this.dominantTackles = list20;
        this.penDefs = list21;
        this.penOffs = list22;
        this.lineoutsWon = list23;
        this.lineoutWonSteal = list24;
        this.ruckArrival = list25;
        this.ruckArrivalAttack = list26;
        this.ruckArrivalDefence = list27;
        this.yellowCards = list28;
        this.redCards = list29;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopPlayersStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopPlayersStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RugbyTopPlayersStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
