package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.BasketballTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.BasketballTopTeamsStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TopTeamsStatisticsItem;
import defpackage.fc6;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.us1;
import defpackage.vs1;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 h2\u00020\u0001:\u0002ihB\u0081\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dB\u0095\u0004\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J\u001e\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u001e\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010$J\u001e\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010$J\u001e\u0010(\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010$J\u001e\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010$J\u001e\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010$J\u001e\u0010+\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010$J\u001e\u0010,\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010$J\u001e\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010$J\u001e\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010$J\u001e\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010$J\u001e\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010$J\u001e\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010$J\u001e\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010$J\u001e\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010$J\u001e\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010$J\u001e\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010$J\u001e\u00106\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010$J\u001e\u00107\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010$J\u001e\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010$J\u001e\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010$J\u001e\u0010:\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010$J¸\u0004\u0010;\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010>\u001a\u00020=HÖ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bE\u0010FJ'\u0010O\u001a\u00020L2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0001¢\u0006\u0004\bM\u0010NR%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010P\u001a\u0004\bQ\u0010$R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010P\u001a\u0004\bR\u0010$R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010P\u001a\u0004\bS\u0010$R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010P\u001a\u0004\bT\u0010$R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bU\u0010$R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bV\u0010$R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bW\u0010$R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010P\u001a\u0004\bX\u0010$R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\bY\u0010$R%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010P\u001a\u0004\bZ\u0010$R%\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\b[\u0010$R%\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\b\\\u0010$R%\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\b]\u0010$R%\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\b^\u0010$R%\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\b_\u0010$R%\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\b`\u0010$R%\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010P\u001a\u0004\ba\u0010$R%\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\bb\u0010$R%\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010P\u001a\u0004\bc\u0010$R%\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010P\u001a\u0004\bd\u0010$R%\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010P\u001a\u0004\be\u0010$R%\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010P\u001a\u0004\bf\u0010$R%\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010P\u001a\u0004\bg\u0010$¨\u0006j"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/TopTeamsStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BasketballTopTeamsStatisticsItem;", "points", "pointsAgainst", "plusMinus", "fieldGoalsPercentage", "fieldGoalsPercentageAgainst", "freeThrowsPercentage", "threePointsPercentage", "threePointsPercentageAgainst", "threePointsMade", "fastbreakPoints", "assists", "rebounds", "defensiveRebounds", "offensiveRebounds", "steals", "turnovers", "blocks", "trueShootingPercentage", "effectiveFieldGoalPercentage", "pace", "offensiveRating", "defensiveRating", "netRating", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopTeamsStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopTeamsStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPoints", "getPointsAgainst", "getPlusMinus", "getFieldGoalsPercentage", "getFieldGoalsPercentageAgainst", "getFreeThrowsPercentage", "getThreePointsPercentage", "getThreePointsPercentageAgainst", "getThreePointsMade", "getFastbreakPoints", "getAssists", "getRebounds", "getDefensiveRebounds", "getOffensiveRebounds", "getSteals", "getTurnovers", "getBlocks", "getTrueShootingPercentage", "getEffectiveFieldGoalPercentage", "getPace", "getOffensiveRating", "getDefensiveRating", "getNetRating", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BasketballTopTeamsStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> assists;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> blocks;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> defensiveRating;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> defensiveRebounds;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> effectiveFieldGoalPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> fastbreakPoints;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> fieldGoalsPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> fieldGoalsPercentageAgainst;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> freeThrowsPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> netRating;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> offensiveRating;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> offensiveRebounds;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> pace;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> plusMinus;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> points;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> pointsAgainst;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> rebounds;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> steals;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> threePointsMade;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> threePointsPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> threePointsPercentageAgainst;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> trueShootingPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> turnovers;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new us1(18)), ypa.a(ysaVar, new us1(20)), ypa.a(ysaVar, new us1(24)), ypa.a(ysaVar, new us1(25)), ypa.a(ysaVar, new us1(26)), ypa.a(ysaVar, new us1(27)), ypa.a(ysaVar, new us1(28)), ypa.a(ysaVar, new vs1(0)), ypa.a(ysaVar, new vs1(1)), ypa.a(ysaVar, new vs1(2)), ypa.a(ysaVar, new us1(29)), ypa.a(ysaVar, new vs1(3)), ypa.a(ysaVar, new vs1(4)), ypa.a(ysaVar, new vs1(5)), ypa.a(ysaVar, new vs1(6)), ypa.a(ysaVar, new vs1(7)), ypa.a(ysaVar, new vs1(8)), ypa.a(ysaVar, new vs1(9)), ypa.a(ysaVar, new vs1(10)), ypa.a(ysaVar, new us1(19)), ypa.a(ysaVar, new us1(21)), ypa.a(ysaVar, new us1(22)), ypa.a(ysaVar, new us1(23))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketballTopTeamsStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, t5h t5hVar) {
        super(i, t5hVar);
        if (8388607 != (i & 8388607)) {
            oea.z(i, 8388607, BasketballTopTeamsStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = list;
        this.pointsAgainst = list2;
        this.plusMinus = list3;
        this.fieldGoalsPercentage = list4;
        this.fieldGoalsPercentageAgainst = list5;
        this.freeThrowsPercentage = list6;
        this.threePointsPercentage = list7;
        this.threePointsPercentageAgainst = list8;
        this.threePointsMade = list9;
        this.fastbreakPoints = list10;
        this.assists = list11;
        this.rebounds = list12;
        this.defensiveRebounds = list13;
        this.offensiveRebounds = list14;
        this.steals = list15;
        this.turnovers = list16;
        this.blocks = list17;
        this.trueShootingPercentage = list18;
        this.effectiveFieldGoalPercentage = list19;
        this.pace = list20;
        this.offensiveRating = list21;
        this.defensiveRating = list22;
        this.netRating = list23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$13() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$14() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$15() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$16() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$17() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$18() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$19() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$20() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$21() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(BasketballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ BasketballTopTeamsStatistics copy$default(BasketballTopTeamsStatistics basketballTopTeamsStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, int i, Object obj) {
        List list24;
        List list25;
        List list26 = (i & 1) != 0 ? basketballTopTeamsStatistics.points : list;
        List list27 = (i & 2) != 0 ? basketballTopTeamsStatistics.pointsAgainst : list2;
        List list28 = (i & 4) != 0 ? basketballTopTeamsStatistics.plusMinus : list3;
        List list29 = (i & 8) != 0 ? basketballTopTeamsStatistics.fieldGoalsPercentage : list4;
        List list30 = (i & 16) != 0 ? basketballTopTeamsStatistics.fieldGoalsPercentageAgainst : list5;
        List list31 = (i & 32) != 0 ? basketballTopTeamsStatistics.freeThrowsPercentage : list6;
        List list32 = (i & 64) != 0 ? basketballTopTeamsStatistics.threePointsPercentage : list7;
        List list33 = (i & 128) != 0 ? basketballTopTeamsStatistics.threePointsPercentageAgainst : list8;
        List list34 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? basketballTopTeamsStatistics.threePointsMade : list9;
        List list35 = (i & 512) != 0 ? basketballTopTeamsStatistics.fastbreakPoints : list10;
        List list36 = (i & 1024) != 0 ? basketballTopTeamsStatistics.assists : list11;
        List list37 = (i & a.o) != 0 ? basketballTopTeamsStatistics.rebounds : list12;
        List list38 = (i & 4096) != 0 ? basketballTopTeamsStatistics.defensiveRebounds : list13;
        List list39 = (i & 8192) != 0 ? basketballTopTeamsStatistics.offensiveRebounds : list14;
        List list40 = list26;
        List list41 = (i & 16384) != 0 ? basketballTopTeamsStatistics.steals : list15;
        List list42 = (i & 32768) != 0 ? basketballTopTeamsStatistics.turnovers : list16;
        List list43 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? basketballTopTeamsStatistics.blocks : list17;
        List list44 = (i & 131072) != 0 ? basketballTopTeamsStatistics.trueShootingPercentage : list18;
        List list45 = (i & 262144) != 0 ? basketballTopTeamsStatistics.effectiveFieldGoalPercentage : list19;
        List list46 = (i & 524288) != 0 ? basketballTopTeamsStatistics.pace : list20;
        List list47 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? basketballTopTeamsStatistics.offensiveRating : list21;
        List list48 = (i & 2097152) != 0 ? basketballTopTeamsStatistics.defensiveRating : list22;
        if ((i & 4194304) != 0) {
            list25 = list48;
            list24 = basketballTopTeamsStatistics.netRating;
        } else {
            list24 = list23;
            list25 = list48;
        }
        return basketballTopTeamsStatistics.copy(list40, list27, list28, list29, list30, list31, list32, list33, list34, list35, list36, list37, list38, list39, list41, list42, list43, list44, list45, list46, list47, list25, list24);
    }

    public static final /* synthetic */ void write$Self$model_release(BasketballTopTeamsStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.points);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.pointsAgainst);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.plusMinus);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.fieldGoalsPercentage);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.fieldGoalsPercentageAgainst);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.freeThrowsPercentage);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.threePointsPercentage);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.threePointsPercentageAgainst);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.threePointsMade);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.fastbreakPoints);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.assists);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.rebounds);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.defensiveRebounds);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.offensiveRebounds);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.steals);
        output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.turnovers);
        output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.blocks);
        output.h(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.trueShootingPercentage);
        output.h(serialDesc, 18, (KSerializer) joaVarArr[18].getValue(), self.effectiveFieldGoalPercentage);
        output.h(serialDesc, 19, (KSerializer) joaVarArr[19].getValue(), self.pace);
        output.h(serialDesc, 20, (KSerializer) joaVarArr[20].getValue(), self.offensiveRating);
        output.h(serialDesc, 21, (KSerializer) joaVarArr[21].getValue(), self.defensiveRating);
        output.h(serialDesc, 22, (KSerializer) joaVarArr[22].getValue(), self.netRating);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component1() {
        return this.points;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component10() {
        return this.fastbreakPoints;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component11() {
        return this.assists;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component12() {
        return this.rebounds;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component13() {
        return this.defensiveRebounds;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component14() {
        return this.offensiveRebounds;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component15() {
        return this.steals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component16() {
        return this.turnovers;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component17() {
        return this.blocks;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component18() {
        return this.trueShootingPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component19() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component2() {
        return this.pointsAgainst;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component20() {
        return this.pace;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component21() {
        return this.offensiveRating;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component22() {
        return this.defensiveRating;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component23() {
        return this.netRating;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component3() {
        return this.plusMinus;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component4() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component5() {
        return this.fieldGoalsPercentageAgainst;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component6() {
        return this.freeThrowsPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component7() {
        return this.threePointsPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component8() {
        return this.threePointsPercentageAgainst;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> component9() {
        return this.threePointsMade;
    }

    @NotNull
    public final BasketballTopTeamsStatistics copy(@Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> points, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> pointsAgainst, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> plusMinus, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> fieldGoalsPercentage, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> fieldGoalsPercentageAgainst, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> freeThrowsPercentage, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> threePointsPercentage, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> threePointsPercentageAgainst, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> threePointsMade, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> fastbreakPoints, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> assists, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> rebounds, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> defensiveRebounds, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> offensiveRebounds, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> steals, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> turnovers, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> blocks, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> trueShootingPercentage, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> effectiveFieldGoalPercentage, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> pace, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> offensiveRating, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> defensiveRating, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> netRating) {
        return new BasketballTopTeamsStatistics(points, pointsAgainst, plusMinus, fieldGoalsPercentage, fieldGoalsPercentageAgainst, freeThrowsPercentage, threePointsPercentage, threePointsPercentageAgainst, threePointsMade, fastbreakPoints, assists, rebounds, defensiveRebounds, offensiveRebounds, steals, turnovers, blocks, trueShootingPercentage, effectiveFieldGoalPercentage, pace, offensiveRating, defensiveRating, netRating);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketballTopTeamsStatistics)) {
            return false;
        }
        BasketballTopTeamsStatistics basketballTopTeamsStatistics = (BasketballTopTeamsStatistics) other;
        return Intrinsics.c(this.points, basketballTopTeamsStatistics.points) && Intrinsics.c(this.pointsAgainst, basketballTopTeamsStatistics.pointsAgainst) && Intrinsics.c(this.plusMinus, basketballTopTeamsStatistics.plusMinus) && Intrinsics.c(this.fieldGoalsPercentage, basketballTopTeamsStatistics.fieldGoalsPercentage) && Intrinsics.c(this.fieldGoalsPercentageAgainst, basketballTopTeamsStatistics.fieldGoalsPercentageAgainst) && Intrinsics.c(this.freeThrowsPercentage, basketballTopTeamsStatistics.freeThrowsPercentage) && Intrinsics.c(this.threePointsPercentage, basketballTopTeamsStatistics.threePointsPercentage) && Intrinsics.c(this.threePointsPercentageAgainst, basketballTopTeamsStatistics.threePointsPercentageAgainst) && Intrinsics.c(this.threePointsMade, basketballTopTeamsStatistics.threePointsMade) && Intrinsics.c(this.fastbreakPoints, basketballTopTeamsStatistics.fastbreakPoints) && Intrinsics.c(this.assists, basketballTopTeamsStatistics.assists) && Intrinsics.c(this.rebounds, basketballTopTeamsStatistics.rebounds) && Intrinsics.c(this.defensiveRebounds, basketballTopTeamsStatistics.defensiveRebounds) && Intrinsics.c(this.offensiveRebounds, basketballTopTeamsStatistics.offensiveRebounds) && Intrinsics.c(this.steals, basketballTopTeamsStatistics.steals) && Intrinsics.c(this.turnovers, basketballTopTeamsStatistics.turnovers) && Intrinsics.c(this.blocks, basketballTopTeamsStatistics.blocks) && Intrinsics.c(this.trueShootingPercentage, basketballTopTeamsStatistics.trueShootingPercentage) && Intrinsics.c(this.effectiveFieldGoalPercentage, basketballTopTeamsStatistics.effectiveFieldGoalPercentage) && Intrinsics.c(this.pace, basketballTopTeamsStatistics.pace) && Intrinsics.c(this.offensiveRating, basketballTopTeamsStatistics.offensiveRating) && Intrinsics.c(this.defensiveRating, basketballTopTeamsStatistics.defensiveRating) && Intrinsics.c(this.netRating, basketballTopTeamsStatistics.netRating);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getAssists() {
        return this.assists;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getBlocks() {
        return this.blocks;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getDefensiveRating() {
        return this.defensiveRating;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getEffectiveFieldGoalPercentage() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getFastbreakPoints() {
        return this.fastbreakPoints;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getFieldGoalsPercentage() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getFieldGoalsPercentageAgainst() {
        return this.fieldGoalsPercentageAgainst;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getFreeThrowsPercentage() {
        return this.freeThrowsPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getNetRating() {
        return this.netRating;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getOffensiveRating() {
        return this.offensiveRating;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getPace() {
        return this.pace;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getPoints() {
        return this.points;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getPointsAgainst() {
        return this.pointsAgainst;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getRebounds() {
        return this.rebounds;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getSteals() {
        return this.steals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getThreePointsPercentage() {
        return this.threePointsPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getThreePointsPercentageAgainst() {
        return this.threePointsPercentageAgainst;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getTrueShootingPercentage() {
        return this.trueShootingPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> getTurnovers() {
        return this.turnovers;
    }

    public int hashCode() {
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list = this.points;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list2 = this.pointsAgainst;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list3 = this.plusMinus;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list4 = this.fieldGoalsPercentage;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list5 = this.fieldGoalsPercentageAgainst;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list6 = this.freeThrowsPercentage;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list7 = this.threePointsPercentage;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list8 = this.threePointsPercentageAgainst;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list9 = this.threePointsMade;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list10 = this.fastbreakPoints;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list11 = this.assists;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list12 = this.rebounds;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list13 = this.defensiveRebounds;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list14 = this.offensiveRebounds;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list15 = this.steals;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list16 = this.turnovers;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list17 = this.blocks;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list18 = this.trueShootingPercentage;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list19 = this.effectiveFieldGoalPercentage;
        int hashCode19 = (hashCode18 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list20 = this.pace;
        int hashCode20 = (hashCode19 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list21 = this.offensiveRating;
        int hashCode21 = (hashCode20 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list22 = this.defensiveRating;
        int hashCode22 = (hashCode21 + (list22 == null ? 0 : list22.hashCode())) * 31;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list23 = this.netRating;
        return hashCode22 + (list23 != null ? list23.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list = this.points;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list2 = this.pointsAgainst;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list3 = this.plusMinus;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list4 = this.fieldGoalsPercentage;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list5 = this.fieldGoalsPercentageAgainst;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list6 = this.freeThrowsPercentage;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list7 = this.threePointsPercentage;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list8 = this.threePointsPercentageAgainst;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list9 = this.threePointsMade;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list10 = this.fastbreakPoints;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list11 = this.assists;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list12 = this.rebounds;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list13 = this.defensiveRebounds;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list14 = this.offensiveRebounds;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list15 = this.steals;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list16 = this.turnovers;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list17 = this.blocks;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list18 = this.trueShootingPercentage;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list19 = this.effectiveFieldGoalPercentage;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list20 = this.pace;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list21 = this.offensiveRating;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list22 = this.defensiveRating;
        List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list23 = this.netRating;
        StringBuilder s = fc6.s("BasketballTopTeamsStatistics(points=", ", pointsAgainst=", ", plusMinus=", list, list2);
        vxd.w(s, list3, ", fieldGoalsPercentage=", list4, ", fieldGoalsPercentageAgainst=");
        vxd.w(s, list5, ", freeThrowsPercentage=", list6, ", threePointsPercentage=");
        vxd.w(s, list7, ", threePointsPercentageAgainst=", list8, ", threePointsMade=");
        vxd.w(s, list9, ", fastbreakPoints=", list10, ", assists=");
        vxd.w(s, list11, ", rebounds=", list12, ", defensiveRebounds=");
        vxd.w(s, list13, ", offensiveRebounds=", list14, ", steals=");
        vxd.w(s, list15, ", turnovers=", list16, ", blocks=");
        vxd.w(s, list17, ", trueShootingPercentage=", list18, ", effectiveFieldGoalPercentage=");
        vxd.w(s, list19, ", pace=", list20, ", offensiveRating=");
        vxd.w(s, list21, ", defensiveRating=", list22, ", netRating=");
        return mz1.p(s, list23, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopTeamsStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopTeamsStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketballTopTeamsStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BasketballTopTeamsStatistics(@Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list2, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list3, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list4, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list5, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list6, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list7, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list8, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list9, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list10, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list11, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list12, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list13, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list14, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list15, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list16, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list17, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list18, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list19, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list20, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list21, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list22, @Nullable List<TopTeamsStatisticsItem<BasketballTopTeamsStatisticsItem>> list23) {
        super(null);
        this.points = list;
        this.pointsAgainst = list2;
        this.plusMinus = list3;
        this.fieldGoalsPercentage = list4;
        this.fieldGoalsPercentageAgainst = list5;
        this.freeThrowsPercentage = list6;
        this.threePointsPercentage = list7;
        this.threePointsPercentageAgainst = list8;
        this.threePointsMade = list9;
        this.fastbreakPoints = list10;
        this.assists = list11;
        this.rebounds = list12;
        this.defensiveRebounds = list13;
        this.offensiveRebounds = list14;
        this.steals = list15;
        this.turnovers = list16;
        this.blocks = list17;
        this.trueShootingPercentage = list18;
        this.effectiveFieldGoalPercentage = list19;
        this.pace = list20;
        this.offensiveRating = list21;
        this.defensiveRating = list22;
        this.netRating = list23;
    }
}
