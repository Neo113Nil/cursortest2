package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.Y1;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.IUrlSharing;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.TeamLinkedRoundsSerializer;
import com.sofascore.model.network.response.serializers.TeamSerializer;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.egi;
import defpackage.fn0;
import defpackage.joa;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.wx4;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = TeamSerializer.class)
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bJ\b\u0087\b\u0018\u0000 ã\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004ä\u0001ã\u0001B\u008f\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010(\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010,\u001a\u0004\u0018\u00010\n\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102\u0012\b\u00105\u001a\u0004\u0018\u00010\u0005\u0012\b\u00106\u001a\u0004\u0018\u00010\u0005\u0012\b\u00107\u001a\u0004\u0018\u00010\u0005\u0012\b\u00108\u001a\u0004\u0018\u00010\u0005\u0012\b\u00109\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u000102\u0012\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u000102¢\u0006\u0004\bA\u0010BB\u009b\u0001\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010(\u001a\u00020&\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\bA\u0010CB/\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bA\u0010EB)\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\bA\u0010FB¹\u0003\b\u0010\u0012\u0006\u0010G\u001a\u00020\u0005\u0012\u0006\u0010H\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010(\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010,\u001a\u0004\u0018\u00010\n\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102\u0012\b\u00105\u001a\u0004\u0018\u00010\u0005\u0012\b\u00106\u001a\u0004\u0018\u00010\u0005\u0012\b\u00107\u001a\u0004\u0018\u00010\u0005\u0012\b\u00108\u001a\u0004\u0018\u00010\u0005\u0012\b\u00109\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u000102\u0012\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u000102\u0012\u0006\u0010I\u001a\u00020&\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0004\bA\u0010MJ\r\u0010N\u001a\u00020&¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020&2\u0006\u0010P\u001a\u00020\u0005¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bW\u0010VJ\u0010\u0010X\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bZ\u0010TJ\u0010\u0010[\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b]\u0010VJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b^\u0010VJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\ba\u0010`J\u0012\u0010b\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0012\u0010f\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0012\u0010h\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bh\u0010iJ\u0012\u0010j\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0012\u0010l\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0012\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0012\u0010r\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\br\u0010sJ\u0012\u0010t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bt\u0010qJ\u0010\u0010u\u001a\u00020&HÆ\u0003¢\u0006\u0004\bu\u0010OJ\u0010\u0010v\u001a\u00020&HÆ\u0003¢\u0006\u0004\bv\u0010OJ\u0012\u0010w\u001a\u0004\u0018\u00010\u0000HÆ\u0003¢\u0006\u0004\bw\u0010xJ\u0012\u0010y\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0004\by\u0010zJ\u0012\u0010{\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b{\u0010|J\u0012\u0010}\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b}\u0010qJ\u0012\u0010~\u001a\u0004\u0018\u00010.HÆ\u0003¢\u0006\u0004\b~\u0010\u007fJ\u0015\u0010\u0080\u0001\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102HÆ\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0014\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010qJ\u0014\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0005\b\u0085\u0001\u0010qJ\u0014\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010qJ\u0014\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010qJ\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0005\b\u0088\u0001\u0010qJ\u0014\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0005\b\u0089\u0001\u0010qJ\u0015\u0010\u008a\u0001\u001a\u0004\u0018\u00010;HÆ\u0003¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001b\u0010\u008c\u0001\u001a\n\u0012\u0004\u0012\u00020=\u0018\u000102HÆ\u0003¢\u0006\u0006\b\u008c\u0001\u0010\u0083\u0001J\u001b\u0010\u008d\u0001\u001a\n\u0012\u0004\u0012\u00020?\u0018\u000102HÆ\u0003¢\u0006\u0006\b\u008d\u0001\u0010\u0083\u0001JÝ\u0003\u0010\u008e\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u0001022\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u0001022\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u000102HÆ\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0012\u0010\u0090\u0001\u001a\u00020\u0007HÖ\u0001¢\u0006\u0005\b\u0090\u0001\u0010VJ\u0012\u0010\u0091\u0001\u001a\u00020\u0005HÖ\u0001¢\u0006\u0005\b\u0091\u0001\u0010TJ\u001f\u0010\u0094\u0001\u001a\u00020&2\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u0001HÖ\u0003¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J0\u0010\u009e\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u0096\u0001\u001a\u00020\u00002\b\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001c\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0006\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010TR$\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\b\u0010¡\u0001\u0012\u0006\b£\u0001\u0010¤\u0001\u001a\u0005\b¢\u0001\u0010VR\u0019\u0010\t\u001a\u00020\u00078\u0006¢\u0006\u000e\n\u0005\b\t\u0010¡\u0001\u001a\u0005\b¥\u0001\u0010VR\u0019\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010¦\u0001\u001a\u0005\b§\u0001\u0010YR\u0019\u0010\f\u001a\u00020\u00058\u0006¢\u0006\u000e\n\u0005\b\f\u0010\u009f\u0001\u001a\u0005\b¨\u0001\u0010TR\u001c\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010©\u0001\u001a\u0005\bª\u0001\u0010\\R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010¡\u0001\u001a\u0005\b«\u0001\u0010VR&\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0010\u0010¡\u0001\u0012\u0006\b\u00ad\u0001\u0010¤\u0001\u001a\u0005\b¬\u0001\u0010VR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010®\u0001\u001a\u0005\b¯\u0001\u0010`R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010®\u0001\u001a\u0005\b°\u0001\u0010`R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010±\u0001\u001a\u0005\b²\u0001\u0010cR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010³\u0001\u001a\u0005\b´\u0001\u0010eR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010µ\u0001\u001a\u0005\b¶\u0001\u0010gR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010·\u0001\u001a\u0005\b¸\u0001\u0010iR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010¹\u0001\u001a\u0005\bº\u0001\u0010kR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010»\u0001\u001a\u0005\b¼\u0001\u0010mR\u001e\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b!\u0010½\u0001\u001a\u0005\b¾\u0001\u0010oR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010¿\u0001\u001a\u0005\bÀ\u0001\u0010qR\u001e\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b$\u0010Á\u0001\u001a\u0005\bÂ\u0001\u0010sR\u001b\u0010%\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b%\u0010¿\u0001\u001a\u0005\bÃ\u0001\u0010qR\u0019\u0010'\u001a\u00020&8\u0006¢\u0006\u000e\n\u0005\b'\u0010Ä\u0001\u001a\u0005\bÅ\u0001\u0010OR\u001c\u0010(\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010Ä\u0001\u001a\u0005\bÆ\u0001\u0010OR\u001e\u0010)\u001a\u0004\u0018\u00010\u00008\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010Ç\u0001\u001a\u0005\bÈ\u0001\u0010xR\u001e\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010É\u0001\u001a\u0005\bÊ\u0001\u0010zR\u001e\u0010,\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010Ë\u0001\u001a\u0005\bÌ\u0001\u0010|R\u001e\u0010-\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010¿\u0001\u001a\u0005\bÍ\u0001\u0010qR\u001e\u0010/\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b/\u0010Î\u0001\u001a\u0005\bÏ\u0001\u0010\u007fR\u001f\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b1\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010\u0081\u0001R%\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b4\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010\u0083\u0001R\u001e\u00105\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b5\u0010¿\u0001\u001a\u0005\bÔ\u0001\u0010qR\u001e\u00106\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b6\u0010¿\u0001\u001a\u0005\bÕ\u0001\u0010qR\u001e\u00107\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b7\u0010¿\u0001\u001a\u0005\bÖ\u0001\u0010qR\u001e\u00108\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b8\u0010¿\u0001\u001a\u0005\b×\u0001\u0010qR\u001e\u00109\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b9\u0010¿\u0001\u001a\u0005\bØ\u0001\u0010qR\u001e\u0010:\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b:\u0010¿\u0001\u001a\u0005\bÙ\u0001\u0010qR\u001f\u0010<\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b<\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010\u008b\u0001R%\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b>\u0010Ò\u0001\u001a\u0006\bÜ\u0001\u0010\u0083\u0001R%\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b@\u0010Ò\u0001\u001a\u0006\bÝ\u0001\u0010\u0083\u0001R%\u0010I\u001a\u00020&8\u0016@\u0016X\u0097\u000e¢\u0006\u0015\n\u0005\bI\u0010Ä\u0001\u001a\u0004\bI\u0010O\"\u0006\bÞ\u0001\u0010ß\u0001R\u001c\u0010J\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bJ\u0010¡\u0001\u001a\u0005\bà\u0001\u0010VR\u0018\u0010â\u0001\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bá\u0001\u0010V¨\u0006å\u0001"}, d2 = {"Lcom/sofascore/model/mvvm/model/Team;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/IRecent;", "Lcom/sofascore/model/mvvm/IUrlSharing;", "Lcom/sofascore/model/mvvm/model/IShareContent;", "", "id", "", "name", "slug", "", "userCount", "type", "Lcom/sofascore/model/mvvm/model/TeamColors;", "teamColors", "nameCode", "shortName", "Lcom/sofascore/model/mvvm/model/SubTeam;", "subTeam1", "subTeam2", "Lcom/sofascore/model/mvvm/model/Gender;", InneractiveMediationDefs.KEY_GENDER, "Lcom/sofascore/model/mvvm/model/Sport;", SearchResponseKt.SPORT_ENTITY, "Lcom/sofascore/model/mvvm/model/Category;", "category", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "primaryUniqueTournament", "Lcom/sofascore/model/mvvm/model/Manager;", SearchResponseKt.MANAGER_ENTITY, "Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;", "playerTeamInfo", "Lcom/sofascore/model/mvvm/model/MotorsportTeamInfo;", "motorsportTeamInfo", "sportVariant", "Lcom/sofascore/model/mvvm/model/Venue;", "venue", "ranking", "", Y1.e, "national", "parentTeam", "Lcom/sofascore/model/mvvm/model/Country;", "country", "foundationDateTimestamp", "championshipsWon", "Lcom/sofascore/model/mvvm/model/Tournament;", "tournament", "Lcom/sofascore/model/mvvm/model/Record;", "wdlRecord", "", "Lcom/sofascore/model/mvvm/model/TeamRankings;", "teamRankings", "capMaximum", "luxuryTaxThreshold", "signedPlayers", "activeCap", "totalCap", "capSpace", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "fieldTranslations", "Lcom/sofascore/model/mvvm/model/TeamTimeActiveData;", "timeActive", "Lcom/sofascore/model/mvvm/model/TeamLinkedRound;", "teamLinks", "<init>", "(ILjava/lang/String;Ljava/lang/String;JILcom/sofascore/model/mvvm/model/TeamColors;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/SubTeam;Lcom/sofascore/model/mvvm/model/SubTeam;Lcom/sofascore/model/mvvm/model/Gender;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/Category;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/Manager;Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;Lcom/sofascore/model/mvvm/model/MotorsportTeamInfo;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Venue;Ljava/lang/Integer;ZZLcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Country;Ljava/lang/Long;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Tournament;Lcom/sofascore/model/mvvm/model/Record;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/FieldTranslations;Ljava/util/List;Ljava/util/List;)V", "(ILjava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/SubTeam;Lcom/sofascore/model/mvvm/model/SubTeam;Lcom/sofascore/model/mvvm/model/Gender;Lcom/sofascore/model/mvvm/model/Sport;Ljava/lang/Integer;ZZLcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/FieldTranslations;)V", "countryAlpha2", "(ILjava/lang/String;ILjava/lang/String;)V", "(ILjava/lang/String;ZZ)V", "seen0", "seen1", "isRecent", "webUrl", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/String;JILcom/sofascore/model/mvvm/model/TeamColors;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/SubTeam;Lcom/sofascore/model/mvvm/model/SubTeam;Lcom/sofascore/model/mvvm/model/Gender;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/Category;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/Manager;Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;Lcom/sofascore/model/mvvm/model/MotorsportTeamInfo;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Venue;Ljava/lang/Integer;ZZLcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Country;Ljava/lang/Long;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Tournament;Lcom/sofascore/model/mvvm/model/Record;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/FieldTranslations;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Lt5h;)V", "hasSubTeams", "()Z", "teamId", "contains", "(I)Z", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()J", "component5", "component6", "()Lcom/sofascore/model/mvvm/model/TeamColors;", "component7", "component8", "component9", "()Lcom/sofascore/model/mvvm/model/SubTeam;", "component10", "component11", "()Lcom/sofascore/model/mvvm/model/Gender;", "component12", "()Lcom/sofascore/model/mvvm/model/Sport;", "component13", "()Lcom/sofascore/model/mvvm/model/Category;", "component14", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "component15", "()Lcom/sofascore/model/mvvm/model/Manager;", "component16", "()Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;", "component17", "()Lcom/sofascore/model/mvvm/model/MotorsportTeamInfo;", "component18", "()Ljava/lang/Integer;", "component19", "()Lcom/sofascore/model/mvvm/model/Venue;", "component20", "component21", "component22", "component23", "()Lcom/sofascore/model/mvvm/model/Team;", "component24", "()Lcom/sofascore/model/mvvm/model/Country;", "component25", "()Ljava/lang/Long;", "component26", "component27", "()Lcom/sofascore/model/mvvm/model/Tournament;", "component28", "()Lcom/sofascore/model/mvvm/model/Record;", "component29", "()Ljava/util/List;", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "component37", "component38", "copy", "(ILjava/lang/String;Ljava/lang/String;JILcom/sofascore/model/mvvm/model/TeamColors;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/SubTeam;Lcom/sofascore/model/mvvm/model/SubTeam;Lcom/sofascore/model/mvvm/model/Gender;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/Category;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/Manager;Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;Lcom/sofascore/model/mvvm/model/MotorsportTeamInfo;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Venue;Ljava/lang/Integer;ZZLcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Country;Ljava/lang/Long;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Tournament;Lcom/sofascore/model/mvvm/model/Record;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/FieldTranslations;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/mvvm/model/Team;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Team;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getSlug", "J", "getUserCount", "getType", "Lcom/sofascore/model/mvvm/model/TeamColors;", "getTeamColors", "getNameCode", "getShortName", "getShortName$annotations", "Lcom/sofascore/model/mvvm/model/SubTeam;", "getSubTeam1", "getSubTeam2", "Lcom/sofascore/model/mvvm/model/Gender;", "getGender", "Lcom/sofascore/model/mvvm/model/Sport;", "getSport", "Lcom/sofascore/model/mvvm/model/Category;", "getCategory", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getPrimaryUniqueTournament", "Lcom/sofascore/model/mvvm/model/Manager;", "getManager", "Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;", "getPlayerTeamInfo", "Lcom/sofascore/model/mvvm/model/MotorsportTeamInfo;", "getMotorsportTeamInfo", "Ljava/lang/Integer;", "getSportVariant", "Lcom/sofascore/model/mvvm/model/Venue;", "getVenue", "getRanking", "Z", "getDisabled", "getNational", "Lcom/sofascore/model/mvvm/model/Team;", "getParentTeam", "Lcom/sofascore/model/mvvm/model/Country;", "getCountry", "Ljava/lang/Long;", "getFoundationDateTimestamp", "getChampionshipsWon", "Lcom/sofascore/model/mvvm/model/Tournament;", "getTournament", "Lcom/sofascore/model/mvvm/model/Record;", "getWdlRecord", "Ljava/util/List;", "getTeamRankings", "getCapMaximum", "getLuxuryTaxThreshold", "getSignedPlayers", "getActiveCap", "getTotalCap", "getCapSpace", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getFieldTranslations", "getTimeActive", "getTeamLinks", "setRecent", "(Z)V", "getWebUrl", "getSportSlug", "sportSlug", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Team implements Serializable, IRecent, IUrlSharing, IShareContent {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer activeCap;

    @Nullable
    private final Integer capMaximum;

    @Nullable
    private final Integer capSpace;

    @Nullable
    private final Category category;

    @Nullable
    private final Integer championshipsWon;

    @Nullable
    private final Country country;
    private final boolean disabled;

    @Nullable
    private final FieldTranslations fieldTranslations;

    @Nullable
    private final Long foundationDateTimestamp;

    @Nullable
    private final Gender gender;
    private final int id;
    private boolean isRecent;

    @Nullable
    private final Integer luxuryTaxThreshold;

    @Nullable
    private final Manager manager;

    @Nullable
    private final MotorsportTeamInfo motorsportTeamInfo;

    @NotNull
    private final String name;

    @Nullable
    private final String nameCode;
    private final boolean national;

    @Nullable
    private final Team parentTeam;

    @Nullable
    private final PlayerTeamInfo playerTeamInfo;

    @Nullable
    private final UniqueTournament primaryUniqueTournament;

    @Nullable
    private final Integer ranking;

    @Nullable
    private final String shortName;

    @Nullable
    private final Integer signedPlayers;

    @NotNull
    private final String slug;

    @Nullable
    private final Sport sport;

    @Nullable
    private final Integer sportVariant;

    @Nullable
    private final SubTeam subTeam1;

    @Nullable
    private final SubTeam subTeam2;

    @NotNull
    private final TeamColors teamColors;

    @Nullable
    private final List<TeamLinkedRound> teamLinks;

    @Nullable
    private final List<TeamRankings> teamRankings;

    @Nullable
    private final List<TeamTimeActiveData> timeActive;

    @Nullable
    private final Integer totalCap;

    @Nullable
    private final Tournament tournament;
    private final int type;
    private final long userCount;

    @Nullable
    private final Venue venue;

    @Nullable
    private final Record wdlRecord;

    @NotNull
    private final String webUrl;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new egi(15)), null, null, null, null, null, ypa.a(ysaVar, new egi(16)), null, null, null, null, null, null, null, ypa.a(ysaVar, new egi(17)), ypa.a(ysaVar, new egi(18)), null, null};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011a, code lost:
    
        if (r7.equals(com.sofascore.model.Sports.TABLE_TENNIS) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0160, code lost:
    
        r7 = getSportSlug();
        r9 = getId();
        r7 = defpackage.mz1.s("/", r7, "/player/", r11, "/");
        r7.append(r9);
        r7 = r7.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0123, code lost:
    
        if (r7.equals(com.sofascore.model.Sports.DARTS) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014b, code lost:
    
        if (r7.equals(com.sofascore.model.Sports.TENNIS) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0154, code lost:
    
        if (r7.equals(com.sofascore.model.Sports.BADMINTON) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015d, code lost:
    
        if (r7.equals(com.sofascore.model.Sports.SNOOKER) == false) goto L69;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Team(int i, int i2, int i3, String str, String str2, long j, int i4, TeamColors teamColors, String str3, String str4, SubTeam subTeam, SubTeam subTeam2, Gender gender, Sport sport, Category category, UniqueTournament uniqueTournament, Manager manager, PlayerTeamInfo playerTeamInfo, MotorsportTeamInfo motorsportTeamInfo, Integer num, Venue venue, Integer num2, boolean z, boolean z2, Team team, Country country, Long l, Integer num3, Tournament tournament, Record record, List list, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, FieldTranslations fieldTranslations, List list2, List list3, boolean z3, String str5, t5h t5hVar) {
        String l2;
        if ((-3145777 != (i & (-3145777))) || (31 != (i2 & 31))) {
            oea.y(new int[]{i, i2}, new int[]{-3145777, 31}, Team$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.name = str;
        this.slug = str2;
        this.userCount = j;
        if ((i & 16) == 0) {
            this.type = 0;
        } else {
            this.type = i4;
        }
        if ((i & 32) == 0) {
            this.teamColors = new TeamColors();
        } else {
            this.teamColors = teamColors;
        }
        this.nameCode = str3;
        this.shortName = str4;
        this.subTeam1 = subTeam;
        this.subTeam2 = subTeam2;
        this.gender = gender;
        this.sport = sport;
        this.category = category;
        this.primaryUniqueTournament = uniqueTournament;
        this.manager = manager;
        this.playerTeamInfo = playerTeamInfo;
        this.motorsportTeamInfo = motorsportTeamInfo;
        this.sportVariant = num;
        this.venue = venue;
        this.ranking = num2;
        if ((1048576 & i) == 0) {
            this.disabled = false;
        } else {
            this.disabled = z;
        }
        if ((i & 2097152) == 0) {
            this.national = false;
        } else {
            this.national = z2;
        }
        this.parentTeam = team;
        this.country = country;
        this.foundationDateTimestamp = l;
        this.championshipsWon = num3;
        this.tournament = tournament;
        this.wdlRecord = record;
        this.teamRankings = list;
        this.capMaximum = num4;
        this.luxuryTaxThreshold = num5;
        this.signedPlayers = num6;
        this.activeCap = num7;
        this.totalCap = num8;
        this.capSpace = num9;
        this.fieldTranslations = fieldTranslations;
        this.timeActive = list2;
        if ((i2 & 32) == 0) {
            this.teamLinks = null;
        } else {
            this.teamLinks = list3;
        }
        if ((i2 & 64) == 0) {
            this.isRecent = false;
        } else {
            this.isRecent = z3;
        }
        if ((i2 & 128) != 0) {
            this.webUrl = str5;
            return;
        }
        String sportSlug = getSportSlug();
        if (sportSlug != null) {
            switch (sportSlug.hashCode()) {
                case -2056128771:
                    break;
                case -2005973498:
                    break;
                case -877324069:
                    break;
                case 108225:
                    if (sportSlug.equals(Sports.MMA)) {
                        String sportSlug2 = getSportSlug();
                        int id = getId();
                        StringBuilder s = mz1.s("/", sportSlug2, "/fighter/", str2, "/");
                        s.append(id);
                        l2 = s.toString();
                        break;
                    }
                    break;
                case 95355092:
                    break;
                case 203883450:
                    break;
                case 400486431:
                    if (sportSlug.equals(Sports.MOTORSPORT)) {
                        String sportSlug3 = getSportSlug();
                        int id2 = getId();
                        StringBuilder s2 = mz1.s("/", sportSlug3, "/driver/", str2, "/");
                        s2.append(id2);
                        l2 = s2.toString();
                        break;
                    }
                    break;
            }
            this.webUrl = l2;
        }
        if (getSportSlug() != null) {
            String sportSlug4 = getSportSlug();
            int id3 = getId();
            StringBuilder s3 = mz1.s("/", sportSlug4, "/team/", str2, "/");
            s3.append(id3);
            l2 = s3.toString();
        } else {
            l2 = dmi.l(getId(), "/team/", str2, "/");
        }
        this.webUrl = l2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TeamRankings$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TeamTimeActiveData$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TeamLinkedRoundsSerializer.INSTANCE, 0);
    }

    public static /* synthetic */ Team copy$default(Team team, int i, String str, String str2, long j, int i2, TeamColors teamColors, String str3, String str4, SubTeam subTeam, SubTeam subTeam2, Gender gender, Sport sport, Category category, UniqueTournament uniqueTournament, Manager manager, PlayerTeamInfo playerTeamInfo, MotorsportTeamInfo motorsportTeamInfo, Integer num, Venue venue, Integer num2, boolean z, boolean z2, Team team2, Country country, Long l, Integer num3, Tournament tournament, Record record, List list, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, FieldTranslations fieldTranslations, List list2, List list3, int i3, int i4, Object obj) {
        List list4;
        List list5;
        boolean z3;
        Team team3;
        Country country2;
        Long l2;
        Integer num10;
        Tournament tournament2;
        Record record2;
        List list6;
        Integer num11;
        Integer num12;
        Integer num13;
        Integer num14;
        Integer num15;
        Integer num16;
        FieldTranslations fieldTranslations2;
        Manager manager2;
        String str5;
        String str6;
        SubTeam subTeam3;
        SubTeam subTeam4;
        Gender gender2;
        Sport sport2;
        Category category2;
        UniqueTournament uniqueTournament2;
        PlayerTeamInfo playerTeamInfo2;
        MotorsportTeamInfo motorsportTeamInfo2;
        Integer num17;
        Venue venue2;
        Integer num18;
        boolean z4;
        String str7;
        String str8;
        long j2;
        int i5;
        TeamColors teamColors2;
        int i6 = (i3 & 1) != 0 ? team.id : i;
        String str9 = (i3 & 2) != 0 ? team.name : str;
        String str10 = (i3 & 4) != 0 ? team.slug : str2;
        long j3 = (i3 & 8) != 0 ? team.userCount : j;
        int i7 = (i3 & 16) != 0 ? team.type : i2;
        TeamColors teamColors3 = (i3 & 32) != 0 ? team.teamColors : teamColors;
        String str11 = (i3 & 64) != 0 ? team.nameCode : str3;
        String str12 = (i3 & 128) != 0 ? team.shortName : str4;
        SubTeam subTeam5 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? team.subTeam1 : subTeam;
        SubTeam subTeam6 = (i3 & 512) != 0 ? team.subTeam2 : subTeam2;
        Gender gender3 = (i3 & 1024) != 0 ? team.gender : gender;
        Sport sport3 = (i3 & a.o) != 0 ? team.sport : sport;
        Category category3 = (i3 & 4096) != 0 ? team.category : category;
        int i8 = i6;
        UniqueTournament uniqueTournament3 = (i3 & 8192) != 0 ? team.primaryUniqueTournament : uniqueTournament;
        Manager manager3 = (i3 & 16384) != 0 ? team.manager : manager;
        PlayerTeamInfo playerTeamInfo3 = (i3 & 32768) != 0 ? team.playerTeamInfo : playerTeamInfo;
        MotorsportTeamInfo motorsportTeamInfo3 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? team.motorsportTeamInfo : motorsportTeamInfo;
        Integer num19 = (i3 & 131072) != 0 ? team.sportVariant : num;
        Venue venue3 = (i3 & 262144) != 0 ? team.venue : venue;
        Integer num20 = (i3 & 524288) != 0 ? team.ranking : num2;
        boolean z5 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? team.disabled : z;
        boolean z6 = (i3 & 2097152) != 0 ? team.national : z2;
        Team team4 = (i3 & 4194304) != 0 ? team.parentTeam : team2;
        Country country3 = (i3 & 8388608) != 0 ? team.country : country;
        Long l3 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? team.foundationDateTimestamp : l;
        Integer num21 = (i3 & 33554432) != 0 ? team.championshipsWon : num3;
        Tournament tournament3 = (i3 & 67108864) != 0 ? team.tournament : tournament;
        Record record3 = (i3 & 134217728) != 0 ? team.wdlRecord : record;
        List list7 = (i3 & 268435456) != 0 ? team.teamRankings : list;
        Integer num22 = (i3 & 536870912) != 0 ? team.capMaximum : num4;
        Integer num23 = (i3 & 1073741824) != 0 ? team.luxuryTaxThreshold : num5;
        Integer num24 = (i3 & Integer.MIN_VALUE) != 0 ? team.signedPlayers : num6;
        Integer num25 = (i4 & 1) != 0 ? team.activeCap : num7;
        Integer num26 = (i4 & 2) != 0 ? team.totalCap : num8;
        Integer num27 = (i4 & 4) != 0 ? team.capSpace : num9;
        FieldTranslations fieldTranslations3 = (i4 & 8) != 0 ? team.fieldTranslations : fieldTranslations;
        List list8 = (i4 & 16) != 0 ? team.timeActive : list2;
        if ((i4 & 32) != 0) {
            list5 = list8;
            list4 = team.teamLinks;
            team3 = team4;
            country2 = country3;
            l2 = l3;
            num10 = num21;
            tournament2 = tournament3;
            record2 = record3;
            list6 = list7;
            num11 = num22;
            num12 = num23;
            num13 = num24;
            num14 = num25;
            num15 = num26;
            num16 = num27;
            fieldTranslations2 = fieldTranslations3;
            manager2 = manager3;
            str6 = str12;
            subTeam3 = subTeam5;
            subTeam4 = subTeam6;
            gender2 = gender3;
            sport2 = sport3;
            category2 = category3;
            uniqueTournament2 = uniqueTournament3;
            playerTeamInfo2 = playerTeamInfo3;
            motorsportTeamInfo2 = motorsportTeamInfo3;
            num17 = num19;
            venue2 = venue3;
            num18 = num20;
            z4 = z5;
            z3 = z6;
            str7 = str9;
            str8 = str10;
            j2 = j3;
            i5 = i7;
            teamColors2 = teamColors3;
            str5 = str11;
        } else {
            list4 = list3;
            list5 = list8;
            z3 = z6;
            team3 = team4;
            country2 = country3;
            l2 = l3;
            num10 = num21;
            tournament2 = tournament3;
            record2 = record3;
            list6 = list7;
            num11 = num22;
            num12 = num23;
            num13 = num24;
            num14 = num25;
            num15 = num26;
            num16 = num27;
            fieldTranslations2 = fieldTranslations3;
            manager2 = manager3;
            str5 = str11;
            str6 = str12;
            subTeam3 = subTeam5;
            subTeam4 = subTeam6;
            gender2 = gender3;
            sport2 = sport3;
            category2 = category3;
            uniqueTournament2 = uniqueTournament3;
            playerTeamInfo2 = playerTeamInfo3;
            motorsportTeamInfo2 = motorsportTeamInfo3;
            num17 = num19;
            venue2 = venue3;
            num18 = num20;
            z4 = z5;
            str7 = str9;
            str8 = str10;
            j2 = j3;
            i5 = i7;
            teamColors2 = teamColors3;
        }
        return team.copy(i8, str7, str8, j2, i5, teamColors2, str5, str6, subTeam3, subTeam4, gender2, sport2, category2, uniqueTournament2, manager2, playerTeamInfo2, motorsportTeamInfo2, num17, venue2, num18, z4, z3, team3, country2, l2, num10, tournament2, record2, list6, num11, num12, num13, num14, num15, num16, fieldTranslations2, list5, list4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e4, code lost:
    
        if (r1.equals(com.sofascore.model.Sports.TABLE_TENNIS) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x022c, code lost:
    
        r1 = r6.getSportSlug();
        r3 = r6.slug;
        r4 = r6.getId();
        r1 = defpackage.mz1.s("/", r1, "/player/", r3, "/");
        r1.append(r4);
        r1 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ed, code lost:
    
        if (r1.equals(com.sofascore.model.Sports.DARTS) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0217, code lost:
    
        if (r1.equals(com.sofascore.model.Sports.TENNIS) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0220, code lost:
    
        if (r1.equals(com.sofascore.model.Sports.BADMINTON) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0229, code lost:
    
        if (r1.equals(com.sofascore.model.Sports.SNOOKER) == false) goto L70;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$model_release(Team self, wf3 output, SerialDescriptor serialDesc) {
        String l;
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.slug);
        output.E(serialDesc, 3, self.userCount);
        if (output.o(serialDesc) || self.type != 0) {
            output.u(4, self.type, serialDesc);
        }
        if (output.o(serialDesc) || !Intrinsics.c(self.teamColors, new TeamColors())) {
            output.f(serialDesc, 5, TeamColors$$serializer.INSTANCE, self.teamColors);
        }
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 6, uhiVar, self.nameCode);
        output.h(serialDesc, 7, uhiVar, self.shortName);
        SubTeam$$serializer subTeam$$serializer = SubTeam$$serializer.INSTANCE;
        output.h(serialDesc, 8, subTeam$$serializer, self.subTeam1);
        output.h(serialDesc, 9, subTeam$$serializer, self.subTeam2);
        output.h(serialDesc, 10, GenderSerializer.INSTANCE, self.gender);
        output.h(serialDesc, 11, Sport$$serializer.INSTANCE, self.sport);
        output.h(serialDesc, 12, Category$$serializer.INSTANCE, self.category);
        output.h(serialDesc, 13, UniqueTournament$$serializer.INSTANCE, self.primaryUniqueTournament);
        output.h(serialDesc, 14, Manager$$serializer.INSTANCE, self.manager);
        output.h(serialDesc, 15, PlayerTeamInfo$$serializer.INSTANCE, self.playerTeamInfo);
        output.h(serialDesc, 16, MotorsportTeamInfo$$serializer.INSTANCE, self.motorsportTeamInfo);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 17, a7aVar, self.sportVariant);
        output.h(serialDesc, 18, Venue$$serializer.INSTANCE, self.venue);
        output.h(serialDesc, 19, a7aVar, self.ranking);
        if (output.o(serialDesc) || self.disabled) {
            output.x(serialDesc, 20, self.disabled);
        }
        if (output.o(serialDesc) || self.national) {
            output.x(serialDesc, 21, self.national);
        }
        output.h(serialDesc, 22, (KSerializer) joaVarArr[22].getValue(), self.parentTeam);
        output.h(serialDesc, 23, Country$$serializer.INSTANCE, self.country);
        output.h(serialDesc, 24, lkb.a, self.foundationDateTimestamp);
        output.h(serialDesc, 25, a7aVar, self.championshipsWon);
        output.h(serialDesc, 26, Tournament$$serializer.INSTANCE, self.tournament);
        output.h(serialDesc, 27, Record$$serializer.INSTANCE, self.wdlRecord);
        output.h(serialDesc, 28, (KSerializer) joaVarArr[28].getValue(), self.teamRankings);
        output.h(serialDesc, 29, a7aVar, self.capMaximum);
        output.h(serialDesc, 30, a7aVar, self.luxuryTaxThreshold);
        output.h(serialDesc, 31, a7aVar, self.signedPlayers);
        output.h(serialDesc, 32, a7aVar, self.activeCap);
        output.h(serialDesc, 33, a7aVar, self.totalCap);
        output.h(serialDesc, 34, a7aVar, self.capSpace);
        output.h(serialDesc, 35, FieldTranslations$$serializer.INSTANCE, self.fieldTranslations);
        output.h(serialDesc, 36, (KSerializer) joaVarArr[36].getValue(), self.timeActive);
        if (output.o(serialDesc) || self.teamLinks != null) {
            output.h(serialDesc, 37, (KSerializer) joaVarArr[37].getValue(), self.teamLinks);
        }
        if (output.o(serialDesc) || self.getIsRecent()) {
            output.x(serialDesc, 38, self.getIsRecent());
        }
        if (!output.o(serialDesc)) {
            String webUrl = self.getWebUrl();
            String sportSlug = self.getSportSlug();
            if (sportSlug != null) {
                switch (sportSlug.hashCode()) {
                    case -2056128771:
                        break;
                    case -2005973498:
                        break;
                    case -877324069:
                        break;
                    case 108225:
                        if (sportSlug.equals(Sports.MMA)) {
                            String sportSlug2 = self.getSportSlug();
                            String str = self.slug;
                            int id = self.getId();
                            StringBuilder s = mz1.s("/", sportSlug2, "/fighter/", str, "/");
                            s.append(id);
                            l = s.toString();
                            break;
                        }
                        break;
                    case 95355092:
                        break;
                    case 203883450:
                        break;
                    case 400486431:
                        if (sportSlug.equals(Sports.MOTORSPORT)) {
                            String sportSlug3 = self.getSportSlug();
                            String str2 = self.slug;
                            int id2 = self.getId();
                            StringBuilder s2 = mz1.s("/", sportSlug3, "/driver/", str2, "/");
                            s2.append(id2);
                            l = s2.toString();
                            break;
                        }
                        break;
                }
                if (Intrinsics.c(webUrl, l)) {
                    return;
                }
            }
            if (self.getSportSlug() != null) {
                String sportSlug4 = self.getSportSlug();
                String str3 = self.slug;
                int id3 = self.getId();
                StringBuilder s3 = mz1.s("/", sportSlug4, "/team/", str3, "/");
                s3.append(id3);
                l = s3.toString();
            } else {
                l = dmi.l(self.getId(), "/team/", self.slug, "/");
            }
            if (Intrinsics.c(webUrl, l)) {
            }
        }
        output.y(serialDesc, 39, self.getWebUrl());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final SubTeam getSubTeam2() {
        return this.subTeam2;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Sport getSport() {
        return this.sport;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final UniqueTournament getPrimaryUniqueTournament() {
        return this.primaryUniqueTournament;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Manager getManager() {
        return this.manager;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final PlayerTeamInfo getPlayerTeamInfo() {
        return this.playerTeamInfo;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final MotorsportTeamInfo getMotorsportTeamInfo() {
        return this.motorsportTeamInfo;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getSportVariant() {
        return this.sportVariant;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Venue getVenue() {
        return this.venue;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getRanking() {
        return this.ranking;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getNational() {
        return this.national;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Team getParentTeam() {
        return this.parentTeam;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Long getFoundationDateTimestamp() {
        return this.foundationDateTimestamp;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getChampionshipsWon() {
        return this.championshipsWon;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Tournament getTournament() {
        return this.tournament;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Record getWdlRecord() {
        return this.wdlRecord;
    }

    @Nullable
    public final List<TeamRankings> component29() {
        return this.teamRankings;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getCapMaximum() {
        return this.capMaximum;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getLuxuryTaxThreshold() {
        return this.luxuryTaxThreshold;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getSignedPlayers() {
        return this.signedPlayers;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Integer getActiveCap() {
        return this.activeCap;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Integer getTotalCap() {
        return this.totalCap;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Integer getCapSpace() {
        return this.capSpace;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    public final List<TeamTimeActiveData> component37() {
        return this.timeActive;
    }

    @Nullable
    public final List<TeamLinkedRound> component38() {
        return this.teamLinks;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUserCount() {
        return this.userCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TeamColors getTeamColors() {
        return this.teamColors;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getNameCode() {
        return this.nameCode;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final SubTeam getSubTeam1() {
        return this.subTeam1;
    }

    public final boolean contains(int teamId) {
        if (getId() == teamId) {
            return true;
        }
        SubTeam subTeam = this.subTeam1;
        if (subTeam != null && subTeam.getId() == teamId) {
            return true;
        }
        SubTeam subTeam2 = this.subTeam2;
        return subTeam2 != null && subTeam2.getId() == teamId;
    }

    @NotNull
    public final Team copy(int id, @NotNull String name, @NotNull String slug, long userCount, int type, @NotNull TeamColors teamColors, @Nullable String nameCode, @Nullable String shortName, @Nullable SubTeam subTeam1, @Nullable SubTeam subTeam2, @Nullable Gender gender, @Nullable Sport sport, @Nullable Category category, @Nullable UniqueTournament primaryUniqueTournament, @Nullable Manager manager, @Nullable PlayerTeamInfo playerTeamInfo, @Nullable MotorsportTeamInfo motorsportTeamInfo, @Nullable Integer sportVariant, @Nullable Venue venue, @Nullable Integer ranking, boolean disabled, boolean national, @Nullable Team parentTeam, @Nullable Country country, @Nullable Long foundationDateTimestamp, @Nullable Integer championshipsWon, @Nullable Tournament tournament, @Nullable Record wdlRecord, @Nullable List<TeamRankings> teamRankings, @Nullable Integer capMaximum, @Nullable Integer luxuryTaxThreshold, @Nullable Integer signedPlayers, @Nullable Integer activeCap, @Nullable Integer totalCap, @Nullable Integer capSpace, @Nullable FieldTranslations fieldTranslations, @Nullable List<TeamTimeActiveData> timeActive, @Nullable List<? extends TeamLinkedRound> teamLinks) {
        name.getClass();
        slug.getClass();
        teamColors.getClass();
        return new Team(id, name, slug, userCount, type, teamColors, nameCode, shortName, subTeam1, subTeam2, gender, sport, category, primaryUniqueTournament, manager, playerTeamInfo, motorsportTeamInfo, sportVariant, venue, ranking, disabled, national, parentTeam, country, foundationDateTimestamp, championshipsWon, tournament, wdlRecord, teamRankings, capMaximum, luxuryTaxThreshold, signedPlayers, activeCap, totalCap, capSpace, fieldTranslations, timeActive, teamLinks);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Team)) {
            return false;
        }
        Team team = (Team) other;
        return this.id == team.id && Intrinsics.c(this.name, team.name) && Intrinsics.c(this.slug, team.slug) && this.userCount == team.userCount && this.type == team.type && Intrinsics.c(this.teamColors, team.teamColors) && Intrinsics.c(this.nameCode, team.nameCode) && Intrinsics.c(this.shortName, team.shortName) && Intrinsics.c(this.subTeam1, team.subTeam1) && Intrinsics.c(this.subTeam2, team.subTeam2) && this.gender == team.gender && Intrinsics.c(this.sport, team.sport) && Intrinsics.c(this.category, team.category) && Intrinsics.c(this.primaryUniqueTournament, team.primaryUniqueTournament) && Intrinsics.c(this.manager, team.manager) && Intrinsics.c(this.playerTeamInfo, team.playerTeamInfo) && Intrinsics.c(this.motorsportTeamInfo, team.motorsportTeamInfo) && Intrinsics.c(this.sportVariant, team.sportVariant) && Intrinsics.c(this.venue, team.venue) && Intrinsics.c(this.ranking, team.ranking) && this.disabled == team.disabled && this.national == team.national && Intrinsics.c(this.parentTeam, team.parentTeam) && Intrinsics.c(this.country, team.country) && Intrinsics.c(this.foundationDateTimestamp, team.foundationDateTimestamp) && Intrinsics.c(this.championshipsWon, team.championshipsWon) && Intrinsics.c(this.tournament, team.tournament) && Intrinsics.c(this.wdlRecord, team.wdlRecord) && Intrinsics.c(this.teamRankings, team.teamRankings) && Intrinsics.c(this.capMaximum, team.capMaximum) && Intrinsics.c(this.luxuryTaxThreshold, team.luxuryTaxThreshold) && Intrinsics.c(this.signedPlayers, team.signedPlayers) && Intrinsics.c(this.activeCap, team.activeCap) && Intrinsics.c(this.totalCap, team.totalCap) && Intrinsics.c(this.capSpace, team.capSpace) && Intrinsics.c(this.fieldTranslations, team.fieldTranslations) && Intrinsics.c(this.timeActive, team.timeActive) && Intrinsics.c(this.teamLinks, team.teamLinks);
    }

    @Nullable
    public final Integer getActiveCap() {
        return this.activeCap;
    }

    @Nullable
    public final Integer getCapMaximum() {
        return this.capMaximum;
    }

    @Nullable
    public final Integer getCapSpace() {
        return this.capSpace;
    }

    @Nullable
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    public final Integer getChampionshipsWon() {
        return this.championshipsWon;
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    public final Long getFoundationDateTimestamp() {
        return this.foundationDateTimestamp;
    }

    @Nullable
    public final Gender getGender() {
        return this.gender;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getLuxuryTaxThreshold() {
        return this.luxuryTaxThreshold;
    }

    @Nullable
    public final Manager getManager() {
        return this.manager;
    }

    @Nullable
    public final MotorsportTeamInfo getMotorsportTeamInfo() {
        return this.motorsportTeamInfo;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNameCode() {
        return this.nameCode;
    }

    public final boolean getNational() {
        return this.national;
    }

    @Nullable
    public final Team getParentTeam() {
        return this.parentTeam;
    }

    @Nullable
    public final PlayerTeamInfo getPlayerTeamInfo() {
        return this.playerTeamInfo;
    }

    @Nullable
    public final UniqueTournament getPrimaryUniqueTournament() {
        return this.primaryUniqueTournament;
    }

    @Nullable
    public final Integer getRanking() {
        return this.ranking;
    }

    @Nullable
    public final String getShortName() {
        return this.shortName;
    }

    @Nullable
    public final Integer getSignedPlayers() {
        return this.signedPlayers;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    public final Sport getSport() {
        return this.sport;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    @Nullable
    public String getSportSlug() {
        Sport sport = this.sport;
        if (sport != null) {
            return sport.getSlug();
        }
        return null;
    }

    @Nullable
    public final Integer getSportVariant() {
        return this.sportVariant;
    }

    @Nullable
    public final SubTeam getSubTeam1() {
        return this.subTeam1;
    }

    @Nullable
    public final SubTeam getSubTeam2() {
        return this.subTeam2;
    }

    @NotNull
    public final TeamColors getTeamColors() {
        return this.teamColors;
    }

    @Nullable
    public final List<TeamLinkedRound> getTeamLinks() {
        return this.teamLinks;
    }

    @Nullable
    public final List<TeamRankings> getTeamRankings() {
        return this.teamRankings;
    }

    @Nullable
    public final List<TeamTimeActiveData> getTimeActive() {
        return this.timeActive;
    }

    @Nullable
    public final Integer getTotalCap() {
        return this.totalCap;
    }

    @Nullable
    public final Tournament getTournament() {
        return this.tournament;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserCount() {
        return this.userCount;
    }

    @Nullable
    public final Venue getVenue() {
        return this.venue;
    }

    @Nullable
    public final Record getWdlRecord() {
        return this.wdlRecord;
    }

    @Override // com.sofascore.model.mvvm.IUrlSharing
    @NotNull
    public String getWebUrl() {
        return this.webUrl;
    }

    public final boolean hasSubTeams() {
        return (this.subTeam1 == null || this.subTeam2 == null) ? false : true;
    }

    public int hashCode() {
        int hashCode = (this.teamColors.hashCode() + wv8.a(this.type, ljg.c(dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.slug), 31, this.userCount), 31)) * 31;
        String str = this.nameCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shortName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SubTeam subTeam = this.subTeam1;
        int hashCode4 = (hashCode3 + (subTeam == null ? 0 : subTeam.hashCode())) * 31;
        SubTeam subTeam2 = this.subTeam2;
        int hashCode5 = (hashCode4 + (subTeam2 == null ? 0 : subTeam2.hashCode())) * 31;
        Gender gender = this.gender;
        int hashCode6 = (hashCode5 + (gender == null ? 0 : gender.hashCode())) * 31;
        Sport sport = this.sport;
        int hashCode7 = (hashCode6 + (sport == null ? 0 : sport.hashCode())) * 31;
        Category category = this.category;
        int hashCode8 = (hashCode7 + (category == null ? 0 : category.hashCode())) * 31;
        UniqueTournament uniqueTournament = this.primaryUniqueTournament;
        int hashCode9 = (hashCode8 + (uniqueTournament == null ? 0 : uniqueTournament.hashCode())) * 31;
        Manager manager = this.manager;
        int hashCode10 = (hashCode9 + (manager == null ? 0 : manager.hashCode())) * 31;
        PlayerTeamInfo playerTeamInfo = this.playerTeamInfo;
        int hashCode11 = (hashCode10 + (playerTeamInfo == null ? 0 : playerTeamInfo.hashCode())) * 31;
        MotorsportTeamInfo motorsportTeamInfo = this.motorsportTeamInfo;
        int hashCode12 = (hashCode11 + (motorsportTeamInfo == null ? 0 : motorsportTeamInfo.hashCode())) * 31;
        Integer num = this.sportVariant;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Venue venue = this.venue;
        int hashCode14 = (hashCode13 + (venue == null ? 0 : venue.hashCode())) * 31;
        Integer num2 = this.ranking;
        int e = dmi.e(dmi.e((hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.disabled), 31, this.national);
        Team team = this.parentTeam;
        int hashCode15 = (e + (team == null ? 0 : team.hashCode())) * 31;
        Country country = this.country;
        int hashCode16 = (hashCode15 + (country == null ? 0 : country.hashCode())) * 31;
        Long l = this.foundationDateTimestamp;
        int hashCode17 = (hashCode16 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.championshipsWon;
        int hashCode18 = (hashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Tournament tournament = this.tournament;
        int hashCode19 = (hashCode18 + (tournament == null ? 0 : tournament.hashCode())) * 31;
        Record record = this.wdlRecord;
        int hashCode20 = (hashCode19 + (record == null ? 0 : record.hashCode())) * 31;
        List<TeamRankings> list = this.teamRankings;
        int hashCode21 = (hashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.capMaximum;
        int hashCode22 = (hashCode21 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.luxuryTaxThreshold;
        int hashCode23 = (hashCode22 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.signedPlayers;
        int hashCode24 = (hashCode23 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.activeCap;
        int hashCode25 = (hashCode24 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.totalCap;
        int hashCode26 = (hashCode25 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.capSpace;
        int hashCode27 = (hashCode26 + (num9 == null ? 0 : num9.hashCode())) * 31;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        int hashCode28 = (hashCode27 + (fieldTranslations == null ? 0 : fieldTranslations.hashCode())) * 31;
        List<TeamTimeActiveData> list2 = this.timeActive;
        int hashCode29 = (hashCode28 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TeamLinkedRound> list3 = this.teamLinks;
        return hashCode29 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.sofascore.model.mvvm.IRecent
    /* renamed from: isRecent, reason: from getter */
    public boolean getIsRecent() {
        return this.isRecent;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public void setRecent(boolean z) {
        this.isRecent = z;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.slug;
        long j = this.userCount;
        int i2 = this.type;
        TeamColors teamColors = this.teamColors;
        String str3 = this.nameCode;
        String str4 = this.shortName;
        SubTeam subTeam = this.subTeam1;
        SubTeam subTeam2 = this.subTeam2;
        Gender gender = this.gender;
        Sport sport = this.sport;
        Category category = this.category;
        UniqueTournament uniqueTournament = this.primaryUniqueTournament;
        Manager manager = this.manager;
        PlayerTeamInfo playerTeamInfo = this.playerTeamInfo;
        MotorsportTeamInfo motorsportTeamInfo = this.motorsportTeamInfo;
        Integer num = this.sportVariant;
        Venue venue = this.venue;
        Integer num2 = this.ranking;
        boolean z = this.disabled;
        boolean z2 = this.national;
        Team team = this.parentTeam;
        Country country = this.country;
        Long l = this.foundationDateTimestamp;
        Integer num3 = this.championshipsWon;
        Tournament tournament = this.tournament;
        Record record = this.wdlRecord;
        List<TeamRankings> list = this.teamRankings;
        Integer num4 = this.capMaximum;
        Integer num5 = this.luxuryTaxThreshold;
        Integer num6 = this.signedPlayers;
        Integer num7 = this.activeCap;
        Integer num8 = this.totalCap;
        Integer num9 = this.capSpace;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        List<TeamTimeActiveData> list2 = this.timeActive;
        List<TeamLinkedRound> list3 = this.teamLinks;
        StringBuilder t = dmi.t(i, "Team(id=", ", name=", str, ", slug=");
        i.n(j, str2, ", userCount=", t);
        t.append(", type=");
        t.append(i2);
        t.append(", teamColors=");
        t.append(teamColors);
        bf3.v(t, ", nameCode=", str3, ", shortName=", str4);
        t.append(", subTeam1=");
        t.append(subTeam);
        t.append(", subTeam2=");
        t.append(subTeam2);
        t.append(", gender=");
        t.append(gender);
        t.append(", sport=");
        t.append(sport);
        t.append(", category=");
        t.append(category);
        t.append(", primaryUniqueTournament=");
        t.append(uniqueTournament);
        t.append(", manager=");
        t.append(manager);
        t.append(", playerTeamInfo=");
        t.append(playerTeamInfo);
        t.append(", motorsportTeamInfo=");
        t.append(motorsportTeamInfo);
        t.append(", sportVariant=");
        t.append(num);
        t.append(", venue=");
        t.append(venue);
        t.append(", ranking=");
        t.append(num2);
        fn0.y(", disabled=", ", national=", t, z, z2);
        t.append(", parentTeam=");
        t.append(team);
        t.append(", country=");
        t.append(country);
        t.append(", foundationDateTimestamp=");
        t.append(l);
        t.append(", championshipsWon=");
        t.append(num3);
        t.append(", tournament=");
        t.append(tournament);
        t.append(", wdlRecord=");
        t.append(record);
        t.append(", teamRankings=");
        t.append(list);
        t.append(", capMaximum=");
        t.append(num4);
        fn0.w(num5, num6, ", luxuryTaxThreshold=", ", signedPlayers=", t);
        fn0.w(num7, num8, ", activeCap=", ", totalCap=", t);
        t.append(", capSpace=");
        t.append(num9);
        t.append(", fieldTranslations=");
        t.append(fieldTranslations);
        t.append(", timeActive=");
        t.append(list2);
        t.append(", teamLinks=");
        t.append(list3);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0002\b\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\t"}, d2 = {"Lcom/sofascore/model/mvvm/model/Team$Companion;", "", "<init>", "()V", "generatedSerializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Team;", "generatedSerializer$model_release", "serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer generatedSerializer$model_release() {
            return Team$$serializer.INSTANCE;
        }

        @NotNull
        public final KSerializer serializer() {
            return new TeamSerializer();
        }

        private Companion() {
        }
    }

    @wx4
    public static /* synthetic */ void getName$annotations() {
    }

    @wx4
    public static /* synthetic */ void getShortName$annotations() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c0, code lost:
    
        if (r1.equals(com.sofascore.model.Sports.TABLE_TENNIS) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0106, code lost:
    
        r1 = getSportSlug();
        r4 = getId();
        r1 = defpackage.mz1.s("/", r1, "/player/", r3, "/");
        r1.append(r4);
        r1 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c9, code lost:
    
        if (r1.equals(com.sofascore.model.Sports.DARTS) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f1, code lost:
    
        if (r1.equals(com.sofascore.model.Sports.TENNIS) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fa, code lost:
    
        if (r1.equals(com.sofascore.model.Sports.BADMINTON) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0103, code lost:
    
        if (r1.equals(com.sofascore.model.Sports.SNOOKER) == false) goto L31;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Team(int i, @NotNull String str, @NotNull String str2, long j, int i2, @NotNull TeamColors teamColors, @Nullable String str3, @Nullable String str4, @Nullable SubTeam subTeam, @Nullable SubTeam subTeam2, @Nullable Gender gender, @Nullable Sport sport, @Nullable Category category, @Nullable UniqueTournament uniqueTournament, @Nullable Manager manager, @Nullable PlayerTeamInfo playerTeamInfo, @Nullable MotorsportTeamInfo motorsportTeamInfo, @Nullable Integer num, @Nullable Venue venue, @Nullable Integer num2, boolean z, boolean z2, @Nullable Team team, @Nullable Country country, @Nullable Long l, @Nullable Integer num3, @Nullable Tournament tournament, @Nullable Record record, @Nullable List<TeamRankings> list, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable FieldTranslations fieldTranslations, @Nullable List<TeamTimeActiveData> list2, @Nullable List<? extends TeamLinkedRound> list3) {
        String l2;
        str.getClass();
        str2.getClass();
        teamColors.getClass();
        this.id = i;
        this.name = str;
        this.slug = str2;
        this.userCount = j;
        this.type = i2;
        this.teamColors = teamColors;
        this.nameCode = str3;
        this.shortName = str4;
        this.subTeam1 = subTeam;
        this.subTeam2 = subTeam2;
        this.gender = gender;
        this.sport = sport;
        this.category = category;
        this.primaryUniqueTournament = uniqueTournament;
        this.manager = manager;
        this.playerTeamInfo = playerTeamInfo;
        this.motorsportTeamInfo = motorsportTeamInfo;
        this.sportVariant = num;
        this.venue = venue;
        this.ranking = num2;
        this.disabled = z;
        this.national = z2;
        this.parentTeam = team;
        this.country = country;
        this.foundationDateTimestamp = l;
        this.championshipsWon = num3;
        this.tournament = tournament;
        this.wdlRecord = record;
        this.teamRankings = list;
        this.capMaximum = num4;
        this.luxuryTaxThreshold = num5;
        this.signedPlayers = num6;
        this.activeCap = num7;
        this.totalCap = num8;
        this.capSpace = num9;
        this.fieldTranslations = fieldTranslations;
        this.timeActive = list2;
        this.teamLinks = list3;
        String sportSlug = getSportSlug();
        if (sportSlug != null) {
            switch (sportSlug.hashCode()) {
                case -2056128771:
                    break;
                case -2005973498:
                    break;
                case -877324069:
                    break;
                case 108225:
                    if (sportSlug.equals(Sports.MMA)) {
                        String sportSlug2 = getSportSlug();
                        int id = getId();
                        StringBuilder s = mz1.s("/", sportSlug2, "/fighter/", str2, "/");
                        s.append(id);
                        l2 = s.toString();
                        break;
                    }
                    break;
                case 95355092:
                    break;
                case 203883450:
                    break;
                case 400486431:
                    if (sportSlug.equals(Sports.MOTORSPORT)) {
                        String sportSlug3 = getSportSlug();
                        int id2 = getId();
                        StringBuilder s2 = mz1.s("/", sportSlug3, "/driver/", str2, "/");
                        s2.append(id2);
                        l2 = s2.toString();
                        break;
                    }
                    break;
            }
            this.webUrl = l2;
        }
        if (getSportSlug() != null) {
            String sportSlug4 = getSportSlug();
            int id3 = getId();
            StringBuilder s3 = mz1.s("/", sportSlug4, "/team/", str2, "/");
            s3.append(id3);
            l2 = s3.toString();
        } else {
            l2 = dmi.l(getId(), "/team/", str2, "/");
        }
        this.webUrl = l2;
    }

    public /* synthetic */ Team(int i, String str, String str2, long j, int i2, TeamColors teamColors, String str3, String str4, SubTeam subTeam, SubTeam subTeam2, Gender gender, Sport sport, Category category, UniqueTournament uniqueTournament, Manager manager, PlayerTeamInfo playerTeamInfo, MotorsportTeamInfo motorsportTeamInfo, Integer num, Venue venue, Integer num2, boolean z, boolean z2, Team team, Country country, Long l, Integer num3, Tournament tournament, Record record, List list, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, FieldTranslations fieldTranslations, List list2, List list3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, j, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? new TeamColors() : teamColors, str3, str4, subTeam, subTeam2, gender, sport, category, uniqueTournament, manager, playerTeamInfo, motorsportTeamInfo, num, venue, num2, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? false : z, (i3 & 2097152) != 0 ? false : z2, team, country, l, num3, tournament, record, list, num4, num5, num6, num7, num8, num9, fieldTranslations, list2, (i4 & 32) != 0 ? null : list3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Team(int i, @NotNull String str, @NotNull String str2, long j, int i2, @Nullable String str3, @Nullable String str4, @Nullable SubTeam subTeam, @Nullable SubTeam subTeam2, @Nullable Gender gender, @Nullable Sport sport, @Nullable Integer num, boolean z, boolean z2, @Nullable Country country, @Nullable FieldTranslations fieldTranslations) {
        this(i, str, str2, j, i2, new TeamColors(), str3, str4, subTeam, subTeam2, gender, sport, null, null, null, null, null, null, null, num, z, z2, null, country, null, null, null, null, null, null, null, null, null, null, null, fieldTranslations, null, null, 0, 32, null);
        str.getClass();
        str2.getClass();
    }

    public /* synthetic */ Team(int i, String str, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Team(int i, @NotNull String str, int i2, @Nullable String str2) {
        this(i, str, "", 0L, i2, new TeamColors(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, new Country(null, str2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 32, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Team(int i, @NotNull String str, boolean z, boolean z2) {
        this(i, str, "", 0L, -1, new TeamColors(null, null, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, z, z2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 32, null);
        str.getClass();
    }
}
