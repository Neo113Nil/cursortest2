package com.sofascore.model.network.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.h75;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 w2\u00020\u0001:\u0002xwB\u009f\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!B³\u0002\b\u0010\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010'J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010'J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010'J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010'J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010'J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010'J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010'J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010'J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010'J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010'J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010'J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010'J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010'J\u0012\u0010;\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010'J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010'J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010'J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010'J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010'J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010'J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010'Jà\u0002\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010G\u001a\u00020FHÖ\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bI\u0010JJ\u001a\u0010N\u001a\u00020M2\b\u0010L\u001a\u0004\u0018\u00010KHÖ\u0003¢\u0006\u0004\bN\u0010OJ'\u0010X\u001a\u00020U2\u0006\u0010P\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SH\u0001¢\u0006\u0004\bV\u0010WR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Y\u001a\u0004\bZ\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010Y\u001a\u0004\b[\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010Y\u001a\u0004\b\\\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010Y\u001a\u0004\b]\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010Y\u001a\u0004\b^\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010Y\u001a\u0004\b_\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010Y\u001a\u0004\b`\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010Y\u001a\u0004\ba\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010Y\u001a\u0004\bb\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010Y\u001a\u0004\bc\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010Y\u001a\u0004\bd\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010Y\u001a\u0004\be\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010Y\u001a\u0004\bf\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010Y\u001a\u0004\bg\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010Y\u001a\u0004\bh\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010Y\u001a\u0004\bi\u0010'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\bj\u0010'R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010Y\u001a\u0004\bk\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010Y\u001a\u0004\bl\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bm\u0010'R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010n\u001a\u0004\bo\u0010<R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010Y\u001a\u0004\bp\u0010'R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010Y\u001a\u0004\bq\u0010'R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010Y\u001a\u0004\br\u0010'R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010Y\u001a\u0004\bs\u0010'R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010Y\u001a\u0004\bt\u0010'R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010Y\u001a\u0004\bu\u0010'R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010Y\u001a\u0004\bv\u0010'¨\u0006y"}, d2 = {"Lcom/sofascore/model/network/response/IceHockeyPlayerEventStatistics;", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "", "secondsPlayed", "goals", "assists", "points", "shots", "shotsMissed", "blockedAttempts", "powerPlayGoals", "powerPlayAssists", "shortHandedGoals", "shortHandedAssists", "hits", "takeaways", "blocked", "penaltyMinutes", "faceOffTaken", "faceOffWins", "giveaways", "plusMinus", "saves", "", "savePercentage", "shotsAgainst", "shortHandedSaves", "shortHandedShotsAgainst", "powerPlaySaves", "powerPlayShotsAgainst", "evenSaves", "evenShotsAgainst", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "()Ljava/lang/Double;", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/network/response/IceHockeyPlayerEventStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/IceHockeyPlayerEventStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getSecondsPlayed", "getGoals", "getAssists", "getPoints", "getShots", "getShotsMissed", "getBlockedAttempts", "getPowerPlayGoals", "getPowerPlayAssists", "getShortHandedGoals", "getShortHandedAssists", "getHits", "getTakeaways", "getBlocked", "getPenaltyMinutes", "getFaceOffTaken", "getFaceOffWins", "getGiveaways", "getPlusMinus", "getSaves", "Ljava/lang/Double;", "getSavePercentage", "getShotsAgainst", "getShortHandedSaves", "getShortHandedShotsAgainst", "getPowerPlaySaves", "getPowerPlayShotsAgainst", "getEvenSaves", "getEvenShotsAgainst", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class IceHockeyPlayerEventStatistics implements PlayerEventStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer blocked;

    @Nullable
    private final Integer blockedAttempts;

    @Nullable
    private final Integer evenSaves;

    @Nullable
    private final Integer evenShotsAgainst;

    @Nullable
    private final Integer faceOffTaken;

    @Nullable
    private final Integer faceOffWins;

    @Nullable
    private final Integer giveaways;

    @Nullable
    private final Integer goals;

    @Nullable
    private final Integer hits;

    @Nullable
    private final Integer penaltyMinutes;

    @Nullable
    private final Integer plusMinus;

    @Nullable
    private final Integer points;

    @Nullable
    private final Integer powerPlayAssists;

    @Nullable
    private final Integer powerPlayGoals;

    @Nullable
    private final Integer powerPlaySaves;

    @Nullable
    private final Integer powerPlayShotsAgainst;

    @Nullable
    private final Double savePercentage;

    @Nullable
    private final Integer saves;

    @Nullable
    private final Integer secondsPlayed;

    @Nullable
    private final Integer shortHandedAssists;

    @Nullable
    private final Integer shortHandedGoals;

    @Nullable
    private final Integer shortHandedSaves;

    @Nullable
    private final Integer shortHandedShotsAgainst;

    @Nullable
    private final Integer shots;

    @Nullable
    private final Integer shotsAgainst;

    @Nullable
    private final Integer shotsMissed;

    @Nullable
    private final Integer takeaways;

    public /* synthetic */ IceHockeyPlayerEventStatistics(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Double d, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, t5h t5hVar) {
        if (268435455 != (i & 268435455)) {
            oea.z(i, 268435455, IceHockeyPlayerEventStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.secondsPlayed = num;
        this.goals = num2;
        this.assists = num3;
        this.points = num4;
        this.shots = num5;
        this.shotsMissed = num6;
        this.blockedAttempts = num7;
        this.powerPlayGoals = num8;
        this.powerPlayAssists = num9;
        this.shortHandedGoals = num10;
        this.shortHandedAssists = num11;
        this.hits = num12;
        this.takeaways = num13;
        this.blocked = num14;
        this.penaltyMinutes = num15;
        this.faceOffTaken = num16;
        this.faceOffWins = num17;
        this.giveaways = num18;
        this.plusMinus = num19;
        this.saves = num20;
        this.savePercentage = d;
        this.shotsAgainst = num21;
        this.shortHandedSaves = num22;
        this.shortHandedShotsAgainst = num23;
        this.powerPlaySaves = num24;
        this.powerPlayShotsAgainst = num25;
        this.evenSaves = num26;
        this.evenShotsAgainst = num27;
    }

    public static /* synthetic */ IceHockeyPlayerEventStatistics copy$default(IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Double d, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, int i, Object obj) {
        Integer num28;
        Integer num29;
        Integer num30 = (i & 1) != 0 ? iceHockeyPlayerEventStatistics.secondsPlayed : num;
        Integer num31 = (i & 2) != 0 ? iceHockeyPlayerEventStatistics.goals : num2;
        Integer num32 = (i & 4) != 0 ? iceHockeyPlayerEventStatistics.assists : num3;
        Integer num33 = (i & 8) != 0 ? iceHockeyPlayerEventStatistics.points : num4;
        Integer num34 = (i & 16) != 0 ? iceHockeyPlayerEventStatistics.shots : num5;
        Integer num35 = (i & 32) != 0 ? iceHockeyPlayerEventStatistics.shotsMissed : num6;
        Integer num36 = (i & 64) != 0 ? iceHockeyPlayerEventStatistics.blockedAttempts : num7;
        Integer num37 = (i & 128) != 0 ? iceHockeyPlayerEventStatistics.powerPlayGoals : num8;
        Integer num38 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? iceHockeyPlayerEventStatistics.powerPlayAssists : num9;
        Integer num39 = (i & 512) != 0 ? iceHockeyPlayerEventStatistics.shortHandedGoals : num10;
        Integer num40 = (i & 1024) != 0 ? iceHockeyPlayerEventStatistics.shortHandedAssists : num11;
        Integer num41 = (i & a.o) != 0 ? iceHockeyPlayerEventStatistics.hits : num12;
        Integer num42 = (i & 4096) != 0 ? iceHockeyPlayerEventStatistics.takeaways : num13;
        Integer num43 = (i & 8192) != 0 ? iceHockeyPlayerEventStatistics.blocked : num14;
        Integer num44 = num30;
        Integer num45 = (i & 16384) != 0 ? iceHockeyPlayerEventStatistics.penaltyMinutes : num15;
        Integer num46 = (i & 32768) != 0 ? iceHockeyPlayerEventStatistics.faceOffTaken : num16;
        Integer num47 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? iceHockeyPlayerEventStatistics.faceOffWins : num17;
        Integer num48 = (i & 131072) != 0 ? iceHockeyPlayerEventStatistics.giveaways : num18;
        Integer num49 = (i & 262144) != 0 ? iceHockeyPlayerEventStatistics.plusMinus : num19;
        Integer num50 = (i & 524288) != 0 ? iceHockeyPlayerEventStatistics.saves : num20;
        Double d2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? iceHockeyPlayerEventStatistics.savePercentage : d;
        Integer num51 = (i & 2097152) != 0 ? iceHockeyPlayerEventStatistics.shotsAgainst : num21;
        Integer num52 = (i & 4194304) != 0 ? iceHockeyPlayerEventStatistics.shortHandedSaves : num22;
        Integer num53 = (i & 8388608) != 0 ? iceHockeyPlayerEventStatistics.shortHandedShotsAgainst : num23;
        Integer num54 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? iceHockeyPlayerEventStatistics.powerPlaySaves : num24;
        Integer num55 = (i & 33554432) != 0 ? iceHockeyPlayerEventStatistics.powerPlayShotsAgainst : num25;
        Integer num56 = (i & 67108864) != 0 ? iceHockeyPlayerEventStatistics.evenSaves : num26;
        if ((i & 134217728) != 0) {
            num29 = num56;
            num28 = iceHockeyPlayerEventStatistics.evenShotsAgainst;
        } else {
            num28 = num27;
            num29 = num56;
        }
        return iceHockeyPlayerEventStatistics.copy(num44, num31, num32, num33, num34, num35, num36, num37, num38, num39, num40, num41, num42, num43, num45, num46, num47, num48, num49, num50, d2, num51, num52, num53, num54, num55, num29, num28);
    }

    public static final /* synthetic */ void write$Self$model_release(IceHockeyPlayerEventStatistics self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.secondsPlayed);
        output.h(serialDesc, 1, a7aVar, self.goals);
        output.h(serialDesc, 2, a7aVar, self.assists);
        output.h(serialDesc, 3, a7aVar, self.points);
        output.h(serialDesc, 4, a7aVar, self.shots);
        output.h(serialDesc, 5, a7aVar, self.shotsMissed);
        output.h(serialDesc, 6, a7aVar, self.blockedAttempts);
        output.h(serialDesc, 7, a7aVar, self.powerPlayGoals);
        output.h(serialDesc, 8, a7aVar, self.powerPlayAssists);
        output.h(serialDesc, 9, a7aVar, self.shortHandedGoals);
        output.h(serialDesc, 10, a7aVar, self.shortHandedAssists);
        output.h(serialDesc, 11, a7aVar, self.hits);
        output.h(serialDesc, 12, a7aVar, self.takeaways);
        output.h(serialDesc, 13, a7aVar, self.blocked);
        output.h(serialDesc, 14, a7aVar, self.penaltyMinutes);
        output.h(serialDesc, 15, a7aVar, self.faceOffTaken);
        output.h(serialDesc, 16, a7aVar, self.faceOffWins);
        output.h(serialDesc, 17, a7aVar, self.giveaways);
        output.h(serialDesc, 18, a7aVar, self.plusMinus);
        output.h(serialDesc, 19, a7aVar, self.saves);
        output.h(serialDesc, 20, h75.a, self.savePercentage);
        output.h(serialDesc, 21, a7aVar, self.shotsAgainst);
        output.h(serialDesc, 22, a7aVar, self.shortHandedSaves);
        output.h(serialDesc, 23, a7aVar, self.shortHandedShotsAgainst);
        output.h(serialDesc, 24, a7aVar, self.powerPlaySaves);
        output.h(serialDesc, 25, a7aVar, self.powerPlayShotsAgainst);
        output.h(serialDesc, 26, a7aVar, self.evenSaves);
        output.h(serialDesc, 27, a7aVar, self.evenShotsAgainst);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getSecondsPlayed() {
        return this.secondsPlayed;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getShortHandedGoals() {
        return this.shortHandedGoals;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getShortHandedAssists() {
        return this.shortHandedAssists;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getHits() {
        return this.hits;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getTakeaways() {
        return this.takeaways;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getBlocked() {
        return this.blocked;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getPenaltyMinutes() {
        return this.penaltyMinutes;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getFaceOffTaken() {
        return this.faceOffTaken;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getFaceOffWins() {
        return this.faceOffWins;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getGiveaways() {
        return this.giveaways;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getSaves() {
        return this.saves;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Double getSavePercentage() {
        return this.savePercentage;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getShotsAgainst() {
        return this.shotsAgainst;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getShortHandedSaves() {
        return this.shortHandedSaves;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getShortHandedShotsAgainst() {
        return this.shortHandedShotsAgainst;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getPowerPlaySaves() {
        return this.powerPlaySaves;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getPowerPlayShotsAgainst() {
        return this.powerPlayShotsAgainst;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getEvenSaves() {
        return this.evenSaves;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getEvenShotsAgainst() {
        return this.evenShotsAgainst;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getShots() {
        return this.shots;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getShotsMissed() {
        return this.shotsMissed;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getBlockedAttempts() {
        return this.blockedAttempts;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getPowerPlayGoals() {
        return this.powerPlayGoals;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getPowerPlayAssists() {
        return this.powerPlayAssists;
    }

    @NotNull
    public final IceHockeyPlayerEventStatistics copy(@Nullable Integer secondsPlayed, @Nullable Integer goals, @Nullable Integer assists, @Nullable Integer points, @Nullable Integer shots, @Nullable Integer shotsMissed, @Nullable Integer blockedAttempts, @Nullable Integer powerPlayGoals, @Nullable Integer powerPlayAssists, @Nullable Integer shortHandedGoals, @Nullable Integer shortHandedAssists, @Nullable Integer hits, @Nullable Integer takeaways, @Nullable Integer blocked, @Nullable Integer penaltyMinutes, @Nullable Integer faceOffTaken, @Nullable Integer faceOffWins, @Nullable Integer giveaways, @Nullable Integer plusMinus, @Nullable Integer saves, @Nullable Double savePercentage, @Nullable Integer shotsAgainst, @Nullable Integer shortHandedSaves, @Nullable Integer shortHandedShotsAgainst, @Nullable Integer powerPlaySaves, @Nullable Integer powerPlayShotsAgainst, @Nullable Integer evenSaves, @Nullable Integer evenShotsAgainst) {
        return new IceHockeyPlayerEventStatistics(secondsPlayed, goals, assists, points, shots, shotsMissed, blockedAttempts, powerPlayGoals, powerPlayAssists, shortHandedGoals, shortHandedAssists, hits, takeaways, blocked, penaltyMinutes, faceOffTaken, faceOffWins, giveaways, plusMinus, saves, savePercentage, shotsAgainst, shortHandedSaves, shortHandedShotsAgainst, powerPlaySaves, powerPlayShotsAgainst, evenSaves, evenShotsAgainst);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IceHockeyPlayerEventStatistics)) {
            return false;
        }
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) other;
        return Intrinsics.c(this.secondsPlayed, iceHockeyPlayerEventStatistics.secondsPlayed) && Intrinsics.c(this.goals, iceHockeyPlayerEventStatistics.goals) && Intrinsics.c(this.assists, iceHockeyPlayerEventStatistics.assists) && Intrinsics.c(this.points, iceHockeyPlayerEventStatistics.points) && Intrinsics.c(this.shots, iceHockeyPlayerEventStatistics.shots) && Intrinsics.c(this.shotsMissed, iceHockeyPlayerEventStatistics.shotsMissed) && Intrinsics.c(this.blockedAttempts, iceHockeyPlayerEventStatistics.blockedAttempts) && Intrinsics.c(this.powerPlayGoals, iceHockeyPlayerEventStatistics.powerPlayGoals) && Intrinsics.c(this.powerPlayAssists, iceHockeyPlayerEventStatistics.powerPlayAssists) && Intrinsics.c(this.shortHandedGoals, iceHockeyPlayerEventStatistics.shortHandedGoals) && Intrinsics.c(this.shortHandedAssists, iceHockeyPlayerEventStatistics.shortHandedAssists) && Intrinsics.c(this.hits, iceHockeyPlayerEventStatistics.hits) && Intrinsics.c(this.takeaways, iceHockeyPlayerEventStatistics.takeaways) && Intrinsics.c(this.blocked, iceHockeyPlayerEventStatistics.blocked) && Intrinsics.c(this.penaltyMinutes, iceHockeyPlayerEventStatistics.penaltyMinutes) && Intrinsics.c(this.faceOffTaken, iceHockeyPlayerEventStatistics.faceOffTaken) && Intrinsics.c(this.faceOffWins, iceHockeyPlayerEventStatistics.faceOffWins) && Intrinsics.c(this.giveaways, iceHockeyPlayerEventStatistics.giveaways) && Intrinsics.c(this.plusMinus, iceHockeyPlayerEventStatistics.plusMinus) && Intrinsics.c(this.saves, iceHockeyPlayerEventStatistics.saves) && Intrinsics.c(this.savePercentage, iceHockeyPlayerEventStatistics.savePercentage) && Intrinsics.c(this.shotsAgainst, iceHockeyPlayerEventStatistics.shotsAgainst) && Intrinsics.c(this.shortHandedSaves, iceHockeyPlayerEventStatistics.shortHandedSaves) && Intrinsics.c(this.shortHandedShotsAgainst, iceHockeyPlayerEventStatistics.shortHandedShotsAgainst) && Intrinsics.c(this.powerPlaySaves, iceHockeyPlayerEventStatistics.powerPlaySaves) && Intrinsics.c(this.powerPlayShotsAgainst, iceHockeyPlayerEventStatistics.powerPlayShotsAgainst) && Intrinsics.c(this.evenSaves, iceHockeyPlayerEventStatistics.evenSaves) && Intrinsics.c(this.evenShotsAgainst, iceHockeyPlayerEventStatistics.evenShotsAgainst);
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final Integer getBlocked() {
        return this.blocked;
    }

    @Nullable
    public final Integer getBlockedAttempts() {
        return this.blockedAttempts;
    }

    @Nullable
    public final Integer getEvenSaves() {
        return this.evenSaves;
    }

    @Nullable
    public final Integer getEvenShotsAgainst() {
        return this.evenShotsAgainst;
    }

    @Nullable
    public final Integer getFaceOffTaken() {
        return this.faceOffTaken;
    }

    @Nullable
    public final Integer getFaceOffWins() {
        return this.faceOffWins;
    }

    @Nullable
    public final Integer getGiveaways() {
        return this.giveaways;
    }

    @Nullable
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    public final Integer getHits() {
        return this.hits;
    }

    @Nullable
    public final Integer getPenaltyMinutes() {
        return this.penaltyMinutes;
    }

    @Nullable
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPowerPlayAssists() {
        return this.powerPlayAssists;
    }

    @Nullable
    public final Integer getPowerPlayGoals() {
        return this.powerPlayGoals;
    }

    @Nullable
    public final Integer getPowerPlaySaves() {
        return this.powerPlaySaves;
    }

    @Nullable
    public final Integer getPowerPlayShotsAgainst() {
        return this.powerPlayShotsAgainst;
    }

    @Override // com.sofascore.model.network.response.PlayerEventStatistics
    @Nullable
    public /* bridge */ Double getRating() {
        return super.getRating();
    }

    @Nullable
    public final Double getSavePercentage() {
        return this.savePercentage;
    }

    @Nullable
    public final Integer getSaves() {
        return this.saves;
    }

    @Nullable
    public final Integer getSecondsPlayed() {
        return this.secondsPlayed;
    }

    @Nullable
    public final Integer getShortHandedAssists() {
        return this.shortHandedAssists;
    }

    @Nullable
    public final Integer getShortHandedGoals() {
        return this.shortHandedGoals;
    }

    @Nullable
    public final Integer getShortHandedSaves() {
        return this.shortHandedSaves;
    }

    @Nullable
    public final Integer getShortHandedShotsAgainst() {
        return this.shortHandedShotsAgainst;
    }

    @Nullable
    public final Integer getShots() {
        return this.shots;
    }

    @Nullable
    public final Integer getShotsAgainst() {
        return this.shotsAgainst;
    }

    @Nullable
    public final Integer getShotsMissed() {
        return this.shotsMissed;
    }

    @Nullable
    public final Integer getTakeaways() {
        return this.takeaways;
    }

    public int hashCode() {
        Integer num = this.secondsPlayed;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.goals;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.assists;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.points;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.shots;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.shotsMissed;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.blockedAttempts;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.powerPlayGoals;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.powerPlayAssists;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.shortHandedGoals;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.shortHandedAssists;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.hits;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.takeaways;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.blocked;
        int hashCode14 = (hashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.penaltyMinutes;
        int hashCode15 = (hashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.faceOffTaken;
        int hashCode16 = (hashCode15 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.faceOffWins;
        int hashCode17 = (hashCode16 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.giveaways;
        int hashCode18 = (hashCode17 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.plusMinus;
        int hashCode19 = (hashCode18 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.saves;
        int hashCode20 = (hashCode19 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Double d = this.savePercentage;
        int hashCode21 = (hashCode20 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num21 = this.shotsAgainst;
        int hashCode22 = (hashCode21 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.shortHandedSaves;
        int hashCode23 = (hashCode22 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.shortHandedShotsAgainst;
        int hashCode24 = (hashCode23 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.powerPlaySaves;
        int hashCode25 = (hashCode24 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.powerPlayShotsAgainst;
        int hashCode26 = (hashCode25 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.evenSaves;
        int hashCode27 = (hashCode26 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.evenShotsAgainst;
        return hashCode27 + (num27 != null ? num27.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.secondsPlayed;
        Integer num2 = this.goals;
        Integer num3 = this.assists;
        Integer num4 = this.points;
        Integer num5 = this.shots;
        Integer num6 = this.shotsMissed;
        Integer num7 = this.blockedAttempts;
        Integer num8 = this.powerPlayGoals;
        Integer num9 = this.powerPlayAssists;
        Integer num10 = this.shortHandedGoals;
        Integer num11 = this.shortHandedAssists;
        Integer num12 = this.hits;
        Integer num13 = this.takeaways;
        Integer num14 = this.blocked;
        Integer num15 = this.penaltyMinutes;
        Integer num16 = this.faceOffTaken;
        Integer num17 = this.faceOffWins;
        Integer num18 = this.giveaways;
        Integer num19 = this.plusMinus;
        Integer num20 = this.saves;
        Double d = this.savePercentage;
        Integer num21 = this.shotsAgainst;
        Integer num22 = this.shortHandedSaves;
        Integer num23 = this.shortHandedShotsAgainst;
        Integer num24 = this.powerPlaySaves;
        Integer num25 = this.powerPlayShotsAgainst;
        Integer num26 = this.evenSaves;
        Integer num27 = this.evenShotsAgainst;
        StringBuilder k = wv8.k(num, "IceHockeyPlayerEventStatistics(secondsPlayed=", ", goals=", ", assists=", num2);
        vxd.r(num3, num4, ", points=", ", shots=", k);
        vxd.r(num5, num6, ", shotsMissed=", ", blockedAttempts=", k);
        vxd.r(num7, num8, ", powerPlayGoals=", ", powerPlayAssists=", k);
        vxd.r(num9, num10, ", shortHandedGoals=", ", shortHandedAssists=", k);
        vxd.r(num11, num12, ", hits=", ", takeaways=", k);
        vxd.r(num13, num14, ", blocked=", ", penaltyMinutes=", k);
        vxd.r(num15, num16, ", faceOffTaken=", ", faceOffWins=", k);
        vxd.r(num17, num18, ", giveaways=", ", plusMinus=", k);
        vxd.r(num19, num20, ", saves=", ", savePercentage=", k);
        mz1.x(d, num21, ", shotsAgainst=", ", shortHandedSaves=", k);
        vxd.r(num22, num23, ", shortHandedShotsAgainst=", ", powerPlaySaves=", k);
        vxd.r(num24, num25, ", powerPlayShotsAgainst=", ", evenSaves=", k);
        return fc6.l(num26, num27, ", evenShotsAgainst=", ")", k);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/IceHockeyPlayerEventStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/IceHockeyPlayerEventStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return IceHockeyPlayerEventStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public IceHockeyPlayerEventStatistics(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Double d, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24, @Nullable Integer num25, @Nullable Integer num26, @Nullable Integer num27) {
        this.secondsPlayed = num;
        this.goals = num2;
        this.assists = num3;
        this.points = num4;
        this.shots = num5;
        this.shotsMissed = num6;
        this.blockedAttempts = num7;
        this.powerPlayGoals = num8;
        this.powerPlayAssists = num9;
        this.shortHandedGoals = num10;
        this.shortHandedAssists = num11;
        this.hits = num12;
        this.takeaways = num13;
        this.blocked = num14;
        this.penaltyMinutes = num15;
        this.faceOffTaken = num16;
        this.faceOffWins = num17;
        this.giveaways = num18;
        this.plusMinus = num19;
        this.saves = num20;
        this.savePercentage = d;
        this.shotsAgainst = num21;
        this.shortHandedSaves = num22;
        this.shortHandedShotsAgainst = num23;
        this.powerPlaySaves = num24;
        this.powerPlayShotsAgainst = num25;
        this.evenSaves = num26;
        this.evenShotsAgainst = num27;
    }
}
