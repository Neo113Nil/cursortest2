package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.IceHockeyTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.IceHockeyTopPlayersStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import defpackage.fc6;
import defpackage.fc9;
import defpackage.gq9;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0002cbBÕ\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bBé\u0003\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J\u001e\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u001e\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u001e\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u001e\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u001e\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u001e\u0010(\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u001e\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u001e\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u001e\u0010+\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u001e\u0010,\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\"J\u001e\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\"J\u001e\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u001e\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u001e\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u001e\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\"J\u001e\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\"J\u001e\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\"J\u001e\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\"J\u001e\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010\"J\u001e\u00106\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010\"J\u0088\u0004\u00107\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010A\u001a\u00020@2\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\bA\u0010BJ'\u0010K\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001¢\u0006\u0004\bI\u0010JR%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010\"R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010L\u001a\u0004\bN\u0010\"R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bO\u0010\"R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bP\u0010\"R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bQ\u0010\"R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bR\u0010\"R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bS\u0010\"R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bT\u0010\"R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bU\u0010\"R%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bV\u0010\"R%\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010L\u001a\u0004\bW\u0010\"R%\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bX\u0010\"R%\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bY\u0010\"R%\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bZ\u0010\"R%\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\b[\u0010\"R%\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\b\\\u0010\"R%\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\b]\u0010\"R%\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\b^\u0010\"R%\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010L\u001a\u0004\b_\u0010\"R%\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010L\u001a\u0004\b`\u0010\"R%\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010L\u001a\u0004\ba\u0010\"¨\u0006d"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/IceHockeyTopPlayersStatisticsItem;", "points", "goals", "assists", "powerPlayGoals", "shortHandedGoals", "powerPlayAssists", "shortHandedAssists", "shotPercentage", "faceOffPercentage", "plusMinus", "timeOnIce", "blocked", "hits", "penaltyMinutes", "goalsAgainstAverage", "savePercentage", "shutouts", "evenSavePercentage", "powerPlaySavePercentage", "shortHandedSavePercentage", "wins", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopPlayersStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopPlayersStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPoints", "getGoals", "getAssists", "getPowerPlayGoals", "getShortHandedGoals", "getPowerPlayAssists", "getShortHandedAssists", "getShotPercentage", "getFaceOffPercentage", "getPlusMinus", "getTimeOnIce", "getBlocked", "getHits", "getPenaltyMinutes", "getGoalsAgainstAverage", "getSavePercentage", "getShutouts", "getEvenSavePercentage", "getPowerPlaySavePercentage", "getShortHandedSavePercentage", "getWins", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class IceHockeyTopPlayersStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> assists;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> blocked;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> evenSavePercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> faceOffPercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> goals;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> goalsAgainstAverage;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> hits;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> penaltyMinutes;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> plusMinus;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> points;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> powerPlayAssists;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> powerPlayGoals;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> powerPlaySavePercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> savePercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> shortHandedAssists;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> shortHandedGoals;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> shortHandedSavePercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> shotPercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> shutouts;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> timeOnIce;

    @Nullable
    private final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> wins;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new fc9(12)), ypa.a(ysaVar, new fc9(14)), ypa.a(ysaVar, new fc9(16)), ypa.a(ysaVar, new fc9(17)), ypa.a(ysaVar, new fc9(18)), ypa.a(ysaVar, new fc9(19)), ypa.a(ysaVar, new fc9(20)), ypa.a(ysaVar, new fc9(21)), ypa.a(ysaVar, new fc9(22)), ypa.a(ysaVar, new fc9(24)), ypa.a(ysaVar, new fc9(23)), ypa.a(ysaVar, new fc9(25)), ypa.a(ysaVar, new fc9(26)), ypa.a(ysaVar, new fc9(27)), ypa.a(ysaVar, new fc9(28)), ypa.a(ysaVar, new fc9(29)), ypa.a(ysaVar, new gq9(0)), ypa.a(ysaVar, new gq9(1)), ypa.a(ysaVar, new gq9(2)), ypa.a(ysaVar, new fc9(13)), ypa.a(ysaVar, new fc9(15))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IceHockeyTopPlayersStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, t5h t5hVar) {
        super(i, t5hVar);
        if (2097151 != (i & 2097151)) {
            oea.z(i, 2097151, IceHockeyTopPlayersStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = list;
        this.goals = list2;
        this.assists = list3;
        this.powerPlayGoals = list4;
        this.shortHandedGoals = list5;
        this.powerPlayAssists = list6;
        this.shortHandedAssists = list7;
        this.shotPercentage = list8;
        this.faceOffPercentage = list9;
        this.plusMinus = list10;
        this.timeOnIce = list11;
        this.blocked = list12;
        this.hits = list13;
        this.penaltyMinutes = list14;
        this.goalsAgainstAverage = list15;
        this.savePercentage = list16;
        this.shutouts = list17;
        this.evenSavePercentage = list18;
        this.powerPlaySavePercentage = list19;
        this.shortHandedSavePercentage = list20;
        this.wins = list21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$13() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$14() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$15() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$16() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$17() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$18() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$19() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(IceHockeyTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ IceHockeyTopPlayersStatistics copy$default(IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, int i, Object obj) {
        List list22;
        List list23;
        List list24 = (i & 1) != 0 ? iceHockeyTopPlayersStatistics.points : list;
        List list25 = (i & 2) != 0 ? iceHockeyTopPlayersStatistics.goals : list2;
        List list26 = (i & 4) != 0 ? iceHockeyTopPlayersStatistics.assists : list3;
        List list27 = (i & 8) != 0 ? iceHockeyTopPlayersStatistics.powerPlayGoals : list4;
        List list28 = (i & 16) != 0 ? iceHockeyTopPlayersStatistics.shortHandedGoals : list5;
        List list29 = (i & 32) != 0 ? iceHockeyTopPlayersStatistics.powerPlayAssists : list6;
        List list30 = (i & 64) != 0 ? iceHockeyTopPlayersStatistics.shortHandedAssists : list7;
        List list31 = (i & 128) != 0 ? iceHockeyTopPlayersStatistics.shotPercentage : list8;
        List list32 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? iceHockeyTopPlayersStatistics.faceOffPercentage : list9;
        List list33 = (i & 512) != 0 ? iceHockeyTopPlayersStatistics.plusMinus : list10;
        List list34 = (i & 1024) != 0 ? iceHockeyTopPlayersStatistics.timeOnIce : list11;
        List list35 = (i & a.o) != 0 ? iceHockeyTopPlayersStatistics.blocked : list12;
        List list36 = (i & 4096) != 0 ? iceHockeyTopPlayersStatistics.hits : list13;
        List list37 = (i & 8192) != 0 ? iceHockeyTopPlayersStatistics.penaltyMinutes : list14;
        List list38 = list24;
        List list39 = (i & 16384) != 0 ? iceHockeyTopPlayersStatistics.goalsAgainstAverage : list15;
        List list40 = (i & 32768) != 0 ? iceHockeyTopPlayersStatistics.savePercentage : list16;
        List list41 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? iceHockeyTopPlayersStatistics.shutouts : list17;
        List list42 = (i & 131072) != 0 ? iceHockeyTopPlayersStatistics.evenSavePercentage : list18;
        List list43 = (i & 262144) != 0 ? iceHockeyTopPlayersStatistics.powerPlaySavePercentage : list19;
        List list44 = (i & 524288) != 0 ? iceHockeyTopPlayersStatistics.shortHandedSavePercentage : list20;
        if ((i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            list23 = list44;
            list22 = iceHockeyTopPlayersStatistics.wins;
        } else {
            list22 = list21;
            list23 = list44;
        }
        return iceHockeyTopPlayersStatistics.copy(list38, list25, list26, list27, list28, list29, list30, list31, list32, list33, list34, list35, list36, list37, list39, list40, list41, list42, list43, list23, list22);
    }

    public static final /* synthetic */ void write$Self$model_release(IceHockeyTopPlayersStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.points);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.goals);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.assists);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.powerPlayGoals);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.shortHandedGoals);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.powerPlayAssists);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.shortHandedAssists);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.shotPercentage);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.faceOffPercentage);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.plusMinus);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.timeOnIce);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.blocked);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.hits);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.penaltyMinutes);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.goalsAgainstAverage);
        output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.savePercentage);
        output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.shutouts);
        output.h(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.evenSavePercentage);
        output.h(serialDesc, 18, (KSerializer) joaVarArr[18].getValue(), self.powerPlaySavePercentage);
        output.h(serialDesc, 19, (KSerializer) joaVarArr[19].getValue(), self.shortHandedSavePercentage);
        output.h(serialDesc, 20, (KSerializer) joaVarArr[20].getValue(), self.wins);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component1() {
        return this.points;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component10() {
        return this.plusMinus;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component11() {
        return this.timeOnIce;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component12() {
        return this.blocked;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component13() {
        return this.hits;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component14() {
        return this.penaltyMinutes;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component15() {
        return this.goalsAgainstAverage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component16() {
        return this.savePercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component17() {
        return this.shutouts;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component18() {
        return this.evenSavePercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component19() {
        return this.powerPlaySavePercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component2() {
        return this.goals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component20() {
        return this.shortHandedSavePercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component21() {
        return this.wins;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component3() {
        return this.assists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component4() {
        return this.powerPlayGoals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component5() {
        return this.shortHandedGoals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component6() {
        return this.powerPlayAssists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component7() {
        return this.shortHandedAssists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component8() {
        return this.shotPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> component9() {
        return this.faceOffPercentage;
    }

    @NotNull
    public final IceHockeyTopPlayersStatistics copy(@Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> points, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> goals, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> assists, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> powerPlayGoals, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> shortHandedGoals, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> powerPlayAssists, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> shortHandedAssists, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> shotPercentage, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> faceOffPercentage, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> plusMinus, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> timeOnIce, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> blocked, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> hits, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> penaltyMinutes, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> goalsAgainstAverage, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> savePercentage, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> shutouts, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> evenSavePercentage, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> powerPlaySavePercentage, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> shortHandedSavePercentage, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> wins) {
        return new IceHockeyTopPlayersStatistics(points, goals, assists, powerPlayGoals, shortHandedGoals, powerPlayAssists, shortHandedAssists, shotPercentage, faceOffPercentage, plusMinus, timeOnIce, blocked, hits, penaltyMinutes, goalsAgainstAverage, savePercentage, shutouts, evenSavePercentage, powerPlaySavePercentage, shortHandedSavePercentage, wins);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IceHockeyTopPlayersStatistics)) {
            return false;
        }
        IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics = (IceHockeyTopPlayersStatistics) other;
        return Intrinsics.c(this.points, iceHockeyTopPlayersStatistics.points) && Intrinsics.c(this.goals, iceHockeyTopPlayersStatistics.goals) && Intrinsics.c(this.assists, iceHockeyTopPlayersStatistics.assists) && Intrinsics.c(this.powerPlayGoals, iceHockeyTopPlayersStatistics.powerPlayGoals) && Intrinsics.c(this.shortHandedGoals, iceHockeyTopPlayersStatistics.shortHandedGoals) && Intrinsics.c(this.powerPlayAssists, iceHockeyTopPlayersStatistics.powerPlayAssists) && Intrinsics.c(this.shortHandedAssists, iceHockeyTopPlayersStatistics.shortHandedAssists) && Intrinsics.c(this.shotPercentage, iceHockeyTopPlayersStatistics.shotPercentage) && Intrinsics.c(this.faceOffPercentage, iceHockeyTopPlayersStatistics.faceOffPercentage) && Intrinsics.c(this.plusMinus, iceHockeyTopPlayersStatistics.plusMinus) && Intrinsics.c(this.timeOnIce, iceHockeyTopPlayersStatistics.timeOnIce) && Intrinsics.c(this.blocked, iceHockeyTopPlayersStatistics.blocked) && Intrinsics.c(this.hits, iceHockeyTopPlayersStatistics.hits) && Intrinsics.c(this.penaltyMinutes, iceHockeyTopPlayersStatistics.penaltyMinutes) && Intrinsics.c(this.goalsAgainstAverage, iceHockeyTopPlayersStatistics.goalsAgainstAverage) && Intrinsics.c(this.savePercentage, iceHockeyTopPlayersStatistics.savePercentage) && Intrinsics.c(this.shutouts, iceHockeyTopPlayersStatistics.shutouts) && Intrinsics.c(this.evenSavePercentage, iceHockeyTopPlayersStatistics.evenSavePercentage) && Intrinsics.c(this.powerPlaySavePercentage, iceHockeyTopPlayersStatistics.powerPlaySavePercentage) && Intrinsics.c(this.shortHandedSavePercentage, iceHockeyTopPlayersStatistics.shortHandedSavePercentage) && Intrinsics.c(this.wins, iceHockeyTopPlayersStatistics.wins);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getAssists() {
        return this.assists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getBlocked() {
        return this.blocked;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getEvenSavePercentage() {
        return this.evenSavePercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getFaceOffPercentage() {
        return this.faceOffPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getGoals() {
        return this.goals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getGoalsAgainstAverage() {
        return this.goalsAgainstAverage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getHits() {
        return this.hits;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getPenaltyMinutes() {
        return this.penaltyMinutes;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getPoints() {
        return this.points;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getPowerPlayAssists() {
        return this.powerPlayAssists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getPowerPlayGoals() {
        return this.powerPlayGoals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getPowerPlaySavePercentage() {
        return this.powerPlaySavePercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getSavePercentage() {
        return this.savePercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getShortHandedAssists() {
        return this.shortHandedAssists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getShortHandedGoals() {
        return this.shortHandedGoals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getShortHandedSavePercentage() {
        return this.shortHandedSavePercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getShotPercentage() {
        return this.shotPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getShutouts() {
        return this.shutouts;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getTimeOnIce() {
        return this.timeOnIce;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> getWins() {
        return this.wins;
    }

    public int hashCode() {
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list = this.points;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list2 = this.goals;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list3 = this.assists;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list4 = this.powerPlayGoals;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list5 = this.shortHandedGoals;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list6 = this.powerPlayAssists;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list7 = this.shortHandedAssists;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list8 = this.shotPercentage;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list9 = this.faceOffPercentage;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list10 = this.plusMinus;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list11 = this.timeOnIce;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list12 = this.blocked;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list13 = this.hits;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list14 = this.penaltyMinutes;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list15 = this.goalsAgainstAverage;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list16 = this.savePercentage;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list17 = this.shutouts;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list18 = this.evenSavePercentage;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list19 = this.powerPlaySavePercentage;
        int hashCode19 = (hashCode18 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list20 = this.shortHandedSavePercentage;
        int hashCode20 = (hashCode19 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list21 = this.wins;
        return hashCode20 + (list21 != null ? list21.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list = this.points;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list2 = this.goals;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list3 = this.assists;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list4 = this.powerPlayGoals;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list5 = this.shortHandedGoals;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list6 = this.powerPlayAssists;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list7 = this.shortHandedAssists;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list8 = this.shotPercentage;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list9 = this.faceOffPercentage;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list10 = this.plusMinus;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list11 = this.timeOnIce;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list12 = this.blocked;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list13 = this.hits;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list14 = this.penaltyMinutes;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list15 = this.goalsAgainstAverage;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list16 = this.savePercentage;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list17 = this.shutouts;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list18 = this.evenSavePercentage;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list19 = this.powerPlaySavePercentage;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list20 = this.shortHandedSavePercentage;
        List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list21 = this.wins;
        StringBuilder s = fc6.s("IceHockeyTopPlayersStatistics(points=", ", goals=", ", assists=", list, list2);
        vxd.w(s, list3, ", powerPlayGoals=", list4, ", shortHandedGoals=");
        vxd.w(s, list5, ", powerPlayAssists=", list6, ", shortHandedAssists=");
        vxd.w(s, list7, ", shotPercentage=", list8, ", faceOffPercentage=");
        vxd.w(s, list9, ", plusMinus=", list10, ", timeOnIce=");
        vxd.w(s, list11, ", blocked=", list12, ", hits=");
        vxd.w(s, list13, ", penaltyMinutes=", list14, ", goalsAgainstAverage=");
        vxd.w(s, list15, ", savePercentage=", list16, ", shutouts=");
        vxd.w(s, list17, ", evenSavePercentage=", list18, ", powerPlaySavePercentage=");
        vxd.w(s, list19, ", shortHandedSavePercentage=", list20, ", wins=");
        return mz1.p(s, list21, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopPlayersStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopPlayersStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return IceHockeyTopPlayersStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public IceHockeyTopPlayersStatistics(@Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list2, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list3, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list4, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list5, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list6, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list7, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list8, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list9, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list10, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list11, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list12, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list13, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list14, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list15, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list16, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list17, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list18, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list19, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list20, @Nullable List<TopPlayersStatisticsItem<IceHockeyTopPlayersStatisticsItem>> list21) {
        super(null);
        this.points = list;
        this.goals = list2;
        this.assists = list3;
        this.powerPlayGoals = list4;
        this.shortHandedGoals = list5;
        this.powerPlayAssists = list6;
        this.shortHandedAssists = list7;
        this.shotPercentage = list8;
        this.faceOffPercentage = list9;
        this.plusMinus = list10;
        this.timeOnIce = list11;
        this.blocked = list12;
        this.hits = list13;
        this.penaltyMinutes = list14;
        this.goalsAgainstAverage = list15;
        this.savePercentage = list16;
        this.shutouts = list17;
        this.evenSavePercentage = list18;
        this.powerPlaySavePercentage = list19;
        this.shortHandedSavePercentage = list20;
        this.wins = list21;
    }
}
