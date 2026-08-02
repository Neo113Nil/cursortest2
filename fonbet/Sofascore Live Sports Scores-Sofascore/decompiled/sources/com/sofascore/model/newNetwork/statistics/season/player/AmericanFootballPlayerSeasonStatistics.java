package com.sofascore.model.newNetwork.statistics.season.player;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\bO\n\u0002\u0018\u0002\n\u0002\bV\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bW\b\u0087\b\u0018\u0000 \u008e\u00022\u00020\u00012\u00020\u0002:\u0004\u008e\u0002\u008f\u0002Bû\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bR\u0010SB«\u0006\b\u0010\u0012\u0006\u0010T\u001a\u00020\u0003\u0012\u0006\u0010U\u001a\u00020\u0003\u0012\u0006\u0010V\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010W\u001a\u0004\u0018\u00010\b\u0012\b\u0010Y\u001a\u0004\u0018\u00010X¢\u0006\u0004\bR\u0010ZJ\u0010\u0010[\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0012\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bc\u0010`J\u0012\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bd\u0010`J\u0012\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\be\u0010`J\u0012\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bf\u0010`J\u0012\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bg\u0010`J\u0012\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bh\u0010`J\u0012\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bi\u0010`J\u0012\u0010j\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bj\u0010bJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bk\u0010`J\u0012\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bl\u0010`J\u0012\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bm\u0010`J\u0012\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bn\u0010`J\u0012\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bo\u0010`J\u0012\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bp\u0010`J\u0012\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bq\u0010`J\u0012\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\br\u0010`J\u0012\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bs\u0010`J\u0012\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bt\u0010`J\u0012\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bu\u0010`J\u0012\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bv\u0010`J\u0012\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bw\u0010`J\u0012\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bx\u0010`J\u0012\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\by\u0010`J\u0012\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bz\u0010`J\u0012\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b{\u0010`J\u0012\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b|\u0010`J\u0012\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b}\u0010`J\u0012\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b~\u0010`J\u0012\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u007f\u0010`J\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010`J\u0014\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0081\u0001\u0010`J\u0014\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0082\u0001\u0010`J\u0014\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0083\u0001\u0010`J\u0014\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010`J\u0014\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0085\u0001\u0010`J\u0014\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010`J\u0014\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010`J\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0088\u0001\u0010`J\u0014\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0089\u0001\u0010`J\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u008a\u0001\u0010`J\u0014\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u008b\u0001\u0010`J\u0014\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u008c\u0001\u0010`J\u0014\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u008d\u0001\u0010`J\u0014\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u008e\u0001\u0010`J\u0014\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u008f\u0001\u0010`J\u0014\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0090\u0001\u0010`J\u0014\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0091\u0001\u0010`J\u0014\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0092\u0001\u0010`J\u0014\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0093\u0001\u0010`J\u0014\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0094\u0001\u0010`J\u0014\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0095\u0001\u0010`J\u0014\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0096\u0001\u0010`J\u0014\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0097\u0001\u0010`J\u0014\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0098\u0001\u0010`J\u0014\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u0099\u0001\u0010`J\u0014\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u009a\u0001\u0010`J\u0014\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u009b\u0001\u0010`J\u0014\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u009c\u0001\u0010`J\u0014\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u009d\u0001\u0010`J\u0014\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u009e\u0001\u0010`J\u0014\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b\u009f\u0001\u0010`J\u0014\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b \u0001\u0010`J\u0014\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b¡\u0001\u0010`J\u0014\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b¢\u0001\u0010`J\u0014\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b£\u0001\u0010`J\u0014\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b¤\u0001\u0010`J\u0014\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b¥\u0001\u0010`J\u0014\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b¦\u0001\u0010`J\u0014\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b§\u0001\u0010`J\u0014\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b¨\u0001\u0010`J\u0014\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\b©\u0001\u0010`J\u0014\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0005\bª\u0001\u0010`J\u009f\u0007\u0010«\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0012\u0010\u00ad\u0001\u001a\u00020\u0005HÖ\u0001¢\u0006\u0005\b\u00ad\u0001\u0010^J\u0012\u0010®\u0001\u001a\u00020\u0003HÖ\u0001¢\u0006\u0005\b®\u0001\u0010\\J \u0010²\u0001\u001a\u00030±\u00012\n\u0010°\u0001\u001a\u0005\u0018\u00010¯\u0001HÖ\u0003¢\u0006\u0006\b²\u0001\u0010³\u0001J0\u0010¼\u0001\u001a\u00030¹\u00012\u0007\u0010´\u0001\u001a\u00020\u00002\b\u0010¶\u0001\u001a\u00030µ\u00012\b\u0010¸\u0001\u001a\u00030·\u0001H\u0001¢\u0006\u0006\bº\u0001\u0010»\u0001R\u001c\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0004\u0010½\u0001\u001a\u0005\b¾\u0001\u0010\\R\u001c\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0006\u0010¿\u0001\u001a\u0005\bÀ\u0001\u0010^R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010Á\u0001\u001a\u0005\bÂ\u0001\u0010`R\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\t\u0010Ã\u0001\u001a\u0005\bÄ\u0001\u0010bR\u001b\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\n\u0010Á\u0001\u001a\u0005\bÅ\u0001\u0010`R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010Á\u0001\u001a\u0005\bÆ\u0001\u0010`R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\f\u0010Á\u0001\u001a\u0005\bÇ\u0001\u0010`R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\r\u0010Á\u0001\u001a\u0005\bÈ\u0001\u0010`R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010Á\u0001\u001a\u0005\bÉ\u0001\u0010`R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010Á\u0001\u001a\u0005\bÊ\u0001\u0010`R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010Á\u0001\u001a\u0005\bË\u0001\u0010`R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010Ã\u0001\u001a\u0005\bÌ\u0001\u0010bR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010Á\u0001\u001a\u0005\bÍ\u0001\u0010`R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010Á\u0001\u001a\u0005\bÎ\u0001\u0010`R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010Á\u0001\u001a\u0005\bÏ\u0001\u0010`R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010Á\u0001\u001a\u0005\bÐ\u0001\u0010`R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010Á\u0001\u001a\u0005\bÑ\u0001\u0010`R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010Á\u0001\u001a\u0005\bÒ\u0001\u0010`R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010Á\u0001\u001a\u0005\bÓ\u0001\u0010`R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010Á\u0001\u001a\u0005\bÔ\u0001\u0010`R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010Á\u0001\u001a\u0005\bÕ\u0001\u0010`R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010Á\u0001\u001a\u0005\bÖ\u0001\u0010`R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010Á\u0001\u001a\u0005\b×\u0001\u0010`R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010Á\u0001\u001a\u0005\bØ\u0001\u0010`R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010Á\u0001\u001a\u0005\bÙ\u0001\u0010`R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010Á\u0001\u001a\u0005\bÚ\u0001\u0010`R\u001b\u0010 \u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b \u0010Á\u0001\u001a\u0005\bÛ\u0001\u0010`R\u001b\u0010!\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b!\u0010Á\u0001\u001a\u0005\bÜ\u0001\u0010`R\u001b\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\"\u0010Á\u0001\u001a\u0005\bÝ\u0001\u0010`R\u001b\u0010#\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b#\u0010Á\u0001\u001a\u0005\bÞ\u0001\u0010`R\u001b\u0010$\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b$\u0010Á\u0001\u001a\u0005\bß\u0001\u0010`R\u001b\u0010%\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b%\u0010Á\u0001\u001a\u0005\bà\u0001\u0010`R\u001b\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b&\u0010Á\u0001\u001a\u0005\bá\u0001\u0010`R\u001b\u0010'\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b'\u0010Á\u0001\u001a\u0005\bâ\u0001\u0010`R\u001b\u0010(\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b(\u0010Á\u0001\u001a\u0005\bã\u0001\u0010`R\u001b\u0010)\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b)\u0010Á\u0001\u001a\u0005\bä\u0001\u0010`R\u001b\u0010*\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b*\u0010Á\u0001\u001a\u0005\bå\u0001\u0010`R\u001b\u0010+\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b+\u0010Á\u0001\u001a\u0005\bæ\u0001\u0010`R\u001b\u0010,\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b,\u0010Á\u0001\u001a\u0005\bç\u0001\u0010`R\u001b\u0010-\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b-\u0010Á\u0001\u001a\u0005\bè\u0001\u0010`R\u001b\u0010.\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b.\u0010Á\u0001\u001a\u0005\bé\u0001\u0010`R\u001b\u0010/\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b/\u0010Á\u0001\u001a\u0005\bê\u0001\u0010`R\u001b\u00100\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b0\u0010Á\u0001\u001a\u0005\bë\u0001\u0010`R\u001b\u00101\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b1\u0010Á\u0001\u001a\u0005\bì\u0001\u0010`R\u001b\u00102\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b2\u0010Á\u0001\u001a\u0005\bí\u0001\u0010`R\u001b\u00103\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b3\u0010Á\u0001\u001a\u0005\bî\u0001\u0010`R\u001b\u00104\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b4\u0010Á\u0001\u001a\u0005\bï\u0001\u0010`R\u001b\u00105\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b5\u0010Á\u0001\u001a\u0005\bð\u0001\u0010`R\u001b\u00106\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b6\u0010Á\u0001\u001a\u0005\bñ\u0001\u0010`R\u001b\u00107\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b7\u0010Á\u0001\u001a\u0005\bò\u0001\u0010`R\u001b\u00108\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b8\u0010Á\u0001\u001a\u0005\bó\u0001\u0010`R\u001b\u00109\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b9\u0010Á\u0001\u001a\u0005\bô\u0001\u0010`R\u001b\u0010:\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b:\u0010Á\u0001\u001a\u0005\bõ\u0001\u0010`R\u001b\u0010;\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b;\u0010Á\u0001\u001a\u0005\bö\u0001\u0010`R\u001b\u0010<\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b<\u0010Á\u0001\u001a\u0005\b÷\u0001\u0010`R\u001b\u0010=\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b=\u0010Á\u0001\u001a\u0005\bø\u0001\u0010`R\u001b\u0010>\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b>\u0010Á\u0001\u001a\u0005\bù\u0001\u0010`R\u001b\u0010?\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b?\u0010Á\u0001\u001a\u0005\bú\u0001\u0010`R\u001b\u0010@\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b@\u0010Á\u0001\u001a\u0005\bû\u0001\u0010`R\u001b\u0010A\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bA\u0010Á\u0001\u001a\u0005\bü\u0001\u0010`R\u001b\u0010B\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bB\u0010Á\u0001\u001a\u0005\bý\u0001\u0010`R\u001b\u0010C\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bC\u0010Á\u0001\u001a\u0005\bþ\u0001\u0010`R\u001b\u0010D\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bD\u0010Á\u0001\u001a\u0005\bÿ\u0001\u0010`R\u001b\u0010E\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bE\u0010Á\u0001\u001a\u0005\b\u0080\u0002\u0010`R\u001b\u0010F\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bF\u0010Á\u0001\u001a\u0005\b\u0081\u0002\u0010`R\u001b\u0010G\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bG\u0010Á\u0001\u001a\u0005\b\u0082\u0002\u0010`R\u001b\u0010H\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bH\u0010Á\u0001\u001a\u0005\b\u0083\u0002\u0010`R\u001b\u0010I\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bI\u0010Á\u0001\u001a\u0005\b\u0084\u0002\u0010`R\u001b\u0010J\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bJ\u0010Á\u0001\u001a\u0005\b\u0085\u0002\u0010`R\u001b\u0010K\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bK\u0010Á\u0001\u001a\u0005\b\u0086\u0002\u0010`R\u001b\u0010L\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bL\u0010Á\u0001\u001a\u0005\b\u0087\u0002\u0010`R\u001b\u0010M\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bM\u0010Á\u0001\u001a\u0005\b\u0088\u0002\u0010`R\u001b\u0010N\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bN\u0010Á\u0001\u001a\u0005\b\u0089\u0002\u0010`R\u001b\u0010O\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bO\u0010Á\u0001\u001a\u0005\b\u008a\u0002\u0010`R\u001b\u0010P\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bP\u0010Á\u0001\u001a\u0005\b\u008b\u0002\u0010`R\u001b\u0010Q\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\bQ\u0010Á\u0001\u001a\u0005\b\u008c\u0002\u0010`R\u001b\u0010W\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\bW\u0010Ã\u0001\u001a\u0005\b\u008d\u0002\u0010b¨\u0006\u0090\u0002"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/AmericanFootballPlayerSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "Ljava/io/Serializable;", "", "id", "", "type", "appearances", "", CampaignEx.JSON_KEY_STAR, "defensiveAssistTackles", "defensiveCombineTackles", "defensiveForcedFumbles", "defensiveInterceptions", "defensiveInterceptionsTouchdowns", "defensiveInterceptionsYards", "defensivePassesDefensed", "defensiveSacks", "defensiveSafeties", "defensiveTotalTackles", "fumbleFumbles", "fumbleLost", "fumbleRecovery", "fumbleSafety", "kickReturnsFumbles", "kickReturnsLong", "kickReturnsTotal", "kickReturnsTouchdowns", "kickReturnsYards", "kickReturnsFairCatches", "kickingExtraAttempts", "kickingExtraMade", "kickingFgAttempts", "kickingFgAttempts20to29", "kickingFgAttempts30to39", "kickingFgAttempts40to49", "kickingFgAttempts50plus", "kickingFgBlocked", "kickingFgLong", "kickingFgMade", "kickingFgMade20to29", "kickingFgMade30to39", "kickingFgMade40to49", "kickingFgMade50plus", "kickingTotalPoints", "kickingFgMade1to19", "kickoffReturns", "kickoffTotal", "kickoffTouchbacks", "passingAttempts", "passingCompletions", "passingInterceptions", "passingLongest", "passingNetYards", "passingSacked", "passingTouchdowns", "passingYards", "passingFirstDowns", "puntReturnsLong", "puntReturnsTotal", "puntReturnsTouchdowns", "puntReturnsYards", "puntReturnsFairCatches", "puntingBlocked", "puntingInside20", "puntingLongest", "puntingNetYards", "puntingTotal", "puntingTouchbacks", "puntingYards", "receivingFirstDowns", "receivingLongest", "receivingReceptions", "receivingTouchdowns", "receivingYards", "receivingTargets", "rushingAttempts", "rushingFumbles", "rushingLongest", "rushingTouchdowns", "rushingYards", "rushingFirstDowns", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "seen1", "seen2", "passerRating", "Lt5h;", "serializationConstructorMarker", "(IIIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/statistics/season/player/AmericanFootballPlayerSeasonStatistics;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/AmericanFootballPlayerSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getType", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/Double;", "getRating", "getDefensiveAssistTackles", "getDefensiveCombineTackles", "getDefensiveForcedFumbles", "getDefensiveInterceptions", "getDefensiveInterceptionsTouchdowns", "getDefensiveInterceptionsYards", "getDefensivePassesDefensed", "getDefensiveSacks", "getDefensiveSafeties", "getDefensiveTotalTackles", "getFumbleFumbles", "getFumbleLost", "getFumbleRecovery", "getFumbleSafety", "getKickReturnsFumbles", "getKickReturnsLong", "getKickReturnsTotal", "getKickReturnsTouchdowns", "getKickReturnsYards", "getKickReturnsFairCatches", "getKickingExtraAttempts", "getKickingExtraMade", "getKickingFgAttempts", "getKickingFgAttempts20to29", "getKickingFgAttempts30to39", "getKickingFgAttempts40to49", "getKickingFgAttempts50plus", "getKickingFgBlocked", "getKickingFgLong", "getKickingFgMade", "getKickingFgMade20to29", "getKickingFgMade30to39", "getKickingFgMade40to49", "getKickingFgMade50plus", "getKickingTotalPoints", "getKickingFgMade1to19", "getKickoffReturns", "getKickoffTotal", "getKickoffTouchbacks", "getPassingAttempts", "getPassingCompletions", "getPassingInterceptions", "getPassingLongest", "getPassingNetYards", "getPassingSacked", "getPassingTouchdowns", "getPassingYards", "getPassingFirstDowns", "getPuntReturnsLong", "getPuntReturnsTotal", "getPuntReturnsTouchdowns", "getPuntReturnsYards", "getPuntReturnsFairCatches", "getPuntingBlocked", "getPuntingInside20", "getPuntingLongest", "getPuntingNetYards", "getPuntingTotal", "getPuntingTouchbacks", "getPuntingYards", "getReceivingFirstDowns", "getReceivingLongest", "getReceivingReceptions", "getReceivingTouchdowns", "getReceivingYards", "getReceivingTargets", "getRushingAttempts", "getRushingFumbles", "getRushingLongest", "getRushingTouchdowns", "getRushingYards", "getRushingFirstDowns", "getPasserRating", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AmericanFootballPlayerSeasonStatistics extends AbstractPlayerSeasonStatistics implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Integer defensiveAssistTackles;

    @Nullable
    private final Integer defensiveCombineTackles;

    @Nullable
    private final Integer defensiveForcedFumbles;

    @Nullable
    private final Integer defensiveInterceptions;

    @Nullable
    private final Integer defensiveInterceptionsTouchdowns;

    @Nullable
    private final Integer defensiveInterceptionsYards;

    @Nullable
    private final Integer defensivePassesDefensed;

    @Nullable
    private final Double defensiveSacks;

    @Nullable
    private final Integer defensiveSafeties;

    @Nullable
    private final Integer defensiveTotalTackles;

    @Nullable
    private final Integer fumbleFumbles;

    @Nullable
    private final Integer fumbleLost;

    @Nullable
    private final Integer fumbleRecovery;

    @Nullable
    private final Integer fumbleSafety;
    private final int id;

    @Nullable
    private final Integer kickReturnsFairCatches;

    @Nullable
    private final Integer kickReturnsFumbles;

    @Nullable
    private final Integer kickReturnsLong;

    @Nullable
    private final Integer kickReturnsTotal;

    @Nullable
    private final Integer kickReturnsTouchdowns;

    @Nullable
    private final Integer kickReturnsYards;

    @Nullable
    private final Integer kickingExtraAttempts;

    @Nullable
    private final Integer kickingExtraMade;

    @Nullable
    private final Integer kickingFgAttempts;

    @Nullable
    private final Integer kickingFgAttempts20to29;

    @Nullable
    private final Integer kickingFgAttempts30to39;

    @Nullable
    private final Integer kickingFgAttempts40to49;

    @Nullable
    private final Integer kickingFgAttempts50plus;

    @Nullable
    private final Integer kickingFgBlocked;

    @Nullable
    private final Integer kickingFgLong;

    @Nullable
    private final Integer kickingFgMade;

    @Nullable
    private final Integer kickingFgMade1to19;

    @Nullable
    private final Integer kickingFgMade20to29;

    @Nullable
    private final Integer kickingFgMade30to39;

    @Nullable
    private final Integer kickingFgMade40to49;

    @Nullable
    private final Integer kickingFgMade50plus;

    @Nullable
    private final Integer kickingTotalPoints;

    @Nullable
    private final Integer kickoffReturns;

    @Nullable
    private final Integer kickoffTotal;

    @Nullable
    private final Integer kickoffTouchbacks;

    @Nullable
    private final Double passerRating;

    @Nullable
    private final Integer passingAttempts;

    @Nullable
    private final Integer passingCompletions;

    @Nullable
    private final Integer passingFirstDowns;

    @Nullable
    private final Integer passingInterceptions;

    @Nullable
    private final Integer passingLongest;

    @Nullable
    private final Integer passingNetYards;

    @Nullable
    private final Integer passingSacked;

    @Nullable
    private final Integer passingTouchdowns;

    @Nullable
    private final Integer passingYards;

    @Nullable
    private final Integer puntReturnsFairCatches;

    @Nullable
    private final Integer puntReturnsLong;

    @Nullable
    private final Integer puntReturnsTotal;

    @Nullable
    private final Integer puntReturnsTouchdowns;

    @Nullable
    private final Integer puntReturnsYards;

    @Nullable
    private final Integer puntingBlocked;

    @Nullable
    private final Integer puntingInside20;

    @Nullable
    private final Integer puntingLongest;

    @Nullable
    private final Integer puntingNetYards;

    @Nullable
    private final Integer puntingTotal;

    @Nullable
    private final Integer puntingTouchbacks;

    @Nullable
    private final Integer puntingYards;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer receivingFirstDowns;

    @Nullable
    private final Integer receivingLongest;

    @Nullable
    private final Integer receivingReceptions;

    @Nullable
    private final Integer receivingTargets;

    @Nullable
    private final Integer receivingTouchdowns;

    @Nullable
    private final Integer receivingYards;

    @Nullable
    private final Integer rushingAttempts;

    @Nullable
    private final Integer rushingFirstDowns;

    @Nullable
    private final Integer rushingFumbles;

    @Nullable
    private final Integer rushingLongest;

    @Nullable
    private final Integer rushingTouchdowns;

    @Nullable
    private final Integer rushingYards;

    @NotNull
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmericanFootballPlayerSeasonStatistics(int i, int i2, int i3, int i4, String str, Integer num, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Double d2, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, Integer num35, Integer num36, Integer num37, Integer num38, Integer num39, Integer num40, Integer num41, Integer num42, Integer num43, Integer num44, Integer num45, Integer num46, Integer num47, Integer num48, Integer num49, Integer num50, Integer num51, Integer num52, Integer num53, Integer num54, Integer num55, Integer num56, Integer num57, Integer num58, Integer num59, Integer num60, Integer num61, Integer num62, Integer num63, Integer num64, Integer num65, Integer num66, Integer num67, Integer num68, Integer num69, Integer num70, Integer num71, Integer num72, Double d3, t5h t5hVar) {
        super(i, t5hVar);
        Integer num73 = num40;
        Double d4 = null;
        if ((4095 != (i3 & 4095)) || ((-1 != i) | (-1 != i2))) {
            oea.y(new int[]{i, i2, i3}, new int[]{-1, -1, 4095}, AmericanFootballPlayerSeasonStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i4;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.defensiveAssistTackles = num2;
        this.defensiveCombineTackles = num3;
        this.defensiveForcedFumbles = num4;
        this.defensiveInterceptions = num5;
        this.defensiveInterceptionsTouchdowns = num6;
        this.defensiveInterceptionsYards = num7;
        this.defensivePassesDefensed = num8;
        this.defensiveSacks = d2;
        this.defensiveSafeties = num9;
        this.defensiveTotalTackles = num10;
        this.fumbleFumbles = num11;
        this.fumbleLost = num12;
        this.fumbleRecovery = num13;
        this.fumbleSafety = num14;
        this.kickReturnsFumbles = num15;
        this.kickReturnsLong = num16;
        this.kickReturnsTotal = num17;
        this.kickReturnsTouchdowns = num18;
        this.kickReturnsYards = num19;
        this.kickReturnsFairCatches = num20;
        this.kickingExtraAttempts = num21;
        this.kickingExtraMade = num22;
        this.kickingFgAttempts = num23;
        this.kickingFgAttempts20to29 = num24;
        this.kickingFgAttempts30to39 = num25;
        this.kickingFgAttempts40to49 = num26;
        this.kickingFgAttempts50plus = num27;
        this.kickingFgBlocked = num28;
        this.kickingFgLong = num29;
        this.kickingFgMade = num30;
        this.kickingFgMade20to29 = num31;
        this.kickingFgMade30to39 = num32;
        this.kickingFgMade40to49 = num33;
        this.kickingFgMade50plus = num34;
        this.kickingTotalPoints = num35;
        this.kickingFgMade1to19 = num36;
        this.kickoffReturns = num37;
        this.kickoffTotal = num38;
        this.kickoffTouchbacks = num39;
        this.passingAttempts = num73;
        this.passingCompletions = num41;
        this.passingInterceptions = num42;
        this.passingLongest = num43;
        this.passingNetYards = num44;
        this.passingSacked = num45;
        this.passingTouchdowns = num46;
        this.passingYards = num47;
        this.passingFirstDowns = num48;
        this.puntReturnsLong = num49;
        this.puntReturnsTotal = num50;
        this.puntReturnsTouchdowns = num51;
        this.puntReturnsYards = num52;
        this.puntReturnsFairCatches = num53;
        this.puntingBlocked = num54;
        this.puntingInside20 = num55;
        this.puntingLongest = num56;
        this.puntingNetYards = num57;
        this.puntingTotal = num58;
        this.puntingTouchbacks = num59;
        this.puntingYards = num60;
        this.receivingFirstDowns = num61;
        this.receivingLongest = num62;
        this.receivingReceptions = num63;
        this.receivingTouchdowns = num64;
        this.receivingYards = num65;
        this.receivingTargets = num66;
        this.rushingAttempts = num67;
        this.rushingFumbles = num68;
        this.rushingLongest = num69;
        this.rushingTouchdowns = num70;
        this.rushingYards = num71;
        this.rushingFirstDowns = num72;
        if ((i3 & 4096) != 0) {
            this.passerRating = d3;
            return;
        }
        if (num73 != null) {
            num73 = num73.intValue() == 0 ? null : num73;
            if (num73 != null) {
                double intValue = num73.intValue();
                d4 = Double.valueOf(Math.rint((((((Math.min(Math.max((((num41 != null ? num41.intValue() : 0) / intValue) - 0.3d) * 5.0d, 0.0d), 2.375d) + Math.min(Math.max((((num47 != null ? num47.intValue() : 0) / intValue) - 3.0d) * 0.25d, 0.0d), 2.375d)) + Math.min(Math.max(((num46 != null ? num46.intValue() : 0) / intValue) * 20.0d, 0.0d), 2.375d)) + Math.min(Math.max(2.375d - (((num42 != null ? num42.intValue() : 0) / intValue) * 25.0d), 0.0d), 2.375d)) / 6.0d) * 100.0d) * 10.0d) / 10.0d);
            }
        }
        this.passerRating = d4;
    }

    public static /* synthetic */ AmericanFootballPlayerSeasonStatistics copy$default(AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics, int i, String str, Integer num, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Double d2, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, Integer num35, Integer num36, Integer num37, Integer num38, Integer num39, Integer num40, Integer num41, Integer num42, Integer num43, Integer num44, Integer num45, Integer num46, Integer num47, Integer num48, Integer num49, Integer num50, Integer num51, Integer num52, Integer num53, Integer num54, Integer num55, Integer num56, Integer num57, Integer num58, Integer num59, Integer num60, Integer num61, Integer num62, Integer num63, Integer num64, Integer num65, Integer num66, Integer num67, Integer num68, Integer num69, Integer num70, Integer num71, Integer num72, int i2, int i3, int i4, Object obj) {
        int i5 = (i2 & 1) != 0 ? americanFootballPlayerSeasonStatistics.id : i;
        return americanFootballPlayerSeasonStatistics.copy(i5, (i2 & 2) != 0 ? americanFootballPlayerSeasonStatistics.type : str, (i2 & 4) != 0 ? americanFootballPlayerSeasonStatistics.appearances : num, (i2 & 8) != 0 ? americanFootballPlayerSeasonStatistics.rating : d, (i2 & 16) != 0 ? americanFootballPlayerSeasonStatistics.defensiveAssistTackles : num2, (i2 & 32) != 0 ? americanFootballPlayerSeasonStatistics.defensiveCombineTackles : num3, (i2 & 64) != 0 ? americanFootballPlayerSeasonStatistics.defensiveForcedFumbles : num4, (i2 & 128) != 0 ? americanFootballPlayerSeasonStatistics.defensiveInterceptions : num5, (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? americanFootballPlayerSeasonStatistics.defensiveInterceptionsTouchdowns : num6, (i2 & 512) != 0 ? americanFootballPlayerSeasonStatistics.defensiveInterceptionsYards : num7, (i2 & 1024) != 0 ? americanFootballPlayerSeasonStatistics.defensivePassesDefensed : num8, (i2 & a.o) != 0 ? americanFootballPlayerSeasonStatistics.defensiveSacks : d2, (i2 & 4096) != 0 ? americanFootballPlayerSeasonStatistics.defensiveSafeties : num9, (i2 & 8192) != 0 ? americanFootballPlayerSeasonStatistics.defensiveTotalTackles : num10, (i2 & 16384) != 0 ? americanFootballPlayerSeasonStatistics.fumbleFumbles : num11, (i2 & 32768) != 0 ? americanFootballPlayerSeasonStatistics.fumbleLost : num12, (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? americanFootballPlayerSeasonStatistics.fumbleRecovery : num13, (i2 & 131072) != 0 ? americanFootballPlayerSeasonStatistics.fumbleSafety : num14, (i2 & 262144) != 0 ? americanFootballPlayerSeasonStatistics.kickReturnsFumbles : num15, (i2 & 524288) != 0 ? americanFootballPlayerSeasonStatistics.kickReturnsLong : num16, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? americanFootballPlayerSeasonStatistics.kickReturnsTotal : num17, (i2 & 2097152) != 0 ? americanFootballPlayerSeasonStatistics.kickReturnsTouchdowns : num18, (i2 & 4194304) != 0 ? americanFootballPlayerSeasonStatistics.kickReturnsYards : num19, (i2 & 8388608) != 0 ? americanFootballPlayerSeasonStatistics.kickReturnsFairCatches : num20, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? americanFootballPlayerSeasonStatistics.kickingExtraAttempts : num21, (i2 & 33554432) != 0 ? americanFootballPlayerSeasonStatistics.kickingExtraMade : num22, (i2 & 67108864) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgAttempts : num23, (i2 & 134217728) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgAttempts20to29 : num24, (i2 & 268435456) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgAttempts30to39 : num25, (i2 & 536870912) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgAttempts40to49 : num26, (i2 & 1073741824) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgAttempts50plus : num27, (i2 & Integer.MIN_VALUE) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgBlocked : num28, (i3 & 1) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgLong : num29, (i3 & 2) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgMade : num30, (i3 & 4) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgMade20to29 : num31, (i3 & 8) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgMade30to39 : num32, (i3 & 16) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgMade40to49 : num33, (i3 & 32) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgMade50plus : num34, (i3 & 64) != 0 ? americanFootballPlayerSeasonStatistics.kickingTotalPoints : num35, (i3 & 128) != 0 ? americanFootballPlayerSeasonStatistics.kickingFgMade1to19 : num36, (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? americanFootballPlayerSeasonStatistics.kickoffReturns : num37, (i3 & 512) != 0 ? americanFootballPlayerSeasonStatistics.kickoffTotal : num38, (i3 & 1024) != 0 ? americanFootballPlayerSeasonStatistics.kickoffTouchbacks : num39, (i3 & a.o) != 0 ? americanFootballPlayerSeasonStatistics.passingAttempts : num40, (i3 & 4096) != 0 ? americanFootballPlayerSeasonStatistics.passingCompletions : num41, (i3 & 8192) != 0 ? americanFootballPlayerSeasonStatistics.passingInterceptions : num42, (i3 & 16384) != 0 ? americanFootballPlayerSeasonStatistics.passingLongest : num43, (i3 & 32768) != 0 ? americanFootballPlayerSeasonStatistics.passingNetYards : num44, (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? americanFootballPlayerSeasonStatistics.passingSacked : num45, (i3 & 131072) != 0 ? americanFootballPlayerSeasonStatistics.passingTouchdowns : num46, (i3 & 262144) != 0 ? americanFootballPlayerSeasonStatistics.passingYards : num47, (i3 & 524288) != 0 ? americanFootballPlayerSeasonStatistics.passingFirstDowns : num48, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? americanFootballPlayerSeasonStatistics.puntReturnsLong : num49, (i3 & 2097152) != 0 ? americanFootballPlayerSeasonStatistics.puntReturnsTotal : num50, (i3 & 4194304) != 0 ? americanFootballPlayerSeasonStatistics.puntReturnsTouchdowns : num51, (i3 & 8388608) != 0 ? americanFootballPlayerSeasonStatistics.puntReturnsYards : num52, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? americanFootballPlayerSeasonStatistics.puntReturnsFairCatches : num53, (i3 & 33554432) != 0 ? americanFootballPlayerSeasonStatistics.puntingBlocked : num54, (i3 & 67108864) != 0 ? americanFootballPlayerSeasonStatistics.puntingInside20 : num55, (i3 & 134217728) != 0 ? americanFootballPlayerSeasonStatistics.puntingLongest : num56, (i3 & 268435456) != 0 ? americanFootballPlayerSeasonStatistics.puntingNetYards : num57, (i3 & 536870912) != 0 ? americanFootballPlayerSeasonStatistics.puntingTotal : num58, (i3 & 1073741824) != 0 ? americanFootballPlayerSeasonStatistics.puntingTouchbacks : num59, (i3 & Integer.MIN_VALUE) != 0 ? americanFootballPlayerSeasonStatistics.puntingYards : num60, (i4 & 1) != 0 ? americanFootballPlayerSeasonStatistics.receivingFirstDowns : num61, (i4 & 2) != 0 ? americanFootballPlayerSeasonStatistics.receivingLongest : num62, (i4 & 4) != 0 ? americanFootballPlayerSeasonStatistics.receivingReceptions : num63, (i4 & 8) != 0 ? americanFootballPlayerSeasonStatistics.receivingTouchdowns : num64, (i4 & 16) != 0 ? americanFootballPlayerSeasonStatistics.receivingYards : num65, (i4 & 32) != 0 ? americanFootballPlayerSeasonStatistics.receivingTargets : num66, (i4 & 64) != 0 ? americanFootballPlayerSeasonStatistics.rushingAttempts : num67, (i4 & 128) != 0 ? americanFootballPlayerSeasonStatistics.rushingFumbles : num68, (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? americanFootballPlayerSeasonStatistics.rushingLongest : num69, (i4 & 512) != 0 ? americanFootballPlayerSeasonStatistics.rushingTouchdowns : num70, (i4 & 1024) != 0 ? americanFootballPlayerSeasonStatistics.rushingYards : num71, (i4 & a.o) != 0 ? americanFootballPlayerSeasonStatistics.rushingFirstDowns : num72);
    }

    public static final /* synthetic */ void write$Self$model_release(AmericanFootballPlayerSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
        AbstractPlayerSeasonStatistics.write$Self(self, output, serialDesc);
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.getType());
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.getAppearances());
        h75 h75Var = h75.a;
        output.h(serialDesc, 3, h75Var, self.getRating());
        output.h(serialDesc, 4, a7aVar, self.defensiveAssistTackles);
        output.h(serialDesc, 5, a7aVar, self.defensiveCombineTackles);
        output.h(serialDesc, 6, a7aVar, self.defensiveForcedFumbles);
        output.h(serialDesc, 7, a7aVar, self.defensiveInterceptions);
        output.h(serialDesc, 8, a7aVar, self.defensiveInterceptionsTouchdowns);
        output.h(serialDesc, 9, a7aVar, self.defensiveInterceptionsYards);
        output.h(serialDesc, 10, a7aVar, self.defensivePassesDefensed);
        output.h(serialDesc, 11, h75Var, self.defensiveSacks);
        output.h(serialDesc, 12, a7aVar, self.defensiveSafeties);
        output.h(serialDesc, 13, a7aVar, self.defensiveTotalTackles);
        output.h(serialDesc, 14, a7aVar, self.fumbleFumbles);
        output.h(serialDesc, 15, a7aVar, self.fumbleLost);
        output.h(serialDesc, 16, a7aVar, self.fumbleRecovery);
        output.h(serialDesc, 17, a7aVar, self.fumbleSafety);
        output.h(serialDesc, 18, a7aVar, self.kickReturnsFumbles);
        output.h(serialDesc, 19, a7aVar, self.kickReturnsLong);
        output.h(serialDesc, 20, a7aVar, self.kickReturnsTotal);
        output.h(serialDesc, 21, a7aVar, self.kickReturnsTouchdowns);
        output.h(serialDesc, 22, a7aVar, self.kickReturnsYards);
        output.h(serialDesc, 23, a7aVar, self.kickReturnsFairCatches);
        output.h(serialDesc, 24, a7aVar, self.kickingExtraAttempts);
        output.h(serialDesc, 25, a7aVar, self.kickingExtraMade);
        output.h(serialDesc, 26, a7aVar, self.kickingFgAttempts);
        output.h(serialDesc, 27, a7aVar, self.kickingFgAttempts20to29);
        output.h(serialDesc, 28, a7aVar, self.kickingFgAttempts30to39);
        output.h(serialDesc, 29, a7aVar, self.kickingFgAttempts40to49);
        output.h(serialDesc, 30, a7aVar, self.kickingFgAttempts50plus);
        output.h(serialDesc, 31, a7aVar, self.kickingFgBlocked);
        output.h(serialDesc, 32, a7aVar, self.kickingFgLong);
        output.h(serialDesc, 33, a7aVar, self.kickingFgMade);
        output.h(serialDesc, 34, a7aVar, self.kickingFgMade20to29);
        output.h(serialDesc, 35, a7aVar, self.kickingFgMade30to39);
        output.h(serialDesc, 36, a7aVar, self.kickingFgMade40to49);
        output.h(serialDesc, 37, a7aVar, self.kickingFgMade50plus);
        output.h(serialDesc, 38, a7aVar, self.kickingTotalPoints);
        output.h(serialDesc, 39, a7aVar, self.kickingFgMade1to19);
        output.h(serialDesc, 40, a7aVar, self.kickoffReturns);
        output.h(serialDesc, 41, a7aVar, self.kickoffTotal);
        output.h(serialDesc, 42, a7aVar, self.kickoffTouchbacks);
        output.h(serialDesc, 43, a7aVar, self.passingAttempts);
        output.h(serialDesc, 44, a7aVar, self.passingCompletions);
        output.h(serialDesc, 45, a7aVar, self.passingInterceptions);
        output.h(serialDesc, 46, a7aVar, self.passingLongest);
        output.h(serialDesc, 47, a7aVar, self.passingNetYards);
        output.h(serialDesc, 48, a7aVar, self.passingSacked);
        output.h(serialDesc, 49, a7aVar, self.passingTouchdowns);
        output.h(serialDesc, 50, a7aVar, self.passingYards);
        output.h(serialDesc, 51, a7aVar, self.passingFirstDowns);
        output.h(serialDesc, 52, a7aVar, self.puntReturnsLong);
        output.h(serialDesc, 53, a7aVar, self.puntReturnsTotal);
        output.h(serialDesc, 54, a7aVar, self.puntReturnsTouchdowns);
        output.h(serialDesc, 55, a7aVar, self.puntReturnsYards);
        output.h(serialDesc, 56, a7aVar, self.puntReturnsFairCatches);
        output.h(serialDesc, 57, a7aVar, self.puntingBlocked);
        output.h(serialDesc, 58, a7aVar, self.puntingInside20);
        output.h(serialDesc, 59, a7aVar, self.puntingLongest);
        output.h(serialDesc, 60, a7aVar, self.puntingNetYards);
        output.h(serialDesc, 61, a7aVar, self.puntingTotal);
        output.h(serialDesc, 62, a7aVar, self.puntingTouchbacks);
        output.h(serialDesc, 63, a7aVar, self.puntingYards);
        output.h(serialDesc, 64, a7aVar, self.receivingFirstDowns);
        output.h(serialDesc, 65, a7aVar, self.receivingLongest);
        output.h(serialDesc, 66, a7aVar, self.receivingReceptions);
        output.h(serialDesc, 67, a7aVar, self.receivingTouchdowns);
        output.h(serialDesc, 68, a7aVar, self.receivingYards);
        output.h(serialDesc, 69, a7aVar, self.receivingTargets);
        output.h(serialDesc, 70, a7aVar, self.rushingAttempts);
        output.h(serialDesc, 71, a7aVar, self.rushingFumbles);
        output.h(serialDesc, 72, a7aVar, self.rushingLongest);
        output.h(serialDesc, 73, a7aVar, self.rushingTouchdowns);
        output.h(serialDesc, 74, a7aVar, self.rushingYards);
        output.h(serialDesc, 75, a7aVar, self.rushingFirstDowns);
        if (!output.o(serialDesc)) {
            Double d = self.passerRating;
            Integer num = self.passingAttempts;
            Double d2 = null;
            if (num != null) {
                if (num.intValue() == 0) {
                    num = null;
                }
                if (num != null) {
                    double intValue = num.intValue();
                    double min = Math.min(Math.max((((self.passingCompletions != null ? r8.intValue() : 0) / intValue) - 0.3d) * 5.0d, 0.0d), 2.375d);
                    double min2 = Math.min(Math.max((((self.passingYards != null ? r14.intValue() : 0) / intValue) - 3.0d) * 0.25d, 0.0d), 2.375d);
                    d2 = Double.valueOf(Math.rint((((((min + min2) + Math.min(Math.max(((self.passingTouchdowns != null ? r4.intValue() : 0) / intValue) * 20.0d, 0.0d), 2.375d)) + Math.min(Math.max(2.375d - (((self.passingInterceptions != null ? r4.intValue() : 0) / intValue) * 25.0d), 0.0d), 2.375d)) / 6.0d) * 100.0d) * 10.0d) / 10.0d);
                }
            }
            if (Intrinsics.c(d, d2)) {
                return;
            }
        }
        output.h(serialDesc, 76, h75Var, self.passerRating);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getDefensiveInterceptionsYards() {
        return this.defensiveInterceptionsYards;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getDefensivePassesDefensed() {
        return this.defensivePassesDefensed;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getDefensiveSacks() {
        return this.defensiveSacks;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getDefensiveSafeties() {
        return this.defensiveSafeties;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getDefensiveTotalTackles() {
        return this.defensiveTotalTackles;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getFumbleFumbles() {
        return this.fumbleFumbles;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getFumbleLost() {
        return this.fumbleLost;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getFumbleRecovery() {
        return this.fumbleRecovery;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getFumbleSafety() {
        return this.fumbleSafety;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getKickReturnsFumbles() {
        return this.kickReturnsFumbles;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getKickReturnsLong() {
        return this.kickReturnsLong;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getKickReturnsTotal() {
        return this.kickReturnsTotal;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getKickReturnsTouchdowns() {
        return this.kickReturnsTouchdowns;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getKickReturnsYards() {
        return this.kickReturnsYards;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getKickReturnsFairCatches() {
        return this.kickReturnsFairCatches;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getKickingExtraAttempts() {
        return this.kickingExtraAttempts;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getKickingExtraMade() {
        return this.kickingExtraMade;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getKickingFgAttempts() {
        return this.kickingFgAttempts;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getKickingFgAttempts20to29() {
        return this.kickingFgAttempts20to29;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Integer getKickingFgAttempts30to39() {
        return this.kickingFgAttempts30to39;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getKickingFgAttempts40to49() {
        return this.kickingFgAttempts40to49;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getKickingFgAttempts50plus() {
        return this.kickingFgAttempts50plus;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getKickingFgBlocked() {
        return this.kickingFgBlocked;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Integer getKickingFgLong() {
        return this.kickingFgLong;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Integer getKickingFgMade() {
        return this.kickingFgMade;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Integer getKickingFgMade20to29() {
        return this.kickingFgMade20to29;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final Integer getKickingFgMade30to39() {
        return this.kickingFgMade30to39;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final Integer getKickingFgMade40to49() {
        return this.kickingFgMade40to49;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final Integer getKickingFgMade50plus() {
        return this.kickingFgMade50plus;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final Integer getKickingTotalPoints() {
        return this.kickingTotalPoints;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component40, reason: from getter */
    public final Integer getKickingFgMade1to19() {
        return this.kickingFgMade1to19;
    }

    @Nullable
    /* renamed from: component41, reason: from getter */
    public final Integer getKickoffReturns() {
        return this.kickoffReturns;
    }

    @Nullable
    /* renamed from: component42, reason: from getter */
    public final Integer getKickoffTotal() {
        return this.kickoffTotal;
    }

    @Nullable
    /* renamed from: component43, reason: from getter */
    public final Integer getKickoffTouchbacks() {
        return this.kickoffTouchbacks;
    }

    @Nullable
    /* renamed from: component44, reason: from getter */
    public final Integer getPassingAttempts() {
        return this.passingAttempts;
    }

    @Nullable
    /* renamed from: component45, reason: from getter */
    public final Integer getPassingCompletions() {
        return this.passingCompletions;
    }

    @Nullable
    /* renamed from: component46, reason: from getter */
    public final Integer getPassingInterceptions() {
        return this.passingInterceptions;
    }

    @Nullable
    /* renamed from: component47, reason: from getter */
    public final Integer getPassingLongest() {
        return this.passingLongest;
    }

    @Nullable
    /* renamed from: component48, reason: from getter */
    public final Integer getPassingNetYards() {
        return this.passingNetYards;
    }

    @Nullable
    /* renamed from: component49, reason: from getter */
    public final Integer getPassingSacked() {
        return this.passingSacked;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getDefensiveAssistTackles() {
        return this.defensiveAssistTackles;
    }

    @Nullable
    /* renamed from: component50, reason: from getter */
    public final Integer getPassingTouchdowns() {
        return this.passingTouchdowns;
    }

    @Nullable
    /* renamed from: component51, reason: from getter */
    public final Integer getPassingYards() {
        return this.passingYards;
    }

    @Nullable
    /* renamed from: component52, reason: from getter */
    public final Integer getPassingFirstDowns() {
        return this.passingFirstDowns;
    }

    @Nullable
    /* renamed from: component53, reason: from getter */
    public final Integer getPuntReturnsLong() {
        return this.puntReturnsLong;
    }

    @Nullable
    /* renamed from: component54, reason: from getter */
    public final Integer getPuntReturnsTotal() {
        return this.puntReturnsTotal;
    }

    @Nullable
    /* renamed from: component55, reason: from getter */
    public final Integer getPuntReturnsTouchdowns() {
        return this.puntReturnsTouchdowns;
    }

    @Nullable
    /* renamed from: component56, reason: from getter */
    public final Integer getPuntReturnsYards() {
        return this.puntReturnsYards;
    }

    @Nullable
    /* renamed from: component57, reason: from getter */
    public final Integer getPuntReturnsFairCatches() {
        return this.puntReturnsFairCatches;
    }

    @Nullable
    /* renamed from: component58, reason: from getter */
    public final Integer getPuntingBlocked() {
        return this.puntingBlocked;
    }

    @Nullable
    /* renamed from: component59, reason: from getter */
    public final Integer getPuntingInside20() {
        return this.puntingInside20;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getDefensiveCombineTackles() {
        return this.defensiveCombineTackles;
    }

    @Nullable
    /* renamed from: component60, reason: from getter */
    public final Integer getPuntingLongest() {
        return this.puntingLongest;
    }

    @Nullable
    /* renamed from: component61, reason: from getter */
    public final Integer getPuntingNetYards() {
        return this.puntingNetYards;
    }

    @Nullable
    /* renamed from: component62, reason: from getter */
    public final Integer getPuntingTotal() {
        return this.puntingTotal;
    }

    @Nullable
    /* renamed from: component63, reason: from getter */
    public final Integer getPuntingTouchbacks() {
        return this.puntingTouchbacks;
    }

    @Nullable
    /* renamed from: component64, reason: from getter */
    public final Integer getPuntingYards() {
        return this.puntingYards;
    }

    @Nullable
    /* renamed from: component65, reason: from getter */
    public final Integer getReceivingFirstDowns() {
        return this.receivingFirstDowns;
    }

    @Nullable
    /* renamed from: component66, reason: from getter */
    public final Integer getReceivingLongest() {
        return this.receivingLongest;
    }

    @Nullable
    /* renamed from: component67, reason: from getter */
    public final Integer getReceivingReceptions() {
        return this.receivingReceptions;
    }

    @Nullable
    /* renamed from: component68, reason: from getter */
    public final Integer getReceivingTouchdowns() {
        return this.receivingTouchdowns;
    }

    @Nullable
    /* renamed from: component69, reason: from getter */
    public final Integer getReceivingYards() {
        return this.receivingYards;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getDefensiveForcedFumbles() {
        return this.defensiveForcedFumbles;
    }

    @Nullable
    /* renamed from: component70, reason: from getter */
    public final Integer getReceivingTargets() {
        return this.receivingTargets;
    }

    @Nullable
    /* renamed from: component71, reason: from getter */
    public final Integer getRushingAttempts() {
        return this.rushingAttempts;
    }

    @Nullable
    /* renamed from: component72, reason: from getter */
    public final Integer getRushingFumbles() {
        return this.rushingFumbles;
    }

    @Nullable
    /* renamed from: component73, reason: from getter */
    public final Integer getRushingLongest() {
        return this.rushingLongest;
    }

    @Nullable
    /* renamed from: component74, reason: from getter */
    public final Integer getRushingTouchdowns() {
        return this.rushingTouchdowns;
    }

    @Nullable
    /* renamed from: component75, reason: from getter */
    public final Integer getRushingYards() {
        return this.rushingYards;
    }

    @Nullable
    /* renamed from: component76, reason: from getter */
    public final Integer getRushingFirstDowns() {
        return this.rushingFirstDowns;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getDefensiveInterceptions() {
        return this.defensiveInterceptions;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getDefensiveInterceptionsTouchdowns() {
        return this.defensiveInterceptionsTouchdowns;
    }

    @NotNull
    public final AmericanFootballPlayerSeasonStatistics copy(int id, @NotNull String type, @Nullable Integer appearances, @Nullable Double rating, @Nullable Integer defensiveAssistTackles, @Nullable Integer defensiveCombineTackles, @Nullable Integer defensiveForcedFumbles, @Nullable Integer defensiveInterceptions, @Nullable Integer defensiveInterceptionsTouchdowns, @Nullable Integer defensiveInterceptionsYards, @Nullable Integer defensivePassesDefensed, @Nullable Double defensiveSacks, @Nullable Integer defensiveSafeties, @Nullable Integer defensiveTotalTackles, @Nullable Integer fumbleFumbles, @Nullable Integer fumbleLost, @Nullable Integer fumbleRecovery, @Nullable Integer fumbleSafety, @Nullable Integer kickReturnsFumbles, @Nullable Integer kickReturnsLong, @Nullable Integer kickReturnsTotal, @Nullable Integer kickReturnsTouchdowns, @Nullable Integer kickReturnsYards, @Nullable Integer kickReturnsFairCatches, @Nullable Integer kickingExtraAttempts, @Nullable Integer kickingExtraMade, @Nullable Integer kickingFgAttempts, @Nullable Integer kickingFgAttempts20to29, @Nullable Integer kickingFgAttempts30to39, @Nullable Integer kickingFgAttempts40to49, @Nullable Integer kickingFgAttempts50plus, @Nullable Integer kickingFgBlocked, @Nullable Integer kickingFgLong, @Nullable Integer kickingFgMade, @Nullable Integer kickingFgMade20to29, @Nullable Integer kickingFgMade30to39, @Nullable Integer kickingFgMade40to49, @Nullable Integer kickingFgMade50plus, @Nullable Integer kickingTotalPoints, @Nullable Integer kickingFgMade1to19, @Nullable Integer kickoffReturns, @Nullable Integer kickoffTotal, @Nullable Integer kickoffTouchbacks, @Nullable Integer passingAttempts, @Nullable Integer passingCompletions, @Nullable Integer passingInterceptions, @Nullable Integer passingLongest, @Nullable Integer passingNetYards, @Nullable Integer passingSacked, @Nullable Integer passingTouchdowns, @Nullable Integer passingYards, @Nullable Integer passingFirstDowns, @Nullable Integer puntReturnsLong, @Nullable Integer puntReturnsTotal, @Nullable Integer puntReturnsTouchdowns, @Nullable Integer puntReturnsYards, @Nullable Integer puntReturnsFairCatches, @Nullable Integer puntingBlocked, @Nullable Integer puntingInside20, @Nullable Integer puntingLongest, @Nullable Integer puntingNetYards, @Nullable Integer puntingTotal, @Nullable Integer puntingTouchbacks, @Nullable Integer puntingYards, @Nullable Integer receivingFirstDowns, @Nullable Integer receivingLongest, @Nullable Integer receivingReceptions, @Nullable Integer receivingTouchdowns, @Nullable Integer receivingYards, @Nullable Integer receivingTargets, @Nullable Integer rushingAttempts, @Nullable Integer rushingFumbles, @Nullable Integer rushingLongest, @Nullable Integer rushingTouchdowns, @Nullable Integer rushingYards, @Nullable Integer rushingFirstDowns) {
        type.getClass();
        return new AmericanFootballPlayerSeasonStatistics(id, type, appearances, rating, defensiveAssistTackles, defensiveCombineTackles, defensiveForcedFumbles, defensiveInterceptions, defensiveInterceptionsTouchdowns, defensiveInterceptionsYards, defensivePassesDefensed, defensiveSacks, defensiveSafeties, defensiveTotalTackles, fumbleFumbles, fumbleLost, fumbleRecovery, fumbleSafety, kickReturnsFumbles, kickReturnsLong, kickReturnsTotal, kickReturnsTouchdowns, kickReturnsYards, kickReturnsFairCatches, kickingExtraAttempts, kickingExtraMade, kickingFgAttempts, kickingFgAttempts20to29, kickingFgAttempts30to39, kickingFgAttempts40to49, kickingFgAttempts50plus, kickingFgBlocked, kickingFgLong, kickingFgMade, kickingFgMade20to29, kickingFgMade30to39, kickingFgMade40to49, kickingFgMade50plus, kickingTotalPoints, kickingFgMade1to19, kickoffReturns, kickoffTotal, kickoffTouchbacks, passingAttempts, passingCompletions, passingInterceptions, passingLongest, passingNetYards, passingSacked, passingTouchdowns, passingYards, passingFirstDowns, puntReturnsLong, puntReturnsTotal, puntReturnsTouchdowns, puntReturnsYards, puntReturnsFairCatches, puntingBlocked, puntingInside20, puntingLongest, puntingNetYards, puntingTotal, puntingTouchbacks, puntingYards, receivingFirstDowns, receivingLongest, receivingReceptions, receivingTouchdowns, receivingYards, receivingTargets, rushingAttempts, rushingFumbles, rushingLongest, rushingTouchdowns, rushingYards, rushingFirstDowns);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmericanFootballPlayerSeasonStatistics)) {
            return false;
        }
        AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) other;
        return this.id == americanFootballPlayerSeasonStatistics.id && Intrinsics.c(this.type, americanFootballPlayerSeasonStatistics.type) && Intrinsics.c(this.appearances, americanFootballPlayerSeasonStatistics.appearances) && Intrinsics.c(this.rating, americanFootballPlayerSeasonStatistics.rating) && Intrinsics.c(this.defensiveAssistTackles, americanFootballPlayerSeasonStatistics.defensiveAssistTackles) && Intrinsics.c(this.defensiveCombineTackles, americanFootballPlayerSeasonStatistics.defensiveCombineTackles) && Intrinsics.c(this.defensiveForcedFumbles, americanFootballPlayerSeasonStatistics.defensiveForcedFumbles) && Intrinsics.c(this.defensiveInterceptions, americanFootballPlayerSeasonStatistics.defensiveInterceptions) && Intrinsics.c(this.defensiveInterceptionsTouchdowns, americanFootballPlayerSeasonStatistics.defensiveInterceptionsTouchdowns) && Intrinsics.c(this.defensiveInterceptionsYards, americanFootballPlayerSeasonStatistics.defensiveInterceptionsYards) && Intrinsics.c(this.defensivePassesDefensed, americanFootballPlayerSeasonStatistics.defensivePassesDefensed) && Intrinsics.c(this.defensiveSacks, americanFootballPlayerSeasonStatistics.defensiveSacks) && Intrinsics.c(this.defensiveSafeties, americanFootballPlayerSeasonStatistics.defensiveSafeties) && Intrinsics.c(this.defensiveTotalTackles, americanFootballPlayerSeasonStatistics.defensiveTotalTackles) && Intrinsics.c(this.fumbleFumbles, americanFootballPlayerSeasonStatistics.fumbleFumbles) && Intrinsics.c(this.fumbleLost, americanFootballPlayerSeasonStatistics.fumbleLost) && Intrinsics.c(this.fumbleRecovery, americanFootballPlayerSeasonStatistics.fumbleRecovery) && Intrinsics.c(this.fumbleSafety, americanFootballPlayerSeasonStatistics.fumbleSafety) && Intrinsics.c(this.kickReturnsFumbles, americanFootballPlayerSeasonStatistics.kickReturnsFumbles) && Intrinsics.c(this.kickReturnsLong, americanFootballPlayerSeasonStatistics.kickReturnsLong) && Intrinsics.c(this.kickReturnsTotal, americanFootballPlayerSeasonStatistics.kickReturnsTotal) && Intrinsics.c(this.kickReturnsTouchdowns, americanFootballPlayerSeasonStatistics.kickReturnsTouchdowns) && Intrinsics.c(this.kickReturnsYards, americanFootballPlayerSeasonStatistics.kickReturnsYards) && Intrinsics.c(this.kickReturnsFairCatches, americanFootballPlayerSeasonStatistics.kickReturnsFairCatches) && Intrinsics.c(this.kickingExtraAttempts, americanFootballPlayerSeasonStatistics.kickingExtraAttempts) && Intrinsics.c(this.kickingExtraMade, americanFootballPlayerSeasonStatistics.kickingExtraMade) && Intrinsics.c(this.kickingFgAttempts, americanFootballPlayerSeasonStatistics.kickingFgAttempts) && Intrinsics.c(this.kickingFgAttempts20to29, americanFootballPlayerSeasonStatistics.kickingFgAttempts20to29) && Intrinsics.c(this.kickingFgAttempts30to39, americanFootballPlayerSeasonStatistics.kickingFgAttempts30to39) && Intrinsics.c(this.kickingFgAttempts40to49, americanFootballPlayerSeasonStatistics.kickingFgAttempts40to49) && Intrinsics.c(this.kickingFgAttempts50plus, americanFootballPlayerSeasonStatistics.kickingFgAttempts50plus) && Intrinsics.c(this.kickingFgBlocked, americanFootballPlayerSeasonStatistics.kickingFgBlocked) && Intrinsics.c(this.kickingFgLong, americanFootballPlayerSeasonStatistics.kickingFgLong) && Intrinsics.c(this.kickingFgMade, americanFootballPlayerSeasonStatistics.kickingFgMade) && Intrinsics.c(this.kickingFgMade20to29, americanFootballPlayerSeasonStatistics.kickingFgMade20to29) && Intrinsics.c(this.kickingFgMade30to39, americanFootballPlayerSeasonStatistics.kickingFgMade30to39) && Intrinsics.c(this.kickingFgMade40to49, americanFootballPlayerSeasonStatistics.kickingFgMade40to49) && Intrinsics.c(this.kickingFgMade50plus, americanFootballPlayerSeasonStatistics.kickingFgMade50plus) && Intrinsics.c(this.kickingTotalPoints, americanFootballPlayerSeasonStatistics.kickingTotalPoints) && Intrinsics.c(this.kickingFgMade1to19, americanFootballPlayerSeasonStatistics.kickingFgMade1to19) && Intrinsics.c(this.kickoffReturns, americanFootballPlayerSeasonStatistics.kickoffReturns) && Intrinsics.c(this.kickoffTotal, americanFootballPlayerSeasonStatistics.kickoffTotal) && Intrinsics.c(this.kickoffTouchbacks, americanFootballPlayerSeasonStatistics.kickoffTouchbacks) && Intrinsics.c(this.passingAttempts, americanFootballPlayerSeasonStatistics.passingAttempts) && Intrinsics.c(this.passingCompletions, americanFootballPlayerSeasonStatistics.passingCompletions) && Intrinsics.c(this.passingInterceptions, americanFootballPlayerSeasonStatistics.passingInterceptions) && Intrinsics.c(this.passingLongest, americanFootballPlayerSeasonStatistics.passingLongest) && Intrinsics.c(this.passingNetYards, americanFootballPlayerSeasonStatistics.passingNetYards) && Intrinsics.c(this.passingSacked, americanFootballPlayerSeasonStatistics.passingSacked) && Intrinsics.c(this.passingTouchdowns, americanFootballPlayerSeasonStatistics.passingTouchdowns) && Intrinsics.c(this.passingYards, americanFootballPlayerSeasonStatistics.passingYards) && Intrinsics.c(this.passingFirstDowns, americanFootballPlayerSeasonStatistics.passingFirstDowns) && Intrinsics.c(this.puntReturnsLong, americanFootballPlayerSeasonStatistics.puntReturnsLong) && Intrinsics.c(this.puntReturnsTotal, americanFootballPlayerSeasonStatistics.puntReturnsTotal) && Intrinsics.c(this.puntReturnsTouchdowns, americanFootballPlayerSeasonStatistics.puntReturnsTouchdowns) && Intrinsics.c(this.puntReturnsYards, americanFootballPlayerSeasonStatistics.puntReturnsYards) && Intrinsics.c(this.puntReturnsFairCatches, americanFootballPlayerSeasonStatistics.puntReturnsFairCatches) && Intrinsics.c(this.puntingBlocked, americanFootballPlayerSeasonStatistics.puntingBlocked) && Intrinsics.c(this.puntingInside20, americanFootballPlayerSeasonStatistics.puntingInside20) && Intrinsics.c(this.puntingLongest, americanFootballPlayerSeasonStatistics.puntingLongest) && Intrinsics.c(this.puntingNetYards, americanFootballPlayerSeasonStatistics.puntingNetYards) && Intrinsics.c(this.puntingTotal, americanFootballPlayerSeasonStatistics.puntingTotal) && Intrinsics.c(this.puntingTouchbacks, americanFootballPlayerSeasonStatistics.puntingTouchbacks) && Intrinsics.c(this.puntingYards, americanFootballPlayerSeasonStatistics.puntingYards) && Intrinsics.c(this.receivingFirstDowns, americanFootballPlayerSeasonStatistics.receivingFirstDowns) && Intrinsics.c(this.receivingLongest, americanFootballPlayerSeasonStatistics.receivingLongest) && Intrinsics.c(this.receivingReceptions, americanFootballPlayerSeasonStatistics.receivingReceptions) && Intrinsics.c(this.receivingTouchdowns, americanFootballPlayerSeasonStatistics.receivingTouchdowns) && Intrinsics.c(this.receivingYards, americanFootballPlayerSeasonStatistics.receivingYards) && Intrinsics.c(this.receivingTargets, americanFootballPlayerSeasonStatistics.receivingTargets) && Intrinsics.c(this.rushingAttempts, americanFootballPlayerSeasonStatistics.rushingAttempts) && Intrinsics.c(this.rushingFumbles, americanFootballPlayerSeasonStatistics.rushingFumbles) && Intrinsics.c(this.rushingLongest, americanFootballPlayerSeasonStatistics.rushingLongest) && Intrinsics.c(this.rushingTouchdowns, americanFootballPlayerSeasonStatistics.rushingTouchdowns) && Intrinsics.c(this.rushingYards, americanFootballPlayerSeasonStatistics.rushingYards) && Intrinsics.c(this.rushingFirstDowns, americanFootballPlayerSeasonStatistics.rushingFirstDowns);
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    public final Integer getDefensiveAssistTackles() {
        return this.defensiveAssistTackles;
    }

    @Nullable
    public final Integer getDefensiveCombineTackles() {
        return this.defensiveCombineTackles;
    }

    @Nullable
    public final Integer getDefensiveForcedFumbles() {
        return this.defensiveForcedFumbles;
    }

    @Nullable
    public final Integer getDefensiveInterceptions() {
        return this.defensiveInterceptions;
    }

    @Nullable
    public final Integer getDefensiveInterceptionsTouchdowns() {
        return this.defensiveInterceptionsTouchdowns;
    }

    @Nullable
    public final Integer getDefensiveInterceptionsYards() {
        return this.defensiveInterceptionsYards;
    }

    @Nullable
    public final Integer getDefensivePassesDefensed() {
        return this.defensivePassesDefensed;
    }

    @Nullable
    public final Double getDefensiveSacks() {
        return this.defensiveSacks;
    }

    @Nullable
    public final Integer getDefensiveSafeties() {
        return this.defensiveSafeties;
    }

    @Nullable
    public final Integer getDefensiveTotalTackles() {
        return this.defensiveTotalTackles;
    }

    @Nullable
    public final Integer getFumbleFumbles() {
        return this.fumbleFumbles;
    }

    @Nullable
    public final Integer getFumbleLost() {
        return this.fumbleLost;
    }

    @Nullable
    public final Integer getFumbleRecovery() {
        return this.fumbleRecovery;
    }

    @Nullable
    public final Integer getFumbleSafety() {
        return this.fumbleSafety;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getKickReturnsFairCatches() {
        return this.kickReturnsFairCatches;
    }

    @Nullable
    public final Integer getKickReturnsFumbles() {
        return this.kickReturnsFumbles;
    }

    @Nullable
    public final Integer getKickReturnsLong() {
        return this.kickReturnsLong;
    }

    @Nullable
    public final Integer getKickReturnsTotal() {
        return this.kickReturnsTotal;
    }

    @Nullable
    public final Integer getKickReturnsTouchdowns() {
        return this.kickReturnsTouchdowns;
    }

    @Nullable
    public final Integer getKickReturnsYards() {
        return this.kickReturnsYards;
    }

    @Nullable
    public final Integer getKickingExtraAttempts() {
        return this.kickingExtraAttempts;
    }

    @Nullable
    public final Integer getKickingExtraMade() {
        return this.kickingExtraMade;
    }

    @Nullable
    public final Integer getKickingFgAttempts() {
        return this.kickingFgAttempts;
    }

    @Nullable
    public final Integer getKickingFgAttempts20to29() {
        return this.kickingFgAttempts20to29;
    }

    @Nullable
    public final Integer getKickingFgAttempts30to39() {
        return this.kickingFgAttempts30to39;
    }

    @Nullable
    public final Integer getKickingFgAttempts40to49() {
        return this.kickingFgAttempts40to49;
    }

    @Nullable
    public final Integer getKickingFgAttempts50plus() {
        return this.kickingFgAttempts50plus;
    }

    @Nullable
    public final Integer getKickingFgBlocked() {
        return this.kickingFgBlocked;
    }

    @Nullable
    public final Integer getKickingFgLong() {
        return this.kickingFgLong;
    }

    @Nullable
    public final Integer getKickingFgMade() {
        return this.kickingFgMade;
    }

    @Nullable
    public final Integer getKickingFgMade1to19() {
        return this.kickingFgMade1to19;
    }

    @Nullable
    public final Integer getKickingFgMade20to29() {
        return this.kickingFgMade20to29;
    }

    @Nullable
    public final Integer getKickingFgMade30to39() {
        return this.kickingFgMade30to39;
    }

    @Nullable
    public final Integer getKickingFgMade40to49() {
        return this.kickingFgMade40to49;
    }

    @Nullable
    public final Integer getKickingFgMade50plus() {
        return this.kickingFgMade50plus;
    }

    @Nullable
    public final Integer getKickingTotalPoints() {
        return this.kickingTotalPoints;
    }

    @Nullable
    public final Integer getKickoffReturns() {
        return this.kickoffReturns;
    }

    @Nullable
    public final Integer getKickoffTotal() {
        return this.kickoffTotal;
    }

    @Nullable
    public final Integer getKickoffTouchbacks() {
        return this.kickoffTouchbacks;
    }

    @Nullable
    public final Double getPasserRating() {
        return this.passerRating;
    }

    @Nullable
    public final Integer getPassingAttempts() {
        return this.passingAttempts;
    }

    @Nullable
    public final Integer getPassingCompletions() {
        return this.passingCompletions;
    }

    @Nullable
    public final Integer getPassingFirstDowns() {
        return this.passingFirstDowns;
    }

    @Nullable
    public final Integer getPassingInterceptions() {
        return this.passingInterceptions;
    }

    @Nullable
    public final Integer getPassingLongest() {
        return this.passingLongest;
    }

    @Nullable
    public final Integer getPassingNetYards() {
        return this.passingNetYards;
    }

    @Nullable
    public final Integer getPassingSacked() {
        return this.passingSacked;
    }

    @Nullable
    public final Integer getPassingTouchdowns() {
        return this.passingTouchdowns;
    }

    @Nullable
    public final Integer getPassingYards() {
        return this.passingYards;
    }

    @Nullable
    public final Integer getPuntReturnsFairCatches() {
        return this.puntReturnsFairCatches;
    }

    @Nullable
    public final Integer getPuntReturnsLong() {
        return this.puntReturnsLong;
    }

    @Nullable
    public final Integer getPuntReturnsTotal() {
        return this.puntReturnsTotal;
    }

    @Nullable
    public final Integer getPuntReturnsTouchdowns() {
        return this.puntReturnsTouchdowns;
    }

    @Nullable
    public final Integer getPuntReturnsYards() {
        return this.puntReturnsYards;
    }

    @Nullable
    public final Integer getPuntingBlocked() {
        return this.puntingBlocked;
    }

    @Nullable
    public final Integer getPuntingInside20() {
        return this.puntingInside20;
    }

    @Nullable
    public final Integer getPuntingLongest() {
        return this.puntingLongest;
    }

    @Nullable
    public final Integer getPuntingNetYards() {
        return this.puntingNetYards;
    }

    @Nullable
    public final Integer getPuntingTotal() {
        return this.puntingTotal;
    }

    @Nullable
    public final Integer getPuntingTouchbacks() {
        return this.puntingTouchbacks;
    }

    @Nullable
    public final Integer getPuntingYards() {
        return this.puntingYards;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getReceivingFirstDowns() {
        return this.receivingFirstDowns;
    }

    @Nullable
    public final Integer getReceivingLongest() {
        return this.receivingLongest;
    }

    @Nullable
    public final Integer getReceivingReceptions() {
        return this.receivingReceptions;
    }

    @Nullable
    public final Integer getReceivingTargets() {
        return this.receivingTargets;
    }

    @Nullable
    public final Integer getReceivingTouchdowns() {
        return this.receivingTouchdowns;
    }

    @Nullable
    public final Integer getReceivingYards() {
        return this.receivingYards;
    }

    @Nullable
    public final Integer getRushingAttempts() {
        return this.rushingAttempts;
    }

    @Nullable
    public final Integer getRushingFirstDowns() {
        return this.rushingFirstDowns;
    }

    @Nullable
    public final Integer getRushingFumbles() {
        return this.rushingFumbles;
    }

    @Nullable
    public final Integer getRushingLongest() {
        return this.rushingLongest;
    }

    @Nullable
    public final Integer getRushingTouchdowns() {
        return this.rushingTouchdowns;
    }

    @Nullable
    public final Integer getRushingYards() {
        return this.rushingYards;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @NotNull
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.type);
        Integer num = this.appearances;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.rating;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.defensiveAssistTackles;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.defensiveCombineTackles;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.defensiveForcedFumbles;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.defensiveInterceptions;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.defensiveInterceptionsTouchdowns;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.defensiveInterceptionsYards;
        int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.defensivePassesDefensed;
        int hashCode9 = (hashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Double d2 = this.defensiveSacks;
        int hashCode10 = (hashCode9 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num9 = this.defensiveSafeties;
        int hashCode11 = (hashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.defensiveTotalTackles;
        int hashCode12 = (hashCode11 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.fumbleFumbles;
        int hashCode13 = (hashCode12 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.fumbleLost;
        int hashCode14 = (hashCode13 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.fumbleRecovery;
        int hashCode15 = (hashCode14 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.fumbleSafety;
        int hashCode16 = (hashCode15 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.kickReturnsFumbles;
        int hashCode17 = (hashCode16 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.kickReturnsLong;
        int hashCode18 = (hashCode17 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.kickReturnsTotal;
        int hashCode19 = (hashCode18 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.kickReturnsTouchdowns;
        int hashCode20 = (hashCode19 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.kickReturnsYards;
        int hashCode21 = (hashCode20 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.kickReturnsFairCatches;
        int hashCode22 = (hashCode21 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.kickingExtraAttempts;
        int hashCode23 = (hashCode22 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.kickingExtraMade;
        int hashCode24 = (hashCode23 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.kickingFgAttempts;
        int hashCode25 = (hashCode24 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.kickingFgAttempts20to29;
        int hashCode26 = (hashCode25 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.kickingFgAttempts30to39;
        int hashCode27 = (hashCode26 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.kickingFgAttempts40to49;
        int hashCode28 = (hashCode27 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.kickingFgAttempts50plus;
        int hashCode29 = (hashCode28 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Integer num28 = this.kickingFgBlocked;
        int hashCode30 = (hashCode29 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Integer num29 = this.kickingFgLong;
        int hashCode31 = (hashCode30 + (num29 == null ? 0 : num29.hashCode())) * 31;
        Integer num30 = this.kickingFgMade;
        int hashCode32 = (hashCode31 + (num30 == null ? 0 : num30.hashCode())) * 31;
        Integer num31 = this.kickingFgMade20to29;
        int hashCode33 = (hashCode32 + (num31 == null ? 0 : num31.hashCode())) * 31;
        Integer num32 = this.kickingFgMade30to39;
        int hashCode34 = (hashCode33 + (num32 == null ? 0 : num32.hashCode())) * 31;
        Integer num33 = this.kickingFgMade40to49;
        int hashCode35 = (hashCode34 + (num33 == null ? 0 : num33.hashCode())) * 31;
        Integer num34 = this.kickingFgMade50plus;
        int hashCode36 = (hashCode35 + (num34 == null ? 0 : num34.hashCode())) * 31;
        Integer num35 = this.kickingTotalPoints;
        int hashCode37 = (hashCode36 + (num35 == null ? 0 : num35.hashCode())) * 31;
        Integer num36 = this.kickingFgMade1to19;
        int hashCode38 = (hashCode37 + (num36 == null ? 0 : num36.hashCode())) * 31;
        Integer num37 = this.kickoffReturns;
        int hashCode39 = (hashCode38 + (num37 == null ? 0 : num37.hashCode())) * 31;
        Integer num38 = this.kickoffTotal;
        int hashCode40 = (hashCode39 + (num38 == null ? 0 : num38.hashCode())) * 31;
        Integer num39 = this.kickoffTouchbacks;
        int hashCode41 = (hashCode40 + (num39 == null ? 0 : num39.hashCode())) * 31;
        Integer num40 = this.passingAttempts;
        int hashCode42 = (hashCode41 + (num40 == null ? 0 : num40.hashCode())) * 31;
        Integer num41 = this.passingCompletions;
        int hashCode43 = (hashCode42 + (num41 == null ? 0 : num41.hashCode())) * 31;
        Integer num42 = this.passingInterceptions;
        int hashCode44 = (hashCode43 + (num42 == null ? 0 : num42.hashCode())) * 31;
        Integer num43 = this.passingLongest;
        int hashCode45 = (hashCode44 + (num43 == null ? 0 : num43.hashCode())) * 31;
        Integer num44 = this.passingNetYards;
        int hashCode46 = (hashCode45 + (num44 == null ? 0 : num44.hashCode())) * 31;
        Integer num45 = this.passingSacked;
        int hashCode47 = (hashCode46 + (num45 == null ? 0 : num45.hashCode())) * 31;
        Integer num46 = this.passingTouchdowns;
        int hashCode48 = (hashCode47 + (num46 == null ? 0 : num46.hashCode())) * 31;
        Integer num47 = this.passingYards;
        int hashCode49 = (hashCode48 + (num47 == null ? 0 : num47.hashCode())) * 31;
        Integer num48 = this.passingFirstDowns;
        int hashCode50 = (hashCode49 + (num48 == null ? 0 : num48.hashCode())) * 31;
        Integer num49 = this.puntReturnsLong;
        int hashCode51 = (hashCode50 + (num49 == null ? 0 : num49.hashCode())) * 31;
        Integer num50 = this.puntReturnsTotal;
        int hashCode52 = (hashCode51 + (num50 == null ? 0 : num50.hashCode())) * 31;
        Integer num51 = this.puntReturnsTouchdowns;
        int hashCode53 = (hashCode52 + (num51 == null ? 0 : num51.hashCode())) * 31;
        Integer num52 = this.puntReturnsYards;
        int hashCode54 = (hashCode53 + (num52 == null ? 0 : num52.hashCode())) * 31;
        Integer num53 = this.puntReturnsFairCatches;
        int hashCode55 = (hashCode54 + (num53 == null ? 0 : num53.hashCode())) * 31;
        Integer num54 = this.puntingBlocked;
        int hashCode56 = (hashCode55 + (num54 == null ? 0 : num54.hashCode())) * 31;
        Integer num55 = this.puntingInside20;
        int hashCode57 = (hashCode56 + (num55 == null ? 0 : num55.hashCode())) * 31;
        Integer num56 = this.puntingLongest;
        int hashCode58 = (hashCode57 + (num56 == null ? 0 : num56.hashCode())) * 31;
        Integer num57 = this.puntingNetYards;
        int hashCode59 = (hashCode58 + (num57 == null ? 0 : num57.hashCode())) * 31;
        Integer num58 = this.puntingTotal;
        int hashCode60 = (hashCode59 + (num58 == null ? 0 : num58.hashCode())) * 31;
        Integer num59 = this.puntingTouchbacks;
        int hashCode61 = (hashCode60 + (num59 == null ? 0 : num59.hashCode())) * 31;
        Integer num60 = this.puntingYards;
        int hashCode62 = (hashCode61 + (num60 == null ? 0 : num60.hashCode())) * 31;
        Integer num61 = this.receivingFirstDowns;
        int hashCode63 = (hashCode62 + (num61 == null ? 0 : num61.hashCode())) * 31;
        Integer num62 = this.receivingLongest;
        int hashCode64 = (hashCode63 + (num62 == null ? 0 : num62.hashCode())) * 31;
        Integer num63 = this.receivingReceptions;
        int hashCode65 = (hashCode64 + (num63 == null ? 0 : num63.hashCode())) * 31;
        Integer num64 = this.receivingTouchdowns;
        int hashCode66 = (hashCode65 + (num64 == null ? 0 : num64.hashCode())) * 31;
        Integer num65 = this.receivingYards;
        int hashCode67 = (hashCode66 + (num65 == null ? 0 : num65.hashCode())) * 31;
        Integer num66 = this.receivingTargets;
        int hashCode68 = (hashCode67 + (num66 == null ? 0 : num66.hashCode())) * 31;
        Integer num67 = this.rushingAttempts;
        int hashCode69 = (hashCode68 + (num67 == null ? 0 : num67.hashCode())) * 31;
        Integer num68 = this.rushingFumbles;
        int hashCode70 = (hashCode69 + (num68 == null ? 0 : num68.hashCode())) * 31;
        Integer num69 = this.rushingLongest;
        int hashCode71 = (hashCode70 + (num69 == null ? 0 : num69.hashCode())) * 31;
        Integer num70 = this.rushingTouchdowns;
        int hashCode72 = (hashCode71 + (num70 == null ? 0 : num70.hashCode())) * 31;
        Integer num71 = this.rushingYards;
        int hashCode73 = (hashCode72 + (num71 == null ? 0 : num71.hashCode())) * 31;
        Integer num72 = this.rushingFirstDowns;
        return hashCode73 + (num72 != null ? num72.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        Integer num = this.appearances;
        Double d = this.rating;
        Integer num2 = this.defensiveAssistTackles;
        Integer num3 = this.defensiveCombineTackles;
        Integer num4 = this.defensiveForcedFumbles;
        Integer num5 = this.defensiveInterceptions;
        Integer num6 = this.defensiveInterceptionsTouchdowns;
        Integer num7 = this.defensiveInterceptionsYards;
        Integer num8 = this.defensivePassesDefensed;
        Double d2 = this.defensiveSacks;
        Integer num9 = this.defensiveSafeties;
        Integer num10 = this.defensiveTotalTackles;
        Integer num11 = this.fumbleFumbles;
        Integer num12 = this.fumbleLost;
        Integer num13 = this.fumbleRecovery;
        Integer num14 = this.fumbleSafety;
        Integer num15 = this.kickReturnsFumbles;
        Integer num16 = this.kickReturnsLong;
        Integer num17 = this.kickReturnsTotal;
        Integer num18 = this.kickReturnsTouchdowns;
        Integer num19 = this.kickReturnsYards;
        Integer num20 = this.kickReturnsFairCatches;
        Integer num21 = this.kickingExtraAttempts;
        Integer num22 = this.kickingExtraMade;
        Integer num23 = this.kickingFgAttempts;
        Integer num24 = this.kickingFgAttempts20to29;
        Integer num25 = this.kickingFgAttempts30to39;
        Integer num26 = this.kickingFgAttempts40to49;
        Integer num27 = this.kickingFgAttempts50plus;
        Integer num28 = this.kickingFgBlocked;
        Integer num29 = this.kickingFgLong;
        Integer num30 = this.kickingFgMade;
        Integer num31 = this.kickingFgMade20to29;
        Integer num32 = this.kickingFgMade30to39;
        Integer num33 = this.kickingFgMade40to49;
        Integer num34 = this.kickingFgMade50plus;
        Integer num35 = this.kickingTotalPoints;
        Integer num36 = this.kickingFgMade1to19;
        Integer num37 = this.kickoffReturns;
        Integer num38 = this.kickoffTotal;
        Integer num39 = this.kickoffTouchbacks;
        Integer num40 = this.passingAttempts;
        Integer num41 = this.passingCompletions;
        Integer num42 = this.passingInterceptions;
        Integer num43 = this.passingLongest;
        Integer num44 = this.passingNetYards;
        Integer num45 = this.passingSacked;
        Integer num46 = this.passingTouchdowns;
        Integer num47 = this.passingYards;
        Integer num48 = this.passingFirstDowns;
        Integer num49 = this.puntReturnsLong;
        Integer num50 = this.puntReturnsTotal;
        Integer num51 = this.puntReturnsTouchdowns;
        Integer num52 = this.puntReturnsYards;
        Integer num53 = this.puntReturnsFairCatches;
        Integer num54 = this.puntingBlocked;
        Integer num55 = this.puntingInside20;
        Integer num56 = this.puntingLongest;
        Integer num57 = this.puntingNetYards;
        Integer num58 = this.puntingTotal;
        Integer num59 = this.puntingTouchbacks;
        Integer num60 = this.puntingYards;
        Integer num61 = this.receivingFirstDowns;
        Integer num62 = this.receivingLongest;
        Integer num63 = this.receivingReceptions;
        Integer num64 = this.receivingTouchdowns;
        Integer num65 = this.receivingYards;
        Integer num66 = this.receivingTargets;
        Integer num67 = this.rushingAttempts;
        Integer num68 = this.rushingFumbles;
        Integer num69 = this.rushingLongest;
        Integer num70 = this.rushingTouchdowns;
        Integer num71 = this.rushingYards;
        Integer num72 = this.rushingFirstDowns;
        StringBuilder t = dmi.t(i, "AmericanFootballPlayerSeasonStatistics(id=", ", type=", str, ", appearances=");
        fn0.v(d, num, ", rating=", ", defensiveAssistTackles=", t);
        vxd.r(num2, num3, ", defensiveCombineTackles=", ", defensiveForcedFumbles=", t);
        vxd.r(num4, num5, ", defensiveInterceptions=", ", defensiveInterceptionsTouchdowns=", t);
        vxd.r(num6, num7, ", defensiveInterceptionsYards=", ", defensivePassesDefensed=", t);
        fn0.v(d2, num8, ", defensiveSacks=", ", defensiveSafeties=", t);
        vxd.r(num9, num10, ", defensiveTotalTackles=", ", fumbleFumbles=", t);
        vxd.r(num11, num12, ", fumbleLost=", ", fumbleRecovery=", t);
        vxd.r(num13, num14, ", fumbleSafety=", ", kickReturnsFumbles=", t);
        vxd.r(num15, num16, ", kickReturnsLong=", ", kickReturnsTotal=", t);
        vxd.r(num17, num18, ", kickReturnsTouchdowns=", ", kickReturnsYards=", t);
        vxd.r(num19, num20, ", kickReturnsFairCatches=", ", kickingExtraAttempts=", t);
        vxd.r(num21, num22, ", kickingExtraMade=", ", kickingFgAttempts=", t);
        vxd.r(num23, num24, ", kickingFgAttempts20to29=", ", kickingFgAttempts30to39=", t);
        vxd.r(num25, num26, ", kickingFgAttempts40to49=", ", kickingFgAttempts50plus=", t);
        vxd.r(num27, num28, ", kickingFgBlocked=", ", kickingFgLong=", t);
        vxd.r(num29, num30, ", kickingFgMade=", ", kickingFgMade20to29=", t);
        vxd.r(num31, num32, ", kickingFgMade30to39=", ", kickingFgMade40to49=", t);
        vxd.r(num33, num34, ", kickingFgMade50plus=", ", kickingTotalPoints=", t);
        vxd.r(num35, num36, ", kickingFgMade1to19=", ", kickoffReturns=", t);
        vxd.r(num37, num38, ", kickoffTotal=", ", kickoffTouchbacks=", t);
        vxd.r(num39, num40, ", passingAttempts=", ", passingCompletions=", t);
        vxd.r(num41, num42, ", passingInterceptions=", ", passingLongest=", t);
        vxd.r(num43, num44, ", passingNetYards=", ", passingSacked=", t);
        vxd.r(num45, num46, ", passingTouchdowns=", ", passingYards=", t);
        vxd.r(num47, num48, ", passingFirstDowns=", ", puntReturnsLong=", t);
        vxd.r(num49, num50, ", puntReturnsTotal=", ", puntReturnsTouchdowns=", t);
        vxd.r(num51, num52, ", puntReturnsYards=", ", puntReturnsFairCatches=", t);
        vxd.r(num53, num54, ", puntingBlocked=", ", puntingInside20=", t);
        vxd.r(num55, num56, ", puntingLongest=", ", puntingNetYards=", t);
        vxd.r(num57, num58, ", puntingTotal=", ", puntingTouchbacks=", t);
        vxd.r(num59, num60, ", puntingYards=", ", receivingFirstDowns=", t);
        vxd.r(num61, num62, ", receivingLongest=", ", receivingReceptions=", t);
        vxd.r(num63, num64, ", receivingTouchdowns=", ", receivingYards=", t);
        vxd.r(num65, num66, ", receivingTargets=", ", rushingAttempts=", t);
        vxd.r(num67, num68, ", rushingFumbles=", ", rushingLongest=", t);
        vxd.r(num69, num70, ", rushingTouchdowns=", ", rushingYards=", t);
        return fc6.l(num71, num72, ", rushingFirstDowns=", ")", t);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/AmericanFootballPlayerSeasonStatistics$Companion;", "", "<init>", "()V", "aggregate", "Lcom/sofascore/model/newNetwork/statistics/season/player/AmericanFootballPlayerSeasonStatistics;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AmericanFootballPlayerSeasonStatistics aggregate(@NotNull List<AmericanFootballPlayerSeasonStatistics> statistics) {
            statistics.getClass();
            int id = ((AmericanFootballPlayerSeasonStatistics) CollectionsKt.Y(statistics)).getId();
            String type = ((AmericanFootballPlayerSeasonStatistics) CollectionsKt.Y(statistics)).getType();
            AbstractPlayerSeasonStatistics.Companion companion = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = statistics.iterator();
            while (it.hasNext()) {
                Integer appearances = ((AmericanFootballPlayerSeasonStatistics) it.next()).getAppearances();
                if (appearances != null) {
                    arrayList.add(appearances);
                }
            }
            Integer m690nullableSum = companion.m690nullableSum((List<Integer>) arrayList);
            AbstractPlayerSeasonStatistics.Companion companion2 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = statistics.iterator();
            while (it2.hasNext()) {
                Double rating = ((AmericanFootballPlayerSeasonStatistics) it2.next()).getRating();
                if (rating != null) {
                    arrayList2.add(rating);
                }
            }
            Double nullableSum = companion2.nullableSum((List<Double>) arrayList2);
            AbstractPlayerSeasonStatistics.Companion companion3 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = statistics.iterator();
            while (it3.hasNext()) {
                Integer defensiveAssistTackles = ((AmericanFootballPlayerSeasonStatistics) it3.next()).getDefensiveAssistTackles();
                if (defensiveAssistTackles != null) {
                    arrayList3.add(defensiveAssistTackles);
                }
            }
            Integer m690nullableSum2 = companion3.m690nullableSum((List<Integer>) arrayList3);
            AbstractPlayerSeasonStatistics.Companion companion4 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it4 = statistics.iterator();
            while (it4.hasNext()) {
                Integer defensiveCombineTackles = ((AmericanFootballPlayerSeasonStatistics) it4.next()).getDefensiveCombineTackles();
                if (defensiveCombineTackles != null) {
                    arrayList4.add(defensiveCombineTackles);
                }
            }
            Integer m690nullableSum3 = companion4.m690nullableSum((List<Integer>) arrayList4);
            AbstractPlayerSeasonStatistics.Companion companion5 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it5 = statistics.iterator();
            while (it5.hasNext()) {
                Integer defensiveForcedFumbles = ((AmericanFootballPlayerSeasonStatistics) it5.next()).getDefensiveForcedFumbles();
                if (defensiveForcedFumbles != null) {
                    arrayList5.add(defensiveForcedFumbles);
                }
            }
            Integer m690nullableSum4 = companion5.m690nullableSum((List<Integer>) arrayList5);
            AbstractPlayerSeasonStatistics.Companion companion6 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList6 = new ArrayList();
            Iterator<T> it6 = statistics.iterator();
            while (it6.hasNext()) {
                Integer defensiveInterceptions = ((AmericanFootballPlayerSeasonStatistics) it6.next()).getDefensiveInterceptions();
                if (defensiveInterceptions != null) {
                    arrayList6.add(defensiveInterceptions);
                }
            }
            Integer m690nullableSum5 = companion6.m690nullableSum((List<Integer>) arrayList6);
            AbstractPlayerSeasonStatistics.Companion companion7 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList7 = new ArrayList();
            Iterator<T> it7 = statistics.iterator();
            while (it7.hasNext()) {
                Integer defensiveInterceptionsTouchdowns = ((AmericanFootballPlayerSeasonStatistics) it7.next()).getDefensiveInterceptionsTouchdowns();
                if (defensiveInterceptionsTouchdowns != null) {
                    arrayList7.add(defensiveInterceptionsTouchdowns);
                }
            }
            Integer m690nullableSum6 = companion7.m690nullableSum((List<Integer>) arrayList7);
            AbstractPlayerSeasonStatistics.Companion companion8 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList8 = new ArrayList();
            Iterator<T> it8 = statistics.iterator();
            while (it8.hasNext()) {
                Integer defensiveInterceptionsYards = ((AmericanFootballPlayerSeasonStatistics) it8.next()).getDefensiveInterceptionsYards();
                if (defensiveInterceptionsYards != null) {
                    arrayList8.add(defensiveInterceptionsYards);
                }
            }
            Integer m690nullableSum7 = companion8.m690nullableSum((List<Integer>) arrayList8);
            AbstractPlayerSeasonStatistics.Companion companion9 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList9 = new ArrayList();
            Iterator<T> it9 = statistics.iterator();
            while (it9.hasNext()) {
                Integer defensivePassesDefensed = ((AmericanFootballPlayerSeasonStatistics) it9.next()).getDefensivePassesDefensed();
                if (defensivePassesDefensed != null) {
                    arrayList9.add(defensivePassesDefensed);
                }
            }
            Integer m690nullableSum8 = companion9.m690nullableSum((List<Integer>) arrayList9);
            AbstractPlayerSeasonStatistics.Companion companion10 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList10 = new ArrayList();
            Iterator<T> it10 = statistics.iterator();
            while (it10.hasNext()) {
                Double defensiveSacks = ((AmericanFootballPlayerSeasonStatistics) it10.next()).getDefensiveSacks();
                if (defensiveSacks != null) {
                    arrayList10.add(defensiveSacks);
                }
            }
            Double nullableSum2 = companion10.nullableSum((List<Double>) arrayList10);
            AbstractPlayerSeasonStatistics.Companion companion11 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList11 = new ArrayList();
            Iterator<T> it11 = statistics.iterator();
            while (it11.hasNext()) {
                Integer defensiveSafeties = ((AmericanFootballPlayerSeasonStatistics) it11.next()).getDefensiveSafeties();
                if (defensiveSafeties != null) {
                    arrayList11.add(defensiveSafeties);
                }
            }
            Integer m690nullableSum9 = companion11.m690nullableSum((List<Integer>) arrayList11);
            AbstractPlayerSeasonStatistics.Companion companion12 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList12 = new ArrayList();
            Iterator<T> it12 = statistics.iterator();
            while (it12.hasNext()) {
                int i = id;
                Integer defensiveTotalTackles = ((AmericanFootballPlayerSeasonStatistics) it12.next()).getDefensiveTotalTackles();
                if (defensiveTotalTackles != null) {
                    arrayList12.add(defensiveTotalTackles);
                }
                id = i;
            }
            int i2 = id;
            Integer m690nullableSum10 = companion12.m690nullableSum((List<Integer>) arrayList12);
            AbstractPlayerSeasonStatistics.Companion companion13 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList13 = new ArrayList();
            Iterator it13 = statistics.iterator();
            while (it13.hasNext()) {
                Iterator it14 = it13;
                Integer fumbleFumbles = ((AmericanFootballPlayerSeasonStatistics) it13.next()).getFumbleFumbles();
                if (fumbleFumbles != null) {
                    arrayList13.add(fumbleFumbles);
                }
                it13 = it14;
            }
            Integer m690nullableSum11 = companion13.m690nullableSum((List<Integer>) arrayList13);
            AbstractPlayerSeasonStatistics.Companion companion14 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList14 = new ArrayList();
            Iterator it15 = statistics.iterator();
            while (it15.hasNext()) {
                Iterator it16 = it15;
                Integer fumbleLost = ((AmericanFootballPlayerSeasonStatistics) it15.next()).getFumbleLost();
                if (fumbleLost != null) {
                    arrayList14.add(fumbleLost);
                }
                it15 = it16;
            }
            Integer m690nullableSum12 = companion14.m690nullableSum((List<Integer>) arrayList14);
            AbstractPlayerSeasonStatistics.Companion companion15 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList15 = new ArrayList();
            Iterator it17 = statistics.iterator();
            while (it17.hasNext()) {
                Iterator it18 = it17;
                Integer fumbleRecovery = ((AmericanFootballPlayerSeasonStatistics) it17.next()).getFumbleRecovery();
                if (fumbleRecovery != null) {
                    arrayList15.add(fumbleRecovery);
                }
                it17 = it18;
            }
            Integer m690nullableSum13 = companion15.m690nullableSum((List<Integer>) arrayList15);
            AbstractPlayerSeasonStatistics.Companion companion16 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList16 = new ArrayList();
            Iterator it19 = statistics.iterator();
            while (it19.hasNext()) {
                Iterator it20 = it19;
                Integer fumbleSafety = ((AmericanFootballPlayerSeasonStatistics) it19.next()).getFumbleSafety();
                if (fumbleSafety != null) {
                    arrayList16.add(fumbleSafety);
                }
                it19 = it20;
            }
            Integer m690nullableSum14 = companion16.m690nullableSum((List<Integer>) arrayList16);
            AbstractPlayerSeasonStatistics.Companion companion17 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList17 = new ArrayList();
            Iterator it21 = statistics.iterator();
            while (it21.hasNext()) {
                Iterator it22 = it21;
                Integer kickReturnsFumbles = ((AmericanFootballPlayerSeasonStatistics) it21.next()).getKickReturnsFumbles();
                if (kickReturnsFumbles != null) {
                    arrayList17.add(kickReturnsFumbles);
                }
                it21 = it22;
            }
            Integer m690nullableSum15 = companion17.m690nullableSum((List<Integer>) arrayList17);
            AbstractPlayerSeasonStatistics.Companion companion18 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList18 = new ArrayList();
            Iterator it23 = statistics.iterator();
            while (it23.hasNext()) {
                Iterator it24 = it23;
                Integer kickReturnsLong = ((AmericanFootballPlayerSeasonStatistics) it23.next()).getKickReturnsLong();
                if (kickReturnsLong != null) {
                    arrayList18.add(kickReturnsLong);
                }
                it23 = it24;
            }
            Integer m690nullableSum16 = companion18.m690nullableSum((List<Integer>) arrayList18);
            AbstractPlayerSeasonStatistics.Companion companion19 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList19 = new ArrayList();
            Iterator it25 = statistics.iterator();
            while (it25.hasNext()) {
                Iterator it26 = it25;
                Integer kickReturnsTotal = ((AmericanFootballPlayerSeasonStatistics) it25.next()).getKickReturnsTotal();
                if (kickReturnsTotal != null) {
                    arrayList19.add(kickReturnsTotal);
                }
                it25 = it26;
            }
            Integer m690nullableSum17 = companion19.m690nullableSum((List<Integer>) arrayList19);
            AbstractPlayerSeasonStatistics.Companion companion20 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList20 = new ArrayList();
            Iterator it27 = statistics.iterator();
            while (it27.hasNext()) {
                Iterator it28 = it27;
                Integer kickReturnsTouchdowns = ((AmericanFootballPlayerSeasonStatistics) it27.next()).getKickReturnsTouchdowns();
                if (kickReturnsTouchdowns != null) {
                    arrayList20.add(kickReturnsTouchdowns);
                }
                it27 = it28;
            }
            Integer m690nullableSum18 = companion20.m690nullableSum((List<Integer>) arrayList20);
            AbstractPlayerSeasonStatistics.Companion companion21 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList21 = new ArrayList();
            Iterator it29 = statistics.iterator();
            while (it29.hasNext()) {
                Iterator it30 = it29;
                Integer kickReturnsYards = ((AmericanFootballPlayerSeasonStatistics) it29.next()).getKickReturnsYards();
                if (kickReturnsYards != null) {
                    arrayList21.add(kickReturnsYards);
                }
                it29 = it30;
            }
            Integer m690nullableSum19 = companion21.m690nullableSum((List<Integer>) arrayList21);
            AbstractPlayerSeasonStatistics.Companion companion22 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList22 = new ArrayList();
            Iterator it31 = statistics.iterator();
            while (it31.hasNext()) {
                Iterator it32 = it31;
                Integer kickReturnsFairCatches = ((AmericanFootballPlayerSeasonStatistics) it31.next()).getKickReturnsFairCatches();
                if (kickReturnsFairCatches != null) {
                    arrayList22.add(kickReturnsFairCatches);
                }
                it31 = it32;
            }
            Integer m690nullableSum20 = companion22.m690nullableSum((List<Integer>) arrayList22);
            AbstractPlayerSeasonStatistics.Companion companion23 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList23 = new ArrayList();
            Iterator it33 = statistics.iterator();
            while (it33.hasNext()) {
                Iterator it34 = it33;
                Integer kickingExtraAttempts = ((AmericanFootballPlayerSeasonStatistics) it33.next()).getKickingExtraAttempts();
                if (kickingExtraAttempts != null) {
                    arrayList23.add(kickingExtraAttempts);
                }
                it33 = it34;
            }
            Integer m690nullableSum21 = companion23.m690nullableSum((List<Integer>) arrayList23);
            AbstractPlayerSeasonStatistics.Companion companion24 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList24 = new ArrayList();
            Iterator it35 = statistics.iterator();
            while (it35.hasNext()) {
                Iterator it36 = it35;
                Integer kickingExtraMade = ((AmericanFootballPlayerSeasonStatistics) it35.next()).getKickingExtraMade();
                if (kickingExtraMade != null) {
                    arrayList24.add(kickingExtraMade);
                }
                it35 = it36;
            }
            Integer m690nullableSum22 = companion24.m690nullableSum((List<Integer>) arrayList24);
            AbstractPlayerSeasonStatistics.Companion companion25 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList25 = new ArrayList();
            Iterator it37 = statistics.iterator();
            while (it37.hasNext()) {
                Iterator it38 = it37;
                Integer kickingFgAttempts = ((AmericanFootballPlayerSeasonStatistics) it37.next()).getKickingFgAttempts();
                if (kickingFgAttempts != null) {
                    arrayList25.add(kickingFgAttempts);
                }
                it37 = it38;
            }
            Integer m690nullableSum23 = companion25.m690nullableSum((List<Integer>) arrayList25);
            AbstractPlayerSeasonStatistics.Companion companion26 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList26 = new ArrayList();
            Iterator it39 = statistics.iterator();
            while (it39.hasNext()) {
                Iterator it40 = it39;
                Integer kickingFgAttempts20to29 = ((AmericanFootballPlayerSeasonStatistics) it39.next()).getKickingFgAttempts20to29();
                if (kickingFgAttempts20to29 != null) {
                    arrayList26.add(kickingFgAttempts20to29);
                }
                it39 = it40;
            }
            Integer m690nullableSum24 = companion26.m690nullableSum((List<Integer>) arrayList26);
            AbstractPlayerSeasonStatistics.Companion companion27 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList27 = new ArrayList();
            Iterator it41 = statistics.iterator();
            while (it41.hasNext()) {
                Iterator it42 = it41;
                Integer kickingFgAttempts30to39 = ((AmericanFootballPlayerSeasonStatistics) it41.next()).getKickingFgAttempts30to39();
                if (kickingFgAttempts30to39 != null) {
                    arrayList27.add(kickingFgAttempts30to39);
                }
                it41 = it42;
            }
            Integer m690nullableSum25 = companion27.m690nullableSum((List<Integer>) arrayList27);
            AbstractPlayerSeasonStatistics.Companion companion28 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList28 = new ArrayList();
            Iterator it43 = statistics.iterator();
            while (it43.hasNext()) {
                Iterator it44 = it43;
                Integer kickingFgAttempts40to49 = ((AmericanFootballPlayerSeasonStatistics) it43.next()).getKickingFgAttempts40to49();
                if (kickingFgAttempts40to49 != null) {
                    arrayList28.add(kickingFgAttempts40to49);
                }
                it43 = it44;
            }
            Integer m690nullableSum26 = companion28.m690nullableSum((List<Integer>) arrayList28);
            AbstractPlayerSeasonStatistics.Companion companion29 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList29 = new ArrayList();
            Iterator it45 = statistics.iterator();
            while (it45.hasNext()) {
                Iterator it46 = it45;
                Integer kickingFgAttempts50plus = ((AmericanFootballPlayerSeasonStatistics) it45.next()).getKickingFgAttempts50plus();
                if (kickingFgAttempts50plus != null) {
                    arrayList29.add(kickingFgAttempts50plus);
                }
                it45 = it46;
            }
            Integer m690nullableSum27 = companion29.m690nullableSum((List<Integer>) arrayList29);
            AbstractPlayerSeasonStatistics.Companion companion30 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList30 = new ArrayList();
            Iterator it47 = statistics.iterator();
            while (it47.hasNext()) {
                Iterator it48 = it47;
                Integer kickingFgBlocked = ((AmericanFootballPlayerSeasonStatistics) it47.next()).getKickingFgBlocked();
                if (kickingFgBlocked != null) {
                    arrayList30.add(kickingFgBlocked);
                }
                it47 = it48;
            }
            Integer m690nullableSum28 = companion30.m690nullableSum((List<Integer>) arrayList30);
            AbstractPlayerSeasonStatistics.Companion companion31 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList31 = new ArrayList();
            Iterator it49 = statistics.iterator();
            while (it49.hasNext()) {
                Iterator it50 = it49;
                Integer kickingFgLong = ((AmericanFootballPlayerSeasonStatistics) it49.next()).getKickingFgLong();
                if (kickingFgLong != null) {
                    arrayList31.add(kickingFgLong);
                }
                it49 = it50;
            }
            Integer m690nullableSum29 = companion31.m690nullableSum((List<Integer>) arrayList31);
            AbstractPlayerSeasonStatistics.Companion companion32 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList32 = new ArrayList();
            Iterator it51 = statistics.iterator();
            while (it51.hasNext()) {
                Iterator it52 = it51;
                Integer kickingFgMade = ((AmericanFootballPlayerSeasonStatistics) it51.next()).getKickingFgMade();
                if (kickingFgMade != null) {
                    arrayList32.add(kickingFgMade);
                }
                it51 = it52;
            }
            Integer m690nullableSum30 = companion32.m690nullableSum((List<Integer>) arrayList32);
            AbstractPlayerSeasonStatistics.Companion companion33 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList33 = new ArrayList();
            Iterator it53 = statistics.iterator();
            while (it53.hasNext()) {
                Iterator it54 = it53;
                Integer kickingFgMade20to29 = ((AmericanFootballPlayerSeasonStatistics) it53.next()).getKickingFgMade20to29();
                if (kickingFgMade20to29 != null) {
                    arrayList33.add(kickingFgMade20to29);
                }
                it53 = it54;
            }
            Integer m690nullableSum31 = companion33.m690nullableSum((List<Integer>) arrayList33);
            AbstractPlayerSeasonStatistics.Companion companion34 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList34 = new ArrayList();
            Iterator it55 = statistics.iterator();
            while (it55.hasNext()) {
                Iterator it56 = it55;
                Integer kickingFgMade30to39 = ((AmericanFootballPlayerSeasonStatistics) it55.next()).getKickingFgMade30to39();
                if (kickingFgMade30to39 != null) {
                    arrayList34.add(kickingFgMade30to39);
                }
                it55 = it56;
            }
            Integer m690nullableSum32 = companion34.m690nullableSum((List<Integer>) arrayList34);
            AbstractPlayerSeasonStatistics.Companion companion35 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList35 = new ArrayList();
            Iterator it57 = statistics.iterator();
            while (it57.hasNext()) {
                Iterator it58 = it57;
                Integer kickingFgMade40to49 = ((AmericanFootballPlayerSeasonStatistics) it57.next()).getKickingFgMade40to49();
                if (kickingFgMade40to49 != null) {
                    arrayList35.add(kickingFgMade40to49);
                }
                it57 = it58;
            }
            Integer m690nullableSum33 = companion35.m690nullableSum((List<Integer>) arrayList35);
            AbstractPlayerSeasonStatistics.Companion companion36 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList36 = new ArrayList();
            Iterator it59 = statistics.iterator();
            while (it59.hasNext()) {
                Iterator it60 = it59;
                Integer kickingFgMade50plus = ((AmericanFootballPlayerSeasonStatistics) it59.next()).getKickingFgMade50plus();
                if (kickingFgMade50plus != null) {
                    arrayList36.add(kickingFgMade50plus);
                }
                it59 = it60;
            }
            Integer m690nullableSum34 = companion36.m690nullableSum((List<Integer>) arrayList36);
            AbstractPlayerSeasonStatistics.Companion companion37 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList37 = new ArrayList();
            Iterator it61 = statistics.iterator();
            while (it61.hasNext()) {
                Iterator it62 = it61;
                Integer kickingTotalPoints = ((AmericanFootballPlayerSeasonStatistics) it61.next()).getKickingTotalPoints();
                if (kickingTotalPoints != null) {
                    arrayList37.add(kickingTotalPoints);
                }
                it61 = it62;
            }
            Integer m690nullableSum35 = companion37.m690nullableSum((List<Integer>) arrayList37);
            AbstractPlayerSeasonStatistics.Companion companion38 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList38 = new ArrayList();
            Iterator it63 = statistics.iterator();
            while (it63.hasNext()) {
                Iterator it64 = it63;
                Integer kickingFgMade1to19 = ((AmericanFootballPlayerSeasonStatistics) it63.next()).getKickingFgMade1to19();
                if (kickingFgMade1to19 != null) {
                    arrayList38.add(kickingFgMade1to19);
                }
                it63 = it64;
            }
            Integer m690nullableSum36 = companion38.m690nullableSum((List<Integer>) arrayList38);
            AbstractPlayerSeasonStatistics.Companion companion39 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList39 = new ArrayList();
            Iterator it65 = statistics.iterator();
            while (it65.hasNext()) {
                Iterator it66 = it65;
                Integer kickoffReturns = ((AmericanFootballPlayerSeasonStatistics) it65.next()).getKickoffReturns();
                if (kickoffReturns != null) {
                    arrayList39.add(kickoffReturns);
                }
                it65 = it66;
            }
            Integer m690nullableSum37 = companion39.m690nullableSum((List<Integer>) arrayList39);
            AbstractPlayerSeasonStatistics.Companion companion40 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList40 = new ArrayList();
            Iterator it67 = statistics.iterator();
            while (it67.hasNext()) {
                Iterator it68 = it67;
                Integer kickoffTotal = ((AmericanFootballPlayerSeasonStatistics) it67.next()).getKickoffTotal();
                if (kickoffTotal != null) {
                    arrayList40.add(kickoffTotal);
                }
                it67 = it68;
            }
            Integer m690nullableSum38 = companion40.m690nullableSum((List<Integer>) arrayList40);
            AbstractPlayerSeasonStatistics.Companion companion41 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList41 = new ArrayList();
            Iterator it69 = statistics.iterator();
            while (it69.hasNext()) {
                Iterator it70 = it69;
                Integer kickoffTouchbacks = ((AmericanFootballPlayerSeasonStatistics) it69.next()).getKickoffTouchbacks();
                if (kickoffTouchbacks != null) {
                    arrayList41.add(kickoffTouchbacks);
                }
                it69 = it70;
            }
            Integer m690nullableSum39 = companion41.m690nullableSum((List<Integer>) arrayList41);
            AbstractPlayerSeasonStatistics.Companion companion42 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList42 = new ArrayList();
            Iterator it71 = statistics.iterator();
            while (it71.hasNext()) {
                Iterator it72 = it71;
                Integer passingAttempts = ((AmericanFootballPlayerSeasonStatistics) it71.next()).getPassingAttempts();
                if (passingAttempts != null) {
                    arrayList42.add(passingAttempts);
                }
                it71 = it72;
            }
            Integer m690nullableSum40 = companion42.m690nullableSum((List<Integer>) arrayList42);
            AbstractPlayerSeasonStatistics.Companion companion43 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList43 = new ArrayList();
            Iterator it73 = statistics.iterator();
            while (it73.hasNext()) {
                Iterator it74 = it73;
                Integer passingCompletions = ((AmericanFootballPlayerSeasonStatistics) it73.next()).getPassingCompletions();
                if (passingCompletions != null) {
                    arrayList43.add(passingCompletions);
                }
                it73 = it74;
            }
            Integer m690nullableSum41 = companion43.m690nullableSum((List<Integer>) arrayList43);
            AbstractPlayerSeasonStatistics.Companion companion44 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList44 = new ArrayList();
            Iterator it75 = statistics.iterator();
            while (it75.hasNext()) {
                Iterator it76 = it75;
                Integer passingInterceptions = ((AmericanFootballPlayerSeasonStatistics) it75.next()).getPassingInterceptions();
                if (passingInterceptions != null) {
                    arrayList44.add(passingInterceptions);
                }
                it75 = it76;
            }
            Integer m690nullableSum42 = companion44.m690nullableSum((List<Integer>) arrayList44);
            ArrayList arrayList45 = new ArrayList();
            Iterator<T> it77 = statistics.iterator();
            while (it77.hasNext()) {
                Integer passingLongest = ((AmericanFootballPlayerSeasonStatistics) it77.next()).getPassingLongest();
                if (passingLongest != null) {
                    arrayList45.add(passingLongest);
                }
            }
            Integer num = (Integer) CollectionsKt.k0(arrayList45);
            AbstractPlayerSeasonStatistics.Companion companion45 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList46 = new ArrayList();
            Iterator it78 = statistics.iterator();
            while (it78.hasNext()) {
                Iterator it79 = it78;
                Integer passingNetYards = ((AmericanFootballPlayerSeasonStatistics) it78.next()).getPassingNetYards();
                if (passingNetYards != null) {
                    arrayList46.add(passingNetYards);
                }
                it78 = it79;
            }
            Integer m690nullableSum43 = companion45.m690nullableSum((List<Integer>) arrayList46);
            AbstractPlayerSeasonStatistics.Companion companion46 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList47 = new ArrayList();
            Iterator it80 = statistics.iterator();
            while (it80.hasNext()) {
                Iterator it81 = it80;
                Integer passingSacked = ((AmericanFootballPlayerSeasonStatistics) it80.next()).getPassingSacked();
                if (passingSacked != null) {
                    arrayList47.add(passingSacked);
                }
                it80 = it81;
            }
            Integer m690nullableSum44 = companion46.m690nullableSum((List<Integer>) arrayList47);
            AbstractPlayerSeasonStatistics.Companion companion47 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList48 = new ArrayList();
            Iterator it82 = statistics.iterator();
            while (it82.hasNext()) {
                Iterator it83 = it82;
                Integer passingTouchdowns = ((AmericanFootballPlayerSeasonStatistics) it82.next()).getPassingTouchdowns();
                if (passingTouchdowns != null) {
                    arrayList48.add(passingTouchdowns);
                }
                it82 = it83;
            }
            Integer m690nullableSum45 = companion47.m690nullableSum((List<Integer>) arrayList48);
            AbstractPlayerSeasonStatistics.Companion companion48 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList49 = new ArrayList();
            Iterator it84 = statistics.iterator();
            while (it84.hasNext()) {
                Iterator it85 = it84;
                Integer passingYards = ((AmericanFootballPlayerSeasonStatistics) it84.next()).getPassingYards();
                if (passingYards != null) {
                    arrayList49.add(passingYards);
                }
                it84 = it85;
            }
            Integer m690nullableSum46 = companion48.m690nullableSum((List<Integer>) arrayList49);
            AbstractPlayerSeasonStatistics.Companion companion49 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList50 = new ArrayList();
            Iterator it86 = statistics.iterator();
            while (it86.hasNext()) {
                Iterator it87 = it86;
                Integer passingFirstDowns = ((AmericanFootballPlayerSeasonStatistics) it86.next()).getPassingFirstDowns();
                if (passingFirstDowns != null) {
                    arrayList50.add(passingFirstDowns);
                }
                it86 = it87;
            }
            Integer m690nullableSum47 = companion49.m690nullableSum((List<Integer>) arrayList50);
            AbstractPlayerSeasonStatistics.Companion companion50 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList51 = new ArrayList();
            Iterator it88 = statistics.iterator();
            while (it88.hasNext()) {
                Iterator it89 = it88;
                Integer puntReturnsLong = ((AmericanFootballPlayerSeasonStatistics) it88.next()).getPuntReturnsLong();
                if (puntReturnsLong != null) {
                    arrayList51.add(puntReturnsLong);
                }
                it88 = it89;
            }
            Integer m690nullableSum48 = companion50.m690nullableSum((List<Integer>) arrayList51);
            AbstractPlayerSeasonStatistics.Companion companion51 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList52 = new ArrayList();
            Iterator it90 = statistics.iterator();
            while (it90.hasNext()) {
                Iterator it91 = it90;
                Integer puntReturnsTotal = ((AmericanFootballPlayerSeasonStatistics) it90.next()).getPuntReturnsTotal();
                if (puntReturnsTotal != null) {
                    arrayList52.add(puntReturnsTotal);
                }
                it90 = it91;
            }
            Integer m690nullableSum49 = companion51.m690nullableSum((List<Integer>) arrayList52);
            AbstractPlayerSeasonStatistics.Companion companion52 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList53 = new ArrayList();
            Iterator it92 = statistics.iterator();
            while (it92.hasNext()) {
                Iterator it93 = it92;
                Integer puntReturnsTouchdowns = ((AmericanFootballPlayerSeasonStatistics) it92.next()).getPuntReturnsTouchdowns();
                if (puntReturnsTouchdowns != null) {
                    arrayList53.add(puntReturnsTouchdowns);
                }
                it92 = it93;
            }
            Integer m690nullableSum50 = companion52.m690nullableSum((List<Integer>) arrayList53);
            AbstractPlayerSeasonStatistics.Companion companion53 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList54 = new ArrayList();
            Iterator it94 = statistics.iterator();
            while (it94.hasNext()) {
                Iterator it95 = it94;
                Integer puntReturnsYards = ((AmericanFootballPlayerSeasonStatistics) it94.next()).getPuntReturnsYards();
                if (puntReturnsYards != null) {
                    arrayList54.add(puntReturnsYards);
                }
                it94 = it95;
            }
            Integer m690nullableSum51 = companion53.m690nullableSum((List<Integer>) arrayList54);
            AbstractPlayerSeasonStatistics.Companion companion54 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList55 = new ArrayList();
            Iterator it96 = statistics.iterator();
            while (it96.hasNext()) {
                Iterator it97 = it96;
                Integer puntReturnsFairCatches = ((AmericanFootballPlayerSeasonStatistics) it96.next()).getPuntReturnsFairCatches();
                if (puntReturnsFairCatches != null) {
                    arrayList55.add(puntReturnsFairCatches);
                }
                it96 = it97;
            }
            Integer m690nullableSum52 = companion54.m690nullableSum((List<Integer>) arrayList55);
            AbstractPlayerSeasonStatistics.Companion companion55 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList56 = new ArrayList();
            Iterator it98 = statistics.iterator();
            while (it98.hasNext()) {
                Iterator it99 = it98;
                Integer puntingBlocked = ((AmericanFootballPlayerSeasonStatistics) it98.next()).getPuntingBlocked();
                if (puntingBlocked != null) {
                    arrayList56.add(puntingBlocked);
                }
                it98 = it99;
            }
            Integer m690nullableSum53 = companion55.m690nullableSum((List<Integer>) arrayList56);
            AbstractPlayerSeasonStatistics.Companion companion56 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList57 = new ArrayList();
            Iterator it100 = statistics.iterator();
            while (it100.hasNext()) {
                Iterator it101 = it100;
                Integer puntingInside20 = ((AmericanFootballPlayerSeasonStatistics) it100.next()).getPuntingInside20();
                if (puntingInside20 != null) {
                    arrayList57.add(puntingInside20);
                }
                it100 = it101;
            }
            Integer m690nullableSum54 = companion56.m690nullableSum((List<Integer>) arrayList57);
            ArrayList arrayList58 = new ArrayList();
            Iterator<T> it102 = statistics.iterator();
            while (it102.hasNext()) {
                Integer puntingLongest = ((AmericanFootballPlayerSeasonStatistics) it102.next()).getPuntingLongest();
                if (puntingLongest != null) {
                    arrayList58.add(puntingLongest);
                }
            }
            Integer num2 = (Integer) CollectionsKt.k0(arrayList58);
            AbstractPlayerSeasonStatistics.Companion companion57 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList59 = new ArrayList();
            Iterator it103 = statistics.iterator();
            while (it103.hasNext()) {
                Iterator it104 = it103;
                Integer puntingNetYards = ((AmericanFootballPlayerSeasonStatistics) it103.next()).getPuntingNetYards();
                if (puntingNetYards != null) {
                    arrayList59.add(puntingNetYards);
                }
                it103 = it104;
            }
            Integer m690nullableSum55 = companion57.m690nullableSum((List<Integer>) arrayList59);
            AbstractPlayerSeasonStatistics.Companion companion58 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList60 = new ArrayList();
            Iterator it105 = statistics.iterator();
            while (it105.hasNext()) {
                Iterator it106 = it105;
                Integer puntingTotal = ((AmericanFootballPlayerSeasonStatistics) it105.next()).getPuntingTotal();
                if (puntingTotal != null) {
                    arrayList60.add(puntingTotal);
                }
                it105 = it106;
            }
            Integer m690nullableSum56 = companion58.m690nullableSum((List<Integer>) arrayList60);
            AbstractPlayerSeasonStatistics.Companion companion59 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList61 = new ArrayList();
            Iterator it107 = statistics.iterator();
            while (it107.hasNext()) {
                Iterator it108 = it107;
                Integer puntingTouchbacks = ((AmericanFootballPlayerSeasonStatistics) it107.next()).getPuntingTouchbacks();
                if (puntingTouchbacks != null) {
                    arrayList61.add(puntingTouchbacks);
                }
                it107 = it108;
            }
            Integer m690nullableSum57 = companion59.m690nullableSum((List<Integer>) arrayList61);
            AbstractPlayerSeasonStatistics.Companion companion60 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList62 = new ArrayList();
            Iterator it109 = statistics.iterator();
            while (it109.hasNext()) {
                Iterator it110 = it109;
                Integer puntingYards = ((AmericanFootballPlayerSeasonStatistics) it109.next()).getPuntingYards();
                if (puntingYards != null) {
                    arrayList62.add(puntingYards);
                }
                it109 = it110;
            }
            Integer m690nullableSum58 = companion60.m690nullableSum((List<Integer>) arrayList62);
            AbstractPlayerSeasonStatistics.Companion companion61 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList63 = new ArrayList();
            Iterator it111 = statistics.iterator();
            while (it111.hasNext()) {
                Iterator it112 = it111;
                Integer receivingFirstDowns = ((AmericanFootballPlayerSeasonStatistics) it111.next()).getReceivingFirstDowns();
                if (receivingFirstDowns != null) {
                    arrayList63.add(receivingFirstDowns);
                }
                it111 = it112;
            }
            Integer m690nullableSum59 = companion61.m690nullableSum((List<Integer>) arrayList63);
            ArrayList arrayList64 = new ArrayList();
            Iterator<T> it113 = statistics.iterator();
            while (it113.hasNext()) {
                Integer receivingLongest = ((AmericanFootballPlayerSeasonStatistics) it113.next()).getReceivingLongest();
                if (receivingLongest != null) {
                    arrayList64.add(receivingLongest);
                }
            }
            Integer num3 = (Integer) CollectionsKt.k0(arrayList64);
            AbstractPlayerSeasonStatistics.Companion companion62 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList65 = new ArrayList();
            Iterator it114 = statistics.iterator();
            while (it114.hasNext()) {
                Iterator it115 = it114;
                Integer receivingReceptions = ((AmericanFootballPlayerSeasonStatistics) it114.next()).getReceivingReceptions();
                if (receivingReceptions != null) {
                    arrayList65.add(receivingReceptions);
                }
                it114 = it115;
            }
            Integer m690nullableSum60 = companion62.m690nullableSum((List<Integer>) arrayList65);
            AbstractPlayerSeasonStatistics.Companion companion63 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList66 = new ArrayList();
            Iterator it116 = statistics.iterator();
            while (it116.hasNext()) {
                Iterator it117 = it116;
                Integer receivingTouchdowns = ((AmericanFootballPlayerSeasonStatistics) it116.next()).getReceivingTouchdowns();
                if (receivingTouchdowns != null) {
                    arrayList66.add(receivingTouchdowns);
                }
                it116 = it117;
            }
            Integer m690nullableSum61 = companion63.m690nullableSum((List<Integer>) arrayList66);
            AbstractPlayerSeasonStatistics.Companion companion64 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList67 = new ArrayList();
            Iterator it118 = statistics.iterator();
            while (it118.hasNext()) {
                Iterator it119 = it118;
                Integer receivingYards = ((AmericanFootballPlayerSeasonStatistics) it118.next()).getReceivingYards();
                if (receivingYards != null) {
                    arrayList67.add(receivingYards);
                }
                it118 = it119;
            }
            Integer m690nullableSum62 = companion64.m690nullableSum((List<Integer>) arrayList67);
            AbstractPlayerSeasonStatistics.Companion companion65 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList68 = new ArrayList();
            Iterator it120 = statistics.iterator();
            while (it120.hasNext()) {
                Iterator it121 = it120;
                Integer receivingTargets = ((AmericanFootballPlayerSeasonStatistics) it120.next()).getReceivingTargets();
                if (receivingTargets != null) {
                    arrayList68.add(receivingTargets);
                }
                it120 = it121;
            }
            Integer m690nullableSum63 = companion65.m690nullableSum((List<Integer>) arrayList68);
            AbstractPlayerSeasonStatistics.Companion companion66 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList69 = new ArrayList();
            Iterator it122 = statistics.iterator();
            while (it122.hasNext()) {
                Iterator it123 = it122;
                Integer rushingAttempts = ((AmericanFootballPlayerSeasonStatistics) it122.next()).getRushingAttempts();
                if (rushingAttempts != null) {
                    arrayList69.add(rushingAttempts);
                }
                it122 = it123;
            }
            Integer m690nullableSum64 = companion66.m690nullableSum((List<Integer>) arrayList69);
            AbstractPlayerSeasonStatistics.Companion companion67 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList70 = new ArrayList();
            Iterator it124 = statistics.iterator();
            while (it124.hasNext()) {
                Iterator it125 = it124;
                Integer rushingFumbles = ((AmericanFootballPlayerSeasonStatistics) it124.next()).getRushingFumbles();
                if (rushingFumbles != null) {
                    arrayList70.add(rushingFumbles);
                }
                it124 = it125;
            }
            Integer m690nullableSum65 = companion67.m690nullableSum((List<Integer>) arrayList70);
            ArrayList arrayList71 = new ArrayList();
            Iterator<T> it126 = statistics.iterator();
            while (it126.hasNext()) {
                Integer rushingLongest = ((AmericanFootballPlayerSeasonStatistics) it126.next()).getRushingLongest();
                if (rushingLongest != null) {
                    arrayList71.add(rushingLongest);
                }
            }
            Integer num4 = (Integer) CollectionsKt.k0(arrayList71);
            AbstractPlayerSeasonStatistics.Companion companion68 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList72 = new ArrayList();
            Iterator it127 = statistics.iterator();
            while (it127.hasNext()) {
                Iterator it128 = it127;
                Integer rushingTouchdowns = ((AmericanFootballPlayerSeasonStatistics) it127.next()).getRushingTouchdowns();
                if (rushingTouchdowns != null) {
                    arrayList72.add(rushingTouchdowns);
                }
                it127 = it128;
            }
            Integer m690nullableSum66 = companion68.m690nullableSum((List<Integer>) arrayList72);
            AbstractPlayerSeasonStatistics.Companion companion69 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList73 = new ArrayList();
            Iterator it129 = statistics.iterator();
            while (it129.hasNext()) {
                Iterator it130 = it129;
                Integer rushingYards = ((AmericanFootballPlayerSeasonStatistics) it129.next()).getRushingYards();
                if (rushingYards != null) {
                    arrayList73.add(rushingYards);
                }
                it129 = it130;
            }
            Integer m690nullableSum67 = companion69.m690nullableSum((List<Integer>) arrayList73);
            AbstractPlayerSeasonStatistics.Companion companion70 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList74 = new ArrayList();
            Iterator it131 = statistics.iterator();
            while (it131.hasNext()) {
                Iterator it132 = it131;
                Integer rushingFirstDowns = ((AmericanFootballPlayerSeasonStatistics) it131.next()).getRushingFirstDowns();
                if (rushingFirstDowns != null) {
                    arrayList74.add(rushingFirstDowns);
                }
                it131 = it132;
            }
            return new AmericanFootballPlayerSeasonStatistics(i2, type, m690nullableSum, nullableSum, m690nullableSum2, m690nullableSum3, m690nullableSum4, m690nullableSum5, m690nullableSum6, m690nullableSum7, m690nullableSum8, nullableSum2, m690nullableSum9, m690nullableSum10, m690nullableSum11, m690nullableSum12, m690nullableSum13, m690nullableSum14, m690nullableSum15, m690nullableSum16, m690nullableSum17, m690nullableSum18, m690nullableSum19, m690nullableSum20, m690nullableSum21, m690nullableSum22, m690nullableSum23, m690nullableSum24, m690nullableSum25, m690nullableSum26, m690nullableSum27, m690nullableSum28, m690nullableSum29, m690nullableSum30, m690nullableSum31, m690nullableSum32, m690nullableSum33, m690nullableSum34, m690nullableSum35, m690nullableSum36, m690nullableSum37, m690nullableSum38, m690nullableSum39, m690nullableSum40, m690nullableSum41, m690nullableSum42, num, m690nullableSum43, m690nullableSum44, m690nullableSum45, m690nullableSum46, m690nullableSum47, m690nullableSum48, m690nullableSum49, m690nullableSum50, m690nullableSum51, m690nullableSum52, m690nullableSum53, m690nullableSum54, num2, m690nullableSum55, m690nullableSum56, m690nullableSum57, m690nullableSum58, m690nullableSum59, num3, m690nullableSum60, m690nullableSum61, m690nullableSum62, m690nullableSum63, m690nullableSum64, m690nullableSum65, num4, m690nullableSum66, m690nullableSum67, companion70.m690nullableSum((List<Integer>) arrayList74));
        }

        @NotNull
        public final KSerializer serializer() {
            return AmericanFootballPlayerSeasonStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AmericanFootballPlayerSeasonStatistics(int i, @NotNull String str, @Nullable Integer num, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Double d2, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24, @Nullable Integer num25, @Nullable Integer num26, @Nullable Integer num27, @Nullable Integer num28, @Nullable Integer num29, @Nullable Integer num30, @Nullable Integer num31, @Nullable Integer num32, @Nullable Integer num33, @Nullable Integer num34, @Nullable Integer num35, @Nullable Integer num36, @Nullable Integer num37, @Nullable Integer num38, @Nullable Integer num39, @Nullable Integer num40, @Nullable Integer num41, @Nullable Integer num42, @Nullable Integer num43, @Nullable Integer num44, @Nullable Integer num45, @Nullable Integer num46, @Nullable Integer num47, @Nullable Integer num48, @Nullable Integer num49, @Nullable Integer num50, @Nullable Integer num51, @Nullable Integer num52, @Nullable Integer num53, @Nullable Integer num54, @Nullable Integer num55, @Nullable Integer num56, @Nullable Integer num57, @Nullable Integer num58, @Nullable Integer num59, @Nullable Integer num60, @Nullable Integer num61, @Nullable Integer num62, @Nullable Integer num63, @Nullable Integer num64, @Nullable Integer num65, @Nullable Integer num66, @Nullable Integer num67, @Nullable Integer num68, @Nullable Integer num69, @Nullable Integer num70, @Nullable Integer num71, @Nullable Integer num72) {
        Integer num73 = num40;
        str.getClass();
        this.id = i;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.defensiveAssistTackles = num2;
        this.defensiveCombineTackles = num3;
        this.defensiveForcedFumbles = num4;
        this.defensiveInterceptions = num5;
        this.defensiveInterceptionsTouchdowns = num6;
        this.defensiveInterceptionsYards = num7;
        this.defensivePassesDefensed = num8;
        this.defensiveSacks = d2;
        this.defensiveSafeties = num9;
        this.defensiveTotalTackles = num10;
        this.fumbleFumbles = num11;
        this.fumbleLost = num12;
        this.fumbleRecovery = num13;
        this.fumbleSafety = num14;
        this.kickReturnsFumbles = num15;
        this.kickReturnsLong = num16;
        this.kickReturnsTotal = num17;
        this.kickReturnsTouchdowns = num18;
        this.kickReturnsYards = num19;
        this.kickReturnsFairCatches = num20;
        this.kickingExtraAttempts = num21;
        this.kickingExtraMade = num22;
        this.kickingFgAttempts = num23;
        this.kickingFgAttempts20to29 = num24;
        this.kickingFgAttempts30to39 = num25;
        this.kickingFgAttempts40to49 = num26;
        this.kickingFgAttempts50plus = num27;
        this.kickingFgBlocked = num28;
        this.kickingFgLong = num29;
        this.kickingFgMade = num30;
        this.kickingFgMade20to29 = num31;
        this.kickingFgMade30to39 = num32;
        this.kickingFgMade40to49 = num33;
        this.kickingFgMade50plus = num34;
        this.kickingTotalPoints = num35;
        this.kickingFgMade1to19 = num36;
        this.kickoffReturns = num37;
        this.kickoffTotal = num38;
        this.kickoffTouchbacks = num39;
        this.passingAttempts = num73;
        this.passingCompletions = num41;
        this.passingInterceptions = num42;
        this.passingLongest = num43;
        this.passingNetYards = num44;
        this.passingSacked = num45;
        this.passingTouchdowns = num46;
        this.passingYards = num47;
        this.passingFirstDowns = num48;
        this.puntReturnsLong = num49;
        this.puntReturnsTotal = num50;
        this.puntReturnsTouchdowns = num51;
        this.puntReturnsYards = num52;
        this.puntReturnsFairCatches = num53;
        this.puntingBlocked = num54;
        this.puntingInside20 = num55;
        this.puntingLongest = num56;
        this.puntingNetYards = num57;
        this.puntingTotal = num58;
        this.puntingTouchbacks = num59;
        this.puntingYards = num60;
        this.receivingFirstDowns = num61;
        this.receivingLongest = num62;
        this.receivingReceptions = num63;
        this.receivingTouchdowns = num64;
        this.receivingYards = num65;
        this.receivingTargets = num66;
        this.rushingAttempts = num67;
        this.rushingFumbles = num68;
        this.rushingLongest = num69;
        this.rushingTouchdowns = num70;
        this.rushingYards = num71;
        this.rushingFirstDowns = num72;
        Double d3 = null;
        if (num73 != null) {
            num73 = num73.intValue() == 0 ? null : num73;
            if (num73 != null) {
                double intValue = num73.intValue();
                d3 = Double.valueOf(Math.rint((((((Math.min(Math.max((((num41 != null ? num41.intValue() : 0) / intValue) - 0.3d) * 5.0d, 0.0d), 2.375d) + Math.min(Math.max((((num47 != null ? num47.intValue() : 0) / intValue) - 3.0d) * 0.25d, 0.0d), 2.375d)) + Math.min(Math.max(((num46 != null ? num46.intValue() : 0) / intValue) * 20.0d, 0.0d), 2.375d)) + Math.min(Math.max(2.375d - (((num42 != null ? num42.intValue() : 0) / intValue) * 25.0d), 0.0d), 2.375d)) / 6.0d) * 100.0d) * 10.0d) / 10.0d);
            }
        }
        this.passerRating = d3;
    }
}
