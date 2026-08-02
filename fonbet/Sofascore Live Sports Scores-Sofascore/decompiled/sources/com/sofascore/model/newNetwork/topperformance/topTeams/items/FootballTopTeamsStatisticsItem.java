package com.sofascore.model.newNetwork.topperformance.topTeams.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
import defpackage.joa;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zl8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b-\b\u0087\b\u0018\u0000 \u0091\u00012\u00020\u0001:\u0004\u0092\u0001\u0091\u0001Bá\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)Bý\u0002\b\u0010\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b(\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u00100J\u0010\u00102\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u00107J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u00107J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00107J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u00107J\u0012\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b<\u00105J\u0012\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b=\u00105J\u0012\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b>\u00105J\u0012\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b?\u00105J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u00107J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u00107J\u0012\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bB\u00105J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00107J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u00107J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u00107J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u00107J\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u00107J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00107J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u00107J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u00107J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u00107J\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u00107J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u00107J\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u00107J\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u00107J\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u00107J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u00107J\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u00107J\u0012\u0010S\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bS\u00105J\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u00107J\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u00107J®\u0003\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bV\u0010WJ\u0010\u0010Y\u001a\u00020XHÖ\u0001¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b[\u00100J\u001a\u0010_\u001a\u00020^2\b\u0010]\u001a\u0004\u0018\u00010\\HÖ\u0003¢\u0006\u0004\b_\u0010`J'\u0010i\u001a\u00020f2\u0006\u0010a\u001a\u00020\u00002\u0006\u0010c\u001a\u00020b2\u0006\u0010e\u001a\u00020dH\u0001¢\u0006\u0004\bg\u0010hR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010j\u001a\u0004\bk\u00100R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010j\u001a\u0004\bl\u00100R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010m\u001a\u0004\bn\u00103R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010o\u001a\u0004\bp\u00105R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010q\u001a\u0004\br\u00107R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010q\u001a\u0004\bs\u00107R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010q\u001a\u0004\bt\u00107R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010q\u001a\u0004\bu\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010q\u001a\u0004\bv\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010o\u001a\u0004\bw\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010o\u001a\u0004\bx\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010o\u001a\u0004\by\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010o\u001a\u0004\bz\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010q\u001a\u0004\b{\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010q\u001a\u0004\b|\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010o\u001a\u0004\b}\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010q\u001a\u0004\b~\u00107R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010q\u001a\u0004\b\u007f\u00107R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0017\u0010q\u001a\u0005\b\u0080\u0001\u00107R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0018\u0010q\u001a\u0005\b\u0081\u0001\u00107R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0019\u0010q\u001a\u0005\b\u0082\u0001\u00107R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001a\u0010q\u001a\u0005\b\u0083\u0001\u00107R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001b\u0010q\u001a\u0005\b\u0084\u0001\u00107R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001c\u0010q\u001a\u0005\b\u0085\u0001\u00107R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001d\u0010q\u001a\u0005\b\u0086\u0001\u00107R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001e\u0010q\u001a\u0005\b\u0087\u0001\u00107R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001f\u0010q\u001a\u0005\b\u0088\u0001\u00107R\u001a\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b \u0010q\u001a\u0005\b\u0089\u0001\u00107R\u001a\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b!\u0010q\u001a\u0005\b\u008a\u0001\u00107R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\"\u0010q\u001a\u0005\b\u008b\u0001\u00107R\u001a\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b#\u0010q\u001a\u0005\b\u008c\u0001\u00107R\u001a\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b$\u0010q\u001a\u0005\b\u008d\u0001\u00107R\u001a\u0010%\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b%\u0010o\u001a\u0005\b\u008e\u0001\u00105R\u001a\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b&\u0010q\u001a\u0005\b\u008f\u0001\u00107R\u001a\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b'\u0010q\u001a\u0005\b\u0090\u0001\u00107¨\u0006\u0093\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/FootballTopTeamsStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BaseTopTeamsStatisticsItem;", "", "id", "matches", "Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "avgRatingVersion", "", "avgRating", "goalsScored", "goalsConceded", "bigChances", "bigChancesMissed", "hitWoodwork", "expectedGoals", "expectedGoalsOnTarget", "expectedAssists", "goalsPrevented", "yellowCards", "redCards", "averageBallPossession", "accuratePasses", "accurateLongBalls", "accurateCrosses", "shots", "shotsOnTarget", "successfulDribbles", "tackles", "interceptions", "clearances", "corners", "fouls", "penaltyGoals", "penaltiesTaken", "penaltyGoalsConceded", "penaltiesCommited", "cleanSheets", "kilometersCovered", "numberOfSprints", "titlesWon", "<init>", "(IILcom/sofascore/model/network/response/TeamAverageRatingVersion;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IIIILcom/sofascore/model/network/response/TeamAverageRatingVersion;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "component3", "()Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "component4", "()Ljava/lang/Double;", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "copy", "(IILcom/sofascore/model/network/response/TeamAverageRatingVersion;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/FootballTopTeamsStatisticsItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/FootballTopTeamsStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "getMatches", "Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "getAvgRatingVersion", "Ljava/lang/Double;", "getAvgRating", "Ljava/lang/Integer;", "getGoalsScored", "getGoalsConceded", "getBigChances", "getBigChancesMissed", "getHitWoodwork", "getExpectedGoals", "getExpectedGoalsOnTarget", "getExpectedAssists", "getGoalsPrevented", "getYellowCards", "getRedCards", "getAverageBallPossession", "getAccuratePasses", "getAccurateLongBalls", "getAccurateCrosses", "getShots", "getShotsOnTarget", "getSuccessfulDribbles", "getTackles", "getInterceptions", "getClearances", "getCorners", "getFouls", "getPenaltyGoals", "getPenaltiesTaken", "getPenaltyGoalsConceded", "getPenaltiesCommited", "getCleanSheets", "getKilometersCovered", "getNumberOfSprints", "getTitlesWon", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FootballTopTeamsStatisticsItem extends BaseTopTeamsStatisticsItem {

    @Nullable
    private final Integer accurateCrosses;

    @Nullable
    private final Integer accurateLongBalls;

    @Nullable
    private final Integer accuratePasses;

    @Nullable
    private final Double averageBallPossession;

    @Nullable
    private final Double avgRating;

    @NotNull
    private final TeamAverageRatingVersion avgRatingVersion;

    @Nullable
    private final Integer bigChances;

    @Nullable
    private final Integer bigChancesMissed;

    @Nullable
    private final Integer cleanSheets;

    @Nullable
    private final Integer clearances;

    @Nullable
    private final Integer corners;

    @Nullable
    private final Double expectedAssists;

    @Nullable
    private final Double expectedGoals;

    @Nullable
    private final Double expectedGoalsOnTarget;

    @Nullable
    private final Integer fouls;

    @Nullable
    private final Integer goalsConceded;

    @Nullable
    private final Double goalsPrevented;

    @Nullable
    private final Integer goalsScored;

    @Nullable
    private final Integer hitWoodwork;
    private final int id;

    @Nullable
    private final Integer interceptions;

    @Nullable
    private final Double kilometersCovered;
    private final int matches;

    @Nullable
    private final Integer numberOfSprints;

    @Nullable
    private final Integer penaltiesCommited;

    @Nullable
    private final Integer penaltiesTaken;

    @Nullable
    private final Integer penaltyGoals;

    @Nullable
    private final Integer penaltyGoalsConceded;

    @Nullable
    private final Integer redCards;

    @Nullable
    private final Integer shots;

    @Nullable
    private final Integer shotsOnTarget;

    @Nullable
    private final Integer successfulDribbles;

    @Nullable
    private final Integer tackles;

    @Nullable
    private final Integer titlesWon;

    @Nullable
    private final Integer yellowCards;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new zl8(4)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public /* synthetic */ FootballTopTeamsStatisticsItem(int i, int i2, int i3, int i4, TeamAverageRatingVersion teamAverageRatingVersion, Double d, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Double d2, Double d3, Double d4, Double d5, Integer num6, Integer num7, Double d6, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Double d7, Integer num24, Integer num25, t5h t5hVar) {
        if ((-5 != (i & (-5))) || (7 != (i2 & 7))) {
            oea.y(new int[]{i, i2}, new int[]{-5, 7}, FootballTopTeamsStatisticsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.matches = i4;
        if ((i & 4) == 0) {
            this.avgRatingVersion = TeamAverageRatingVersion.ORIGINAL;
        } else {
            this.avgRatingVersion = teamAverageRatingVersion;
        }
        this.avgRating = d;
        this.goalsScored = num;
        this.goalsConceded = num2;
        this.bigChances = num3;
        this.bigChancesMissed = num4;
        this.hitWoodwork = num5;
        this.expectedGoals = d2;
        this.expectedGoalsOnTarget = d3;
        this.expectedAssists = d4;
        this.goalsPrevented = d5;
        this.yellowCards = num6;
        this.redCards = num7;
        this.averageBallPossession = d6;
        this.accuratePasses = num8;
        this.accurateLongBalls = num9;
        this.accurateCrosses = num10;
        this.shots = num11;
        this.shotsOnTarget = num12;
        this.successfulDribbles = num13;
        this.tackles = num14;
        this.interceptions = num15;
        this.clearances = num16;
        this.corners = num17;
        this.fouls = num18;
        this.penaltyGoals = num19;
        this.penaltiesTaken = num20;
        this.penaltyGoalsConceded = num21;
        this.penaltiesCommited = num22;
        this.cleanSheets = num23;
        this.kilometersCovered = d7;
        this.numberOfSprints = num24;
        this.titlesWon = num25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return TeamAverageRatingVersion.INSTANCE.serializer();
    }

    public static /* synthetic */ FootballTopTeamsStatisticsItem copy$default(FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem, int i, int i2, TeamAverageRatingVersion teamAverageRatingVersion, Double d, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Double d2, Double d3, Double d4, Double d5, Integer num6, Integer num7, Double d6, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Double d7, Integer num24, Integer num25, int i3, int i4, Object obj) {
        Integer num26;
        Integer num27;
        Integer num28;
        Integer num29;
        Integer num30;
        Integer num31;
        Integer num32;
        Integer num33;
        Integer num34;
        Integer num35;
        Integer num36;
        Integer num37;
        Integer num38;
        Integer num39;
        Integer num40;
        Integer num41;
        Double d8;
        Integer num42;
        Double d9;
        Integer num43;
        Integer num44;
        Integer num45;
        Integer num46;
        Integer num47;
        Double d10;
        Double d11;
        Double d12;
        Double d13;
        Integer num48;
        Double d14;
        Integer num49;
        Integer num50;
        int i5;
        TeamAverageRatingVersion teamAverageRatingVersion2;
        int i6 = (i3 & 1) != 0 ? footballTopTeamsStatisticsItem.id : i;
        int i7 = (i3 & 2) != 0 ? footballTopTeamsStatisticsItem.matches : i2;
        TeamAverageRatingVersion teamAverageRatingVersion3 = (i3 & 4) != 0 ? footballTopTeamsStatisticsItem.avgRatingVersion : teamAverageRatingVersion;
        Double d15 = (i3 & 8) != 0 ? footballTopTeamsStatisticsItem.avgRating : d;
        Integer num51 = (i3 & 16) != 0 ? footballTopTeamsStatisticsItem.goalsScored : num;
        Integer num52 = (i3 & 32) != 0 ? footballTopTeamsStatisticsItem.goalsConceded : num2;
        Integer num53 = (i3 & 64) != 0 ? footballTopTeamsStatisticsItem.bigChances : num3;
        Integer num54 = (i3 & 128) != 0 ? footballTopTeamsStatisticsItem.bigChancesMissed : num4;
        Integer num55 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? footballTopTeamsStatisticsItem.hitWoodwork : num5;
        Double d16 = (i3 & 512) != 0 ? footballTopTeamsStatisticsItem.expectedGoals : d2;
        Double d17 = (i3 & 1024) != 0 ? footballTopTeamsStatisticsItem.expectedGoalsOnTarget : d3;
        Double d18 = (i3 & a.o) != 0 ? footballTopTeamsStatisticsItem.expectedAssists : d4;
        Double d19 = (i3 & 4096) != 0 ? footballTopTeamsStatisticsItem.goalsPrevented : d5;
        Integer num56 = (i3 & 8192) != 0 ? footballTopTeamsStatisticsItem.yellowCards : num6;
        int i8 = i6;
        Integer num57 = (i3 & 16384) != 0 ? footballTopTeamsStatisticsItem.redCards : num7;
        Double d20 = (i3 & 32768) != 0 ? footballTopTeamsStatisticsItem.averageBallPossession : d6;
        Integer num58 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? footballTopTeamsStatisticsItem.accuratePasses : num8;
        Integer num59 = (i3 & 131072) != 0 ? footballTopTeamsStatisticsItem.accurateLongBalls : num9;
        Integer num60 = (i3 & 262144) != 0 ? footballTopTeamsStatisticsItem.accurateCrosses : num10;
        Integer num61 = (i3 & 524288) != 0 ? footballTopTeamsStatisticsItem.shots : num11;
        Integer num62 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? footballTopTeamsStatisticsItem.shotsOnTarget : num12;
        Integer num63 = (i3 & 2097152) != 0 ? footballTopTeamsStatisticsItem.successfulDribbles : num13;
        Integer num64 = (i3 & 4194304) != 0 ? footballTopTeamsStatisticsItem.tackles : num14;
        Integer num65 = (i3 & 8388608) != 0 ? footballTopTeamsStatisticsItem.interceptions : num15;
        Integer num66 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? footballTopTeamsStatisticsItem.clearances : num16;
        Integer num67 = (i3 & 33554432) != 0 ? footballTopTeamsStatisticsItem.corners : num17;
        Integer num68 = (i3 & 67108864) != 0 ? footballTopTeamsStatisticsItem.fouls : num18;
        Integer num69 = (i3 & 134217728) != 0 ? footballTopTeamsStatisticsItem.penaltyGoals : num19;
        Integer num70 = (i3 & 268435456) != 0 ? footballTopTeamsStatisticsItem.penaltiesTaken : num20;
        Integer num71 = (i3 & 536870912) != 0 ? footballTopTeamsStatisticsItem.penaltyGoalsConceded : num21;
        Integer num72 = (i3 & 1073741824) != 0 ? footballTopTeamsStatisticsItem.penaltiesCommited : num22;
        Integer num73 = (i3 & Integer.MIN_VALUE) != 0 ? footballTopTeamsStatisticsItem.cleanSheets : num23;
        Double d21 = (i4 & 1) != 0 ? footballTopTeamsStatisticsItem.kilometersCovered : d7;
        Integer num74 = (i4 & 2) != 0 ? footballTopTeamsStatisticsItem.numberOfSprints : num24;
        if ((i4 & 4) != 0) {
            num27 = num74;
            num26 = footballTopTeamsStatisticsItem.titlesWon;
            num29 = num61;
            num30 = num62;
            num31 = num63;
            num32 = num64;
            num33 = num65;
            num34 = num66;
            num35 = num67;
            num36 = num68;
            num37 = num69;
            num38 = num70;
            num39 = num71;
            num40 = num72;
            num41 = num73;
            d8 = d21;
            num42 = num57;
            num43 = num51;
            num44 = num52;
            num45 = num53;
            num46 = num54;
            num47 = num55;
            d10 = d16;
            d11 = d17;
            d12 = d18;
            d13 = d19;
            num48 = num56;
            d14 = d20;
            num49 = num58;
            num50 = num59;
            num28 = num60;
            i5 = i7;
            teamAverageRatingVersion2 = teamAverageRatingVersion3;
            d9 = d15;
        } else {
            num26 = num25;
            num27 = num74;
            num28 = num60;
            num29 = num61;
            num30 = num62;
            num31 = num63;
            num32 = num64;
            num33 = num65;
            num34 = num66;
            num35 = num67;
            num36 = num68;
            num37 = num69;
            num38 = num70;
            num39 = num71;
            num40 = num72;
            num41 = num73;
            d8 = d21;
            num42 = num57;
            d9 = d15;
            num43 = num51;
            num44 = num52;
            num45 = num53;
            num46 = num54;
            num47 = num55;
            d10 = d16;
            d11 = d17;
            d12 = d18;
            d13 = d19;
            num48 = num56;
            d14 = d20;
            num49 = num58;
            num50 = num59;
            i5 = i7;
            teamAverageRatingVersion2 = teamAverageRatingVersion3;
        }
        return footballTopTeamsStatisticsItem.copy(i8, i5, teamAverageRatingVersion2, d9, num43, num44, num45, num46, num47, d10, d11, d12, d13, num48, num42, d14, num49, num50, num28, num29, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39, num40, num41, d8, num27, num26);
    }

    public static final /* synthetic */ void write$Self$model_release(FootballTopTeamsStatisticsItem self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.getId(), serialDesc);
        output.u(1, self.getMatches(), serialDesc);
        if (output.o(serialDesc) || self.getAvgRatingVersion() != TeamAverageRatingVersion.ORIGINAL) {
            output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.getAvgRatingVersion());
        }
        h75 h75Var = h75.a;
        output.h(serialDesc, 3, h75Var, self.avgRating);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.goalsScored);
        output.h(serialDesc, 5, a7aVar, self.goalsConceded);
        output.h(serialDesc, 6, a7aVar, self.bigChances);
        output.h(serialDesc, 7, a7aVar, self.bigChancesMissed);
        output.h(serialDesc, 8, a7aVar, self.hitWoodwork);
        output.h(serialDesc, 9, h75Var, self.expectedGoals);
        output.h(serialDesc, 10, h75Var, self.expectedGoalsOnTarget);
        output.h(serialDesc, 11, h75Var, self.expectedAssists);
        output.h(serialDesc, 12, h75Var, self.goalsPrevented);
        output.h(serialDesc, 13, a7aVar, self.yellowCards);
        output.h(serialDesc, 14, a7aVar, self.redCards);
        output.h(serialDesc, 15, h75Var, self.averageBallPossession);
        output.h(serialDesc, 16, a7aVar, self.accuratePasses);
        output.h(serialDesc, 17, a7aVar, self.accurateLongBalls);
        output.h(serialDesc, 18, a7aVar, self.accurateCrosses);
        output.h(serialDesc, 19, a7aVar, self.shots);
        output.h(serialDesc, 20, a7aVar, self.shotsOnTarget);
        output.h(serialDesc, 21, a7aVar, self.successfulDribbles);
        output.h(serialDesc, 22, a7aVar, self.tackles);
        output.h(serialDesc, 23, a7aVar, self.interceptions);
        output.h(serialDesc, 24, a7aVar, self.clearances);
        output.h(serialDesc, 25, a7aVar, self.corners);
        output.h(serialDesc, 26, a7aVar, self.fouls);
        output.h(serialDesc, 27, a7aVar, self.penaltyGoals);
        output.h(serialDesc, 28, a7aVar, self.penaltiesTaken);
        output.h(serialDesc, 29, a7aVar, self.penaltyGoalsConceded);
        output.h(serialDesc, 30, a7aVar, self.penaltiesCommited);
        output.h(serialDesc, 31, a7aVar, self.cleanSheets);
        output.h(serialDesc, 32, h75Var, self.kilometersCovered);
        output.h(serialDesc, 33, a7aVar, self.numberOfSprints);
        output.h(serialDesc, 34, a7aVar, self.titlesWon);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getExpectedGoals() {
        return this.expectedGoals;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Double getExpectedGoalsOnTarget() {
        return this.expectedGoalsOnTarget;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getExpectedAssists() {
        return this.expectedAssists;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Double getGoalsPrevented() {
        return this.goalsPrevented;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Double getAverageBallPossession() {
        return this.averageBallPossession;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getAccuratePasses() {
        return this.accuratePasses;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getAccurateLongBalls() {
        return this.accurateLongBalls;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getAccurateCrosses() {
        return this.accurateCrosses;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMatches() {
        return this.matches;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getShots() {
        return this.shots;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getShotsOnTarget() {
        return this.shotsOnTarget;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getSuccessfulDribbles() {
        return this.successfulDribbles;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getTackles() {
        return this.tackles;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getInterceptions() {
        return this.interceptions;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getClearances() {
        return this.clearances;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getCorners() {
        return this.corners;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getFouls() {
        return this.fouls;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Integer getPenaltiesTaken() {
        return this.penaltiesTaken;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TeamAverageRatingVersion getAvgRatingVersion() {
        return this.avgRatingVersion;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getPenaltyGoalsConceded() {
        return this.penaltyGoalsConceded;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getPenaltiesCommited() {
        return this.penaltiesCommited;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getCleanSheets() {
        return this.cleanSheets;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Double getKilometersCovered() {
        return this.kilometersCovered;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Integer getNumberOfSprints() {
        return this.numberOfSprints;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Integer getTitlesWon() {
        return this.titlesWon;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getAvgRating() {
        return this.avgRating;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getGoalsScored() {
        return this.goalsScored;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getGoalsConceded() {
        return this.goalsConceded;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getBigChances() {
        return this.bigChances;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getBigChancesMissed() {
        return this.bigChancesMissed;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getHitWoodwork() {
        return this.hitWoodwork;
    }

    @NotNull
    public final FootballTopTeamsStatisticsItem copy(int id, int matches, @NotNull TeamAverageRatingVersion avgRatingVersion, @Nullable Double avgRating, @Nullable Integer goalsScored, @Nullable Integer goalsConceded, @Nullable Integer bigChances, @Nullable Integer bigChancesMissed, @Nullable Integer hitWoodwork, @Nullable Double expectedGoals, @Nullable Double expectedGoalsOnTarget, @Nullable Double expectedAssists, @Nullable Double goalsPrevented, @Nullable Integer yellowCards, @Nullable Integer redCards, @Nullable Double averageBallPossession, @Nullable Integer accuratePasses, @Nullable Integer accurateLongBalls, @Nullable Integer accurateCrosses, @Nullable Integer shots, @Nullable Integer shotsOnTarget, @Nullable Integer successfulDribbles, @Nullable Integer tackles, @Nullable Integer interceptions, @Nullable Integer clearances, @Nullable Integer corners, @Nullable Integer fouls, @Nullable Integer penaltyGoals, @Nullable Integer penaltiesTaken, @Nullable Integer penaltyGoalsConceded, @Nullable Integer penaltiesCommited, @Nullable Integer cleanSheets, @Nullable Double kilometersCovered, @Nullable Integer numberOfSprints, @Nullable Integer titlesWon) {
        avgRatingVersion.getClass();
        return new FootballTopTeamsStatisticsItem(id, matches, avgRatingVersion, avgRating, goalsScored, goalsConceded, bigChances, bigChancesMissed, hitWoodwork, expectedGoals, expectedGoalsOnTarget, expectedAssists, goalsPrevented, yellowCards, redCards, averageBallPossession, accuratePasses, accurateLongBalls, accurateCrosses, shots, shotsOnTarget, successfulDribbles, tackles, interceptions, clearances, corners, fouls, penaltyGoals, penaltiesTaken, penaltyGoalsConceded, penaltiesCommited, cleanSheets, kilometersCovered, numberOfSprints, titlesWon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FootballTopTeamsStatisticsItem)) {
            return false;
        }
        FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem = (FootballTopTeamsStatisticsItem) other;
        return this.id == footballTopTeamsStatisticsItem.id && this.matches == footballTopTeamsStatisticsItem.matches && this.avgRatingVersion == footballTopTeamsStatisticsItem.avgRatingVersion && Intrinsics.c(this.avgRating, footballTopTeamsStatisticsItem.avgRating) && Intrinsics.c(this.goalsScored, footballTopTeamsStatisticsItem.goalsScored) && Intrinsics.c(this.goalsConceded, footballTopTeamsStatisticsItem.goalsConceded) && Intrinsics.c(this.bigChances, footballTopTeamsStatisticsItem.bigChances) && Intrinsics.c(this.bigChancesMissed, footballTopTeamsStatisticsItem.bigChancesMissed) && Intrinsics.c(this.hitWoodwork, footballTopTeamsStatisticsItem.hitWoodwork) && Intrinsics.c(this.expectedGoals, footballTopTeamsStatisticsItem.expectedGoals) && Intrinsics.c(this.expectedGoalsOnTarget, footballTopTeamsStatisticsItem.expectedGoalsOnTarget) && Intrinsics.c(this.expectedAssists, footballTopTeamsStatisticsItem.expectedAssists) && Intrinsics.c(this.goalsPrevented, footballTopTeamsStatisticsItem.goalsPrevented) && Intrinsics.c(this.yellowCards, footballTopTeamsStatisticsItem.yellowCards) && Intrinsics.c(this.redCards, footballTopTeamsStatisticsItem.redCards) && Intrinsics.c(this.averageBallPossession, footballTopTeamsStatisticsItem.averageBallPossession) && Intrinsics.c(this.accuratePasses, footballTopTeamsStatisticsItem.accuratePasses) && Intrinsics.c(this.accurateLongBalls, footballTopTeamsStatisticsItem.accurateLongBalls) && Intrinsics.c(this.accurateCrosses, footballTopTeamsStatisticsItem.accurateCrosses) && Intrinsics.c(this.shots, footballTopTeamsStatisticsItem.shots) && Intrinsics.c(this.shotsOnTarget, footballTopTeamsStatisticsItem.shotsOnTarget) && Intrinsics.c(this.successfulDribbles, footballTopTeamsStatisticsItem.successfulDribbles) && Intrinsics.c(this.tackles, footballTopTeamsStatisticsItem.tackles) && Intrinsics.c(this.interceptions, footballTopTeamsStatisticsItem.interceptions) && Intrinsics.c(this.clearances, footballTopTeamsStatisticsItem.clearances) && Intrinsics.c(this.corners, footballTopTeamsStatisticsItem.corners) && Intrinsics.c(this.fouls, footballTopTeamsStatisticsItem.fouls) && Intrinsics.c(this.penaltyGoals, footballTopTeamsStatisticsItem.penaltyGoals) && Intrinsics.c(this.penaltiesTaken, footballTopTeamsStatisticsItem.penaltiesTaken) && Intrinsics.c(this.penaltyGoalsConceded, footballTopTeamsStatisticsItem.penaltyGoalsConceded) && Intrinsics.c(this.penaltiesCommited, footballTopTeamsStatisticsItem.penaltiesCommited) && Intrinsics.c(this.cleanSheets, footballTopTeamsStatisticsItem.cleanSheets) && Intrinsics.c(this.kilometersCovered, footballTopTeamsStatisticsItem.kilometersCovered) && Intrinsics.c(this.numberOfSprints, footballTopTeamsStatisticsItem.numberOfSprints) && Intrinsics.c(this.titlesWon, footballTopTeamsStatisticsItem.titlesWon);
    }

    @Nullable
    public final Integer getAccurateCrosses() {
        return this.accurateCrosses;
    }

    @Nullable
    public final Integer getAccurateLongBalls() {
        return this.accurateLongBalls;
    }

    @Nullable
    public final Integer getAccuratePasses() {
        return this.accuratePasses;
    }

    @Nullable
    public final Double getAverageBallPossession() {
        return this.averageBallPossession;
    }

    @Nullable
    public final Double getAvgRating() {
        return this.avgRating;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topTeams.items.BaseTopTeamsStatisticsItem
    @NotNull
    public TeamAverageRatingVersion getAvgRatingVersion() {
        return this.avgRatingVersion;
    }

    @Nullable
    public final Integer getBigChances() {
        return this.bigChances;
    }

    @Nullable
    public final Integer getBigChancesMissed() {
        return this.bigChancesMissed;
    }

    @Nullable
    public final Integer getCleanSheets() {
        return this.cleanSheets;
    }

    @Nullable
    public final Integer getClearances() {
        return this.clearances;
    }

    @Nullable
    public final Integer getCorners() {
        return this.corners;
    }

    @Nullable
    public final Double getExpectedAssists() {
        return this.expectedAssists;
    }

    @Nullable
    public final Double getExpectedGoals() {
        return this.expectedGoals;
    }

    @Nullable
    public final Double getExpectedGoalsOnTarget() {
        return this.expectedGoalsOnTarget;
    }

    @Nullable
    public final Integer getFouls() {
        return this.fouls;
    }

    @Nullable
    public final Integer getGoalsConceded() {
        return this.goalsConceded;
    }

    @Nullable
    public final Double getGoalsPrevented() {
        return this.goalsPrevented;
    }

    @Nullable
    public final Integer getGoalsScored() {
        return this.goalsScored;
    }

    @Nullable
    public final Integer getHitWoodwork() {
        return this.hitWoodwork;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topTeams.items.BaseTopTeamsStatisticsItem
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getInterceptions() {
        return this.interceptions;
    }

    @Nullable
    public final Double getKilometersCovered() {
        return this.kilometersCovered;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topTeams.items.BaseTopTeamsStatisticsItem
    public int getMatches() {
        return this.matches;
    }

    @Nullable
    public final Integer getNumberOfSprints() {
        return this.numberOfSprints;
    }

    @Nullable
    public final Integer getPenaltiesCommited() {
        return this.penaltiesCommited;
    }

    @Nullable
    public final Integer getPenaltiesTaken() {
        return this.penaltiesTaken;
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
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    public final Integer getShots() {
        return this.shots;
    }

    @Nullable
    public final Integer getShotsOnTarget() {
        return this.shotsOnTarget;
    }

    @Nullable
    public final Integer getSuccessfulDribbles() {
        return this.successfulDribbles;
    }

    @Nullable
    public final Integer getTackles() {
        return this.tackles;
    }

    @Nullable
    public final Integer getTitlesWon() {
        return this.titlesWon;
    }

    @Nullable
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        int hashCode = (this.avgRatingVersion.hashCode() + wv8.a(this.matches, Integer.hashCode(this.id) * 31, 31)) * 31;
        Double d = this.avgRating;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.goalsScored;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.goalsConceded;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.bigChances;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bigChancesMissed;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.hitWoodwork;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d2 = this.expectedGoals;
        int hashCode8 = (hashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.expectedGoalsOnTarget;
        int hashCode9 = (hashCode8 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.expectedAssists;
        int hashCode10 = (hashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.goalsPrevented;
        int hashCode11 = (hashCode10 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num6 = this.yellowCards;
        int hashCode12 = (hashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.redCards;
        int hashCode13 = (hashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Double d6 = this.averageBallPossession;
        int hashCode14 = (hashCode13 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num8 = this.accuratePasses;
        int hashCode15 = (hashCode14 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.accurateLongBalls;
        int hashCode16 = (hashCode15 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.accurateCrosses;
        int hashCode17 = (hashCode16 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.shots;
        int hashCode18 = (hashCode17 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.shotsOnTarget;
        int hashCode19 = (hashCode18 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.successfulDribbles;
        int hashCode20 = (hashCode19 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.tackles;
        int hashCode21 = (hashCode20 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.interceptions;
        int hashCode22 = (hashCode21 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.clearances;
        int hashCode23 = (hashCode22 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.corners;
        int hashCode24 = (hashCode23 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.fouls;
        int hashCode25 = (hashCode24 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.penaltyGoals;
        int hashCode26 = (hashCode25 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.penaltiesTaken;
        int hashCode27 = (hashCode26 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.penaltyGoalsConceded;
        int hashCode28 = (hashCode27 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.penaltiesCommited;
        int hashCode29 = (hashCode28 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.cleanSheets;
        int hashCode30 = (hashCode29 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Double d7 = this.kilometersCovered;
        int hashCode31 = (hashCode30 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num24 = this.numberOfSprints;
        int hashCode32 = (hashCode31 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.titlesWon;
        return hashCode32 + (num25 != null ? num25.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.matches;
        TeamAverageRatingVersion teamAverageRatingVersion = this.avgRatingVersion;
        Double d = this.avgRating;
        Integer num = this.goalsScored;
        Integer num2 = this.goalsConceded;
        Integer num3 = this.bigChances;
        Integer num4 = this.bigChancesMissed;
        Integer num5 = this.hitWoodwork;
        Double d2 = this.expectedGoals;
        Double d3 = this.expectedGoalsOnTarget;
        Double d4 = this.expectedAssists;
        Double d5 = this.goalsPrevented;
        Integer num6 = this.yellowCards;
        Integer num7 = this.redCards;
        Double d6 = this.averageBallPossession;
        Integer num8 = this.accuratePasses;
        Integer num9 = this.accurateLongBalls;
        Integer num10 = this.accurateCrosses;
        Integer num11 = this.shots;
        Integer num12 = this.shotsOnTarget;
        Integer num13 = this.successfulDribbles;
        Integer num14 = this.tackles;
        Integer num15 = this.interceptions;
        Integer num16 = this.clearances;
        Integer num17 = this.corners;
        Integer num18 = this.fouls;
        Integer num19 = this.penaltyGoals;
        Integer num20 = this.penaltiesTaken;
        Integer num21 = this.penaltyGoalsConceded;
        Integer num22 = this.penaltiesCommited;
        Integer num23 = this.cleanSheets;
        Double d7 = this.kilometersCovered;
        Integer num24 = this.numberOfSprints;
        Integer num25 = this.titlesWon;
        StringBuilder s = lnb.s(i, i2, "FootballTopTeamsStatisticsItem(id=", ", matches=", ", avgRatingVersion=");
        s.append(teamAverageRatingVersion);
        s.append(", avgRating=");
        s.append(d);
        s.append(", goalsScored=");
        vxd.r(num, num2, ", goalsConceded=", ", bigChances=", s);
        vxd.r(num3, num4, ", bigChancesMissed=", ", hitWoodwork=", s);
        fn0.v(d2, num5, ", expectedGoals=", ", expectedGoalsOnTarget=", s);
        fc6.A(s, d3, ", expectedAssists=", d4, ", goalsPrevented=");
        mz1.x(d5, num6, ", yellowCards=", ", redCards=", s);
        fn0.v(d6, num7, ", averageBallPossession=", ", accuratePasses=", s);
        vxd.r(num8, num9, ", accurateLongBalls=", ", accurateCrosses=", s);
        vxd.r(num10, num11, ", shots=", ", shotsOnTarget=", s);
        vxd.r(num12, num13, ", successfulDribbles=", ", tackles=", s);
        vxd.r(num14, num15, ", interceptions=", ", clearances=", s);
        vxd.r(num16, num17, ", corners=", ", fouls=", s);
        vxd.r(num18, num19, ", penaltyGoals=", ", penaltiesTaken=", s);
        vxd.r(num20, num21, ", penaltyGoalsConceded=", ", penaltiesCommited=", s);
        vxd.r(num22, num23, ", cleanSheets=", ", kilometersCovered=", s);
        mz1.x(d7, num24, ", numberOfSprints=", ", titlesWon=", s);
        return vxd.n(s, num25, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/FootballTopTeamsStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/FootballTopTeamsStatisticsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FootballTopTeamsStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FootballTopTeamsStatisticsItem(int i, int i2, @NotNull TeamAverageRatingVersion teamAverageRatingVersion, @Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Double d6, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Double d7, @Nullable Integer num24, @Nullable Integer num25) {
        teamAverageRatingVersion.getClass();
        this.id = i;
        this.matches = i2;
        this.avgRatingVersion = teamAverageRatingVersion;
        this.avgRating = d;
        this.goalsScored = num;
        this.goalsConceded = num2;
        this.bigChances = num3;
        this.bigChancesMissed = num4;
        this.hitWoodwork = num5;
        this.expectedGoals = d2;
        this.expectedGoalsOnTarget = d3;
        this.expectedAssists = d4;
        this.goalsPrevented = d5;
        this.yellowCards = num6;
        this.redCards = num7;
        this.averageBallPossession = d6;
        this.accuratePasses = num8;
        this.accurateLongBalls = num9;
        this.accurateCrosses = num10;
        this.shots = num11;
        this.shotsOnTarget = num12;
        this.successfulDribbles = num13;
        this.tackles = num14;
        this.interceptions = num15;
        this.clearances = num16;
        this.corners = num17;
        this.fouls = num18;
        this.penaltyGoals = num19;
        this.penaltiesTaken = num20;
        this.penaltyGoalsConceded = num21;
        this.penaltiesCommited = num22;
        this.cleanSheets = num23;
        this.kilometersCovered = d7;
        this.numberOfSprints = num24;
        this.titlesWon = num25;
    }

    public /* synthetic */ FootballTopTeamsStatisticsItem(int i, int i2, TeamAverageRatingVersion teamAverageRatingVersion, Double d, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Double d2, Double d3, Double d4, Double d5, Integer num6, Integer num7, Double d6, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Double d7, Integer num24, Integer num25, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? TeamAverageRatingVersion.ORIGINAL : teamAverageRatingVersion, d, num, num2, num3, num4, num5, d2, d3, d4, d5, num6, num7, d6, num8, num9, num10, num11, num12, num13, num14, num15, num16, num17, num18, num19, num20, num21, num22, num23, d7, num24, num25);
    }
}
