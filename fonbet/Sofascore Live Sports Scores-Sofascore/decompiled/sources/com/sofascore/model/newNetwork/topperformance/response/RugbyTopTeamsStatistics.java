package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.RugbyTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.RugbyTopTeamsStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TopTeamsStatisticsItem;
import defpackage.fc6;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.t9g;
import defpackage.u9g;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\b\u0087\b\u0018\u0000 \u008a\u00012\u00020\u0001:\u0004\u008b\u0001\u008a\u0001Bó\u0005\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(B\u008f\u0006\b\u0010\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010+\u001a\u00020)\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b'\u0010.J\u001e\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u001e\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u00100J\u001e\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u00100J\u001e\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u00100J\u001e\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u00100J\u001e\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u00100J\u001e\u00106\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u00100J\u001e\u00107\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00100J\u001e\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u00100J\u001e\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u00100J\u001e\u0010:\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00100J\u001e\u0010;\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u00100J\u001e\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u00100J\u001e\u0010=\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u00100J\u001e\u0010>\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u00100J\u001e\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u00100J\u001e\u0010@\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u00100J\u001e\u0010A\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u00100J\u001e\u0010B\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u00100J\u001e\u0010C\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00100J\u001e\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u00100J\u001e\u0010E\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u00100J\u001e\u0010F\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u00100J\u001e\u0010G\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u00100J\u001e\u0010H\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00100J\u001e\u0010I\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u00100J\u001e\u0010J\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u00100J\u001e\u0010K\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u00100J\u001e\u0010L\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u00100J\u001e\u0010M\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u00100J\u001e\u0010N\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u00100J\u001e\u0010O\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u00100J\u001e\u0010P\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u00100J\u001e\u0010Q\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u00100JÀ\u0006\u0010R\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010U\u001a\u00020THÖ\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020)HÖ\u0001¢\u0006\u0004\bW\u0010XJ\u001a\u0010\\\u001a\u00020[2\b\u0010Z\u001a\u0004\u0018\u00010YHÖ\u0003¢\u0006\u0004\b\\\u0010]J'\u0010f\u001a\u00020c2\u0006\u0010^\u001a\u00020\u00002\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020aH\u0001¢\u0006\u0004\bd\u0010eR%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010g\u001a\u0004\bh\u00100R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010g\u001a\u0004\bi\u00100R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010g\u001a\u0004\bj\u00100R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010g\u001a\u0004\bk\u00100R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010g\u001a\u0004\bl\u00100R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010g\u001a\u0004\bm\u00100R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010g\u001a\u0004\bn\u00100R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010g\u001a\u0004\bo\u00100R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010g\u001a\u0004\bp\u00100R%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010g\u001a\u0004\bq\u00100R%\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010g\u001a\u0004\br\u00100R%\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010g\u001a\u0004\bs\u00100R%\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010g\u001a\u0004\bt\u00100R%\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010g\u001a\u0004\bu\u00100R%\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010g\u001a\u0004\bv\u00100R%\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010g\u001a\u0004\bw\u00100R%\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010g\u001a\u0004\bx\u00100R%\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010g\u001a\u0004\by\u00100R%\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010g\u001a\u0004\bz\u00100R%\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010g\u001a\u0004\b{\u00100R%\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010g\u001a\u0004\b|\u00100R%\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010g\u001a\u0004\b}\u00100R%\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010g\u001a\u0004\b~\u00100R%\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010g\u001a\u0004\b\u007f\u00100R&\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001d\u0010g\u001a\u0005\b\u0080\u0001\u00100R&\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001e\u0010g\u001a\u0005\b\u0081\u0001\u00100R&\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001f\u0010g\u001a\u0005\b\u0082\u0001\u00100R&\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b \u0010g\u001a\u0005\b\u0083\u0001\u00100R&\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b!\u0010g\u001a\u0005\b\u0084\u0001\u00100R&\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\"\u0010g\u001a\u0005\b\u0085\u0001\u00100R&\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b#\u0010g\u001a\u0005\b\u0086\u0001\u00100R&\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b$\u0010g\u001a\u0005\b\u0087\u0001\u00100R&\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b%\u0010g\u001a\u0005\b\u0088\u0001\u00100R&\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b&\u0010g\u001a\u0005\b\u0089\u0001\u00100¨\u0006\u008c\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/TopTeamsStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/RugbyTopTeamsStatisticsItem;", "points", "tries", "penaltyTries", "penaltyGoals", "conversions", "dropGoals", "scrumsWon", "lineoutsWon", "passesSuccessful", "offloads", "carries", "cleanBreaks", "defendersBeaten", "metresMade", "handlingError", "carriesCrossedGainLine", "carriesNotMadeGainLine", "kickMetres", "kickFromHand", "postContactMetres", "tackles", "dominantTackles", "penDefs", "penOffs", "rucksWon", "ruckArrival", "ruckArrivalAttack", "ruckArrivalDefence", "ruckSpeed03", "ruckSpeed36", "ruckSpeed6Plus", "yellowCards", "redCards", "penaltyGoalsConceded", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopTeamsStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopTeamsStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPoints", "getTries", "getPenaltyTries", "getPenaltyGoals", "getConversions", "getDropGoals", "getScrumsWon", "getLineoutsWon", "getPassesSuccessful", "getOffloads", "getCarries", "getCleanBreaks", "getDefendersBeaten", "getMetresMade", "getHandlingError", "getCarriesCrossedGainLine", "getCarriesNotMadeGainLine", "getKickMetres", "getKickFromHand", "getPostContactMetres", "getTackles", "getDominantTackles", "getPenDefs", "getPenOffs", "getRucksWon", "getRuckArrival", "getRuckArrivalAttack", "getRuckArrivalDefence", "getRuckSpeed03", "getRuckSpeed36", "getRuckSpeed6Plus", "getYellowCards", "getRedCards", "getPenaltyGoalsConceded", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RugbyTopTeamsStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> carries;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> carriesCrossedGainLine;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> carriesNotMadeGainLine;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> cleanBreaks;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> conversions;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> defendersBeaten;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> dominantTackles;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> dropGoals;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> handlingError;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> kickFromHand;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> kickMetres;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> lineoutsWon;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> metresMade;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> offloads;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> passesSuccessful;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> penDefs;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> penOffs;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> penaltyGoals;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> penaltyGoalsConceded;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> penaltyTries;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> points;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> postContactMetres;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> redCards;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> ruckArrival;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> ruckArrivalAttack;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> ruckArrivalDefence;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> ruckSpeed03;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> ruckSpeed36;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> ruckSpeed6Plus;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> rucksWon;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> scrumsWon;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> tackles;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> tries;

    @Nullable
    private final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> yellowCards;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new t9g(9)), ypa.a(ysaVar, new t9g(11)), ypa.a(ysaVar, new t9g(23)), ypa.a(ysaVar, new t9g(28)), ypa.a(ysaVar, new t9g(29)), ypa.a(ysaVar, new u9g(0)), ypa.a(ysaVar, new u9g(2)), ypa.a(ysaVar, new u9g(3)), ypa.a(ysaVar, new u9g(4)), ypa.a(ysaVar, new u9g(5)), ypa.a(ysaVar, new t9g(20)), ypa.a(ysaVar, new u9g(1)), ypa.a(ysaVar, new u9g(6)), ypa.a(ysaVar, new u9g(7)), ypa.a(ysaVar, new u9g(8)), ypa.a(ysaVar, new u9g(9)), ypa.a(ysaVar, new u9g(10)), ypa.a(ysaVar, new u9g(11)), ypa.a(ysaVar, new u9g(12)), ypa.a(ysaVar, new t9g(10)), ypa.a(ysaVar, new t9g(12)), ypa.a(ysaVar, new t9g(13)), ypa.a(ysaVar, new t9g(14)), ypa.a(ysaVar, new t9g(15)), ypa.a(ysaVar, new t9g(16)), ypa.a(ysaVar, new t9g(17)), ypa.a(ysaVar, new t9g(18)), ypa.a(ysaVar, new t9g(19)), ypa.a(ysaVar, new t9g(21)), ypa.a(ysaVar, new t9g(22)), ypa.a(ysaVar, new t9g(24)), ypa.a(ysaVar, new t9g(25)), ypa.a(ysaVar, new t9g(26)), ypa.a(ysaVar, new t9g(27))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RugbyTopTeamsStatistics(int i, int i2, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, List list30, List list31, List list32, List list33, List list34, t5h t5hVar) {
        super(i, t5hVar);
        if ((3 != (i2 & 3)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, 3}, RugbyTopTeamsStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = list;
        this.tries = list2;
        this.penaltyTries = list3;
        this.penaltyGoals = list4;
        this.conversions = list5;
        this.dropGoals = list6;
        this.scrumsWon = list7;
        this.lineoutsWon = list8;
        this.passesSuccessful = list9;
        this.offloads = list10;
        this.carries = list11;
        this.cleanBreaks = list12;
        this.defendersBeaten = list13;
        this.metresMade = list14;
        this.handlingError = list15;
        this.carriesCrossedGainLine = list16;
        this.carriesNotMadeGainLine = list17;
        this.kickMetres = list18;
        this.kickFromHand = list19;
        this.postContactMetres = list20;
        this.tackles = list21;
        this.dominantTackles = list22;
        this.penDefs = list23;
        this.penOffs = list24;
        this.rucksWon = list25;
        this.ruckArrival = list26;
        this.ruckArrivalAttack = list27;
        this.ruckArrivalDefence = list28;
        this.ruckSpeed03 = list29;
        this.ruckSpeed36 = list30;
        this.ruckSpeed6Plus = list31;
        this.yellowCards = list32;
        this.redCards = list33;
        this.penaltyGoalsConceded = list34;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$13() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$14() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$15() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$16() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$17() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$18() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$19() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$20() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$21() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$22() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$23() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$24() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$25() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$26() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$27() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$28() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$29() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$30() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$31() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$32() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(RugbyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ RugbyTopTeamsStatistics copy$default(RugbyTopTeamsStatistics rugbyTopTeamsStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, List list30, List list31, List list32, List list33, List list34, int i, int i2, Object obj) {
        List list35;
        List list36;
        List list37;
        List list38;
        List list39;
        List list40;
        List list41;
        List list42;
        List list43;
        List list44;
        List list45;
        List list46;
        List list47;
        List list48;
        List list49;
        List list50;
        List list51;
        List list52;
        List list53;
        List list54;
        List list55;
        List list56;
        List list57;
        List list58;
        List list59;
        List list60;
        List list61;
        List list62;
        List list63;
        List list64;
        List list65;
        List list66;
        List list67;
        List list68 = (i & 1) != 0 ? rugbyTopTeamsStatistics.points : list;
        List list69 = (i & 2) != 0 ? rugbyTopTeamsStatistics.tries : list2;
        List list70 = (i & 4) != 0 ? rugbyTopTeamsStatistics.penaltyTries : list3;
        List list71 = (i & 8) != 0 ? rugbyTopTeamsStatistics.penaltyGoals : list4;
        List list72 = (i & 16) != 0 ? rugbyTopTeamsStatistics.conversions : list5;
        List list73 = (i & 32) != 0 ? rugbyTopTeamsStatistics.dropGoals : list6;
        List list74 = (i & 64) != 0 ? rugbyTopTeamsStatistics.scrumsWon : list7;
        List list75 = (i & 128) != 0 ? rugbyTopTeamsStatistics.lineoutsWon : list8;
        List list76 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? rugbyTopTeamsStatistics.passesSuccessful : list9;
        List list77 = (i & 512) != 0 ? rugbyTopTeamsStatistics.offloads : list10;
        List list78 = (i & 1024) != 0 ? rugbyTopTeamsStatistics.carries : list11;
        List list79 = (i & a.o) != 0 ? rugbyTopTeamsStatistics.cleanBreaks : list12;
        List list80 = (i & 4096) != 0 ? rugbyTopTeamsStatistics.defendersBeaten : list13;
        List list81 = (i & 8192) != 0 ? rugbyTopTeamsStatistics.metresMade : list14;
        List list82 = list68;
        List list83 = (i & 16384) != 0 ? rugbyTopTeamsStatistics.handlingError : list15;
        List list84 = (i & 32768) != 0 ? rugbyTopTeamsStatistics.carriesCrossedGainLine : list16;
        List list85 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? rugbyTopTeamsStatistics.carriesNotMadeGainLine : list17;
        List list86 = (i & 131072) != 0 ? rugbyTopTeamsStatistics.kickMetres : list18;
        List list87 = (i & 262144) != 0 ? rugbyTopTeamsStatistics.kickFromHand : list19;
        List list88 = (i & 524288) != 0 ? rugbyTopTeamsStatistics.postContactMetres : list20;
        List list89 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? rugbyTopTeamsStatistics.tackles : list21;
        List list90 = (i & 2097152) != 0 ? rugbyTopTeamsStatistics.dominantTackles : list22;
        List list91 = (i & 4194304) != 0 ? rugbyTopTeamsStatistics.penDefs : list23;
        List list92 = (i & 8388608) != 0 ? rugbyTopTeamsStatistics.penOffs : list24;
        List list93 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? rugbyTopTeamsStatistics.rucksWon : list25;
        List list94 = (i & 33554432) != 0 ? rugbyTopTeamsStatistics.ruckArrival : list26;
        List list95 = (i & 67108864) != 0 ? rugbyTopTeamsStatistics.ruckArrivalAttack : list27;
        List list96 = (i & 134217728) != 0 ? rugbyTopTeamsStatistics.ruckArrivalDefence : list28;
        List list97 = (i & 268435456) != 0 ? rugbyTopTeamsStatistics.ruckSpeed03 : list29;
        List list98 = (i & 536870912) != 0 ? rugbyTopTeamsStatistics.ruckSpeed36 : list30;
        List list99 = (i & 1073741824) != 0 ? rugbyTopTeamsStatistics.ruckSpeed6Plus : list31;
        List list100 = (i & Integer.MIN_VALUE) != 0 ? rugbyTopTeamsStatistics.yellowCards : list32;
        List list101 = (i2 & 1) != 0 ? rugbyTopTeamsStatistics.redCards : list33;
        if ((i2 & 2) != 0) {
            list36 = list101;
            list35 = rugbyTopTeamsStatistics.penaltyGoalsConceded;
            list38 = list87;
            list39 = list88;
            list40 = list89;
            list41 = list90;
            list42 = list91;
            list43 = list92;
            list44 = list93;
            list45 = list94;
            list46 = list95;
            list47 = list96;
            list48 = list97;
            list49 = list98;
            list50 = list99;
            list51 = list100;
            list52 = list83;
            list54 = list71;
            list55 = list72;
            list56 = list73;
            list57 = list74;
            list58 = list75;
            list59 = list76;
            list60 = list77;
            list61 = list78;
            list62 = list79;
            list63 = list80;
            list64 = list81;
            list65 = list84;
            list66 = list85;
            list37 = list86;
            list67 = list69;
            list53 = list70;
        } else {
            list35 = list34;
            list36 = list101;
            list37 = list86;
            list38 = list87;
            list39 = list88;
            list40 = list89;
            list41 = list90;
            list42 = list91;
            list43 = list92;
            list44 = list93;
            list45 = list94;
            list46 = list95;
            list47 = list96;
            list48 = list97;
            list49 = list98;
            list50 = list99;
            list51 = list100;
            list52 = list83;
            list53 = list70;
            list54 = list71;
            list55 = list72;
            list56 = list73;
            list57 = list74;
            list58 = list75;
            list59 = list76;
            list60 = list77;
            list61 = list78;
            list62 = list79;
            list63 = list80;
            list64 = list81;
            list65 = list84;
            list66 = list85;
            list67 = list69;
        }
        return rugbyTopTeamsStatistics.copy(list82, list67, list53, list54, list55, list56, list57, list58, list59, list60, list61, list62, list63, list64, list52, list65, list66, list37, list38, list39, list40, list41, list42, list43, list44, list45, list46, list47, list48, list49, list50, list51, list36, list35);
    }

    public static final /* synthetic */ void write$Self$model_release(RugbyTopTeamsStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.points);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.tries);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.penaltyTries);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.penaltyGoals);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.conversions);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.dropGoals);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.scrumsWon);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.lineoutsWon);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.passesSuccessful);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.offloads);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.carries);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.cleanBreaks);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.defendersBeaten);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.metresMade);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.handlingError);
        output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.carriesCrossedGainLine);
        output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.carriesNotMadeGainLine);
        output.h(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.kickMetres);
        output.h(serialDesc, 18, (KSerializer) joaVarArr[18].getValue(), self.kickFromHand);
        output.h(serialDesc, 19, (KSerializer) joaVarArr[19].getValue(), self.postContactMetres);
        output.h(serialDesc, 20, (KSerializer) joaVarArr[20].getValue(), self.tackles);
        output.h(serialDesc, 21, (KSerializer) joaVarArr[21].getValue(), self.dominantTackles);
        output.h(serialDesc, 22, (KSerializer) joaVarArr[22].getValue(), self.penDefs);
        output.h(serialDesc, 23, (KSerializer) joaVarArr[23].getValue(), self.penOffs);
        output.h(serialDesc, 24, (KSerializer) joaVarArr[24].getValue(), self.rucksWon);
        output.h(serialDesc, 25, (KSerializer) joaVarArr[25].getValue(), self.ruckArrival);
        output.h(serialDesc, 26, (KSerializer) joaVarArr[26].getValue(), self.ruckArrivalAttack);
        output.h(serialDesc, 27, (KSerializer) joaVarArr[27].getValue(), self.ruckArrivalDefence);
        output.h(serialDesc, 28, (KSerializer) joaVarArr[28].getValue(), self.ruckSpeed03);
        output.h(serialDesc, 29, (KSerializer) joaVarArr[29].getValue(), self.ruckSpeed36);
        output.h(serialDesc, 30, (KSerializer) joaVarArr[30].getValue(), self.ruckSpeed6Plus);
        output.h(serialDesc, 31, (KSerializer) joaVarArr[31].getValue(), self.yellowCards);
        output.h(serialDesc, 32, (KSerializer) joaVarArr[32].getValue(), self.redCards);
        output.h(serialDesc, 33, (KSerializer) joaVarArr[33].getValue(), self.penaltyGoalsConceded);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component1() {
        return this.points;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component10() {
        return this.offloads;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component11() {
        return this.carries;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component12() {
        return this.cleanBreaks;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component13() {
        return this.defendersBeaten;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component14() {
        return this.metresMade;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component15() {
        return this.handlingError;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component16() {
        return this.carriesCrossedGainLine;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component17() {
        return this.carriesNotMadeGainLine;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component18() {
        return this.kickMetres;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component19() {
        return this.kickFromHand;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component2() {
        return this.tries;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component20() {
        return this.postContactMetres;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component21() {
        return this.tackles;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component22() {
        return this.dominantTackles;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component23() {
        return this.penDefs;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component24() {
        return this.penOffs;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component25() {
        return this.rucksWon;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component26() {
        return this.ruckArrival;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component27() {
        return this.ruckArrivalAttack;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component28() {
        return this.ruckArrivalDefence;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component29() {
        return this.ruckSpeed03;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component3() {
        return this.penaltyTries;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component30() {
        return this.ruckSpeed36;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component31() {
        return this.ruckSpeed6Plus;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component32() {
        return this.yellowCards;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component33() {
        return this.redCards;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component34() {
        return this.penaltyGoalsConceded;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component4() {
        return this.penaltyGoals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component5() {
        return this.conversions;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component6() {
        return this.dropGoals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component7() {
        return this.scrumsWon;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component8() {
        return this.lineoutsWon;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> component9() {
        return this.passesSuccessful;
    }

    @NotNull
    public final RugbyTopTeamsStatistics copy(@Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> points, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> tries, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> penaltyTries, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> penaltyGoals, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> conversions, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> dropGoals, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> scrumsWon, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> lineoutsWon, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> passesSuccessful, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> offloads, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> carries, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> cleanBreaks, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> defendersBeaten, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> metresMade, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> handlingError, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> carriesCrossedGainLine, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> carriesNotMadeGainLine, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> kickMetres, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> kickFromHand, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> postContactMetres, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> tackles, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> dominantTackles, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> penDefs, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> penOffs, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> rucksWon, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> ruckArrival, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> ruckArrivalAttack, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> ruckArrivalDefence, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> ruckSpeed03, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> ruckSpeed36, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> ruckSpeed6Plus, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> yellowCards, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> redCards, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> penaltyGoalsConceded) {
        return new RugbyTopTeamsStatistics(points, tries, penaltyTries, penaltyGoals, conversions, dropGoals, scrumsWon, lineoutsWon, passesSuccessful, offloads, carries, cleanBreaks, defendersBeaten, metresMade, handlingError, carriesCrossedGainLine, carriesNotMadeGainLine, kickMetres, kickFromHand, postContactMetres, tackles, dominantTackles, penDefs, penOffs, rucksWon, ruckArrival, ruckArrivalAttack, ruckArrivalDefence, ruckSpeed03, ruckSpeed36, ruckSpeed6Plus, yellowCards, redCards, penaltyGoalsConceded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RugbyTopTeamsStatistics)) {
            return false;
        }
        RugbyTopTeamsStatistics rugbyTopTeamsStatistics = (RugbyTopTeamsStatistics) other;
        return Intrinsics.c(this.points, rugbyTopTeamsStatistics.points) && Intrinsics.c(this.tries, rugbyTopTeamsStatistics.tries) && Intrinsics.c(this.penaltyTries, rugbyTopTeamsStatistics.penaltyTries) && Intrinsics.c(this.penaltyGoals, rugbyTopTeamsStatistics.penaltyGoals) && Intrinsics.c(this.conversions, rugbyTopTeamsStatistics.conversions) && Intrinsics.c(this.dropGoals, rugbyTopTeamsStatistics.dropGoals) && Intrinsics.c(this.scrumsWon, rugbyTopTeamsStatistics.scrumsWon) && Intrinsics.c(this.lineoutsWon, rugbyTopTeamsStatistics.lineoutsWon) && Intrinsics.c(this.passesSuccessful, rugbyTopTeamsStatistics.passesSuccessful) && Intrinsics.c(this.offloads, rugbyTopTeamsStatistics.offloads) && Intrinsics.c(this.carries, rugbyTopTeamsStatistics.carries) && Intrinsics.c(this.cleanBreaks, rugbyTopTeamsStatistics.cleanBreaks) && Intrinsics.c(this.defendersBeaten, rugbyTopTeamsStatistics.defendersBeaten) && Intrinsics.c(this.metresMade, rugbyTopTeamsStatistics.metresMade) && Intrinsics.c(this.handlingError, rugbyTopTeamsStatistics.handlingError) && Intrinsics.c(this.carriesCrossedGainLine, rugbyTopTeamsStatistics.carriesCrossedGainLine) && Intrinsics.c(this.carriesNotMadeGainLine, rugbyTopTeamsStatistics.carriesNotMadeGainLine) && Intrinsics.c(this.kickMetres, rugbyTopTeamsStatistics.kickMetres) && Intrinsics.c(this.kickFromHand, rugbyTopTeamsStatistics.kickFromHand) && Intrinsics.c(this.postContactMetres, rugbyTopTeamsStatistics.postContactMetres) && Intrinsics.c(this.tackles, rugbyTopTeamsStatistics.tackles) && Intrinsics.c(this.dominantTackles, rugbyTopTeamsStatistics.dominantTackles) && Intrinsics.c(this.penDefs, rugbyTopTeamsStatistics.penDefs) && Intrinsics.c(this.penOffs, rugbyTopTeamsStatistics.penOffs) && Intrinsics.c(this.rucksWon, rugbyTopTeamsStatistics.rucksWon) && Intrinsics.c(this.ruckArrival, rugbyTopTeamsStatistics.ruckArrival) && Intrinsics.c(this.ruckArrivalAttack, rugbyTopTeamsStatistics.ruckArrivalAttack) && Intrinsics.c(this.ruckArrivalDefence, rugbyTopTeamsStatistics.ruckArrivalDefence) && Intrinsics.c(this.ruckSpeed03, rugbyTopTeamsStatistics.ruckSpeed03) && Intrinsics.c(this.ruckSpeed36, rugbyTopTeamsStatistics.ruckSpeed36) && Intrinsics.c(this.ruckSpeed6Plus, rugbyTopTeamsStatistics.ruckSpeed6Plus) && Intrinsics.c(this.yellowCards, rugbyTopTeamsStatistics.yellowCards) && Intrinsics.c(this.redCards, rugbyTopTeamsStatistics.redCards) && Intrinsics.c(this.penaltyGoalsConceded, rugbyTopTeamsStatistics.penaltyGoalsConceded);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getCarries() {
        return this.carries;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getCarriesCrossedGainLine() {
        return this.carriesCrossedGainLine;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getCarriesNotMadeGainLine() {
        return this.carriesNotMadeGainLine;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getCleanBreaks() {
        return this.cleanBreaks;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getConversions() {
        return this.conversions;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getDefendersBeaten() {
        return this.defendersBeaten;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getDominantTackles() {
        return this.dominantTackles;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getDropGoals() {
        return this.dropGoals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getHandlingError() {
        return this.handlingError;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getKickFromHand() {
        return this.kickFromHand;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getKickMetres() {
        return this.kickMetres;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getLineoutsWon() {
        return this.lineoutsWon;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getMetresMade() {
        return this.metresMade;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getOffloads() {
        return this.offloads;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getPassesSuccessful() {
        return this.passesSuccessful;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getPenDefs() {
        return this.penDefs;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getPenOffs() {
        return this.penOffs;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getPenaltyGoalsConceded() {
        return this.penaltyGoalsConceded;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getPenaltyTries() {
        return this.penaltyTries;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getPoints() {
        return this.points;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getPostContactMetres() {
        return this.postContactMetres;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getRedCards() {
        return this.redCards;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getRuckArrival() {
        return this.ruckArrival;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getRuckArrivalAttack() {
        return this.ruckArrivalAttack;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getRuckArrivalDefence() {
        return this.ruckArrivalDefence;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getRuckSpeed03() {
        return this.ruckSpeed03;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getRuckSpeed36() {
        return this.ruckSpeed36;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getRuckSpeed6Plus() {
        return this.ruckSpeed6Plus;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getRucksWon() {
        return this.rucksWon;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getScrumsWon() {
        return this.scrumsWon;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getTackles() {
        return this.tackles;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getTries() {
        return this.tries;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list = this.points;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list2 = this.tries;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list3 = this.penaltyTries;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list4 = this.penaltyGoals;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list5 = this.conversions;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list6 = this.dropGoals;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list7 = this.scrumsWon;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list8 = this.lineoutsWon;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list9 = this.passesSuccessful;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list10 = this.offloads;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list11 = this.carries;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list12 = this.cleanBreaks;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list13 = this.defendersBeaten;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list14 = this.metresMade;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list15 = this.handlingError;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list16 = this.carriesCrossedGainLine;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list17 = this.carriesNotMadeGainLine;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list18 = this.kickMetres;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list19 = this.kickFromHand;
        int hashCode19 = (hashCode18 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list20 = this.postContactMetres;
        int hashCode20 = (hashCode19 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list21 = this.tackles;
        int hashCode21 = (hashCode20 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list22 = this.dominantTackles;
        int hashCode22 = (hashCode21 + (list22 == null ? 0 : list22.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list23 = this.penDefs;
        int hashCode23 = (hashCode22 + (list23 == null ? 0 : list23.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list24 = this.penOffs;
        int hashCode24 = (hashCode23 + (list24 == null ? 0 : list24.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list25 = this.rucksWon;
        int hashCode25 = (hashCode24 + (list25 == null ? 0 : list25.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list26 = this.ruckArrival;
        int hashCode26 = (hashCode25 + (list26 == null ? 0 : list26.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list27 = this.ruckArrivalAttack;
        int hashCode27 = (hashCode26 + (list27 == null ? 0 : list27.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list28 = this.ruckArrivalDefence;
        int hashCode28 = (hashCode27 + (list28 == null ? 0 : list28.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list29 = this.ruckSpeed03;
        int hashCode29 = (hashCode28 + (list29 == null ? 0 : list29.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list30 = this.ruckSpeed36;
        int hashCode30 = (hashCode29 + (list30 == null ? 0 : list30.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list31 = this.ruckSpeed6Plus;
        int hashCode31 = (hashCode30 + (list31 == null ? 0 : list31.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list32 = this.yellowCards;
        int hashCode32 = (hashCode31 + (list32 == null ? 0 : list32.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list33 = this.redCards;
        int hashCode33 = (hashCode32 + (list33 == null ? 0 : list33.hashCode())) * 31;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list34 = this.penaltyGoalsConceded;
        return hashCode33 + (list34 != null ? list34.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list = this.points;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list2 = this.tries;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list3 = this.penaltyTries;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list4 = this.penaltyGoals;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list5 = this.conversions;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list6 = this.dropGoals;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list7 = this.scrumsWon;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list8 = this.lineoutsWon;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list9 = this.passesSuccessful;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list10 = this.offloads;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list11 = this.carries;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list12 = this.cleanBreaks;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list13 = this.defendersBeaten;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list14 = this.metresMade;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list15 = this.handlingError;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list16 = this.carriesCrossedGainLine;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list17 = this.carriesNotMadeGainLine;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list18 = this.kickMetres;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list19 = this.kickFromHand;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list20 = this.postContactMetres;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list21 = this.tackles;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list22 = this.dominantTackles;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list23 = this.penDefs;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list24 = this.penOffs;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list25 = this.rucksWon;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list26 = this.ruckArrival;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list27 = this.ruckArrivalAttack;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list28 = this.ruckArrivalDefence;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list29 = this.ruckSpeed03;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list30 = this.ruckSpeed36;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list31 = this.ruckSpeed6Plus;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list32 = this.yellowCards;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list33 = this.redCards;
        List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list34 = this.penaltyGoalsConceded;
        StringBuilder s = fc6.s("RugbyTopTeamsStatistics(points=", ", tries=", ", penaltyTries=", list, list2);
        vxd.w(s, list3, ", penaltyGoals=", list4, ", conversions=");
        vxd.w(s, list5, ", dropGoals=", list6, ", scrumsWon=");
        vxd.w(s, list7, ", lineoutsWon=", list8, ", passesSuccessful=");
        vxd.w(s, list9, ", offloads=", list10, ", carries=");
        vxd.w(s, list11, ", cleanBreaks=", list12, ", defendersBeaten=");
        vxd.w(s, list13, ", metresMade=", list14, ", handlingError=");
        vxd.w(s, list15, ", carriesCrossedGainLine=", list16, ", carriesNotMadeGainLine=");
        vxd.w(s, list17, ", kickMetres=", list18, ", kickFromHand=");
        vxd.w(s, list19, ", postContactMetres=", list20, ", tackles=");
        vxd.w(s, list21, ", dominantTackles=", list22, ", penDefs=");
        vxd.w(s, list23, ", penOffs=", list24, ", rucksWon=");
        vxd.w(s, list25, ", ruckArrival=", list26, ", ruckArrivalAttack=");
        vxd.w(s, list27, ", ruckArrivalDefence=", list28, ", ruckSpeed03=");
        vxd.w(s, list29, ", ruckSpeed36=", list30, ", ruckSpeed6Plus=");
        vxd.w(s, list31, ", yellowCards=", list32, ", redCards=");
        return me4.j(s, list33, ", penaltyGoalsConceded=", list34, ")");
    }

    public RugbyTopTeamsStatistics(@Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list2, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list3, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list4, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list5, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list6, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list7, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list8, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list9, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list10, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list11, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list12, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list13, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list14, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list15, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list16, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list17, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list18, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list19, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list20, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list21, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list22, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list23, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list24, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list25, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list26, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list27, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list28, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list29, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list30, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list31, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list32, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list33, @Nullable List<TopTeamsStatisticsItem<RugbyTopTeamsStatisticsItem>> list34) {
        super(null);
        this.points = list;
        this.tries = list2;
        this.penaltyTries = list3;
        this.penaltyGoals = list4;
        this.conversions = list5;
        this.dropGoals = list6;
        this.scrumsWon = list7;
        this.lineoutsWon = list8;
        this.passesSuccessful = list9;
        this.offloads = list10;
        this.carries = list11;
        this.cleanBreaks = list12;
        this.defendersBeaten = list13;
        this.metresMade = list14;
        this.handlingError = list15;
        this.carriesCrossedGainLine = list16;
        this.carriesNotMadeGainLine = list17;
        this.kickMetres = list18;
        this.kickFromHand = list19;
        this.postContactMetres = list20;
        this.tackles = list21;
        this.dominantTackles = list22;
        this.penDefs = list23;
        this.penOffs = list24;
        this.rucksWon = list25;
        this.ruckArrival = list26;
        this.ruckArrivalAttack = list27;
        this.ruckArrivalDefence = list28;
        this.ruckSpeed03 = list29;
        this.ruckSpeed36 = list30;
        this.ruckSpeed6Plus = list31;
        this.yellowCards = list32;
        this.redCards = list33;
        this.penaltyGoalsConceded = list34;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopTeamsStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopTeamsStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RugbyTopTeamsStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
