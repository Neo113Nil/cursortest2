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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b.\b\u0087\b\u0018\u0000 \u0096\u00012\u00020\u0001:\u0004\u0097\u0001\u0096\u0001B\u0083\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+B\u009f\u0003\b\u0010\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b*\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u00102J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u00102J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00102J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u00102J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u00102J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00102J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u00102J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u00102J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u00102J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u00102J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u00102J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u00102J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u00102J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u00102J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00102J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u00102J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u00102J\u0012\u0010F\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00102J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u00102J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u00102J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u00102J\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u00102J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u00102J\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u00102J\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u00102J\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u00102J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u00102J\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u00102J\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u00102J\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u00102J\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u00102J\u0012\u0010V\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bV\u00102J\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u00102J\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u00102JØ\u0003\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\\\u001a\u00020[HÖ\u0001¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b^\u0010_J\u001a\u0010c\u001a\u00020b2\b\u0010a\u001a\u0004\u0018\u00010`HÖ\u0003¢\u0006\u0004\bc\u0010dJ'\u0010m\u001a\u00020j2\u0006\u0010e\u001a\u00020\u00002\u0006\u0010g\u001a\u00020f2\u0006\u0010i\u001a\u00020hH\u0001¢\u0006\u0004\bk\u0010lR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010n\u001a\u0004\bo\u00102R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010n\u001a\u0004\bp\u00102R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010n\u001a\u0004\bq\u00102R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010n\u001a\u0004\br\u00102R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010n\u001a\u0004\bs\u00102R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010n\u001a\u0004\bt\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010n\u001a\u0004\bu\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010n\u001a\u0004\bv\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010n\u001a\u0004\bw\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010n\u001a\u0004\bx\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010n\u001a\u0004\by\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010n\u001a\u0004\bz\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010n\u001a\u0004\b{\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010n\u001a\u0004\b|\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010n\u001a\u0004\b}\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010n\u001a\u0004\b~\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010n\u001a\u0004\b\u007f\u00102R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0014\u0010n\u001a\u0005\b\u0080\u0001\u00102R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0015\u0010n\u001a\u0005\b\u0081\u0001\u00102R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0016\u0010n\u001a\u0005\b\u0082\u0001\u00102R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010GR\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0019\u0010n\u001a\u0005\b\u0085\u0001\u00102R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001a\u0010n\u001a\u0005\b\u0086\u0001\u00102R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001b\u0010n\u001a\u0005\b\u0087\u0001\u00102R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001c\u0010n\u001a\u0005\b\u0088\u0001\u00102R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001d\u0010n\u001a\u0005\b\u0089\u0001\u00102R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001e\u0010n\u001a\u0005\b\u008a\u0001\u00102R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001f\u0010n\u001a\u0005\b\u008b\u0001\u00102R\u001a\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b \u0010n\u001a\u0005\b\u008c\u0001\u00102R\u001a\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b!\u0010n\u001a\u0005\b\u008d\u0001\u00102R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\"\u0010n\u001a\u0005\b\u008e\u0001\u00102R\u001a\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b#\u0010n\u001a\u0005\b\u008f\u0001\u00102R\u001a\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b$\u0010n\u001a\u0005\b\u0090\u0001\u00102R\u001a\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b%\u0010n\u001a\u0005\b\u0091\u0001\u00102R\u001a\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b&\u0010n\u001a\u0005\b\u0092\u0001\u00102R\u001a\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b'\u0010n\u001a\u0005\b\u0093\u0001\u00102R\u001a\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b(\u0010n\u001a\u0005\b\u0094\u0001\u00102R\u001a\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b)\u0010n\u001a\u0005\b\u0095\u0001\u00102¨\u0006\u0098\u0001"}, d2 = {"Lcom/sofascore/model/network/response/HandballPlayerEventStatistics;", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "", "secondsPlayed", "goals", "shots", "assists", "shotsTaken", "goals7m", "shots7m", "goals6m", "shots6m", "goals9m", "shots9m", "breakthroughGoals", "breakthroughShots", "pivotGoals", "pivotShots", "fastbreakGoals", "fastbreakShots", "blockedShots", "steals", "saves", "", "goalsPrevented", "gkShots", "gk7mSaves", "gk7mShots", "gk6mSaves", "gk6mShots", "gkPivotSaves", "gkPivotShots", "gk9mSaves", "gk9mShots", "gkBreakthroughSaves", "gkBreakthroughShots", "gkFastbreakSaves", "gkFastbreakShots", "gkGoalsConceded", "twoMinutePenalties", "technicalFaults", "yellowCards", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "()Ljava/lang/Double;", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/network/response/HandballPlayerEventStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/HandballPlayerEventStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getSecondsPlayed", "getGoals", "getShots", "getAssists", "getShotsTaken", "getGoals7m", "getShots7m", "getGoals6m", "getShots6m", "getGoals9m", "getShots9m", "getBreakthroughGoals", "getBreakthroughShots", "getPivotGoals", "getPivotShots", "getFastbreakGoals", "getFastbreakShots", "getBlockedShots", "getSteals", "getSaves", "Ljava/lang/Double;", "getGoalsPrevented", "getGkShots", "getGk7mSaves", "getGk7mShots", "getGk6mSaves", "getGk6mShots", "getGkPivotSaves", "getGkPivotShots", "getGk9mSaves", "getGk9mShots", "getGkBreakthroughSaves", "getGkBreakthroughShots", "getGkFastbreakSaves", "getGkFastbreakShots", "getGkGoalsConceded", "getTwoMinutePenalties", "getTechnicalFaults", "getYellowCards", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HandballPlayerEventStatistics implements PlayerEventStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer blockedShots;

    @Nullable
    private final Integer breakthroughGoals;

    @Nullable
    private final Integer breakthroughShots;

    @Nullable
    private final Integer fastbreakGoals;

    @Nullable
    private final Integer fastbreakShots;

    @Nullable
    private final Integer gk6mSaves;

    @Nullable
    private final Integer gk6mShots;

    @Nullable
    private final Integer gk7mSaves;

    @Nullable
    private final Integer gk7mShots;

    @Nullable
    private final Integer gk9mSaves;

    @Nullable
    private final Integer gk9mShots;

    @Nullable
    private final Integer gkBreakthroughSaves;

    @Nullable
    private final Integer gkBreakthroughShots;

    @Nullable
    private final Integer gkFastbreakSaves;

    @Nullable
    private final Integer gkFastbreakShots;

    @Nullable
    private final Integer gkGoalsConceded;

    @Nullable
    private final Integer gkPivotSaves;

    @Nullable
    private final Integer gkPivotShots;

    @Nullable
    private final Integer gkShots;

    @Nullable
    private final Integer goals;

    @Nullable
    private final Integer goals6m;

    @Nullable
    private final Integer goals7m;

    @Nullable
    private final Integer goals9m;

    @Nullable
    private final Double goalsPrevented;

    @Nullable
    private final Integer pivotGoals;

    @Nullable
    private final Integer pivotShots;

    @Nullable
    private final Integer saves;

    @Nullable
    private final Integer secondsPlayed;

    @Nullable
    private final Integer shots;

    @Nullable
    private final Integer shots6m;

    @Nullable
    private final Integer shots7m;

    @Nullable
    private final Integer shots9m;

    @Nullable
    private final Integer shotsTaken;

    @Nullable
    private final Integer steals;

    @Nullable
    private final Integer technicalFaults;

    @Nullable
    private final Integer twoMinutePenalties;

    @Nullable
    private final Integer yellowCards;

    public /* synthetic */ HandballPlayerEventStatistics(int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Double d, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, Integer num35, Integer num36, Integer num37, t5h t5hVar) {
        if ((63 != (i2 & 63)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, 63}, HandballPlayerEventStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.secondsPlayed = num;
        this.goals = num2;
        this.shots = num3;
        this.assists = num4;
        this.shotsTaken = num5;
        this.goals7m = num6;
        this.shots7m = num7;
        this.goals6m = num8;
        this.shots6m = num9;
        this.goals9m = num10;
        this.shots9m = num11;
        this.breakthroughGoals = num12;
        this.breakthroughShots = num13;
        this.pivotGoals = num14;
        this.pivotShots = num15;
        this.fastbreakGoals = num16;
        this.fastbreakShots = num17;
        this.blockedShots = num18;
        this.steals = num19;
        this.saves = num20;
        this.goalsPrevented = d;
        this.gkShots = num21;
        this.gk7mSaves = num22;
        this.gk7mShots = num23;
        this.gk6mSaves = num24;
        this.gk6mShots = num25;
        this.gkPivotSaves = num26;
        this.gkPivotShots = num27;
        this.gk9mSaves = num28;
        this.gk9mShots = num29;
        this.gkBreakthroughSaves = num30;
        this.gkBreakthroughShots = num31;
        this.gkFastbreakSaves = num32;
        this.gkFastbreakShots = num33;
        this.gkGoalsConceded = num34;
        this.twoMinutePenalties = num35;
        this.technicalFaults = num36;
        this.yellowCards = num37;
    }

    public static /* synthetic */ HandballPlayerEventStatistics copy$default(HandballPlayerEventStatistics handballPlayerEventStatistics, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Double d, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, Integer num35, Integer num36, Integer num37, int i, int i2, Object obj) {
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
        Integer num67;
        Integer num68;
        Double d2;
        Integer num69;
        Integer num70;
        Integer num71;
        Integer num72;
        Integer num73;
        Integer num74 = (i & 1) != 0 ? handballPlayerEventStatistics.secondsPlayed : num;
        Integer num75 = (i & 2) != 0 ? handballPlayerEventStatistics.goals : num2;
        Integer num76 = (i & 4) != 0 ? handballPlayerEventStatistics.shots : num3;
        Integer num77 = (i & 8) != 0 ? handballPlayerEventStatistics.assists : num4;
        Integer num78 = (i & 16) != 0 ? handballPlayerEventStatistics.shotsTaken : num5;
        Integer num79 = (i & 32) != 0 ? handballPlayerEventStatistics.goals7m : num6;
        Integer num80 = (i & 64) != 0 ? handballPlayerEventStatistics.shots7m : num7;
        Integer num81 = (i & 128) != 0 ? handballPlayerEventStatistics.goals6m : num8;
        Integer num82 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? handballPlayerEventStatistics.shots6m : num9;
        Integer num83 = (i & 512) != 0 ? handballPlayerEventStatistics.goals9m : num10;
        Integer num84 = (i & 1024) != 0 ? handballPlayerEventStatistics.shots9m : num11;
        Integer num85 = (i & a.o) != 0 ? handballPlayerEventStatistics.breakthroughGoals : num12;
        Integer num86 = (i & 4096) != 0 ? handballPlayerEventStatistics.breakthroughShots : num13;
        Integer num87 = (i & 8192) != 0 ? handballPlayerEventStatistics.pivotGoals : num14;
        Integer num88 = num74;
        Integer num89 = (i & 16384) != 0 ? handballPlayerEventStatistics.pivotShots : num15;
        Integer num90 = (i & 32768) != 0 ? handballPlayerEventStatistics.fastbreakGoals : num16;
        Integer num91 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? handballPlayerEventStatistics.fastbreakShots : num17;
        Integer num92 = (i & 131072) != 0 ? handballPlayerEventStatistics.blockedShots : num18;
        Integer num93 = (i & 262144) != 0 ? handballPlayerEventStatistics.steals : num19;
        Integer num94 = (i & 524288) != 0 ? handballPlayerEventStatistics.saves : num20;
        Double d3 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? handballPlayerEventStatistics.goalsPrevented : d;
        Integer num95 = (i & 2097152) != 0 ? handballPlayerEventStatistics.gkShots : num21;
        Integer num96 = (i & 4194304) != 0 ? handballPlayerEventStatistics.gk7mSaves : num22;
        Integer num97 = (i & 8388608) != 0 ? handballPlayerEventStatistics.gk7mShots : num23;
        Integer num98 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? handballPlayerEventStatistics.gk6mSaves : num24;
        Integer num99 = (i & 33554432) != 0 ? handballPlayerEventStatistics.gk6mShots : num25;
        Integer num100 = (i & 67108864) != 0 ? handballPlayerEventStatistics.gkPivotSaves : num26;
        Integer num101 = (i & 134217728) != 0 ? handballPlayerEventStatistics.gkPivotShots : num27;
        Integer num102 = (i & 268435456) != 0 ? handballPlayerEventStatistics.gk9mSaves : num28;
        Integer num103 = (i & 536870912) != 0 ? handballPlayerEventStatistics.gk9mShots : num29;
        Integer num104 = (i & 1073741824) != 0 ? handballPlayerEventStatistics.gkBreakthroughSaves : num30;
        Integer num105 = (i & Integer.MIN_VALUE) != 0 ? handballPlayerEventStatistics.gkBreakthroughShots : num31;
        Integer num106 = (i2 & 1) != 0 ? handballPlayerEventStatistics.gkFastbreakSaves : num32;
        Integer num107 = (i2 & 2) != 0 ? handballPlayerEventStatistics.gkFastbreakShots : num33;
        Integer num108 = (i2 & 4) != 0 ? handballPlayerEventStatistics.gkGoalsConceded : num34;
        Integer num109 = (i2 & 8) != 0 ? handballPlayerEventStatistics.twoMinutePenalties : num35;
        Integer num110 = (i2 & 16) != 0 ? handballPlayerEventStatistics.technicalFaults : num36;
        if ((i2 & 32) != 0) {
            num39 = num110;
            num38 = handballPlayerEventStatistics.yellowCards;
            num41 = num96;
            num42 = num97;
            num43 = num98;
            num44 = num99;
            num45 = num100;
            num46 = num101;
            num47 = num102;
            num48 = num103;
            num49 = num104;
            num50 = num105;
            num51 = num106;
            num52 = num107;
            num53 = num108;
            num54 = num109;
            num55 = num89;
            num57 = num81;
            num58 = num82;
            num59 = num83;
            num60 = num84;
            num61 = num85;
            num62 = num86;
            num63 = num87;
            num64 = num90;
            num65 = num91;
            num66 = num92;
            num67 = num93;
            num68 = num94;
            d2 = d3;
            num40 = num95;
            num69 = num75;
            num70 = num76;
            num71 = num77;
            num72 = num78;
            num73 = num79;
            num56 = num80;
        } else {
            num38 = num37;
            num39 = num110;
            num40 = num95;
            num41 = num96;
            num42 = num97;
            num43 = num98;
            num44 = num99;
            num45 = num100;
            num46 = num101;
            num47 = num102;
            num48 = num103;
            num49 = num104;
            num50 = num105;
            num51 = num106;
            num52 = num107;
            num53 = num108;
            num54 = num109;
            num55 = num89;
            num56 = num80;
            num57 = num81;
            num58 = num82;
            num59 = num83;
            num60 = num84;
            num61 = num85;
            num62 = num86;
            num63 = num87;
            num64 = num90;
            num65 = num91;
            num66 = num92;
            num67 = num93;
            num68 = num94;
            d2 = d3;
            num69 = num75;
            num70 = num76;
            num71 = num77;
            num72 = num78;
            num73 = num79;
        }
        return handballPlayerEventStatistics.copy(num88, num69, num70, num71, num72, num73, num56, num57, num58, num59, num60, num61, num62, num63, num55, num64, num65, num66, num67, num68, d2, num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51, num52, num53, num54, num39, num38);
    }

    public static final /* synthetic */ void write$Self$model_release(HandballPlayerEventStatistics self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.secondsPlayed);
        output.h(serialDesc, 1, a7aVar, self.goals);
        output.h(serialDesc, 2, a7aVar, self.shots);
        output.h(serialDesc, 3, a7aVar, self.assists);
        output.h(serialDesc, 4, a7aVar, self.shotsTaken);
        output.h(serialDesc, 5, a7aVar, self.goals7m);
        output.h(serialDesc, 6, a7aVar, self.shots7m);
        output.h(serialDesc, 7, a7aVar, self.goals6m);
        output.h(serialDesc, 8, a7aVar, self.shots6m);
        output.h(serialDesc, 9, a7aVar, self.goals9m);
        output.h(serialDesc, 10, a7aVar, self.shots9m);
        output.h(serialDesc, 11, a7aVar, self.breakthroughGoals);
        output.h(serialDesc, 12, a7aVar, self.breakthroughShots);
        output.h(serialDesc, 13, a7aVar, self.pivotGoals);
        output.h(serialDesc, 14, a7aVar, self.pivotShots);
        output.h(serialDesc, 15, a7aVar, self.fastbreakGoals);
        output.h(serialDesc, 16, a7aVar, self.fastbreakShots);
        output.h(serialDesc, 17, a7aVar, self.blockedShots);
        output.h(serialDesc, 18, a7aVar, self.steals);
        output.h(serialDesc, 19, a7aVar, self.saves);
        output.h(serialDesc, 20, h75.a, self.goalsPrevented);
        output.h(serialDesc, 21, a7aVar, self.gkShots);
        output.h(serialDesc, 22, a7aVar, self.gk7mSaves);
        output.h(serialDesc, 23, a7aVar, self.gk7mShots);
        output.h(serialDesc, 24, a7aVar, self.gk6mSaves);
        output.h(serialDesc, 25, a7aVar, self.gk6mShots);
        output.h(serialDesc, 26, a7aVar, self.gkPivotSaves);
        output.h(serialDesc, 27, a7aVar, self.gkPivotShots);
        output.h(serialDesc, 28, a7aVar, self.gk9mSaves);
        output.h(serialDesc, 29, a7aVar, self.gk9mShots);
        output.h(serialDesc, 30, a7aVar, self.gkBreakthroughSaves);
        output.h(serialDesc, 31, a7aVar, self.gkBreakthroughShots);
        output.h(serialDesc, 32, a7aVar, self.gkFastbreakSaves);
        output.h(serialDesc, 33, a7aVar, self.gkFastbreakShots);
        output.h(serialDesc, 34, a7aVar, self.gkGoalsConceded);
        output.h(serialDesc, 35, a7aVar, self.twoMinutePenalties);
        output.h(serialDesc, 36, a7aVar, self.technicalFaults);
        output.h(serialDesc, 37, a7aVar, self.yellowCards);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getSecondsPlayed() {
        return this.secondsPlayed;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getGoals9m() {
        return this.goals9m;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getShots9m() {
        return this.shots9m;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getBreakthroughGoals() {
        return this.breakthroughGoals;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getBreakthroughShots() {
        return this.breakthroughShots;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getPivotGoals() {
        return this.pivotGoals;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getPivotShots() {
        return this.pivotShots;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getFastbreakGoals() {
        return this.fastbreakGoals;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getFastbreakShots() {
        return this.fastbreakShots;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getBlockedShots() {
        return this.blockedShots;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getSteals() {
        return this.steals;
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
    public final Double getGoalsPrevented() {
        return this.goalsPrevented;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getGkShots() {
        return this.gkShots;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getGk7mSaves() {
        return this.gk7mSaves;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getGk7mShots() {
        return this.gk7mShots;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getGk6mSaves() {
        return this.gk6mSaves;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getGk6mShots() {
        return this.gk6mShots;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getGkPivotSaves() {
        return this.gkPivotSaves;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getGkPivotShots() {
        return this.gkPivotShots;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Integer getGk9mSaves() {
        return this.gk9mSaves;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getShots() {
        return this.shots;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getGk9mShots() {
        return this.gk9mShots;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getGkBreakthroughSaves() {
        return this.gkBreakthroughSaves;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getGkBreakthroughShots() {
        return this.gkBreakthroughShots;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Integer getGkFastbreakSaves() {
        return this.gkFastbreakSaves;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Integer getGkFastbreakShots() {
        return this.gkFastbreakShots;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Integer getGkGoalsConceded() {
        return this.gkGoalsConceded;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final Integer getTwoMinutePenalties() {
        return this.twoMinutePenalties;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final Integer getTechnicalFaults() {
        return this.technicalFaults;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getShotsTaken() {
        return this.shotsTaken;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getGoals7m() {
        return this.goals7m;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getShots7m() {
        return this.shots7m;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getGoals6m() {
        return this.goals6m;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getShots6m() {
        return this.shots6m;
    }

    @NotNull
    public final HandballPlayerEventStatistics copy(@Nullable Integer secondsPlayed, @Nullable Integer goals, @Nullable Integer shots, @Nullable Integer assists, @Nullable Integer shotsTaken, @Nullable Integer goals7m, @Nullable Integer shots7m, @Nullable Integer goals6m, @Nullable Integer shots6m, @Nullable Integer goals9m, @Nullable Integer shots9m, @Nullable Integer breakthroughGoals, @Nullable Integer breakthroughShots, @Nullable Integer pivotGoals, @Nullable Integer pivotShots, @Nullable Integer fastbreakGoals, @Nullable Integer fastbreakShots, @Nullable Integer blockedShots, @Nullable Integer steals, @Nullable Integer saves, @Nullable Double goalsPrevented, @Nullable Integer gkShots, @Nullable Integer gk7mSaves, @Nullable Integer gk7mShots, @Nullable Integer gk6mSaves, @Nullable Integer gk6mShots, @Nullable Integer gkPivotSaves, @Nullable Integer gkPivotShots, @Nullable Integer gk9mSaves, @Nullable Integer gk9mShots, @Nullable Integer gkBreakthroughSaves, @Nullable Integer gkBreakthroughShots, @Nullable Integer gkFastbreakSaves, @Nullable Integer gkFastbreakShots, @Nullable Integer gkGoalsConceded, @Nullable Integer twoMinutePenalties, @Nullable Integer technicalFaults, @Nullable Integer yellowCards) {
        return new HandballPlayerEventStatistics(secondsPlayed, goals, shots, assists, shotsTaken, goals7m, shots7m, goals6m, shots6m, goals9m, shots9m, breakthroughGoals, breakthroughShots, pivotGoals, pivotShots, fastbreakGoals, fastbreakShots, blockedShots, steals, saves, goalsPrevented, gkShots, gk7mSaves, gk7mShots, gk6mSaves, gk6mShots, gkPivotSaves, gkPivotShots, gk9mSaves, gk9mShots, gkBreakthroughSaves, gkBreakthroughShots, gkFastbreakSaves, gkFastbreakShots, gkGoalsConceded, twoMinutePenalties, technicalFaults, yellowCards);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandballPlayerEventStatistics)) {
            return false;
        }
        HandballPlayerEventStatistics handballPlayerEventStatistics = (HandballPlayerEventStatistics) other;
        return Intrinsics.c(this.secondsPlayed, handballPlayerEventStatistics.secondsPlayed) && Intrinsics.c(this.goals, handballPlayerEventStatistics.goals) && Intrinsics.c(this.shots, handballPlayerEventStatistics.shots) && Intrinsics.c(this.assists, handballPlayerEventStatistics.assists) && Intrinsics.c(this.shotsTaken, handballPlayerEventStatistics.shotsTaken) && Intrinsics.c(this.goals7m, handballPlayerEventStatistics.goals7m) && Intrinsics.c(this.shots7m, handballPlayerEventStatistics.shots7m) && Intrinsics.c(this.goals6m, handballPlayerEventStatistics.goals6m) && Intrinsics.c(this.shots6m, handballPlayerEventStatistics.shots6m) && Intrinsics.c(this.goals9m, handballPlayerEventStatistics.goals9m) && Intrinsics.c(this.shots9m, handballPlayerEventStatistics.shots9m) && Intrinsics.c(this.breakthroughGoals, handballPlayerEventStatistics.breakthroughGoals) && Intrinsics.c(this.breakthroughShots, handballPlayerEventStatistics.breakthroughShots) && Intrinsics.c(this.pivotGoals, handballPlayerEventStatistics.pivotGoals) && Intrinsics.c(this.pivotShots, handballPlayerEventStatistics.pivotShots) && Intrinsics.c(this.fastbreakGoals, handballPlayerEventStatistics.fastbreakGoals) && Intrinsics.c(this.fastbreakShots, handballPlayerEventStatistics.fastbreakShots) && Intrinsics.c(this.blockedShots, handballPlayerEventStatistics.blockedShots) && Intrinsics.c(this.steals, handballPlayerEventStatistics.steals) && Intrinsics.c(this.saves, handballPlayerEventStatistics.saves) && Intrinsics.c(this.goalsPrevented, handballPlayerEventStatistics.goalsPrevented) && Intrinsics.c(this.gkShots, handballPlayerEventStatistics.gkShots) && Intrinsics.c(this.gk7mSaves, handballPlayerEventStatistics.gk7mSaves) && Intrinsics.c(this.gk7mShots, handballPlayerEventStatistics.gk7mShots) && Intrinsics.c(this.gk6mSaves, handballPlayerEventStatistics.gk6mSaves) && Intrinsics.c(this.gk6mShots, handballPlayerEventStatistics.gk6mShots) && Intrinsics.c(this.gkPivotSaves, handballPlayerEventStatistics.gkPivotSaves) && Intrinsics.c(this.gkPivotShots, handballPlayerEventStatistics.gkPivotShots) && Intrinsics.c(this.gk9mSaves, handballPlayerEventStatistics.gk9mSaves) && Intrinsics.c(this.gk9mShots, handballPlayerEventStatistics.gk9mShots) && Intrinsics.c(this.gkBreakthroughSaves, handballPlayerEventStatistics.gkBreakthroughSaves) && Intrinsics.c(this.gkBreakthroughShots, handballPlayerEventStatistics.gkBreakthroughShots) && Intrinsics.c(this.gkFastbreakSaves, handballPlayerEventStatistics.gkFastbreakSaves) && Intrinsics.c(this.gkFastbreakShots, handballPlayerEventStatistics.gkFastbreakShots) && Intrinsics.c(this.gkGoalsConceded, handballPlayerEventStatistics.gkGoalsConceded) && Intrinsics.c(this.twoMinutePenalties, handballPlayerEventStatistics.twoMinutePenalties) && Intrinsics.c(this.technicalFaults, handballPlayerEventStatistics.technicalFaults) && Intrinsics.c(this.yellowCards, handballPlayerEventStatistics.yellowCards);
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final Integer getBlockedShots() {
        return this.blockedShots;
    }

    @Nullable
    public final Integer getBreakthroughGoals() {
        return this.breakthroughGoals;
    }

    @Nullable
    public final Integer getBreakthroughShots() {
        return this.breakthroughShots;
    }

    @Nullable
    public final Integer getFastbreakGoals() {
        return this.fastbreakGoals;
    }

    @Nullable
    public final Integer getFastbreakShots() {
        return this.fastbreakShots;
    }

    @Nullable
    public final Integer getGk6mSaves() {
        return this.gk6mSaves;
    }

    @Nullable
    public final Integer getGk6mShots() {
        return this.gk6mShots;
    }

    @Nullable
    public final Integer getGk7mSaves() {
        return this.gk7mSaves;
    }

    @Nullable
    public final Integer getGk7mShots() {
        return this.gk7mShots;
    }

    @Nullable
    public final Integer getGk9mSaves() {
        return this.gk9mSaves;
    }

    @Nullable
    public final Integer getGk9mShots() {
        return this.gk9mShots;
    }

    @Nullable
    public final Integer getGkBreakthroughSaves() {
        return this.gkBreakthroughSaves;
    }

    @Nullable
    public final Integer getGkBreakthroughShots() {
        return this.gkBreakthroughShots;
    }

    @Nullable
    public final Integer getGkFastbreakSaves() {
        return this.gkFastbreakSaves;
    }

    @Nullable
    public final Integer getGkFastbreakShots() {
        return this.gkFastbreakShots;
    }

    @Nullable
    public final Integer getGkGoalsConceded() {
        return this.gkGoalsConceded;
    }

    @Nullable
    public final Integer getGkPivotSaves() {
        return this.gkPivotSaves;
    }

    @Nullable
    public final Integer getGkPivotShots() {
        return this.gkPivotShots;
    }

    @Nullable
    public final Integer getGkShots() {
        return this.gkShots;
    }

    @Nullable
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    public final Integer getGoals6m() {
        return this.goals6m;
    }

    @Nullable
    public final Integer getGoals7m() {
        return this.goals7m;
    }

    @Nullable
    public final Integer getGoals9m() {
        return this.goals9m;
    }

    @Nullable
    public final Double getGoalsPrevented() {
        return this.goalsPrevented;
    }

    @Nullable
    public final Integer getPivotGoals() {
        return this.pivotGoals;
    }

    @Nullable
    public final Integer getPivotShots() {
        return this.pivotShots;
    }

    @Override // com.sofascore.model.network.response.PlayerEventStatistics
    @Nullable
    public /* bridge */ Double getRating() {
        return super.getRating();
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
    public final Integer getShots() {
        return this.shots;
    }

    @Nullable
    public final Integer getShots6m() {
        return this.shots6m;
    }

    @Nullable
    public final Integer getShots7m() {
        return this.shots7m;
    }

    @Nullable
    public final Integer getShots9m() {
        return this.shots9m;
    }

    @Nullable
    public final Integer getShotsTaken() {
        return this.shotsTaken;
    }

    @Nullable
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    public final Integer getTechnicalFaults() {
        return this.technicalFaults;
    }

    @Nullable
    public final Integer getTwoMinutePenalties() {
        return this.twoMinutePenalties;
    }

    @Nullable
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        Integer num = this.secondsPlayed;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.goals;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.shots;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.assists;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.shotsTaken;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.goals7m;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.shots7m;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.goals6m;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.shots6m;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.goals9m;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.shots9m;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.breakthroughGoals;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.breakthroughShots;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.pivotGoals;
        int hashCode14 = (hashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.pivotShots;
        int hashCode15 = (hashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.fastbreakGoals;
        int hashCode16 = (hashCode15 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.fastbreakShots;
        int hashCode17 = (hashCode16 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.blockedShots;
        int hashCode18 = (hashCode17 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.steals;
        int hashCode19 = (hashCode18 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.saves;
        int hashCode20 = (hashCode19 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Double d = this.goalsPrevented;
        int hashCode21 = (hashCode20 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num21 = this.gkShots;
        int hashCode22 = (hashCode21 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.gk7mSaves;
        int hashCode23 = (hashCode22 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.gk7mShots;
        int hashCode24 = (hashCode23 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.gk6mSaves;
        int hashCode25 = (hashCode24 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.gk6mShots;
        int hashCode26 = (hashCode25 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.gkPivotSaves;
        int hashCode27 = (hashCode26 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.gkPivotShots;
        int hashCode28 = (hashCode27 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Integer num28 = this.gk9mSaves;
        int hashCode29 = (hashCode28 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Integer num29 = this.gk9mShots;
        int hashCode30 = (hashCode29 + (num29 == null ? 0 : num29.hashCode())) * 31;
        Integer num30 = this.gkBreakthroughSaves;
        int hashCode31 = (hashCode30 + (num30 == null ? 0 : num30.hashCode())) * 31;
        Integer num31 = this.gkBreakthroughShots;
        int hashCode32 = (hashCode31 + (num31 == null ? 0 : num31.hashCode())) * 31;
        Integer num32 = this.gkFastbreakSaves;
        int hashCode33 = (hashCode32 + (num32 == null ? 0 : num32.hashCode())) * 31;
        Integer num33 = this.gkFastbreakShots;
        int hashCode34 = (hashCode33 + (num33 == null ? 0 : num33.hashCode())) * 31;
        Integer num34 = this.gkGoalsConceded;
        int hashCode35 = (hashCode34 + (num34 == null ? 0 : num34.hashCode())) * 31;
        Integer num35 = this.twoMinutePenalties;
        int hashCode36 = (hashCode35 + (num35 == null ? 0 : num35.hashCode())) * 31;
        Integer num36 = this.technicalFaults;
        int hashCode37 = (hashCode36 + (num36 == null ? 0 : num36.hashCode())) * 31;
        Integer num37 = this.yellowCards;
        return hashCode37 + (num37 != null ? num37.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.secondsPlayed;
        Integer num2 = this.goals;
        Integer num3 = this.shots;
        Integer num4 = this.assists;
        Integer num5 = this.shotsTaken;
        Integer num6 = this.goals7m;
        Integer num7 = this.shots7m;
        Integer num8 = this.goals6m;
        Integer num9 = this.shots6m;
        Integer num10 = this.goals9m;
        Integer num11 = this.shots9m;
        Integer num12 = this.breakthroughGoals;
        Integer num13 = this.breakthroughShots;
        Integer num14 = this.pivotGoals;
        Integer num15 = this.pivotShots;
        Integer num16 = this.fastbreakGoals;
        Integer num17 = this.fastbreakShots;
        Integer num18 = this.blockedShots;
        Integer num19 = this.steals;
        Integer num20 = this.saves;
        Double d = this.goalsPrevented;
        Integer num21 = this.gkShots;
        Integer num22 = this.gk7mSaves;
        Integer num23 = this.gk7mShots;
        Integer num24 = this.gk6mSaves;
        Integer num25 = this.gk6mShots;
        Integer num26 = this.gkPivotSaves;
        Integer num27 = this.gkPivotShots;
        Integer num28 = this.gk9mSaves;
        Integer num29 = this.gk9mShots;
        Integer num30 = this.gkBreakthroughSaves;
        Integer num31 = this.gkBreakthroughShots;
        Integer num32 = this.gkFastbreakSaves;
        Integer num33 = this.gkFastbreakShots;
        Integer num34 = this.gkGoalsConceded;
        Integer num35 = this.twoMinutePenalties;
        Integer num36 = this.technicalFaults;
        Integer num37 = this.yellowCards;
        StringBuilder k = wv8.k(num, "HandballPlayerEventStatistics(secondsPlayed=", ", goals=", ", shots=", num2);
        vxd.r(num3, num4, ", assists=", ", shotsTaken=", k);
        vxd.r(num5, num6, ", goals7m=", ", shots7m=", k);
        vxd.r(num7, num8, ", goals6m=", ", shots6m=", k);
        vxd.r(num9, num10, ", goals9m=", ", shots9m=", k);
        vxd.r(num11, num12, ", breakthroughGoals=", ", breakthroughShots=", k);
        vxd.r(num13, num14, ", pivotGoals=", ", pivotShots=", k);
        vxd.r(num15, num16, ", fastbreakGoals=", ", fastbreakShots=", k);
        vxd.r(num17, num18, ", blockedShots=", ", steals=", k);
        vxd.r(num19, num20, ", saves=", ", goalsPrevented=", k);
        mz1.x(d, num21, ", gkShots=", ", gk7mSaves=", k);
        vxd.r(num22, num23, ", gk7mShots=", ", gk6mSaves=", k);
        vxd.r(num24, num25, ", gk6mShots=", ", gkPivotSaves=", k);
        vxd.r(num26, num27, ", gkPivotShots=", ", gk9mSaves=", k);
        vxd.r(num28, num29, ", gk9mShots=", ", gkBreakthroughSaves=", k);
        vxd.r(num30, num31, ", gkBreakthroughShots=", ", gkFastbreakSaves=", k);
        vxd.r(num32, num33, ", gkFastbreakShots=", ", gkGoalsConceded=", k);
        vxd.r(num34, num35, ", twoMinutePenalties=", ", technicalFaults=", k);
        return fc6.l(num36, num37, ", yellowCards=", ")", k);
    }

    public HandballPlayerEventStatistics(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Double d, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24, @Nullable Integer num25, @Nullable Integer num26, @Nullable Integer num27, @Nullable Integer num28, @Nullable Integer num29, @Nullable Integer num30, @Nullable Integer num31, @Nullable Integer num32, @Nullable Integer num33, @Nullable Integer num34, @Nullable Integer num35, @Nullable Integer num36, @Nullable Integer num37) {
        this.secondsPlayed = num;
        this.goals = num2;
        this.shots = num3;
        this.assists = num4;
        this.shotsTaken = num5;
        this.goals7m = num6;
        this.shots7m = num7;
        this.goals6m = num8;
        this.shots6m = num9;
        this.goals9m = num10;
        this.shots9m = num11;
        this.breakthroughGoals = num12;
        this.breakthroughShots = num13;
        this.pivotGoals = num14;
        this.pivotShots = num15;
        this.fastbreakGoals = num16;
        this.fastbreakShots = num17;
        this.blockedShots = num18;
        this.steals = num19;
        this.saves = num20;
        this.goalsPrevented = d;
        this.gkShots = num21;
        this.gk7mSaves = num22;
        this.gk7mShots = num23;
        this.gk6mSaves = num24;
        this.gk6mShots = num25;
        this.gkPivotSaves = num26;
        this.gkPivotShots = num27;
        this.gk9mSaves = num28;
        this.gk9mShots = num29;
        this.gkBreakthroughSaves = num30;
        this.gkBreakthroughShots = num31;
        this.gkFastbreakSaves = num32;
        this.gkFastbreakShots = num33;
        this.gkGoalsConceded = num34;
        this.twoMinutePenalties = num35;
        this.technicalFaults = num36;
        this.yellowCards = num37;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/HandballPlayerEventStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/HandballPlayerEventStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HandballPlayerEventStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
