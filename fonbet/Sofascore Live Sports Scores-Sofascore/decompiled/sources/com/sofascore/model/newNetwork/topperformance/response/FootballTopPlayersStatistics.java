package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.FootballTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.FootballTopPlayersStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import defpackage.fc6;
import defpackage.joa;
import defpackage.lj8;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.xl8;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u0002:\u0004\u0086\u0001\u0085\u0001BÇ\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\u0004\b&\u0010'Bã\u0005\b\u0010\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010*\u001a\u00020(\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b&\u0010-J\u001e\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b0\u0010/J\u001e\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b1\u0010/J\u001e\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b2\u0010/J\u001e\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b3\u0010/J\u001e\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b4\u0010/J\u001e\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b5\u0010/J\u001e\u00106\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b6\u0010/J\u001e\u00107\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b7\u0010/J\u001e\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b8\u0010/J\u001e\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b9\u0010/J\u001e\u0010:\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b:\u0010/J\u001e\u0010;\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b;\u0010/J\u001e\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b<\u0010/J\u001e\u0010=\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b=\u0010/J\u001e\u0010>\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b>\u0010/J\u001e\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b?\u0010/J\u001e\u0010@\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b@\u0010/J\u001e\u0010A\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bA\u0010/J\u001e\u0010B\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bB\u0010/J\u001e\u0010C\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bC\u0010/J\u001e\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bD\u0010/J\u001e\u0010E\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bE\u0010/J\u001e\u0010F\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bF\u0010/J\u001e\u0010G\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bG\u0010/J\u001e\u0010H\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bH\u0010/J\u001e\u0010I\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bI\u0010/J\u001e\u0010J\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bJ\u0010/J\u001e\u0010K\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bK\u0010/J\u001e\u0010L\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bL\u0010/J\u001e\u0010M\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bM\u0010/J\u001e\u0010N\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bN\u0010/J\u0090\u0006\u0010O\u001a\u00020\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010R\u001a\u00020QHÖ\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020(HÖ\u0001¢\u0006\u0004\bT\u0010UJ\u001a\u0010Y\u001a\u00020X2\b\u0010W\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bY\u0010ZJ'\u0010c\u001a\u00020`2\u0006\u0010[\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H\u0001¢\u0006\u0004\ba\u0010bR(\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010d\u001a\u0004\be\u0010/R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010d\u001a\u0004\bf\u0010/R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010d\u001a\u0004\bg\u0010/R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010d\u001a\u0004\bh\u0010/R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010d\u001a\u0004\bi\u0010/R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010d\u001a\u0004\bj\u0010/R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010d\u001a\u0004\bk\u0010/R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010d\u001a\u0004\bl\u0010/R%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010d\u001a\u0004\bm\u0010/R%\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010d\u001a\u0004\bn\u0010/R%\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010d\u001a\u0004\bo\u0010/R%\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010d\u001a\u0004\bp\u0010/R%\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010d\u001a\u0004\bq\u0010/R%\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010d\u001a\u0004\br\u0010/R%\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010d\u001a\u0004\bs\u0010/R%\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010d\u001a\u0004\bt\u0010/R%\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010d\u001a\u0004\bu\u0010/R%\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010d\u001a\u0004\bv\u0010/R%\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010d\u001a\u0004\bw\u0010/R%\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010d\u001a\u0004\bx\u0010/R%\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010d\u001a\u0004\by\u0010/R%\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010d\u001a\u0004\bz\u0010/R%\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010d\u001a\u0004\b{\u0010/R%\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010d\u001a\u0004\b|\u0010/R%\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010d\u001a\u0004\b}\u0010/R%\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010d\u001a\u0004\b~\u0010/R%\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010d\u001a\u0004\b\u007f\u0010/R&\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b!\u0010d\u001a\u0005\b\u0080\u0001\u0010/R&\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\"\u0010d\u001a\u0005\b\u0081\u0001\u0010/R&\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b#\u0010d\u001a\u0005\b\u0082\u0001\u0010/R&\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b$\u0010d\u001a\u0005\b\u0083\u0001\u0010/R&\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b%\u0010d\u001a\u0005\b\u0084\u0001\u0010/¨\u0006\u0087\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/RatedTopPlayersStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/FootballTopPlayersStatisticsItem;", CampaignEx.JSON_KEY_STAR, "goals", "expectedGoals", "assists", "expectedAssists", "penaltyGoals", "goalsAssistsSum", "freeKickGoal", "scoringFrequency", "totalShots", "shotsOnTarget", "bigChancesMissed", "bigChancesCreated", "accuratePasses", "keyPasses", "accurateLongBalls", "successfulDribbles", "penaltyWon", "tackles", "interceptions", "clearances", "possessionLost", "yellowCards", "redCards", "saves", "goalsPrevented", "mostConceded", "leastConceded", "cleanSheet", "kilometersCovered", "numberOfSprints", "topSpeed", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopPlayersStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopPlayersStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getRating", "getGoals", "getExpectedGoals", "getAssists", "getExpectedAssists", "getPenaltyGoals", "getGoalsAssistsSum", "getFreeKickGoal", "getScoringFrequency", "getTotalShots", "getShotsOnTarget", "getBigChancesMissed", "getBigChancesCreated", "getAccuratePasses", "getKeyPasses", "getAccurateLongBalls", "getSuccessfulDribbles", "getPenaltyWon", "getTackles", "getInterceptions", "getClearances", "getPossessionLost", "getYellowCards", "getRedCards", "getSaves", "getGoalsPrevented", "getMostConceded", "getLeastConceded", "getCleanSheet", "getKilometersCovered", "getNumberOfSprints", "getTopSpeed", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FootballTopPlayersStatistics extends TopPerformanceStatistics implements RatedTopPlayersStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> accurateLongBalls;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> accuratePasses;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> assists;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> bigChancesCreated;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> bigChancesMissed;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> cleanSheet;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> clearances;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> expectedAssists;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> expectedGoals;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> freeKickGoal;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> goals;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> goalsAssistsSum;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> goalsPrevented;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> interceptions;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> keyPasses;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> kilometersCovered;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> leastConceded;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> mostConceded;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> numberOfSprints;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> penaltyGoals;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> penaltyWon;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> possessionLost;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> rating;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> redCards;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> saves;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> scoringFrequency;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> shotsOnTarget;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> successfulDribbles;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> tackles;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> topSpeed;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> totalShots;

    @Nullable
    private final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> yellowCards;

    static {
        ysa ysaVar = ysa.b;
        int i = 12;
        $childSerializers = new joa[]{ypa.a(ysaVar, new lj8(11)), ypa.a(ysaVar, new lj8(13)), ypa.a(ysaVar, new lj8(25)), ypa.a(ysaVar, new lj8(28)), ypa.a(ysaVar, new lj8(29)), ypa.a(ysaVar, new xl8(0)), ypa.a(ysaVar, new xl8(1)), ypa.a(ysaVar, new xl8(2)), ypa.a(ysaVar, new xl8(4)), ypa.a(ysaVar, new xl8(5)), ypa.a(ysaVar, new lj8(22)), ypa.a(ysaVar, new xl8(3)), ypa.a(ysaVar, new xl8(6)), ypa.a(ysaVar, new xl8(7)), ypa.a(ysaVar, new xl8(8)), ypa.a(ysaVar, new xl8(9)), ypa.a(ysaVar, new xl8(10)), ypa.a(ysaVar, new xl8(11)), ypa.a(ysaVar, new xl8(i)), ypa.a(ysaVar, new lj8(i)), ypa.a(ysaVar, new lj8(14)), ypa.a(ysaVar, new lj8(15)), ypa.a(ysaVar, new lj8(16)), ypa.a(ysaVar, new lj8(17)), ypa.a(ysaVar, new lj8(18)), ypa.a(ysaVar, new lj8(19)), ypa.a(ysaVar, new lj8(20)), ypa.a(ysaVar, new lj8(21)), ypa.a(ysaVar, new lj8(23)), ypa.a(ysaVar, new lj8(24)), ypa.a(ysaVar, new lj8(26)), ypa.a(ysaVar, new lj8(27))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FootballTopPlayersStatistics(int i, int i2, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, List list30, List list31, List list32, t5h t5hVar) {
        super(i, t5hVar);
        if (-1 != i) {
            oea.y(new int[]{i, i2}, new int[]{-1, 0}, FootballTopPlayersStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.rating = list;
        this.goals = list2;
        this.expectedGoals = list3;
        this.assists = list4;
        this.expectedAssists = list5;
        this.penaltyGoals = list6;
        this.goalsAssistsSum = list7;
        this.freeKickGoal = list8;
        this.scoringFrequency = list9;
        this.totalShots = list10;
        this.shotsOnTarget = list11;
        this.bigChancesMissed = list12;
        this.bigChancesCreated = list13;
        this.accuratePasses = list14;
        this.keyPasses = list15;
        this.accurateLongBalls = list16;
        this.successfulDribbles = list17;
        this.penaltyWon = list18;
        this.tackles = list19;
        this.interceptions = list20;
        this.clearances = list21;
        this.possessionLost = list22;
        this.yellowCards = list23;
        this.redCards = list24;
        this.saves = list25;
        this.goalsPrevented = list26;
        this.mostConceded = list27;
        this.leastConceded = list28;
        this.cleanSheet = list29;
        this.kilometersCovered = list30;
        this.numberOfSprints = list31;
        this.topSpeed = list32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$13() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$14() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$15() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$16() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$17() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$18() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$19() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$20() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$21() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$22() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$23() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$24() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$25() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$26() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$27() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$28() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$29() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$30() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ FootballTopPlayersStatistics copy$default(FootballTopPlayersStatistics footballTopPlayersStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, List list30, List list31, List list32, int i, Object obj) {
        List list33;
        List list34;
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
        List list64 = (i & 1) != 0 ? footballTopPlayersStatistics.rating : list;
        List list65 = (i & 2) != 0 ? footballTopPlayersStatistics.goals : list2;
        List list66 = (i & 4) != 0 ? footballTopPlayersStatistics.expectedGoals : list3;
        List list67 = (i & 8) != 0 ? footballTopPlayersStatistics.assists : list4;
        List list68 = (i & 16) != 0 ? footballTopPlayersStatistics.expectedAssists : list5;
        List list69 = (i & 32) != 0 ? footballTopPlayersStatistics.penaltyGoals : list6;
        List list70 = (i & 64) != 0 ? footballTopPlayersStatistics.goalsAssistsSum : list7;
        List list71 = (i & 128) != 0 ? footballTopPlayersStatistics.freeKickGoal : list8;
        List list72 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? footballTopPlayersStatistics.scoringFrequency : list9;
        List list73 = (i & 512) != 0 ? footballTopPlayersStatistics.totalShots : list10;
        List list74 = (i & 1024) != 0 ? footballTopPlayersStatistics.shotsOnTarget : list11;
        List list75 = (i & a.o) != 0 ? footballTopPlayersStatistics.bigChancesMissed : list12;
        List list76 = (i & 4096) != 0 ? footballTopPlayersStatistics.bigChancesCreated : list13;
        List list77 = (i & 8192) != 0 ? footballTopPlayersStatistics.accuratePasses : list14;
        List list78 = list64;
        List list79 = (i & 16384) != 0 ? footballTopPlayersStatistics.keyPasses : list15;
        List list80 = (i & 32768) != 0 ? footballTopPlayersStatistics.accurateLongBalls : list16;
        List list81 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? footballTopPlayersStatistics.successfulDribbles : list17;
        List list82 = (i & 131072) != 0 ? footballTopPlayersStatistics.penaltyWon : list18;
        List list83 = (i & 262144) != 0 ? footballTopPlayersStatistics.tackles : list19;
        List list84 = (i & 524288) != 0 ? footballTopPlayersStatistics.interceptions : list20;
        List list85 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? footballTopPlayersStatistics.clearances : list21;
        List list86 = (i & 2097152) != 0 ? footballTopPlayersStatistics.possessionLost : list22;
        List list87 = (i & 4194304) != 0 ? footballTopPlayersStatistics.yellowCards : list23;
        List list88 = (i & 8388608) != 0 ? footballTopPlayersStatistics.redCards : list24;
        List list89 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? footballTopPlayersStatistics.saves : list25;
        List list90 = (i & 33554432) != 0 ? footballTopPlayersStatistics.goalsPrevented : list26;
        List list91 = (i & 67108864) != 0 ? footballTopPlayersStatistics.mostConceded : list27;
        List list92 = (i & 134217728) != 0 ? footballTopPlayersStatistics.leastConceded : list28;
        List list93 = (i & 268435456) != 0 ? footballTopPlayersStatistics.cleanSheet : list29;
        List list94 = (i & 536870912) != 0 ? footballTopPlayersStatistics.kilometersCovered : list30;
        List list95 = (i & 1073741824) != 0 ? footballTopPlayersStatistics.numberOfSprints : list31;
        if ((i & Integer.MIN_VALUE) != 0) {
            list34 = list95;
            list33 = footballTopPlayersStatistics.topSpeed;
            list36 = list81;
            list37 = list82;
            list38 = list83;
            list39 = list84;
            list40 = list85;
            list41 = list86;
            list42 = list87;
            list43 = list88;
            list44 = list89;
            list45 = list90;
            list46 = list91;
            list47 = list92;
            list48 = list93;
            list49 = list94;
            list50 = list79;
            list51 = list65;
            list52 = list66;
            list53 = list67;
            list54 = list68;
            list55 = list69;
            list56 = list70;
            list57 = list71;
            list58 = list72;
            list59 = list73;
            list60 = list74;
            list61 = list75;
            list62 = list76;
            list63 = list77;
            list35 = list80;
        } else {
            list33 = list32;
            list34 = list95;
            list35 = list80;
            list36 = list81;
            list37 = list82;
            list38 = list83;
            list39 = list84;
            list40 = list85;
            list41 = list86;
            list42 = list87;
            list43 = list88;
            list44 = list89;
            list45 = list90;
            list46 = list91;
            list47 = list92;
            list48 = list93;
            list49 = list94;
            list50 = list79;
            list51 = list65;
            list52 = list66;
            list53 = list67;
            list54 = list68;
            list55 = list69;
            list56 = list70;
            list57 = list71;
            list58 = list72;
            list59 = list73;
            list60 = list74;
            list61 = list75;
            list62 = list76;
            list63 = list77;
        }
        return footballTopPlayersStatistics.copy(list78, list51, list52, list53, list54, list55, list56, list57, list58, list59, list60, list61, list62, list63, list50, list35, list36, list37, list38, list39, list40, list41, list42, list43, list44, list45, list46, list47, list48, list49, list34, list33);
    }

    public static final /* synthetic */ void write$Self$model_release(FootballTopPlayersStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.getRating());
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.goals);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.expectedGoals);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.assists);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.expectedAssists);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.penaltyGoals);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.goalsAssistsSum);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.freeKickGoal);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.scoringFrequency);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.totalShots);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.shotsOnTarget);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.bigChancesMissed);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.bigChancesCreated);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.accuratePasses);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.keyPasses);
        output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.accurateLongBalls);
        output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.successfulDribbles);
        output.h(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.penaltyWon);
        output.h(serialDesc, 18, (KSerializer) joaVarArr[18].getValue(), self.tackles);
        output.h(serialDesc, 19, (KSerializer) joaVarArr[19].getValue(), self.interceptions);
        output.h(serialDesc, 20, (KSerializer) joaVarArr[20].getValue(), self.clearances);
        output.h(serialDesc, 21, (KSerializer) joaVarArr[21].getValue(), self.possessionLost);
        output.h(serialDesc, 22, (KSerializer) joaVarArr[22].getValue(), self.yellowCards);
        output.h(serialDesc, 23, (KSerializer) joaVarArr[23].getValue(), self.redCards);
        output.h(serialDesc, 24, (KSerializer) joaVarArr[24].getValue(), self.saves);
        output.h(serialDesc, 25, (KSerializer) joaVarArr[25].getValue(), self.goalsPrevented);
        output.h(serialDesc, 26, (KSerializer) joaVarArr[26].getValue(), self.mostConceded);
        output.h(serialDesc, 27, (KSerializer) joaVarArr[27].getValue(), self.leastConceded);
        output.h(serialDesc, 28, (KSerializer) joaVarArr[28].getValue(), self.cleanSheet);
        output.h(serialDesc, 29, (KSerializer) joaVarArr[29].getValue(), self.kilometersCovered);
        output.h(serialDesc, 30, (KSerializer) joaVarArr[30].getValue(), self.numberOfSprints);
        output.h(serialDesc, 31, (KSerializer) joaVarArr[31].getValue(), self.topSpeed);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component1() {
        return this.rating;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component10() {
        return this.totalShots;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component11() {
        return this.shotsOnTarget;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component12() {
        return this.bigChancesMissed;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component13() {
        return this.bigChancesCreated;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component14() {
        return this.accuratePasses;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component15() {
        return this.keyPasses;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component16() {
        return this.accurateLongBalls;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component17() {
        return this.successfulDribbles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component18() {
        return this.penaltyWon;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component19() {
        return this.tackles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component2() {
        return this.goals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component20() {
        return this.interceptions;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component21() {
        return this.clearances;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component22() {
        return this.possessionLost;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component23() {
        return this.yellowCards;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component24() {
        return this.redCards;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component25() {
        return this.saves;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component26() {
        return this.goalsPrevented;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component27() {
        return this.mostConceded;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component28() {
        return this.leastConceded;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component29() {
        return this.cleanSheet;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component3() {
        return this.expectedGoals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component30() {
        return this.kilometersCovered;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component31() {
        return this.numberOfSprints;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component32() {
        return this.topSpeed;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component4() {
        return this.assists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component5() {
        return this.expectedAssists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component6() {
        return this.penaltyGoals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component7() {
        return this.goalsAssistsSum;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component8() {
        return this.freeKickGoal;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> component9() {
        return this.scoringFrequency;
    }

    @NotNull
    public final FootballTopPlayersStatistics copy(@Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> rating, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> goals, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> expectedGoals, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> assists, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> expectedAssists, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> penaltyGoals, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> goalsAssistsSum, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> freeKickGoal, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> scoringFrequency, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> totalShots, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> shotsOnTarget, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> bigChancesMissed, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> bigChancesCreated, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> accuratePasses, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> keyPasses, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> accurateLongBalls, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> successfulDribbles, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> penaltyWon, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> tackles, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> interceptions, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> clearances, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> possessionLost, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> yellowCards, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> redCards, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> saves, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> goalsPrevented, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> mostConceded, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> leastConceded, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> cleanSheet, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> kilometersCovered, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> numberOfSprints, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> topSpeed) {
        return new FootballTopPlayersStatistics(rating, goals, expectedGoals, assists, expectedAssists, penaltyGoals, goalsAssistsSum, freeKickGoal, scoringFrequency, totalShots, shotsOnTarget, bigChancesMissed, bigChancesCreated, accuratePasses, keyPasses, accurateLongBalls, successfulDribbles, penaltyWon, tackles, interceptions, clearances, possessionLost, yellowCards, redCards, saves, goalsPrevented, mostConceded, leastConceded, cleanSheet, kilometersCovered, numberOfSprints, topSpeed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FootballTopPlayersStatistics)) {
            return false;
        }
        FootballTopPlayersStatistics footballTopPlayersStatistics = (FootballTopPlayersStatistics) other;
        return Intrinsics.c(this.rating, footballTopPlayersStatistics.rating) && Intrinsics.c(this.goals, footballTopPlayersStatistics.goals) && Intrinsics.c(this.expectedGoals, footballTopPlayersStatistics.expectedGoals) && Intrinsics.c(this.assists, footballTopPlayersStatistics.assists) && Intrinsics.c(this.expectedAssists, footballTopPlayersStatistics.expectedAssists) && Intrinsics.c(this.penaltyGoals, footballTopPlayersStatistics.penaltyGoals) && Intrinsics.c(this.goalsAssistsSum, footballTopPlayersStatistics.goalsAssistsSum) && Intrinsics.c(this.freeKickGoal, footballTopPlayersStatistics.freeKickGoal) && Intrinsics.c(this.scoringFrequency, footballTopPlayersStatistics.scoringFrequency) && Intrinsics.c(this.totalShots, footballTopPlayersStatistics.totalShots) && Intrinsics.c(this.shotsOnTarget, footballTopPlayersStatistics.shotsOnTarget) && Intrinsics.c(this.bigChancesMissed, footballTopPlayersStatistics.bigChancesMissed) && Intrinsics.c(this.bigChancesCreated, footballTopPlayersStatistics.bigChancesCreated) && Intrinsics.c(this.accuratePasses, footballTopPlayersStatistics.accuratePasses) && Intrinsics.c(this.keyPasses, footballTopPlayersStatistics.keyPasses) && Intrinsics.c(this.accurateLongBalls, footballTopPlayersStatistics.accurateLongBalls) && Intrinsics.c(this.successfulDribbles, footballTopPlayersStatistics.successfulDribbles) && Intrinsics.c(this.penaltyWon, footballTopPlayersStatistics.penaltyWon) && Intrinsics.c(this.tackles, footballTopPlayersStatistics.tackles) && Intrinsics.c(this.interceptions, footballTopPlayersStatistics.interceptions) && Intrinsics.c(this.clearances, footballTopPlayersStatistics.clearances) && Intrinsics.c(this.possessionLost, footballTopPlayersStatistics.possessionLost) && Intrinsics.c(this.yellowCards, footballTopPlayersStatistics.yellowCards) && Intrinsics.c(this.redCards, footballTopPlayersStatistics.redCards) && Intrinsics.c(this.saves, footballTopPlayersStatistics.saves) && Intrinsics.c(this.goalsPrevented, footballTopPlayersStatistics.goalsPrevented) && Intrinsics.c(this.mostConceded, footballTopPlayersStatistics.mostConceded) && Intrinsics.c(this.leastConceded, footballTopPlayersStatistics.leastConceded) && Intrinsics.c(this.cleanSheet, footballTopPlayersStatistics.cleanSheet) && Intrinsics.c(this.kilometersCovered, footballTopPlayersStatistics.kilometersCovered) && Intrinsics.c(this.numberOfSprints, footballTopPlayersStatistics.numberOfSprints) && Intrinsics.c(this.topSpeed, footballTopPlayersStatistics.topSpeed);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getAccurateLongBalls() {
        return this.accurateLongBalls;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getAccuratePasses() {
        return this.accuratePasses;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getAssists() {
        return this.assists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getBigChancesCreated() {
        return this.bigChancesCreated;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getBigChancesMissed() {
        return this.bigChancesMissed;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getCleanSheet() {
        return this.cleanSheet;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getClearances() {
        return this.clearances;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getExpectedAssists() {
        return this.expectedAssists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getExpectedGoals() {
        return this.expectedGoals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getFreeKickGoal() {
        return this.freeKickGoal;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getGoals() {
        return this.goals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getGoalsAssistsSum() {
        return this.goalsAssistsSum;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getGoalsPrevented() {
        return this.goalsPrevented;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getInterceptions() {
        return this.interceptions;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getKeyPasses() {
        return this.keyPasses;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getKilometersCovered() {
        return this.kilometersCovered;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getLeastConceded() {
        return this.leastConceded;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getMostConceded() {
        return this.mostConceded;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getNumberOfSprints() {
        return this.numberOfSprints;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getPenaltyWon() {
        return this.penaltyWon;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getPossessionLost() {
        return this.possessionLost;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.response.RatedTopPlayersStatistics
    @Nullable
    public List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getRating() {
        return this.rating;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getRedCards() {
        return this.redCards;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getSaves() {
        return this.saves;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getScoringFrequency() {
        return this.scoringFrequency;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getShotsOnTarget() {
        return this.shotsOnTarget;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getSuccessfulDribbles() {
        return this.successfulDribbles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getTackles() {
        return this.tackles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getTopSpeed() {
        return this.topSpeed;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getTotalShots() {
        return this.totalShots;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list = this.rating;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list2 = this.goals;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list3 = this.expectedGoals;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list4 = this.assists;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list5 = this.expectedAssists;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list6 = this.penaltyGoals;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list7 = this.goalsAssistsSum;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list8 = this.freeKickGoal;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list9 = this.scoringFrequency;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list10 = this.totalShots;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list11 = this.shotsOnTarget;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list12 = this.bigChancesMissed;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list13 = this.bigChancesCreated;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list14 = this.accuratePasses;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list15 = this.keyPasses;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list16 = this.accurateLongBalls;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list17 = this.successfulDribbles;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list18 = this.penaltyWon;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list19 = this.tackles;
        int hashCode19 = (hashCode18 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list20 = this.interceptions;
        int hashCode20 = (hashCode19 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list21 = this.clearances;
        int hashCode21 = (hashCode20 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list22 = this.possessionLost;
        int hashCode22 = (hashCode21 + (list22 == null ? 0 : list22.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list23 = this.yellowCards;
        int hashCode23 = (hashCode22 + (list23 == null ? 0 : list23.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list24 = this.redCards;
        int hashCode24 = (hashCode23 + (list24 == null ? 0 : list24.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list25 = this.saves;
        int hashCode25 = (hashCode24 + (list25 == null ? 0 : list25.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list26 = this.goalsPrevented;
        int hashCode26 = (hashCode25 + (list26 == null ? 0 : list26.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list27 = this.mostConceded;
        int hashCode27 = (hashCode26 + (list27 == null ? 0 : list27.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list28 = this.leastConceded;
        int hashCode28 = (hashCode27 + (list28 == null ? 0 : list28.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list29 = this.cleanSheet;
        int hashCode29 = (hashCode28 + (list29 == null ? 0 : list29.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list30 = this.kilometersCovered;
        int hashCode30 = (hashCode29 + (list30 == null ? 0 : list30.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list31 = this.numberOfSprints;
        int hashCode31 = (hashCode30 + (list31 == null ? 0 : list31.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list32 = this.topSpeed;
        return hashCode31 + (list32 != null ? list32.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list = this.rating;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list2 = this.goals;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list3 = this.expectedGoals;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list4 = this.assists;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list5 = this.expectedAssists;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list6 = this.penaltyGoals;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list7 = this.goalsAssistsSum;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list8 = this.freeKickGoal;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list9 = this.scoringFrequency;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list10 = this.totalShots;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list11 = this.shotsOnTarget;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list12 = this.bigChancesMissed;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list13 = this.bigChancesCreated;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list14 = this.accuratePasses;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list15 = this.keyPasses;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list16 = this.accurateLongBalls;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list17 = this.successfulDribbles;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list18 = this.penaltyWon;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list19 = this.tackles;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list20 = this.interceptions;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list21 = this.clearances;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list22 = this.possessionLost;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list23 = this.yellowCards;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list24 = this.redCards;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list25 = this.saves;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list26 = this.goalsPrevented;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list27 = this.mostConceded;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list28 = this.leastConceded;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list29 = this.cleanSheet;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list30 = this.kilometersCovered;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list31 = this.numberOfSprints;
        List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list32 = this.topSpeed;
        StringBuilder s = fc6.s("FootballTopPlayersStatistics(rating=", ", goals=", ", expectedGoals=", list, list2);
        vxd.w(s, list3, ", assists=", list4, ", expectedAssists=");
        vxd.w(s, list5, ", penaltyGoals=", list6, ", goalsAssistsSum=");
        vxd.w(s, list7, ", freeKickGoal=", list8, ", scoringFrequency=");
        vxd.w(s, list9, ", totalShots=", list10, ", shotsOnTarget=");
        vxd.w(s, list11, ", bigChancesMissed=", list12, ", bigChancesCreated=");
        vxd.w(s, list13, ", accuratePasses=", list14, ", keyPasses=");
        vxd.w(s, list15, ", accurateLongBalls=", list16, ", successfulDribbles=");
        vxd.w(s, list17, ", penaltyWon=", list18, ", tackles=");
        vxd.w(s, list19, ", interceptions=", list20, ", clearances=");
        vxd.w(s, list21, ", possessionLost=", list22, ", yellowCards=");
        vxd.w(s, list23, ", redCards=", list24, ", saves=");
        vxd.w(s, list25, ", goalsPrevented=", list26, ", mostConceded=");
        vxd.w(s, list27, ", leastConceded=", list28, ", cleanSheet=");
        vxd.w(s, list29, ", kilometersCovered=", list30, ", numberOfSprints=");
        return me4.j(s, list31, ", topSpeed=", list32, ")");
    }

    public FootballTopPlayersStatistics(@Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list2, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list3, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list4, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list5, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list6, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list7, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list8, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list9, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list10, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list11, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list12, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list13, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list14, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list15, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list16, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list17, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list18, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list19, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list20, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list21, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list22, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list23, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list24, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list25, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list26, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list27, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list28, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list29, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list30, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list31, @Nullable List<TopPlayersStatisticsItem<FootballTopPlayersStatisticsItem>> list32) {
        super(null);
        this.rating = list;
        this.goals = list2;
        this.expectedGoals = list3;
        this.assists = list4;
        this.expectedAssists = list5;
        this.penaltyGoals = list6;
        this.goalsAssistsSum = list7;
        this.freeKickGoal = list8;
        this.scoringFrequency = list9;
        this.totalShots = list10;
        this.shotsOnTarget = list11;
        this.bigChancesMissed = list12;
        this.bigChancesCreated = list13;
        this.accuratePasses = list14;
        this.keyPasses = list15;
        this.accurateLongBalls = list16;
        this.successfulDribbles = list17;
        this.penaltyWon = list18;
        this.tackles = list19;
        this.interceptions = list20;
        this.clearances = list21;
        this.possessionLost = list22;
        this.yellowCards = list23;
        this.redCards = list24;
        this.saves = list25;
        this.goalsPrevented = list26;
        this.mostConceded = list27;
        this.leastConceded = list28;
        this.cleanSheet = list29;
        this.kilometersCovered = list30;
        this.numberOfSprints = list31;
        this.topSpeed = list32;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopPlayersStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopPlayersStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FootballTopPlayersStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
