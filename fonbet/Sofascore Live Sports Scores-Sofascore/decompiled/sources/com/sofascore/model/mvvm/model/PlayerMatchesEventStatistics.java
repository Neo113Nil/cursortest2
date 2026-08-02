package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.me4;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wt3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\b\u0087\b\u0018\u0000 \u0085\u00012\u00020\u0001:\u0004\u0086\u0001\u0085\u0001BÑ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&B«\u0002\b\u0010\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b%\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u0010/J\u0010\u00102\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u0010/J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010/J\u0010\u00104\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b4\u0010/J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u0010/J\u0010\u00106\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b6\u0010/J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u0010/J\u0010\u00108\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b8\u0010/J\u0010\u00109\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b9\u0010/J\u0010\u0010:\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b:\u0010/J\u0010\u0010;\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b;\u0010/J\u0010\u0010<\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b<\u0010/J\u0010\u0010=\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b=\u0010/J\u0010\u0010>\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b>\u0010/J\u0010\u0010?\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b?\u0010-J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u0010-J\u0010\u0010A\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bA\u0010-J\u0010\u0010B\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bB\u0010-J\u0010\u0010C\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bC\u0010/J\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u0010-J\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u0010-J\u0010\u0010F\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bF\u0010/J\u0010\u0010G\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bG\u0010/J\u0010\u0010H\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bH\u0010/J\u0010\u0010I\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bI\u0010/J\u0010\u0010J\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bJ\u0010/J\u0010\u0010K\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bK\u0010/J\u0010\u0010L\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bL\u0010/J\u0010\u0010M\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bM\u0010/J\u0010\u0010N\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bN\u0010-JÚ\u0002\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010R\u001a\u00020QHÖ\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bT\u0010/J\u001a\u0010W\u001a\u00020V2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bW\u0010XJ'\u0010a\u001a\u00020^2\u0006\u0010Y\u001a\u00020\u00002\u0006\u0010[\u001a\u00020Z2\u0006\u0010]\u001a\u00020\\H\u0001¢\u0006\u0004\b_\u0010`R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010b\u001a\u0004\bc\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010d\u001a\u0004\be\u0010/R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010d\u001a\u0004\bf\u0010/R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010d\u001a\u0004\bg\u0010/R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010d\u001a\u0004\bh\u0010/R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010d\u001a\u0004\bi\u0010/R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010d\u001a\u0004\bj\u0010/R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010d\u001a\u0004\bk\u0010/R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010d\u001a\u0004\bl\u0010/R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010d\u001a\u0004\bm\u0010/R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010d\u001a\u0004\bn\u0010/R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010d\u001a\u0004\bo\u0010/R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010d\u001a\u0004\bp\u0010/R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010d\u001a\u0004\bq\u0010/R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010d\u001a\u0004\br\u0010/R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010d\u001a\u0004\bs\u0010/R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010d\u001a\u0004\bt\u0010/R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010b\u001a\u0004\bu\u0010-R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010b\u001a\u0004\bv\u0010-R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010b\u001a\u0004\bw\u0010-R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010b\u001a\u0004\bx\u0010-R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010d\u001a\u0004\by\u0010/R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010b\u001a\u0004\bz\u0010-R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010b\u001a\u0004\b{\u0010-R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010d\u001a\u0004\b|\u0010/R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010d\u001a\u0004\b}\u0010/R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010d\u001a\u0004\b~\u0010/R\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010d\u001a\u0004\b\u007f\u0010/R\u0018\u0010 \u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b \u0010d\u001a\u0005\b\u0080\u0001\u0010/R\u0018\u0010!\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b!\u0010d\u001a\u0005\b\u0081\u0001\u0010/R\u0018\u0010\"\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b\"\u0010d\u001a\u0005\b\u0082\u0001\u0010/R\u0018\u0010#\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b#\u0010d\u001a\u0005\b\u0083\u0001\u0010/R\u0018\u0010$\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b$\u0010b\u001a\u0005\b\u0084\u0001\u0010-¨\u0006\u0087\u0001"}, d2 = {"Lcom/sofascore/model/mvvm/model/PlayerMatchesEventStatistics;", "", "", CampaignEx.JSON_KEY_STAR, "", "points", "rebounds", "assists", "steals", "blocks", "pointsTotal", "attackPoints", "blockPoints", "aces", "battingAtBats", "battingRuns", "battingHits", "battingRbi", "battingHomeRuns", "battingBaseOnBalls", "battingStrikeOuts", "battingAverageToDate", "battingOnBasePercentageToDate", "battingSluggingPercentageToDate", "battingOpsToDate", "battingGamesPlayed", "pitchingInningsPitched", "pitchingEarnedRunsAverageToDate", "pitchingHitsAllowed", "pitchingRuns", "pitchingEarnedRuns", "pitchingBaseOnBalls", "pitchingStrikeOuts", "pitchingHomeRuns", "pitchingPitchesThrown", "pitchingStrikes", "pitchingWhipToDate", "<init>", "(DIIIIIIIIIIIIIIIIDDDDIDDIIIIIIIID)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IIDIIIIIIIIIIIIIIIIDDDDIDDIIIIIIIIDLt5h;)V", "component1", "()D", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "copy", "(DIIIIIIIIIIIIIIIIDDDDIDDIIIIIIIID)Lcom/sofascore/model/mvvm/model/PlayerMatchesEventStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/PlayerMatchesEventStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "D", "getRating", "I", "getPoints", "getRebounds", "getAssists", "getSteals", "getBlocks", "getPointsTotal", "getAttackPoints", "getBlockPoints", "getAces", "getBattingAtBats", "getBattingRuns", "getBattingHits", "getBattingRbi", "getBattingHomeRuns", "getBattingBaseOnBalls", "getBattingStrikeOuts", "getBattingAverageToDate", "getBattingOnBasePercentageToDate", "getBattingSluggingPercentageToDate", "getBattingOpsToDate", "getBattingGamesPlayed", "getPitchingInningsPitched", "getPitchingEarnedRunsAverageToDate", "getPitchingHitsAllowed", "getPitchingRuns", "getPitchingEarnedRuns", "getPitchingBaseOnBalls", "getPitchingStrikeOuts", "getPitchingHomeRuns", "getPitchingPitchesThrown", "getPitchingStrikes", "getPitchingWhipToDate", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerMatchesEventStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int aces;
    private final int assists;
    private final int attackPoints;
    private final int battingAtBats;
    private final double battingAverageToDate;
    private final int battingBaseOnBalls;
    private final int battingGamesPlayed;
    private final int battingHits;
    private final int battingHomeRuns;
    private final double battingOnBasePercentageToDate;
    private final double battingOpsToDate;
    private final int battingRbi;
    private final int battingRuns;
    private final double battingSluggingPercentageToDate;
    private final int battingStrikeOuts;
    private final int blockPoints;
    private final int blocks;
    private final int pitchingBaseOnBalls;
    private final int pitchingEarnedRuns;
    private final double pitchingEarnedRunsAverageToDate;
    private final int pitchingHitsAllowed;
    private final int pitchingHomeRuns;
    private final double pitchingInningsPitched;
    private final int pitchingPitchesThrown;
    private final int pitchingRuns;
    private final int pitchingStrikeOuts;
    private final int pitchingStrikes;
    private final double pitchingWhipToDate;
    private final int points;
    private final int pointsTotal;
    private final double rating;
    private final int rebounds;
    private final int steals;

    public /* synthetic */ PlayerMatchesEventStatistics(double d, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, double d2, double d3, double d4, double d5, int i17, double d6, double d7, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, double d8, int i26, int i27, DefaultConstructorMarker defaultConstructorMarker) {
        this((i26 & 1) != 0 ? 0.0d : d, (i26 & 2) != 0 ? 0 : i, (i26 & 4) != 0 ? 0 : i2, (i26 & 8) != 0 ? 0 : i3, (i26 & 16) != 0 ? 0 : i4, (i26 & 32) != 0 ? 0 : i5, (i26 & 64) != 0 ? 0 : i6, (i26 & 128) != 0 ? 0 : i7, (i26 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0 : i8, (i26 & 512) != 0 ? 0 : i9, (i26 & 1024) != 0 ? 0 : i10, (i26 & a.o) != 0 ? 0 : i11, (i26 & 4096) != 0 ? 0 : i12, (i26 & 8192) != 0 ? 0 : i13, (i26 & 16384) != 0 ? 0 : i14, (i26 & 32768) != 0 ? 0 : i15, (i26 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? 0 : i16, (i26 & 131072) != 0 ? 0.0d : d2, (i26 & 262144) != 0 ? 0.0d : d3, (i26 & 524288) != 0 ? 0.0d : d4, (i26 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? 0.0d : d5, (i26 & 2097152) != 0 ? 0 : i17, (i26 & 4194304) != 0 ? 0.0d : d6, (i26 & 8388608) != 0 ? 0.0d : d7, (i26 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? 0 : i18, (i26 & 33554432) != 0 ? 0 : i19, (i26 & 67108864) != 0 ? 0 : i20, (i26 & 134217728) != 0 ? 0 : i21, (i26 & 268435456) != 0 ? 0 : i22, (i26 & 536870912) != 0 ? 0 : i23, (i26 & 1073741824) != 0 ? 0 : i24, (i26 & Integer.MIN_VALUE) != 0 ? 0 : i25, (i27 & 1) != 0 ? 0.0d : d8);
    }

    public static /* synthetic */ PlayerMatchesEventStatistics copy$default(PlayerMatchesEventStatistics playerMatchesEventStatistics, double d, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, double d2, double d3, double d4, double d5, int i17, double d6, double d7, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, double d8, int i26, int i27, Object obj) {
        double d9;
        int i28;
        int i29;
        double d10;
        double d11;
        int i30;
        double d12;
        double d13;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        double d14;
        double d15;
        PlayerMatchesEventStatistics playerMatchesEventStatistics2;
        int i49;
        int i50;
        int i51;
        int i52;
        double d16 = (i26 & 1) != 0 ? playerMatchesEventStatistics.rating : d;
        int i53 = (i26 & 2) != 0 ? playerMatchesEventStatistics.points : i;
        int i54 = (i26 & 4) != 0 ? playerMatchesEventStatistics.rebounds : i2;
        int i55 = (i26 & 8) != 0 ? playerMatchesEventStatistics.assists : i3;
        int i56 = (i26 & 16) != 0 ? playerMatchesEventStatistics.steals : i4;
        int i57 = (i26 & 32) != 0 ? playerMatchesEventStatistics.blocks : i5;
        int i58 = (i26 & 64) != 0 ? playerMatchesEventStatistics.pointsTotal : i6;
        int i59 = (i26 & 128) != 0 ? playerMatchesEventStatistics.attackPoints : i7;
        int i60 = (i26 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? playerMatchesEventStatistics.blockPoints : i8;
        int i61 = (i26 & 512) != 0 ? playerMatchesEventStatistics.aces : i9;
        int i62 = (i26 & 1024) != 0 ? playerMatchesEventStatistics.battingAtBats : i10;
        int i63 = (i26 & a.o) != 0 ? playerMatchesEventStatistics.battingRuns : i11;
        int i64 = (i26 & 4096) != 0 ? playerMatchesEventStatistics.battingHits : i12;
        double d17 = d16;
        int i65 = (i26 & 8192) != 0 ? playerMatchesEventStatistics.battingRbi : i13;
        int i66 = (i26 & 16384) != 0 ? playerMatchesEventStatistics.battingHomeRuns : i14;
        int i67 = (i26 & 32768) != 0 ? playerMatchesEventStatistics.battingBaseOnBalls : i15;
        int i68 = (i26 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? playerMatchesEventStatistics.battingStrikeOuts : i16;
        int i69 = i65;
        double d18 = (i26 & 131072) != 0 ? playerMatchesEventStatistics.battingAverageToDate : d2;
        double d19 = (i26 & 262144) != 0 ? playerMatchesEventStatistics.battingOnBasePercentageToDate : d3;
        double d20 = (i26 & 524288) != 0 ? playerMatchesEventStatistics.battingSluggingPercentageToDate : d4;
        double d21 = (i26 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? playerMatchesEventStatistics.battingOpsToDate : d5;
        int i70 = (i26 & 2097152) != 0 ? playerMatchesEventStatistics.battingGamesPlayed : i17;
        double d22 = (i26 & 4194304) != 0 ? playerMatchesEventStatistics.pitchingInningsPitched : d6;
        double d23 = (i26 & 8388608) != 0 ? playerMatchesEventStatistics.pitchingEarnedRunsAverageToDate : d7;
        int i71 = (i26 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? playerMatchesEventStatistics.pitchingHitsAllowed : i18;
        int i72 = (i26 & 33554432) != 0 ? playerMatchesEventStatistics.pitchingRuns : i19;
        int i73 = i71;
        int i74 = (i26 & 67108864) != 0 ? playerMatchesEventStatistics.pitchingEarnedRuns : i20;
        int i75 = (i26 & 134217728) != 0 ? playerMatchesEventStatistics.pitchingBaseOnBalls : i21;
        int i76 = (i26 & 268435456) != 0 ? playerMatchesEventStatistics.pitchingStrikeOuts : i22;
        int i77 = (i26 & 536870912) != 0 ? playerMatchesEventStatistics.pitchingHomeRuns : i23;
        int i78 = (i26 & 1073741824) != 0 ? playerMatchesEventStatistics.pitchingPitchesThrown : i24;
        int i79 = (i26 & Integer.MIN_VALUE) != 0 ? playerMatchesEventStatistics.pitchingStrikes : i25;
        if ((i27 & 1) != 0) {
            i29 = i72;
            i28 = i79;
            d9 = playerMatchesEventStatistics.pitchingWhipToDate;
            d11 = d21;
            i30 = i70;
            d12 = d22;
            d13 = d23;
            i31 = i73;
            i32 = i74;
            i33 = i75;
            i34 = i76;
            i35 = i77;
            i36 = i78;
            i37 = i66;
            i40 = i59;
            i41 = i60;
            i42 = i61;
            i43 = i62;
            i44 = i63;
            i45 = i64;
            i46 = i67;
            i47 = i69;
            i48 = i68;
            d14 = d18;
            d15 = d19;
            d10 = d20;
            playerMatchesEventStatistics2 = playerMatchesEventStatistics;
            i49 = i53;
            i50 = i54;
            i51 = i55;
            i52 = i56;
            i38 = i57;
            i39 = i58;
        } else {
            d9 = d8;
            i28 = i79;
            i29 = i72;
            d10 = d20;
            d11 = d21;
            i30 = i70;
            d12 = d22;
            d13 = d23;
            i31 = i73;
            i32 = i74;
            i33 = i75;
            i34 = i76;
            i35 = i77;
            i36 = i78;
            i37 = i66;
            i38 = i57;
            i39 = i58;
            i40 = i59;
            i41 = i60;
            i42 = i61;
            i43 = i62;
            i44 = i63;
            i45 = i64;
            i46 = i67;
            i47 = i69;
            i48 = i68;
            d14 = d18;
            d15 = d19;
            playerMatchesEventStatistics2 = playerMatchesEventStatistics;
            i49 = i53;
            i50 = i54;
            i51 = i55;
            i52 = i56;
        }
        return playerMatchesEventStatistics2.copy(d17, i49, i50, i51, i52, i38, i39, i40, i41, i42, i43, i44, i45, i47, i37, i46, i48, d14, d15, d10, d11, i30, d12, d13, i31, i29, i32, i33, i34, i35, i36, i28, d9);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerMatchesEventStatistics self, wf3 output, SerialDescriptor serialDesc) {
        if (output.o(serialDesc) || Double.compare(self.rating, 0.0d) != 0) {
            output.D(serialDesc, 0, self.rating);
        }
        if (output.o(serialDesc) || self.points != 0) {
            output.u(1, self.points, serialDesc);
        }
        if (output.o(serialDesc) || self.rebounds != 0) {
            output.u(2, self.rebounds, serialDesc);
        }
        if (output.o(serialDesc) || self.assists != 0) {
            output.u(3, self.assists, serialDesc);
        }
        if (output.o(serialDesc) || self.steals != 0) {
            output.u(4, self.steals, serialDesc);
        }
        if (output.o(serialDesc) || self.blocks != 0) {
            output.u(5, self.blocks, serialDesc);
        }
        if (output.o(serialDesc) || self.pointsTotal != 0) {
            output.u(6, self.pointsTotal, serialDesc);
        }
        if (output.o(serialDesc) || self.attackPoints != 0) {
            output.u(7, self.attackPoints, serialDesc);
        }
        if (output.o(serialDesc) || self.blockPoints != 0) {
            output.u(8, self.blockPoints, serialDesc);
        }
        if (output.o(serialDesc) || self.aces != 0) {
            output.u(9, self.aces, serialDesc);
        }
        if (output.o(serialDesc) || self.battingAtBats != 0) {
            output.u(10, self.battingAtBats, serialDesc);
        }
        if (output.o(serialDesc) || self.battingRuns != 0) {
            output.u(11, self.battingRuns, serialDesc);
        }
        if (output.o(serialDesc) || self.battingHits != 0) {
            output.u(12, self.battingHits, serialDesc);
        }
        if (output.o(serialDesc) || self.battingRbi != 0) {
            output.u(13, self.battingRbi, serialDesc);
        }
        if (output.o(serialDesc) || self.battingHomeRuns != 0) {
            output.u(14, self.battingHomeRuns, serialDesc);
        }
        if (output.o(serialDesc) || self.battingBaseOnBalls != 0) {
            output.u(15, self.battingBaseOnBalls, serialDesc);
        }
        if (output.o(serialDesc) || self.battingStrikeOuts != 0) {
            output.u(16, self.battingStrikeOuts, serialDesc);
        }
        if (output.o(serialDesc) || Double.compare(self.battingAverageToDate, 0.0d) != 0) {
            output.D(serialDesc, 17, self.battingAverageToDate);
        }
        if (output.o(serialDesc) || Double.compare(self.battingOnBasePercentageToDate, 0.0d) != 0) {
            output.D(serialDesc, 18, self.battingOnBasePercentageToDate);
        }
        if (output.o(serialDesc) || Double.compare(self.battingSluggingPercentageToDate, 0.0d) != 0) {
            output.D(serialDesc, 19, self.battingSluggingPercentageToDate);
        }
        if (output.o(serialDesc) || Double.compare(self.battingOpsToDate, 0.0d) != 0) {
            output.D(serialDesc, 20, self.battingOpsToDate);
        }
        if (output.o(serialDesc) || self.battingGamesPlayed != 0) {
            output.u(21, self.battingGamesPlayed, serialDesc);
        }
        if (output.o(serialDesc) || Double.compare(self.pitchingInningsPitched, 0.0d) != 0) {
            output.D(serialDesc, 22, self.pitchingInningsPitched);
        }
        if (output.o(serialDesc) || Double.compare(self.pitchingEarnedRunsAverageToDate, 0.0d) != 0) {
            output.D(serialDesc, 23, self.pitchingEarnedRunsAverageToDate);
        }
        if (output.o(serialDesc) || self.pitchingHitsAllowed != 0) {
            output.u(24, self.pitchingHitsAllowed, serialDesc);
        }
        if (output.o(serialDesc) || self.pitchingRuns != 0) {
            output.u(25, self.pitchingRuns, serialDesc);
        }
        if (output.o(serialDesc) || self.pitchingEarnedRuns != 0) {
            output.u(26, self.pitchingEarnedRuns, serialDesc);
        }
        if (output.o(serialDesc) || self.pitchingBaseOnBalls != 0) {
            output.u(27, self.pitchingBaseOnBalls, serialDesc);
        }
        if (output.o(serialDesc) || self.pitchingStrikeOuts != 0) {
            output.u(28, self.pitchingStrikeOuts, serialDesc);
        }
        if (output.o(serialDesc) || self.pitchingHomeRuns != 0) {
            output.u(29, self.pitchingHomeRuns, serialDesc);
        }
        if (output.o(serialDesc) || self.pitchingPitchesThrown != 0) {
            output.u(30, self.pitchingPitchesThrown, serialDesc);
        }
        if (output.o(serialDesc) || self.pitchingStrikes != 0) {
            output.u(31, self.pitchingStrikes, serialDesc);
        }
        if (!output.o(serialDesc) && Double.compare(self.pitchingWhipToDate, 0.0d) == 0) {
            return;
        }
        output.D(serialDesc, 32, self.pitchingWhipToDate);
    }

    /* renamed from: component1, reason: from getter */
    public final double getRating() {
        return this.rating;
    }

    /* renamed from: component10, reason: from getter */
    public final int getAces() {
        return this.aces;
    }

    /* renamed from: component11, reason: from getter */
    public final int getBattingAtBats() {
        return this.battingAtBats;
    }

    /* renamed from: component12, reason: from getter */
    public final int getBattingRuns() {
        return this.battingRuns;
    }

    /* renamed from: component13, reason: from getter */
    public final int getBattingHits() {
        return this.battingHits;
    }

    /* renamed from: component14, reason: from getter */
    public final int getBattingRbi() {
        return this.battingRbi;
    }

    /* renamed from: component15, reason: from getter */
    public final int getBattingHomeRuns() {
        return this.battingHomeRuns;
    }

    /* renamed from: component16, reason: from getter */
    public final int getBattingBaseOnBalls() {
        return this.battingBaseOnBalls;
    }

    /* renamed from: component17, reason: from getter */
    public final int getBattingStrikeOuts() {
        return this.battingStrikeOuts;
    }

    /* renamed from: component18, reason: from getter */
    public final double getBattingAverageToDate() {
        return this.battingAverageToDate;
    }

    /* renamed from: component19, reason: from getter */
    public final double getBattingOnBasePercentageToDate() {
        return this.battingOnBasePercentageToDate;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    /* renamed from: component20, reason: from getter */
    public final double getBattingSluggingPercentageToDate() {
        return this.battingSluggingPercentageToDate;
    }

    /* renamed from: component21, reason: from getter */
    public final double getBattingOpsToDate() {
        return this.battingOpsToDate;
    }

    /* renamed from: component22, reason: from getter */
    public final int getBattingGamesPlayed() {
        return this.battingGamesPlayed;
    }

    /* renamed from: component23, reason: from getter */
    public final double getPitchingInningsPitched() {
        return this.pitchingInningsPitched;
    }

    /* renamed from: component24, reason: from getter */
    public final double getPitchingEarnedRunsAverageToDate() {
        return this.pitchingEarnedRunsAverageToDate;
    }

    /* renamed from: component25, reason: from getter */
    public final int getPitchingHitsAllowed() {
        return this.pitchingHitsAllowed;
    }

    /* renamed from: component26, reason: from getter */
    public final int getPitchingRuns() {
        return this.pitchingRuns;
    }

    /* renamed from: component27, reason: from getter */
    public final int getPitchingEarnedRuns() {
        return this.pitchingEarnedRuns;
    }

    /* renamed from: component28, reason: from getter */
    public final int getPitchingBaseOnBalls() {
        return this.pitchingBaseOnBalls;
    }

    /* renamed from: component29, reason: from getter */
    public final int getPitchingStrikeOuts() {
        return this.pitchingStrikeOuts;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRebounds() {
        return this.rebounds;
    }

    /* renamed from: component30, reason: from getter */
    public final int getPitchingHomeRuns() {
        return this.pitchingHomeRuns;
    }

    /* renamed from: component31, reason: from getter */
    public final int getPitchingPitchesThrown() {
        return this.pitchingPitchesThrown;
    }

    /* renamed from: component32, reason: from getter */
    public final int getPitchingStrikes() {
        return this.pitchingStrikes;
    }

    /* renamed from: component33, reason: from getter */
    public final double getPitchingWhipToDate() {
        return this.pitchingWhipToDate;
    }

    /* renamed from: component4, reason: from getter */
    public final int getAssists() {
        return this.assists;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSteals() {
        return this.steals;
    }

    /* renamed from: component6, reason: from getter */
    public final int getBlocks() {
        return this.blocks;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPointsTotal() {
        return this.pointsTotal;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAttackPoints() {
        return this.attackPoints;
    }

    /* renamed from: component9, reason: from getter */
    public final int getBlockPoints() {
        return this.blockPoints;
    }

    @NotNull
    public final PlayerMatchesEventStatistics copy(double rating, int points, int rebounds, int assists, int steals, int blocks, int pointsTotal, int attackPoints, int blockPoints, int aces, int battingAtBats, int battingRuns, int battingHits, int battingRbi, int battingHomeRuns, int battingBaseOnBalls, int battingStrikeOuts, double battingAverageToDate, double battingOnBasePercentageToDate, double battingSluggingPercentageToDate, double battingOpsToDate, int battingGamesPlayed, double pitchingInningsPitched, double pitchingEarnedRunsAverageToDate, int pitchingHitsAllowed, int pitchingRuns, int pitchingEarnedRuns, int pitchingBaseOnBalls, int pitchingStrikeOuts, int pitchingHomeRuns, int pitchingPitchesThrown, int pitchingStrikes, double pitchingWhipToDate) {
        return new PlayerMatchesEventStatistics(rating, points, rebounds, assists, steals, blocks, pointsTotal, attackPoints, blockPoints, aces, battingAtBats, battingRuns, battingHits, battingRbi, battingHomeRuns, battingBaseOnBalls, battingStrikeOuts, battingAverageToDate, battingOnBasePercentageToDate, battingSluggingPercentageToDate, battingOpsToDate, battingGamesPlayed, pitchingInningsPitched, pitchingEarnedRunsAverageToDate, pitchingHitsAllowed, pitchingRuns, pitchingEarnedRuns, pitchingBaseOnBalls, pitchingStrikeOuts, pitchingHomeRuns, pitchingPitchesThrown, pitchingStrikes, pitchingWhipToDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerMatchesEventStatistics)) {
            return false;
        }
        PlayerMatchesEventStatistics playerMatchesEventStatistics = (PlayerMatchesEventStatistics) other;
        return Double.compare(this.rating, playerMatchesEventStatistics.rating) == 0 && this.points == playerMatchesEventStatistics.points && this.rebounds == playerMatchesEventStatistics.rebounds && this.assists == playerMatchesEventStatistics.assists && this.steals == playerMatchesEventStatistics.steals && this.blocks == playerMatchesEventStatistics.blocks && this.pointsTotal == playerMatchesEventStatistics.pointsTotal && this.attackPoints == playerMatchesEventStatistics.attackPoints && this.blockPoints == playerMatchesEventStatistics.blockPoints && this.aces == playerMatchesEventStatistics.aces && this.battingAtBats == playerMatchesEventStatistics.battingAtBats && this.battingRuns == playerMatchesEventStatistics.battingRuns && this.battingHits == playerMatchesEventStatistics.battingHits && this.battingRbi == playerMatchesEventStatistics.battingRbi && this.battingHomeRuns == playerMatchesEventStatistics.battingHomeRuns && this.battingBaseOnBalls == playerMatchesEventStatistics.battingBaseOnBalls && this.battingStrikeOuts == playerMatchesEventStatistics.battingStrikeOuts && Double.compare(this.battingAverageToDate, playerMatchesEventStatistics.battingAverageToDate) == 0 && Double.compare(this.battingOnBasePercentageToDate, playerMatchesEventStatistics.battingOnBasePercentageToDate) == 0 && Double.compare(this.battingSluggingPercentageToDate, playerMatchesEventStatistics.battingSluggingPercentageToDate) == 0 && Double.compare(this.battingOpsToDate, playerMatchesEventStatistics.battingOpsToDate) == 0 && this.battingGamesPlayed == playerMatchesEventStatistics.battingGamesPlayed && Double.compare(this.pitchingInningsPitched, playerMatchesEventStatistics.pitchingInningsPitched) == 0 && Double.compare(this.pitchingEarnedRunsAverageToDate, playerMatchesEventStatistics.pitchingEarnedRunsAverageToDate) == 0 && this.pitchingHitsAllowed == playerMatchesEventStatistics.pitchingHitsAllowed && this.pitchingRuns == playerMatchesEventStatistics.pitchingRuns && this.pitchingEarnedRuns == playerMatchesEventStatistics.pitchingEarnedRuns && this.pitchingBaseOnBalls == playerMatchesEventStatistics.pitchingBaseOnBalls && this.pitchingStrikeOuts == playerMatchesEventStatistics.pitchingStrikeOuts && this.pitchingHomeRuns == playerMatchesEventStatistics.pitchingHomeRuns && this.pitchingPitchesThrown == playerMatchesEventStatistics.pitchingPitchesThrown && this.pitchingStrikes == playerMatchesEventStatistics.pitchingStrikes && Double.compare(this.pitchingWhipToDate, playerMatchesEventStatistics.pitchingWhipToDate) == 0;
    }

    public final int getAces() {
        return this.aces;
    }

    public final int getAssists() {
        return this.assists;
    }

    public final int getAttackPoints() {
        return this.attackPoints;
    }

    public final int getBattingAtBats() {
        return this.battingAtBats;
    }

    public final double getBattingAverageToDate() {
        return this.battingAverageToDate;
    }

    public final int getBattingBaseOnBalls() {
        return this.battingBaseOnBalls;
    }

    public final int getBattingGamesPlayed() {
        return this.battingGamesPlayed;
    }

    public final int getBattingHits() {
        return this.battingHits;
    }

    public final int getBattingHomeRuns() {
        return this.battingHomeRuns;
    }

    public final double getBattingOnBasePercentageToDate() {
        return this.battingOnBasePercentageToDate;
    }

    public final double getBattingOpsToDate() {
        return this.battingOpsToDate;
    }

    public final int getBattingRbi() {
        return this.battingRbi;
    }

    public final int getBattingRuns() {
        return this.battingRuns;
    }

    public final double getBattingSluggingPercentageToDate() {
        return this.battingSluggingPercentageToDate;
    }

    public final int getBattingStrikeOuts() {
        return this.battingStrikeOuts;
    }

    public final int getBlockPoints() {
        return this.blockPoints;
    }

    public final int getBlocks() {
        return this.blocks;
    }

    public final int getPitchingBaseOnBalls() {
        return this.pitchingBaseOnBalls;
    }

    public final int getPitchingEarnedRuns() {
        return this.pitchingEarnedRuns;
    }

    public final double getPitchingEarnedRunsAverageToDate() {
        return this.pitchingEarnedRunsAverageToDate;
    }

    public final int getPitchingHitsAllowed() {
        return this.pitchingHitsAllowed;
    }

    public final int getPitchingHomeRuns() {
        return this.pitchingHomeRuns;
    }

    public final double getPitchingInningsPitched() {
        return this.pitchingInningsPitched;
    }

    public final int getPitchingPitchesThrown() {
        return this.pitchingPitchesThrown;
    }

    public final int getPitchingRuns() {
        return this.pitchingRuns;
    }

    public final int getPitchingStrikeOuts() {
        return this.pitchingStrikeOuts;
    }

    public final int getPitchingStrikes() {
        return this.pitchingStrikes;
    }

    public final double getPitchingWhipToDate() {
        return this.pitchingWhipToDate;
    }

    public final int getPoints() {
        return this.points;
    }

    public final int getPointsTotal() {
        return this.pointsTotal;
    }

    public final double getRating() {
        return this.rating;
    }

    public final int getRebounds() {
        return this.rebounds;
    }

    public final int getSteals() {
        return this.steals;
    }

    public int hashCode() {
        return Double.hashCode(this.pitchingWhipToDate) + wv8.a(this.pitchingStrikes, wv8.a(this.pitchingPitchesThrown, wv8.a(this.pitchingHomeRuns, wv8.a(this.pitchingStrikeOuts, wv8.a(this.pitchingBaseOnBalls, wv8.a(this.pitchingEarnedRuns, wv8.a(this.pitchingRuns, wv8.a(this.pitchingHitsAllowed, dmi.b(dmi.b(wv8.a(this.battingGamesPlayed, dmi.b(dmi.b(dmi.b(dmi.b(wv8.a(this.battingStrikeOuts, wv8.a(this.battingBaseOnBalls, wv8.a(this.battingHomeRuns, wv8.a(this.battingRbi, wv8.a(this.battingHits, wv8.a(this.battingRuns, wv8.a(this.battingAtBats, wv8.a(this.aces, wv8.a(this.blockPoints, wv8.a(this.attackPoints, wv8.a(this.pointsTotal, wv8.a(this.blocks, wv8.a(this.steals, wv8.a(this.assists, wv8.a(this.rebounds, wv8.a(this.points, Double.hashCode(this.rating) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.battingAverageToDate), 31, this.battingOnBasePercentageToDate), 31, this.battingSluggingPercentageToDate), 31, this.battingOpsToDate), 31), 31, this.pitchingInningsPitched), 31, this.pitchingEarnedRunsAverageToDate), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        double d = this.rating;
        int i = this.points;
        int i2 = this.rebounds;
        int i3 = this.assists;
        int i4 = this.steals;
        int i5 = this.blocks;
        int i6 = this.pointsTotal;
        int i7 = this.attackPoints;
        int i8 = this.blockPoints;
        int i9 = this.aces;
        int i10 = this.battingAtBats;
        int i11 = this.battingRuns;
        int i12 = this.battingHits;
        int i13 = this.battingRbi;
        int i14 = this.battingHomeRuns;
        int i15 = this.battingBaseOnBalls;
        int i16 = this.battingStrikeOuts;
        double d2 = this.battingAverageToDate;
        double d3 = this.battingOnBasePercentageToDate;
        double d4 = this.battingSluggingPercentageToDate;
        double d5 = this.battingOpsToDate;
        int i17 = this.battingGamesPlayed;
        double d6 = this.pitchingInningsPitched;
        double d7 = this.pitchingEarnedRunsAverageToDate;
        int i18 = this.pitchingHitsAllowed;
        int i19 = this.pitchingRuns;
        int i20 = this.pitchingEarnedRuns;
        int i21 = this.pitchingBaseOnBalls;
        int i22 = this.pitchingStrikeOuts;
        int i23 = this.pitchingHomeRuns;
        int i24 = this.pitchingPitchesThrown;
        int i25 = this.pitchingStrikes;
        double d8 = this.pitchingWhipToDate;
        StringBuilder sb = new StringBuilder("PlayerMatchesEventStatistics(rating=");
        sb.append(d);
        sb.append(", points=");
        sb.append(i);
        me4.r(sb, ", rebounds=", i2, ", assists=", i3);
        me4.r(sb, ", steals=", i4, ", blocks=", i5);
        me4.r(sb, ", pointsTotal=", i6, ", attackPoints=", i7);
        me4.r(sb, ", blockPoints=", i8, ", aces=", i9);
        me4.r(sb, ", battingAtBats=", i10, ", battingRuns=", i11);
        me4.r(sb, ", battingHits=", i12, ", battingRbi=", i13);
        me4.r(sb, ", battingHomeRuns=", i14, ", battingBaseOnBalls=", i15);
        wt3.u(i16, ", battingStrikeOuts=", ", battingAverageToDate=", sb);
        sb.append(d2);
        fn0.A(sb, ", battingOnBasePercentageToDate=", d3, ", battingSluggingPercentageToDate=");
        sb.append(d4);
        fn0.A(sb, ", battingOpsToDate=", d5, ", battingGamesPlayed=");
        sb.append(i17);
        sb.append(", pitchingInningsPitched=");
        sb.append(d6);
        fn0.A(sb, ", pitchingEarnedRunsAverageToDate=", d7, ", pitchingHitsAllowed=");
        me4.q(sb, i18, ", pitchingRuns=", i19, ", pitchingEarnedRuns=");
        me4.q(sb, i20, ", pitchingBaseOnBalls=", i21, ", pitchingStrikeOuts=");
        me4.q(sb, i22, ", pitchingHomeRuns=", i23, ", pitchingPitchesThrown=");
        me4.q(sb, i24, ", pitchingStrikes=", i25, ", pitchingWhipToDate=");
        sb.append(d8);
        sb.append(")");
        return sb.toString();
    }

    public PlayerMatchesEventStatistics(double d, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, double d2, double d3, double d4, double d5, int i17, double d6, double d7, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, double d8) {
        this.rating = d;
        this.points = i;
        this.rebounds = i2;
        this.assists = i3;
        this.steals = i4;
        this.blocks = i5;
        this.pointsTotal = i6;
        this.attackPoints = i7;
        this.blockPoints = i8;
        this.aces = i9;
        this.battingAtBats = i10;
        this.battingRuns = i11;
        this.battingHits = i12;
        this.battingRbi = i13;
        this.battingHomeRuns = i14;
        this.battingBaseOnBalls = i15;
        this.battingStrikeOuts = i16;
        this.battingAverageToDate = d2;
        this.battingOnBasePercentageToDate = d3;
        this.battingSluggingPercentageToDate = d4;
        this.battingOpsToDate = d5;
        this.battingGamesPlayed = i17;
        this.pitchingInningsPitched = d6;
        this.pitchingEarnedRunsAverageToDate = d7;
        this.pitchingHitsAllowed = i18;
        this.pitchingRuns = i19;
        this.pitchingEarnedRuns = i20;
        this.pitchingBaseOnBalls = i21;
        this.pitchingStrikeOuts = i22;
        this.pitchingHomeRuns = i23;
        this.pitchingPitchesThrown = i24;
        this.pitchingStrikes = i25;
        this.pitchingWhipToDate = d8;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/PlayerMatchesEventStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/PlayerMatchesEventStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerMatchesEventStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlayerMatchesEventStatistics(int i, int i2, double d, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, double d2, double d3, double d4, double d5, int i19, double d6, double d7, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, double d8, t5h t5hVar) {
        if ((i & 1) == 0) {
            this.rating = 0.0d;
        } else {
            this.rating = d;
        }
        if ((i & 2) == 0) {
            this.points = 0;
        } else {
            this.points = i3;
        }
        if ((i & 4) == 0) {
            this.rebounds = 0;
        } else {
            this.rebounds = i4;
        }
        if ((i & 8) == 0) {
            this.assists = 0;
        } else {
            this.assists = i5;
        }
        if ((i & 16) == 0) {
            this.steals = 0;
        } else {
            this.steals = i6;
        }
        if ((i & 32) == 0) {
            this.blocks = 0;
        } else {
            this.blocks = i7;
        }
        if ((i & 64) == 0) {
            this.pointsTotal = 0;
        } else {
            this.pointsTotal = i8;
        }
        if ((i & 128) == 0) {
            this.attackPoints = 0;
        } else {
            this.attackPoints = i9;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.blockPoints = 0;
        } else {
            this.blockPoints = i10;
        }
        if ((i & 512) == 0) {
            this.aces = 0;
        } else {
            this.aces = i11;
        }
        if ((i & 1024) == 0) {
            this.battingAtBats = 0;
        } else {
            this.battingAtBats = i12;
        }
        if ((i & a.o) == 0) {
            this.battingRuns = 0;
        } else {
            this.battingRuns = i13;
        }
        if ((i & 4096) == 0) {
            this.battingHits = 0;
        } else {
            this.battingHits = i14;
        }
        if ((i & 8192) == 0) {
            this.battingRbi = 0;
        } else {
            this.battingRbi = i15;
        }
        if ((i & 16384) == 0) {
            this.battingHomeRuns = 0;
        } else {
            this.battingHomeRuns = i16;
        }
        if ((32768 & i) == 0) {
            this.battingBaseOnBalls = 0;
        } else {
            this.battingBaseOnBalls = i17;
        }
        if ((65536 & i) == 0) {
            this.battingStrikeOuts = 0;
        } else {
            this.battingStrikeOuts = i18;
        }
        if ((131072 & i) == 0) {
            this.battingAverageToDate = 0.0d;
        } else {
            this.battingAverageToDate = d2;
        }
        if ((262144 & i) == 0) {
            this.battingOnBasePercentageToDate = 0.0d;
        } else {
            this.battingOnBasePercentageToDate = d3;
        }
        if ((524288 & i) == 0) {
            this.battingSluggingPercentageToDate = 0.0d;
        } else {
            this.battingSluggingPercentageToDate = d4;
        }
        if ((1048576 & i) == 0) {
            this.battingOpsToDate = 0.0d;
        } else {
            this.battingOpsToDate = d5;
        }
        if ((2097152 & i) == 0) {
            this.battingGamesPlayed = 0;
        } else {
            this.battingGamesPlayed = i19;
        }
        if ((4194304 & i) == 0) {
            this.pitchingInningsPitched = 0.0d;
        } else {
            this.pitchingInningsPitched = d6;
        }
        if ((8388608 & i) == 0) {
            this.pitchingEarnedRunsAverageToDate = 0.0d;
        } else {
            this.pitchingEarnedRunsAverageToDate = d7;
        }
        if ((16777216 & i) == 0) {
            this.pitchingHitsAllowed = 0;
        } else {
            this.pitchingHitsAllowed = i20;
        }
        if ((33554432 & i) == 0) {
            this.pitchingRuns = 0;
        } else {
            this.pitchingRuns = i21;
        }
        if ((67108864 & i) == 0) {
            this.pitchingEarnedRuns = 0;
        } else {
            this.pitchingEarnedRuns = i22;
        }
        if ((134217728 & i) == 0) {
            this.pitchingBaseOnBalls = 0;
        } else {
            this.pitchingBaseOnBalls = i23;
        }
        if ((268435456 & i) == 0) {
            this.pitchingStrikeOuts = 0;
        } else {
            this.pitchingStrikeOuts = i24;
        }
        if ((536870912 & i) == 0) {
            this.pitchingHomeRuns = 0;
        } else {
            this.pitchingHomeRuns = i25;
        }
        if ((1073741824 & i) == 0) {
            this.pitchingPitchesThrown = 0;
        } else {
            this.pitchingPitchesThrown = i26;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.pitchingStrikes = 0;
        } else {
            this.pitchingStrikes = i27;
        }
        if ((i2 & 1) == 0) {
            this.pitchingWhipToDate = 0.0d;
        } else {
            this.pitchingWhipToDate = d8;
        }
    }

    public PlayerMatchesEventStatistics() {
        this(0.0d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0.0d, 0.0d, 0, 0, 0, 0, 0, 0, 0, 0, 0.0d, -1, 1, (DefaultConstructorMarker) null);
    }
}
