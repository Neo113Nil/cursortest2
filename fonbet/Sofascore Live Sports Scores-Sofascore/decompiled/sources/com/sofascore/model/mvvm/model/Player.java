package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.Y1;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Injury;
import com.sofascore.model.Injury$$serializer;
import com.sofascore.model.Money;
import com.sofascore.model.Money$$serializer;
import com.sofascore.model.PlayerActiveSuspension;
import com.sofascore.model.PlayerActiveSuspension$$serializer;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.IUrlSharing;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.joa;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t2e;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
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
@r5h
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bD\b\u0087\b\u0018\u0000 Ä\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004Å\u0001Ä\u0001B\u008d\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\u0019\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010*\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010*\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u00105\u001a\u00020\u0019¢\u0006\u0004\b6\u00107B5\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b6\u00108B5\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b6\u00109B¯\u0003\b\u0010\u0012\u0006\u0010:\u001a\u00020\u0004\u0012\u0006\u0010;\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010)\u001a\u00020\u0019\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010*\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010*\u0012\b\u0010.\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\b\u00100\u001a\u0004\u0018\u00010\u0006\u0012\b\u00101\u001a\u0004\u0018\u00010\u0006\u0012\b\u00102\u001a\u0004\u0018\u00010\u0006\u0012\b\u00103\u001a\u0004\u0018\u00010\u0006\u0012\b\u00104\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u00105\u001a\u00020\u0019\u0012\u0006\u0010<\u001a\u00020\u0019\u0012\u0006\u0010=\u001a\u00020\u0019\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\b6\u0010AJ\u0010\u0010B\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bF\u0010EJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bG\u0010EJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bH\u0010EJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bI\u0010EJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bJ\u0010EJ\u0010\u0010K\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bO\u0010NJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bT\u0010EJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bW\u0010VJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bX\u0010EJ\u0010\u0010Y\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b[\u0010ZJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0012\u0010^\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b^\u0010VJ\u0012\u0010_\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\ba\u0010`J\u0012\u0010b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bb\u0010NJ\u0012\u0010c\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0012\u0010e\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0012\u0010g\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bi\u0010ZJ\u0018\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010*HÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0018\u0010l\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010*HÆ\u0003¢\u0006\u0004\bl\u0010kJ\u0012\u0010m\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bm\u0010`J\u0012\u0010n\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bn\u0010EJ\u0012\u0010o\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bo\u0010EJ\u0012\u0010p\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bp\u0010EJ\u0012\u0010q\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bq\u0010EJ\u0012\u0010r\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\br\u0010EJ\u0012\u0010s\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bs\u0010EJ\u0010\u0010t\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bt\u0010ZJÊ\u0003\u0010u\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\u00192\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010*2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010*2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u00105\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\bu\u0010vJ\u0010\u0010w\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bw\u0010EJ\u0010\u0010x\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bx\u0010CJ\u001a\u0010{\u001a\u00020\u00192\b\u0010z\u001a\u0004\u0018\u00010yHÖ\u0003¢\u0006\u0004\b{\u0010|J-\u0010\u0085\u0001\u001a\u00030\u0082\u00012\u0006\u0010}\u001a\u00020\u00002\u0006\u0010\u007f\u001a\u00020~2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010CR$\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0007\u0010\u0088\u0001\u0012\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b\u0089\u0001\u0010ER\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\b\u0010\u0088\u0001\u001a\u0005\b\u008c\u0001\u0010ER\u001e\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u0088\u0001\u001a\u0005\b\u008d\u0001\u0010ER\u001e\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\n\u0010\u0088\u0001\u001a\u0005\b\u008e\u0001\u0010ER&\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000b\u0010\u0088\u0001\u0012\u0006\b\u0090\u0001\u0010\u008b\u0001\u001a\u0005\b\u008f\u0001\u0010ER\u001e\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\f\u0010\u0088\u0001\u001a\u0005\b\u0091\u0001\u0010ER\u0019\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010LR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010NR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010\u0094\u0001\u001a\u0005\b\u0096\u0001\u0010NR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010QR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010SR(\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b\u0015\u0010\u0088\u0001\u001a\u0005\b\u009b\u0001\u0010E\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010\u009e\u0001\u001a\u0005\b\u009f\u0001\u0010VR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u009e\u0001\u001a\u0005\b \u0001\u0010VR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u0088\u0001\u001a\u0005\b¡\u0001\u0010ER\u001c\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010¢\u0001\u001a\u0005\b£\u0001\u0010ZR\u001c\u0010\u001b\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010¢\u0001\u001a\u0005\b¤\u0001\u0010ZR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010¥\u0001\u001a\u0005\b¦\u0001\u0010]R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010\u009e\u0001\u001a\u0005\b§\u0001\u0010VR\u001e\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0010¨\u0001\u001a\u0005\b©\u0001\u0010`R\u001e\u0010!\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b!\u0010¨\u0001\u001a\u0005\bª\u0001\u0010`R\u001e\u0010\"\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u0094\u0001\u001a\u0005\b«\u0001\u0010NR\u001e\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b$\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010dR\u001e\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010®\u0001\u001a\u0005\b¯\u0001\u0010fR\u001e\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010°\u0001\u001a\u0005\b±\u0001\u0010hR\u001c\u0010)\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010¢\u0001\u001a\u0005\b²\u0001\u0010ZR$\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010³\u0001\u001a\u0005\b´\u0001\u0010kR$\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010³\u0001\u001a\u0005\bµ\u0001\u0010kR\u001e\u0010.\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b.\u0010¨\u0001\u001a\u0005\b¶\u0001\u0010`R\u001e\u0010/\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b/\u0010\u0088\u0001\u001a\u0005\b·\u0001\u0010ER\u001e\u00100\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010\u0088\u0001\u001a\u0005\b¸\u0001\u0010ER\u001e\u00101\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b1\u0010\u0088\u0001\u001a\u0005\b¹\u0001\u0010ER\u001e\u00102\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010\u0088\u0001\u001a\u0005\bº\u0001\u0010ER\u001e\u00103\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b3\u0010\u0088\u0001\u001a\u0005\b»\u0001\u0010ER\u001e\u00104\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b4\u0010\u0088\u0001\u001a\u0005\b¼\u0001\u0010ER\u001c\u00105\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b5\u0010¢\u0001\u001a\u0005\b½\u0001\u0010ZR%\u0010<\u001a\u00020\u00198\u0016@\u0016X\u0097\u000e¢\u0006\u0015\n\u0005\b<\u0010¢\u0001\u001a\u0004\b<\u0010Z\"\u0006\b¾\u0001\u0010¿\u0001R%\u0010=\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b=\u0010¢\u0001\u001a\u0004\b=\u0010Z\"\u0006\bÀ\u0001\u0010¿\u0001R\u001c\u0010>\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b>\u0010\u0088\u0001\u001a\u0005\bÁ\u0001\u0010ER\u0018\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010E¨\u0006Æ\u0001"}, d2 = {"Lcom/sofascore/model/mvvm/model/Player;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/IRecent;", "Lcom/sofascore/model/mvvm/IUrlSharing;", "", "id", "", "name", "firstName", "lastName", "slug", "shortName", "position", "", "userCount", "dateOfBirthTimestamp", "dateOfDeathTimestamp", "Lcom/sofascore/model/mvvm/model/Country;", "country", "Lcom/sofascore/model/mvvm/model/Team;", "team", "jerseyNumber", "height", "weight", "preferredFoot", "", CupTreeBlock.BLOCK_RESULT_RETIRED, "deceased", "Lcom/sofascore/model/mvvm/model/CricketPlayerInfo;", "cricketPlayerInfo", "managerId", "Lcom/sofascore/model/Money;", "marketValueRaw", "proposedMarketValueRaw", "contractUntilTimestamp", "Lcom/sofascore/model/Injury;", "injury", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "fieldTranslations", "Lcom/sofascore/model/mvvm/model/Gender;", InneractiveMediationDefs.KEY_GENDER, Y1.e, "", "positionsDetailed", "Lcom/sofascore/model/PlayerActiveSuspension;", "activeSeasonSuspensions", "salary", "status", "primaryPosition", "batHand", "throwHand", "birthCity", "birthPlace", "underage", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZZLcom/sofascore/model/mvvm/model/CricketPlayerInfo;Ljava/lang/Integer;Lcom/sofascore/model/Money;Lcom/sofascore/model/Money;Ljava/lang/Long;Lcom/sofascore/model/Injury;Lcom/sofascore/model/mvvm/model/FieldTranslations;Lcom/sofascore/model/mvvm/model/Gender;ZLjava/util/List;Ljava/util/List;Lcom/sofascore/model/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "(ILjava/lang/String;JLcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/FieldTranslations;)V", "(ILjava/lang/String;Ljava/lang/String;JLcom/sofascore/model/mvvm/model/Team;)V", "seen0", "seen1", "isRecent", "isTopRated", "webUrl", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZZLcom/sofascore/model/mvvm/model/CricketPlayerInfo;Ljava/lang/Integer;Lcom/sofascore/model/Money;Lcom/sofascore/model/Money;Ljava/lang/Long;Lcom/sofascore/model/Injury;Lcom/sofascore/model/mvvm/model/FieldTranslations;Lcom/sofascore/model/mvvm/model/Gender;ZLjava/util/List;Ljava/util/List;Lcom/sofascore/model/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()J", "component9", "()Ljava/lang/Long;", "component10", "component11", "()Lcom/sofascore/model/mvvm/model/Country;", "component12", "()Lcom/sofascore/model/mvvm/model/Team;", "component13", "component14", "()Ljava/lang/Integer;", "component15", "component16", "component17", "()Z", "component18", "component19", "()Lcom/sofascore/model/mvvm/model/CricketPlayerInfo;", "component20", "component21", "()Lcom/sofascore/model/Money;", "component22", "component23", "component24", "()Lcom/sofascore/model/Injury;", "component25", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "component26", "()Lcom/sofascore/model/mvvm/model/Gender;", "component27", "component28", "()Ljava/util/List;", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZZLcom/sofascore/model/mvvm/model/CricketPlayerInfo;Ljava/lang/Integer;Lcom/sofascore/model/Money;Lcom/sofascore/model/Money;Ljava/lang/Long;Lcom/sofascore/model/Injury;Lcom/sofascore/model/mvvm/model/FieldTranslations;Lcom/sofascore/model/mvvm/model/Gender;ZLjava/util/List;Ljava/util/List;Lcom/sofascore/model/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/sofascore/model/mvvm/model/Player;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Player;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getFirstName", "getLastName", "getSlug", "getShortName", "getShortName$annotations", "getPosition", "J", "getUserCount", "Ljava/lang/Long;", "getDateOfBirthTimestamp", "getDateOfDeathTimestamp", "Lcom/sofascore/model/mvvm/model/Country;", "getCountry", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "getJerseyNumber", "setJerseyNumber", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getHeight", "getWeight", "getPreferredFoot", "Z", "getRetired", "getDeceased", "Lcom/sofascore/model/mvvm/model/CricketPlayerInfo;", "getCricketPlayerInfo", "getManagerId", "Lcom/sofascore/model/Money;", "getMarketValueRaw", "getProposedMarketValueRaw", "getContractUntilTimestamp", "Lcom/sofascore/model/Injury;", "getInjury", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getFieldTranslations", "Lcom/sofascore/model/mvvm/model/Gender;", "getGender", "getDisabled", "Ljava/util/List;", "getPositionsDetailed", "getActiveSeasonSuspensions", "getSalary", "getStatus", "getPrimaryPosition", "getBatHand", "getThrowHand", "getBirthCity", "getBirthPlace", "getUnderage", "setRecent", "(Z)V", "setTopRated", "getWebUrl", "getSportSlug", "sportSlug", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Player implements Serializable, IRecent, IUrlSharing {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<PlayerActiveSuspension> activeSeasonSuspensions;

    @Nullable
    private final String batHand;

    @Nullable
    private final String birthCity;

    @Nullable
    private final String birthPlace;

    @Nullable
    private final Long contractUntilTimestamp;

    @Nullable
    private final Country country;

    @Nullable
    private final CricketPlayerInfo cricketPlayerInfo;

    @Nullable
    private final Long dateOfBirthTimestamp;

    @Nullable
    private final Long dateOfDeathTimestamp;
    private final boolean deceased;
    private final boolean disabled;

    @Nullable
    private final FieldTranslations fieldTranslations;

    @Nullable
    private final String firstName;

    @Nullable
    private final Gender gender;

    @Nullable
    private final Integer height;
    private final int id;

    @Nullable
    private final Injury injury;
    private boolean isRecent;
    private boolean isTopRated;

    @Nullable
    private String jerseyNumber;

    @Nullable
    private final String lastName;

    @Nullable
    private final Integer managerId;

    @Nullable
    private final Money marketValueRaw;

    @NotNull
    private final String name;

    @Nullable
    private final String position;

    @Nullable
    private final List<String> positionsDetailed;

    @Nullable
    private final String preferredFoot;

    @Nullable
    private final String primaryPosition;

    @Nullable
    private final Money proposedMarketValueRaw;
    private final boolean retired;

    @Nullable
    private final Money salary;

    @Nullable
    private final String shortName;

    @Nullable
    private final String slug;

    @Nullable
    private final String status;

    @Nullable
    private final Team team;

    @Nullable
    private final String throwHand;
    private final boolean underage;
    private final long userCount;

    @NotNull
    private final String webUrl;

    @Nullable
    private final Integer weight;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new t2e(17)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new t2e(18)), ypa.a(ysaVar, new t2e(19)), null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ Player(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, long j, Long l, Long l2, Country country, Team team, String str7, Integer num, Integer num2, String str8, boolean z, boolean z2, CricketPlayerInfo cricketPlayerInfo, Integer num3, Money money, Money money2, Long l3, Injury injury, FieldTranslations fieldTranslations, Gender gender, boolean z3, List list, List list2, Money money3, String str9, String str10, String str11, String str12, String str13, String str14, boolean z4, boolean z5, boolean z6, String str15, t5h t5hVar) {
        String l4;
        if (469565439 != (i & 469565439)) {
            oea.y(new int[]{i, i2}, new int[]{469565439, 0}, Player$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.name = str;
        this.firstName = str2;
        this.lastName = str3;
        this.slug = str4;
        this.shortName = str5;
        this.position = str6;
        this.userCount = j;
        this.dateOfBirthTimestamp = l;
        this.dateOfDeathTimestamp = l2;
        this.country = country;
        this.team = team;
        this.jerseyNumber = str7;
        this.height = num;
        this.weight = num2;
        this.preferredFoot = str8;
        if ((65536 & i) == 0) {
            this.retired = false;
        } else {
            this.retired = z;
        }
        if ((131072 & i) == 0) {
            this.deceased = false;
        } else {
            this.deceased = z2;
        }
        this.cricketPlayerInfo = cricketPlayerInfo;
        this.managerId = num3;
        this.marketValueRaw = money;
        this.proposedMarketValueRaw = money2;
        this.contractUntilTimestamp = l3;
        this.injury = injury;
        this.fieldTranslations = fieldTranslations;
        this.gender = gender;
        if ((67108864 & i) == 0) {
            this.disabled = false;
        } else {
            this.disabled = z3;
        }
        this.positionsDetailed = list;
        this.activeSeasonSuspensions = list2;
        if ((536870912 & i) == 0) {
            this.salary = null;
        } else {
            this.salary = money3;
        }
        if ((1073741824 & i) == 0) {
            this.status = null;
        } else {
            this.status = str9;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.primaryPosition = null;
        } else {
            this.primaryPosition = str10;
        }
        if ((i2 & 1) == 0) {
            this.batHand = null;
        } else {
            this.batHand = str11;
        }
        if ((i2 & 2) == 0) {
            this.throwHand = null;
        } else {
            this.throwHand = str12;
        }
        if ((i2 & 4) == 0) {
            this.birthCity = null;
        } else {
            this.birthCity = str13;
        }
        if ((i2 & 8) == 0) {
            this.birthPlace = null;
        } else {
            this.birthPlace = str14;
        }
        if ((i2 & 16) == 0) {
            this.underage = false;
        } else {
            this.underage = z4;
        }
        if ((i2 & 32) == 0) {
            this.isRecent = false;
        } else {
            this.isRecent = z5;
        }
        if ((i2 & 64) == 0) {
            this.isTopRated = false;
        } else {
            this.isTopRated = z6;
        }
        if ((i2 & 128) != 0) {
            this.webUrl = str15;
            return;
        }
        if (getSportSlug() != null) {
            String sportSlug = getSportSlug();
            int id = getId();
            StringBuilder s = mz1.s("/", sportSlug, "/player/", str4, "/");
            s.append(id);
            l4 = s.toString();
        } else {
            l4 = dmi.l(getId(), "/player/", str4, "/");
        }
        this.webUrl = l4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(uhi.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(PlayerActiveSuspension$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ Player copy$default(Player player, int i, String str, String str2, String str3, String str4, String str5, String str6, long j, Long l, Long l2, Country country, Team team, String str7, Integer num, Integer num2, String str8, boolean z, boolean z2, CricketPlayerInfo cricketPlayerInfo, Integer num3, Money money, Money money2, Long l3, Injury injury, FieldTranslations fieldTranslations, Gender gender, boolean z3, List list, List list2, Money money3, String str9, String str10, String str11, String str12, String str13, String str14, boolean z4, int i2, int i3, Object obj) {
        boolean z5;
        String str15;
        Money money4;
        Money money5;
        Long l4;
        Injury injury2;
        FieldTranslations fieldTranslations2;
        Gender gender2;
        boolean z6;
        List list3;
        List list4;
        Money money6;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        Integer num4;
        String str21;
        long j2;
        Long l5;
        Long l6;
        Country country2;
        Team team2;
        String str22;
        Integer num5;
        String str23;
        boolean z7;
        boolean z8;
        CricketPlayerInfo cricketPlayerInfo2;
        Integer num6;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        int i4 = (i2 & 1) != 0 ? player.id : i;
        String str29 = (i2 & 2) != 0 ? player.name : str;
        String str30 = (i2 & 4) != 0 ? player.firstName : str2;
        String str31 = (i2 & 8) != 0 ? player.lastName : str3;
        String str32 = (i2 & 16) != 0 ? player.slug : str4;
        String str33 = (i2 & 32) != 0 ? player.shortName : str5;
        String str34 = (i2 & 64) != 0 ? player.position : str6;
        long j3 = (i2 & 128) != 0 ? player.userCount : j;
        Long l7 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? player.dateOfBirthTimestamp : l;
        Long l8 = (i2 & 512) != 0 ? player.dateOfDeathTimestamp : l2;
        Country country3 = (i2 & 1024) != 0 ? player.country : country;
        Team team3 = (i2 & a.o) != 0 ? player.team : team;
        String str35 = (i2 & 4096) != 0 ? player.jerseyNumber : str7;
        int i5 = i4;
        Integer num7 = (i2 & 8192) != 0 ? player.height : num;
        Integer num8 = (i2 & 16384) != 0 ? player.weight : num2;
        String str36 = (i2 & 32768) != 0 ? player.preferredFoot : str8;
        boolean z9 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? player.retired : z;
        boolean z10 = (i2 & 131072) != 0 ? player.deceased : z2;
        CricketPlayerInfo cricketPlayerInfo3 = (i2 & 262144) != 0 ? player.cricketPlayerInfo : cricketPlayerInfo;
        Integer num9 = (i2 & 524288) != 0 ? player.managerId : num3;
        Money money7 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? player.marketValueRaw : money;
        Money money8 = (i2 & 2097152) != 0 ? player.proposedMarketValueRaw : money2;
        Long l9 = (i2 & 4194304) != 0 ? player.contractUntilTimestamp : l3;
        Injury injury3 = (i2 & 8388608) != 0 ? player.injury : injury;
        FieldTranslations fieldTranslations3 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? player.fieldTranslations : fieldTranslations;
        Gender gender3 = (i2 & 33554432) != 0 ? player.gender : gender;
        boolean z11 = (i2 & 67108864) != 0 ? player.disabled : z3;
        List list5 = (i2 & 134217728) != 0 ? player.positionsDetailed : list;
        List list6 = (i2 & 268435456) != 0 ? player.activeSeasonSuspensions : list2;
        Money money9 = (i2 & 536870912) != 0 ? player.salary : money3;
        String str37 = (i2 & 1073741824) != 0 ? player.status : str9;
        String str38 = (i2 & Integer.MIN_VALUE) != 0 ? player.primaryPosition : str10;
        String str39 = (i3 & 1) != 0 ? player.batHand : str11;
        String str40 = (i3 & 2) != 0 ? player.throwHand : str12;
        String str41 = (i3 & 4) != 0 ? player.birthCity : str13;
        String str42 = (i3 & 8) != 0 ? player.birthPlace : str14;
        if ((i3 & 16) != 0) {
            str15 = str42;
            z5 = player.underage;
            money5 = money8;
            l4 = l9;
            injury2 = injury3;
            fieldTranslations2 = fieldTranslations3;
            gender2 = gender3;
            z6 = z11;
            list3 = list5;
            list4 = list6;
            money6 = money9;
            str16 = str37;
            str17 = str38;
            str18 = str39;
            str19 = str40;
            str20 = str41;
            num4 = num8;
            j2 = j3;
            l5 = l7;
            l6 = l8;
            country2 = country3;
            team2 = team3;
            str22 = str35;
            num5 = num7;
            str23 = str36;
            z7 = z9;
            z8 = z10;
            cricketPlayerInfo2 = cricketPlayerInfo3;
            num6 = num9;
            money4 = money7;
            str24 = str29;
            str25 = str30;
            str26 = str31;
            str27 = str32;
            str28 = str33;
            str21 = str34;
        } else {
            z5 = z4;
            str15 = str42;
            money4 = money7;
            money5 = money8;
            l4 = l9;
            injury2 = injury3;
            fieldTranslations2 = fieldTranslations3;
            gender2 = gender3;
            z6 = z11;
            list3 = list5;
            list4 = list6;
            money6 = money9;
            str16 = str37;
            str17 = str38;
            str18 = str39;
            str19 = str40;
            str20 = str41;
            num4 = num8;
            str21 = str34;
            j2 = j3;
            l5 = l7;
            l6 = l8;
            country2 = country3;
            team2 = team3;
            str22 = str35;
            num5 = num7;
            str23 = str36;
            z7 = z9;
            z8 = z10;
            cricketPlayerInfo2 = cricketPlayerInfo3;
            num6 = num9;
            str24 = str29;
            str25 = str30;
            str26 = str31;
            str27 = str32;
            str28 = str33;
        }
        return player.copy(i5, str24, str25, str26, str27, str28, str21, j2, l5, l6, country2, team2, str22, num5, num4, str23, z7, z8, cricketPlayerInfo2, num6, money4, money5, l4, injury2, fieldTranslations2, gender2, z6, list3, list4, money6, str16, str17, str18, str19, str20, str15, z5);
    }

    public static final /* synthetic */ void write$Self$model_release(Player self, wf3 output, SerialDescriptor serialDesc) {
        String l;
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.name);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.firstName);
        output.h(serialDesc, 3, uhiVar, self.lastName);
        output.h(serialDesc, 4, uhiVar, self.slug);
        output.h(serialDesc, 5, uhiVar, self.shortName);
        output.h(serialDesc, 6, uhiVar, self.position);
        output.E(serialDesc, 7, self.userCount);
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 8, lkbVar, self.dateOfBirthTimestamp);
        output.h(serialDesc, 9, lkbVar, self.dateOfDeathTimestamp);
        output.h(serialDesc, 10, Country$$serializer.INSTANCE, self.country);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.team);
        output.h(serialDesc, 12, uhiVar, self.jerseyNumber);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 13, a7aVar, self.height);
        output.h(serialDesc, 14, a7aVar, self.weight);
        output.h(serialDesc, 15, uhiVar, self.preferredFoot);
        if (output.o(serialDesc) || self.retired) {
            output.x(serialDesc, 16, self.retired);
        }
        if (output.o(serialDesc) || self.deceased) {
            output.x(serialDesc, 17, self.deceased);
        }
        output.h(serialDesc, 18, CricketPlayerInfo$$serializer.INSTANCE, self.cricketPlayerInfo);
        output.h(serialDesc, 19, a7aVar, self.managerId);
        Money$$serializer money$$serializer = Money$$serializer.INSTANCE;
        output.h(serialDesc, 20, money$$serializer, self.marketValueRaw);
        output.h(serialDesc, 21, money$$serializer, self.proposedMarketValueRaw);
        output.h(serialDesc, 22, lkbVar, self.contractUntilTimestamp);
        output.h(serialDesc, 23, Injury$$serializer.INSTANCE, self.injury);
        output.h(serialDesc, 24, FieldTranslations$$serializer.INSTANCE, self.fieldTranslations);
        output.h(serialDesc, 25, GenderSerializer.INSTANCE, self.gender);
        if (output.o(serialDesc) || self.disabled) {
            output.x(serialDesc, 26, self.disabled);
        }
        output.h(serialDesc, 27, (KSerializer) joaVarArr[27].getValue(), self.positionsDetailed);
        output.h(serialDesc, 28, (KSerializer) joaVarArr[28].getValue(), self.activeSeasonSuspensions);
        if (output.o(serialDesc) || self.salary != null) {
            output.h(serialDesc, 29, money$$serializer, self.salary);
        }
        if (output.o(serialDesc) || self.status != null) {
            output.h(serialDesc, 30, uhiVar, self.status);
        }
        if (output.o(serialDesc) || self.primaryPosition != null) {
            output.h(serialDesc, 31, uhiVar, self.primaryPosition);
        }
        if (output.o(serialDesc) || self.batHand != null) {
            output.h(serialDesc, 32, uhiVar, self.batHand);
        }
        if (output.o(serialDesc) || self.throwHand != null) {
            output.h(serialDesc, 33, uhiVar, self.throwHand);
        }
        if (output.o(serialDesc) || self.birthCity != null) {
            output.h(serialDesc, 34, uhiVar, self.birthCity);
        }
        if (output.o(serialDesc) || self.birthPlace != null) {
            output.h(serialDesc, 35, uhiVar, self.birthPlace);
        }
        if (output.o(serialDesc) || self.underage) {
            output.x(serialDesc, 36, self.underage);
        }
        if (output.o(serialDesc) || self.getIsRecent()) {
            output.x(serialDesc, 37, self.getIsRecent());
        }
        if (output.o(serialDesc) || self.isTopRated) {
            output.x(serialDesc, 38, self.isTopRated);
        }
        if (!output.o(serialDesc)) {
            String webUrl = self.getWebUrl();
            if (self.getSportSlug() != null) {
                String sportSlug = self.getSportSlug();
                String str = self.slug;
                int id = self.getId();
                StringBuilder s = mz1.s("/", sportSlug, "/player/", str, "/");
                s.append(id);
                l = s.toString();
            } else {
                l = dmi.l(self.getId(), "/player/", self.slug, "/");
            }
            if (Intrinsics.c(webUrl, l)) {
                return;
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
    public final Long getDateOfDeathTimestamp() {
        return this.dateOfDeathTimestamp;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getJerseyNumber() {
        return this.jerseyNumber;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getWeight() {
        return this.weight;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getPreferredFoot() {
        return this.preferredFoot;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getRetired() {
        return this.retired;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getDeceased() {
        return this.deceased;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final CricketPlayerInfo getCricketPlayerInfo() {
        return this.cricketPlayerInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getManagerId() {
        return this.managerId;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Money getMarketValueRaw() {
        return this.marketValueRaw;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Money getProposedMarketValueRaw() {
        return this.proposedMarketValueRaw;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Long getContractUntilTimestamp() {
        return this.contractUntilTimestamp;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Injury getInjury() {
        return this.injury;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    @Nullable
    public final List<String> component28() {
        return this.positionsDetailed;
    }

    @Nullable
    public final List<PlayerActiveSuspension> component29() {
        return this.activeSeasonSuspensions;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Money getSalary() {
        return this.salary;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final String getPrimaryPosition() {
        return this.primaryPosition;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final String getBatHand() {
        return this.batHand;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final String getThrowHand() {
        return this.throwHand;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final String getBirthCity() {
        return this.birthCity;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final String getBirthPlace() {
        return this.birthPlace;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getUnderage() {
        return this.underage;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    /* renamed from: component8, reason: from getter */
    public final long getUserCount() {
        return this.userCount;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Long getDateOfBirthTimestamp() {
        return this.dateOfBirthTimestamp;
    }

    @NotNull
    public final Player copy(int id, @NotNull String name, @Nullable String firstName, @Nullable String lastName, @Nullable String slug, @Nullable String shortName, @Nullable String position, long userCount, @Nullable Long dateOfBirthTimestamp, @Nullable Long dateOfDeathTimestamp, @Nullable Country country, @Nullable Team team, @Nullable String jerseyNumber, @Nullable Integer height, @Nullable Integer weight, @Nullable String preferredFoot, boolean retired, boolean deceased, @Nullable CricketPlayerInfo cricketPlayerInfo, @Nullable Integer managerId, @Nullable Money marketValueRaw, @Nullable Money proposedMarketValueRaw, @Nullable Long contractUntilTimestamp, @Nullable Injury injury, @Nullable FieldTranslations fieldTranslations, @Nullable Gender gender, boolean disabled, @Nullable List<String> positionsDetailed, @Nullable List<PlayerActiveSuspension> activeSeasonSuspensions, @Nullable Money salary, @Nullable String status, @Nullable String primaryPosition, @Nullable String batHand, @Nullable String throwHand, @Nullable String birthCity, @Nullable String birthPlace, boolean underage) {
        name.getClass();
        return new Player(id, name, firstName, lastName, slug, shortName, position, userCount, dateOfBirthTimestamp, dateOfDeathTimestamp, country, team, jerseyNumber, height, weight, preferredFoot, retired, deceased, cricketPlayerInfo, managerId, marketValueRaw, proposedMarketValueRaw, contractUntilTimestamp, injury, fieldTranslations, gender, disabled, positionsDetailed, activeSeasonSuspensions, salary, status, primaryPosition, batHand, throwHand, birthCity, birthPlace, underage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Player)) {
            return false;
        }
        Player player = (Player) other;
        return this.id == player.id && Intrinsics.c(this.name, player.name) && Intrinsics.c(this.firstName, player.firstName) && Intrinsics.c(this.lastName, player.lastName) && Intrinsics.c(this.slug, player.slug) && Intrinsics.c(this.shortName, player.shortName) && Intrinsics.c(this.position, player.position) && this.userCount == player.userCount && Intrinsics.c(this.dateOfBirthTimestamp, player.dateOfBirthTimestamp) && Intrinsics.c(this.dateOfDeathTimestamp, player.dateOfDeathTimestamp) && Intrinsics.c(this.country, player.country) && Intrinsics.c(this.team, player.team) && Intrinsics.c(this.jerseyNumber, player.jerseyNumber) && Intrinsics.c(this.height, player.height) && Intrinsics.c(this.weight, player.weight) && Intrinsics.c(this.preferredFoot, player.preferredFoot) && this.retired == player.retired && this.deceased == player.deceased && Intrinsics.c(this.cricketPlayerInfo, player.cricketPlayerInfo) && Intrinsics.c(this.managerId, player.managerId) && Intrinsics.c(this.marketValueRaw, player.marketValueRaw) && Intrinsics.c(this.proposedMarketValueRaw, player.proposedMarketValueRaw) && Intrinsics.c(this.contractUntilTimestamp, player.contractUntilTimestamp) && Intrinsics.c(this.injury, player.injury) && Intrinsics.c(this.fieldTranslations, player.fieldTranslations) && this.gender == player.gender && this.disabled == player.disabled && Intrinsics.c(this.positionsDetailed, player.positionsDetailed) && Intrinsics.c(this.activeSeasonSuspensions, player.activeSeasonSuspensions) && Intrinsics.c(this.salary, player.salary) && Intrinsics.c(this.status, player.status) && Intrinsics.c(this.primaryPosition, player.primaryPosition) && Intrinsics.c(this.batHand, player.batHand) && Intrinsics.c(this.throwHand, player.throwHand) && Intrinsics.c(this.birthCity, player.birthCity) && Intrinsics.c(this.birthPlace, player.birthPlace) && this.underage == player.underage;
    }

    @Nullable
    public final List<PlayerActiveSuspension> getActiveSeasonSuspensions() {
        return this.activeSeasonSuspensions;
    }

    @Nullable
    public final String getBatHand() {
        return this.batHand;
    }

    @Nullable
    public final String getBirthCity() {
        return this.birthCity;
    }

    @Nullable
    public final String getBirthPlace() {
        return this.birthPlace;
    }

    @Nullable
    public final Long getContractUntilTimestamp() {
        return this.contractUntilTimestamp;
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    public final CricketPlayerInfo getCricketPlayerInfo() {
        return this.cricketPlayerInfo;
    }

    @Nullable
    public final Long getDateOfBirthTimestamp() {
        return this.dateOfBirthTimestamp;
    }

    @Nullable
    public final Long getDateOfDeathTimestamp() {
        return this.dateOfDeathTimestamp;
    }

    public final boolean getDeceased() {
        return this.deceased;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Injury getInjury() {
        return this.injury;
    }

    @Nullable
    public final String getJerseyNumber() {
        return this.jerseyNumber;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final Integer getManagerId() {
        return this.managerId;
    }

    @Nullable
    public final Money getMarketValueRaw() {
        return this.marketValueRaw;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    public final List<String> getPositionsDetailed() {
        return this.positionsDetailed;
    }

    @Nullable
    public final String getPreferredFoot() {
        return this.preferredFoot;
    }

    @Nullable
    public final String getPrimaryPosition() {
        return this.primaryPosition;
    }

    @Nullable
    public final Money getProposedMarketValueRaw() {
        return this.proposedMarketValueRaw;
    }

    public final boolean getRetired() {
        return this.retired;
    }

    @Nullable
    public final Money getSalary() {
        return this.salary;
    }

    @Nullable
    public final String getShortName() {
        return this.shortName;
    }

    @Nullable
    public final String getSlug() {
        return this.slug;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    @Nullable
    public String getSportSlug() {
        Team team = this.team;
        if (team != null) {
            return team.getSportSlug();
        }
        return null;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final String getThrowHand() {
        return this.throwHand;
    }

    public final boolean getUnderage() {
        return this.underage;
    }

    public final long getUserCount() {
        return this.userCount;
    }

    @Override // com.sofascore.model.mvvm.IUrlSharing
    @NotNull
    public String getWebUrl() {
        return this.webUrl;
    }

    @Nullable
    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.name);
        String str = this.firstName;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.slug;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shortName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.position;
        int c2 = ljg.c((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.userCount);
        Long l = this.dateOfBirthTimestamp;
        int hashCode5 = (c2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.dateOfDeathTimestamp;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Country country = this.country;
        int hashCode7 = (hashCode6 + (country == null ? 0 : country.hashCode())) * 31;
        Team team = this.team;
        int hashCode8 = (hashCode7 + (team == null ? 0 : team.hashCode())) * 31;
        String str6 = this.jerseyNumber;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.height;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.weight;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.preferredFoot;
        int e = dmi.e(dmi.e((hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.retired), 31, this.deceased);
        CricketPlayerInfo cricketPlayerInfo = this.cricketPlayerInfo;
        int hashCode12 = (e + (cricketPlayerInfo == null ? 0 : cricketPlayerInfo.hashCode())) * 31;
        Integer num3 = this.managerId;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Money money = this.marketValueRaw;
        int hashCode14 = (hashCode13 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.proposedMarketValueRaw;
        int hashCode15 = (hashCode14 + (money2 == null ? 0 : money2.hashCode())) * 31;
        Long l3 = this.contractUntilTimestamp;
        int hashCode16 = (hashCode15 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Injury injury = this.injury;
        int hashCode17 = (hashCode16 + (injury == null ? 0 : injury.hashCode())) * 31;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        int hashCode18 = (hashCode17 + (fieldTranslations == null ? 0 : fieldTranslations.hashCode())) * 31;
        Gender gender = this.gender;
        int e2 = dmi.e((hashCode18 + (gender == null ? 0 : gender.hashCode())) * 31, 31, this.disabled);
        List<String> list = this.positionsDetailed;
        int hashCode19 = (e2 + (list == null ? 0 : list.hashCode())) * 31;
        List<PlayerActiveSuspension> list2 = this.activeSeasonSuspensions;
        int hashCode20 = (hashCode19 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Money money3 = this.salary;
        int hashCode21 = (hashCode20 + (money3 == null ? 0 : money3.hashCode())) * 31;
        String str8 = this.status;
        int hashCode22 = (hashCode21 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.primaryPosition;
        int hashCode23 = (hashCode22 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.batHand;
        int hashCode24 = (hashCode23 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.throwHand;
        int hashCode25 = (hashCode24 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.birthCity;
        int hashCode26 = (hashCode25 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.birthPlace;
        return Boolean.hashCode(this.underage) + ((hashCode26 + (str13 != null ? str13.hashCode() : 0)) * 31);
    }

    @Override // com.sofascore.model.mvvm.IRecent
    /* renamed from: isRecent, reason: from getter */
    public boolean getIsRecent() {
        return this.isRecent;
    }

    /* renamed from: isTopRated, reason: from getter */
    public final boolean getIsTopRated() {
        return this.isTopRated;
    }

    public final void setJerseyNumber(@Nullable String str) {
        this.jerseyNumber = str;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public void setRecent(boolean z) {
        this.isRecent = z;
    }

    public final void setTopRated(boolean z) {
        this.isTopRated = z;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.slug;
        String str5 = this.shortName;
        String str6 = this.position;
        long j = this.userCount;
        Long l = this.dateOfBirthTimestamp;
        Long l2 = this.dateOfDeathTimestamp;
        Country country = this.country;
        Team team = this.team;
        String str7 = this.jerseyNumber;
        Integer num = this.height;
        Integer num2 = this.weight;
        String str8 = this.preferredFoot;
        boolean z = this.retired;
        boolean z2 = this.deceased;
        CricketPlayerInfo cricketPlayerInfo = this.cricketPlayerInfo;
        Integer num3 = this.managerId;
        Money money = this.marketValueRaw;
        Money money2 = this.proposedMarketValueRaw;
        Long l3 = this.contractUntilTimestamp;
        Injury injury = this.injury;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        Gender gender = this.gender;
        boolean z3 = this.disabled;
        List<String> list = this.positionsDetailed;
        List<PlayerActiveSuspension> list2 = this.activeSeasonSuspensions;
        Money money3 = this.salary;
        String str9 = this.status;
        String str10 = this.primaryPosition;
        String str11 = this.batHand;
        String str12 = this.throwHand;
        String str13 = this.birthCity;
        String str14 = this.birthPlace;
        boolean z4 = this.underage;
        StringBuilder t = dmi.t(i, "Player(id=", ", name=", str, ", firstName=");
        bf3.v(t, str2, ", lastName=", str3, ", slug=");
        bf3.v(t, str4, ", shortName=", str5, ", position=");
        i.n(j, str6, ", userCount=", t);
        t.append(", dateOfBirthTimestamp=");
        t.append(l);
        t.append(", dateOfDeathTimestamp=");
        t.append(l2);
        t.append(", country=");
        t.append(country);
        t.append(", team=");
        t.append(team);
        t.append(", jerseyNumber=");
        t.append(str7);
        t.append(", height=");
        t.append(num);
        fn0.x(num2, ", weight=", ", preferredFoot=", str8, t);
        fn0.y(", retired=", ", deceased=", t, z, z2);
        t.append(", cricketPlayerInfo=");
        t.append(cricketPlayerInfo);
        t.append(", managerId=");
        t.append(num3);
        t.append(", marketValueRaw=");
        t.append(money);
        t.append(", proposedMarketValueRaw=");
        t.append(money2);
        t.append(", contractUntilTimestamp=");
        t.append(l3);
        t.append(", injury=");
        t.append(injury);
        t.append(", fieldTranslations=");
        t.append(fieldTranslations);
        t.append(", gender=");
        t.append(gender);
        t.append(", disabled=");
        t.append(z3);
        t.append(", positionsDetailed=");
        t.append(list);
        t.append(", activeSeasonSuspensions=");
        t.append(list2);
        t.append(", salary=");
        t.append(money3);
        bf3.v(t, ", status=", str9, ", primaryPosition=", str10);
        bf3.v(t, ", batHand=", str11, ", throwHand=", str12);
        bf3.v(t, ", birthCity=", str13, ", birthPlace=", str14);
        t.append(", underage=");
        t.append(z4);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Player$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Player;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Player$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Player(int i, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j, @Nullable Long l, @Nullable Long l2, @Nullable Country country, @Nullable Team team, @Nullable String str7, @Nullable Integer num, @Nullable Integer num2, @Nullable String str8, boolean z, boolean z2, @Nullable CricketPlayerInfo cricketPlayerInfo, @Nullable Integer num3, @Nullable Money money, @Nullable Money money2, @Nullable Long l3, @Nullable Injury injury, @Nullable FieldTranslations fieldTranslations, @Nullable Gender gender, boolean z3, @Nullable List<String> list, @Nullable List<PlayerActiveSuspension> list2, @Nullable Money money3, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, boolean z4) {
        String l4;
        str.getClass();
        this.id = i;
        this.name = str;
        this.firstName = str2;
        this.lastName = str3;
        this.slug = str4;
        this.shortName = str5;
        this.position = str6;
        this.userCount = j;
        this.dateOfBirthTimestamp = l;
        this.dateOfDeathTimestamp = l2;
        this.country = country;
        this.team = team;
        this.jerseyNumber = str7;
        this.height = num;
        this.weight = num2;
        this.preferredFoot = str8;
        this.retired = z;
        this.deceased = z2;
        this.cricketPlayerInfo = cricketPlayerInfo;
        this.managerId = num3;
        this.marketValueRaw = money;
        this.proposedMarketValueRaw = money2;
        this.contractUntilTimestamp = l3;
        this.injury = injury;
        this.fieldTranslations = fieldTranslations;
        this.gender = gender;
        this.disabled = z3;
        this.positionsDetailed = list;
        this.activeSeasonSuspensions = list2;
        this.salary = money3;
        this.status = str9;
        this.primaryPosition = str10;
        this.batHand = str11;
        this.throwHand = str12;
        this.birthCity = str13;
        this.birthPlace = str14;
        this.underage = z4;
        if (getSportSlug() != null) {
            String sportSlug = getSportSlug();
            int id = getId();
            StringBuilder s = mz1.s("/", sportSlug, "/player/", str4, "/");
            s.append(id);
            l4 = s.toString();
        } else {
            l4 = dmi.l(getId(), "/player/", str4, "/");
        }
        this.webUrl = l4;
    }

    @wx4
    public static /* synthetic */ void getName$annotations() {
    }

    @wx4
    public static /* synthetic */ void getShortName$annotations() {
    }

    public /* synthetic */ Player(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, Long l, Long l2, Country country, Team team, String str7, Integer num, Integer num2, String str8, boolean z, boolean z2, CricketPlayerInfo cricketPlayerInfo, Integer num3, Money money, Money money2, Long l3, Injury injury, FieldTranslations fieldTranslations, Gender gender, boolean z3, List list, List list2, Money money3, String str9, String str10, String str11, String str12, String str13, String str14, boolean z4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, str6, j, l, l2, country, team, str7, num, num2, str8, (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z, (i2 & 131072) != 0 ? false : z2, cricketPlayerInfo, num3, money, money2, l3, injury, fieldTranslations, gender, (i2 & 67108864) != 0 ? false : z3, list, list2, (i2 & 536870912) != 0 ? null : money3, (i2 & 1073741824) != 0 ? null : str9, (i2 & Integer.MIN_VALUE) != 0 ? null : str10, (i3 & 1) != 0 ? null : str11, (i3 & 2) != 0 ? null : str12, (i3 & 4) != 0 ? null : str13, (i3 & 8) != 0 ? null : str14, (i3 & 16) != 0 ? false : z4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Player(int i, @NotNull String str, long j, @Nullable Team team, @Nullable FieldTranslations fieldTranslations) {
        this(i, str, null, null, null, null, null, j, null, null, null, team, null, null, null, null, false, false, null, null, null, null, null, null, fieldTranslations, null, false, null, null, null, null, null, null, null, null, null, false, 0, 31, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Player(int i, @NotNull String str, @Nullable String str2, long j, @Nullable Team team) {
        this(i, str, null, null, null, str2, null, j, null, null, null, team, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, 0, 31, null);
        str.getClass();
    }
}
