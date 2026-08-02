package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.fc6;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.xl8;
import defpackage.yl8;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 a2\u00020\u0001:\u0002baB×\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aBë\u0002\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010!J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010!J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010!J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010!J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010!J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010!J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010!J\u008a\u0003\u00106\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b@\u0010AJ'\u0010J\u001a\u00020G2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0001¢\u0006\u0004\bH\u0010IR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010K\u001a\u0004\bL\u0010!R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bM\u0010!R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010K\u001a\u0004\bN\u0010!R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bO\u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bP\u0010!R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bQ\u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bR\u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bS\u0010!R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bT\u0010!R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bU\u0010!R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bV\u0010!R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bW\u0010!R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bX\u0010!R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bY\u0010!R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bZ\u0010!R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\b[\u0010!R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\b\\\u0010!R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\b]\u0010!R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\b^\u0010!R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010K\u001a\u0004\b_\u0010!R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\b`\u0010!¨\u0006c"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopStatsPerGameStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/response/TopStatsItem;", CampaignEx.JSON_KEY_STAR, "saves", "goalsPrevented", "accuratePass", "totalPass", "bigChanceCreated", "bigChanceMissed", "penaltySave", "keyPass", "totalTackle", "totalClearance", "goals", "expectedGoals", "goalAssist", "expectedAssists", "errorLeadToAGoal", "penaltyMiss", "wonContest", "kilometersCovered", "numberOfSprints", "topSpeed", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopStatsPerGameStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopStatsPerGameStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getRating", "getSaves", "getGoalsPrevented", "getAccuratePass", "getTotalPass", "getBigChanceCreated", "getBigChanceMissed", "getPenaltySave", "getKeyPass", "getTotalTackle", "getTotalClearance", "getGoals", "getExpectedGoals", "getGoalAssist", "getExpectedAssists", "getErrorLeadToAGoal", "getPenaltyMiss", "getWonContest", "getKilometersCovered", "getNumberOfSprints", "getTopSpeed", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FootballTopStatsPerGameStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopStatsItem> accuratePass;

    @Nullable
    private final List<TopStatsItem> bigChanceCreated;

    @Nullable
    private final List<TopStatsItem> bigChanceMissed;

    @Nullable
    private final List<TopStatsItem> errorLeadToAGoal;

    @Nullable
    private final List<TopStatsItem> expectedAssists;

    @Nullable
    private final List<TopStatsItem> expectedGoals;

    @Nullable
    private final List<TopStatsItem> goalAssist;

    @Nullable
    private final List<TopStatsItem> goals;

    @Nullable
    private final List<TopStatsItem> goalsPrevented;

    @Nullable
    private final List<TopStatsItem> keyPass;

    @Nullable
    private final List<TopStatsItem> kilometersCovered;

    @Nullable
    private final List<TopStatsItem> numberOfSprints;

    @Nullable
    private final List<TopStatsItem> penaltyMiss;

    @Nullable
    private final List<TopStatsItem> penaltySave;

    @Nullable
    private final List<TopStatsItem> rating;

    @Nullable
    private final List<TopStatsItem> saves;

    @Nullable
    private final List<TopStatsItem> topSpeed;

    @Nullable
    private final List<TopStatsItem> totalClearance;

    @Nullable
    private final List<TopStatsItem> totalPass;

    @Nullable
    private final List<TopStatsItem> totalTackle;

    @Nullable
    private final List<TopStatsItem> wonContest;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new xl8(13)), ypa.a(ysaVar, new xl8(15)), ypa.a(ysaVar, new xl8(17)), ypa.a(ysaVar, new xl8(18)), ypa.a(ysaVar, new xl8(19)), ypa.a(ysaVar, new xl8(20)), ypa.a(ysaVar, new xl8(21)), ypa.a(ysaVar, new xl8(22)), ypa.a(ysaVar, new xl8(23)), ypa.a(ysaVar, new xl8(25)), ypa.a(ysaVar, new xl8(24)), ypa.a(ysaVar, new xl8(26)), ypa.a(ysaVar, new xl8(27)), ypa.a(ysaVar, new xl8(28)), ypa.a(ysaVar, new xl8(29)), ypa.a(ysaVar, new yl8(0)), ypa.a(ysaVar, new yl8(1)), ypa.a(ysaVar, new yl8(2)), ypa.a(ysaVar, new yl8(3)), ypa.a(ysaVar, new xl8(14)), ypa.a(ysaVar, new xl8(16))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FootballTopStatsPerGameStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, t5h t5hVar) {
        super(i, t5hVar);
        if (2097151 != (i & 2097151)) {
            oea.z(i, 2097151, FootballTopStatsPerGameStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.rating = list;
        this.saves = list2;
        this.goalsPrevented = list3;
        this.accuratePass = list4;
        this.totalPass = list5;
        this.bigChanceCreated = list6;
        this.bigChanceMissed = list7;
        this.penaltySave = list8;
        this.keyPass = list9;
        this.totalTackle = list10;
        this.totalClearance = list11;
        this.goals = list12;
        this.expectedGoals = list13;
        this.goalAssist = list14;
        this.expectedAssists = list15;
        this.errorLeadToAGoal = list16;
        this.penaltyMiss = list17;
        this.wonContest = list18;
        this.kilometersCovered = list19;
        this.numberOfSprints = list20;
        this.topSpeed = list21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$13() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$14() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$15() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$16() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$17() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$18() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$19() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ FootballTopStatsPerGameStatistics copy$default(FootballTopStatsPerGameStatistics footballTopStatsPerGameStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, int i, Object obj) {
        List list22;
        List list23;
        List list24 = (i & 1) != 0 ? footballTopStatsPerGameStatistics.rating : list;
        List list25 = (i & 2) != 0 ? footballTopStatsPerGameStatistics.saves : list2;
        List list26 = (i & 4) != 0 ? footballTopStatsPerGameStatistics.goalsPrevented : list3;
        List list27 = (i & 8) != 0 ? footballTopStatsPerGameStatistics.accuratePass : list4;
        List list28 = (i & 16) != 0 ? footballTopStatsPerGameStatistics.totalPass : list5;
        List list29 = (i & 32) != 0 ? footballTopStatsPerGameStatistics.bigChanceCreated : list6;
        List list30 = (i & 64) != 0 ? footballTopStatsPerGameStatistics.bigChanceMissed : list7;
        List list31 = (i & 128) != 0 ? footballTopStatsPerGameStatistics.penaltySave : list8;
        List list32 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? footballTopStatsPerGameStatistics.keyPass : list9;
        List list33 = (i & 512) != 0 ? footballTopStatsPerGameStatistics.totalTackle : list10;
        List list34 = (i & 1024) != 0 ? footballTopStatsPerGameStatistics.totalClearance : list11;
        List list35 = (i & a.o) != 0 ? footballTopStatsPerGameStatistics.goals : list12;
        List list36 = (i & 4096) != 0 ? footballTopStatsPerGameStatistics.expectedGoals : list13;
        List list37 = (i & 8192) != 0 ? footballTopStatsPerGameStatistics.goalAssist : list14;
        List list38 = list24;
        List list39 = (i & 16384) != 0 ? footballTopStatsPerGameStatistics.expectedAssists : list15;
        List list40 = (i & 32768) != 0 ? footballTopStatsPerGameStatistics.errorLeadToAGoal : list16;
        List list41 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? footballTopStatsPerGameStatistics.penaltyMiss : list17;
        List list42 = (i & 131072) != 0 ? footballTopStatsPerGameStatistics.wonContest : list18;
        List list43 = (i & 262144) != 0 ? footballTopStatsPerGameStatistics.kilometersCovered : list19;
        List list44 = (i & 524288) != 0 ? footballTopStatsPerGameStatistics.numberOfSprints : list20;
        if ((i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            list23 = list44;
            list22 = footballTopStatsPerGameStatistics.topSpeed;
        } else {
            list22 = list21;
            list23 = list44;
        }
        return footballTopStatsPerGameStatistics.copy(list38, list25, list26, list27, list28, list29, list30, list31, list32, list33, list34, list35, list36, list37, list39, list40, list41, list42, list43, list23, list22);
    }

    public static final /* synthetic */ void write$Self$model_release(FootballTopStatsPerGameStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.rating);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.saves);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.goalsPrevented);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.accuratePass);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.totalPass);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.bigChanceCreated);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.bigChanceMissed);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.penaltySave);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.keyPass);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.totalTackle);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.totalClearance);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.goals);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.expectedGoals);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.goalAssist);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.expectedAssists);
        output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.errorLeadToAGoal);
        output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.penaltyMiss);
        output.h(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.wonContest);
        output.h(serialDesc, 18, (KSerializer) joaVarArr[18].getValue(), self.kilometersCovered);
        output.h(serialDesc, 19, (KSerializer) joaVarArr[19].getValue(), self.numberOfSprints);
        output.h(serialDesc, 20, (KSerializer) joaVarArr[20].getValue(), self.topSpeed);
    }

    @Nullable
    public final List<TopStatsItem> component1() {
        return this.rating;
    }

    @Nullable
    public final List<TopStatsItem> component10() {
        return this.totalTackle;
    }

    @Nullable
    public final List<TopStatsItem> component11() {
        return this.totalClearance;
    }

    @Nullable
    public final List<TopStatsItem> component12() {
        return this.goals;
    }

    @Nullable
    public final List<TopStatsItem> component13() {
        return this.expectedGoals;
    }

    @Nullable
    public final List<TopStatsItem> component14() {
        return this.goalAssist;
    }

    @Nullable
    public final List<TopStatsItem> component15() {
        return this.expectedAssists;
    }

    @Nullable
    public final List<TopStatsItem> component16() {
        return this.errorLeadToAGoal;
    }

    @Nullable
    public final List<TopStatsItem> component17() {
        return this.penaltyMiss;
    }

    @Nullable
    public final List<TopStatsItem> component18() {
        return this.wonContest;
    }

    @Nullable
    public final List<TopStatsItem> component19() {
        return this.kilometersCovered;
    }

    @Nullable
    public final List<TopStatsItem> component2() {
        return this.saves;
    }

    @Nullable
    public final List<TopStatsItem> component20() {
        return this.numberOfSprints;
    }

    @Nullable
    public final List<TopStatsItem> component21() {
        return this.topSpeed;
    }

    @Nullable
    public final List<TopStatsItem> component3() {
        return this.goalsPrevented;
    }

    @Nullable
    public final List<TopStatsItem> component4() {
        return this.accuratePass;
    }

    @Nullable
    public final List<TopStatsItem> component5() {
        return this.totalPass;
    }

    @Nullable
    public final List<TopStatsItem> component6() {
        return this.bigChanceCreated;
    }

    @Nullable
    public final List<TopStatsItem> component7() {
        return this.bigChanceMissed;
    }

    @Nullable
    public final List<TopStatsItem> component8() {
        return this.penaltySave;
    }

    @Nullable
    public final List<TopStatsItem> component9() {
        return this.keyPass;
    }

    @NotNull
    public final FootballTopStatsPerGameStatistics copy(@Nullable List<TopStatsItem> rating, @Nullable List<TopStatsItem> saves, @Nullable List<TopStatsItem> goalsPrevented, @Nullable List<TopStatsItem> accuratePass, @Nullable List<TopStatsItem> totalPass, @Nullable List<TopStatsItem> bigChanceCreated, @Nullable List<TopStatsItem> bigChanceMissed, @Nullable List<TopStatsItem> penaltySave, @Nullable List<TopStatsItem> keyPass, @Nullable List<TopStatsItem> totalTackle, @Nullable List<TopStatsItem> totalClearance, @Nullable List<TopStatsItem> goals, @Nullable List<TopStatsItem> expectedGoals, @Nullable List<TopStatsItem> goalAssist, @Nullable List<TopStatsItem> expectedAssists, @Nullable List<TopStatsItem> errorLeadToAGoal, @Nullable List<TopStatsItem> penaltyMiss, @Nullable List<TopStatsItem> wonContest, @Nullable List<TopStatsItem> kilometersCovered, @Nullable List<TopStatsItem> numberOfSprints, @Nullable List<TopStatsItem> topSpeed) {
        return new FootballTopStatsPerGameStatistics(rating, saves, goalsPrevented, accuratePass, totalPass, bigChanceCreated, bigChanceMissed, penaltySave, keyPass, totalTackle, totalClearance, goals, expectedGoals, goalAssist, expectedAssists, errorLeadToAGoal, penaltyMiss, wonContest, kilometersCovered, numberOfSprints, topSpeed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FootballTopStatsPerGameStatistics)) {
            return false;
        }
        FootballTopStatsPerGameStatistics footballTopStatsPerGameStatistics = (FootballTopStatsPerGameStatistics) other;
        return Intrinsics.c(this.rating, footballTopStatsPerGameStatistics.rating) && Intrinsics.c(this.saves, footballTopStatsPerGameStatistics.saves) && Intrinsics.c(this.goalsPrevented, footballTopStatsPerGameStatistics.goalsPrevented) && Intrinsics.c(this.accuratePass, footballTopStatsPerGameStatistics.accuratePass) && Intrinsics.c(this.totalPass, footballTopStatsPerGameStatistics.totalPass) && Intrinsics.c(this.bigChanceCreated, footballTopStatsPerGameStatistics.bigChanceCreated) && Intrinsics.c(this.bigChanceMissed, footballTopStatsPerGameStatistics.bigChanceMissed) && Intrinsics.c(this.penaltySave, footballTopStatsPerGameStatistics.penaltySave) && Intrinsics.c(this.keyPass, footballTopStatsPerGameStatistics.keyPass) && Intrinsics.c(this.totalTackle, footballTopStatsPerGameStatistics.totalTackle) && Intrinsics.c(this.totalClearance, footballTopStatsPerGameStatistics.totalClearance) && Intrinsics.c(this.goals, footballTopStatsPerGameStatistics.goals) && Intrinsics.c(this.expectedGoals, footballTopStatsPerGameStatistics.expectedGoals) && Intrinsics.c(this.goalAssist, footballTopStatsPerGameStatistics.goalAssist) && Intrinsics.c(this.expectedAssists, footballTopStatsPerGameStatistics.expectedAssists) && Intrinsics.c(this.errorLeadToAGoal, footballTopStatsPerGameStatistics.errorLeadToAGoal) && Intrinsics.c(this.penaltyMiss, footballTopStatsPerGameStatistics.penaltyMiss) && Intrinsics.c(this.wonContest, footballTopStatsPerGameStatistics.wonContest) && Intrinsics.c(this.kilometersCovered, footballTopStatsPerGameStatistics.kilometersCovered) && Intrinsics.c(this.numberOfSprints, footballTopStatsPerGameStatistics.numberOfSprints) && Intrinsics.c(this.topSpeed, footballTopStatsPerGameStatistics.topSpeed);
    }

    @Nullable
    public final List<TopStatsItem> getAccuratePass() {
        return this.accuratePass;
    }

    @Nullable
    public final List<TopStatsItem> getBigChanceCreated() {
        return this.bigChanceCreated;
    }

    @Nullable
    public final List<TopStatsItem> getBigChanceMissed() {
        return this.bigChanceMissed;
    }

    @Nullable
    public final List<TopStatsItem> getErrorLeadToAGoal() {
        return this.errorLeadToAGoal;
    }

    @Nullable
    public final List<TopStatsItem> getExpectedAssists() {
        return this.expectedAssists;
    }

    @Nullable
    public final List<TopStatsItem> getExpectedGoals() {
        return this.expectedGoals;
    }

    @Nullable
    public final List<TopStatsItem> getGoalAssist() {
        return this.goalAssist;
    }

    @Nullable
    public final List<TopStatsItem> getGoals() {
        return this.goals;
    }

    @Nullable
    public final List<TopStatsItem> getGoalsPrevented() {
        return this.goalsPrevented;
    }

    @Nullable
    public final List<TopStatsItem> getKeyPass() {
        return this.keyPass;
    }

    @Nullable
    public final List<TopStatsItem> getKilometersCovered() {
        return this.kilometersCovered;
    }

    @Nullable
    public final List<TopStatsItem> getNumberOfSprints() {
        return this.numberOfSprints;
    }

    @Nullable
    public final List<TopStatsItem> getPenaltyMiss() {
        return this.penaltyMiss;
    }

    @Nullable
    public final List<TopStatsItem> getPenaltySave() {
        return this.penaltySave;
    }

    @Nullable
    public final List<TopStatsItem> getRating() {
        return this.rating;
    }

    @Nullable
    public final List<TopStatsItem> getSaves() {
        return this.saves;
    }

    @Nullable
    public final List<TopStatsItem> getTopSpeed() {
        return this.topSpeed;
    }

    @Nullable
    public final List<TopStatsItem> getTotalClearance() {
        return this.totalClearance;
    }

    @Nullable
    public final List<TopStatsItem> getTotalPass() {
        return this.totalPass;
    }

    @Nullable
    public final List<TopStatsItem> getTotalTackle() {
        return this.totalTackle;
    }

    @Nullable
    public final List<TopStatsItem> getWonContest() {
        return this.wonContest;
    }

    public int hashCode() {
        List<TopStatsItem> list = this.rating;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopStatsItem> list2 = this.saves;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopStatsItem> list3 = this.goalsPrevented;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopStatsItem> list4 = this.accuratePass;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopStatsItem> list5 = this.totalPass;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopStatsItem> list6 = this.bigChanceCreated;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopStatsItem> list7 = this.bigChanceMissed;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopStatsItem> list8 = this.penaltySave;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopStatsItem> list9 = this.keyPass;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopStatsItem> list10 = this.totalTackle;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopStatsItem> list11 = this.totalClearance;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopStatsItem> list12 = this.goals;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TopStatsItem> list13 = this.expectedGoals;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TopStatsItem> list14 = this.goalAssist;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TopStatsItem> list15 = this.expectedAssists;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<TopStatsItem> list16 = this.errorLeadToAGoal;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<TopStatsItem> list17 = this.penaltyMiss;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<TopStatsItem> list18 = this.wonContest;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<TopStatsItem> list19 = this.kilometersCovered;
        int hashCode19 = (hashCode18 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<TopStatsItem> list20 = this.numberOfSprints;
        int hashCode20 = (hashCode19 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<TopStatsItem> list21 = this.topSpeed;
        return hashCode20 + (list21 != null ? list21.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopStatsItem> list = this.rating;
        List<TopStatsItem> list2 = this.saves;
        List<TopStatsItem> list3 = this.goalsPrevented;
        List<TopStatsItem> list4 = this.accuratePass;
        List<TopStatsItem> list5 = this.totalPass;
        List<TopStatsItem> list6 = this.bigChanceCreated;
        List<TopStatsItem> list7 = this.bigChanceMissed;
        List<TopStatsItem> list8 = this.penaltySave;
        List<TopStatsItem> list9 = this.keyPass;
        List<TopStatsItem> list10 = this.totalTackle;
        List<TopStatsItem> list11 = this.totalClearance;
        List<TopStatsItem> list12 = this.goals;
        List<TopStatsItem> list13 = this.expectedGoals;
        List<TopStatsItem> list14 = this.goalAssist;
        List<TopStatsItem> list15 = this.expectedAssists;
        List<TopStatsItem> list16 = this.errorLeadToAGoal;
        List<TopStatsItem> list17 = this.penaltyMiss;
        List<TopStatsItem> list18 = this.wonContest;
        List<TopStatsItem> list19 = this.kilometersCovered;
        List<TopStatsItem> list20 = this.numberOfSprints;
        List<TopStatsItem> list21 = this.topSpeed;
        StringBuilder s = fc6.s("FootballTopStatsPerGameStatistics(rating=", ", saves=", ", goalsPrevented=", list, list2);
        vxd.w(s, list3, ", accuratePass=", list4, ", totalPass=");
        vxd.w(s, list5, ", bigChanceCreated=", list6, ", bigChanceMissed=");
        vxd.w(s, list7, ", penaltySave=", list8, ", keyPass=");
        vxd.w(s, list9, ", totalTackle=", list10, ", totalClearance=");
        vxd.w(s, list11, ", goals=", list12, ", expectedGoals=");
        vxd.w(s, list13, ", goalAssist=", list14, ", expectedAssists=");
        vxd.w(s, list15, ", errorLeadToAGoal=", list16, ", penaltyMiss=");
        vxd.w(s, list17, ", wonContest=", list18, ", kilometersCovered=");
        vxd.w(s, list19, ", numberOfSprints=", list20, ", topSpeed=");
        return mz1.p(s, list21, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopStatsPerGameStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopStatsPerGameStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FootballTopStatsPerGameStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FootballTopStatsPerGameStatistics(@Nullable List<TopStatsItem> list, @Nullable List<TopStatsItem> list2, @Nullable List<TopStatsItem> list3, @Nullable List<TopStatsItem> list4, @Nullable List<TopStatsItem> list5, @Nullable List<TopStatsItem> list6, @Nullable List<TopStatsItem> list7, @Nullable List<TopStatsItem> list8, @Nullable List<TopStatsItem> list9, @Nullable List<TopStatsItem> list10, @Nullable List<TopStatsItem> list11, @Nullable List<TopStatsItem> list12, @Nullable List<TopStatsItem> list13, @Nullable List<TopStatsItem> list14, @Nullable List<TopStatsItem> list15, @Nullable List<TopStatsItem> list16, @Nullable List<TopStatsItem> list17, @Nullable List<TopStatsItem> list18, @Nullable List<TopStatsItem> list19, @Nullable List<TopStatsItem> list20, @Nullable List<TopStatsItem> list21) {
        super(null);
        this.rating = list;
        this.saves = list2;
        this.goalsPrevented = list3;
        this.accuratePass = list4;
        this.totalPass = list5;
        this.bigChanceCreated = list6;
        this.bigChanceMissed = list7;
        this.penaltySave = list8;
        this.keyPass = list9;
        this.totalTackle = list10;
        this.totalClearance = list11;
        this.goals = list12;
        this.expectedGoals = list13;
        this.goalAssist = list14;
        this.expectedAssists = list15;
        this.errorLeadToAGoal = list16;
        this.penaltyMiss = list17;
        this.wonContest = list18;
        this.kilometersCovered = list19;
        this.numberOfSprints = list20;
        this.topSpeed = list21;
    }
}
