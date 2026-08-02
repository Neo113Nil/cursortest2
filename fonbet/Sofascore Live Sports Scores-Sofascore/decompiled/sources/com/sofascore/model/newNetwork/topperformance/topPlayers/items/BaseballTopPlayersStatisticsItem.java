package com.sofascore.model.newNetwork.topperformance.topPlayers.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\b\u0087\b\u0018\u0000 \u0082\u00012\u00020\u0001:\u0004\u0083\u0001\u0082\u0001B»\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%BÏ\u0002\b\u0010\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010-J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010-J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010-J\u0012\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b5\u00101J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010-J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010-J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010-J\u0012\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b9\u00101J\u0012\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b:\u00101J\u0012\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b;\u00101J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010-J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010-J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010-J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010-J\u0012\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b@\u00101J\u0012\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bA\u00101J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010-J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010-J\u0012\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bD\u00101J\u0012\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bE\u00101J\u0012\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bF\u00101J\u0012\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bG\u00101J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010-J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010-J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010-J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u0010-J\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u0010-J\u0080\u0003\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bO\u0010/J\u0010\u0010P\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bP\u0010+J\u001a\u0010T\u001a\u00020S2\b\u0010R\u001a\u0004\u0018\u00010QHÖ\u0003¢\u0006\u0004\bT\u0010UJ'\u0010^\u001a\u00020[2\u0006\u0010V\u001a\u00020\u00002\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020YH\u0001¢\u0006\u0004\b\\\u0010]R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010_\u001a\u0004\b`\u0010+R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010a\u001a\u0004\bb\u0010-R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010c\u001a\u0004\bd\u0010/R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010e\u001a\u0004\bf\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010a\u001a\u0004\bg\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010a\u001a\u0004\bh\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010a\u001a\u0004\bi\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010e\u001a\u0004\bj\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010a\u001a\u0004\bk\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010a\u001a\u0004\bl\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010a\u001a\u0004\bm\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010e\u001a\u0004\bn\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010e\u001a\u0004\bo\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010e\u001a\u0004\bp\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010a\u001a\u0004\bq\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010a\u001a\u0004\br\u0010-R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010a\u001a\u0004\bs\u0010-R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010a\u001a\u0004\bt\u0010-R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010e\u001a\u0004\bu\u00101R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010e\u001a\u0004\bv\u00101R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010a\u001a\u0004\bw\u0010-R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010a\u001a\u0004\bx\u0010-R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010e\u001a\u0004\by\u00101R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010e\u001a\u0004\bz\u00101R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010e\u001a\u0004\b{\u00101R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010e\u001a\u0004\b|\u00101R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010a\u001a\u0004\b}\u0010-R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010a\u001a\u0004\b~\u0010-R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010a\u001a\u0004\b\u007f\u0010-R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\"\u0010a\u001a\u0005\b\u0080\u0001\u0010-R\u001a\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b#\u0010a\u001a\u0005\b\u0081\u0001\u0010-¨\u0006\u0084\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseballTopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseTopPlayersStatisticsItem;", "", "id", "appearances", "", "type", "", CampaignEx.JSON_KEY_STAR, "battingAtBats", "battingHits", "battingHomeRuns", "battingAvg", "battingRuns", "battingRbi", "battingStolenBases", "battingOnBasePercentage", "battingSluggingPercentage", "war", "pitchingGamesPlayed", "pitchingWins", "pitchingLosses", "pitchingSaves", "pitchingInningsPitched", "pitchingEarnedRunsAverage", "pitchingStrikeOuts", "pitchingQualityStarts", "pitchingWhip", "pitchingWar", "pitchingFieldingIndependentPitching", "pitchingOpponentBattingAvg", "fieldingPutOuts", "fieldingAssists", "fieldingTotalErrors", "fieldingChances", "fieldingDoublePlays", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseballTopPlayersStatisticsItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseballTopPlayersStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/String;", "getType", "Ljava/lang/Double;", "getRating", "getBattingAtBats", "getBattingHits", "getBattingHomeRuns", "getBattingAvg", "getBattingRuns", "getBattingRbi", "getBattingStolenBases", "getBattingOnBasePercentage", "getBattingSluggingPercentage", "getWar", "getPitchingGamesPlayed", "getPitchingWins", "getPitchingLosses", "getPitchingSaves", "getPitchingInningsPitched", "getPitchingEarnedRunsAverage", "getPitchingStrikeOuts", "getPitchingQualityStarts", "getPitchingWhip", "getPitchingWar", "getPitchingFieldingIndependentPitching", "getPitchingOpponentBattingAvg", "getFieldingPutOuts", "getFieldingAssists", "getFieldingTotalErrors", "getFieldingChances", "getFieldingDoublePlays", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BaseballTopPlayersStatisticsItem extends BaseTopPlayersStatisticsItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Integer battingAtBats;

    @Nullable
    private final Double battingAvg;

    @Nullable
    private final Integer battingHits;

    @Nullable
    private final Integer battingHomeRuns;

    @Nullable
    private final Double battingOnBasePercentage;

    @Nullable
    private final Integer battingRbi;

    @Nullable
    private final Integer battingRuns;

    @Nullable
    private final Double battingSluggingPercentage;

    @Nullable
    private final Integer battingStolenBases;

    @Nullable
    private final Integer fieldingAssists;

    @Nullable
    private final Integer fieldingChances;

    @Nullable
    private final Integer fieldingDoublePlays;

    @Nullable
    private final Integer fieldingPutOuts;

    @Nullable
    private final Integer fieldingTotalErrors;
    private final int id;

    @Nullable
    private final Double pitchingEarnedRunsAverage;

    @Nullable
    private final Double pitchingFieldingIndependentPitching;

    @Nullable
    private final Integer pitchingGamesPlayed;

    @Nullable
    private final Double pitchingInningsPitched;

    @Nullable
    private final Integer pitchingLosses;

    @Nullable
    private final Double pitchingOpponentBattingAvg;

    @Nullable
    private final Integer pitchingQualityStarts;

    @Nullable
    private final Integer pitchingSaves;

    @Nullable
    private final Integer pitchingStrikeOuts;

    @Nullable
    private final Double pitchingWar;

    @Nullable
    private final Double pitchingWhip;

    @Nullable
    private final Integer pitchingWins;

    @Nullable
    private final Double rating;

    @NotNull
    private final String type;

    @Nullable
    private final Double war;

    public /* synthetic */ BaseballTopPlayersStatisticsItem(int i, int i2, Integer num, String str, Double d, Integer num2, Integer num3, Integer num4, Double d2, Integer num5, Integer num6, Integer num7, Double d3, Double d4, Double d5, Integer num8, Integer num9, Integer num10, Integer num11, Double d6, Double d7, Integer num12, Integer num13, Double d8, Double d9, Double d10, Double d11, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, t5h t5hVar) {
        if (2147483639 != (i & 2147483639)) {
            oea.z(i, 2147483639, BaseballTopPlayersStatisticsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.appearances = num;
        this.type = str;
        if ((i & 8) == 0) {
            this.rating = null;
        } else {
            this.rating = d;
        }
        this.battingAtBats = num2;
        this.battingHits = num3;
        this.battingHomeRuns = num4;
        this.battingAvg = d2;
        this.battingRuns = num5;
        this.battingRbi = num6;
        this.battingStolenBases = num7;
        this.battingOnBasePercentage = d3;
        this.battingSluggingPercentage = d4;
        this.war = d5;
        this.pitchingGamesPlayed = num8;
        this.pitchingWins = num9;
        this.pitchingLosses = num10;
        this.pitchingSaves = num11;
        this.pitchingInningsPitched = d6;
        this.pitchingEarnedRunsAverage = d7;
        this.pitchingStrikeOuts = num12;
        this.pitchingQualityStarts = num13;
        this.pitchingWhip = d8;
        this.pitchingWar = d9;
        this.pitchingFieldingIndependentPitching = d10;
        this.pitchingOpponentBattingAvg = d11;
        this.fieldingPutOuts = num14;
        this.fieldingAssists = num15;
        this.fieldingTotalErrors = num16;
        this.fieldingChances = num17;
        this.fieldingDoublePlays = num18;
    }

    public static /* synthetic */ BaseballTopPlayersStatisticsItem copy$default(BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem, int i, Integer num, String str, Double d, Integer num2, Integer num3, Integer num4, Double d2, Integer num5, Integer num6, Integer num7, Double d3, Double d4, Double d5, Integer num8, Integer num9, Integer num10, Integer num11, Double d6, Double d7, Integer num12, Integer num13, Double d8, Double d9, Double d10, Double d11, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, int i2, Object obj) {
        Integer num19;
        Integer num20;
        int i3 = (i2 & 1) != 0 ? baseballTopPlayersStatisticsItem.id : i;
        Integer num21 = (i2 & 2) != 0 ? baseballTopPlayersStatisticsItem.appearances : num;
        String str2 = (i2 & 4) != 0 ? baseballTopPlayersStatisticsItem.type : str;
        Double d12 = (i2 & 8) != 0 ? baseballTopPlayersStatisticsItem.rating : d;
        Integer num22 = (i2 & 16) != 0 ? baseballTopPlayersStatisticsItem.battingAtBats : num2;
        Integer num23 = (i2 & 32) != 0 ? baseballTopPlayersStatisticsItem.battingHits : num3;
        Integer num24 = (i2 & 64) != 0 ? baseballTopPlayersStatisticsItem.battingHomeRuns : num4;
        Double d13 = (i2 & 128) != 0 ? baseballTopPlayersStatisticsItem.battingAvg : d2;
        Integer num25 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? baseballTopPlayersStatisticsItem.battingRuns : num5;
        Integer num26 = (i2 & 512) != 0 ? baseballTopPlayersStatisticsItem.battingRbi : num6;
        Integer num27 = (i2 & 1024) != 0 ? baseballTopPlayersStatisticsItem.battingStolenBases : num7;
        Double d14 = (i2 & a.o) != 0 ? baseballTopPlayersStatisticsItem.battingOnBasePercentage : d3;
        Double d15 = (i2 & 4096) != 0 ? baseballTopPlayersStatisticsItem.battingSluggingPercentage : d4;
        Double d16 = (i2 & 8192) != 0 ? baseballTopPlayersStatisticsItem.war : d5;
        int i4 = i3;
        Integer num28 = (i2 & 16384) != 0 ? baseballTopPlayersStatisticsItem.pitchingGamesPlayed : num8;
        Integer num29 = (i2 & 32768) != 0 ? baseballTopPlayersStatisticsItem.pitchingWins : num9;
        Integer num30 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? baseballTopPlayersStatisticsItem.pitchingLosses : num10;
        Integer num31 = (i2 & 131072) != 0 ? baseballTopPlayersStatisticsItem.pitchingSaves : num11;
        Double d17 = (i2 & 262144) != 0 ? baseballTopPlayersStatisticsItem.pitchingInningsPitched : d6;
        Double d18 = (i2 & 524288) != 0 ? baseballTopPlayersStatisticsItem.pitchingEarnedRunsAverage : d7;
        Integer num32 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? baseballTopPlayersStatisticsItem.pitchingStrikeOuts : num12;
        Integer num33 = (i2 & 2097152) != 0 ? baseballTopPlayersStatisticsItem.pitchingQualityStarts : num13;
        Double d19 = (i2 & 4194304) != 0 ? baseballTopPlayersStatisticsItem.pitchingWhip : d8;
        Double d20 = (i2 & 8388608) != 0 ? baseballTopPlayersStatisticsItem.pitchingWar : d9;
        Double d21 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? baseballTopPlayersStatisticsItem.pitchingFieldingIndependentPitching : d10;
        Double d22 = (i2 & 33554432) != 0 ? baseballTopPlayersStatisticsItem.pitchingOpponentBattingAvg : d11;
        Integer num34 = (i2 & 67108864) != 0 ? baseballTopPlayersStatisticsItem.fieldingPutOuts : num14;
        Integer num35 = (i2 & 134217728) != 0 ? baseballTopPlayersStatisticsItem.fieldingAssists : num15;
        Integer num36 = (i2 & 268435456) != 0 ? baseballTopPlayersStatisticsItem.fieldingTotalErrors : num16;
        Integer num37 = (i2 & 536870912) != 0 ? baseballTopPlayersStatisticsItem.fieldingChances : num17;
        if ((i2 & 1073741824) != 0) {
            num20 = num37;
            num19 = baseballTopPlayersStatisticsItem.fieldingDoublePlays;
        } else {
            num19 = num18;
            num20 = num37;
        }
        return baseballTopPlayersStatisticsItem.copy(i4, num21, str2, d12, num22, num23, num24, d13, num25, num26, num27, d14, d15, d16, num28, num29, num30, num31, d17, d18, num32, num33, d19, d20, d21, d22, num34, num35, num36, num20, num19);
    }

    public static final /* synthetic */ void write$Self$model_release(BaseballTopPlayersStatisticsItem self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.getAppearances());
        output.y(serialDesc, 2, self.getType());
        if (output.o(serialDesc) || self.getRating() != null) {
            output.h(serialDesc, 3, h75.a, self.getRating());
        }
        output.h(serialDesc, 4, a7aVar, self.battingAtBats);
        output.h(serialDesc, 5, a7aVar, self.battingHits);
        output.h(serialDesc, 6, a7aVar, self.battingHomeRuns);
        h75 h75Var = h75.a;
        output.h(serialDesc, 7, h75Var, self.battingAvg);
        output.h(serialDesc, 8, a7aVar, self.battingRuns);
        output.h(serialDesc, 9, a7aVar, self.battingRbi);
        output.h(serialDesc, 10, a7aVar, self.battingStolenBases);
        output.h(serialDesc, 11, h75Var, self.battingOnBasePercentage);
        output.h(serialDesc, 12, h75Var, self.battingSluggingPercentage);
        output.h(serialDesc, 13, h75Var, self.war);
        output.h(serialDesc, 14, a7aVar, self.pitchingGamesPlayed);
        output.h(serialDesc, 15, a7aVar, self.pitchingWins);
        output.h(serialDesc, 16, a7aVar, self.pitchingLosses);
        output.h(serialDesc, 17, a7aVar, self.pitchingSaves);
        output.h(serialDesc, 18, h75Var, self.pitchingInningsPitched);
        output.h(serialDesc, 19, h75Var, self.pitchingEarnedRunsAverage);
        output.h(serialDesc, 20, a7aVar, self.pitchingStrikeOuts);
        output.h(serialDesc, 21, a7aVar, self.pitchingQualityStarts);
        output.h(serialDesc, 22, h75Var, self.pitchingWhip);
        output.h(serialDesc, 23, h75Var, self.pitchingWar);
        output.h(serialDesc, 24, h75Var, self.pitchingFieldingIndependentPitching);
        output.h(serialDesc, 25, h75Var, self.pitchingOpponentBattingAvg);
        output.h(serialDesc, 26, a7aVar, self.fieldingPutOuts);
        output.h(serialDesc, 27, a7aVar, self.fieldingAssists);
        output.h(serialDesc, 28, a7aVar, self.fieldingTotalErrors);
        output.h(serialDesc, 29, a7aVar, self.fieldingChances);
        output.h(serialDesc, 30, a7aVar, self.fieldingDoublePlays);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getBattingRbi() {
        return this.battingRbi;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getBattingStolenBases() {
        return this.battingStolenBases;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getBattingOnBasePercentage() {
        return this.battingOnBasePercentage;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Double getBattingSluggingPercentage() {
        return this.battingSluggingPercentage;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Double getWar() {
        return this.war;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getPitchingGamesPlayed() {
        return this.pitchingGamesPlayed;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getPitchingWins() {
        return this.pitchingWins;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getPitchingLosses() {
        return this.pitchingLosses;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getPitchingSaves() {
        return this.pitchingSaves;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Double getPitchingInningsPitched() {
        return this.pitchingInningsPitched;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Double getPitchingEarnedRunsAverage() {
        return this.pitchingEarnedRunsAverage;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getPitchingStrikeOuts() {
        return this.pitchingStrikeOuts;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getPitchingQualityStarts() {
        return this.pitchingQualityStarts;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Double getPitchingWhip() {
        return this.pitchingWhip;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Double getPitchingWar() {
        return this.pitchingWar;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Double getPitchingFieldingIndependentPitching() {
        return this.pitchingFieldingIndependentPitching;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Double getPitchingOpponentBattingAvg() {
        return this.pitchingOpponentBattingAvg;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getFieldingPutOuts() {
        return this.fieldingPutOuts;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getFieldingAssists() {
        return this.fieldingAssists;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Integer getFieldingTotalErrors() {
        return this.fieldingTotalErrors;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getFieldingChances() {
        return this.fieldingChances;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getFieldingDoublePlays() {
        return this.fieldingDoublePlays;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getBattingAtBats() {
        return this.battingAtBats;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getBattingHits() {
        return this.battingHits;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getBattingHomeRuns() {
        return this.battingHomeRuns;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getBattingAvg() {
        return this.battingAvg;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getBattingRuns() {
        return this.battingRuns;
    }

    @NotNull
    public final BaseballTopPlayersStatisticsItem copy(int id, @Nullable Integer appearances, @NotNull String type, @Nullable Double rating, @Nullable Integer battingAtBats, @Nullable Integer battingHits, @Nullable Integer battingHomeRuns, @Nullable Double battingAvg, @Nullable Integer battingRuns, @Nullable Integer battingRbi, @Nullable Integer battingStolenBases, @Nullable Double battingOnBasePercentage, @Nullable Double battingSluggingPercentage, @Nullable Double war, @Nullable Integer pitchingGamesPlayed, @Nullable Integer pitchingWins, @Nullable Integer pitchingLosses, @Nullable Integer pitchingSaves, @Nullable Double pitchingInningsPitched, @Nullable Double pitchingEarnedRunsAverage, @Nullable Integer pitchingStrikeOuts, @Nullable Integer pitchingQualityStarts, @Nullable Double pitchingWhip, @Nullable Double pitchingWar, @Nullable Double pitchingFieldingIndependentPitching, @Nullable Double pitchingOpponentBattingAvg, @Nullable Integer fieldingPutOuts, @Nullable Integer fieldingAssists, @Nullable Integer fieldingTotalErrors, @Nullable Integer fieldingChances, @Nullable Integer fieldingDoublePlays) {
        type.getClass();
        return new BaseballTopPlayersStatisticsItem(id, appearances, type, rating, battingAtBats, battingHits, battingHomeRuns, battingAvg, battingRuns, battingRbi, battingStolenBases, battingOnBasePercentage, battingSluggingPercentage, war, pitchingGamesPlayed, pitchingWins, pitchingLosses, pitchingSaves, pitchingInningsPitched, pitchingEarnedRunsAverage, pitchingStrikeOuts, pitchingQualityStarts, pitchingWhip, pitchingWar, pitchingFieldingIndependentPitching, pitchingOpponentBattingAvg, fieldingPutOuts, fieldingAssists, fieldingTotalErrors, fieldingChances, fieldingDoublePlays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseballTopPlayersStatisticsItem)) {
            return false;
        }
        BaseballTopPlayersStatisticsItem baseballTopPlayersStatisticsItem = (BaseballTopPlayersStatisticsItem) other;
        return this.id == baseballTopPlayersStatisticsItem.id && Intrinsics.c(this.appearances, baseballTopPlayersStatisticsItem.appearances) && Intrinsics.c(this.type, baseballTopPlayersStatisticsItem.type) && Intrinsics.c(this.rating, baseballTopPlayersStatisticsItem.rating) && Intrinsics.c(this.battingAtBats, baseballTopPlayersStatisticsItem.battingAtBats) && Intrinsics.c(this.battingHits, baseballTopPlayersStatisticsItem.battingHits) && Intrinsics.c(this.battingHomeRuns, baseballTopPlayersStatisticsItem.battingHomeRuns) && Intrinsics.c(this.battingAvg, baseballTopPlayersStatisticsItem.battingAvg) && Intrinsics.c(this.battingRuns, baseballTopPlayersStatisticsItem.battingRuns) && Intrinsics.c(this.battingRbi, baseballTopPlayersStatisticsItem.battingRbi) && Intrinsics.c(this.battingStolenBases, baseballTopPlayersStatisticsItem.battingStolenBases) && Intrinsics.c(this.battingOnBasePercentage, baseballTopPlayersStatisticsItem.battingOnBasePercentage) && Intrinsics.c(this.battingSluggingPercentage, baseballTopPlayersStatisticsItem.battingSluggingPercentage) && Intrinsics.c(this.war, baseballTopPlayersStatisticsItem.war) && Intrinsics.c(this.pitchingGamesPlayed, baseballTopPlayersStatisticsItem.pitchingGamesPlayed) && Intrinsics.c(this.pitchingWins, baseballTopPlayersStatisticsItem.pitchingWins) && Intrinsics.c(this.pitchingLosses, baseballTopPlayersStatisticsItem.pitchingLosses) && Intrinsics.c(this.pitchingSaves, baseballTopPlayersStatisticsItem.pitchingSaves) && Intrinsics.c(this.pitchingInningsPitched, baseballTopPlayersStatisticsItem.pitchingInningsPitched) && Intrinsics.c(this.pitchingEarnedRunsAverage, baseballTopPlayersStatisticsItem.pitchingEarnedRunsAverage) && Intrinsics.c(this.pitchingStrikeOuts, baseballTopPlayersStatisticsItem.pitchingStrikeOuts) && Intrinsics.c(this.pitchingQualityStarts, baseballTopPlayersStatisticsItem.pitchingQualityStarts) && Intrinsics.c(this.pitchingWhip, baseballTopPlayersStatisticsItem.pitchingWhip) && Intrinsics.c(this.pitchingWar, baseballTopPlayersStatisticsItem.pitchingWar) && Intrinsics.c(this.pitchingFieldingIndependentPitching, baseballTopPlayersStatisticsItem.pitchingFieldingIndependentPitching) && Intrinsics.c(this.pitchingOpponentBattingAvg, baseballTopPlayersStatisticsItem.pitchingOpponentBattingAvg) && Intrinsics.c(this.fieldingPutOuts, baseballTopPlayersStatisticsItem.fieldingPutOuts) && Intrinsics.c(this.fieldingAssists, baseballTopPlayersStatisticsItem.fieldingAssists) && Intrinsics.c(this.fieldingTotalErrors, baseballTopPlayersStatisticsItem.fieldingTotalErrors) && Intrinsics.c(this.fieldingChances, baseballTopPlayersStatisticsItem.fieldingChances) && Intrinsics.c(this.fieldingDoublePlays, baseballTopPlayersStatisticsItem.fieldingDoublePlays);
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @Nullable
    public Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    public final Integer getBattingAtBats() {
        return this.battingAtBats;
    }

    @Nullable
    public final Double getBattingAvg() {
        return this.battingAvg;
    }

    @Nullable
    public final Integer getBattingHits() {
        return this.battingHits;
    }

    @Nullable
    public final Integer getBattingHomeRuns() {
        return this.battingHomeRuns;
    }

    @Nullable
    public final Double getBattingOnBasePercentage() {
        return this.battingOnBasePercentage;
    }

    @Nullable
    public final Integer getBattingRbi() {
        return this.battingRbi;
    }

    @Nullable
    public final Integer getBattingRuns() {
        return this.battingRuns;
    }

    @Nullable
    public final Double getBattingSluggingPercentage() {
        return this.battingSluggingPercentage;
    }

    @Nullable
    public final Integer getBattingStolenBases() {
        return this.battingStolenBases;
    }

    @Nullable
    public final Integer getFieldingAssists() {
        return this.fieldingAssists;
    }

    @Nullable
    public final Integer getFieldingChances() {
        return this.fieldingChances;
    }

    @Nullable
    public final Integer getFieldingDoublePlays() {
        return this.fieldingDoublePlays;
    }

    @Nullable
    public final Integer getFieldingPutOuts() {
        return this.fieldingPutOuts;
    }

    @Nullable
    public final Integer getFieldingTotalErrors() {
        return this.fieldingTotalErrors;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Double getPitchingEarnedRunsAverage() {
        return this.pitchingEarnedRunsAverage;
    }

    @Nullable
    public final Double getPitchingFieldingIndependentPitching() {
        return this.pitchingFieldingIndependentPitching;
    }

    @Nullable
    public final Integer getPitchingGamesPlayed() {
        return this.pitchingGamesPlayed;
    }

    @Nullable
    public final Double getPitchingInningsPitched() {
        return this.pitchingInningsPitched;
    }

    @Nullable
    public final Integer getPitchingLosses() {
        return this.pitchingLosses;
    }

    @Nullable
    public final Double getPitchingOpponentBattingAvg() {
        return this.pitchingOpponentBattingAvg;
    }

    @Nullable
    public final Integer getPitchingQualityStarts() {
        return this.pitchingQualityStarts;
    }

    @Nullable
    public final Integer getPitchingSaves() {
        return this.pitchingSaves;
    }

    @Nullable
    public final Integer getPitchingStrikeOuts() {
        return this.pitchingStrikeOuts;
    }

    @Nullable
    public final Double getPitchingWar() {
        return this.pitchingWar;
    }

    @Nullable
    public final Double getPitchingWhip() {
        return this.pitchingWhip;
    }

    @Nullable
    public final Integer getPitchingWins() {
        return this.pitchingWins;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @NotNull
    public String getType() {
        return this.type;
    }

    @Nullable
    public final Double getWar() {
        return this.war;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.appearances;
        int c = dmi.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.type);
        Double d = this.rating;
        int hashCode2 = (c + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.battingAtBats;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.battingHits;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.battingHomeRuns;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d2 = this.battingAvg;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num5 = this.battingRuns;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.battingRbi;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.battingStolenBases;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Double d3 = this.battingOnBasePercentage;
        int hashCode10 = (hashCode9 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.battingSluggingPercentage;
        int hashCode11 = (hashCode10 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.war;
        int hashCode12 = (hashCode11 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num8 = this.pitchingGamesPlayed;
        int hashCode13 = (hashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.pitchingWins;
        int hashCode14 = (hashCode13 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.pitchingLosses;
        int hashCode15 = (hashCode14 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.pitchingSaves;
        int hashCode16 = (hashCode15 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Double d6 = this.pitchingInningsPitched;
        int hashCode17 = (hashCode16 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.pitchingEarnedRunsAverage;
        int hashCode18 = (hashCode17 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num12 = this.pitchingStrikeOuts;
        int hashCode19 = (hashCode18 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.pitchingQualityStarts;
        int hashCode20 = (hashCode19 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Double d8 = this.pitchingWhip;
        int hashCode21 = (hashCode20 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.pitchingWar;
        int hashCode22 = (hashCode21 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d10 = this.pitchingFieldingIndependentPitching;
        int hashCode23 = (hashCode22 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.pitchingOpponentBattingAvg;
        int hashCode24 = (hashCode23 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Integer num14 = this.fieldingPutOuts;
        int hashCode25 = (hashCode24 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.fieldingAssists;
        int hashCode26 = (hashCode25 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.fieldingTotalErrors;
        int hashCode27 = (hashCode26 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.fieldingChances;
        int hashCode28 = (hashCode27 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.fieldingDoublePlays;
        return hashCode28 + (num18 != null ? num18.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Integer num = this.appearances;
        String str = this.type;
        Double d = this.rating;
        Integer num2 = this.battingAtBats;
        Integer num3 = this.battingHits;
        Integer num4 = this.battingHomeRuns;
        Double d2 = this.battingAvg;
        Integer num5 = this.battingRuns;
        Integer num6 = this.battingRbi;
        Integer num7 = this.battingStolenBases;
        Double d3 = this.battingOnBasePercentage;
        Double d4 = this.battingSluggingPercentage;
        Double d5 = this.war;
        Integer num8 = this.pitchingGamesPlayed;
        Integer num9 = this.pitchingWins;
        Integer num10 = this.pitchingLosses;
        Integer num11 = this.pitchingSaves;
        Double d6 = this.pitchingInningsPitched;
        Double d7 = this.pitchingEarnedRunsAverage;
        Integer num12 = this.pitchingStrikeOuts;
        Integer num13 = this.pitchingQualityStarts;
        Double d8 = this.pitchingWhip;
        Double d9 = this.pitchingWar;
        Double d10 = this.pitchingFieldingIndependentPitching;
        Double d11 = this.pitchingOpponentBattingAvg;
        Integer num14 = this.fieldingPutOuts;
        Integer num15 = this.fieldingAssists;
        Integer num16 = this.fieldingTotalErrors;
        Integer num17 = this.fieldingChances;
        Integer num18 = this.fieldingDoublePlays;
        StringBuilder r = fc6.r("BaseballTopPlayersStatisticsItem(id=", ", appearances=", ", type=", num, i);
        r.append(str);
        r.append(", rating=");
        r.append(d);
        r.append(", battingAtBats=");
        vxd.r(num2, num3, ", battingHits=", ", battingHomeRuns=", r);
        fn0.v(d2, num4, ", battingAvg=", ", battingRuns=", r);
        vxd.r(num5, num6, ", battingRbi=", ", battingStolenBases=", r);
        fn0.v(d3, num7, ", battingOnBasePercentage=", ", battingSluggingPercentage=", r);
        fc6.A(r, d4, ", war=", d5, ", pitchingGamesPlayed=");
        vxd.r(num8, num9, ", pitchingWins=", ", pitchingLosses=", r);
        vxd.r(num10, num11, ", pitchingSaves=", ", pitchingInningsPitched=", r);
        fc6.A(r, d6, ", pitchingEarnedRunsAverage=", d7, ", pitchingStrikeOuts=");
        vxd.r(num12, num13, ", pitchingQualityStarts=", ", pitchingWhip=", r);
        fc6.A(r, d8, ", pitchingWar=", d9, ", pitchingFieldingIndependentPitching=");
        fc6.A(r, d10, ", pitchingOpponentBattingAvg=", d11, ", fieldingPutOuts=");
        vxd.r(num14, num15, ", fieldingAssists=", ", fieldingTotalErrors=", r);
        vxd.r(num16, num17, ", fieldingChances=", ", fieldingDoublePlays=", r);
        return vxd.n(r, num18, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseballTopPlayersStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseballTopPlayersStatisticsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballTopPlayersStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BaseballTopPlayersStatisticsItem(int i, @Nullable Integer num, @NotNull String str, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Double d2, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Double d6, @Nullable Double d7, @Nullable Integer num12, @Nullable Integer num13, @Nullable Double d8, @Nullable Double d9, @Nullable Double d10, @Nullable Double d11, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18) {
        str.getClass();
        this.id = i;
        this.appearances = num;
        this.type = str;
        this.rating = d;
        this.battingAtBats = num2;
        this.battingHits = num3;
        this.battingHomeRuns = num4;
        this.battingAvg = d2;
        this.battingRuns = num5;
        this.battingRbi = num6;
        this.battingStolenBases = num7;
        this.battingOnBasePercentage = d3;
        this.battingSluggingPercentage = d4;
        this.war = d5;
        this.pitchingGamesPlayed = num8;
        this.pitchingWins = num9;
        this.pitchingLosses = num10;
        this.pitchingSaves = num11;
        this.pitchingInningsPitched = d6;
        this.pitchingEarnedRunsAverage = d7;
        this.pitchingStrikeOuts = num12;
        this.pitchingQualityStarts = num13;
        this.pitchingWhip = d8;
        this.pitchingWar = d9;
        this.pitchingFieldingIndependentPitching = d10;
        this.pitchingOpponentBattingAvg = d11;
        this.fieldingPutOuts = num14;
        this.fieldingAssists = num15;
        this.fieldingTotalErrors = num16;
        this.fieldingChances = num17;
        this.fieldingDoublePlays = num18;
    }

    public /* synthetic */ BaseballTopPlayersStatisticsItem(int i, Integer num, String str, Double d, Integer num2, Integer num3, Integer num4, Double d2, Integer num5, Integer num6, Integer num7, Double d3, Double d4, Double d5, Integer num8, Integer num9, Integer num10, Integer num11, Double d6, Double d7, Integer num12, Integer num13, Double d8, Double d9, Double d10, Double d11, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, str, (i2 & 8) != 0 ? null : d, num2, num3, num4, d2, num5, num6, num7, d3, d4, d5, num8, num9, num10, num11, d6, d7, num12, num13, d8, d9, d10, d11, num14, num15, num16, num17, num18);
    }
}
