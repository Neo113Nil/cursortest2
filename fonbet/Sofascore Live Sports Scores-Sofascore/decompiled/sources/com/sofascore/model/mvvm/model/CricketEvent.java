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
import defpackage.joa;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.me4;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.t63;
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
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b`\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b`\b\u0087\b\u0018\u0000 ¤\u00022\u00020\u0001:\u0004¥\u0002¤\u0002B«\u0005\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\"\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\f\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\f\u0012\b\u0010)\u001a\u0004\u0018\u00010\f\u0012\b\u0010*\u001a\u0004\u0018\u00010\f\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010,\u001a\u00020\u001a\u0012\b\u0010-\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010.\u001a\u00020\u001a\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00101\u001a\u0004\u0018\u00010 \u0012\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000102\u0012\b\u00104\u001a\u0004\u0018\u00010\f\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00107\u001a\u00020\u001a\u0012\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108\u0012\b\b\u0002\u0010:\u001a\u00020\f\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010A\u001a\u0004\u0018\u00010\f\u0012\b\u0010B\u001a\u0004\u0018\u00010\f\u0012\b\u0010D\u001a\u0004\u0018\u00010C\u0012\b\u0010E\u001a\u0004\u0018\u00010C\u0012\b\b\u0002\u0010F\u001a\u00020\u001a\u0012\b\b\u0002\u0010G\u001a\u00020\u001a\u0012\b\b\u0002\u0010H\u001a\u00020\u001a\u0012\b\u0010I\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108\u0012\u001a\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0018\u000102\u0012\b\u0010L\u001a\u0004\u0018\u00010\f\u0012\b\u0010M\u001a\u0004\u0018\u00010\f\u0012\b\u0010N\u001a\u0004\u0018\u00010\f\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010R\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010T\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108¢\u0006\u0004\bW\u0010XBÑ\u0005\b\u0010\u0012\u0006\u0010Y\u001a\u00020\f\u0012\u0006\u0010Z\u001a\u00020\f\u0012\u0006\u0010[\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\"\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\f\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\f\u0012\b\u0010)\u001a\u0004\u0018\u00010\f\u0012\b\u0010*\u001a\u0004\u0018\u00010\f\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010,\u001a\u00020\u001a\u0012\b\u0010-\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010.\u001a\u00020\u001a\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00101\u001a\u0004\u0018\u00010 \u0012\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000102\u0012\b\u00104\u001a\u0004\u0018\u00010\f\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\u0006\u00107\u001a\u00020\u001a\u0012\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108\u0012\u0006\u0010:\u001a\u00020\f\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010A\u001a\u0004\u0018\u00010\f\u0012\b\u0010B\u001a\u0004\u0018\u00010\f\u0012\b\u0010D\u001a\u0004\u0018\u00010C\u0012\b\u0010E\u001a\u0004\u0018\u00010C\u0012\u0006\u0010F\u001a\u00020\u001a\u0012\u0006\u0010G\u001a\u00020\u001a\u0012\u0006\u0010H\u001a\u00020\u001a\u0012\b\u0010I\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108\u0012\u001a\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0018\u000102\u0012\b\u0010L\u001a\u0004\u0018\u00010\f\u0012\b\u0010M\u001a\u0004\u0018\u00010\f\u0012\b\u0010N\u001a\u0004\u0018\u00010\f\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010R\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010T\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108\u0012\b\u0010]\u001a\u0004\u0018\u00010\\¢\u0006\u0004\bW\u0010^J\u000f\u0010_\u001a\u00020\u0001H\u0016¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0012\u0010e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0012\u0010g\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0012\u0010k\u001a\u0004\u0018\u00010\fHÄ\u0003¢\u0006\u0004\bk\u0010lJ\u0012\u0010m\u001a\u0004\u0018\u00010\fHÄ\u0003¢\u0006\u0004\bm\u0010lJ\u0012\u0010n\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bn\u0010lJ\u0012\u0010o\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bo\u0010pJ\u0012\u0010q\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bq\u0010rJ\u0010\u0010s\u001a\u00020\u0014HÄ\u0003¢\u0006\u0004\bs\u0010tJ\u0010\u0010u\u001a\u00020\u0014HÄ\u0003¢\u0006\u0004\bu\u0010tJ\u0010\u0010v\u001a\u00020\u0017HÄ\u0003¢\u0006\u0004\bv\u0010wJ\u0010\u0010x\u001a\u00020\u0017HÄ\u0003¢\u0006\u0004\bx\u0010wJ\u0012\u0010y\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\by\u0010zJ\u0012\u0010{\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b{\u0010zJ\u0010\u0010|\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b|\u0010}J\u0012\u0010~\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b~\u0010zJ\u0010\u0010\u007f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u007f\u0010dJ\u0013\u0010\u0080\u0001\u001a\u00020 HÆ\u0003¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0013\u0010\u0084\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b\u008a\u0001\u0010lJ\u0014\u0010\u008b\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b\u008b\u0001\u0010lJ\u0014\u0010\u008c\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b\u008c\u0001\u0010lJ\u0014\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u008d\u0001\u0010dJ\u0012\u0010\u008e\u0001\u001a\u00020\u001aHÆ\u0003¢\u0006\u0005\b\u008e\u0001\u0010}J\u0014\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0005\b\u008f\u0001\u0010zJ\u0012\u0010\u0090\u0001\u001a\u00020\u001aHÆ\u0003¢\u0006\u0005\b\u0090\u0001\u0010}J\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0006\b\u0093\u0001\u0010\u0083\u0001J!\u0010\u0094\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000102HÆ\u0003¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0014\u0010\u0096\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b\u0096\u0001\u0010lJ\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u000105HÆ\u0003¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0012\u0010\u0099\u0001\u001a\u00020\u001aHÆ\u0003¢\u0006\u0005\b\u0099\u0001\u0010}J\u001b\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108HÆ\u0003¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0013\u0010\u009c\u0001\u001a\u00020\fHÆ\u0003¢\u0006\u0006\b\u009c\u0001\u0010\u0085\u0001J\u0014\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u009d\u0001\u0010dJ\u0014\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u009e\u0001\u0010dJ\u0015\u0010\u009f\u0001\u001a\u0004\u0018\u00010=HÆ\u0003¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0014\u0010¡\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b¡\u0001\u0010dJ\u0014\u0010¢\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b¢\u0001\u0010dJ\u0014\u0010£\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b£\u0001\u0010lJ\u0014\u0010¤\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b¤\u0001\u0010lJ\u0015\u0010¥\u0001\u001a\u0004\u0018\u00010CHÄ\u0003¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0015\u0010§\u0001\u001a\u0004\u0018\u00010CHÄ\u0003¢\u0006\u0006\b§\u0001\u0010¦\u0001J\u0012\u0010¨\u0001\u001a\u00020\u001aHÆ\u0003¢\u0006\u0005\b¨\u0001\u0010}J\u0012\u0010©\u0001\u001a\u00020\u001aHÆ\u0003¢\u0006\u0005\b©\u0001\u0010}J\u0012\u0010ª\u0001\u001a\u00020\u001aHÆ\u0003¢\u0006\u0005\bª\u0001\u0010}J\u0014\u0010«\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b«\u0001\u0010lJ\u001b\u0010¬\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108HÆ\u0003¢\u0006\u0006\b¬\u0001\u0010\u009b\u0001J'\u0010\u00ad\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0018\u000102HÆ\u0003¢\u0006\u0006\b\u00ad\u0001\u0010\u0095\u0001J\u0014\u0010®\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b®\u0001\u0010lJ\u0014\u0010¯\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b¯\u0001\u0010lJ\u0014\u0010°\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b°\u0001\u0010lJ\u0014\u0010±\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b±\u0001\u0010dJ\u0014\u0010²\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b²\u0001\u0010dJ\u0014\u0010³\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b³\u0001\u0010dJ\u0014\u0010´\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b´\u0001\u0010dJ\u0014\u0010µ\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\bµ\u0001\u0010dJ\u0014\u0010¶\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b¶\u0001\u0010dJ\u0014\u0010·\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b·\u0001\u0010dJ\u001b\u0010¸\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108HÆ\u0003¢\u0006\u0006\b¸\u0001\u0010\u009b\u0001J«\u0006\u0010¹\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010,\u001a\u00020\u001a2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010.\u001a\u00020\u001a2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010 2\u0016\b\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u00107\u001a\u00020\u001a2\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001082\b\b\u0002\u0010:\u001a\u00020\f2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010F\u001a\u00020\u001a2\b\b\u0002\u0010G\u001a\u00020\u001a2\b\b\u0002\u0010H\u001a\u00020\u001a2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001082\u001c\b\u0002\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0018\u0001022\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000108HÆ\u0001¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0012\u0010»\u0001\u001a\u00020\u0004HÖ\u0001¢\u0006\u0005\b»\u0001\u0010dJ\u0013\u0010¼\u0001\u001a\u00020\fHÖ\u0001¢\u0006\u0006\b¼\u0001\u0010\u0085\u0001J\u001f\u0010¿\u0001\u001a\u00020\u001a2\n\u0010¾\u0001\u001a\u0005\u0018\u00010½\u0001HÖ\u0003¢\u0006\u0006\b¿\u0001\u0010À\u0001J0\u0010É\u0001\u001a\u00030Æ\u00012\u0007\u0010Á\u0001\u001a\u00020\u00002\b\u0010Ã\u0001\u001a\u00030Â\u00012\b\u0010Å\u0001\u001a\u00030Ä\u0001H\u0001¢\u0006\u0006\bÇ\u0001\u0010È\u0001R\u001c\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010Ê\u0001\u001a\u0005\bË\u0001\u0010bR\u001c\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010Ì\u0001\u001a\u0005\bÍ\u0001\u0010dR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010Î\u0001\u001a\u0005\bÏ\u0001\u0010fR(\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b\t\u0010Ð\u0001\u001a\u0005\bÑ\u0001\u0010h\"\u0006\bÒ\u0001\u0010Ó\u0001R\u001c\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010Ô\u0001\u001a\u0005\bÕ\u0001\u0010jR\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\r\u0010Ö\u0001\u001a\u0005\b×\u0001\u0010lR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010Ö\u0001\u001a\u0005\bØ\u0001\u0010lR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010Ö\u0001\u001a\u0005\bÙ\u0001\u0010lR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010Ú\u0001\u001a\u0005\bÛ\u0001\u0010pR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010Ü\u0001\u001a\u0005\bÝ\u0001\u0010rR\u001c\u0010\u0015\u001a\u00020\u00148\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010Þ\u0001\u001a\u0005\bß\u0001\u0010tR\u001c\u0010\u0016\u001a\u00020\u00148\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010Þ\u0001\u001a\u0005\bà\u0001\u0010tR\u001c\u0010\u0018\u001a\u00020\u00178\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010á\u0001\u001a\u0005\bâ\u0001\u0010wR\u001c\u0010\u0019\u001a\u00020\u00178\u0014X\u0094\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010á\u0001\u001a\u0005\bã\u0001\u0010wR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010ä\u0001\u001a\u0005\bå\u0001\u0010zR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010ä\u0001\u001a\u0005\bæ\u0001\u0010zR\u001c\u0010\u001d\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010ç\u0001\u001a\u0005\bè\u0001\u0010}R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010ä\u0001\u001a\u0005\bé\u0001\u0010zR\u001c\u0010\u001f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010Ì\u0001\u001a\u0005\bê\u0001\u0010dR\u001d\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b!\u0010ë\u0001\u001a\u0006\bì\u0001\u0010\u0081\u0001R\u001f\u0010\"\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\"\u0010í\u0001\u001a\u0006\bî\u0001\u0010\u0083\u0001R\u001d\u0010#\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b#\u0010ï\u0001\u001a\u0006\bð\u0001\u0010\u0085\u0001R\u001f\u0010%\u001a\u0004\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b%\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010\u0087\u0001R)\u0010'\u001a\u0004\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b'\u0010ó\u0001\u001a\u0006\bô\u0001\u0010\u0089\u0001\"\u0006\bõ\u0001\u0010ö\u0001R\u001e\u0010(\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b(\u0010Ö\u0001\u001a\u0005\b÷\u0001\u0010lR\u001e\u0010)\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b)\u0010Ö\u0001\u001a\u0005\bø\u0001\u0010lR\u001e\u0010*\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b*\u0010Ö\u0001\u001a\u0005\bù\u0001\u0010lR\u001e\u0010+\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b+\u0010Ì\u0001\u001a\u0005\bú\u0001\u0010dR\u001c\u0010,\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b,\u0010ç\u0001\u001a\u0005\bû\u0001\u0010}R\u001d\u0010-\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b-\u0010ä\u0001\u001a\u0004\b-\u0010zR\u001b\u0010.\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b.\u0010ç\u0001\u001a\u0004\b.\u0010}R\u001f\u00100\u001a\u0004\u0018\u00010/8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b0\u0010ü\u0001\u001a\u0006\bý\u0001\u0010\u0092\u0001R\u001f\u00101\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b1\u0010í\u0001\u001a\u0006\bþ\u0001\u0010\u0083\u0001R+\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b3\u0010ÿ\u0001\u001a\u0006\b\u0080\u0002\u0010\u0095\u0001R\u001e\u00104\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b4\u0010Ö\u0001\u001a\u0005\b\u0081\u0002\u0010lR\u001f\u00106\u001a\u0004\u0018\u0001058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b6\u0010\u0082\u0002\u001a\u0006\b\u0083\u0002\u0010\u0098\u0001R\u001c\u00107\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b7\u0010ç\u0001\u001a\u0005\b\u0084\u0002\u0010}R%\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001088\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b9\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u009b\u0001R\u001d\u0010:\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b:\u0010ï\u0001\u001a\u0006\b\u0087\u0002\u0010\u0085\u0001R\u001e\u0010;\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b;\u0010Ì\u0001\u001a\u0005\b\u0088\u0002\u0010dR\u001e\u0010<\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b<\u0010Ì\u0001\u001a\u0005\b\u0089\u0002\u0010dR\u001f\u0010>\u001a\u0004\u0018\u00010=8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b>\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010 \u0001R\u001e\u0010?\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b?\u0010Ì\u0001\u001a\u0005\b\u008c\u0002\u0010dR\u001e\u0010@\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b@\u0010Ì\u0001\u001a\u0005\b\u008d\u0002\u0010dR\u001e\u0010A\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bA\u0010Ö\u0001\u001a\u0005\b\u008e\u0002\u0010lR\u001e\u0010B\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bB\u0010Ö\u0001\u001a\u0005\b\u008f\u0002\u0010lR\u001f\u0010D\u001a\u0004\u0018\u00010C8\u0014X\u0094\u0004¢\u0006\u000f\n\u0005\bD\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010¦\u0001R\u001f\u0010E\u001a\u0004\u0018\u00010C8\u0014X\u0094\u0004¢\u0006\u000f\n\u0005\bE\u0010\u0090\u0002\u001a\u0006\b\u0092\u0002\u0010¦\u0001R\u001c\u0010F\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bF\u0010ç\u0001\u001a\u0005\b\u0093\u0002\u0010}R\u001c\u0010G\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bG\u0010ç\u0001\u001a\u0005\b\u0094\u0002\u0010}R\u001c\u0010H\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bH\u0010ç\u0001\u001a\u0005\b\u0095\u0002\u0010}R\u001e\u0010I\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bI\u0010Ö\u0001\u001a\u0005\b\u0096\u0002\u0010lR%\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001088\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bJ\u0010\u0085\u0002\u001a\u0006\b\u0097\u0002\u0010\u009b\u0001R1\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000408\u0018\u0001028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bK\u0010ÿ\u0001\u001a\u0006\b\u0098\u0002\u0010\u0095\u0001R\u001b\u0010L\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\bL\u0010Ö\u0001\u001a\u0005\b\u0099\u0002\u0010lR\u001b\u0010M\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\bM\u0010Ö\u0001\u001a\u0005\b\u009a\u0002\u0010lR\u001b\u0010N\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\bN\u0010Ö\u0001\u001a\u0005\b\u009b\u0002\u0010lR\u001b\u0010O\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\bO\u0010Ì\u0001\u001a\u0005\b\u009c\u0002\u0010dR\u001b\u0010P\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\bP\u0010Ì\u0001\u001a\u0005\b\u009d\u0002\u0010dR\u001b\u0010Q\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\bQ\u0010Ì\u0001\u001a\u0005\b\u009e\u0002\u0010dR\u001b\u0010R\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\bR\u0010Ì\u0001\u001a\u0005\b\u009f\u0002\u0010dR\u001b\u0010S\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\bS\u0010Ì\u0001\u001a\u0005\b \u0002\u0010dR\u001b\u0010T\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\bT\u0010Ì\u0001\u001a\u0005\b¡\u0002\u0010dR\u001b\u0010U\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\bU\u0010Ì\u0001\u001a\u0005\b¢\u0002\u0010dR\"\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001088\u0006¢\u0006\u000f\n\u0005\bV\u0010\u0085\u0002\u001a\u0006\b£\u0002\u0010\u009b\u0001¨\u0006¦\u0002"}, d2 = {"Lcom/sofascore/model/mvvm/model/CricketEvent;", "Lcom/sofascore/model/mvvm/model/Event;", "Lcom/sofascore/model/mvvm/model/Tournament;", "tournament", "", "slug", "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "Lcom/sofascore/model/mvvm/model/Round;", "roundInfo", "Lcom/sofascore/model/mvvm/model/Status;", "status", "", "winnerCode", "aggregatedWinnerCode", "attendance", "Lcom/sofascore/model/mvvm/model/Venue;", "venue", "Lcom/sofascore/model/mvvm/model/Referee;", SearchResponseKt.REFEREE_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "homeTeam", "awayTeam", "Lcom/sofascore/model/mvvm/model/Score;", "homeScore", "awayScore", "", "hasGlobalHighlights", "hasEventPlayerStatistics", "hasEventPlayerHeatMap", "hasXg", "customId", "", "startTimestamp", "endTimestamp", "id", "Lcom/sofascore/model/mvvm/model/Time;", "time", "Lcom/sofascore/model/mvvm/model/EventChanges;", "changes", "coverage", "previousLegEventId", "parentEventId", "lastPeriod", "finalResultOnly", "isEditor", "isAwarded", "Lcom/sofascore/model/mvvm/model/Player;", "manOfMatch", "currentPeriodStartTimestamp", "", "periods", "defaultPeriodCount", "Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "timeouts", "hasBet365LiveStream", "", "bet365ExcludedCountryCodes", "cupMatchesInRound", "statusReason", "eventEditorName", "Lcom/sofascore/model/mvvm/model/EventEditor;", "eventEditor", "eventType", "seasonStatisticsType", "homeTeamRanking", "awayTeamRanking", "Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "homeTeamSeasonHistoricalForm", "awayTeamSeasonHistoricalForm", "crowdsourcingEnabled", "crowdsourcingDataDisplayEnabled", "crowdsourcingDataDisplayPermanent", "streamContentId", "streamContentGeoRestrictions", "eventFilters", "currentBattingTeamId", "currentBatsmanId", "currentBowlerId", "refereeName", "umpire1Name", "umpire2Name", "tvUmpireName", "note", "tossWin", "tossDecision", "cricketBallProperties", "<init>", "(Lcom/sofascore/model/mvvm/model/Tournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Round;Lcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Venue;Lcom/sofascore/model/mvvm/model/Referee;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;JLjava/lang/Long;ILcom/sofascore/model/mvvm/model/Time;Lcom/sofascore/model/mvvm/model/EventChanges;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/sofascore/model/mvvm/model/Player;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TimeoutsInfo;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/EventEditor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;ZZZLjava/lang/Integer;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "seen1", "seen2", "Lt5h;", "serializationConstructorMarker", "(IIILcom/sofascore/model/mvvm/model/Tournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Round;Lcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Venue;Lcom/sofascore/model/mvvm/model/Referee;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;JLjava/lang/Long;ILcom/sofascore/model/mvvm/model/Time;Lcom/sofascore/model/mvvm/model/EventChanges;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/sofascore/model/mvvm/model/Player;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TimeoutsInfo;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/EventEditor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;ZZZLjava/lang/Integer;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lt5h;)V", "copyEvent", "()Lcom/sofascore/model/mvvm/model/Event;", "component1", "()Lcom/sofascore/model/mvvm/model/Tournament;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/sofascore/model/mvvm/model/Season;", "component4", "()Lcom/sofascore/model/mvvm/model/Round;", "component5", "()Lcom/sofascore/model/mvvm/model/Status;", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "()Lcom/sofascore/model/mvvm/model/Venue;", "component10", "()Lcom/sofascore/model/mvvm/model/Referee;", "component11", "()Lcom/sofascore/model/mvvm/model/Team;", "component12", "component13", "()Lcom/sofascore/model/mvvm/model/Score;", "component14", "component15", "()Ljava/lang/Boolean;", "component16", "component17", "()Z", "component18", "component19", "component20", "()J", "component21", "()Ljava/lang/Long;", "component22", "()I", "component23", "()Lcom/sofascore/model/mvvm/model/Time;", "component24", "()Lcom/sofascore/model/mvvm/model/EventChanges;", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "()Lcom/sofascore/model/mvvm/model/Player;", "component33", "component34", "()Ljava/util/Map;", "component35", "component36", "()Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "component37", "component38", "()Ljava/util/List;", "component39", "component40", "component41", "component42", "()Lcom/sofascore/model/mvvm/model/EventEditor;", "component43", "component44", "component45", "component46", "component47", "()Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "copy", "(Lcom/sofascore/model/mvvm/model/Tournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Round;Lcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Venue;Lcom/sofascore/model/mvvm/model/Referee;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;JLjava/lang/Long;ILcom/sofascore/model/mvvm/model/Time;Lcom/sofascore/model/mvvm/model/EventChanges;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/sofascore/model/mvvm/model/Player;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TimeoutsInfo;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/EventEditor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;Lcom/sofascore/model/mvvm/model/TeamSeasonForm;ZZZLjava/lang/Integer;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sofascore/model/mvvm/model/CricketEvent;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/CricketEvent;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/Tournament;", "getTournament", "Ljava/lang/String;", "getSlug", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "Lcom/sofascore/model/mvvm/model/Round;", "getRoundInfo", "setRoundInfo", "(Lcom/sofascore/model/mvvm/model/Round;)V", "Lcom/sofascore/model/mvvm/model/Status;", "getStatus", "Ljava/lang/Integer;", "getWinnerCode", "getAggregatedWinnerCode", "getAttendance", "Lcom/sofascore/model/mvvm/model/Venue;", "getVenue", "Lcom/sofascore/model/mvvm/model/Referee;", "getReferee", "Lcom/sofascore/model/mvvm/model/Team;", "getHomeTeam", "getAwayTeam", "Lcom/sofascore/model/mvvm/model/Score;", "getHomeScore", "getAwayScore", "Ljava/lang/Boolean;", "getHasGlobalHighlights", "getHasEventPlayerStatistics", "Z", "getHasEventPlayerHeatMap", "getHasXg", "getCustomId", "J", "getStartTimestamp", "Ljava/lang/Long;", "getEndTimestamp", "I", "getId", "Lcom/sofascore/model/mvvm/model/Time;", "getTime", "Lcom/sofascore/model/mvvm/model/EventChanges;", "getChanges", "setChanges", "(Lcom/sofascore/model/mvvm/model/EventChanges;)V", "getCoverage", "getPreviousLegEventId", "getParentEventId", "getLastPeriod", "getFinalResultOnly", "Lcom/sofascore/model/mvvm/model/Player;", "getManOfMatch", "getCurrentPeriodStartTimestamp", "Ljava/util/Map;", "getPeriods", "getDefaultPeriodCount", "Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "getTimeouts", "getHasBet365LiveStream", "Ljava/util/List;", "getBet365ExcludedCountryCodes", "getCupMatchesInRound", "getStatusReason", "getEventEditorName", "Lcom/sofascore/model/mvvm/model/EventEditor;", "getEventEditor", "getEventType", "getSeasonStatisticsType", "getHomeTeamRanking", "getAwayTeamRanking", "Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "getHomeTeamSeasonHistoricalForm", "getAwayTeamSeasonHistoricalForm", "getCrowdsourcingEnabled", "getCrowdsourcingDataDisplayEnabled", "getCrowdsourcingDataDisplayPermanent", "getStreamContentId", "getStreamContentGeoRestrictions", "getEventFilters", "getCurrentBattingTeamId", "getCurrentBatsmanId", "getCurrentBowlerId", "getRefereeName", "getUmpire1Name", "getUmpire2Name", "getTvUmpireName", "getNote", "getTossWin", "getTossDecision", "getCricketBallProperties", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CricketEvent extends Event {

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

    @Nullable
    private final List<String> cricketBallProperties;
    private final boolean crowdsourcingDataDisplayEnabled;
    private final boolean crowdsourcingDataDisplayPermanent;
    private final boolean crowdsourcingEnabled;
    private final int cupMatchesInRound;

    @Nullable
    private final Integer currentBatsmanId;

    @Nullable
    private final Integer currentBattingTeamId;

    @Nullable
    private final Integer currentBowlerId;

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
    private final String note;

    @Nullable
    private final Integer parentEventId;

    @Nullable
    private final Map<String, String> periods;

    @Nullable
    private final Integer previousLegEventId;

    @Nullable
    private final Referee referee;

    @Nullable
    private final String refereeName;

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

    @Nullable
    private final String tossDecision;

    @Nullable
    private final String tossWin;

    @NotNull
    private final Tournament tournament;

    @Nullable
    private final String tvUmpireName;

    @Nullable
    private final String umpire1Name;

    @Nullable
    private final String umpire2Name;

    @Nullable
    private final Venue venue;

    @Nullable
    private final Integer winnerCode;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new t63(21)), ypa.a(ysaVar, new t63(22)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new t63(23)), null, null, null, ypa.a(ysaVar, new t63(24)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new t63(25)), ypa.a(ysaVar, new t63(26)), null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new t63(27))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CricketEvent(int i, int i2, int i3, Tournament tournament, String str, Season season, Round round, Status status, Integer num, Integer num2, Integer num3, Venue venue, Referee referee, Team team, Team team2, Score score, Score score2, Boolean bool, Boolean bool2, boolean z, Boolean bool3, String str2, long j, Long l, int i4, Time time, EventChanges eventChanges, Integer num4, Integer num5, Integer num6, String str3, boolean z2, Boolean bool4, boolean z3, Player player, Long l2, Map map, Integer num7, TimeoutsInfo timeoutsInfo, boolean z4, List list, int i5, String str4, String str5, EventEditor eventEditor, String str6, String str7, Integer num8, Integer num9, TeamSeasonForm teamSeasonForm, TeamSeasonForm teamSeasonForm2, boolean z5, boolean z6, boolean z7, Integer num10, List list2, Map map2, Integer num11, Integer num12, Integer num13, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list3, t5h t5hVar) {
        super(r5);
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (((-1073807361 != (i & (-1073807361))) | (-458833 != (i2 & (-458833)))) || (1 != (i3 & 1))) {
            oea.y(new int[]{i, i2, i3}, new int[]{-1073807361, -458833, 1}, CricketEvent$$serializer.INSTANCE.getDescriptor());
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
        this.id = i4;
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
            this.cupMatchesInRound = i5;
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
        this.currentBattingTeamId = num11;
        this.currentBatsmanId = num12;
        this.currentBowlerId = num13;
        this.refereeName = str8;
        this.umpire1Name = str9;
        this.umpire2Name = str10;
        this.tvUmpireName = str11;
        this.note = str12;
        this.tossWin = str13;
        this.tossDecision = str14;
        this.cricketBallProperties = list3;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(uhi.a, 0);
    }

    public static /* synthetic */ CricketEvent copy$default(CricketEvent cricketEvent, Tournament tournament, String str, Season season, Round round, Status status, Integer num, Integer num2, Integer num3, Venue venue, Referee referee, Team team, Team team2, Score score, Score score2, Boolean bool, Boolean bool2, boolean z, Boolean bool3, String str2, long j, Long l, int i, Time time, EventChanges eventChanges, Integer num4, Integer num5, Integer num6, String str3, boolean z2, Boolean bool4, boolean z3, Player player, Long l2, Map map, Integer num7, TimeoutsInfo timeoutsInfo, boolean z4, List list, int i2, String str4, String str5, EventEditor eventEditor, String str6, String str7, Integer num8, Integer num9, TeamSeasonForm teamSeasonForm, TeamSeasonForm teamSeasonForm2, boolean z5, boolean z6, boolean z7, Integer num10, List list2, Map map2, Integer num11, Integer num12, Integer num13, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list3, int i3, int i4, int i5, Object obj) {
        List list4;
        String str15;
        TeamSeasonForm teamSeasonForm3;
        boolean z8;
        boolean z9;
        boolean z10;
        Integer num14;
        List list5;
        Map map3;
        Integer num15;
        Integer num16;
        Integer num17;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        Long l3;
        Map map4;
        Integer num18;
        TimeoutsInfo timeoutsInfo2;
        boolean z11;
        List list6;
        int i6;
        String str22;
        String str23;
        EventEditor eventEditor2;
        String str24;
        String str25;
        Integer num19;
        Integer num20;
        TeamSeasonForm teamSeasonForm4;
        long j2;
        String str26;
        Long l4;
        int i7;
        Time time2;
        EventChanges eventChanges2;
        Integer num21;
        Integer num22;
        Integer num23;
        String str27;
        boolean z12;
        Boolean bool5;
        boolean z13;
        Player player2;
        Integer num24;
        Integer num25;
        Integer num26;
        Venue venue2;
        Referee referee2;
        Team team3;
        Team team4;
        Score score3;
        Score score4;
        Boolean bool6;
        boolean z14;
        Boolean bool7;
        Boolean bool8;
        String str28;
        Season season2;
        Round round2;
        Status status2;
        Tournament tournament2 = (i3 & 1) != 0 ? cricketEvent.tournament : tournament;
        String str29 = (i3 & 2) != 0 ? cricketEvent.slug : str;
        Season season3 = (i3 & 4) != 0 ? cricketEvent.season : season;
        Round round3 = (i3 & 8) != 0 ? cricketEvent.roundInfo : round;
        Status status3 = (i3 & 16) != 0 ? cricketEvent.status : status;
        Integer num27 = (i3 & 32) != 0 ? cricketEvent.winnerCode : num;
        Integer num28 = (i3 & 64) != 0 ? cricketEvent.aggregatedWinnerCode : num2;
        Integer num29 = (i3 & 128) != 0 ? cricketEvent.attendance : num3;
        Venue venue3 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cricketEvent.venue : venue;
        Referee referee3 = (i3 & 512) != 0 ? cricketEvent.referee : referee;
        Team team5 = (i3 & 1024) != 0 ? cricketEvent.homeTeam : team;
        Team team6 = (i3 & a.o) != 0 ? cricketEvent.awayTeam : team2;
        Score score5 = (i3 & 4096) != 0 ? cricketEvent.homeScore : score;
        Tournament tournament3 = tournament2;
        Score score6 = (i3 & 8192) != 0 ? cricketEvent.awayScore : score2;
        Boolean bool9 = (i3 & 16384) != 0 ? cricketEvent.hasGlobalHighlights : bool;
        Boolean bool10 = (i3 & 32768) != 0 ? cricketEvent.hasEventPlayerStatistics : bool2;
        boolean z15 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? cricketEvent.hasEventPlayerHeatMap : z;
        Boolean bool11 = (i3 & 131072) != 0 ? cricketEvent.hasXg : bool3;
        String str30 = (i3 & 262144) != 0 ? cricketEvent.customId : str2;
        Boolean bool12 = bool9;
        String str31 = str29;
        long j3 = (i3 & 524288) != 0 ? cricketEvent.startTimestamp : j;
        String str32 = str30;
        Long l5 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? cricketEvent.endTimestamp : l;
        int i8 = (i3 & 2097152) != 0 ? cricketEvent.id : i;
        Time time3 = (i3 & 4194304) != 0 ? cricketEvent.time : time;
        EventChanges eventChanges3 = (i3 & 8388608) != 0 ? cricketEvent.changes : eventChanges;
        Integer num30 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? cricketEvent.coverage : num4;
        Integer num31 = (i3 & 33554432) != 0 ? cricketEvent.previousLegEventId : num5;
        Integer num32 = (i3 & 67108864) != 0 ? cricketEvent.parentEventId : num6;
        String str33 = (i3 & 134217728) != 0 ? cricketEvent.lastPeriod : str3;
        boolean z16 = (i3 & 268435456) != 0 ? cricketEvent.finalResultOnly : z2;
        Boolean bool13 = (i3 & 536870912) != 0 ? cricketEvent.isEditor : bool4;
        boolean z17 = (i3 & 1073741824) != 0 ? cricketEvent.isAwarded : z3;
        Player player3 = (i3 & Integer.MIN_VALUE) != 0 ? cricketEvent.manOfMatch : player;
        Long l6 = (i4 & 1) != 0 ? cricketEvent.currentPeriodStartTimestamp : l2;
        Map map5 = (i4 & 2) != 0 ? cricketEvent.periods : map;
        Integer num33 = (i4 & 4) != 0 ? cricketEvent.defaultPeriodCount : num7;
        TimeoutsInfo timeoutsInfo3 = (i4 & 8) != 0 ? cricketEvent.timeouts : timeoutsInfo;
        boolean z18 = (i4 & 16) != 0 ? cricketEvent.hasBet365LiveStream : z4;
        List list7 = (i4 & 32) != 0 ? cricketEvent.bet365ExcludedCountryCodes : list;
        int i9 = (i4 & 64) != 0 ? cricketEvent.cupMatchesInRound : i2;
        String str34 = (i4 & 128) != 0 ? cricketEvent.statusReason : str4;
        String str35 = (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cricketEvent.eventEditorName : str5;
        EventEditor eventEditor3 = (i4 & 512) != 0 ? cricketEvent.eventEditor : eventEditor;
        String str36 = (i4 & 1024) != 0 ? cricketEvent.eventType : str6;
        String str37 = (i4 & a.o) != 0 ? cricketEvent.seasonStatisticsType : str7;
        Integer num34 = (i4 & 4096) != 0 ? cricketEvent.homeTeamRanking : num8;
        Integer num35 = (i4 & 8192) != 0 ? cricketEvent.awayTeamRanking : num9;
        TeamSeasonForm teamSeasonForm5 = (i4 & 16384) != 0 ? cricketEvent.homeTeamSeasonHistoricalForm : teamSeasonForm;
        TeamSeasonForm teamSeasonForm6 = (i4 & 32768) != 0 ? cricketEvent.awayTeamSeasonHistoricalForm : teamSeasonForm2;
        boolean z19 = (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? cricketEvent.crowdsourcingEnabled : z5;
        boolean z20 = (i4 & 131072) != 0 ? cricketEvent.crowdsourcingDataDisplayEnabled : z6;
        boolean z21 = (i4 & 262144) != 0 ? cricketEvent.crowdsourcingDataDisplayPermanent : z7;
        Integer num36 = (i4 & 524288) != 0 ? cricketEvent.streamContentId : num10;
        List list8 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? cricketEvent.streamContentGeoRestrictions : list2;
        Map map6 = (i4 & 2097152) != 0 ? cricketEvent.eventFilters : map2;
        Integer num37 = (i4 & 4194304) != 0 ? cricketEvent.currentBattingTeamId : num11;
        Integer num38 = (i4 & 8388608) != 0 ? cricketEvent.currentBatsmanId : num12;
        Integer num39 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? cricketEvent.currentBowlerId : num13;
        String str38 = (i4 & 33554432) != 0 ? cricketEvent.refereeName : str8;
        String str39 = (i4 & 67108864) != 0 ? cricketEvent.umpire1Name : str9;
        String str40 = (i4 & 134217728) != 0 ? cricketEvent.umpire2Name : str10;
        String str41 = (i4 & 268435456) != 0 ? cricketEvent.tvUmpireName : str11;
        String str42 = (i4 & 536870912) != 0 ? cricketEvent.note : str12;
        String str43 = (i4 & 1073741824) != 0 ? cricketEvent.tossWin : str13;
        String str44 = (i4 & Integer.MIN_VALUE) != 0 ? cricketEvent.tossDecision : str14;
        if ((i5 & 1) != 0) {
            str15 = str43;
            list4 = cricketEvent.cricketBallProperties;
            z8 = z19;
            z9 = z20;
            z10 = z21;
            num14 = num36;
            list5 = list8;
            map3 = map6;
            num15 = num37;
            num16 = num38;
            num17 = num39;
            str16 = str38;
            str17 = str39;
            str18 = str40;
            str19 = str41;
            str20 = str42;
            str21 = str44;
            map4 = map5;
            num18 = num33;
            timeoutsInfo2 = timeoutsInfo3;
            z11 = z18;
            list6 = list7;
            i6 = i9;
            str22 = str34;
            str23 = str35;
            eventEditor2 = eventEditor3;
            str24 = str36;
            str25 = str37;
            num19 = num34;
            num20 = num35;
            teamSeasonForm4 = teamSeasonForm5;
            teamSeasonForm3 = teamSeasonForm6;
            j2 = j3;
            l4 = l5;
            i7 = i8;
            time2 = time3;
            eventChanges2 = eventChanges3;
            num21 = num30;
            num22 = num31;
            num23 = num32;
            str27 = str33;
            z12 = z16;
            bool5 = bool13;
            z13 = z17;
            player2 = player3;
            l3 = l6;
            num25 = num28;
            num26 = num29;
            venue2 = venue3;
            referee2 = referee3;
            team3 = team5;
            team4 = team6;
            score3 = score5;
            score4 = score6;
            bool6 = bool10;
            z14 = z15;
            bool7 = bool11;
            bool8 = bool12;
            str26 = str32;
            str28 = str31;
            season2 = season3;
            round2 = round3;
            status2 = status3;
            num24 = num27;
        } else {
            list4 = list3;
            str15 = str43;
            teamSeasonForm3 = teamSeasonForm6;
            z8 = z19;
            z9 = z20;
            z10 = z21;
            num14 = num36;
            list5 = list8;
            map3 = map6;
            num15 = num37;
            num16 = num38;
            num17 = num39;
            str16 = str38;
            str17 = str39;
            str18 = str40;
            str19 = str41;
            str20 = str42;
            str21 = str44;
            l3 = l6;
            map4 = map5;
            num18 = num33;
            timeoutsInfo2 = timeoutsInfo3;
            z11 = z18;
            list6 = list7;
            i6 = i9;
            str22 = str34;
            str23 = str35;
            eventEditor2 = eventEditor3;
            str24 = str36;
            str25 = str37;
            num19 = num34;
            num20 = num35;
            teamSeasonForm4 = teamSeasonForm5;
            j2 = j3;
            str26 = str32;
            l4 = l5;
            i7 = i8;
            time2 = time3;
            eventChanges2 = eventChanges3;
            num21 = num30;
            num22 = num31;
            num23 = num32;
            str27 = str33;
            z12 = z16;
            bool5 = bool13;
            z13 = z17;
            player2 = player3;
            num24 = num27;
            num25 = num28;
            num26 = num29;
            venue2 = venue3;
            referee2 = referee3;
            team3 = team5;
            team4 = team6;
            score3 = score5;
            score4 = score6;
            bool6 = bool10;
            z14 = z15;
            bool7 = bool11;
            bool8 = bool12;
            str28 = str31;
            season2 = season3;
            round2 = round3;
            status2 = status3;
        }
        return cricketEvent.copy(tournament3, str28, season2, round2, status2, num24, num25, num26, venue2, referee2, team3, team4, score3, score4, bool8, bool6, z14, bool7, str26, j2, l4, i7, time2, eventChanges2, num21, num22, num23, str27, z12, bool5, z13, player2, l3, map4, num18, timeoutsInfo2, z11, list6, i6, str22, str23, eventEditor2, str24, str25, num19, num20, teamSeasonForm4, teamSeasonForm3, z8, z9, z10, num14, list5, map3, num15, num16, num17, str16, str17, str18, str19, str20, str15, str21, list4);
    }

    public static final /* synthetic */ void write$Self$model_release(CricketEvent self, wf3 output, SerialDescriptor serialDesc) {
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
        output.h(serialDesc, 54, a7aVar, self.currentBattingTeamId);
        output.h(serialDesc, 55, a7aVar, self.currentBatsmanId);
        output.h(serialDesc, 56, a7aVar, self.currentBowlerId);
        output.h(serialDesc, 57, uhiVar, self.refereeName);
        output.h(serialDesc, 58, uhiVar, self.umpire1Name);
        output.h(serialDesc, 59, uhiVar, self.umpire2Name);
        output.h(serialDesc, 60, uhiVar, self.tvUmpireName);
        output.h(serialDesc, 61, uhiVar, self.note);
        output.h(serialDesc, 62, uhiVar, self.tossWin);
        output.h(serialDesc, 63, uhiVar, self.tossDecision);
        output.h(serialDesc, 64, (KSerializer) joaVarArr[64].getValue(), self.cricketBallProperties);
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
    /* renamed from: component55, reason: from getter */
    public final Integer getCurrentBattingTeamId() {
        return this.currentBattingTeamId;
    }

    @Nullable
    /* renamed from: component56, reason: from getter */
    public final Integer getCurrentBatsmanId() {
        return this.currentBatsmanId;
    }

    @Nullable
    /* renamed from: component57, reason: from getter */
    public final Integer getCurrentBowlerId() {
        return this.currentBowlerId;
    }

    @Nullable
    /* renamed from: component58, reason: from getter */
    public final String getRefereeName() {
        return this.refereeName;
    }

    @Nullable
    /* renamed from: component59, reason: from getter */
    public final String getUmpire1Name() {
        return this.umpire1Name;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getWinnerCode() {
        return this.winnerCode;
    }

    @Nullable
    /* renamed from: component60, reason: from getter */
    public final String getUmpire2Name() {
        return this.umpire2Name;
    }

    @Nullable
    /* renamed from: component61, reason: from getter */
    public final String getTvUmpireName() {
        return this.tvUmpireName;
    }

    @Nullable
    /* renamed from: component62, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    @Nullable
    /* renamed from: component63, reason: from getter */
    public final String getTossWin() {
        return this.tossWin;
    }

    @Nullable
    /* renamed from: component64, reason: from getter */
    public final String getTossDecision() {
        return this.tossDecision;
    }

    @Nullable
    public final List<String> component65() {
        return this.cricketBallProperties;
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
    public final CricketEvent copy(@NotNull Tournament tournament, @NotNull String slug, @Nullable Season season, @Nullable Round roundInfo, @NotNull Status status, @Nullable Integer winnerCode, @Nullable Integer aggregatedWinnerCode, @Nullable Integer attendance, @Nullable Venue venue, @Nullable Referee referee, @NotNull Team homeTeam, @NotNull Team awayTeam, @NotNull Score homeScore, @NotNull Score awayScore, @Nullable Boolean hasGlobalHighlights, @Nullable Boolean hasEventPlayerStatistics, boolean hasEventPlayerHeatMap, @Nullable Boolean hasXg, @NotNull String customId, long startTimestamp, @Nullable Long endTimestamp, int id, @Nullable Time time, @Nullable EventChanges changes, @Nullable Integer coverage, @Nullable Integer previousLegEventId, @Nullable Integer parentEventId, @Nullable String lastPeriod, boolean finalResultOnly, @Nullable Boolean isEditor, boolean isAwarded, @Nullable Player manOfMatch, @Nullable Long currentPeriodStartTimestamp, @Nullable Map<String, String> periods, @Nullable Integer defaultPeriodCount, @Nullable TimeoutsInfo timeouts, boolean hasBet365LiveStream, @Nullable List<String> bet365ExcludedCountryCodes, int cupMatchesInRound, @Nullable String statusReason, @Nullable String eventEditorName, @Nullable EventEditor eventEditor, @Nullable String eventType, @Nullable String seasonStatisticsType, @Nullable Integer homeTeamRanking, @Nullable Integer awayTeamRanking, @Nullable TeamSeasonForm homeTeamSeasonHistoricalForm, @Nullable TeamSeasonForm awayTeamSeasonHistoricalForm, boolean crowdsourcingEnabled, boolean crowdsourcingDataDisplayEnabled, boolean crowdsourcingDataDisplayPermanent, @Nullable Integer streamContentId, @Nullable List<String> streamContentGeoRestrictions, @Nullable Map<String, ? extends List<String>> eventFilters, @Nullable Integer currentBattingTeamId, @Nullable Integer currentBatsmanId, @Nullable Integer currentBowlerId, @Nullable String refereeName, @Nullable String umpire1Name, @Nullable String umpire2Name, @Nullable String tvUmpireName, @Nullable String note, @Nullable String tossWin, @Nullable String tossDecision, @Nullable List<String> cricketBallProperties) {
        wt3.x(tournament, slug, status, homeTeam, awayTeam);
        homeScore.getClass();
        awayScore.getClass();
        customId.getClass();
        return new CricketEvent(tournament, slug, season, roundInfo, status, winnerCode, aggregatedWinnerCode, attendance, venue, referee, homeTeam, awayTeam, homeScore, awayScore, hasGlobalHighlights, hasEventPlayerStatistics, hasEventPlayerHeatMap, hasXg, customId, startTimestamp, endTimestamp, id, time, changes, coverage, previousLegEventId, parentEventId, lastPeriod, finalResultOnly, isEditor, isAwarded, manOfMatch, currentPeriodStartTimestamp, periods, defaultPeriodCount, timeouts, hasBet365LiveStream, bet365ExcludedCountryCodes, cupMatchesInRound, statusReason, eventEditorName, eventEditor, eventType, seasonStatisticsType, homeTeamRanking, awayTeamRanking, homeTeamSeasonHistoricalForm, awayTeamSeasonHistoricalForm, crowdsourcingEnabled, crowdsourcingDataDisplayEnabled, crowdsourcingDataDisplayPermanent, streamContentId, streamContentGeoRestrictions, eventFilters, currentBattingTeamId, currentBatsmanId, currentBowlerId, refereeName, umpire1Name, umpire2Name, tvUmpireName, note, tossWin, tossDecision, cricketBallProperties);
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @NotNull
    public Event copyEvent() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 0L, null, 0, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, 0, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CricketEvent)) {
            return false;
        }
        CricketEvent cricketEvent = (CricketEvent) other;
        return Intrinsics.c(this.tournament, cricketEvent.tournament) && Intrinsics.c(this.slug, cricketEvent.slug) && Intrinsics.c(this.season, cricketEvent.season) && Intrinsics.c(this.roundInfo, cricketEvent.roundInfo) && Intrinsics.c(this.status, cricketEvent.status) && Intrinsics.c(this.winnerCode, cricketEvent.winnerCode) && Intrinsics.c(this.aggregatedWinnerCode, cricketEvent.aggregatedWinnerCode) && Intrinsics.c(this.attendance, cricketEvent.attendance) && Intrinsics.c(this.venue, cricketEvent.venue) && Intrinsics.c(this.referee, cricketEvent.referee) && Intrinsics.c(this.homeTeam, cricketEvent.homeTeam) && Intrinsics.c(this.awayTeam, cricketEvent.awayTeam) && Intrinsics.c(this.homeScore, cricketEvent.homeScore) && Intrinsics.c(this.awayScore, cricketEvent.awayScore) && Intrinsics.c(this.hasGlobalHighlights, cricketEvent.hasGlobalHighlights) && Intrinsics.c(this.hasEventPlayerStatistics, cricketEvent.hasEventPlayerStatistics) && this.hasEventPlayerHeatMap == cricketEvent.hasEventPlayerHeatMap && Intrinsics.c(this.hasXg, cricketEvent.hasXg) && Intrinsics.c(this.customId, cricketEvent.customId) && this.startTimestamp == cricketEvent.startTimestamp && Intrinsics.c(this.endTimestamp, cricketEvent.endTimestamp) && this.id == cricketEvent.id && Intrinsics.c(this.time, cricketEvent.time) && Intrinsics.c(this.changes, cricketEvent.changes) && Intrinsics.c(this.coverage, cricketEvent.coverage) && Intrinsics.c(this.previousLegEventId, cricketEvent.previousLegEventId) && Intrinsics.c(this.parentEventId, cricketEvent.parentEventId) && Intrinsics.c(this.lastPeriod, cricketEvent.lastPeriod) && this.finalResultOnly == cricketEvent.finalResultOnly && Intrinsics.c(this.isEditor, cricketEvent.isEditor) && this.isAwarded == cricketEvent.isAwarded && Intrinsics.c(this.manOfMatch, cricketEvent.manOfMatch) && Intrinsics.c(this.currentPeriodStartTimestamp, cricketEvent.currentPeriodStartTimestamp) && Intrinsics.c(this.periods, cricketEvent.periods) && Intrinsics.c(this.defaultPeriodCount, cricketEvent.defaultPeriodCount) && Intrinsics.c(this.timeouts, cricketEvent.timeouts) && this.hasBet365LiveStream == cricketEvent.hasBet365LiveStream && Intrinsics.c(this.bet365ExcludedCountryCodes, cricketEvent.bet365ExcludedCountryCodes) && this.cupMatchesInRound == cricketEvent.cupMatchesInRound && Intrinsics.c(this.statusReason, cricketEvent.statusReason) && Intrinsics.c(this.eventEditorName, cricketEvent.eventEditorName) && Intrinsics.c(this.eventEditor, cricketEvent.eventEditor) && Intrinsics.c(this.eventType, cricketEvent.eventType) && Intrinsics.c(this.seasonStatisticsType, cricketEvent.seasonStatisticsType) && Intrinsics.c(this.homeTeamRanking, cricketEvent.homeTeamRanking) && Intrinsics.c(this.awayTeamRanking, cricketEvent.awayTeamRanking) && Intrinsics.c(this.homeTeamSeasonHistoricalForm, cricketEvent.homeTeamSeasonHistoricalForm) && Intrinsics.c(this.awayTeamSeasonHistoricalForm, cricketEvent.awayTeamSeasonHistoricalForm) && this.crowdsourcingEnabled == cricketEvent.crowdsourcingEnabled && this.crowdsourcingDataDisplayEnabled == cricketEvent.crowdsourcingDataDisplayEnabled && this.crowdsourcingDataDisplayPermanent == cricketEvent.crowdsourcingDataDisplayPermanent && Intrinsics.c(this.streamContentId, cricketEvent.streamContentId) && Intrinsics.c(this.streamContentGeoRestrictions, cricketEvent.streamContentGeoRestrictions) && Intrinsics.c(this.eventFilters, cricketEvent.eventFilters) && Intrinsics.c(this.currentBattingTeamId, cricketEvent.currentBattingTeamId) && Intrinsics.c(this.currentBatsmanId, cricketEvent.currentBatsmanId) && Intrinsics.c(this.currentBowlerId, cricketEvent.currentBowlerId) && Intrinsics.c(this.refereeName, cricketEvent.refereeName) && Intrinsics.c(this.umpire1Name, cricketEvent.umpire1Name) && Intrinsics.c(this.umpire2Name, cricketEvent.umpire2Name) && Intrinsics.c(this.tvUmpireName, cricketEvent.tvUmpireName) && Intrinsics.c(this.note, cricketEvent.note) && Intrinsics.c(this.tossWin, cricketEvent.tossWin) && Intrinsics.c(this.tossDecision, cricketEvent.tossDecision) && Intrinsics.c(this.cricketBallProperties, cricketEvent.cricketBallProperties);
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

    @Nullable
    public final List<String> getCricketBallProperties() {
        return this.cricketBallProperties;
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

    @Nullable
    public final Integer getCurrentBatsmanId() {
        return this.currentBatsmanId;
    }

    @Nullable
    public final Integer getCurrentBattingTeamId() {
        return this.currentBattingTeamId;
    }

    @Nullable
    public final Integer getCurrentBowlerId() {
        return this.currentBowlerId;
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

    @Nullable
    public final String getNote() {
        return this.note;
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

    @Nullable
    public final String getRefereeName() {
        return this.refereeName;
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

    @Nullable
    public final String getTossDecision() {
        return this.tossDecision;
    }

    @Nullable
    public final String getTossWin() {
        return this.tossWin;
    }

    @Override // com.sofascore.model.mvvm.model.Event
    @NotNull
    public Tournament getTournament() {
        return this.tournament;
    }

    @Nullable
    public final String getTvUmpireName() {
        return this.tvUmpireName;
    }

    @Nullable
    public final String getUmpire1Name() {
        return this.umpire1Name;
    }

    @Nullable
    public final String getUmpire2Name() {
        return this.umpire2Name;
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
        int hashCode27 = (hashCode26 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Integer num11 = this.currentBattingTeamId;
        int hashCode28 = (hashCode27 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.currentBatsmanId;
        int hashCode29 = (hashCode28 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.currentBowlerId;
        int hashCode30 = (hashCode29 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str6 = this.refereeName;
        int hashCode31 = (hashCode30 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.umpire1Name;
        int hashCode32 = (hashCode31 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.umpire2Name;
        int hashCode33 = (hashCode32 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tvUmpireName;
        int hashCode34 = (hashCode33 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.note;
        int hashCode35 = (hashCode34 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tossWin;
        int hashCode36 = (hashCode35 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.tossDecision;
        int hashCode37 = (hashCode36 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<String> list3 = this.cricketBallProperties;
        return hashCode37 + (list3 != null ? list3.hashCode() : 0);
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
        Integer num11 = this.currentBattingTeamId;
        Integer num12 = this.currentBatsmanId;
        Integer num13 = this.currentBowlerId;
        String str8 = this.refereeName;
        String str9 = this.umpire1Name;
        String str10 = this.umpire2Name;
        String str11 = this.tvUmpireName;
        String str12 = this.note;
        String str13 = this.tossWin;
        String str14 = this.tossDecision;
        List<String> list3 = this.cricketBallProperties;
        StringBuilder sb = new StringBuilder("CricketEvent(tournament=");
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
        fn0.w(num11, num12, ", currentBattingTeamId=", ", currentBatsmanId=", sb);
        fn0.x(num13, ", currentBowlerId=", ", refereeName=", str8, sb);
        bf3.v(sb, ", umpire1Name=", str9, ", umpire2Name=", str10);
        bf3.v(sb, ", tvUmpireName=", str11, ", note=", str12);
        bf3.v(sb, ", tossWin=", str13, ", tossDecision=", str14);
        sb.append(", cricketBallProperties=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CricketEvent(@NotNull Tournament tournament, @NotNull String str, @Nullable Season season, @Nullable Round round, @NotNull Status status, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Venue venue, @Nullable Referee referee, @NotNull Team team, @NotNull Team team2, @NotNull Score score, @NotNull Score score2, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z, @Nullable Boolean bool3, @NotNull String str2, long j, @Nullable Long l, int i, @Nullable Time time, @Nullable EventChanges eventChanges, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str3, boolean z2, @Nullable Boolean bool4, boolean z3, @Nullable Player player, @Nullable Long l2, @Nullable Map<String, String> map, @Nullable Integer num7, @Nullable TimeoutsInfo timeoutsInfo, boolean z4, @Nullable List<String> list, int i2, @Nullable String str4, @Nullable String str5, @Nullable EventEditor eventEditor, @Nullable String str6, @Nullable String str7, @Nullable Integer num8, @Nullable Integer num9, @Nullable TeamSeasonForm teamSeasonForm, @Nullable TeamSeasonForm teamSeasonForm2, boolean z5, boolean z6, boolean z7, @Nullable Integer num10, @Nullable List<String> list2, @Nullable Map<String, ? extends List<String>> map2, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable List<String> list3) {
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
        this.currentBattingTeamId = num11;
        this.currentBatsmanId = num12;
        this.currentBowlerId = num13;
        this.refereeName = str8;
        this.umpire1Name = str9;
        this.umpire2Name = str10;
        this.tvUmpireName = str11;
        this.note = str12;
        this.tossWin = str13;
        this.tossDecision = str14;
        this.cricketBallProperties = list3;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/CricketEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/CricketEvent;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CricketEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CricketEvent(Tournament tournament, String str, Season season, Round round, Status status, Integer num, Integer num2, Integer num3, Venue venue, Referee referee, Team team, Team team2, Score score, Score score2, Boolean bool, Boolean bool2, boolean z, Boolean bool3, String str2, long j, Long l, int i, Time time, EventChanges eventChanges, Integer num4, Integer num5, Integer num6, String str3, boolean z2, Boolean bool4, boolean z3, Player player, Long l2, Map map, Integer num7, TimeoutsInfo timeoutsInfo, boolean z4, List list, int i2, String str4, String str5, EventEditor eventEditor, String str6, String str7, Integer num8, Integer num9, TeamSeasonForm teamSeasonForm, TeamSeasonForm teamSeasonForm2, boolean z5, boolean z6, boolean z7, Integer num10, List list2, Map map2, Integer num11, Integer num12, Integer num13, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list3, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(tournament, str, season, round, status, num, num2, num3, venue, referee, team, team2, score, score2, bool, bool2, (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z, bool3, str2, j, l, i, time, eventChanges, num4, num5, num6, str3, z2, bool4, (i3 & 1073741824) != 0 ? false : z3, player, l2, map, num7, timeoutsInfo, (i4 & 16) != 0 ? false : z4, list, (i4 & 64) != 0 ? 0 : i2, str4, str5, eventEditor, str6, str7, num8, num9, teamSeasonForm, teamSeasonForm2, (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z5, (i4 & 131072) != 0 ? false : z6, (i4 & 262144) != 0 ? false : z7, num10, list2, map2, num11, num12, num13, str8, str9, str10, str11, str12, str13, str14, list3);
    }
}
