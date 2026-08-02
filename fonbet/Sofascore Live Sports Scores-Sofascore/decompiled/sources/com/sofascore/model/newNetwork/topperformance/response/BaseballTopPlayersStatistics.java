package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseballTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseballTopPlayersStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import defpackage.fc6;
import defpackage.i91;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ym1;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 t2\u00020\u0001:\u0002utBÙ\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b \u0010!Bí\u0004\b\u0010\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b \u0010&J\u001e\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J\u001e\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010(J\u001e\u0010+\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010(J\u001e\u0010,\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010(J\u001e\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010(J\u001e\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010(J\u001e\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010(J\u001e\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010(J\u001e\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010(J\u001e\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010(J\u001e\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010(J\u001e\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010(J\u001e\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010(J\u001e\u00106\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010(J\u001e\u00107\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010(J\u001e\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010(J\u001e\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010(J\u001e\u0010:\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010(J\u001e\u0010;\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010(J\u001e\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010(J\u001e\u0010=\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010(J\u001e\u0010>\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010(J\u001e\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010(J\u001e\u0010@\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010(J\u001e\u0010A\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010(J\u001e\u0010B\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010(J\u0098\u0005\u0010C\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010F\u001a\u00020EHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\"HÖ\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010M\u001a\u00020L2\b\u0010K\u001a\u0004\u0018\u00010JHÖ\u0003¢\u0006\u0004\bM\u0010NJ'\u0010W\u001a\u00020T2\u0006\u0010O\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RH\u0001¢\u0006\u0004\bU\u0010VR%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010X\u001a\u0004\bY\u0010(R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010X\u001a\u0004\bZ\u0010(R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010X\u001a\u0004\b[\u0010(R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010X\u001a\u0004\b\\\u0010(R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010X\u001a\u0004\b]\u0010(R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010X\u001a\u0004\b^\u0010(R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010X\u001a\u0004\b_\u0010(R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010X\u001a\u0004\b`\u0010(R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010X\u001a\u0004\ba\u0010(R%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\bb\u0010(R%\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bc\u0010(R%\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010X\u001a\u0004\bd\u0010(R%\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010X\u001a\u0004\be\u0010(R%\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010X\u001a\u0004\bf\u0010(R%\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010X\u001a\u0004\bg\u0010(R%\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010X\u001a\u0004\bh\u0010(R%\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\bi\u0010(R%\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010X\u001a\u0004\bj\u0010(R%\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010X\u001a\u0004\bk\u0010(R%\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\bl\u0010(R%\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010X\u001a\u0004\bm\u0010(R%\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010X\u001a\u0004\bn\u0010(R%\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010X\u001a\u0004\bo\u0010(R%\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010X\u001a\u0004\bp\u0010(R%\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010X\u001a\u0004\bq\u0010(R%\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010X\u001a\u0004\br\u0010(R%\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010X\u001a\u0004\bs\u0010(¨\u0006v"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/BaseballTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseballTopPlayersStatisticsItem;", "battingAtBats", "battingHits", "battingHomeRuns", "battingAvg", "battingRuns", "battingRbi", "battingStolenBases", "battingOnBasePercentage", "battingSluggingPercentage", "war", "pitchingGamesPlayed", "pitchingWins", "pitchingLosses", "pitchingSaves", "pitchingInningsPitched", "pitchingEarnedRunsAverage", "pitchingStrikeOuts", "pitchingQualityStarts", "pitchingWhip", "pitchingWar", "pitchingFieldingIndependentPitching", "pitchingOpponentBattingAvg", "fieldingPutOuts", "fieldingAssists", "fieldingTotalErrors", "fieldingDoublePlays", "fieldingChances", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/BaseballTopPlayersStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/BaseballTopPlayersStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getBattingAtBats", "getBattingHits", "getBattingHomeRuns", "getBattingAvg", "getBattingRuns", "getBattingRbi", "getBattingStolenBases", "getBattingOnBasePercentage", "getBattingSluggingPercentage", "getWar", "getPitchingGamesPlayed", "getPitchingWins", "getPitchingLosses", "getPitchingSaves", "getPitchingInningsPitched", "getPitchingEarnedRunsAverage", "getPitchingStrikeOuts", "getPitchingQualityStarts", "getPitchingWhip", "getPitchingWar", "getPitchingFieldingIndependentPitching", "getPitchingOpponentBattingAvg", "getFieldingPutOuts", "getFieldingAssists", "getFieldingTotalErrors", "getFieldingDoublePlays", "getFieldingChances", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BaseballTopPlayersStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingAtBats;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingAvg;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingHits;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingHomeRuns;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingOnBasePercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingRbi;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingRuns;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingSluggingPercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingStolenBases;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> fieldingAssists;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> fieldingChances;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> fieldingDoublePlays;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> fieldingPutOuts;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> fieldingTotalErrors;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingEarnedRunsAverage;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingFieldingIndependentPitching;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingGamesPlayed;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingInningsPitched;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingLosses;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingOpponentBattingAvg;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingQualityStarts;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingSaves;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingStrikeOuts;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingWar;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingWhip;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingWins;

    @Nullable
    private final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> war;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new i91(10)), ypa.a(ysaVar, new i91(12)), ypa.a(ysaVar, new i91(20)), ypa.a(ysaVar, new i91(22)), ypa.a(ysaVar, new i91(23)), ypa.a(ysaVar, new i91(24)), ypa.a(ysaVar, new i91(25)), ypa.a(ysaVar, new i91(26)), ypa.a(ysaVar, new i91(27)), ypa.a(ysaVar, new i91(28)), ypa.a(ysaVar, new i91(21)), ypa.a(ysaVar, new i91(29)), ypa.a(ysaVar, new ym1(0)), ypa.a(ysaVar, new ym1(1)), ypa.a(ysaVar, new ym1(2)), ypa.a(ysaVar, new ym1(3)), ypa.a(ysaVar, new ym1(4)), ypa.a(ysaVar, new ym1(5)), ypa.a(ysaVar, new ym1(6)), ypa.a(ysaVar, new i91(11)), ypa.a(ysaVar, new i91(13)), ypa.a(ysaVar, new i91(14)), ypa.a(ysaVar, new i91(15)), ypa.a(ysaVar, new i91(16)), ypa.a(ysaVar, new i91(17)), ypa.a(ysaVar, new i91(18)), ypa.a(ysaVar, new i91(19))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseballTopPlayersStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, t5h t5hVar) {
        super(i, t5hVar);
        if (134217727 != (i & 134217727)) {
            oea.z(i, 134217727, BaseballTopPlayersStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.battingAtBats = list;
        this.battingHits = list2;
        this.battingHomeRuns = list3;
        this.battingAvg = list4;
        this.battingRuns = list5;
        this.battingRbi = list6;
        this.battingStolenBases = list7;
        this.battingOnBasePercentage = list8;
        this.battingSluggingPercentage = list9;
        this.war = list10;
        this.pitchingGamesPlayed = list11;
        this.pitchingWins = list12;
        this.pitchingLosses = list13;
        this.pitchingSaves = list14;
        this.pitchingInningsPitched = list15;
        this.pitchingEarnedRunsAverage = list16;
        this.pitchingStrikeOuts = list17;
        this.pitchingQualityStarts = list18;
        this.pitchingWhip = list19;
        this.pitchingWar = list20;
        this.pitchingFieldingIndependentPitching = list21;
        this.pitchingOpponentBattingAvg = list22;
        this.fieldingPutOuts = list23;
        this.fieldingAssists = list24;
        this.fieldingTotalErrors = list25;
        this.fieldingDoublePlays = list26;
        this.fieldingChances = list27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$13() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$14() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$15() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$16() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$17() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$18() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$19() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$20() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$21() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$22() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$23() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$24() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$25() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BaseballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ BaseballTopPlayersStatistics copy$default(BaseballTopPlayersStatistics baseballTopPlayersStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, int i, Object obj) {
        List list28;
        List list29;
        List list30 = (i & 1) != 0 ? baseballTopPlayersStatistics.battingAtBats : list;
        List list31 = (i & 2) != 0 ? baseballTopPlayersStatistics.battingHits : list2;
        List list32 = (i & 4) != 0 ? baseballTopPlayersStatistics.battingHomeRuns : list3;
        List list33 = (i & 8) != 0 ? baseballTopPlayersStatistics.battingAvg : list4;
        List list34 = (i & 16) != 0 ? baseballTopPlayersStatistics.battingRuns : list5;
        List list35 = (i & 32) != 0 ? baseballTopPlayersStatistics.battingRbi : list6;
        List list36 = (i & 64) != 0 ? baseballTopPlayersStatistics.battingStolenBases : list7;
        List list37 = (i & 128) != 0 ? baseballTopPlayersStatistics.battingOnBasePercentage : list8;
        List list38 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? baseballTopPlayersStatistics.battingSluggingPercentage : list9;
        List list39 = (i & 512) != 0 ? baseballTopPlayersStatistics.war : list10;
        List list40 = (i & 1024) != 0 ? baseballTopPlayersStatistics.pitchingGamesPlayed : list11;
        List list41 = (i & a.o) != 0 ? baseballTopPlayersStatistics.pitchingWins : list12;
        List list42 = (i & 4096) != 0 ? baseballTopPlayersStatistics.pitchingLosses : list13;
        List list43 = (i & 8192) != 0 ? baseballTopPlayersStatistics.pitchingSaves : list14;
        List list44 = list30;
        List list45 = (i & 16384) != 0 ? baseballTopPlayersStatistics.pitchingInningsPitched : list15;
        List list46 = (i & 32768) != 0 ? baseballTopPlayersStatistics.pitchingEarnedRunsAverage : list16;
        List list47 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? baseballTopPlayersStatistics.pitchingStrikeOuts : list17;
        List list48 = (i & 131072) != 0 ? baseballTopPlayersStatistics.pitchingQualityStarts : list18;
        List list49 = (i & 262144) != 0 ? baseballTopPlayersStatistics.pitchingWhip : list19;
        List list50 = (i & 524288) != 0 ? baseballTopPlayersStatistics.pitchingWar : list20;
        List list51 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? baseballTopPlayersStatistics.pitchingFieldingIndependentPitching : list21;
        List list52 = (i & 2097152) != 0 ? baseballTopPlayersStatistics.pitchingOpponentBattingAvg : list22;
        List list53 = (i & 4194304) != 0 ? baseballTopPlayersStatistics.fieldingPutOuts : list23;
        List list54 = (i & 8388608) != 0 ? baseballTopPlayersStatistics.fieldingAssists : list24;
        List list55 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? baseballTopPlayersStatistics.fieldingTotalErrors : list25;
        List list56 = (i & 33554432) != 0 ? baseballTopPlayersStatistics.fieldingDoublePlays : list26;
        if ((i & 67108864) != 0) {
            list29 = list56;
            list28 = baseballTopPlayersStatistics.fieldingChances;
        } else {
            list28 = list27;
            list29 = list56;
        }
        return baseballTopPlayersStatistics.copy(list44, list31, list32, list33, list34, list35, list36, list37, list38, list39, list40, list41, list42, list43, list45, list46, list47, list48, list49, list50, list51, list52, list53, list54, list55, list29, list28);
    }

    public static final /* synthetic */ void write$Self$model_release(BaseballTopPlayersStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.battingAtBats);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.battingHits);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.battingHomeRuns);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.battingAvg);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.battingRuns);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.battingRbi);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.battingStolenBases);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.battingOnBasePercentage);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.battingSluggingPercentage);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.war);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.pitchingGamesPlayed);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.pitchingWins);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.pitchingLosses);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.pitchingSaves);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.pitchingInningsPitched);
        output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.pitchingEarnedRunsAverage);
        output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.pitchingStrikeOuts);
        output.h(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.pitchingQualityStarts);
        output.h(serialDesc, 18, (KSerializer) joaVarArr[18].getValue(), self.pitchingWhip);
        output.h(serialDesc, 19, (KSerializer) joaVarArr[19].getValue(), self.pitchingWar);
        output.h(serialDesc, 20, (KSerializer) joaVarArr[20].getValue(), self.pitchingFieldingIndependentPitching);
        output.h(serialDesc, 21, (KSerializer) joaVarArr[21].getValue(), self.pitchingOpponentBattingAvg);
        output.h(serialDesc, 22, (KSerializer) joaVarArr[22].getValue(), self.fieldingPutOuts);
        output.h(serialDesc, 23, (KSerializer) joaVarArr[23].getValue(), self.fieldingAssists);
        output.h(serialDesc, 24, (KSerializer) joaVarArr[24].getValue(), self.fieldingTotalErrors);
        output.h(serialDesc, 25, (KSerializer) joaVarArr[25].getValue(), self.fieldingDoublePlays);
        output.h(serialDesc, 26, (KSerializer) joaVarArr[26].getValue(), self.fieldingChances);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component1() {
        return this.battingAtBats;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component10() {
        return this.war;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component11() {
        return this.pitchingGamesPlayed;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component12() {
        return this.pitchingWins;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component13() {
        return this.pitchingLosses;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component14() {
        return this.pitchingSaves;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component15() {
        return this.pitchingInningsPitched;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component16() {
        return this.pitchingEarnedRunsAverage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component17() {
        return this.pitchingStrikeOuts;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component18() {
        return this.pitchingQualityStarts;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component19() {
        return this.pitchingWhip;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component2() {
        return this.battingHits;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component20() {
        return this.pitchingWar;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component21() {
        return this.pitchingFieldingIndependentPitching;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component22() {
        return this.pitchingOpponentBattingAvg;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component23() {
        return this.fieldingPutOuts;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component24() {
        return this.fieldingAssists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component25() {
        return this.fieldingTotalErrors;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component26() {
        return this.fieldingDoublePlays;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component27() {
        return this.fieldingChances;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component3() {
        return this.battingHomeRuns;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component4() {
        return this.battingAvg;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component5() {
        return this.battingRuns;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component6() {
        return this.battingRbi;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component7() {
        return this.battingStolenBases;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component8() {
        return this.battingOnBasePercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> component9() {
        return this.battingSluggingPercentage;
    }

    @NotNull
    public final BaseballTopPlayersStatistics copy(@Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingAtBats, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingHits, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingHomeRuns, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingAvg, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingRuns, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingRbi, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingStolenBases, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingOnBasePercentage, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> battingSluggingPercentage, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> war, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingGamesPlayed, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingWins, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingLosses, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingSaves, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingInningsPitched, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingEarnedRunsAverage, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingStrikeOuts, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingQualityStarts, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingWhip, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingWar, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingFieldingIndependentPitching, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> pitchingOpponentBattingAvg, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> fieldingPutOuts, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> fieldingAssists, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> fieldingTotalErrors, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> fieldingDoublePlays, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> fieldingChances) {
        return new BaseballTopPlayersStatistics(battingAtBats, battingHits, battingHomeRuns, battingAvg, battingRuns, battingRbi, battingStolenBases, battingOnBasePercentage, battingSluggingPercentage, war, pitchingGamesPlayed, pitchingWins, pitchingLosses, pitchingSaves, pitchingInningsPitched, pitchingEarnedRunsAverage, pitchingStrikeOuts, pitchingQualityStarts, pitchingWhip, pitchingWar, pitchingFieldingIndependentPitching, pitchingOpponentBattingAvg, fieldingPutOuts, fieldingAssists, fieldingTotalErrors, fieldingDoublePlays, fieldingChances);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseballTopPlayersStatistics)) {
            return false;
        }
        BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) other;
        return Intrinsics.c(this.battingAtBats, baseballTopPlayersStatistics.battingAtBats) && Intrinsics.c(this.battingHits, baseballTopPlayersStatistics.battingHits) && Intrinsics.c(this.battingHomeRuns, baseballTopPlayersStatistics.battingHomeRuns) && Intrinsics.c(this.battingAvg, baseballTopPlayersStatistics.battingAvg) && Intrinsics.c(this.battingRuns, baseballTopPlayersStatistics.battingRuns) && Intrinsics.c(this.battingRbi, baseballTopPlayersStatistics.battingRbi) && Intrinsics.c(this.battingStolenBases, baseballTopPlayersStatistics.battingStolenBases) && Intrinsics.c(this.battingOnBasePercentage, baseballTopPlayersStatistics.battingOnBasePercentage) && Intrinsics.c(this.battingSluggingPercentage, baseballTopPlayersStatistics.battingSluggingPercentage) && Intrinsics.c(this.war, baseballTopPlayersStatistics.war) && Intrinsics.c(this.pitchingGamesPlayed, baseballTopPlayersStatistics.pitchingGamesPlayed) && Intrinsics.c(this.pitchingWins, baseballTopPlayersStatistics.pitchingWins) && Intrinsics.c(this.pitchingLosses, baseballTopPlayersStatistics.pitchingLosses) && Intrinsics.c(this.pitchingSaves, baseballTopPlayersStatistics.pitchingSaves) && Intrinsics.c(this.pitchingInningsPitched, baseballTopPlayersStatistics.pitchingInningsPitched) && Intrinsics.c(this.pitchingEarnedRunsAverage, baseballTopPlayersStatistics.pitchingEarnedRunsAverage) && Intrinsics.c(this.pitchingStrikeOuts, baseballTopPlayersStatistics.pitchingStrikeOuts) && Intrinsics.c(this.pitchingQualityStarts, baseballTopPlayersStatistics.pitchingQualityStarts) && Intrinsics.c(this.pitchingWhip, baseballTopPlayersStatistics.pitchingWhip) && Intrinsics.c(this.pitchingWar, baseballTopPlayersStatistics.pitchingWar) && Intrinsics.c(this.pitchingFieldingIndependentPitching, baseballTopPlayersStatistics.pitchingFieldingIndependentPitching) && Intrinsics.c(this.pitchingOpponentBattingAvg, baseballTopPlayersStatistics.pitchingOpponentBattingAvg) && Intrinsics.c(this.fieldingPutOuts, baseballTopPlayersStatistics.fieldingPutOuts) && Intrinsics.c(this.fieldingAssists, baseballTopPlayersStatistics.fieldingAssists) && Intrinsics.c(this.fieldingTotalErrors, baseballTopPlayersStatistics.fieldingTotalErrors) && Intrinsics.c(this.fieldingDoublePlays, baseballTopPlayersStatistics.fieldingDoublePlays) && Intrinsics.c(this.fieldingChances, baseballTopPlayersStatistics.fieldingChances);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getBattingAtBats() {
        return this.battingAtBats;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getBattingAvg() {
        return this.battingAvg;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getBattingHits() {
        return this.battingHits;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getBattingHomeRuns() {
        return this.battingHomeRuns;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getBattingOnBasePercentage() {
        return this.battingOnBasePercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getBattingRbi() {
        return this.battingRbi;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getBattingRuns() {
        return this.battingRuns;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getBattingSluggingPercentage() {
        return this.battingSluggingPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getBattingStolenBases() {
        return this.battingStolenBases;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getFieldingAssists() {
        return this.fieldingAssists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getFieldingChances() {
        return this.fieldingChances;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getFieldingDoublePlays() {
        return this.fieldingDoublePlays;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getFieldingPutOuts() {
        return this.fieldingPutOuts;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getFieldingTotalErrors() {
        return this.fieldingTotalErrors;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getPitchingEarnedRunsAverage() {
        return this.pitchingEarnedRunsAverage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getPitchingFieldingIndependentPitching() {
        return this.pitchingFieldingIndependentPitching;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getPitchingGamesPlayed() {
        return this.pitchingGamesPlayed;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getPitchingInningsPitched() {
        return this.pitchingInningsPitched;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getPitchingLosses() {
        return this.pitchingLosses;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getPitchingOpponentBattingAvg() {
        return this.pitchingOpponentBattingAvg;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getPitchingQualityStarts() {
        return this.pitchingQualityStarts;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getPitchingSaves() {
        return this.pitchingSaves;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getPitchingStrikeOuts() {
        return this.pitchingStrikeOuts;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getPitchingWar() {
        return this.pitchingWar;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getPitchingWhip() {
        return this.pitchingWhip;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getPitchingWins() {
        return this.pitchingWins;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> getWar() {
        return this.war;
    }

    public int hashCode() {
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list = this.battingAtBats;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list2 = this.battingHits;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list3 = this.battingHomeRuns;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list4 = this.battingAvg;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list5 = this.battingRuns;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list6 = this.battingRbi;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list7 = this.battingStolenBases;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list8 = this.battingOnBasePercentage;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list9 = this.battingSluggingPercentage;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list10 = this.war;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list11 = this.pitchingGamesPlayed;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list12 = this.pitchingWins;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list13 = this.pitchingLosses;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list14 = this.pitchingSaves;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list15 = this.pitchingInningsPitched;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list16 = this.pitchingEarnedRunsAverage;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list17 = this.pitchingStrikeOuts;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list18 = this.pitchingQualityStarts;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list19 = this.pitchingWhip;
        int hashCode19 = (hashCode18 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list20 = this.pitchingWar;
        int hashCode20 = (hashCode19 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list21 = this.pitchingFieldingIndependentPitching;
        int hashCode21 = (hashCode20 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list22 = this.pitchingOpponentBattingAvg;
        int hashCode22 = (hashCode21 + (list22 == null ? 0 : list22.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list23 = this.fieldingPutOuts;
        int hashCode23 = (hashCode22 + (list23 == null ? 0 : list23.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list24 = this.fieldingAssists;
        int hashCode24 = (hashCode23 + (list24 == null ? 0 : list24.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list25 = this.fieldingTotalErrors;
        int hashCode25 = (hashCode24 + (list25 == null ? 0 : list25.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list26 = this.fieldingDoublePlays;
        int hashCode26 = (hashCode25 + (list26 == null ? 0 : list26.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list27 = this.fieldingChances;
        return hashCode26 + (list27 != null ? list27.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list = this.battingAtBats;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list2 = this.battingHits;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list3 = this.battingHomeRuns;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list4 = this.battingAvg;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list5 = this.battingRuns;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list6 = this.battingRbi;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list7 = this.battingStolenBases;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list8 = this.battingOnBasePercentage;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list9 = this.battingSluggingPercentage;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list10 = this.war;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list11 = this.pitchingGamesPlayed;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list12 = this.pitchingWins;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list13 = this.pitchingLosses;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list14 = this.pitchingSaves;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list15 = this.pitchingInningsPitched;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list16 = this.pitchingEarnedRunsAverage;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list17 = this.pitchingStrikeOuts;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list18 = this.pitchingQualityStarts;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list19 = this.pitchingWhip;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list20 = this.pitchingWar;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list21 = this.pitchingFieldingIndependentPitching;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list22 = this.pitchingOpponentBattingAvg;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list23 = this.fieldingPutOuts;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list24 = this.fieldingAssists;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list25 = this.fieldingTotalErrors;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list26 = this.fieldingDoublePlays;
        List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list27 = this.fieldingChances;
        StringBuilder s = fc6.s("BaseballTopPlayersStatistics(battingAtBats=", ", battingHits=", ", battingHomeRuns=", list, list2);
        vxd.w(s, list3, ", battingAvg=", list4, ", battingRuns=");
        vxd.w(s, list5, ", battingRbi=", list6, ", battingStolenBases=");
        vxd.w(s, list7, ", battingOnBasePercentage=", list8, ", battingSluggingPercentage=");
        vxd.w(s, list9, ", war=", list10, ", pitchingGamesPlayed=");
        vxd.w(s, list11, ", pitchingWins=", list12, ", pitchingLosses=");
        vxd.w(s, list13, ", pitchingSaves=", list14, ", pitchingInningsPitched=");
        vxd.w(s, list15, ", pitchingEarnedRunsAverage=", list16, ", pitchingStrikeOuts=");
        vxd.w(s, list17, ", pitchingQualityStarts=", list18, ", pitchingWhip=");
        vxd.w(s, list19, ", pitchingWar=", list20, ", pitchingFieldingIndependentPitching=");
        vxd.w(s, list21, ", pitchingOpponentBattingAvg=", list22, ", fieldingPutOuts=");
        vxd.w(s, list23, ", fieldingAssists=", list24, ", fieldingTotalErrors=");
        vxd.w(s, list25, ", fieldingDoublePlays=", list26, ", fieldingChances=");
        return mz1.p(s, list27, ")");
    }

    public BaseballTopPlayersStatistics(@Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list2, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list3, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list4, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list5, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list6, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list7, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list8, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list9, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list10, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list11, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list12, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list13, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list14, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list15, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list16, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list17, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list18, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list19, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list20, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list21, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list22, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list23, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list24, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list25, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list26, @Nullable List<TopPlayersStatisticsItem<BaseballTopPlayersStatisticsItem>> list27) {
        super(null);
        this.battingAtBats = list;
        this.battingHits = list2;
        this.battingHomeRuns = list3;
        this.battingAvg = list4;
        this.battingRuns = list5;
        this.battingRbi = list6;
        this.battingStolenBases = list7;
        this.battingOnBasePercentage = list8;
        this.battingSluggingPercentage = list9;
        this.war = list10;
        this.pitchingGamesPlayed = list11;
        this.pitchingWins = list12;
        this.pitchingLosses = list13;
        this.pitchingSaves = list14;
        this.pitchingInningsPitched = list15;
        this.pitchingEarnedRunsAverage = list16;
        this.pitchingStrikeOuts = list17;
        this.pitchingQualityStarts = list18;
        this.pitchingWhip = list19;
        this.pitchingWar = list20;
        this.pitchingFieldingIndependentPitching = list21;
        this.pitchingOpponentBattingAvg = list22;
        this.fieldingPutOuts = list23;
        this.fieldingAssists = list24;
        this.fieldingTotalErrors = list25;
        this.fieldingDoublePlays = list26;
        this.fieldingChances = list27;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/BaseballTopPlayersStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/BaseballTopPlayersStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballTopPlayersStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
