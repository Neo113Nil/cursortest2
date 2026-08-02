package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FootballTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FootballTopTeamsStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TopTeamsStatisticsItem;
import defpackage.fc6;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.yl8;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zl8;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 }2\u00020\u0001:\u0002~}B\u009b\u0005\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$B¯\u0005\b\u0010\u0012\u0006\u0010&\u001a\u00020%\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b#\u0010)J\u001e\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010+J\u001e\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010+J\u001e\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010+J\u001e\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010+J\u001e\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010+J\u001e\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010+J\u001e\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010+J\u001e\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010+J\u001e\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010+J\u001e\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010+J\u001e\u00106\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010+J\u001e\u00107\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010+J\u001e\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010+J\u001e\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010+J\u001e\u0010:\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010+J\u001e\u0010;\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010+J\u001e\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010+J\u001e\u0010=\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010+J\u001e\u0010>\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010+J\u001e\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010+J\u001e\u0010@\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010+J\u001e\u0010A\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010+J\u001e\u0010B\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010+J\u001e\u0010C\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010+J\u001e\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010+J\u001e\u0010E\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010+J\u001e\u0010F\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010+J\u001e\u0010G\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u0010+J\u001e\u0010H\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010+Jà\u0005\u0010I\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010L\u001a\u00020KHÖ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020%HÖ\u0001¢\u0006\u0004\bN\u0010OJ\u001a\u0010S\u001a\u00020R2\b\u0010Q\u001a\u0004\u0018\u00010PHÖ\u0003¢\u0006\u0004\bS\u0010TJ'\u0010]\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020XH\u0001¢\u0006\u0004\b[\u0010\\R%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010^\u001a\u0004\b_\u0010+R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010^\u001a\u0004\b`\u0010+R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010^\u001a\u0004\ba\u0010+R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010^\u001a\u0004\bb\u0010+R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010^\u001a\u0004\bc\u0010+R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010^\u001a\u0004\bd\u0010+R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010^\u001a\u0004\be\u0010+R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010^\u001a\u0004\bf\u0010+R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010^\u001a\u0004\bg\u0010+R%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010^\u001a\u0004\bh\u0010+R%\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010^\u001a\u0004\bi\u0010+R%\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010^\u001a\u0004\bj\u0010+R%\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010^\u001a\u0004\bk\u0010+R%\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010^\u001a\u0004\bl\u0010+R%\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010^\u001a\u0004\bm\u0010+R%\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010^\u001a\u0004\bn\u0010+R%\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010^\u001a\u0004\bo\u0010+R%\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010^\u001a\u0004\bp\u0010+R%\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010^\u001a\u0004\bq\u0010+R%\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010^\u001a\u0004\br\u0010+R%\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010^\u001a\u0004\bs\u0010+R%\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010^\u001a\u0004\bt\u0010+R%\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010^\u001a\u0004\bu\u0010+R%\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010^\u001a\u0004\bv\u0010+R%\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010^\u001a\u0004\bw\u0010+R%\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010^\u001a\u0004\bx\u0010+R%\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010^\u001a\u0004\by\u0010+R%\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010^\u001a\u0004\bz\u0010+R%\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010^\u001a\u0004\b{\u0010+R%\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010^\u001a\u0004\b|\u0010+¨\u0006\u007f"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/TopTeamsStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/FootballTopTeamsStatisticsItem;", "avgRating", "goalsScored", "goalsConceded", "bigChances", "bigChancesMissed", "hitWoodwork", "expectedGoals", "expectedGoalsOnTarget", "expectedAssists", "goalsPrevented", "yellowCards", "redCards", "averageBallPossession", "accuratePasses", "accurateLongBalls", "accurateCrosses", "shots", "shotsOnTarget", "successfulDribbles", "tackles", "interceptions", "clearances", "corners", "fouls", "penaltyGoals", "penaltyGoalsConceded", "cleanSheets", "kilometersCovered", "numberOfSprints", "titlesWon", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopTeamsStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopTeamsStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getAvgRating", "getGoalsScored", "getGoalsConceded", "getBigChances", "getBigChancesMissed", "getHitWoodwork", "getExpectedGoals", "getExpectedGoalsOnTarget", "getExpectedAssists", "getGoalsPrevented", "getYellowCards", "getRedCards", "getAverageBallPossession", "getAccuratePasses", "getAccurateLongBalls", "getAccurateCrosses", "getShots", "getShotsOnTarget", "getSuccessfulDribbles", "getTackles", "getInterceptions", "getClearances", "getCorners", "getFouls", "getPenaltyGoals", "getPenaltyGoalsConceded", "getCleanSheets", "getKilometersCovered", "getNumberOfSprints", "getTitlesWon", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FootballTopTeamsStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> accurateCrosses;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> accurateLongBalls;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> accuratePasses;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> averageBallPossession;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> avgRating;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> bigChances;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> bigChancesMissed;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> cleanSheets;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> clearances;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> corners;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> expectedAssists;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> expectedGoals;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> expectedGoalsOnTarget;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> fouls;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> goalsConceded;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> goalsPrevented;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> goalsScored;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> hitWoodwork;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> interceptions;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> kilometersCovered;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> numberOfSprints;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> penaltyGoals;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> penaltyGoalsConceded;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> redCards;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> shots;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> shotsOnTarget;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> successfulDribbles;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> tackles;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> titlesWon;

    @Nullable
    private final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> yellowCards;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new yl8(4)), ypa.a(ysaVar, new yl8(6)), ypa.a(ysaVar, new yl8(18)), ypa.a(ysaVar, new yl8(19)), ypa.a(ysaVar, new yl8(20)), ypa.a(ysaVar, new yl8(21)), ypa.a(ysaVar, new yl8(22)), ypa.a(ysaVar, new yl8(23)), ypa.a(ysaVar, new yl8(24)), ypa.a(ysaVar, new yl8(25)), ypa.a(ysaVar, new yl8(15)), ypa.a(ysaVar, new yl8(26)), ypa.a(ysaVar, new yl8(27)), ypa.a(ysaVar, new yl8(28)), ypa.a(ysaVar, new yl8(29)), ypa.a(ysaVar, new zl8(0)), ypa.a(ysaVar, new zl8(1)), ypa.a(ysaVar, new zl8(2)), ypa.a(ysaVar, new zl8(3)), ypa.a(ysaVar, new yl8(5)), ypa.a(ysaVar, new yl8(7)), ypa.a(ysaVar, new yl8(8)), ypa.a(ysaVar, new yl8(9)), ypa.a(ysaVar, new yl8(10)), ypa.a(ysaVar, new yl8(11)), ypa.a(ysaVar, new yl8(12)), ypa.a(ysaVar, new yl8(13)), ypa.a(ysaVar, new yl8(14)), ypa.a(ysaVar, new yl8(16)), ypa.a(ysaVar, new yl8(17))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FootballTopTeamsStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, List list30, t5h t5hVar) {
        super(i, t5hVar);
        if (1073741823 != (i & 1073741823)) {
            oea.z(i, 1073741823, FootballTopTeamsStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.avgRating = list;
        this.goalsScored = list2;
        this.goalsConceded = list3;
        this.bigChances = list4;
        this.bigChancesMissed = list5;
        this.hitWoodwork = list6;
        this.expectedGoals = list7;
        this.expectedGoalsOnTarget = list8;
        this.expectedAssists = list9;
        this.goalsPrevented = list10;
        this.yellowCards = list11;
        this.redCards = list12;
        this.averageBallPossession = list13;
        this.accuratePasses = list14;
        this.accurateLongBalls = list15;
        this.accurateCrosses = list16;
        this.shots = list17;
        this.shotsOnTarget = list18;
        this.successfulDribbles = list19;
        this.tackles = list20;
        this.interceptions = list21;
        this.clearances = list22;
        this.corners = list23;
        this.fouls = list24;
        this.penaltyGoals = list25;
        this.penaltyGoalsConceded = list26;
        this.cleanSheets = list27;
        this.kilometersCovered = list28;
        this.numberOfSprints = list29;
        this.titlesWon = list30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$13() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$14() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$15() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$16() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$17() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$18() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$19() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$20() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$21() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$22() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$23() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$24() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$25() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$26() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$27() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$28() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FootballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ FootballTopTeamsStatistics copy$default(FootballTopTeamsStatistics footballTopTeamsStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, List list30, int i, Object obj) {
        List list31;
        List list32;
        List list33 = (i & 1) != 0 ? footballTopTeamsStatistics.avgRating : list;
        List list34 = (i & 2) != 0 ? footballTopTeamsStatistics.goalsScored : list2;
        List list35 = (i & 4) != 0 ? footballTopTeamsStatistics.goalsConceded : list3;
        List list36 = (i & 8) != 0 ? footballTopTeamsStatistics.bigChances : list4;
        List list37 = (i & 16) != 0 ? footballTopTeamsStatistics.bigChancesMissed : list5;
        List list38 = (i & 32) != 0 ? footballTopTeamsStatistics.hitWoodwork : list6;
        List list39 = (i & 64) != 0 ? footballTopTeamsStatistics.expectedGoals : list7;
        List list40 = (i & 128) != 0 ? footballTopTeamsStatistics.expectedGoalsOnTarget : list8;
        List list41 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? footballTopTeamsStatistics.expectedAssists : list9;
        List list42 = (i & 512) != 0 ? footballTopTeamsStatistics.goalsPrevented : list10;
        List list43 = (i & 1024) != 0 ? footballTopTeamsStatistics.yellowCards : list11;
        List list44 = (i & a.o) != 0 ? footballTopTeamsStatistics.redCards : list12;
        List list45 = (i & 4096) != 0 ? footballTopTeamsStatistics.averageBallPossession : list13;
        List list46 = (i & 8192) != 0 ? footballTopTeamsStatistics.accuratePasses : list14;
        List list47 = list33;
        List list48 = (i & 16384) != 0 ? footballTopTeamsStatistics.accurateLongBalls : list15;
        List list49 = (i & 32768) != 0 ? footballTopTeamsStatistics.accurateCrosses : list16;
        List list50 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? footballTopTeamsStatistics.shots : list17;
        List list51 = (i & 131072) != 0 ? footballTopTeamsStatistics.shotsOnTarget : list18;
        List list52 = (i & 262144) != 0 ? footballTopTeamsStatistics.successfulDribbles : list19;
        List list53 = (i & 524288) != 0 ? footballTopTeamsStatistics.tackles : list20;
        List list54 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? footballTopTeamsStatistics.interceptions : list21;
        List list55 = (i & 2097152) != 0 ? footballTopTeamsStatistics.clearances : list22;
        List list56 = (i & 4194304) != 0 ? footballTopTeamsStatistics.corners : list23;
        List list57 = (i & 8388608) != 0 ? footballTopTeamsStatistics.fouls : list24;
        List list58 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? footballTopTeamsStatistics.penaltyGoals : list25;
        List list59 = (i & 33554432) != 0 ? footballTopTeamsStatistics.penaltyGoalsConceded : list26;
        List list60 = (i & 67108864) != 0 ? footballTopTeamsStatistics.cleanSheets : list27;
        List list61 = (i & 134217728) != 0 ? footballTopTeamsStatistics.kilometersCovered : list28;
        List list62 = (i & 268435456) != 0 ? footballTopTeamsStatistics.numberOfSprints : list29;
        if ((i & 536870912) != 0) {
            list32 = list62;
            list31 = footballTopTeamsStatistics.titlesWon;
        } else {
            list31 = list30;
            list32 = list62;
        }
        return footballTopTeamsStatistics.copy(list47, list34, list35, list36, list37, list38, list39, list40, list41, list42, list43, list44, list45, list46, list48, list49, list50, list51, list52, list53, list54, list55, list56, list57, list58, list59, list60, list61, list32, list31);
    }

    public static final /* synthetic */ void write$Self$model_release(FootballTopTeamsStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.avgRating);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.goalsScored);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.goalsConceded);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.bigChances);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.bigChancesMissed);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.hitWoodwork);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.expectedGoals);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.expectedGoalsOnTarget);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.expectedAssists);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.goalsPrevented);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.yellowCards);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.redCards);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.averageBallPossession);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.accuratePasses);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.accurateLongBalls);
        output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.accurateCrosses);
        output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.shots);
        output.h(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.shotsOnTarget);
        output.h(serialDesc, 18, (KSerializer) joaVarArr[18].getValue(), self.successfulDribbles);
        output.h(serialDesc, 19, (KSerializer) joaVarArr[19].getValue(), self.tackles);
        output.h(serialDesc, 20, (KSerializer) joaVarArr[20].getValue(), self.interceptions);
        output.h(serialDesc, 21, (KSerializer) joaVarArr[21].getValue(), self.clearances);
        output.h(serialDesc, 22, (KSerializer) joaVarArr[22].getValue(), self.corners);
        output.h(serialDesc, 23, (KSerializer) joaVarArr[23].getValue(), self.fouls);
        output.h(serialDesc, 24, (KSerializer) joaVarArr[24].getValue(), self.penaltyGoals);
        output.h(serialDesc, 25, (KSerializer) joaVarArr[25].getValue(), self.penaltyGoalsConceded);
        output.h(serialDesc, 26, (KSerializer) joaVarArr[26].getValue(), self.cleanSheets);
        output.h(serialDesc, 27, (KSerializer) joaVarArr[27].getValue(), self.kilometersCovered);
        output.h(serialDesc, 28, (KSerializer) joaVarArr[28].getValue(), self.numberOfSprints);
        output.h(serialDesc, 29, (KSerializer) joaVarArr[29].getValue(), self.titlesWon);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component1() {
        return this.avgRating;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component10() {
        return this.goalsPrevented;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component11() {
        return this.yellowCards;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component12() {
        return this.redCards;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component13() {
        return this.averageBallPossession;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component14() {
        return this.accuratePasses;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component15() {
        return this.accurateLongBalls;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component16() {
        return this.accurateCrosses;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component17() {
        return this.shots;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component18() {
        return this.shotsOnTarget;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component19() {
        return this.successfulDribbles;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component2() {
        return this.goalsScored;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component20() {
        return this.tackles;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component21() {
        return this.interceptions;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component22() {
        return this.clearances;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component23() {
        return this.corners;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component24() {
        return this.fouls;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component25() {
        return this.penaltyGoals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component26() {
        return this.penaltyGoalsConceded;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component27() {
        return this.cleanSheets;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component28() {
        return this.kilometersCovered;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component29() {
        return this.numberOfSprints;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component3() {
        return this.goalsConceded;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component30() {
        return this.titlesWon;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component4() {
        return this.bigChances;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component5() {
        return this.bigChancesMissed;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component6() {
        return this.hitWoodwork;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component7() {
        return this.expectedGoals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component8() {
        return this.expectedGoalsOnTarget;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> component9() {
        return this.expectedAssists;
    }

    @NotNull
    public final FootballTopTeamsStatistics copy(@Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> avgRating, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> goalsScored, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> goalsConceded, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> bigChances, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> bigChancesMissed, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> hitWoodwork, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> expectedGoals, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> expectedGoalsOnTarget, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> expectedAssists, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> goalsPrevented, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> yellowCards, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> redCards, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> averageBallPossession, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> accuratePasses, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> accurateLongBalls, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> accurateCrosses, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> shots, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> shotsOnTarget, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> successfulDribbles, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> tackles, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> interceptions, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> clearances, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> corners, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> fouls, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> penaltyGoals, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> penaltyGoalsConceded, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> cleanSheets, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> kilometersCovered, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> numberOfSprints, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> titlesWon) {
        return new FootballTopTeamsStatistics(avgRating, goalsScored, goalsConceded, bigChances, bigChancesMissed, hitWoodwork, expectedGoals, expectedGoalsOnTarget, expectedAssists, goalsPrevented, yellowCards, redCards, averageBallPossession, accuratePasses, accurateLongBalls, accurateCrosses, shots, shotsOnTarget, successfulDribbles, tackles, interceptions, clearances, corners, fouls, penaltyGoals, penaltyGoalsConceded, cleanSheets, kilometersCovered, numberOfSprints, titlesWon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FootballTopTeamsStatistics)) {
            return false;
        }
        FootballTopTeamsStatistics footballTopTeamsStatistics = (FootballTopTeamsStatistics) other;
        return Intrinsics.c(this.avgRating, footballTopTeamsStatistics.avgRating) && Intrinsics.c(this.goalsScored, footballTopTeamsStatistics.goalsScored) && Intrinsics.c(this.goalsConceded, footballTopTeamsStatistics.goalsConceded) && Intrinsics.c(this.bigChances, footballTopTeamsStatistics.bigChances) && Intrinsics.c(this.bigChancesMissed, footballTopTeamsStatistics.bigChancesMissed) && Intrinsics.c(this.hitWoodwork, footballTopTeamsStatistics.hitWoodwork) && Intrinsics.c(this.expectedGoals, footballTopTeamsStatistics.expectedGoals) && Intrinsics.c(this.expectedGoalsOnTarget, footballTopTeamsStatistics.expectedGoalsOnTarget) && Intrinsics.c(this.expectedAssists, footballTopTeamsStatistics.expectedAssists) && Intrinsics.c(this.goalsPrevented, footballTopTeamsStatistics.goalsPrevented) && Intrinsics.c(this.yellowCards, footballTopTeamsStatistics.yellowCards) && Intrinsics.c(this.redCards, footballTopTeamsStatistics.redCards) && Intrinsics.c(this.averageBallPossession, footballTopTeamsStatistics.averageBallPossession) && Intrinsics.c(this.accuratePasses, footballTopTeamsStatistics.accuratePasses) && Intrinsics.c(this.accurateLongBalls, footballTopTeamsStatistics.accurateLongBalls) && Intrinsics.c(this.accurateCrosses, footballTopTeamsStatistics.accurateCrosses) && Intrinsics.c(this.shots, footballTopTeamsStatistics.shots) && Intrinsics.c(this.shotsOnTarget, footballTopTeamsStatistics.shotsOnTarget) && Intrinsics.c(this.successfulDribbles, footballTopTeamsStatistics.successfulDribbles) && Intrinsics.c(this.tackles, footballTopTeamsStatistics.tackles) && Intrinsics.c(this.interceptions, footballTopTeamsStatistics.interceptions) && Intrinsics.c(this.clearances, footballTopTeamsStatistics.clearances) && Intrinsics.c(this.corners, footballTopTeamsStatistics.corners) && Intrinsics.c(this.fouls, footballTopTeamsStatistics.fouls) && Intrinsics.c(this.penaltyGoals, footballTopTeamsStatistics.penaltyGoals) && Intrinsics.c(this.penaltyGoalsConceded, footballTopTeamsStatistics.penaltyGoalsConceded) && Intrinsics.c(this.cleanSheets, footballTopTeamsStatistics.cleanSheets) && Intrinsics.c(this.kilometersCovered, footballTopTeamsStatistics.kilometersCovered) && Intrinsics.c(this.numberOfSprints, footballTopTeamsStatistics.numberOfSprints) && Intrinsics.c(this.titlesWon, footballTopTeamsStatistics.titlesWon);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getAccurateCrosses() {
        return this.accurateCrosses;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getAccurateLongBalls() {
        return this.accurateLongBalls;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getAccuratePasses() {
        return this.accuratePasses;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getAverageBallPossession() {
        return this.averageBallPossession;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getAvgRating() {
        return this.avgRating;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getBigChances() {
        return this.bigChances;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getBigChancesMissed() {
        return this.bigChancesMissed;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getCleanSheets() {
        return this.cleanSheets;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getClearances() {
        return this.clearances;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getCorners() {
        return this.corners;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getExpectedAssists() {
        return this.expectedAssists;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getExpectedGoals() {
        return this.expectedGoals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getExpectedGoalsOnTarget() {
        return this.expectedGoalsOnTarget;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getFouls() {
        return this.fouls;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getGoalsConceded() {
        return this.goalsConceded;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getGoalsPrevented() {
        return this.goalsPrevented;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getGoalsScored() {
        return this.goalsScored;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getHitWoodwork() {
        return this.hitWoodwork;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getInterceptions() {
        return this.interceptions;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getKilometersCovered() {
        return this.kilometersCovered;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getNumberOfSprints() {
        return this.numberOfSprints;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getPenaltyGoalsConceded() {
        return this.penaltyGoalsConceded;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getRedCards() {
        return this.redCards;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getShots() {
        return this.shots;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getShotsOnTarget() {
        return this.shotsOnTarget;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getSuccessfulDribbles() {
        return this.successfulDribbles;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getTackles() {
        return this.tackles;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getTitlesWon() {
        return this.titlesWon;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list = this.avgRating;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list2 = this.goalsScored;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list3 = this.goalsConceded;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list4 = this.bigChances;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list5 = this.bigChancesMissed;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list6 = this.hitWoodwork;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list7 = this.expectedGoals;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list8 = this.expectedGoalsOnTarget;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list9 = this.expectedAssists;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list10 = this.goalsPrevented;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list11 = this.yellowCards;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list12 = this.redCards;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list13 = this.averageBallPossession;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list14 = this.accuratePasses;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list15 = this.accurateLongBalls;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list16 = this.accurateCrosses;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list17 = this.shots;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list18 = this.shotsOnTarget;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list19 = this.successfulDribbles;
        int hashCode19 = (hashCode18 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list20 = this.tackles;
        int hashCode20 = (hashCode19 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list21 = this.interceptions;
        int hashCode21 = (hashCode20 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list22 = this.clearances;
        int hashCode22 = (hashCode21 + (list22 == null ? 0 : list22.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list23 = this.corners;
        int hashCode23 = (hashCode22 + (list23 == null ? 0 : list23.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list24 = this.fouls;
        int hashCode24 = (hashCode23 + (list24 == null ? 0 : list24.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list25 = this.penaltyGoals;
        int hashCode25 = (hashCode24 + (list25 == null ? 0 : list25.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list26 = this.penaltyGoalsConceded;
        int hashCode26 = (hashCode25 + (list26 == null ? 0 : list26.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list27 = this.cleanSheets;
        int hashCode27 = (hashCode26 + (list27 == null ? 0 : list27.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list28 = this.kilometersCovered;
        int hashCode28 = (hashCode27 + (list28 == null ? 0 : list28.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list29 = this.numberOfSprints;
        int hashCode29 = (hashCode28 + (list29 == null ? 0 : list29.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list30 = this.titlesWon;
        return hashCode29 + (list30 != null ? list30.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list = this.avgRating;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list2 = this.goalsScored;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list3 = this.goalsConceded;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list4 = this.bigChances;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list5 = this.bigChancesMissed;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list6 = this.hitWoodwork;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list7 = this.expectedGoals;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list8 = this.expectedGoalsOnTarget;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list9 = this.expectedAssists;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list10 = this.goalsPrevented;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list11 = this.yellowCards;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list12 = this.redCards;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list13 = this.averageBallPossession;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list14 = this.accuratePasses;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list15 = this.accurateLongBalls;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list16 = this.accurateCrosses;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list17 = this.shots;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list18 = this.shotsOnTarget;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list19 = this.successfulDribbles;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list20 = this.tackles;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list21 = this.interceptions;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list22 = this.clearances;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list23 = this.corners;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list24 = this.fouls;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list25 = this.penaltyGoals;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list26 = this.penaltyGoalsConceded;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list27 = this.cleanSheets;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list28 = this.kilometersCovered;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list29 = this.numberOfSprints;
        List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list30 = this.titlesWon;
        StringBuilder s = fc6.s("FootballTopTeamsStatistics(avgRating=", ", goalsScored=", ", goalsConceded=", list, list2);
        vxd.w(s, list3, ", bigChances=", list4, ", bigChancesMissed=");
        vxd.w(s, list5, ", hitWoodwork=", list6, ", expectedGoals=");
        vxd.w(s, list7, ", expectedGoalsOnTarget=", list8, ", expectedAssists=");
        vxd.w(s, list9, ", goalsPrevented=", list10, ", yellowCards=");
        vxd.w(s, list11, ", redCards=", list12, ", averageBallPossession=");
        vxd.w(s, list13, ", accuratePasses=", list14, ", accurateLongBalls=");
        vxd.w(s, list15, ", accurateCrosses=", list16, ", shots=");
        vxd.w(s, list17, ", shotsOnTarget=", list18, ", successfulDribbles=");
        vxd.w(s, list19, ", tackles=", list20, ", interceptions=");
        vxd.w(s, list21, ", clearances=", list22, ", corners=");
        vxd.w(s, list23, ", fouls=", list24, ", penaltyGoals=");
        vxd.w(s, list25, ", penaltyGoalsConceded=", list26, ", cleanSheets=");
        vxd.w(s, list27, ", kilometersCovered=", list28, ", numberOfSprints=");
        return me4.j(s, list29, ", titlesWon=", list30, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopTeamsStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopTeamsStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FootballTopTeamsStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FootballTopTeamsStatistics(@Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list2, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list3, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list4, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list5, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list6, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list7, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list8, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list9, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list10, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list11, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list12, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list13, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list14, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list15, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list16, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list17, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list18, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list19, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list20, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list21, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list22, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list23, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list24, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list25, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list26, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list27, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list28, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list29, @Nullable List<TopTeamsStatisticsItem<FootballTopTeamsStatisticsItem>> list30) {
        super(null);
        this.avgRating = list;
        this.goalsScored = list2;
        this.goalsConceded = list3;
        this.bigChances = list4;
        this.bigChancesMissed = list5;
        this.hitWoodwork = list6;
        this.expectedGoals = list7;
        this.expectedGoalsOnTarget = list8;
        this.expectedAssists = list9;
        this.goalsPrevented = list10;
        this.yellowCards = list11;
        this.redCards = list12;
        this.averageBallPossession = list13;
        this.accuratePasses = list14;
        this.accurateLongBalls = list15;
        this.accurateCrosses = list16;
        this.shots = list17;
        this.shotsOnTarget = list18;
        this.successfulDribbles = list19;
        this.tackles = list20;
        this.interceptions = list21;
        this.clearances = list22;
        this.corners = list23;
        this.fouls = list24;
        this.penaltyGoals = list25;
        this.penaltyGoalsConceded = list26;
        this.cleanSheets = list27;
        this.kilometersCovered = list28;
        this.numberOfSprints = list29;
        this.titlesWon = list30;
    }
}
