package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.gz1;
import defpackage.joa;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.me4;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.tv0;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wt3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bV\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bV\b\u0087\b\u0018\u0000 \u0085\u00022\u00020\u0001:\u0004\u0086\u0002\u0085\u0002B·\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010#\u001a\u0004\u0018\u00010!\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010,\u001a\u00020\u001b\u0012\b\u0010-\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010.\u001a\u00020\u001b\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00101\u001a\u0004\u0018\u00010!\u0012\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000102\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00107\u001a\u00020\u001b\u0012\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u000108\u0012\b\b\u0002\u0010:\u001a\u00020\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010C\u001a\u00020\u001b\u0012\b\b\u0002\u0010D\u001a\u00020\u001b\u0012\b\u0010F\u001a\u0004\u0018\u00010E\u0012\b\u0010G\u001a\u0004\u0018\u00010E\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u000108\u0012\b\u0010K\u001a\u0004\u0018\u00010J\u0012\u001a\u0010L\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000608\u0018\u000102¢\u0006\u0004\bM\u0010NB×\u0004\b\u0010\u0012\u0006\u0010O\u001a\u00020\u0002\u0012\u0006\u0010P\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010#\u001a\u0004\u0018\u00010!\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010,\u001a\u00020\u001b\u0012\b\u0010-\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010.\u001a\u00020\u001b\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00101\u001a\u0004\u0018\u00010!\u0012\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000102\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\u0006\u00107\u001a\u00020\u001b\u0012\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u000108\u0012\u0006\u0010:\u001a\u00020\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010C\u001a\u00020\u001b\u0012\u0006\u0010D\u001a\u00020\u001b\u0012\b\u0010F\u001a\u0004\u0018\u00010E\u0012\b\u0010G\u001a\u0004\u0018\u00010E\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u000108\u0012\b\u0010K\u001a\u0004\u0018\u00010J\u0012\u001a\u0010L\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000608\u0018\u000102\u0012\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bM\u0010SJ\u000f\u0010T\u001a\u00020\u0000H\u0016¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0012\u0010\\\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0012\u0010^\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0012\u0010b\u001a\u0004\u0018\u00010\u0002HÄ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0002HÄ\u0003¢\u0006\u0004\bd\u0010cJ\u0012\u0010e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\be\u0010cJ\u0012\u0010f\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0012\u0010h\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bh\u0010iJ\u0010\u0010j\u001a\u00020\u0015HÄ\u0003¢\u0006\u0004\bj\u0010kJ\u0010\u0010l\u001a\u00020\u0015HÄ\u0003¢\u0006\u0004\bl\u0010kJ\u0010\u0010m\u001a\u00020\u0018HÄ\u0003¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\u0018HÄ\u0003¢\u0006\u0004\bo\u0010nJ\u0012\u0010p\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0012\u0010r\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\br\u0010qJ\u0010\u0010s\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bs\u0010tJ\u0012\u0010u\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bu\u0010qJ\u0010\u0010v\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bv\u0010[J\u0010\u0010w\u001a\u00020!HÆ\u0003¢\u0006\u0004\bw\u0010xJ\u0012\u0010y\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\by\u0010zJ\u0012\u0010{\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\b{\u0010|J\u0012\u0010}\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\b}\u0010~J\u0012\u0010\u007f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u007f\u0010cJ\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010cJ\u0014\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0081\u0001\u0010cJ\u0014\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0005\b\u0082\u0001\u0010[J\u0012\u0010\u0083\u0001\u001a\u00020\u001bHÆ\u0003¢\u0006\u0005\b\u0083\u0001\u0010tJ\u0014\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010qJ\u0012\u0010\u0085\u0001\u001a\u00020\u001bHÆ\u0003¢\u0006\u0005\b\u0085\u0001\u0010tJ\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0005\b\u0088\u0001\u0010zJ!\u0010\u0089\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000102HÆ\u0003¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0014\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u008b\u0001\u0010cJ\u0015\u0010\u008c\u0001\u001a\u0004\u0018\u000105HÆ\u0003¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0012\u0010\u008e\u0001\u001a\u00020\u001bHÆ\u0003¢\u0006\u0005\b\u008e\u0001\u0010tJ\u001b\u0010\u008f\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u000108HÆ\u0003¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0012\u0010\u0091\u0001\u001a\u00020\u0002HÆ\u0003¢\u0006\u0005\b\u0091\u0001\u0010WJ\u0014\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0005\b\u0092\u0001\u0010[J\u0014\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0005\b\u0093\u0001\u0010[J\u0015\u0010\u0094\u0001\u001a\u0004\u0018\u00010=HÆ\u0003¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0014\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0005\b\u0096\u0001\u0010[J\u0014\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0005\b\u0097\u0001\u0010[J\u0014\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0098\u0001\u0010cJ\u0014\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0099\u0001\u0010cJ\u0012\u0010\u009a\u0001\u001a\u00020\u001bHÆ\u0003¢\u0006\u0005\b\u009a\u0001\u0010tJ\u0012\u0010\u009b\u0001\u001a\u00020\u001bHÆ\u0003¢\u0006\u0005\b\u009b\u0001\u0010tJ\u0015\u0010\u009c\u0001\u001a\u0004\u0018\u00010EHÄ\u0003¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0015\u0010\u009e\u0001\u001a\u0004\u0018\u00010EHÄ\u0003¢\u0006\u0006\b\u009e\u0001\u0010\u009d\u0001J\u0014\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u009f\u0001\u0010cJ\u001b\u0010 \u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u000108HÆ\u0003¢\u0006\u0006\b \u0001\u0010\u0090\u0001J\u0015\u0010¡\u0001\u001a\u0004\u0018\u00010JHÆ\u0003¢\u0006\u0006\b¡\u0001\u0010¢\u0001J'\u0010£\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000608\u0018\u000102HÆ\u0003¢\u0006\u0006\b£\u0001\u0010\u008a\u0001J£\u0005\u0010¤\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010,\u001a\u00020\u001b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010.\u001a\u00020\u001b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010!2\u0016\b\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u00107\u001a\u00020\u001b2\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001082\b\b\u0002\u0010:\u001a\u00020\u00022\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010C\u001a\u00020\u001b2\b\b\u0002\u0010D\u001a\u00020\u001b2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001082\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J2\u001c\b\u0002\u0010L\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000608\u0018\u000102HÆ\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0012\u0010¦\u0001\u001a\u00020\u0006HÖ\u0001¢\u0006\u0005\b¦\u0001\u0010[J\u0012\u0010§\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\b§\u0001\u0010WJ\u001f\u0010ª\u0001\u001a\u00020\u001b2\n\u0010©\u0001\u001a\u0005\u0018\u00010¨\u0001HÖ\u0003¢\u0006\u0006\bª\u0001\u0010«\u0001J0\u0010´\u0001\u001a\u00030±\u00012\u0007\u0010¬\u0001\u001a\u00020\u00002\b\u0010®\u0001\u001a\u00030\u00ad\u00012\b\u0010°\u0001\u001a\u00030¯\u0001H\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001R\u001c\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010µ\u0001\u001a\u0005\b¶\u0001\u0010WR\u001c\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010·\u0001\u001a\u0005\b¸\u0001\u0010YR\u001c\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010¹\u0001\u001a\u0005\bº\u0001\u0010[R\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\t\u0010»\u0001\u001a\u0005\b¼\u0001\u0010]R(\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b\u000b\u0010½\u0001\u001a\u0005\b¾\u0001\u0010_\"\u0006\b¿\u0001\u0010À\u0001R\u001c\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\r\u0010Á\u0001\u001a\u0005\bÂ\u0001\u0010aR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010Ã\u0001\u001a\u0005\bÄ\u0001\u0010cR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010Ã\u0001\u001a\u0005\bÅ\u0001\u0010cR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010Ã\u0001\u001a\u0005\bÆ\u0001\u0010cR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010Ç\u0001\u001a\u0005\bÈ\u0001\u0010gR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010É\u0001\u001a\u0005\bÊ\u0001\u0010iR\u001c\u0010\u0016\u001a\u00020\u00158\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010Ë\u0001\u001a\u0005\bÌ\u0001\u0010kR\u001c\u0010\u0017\u001a\u00020\u00158\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010Ë\u0001\u001a\u0005\bÍ\u0001\u0010kR\u001c\u0010\u0019\u001a\u00020\u00188\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010Î\u0001\u001a\u0005\bÏ\u0001\u0010nR\u001c\u0010\u001a\u001a\u00020\u00188\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010Î\u0001\u001a\u0005\bÐ\u0001\u0010nR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010Ñ\u0001\u001a\u0005\bÒ\u0001\u0010qR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010Ñ\u0001\u001a\u0005\bÓ\u0001\u0010qR\u001c\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010Ô\u0001\u001a\u0005\bÕ\u0001\u0010tR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010Ñ\u0001\u001a\u0005\bÖ\u0001\u0010qR\u001c\u0010 \u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b \u0010¹\u0001\u001a\u0005\b×\u0001\u0010[R\u001c\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\"\u0010Ø\u0001\u001a\u0005\bÙ\u0001\u0010xR\u001e\u0010#\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b#\u0010Ú\u0001\u001a\u0005\bÛ\u0001\u0010zR\u001e\u0010%\u001a\u0004\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b%\u0010Ü\u0001\u001a\u0005\bÝ\u0001\u0010|R(\u0010'\u001a\u0004\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b'\u0010Þ\u0001\u001a\u0005\bß\u0001\u0010~\"\u0006\bà\u0001\u0010á\u0001R\u001e\u0010(\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b(\u0010Ã\u0001\u001a\u0005\bâ\u0001\u0010cR\u001e\u0010)\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b)\u0010Ã\u0001\u001a\u0005\bã\u0001\u0010cR\u001e\u0010*\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b*\u0010Ã\u0001\u001a\u0005\bä\u0001\u0010cR\u001e\u0010+\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b+\u0010¹\u0001\u001a\u0005\bå\u0001\u0010[R\u001c\u0010,\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b,\u0010Ô\u0001\u001a\u0005\bæ\u0001\u0010tR\u001d\u0010-\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b-\u0010Ñ\u0001\u001a\u0004\b-\u0010qR\u001b\u0010.\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b.\u0010Ô\u0001\u001a\u0004\b.\u0010tR\u001f\u00100\u001a\u0004\u0018\u00010/8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b0\u0010ç\u0001\u001a\u0006\bè\u0001\u0010\u0087\u0001R\u001e\u00101\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b1\u0010Ú\u0001\u001a\u0005\bé\u0001\u0010zR+\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b3\u0010ê\u0001\u001a\u0006\bë\u0001\u0010\u008a\u0001R\u001e\u00104\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b4\u0010Ã\u0001\u001a\u0005\bì\u0001\u0010cR\u001f\u00106\u001a\u0004\u0018\u0001058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b6\u0010í\u0001\u001a\u0006\bî\u0001\u0010\u008d\u0001R\u001c\u00107\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b7\u0010Ô\u0001\u001a\u0005\bï\u0001\u0010tR%\u00109\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001088\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b9\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010\u0090\u0001R\u001c\u0010:\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b:\u0010µ\u0001\u001a\u0005\bò\u0001\u0010WR\u001e\u0010;\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b;\u0010¹\u0001\u001a\u0005\bó\u0001\u0010[R\u001e\u0010<\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b<\u0010¹\u0001\u001a\u0005\bô\u0001\u0010[R\u001f\u0010>\u001a\u0004\u0018\u00010=8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b>\u0010õ\u0001\u001a\u0006\bö\u0001\u0010\u0095\u0001R\u001e\u0010?\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b?\u0010¹\u0001\u001a\u0005\b÷\u0001\u0010[R\u001e\u0010@\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b@\u0010¹\u0001\u001a\u0005\bø\u0001\u0010[R\u001e\u0010A\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bA\u0010Ã\u0001\u001a\u0005\bù\u0001\u0010cR\u001e\u0010B\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bB\u0010Ã\u0001\u001a\u0005\bú\u0001\u0010cR\u001c\u0010C\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bC\u0010Ô\u0001\u001a\u0005\bû\u0001\u0010tR\u001c\u0010D\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bD\u0010Ô\u0001\u001a\u0005\bü\u0001\u0010tR\u001f\u0010F\u001a\u0004\u0018\u00010E8\u0014X\u0094\u0004¢\u0006\u000f\n\u0005\bF\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010\u009d\u0001R\u001f\u0010G\u001a\u0004\u0018\u00010E8\u0014X\u0094\u0004¢\u0006\u000f\n\u0005\bG\u0010ý\u0001\u001a\u0006\bÿ\u0001\u0010\u009d\u0001R\u001e\u0010H\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bH\u0010Ã\u0001\u001a\u0005\b\u0080\u0002\u0010cR%\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001088\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bI\u0010ð\u0001\u001a\u0006\b\u0081\u0002\u0010\u0090\u0001R\u001c\u0010K\u001a\u0004\u0018\u00010J8\u0006¢\u0006\u000f\n\u0005\bK\u0010\u0082\u0002\u001a\u0006\b\u0083\u0002\u0010¢\u0001R1\u0010L\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000608\u0018\u0001028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bL\u0010ê\u0001\u001a\u0006\b\u0084\u0002\u0010\u008a\u0001¨\u0006\u0087\u0002"}, d2 = {"Lcom/sofascore/model/mvvm/model/BaseballEvent;", "Lcom/sofascore/model/mvvm/model/Event;", "", "id", "Lcom/sofascore/model/mvvm/model/Tournament;", "tournament", "", "slug", "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "Lcom/sofascore/model/mvvm/model/Round;", "roundInfo", "Lcom/sofascore/model/mvvm/model/Status;", "status", "winnerCode", "aggregatedWinnerCode", "attendance", "Lcom/sofascore/model/mvvm/model/Venue;", "venue", "Lcom/sofascore/model/mvvm/model/Referee;", SearchResponseKt.REFEREE_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "homeTeam", "awayTeam", "Lcom/sofascore/model/mvvm/model/Score;", "homeScore", "awayScore", "", "hasGlobalHighlights", "hasEventPlayerStatistics", "hasEventPlayerHeatMap", "hasXg", "customId", "", "startTimestamp", "endTimestamp", "Lcom/sofascore/model/mvvm/model/Time;", "time", "Lcom/sofascore/model/mvvm/model/EventChanges;", "changes", "coverage", "previousLegEventId", "parentEventId", "lastPeriod", "finalResultOnly", "isEditor", "isAwarded", "Lcom/sofascore/model/mvvm/model/Player;", "manOfMatch", "currentPeriodStartTimestamp", "", "periods", "defaultPeriodCount", "Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "timeouts", "hasBet365LiveStream", "", "bet365ExcludedCountryCodes", "cupMatchesInRound", "statusReason", "eventEditorName", "Lcom/sofascore/model/mvvm/model/EventEditor;", "eventEditor", "eventType", "seasonStatisticsType", "homeTeamRanking", "awayTeamRanking", "crowdsourcingDataDisplayEnabled", "crowdsourcingDataDisplayPermanent", "Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "homeTeamSeasonHistoricalForm", "awayTeamSeasonHistoricalForm", "streamContentId", "streamContentGeoRestrictions", "Lcom/sofascore/model/mvvm/model/BaseballInningInfo;", "currentInningInfo", "eventFilters", "<init>", "(ILcom/sofascore/model/mvvm/model/Tournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Round;Lcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Venue;Lcom/sofascore/model/mvvm/model/Referee;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;JLjava/lang/Long;Lcom/sofascore/model/mvvm/model/Time;Lcom/sofascore/model/mvvm/model/EventChanges;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/sofascore/model/mvvm/model/Player;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TimeoutsInfo;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/EventEditor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLcom/sofascore/model/mvvm/model/TeamSeasonForm;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;Ljava/lang/Integer;Ljava/util/List;Lcom/sofascore/model/mvvm/model/BaseballInningInfo;Ljava/util/Map;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IIILcom/sofascore/model/mvvm/model/Tournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Round;Lcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Venue;Lcom/sofascore/model/mvvm/model/Referee;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;JLjava/lang/Long;Lcom/sofascore/model/mvvm/model/Time;Lcom/sofascore/model/mvvm/model/EventChanges;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/sofascore/model/mvvm/model/Player;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TimeoutsInfo;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/EventEditor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLcom/sofascore/model/mvvm/model/TeamSeasonForm;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;Ljava/lang/Integer;Ljava/util/List;Lcom/sofascore/model/mvvm/model/BaseballInningInfo;Ljava/util/Map;Lt5h;)V", "copyEvent", "()Lcom/sofascore/model/mvvm/model/BaseballEvent;", "component1", "()I", "component2", "()Lcom/sofascore/model/mvvm/model/Tournament;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/sofascore/model/mvvm/model/Season;", "component5", "()Lcom/sofascore/model/mvvm/model/Round;", "component6", "()Lcom/sofascore/model/mvvm/model/Status;", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "()Lcom/sofascore/model/mvvm/model/Venue;", "component11", "()Lcom/sofascore/model/mvvm/model/Referee;", "component12", "()Lcom/sofascore/model/mvvm/model/Team;", "component13", "component14", "()Lcom/sofascore/model/mvvm/model/Score;", "component15", "component16", "()Ljava/lang/Boolean;", "component17", "component18", "()Z", "component19", "component20", "component21", "()J", "component22", "()Ljava/lang/Long;", "component23", "()Lcom/sofascore/model/mvvm/model/Time;", "component24", "()Lcom/sofascore/model/mvvm/model/EventChanges;", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "()Lcom/sofascore/model/mvvm/model/Player;", "component33", "component34", "()Ljava/util/Map;", "component35", "component36", "()Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "component37", "component38", "()Ljava/util/List;", "component39", "component40", "component41", "component42", "()Lcom/sofascore/model/mvvm/model/EventEditor;", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "()Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "component50", "component51", "component52", "component53", "()Lcom/sofascore/model/mvvm/model/BaseballInningInfo;", "component54", "copy", "(ILcom/sofascore/model/mvvm/model/Tournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Round;Lcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Venue;Lcom/sofascore/model/mvvm/model/Referee;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;JLjava/lang/Long;Lcom/sofascore/model/mvvm/model/Time;Lcom/sofascore/model/mvvm/model/EventChanges;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/sofascore/model/mvvm/model/Player;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TimeoutsInfo;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/EventEditor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLcom/sofascore/model/mvvm/model/TeamSeasonForm;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;Ljava/lang/Integer;Ljava/util/List;Lcom/sofascore/model/mvvm/model/BaseballInningInfo;Ljava/util/Map;)Lcom/sofascore/model/mvvm/model/BaseballEvent;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/BaseballEvent;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/mvvm/model/Tournament;", "getTournament", "Ljava/lang/String;", "getSlug", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "Lcom/sofascore/model/mvvm/model/Round;", "getRoundInfo", "setRoundInfo", "(Lcom/sofascore/model/mvvm/model/Round;)V", "Lcom/sofascore/model/mvvm/model/Status;", "getStatus", "Ljava/lang/Integer;", "getWinnerCode", "getAggregatedWinnerCode", "getAttendance", "Lcom/sofascore/model/mvvm/model/Venue;", "getVenue", "Lcom/sofascore/model/mvvm/model/Referee;", "getReferee", "Lcom/sofascore/model/mvvm/model/Team;", "getHomeTeam", "getAwayTeam", "Lcom/sofascore/model/mvvm/model/Score;", "getHomeScore", "getAwayScore", "Ljava/lang/Boolean;", "getHasGlobalHighlights", "getHasEventPlayerStatistics", "Z", "getHasEventPlayerHeatMap", "getHasXg", "getCustomId", "J", "getStartTimestamp", "Ljava/lang/Long;", "getEndTimestamp", "Lcom/sofascore/model/mvvm/model/Time;", "getTime", "Lcom/sofascore/model/mvvm/model/EventChanges;", "getChanges", "setChanges", "(Lcom/sofascore/model/mvvm/model/EventChanges;)V", "getCoverage", "getPreviousLegEventId", "getParentEventId", "getLastPeriod", "getFinalResultOnly", "Lcom/sofascore/model/mvvm/model/Player;", "getManOfMatch", "getCurrentPeriodStartTimestamp", "Ljava/util/Map;", "getPeriods", "getDefaultPeriodCount", "Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "getTimeouts", "getHasBet365LiveStream", "Ljava/util/List;", "getBet365ExcludedCountryCodes", "getCupMatchesInRound", "getStatusReason", "getEventEditorName", "Lcom/sofascore/model/mvvm/model/EventEditor;", "getEventEditor", "getEventType", "getSeasonStatisticsType", "getHomeTeamRanking", "getAwayTeamRanking", "getCrowdsourcingDataDisplayEnabled", "getCrowdsourcingDataDisplayPermanent", "Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "getHomeTeamSeasonHistoricalForm", "getAwayTeamSeasonHistoricalForm", "getStreamContentId", "getStreamContentGeoRestrictions", "Lcom/sofascore/model/mvvm/model/BaseballInningInfo;", "getCurrentInningInfo", "getEventFilters", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BaseballEvent extends Event {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer aggregatedWinnerCode;

    @Nullable
    private final Integer attendance;

    @NotNull
    private final Score awayScore;

    @NotNull
    private final Team awayTeam;

    @Nullable
    private final Integer awayTeamRanking;

    @Nullable
    private final TeamSeasonForm awayTeamSeasonHistoricalForm;

    @Nullable
    private final List<String> bet365ExcludedCountryCodes;

    @Nullable
    private EventChanges changes;

    @Nullable
    private final Integer coverage;
    private final boolean crowdsourcingDataDisplayEnabled;
    private final boolean crowdsourcingDataDisplayPermanent;
    private final int cupMatchesInRound;

    @Nullable
    private final BaseballInningInfo currentInningInfo;

    @Nullable
    private final Long currentPeriodStartTimestamp;

    @NotNull
    private final String customId;

    @Nullable
    private final Integer defaultPeriodCount;

    @Nullable
    private final Long endTimestamp;

    @Nullable
    private final EventEditor eventEditor;

    @Nullable
    private final String eventEditorName;

    @Nullable
    private final Map<String, List<String>> eventFilters;

    @Nullable
    private final String eventType;
    private final boolean finalResultOnly;
    private final boolean hasBet365LiveStream;
    private final boolean hasEventPlayerHeatMap;

    @Nullable
    private final Boolean hasEventPlayerStatistics;

    @Nullable
    private final Boolean hasGlobalHighlights;

    @Nullable
    private final Boolean hasXg;

    @NotNull
    private final Score homeScore;

    @NotNull
    private final Team homeTeam;

    @Nullable
    private final Integer homeTeamRanking;

    @Nullable
    private final TeamSeasonForm homeTeamSeasonHistoricalForm;
    private final int id;
    private final boolean isAwarded;

    @Nullable
    private final Boolean isEditor;

    @Nullable
    private final String lastPeriod;

    @Nullable
    private final Player manOfMatch;

    @Nullable
    private final Integer parentEventId;

    @Nullable
    private final Map<String, String> periods;

    @Nullable
    private final Integer previousLegEventId;

    @Nullable
    private final Referee referee;

    @Nullable
    private Round roundInfo;

    @Nullable
    private final Season season;

    @Nullable
    private final String seasonStatisticsType;

    @NotNull
    private final String slug;
    private final long startTimestamp;

    @NotNull
    private final Status status;

    @Nullable
    private final String statusReason;

    @Nullable
    private final List<String> streamContentGeoRestrictions;

    @Nullable
    private final Integer streamContentId;

    @Nullable
    private final Time time;

    @Nullable
    private final TimeoutsInfo timeouts;

    @NotNull
    private final Tournament tournament;

    @Nullable
    private final Venue venue;

    @Nullable
    private final Integer winnerCode;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new tv0(14)), ypa.a(ysaVar, new tv0(15)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new tv0(16)), null, null, null, ypa.a(ysaVar, new tv0(17)), null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new tv0(18)), null, ypa.a(ysaVar, new tv0(19))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BaseballEvent(int i, int i2, int i3, Tournament tournament, String str, Season season, Round round, Status status, Integer num, Integer num2, Integer num3, Venue venue, Referee referee, Team team, Team team2, Score score, Score score2, Boolean bool, Boolean bool2, boolean z, Boolean bool3, String str2, long j, Long l, Time time, EventChanges eventChanges, Integer num4, Integer num5, Integer num6, String str3, boolean z2, Boolean bool4, boolean z3, Player player, Long l2, Map map, Integer num7, TimeoutsInfo timeoutsInfo, boolean z4, List list, int i4, String str4, String str5, EventEditor eventEditor, String str6, String str7, Integer num8, Integer num9, boolean z5, boolean z6, TeamSeasonForm teamSeasonForm, TeamSeasonForm teamSeasonForm2, Integer num10, List list2, BaseballInningInfo baseballInningInfo, Map map2, t5h t5hVar) {
        super(r2);
        DefaultConstructorMarker defaultConstructorMarker = null;
        if ((-1073872897 != (i & (-1073872897))) || (4145071 != (i2 & 4145071))) {
            oea.y(new int[]{i, i2}, new int[]{-1073872897, 4145071}, BaseballEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.tournament = tournament;
        this.slug = str;
        this.season = season;
        this.roundInfo = round;
        this.status = status;
        this.winnerCode = num;
        this.aggregatedWinnerCode = num2;
        this.attendance = num3;
        this.venue = venue;
        this.referee = referee;
        this.homeTeam = team;
        this.awayTeam = team2;
        this.homeScore = score;
        this.awayScore = score2;
        this.hasGlobalHighlights = bool;
        this.hasEventPlayerStatistics = bool2;
        if ((131072 & i) == 0) {
            this.hasEventPlayerHeatMap = false;
        } else {
            this.hasEventPlayerHeatMap = z;
        }
        this.hasXg = bool3;
        this.customId = str2;
        this.startTimestamp = j;
        this.endTimestamp = l;
        this.time = time;
        this.changes = eventChanges;
        this.coverage = num4;
        this.previousLegEventId = num5;
        this.parentEventId = num6;
        this.lastPeriod = str3;
        this.finalResultOnly = z2;
        this.isEditor = bool4;
        if ((i & 1073741824) == 0) {
            this.isAwarded = false;
        } else {
            this.isAwarded = z3;
        }
        this.manOfMatch = player;
        this.currentPeriodStartTimestamp = l2;
        this.periods = map;
        this.defaultPeriodCount = num7;
        this.timeouts = timeoutsInfo;
        if ((i2 & 16) == 0) {
            this.hasBet365LiveStream = false;
        } else {
            this.hasBet365LiveStream = z4;
        }
        this.bet365ExcludedCountryCodes = list;
        if ((i2 & 64) == 0) {
            this.cupMatchesInRound = 0;
        } else {
            this.cupMatchesInRound = i4;
        }
        this.statusReason = str4;
        this.eventEditorName = str5;
        this.eventEditor = eventEditor;
        this.eventType = str6;
        this.seasonStatisticsType = str7;
        this.homeTeamRanking = num8;
        this.awayTeamRanking = num9;
        if ((i2 & 16384) == 0) {
            this.crowdsourcingDataDisplayEnabled = false;
        } else {
            this.crowdsourcingDataDisplayEnabled = z5;
        }
        if ((32768 & i2) == 0) {
            this.crowdsourcingDataDisplayPermanent = false;
        } else {
            this.crowdsourcingDataDisplayPermanent = z6;
        }
        this.homeTeamSeasonHistoricalForm = teamSeasonForm;
        this.awayTeamSeasonHistoricalForm = teamSeasonForm2;
        this.streamContentId = num10;
        this.streamContentGeoRestrictions = list2;
        this.currentInningInfo = baseballInningInfo;
        this.eventFilters = map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        uhi uhiVar = uhi.a;
        return new q79(uhiVar, uhiVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(uhi.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(uhi.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        uhi uhiVar = uhi.a;
        return new q79(uhiVar, new xg0(uhiVar, 0), 1);
    }

    public static /* synthetic */ BaseballEvent copy$default(BaseballEvent baseballEvent, int i, Tournament tournament, String str, Season season, Round round, Status status, Integer num, Integer num2, Integer num3, Venue venue, Referee referee, Team team, Team team2, Score score, Score score2, Boolean bool, Boolean bool2, boolean z, Boolean bool3, String str2, long j, Long l, Time time, EventChanges eventChanges, Integer num4, Integer num5, Integer num6, String str3, boolean z2, Boolean bool4, boolean z3, Player player, Long l2, Map map, Integer num7, TimeoutsInfo timeoutsInfo, boolean z4, List list, int i2, String str4, String str5, EventEditor eventEditor, String str6, String str7, Integer num8, Integer num9, boolean z5, boolean z6, TeamSeasonForm teamSeasonForm, TeamSeasonForm teamSeasonForm2, Integer num10, List list2, BaseballInningInfo baseballInningInfo, Map map2, int i3, int i4, Object obj) {
        int i5 = (i3 & 1) != 0 ? baseballEvent.id : i;
        return baseballEvent.copy(i5, (i3 & 2) != 0 ? baseballEvent.tournament : tournament, (i3 & 4) != 0 ? baseballEvent.slug : str, (i3 & 8) != 0 ? baseballEvent.season : season, (i3 & 16) != 0 ? baseballEvent.roundInfo : round, (i3 & 32) != 0 ? baseballEvent.status : status, (i3 & 64) != 0 ? baseballEvent.winnerCode : num, (i3 & 128) != 0 ? baseballEvent.aggregatedWinnerCode : num2, (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? baseballEvent.attendance : num3, (i3 & 512) != 0 ? baseballEvent.venue : venue, (i3 & 1024) != 0 ? baseballEvent.referee : referee, (i3 & a.o) != 0 ? baseballEvent.homeTeam : team, (i3 & 4096) != 0 ? baseballEvent.awayTeam : team2, (i3 & 8192) != 0 ? baseballEvent.homeScore : score, (i3 & 16384) != 0 ? baseballEvent.awayScore : score2, (i3 & 32768) != 0 ? baseballEvent.hasGlobalHighlights : bool, (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? baseballEvent.hasEventPlayerStatistics : bool2, (i3 & 131072) != 0 ? baseballEvent.hasEventPlayerHeatMap : z, (i3 & 262144) != 0 ? baseballEvent.hasXg : bool3, (i3 & 524288) != 0 ? baseballEvent.customId : str2, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? baseballEvent.startTimestamp : j, (i3 & 2097152) != 0 ? baseballEvent.endTimestamp : l, (i3 & 4194304) != 0 ? baseballEvent.time : time, (i3 & 8388608) != 0 ? baseballEvent.changes : eventChanges, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? baseballEvent.coverage : num4, (i3 & 33554432) != 0 ? baseballEvent.previousLegEventId : num5, (i3 & 67108864) != 0 ? baseballEvent.parentEventId : num6, (i3 & 134217728) != 0 ? baseballEvent.lastPeriod : str3, (i3 & 268435456) != 0 ? baseballEvent.finalResultOnly : z2, (i3 & 536870912) != 0 ? baseballEvent.isEditor : bool4, (i3 & 1073741824) != 0 ? baseballEvent.isAwarded : z3, (i3 & Integer.MIN_VALUE) != 0 ? baseballEvent.manOfMatch : player, (i4 & 1) != 0 ? baseballEvent.currentPeriodStartTimestamp : l2, (i4 & 2) != 0 ? baseballEvent.periods : map, (i4 & 4) != 0 ? baseballEvent.defaultPeriodCount : num7, (i4 & 8) != 0 ? baseballEvent.timeouts : timeoutsInfo, (i4 & 16) != 0 ? baseballEvent.hasBet365LiveStream : z4, (i4 & 32) != 0 ? baseballEvent.bet365ExcludedCountryCodes : list, (i4 & 64) != 0 ? baseballEvent.cupMatchesInRound : i2, (i4 & 128) != 0 ? baseballEvent.statusReason : str4, (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? baseballEvent.eventEditorName : str5, (i4 & 512) != 0 ? baseballEvent.eventEditor : eventEditor, (i4 & 1024) != 0 ? baseballEvent.eventType : str6, (i4 & a.o) != 0 ? baseballEvent.seasonStatisticsType : str7, (i4 & 4096) != 0 ? baseballEvent.homeTeamRanking : num8, (i4 & 8192) != 0 ? baseballEvent.awayTeamRanking : num9, (i4 & 16384) != 0 ? baseballEvent.crowdsourcingDataDisplayEnabled : z5, (i4 & 32768) != 0 ? baseballEvent.crowdsourcingDataDisplayPermanent : z6, (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? baseballEvent.homeTeamSeasonHistoricalForm : teamSeasonForm, (i4 & 131072) != 0 ? baseballEvent.awayTeamSeasonHistoricalForm : teamSeasonForm2, (i4 & 262144) != 0 ? baseballEvent.streamContentId : num10, (i4 & 524288) != 0 ? baseballEvent.streamContentGeoRestrictions : list2, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? baseballEvent.currentInningInfo : baseballInningInfo, (i4 & 2097152) != 0 ? baseballEvent.eventFilters : map2);
    }

    public static final /* synthetic */ void write$Self$model_release(BaseballEvent self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.getId(), serialDesc);
        output.f(serialDesc, 1, Tournament$$serializer.INSTANCE, self.getTournament());
        output.y(serialDesc, 2, self.getSlug());
        output.h(serialDesc, 3, Season$$serializer.INSTANCE, self.getSeason());
        output.h(serialDesc, 4, Round$$serializer.INSTANCE, self.getRoundInfo());
        output.f(serialDesc, 5, Status$$serializer.INSTANCE, self.getStatus());
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 6, a7aVar, self.getWinnerCode());
        output.h(serialDesc, 7, a7aVar, self.getAggregatedWinnerCode());
        output.h(serialDesc, 8, a7aVar, self.getAttendance());
        output.h(serialDesc, 9, Venue$$serializer.INSTANCE, self.getVenue());
        output.h(serialDesc, 10, Referee$$serializer.INSTANCE, self.getReferee());
        output.f(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.getHomeTeam());
        output.f(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.getAwayTeam());
        Score$$serializer score$$serializer = Score$$serializer.INSTANCE;
        output.f(serialDesc, 13, score$$serializer, self.getHomeScore());
        output.f(serialDesc, 14, score$$serializer, self.getAwayScore());
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 15, gz1Var, self.getHasGlobalHighlights());
        output.h(serialDesc, 16, gz1Var, self.getHasEventPlayerStatistics());
        if (output.o(serialDesc) || self.getHasEventPlayerHeatMap()) {
            output.x(serialDesc, 17, self.getHasEventPlayerHeatMap());
        }
        output.h(serialDesc, 18, gz1Var, self.getHasXg());
        output.y(serialDesc, 19, self.getCustomId());
        output.E(serialDesc, 20, self.getStartTimestamp());
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 21, lkbVar, self.getEndTimestamp());
        output.h(serialDesc, 22, Time$$serializer.INSTANCE, self.getTime());
        output.h(serialDesc, 23, EventChanges$$serializer.INSTANCE, self.getChanges());
        output.h(serialDesc, 24, a7aVar, self.getCoverage());
        output.h(serialDesc, 25, a7aVar, self.getPreviousLegEventId());
        output.h(serialDesc, 26, a7aVar, self.getParentEventId());
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 27, uhiVar, self.getLastPeriod());
        output.x(serialDesc, 28, self.getFinalResultOnly());
        output.h(serialDesc, 29, gz1Var, self.isEditor());
        if (output.o(serialDesc) || self.isAwarded()) {
            output.x(serialDesc, 30, self.isAwarded());
        }
        output.h(serialDesc, 31, Player$$serializer.INSTANCE, self.getManOfMatch());
        output.h(serialDesc, 32, lkbVar, self.getCurrentPeriodStartTimestamp());
        output.h(serialDesc, 33, (KSerializer) joaVarArr[33].getValue(), self.getPeriods());
        output.h(serialDesc, 34, a7aVar, self.getDefaultPeriodCount());
        output.h(serialDesc, 35, TimeoutsInfo$$serializer.INSTANCE, self.getTimeouts());
        if (output.o(serialDesc) || self.getHasBet365LiveStream()) {
            output.x(serialDesc, 36, self.getHasBet365LiveStream());
        }
        output.h(serialDesc, 37, (KSerializer) joaVarArr[37].getValue(), self.getBet365ExcludedCountryCodes());
        if (output.o(serialDesc) || self.getCupMatchesInRound() != 0) {
            output.u(38, self.getCupMatchesInRound(), serialDesc);
        }
        output.h(serialDesc, 39, uhiVar, self.getStatusReason());
        output.h(serialDesc, 40, uhiVar, self.getEventEditorName());
        output.h(serialDesc, 41, EventEditor$$serializer.INSTANCE, self.getEventEditor());
        output.h(serialDesc, 42, uhiVar, self.getEventType());
        output.h(serialDesc, 43, uhiVar, self.getSeasonStatisticsType());
        output.h(serialDesc, 44, a7aVar, self.getHomeTeamRanking());
        output.h(serialDesc, 45, a7aVar, self.getAwayTeamRanking());
        if (output.o(serialDesc) || self.getCrowdsourcingDataDisplayEnabled()) {
            output.x(serialDesc, 46, self.getCrowdsourcingDataDisplayEnabled());
        }
        if (output.o(serialDesc) || self.getCrowdsourcingDataDisplayPermanent()) {
            output.x(serialDesc, 47, self.getCrowdsourcingDataDisplayPermanent());
        }
        TeamSeasonForm$$serializer teamSeasonForm$$serializer = TeamSeasonForm$$serializer.INSTANCE;
        output.h(serialDesc, 48, teamSeasonForm$$serializer, self.getHomeTeamSeasonHistoricalForm());
        output.h(serialDesc, 49, teamSeasonForm$$serializer, self.getAwayTeamSeasonHistoricalForm());
        output.h(serialDesc, 50, a7aVar, self.getStreamContentId());
        output.h(serialDesc, 51, (KSerializer) joaVarArr[51].getValue(), self.getStreamContentGeoRestrictions());
        output.h(serialDesc, 52, BaseballInningInfo$$serializer.INSTANCE, self.currentInningInfo);
        output.h(serialDesc, 53, (KSerializer) joaVarArr[53].getValue(), self.getEventFilters());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Venue getVenue() {
        return this.venue;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Referee getReferee() {
        return this.referee;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final Team getHomeTeam() {
        return this.homeTeam;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final Team getAwayTeam() {
        return this.awayTeam;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final Score getHomeScore() {
        return this.homeScore;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final Score getAwayScore() {
        return this.awayScore;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Boolean getHasGlobalHighlights() {
        return this.hasGlobalHighlights;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Boolean getHasEventPlayerStatistics() {
        return this.hasEventPlayerStatistics;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getHasEventPlayerHeatMap() {
        return this.hasEventPlayerHeatMap;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Boolean getHasXg() {
        return this.hasXg;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Tournament getTournament() {
        return this.tournament;
    }

    @NotNull
    /* renamed from: component20, reason: from getter */
    public final String getCustomId() {
        return this.customId;
    }

    /* renamed from: component21, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Time getTime() {
        return this.time;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final EventChanges getChanges() {
        return this.changes;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getCoverage() {
        return this.coverage;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getPreviousLegEventId() {
        return this.previousLegEventId;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getParentEventId() {
        return this.parentEventId;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final String getLastPeriod() {
        return this.lastPeriod;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getFinalResultOnly() {
        return this.finalResultOnly;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Boolean getIsEditor() {
        return this.isEditor;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getIsAwarded() {
        return this.isAwarded;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Player getManOfMatch() {
        return this.manOfMatch;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Long getCurrentPeriodStartTimestamp() {
        return this.currentPeriodStartTimestamp;
    }

    @Nullable
    public final Map<String, String> component34() {
        return this.periods;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Integer getDefaultPeriodCount() {
        return this.defaultPeriodCount;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final TimeoutsInfo getTimeouts() {
        return this.timeouts;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getHasBet365LiveStream() {
        return this.hasBet365LiveStream;
    }

    @Nullable
    public final List<String> component38() {
        return this.bet365ExcludedCountryCodes;
    }

    /* renamed from: component39, reason: from getter */
    public final int getCupMatchesInRound() {
        return this.cupMatchesInRound;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Season getSeason() {
        return this.season;
    }

    @Nullable
    /* renamed from: component40, reason: from getter */
    public final String getStatusReason() {
        return this.statusReason;
    }

    @Nullable
    /* renamed from: component41, reason: from getter */
    public final String getEventEditorName() {
        return this.eventEditorName;
    }

    @Nullable
    /* renamed from: component42, reason: from getter */
    public final EventEditor getEventEditor() {
        return this.eventEditor;
    }

    @Nullable
    /* renamed from: component43, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    /* renamed from: component44, reason: from getter */
    public final String getSeasonStatisticsType() {
        return this.seasonStatisticsType;
    }

    @Nullable
    /* renamed from: component45, reason: from getter */
    public final Integer getHomeTeamRanking() {
        return this.homeTeamRanking;
    }

    @Nullable
    /* renamed from: component46, reason: from getter */
    public final Integer getAwayTeamRanking() {
        return this.awayTeamRanking;
    }

    /* renamed from: component47, reason: from getter */
    public final boolean getCrowdsourcingDataDisplayEnabled() {
        return this.crowdsourcingDataDisplayEnabled;
    }

    /* renamed from: component48, reason: from getter */
    public final boolean getCrowdsourcingDataDisplayPermanent() {
        return this.crowdsourcingDataDisplayPermanent;
    }

    @Nullable
    /* renamed from: component49, reason: from getter */
    public final TeamSeasonForm getHomeTeamSeasonHistoricalForm() {
        return this.homeTeamSeasonHistoricalForm;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Round getRoundInfo() {
        return this.roundInfo;
    }

    @Nullable
    /* renamed from: component50, reason: from getter */
    public final TeamSeasonForm getAwayTeamSeasonHistoricalForm() {
        return this.awayTeamSeasonHistoricalForm;
    }

    @Nullable
    /* renamed from: component51, reason: from getter */
    public final Integer getStreamContentId() {
        return this.streamContentId;
    }

    @Nullable
    public final List<String> component52() {
        return this.streamContentGeoRestrictions;
    }

    @Nullable
    /* renamed from: component53, reason: from getter */
    public final BaseballInningInfo getCurrentInningInfo() {
        return this.currentInningInfo;
    }

    @Nullable
    public final Map<String, List<String>> component54() {
        return this.eventFilters;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getWinnerCode() {
        return this.winnerCode;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getAggregatedWinnerCode() {
        return this.aggregatedWinnerCode;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getAttendance() {
        return this.attendance;
    }

    @NotNull
    public final BaseballEvent copy(int id, @NotNull Tournament tournament, @NotNull String slug, @Nullable Season season, @Nullable Round roundInfo, @NotNull Status status, @Nullable Integer winnerCode, @Nullable Integer aggregatedWinnerCode, @Nullable Integer attendance, @Nullable Venue venue, @Nullable Referee referee, @NotNull Team homeTeam, @NotNull Team awayTeam, @NotNull Score homeScore, @NotNull Score awayScore, @Nullable Boolean hasGlobalHighlights, @Nullable Boolean hasEventPlayerStatistics, boolean hasEventPlayerHeatMap, @Nullable Boolean hasXg, @NotNull String customId, long startTimestamp, @Nullable Long endTimestamp, @Nullable Time time, @Nullable EventChanges changes, @Nullable Integer coverage, @Nullable Integer previousLegEventId, @Nullable Integer parentEventId, @Nullable String lastPeriod, boolean finalResultOnly, @Nullable Boolean isEditor, boolean isAwarded, @Nullable Player manOfMatch, @Nullable Long currentPeriodStartTimestamp, @Nullable Map<String, String> periods, @Nullable Integer defaultPeriodCount, @Nullable TimeoutsInfo timeouts, boolean hasBet365LiveStream, @Nullable List<String> bet365ExcludedCountryCodes, int cupMatchesInRound, @Nullable String statusReason, @Nullable String eventEditorName, @Nullable EventEditor eventEditor, @Nullable String eventType, @Nullable String seasonStatisticsType, @Nullable Integer homeTeamRanking, @Nullable Integer awayTeamRanking, boolean crowdsourcingDataDisplayEnabled, boolean crowdsourcingDataDisplayPermanent, @Nullable TeamSeasonForm homeTeamSeasonHistoricalForm, @Nullable TeamSeasonForm awayTeamSeasonHistoricalForm, @Nullable Integer streamContentId, @Nullable List<String> streamContentGeoRestrictions, @Nullable BaseballInningInfo currentInningInfo, @Nullable Map<String, ? extends List<String>> eventFilters) {
        wt3.x(tournament, slug, status, homeTeam, awayTeam);
        homeScore.getClass();
        awayScore.getClass();
        customId.getClass();
        return new BaseballEvent(id, tournament, slug, season, roundInfo, status, winnerCode, aggregatedWinnerCode, attendance, venue, referee, homeTeam, awayTeam, homeScore, awayScore, hasGlobalHighlights, hasEventPlayerStatistics, hasEventPlayerHeatMap, hasXg, customId, startTimestamp, endTimestamp, time, changes, coverage, previousLegEventId, parentEventId, lastPeriod, finalResultOnly, isEditor, isAwarded, manOfMatch, currentPeriodStartTimestamp, periods, defaultPeriodCount, timeouts, hasBet365LiveStream, bet365ExcludedCountryCodes, cupMatchesInRound, statusReason, eventEditorName, eventEditor, eventType, seasonStatisticsType, homeTeamRanking, awayTeamRanking, crowdsourcingDataDisplayEnabled, crowdsourcingDataDisplayPermanent, homeTeamSeasonHistoricalForm, awayTeamSeasonHistoricalForm, streamContentId, streamContentGeoRestrictions, currentInningInfo, eventFilters);
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @NotNull
    public BaseballEvent copyEvent() {
        return copy$default(this, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 0L, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, 0, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, -1, 4194303, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseballEvent)) {
            return false;
        }
        BaseballEvent baseballEvent = (BaseballEvent) other;
        return this.id == baseballEvent.id && Intrinsics.c(this.tournament, baseballEvent.tournament) && Intrinsics.c(this.slug, baseballEvent.slug) && Intrinsics.c(this.season, baseballEvent.season) && Intrinsics.c(this.roundInfo, baseballEvent.roundInfo) && Intrinsics.c(this.status, baseballEvent.status) && Intrinsics.c(this.winnerCode, baseballEvent.winnerCode) && Intrinsics.c(this.aggregatedWinnerCode, baseballEvent.aggregatedWinnerCode) && Intrinsics.c(this.attendance, baseballEvent.attendance) && Intrinsics.c(this.venue, baseballEvent.venue) && Intrinsics.c(this.referee, baseballEvent.referee) && Intrinsics.c(this.homeTeam, baseballEvent.homeTeam) && Intrinsics.c(this.awayTeam, baseballEvent.awayTeam) && Intrinsics.c(this.homeScore, baseballEvent.homeScore) && Intrinsics.c(this.awayScore, baseballEvent.awayScore) && Intrinsics.c(this.hasGlobalHighlights, baseballEvent.hasGlobalHighlights) && Intrinsics.c(this.hasEventPlayerStatistics, baseballEvent.hasEventPlayerStatistics) && this.hasEventPlayerHeatMap == baseballEvent.hasEventPlayerHeatMap && Intrinsics.c(this.hasXg, baseballEvent.hasXg) && Intrinsics.c(this.customId, baseballEvent.customId) && this.startTimestamp == baseballEvent.startTimestamp && Intrinsics.c(this.endTimestamp, baseballEvent.endTimestamp) && Intrinsics.c(this.time, baseballEvent.time) && Intrinsics.c(this.changes, baseballEvent.changes) && Intrinsics.c(this.coverage, baseballEvent.coverage) && Intrinsics.c(this.previousLegEventId, baseballEvent.previousLegEventId) && Intrinsics.c(this.parentEventId, baseballEvent.parentEventId) && Intrinsics.c(this.lastPeriod, baseballEvent.lastPeriod) && this.finalResultOnly == baseballEvent.finalResultOnly && Intrinsics.c(this.isEditor, baseballEvent.isEditor) && this.isAwarded == baseballEvent.isAwarded && Intrinsics.c(this.manOfMatch, baseballEvent.manOfMatch) && Intrinsics.c(this.currentPeriodStartTimestamp, baseballEvent.currentPeriodStartTimestamp) && Intrinsics.c(this.periods, baseballEvent.periods) && Intrinsics.c(this.defaultPeriodCount, baseballEvent.defaultPeriodCount) && Intrinsics.c(this.timeouts, baseballEvent.timeouts) && this.hasBet365LiveStream == baseballEvent.hasBet365LiveStream && Intrinsics.c(this.bet365ExcludedCountryCodes, baseballEvent.bet365ExcludedCountryCodes) && this.cupMatchesInRound == baseballEvent.cupMatchesInRound && Intrinsics.c(this.statusReason, baseballEvent.statusReason) && Intrinsics.c(this.eventEditorName, baseballEvent.eventEditorName) && Intrinsics.c(this.eventEditor, baseballEvent.eventEditor) && Intrinsics.c(this.eventType, baseballEvent.eventType) && Intrinsics.c(this.seasonStatisticsType, baseballEvent.seasonStatisticsType) && Intrinsics.c(this.homeTeamRanking, baseballEvent.homeTeamRanking) && Intrinsics.c(this.awayTeamRanking, baseballEvent.awayTeamRanking) && this.crowdsourcingDataDisplayEnabled == baseballEvent.crowdsourcingDataDisplayEnabled && this.crowdsourcingDataDisplayPermanent == baseballEvent.crowdsourcingDataDisplayPermanent && Intrinsics.c(this.homeTeamSeasonHistoricalForm, baseballEvent.homeTeamSeasonHistoricalForm) && Intrinsics.c(this.awayTeamSeasonHistoricalForm, baseballEvent.awayTeamSeasonHistoricalForm) && Intrinsics.c(this.streamContentId, baseballEvent.streamContentId) && Intrinsics.c(this.streamContentGeoRestrictions, baseballEvent.streamContentGeoRestrictions) && Intrinsics.c(this.currentInningInfo, baseballEvent.currentInningInfo) && Intrinsics.c(this.eventFilters, baseballEvent.eventFilters);
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Integer getAggregatedWinnerCode() {
        return this.aggregatedWinnerCode;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Integer getAttendance() {
        return this.attendance;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @NotNull
    public Score getAwayScore() {
        return this.awayScore;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @NotNull
    public Team getAwayTeam() {
        return this.awayTeam;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Integer getAwayTeamRanking() {
        return this.awayTeamRanking;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public TeamSeasonForm getAwayTeamSeasonHistoricalForm() {
        return this.awayTeamSeasonHistoricalForm;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public List<String> getBet365ExcludedCountryCodes() {
        return this.bet365ExcludedCountryCodes;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public EventChanges getChanges() {
        return this.changes;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Integer getCoverage() {
        return this.coverage;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    public boolean getCrowdsourcingDataDisplayEnabled() {
        return this.crowdsourcingDataDisplayEnabled;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    public boolean getCrowdsourcingDataDisplayPermanent() {
        return this.crowdsourcingDataDisplayPermanent;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    public int getCupMatchesInRound() {
        return this.cupMatchesInRound;
    }

    @Nullable
    public final BaseballInningInfo getCurrentInningInfo() {
        return this.currentInningInfo;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Long getCurrentPeriodStartTimestamp() {
        return this.currentPeriodStartTimestamp;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @NotNull
    public String getCustomId() {
        return this.customId;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Integer getDefaultPeriodCount() {
        return this.defaultPeriodCount;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public EventEditor getEventEditor() {
        return this.eventEditor;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public String getEventEditorName() {
        return this.eventEditorName;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Map<String, List<String>> getEventFilters() {
        return this.eventFilters;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public String getEventType() {
        return this.eventType;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    public boolean getFinalResultOnly() {
        return this.finalResultOnly;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    public boolean getHasBet365LiveStream() {
        return this.hasBet365LiveStream;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    public boolean getHasEventPlayerHeatMap() {
        return this.hasEventPlayerHeatMap;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Boolean getHasEventPlayerStatistics() {
        return this.hasEventPlayerStatistics;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Boolean getHasGlobalHighlights() {
        return this.hasGlobalHighlights;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Boolean getHasXg() {
        return this.hasXg;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @NotNull
    public Score getHomeScore() {
        return this.homeScore;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @NotNull
    public Team getHomeTeam() {
        return this.homeTeam;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Integer getHomeTeamRanking() {
        return this.homeTeamRanking;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public TeamSeasonForm getHomeTeamSeasonHistoricalForm() {
        return this.homeTeamSeasonHistoricalForm;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public int getId() {
        return this.id;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public String getLastPeriod() {
        return this.lastPeriod;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Player getManOfMatch() {
        return this.manOfMatch;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Integer getParentEventId() {
        return this.parentEventId;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Map<String, String> getPeriods() {
        return this.periods;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Integer getPreviousLegEventId() {
        return this.previousLegEventId;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Referee getReferee() {
        return this.referee;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Round getRoundInfo() {
        return this.roundInfo;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Season getSeason() {
        return this.season;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public String getSeasonStatisticsType() {
        return this.seasonStatisticsType;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @NotNull
    public String getSlug() {
        return this.slug;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @NotNull
    public Status getStatus() {
        return this.status;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public String getStatusReason() {
        return this.statusReason;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public List<String> getStreamContentGeoRestrictions() {
        return this.streamContentGeoRestrictions;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Integer getStreamContentId() {
        return this.streamContentId;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Time getTime() {
        return this.time;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public TimeoutsInfo getTimeouts() {
        return this.timeouts;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @NotNull
    public Tournament getTournament() {
        return this.tournament;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Venue getVenue() {
        return this.venue;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Integer getWinnerCode() {
        return this.winnerCode;
    }

    public int hashCode() {
        int c = dmi.c((this.tournament.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.slug);
        Season season = this.season;
        int hashCode = (c + (season == null ? 0 : season.hashCode())) * 31;
        Round round = this.roundInfo;
        int hashCode2 = (this.status.hashCode() + ((hashCode + (round == null ? 0 : round.hashCode())) * 31)) * 31;
        Integer num = this.winnerCode;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.aggregatedWinnerCode;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.attendance;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Venue venue = this.venue;
        int hashCode6 = (hashCode5 + (venue == null ? 0 : venue.hashCode())) * 31;
        Referee referee = this.referee;
        int c2 = me4.c(this.awayScore, me4.c(this.homeScore, fc6.b(fc6.b((hashCode6 + (referee == null ? 0 : referee.hashCode())) * 31, 31, this.homeTeam), 31, this.awayTeam), 31), 31);
        Boolean bool = this.hasGlobalHighlights;
        int hashCode7 = (c2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasEventPlayerStatistics;
        int e = dmi.e((hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.hasEventPlayerHeatMap);
        Boolean bool3 = this.hasXg;
        int c3 = ljg.c(dmi.c((e + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31, this.customId), 31, this.startTimestamp);
        Long l = this.endTimestamp;
        int hashCode8 = (c3 + (l == null ? 0 : l.hashCode())) * 31;
        Time time = this.time;
        int hashCode9 = (hashCode8 + (time == null ? 0 : time.hashCode())) * 31;
        EventChanges eventChanges = this.changes;
        int hashCode10 = (hashCode9 + (eventChanges == null ? 0 : eventChanges.hashCode())) * 31;
        Integer num4 = this.coverage;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.previousLegEventId;
        int hashCode12 = (hashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.parentEventId;
        int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str = this.lastPeriod;
        int e2 = dmi.e((hashCode13 + (str == null ? 0 : str.hashCode())) * 31, 31, this.finalResultOnly);
        Boolean bool4 = this.isEditor;
        int e3 = dmi.e((e2 + (bool4 == null ? 0 : bool4.hashCode())) * 31, 31, this.isAwarded);
        Player player = this.manOfMatch;
        int hashCode14 = (e3 + (player == null ? 0 : player.hashCode())) * 31;
        Long l2 = this.currentPeriodStartTimestamp;
        int hashCode15 = (hashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Map<String, String> map = this.periods;
        int hashCode16 = (hashCode15 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num7 = this.defaultPeriodCount;
        int hashCode17 = (hashCode16 + (num7 == null ? 0 : num7.hashCode())) * 31;
        TimeoutsInfo timeoutsInfo = this.timeouts;
        int e4 = dmi.e((hashCode17 + (timeoutsInfo == null ? 0 : timeoutsInfo.hashCode())) * 31, 31, this.hasBet365LiveStream);
        List<String> list = this.bet365ExcludedCountryCodes;
        int a = wv8.a(this.cupMatchesInRound, (e4 + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str2 = this.statusReason;
        int hashCode18 = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventEditorName;
        int hashCode19 = (hashCode18 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EventEditor eventEditor = this.eventEditor;
        int hashCode20 = (hashCode19 + (eventEditor == null ? 0 : eventEditor.hashCode())) * 31;
        String str4 = this.eventType;
        int hashCode21 = (hashCode20 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.seasonStatisticsType;
        int hashCode22 = (hashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num8 = this.homeTeamRanking;
        int hashCode23 = (hashCode22 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.awayTeamRanking;
        int e5 = dmi.e(dmi.e((hashCode23 + (num9 == null ? 0 : num9.hashCode())) * 31, 31, this.crowdsourcingDataDisplayEnabled), 31, this.crowdsourcingDataDisplayPermanent);
        TeamSeasonForm teamSeasonForm = this.homeTeamSeasonHistoricalForm;
        int hashCode24 = (e5 + (teamSeasonForm == null ? 0 : teamSeasonForm.hashCode())) * 31;
        TeamSeasonForm teamSeasonForm2 = this.awayTeamSeasonHistoricalForm;
        int hashCode25 = (hashCode24 + (teamSeasonForm2 == null ? 0 : teamSeasonForm2.hashCode())) * 31;
        Integer num10 = this.streamContentId;
        int hashCode26 = (hashCode25 + (num10 == null ? 0 : num10.hashCode())) * 31;
        List<String> list2 = this.streamContentGeoRestrictions;
        int hashCode27 = (hashCode26 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseballInningInfo baseballInningInfo = this.currentInningInfo;
        int hashCode28 = (hashCode27 + (baseballInningInfo == null ? 0 : baseballInningInfo.hashCode())) * 31;
        Map<String, List<String>> map2 = this.eventFilters;
        return hashCode28 + (map2 != null ? map2.hashCode() : 0);
    }

    @Override // com.sofascore.model.mvvm.model.Event
    public boolean isAwarded() {
        return this.isAwarded;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @Nullable
    public Boolean isEditor() {
        return this.isEditor;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    public void setChanges(@Nullable EventChanges eventChanges) {
        this.changes = eventChanges;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    public void setRoundInfo(@Nullable Round round) {
        this.roundInfo = round;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Tournament tournament = this.tournament;
        String str = this.slug;
        Season season = this.season;
        Round round = this.roundInfo;
        Status status = this.status;
        Integer num = this.winnerCode;
        Integer num2 = this.aggregatedWinnerCode;
        Integer num3 = this.attendance;
        Venue venue = this.venue;
        Referee referee = this.referee;
        Team team = this.homeTeam;
        Team team2 = this.awayTeam;
        Score score = this.homeScore;
        Score score2 = this.awayScore;
        Boolean bool = this.hasGlobalHighlights;
        Boolean bool2 = this.hasEventPlayerStatistics;
        boolean z = this.hasEventPlayerHeatMap;
        Boolean bool3 = this.hasXg;
        String str2 = this.customId;
        long j = this.startTimestamp;
        Long l = this.endTimestamp;
        Time time = this.time;
        EventChanges eventChanges = this.changes;
        Integer num4 = this.coverage;
        Integer num5 = this.previousLegEventId;
        Integer num6 = this.parentEventId;
        String str3 = this.lastPeriod;
        boolean z2 = this.finalResultOnly;
        Boolean bool4 = this.isEditor;
        boolean z3 = this.isAwarded;
        Player player = this.manOfMatch;
        Long l2 = this.currentPeriodStartTimestamp;
        Map<String, String> map = this.periods;
        Integer num7 = this.defaultPeriodCount;
        TimeoutsInfo timeoutsInfo = this.timeouts;
        boolean z4 = this.hasBet365LiveStream;
        List<String> list = this.bet365ExcludedCountryCodes;
        int i2 = this.cupMatchesInRound;
        String str4 = this.statusReason;
        String str5 = this.eventEditorName;
        EventEditor eventEditor = this.eventEditor;
        String str6 = this.eventType;
        String str7 = this.seasonStatisticsType;
        Integer num8 = this.homeTeamRanking;
        Integer num9 = this.awayTeamRanking;
        boolean z5 = this.crowdsourcingDataDisplayEnabled;
        boolean z6 = this.crowdsourcingDataDisplayPermanent;
        TeamSeasonForm teamSeasonForm = this.homeTeamSeasonHistoricalForm;
        TeamSeasonForm teamSeasonForm2 = this.awayTeamSeasonHistoricalForm;
        Integer num10 = this.streamContentId;
        List<String> list2 = this.streamContentGeoRestrictions;
        BaseballInningInfo baseballInningInfo = this.currentInningInfo;
        Map<String, List<String>> map2 = this.eventFilters;
        StringBuilder sb = new StringBuilder("BaseballEvent(id=");
        sb.append(i);
        sb.append(", tournament=");
        sb.append(tournament);
        sb.append(", slug=");
        sb.append(str);
        sb.append(", season=");
        sb.append(season);
        sb.append(", roundInfo=");
        sb.append(round);
        sb.append(", status=");
        sb.append(status);
        sb.append(", winnerCode=");
        vxd.r(num, num2, ", aggregatedWinnerCode=", ", attendance=", sb);
        sb.append(num3);
        sb.append(", venue=");
        sb.append(venue);
        sb.append(", referee=");
        sb.append(referee);
        sb.append(", homeTeam=");
        sb.append(team);
        sb.append(", awayTeam=");
        sb.append(team2);
        sb.append(", homeScore=");
        sb.append(score);
        sb.append(", awayScore=");
        sb.append(score2);
        sb.append(", hasGlobalHighlights=");
        sb.append(bool);
        sb.append(", hasEventPlayerStatistics=");
        sb.append(bool2);
        sb.append(", hasEventPlayerHeatMap=");
        sb.append(z);
        sb.append(", hasXg=");
        sb.append(bool3);
        sb.append(", customId=");
        sb.append(str2);
        sb.append(", startTimestamp=");
        sb.append(j);
        sb.append(", endTimestamp=");
        sb.append(l);
        sb.append(", time=");
        sb.append(time);
        sb.append(", changes=");
        sb.append(eventChanges);
        fn0.w(num4, num5, ", coverage=", ", previousLegEventId=", sb);
        fn0.x(num6, ", parentEventId=", ", lastPeriod=", str3, sb);
        sb.append(", finalResultOnly=");
        sb.append(z2);
        sb.append(", isEditor=");
        sb.append(bool4);
        sb.append(", isAwarded=");
        sb.append(z3);
        sb.append(", manOfMatch=");
        sb.append(player);
        sb.append(", currentPeriodStartTimestamp=");
        sb.append(l2);
        sb.append(", periods=");
        sb.append(map);
        sb.append(", defaultPeriodCount=");
        sb.append(num7);
        sb.append(", timeouts=");
        sb.append(timeoutsInfo);
        sb.append(", hasBet365LiveStream=");
        sb.append(z4);
        sb.append(", bet365ExcludedCountryCodes=");
        sb.append(list);
        fn0.s(i2, ", cupMatchesInRound=", ", statusReason=", str4, sb);
        sb.append(", eventEditorName=");
        sb.append(str5);
        sb.append(", eventEditor=");
        sb.append(eventEditor);
        bf3.v(sb, ", eventType=", str6, ", seasonStatisticsType=", str7);
        fn0.w(num8, num9, ", homeTeamRanking=", ", awayTeamRanking=", sb);
        fn0.y(", crowdsourcingDataDisplayEnabled=", ", crowdsourcingDataDisplayPermanent=", sb, z5, z6);
        sb.append(", homeTeamSeasonHistoricalForm=");
        sb.append(teamSeasonForm);
        sb.append(", awayTeamSeasonHistoricalForm=");
        sb.append(teamSeasonForm2);
        sb.append(", streamContentId=");
        sb.append(num10);
        sb.append(", streamContentGeoRestrictions=");
        sb.append(list2);
        sb.append(", currentInningInfo=");
        sb.append(baseballInningInfo);
        sb.append(", eventFilters=");
        sb.append(map2);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/BaseballEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/BaseballEvent;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseballEvent(int i, @NotNull Tournament tournament, @NotNull String str, @Nullable Season season, @Nullable Round round, @NotNull Status status, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Venue venue, @Nullable Referee referee, @NotNull Team team, @NotNull Team team2, @NotNull Score score, @NotNull Score score2, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z, @Nullable Boolean bool3, @NotNull String str2, long j, @Nullable Long l, @Nullable Time time, @Nullable EventChanges eventChanges, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str3, boolean z2, @Nullable Boolean bool4, boolean z3, @Nullable Player player, @Nullable Long l2, @Nullable Map<String, String> map, @Nullable Integer num7, @Nullable TimeoutsInfo timeoutsInfo, boolean z4, @Nullable List<String> list, int i2, @Nullable String str4, @Nullable String str5, @Nullable EventEditor eventEditor, @Nullable String str6, @Nullable String str7, @Nullable Integer num8, @Nullable Integer num9, boolean z5, boolean z6, @Nullable TeamSeasonForm teamSeasonForm, @Nullable TeamSeasonForm teamSeasonForm2, @Nullable Integer num10, @Nullable List<String> list2, @Nullable BaseballInningInfo baseballInningInfo, @Nullable Map<String, ? extends List<String>> map2) {
        super(null);
        wt3.x(tournament, str, status, team, team2);
        score.getClass();
        score2.getClass();
        str2.getClass();
        this.id = i;
        this.tournament = tournament;
        this.slug = str;
        this.season = season;
        this.roundInfo = round;
        this.status = status;
        this.winnerCode = num;
        this.aggregatedWinnerCode = num2;
        this.attendance = num3;
        this.venue = venue;
        this.referee = referee;
        this.homeTeam = team;
        this.awayTeam = team2;
        this.homeScore = score;
        this.awayScore = score2;
        this.hasGlobalHighlights = bool;
        this.hasEventPlayerStatistics = bool2;
        this.hasEventPlayerHeatMap = z;
        this.hasXg = bool3;
        this.customId = str2;
        this.startTimestamp = j;
        this.endTimestamp = l;
        this.time = time;
        this.changes = eventChanges;
        this.coverage = num4;
        this.previousLegEventId = num5;
        this.parentEventId = num6;
        this.lastPeriod = str3;
        this.finalResultOnly = z2;
        this.isEditor = bool4;
        this.isAwarded = z3;
        this.manOfMatch = player;
        this.currentPeriodStartTimestamp = l2;
        this.periods = map;
        this.defaultPeriodCount = num7;
        this.timeouts = timeoutsInfo;
        this.hasBet365LiveStream = z4;
        this.bet365ExcludedCountryCodes = list;
        this.cupMatchesInRound = i2;
        this.statusReason = str4;
        this.eventEditorName = str5;
        this.eventEditor = eventEditor;
        this.eventType = str6;
        this.seasonStatisticsType = str7;
        this.homeTeamRanking = num8;
        this.awayTeamRanking = num9;
        this.crowdsourcingDataDisplayEnabled = z5;
        this.crowdsourcingDataDisplayPermanent = z6;
        this.homeTeamSeasonHistoricalForm = teamSeasonForm;
        this.awayTeamSeasonHistoricalForm = teamSeasonForm2;
        this.streamContentId = num10;
        this.streamContentGeoRestrictions = list2;
        this.currentInningInfo = baseballInningInfo;
        this.eventFilters = map2;
    }

    public /* synthetic */ BaseballEvent(int i, Tournament tournament, String str, Season season, Round round, Status status, Integer num, Integer num2, Integer num3, Venue venue, Referee referee, Team team, Team team2, Score score, Score score2, Boolean bool, Boolean bool2, boolean z, Boolean bool3, String str2, long j, Long l, Time time, EventChanges eventChanges, Integer num4, Integer num5, Integer num6, String str3, boolean z2, Boolean bool4, boolean z3, Player player, Long l2, Map map, Integer num7, TimeoutsInfo timeoutsInfo, boolean z4, List list, int i2, String str4, String str5, EventEditor eventEditor, String str6, String str7, Integer num8, Integer num9, boolean z5, boolean z6, TeamSeasonForm teamSeasonForm, TeamSeasonForm teamSeasonForm2, Integer num10, List list2, BaseballInningInfo baseballInningInfo, Map map2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, tournament, str, season, round, status, num, num2, num3, venue, referee, team, team2, score, score2, bool, bool2, (i3 & 131072) != 0 ? false : z, bool3, str2, j, l, time, eventChanges, num4, num5, num6, str3, z2, bool4, (i3 & 1073741824) != 0 ? false : z3, player, l2, map, num7, timeoutsInfo, (i4 & 16) != 0 ? false : z4, list, (i4 & 64) != 0 ? 0 : i2, str4, str5, eventEditor, str6, str7, num8, num9, (i4 & 16384) != 0 ? false : z5, (i4 & 32768) != 0 ? false : z6, teamSeasonForm, teamSeasonForm2, num10, list2, baseballInningInfo, map2);
    }
}
