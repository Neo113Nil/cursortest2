package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BasketballTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BasketballTopPlayersStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import defpackage.fc6;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.us1;
import defpackage.vn1;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0087\b\u0018\u0000 o2\u00020\u00012\u00020\u0002:\u0002poB\u00ad\u0004\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001f\u0010 BÁ\u0004\b\u0010\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001f\u0010%J\u001e\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b(\u0010'J\u001e\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010'J\u001e\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b*\u0010'J\u001e\u0010+\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b+\u0010'J\u001e\u0010,\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b,\u0010'J\u001e\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b-\u0010'J\u001e\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b.\u0010'J\u001e\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b/\u0010'J\u001e\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b0\u0010'J\u001e\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b1\u0010'J\u001e\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b2\u0010'J\u001e\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b3\u0010'J\u001e\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b4\u0010'J\u001e\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b5\u0010'J\u001e\u00106\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b6\u0010'J\u001e\u00107\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b7\u0010'J\u001e\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b8\u0010'J\u001e\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b9\u0010'J\u001e\u0010:\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b:\u0010'J\u001e\u0010;\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b;\u0010'J\u001e\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b<\u0010'J\u001e\u0010=\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b=\u0010'J\u001e\u0010>\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b>\u0010'J\u001e\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b?\u0010'Jè\u0004\u0010@\u001a\u00020\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020!HÖ\u0001¢\u0006\u0004\bE\u0010FJ\u001a\u0010J\u001a\u00020I2\b\u0010H\u001a\u0004\u0018\u00010GHÖ\u0003¢\u0006\u0004\bJ\u0010KJ'\u0010T\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u00002\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020OH\u0001¢\u0006\u0004\bR\u0010SR%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010U\u001a\u0004\bV\u0010'R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010U\u001a\u0004\bW\u0010'R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010U\u001a\u0004\bX\u0010'R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010U\u001a\u0004\bY\u0010'R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010U\u001a\u0004\bZ\u0010'R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010U\u001a\u0004\b[\u0010'R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\b\\\u0010'R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010U\u001a\u0004\b]\u0010'R%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010U\u001a\u0004\b^\u0010'R%\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\b_\u0010'R%\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010U\u001a\u0004\b`\u0010'R%\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\ba\u0010'R%\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010U\u001a\u0004\bb\u0010'R%\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010U\u001a\u0004\bc\u0010'R%\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010U\u001a\u0004\bd\u0010'R%\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010U\u001a\u0004\be\u0010'R%\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010U\u001a\u0004\bf\u0010'R%\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010U\u001a\u0004\bg\u0010'R(\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\bh\u0010'R%\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010U\u001a\u0004\bi\u0010'R%\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010U\u001a\u0004\bj\u0010'R%\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010U\u001a\u0004\bk\u0010'R%\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010U\u001a\u0004\bl\u0010'R%\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010U\u001a\u0004\bm\u0010'R%\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010U\u001a\u0004\bn\u0010'¨\u0006q"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/RatedTopPlayersStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BasketballTopPlayersStatisticsItem;", "points", "rebounds", "assists", "secondsPlayed", "fieldGoalsPercentage", "freeThrowsPercentage", "threePointsPercentage", "threePointsMade", "defensiveRebounds", "offensiveRebounds", "steals", "turnovers", "blocks", "assistTurnoverRatio", "plusMinus", "pir", "doubleDoubles", "tripleDoubles", CampaignEx.JSON_KEY_STAR, "trueShootingPercentage", "effectiveFieldGoalPercentage", "usage", "individualOffensiveRating", "individualDefensiveRating", "playerEfficiencyRating", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopPlayersStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopPlayersStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPoints", "getRebounds", "getAssists", "getSecondsPlayed", "getFieldGoalsPercentage", "getFreeThrowsPercentage", "getThreePointsPercentage", "getThreePointsMade", "getDefensiveRebounds", "getOffensiveRebounds", "getSteals", "getTurnovers", "getBlocks", "getAssistTurnoverRatio", "getPlusMinus", "getPir", "getDoubleDoubles", "getTripleDoubles", "getRating", "getTrueShootingPercentage", "getEffectiveFieldGoalPercentage", "getUsage", "getIndividualOffensiveRating", "getIndividualDefensiveRating", "getPlayerEfficiencyRating", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BasketballTopPlayersStatistics extends TopPerformanceStatistics implements RatedTopPlayersStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> assistTurnoverRatio;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> assists;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> blocks;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> defensiveRebounds;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> doubleDoubles;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> effectiveFieldGoalPercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> fieldGoalsPercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> freeThrowsPercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> individualDefensiveRating;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> individualOffensiveRating;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> offensiveRebounds;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> pir;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> playerEfficiencyRating;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> plusMinus;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> points;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> rating;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> rebounds;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> secondsPlayed;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> steals;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> threePointsMade;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> threePointsPercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> tripleDoubles;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> trueShootingPercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> turnovers;

    @Nullable
    private final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> usage;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new vn1(11)), ypa.a(ysaVar, new vn1(13)), ypa.a(ysaVar, new vn1(19)), ypa.a(ysaVar, new vn1(20)), ypa.a(ysaVar, new vn1(21)), ypa.a(ysaVar, new vn1(23)), ypa.a(ysaVar, new vn1(24)), ypa.a(ysaVar, new vn1(25)), ypa.a(ysaVar, new vn1(26)), ypa.a(ysaVar, new vn1(27)), ypa.a(ysaVar, new vn1(22)), ypa.a(ysaVar, new vn1(28)), ypa.a(ysaVar, new vn1(29)), ypa.a(ysaVar, new us1(0)), ypa.a(ysaVar, new us1(1)), ypa.a(ysaVar, new us1(2)), ypa.a(ysaVar, new us1(3)), ypa.a(ysaVar, new us1(4)), ypa.a(ysaVar, new us1(5)), ypa.a(ysaVar, new vn1(12)), ypa.a(ysaVar, new vn1(14)), ypa.a(ysaVar, new vn1(15)), ypa.a(ysaVar, new vn1(16)), ypa.a(ysaVar, new vn1(17)), ypa.a(ysaVar, new vn1(18))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketballTopPlayersStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, t5h t5hVar) {
        super(i, t5hVar);
        if (33554431 != (i & 33554431)) {
            oea.z(i, 33554431, BasketballTopPlayersStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = list;
        this.rebounds = list2;
        this.assists = list3;
        this.secondsPlayed = list4;
        this.fieldGoalsPercentage = list5;
        this.freeThrowsPercentage = list6;
        this.threePointsPercentage = list7;
        this.threePointsMade = list8;
        this.defensiveRebounds = list9;
        this.offensiveRebounds = list10;
        this.steals = list11;
        this.turnovers = list12;
        this.blocks = list13;
        this.assistTurnoverRatio = list14;
        this.plusMinus = list15;
        this.pir = list16;
        this.doubleDoubles = list17;
        this.tripleDoubles = list18;
        this.rating = list19;
        this.trueShootingPercentage = list20;
        this.effectiveFieldGoalPercentage = list21;
        this.usage = list22;
        this.individualOffensiveRating = list23;
        this.individualDefensiveRating = list24;
        this.playerEfficiencyRating = list25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$13() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$14() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$15() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$16() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$17() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$18() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$19() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$20() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$21() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$22() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$23() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(BasketballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ BasketballTopPlayersStatistics copy$default(BasketballTopPlayersStatistics basketballTopPlayersStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, int i, Object obj) {
        List list26;
        List list27;
        List list28 = (i & 1) != 0 ? basketballTopPlayersStatistics.points : list;
        List list29 = (i & 2) != 0 ? basketballTopPlayersStatistics.rebounds : list2;
        List list30 = (i & 4) != 0 ? basketballTopPlayersStatistics.assists : list3;
        List list31 = (i & 8) != 0 ? basketballTopPlayersStatistics.secondsPlayed : list4;
        List list32 = (i & 16) != 0 ? basketballTopPlayersStatistics.fieldGoalsPercentage : list5;
        List list33 = (i & 32) != 0 ? basketballTopPlayersStatistics.freeThrowsPercentage : list6;
        List list34 = (i & 64) != 0 ? basketballTopPlayersStatistics.threePointsPercentage : list7;
        List list35 = (i & 128) != 0 ? basketballTopPlayersStatistics.threePointsMade : list8;
        List list36 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? basketballTopPlayersStatistics.defensiveRebounds : list9;
        List list37 = (i & 512) != 0 ? basketballTopPlayersStatistics.offensiveRebounds : list10;
        List list38 = (i & 1024) != 0 ? basketballTopPlayersStatistics.steals : list11;
        List list39 = (i & a.o) != 0 ? basketballTopPlayersStatistics.turnovers : list12;
        List list40 = (i & 4096) != 0 ? basketballTopPlayersStatistics.blocks : list13;
        List list41 = (i & 8192) != 0 ? basketballTopPlayersStatistics.assistTurnoverRatio : list14;
        List list42 = list28;
        List list43 = (i & 16384) != 0 ? basketballTopPlayersStatistics.plusMinus : list15;
        List list44 = (i & 32768) != 0 ? basketballTopPlayersStatistics.pir : list16;
        List list45 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? basketballTopPlayersStatistics.doubleDoubles : list17;
        List list46 = (i & 131072) != 0 ? basketballTopPlayersStatistics.tripleDoubles : list18;
        List list47 = (i & 262144) != 0 ? basketballTopPlayersStatistics.rating : list19;
        List list48 = (i & 524288) != 0 ? basketballTopPlayersStatistics.trueShootingPercentage : list20;
        List list49 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? basketballTopPlayersStatistics.effectiveFieldGoalPercentage : list21;
        List list50 = (i & 2097152) != 0 ? basketballTopPlayersStatistics.usage : list22;
        List list51 = (i & 4194304) != 0 ? basketballTopPlayersStatistics.individualOffensiveRating : list23;
        List list52 = (i & 8388608) != 0 ? basketballTopPlayersStatistics.individualDefensiveRating : list24;
        if ((i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0) {
            list27 = list52;
            list26 = basketballTopPlayersStatistics.playerEfficiencyRating;
        } else {
            list26 = list25;
            list27 = list52;
        }
        return basketballTopPlayersStatistics.copy(list42, list29, list30, list31, list32, list33, list34, list35, list36, list37, list38, list39, list40, list41, list43, list44, list45, list46, list47, list48, list49, list50, list51, list27, list26);
    }

    public static final /* synthetic */ void write$Self$model_release(BasketballTopPlayersStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.points);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.rebounds);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.assists);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.secondsPlayed);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.fieldGoalsPercentage);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.freeThrowsPercentage);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.threePointsPercentage);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.threePointsMade);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.defensiveRebounds);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.offensiveRebounds);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.steals);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.turnovers);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.blocks);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.assistTurnoverRatio);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.plusMinus);
        output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.pir);
        output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.doubleDoubles);
        output.h(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.tripleDoubles);
        output.h(serialDesc, 18, (KSerializer) joaVarArr[18].getValue(), self.getRating());
        output.h(serialDesc, 19, (KSerializer) joaVarArr[19].getValue(), self.trueShootingPercentage);
        output.h(serialDesc, 20, (KSerializer) joaVarArr[20].getValue(), self.effectiveFieldGoalPercentage);
        output.h(serialDesc, 21, (KSerializer) joaVarArr[21].getValue(), self.usage);
        output.h(serialDesc, 22, (KSerializer) joaVarArr[22].getValue(), self.individualOffensiveRating);
        output.h(serialDesc, 23, (KSerializer) joaVarArr[23].getValue(), self.individualDefensiveRating);
        output.h(serialDesc, 24, (KSerializer) joaVarArr[24].getValue(), self.playerEfficiencyRating);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component1() {
        return this.points;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component10() {
        return this.offensiveRebounds;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component11() {
        return this.steals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component12() {
        return this.turnovers;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component13() {
        return this.blocks;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component14() {
        return this.assistTurnoverRatio;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component15() {
        return this.plusMinus;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component16() {
        return this.pir;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component17() {
        return this.doubleDoubles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component18() {
        return this.tripleDoubles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component19() {
        return this.rating;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component2() {
        return this.rebounds;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component20() {
        return this.trueShootingPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component21() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component22() {
        return this.usage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component23() {
        return this.individualOffensiveRating;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component24() {
        return this.individualDefensiveRating;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component25() {
        return this.playerEfficiencyRating;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component3() {
        return this.assists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component4() {
        return this.secondsPlayed;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component5() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component6() {
        return this.freeThrowsPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component7() {
        return this.threePointsPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component8() {
        return this.threePointsMade;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> component9() {
        return this.defensiveRebounds;
    }

    @NotNull
    public final BasketballTopPlayersStatistics copy(@Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> points, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> rebounds, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> assists, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> secondsPlayed, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> fieldGoalsPercentage, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> freeThrowsPercentage, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> threePointsPercentage, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> threePointsMade, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> defensiveRebounds, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> offensiveRebounds, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> steals, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> turnovers, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> blocks, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> assistTurnoverRatio, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> plusMinus, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> pir, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> doubleDoubles, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> tripleDoubles, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> rating, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> trueShootingPercentage, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> effectiveFieldGoalPercentage, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> usage, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> individualOffensiveRating, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> individualDefensiveRating, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> playerEfficiencyRating) {
        return new BasketballTopPlayersStatistics(points, rebounds, assists, secondsPlayed, fieldGoalsPercentage, freeThrowsPercentage, threePointsPercentage, threePointsMade, defensiveRebounds, offensiveRebounds, steals, turnovers, blocks, assistTurnoverRatio, plusMinus, pir, doubleDoubles, tripleDoubles, rating, trueShootingPercentage, effectiveFieldGoalPercentage, usage, individualOffensiveRating, individualDefensiveRating, playerEfficiencyRating);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketballTopPlayersStatistics)) {
            return false;
        }
        BasketballTopPlayersStatistics basketballTopPlayersStatistics = (BasketballTopPlayersStatistics) other;
        return Intrinsics.c(this.points, basketballTopPlayersStatistics.points) && Intrinsics.c(this.rebounds, basketballTopPlayersStatistics.rebounds) && Intrinsics.c(this.assists, basketballTopPlayersStatistics.assists) && Intrinsics.c(this.secondsPlayed, basketballTopPlayersStatistics.secondsPlayed) && Intrinsics.c(this.fieldGoalsPercentage, basketballTopPlayersStatistics.fieldGoalsPercentage) && Intrinsics.c(this.freeThrowsPercentage, basketballTopPlayersStatistics.freeThrowsPercentage) && Intrinsics.c(this.threePointsPercentage, basketballTopPlayersStatistics.threePointsPercentage) && Intrinsics.c(this.threePointsMade, basketballTopPlayersStatistics.threePointsMade) && Intrinsics.c(this.defensiveRebounds, basketballTopPlayersStatistics.defensiveRebounds) && Intrinsics.c(this.offensiveRebounds, basketballTopPlayersStatistics.offensiveRebounds) && Intrinsics.c(this.steals, basketballTopPlayersStatistics.steals) && Intrinsics.c(this.turnovers, basketballTopPlayersStatistics.turnovers) && Intrinsics.c(this.blocks, basketballTopPlayersStatistics.blocks) && Intrinsics.c(this.assistTurnoverRatio, basketballTopPlayersStatistics.assistTurnoverRatio) && Intrinsics.c(this.plusMinus, basketballTopPlayersStatistics.plusMinus) && Intrinsics.c(this.pir, basketballTopPlayersStatistics.pir) && Intrinsics.c(this.doubleDoubles, basketballTopPlayersStatistics.doubleDoubles) && Intrinsics.c(this.tripleDoubles, basketballTopPlayersStatistics.tripleDoubles) && Intrinsics.c(this.rating, basketballTopPlayersStatistics.rating) && Intrinsics.c(this.trueShootingPercentage, basketballTopPlayersStatistics.trueShootingPercentage) && Intrinsics.c(this.effectiveFieldGoalPercentage, basketballTopPlayersStatistics.effectiveFieldGoalPercentage) && Intrinsics.c(this.usage, basketballTopPlayersStatistics.usage) && Intrinsics.c(this.individualOffensiveRating, basketballTopPlayersStatistics.individualOffensiveRating) && Intrinsics.c(this.individualDefensiveRating, basketballTopPlayersStatistics.individualDefensiveRating) && Intrinsics.c(this.playerEfficiencyRating, basketballTopPlayersStatistics.playerEfficiencyRating);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getAssistTurnoverRatio() {
        return this.assistTurnoverRatio;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getAssists() {
        return this.assists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getBlocks() {
        return this.blocks;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getDoubleDoubles() {
        return this.doubleDoubles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getEffectiveFieldGoalPercentage() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getFieldGoalsPercentage() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getFreeThrowsPercentage() {
        return this.freeThrowsPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getIndividualDefensiveRating() {
        return this.individualDefensiveRating;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getIndividualOffensiveRating() {
        return this.individualOffensiveRating;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getPir() {
        return this.pir;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getPlayerEfficiencyRating() {
        return this.playerEfficiencyRating;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getPoints() {
        return this.points;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.response.RatedTopPlayersStatistics
    @Nullable
    public List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getRating() {
        return this.rating;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getRebounds() {
        return this.rebounds;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getSecondsPlayed() {
        return this.secondsPlayed;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getSteals() {
        return this.steals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getThreePointsPercentage() {
        return this.threePointsPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getTripleDoubles() {
        return this.tripleDoubles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getTrueShootingPercentage() {
        return this.trueShootingPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getTurnovers() {
        return this.turnovers;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> getUsage() {
        return this.usage;
    }

    public int hashCode() {
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list = this.points;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list2 = this.rebounds;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list3 = this.assists;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list4 = this.secondsPlayed;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list5 = this.fieldGoalsPercentage;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list6 = this.freeThrowsPercentage;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list7 = this.threePointsPercentage;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list8 = this.threePointsMade;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list9 = this.defensiveRebounds;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list10 = this.offensiveRebounds;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list11 = this.steals;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list12 = this.turnovers;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list13 = this.blocks;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list14 = this.assistTurnoverRatio;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list15 = this.plusMinus;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list16 = this.pir;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list17 = this.doubleDoubles;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list18 = this.tripleDoubles;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list19 = this.rating;
        int hashCode19 = (hashCode18 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list20 = this.trueShootingPercentage;
        int hashCode20 = (hashCode19 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list21 = this.effectiveFieldGoalPercentage;
        int hashCode21 = (hashCode20 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list22 = this.usage;
        int hashCode22 = (hashCode21 + (list22 == null ? 0 : list22.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list23 = this.individualOffensiveRating;
        int hashCode23 = (hashCode22 + (list23 == null ? 0 : list23.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list24 = this.individualDefensiveRating;
        int hashCode24 = (hashCode23 + (list24 == null ? 0 : list24.hashCode())) * 31;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list25 = this.playerEfficiencyRating;
        return hashCode24 + (list25 != null ? list25.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list = this.points;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list2 = this.rebounds;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list3 = this.assists;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list4 = this.secondsPlayed;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list5 = this.fieldGoalsPercentage;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list6 = this.freeThrowsPercentage;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list7 = this.threePointsPercentage;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list8 = this.threePointsMade;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list9 = this.defensiveRebounds;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list10 = this.offensiveRebounds;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list11 = this.steals;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list12 = this.turnovers;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list13 = this.blocks;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list14 = this.assistTurnoverRatio;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list15 = this.plusMinus;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list16 = this.pir;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list17 = this.doubleDoubles;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list18 = this.tripleDoubles;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list19 = this.rating;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list20 = this.trueShootingPercentage;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list21 = this.effectiveFieldGoalPercentage;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list22 = this.usage;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list23 = this.individualOffensiveRating;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list24 = this.individualDefensiveRating;
        List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list25 = this.playerEfficiencyRating;
        StringBuilder s = fc6.s("BasketballTopPlayersStatistics(points=", ", rebounds=", ", assists=", list, list2);
        vxd.w(s, list3, ", secondsPlayed=", list4, ", fieldGoalsPercentage=");
        vxd.w(s, list5, ", freeThrowsPercentage=", list6, ", threePointsPercentage=");
        vxd.w(s, list7, ", threePointsMade=", list8, ", defensiveRebounds=");
        vxd.w(s, list9, ", offensiveRebounds=", list10, ", steals=");
        vxd.w(s, list11, ", turnovers=", list12, ", blocks=");
        vxd.w(s, list13, ", assistTurnoverRatio=", list14, ", plusMinus=");
        vxd.w(s, list15, ", pir=", list16, ", doubleDoubles=");
        vxd.w(s, list17, ", tripleDoubles=", list18, ", rating=");
        vxd.w(s, list19, ", trueShootingPercentage=", list20, ", effectiveFieldGoalPercentage=");
        vxd.w(s, list21, ", usage=", list22, ", individualOffensiveRating=");
        vxd.w(s, list23, ", individualDefensiveRating=", list24, ", playerEfficiencyRating=");
        return mz1.p(s, list25, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopPlayersStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopPlayersStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketballTopPlayersStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BasketballTopPlayersStatistics(@Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list2, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list3, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list4, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list5, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list6, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list7, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list8, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list9, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list10, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list11, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list12, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list13, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list14, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list15, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list16, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list17, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list18, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list19, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list20, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list21, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list22, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list23, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list24, @Nullable List<TopPlayersStatisticsItem<BasketballTopPlayersStatisticsItem>> list25) {
        super(null);
        this.points = list;
        this.rebounds = list2;
        this.assists = list3;
        this.secondsPlayed = list4;
        this.fieldGoalsPercentage = list5;
        this.freeThrowsPercentage = list6;
        this.threePointsPercentage = list7;
        this.threePointsMade = list8;
        this.defensiveRebounds = list9;
        this.offensiveRebounds = list10;
        this.steals = list11;
        this.turnovers = list12;
        this.blocks = list13;
        this.assistTurnoverRatio = list14;
        this.plusMinus = list15;
        this.pir = list16;
        this.doubleDoubles = list17;
        this.tripleDoubles = list18;
        this.rating = list19;
        this.trueShootingPercentage = list20;
        this.effectiveFieldGoalPercentage = list21;
        this.usage = list22;
        this.individualOffensiveRating = list23;
        this.individualDefensiveRating = list24;
        this.playerEfficiencyRating = list25;
    }
}
