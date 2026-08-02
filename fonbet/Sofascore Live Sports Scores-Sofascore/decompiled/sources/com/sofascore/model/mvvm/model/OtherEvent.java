package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
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
import defpackage.ild;
import defpackage.joa;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.me4;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bU\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bU\b\u0087\b\u0018\u0000 \u0082\u00022\u00020\u0001:\u0004\u0083\u0002\u0082\u0002B·\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\"\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\f\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\f\u0012\b\u0010)\u001a\u0004\u0018\u00010\f\u0012\b\u0010*\u001a\u0004\u0018\u00010\f\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010,\u001a\u00020\u001a\u0012\b\u0010-\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010.\u001a\u00020\u001a\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00101\u001a\u0004\u0018\u00010 \u0012\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000102\u0012\b\u00104\u001a\u0004\u0018\u00010\f\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00107\u001a\u00020\u001a\u0012\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108\u0012\b\b\u0002\u0010:\u001a\u00020\f\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010A\u001a\u0004\u0018\u00010\f\u0012\b\u0010B\u001a\u0004\u0018\u00010\f\u0012\b\u0010D\u001a\u0004\u0018\u00010C\u0012\b\u0010E\u001a\u0004\u0018\u00010C\u0012\b\b\u0002\u0010F\u001a\u00020\u001a\u0012\b\b\u0002\u0010G\u001a\u00020\u001a\u0012\b\b\u0002\u0010H\u001a\u00020\u001a\u0012\b\u0010I\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108\u0012\u001a\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0018\u000102¢\u0006\u0004\bL\u0010MBÕ\u0004\b\u0010\u0012\u0006\u0010N\u001a\u00020\f\u0012\u0006\u0010O\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\"\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\f\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\f\u0012\b\u0010)\u001a\u0004\u0018\u00010\f\u0012\b\u0010*\u001a\u0004\u0018\u00010\f\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010,\u001a\u00020\u001a\u0012\b\u0010-\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010.\u001a\u00020\u001a\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00101\u001a\u0004\u0018\u00010 \u0012\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000102\u0012\b\u00104\u001a\u0004\u0018\u00010\f\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\u0006\u00107\u001a\u00020\u001a\u0012\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108\u0012\u0006\u0010:\u001a\u00020\f\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010A\u001a\u0004\u0018\u00010\f\u0012\b\u0010B\u001a\u0004\u0018\u00010\f\u0012\b\u0010D\u001a\u0004\u0018\u00010C\u0012\b\u0010E\u001a\u0004\u0018\u00010C\u0012\u0006\u0010F\u001a\u00020\u001a\u0012\u0006\u0010G\u001a\u00020\u001a\u0012\u0006\u0010H\u001a\u00020\u001a\u0012\b\u0010I\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108\u0012\u001a\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0018\u000102\u0012\b\u0010Q\u001a\u0004\u0018\u00010P¢\u0006\u0004\bL\u0010RJ\u000f\u0010S\u001a\u00020\u0001H\u0016¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b]\u0010^J\u0012\u0010_\u001a\u0004\u0018\u00010\fHÄ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010\fHÄ\u0003¢\u0006\u0004\ba\u0010`J\u0012\u0010b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bb\u0010`J\u0012\u0010c\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0012\u0010e\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020\u0014HÄ\u0003¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020\u0014HÄ\u0003¢\u0006\u0004\bi\u0010hJ\u0010\u0010j\u001a\u00020\u0017HÄ\u0003¢\u0006\u0004\bj\u0010kJ\u0010\u0010l\u001a\u00020\u0017HÄ\u0003¢\u0006\u0004\bl\u0010kJ\u0012\u0010m\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0012\u0010o\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bo\u0010nJ\u0010\u0010p\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0012\u0010r\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\br\u0010nJ\u0010\u0010s\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bs\u0010XJ\u0010\u0010t\u001a\u00020 HÆ\u0003¢\u0006\u0004\bt\u0010uJ\u0012\u0010v\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bv\u0010wJ\u0010\u0010x\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bx\u0010yJ\u0012\u0010z\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bz\u0010{J\u0012\u0010|\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\b|\u0010}J\u0012\u0010~\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b~\u0010`J\u0012\u0010\u007f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u007f\u0010`J\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010`J\u0014\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u0081\u0001\u0010XJ\u0012\u0010\u0082\u0001\u001a\u00020\u001aHÆ\u0003¢\u0006\u0005\b\u0082\u0001\u0010qJ\u0014\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0005\b\u0083\u0001\u0010nJ\u0012\u0010\u0084\u0001\u001a\u00020\u001aHÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010qJ\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0014\u0010\u0087\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010wJ!\u0010\u0088\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000102HÆ\u0003¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b\u008a\u0001\u0010`J\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u000105HÆ\u0003¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0012\u0010\u008d\u0001\u001a\u00020\u001aHÆ\u0003¢\u0006\u0005\b\u008d\u0001\u0010qJ\u001b\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108HÆ\u0003¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0012\u0010\u0090\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0005\b\u0090\u0001\u0010yJ\u0014\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u0091\u0001\u0010XJ\u0014\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u0092\u0001\u0010XJ\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u00010=HÆ\u0003¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0014\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u0095\u0001\u0010XJ\u0014\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u0096\u0001\u0010XJ\u0014\u0010\u0097\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b\u0097\u0001\u0010`J\u0014\u0010\u0098\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b\u0098\u0001\u0010`J\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010CHÄ\u0003¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0015\u0010\u009b\u0001\u001a\u0004\u0018\u00010CHÄ\u0003¢\u0006\u0006\b\u009b\u0001\u0010\u009a\u0001J\u0012\u0010\u009c\u0001\u001a\u00020\u001aHÆ\u0003¢\u0006\u0005\b\u009c\u0001\u0010qJ\u0012\u0010\u009d\u0001\u001a\u00020\u001aHÆ\u0003¢\u0006\u0005\b\u009d\u0001\u0010qJ\u0012\u0010\u009e\u0001\u001a\u00020\u001aHÆ\u0003¢\u0006\u0005\b\u009e\u0001\u0010qJ\u0014\u0010\u009f\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b\u009f\u0001\u0010`J\u001b\u0010 \u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108HÆ\u0003¢\u0006\u0006\b \u0001\u0010\u008f\u0001J'\u0010¡\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0018\u000102HÆ\u0003¢\u0006\u0006\b¡\u0001\u0010\u0089\u0001J¡\u0005\u0010¢\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010,\u001a\u00020\u001a2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010.\u001a\u00020\u001a2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010 2\u0016\b\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u00107\u001a\u00020\u001a2\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001082\b\b\u0002\u0010:\u001a\u00020\f2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010F\u001a\u00020\u001a2\b\b\u0002\u0010G\u001a\u00020\u001a2\b\b\u0002\u0010H\u001a\u00020\u001a2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001082\u001c\b\u0002\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0018\u000102HÆ\u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0012\u0010¤\u0001\u001a\u00020\u0004HÖ\u0001¢\u0006\u0005\b¤\u0001\u0010XJ\u0012\u0010¥\u0001\u001a\u00020\fHÖ\u0001¢\u0006\u0005\b¥\u0001\u0010yJ\u001f\u0010¨\u0001\u001a\u00020\u001a2\n\u0010§\u0001\u001a\u0005\u0018\u00010¦\u0001HÖ\u0003¢\u0006\u0006\b¨\u0001\u0010©\u0001J0\u0010²\u0001\u001a\u00030¯\u00012\u0007\u0010ª\u0001\u001a\u00020\u00002\b\u0010¬\u0001\u001a\u00030«\u00012\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001R\u001c\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010³\u0001\u001a\u0005\b´\u0001\u0010VR\u001c\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010µ\u0001\u001a\u0005\b¶\u0001\u0010XR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010·\u0001\u001a\u0005\b¸\u0001\u0010ZR(\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b\t\u0010¹\u0001\u001a\u0005\bº\u0001\u0010\\\"\u0006\b»\u0001\u0010¼\u0001R\u001c\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010½\u0001\u001a\u0005\b¾\u0001\u0010^R\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\r\u0010¿\u0001\u001a\u0005\bÀ\u0001\u0010`R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010¿\u0001\u001a\u0005\bÁ\u0001\u0010`R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010¿\u0001\u001a\u0005\bÂ\u0001\u0010`R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010Ã\u0001\u001a\u0005\bÄ\u0001\u0010dR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010Å\u0001\u001a\u0005\bÆ\u0001\u0010fR\u001c\u0010\u0015\u001a\u00020\u00148\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010Ç\u0001\u001a\u0005\bÈ\u0001\u0010hR\u001c\u0010\u0016\u001a\u00020\u00148\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010Ç\u0001\u001a\u0005\bÉ\u0001\u0010hR\u001c\u0010\u0018\u001a\u00020\u00178\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010Ê\u0001\u001a\u0005\bË\u0001\u0010kR\u001c\u0010\u0019\u001a\u00020\u00178\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010Ê\u0001\u001a\u0005\bÌ\u0001\u0010kR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010Í\u0001\u001a\u0005\bÎ\u0001\u0010nR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010Í\u0001\u001a\u0005\bÏ\u0001\u0010nR\u001c\u0010\u001d\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010Ð\u0001\u001a\u0005\bÑ\u0001\u0010qR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010Í\u0001\u001a\u0005\bÒ\u0001\u0010nR\u001c\u0010\u001f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010µ\u0001\u001a\u0005\bÓ\u0001\u0010XR\u001c\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b!\u0010Ô\u0001\u001a\u0005\bÕ\u0001\u0010uR\u001e\u0010\"\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\"\u0010Ö\u0001\u001a\u0005\b×\u0001\u0010wR\u001c\u0010#\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b#\u0010Ø\u0001\u001a\u0005\bÙ\u0001\u0010yR\u001e\u0010%\u001a\u0004\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b%\u0010Ú\u0001\u001a\u0005\bÛ\u0001\u0010{R(\u0010'\u001a\u0004\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b'\u0010Ü\u0001\u001a\u0005\bÝ\u0001\u0010}\"\u0006\bÞ\u0001\u0010ß\u0001R\u001e\u0010(\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b(\u0010¿\u0001\u001a\u0005\bà\u0001\u0010`R\u001e\u0010)\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b)\u0010¿\u0001\u001a\u0005\bá\u0001\u0010`R\u001e\u0010*\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b*\u0010¿\u0001\u001a\u0005\bâ\u0001\u0010`R\u001e\u0010+\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b+\u0010µ\u0001\u001a\u0005\bã\u0001\u0010XR\u001c\u0010,\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b,\u0010Ð\u0001\u001a\u0005\bä\u0001\u0010qR\u001d\u0010-\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b-\u0010Í\u0001\u001a\u0004\b-\u0010nR\u001b\u0010.\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b.\u0010Ð\u0001\u001a\u0004\b.\u0010qR\u001f\u00100\u001a\u0004\u0018\u00010/8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b0\u0010å\u0001\u001a\u0006\bæ\u0001\u0010\u0086\u0001R\u001e\u00101\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b1\u0010Ö\u0001\u001a\u0005\bç\u0001\u0010wR+\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b3\u0010è\u0001\u001a\u0006\bé\u0001\u0010\u0089\u0001R\u001e\u00104\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b4\u0010¿\u0001\u001a\u0005\bê\u0001\u0010`R\u001f\u00106\u001a\u0004\u0018\u0001058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b6\u0010ë\u0001\u001a\u0006\bì\u0001\u0010\u008c\u0001R\u001c\u00107\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b7\u0010Ð\u0001\u001a\u0005\bí\u0001\u0010qR%\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001088\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b9\u0010î\u0001\u001a\u0006\bï\u0001\u0010\u008f\u0001R\u001c\u0010:\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b:\u0010Ø\u0001\u001a\u0005\bð\u0001\u0010yR\u001e\u0010;\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b;\u0010µ\u0001\u001a\u0005\bñ\u0001\u0010XR\u001e\u0010<\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b<\u0010µ\u0001\u001a\u0005\bò\u0001\u0010XR\u001f\u0010>\u001a\u0004\u0018\u00010=8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b>\u0010ó\u0001\u001a\u0006\bô\u0001\u0010\u0094\u0001R\u001e\u0010?\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b?\u0010µ\u0001\u001a\u0005\bõ\u0001\u0010XR\u001e\u0010@\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b@\u0010µ\u0001\u001a\u0005\bö\u0001\u0010XR\u001e\u0010A\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bA\u0010¿\u0001\u001a\u0005\b÷\u0001\u0010`R\u001e\u0010B\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bB\u0010¿\u0001\u001a\u0005\bø\u0001\u0010`R\u001f\u0010D\u001a\u0004\u0018\u00010C8\u0014X\u0094\u0004¢\u0006\u000f\n\u0005\bD\u0010ù\u0001\u001a\u0006\bú\u0001\u0010\u009a\u0001R\u001f\u0010E\u001a\u0004\u0018\u00010C8\u0014X\u0094\u0004¢\u0006\u000f\n\u0005\bE\u0010ù\u0001\u001a\u0006\bû\u0001\u0010\u009a\u0001R\u001c\u0010F\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bF\u0010Ð\u0001\u001a\u0005\bü\u0001\u0010qR\u001c\u0010G\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bG\u0010Ð\u0001\u001a\u0005\bý\u0001\u0010qR\u001c\u0010H\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bH\u0010Ð\u0001\u001a\u0005\bþ\u0001\u0010qR\u001e\u0010I\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bI\u0010¿\u0001\u001a\u0005\bÿ\u0001\u0010`R%\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001088\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bJ\u0010î\u0001\u001a\u0006\b\u0080\u0002\u0010\u008f\u0001R1\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0018\u0001028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bK\u0010è\u0001\u001a\u0006\b\u0081\u0002\u0010\u0089\u0001¨\u0006\u0084\u0002"}, d2 = {"Lcom/sofascore/model/mvvm/model/OtherEvent;", "Lcom/sofascore/model/mvvm/model/Event;", "Lcom/sofascore/model/mvvm/model/Tournament;", "tournament", "", "slug", "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "Lcom/sofascore/model/mvvm/model/Round;", "roundInfo", "Lcom/sofascore/model/mvvm/model/Status;", "status", "", "winnerCode", "aggregatedWinnerCode", "attendance", "Lcom/sofascore/model/mvvm/model/Venue;", "venue", "Lcom/sofascore/model/mvvm/model/Referee;", SearchResponseKt.REFEREE_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "homeTeam", "awayTeam", "Lcom/sofascore/model/mvvm/model/Score;", "homeScore", "awayScore", "", "hasGlobalHighlights", "hasEventPlayerStatistics", "hasEventPlayerHeatMap", "hasXg", "customId", "", "startTimestamp", "endTimestamp", "id", "Lcom/sofascore/model/mvvm/model/Time;", "time", "Lcom/sofascore/model/mvvm/model/EventChanges;", "changes", "coverage", "previousLegEventId", "parentEventId", "lastPeriod", "finalResultOnly", "isEditor", "isAwarded", "Lcom/sofascore/model/mvvm/model/Player;", "manOfMatch", "currentPeriodStartTimestamp", "", "periods", "defaultPeriodCount", "Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "timeouts", "hasBet365LiveStream", "", "bet365ExcludedCountryCodes", "cupMatchesInRound", "statusReason", "eventEditorName", "Lcom/sofascore/model/mvvm/model/EventEditor;", "eventEditor", "eventType", "seasonStatisticsType", "homeTeamRanking", "awayTeamRanking", "Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "homeTeamSeasonHistoricalForm", "awayTeamSeasonHistoricalForm", "crowdsourcingEnabled", "crowdsourcingDataDisplayEnabled", "crowdsourcingDataDisplayPermanent", "streamContentId", "streamContentGeoRestrictions", "eventFilters", "<init>", "(Lcom/sofascore/model/mvvm/model/Tournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Round;Lcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Venue;Lcom/sofascore/model/mvvm/model/Referee;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;JLjava/lang/Long;ILcom/sofascore/model/mvvm/model/Time;Lcom/sofascore/model/mvvm/model/EventChanges;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/sofascore/model/mvvm/model/Player;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TimeoutsInfo;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/EventEditor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;ZZZLjava/lang/Integer;Ljava/util/List;Ljava/util/Map;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/mvvm/model/Tournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Round;Lcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Venue;Lcom/sofascore/model/mvvm/model/Referee;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;JLjava/lang/Long;ILcom/sofascore/model/mvvm/model/Time;Lcom/sofascore/model/mvvm/model/EventChanges;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/sofascore/model/mvvm/model/Player;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TimeoutsInfo;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/EventEditor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;ZZZLjava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lt5h;)V", "copyEvent", "()Lcom/sofascore/model/mvvm/model/Event;", "component1", "()Lcom/sofascore/model/mvvm/model/Tournament;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/sofascore/model/mvvm/model/Season;", "component4", "()Lcom/sofascore/model/mvvm/model/Round;", "component5", "()Lcom/sofascore/model/mvvm/model/Status;", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "()Lcom/sofascore/model/mvvm/model/Venue;", "component10", "()Lcom/sofascore/model/mvvm/model/Referee;", "component11", "()Lcom/sofascore/model/mvvm/model/Team;", "component12", "component13", "()Lcom/sofascore/model/mvvm/model/Score;", "component14", "component15", "()Ljava/lang/Boolean;", "component16", "component17", "()Z", "component18", "component19", "component20", "()J", "component21", "()Ljava/lang/Long;", "component22", "()I", "component23", "()Lcom/sofascore/model/mvvm/model/Time;", "component24", "()Lcom/sofascore/model/mvvm/model/EventChanges;", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "()Lcom/sofascore/model/mvvm/model/Player;", "component33", "component34", "()Ljava/util/Map;", "component35", "component36", "()Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "component37", "component38", "()Ljava/util/List;", "component39", "component40", "component41", "component42", "()Lcom/sofascore/model/mvvm/model/EventEditor;", "component43", "component44", "component45", "component46", "component47", "()Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "copy", "(Lcom/sofascore/model/mvvm/model/Tournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Round;Lcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Venue;Lcom/sofascore/model/mvvm/model/Referee;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;JLjava/lang/Long;ILcom/sofascore/model/mvvm/model/Time;Lcom/sofascore/model/mvvm/model/EventChanges;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/sofascore/model/mvvm/model/Player;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TimeoutsInfo;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/EventEditor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;ZZZLjava/lang/Integer;Ljava/util/List;Ljava/util/Map;)Lcom/sofascore/model/mvvm/model/OtherEvent;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/OtherEvent;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/Tournament;", "getTournament", "Ljava/lang/String;", "getSlug", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "Lcom/sofascore/model/mvvm/model/Round;", "getRoundInfo", "setRoundInfo", "(Lcom/sofascore/model/mvvm/model/Round;)V", "Lcom/sofascore/model/mvvm/model/Status;", "getStatus", "Ljava/lang/Integer;", "getWinnerCode", "getAggregatedWinnerCode", "getAttendance", "Lcom/sofascore/model/mvvm/model/Venue;", "getVenue", "Lcom/sofascore/model/mvvm/model/Referee;", "getReferee", "Lcom/sofascore/model/mvvm/model/Team;", "getHomeTeam", "getAwayTeam", "Lcom/sofascore/model/mvvm/model/Score;", "getHomeScore", "getAwayScore", "Ljava/lang/Boolean;", "getHasGlobalHighlights", "getHasEventPlayerStatistics", "Z", "getHasEventPlayerHeatMap", "getHasXg", "getCustomId", "J", "getStartTimestamp", "Ljava/lang/Long;", "getEndTimestamp", "I", "getId", "Lcom/sofascore/model/mvvm/model/Time;", "getTime", "Lcom/sofascore/model/mvvm/model/EventChanges;", "getChanges", "setChanges", "(Lcom/sofascore/model/mvvm/model/EventChanges;)V", "getCoverage", "getPreviousLegEventId", "getParentEventId", "getLastPeriod", "getFinalResultOnly", "Lcom/sofascore/model/mvvm/model/Player;", "getManOfMatch", "getCurrentPeriodStartTimestamp", "Ljava/util/Map;", "getPeriods", "getDefaultPeriodCount", "Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "getTimeouts", "getHasBet365LiveStream", "Ljava/util/List;", "getBet365ExcludedCountryCodes", "getCupMatchesInRound", "getStatusReason", "getEventEditorName", "Lcom/sofascore/model/mvvm/model/EventEditor;", "getEventEditor", "getEventType", "getSeasonStatisticsType", "getHomeTeamRanking", "getAwayTeamRanking", "Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "getHomeTeamSeasonHistoricalForm", "getAwayTeamSeasonHistoricalForm", "getCrowdsourcingEnabled", "getCrowdsourcingDataDisplayEnabled", "getCrowdsourcingDataDisplayPermanent", "getStreamContentId", "getStreamContentGeoRestrictions", "getEventFilters", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OtherEvent extends Event {

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
    private final boolean crowdsourcingEnabled;
    private final int cupMatchesInRound;

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
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new ild(14)), ypa.a(ysaVar, new ild(15)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new ild(16)), null, null, null, ypa.a(ysaVar, new ild(17)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new ild(18)), ypa.a(ysaVar, new ild(19))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OtherEvent(int i, int i2, Tournament tournament, String str, Season season, Round round, Status status, Integer num, Integer num2, Integer num3, Venue venue, Referee referee, Team team, Team team2, Score score, Score score2, Boolean bool, Boolean bool2, boolean z, Boolean bool3, String str2, long j, Long l, int i3, Time time, EventChanges eventChanges, Integer num4, Integer num5, Integer num6, String str3, boolean z2, Boolean bool4, boolean z3, Player player, Long l2, Map map, Integer num7, TimeoutsInfo timeoutsInfo, boolean z4, List list, int i4, String str4, String str5, EventEditor eventEditor, String str6, String str7, Integer num8, Integer num9, TeamSeasonForm teamSeasonForm, TeamSeasonForm teamSeasonForm2, boolean z5, boolean z6, boolean z7, Integer num10, List list2, Map map2, t5h t5hVar) {
        super(r2);
        DefaultConstructorMarker defaultConstructorMarker = null;
        if ((-1073807361 != (i & (-1073807361))) || (3735471 != (i2 & 3735471))) {
            oea.y(new int[]{i, i2}, new int[]{-1073807361, 3735471}, OtherEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
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
        if ((i & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0) {
            this.hasEventPlayerHeatMap = false;
        } else {
            this.hasEventPlayerHeatMap = z;
        }
        this.hasXg = bool3;
        this.customId = str2;
        this.startTimestamp = j;
        this.endTimestamp = l;
        this.id = i3;
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
        this.homeTeamSeasonHistoricalForm = teamSeasonForm;
        this.awayTeamSeasonHistoricalForm = teamSeasonForm2;
        if ((i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0) {
            this.crowdsourcingEnabled = false;
        } else {
            this.crowdsourcingEnabled = z5;
        }
        if ((131072 & i2) == 0) {
            this.crowdsourcingDataDisplayEnabled = false;
        } else {
            this.crowdsourcingDataDisplayEnabled = z6;
        }
        if ((262144 & i2) == 0) {
            this.crowdsourcingDataDisplayPermanent = false;
        } else {
            this.crowdsourcingDataDisplayPermanent = z7;
        }
        this.streamContentId = num10;
        this.streamContentGeoRestrictions = list2;
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

    public static /* synthetic */ OtherEvent copy$default(OtherEvent otherEvent, Tournament tournament, String str, Season season, Round round, Status status, Integer num, Integer num2, Integer num3, Venue venue, Referee referee, Team team, Team team2, Score score, Score score2, Boolean bool, Boolean bool2, boolean z, Boolean bool3, String str2, long j, Long l, int i, Time time, EventChanges eventChanges, Integer num4, Integer num5, Integer num6, String str3, boolean z2, Boolean bool4, boolean z3, Player player, Long l2, Map map, Integer num7, TimeoutsInfo timeoutsInfo, boolean z4, List list, int i2, String str4, String str5, EventEditor eventEditor, String str6, String str7, Integer num8, Integer num9, TeamSeasonForm teamSeasonForm, TeamSeasonForm teamSeasonForm2, boolean z5, boolean z6, boolean z7, Integer num10, List list2, Map map2, int i3, int i4, Object obj) {
        Tournament tournament2 = (i3 & 1) != 0 ? otherEvent.tournament : tournament;
        return otherEvent.copy(tournament2, (i3 & 2) != 0 ? otherEvent.slug : str, (i3 & 4) != 0 ? otherEvent.season : season, (i3 & 8) != 0 ? otherEvent.roundInfo : round, (i3 & 16) != 0 ? otherEvent.status : status, (i3 & 32) != 0 ? otherEvent.winnerCode : num, (i3 & 64) != 0 ? otherEvent.aggregatedWinnerCode : num2, (i3 & 128) != 0 ? otherEvent.attendance : num3, (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? otherEvent.venue : venue, (i3 & 512) != 0 ? otherEvent.referee : referee, (i3 & 1024) != 0 ? otherEvent.homeTeam : team, (i3 & a.o) != 0 ? otherEvent.awayTeam : team2, (i3 & 4096) != 0 ? otherEvent.homeScore : score, (i3 & 8192) != 0 ? otherEvent.awayScore : score2, (i3 & 16384) != 0 ? otherEvent.hasGlobalHighlights : bool, (i3 & 32768) != 0 ? otherEvent.hasEventPlayerStatistics : bool2, (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? otherEvent.hasEventPlayerHeatMap : z, (i3 & 131072) != 0 ? otherEvent.hasXg : bool3, (i3 & 262144) != 0 ? otherEvent.customId : str2, (i3 & 524288) != 0 ? otherEvent.startTimestamp : j, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? otherEvent.endTimestamp : l, (i3 & 2097152) != 0 ? otherEvent.id : i, (i3 & 4194304) != 0 ? otherEvent.time : time, (i3 & 8388608) != 0 ? otherEvent.changes : eventChanges, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? otherEvent.coverage : num4, (i3 & 33554432) != 0 ? otherEvent.previousLegEventId : num5, (i3 & 67108864) != 0 ? otherEvent.parentEventId : num6, (i3 & 134217728) != 0 ? otherEvent.lastPeriod : str3, (i3 & 268435456) != 0 ? otherEvent.finalResultOnly : z2, (i3 & 536870912) != 0 ? otherEvent.isEditor : bool4, (i3 & 1073741824) != 0 ? otherEvent.isAwarded : z3, (i3 & Integer.MIN_VALUE) != 0 ? otherEvent.manOfMatch : player, (i4 & 1) != 0 ? otherEvent.currentPeriodStartTimestamp : l2, (i4 & 2) != 0 ? otherEvent.periods : map, (i4 & 4) != 0 ? otherEvent.defaultPeriodCount : num7, (i4 & 8) != 0 ? otherEvent.timeouts : timeoutsInfo, (i4 & 16) != 0 ? otherEvent.hasBet365LiveStream : z4, (i4 & 32) != 0 ? otherEvent.bet365ExcludedCountryCodes : list, (i4 & 64) != 0 ? otherEvent.cupMatchesInRound : i2, (i4 & 128) != 0 ? otherEvent.statusReason : str4, (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? otherEvent.eventEditorName : str5, (i4 & 512) != 0 ? otherEvent.eventEditor : eventEditor, (i4 & 1024) != 0 ? otherEvent.eventType : str6, (i4 & a.o) != 0 ? otherEvent.seasonStatisticsType : str7, (i4 & 4096) != 0 ? otherEvent.homeTeamRanking : num8, (i4 & 8192) != 0 ? otherEvent.awayTeamRanking : num9, (i4 & 16384) != 0 ? otherEvent.homeTeamSeasonHistoricalForm : teamSeasonForm, (i4 & 32768) != 0 ? otherEvent.awayTeamSeasonHistoricalForm : teamSeasonForm2, (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? otherEvent.crowdsourcingEnabled : z5, (i4 & 131072) != 0 ? otherEvent.crowdsourcingDataDisplayEnabled : z6, (i4 & 262144) != 0 ? otherEvent.crowdsourcingDataDisplayPermanent : z7, (i4 & 524288) != 0 ? otherEvent.streamContentId : num10, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? otherEvent.streamContentGeoRestrictions : list2, (i4 & 2097152) != 0 ? otherEvent.eventFilters : map2);
    }

    public static final /* synthetic */ void write$Self$model_release(OtherEvent self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, Tournament$$serializer.INSTANCE, self.getTournament());
        output.y(serialDesc, 1, self.getSlug());
        output.h(serialDesc, 2, Season$$serializer.INSTANCE, self.getSeason());
        output.h(serialDesc, 3, Round$$serializer.INSTANCE, self.getRoundInfo());
        output.f(serialDesc, 4, Status$$serializer.INSTANCE, self.getStatus());
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 5, a7aVar, self.getWinnerCode());
        output.h(serialDesc, 6, a7aVar, self.getAggregatedWinnerCode());
        output.h(serialDesc, 7, a7aVar, self.getAttendance());
        output.h(serialDesc, 8, Venue$$serializer.INSTANCE, self.getVenue());
        output.h(serialDesc, 9, Referee$$serializer.INSTANCE, self.getReferee());
        output.f(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.getHomeTeam());
        output.f(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.getAwayTeam());
        Score$$serializer score$$serializer = Score$$serializer.INSTANCE;
        output.f(serialDesc, 12, score$$serializer, self.getHomeScore());
        output.f(serialDesc, 13, score$$serializer, self.getAwayScore());
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 14, gz1Var, self.getHasGlobalHighlights());
        output.h(serialDesc, 15, gz1Var, self.getHasEventPlayerStatistics());
        if (output.o(serialDesc) || self.getHasEventPlayerHeatMap()) {
            output.x(serialDesc, 16, self.getHasEventPlayerHeatMap());
        }
        output.h(serialDesc, 17, gz1Var, self.getHasXg());
        output.y(serialDesc, 18, self.getCustomId());
        output.E(serialDesc, 19, self.getStartTimestamp());
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 20, lkbVar, self.getEndTimestamp());
        output.u(21, self.getId(), serialDesc);
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
        TeamSeasonForm$$serializer teamSeasonForm$$serializer = TeamSeasonForm$$serializer.INSTANCE;
        output.h(serialDesc, 46, teamSeasonForm$$serializer, self.getHomeTeamSeasonHistoricalForm());
        output.h(serialDesc, 47, teamSeasonForm$$serializer, self.getAwayTeamSeasonHistoricalForm());
        if (output.o(serialDesc) || self.getCrowdsourcingEnabled()) {
            output.x(serialDesc, 48, self.getCrowdsourcingEnabled());
        }
        if (output.o(serialDesc) || self.getCrowdsourcingDataDisplayEnabled()) {
            output.x(serialDesc, 49, self.getCrowdsourcingDataDisplayEnabled());
        }
        if (output.o(serialDesc) || self.getCrowdsourcingDataDisplayPermanent()) {
            output.x(serialDesc, 50, self.getCrowdsourcingDataDisplayPermanent());
        }
        output.h(serialDesc, 51, a7aVar, self.getStreamContentId());
        output.h(serialDesc, 52, (KSerializer) joaVarArr[52].getValue(), self.getStreamContentGeoRestrictions());
        output.h(serialDesc, 53, (KSerializer) joaVarArr[53].getValue(), self.getEventFilters());
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Tournament getTournament() {
        return this.tournament;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Referee getReferee() {
        return this.referee;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final Team getHomeTeam() {
        return this.homeTeam;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final Team getAwayTeam() {
        return this.awayTeam;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final Score getHomeScore() {
        return this.homeScore;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final Score getAwayScore() {
        return this.awayScore;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Boolean getHasGlobalHighlights() {
        return this.hasGlobalHighlights;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Boolean getHasEventPlayerStatistics() {
        return this.hasEventPlayerStatistics;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getHasEventPlayerHeatMap() {
        return this.hasEventPlayerHeatMap;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Boolean getHasXg() {
        return this.hasXg;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final String getCustomId() {
        return this.customId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* renamed from: component20, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* renamed from: component22, reason: from getter */
    public final int getId() {
        return this.id;
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

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Season getSeason() {
        return this.season;
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
    public final Round getRoundInfo() {
        return this.roundInfo;
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

    @Nullable
    /* renamed from: component47, reason: from getter */
    public final TeamSeasonForm getHomeTeamSeasonHistoricalForm() {
        return this.homeTeamSeasonHistoricalForm;
    }

    @Nullable
    /* renamed from: component48, reason: from getter */
    public final TeamSeasonForm getAwayTeamSeasonHistoricalForm() {
        return this.awayTeamSeasonHistoricalForm;
    }

    /* renamed from: component49, reason: from getter */
    public final boolean getCrowdsourcingEnabled() {
        return this.crowdsourcingEnabled;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component50, reason: from getter */
    public final boolean getCrowdsourcingDataDisplayEnabled() {
        return this.crowdsourcingDataDisplayEnabled;
    }

    /* renamed from: component51, reason: from getter */
    public final boolean getCrowdsourcingDataDisplayPermanent() {
        return this.crowdsourcingDataDisplayPermanent;
    }

    @Nullable
    /* renamed from: component52, reason: from getter */
    public final Integer getStreamContentId() {
        return this.streamContentId;
    }

    @Nullable
    public final List<String> component53() {
        return this.streamContentGeoRestrictions;
    }

    @Nullable
    public final Map<String, List<String>> component54() {
        return this.eventFilters;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getWinnerCode() {
        return this.winnerCode;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getAggregatedWinnerCode() {
        return this.aggregatedWinnerCode;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getAttendance() {
        return this.attendance;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Venue getVenue() {
        return this.venue;
    }

    @NotNull
    public final OtherEvent copy(@NotNull Tournament tournament, @NotNull String slug, @Nullable Season season, @Nullable Round roundInfo, @NotNull Status status, @Nullable Integer winnerCode, @Nullable Integer aggregatedWinnerCode, @Nullable Integer attendance, @Nullable Venue venue, @Nullable Referee referee, @NotNull Team homeTeam, @NotNull Team awayTeam, @NotNull Score homeScore, @NotNull Score awayScore, @Nullable Boolean hasGlobalHighlights, @Nullable Boolean hasEventPlayerStatistics, boolean hasEventPlayerHeatMap, @Nullable Boolean hasXg, @NotNull String customId, long startTimestamp, @Nullable Long endTimestamp, int id, @Nullable Time time, @Nullable EventChanges changes, @Nullable Integer coverage, @Nullable Integer previousLegEventId, @Nullable Integer parentEventId, @Nullable String lastPeriod, boolean finalResultOnly, @Nullable Boolean isEditor, boolean isAwarded, @Nullable Player manOfMatch, @Nullable Long currentPeriodStartTimestamp, @Nullable Map<String, String> periods, @Nullable Integer defaultPeriodCount, @Nullable TimeoutsInfo timeouts, boolean hasBet365LiveStream, @Nullable List<String> bet365ExcludedCountryCodes, int cupMatchesInRound, @Nullable String statusReason, @Nullable String eventEditorName, @Nullable EventEditor eventEditor, @Nullable String eventType, @Nullable String seasonStatisticsType, @Nullable Integer homeTeamRanking, @Nullable Integer awayTeamRanking, @Nullable TeamSeasonForm homeTeamSeasonHistoricalForm, @Nullable TeamSeasonForm awayTeamSeasonHistoricalForm, boolean crowdsourcingEnabled, boolean crowdsourcingDataDisplayEnabled, boolean crowdsourcingDataDisplayPermanent, @Nullable Integer streamContentId, @Nullable List<String> streamContentGeoRestrictions, @Nullable Map<String, ? extends List<String>> eventFilters) {
        wt3.x(tournament, slug, status, homeTeam, awayTeam);
        homeScore.getClass();
        awayScore.getClass();
        customId.getClass();
        return new OtherEvent(tournament, slug, season, roundInfo, status, winnerCode, aggregatedWinnerCode, attendance, venue, referee, homeTeam, awayTeam, homeScore, awayScore, hasGlobalHighlights, hasEventPlayerStatistics, hasEventPlayerHeatMap, hasXg, customId, startTimestamp, endTimestamp, id, time, changes, coverage, previousLegEventId, parentEventId, lastPeriod, finalResultOnly, isEditor, isAwarded, manOfMatch, currentPeriodStartTimestamp, periods, defaultPeriodCount, timeouts, hasBet365LiveStream, bet365ExcludedCountryCodes, cupMatchesInRound, statusReason, eventEditorName, eventEditor, eventType, seasonStatisticsType, homeTeamRanking, awayTeamRanking, homeTeamSeasonHistoricalForm, awayTeamSeasonHistoricalForm, crowdsourcingEnabled, crowdsourcingDataDisplayEnabled, crowdsourcingDataDisplayPermanent, streamContentId, streamContentGeoRestrictions, eventFilters);
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @NotNull
    public Event copyEvent() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 0L, null, 0, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, 0, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, -1, 4194303, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherEvent)) {
            return false;
        }
        OtherEvent otherEvent = (OtherEvent) other;
        return Intrinsics.c(this.tournament, otherEvent.tournament) && Intrinsics.c(this.slug, otherEvent.slug) && Intrinsics.c(this.season, otherEvent.season) && Intrinsics.c(this.roundInfo, otherEvent.roundInfo) && Intrinsics.c(this.status, otherEvent.status) && Intrinsics.c(this.winnerCode, otherEvent.winnerCode) && Intrinsics.c(this.aggregatedWinnerCode, otherEvent.aggregatedWinnerCode) && Intrinsics.c(this.attendance, otherEvent.attendance) && Intrinsics.c(this.venue, otherEvent.venue) && Intrinsics.c(this.referee, otherEvent.referee) && Intrinsics.c(this.homeTeam, otherEvent.homeTeam) && Intrinsics.c(this.awayTeam, otherEvent.awayTeam) && Intrinsics.c(this.homeScore, otherEvent.homeScore) && Intrinsics.c(this.awayScore, otherEvent.awayScore) && Intrinsics.c(this.hasGlobalHighlights, otherEvent.hasGlobalHighlights) && Intrinsics.c(this.hasEventPlayerStatistics, otherEvent.hasEventPlayerStatistics) && this.hasEventPlayerHeatMap == otherEvent.hasEventPlayerHeatMap && Intrinsics.c(this.hasXg, otherEvent.hasXg) && Intrinsics.c(this.customId, otherEvent.customId) && this.startTimestamp == otherEvent.startTimestamp && Intrinsics.c(this.endTimestamp, otherEvent.endTimestamp) && this.id == otherEvent.id && Intrinsics.c(this.time, otherEvent.time) && Intrinsics.c(this.changes, otherEvent.changes) && Intrinsics.c(this.coverage, otherEvent.coverage) && Intrinsics.c(this.previousLegEventId, otherEvent.previousLegEventId) && Intrinsics.c(this.parentEventId, otherEvent.parentEventId) && Intrinsics.c(this.lastPeriod, otherEvent.lastPeriod) && this.finalResultOnly == otherEvent.finalResultOnly && Intrinsics.c(this.isEditor, otherEvent.isEditor) && this.isAwarded == otherEvent.isAwarded && Intrinsics.c(this.manOfMatch, otherEvent.manOfMatch) && Intrinsics.c(this.currentPeriodStartTimestamp, otherEvent.currentPeriodStartTimestamp) && Intrinsics.c(this.periods, otherEvent.periods) && Intrinsics.c(this.defaultPeriodCount, otherEvent.defaultPeriodCount) && Intrinsics.c(this.timeouts, otherEvent.timeouts) && this.hasBet365LiveStream == otherEvent.hasBet365LiveStream && Intrinsics.c(this.bet365ExcludedCountryCodes, otherEvent.bet365ExcludedCountryCodes) && this.cupMatchesInRound == otherEvent.cupMatchesInRound && Intrinsics.c(this.statusReason, otherEvent.statusReason) && Intrinsics.c(this.eventEditorName, otherEvent.eventEditorName) && Intrinsics.c(this.eventEditor, otherEvent.eventEditor) && Intrinsics.c(this.eventType, otherEvent.eventType) && Intrinsics.c(this.seasonStatisticsType, otherEvent.seasonStatisticsType) && Intrinsics.c(this.homeTeamRanking, otherEvent.homeTeamRanking) && Intrinsics.c(this.awayTeamRanking, otherEvent.awayTeamRanking) && Intrinsics.c(this.homeTeamSeasonHistoricalForm, otherEvent.homeTeamSeasonHistoricalForm) && Intrinsics.c(this.awayTeamSeasonHistoricalForm, otherEvent.awayTeamSeasonHistoricalForm) && this.crowdsourcingEnabled == otherEvent.crowdsourcingEnabled && this.crowdsourcingDataDisplayEnabled == otherEvent.crowdsourcingDataDisplayEnabled && this.crowdsourcingDataDisplayPermanent == otherEvent.crowdsourcingDataDisplayPermanent && Intrinsics.c(this.streamContentId, otherEvent.streamContentId) && Intrinsics.c(this.streamContentGeoRestrictions, otherEvent.streamContentGeoRestrictions) && Intrinsics.c(this.eventFilters, otherEvent.eventFilters);
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
    public boolean getCrowdsourcingEnabled() {
        return this.crowdsourcingEnabled;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    public int getCupMatchesInRound() {
        return this.cupMatchesInRound;
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
        int c = dmi.c(this.tournament.hashCode() * 31, 31, this.slug);
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
        int a = wv8.a(this.id, (c3 + (l == null ? 0 : l.hashCode())) * 31, 31);
        Time time = this.time;
        int hashCode8 = (a + (time == null ? 0 : time.hashCode())) * 31;
        EventChanges eventChanges = this.changes;
        int hashCode9 = (hashCode8 + (eventChanges == null ? 0 : eventChanges.hashCode())) * 31;
        Integer num4 = this.coverage;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.previousLegEventId;
        int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.parentEventId;
        int hashCode12 = (hashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str = this.lastPeriod;
        int e2 = dmi.e((hashCode12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.finalResultOnly);
        Boolean bool4 = this.isEditor;
        int e3 = dmi.e((e2 + (bool4 == null ? 0 : bool4.hashCode())) * 31, 31, this.isAwarded);
        Player player = this.manOfMatch;
        int hashCode13 = (e3 + (player == null ? 0 : player.hashCode())) * 31;
        Long l2 = this.currentPeriodStartTimestamp;
        int hashCode14 = (hashCode13 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Map<String, String> map = this.periods;
        int hashCode15 = (hashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num7 = this.defaultPeriodCount;
        int hashCode16 = (hashCode15 + (num7 == null ? 0 : num7.hashCode())) * 31;
        TimeoutsInfo timeoutsInfo = this.timeouts;
        int e4 = dmi.e((hashCode16 + (timeoutsInfo == null ? 0 : timeoutsInfo.hashCode())) * 31, 31, this.hasBet365LiveStream);
        List<String> list = this.bet365ExcludedCountryCodes;
        int a2 = wv8.a(this.cupMatchesInRound, (e4 + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str2 = this.statusReason;
        int hashCode17 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventEditorName;
        int hashCode18 = (hashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EventEditor eventEditor = this.eventEditor;
        int hashCode19 = (hashCode18 + (eventEditor == null ? 0 : eventEditor.hashCode())) * 31;
        String str4 = this.eventType;
        int hashCode20 = (hashCode19 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.seasonStatisticsType;
        int hashCode21 = (hashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num8 = this.homeTeamRanking;
        int hashCode22 = (hashCode21 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.awayTeamRanking;
        int hashCode23 = (hashCode22 + (num9 == null ? 0 : num9.hashCode())) * 31;
        TeamSeasonForm teamSeasonForm = this.homeTeamSeasonHistoricalForm;
        int hashCode24 = (hashCode23 + (teamSeasonForm == null ? 0 : teamSeasonForm.hashCode())) * 31;
        TeamSeasonForm teamSeasonForm2 = this.awayTeamSeasonHistoricalForm;
        int e5 = dmi.e(dmi.e(dmi.e((hashCode24 + (teamSeasonForm2 == null ? 0 : teamSeasonForm2.hashCode())) * 31, 31, this.crowdsourcingEnabled), 31, this.crowdsourcingDataDisplayEnabled), 31, this.crowdsourcingDataDisplayPermanent);
        Integer num10 = this.streamContentId;
        int hashCode25 = (e5 + (num10 == null ? 0 : num10.hashCode())) * 31;
        List<String> list2 = this.streamContentGeoRestrictions;
        int hashCode26 = (hashCode25 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, List<String>> map2 = this.eventFilters;
        return hashCode26 + (map2 != null ? map2.hashCode() : 0);
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
        int i = this.id;
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
        TeamSeasonForm teamSeasonForm = this.homeTeamSeasonHistoricalForm;
        TeamSeasonForm teamSeasonForm2 = this.awayTeamSeasonHistoricalForm;
        boolean z5 = this.crowdsourcingEnabled;
        boolean z6 = this.crowdsourcingDataDisplayEnabled;
        boolean z7 = this.crowdsourcingDataDisplayPermanent;
        Integer num10 = this.streamContentId;
        List<String> list2 = this.streamContentGeoRestrictions;
        Map<String, List<String>> map2 = this.eventFilters;
        StringBuilder sb = new StringBuilder("OtherEvent(tournament=");
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
        sb.append(num);
        sb.append(", aggregatedWinnerCode=");
        vxd.r(num2, num3, ", attendance=", ", venue=", sb);
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
        i.q(sb, bool, ", hasEventPlayerStatistics=", bool2, ", hasEventPlayerHeatMap=");
        sb.append(z);
        sb.append(", hasXg=");
        sb.append(bool3);
        sb.append(", customId=");
        i.n(j, str2, ", startTimestamp=", sb);
        sb.append(", endTimestamp=");
        sb.append(l);
        sb.append(", id=");
        sb.append(i);
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
        sb.append(", homeTeamSeasonHistoricalForm=");
        sb.append(teamSeasonForm);
        sb.append(", awayTeamSeasonHistoricalForm=");
        sb.append(teamSeasonForm2);
        fn0.y(", crowdsourcingEnabled=", ", crowdsourcingDataDisplayEnabled=", sb, z5, z6);
        sb.append(", crowdsourcingDataDisplayPermanent=");
        sb.append(z7);
        sb.append(", streamContentId=");
        sb.append(num10);
        sb.append(", streamContentGeoRestrictions=");
        sb.append(list2);
        sb.append(", eventFilters=");
        sb.append(map2);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/OtherEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/OtherEvent;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OtherEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OtherEvent(@NotNull Tournament tournament, @NotNull String str, @Nullable Season season, @Nullable Round round, @NotNull Status status, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Venue venue, @Nullable Referee referee, @NotNull Team team, @NotNull Team team2, @NotNull Score score, @NotNull Score score2, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z, @Nullable Boolean bool3, @NotNull String str2, long j, @Nullable Long l, int i, @Nullable Time time, @Nullable EventChanges eventChanges, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str3, boolean z2, @Nullable Boolean bool4, boolean z3, @Nullable Player player, @Nullable Long l2, @Nullable Map<String, String> map, @Nullable Integer num7, @Nullable TimeoutsInfo timeoutsInfo, boolean z4, @Nullable List<String> list, int i2, @Nullable String str4, @Nullable String str5, @Nullable EventEditor eventEditor, @Nullable String str6, @Nullable String str7, @Nullable Integer num8, @Nullable Integer num9, @Nullable TeamSeasonForm teamSeasonForm, @Nullable TeamSeasonForm teamSeasonForm2, boolean z5, boolean z6, boolean z7, @Nullable Integer num10, @Nullable List<String> list2, @Nullable Map<String, ? extends List<String>> map2) {
        super(null);
        wt3.x(tournament, str, status, team, team2);
        score.getClass();
        score2.getClass();
        str2.getClass();
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
        this.id = i;
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
        this.homeTeamSeasonHistoricalForm = teamSeasonForm;
        this.awayTeamSeasonHistoricalForm = teamSeasonForm2;
        this.crowdsourcingEnabled = z5;
        this.crowdsourcingDataDisplayEnabled = z6;
        this.crowdsourcingDataDisplayPermanent = z7;
        this.streamContentId = num10;
        this.streamContentGeoRestrictions = list2;
        this.eventFilters = map2;
    }

    public /* synthetic */ OtherEvent(Tournament tournament, String str, Season season, Round round, Status status, Integer num, Integer num2, Integer num3, Venue venue, Referee referee, Team team, Team team2, Score score, Score score2, Boolean bool, Boolean bool2, boolean z, Boolean bool3, String str2, long j, Long l, int i, Time time, EventChanges eventChanges, Integer num4, Integer num5, Integer num6, String str3, boolean z2, Boolean bool4, boolean z3, Player player, Long l2, Map map, Integer num7, TimeoutsInfo timeoutsInfo, boolean z4, List list, int i2, String str4, String str5, EventEditor eventEditor, String str6, String str7, Integer num8, Integer num9, TeamSeasonForm teamSeasonForm, TeamSeasonForm teamSeasonForm2, boolean z5, boolean z6, boolean z7, Integer num10, List list2, Map map2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(tournament, str, season, round, status, num, num2, num3, venue, referee, team, team2, score, score2, bool, bool2, (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z, bool3, str2, j, l, i, time, eventChanges, num4, num5, num6, str3, z2, bool4, (i3 & 1073741824) != 0 ? false : z3, player, l2, map, num7, timeoutsInfo, (i4 & 16) != 0 ? false : z4, list, (i4 & 64) != 0 ? 0 : i2, str4, str5, eventEditor, str6, str7, num8, num9, teamSeasonForm, teamSeasonForm2, (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z5, (i4 & 131072) != 0 ? false : z6, (i4 & 262144) != 0 ? false : z7, num10, list2, map2);
    }
}
