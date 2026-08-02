package com.sofascore.model.newNetwork.topperformance.topTeams.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.lnb;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b,\b\u0087\b\u0018\u0000 \u008e\u00012\u00020\u0001:\u0004\u008f\u0001\u008e\u0001Bë\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(B\u0087\u0003\b\u0010\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b'\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u00102J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u00102J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00102J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u00102J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u00102J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00102J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u00102J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u00102J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u00102J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u00102J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u00102J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u00102J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u00102J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u00102J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00102J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u00102J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u00102J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u00102J\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u00102J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00102J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u00102J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u00102J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u00102J\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u00102J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u00102J\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u00102J\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u00102J\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u00102J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u00102J\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u00102J\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u00102J¼\u0003\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bT\u0010UJ\u0010\u0010W\u001a\u00020VHÖ\u0001¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bY\u0010/J\u001a\u0010]\u001a\u00020\\2\b\u0010[\u001a\u0004\u0018\u00010ZHÖ\u0003¢\u0006\u0004\b]\u0010^J'\u0010g\u001a\u00020d2\u0006\u0010_\u001a\u00020\u00002\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020bH\u0001¢\u0006\u0004\be\u0010fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010h\u001a\u0004\bi\u0010/R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010h\u001a\u0004\bj\u0010/R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010k\u001a\u0004\bl\u00102R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010k\u001a\u0004\bm\u00102R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010k\u001a\u0004\bn\u00102R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010k\u001a\u0004\bo\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010k\u001a\u0004\bp\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010k\u001a\u0004\bq\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010k\u001a\u0004\br\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010k\u001a\u0004\bs\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010k\u001a\u0004\bt\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010k\u001a\u0004\bu\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010k\u001a\u0004\bv\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010k\u001a\u0004\bw\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010k\u001a\u0004\bx\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010k\u001a\u0004\by\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010k\u001a\u0004\bz\u00102R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010k\u001a\u0004\b{\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010k\u001a\u0004\b|\u00102R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010k\u001a\u0004\b}\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010k\u001a\u0004\b~\u00102R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010k\u001a\u0004\b\u007f\u00102R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0019\u0010k\u001a\u0005\b\u0080\u0001\u00102R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001a\u0010k\u001a\u0005\b\u0081\u0001\u00102R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001b\u0010k\u001a\u0005\b\u0082\u0001\u00102R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001c\u0010k\u001a\u0005\b\u0083\u0001\u00102R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001d\u0010k\u001a\u0005\b\u0084\u0001\u00102R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001e\u0010k\u001a\u0005\b\u0085\u0001\u00102R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001f\u0010k\u001a\u0005\b\u0086\u0001\u00102R\u001a\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b \u0010k\u001a\u0005\b\u0087\u0001\u00102R\u001a\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b!\u0010k\u001a\u0005\b\u0088\u0001\u00102R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\"\u0010k\u001a\u0005\b\u0089\u0001\u00102R\u001a\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b#\u0010k\u001a\u0005\b\u008a\u0001\u00102R\u001a\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b$\u0010k\u001a\u0005\b\u008b\u0001\u00102R\u001a\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b%\u0010k\u001a\u0005\b\u008c\u0001\u00102R\u001a\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b&\u0010k\u001a\u0005\b\u008d\u0001\u00102¨\u0006\u0090\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/RugbyTopTeamsStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BaseTopTeamsStatisticsItem;", "", "id", "matches", "points", "tries", "carries", "penaltyTries", "penaltyGoals", "conversions", "dropGoals", "scrumsWon", "lineoutsWon", "passesSuccessful", "offloads", "cleanBreaks", "defendersBeaten", "metresMade", "handlingError", "carriesCrossedGainLine", "carriesNotMadeGainLine", "postContactMetres", "tackles", "dominantTackles", "penDefs", "penOffs", "kickMetres", "kickFromHand", "rucksWon", "ruckArrival", "ruckArrivalAttack", "ruckArrivalDefence", "ruckSpeed03", "ruckSpeed36", "ruckSpeed6Plus", "yellowCards", "redCards", "penaltyGoalsConceded", "<init>", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "copy", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/RugbyTopTeamsStatisticsItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/RugbyTopTeamsStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "getMatches", "Ljava/lang/Integer;", "getPoints", "getTries", "getCarries", "getPenaltyTries", "getPenaltyGoals", "getConversions", "getDropGoals", "getScrumsWon", "getLineoutsWon", "getPassesSuccessful", "getOffloads", "getCleanBreaks", "getDefendersBeaten", "getMetresMade", "getHandlingError", "getCarriesCrossedGainLine", "getCarriesNotMadeGainLine", "getPostContactMetres", "getTackles", "getDominantTackles", "getPenDefs", "getPenOffs", "getKickMetres", "getKickFromHand", "getRucksWon", "getRuckArrival", "getRuckArrivalAttack", "getRuckArrivalDefence", "getRuckSpeed03", "getRuckSpeed36", "getRuckSpeed6Plus", "getYellowCards", "getRedCards", "getPenaltyGoalsConceded", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RugbyTopTeamsStatisticsItem extends BaseTopTeamsStatisticsItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer carries;

    @Nullable
    private final Integer carriesCrossedGainLine;

    @Nullable
    private final Integer carriesNotMadeGainLine;

    @Nullable
    private final Integer cleanBreaks;

    @Nullable
    private final Integer conversions;

    @Nullable
    private final Integer defendersBeaten;

    @Nullable
    private final Integer dominantTackles;

    @Nullable
    private final Integer dropGoals;

    @Nullable
    private final Integer handlingError;
    private final int id;

    @Nullable
    private final Integer kickFromHand;

    @Nullable
    private final Integer kickMetres;

    @Nullable
    private final Integer lineoutsWon;
    private final int matches;

    @Nullable
    private final Integer metresMade;

    @Nullable
    private final Integer offloads;

    @Nullable
    private final Integer passesSuccessful;

    @Nullable
    private final Integer penDefs;

    @Nullable
    private final Integer penOffs;

    @Nullable
    private final Integer penaltyGoals;

    @Nullable
    private final Integer penaltyGoalsConceded;

    @Nullable
    private final Integer penaltyTries;

    @Nullable
    private final Integer points;

    @Nullable
    private final Integer postContactMetres;

    @Nullable
    private final Integer redCards;

    @Nullable
    private final Integer ruckArrival;

    @Nullable
    private final Integer ruckArrivalAttack;

    @Nullable
    private final Integer ruckArrivalDefence;

    @Nullable
    private final Integer ruckSpeed03;

    @Nullable
    private final Integer ruckSpeed36;

    @Nullable
    private final Integer ruckSpeed6Plus;

    @Nullable
    private final Integer rucksWon;

    @Nullable
    private final Integer scrumsWon;

    @Nullable
    private final Integer tackles;

    @Nullable
    private final Integer tries;

    @Nullable
    private final Integer yellowCards;

    public /* synthetic */ RugbyTopTeamsStatisticsItem(int i, int i2, int i3, int i4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, t5h t5hVar) {
        if ((15 != (i2 & 15)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, 15}, RugbyTopTeamsStatisticsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.matches = i4;
        this.points = num;
        this.tries = num2;
        this.carries = num3;
        this.penaltyTries = num4;
        this.penaltyGoals = num5;
        this.conversions = num6;
        this.dropGoals = num7;
        this.scrumsWon = num8;
        this.lineoutsWon = num9;
        this.passesSuccessful = num10;
        this.offloads = num11;
        this.cleanBreaks = num12;
        this.defendersBeaten = num13;
        this.metresMade = num14;
        this.handlingError = num15;
        this.carriesCrossedGainLine = num16;
        this.carriesNotMadeGainLine = num17;
        this.postContactMetres = num18;
        this.tackles = num19;
        this.dominantTackles = num20;
        this.penDefs = num21;
        this.penOffs = num22;
        this.kickMetres = num23;
        this.kickFromHand = num24;
        this.rucksWon = num25;
        this.ruckArrival = num26;
        this.ruckArrivalAttack = num27;
        this.ruckArrivalDefence = num28;
        this.ruckSpeed03 = num29;
        this.ruckSpeed36 = num30;
        this.ruckSpeed6Plus = num31;
        this.yellowCards = num32;
        this.redCards = num33;
        this.penaltyGoalsConceded = num34;
    }

    public static /* synthetic */ RugbyTopTeamsStatisticsItem copy$default(RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, int i3, int i4, Object obj) {
        Integer num35;
        Integer num36;
        Integer num37;
        Integer num38;
        Integer num39;
        Integer num40;
        Integer num41;
        Integer num42;
        Integer num43;
        Integer num44;
        Integer num45;
        Integer num46;
        Integer num47;
        Integer num48;
        Integer num49;
        Integer num50;
        Integer num51;
        Integer num52;
        Integer num53;
        Integer num54;
        Integer num55;
        Integer num56;
        Integer num57;
        Integer num58;
        Integer num59;
        Integer num60;
        Integer num61;
        Integer num62;
        Integer num63;
        Integer num64;
        Integer num65;
        Integer num66;
        int i5;
        Integer num67;
        Integer num68;
        int i6 = (i3 & 1) != 0 ? rugbyTopTeamsStatisticsItem.id : i;
        int i7 = (i3 & 2) != 0 ? rugbyTopTeamsStatisticsItem.matches : i2;
        Integer num69 = (i3 & 4) != 0 ? rugbyTopTeamsStatisticsItem.points : num;
        Integer num70 = (i3 & 8) != 0 ? rugbyTopTeamsStatisticsItem.tries : num2;
        Integer num71 = (i3 & 16) != 0 ? rugbyTopTeamsStatisticsItem.carries : num3;
        Integer num72 = (i3 & 32) != 0 ? rugbyTopTeamsStatisticsItem.penaltyTries : num4;
        Integer num73 = (i3 & 64) != 0 ? rugbyTopTeamsStatisticsItem.penaltyGoals : num5;
        Integer num74 = (i3 & 128) != 0 ? rugbyTopTeamsStatisticsItem.conversions : num6;
        Integer num75 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? rugbyTopTeamsStatisticsItem.dropGoals : num7;
        Integer num76 = (i3 & 512) != 0 ? rugbyTopTeamsStatisticsItem.scrumsWon : num8;
        Integer num77 = (i3 & 1024) != 0 ? rugbyTopTeamsStatisticsItem.lineoutsWon : num9;
        Integer num78 = (i3 & a.o) != 0 ? rugbyTopTeamsStatisticsItem.passesSuccessful : num10;
        Integer num79 = (i3 & 4096) != 0 ? rugbyTopTeamsStatisticsItem.offloads : num11;
        Integer num80 = (i3 & 8192) != 0 ? rugbyTopTeamsStatisticsItem.cleanBreaks : num12;
        int i8 = i6;
        Integer num81 = (i3 & 16384) != 0 ? rugbyTopTeamsStatisticsItem.defendersBeaten : num13;
        Integer num82 = (i3 & 32768) != 0 ? rugbyTopTeamsStatisticsItem.metresMade : num14;
        Integer num83 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? rugbyTopTeamsStatisticsItem.handlingError : num15;
        Integer num84 = (i3 & 131072) != 0 ? rugbyTopTeamsStatisticsItem.carriesCrossedGainLine : num16;
        Integer num85 = (i3 & 262144) != 0 ? rugbyTopTeamsStatisticsItem.carriesNotMadeGainLine : num17;
        Integer num86 = (i3 & 524288) != 0 ? rugbyTopTeamsStatisticsItem.postContactMetres : num18;
        Integer num87 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? rugbyTopTeamsStatisticsItem.tackles : num19;
        Integer num88 = (i3 & 2097152) != 0 ? rugbyTopTeamsStatisticsItem.dominantTackles : num20;
        Integer num89 = (i3 & 4194304) != 0 ? rugbyTopTeamsStatisticsItem.penDefs : num21;
        Integer num90 = (i3 & 8388608) != 0 ? rugbyTopTeamsStatisticsItem.penOffs : num22;
        Integer num91 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? rugbyTopTeamsStatisticsItem.kickMetres : num23;
        Integer num92 = (i3 & 33554432) != 0 ? rugbyTopTeamsStatisticsItem.kickFromHand : num24;
        Integer num93 = (i3 & 67108864) != 0 ? rugbyTopTeamsStatisticsItem.rucksWon : num25;
        Integer num94 = (i3 & 134217728) != 0 ? rugbyTopTeamsStatisticsItem.ruckArrival : num26;
        Integer num95 = (i3 & 268435456) != 0 ? rugbyTopTeamsStatisticsItem.ruckArrivalAttack : num27;
        Integer num96 = (i3 & 536870912) != 0 ? rugbyTopTeamsStatisticsItem.ruckArrivalDefence : num28;
        Integer num97 = (i3 & 1073741824) != 0 ? rugbyTopTeamsStatisticsItem.ruckSpeed03 : num29;
        Integer num98 = (i3 & Integer.MIN_VALUE) != 0 ? rugbyTopTeamsStatisticsItem.ruckSpeed36 : num30;
        Integer num99 = (i4 & 1) != 0 ? rugbyTopTeamsStatisticsItem.ruckSpeed6Plus : num31;
        Integer num100 = (i4 & 2) != 0 ? rugbyTopTeamsStatisticsItem.yellowCards : num32;
        Integer num101 = (i4 & 4) != 0 ? rugbyTopTeamsStatisticsItem.redCards : num33;
        if ((i4 & 8) != 0) {
            num36 = num101;
            num35 = rugbyTopTeamsStatisticsItem.penaltyGoalsConceded;
            num38 = num87;
            num39 = num88;
            num40 = num89;
            num41 = num90;
            num42 = num91;
            num43 = num92;
            num44 = num93;
            num45 = num94;
            num46 = num95;
            num47 = num96;
            num48 = num97;
            num49 = num98;
            num50 = num99;
            num51 = num100;
            num52 = num81;
            num54 = num72;
            num55 = num73;
            num56 = num74;
            num57 = num75;
            num58 = num76;
            num59 = num77;
            num60 = num78;
            num61 = num79;
            num62 = num80;
            num63 = num82;
            num64 = num83;
            num65 = num84;
            num66 = num85;
            num37 = num86;
            i5 = i7;
            num67 = num69;
            num68 = num70;
            num53 = num71;
        } else {
            num35 = num34;
            num36 = num101;
            num37 = num86;
            num38 = num87;
            num39 = num88;
            num40 = num89;
            num41 = num90;
            num42 = num91;
            num43 = num92;
            num44 = num93;
            num45 = num94;
            num46 = num95;
            num47 = num96;
            num48 = num97;
            num49 = num98;
            num50 = num99;
            num51 = num100;
            num52 = num81;
            num53 = num71;
            num54 = num72;
            num55 = num73;
            num56 = num74;
            num57 = num75;
            num58 = num76;
            num59 = num77;
            num60 = num78;
            num61 = num79;
            num62 = num80;
            num63 = num82;
            num64 = num83;
            num65 = num84;
            num66 = num85;
            i5 = i7;
            num67 = num69;
            num68 = num70;
        }
        return rugbyTopTeamsStatisticsItem.copy(i8, i5, num67, num68, num53, num54, num55, num56, num57, num58, num59, num60, num61, num62, num52, num63, num64, num65, num66, num37, num38, num39, num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51, num36, num35);
    }

    public static final /* synthetic */ void write$Self$model_release(RugbyTopTeamsStatisticsItem self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        output.u(1, self.getMatches(), serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.points);
        output.h(serialDesc, 3, a7aVar, self.tries);
        output.h(serialDesc, 4, a7aVar, self.carries);
        output.h(serialDesc, 5, a7aVar, self.penaltyTries);
        output.h(serialDesc, 6, a7aVar, self.penaltyGoals);
        output.h(serialDesc, 7, a7aVar, self.conversions);
        output.h(serialDesc, 8, a7aVar, self.dropGoals);
        output.h(serialDesc, 9, a7aVar, self.scrumsWon);
        output.h(serialDesc, 10, a7aVar, self.lineoutsWon);
        output.h(serialDesc, 11, a7aVar, self.passesSuccessful);
        output.h(serialDesc, 12, a7aVar, self.offloads);
        output.h(serialDesc, 13, a7aVar, self.cleanBreaks);
        output.h(serialDesc, 14, a7aVar, self.defendersBeaten);
        output.h(serialDesc, 15, a7aVar, self.metresMade);
        output.h(serialDesc, 16, a7aVar, self.handlingError);
        output.h(serialDesc, 17, a7aVar, self.carriesCrossedGainLine);
        output.h(serialDesc, 18, a7aVar, self.carriesNotMadeGainLine);
        output.h(serialDesc, 19, a7aVar, self.postContactMetres);
        output.h(serialDesc, 20, a7aVar, self.tackles);
        output.h(serialDesc, 21, a7aVar, self.dominantTackles);
        output.h(serialDesc, 22, a7aVar, self.penDefs);
        output.h(serialDesc, 23, a7aVar, self.penOffs);
        output.h(serialDesc, 24, a7aVar, self.kickMetres);
        output.h(serialDesc, 25, a7aVar, self.kickFromHand);
        output.h(serialDesc, 26, a7aVar, self.rucksWon);
        output.h(serialDesc, 27, a7aVar, self.ruckArrival);
        output.h(serialDesc, 28, a7aVar, self.ruckArrivalAttack);
        output.h(serialDesc, 29, a7aVar, self.ruckArrivalDefence);
        output.h(serialDesc, 30, a7aVar, self.ruckSpeed03);
        output.h(serialDesc, 31, a7aVar, self.ruckSpeed36);
        output.h(serialDesc, 32, a7aVar, self.ruckSpeed6Plus);
        output.h(serialDesc, 33, a7aVar, self.yellowCards);
        output.h(serialDesc, 34, a7aVar, self.redCards);
        output.h(serialDesc, 35, a7aVar, self.penaltyGoalsConceded);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getScrumsWon() {
        return this.scrumsWon;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getLineoutsWon() {
        return this.lineoutsWon;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getPassesSuccessful() {
        return this.passesSuccessful;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getOffloads() {
        return this.offloads;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getCleanBreaks() {
        return this.cleanBreaks;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getDefendersBeaten() {
        return this.defendersBeaten;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getMetresMade() {
        return this.metresMade;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getHandlingError() {
        return this.handlingError;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getCarriesCrossedGainLine() {
        return this.carriesCrossedGainLine;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getCarriesNotMadeGainLine() {
        return this.carriesNotMadeGainLine;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMatches() {
        return this.matches;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getPostContactMetres() {
        return this.postContactMetres;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getTackles() {
        return this.tackles;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getDominantTackles() {
        return this.dominantTackles;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getPenDefs() {
        return this.penDefs;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getPenOffs() {
        return this.penOffs;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getKickMetres() {
        return this.kickMetres;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getKickFromHand() {
        return this.kickFromHand;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getRucksWon() {
        return this.rucksWon;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getRuckArrival() {
        return this.ruckArrival;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Integer getRuckArrivalAttack() {
        return this.ruckArrivalAttack;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getRuckArrivalDefence() {
        return this.ruckArrivalDefence;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getRuckSpeed03() {
        return this.ruckSpeed03;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getRuckSpeed36() {
        return this.ruckSpeed36;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Integer getRuckSpeed6Plus() {
        return this.ruckSpeed6Plus;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final Integer getPenaltyGoalsConceded() {
        return this.penaltyGoalsConceded;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getTries() {
        return this.tries;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getCarries() {
        return this.carries;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getPenaltyTries() {
        return this.penaltyTries;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getConversions() {
        return this.conversions;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getDropGoals() {
        return this.dropGoals;
    }

    @NotNull
    public final RugbyTopTeamsStatisticsItem copy(int id, int matches, @Nullable Integer points, @Nullable Integer tries, @Nullable Integer carries, @Nullable Integer penaltyTries, @Nullable Integer penaltyGoals, @Nullable Integer conversions, @Nullable Integer dropGoals, @Nullable Integer scrumsWon, @Nullable Integer lineoutsWon, @Nullable Integer passesSuccessful, @Nullable Integer offloads, @Nullable Integer cleanBreaks, @Nullable Integer defendersBeaten, @Nullable Integer metresMade, @Nullable Integer handlingError, @Nullable Integer carriesCrossedGainLine, @Nullable Integer carriesNotMadeGainLine, @Nullable Integer postContactMetres, @Nullable Integer tackles, @Nullable Integer dominantTackles, @Nullable Integer penDefs, @Nullable Integer penOffs, @Nullable Integer kickMetres, @Nullable Integer kickFromHand, @Nullable Integer rucksWon, @Nullable Integer ruckArrival, @Nullable Integer ruckArrivalAttack, @Nullable Integer ruckArrivalDefence, @Nullable Integer ruckSpeed03, @Nullable Integer ruckSpeed36, @Nullable Integer ruckSpeed6Plus, @Nullable Integer yellowCards, @Nullable Integer redCards, @Nullable Integer penaltyGoalsConceded) {
        return new RugbyTopTeamsStatisticsItem(id, matches, points, tries, carries, penaltyTries, penaltyGoals, conversions, dropGoals, scrumsWon, lineoutsWon, passesSuccessful, offloads, cleanBreaks, defendersBeaten, metresMade, handlingError, carriesCrossedGainLine, carriesNotMadeGainLine, postContactMetres, tackles, dominantTackles, penDefs, penOffs, kickMetres, kickFromHand, rucksWon, ruckArrival, ruckArrivalAttack, ruckArrivalDefence, ruckSpeed03, ruckSpeed36, ruckSpeed6Plus, yellowCards, redCards, penaltyGoalsConceded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RugbyTopTeamsStatisticsItem)) {
            return false;
        }
        RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem = (RugbyTopTeamsStatisticsItem) other;
        return this.id == rugbyTopTeamsStatisticsItem.id && this.matches == rugbyTopTeamsStatisticsItem.matches && Intrinsics.c(this.points, rugbyTopTeamsStatisticsItem.points) && Intrinsics.c(this.tries, rugbyTopTeamsStatisticsItem.tries) && Intrinsics.c(this.carries, rugbyTopTeamsStatisticsItem.carries) && Intrinsics.c(this.penaltyTries, rugbyTopTeamsStatisticsItem.penaltyTries) && Intrinsics.c(this.penaltyGoals, rugbyTopTeamsStatisticsItem.penaltyGoals) && Intrinsics.c(this.conversions, rugbyTopTeamsStatisticsItem.conversions) && Intrinsics.c(this.dropGoals, rugbyTopTeamsStatisticsItem.dropGoals) && Intrinsics.c(this.scrumsWon, rugbyTopTeamsStatisticsItem.scrumsWon) && Intrinsics.c(this.lineoutsWon, rugbyTopTeamsStatisticsItem.lineoutsWon) && Intrinsics.c(this.passesSuccessful, rugbyTopTeamsStatisticsItem.passesSuccessful) && Intrinsics.c(this.offloads, rugbyTopTeamsStatisticsItem.offloads) && Intrinsics.c(this.cleanBreaks, rugbyTopTeamsStatisticsItem.cleanBreaks) && Intrinsics.c(this.defendersBeaten, rugbyTopTeamsStatisticsItem.defendersBeaten) && Intrinsics.c(this.metresMade, rugbyTopTeamsStatisticsItem.metresMade) && Intrinsics.c(this.handlingError, rugbyTopTeamsStatisticsItem.handlingError) && Intrinsics.c(this.carriesCrossedGainLine, rugbyTopTeamsStatisticsItem.carriesCrossedGainLine) && Intrinsics.c(this.carriesNotMadeGainLine, rugbyTopTeamsStatisticsItem.carriesNotMadeGainLine) && Intrinsics.c(this.postContactMetres, rugbyTopTeamsStatisticsItem.postContactMetres) && Intrinsics.c(this.tackles, rugbyTopTeamsStatisticsItem.tackles) && Intrinsics.c(this.dominantTackles, rugbyTopTeamsStatisticsItem.dominantTackles) && Intrinsics.c(this.penDefs, rugbyTopTeamsStatisticsItem.penDefs) && Intrinsics.c(this.penOffs, rugbyTopTeamsStatisticsItem.penOffs) && Intrinsics.c(this.kickMetres, rugbyTopTeamsStatisticsItem.kickMetres) && Intrinsics.c(this.kickFromHand, rugbyTopTeamsStatisticsItem.kickFromHand) && Intrinsics.c(this.rucksWon, rugbyTopTeamsStatisticsItem.rucksWon) && Intrinsics.c(this.ruckArrival, rugbyTopTeamsStatisticsItem.ruckArrival) && Intrinsics.c(this.ruckArrivalAttack, rugbyTopTeamsStatisticsItem.ruckArrivalAttack) && Intrinsics.c(this.ruckArrivalDefence, rugbyTopTeamsStatisticsItem.ruckArrivalDefence) && Intrinsics.c(this.ruckSpeed03, rugbyTopTeamsStatisticsItem.ruckSpeed03) && Intrinsics.c(this.ruckSpeed36, rugbyTopTeamsStatisticsItem.ruckSpeed36) && Intrinsics.c(this.ruckSpeed6Plus, rugbyTopTeamsStatisticsItem.ruckSpeed6Plus) && Intrinsics.c(this.yellowCards, rugbyTopTeamsStatisticsItem.yellowCards) && Intrinsics.c(this.redCards, rugbyTopTeamsStatisticsItem.redCards) && Intrinsics.c(this.penaltyGoalsConceded, rugbyTopTeamsStatisticsItem.penaltyGoalsConceded);
    }

    @Nullable
    public final Integer getCarries() {
        return this.carries;
    }

    @Nullable
    public final Integer getCarriesCrossedGainLine() {
        return this.carriesCrossedGainLine;
    }

    @Nullable
    public final Integer getCarriesNotMadeGainLine() {
        return this.carriesNotMadeGainLine;
    }

    @Nullable
    public final Integer getCleanBreaks() {
        return this.cleanBreaks;
    }

    @Nullable
    public final Integer getConversions() {
        return this.conversions;
    }

    @Nullable
    public final Integer getDefendersBeaten() {
        return this.defendersBeaten;
    }

    @Nullable
    public final Integer getDominantTackles() {
        return this.dominantTackles;
    }

    @Nullable
    public final Integer getDropGoals() {
        return this.dropGoals;
    }

    @Nullable
    public final Integer getHandlingError() {
        return this.handlingError;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topTeams.items.BaseTopTeamsStatisticsItem
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getKickFromHand() {
        return this.kickFromHand;
    }

    @Nullable
    public final Integer getKickMetres() {
        return this.kickMetres;
    }

    @Nullable
    public final Integer getLineoutsWon() {
        return this.lineoutsWon;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topTeams.items.BaseTopTeamsStatisticsItem
    public int getMatches() {
        return this.matches;
    }

    @Nullable
    public final Integer getMetresMade() {
        return this.metresMade;
    }

    @Nullable
    public final Integer getOffloads() {
        return this.offloads;
    }

    @Nullable
    public final Integer getPassesSuccessful() {
        return this.passesSuccessful;
    }

    @Nullable
    public final Integer getPenDefs() {
        return this.penDefs;
    }

    @Nullable
    public final Integer getPenOffs() {
        return this.penOffs;
    }

    @Nullable
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    public final Integer getPenaltyGoalsConceded() {
        return this.penaltyGoalsConceded;
    }

    @Nullable
    public final Integer getPenaltyTries() {
        return this.penaltyTries;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPostContactMetres() {
        return this.postContactMetres;
    }

    @Nullable
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    public final Integer getRuckArrival() {
        return this.ruckArrival;
    }

    @Nullable
    public final Integer getRuckArrivalAttack() {
        return this.ruckArrivalAttack;
    }

    @Nullable
    public final Integer getRuckArrivalDefence() {
        return this.ruckArrivalDefence;
    }

    @Nullable
    public final Integer getRuckSpeed03() {
        return this.ruckSpeed03;
    }

    @Nullable
    public final Integer getRuckSpeed36() {
        return this.ruckSpeed36;
    }

    @Nullable
    public final Integer getRuckSpeed6Plus() {
        return this.ruckSpeed6Plus;
    }

    @Nullable
    public final Integer getRucksWon() {
        return this.rucksWon;
    }

    @Nullable
    public final Integer getScrumsWon() {
        return this.scrumsWon;
    }

    @Nullable
    public final Integer getTackles() {
        return this.tackles;
    }

    @Nullable
    public final Integer getTries() {
        return this.tries;
    }

    @Nullable
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        int a = wv8.a(this.matches, Integer.hashCode(this.id) * 31, 31);
        Integer num = this.points;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.tries;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.carries;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.penaltyTries;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.penaltyGoals;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.conversions;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.dropGoals;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.scrumsWon;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.lineoutsWon;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.passesSuccessful;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.offloads;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.cleanBreaks;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.defendersBeaten;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.metresMade;
        int hashCode14 = (hashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.handlingError;
        int hashCode15 = (hashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.carriesCrossedGainLine;
        int hashCode16 = (hashCode15 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.carriesNotMadeGainLine;
        int hashCode17 = (hashCode16 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.postContactMetres;
        int hashCode18 = (hashCode17 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.tackles;
        int hashCode19 = (hashCode18 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.dominantTackles;
        int hashCode20 = (hashCode19 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.penDefs;
        int hashCode21 = (hashCode20 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.penOffs;
        int hashCode22 = (hashCode21 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.kickMetres;
        int hashCode23 = (hashCode22 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.kickFromHand;
        int hashCode24 = (hashCode23 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.rucksWon;
        int hashCode25 = (hashCode24 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.ruckArrival;
        int hashCode26 = (hashCode25 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.ruckArrivalAttack;
        int hashCode27 = (hashCode26 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Integer num28 = this.ruckArrivalDefence;
        int hashCode28 = (hashCode27 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Integer num29 = this.ruckSpeed03;
        int hashCode29 = (hashCode28 + (num29 == null ? 0 : num29.hashCode())) * 31;
        Integer num30 = this.ruckSpeed36;
        int hashCode30 = (hashCode29 + (num30 == null ? 0 : num30.hashCode())) * 31;
        Integer num31 = this.ruckSpeed6Plus;
        int hashCode31 = (hashCode30 + (num31 == null ? 0 : num31.hashCode())) * 31;
        Integer num32 = this.yellowCards;
        int hashCode32 = (hashCode31 + (num32 == null ? 0 : num32.hashCode())) * 31;
        Integer num33 = this.redCards;
        int hashCode33 = (hashCode32 + (num33 == null ? 0 : num33.hashCode())) * 31;
        Integer num34 = this.penaltyGoalsConceded;
        return hashCode33 + (num34 != null ? num34.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.matches;
        Integer num = this.points;
        Integer num2 = this.tries;
        Integer num3 = this.carries;
        Integer num4 = this.penaltyTries;
        Integer num5 = this.penaltyGoals;
        Integer num6 = this.conversions;
        Integer num7 = this.dropGoals;
        Integer num8 = this.scrumsWon;
        Integer num9 = this.lineoutsWon;
        Integer num10 = this.passesSuccessful;
        Integer num11 = this.offloads;
        Integer num12 = this.cleanBreaks;
        Integer num13 = this.defendersBeaten;
        Integer num14 = this.metresMade;
        Integer num15 = this.handlingError;
        Integer num16 = this.carriesCrossedGainLine;
        Integer num17 = this.carriesNotMadeGainLine;
        Integer num18 = this.postContactMetres;
        Integer num19 = this.tackles;
        Integer num20 = this.dominantTackles;
        Integer num21 = this.penDefs;
        Integer num22 = this.penOffs;
        Integer num23 = this.kickMetres;
        Integer num24 = this.kickFromHand;
        Integer num25 = this.rucksWon;
        Integer num26 = this.ruckArrival;
        Integer num27 = this.ruckArrivalAttack;
        Integer num28 = this.ruckArrivalDefence;
        Integer num29 = this.ruckSpeed03;
        Integer num30 = this.ruckSpeed36;
        Integer num31 = this.ruckSpeed6Plus;
        Integer num32 = this.yellowCards;
        Integer num33 = this.redCards;
        Integer num34 = this.penaltyGoalsConceded;
        StringBuilder s = lnb.s(i, i2, "RugbyTopTeamsStatisticsItem(id=", ", matches=", ", points=");
        vxd.r(num, num2, ", tries=", ", carries=", s);
        vxd.r(num3, num4, ", penaltyTries=", ", penaltyGoals=", s);
        vxd.r(num5, num6, ", conversions=", ", dropGoals=", s);
        vxd.r(num7, num8, ", scrumsWon=", ", lineoutsWon=", s);
        vxd.r(num9, num10, ", passesSuccessful=", ", offloads=", s);
        vxd.r(num11, num12, ", cleanBreaks=", ", defendersBeaten=", s);
        vxd.r(num13, num14, ", metresMade=", ", handlingError=", s);
        vxd.r(num15, num16, ", carriesCrossedGainLine=", ", carriesNotMadeGainLine=", s);
        vxd.r(num17, num18, ", postContactMetres=", ", tackles=", s);
        vxd.r(num19, num20, ", dominantTackles=", ", penDefs=", s);
        vxd.r(num21, num22, ", penOffs=", ", kickMetres=", s);
        vxd.r(num23, num24, ", kickFromHand=", ", rucksWon=", s);
        vxd.r(num25, num26, ", ruckArrival=", ", ruckArrivalAttack=", s);
        vxd.r(num27, num28, ", ruckArrivalDefence=", ", ruckSpeed03=", s);
        vxd.r(num29, num30, ", ruckSpeed36=", ", ruckSpeed6Plus=", s);
        vxd.r(num31, num32, ", yellowCards=", ", redCards=", s);
        return fc6.l(num33, num34, ", penaltyGoalsConceded=", ")", s);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/RugbyTopTeamsStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/RugbyTopTeamsStatisticsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RugbyTopTeamsStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RugbyTopTeamsStatisticsItem(int i, int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24, @Nullable Integer num25, @Nullable Integer num26, @Nullable Integer num27, @Nullable Integer num28, @Nullable Integer num29, @Nullable Integer num30, @Nullable Integer num31, @Nullable Integer num32, @Nullable Integer num33, @Nullable Integer num34) {
        this.id = i;
        this.matches = i2;
        this.points = num;
        this.tries = num2;
        this.carries = num3;
        this.penaltyTries = num4;
        this.penaltyGoals = num5;
        this.conversions = num6;
        this.dropGoals = num7;
        this.scrumsWon = num8;
        this.lineoutsWon = num9;
        this.passesSuccessful = num10;
        this.offloads = num11;
        this.cleanBreaks = num12;
        this.defendersBeaten = num13;
        this.metresMade = num14;
        this.handlingError = num15;
        this.carriesCrossedGainLine = num16;
        this.carriesNotMadeGainLine = num17;
        this.postContactMetres = num18;
        this.tackles = num19;
        this.dominantTackles = num20;
        this.penDefs = num21;
        this.penOffs = num22;
        this.kickMetres = num23;
        this.kickFromHand = num24;
        this.rucksWon = num25;
        this.ruckArrival = num26;
        this.ruckArrivalAttack = num27;
        this.ruckArrivalDefence = num28;
        this.ruckSpeed03 = num29;
        this.ruckSpeed36 = num30;
        this.ruckSpeed6Plus = num31;
        this.yellowCards = num32;
        this.redCards = num33;
        this.penaltyGoalsConceded = num34;
    }
}
