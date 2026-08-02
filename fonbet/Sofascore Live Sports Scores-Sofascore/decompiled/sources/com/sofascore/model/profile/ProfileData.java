package com.sofascore.model.profile;

import com.appsflyer.internal.i;
import com.mbridge.msdk.foundation.entity.b;
import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.newNetwork.HeadResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import defpackage.a7a;
import defpackage.bxe;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.h75;
import defpackage.joa;
import defpackage.lkb;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.s8f;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bE\b\u0087\b\u0018\u0000 Î\u00012\u00020\u0001:\u0004Ï\u0001Î\u0001B\u0097\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\b\u00101\u001a\u0004\u0018\u00010\u0011\u0012\b\u00102\u001a\u0004\u0018\u00010\u0011\u0012\b\u00103\u001a\u0004\u0018\u00010\u0011\u0012\b\u00104\u001a\u0004\u0018\u00010\u0011\u0012\b\u00105\u001a\u0004\u0018\u00010\u0011\u0012\b\u00106\u001a\u0004\u0018\u00010\u0015\u0012\b\u00107\u001a\u0004\u0018\u00010\u0015\u0012\b\u00108\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b9\u0010:BÉ\u0004\b\u0010\u0012\u0006\u0010;\u001a\u00020\u0011\u0012\u0006\u0010<\u001a\u00020\u0011\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\u0010@\u001a\u0004\u0018\u00010?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e\u0012\b\u00101\u001a\u0004\u0018\u00010\u0011\u0012\b\u00102\u001a\u0004\u0018\u00010\u0011\u0012\b\u00103\u001a\u0004\u0018\u00010\u0011\u0012\b\u00104\u001a\u0004\u0018\u00010\u0011\u0012\b\u00105\u001a\u0004\u0018\u00010\u0011\u0012\b\u00106\u001a\u0004\u0018\u00010\u0015\u0012\b\u00107\u001a\u0004\u0018\u00010\u0015\u0012\b\u00108\u001a\u0004\u0018\u00010\f\u0012\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\b9\u0010CJ\r\u0010D\u001a\u00020\u0015¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010GJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010GJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u0010GJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u0010GJ\u0012\u0010T\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bT\u0010QJ\u0010\u0010U\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b]\u0010QJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b^\u0010ZJ\u0010\u0010_\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b_\u0010EJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b`\u0010GJ\u0010\u0010a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\ba\u0010GJ\u0018\u0010b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0018\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bd\u0010cJ\u0018\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\be\u0010cJ\u0018\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bf\u0010cJ\u0018\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bg\u0010cJ\u0018\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bh\u0010cJ\u0018\u0010i\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bi\u0010cJ\u0018\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bj\u0010cJ\u0018\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bk\u0010cJ\u0018\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bl\u0010cJ\u0012\u0010m\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0012\u0010o\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bo\u0010nJ\u0012\u0010p\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bp\u0010nJ\u0012\u0010q\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bq\u0010ZJ\u0018\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\br\u0010cJ\u0018\u0010s\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bs\u0010cJ\u0018\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bt\u0010cJ\u0018\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bu\u0010cJ\u0012\u0010v\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bv\u0010nJ\u0012\u0010w\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bw\u0010nJ\u0012\u0010x\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bx\u0010nJ\u0012\u0010y\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\by\u0010nJ\u0012\u0010z\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bz\u0010nJ\u0012\u0010{\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b{\u0010ZJ\u0012\u0010|\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b|\u0010ZJ\u0012\u0010}\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b}\u0010QJú\u0004\u0010~\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00108\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b~\u0010\u007fJ\u0012\u0010\u0080\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\b\u0080\u0001\u0010GJ\u0012\u0010\u0081\u0001\u001a\u00020\u0011HÖ\u0001¢\u0006\u0005\b\u0081\u0001\u0010VJ\u001f\u0010\u0084\u0001\u001a\u00020\u00152\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u0001HÖ\u0003¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J0\u0010\u008e\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u00002\b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010GR\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0004\u0010\u008f\u0001\u001a\u0005\b\u0091\u0001\u0010GR\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u008f\u0001\u001a\u0005\b\u0092\u0001\u0010GR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010KR\u001b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b\t\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u0010MR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010OR\u001b\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\b\r\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010QR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u008f\u0001\u001a\u0005\b\u009b\u0001\u0010GR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u008f\u0001\u001a\u0005\b\u009c\u0001\u0010GR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010\u0099\u0001\u001a\u0005\b\u009d\u0001\u0010QR\u0019\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010\u009e\u0001\u001a\u0005\b\u009f\u0001\u0010VR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010 \u0001\u001a\u0005\b¡\u0001\u0010XR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010¢\u0001\u001a\u0005\b£\u0001\u0010ZR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010\\R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010\u0099\u0001\u001a\u0005\b¦\u0001\u0010QR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010¢\u0001\u001a\u0005\b§\u0001\u0010ZR\u0019\u0010\u001b\u001a\u00020\u00158\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010¨\u0001\u001a\u0005\b©\u0001\u0010ER\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u008f\u0001\u001a\u0005\bª\u0001\u0010GR\u0019\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u008f\u0001\u001a\u0005\b«\u0001\u0010GR!\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010cR!\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b \u0010¬\u0001\u001a\u0005\b®\u0001\u0010cR!\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b!\u0010¬\u0001\u001a\u0005\b¯\u0001\u0010cR!\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b\"\u0010¬\u0001\u001a\u0005\b°\u0001\u0010cR!\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b#\u0010¬\u0001\u001a\u0005\b±\u0001\u0010cR!\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b$\u0010¬\u0001\u001a\u0005\b²\u0001\u0010cR!\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b%\u0010¬\u0001\u001a\u0005\b³\u0001\u0010cR!\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b&\u0010¬\u0001\u001a\u0005\b´\u0001\u0010cR!\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b'\u0010¬\u0001\u001a\u0005\bµ\u0001\u0010cR!\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b(\u0010¬\u0001\u001a\u0005\b¶\u0001\u0010cR\u001b\u0010)\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u000e\n\u0005\b)\u0010·\u0001\u001a\u0005\b¸\u0001\u0010nR\u001b\u0010*\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u000e\n\u0005\b*\u0010·\u0001\u001a\u0005\b¹\u0001\u0010nR\u001b\u0010+\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u000e\n\u0005\b+\u0010·\u0001\u001a\u0005\bº\u0001\u0010nR\u001b\u0010,\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000e\n\u0005\b,\u0010¢\u0001\u001a\u0005\b»\u0001\u0010ZR!\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b-\u0010¬\u0001\u001a\u0005\b¼\u0001\u0010cR!\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b.\u0010¬\u0001\u001a\u0005\b½\u0001\u0010cR!\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b/\u0010¬\u0001\u001a\u0005\b¾\u0001\u0010cR!\u00100\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b0\u0010¬\u0001\u001a\u0005\b¿\u0001\u0010cR\u001b\u00101\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u000e\n\u0005\b1\u0010·\u0001\u001a\u0005\bÀ\u0001\u0010nR\u001b\u00102\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u000e\n\u0005\b2\u0010·\u0001\u001a\u0005\bÁ\u0001\u0010nR\u001b\u00103\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u000e\n\u0005\b3\u0010·\u0001\u001a\u0005\bÂ\u0001\u0010nR\u001b\u00104\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u000e\n\u0005\b4\u0010·\u0001\u001a\u0005\bÃ\u0001\u0010nR\u001b\u00105\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u000e\n\u0005\b5\u0010·\u0001\u001a\u0005\bÄ\u0001\u0010nR\u001b\u00106\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000e\n\u0005\b6\u0010¢\u0001\u001a\u0005\bÅ\u0001\u0010ZR\u001b\u00107\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000e\n\u0005\b7\u0010¢\u0001\u001a\u0005\bÆ\u0001\u0010ZR\u001b\u00108\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\b8\u0010\u0099\u0001\u001a\u0005\bÇ\u0001\u0010QR\u0014\u0010Ê\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0014\u0010Ì\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bË\u0001\u0010É\u0001R\u0013\u0010Í\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010E¨\u0006Ð\u0001"}, d2 = {"Lcom/sofascore/model/profile/ProfileData;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "id", "nickname", "imageURL", "Lcom/sofascore/model/profile/VoteStatisticsWrapper;", "voteStatistics", "Lcom/sofascore/model/profile/CrowdsourcingAggregates;", "userCrowdsourcingAggregates", "Lcom/sofascore/model/profile/EditorAggregates;", "userEditorScoreAggregates", "", "createdTimestamp", "chatRole", "chatFlag", "updatedTimestamp", "", "tvContributions", "", "credibilityScore", "", "activeCrowdsourcer", "Lcom/sofascore/model/profile/UserBadge;", "userBadge", "weeklyChallengeDailyBonusUsedAtTimestamp", b.JSON_KEY_ADS, "editor", "editorName", "providerType", "", "events", "teams", "leagues", "mutedEvents", "players", "pinnedLeagues", "stages", "uniqueStages", "mutedStages", "fantasyCompetitions", "leaderboardId", "previousLeaderboardId", "maxLeagueLevel", "fantasyUser", "favoriteEvents", "favoriteTeams", "favoriteLeagues", "favoritePlayers", "weeklyChallengePreviousWeeklyStreak", "weeklyChallengeCurrentWeeklyStreak", "weeklyChallengeMaxWeeklyStreak", "weeklyChallengeMaxFinishedLeagueLevel", "weeklyChallengeBestRank", "hasPremium", "dataSharingOptOut", "premiumTokenExpirationTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/profile/VoteStatisticsWrapper;Lcom/sofascore/model/profile/CrowdsourcingAggregates;Lcom/sofascore/model/profile/EditorAggregates;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Double;Ljava/lang/Boolean;Lcom/sofascore/model/profile/UserBadge;Ljava/lang/Long;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;)V", "seen0", "seen1", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/profile/VoteStatisticsWrapper;Lcom/sofascore/model/profile/CrowdsourcingAggregates;Lcom/sofascore/model/profile/EditorAggregates;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Double;Ljava/lang/Boolean;Lcom/sofascore/model/profile/UserBadge;Ljava/lang/Long;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lt5h;)V", "hasAds", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/sofascore/model/profile/VoteStatisticsWrapper;", "component5", "()Lcom/sofascore/model/profile/CrowdsourcingAggregates;", "component6", "()Lcom/sofascore/model/profile/EditorAggregates;", "component7", "()Ljava/lang/Long;", "component8", "component9", "component10", "component11", "()I", "component12", "()Ljava/lang/Double;", "component13", "()Ljava/lang/Boolean;", "component14", "()Lcom/sofascore/model/profile/UserBadge;", "component15", "component16", "component17", "component18", "component19", "component20", "()Ljava/util/List;", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "()Ljava/lang/Integer;", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/profile/VoteStatisticsWrapper;Lcom/sofascore/model/profile/CrowdsourcingAggregates;Lcom/sofascore/model/profile/EditorAggregates;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Double;Ljava/lang/Boolean;Lcom/sofascore/model/profile/UserBadge;Ljava/lang/Long;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/sofascore/model/profile/ProfileData;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/ProfileData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getNickname", "getImageURL", "Lcom/sofascore/model/profile/VoteStatisticsWrapper;", "getVoteStatistics", "Lcom/sofascore/model/profile/CrowdsourcingAggregates;", "getUserCrowdsourcingAggregates", "Lcom/sofascore/model/profile/EditorAggregates;", "getUserEditorScoreAggregates", "Ljava/lang/Long;", "getCreatedTimestamp", "getChatRole", "getChatFlag", "getUpdatedTimestamp", "I", "getTvContributions", "Ljava/lang/Double;", "getCredibilityScore", "Ljava/lang/Boolean;", "getActiveCrowdsourcer", "Lcom/sofascore/model/profile/UserBadge;", "getUserBadge", "getWeeklyChallengeDailyBonusUsedAtTimestamp", "getAds", "Z", "getEditor", "getEditorName", "getProviderType", "Ljava/util/List;", "getEvents", "getTeams", "getLeagues", "getMutedEvents", "getPlayers", "getPinnedLeagues", "getStages", "getUniqueStages", "getMutedStages", "getFantasyCompetitions", "Ljava/lang/Integer;", "getLeaderboardId", "getPreviousLeaderboardId", "getMaxLeagueLevel", "getFantasyUser", "getFavoriteEvents", "getFavoriteTeams", "getFavoriteLeagues", "getFavoritePlayers", "getWeeklyChallengePreviousWeeklyStreak", "getWeeklyChallengeCurrentWeeklyStreak", "getWeeklyChallengeMaxWeeklyStreak", "getWeeklyChallengeMaxFinishedLeagueLevel", "getWeeklyChallengeBestRank", "getHasPremium", "getDataSharingOptOut", "getPremiumTokenExpirationTimestamp", "getJoinDate", "()J", "joinDate", "getSyncTimestamp", "syncTimestamp", "isActiveCrowdsourcer", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ProfileData extends NetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean activeCrowdsourcer;

    @Nullable
    private final Boolean ads;

    @Nullable
    private final String chatFlag;

    @Nullable
    private final String chatRole;

    @Nullable
    private final Long createdTimestamp;

    @Nullable
    private final Double credibilityScore;

    @Nullable
    private final Boolean dataSharingOptOut;
    private final boolean editor;

    @Nullable
    private final String editorName;

    @Nullable
    private final List<Integer> events;

    @Nullable
    private final List<Integer> fantasyCompetitions;

    @Nullable
    private final Boolean fantasyUser;

    @Nullable
    private final List<Integer> favoriteEvents;

    @Nullable
    private final List<Integer> favoriteLeagues;

    @Nullable
    private final List<Integer> favoritePlayers;

    @Nullable
    private final List<Integer> favoriteTeams;

    @Nullable
    private final Boolean hasPremium;

    @Nullable
    private final String id;

    @Nullable
    private final String imageURL;

    @Nullable
    private final Integer leaderboardId;

    @Nullable
    private final List<Integer> leagues;

    @Nullable
    private final Integer maxLeagueLevel;

    @Nullable
    private final List<Integer> mutedEvents;

    @Nullable
    private final List<Integer> mutedStages;

    @Nullable
    private final String nickname;

    @Nullable
    private final List<Integer> pinnedLeagues;

    @Nullable
    private final List<Integer> players;

    @Nullable
    private final Long premiumTokenExpirationTimestamp;

    @Nullable
    private final Integer previousLeaderboardId;

    @NotNull
    private final String providerType;

    @Nullable
    private final List<Integer> stages;

    @Nullable
    private final List<Integer> teams;
    private final int tvContributions;

    @Nullable
    private final List<Integer> uniqueStages;

    @Nullable
    private final Long updatedTimestamp;

    @Nullable
    private final UserBadge userBadge;

    @Nullable
    private final CrowdsourcingAggregates userCrowdsourcingAggregates;

    @Nullable
    private final EditorAggregates userEditorScoreAggregates;

    @Nullable
    private final VoteStatisticsWrapper voteStatistics;

    @Nullable
    private final Integer weeklyChallengeBestRank;

    @Nullable
    private final Integer weeklyChallengeCurrentWeeklyStreak;

    @Nullable
    private final Long weeklyChallengeDailyBonusUsedAtTimestamp;

    @Nullable
    private final Integer weeklyChallengeMaxFinishedLeagueLevel;

    @Nullable
    private final Integer weeklyChallengeMaxWeeklyStreak;

    @Nullable
    private final Integer weeklyChallengePreviousWeeklyStreak;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new bxe(26)), ypa.a(ysaVar, new s8f(5)), ypa.a(ysaVar, new s8f(6)), ypa.a(ysaVar, new s8f(7)), ypa.a(ysaVar, new s8f(8)), ypa.a(ysaVar, new s8f(9)), ypa.a(ysaVar, new bxe(27)), ypa.a(ysaVar, new bxe(28)), ypa.a(ysaVar, new bxe(29)), ypa.a(ysaVar, new s8f(0)), null, null, null, null, ypa.a(ysaVar, new s8f(1)), ypa.a(ysaVar, new s8f(2)), ypa.a(ysaVar, new s8f(3)), ypa.a(ysaVar, new s8f(4)), null, null, null, null, null, null, null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileData(int i, int i2, HeadResponse headResponse, ErrorResponse errorResponse, String str, String str2, String str3, VoteStatisticsWrapper voteStatisticsWrapper, CrowdsourcingAggregates crowdsourcingAggregates, EditorAggregates editorAggregates, Long l, String str4, String str5, Long l2, int i3, Double d, Boolean bool, UserBadge userBadge, Long l3, Boolean bool2, boolean z, String str6, String str7, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, Integer num, Integer num2, Integer num3, Boolean bool3, List list11, List list12, List list13, List list14, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Boolean bool4, Boolean bool5, Long l4, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if ((-4 != (i & (-4))) || (32767 != (i2 & 32767))) {
            oea.y(new int[]{i, i2}, new int[]{-4, 32767}, ProfileData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.nickname = str2;
        this.imageURL = str3;
        this.voteStatistics = voteStatisticsWrapper;
        this.userCrowdsourcingAggregates = crowdsourcingAggregates;
        this.userEditorScoreAggregates = editorAggregates;
        this.createdTimestamp = l;
        this.chatRole = str4;
        this.chatFlag = str5;
        this.updatedTimestamp = l2;
        this.tvContributions = i3;
        this.credibilityScore = d;
        this.activeCrowdsourcer = bool;
        this.userBadge = userBadge;
        this.weeklyChallengeDailyBonusUsedAtTimestamp = l3;
        this.ads = bool2;
        this.editor = z;
        this.editorName = str6;
        this.providerType = str7;
        this.events = list;
        this.teams = list2;
        this.leagues = list3;
        this.mutedEvents = list4;
        this.players = list5;
        this.pinnedLeagues = list6;
        this.stages = list7;
        this.uniqueStages = list8;
        this.mutedStages = list9;
        this.fantasyCompetitions = list10;
        this.leaderboardId = num;
        this.previousLeaderboardId = num2;
        this.maxLeagueLevel = num3;
        this.fantasyUser = bool3;
        this.favoriteEvents = list11;
        this.favoriteTeams = list12;
        this.favoriteLeagues = list13;
        this.favoritePlayers = list14;
        this.weeklyChallengePreviousWeeklyStreak = num4;
        this.weeklyChallengeCurrentWeeklyStreak = num5;
        this.weeklyChallengeMaxWeeklyStreak = num6;
        this.weeklyChallengeMaxFinishedLeagueLevel = num7;
        this.weeklyChallengeBestRank = num8;
        this.hasPremium = bool4;
        this.dataSharingOptOut = bool5;
        this.premiumTokenExpirationTimestamp = l4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(a7a.a, 0);
    }

    public static final /* synthetic */ void write$Self$model_release(ProfileData self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.id);
        output.h(serialDesc, 3, uhiVar, self.nickname);
        output.h(serialDesc, 4, uhiVar, self.imageURL);
        output.h(serialDesc, 5, VoteStatisticsWrapper$$serializer.INSTANCE, self.voteStatistics);
        output.h(serialDesc, 6, CrowdsourcingAggregates$$serializer.INSTANCE, self.userCrowdsourcingAggregates);
        output.h(serialDesc, 7, EditorAggregates$$serializer.INSTANCE, self.userEditorScoreAggregates);
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 8, lkbVar, self.createdTimestamp);
        output.h(serialDesc, 9, uhiVar, self.chatRole);
        output.h(serialDesc, 10, uhiVar, self.chatFlag);
        output.h(serialDesc, 11, lkbVar, self.updatedTimestamp);
        output.u(12, self.tvContributions, serialDesc);
        output.h(serialDesc, 13, h75.a, self.credibilityScore);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 14, gz1Var, self.activeCrowdsourcer);
        output.h(serialDesc, 15, UserBadgeSerializer.INSTANCE, self.userBadge);
        output.h(serialDesc, 16, lkbVar, self.weeklyChallengeDailyBonusUsedAtTimestamp);
        output.h(serialDesc, 17, gz1Var, self.ads);
        output.x(serialDesc, 18, self.editor);
        output.h(serialDesc, 19, uhiVar, self.editorName);
        output.y(serialDesc, 20, self.providerType);
        output.h(serialDesc, 21, (KSerializer) joaVarArr[21].getValue(), self.events);
        output.h(serialDesc, 22, (KSerializer) joaVarArr[22].getValue(), self.teams);
        output.h(serialDesc, 23, (KSerializer) joaVarArr[23].getValue(), self.leagues);
        output.h(serialDesc, 24, (KSerializer) joaVarArr[24].getValue(), self.mutedEvents);
        output.h(serialDesc, 25, (KSerializer) joaVarArr[25].getValue(), self.players);
        output.h(serialDesc, 26, (KSerializer) joaVarArr[26].getValue(), self.pinnedLeagues);
        output.h(serialDesc, 27, (KSerializer) joaVarArr[27].getValue(), self.stages);
        output.h(serialDesc, 28, (KSerializer) joaVarArr[28].getValue(), self.uniqueStages);
        output.h(serialDesc, 29, (KSerializer) joaVarArr[29].getValue(), self.mutedStages);
        output.h(serialDesc, 30, (KSerializer) joaVarArr[30].getValue(), self.fantasyCompetitions);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 31, a7aVar, self.leaderboardId);
        output.h(serialDesc, 32, a7aVar, self.previousLeaderboardId);
        output.h(serialDesc, 33, a7aVar, self.maxLeagueLevel);
        output.h(serialDesc, 34, gz1Var, self.fantasyUser);
        output.h(serialDesc, 35, (KSerializer) joaVarArr[35].getValue(), self.favoriteEvents);
        output.h(serialDesc, 36, (KSerializer) joaVarArr[36].getValue(), self.favoriteTeams);
        output.h(serialDesc, 37, (KSerializer) joaVarArr[37].getValue(), self.favoriteLeagues);
        output.h(serialDesc, 38, (KSerializer) joaVarArr[38].getValue(), self.favoritePlayers);
        output.h(serialDesc, 39, a7aVar, self.weeklyChallengePreviousWeeklyStreak);
        output.h(serialDesc, 40, a7aVar, self.weeklyChallengeCurrentWeeklyStreak);
        output.h(serialDesc, 41, a7aVar, self.weeklyChallengeMaxWeeklyStreak);
        output.h(serialDesc, 42, a7aVar, self.weeklyChallengeMaxFinishedLeagueLevel);
        output.h(serialDesc, 43, a7aVar, self.weeklyChallengeBestRank);
        output.h(serialDesc, 44, gz1Var, self.hasPremium);
        output.h(serialDesc, 45, gz1Var, self.dataSharingOptOut);
        output.h(serialDesc, 46, lkbVar, self.premiumTokenExpirationTimestamp);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Long getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /* renamed from: component11, reason: from getter */
    public final int getTvContributions() {
        return this.tvContributions;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getCredibilityScore() {
        return this.credibilityScore;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Boolean getActiveCrowdsourcer() {
        return this.activeCrowdsourcer;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final UserBadge getUserBadge() {
        return this.userBadge;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Long getWeeklyChallengeDailyBonusUsedAtTimestamp() {
        return this.weeklyChallengeDailyBonusUsedAtTimestamp;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Boolean getAds() {
        return this.ads;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getEditor() {
        return this.editor;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getEditorName() {
        return this.editorName;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final String getProviderType() {
        return this.providerType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final List<Integer> component20() {
        return this.events;
    }

    @Nullable
    public final List<Integer> component21() {
        return this.teams;
    }

    @Nullable
    public final List<Integer> component22() {
        return this.leagues;
    }

    @Nullable
    public final List<Integer> component23() {
        return this.mutedEvents;
    }

    @Nullable
    public final List<Integer> component24() {
        return this.players;
    }

    @Nullable
    public final List<Integer> component25() {
        return this.pinnedLeagues;
    }

    @Nullable
    public final List<Integer> component26() {
        return this.stages;
    }

    @Nullable
    public final List<Integer> component27() {
        return this.uniqueStages;
    }

    @Nullable
    public final List<Integer> component28() {
        return this.mutedStages;
    }

    @Nullable
    public final List<Integer> component29() {
        return this.fantasyCompetitions;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getLeaderboardId() {
        return this.leaderboardId;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getPreviousLeaderboardId() {
        return this.previousLeaderboardId;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getMaxLeagueLevel() {
        return this.maxLeagueLevel;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Boolean getFantasyUser() {
        return this.fantasyUser;
    }

    @Nullable
    public final List<Integer> component34() {
        return this.favoriteEvents;
    }

    @Nullable
    public final List<Integer> component35() {
        return this.favoriteTeams;
    }

    @Nullable
    public final List<Integer> component36() {
        return this.favoriteLeagues;
    }

    @Nullable
    public final List<Integer> component37() {
        return this.favoritePlayers;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final Integer getWeeklyChallengePreviousWeeklyStreak() {
        return this.weeklyChallengePreviousWeeklyStreak;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final Integer getWeeklyChallengeCurrentWeeklyStreak() {
        return this.weeklyChallengeCurrentWeeklyStreak;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final VoteStatisticsWrapper getVoteStatistics() {
        return this.voteStatistics;
    }

    @Nullable
    /* renamed from: component40, reason: from getter */
    public final Integer getWeeklyChallengeMaxWeeklyStreak() {
        return this.weeklyChallengeMaxWeeklyStreak;
    }

    @Nullable
    /* renamed from: component41, reason: from getter */
    public final Integer getWeeklyChallengeMaxFinishedLeagueLevel() {
        return this.weeklyChallengeMaxFinishedLeagueLevel;
    }

    @Nullable
    /* renamed from: component42, reason: from getter */
    public final Integer getWeeklyChallengeBestRank() {
        return this.weeklyChallengeBestRank;
    }

    @Nullable
    /* renamed from: component43, reason: from getter */
    public final Boolean getHasPremium() {
        return this.hasPremium;
    }

    @Nullable
    /* renamed from: component44, reason: from getter */
    public final Boolean getDataSharingOptOut() {
        return this.dataSharingOptOut;
    }

    @Nullable
    /* renamed from: component45, reason: from getter */
    public final Long getPremiumTokenExpirationTimestamp() {
        return this.premiumTokenExpirationTimestamp;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final CrowdsourcingAggregates getUserCrowdsourcingAggregates() {
        return this.userCrowdsourcingAggregates;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final EditorAggregates getUserEditorScoreAggregates() {
        return this.userEditorScoreAggregates;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getChatRole() {
        return this.chatRole;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getChatFlag() {
        return this.chatFlag;
    }

    @NotNull
    public final ProfileData copy(@Nullable String id, @Nullable String nickname, @Nullable String imageURL, @Nullable VoteStatisticsWrapper voteStatistics, @Nullable CrowdsourcingAggregates userCrowdsourcingAggregates, @Nullable EditorAggregates userEditorScoreAggregates, @Nullable Long createdTimestamp, @Nullable String chatRole, @Nullable String chatFlag, @Nullable Long updatedTimestamp, int tvContributions, @Nullable Double credibilityScore, @Nullable Boolean activeCrowdsourcer, @Nullable UserBadge userBadge, @Nullable Long weeklyChallengeDailyBonusUsedAtTimestamp, @Nullable Boolean ads, boolean editor, @Nullable String editorName, @NotNull String providerType, @Nullable List<Integer> events, @Nullable List<Integer> teams, @Nullable List<Integer> leagues, @Nullable List<Integer> mutedEvents, @Nullable List<Integer> players, @Nullable List<Integer> pinnedLeagues, @Nullable List<Integer> stages, @Nullable List<Integer> uniqueStages, @Nullable List<Integer> mutedStages, @Nullable List<Integer> fantasyCompetitions, @Nullable Integer leaderboardId, @Nullable Integer previousLeaderboardId, @Nullable Integer maxLeagueLevel, @Nullable Boolean fantasyUser, @Nullable List<Integer> favoriteEvents, @Nullable List<Integer> favoriteTeams, @Nullable List<Integer> favoriteLeagues, @Nullable List<Integer> favoritePlayers, @Nullable Integer weeklyChallengePreviousWeeklyStreak, @Nullable Integer weeklyChallengeCurrentWeeklyStreak, @Nullable Integer weeklyChallengeMaxWeeklyStreak, @Nullable Integer weeklyChallengeMaxFinishedLeagueLevel, @Nullable Integer weeklyChallengeBestRank, @Nullable Boolean hasPremium, @Nullable Boolean dataSharingOptOut, @Nullable Long premiumTokenExpirationTimestamp) {
        providerType.getClass();
        return new ProfileData(id, nickname, imageURL, voteStatistics, userCrowdsourcingAggregates, userEditorScoreAggregates, createdTimestamp, chatRole, chatFlag, updatedTimestamp, tvContributions, credibilityScore, activeCrowdsourcer, userBadge, weeklyChallengeDailyBonusUsedAtTimestamp, ads, editor, editorName, providerType, events, teams, leagues, mutedEvents, players, pinnedLeagues, stages, uniqueStages, mutedStages, fantasyCompetitions, leaderboardId, previousLeaderboardId, maxLeagueLevel, fantasyUser, favoriteEvents, favoriteTeams, favoriteLeagues, favoritePlayers, weeklyChallengePreviousWeeklyStreak, weeklyChallengeCurrentWeeklyStreak, weeklyChallengeMaxWeeklyStreak, weeklyChallengeMaxFinishedLeagueLevel, weeklyChallengeBestRank, hasPremium, dataSharingOptOut, premiumTokenExpirationTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileData)) {
            return false;
        }
        ProfileData profileData = (ProfileData) other;
        return Intrinsics.c(this.id, profileData.id) && Intrinsics.c(this.nickname, profileData.nickname) && Intrinsics.c(this.imageURL, profileData.imageURL) && Intrinsics.c(this.voteStatistics, profileData.voteStatistics) && Intrinsics.c(this.userCrowdsourcingAggregates, profileData.userCrowdsourcingAggregates) && Intrinsics.c(this.userEditorScoreAggregates, profileData.userEditorScoreAggregates) && Intrinsics.c(this.createdTimestamp, profileData.createdTimestamp) && Intrinsics.c(this.chatRole, profileData.chatRole) && Intrinsics.c(this.chatFlag, profileData.chatFlag) && Intrinsics.c(this.updatedTimestamp, profileData.updatedTimestamp) && this.tvContributions == profileData.tvContributions && Intrinsics.c(this.credibilityScore, profileData.credibilityScore) && Intrinsics.c(this.activeCrowdsourcer, profileData.activeCrowdsourcer) && this.userBadge == profileData.userBadge && Intrinsics.c(this.weeklyChallengeDailyBonusUsedAtTimestamp, profileData.weeklyChallengeDailyBonusUsedAtTimestamp) && Intrinsics.c(this.ads, profileData.ads) && this.editor == profileData.editor && Intrinsics.c(this.editorName, profileData.editorName) && Intrinsics.c(this.providerType, profileData.providerType) && Intrinsics.c(this.events, profileData.events) && Intrinsics.c(this.teams, profileData.teams) && Intrinsics.c(this.leagues, profileData.leagues) && Intrinsics.c(this.mutedEvents, profileData.mutedEvents) && Intrinsics.c(this.players, profileData.players) && Intrinsics.c(this.pinnedLeagues, profileData.pinnedLeagues) && Intrinsics.c(this.stages, profileData.stages) && Intrinsics.c(this.uniqueStages, profileData.uniqueStages) && Intrinsics.c(this.mutedStages, profileData.mutedStages) && Intrinsics.c(this.fantasyCompetitions, profileData.fantasyCompetitions) && Intrinsics.c(this.leaderboardId, profileData.leaderboardId) && Intrinsics.c(this.previousLeaderboardId, profileData.previousLeaderboardId) && Intrinsics.c(this.maxLeagueLevel, profileData.maxLeagueLevel) && Intrinsics.c(this.fantasyUser, profileData.fantasyUser) && Intrinsics.c(this.favoriteEvents, profileData.favoriteEvents) && Intrinsics.c(this.favoriteTeams, profileData.favoriteTeams) && Intrinsics.c(this.favoriteLeagues, profileData.favoriteLeagues) && Intrinsics.c(this.favoritePlayers, profileData.favoritePlayers) && Intrinsics.c(this.weeklyChallengePreviousWeeklyStreak, profileData.weeklyChallengePreviousWeeklyStreak) && Intrinsics.c(this.weeklyChallengeCurrentWeeklyStreak, profileData.weeklyChallengeCurrentWeeklyStreak) && Intrinsics.c(this.weeklyChallengeMaxWeeklyStreak, profileData.weeklyChallengeMaxWeeklyStreak) && Intrinsics.c(this.weeklyChallengeMaxFinishedLeagueLevel, profileData.weeklyChallengeMaxFinishedLeagueLevel) && Intrinsics.c(this.weeklyChallengeBestRank, profileData.weeklyChallengeBestRank) && Intrinsics.c(this.hasPremium, profileData.hasPremium) && Intrinsics.c(this.dataSharingOptOut, profileData.dataSharingOptOut) && Intrinsics.c(this.premiumTokenExpirationTimestamp, profileData.premiumTokenExpirationTimestamp);
    }

    @Nullable
    public final Boolean getActiveCrowdsourcer() {
        return this.activeCrowdsourcer;
    }

    @Nullable
    public final Boolean getAds() {
        return this.ads;
    }

    @Nullable
    public final String getChatFlag() {
        return this.chatFlag;
    }

    @Nullable
    public final String getChatRole() {
        return this.chatRole;
    }

    @Nullable
    public final Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    @Nullable
    public final Double getCredibilityScore() {
        return this.credibilityScore;
    }

    @Nullable
    public final Boolean getDataSharingOptOut() {
        return this.dataSharingOptOut;
    }

    public final boolean getEditor() {
        return this.editor;
    }

    @Nullable
    public final String getEditorName() {
        return this.editorName;
    }

    @Nullable
    public final List<Integer> getEvents() {
        return this.events;
    }

    @Nullable
    public final List<Integer> getFantasyCompetitions() {
        return this.fantasyCompetitions;
    }

    @Nullable
    public final Boolean getFantasyUser() {
        return this.fantasyUser;
    }

    @Nullable
    public final List<Integer> getFavoriteEvents() {
        return this.favoriteEvents;
    }

    @Nullable
    public final List<Integer> getFavoriteLeagues() {
        return this.favoriteLeagues;
    }

    @Nullable
    public final List<Integer> getFavoritePlayers() {
        return this.favoritePlayers;
    }

    @Nullable
    public final List<Integer> getFavoriteTeams() {
        return this.favoriteTeams;
    }

    @Nullable
    public final Boolean getHasPremium() {
        return this.hasPremium;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImageURL() {
        return this.imageURL;
    }

    public final long getJoinDate() {
        Long l = this.createdTimestamp;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Nullable
    public final Integer getLeaderboardId() {
        return this.leaderboardId;
    }

    @Nullable
    public final List<Integer> getLeagues() {
        return this.leagues;
    }

    @Nullable
    public final Integer getMaxLeagueLevel() {
        return this.maxLeagueLevel;
    }

    @Nullable
    public final List<Integer> getMutedEvents() {
        return this.mutedEvents;
    }

    @Nullable
    public final List<Integer> getMutedStages() {
        return this.mutedStages;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final List<Integer> getPinnedLeagues() {
        return this.pinnedLeagues;
    }

    @Nullable
    public final List<Integer> getPlayers() {
        return this.players;
    }

    @Nullable
    public final Long getPremiumTokenExpirationTimestamp() {
        return this.premiumTokenExpirationTimestamp;
    }

    @Nullable
    public final Integer getPreviousLeaderboardId() {
        return this.previousLeaderboardId;
    }

    @NotNull
    public final String getProviderType() {
        return this.providerType;
    }

    @Nullable
    public final List<Integer> getStages() {
        return this.stages;
    }

    public final long getSyncTimestamp() {
        Long l = this.updatedTimestamp;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Nullable
    public final List<Integer> getTeams() {
        return this.teams;
    }

    public final int getTvContributions() {
        return this.tvContributions;
    }

    @Nullable
    public final List<Integer> getUniqueStages() {
        return this.uniqueStages;
    }

    @Nullable
    public final Long getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    @Nullable
    public final UserBadge getUserBadge() {
        return this.userBadge;
    }

    @Nullable
    public final CrowdsourcingAggregates getUserCrowdsourcingAggregates() {
        return this.userCrowdsourcingAggregates;
    }

    @Nullable
    public final EditorAggregates getUserEditorScoreAggregates() {
        return this.userEditorScoreAggregates;
    }

    @Nullable
    public final VoteStatisticsWrapper getVoteStatistics() {
        return this.voteStatistics;
    }

    @Nullable
    public final Integer getWeeklyChallengeBestRank() {
        return this.weeklyChallengeBestRank;
    }

    @Nullable
    public final Integer getWeeklyChallengeCurrentWeeklyStreak() {
        return this.weeklyChallengeCurrentWeeklyStreak;
    }

    @Nullable
    public final Long getWeeklyChallengeDailyBonusUsedAtTimestamp() {
        return this.weeklyChallengeDailyBonusUsedAtTimestamp;
    }

    @Nullable
    public final Integer getWeeklyChallengeMaxFinishedLeagueLevel() {
        return this.weeklyChallengeMaxFinishedLeagueLevel;
    }

    @Nullable
    public final Integer getWeeklyChallengeMaxWeeklyStreak() {
        return this.weeklyChallengeMaxWeeklyStreak;
    }

    @Nullable
    public final Integer getWeeklyChallengePreviousWeeklyStreak() {
        return this.weeklyChallengePreviousWeeklyStreak;
    }

    public final boolean hasAds() {
        Boolean bool = this.ads;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nickname;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageURL;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        VoteStatisticsWrapper voteStatisticsWrapper = this.voteStatistics;
        int hashCode4 = (hashCode3 + (voteStatisticsWrapper == null ? 0 : voteStatisticsWrapper.hashCode())) * 31;
        CrowdsourcingAggregates crowdsourcingAggregates = this.userCrowdsourcingAggregates;
        int hashCode5 = (hashCode4 + (crowdsourcingAggregates == null ? 0 : crowdsourcingAggregates.hashCode())) * 31;
        EditorAggregates editorAggregates = this.userEditorScoreAggregates;
        int hashCode6 = (hashCode5 + (editorAggregates == null ? 0 : editorAggregates.hashCode())) * 31;
        Long l = this.createdTimestamp;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.chatRole;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.chatFlag;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.updatedTimestamp;
        int a = wv8.a(this.tvContributions, (hashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31, 31);
        Double d = this.credibilityScore;
        int hashCode10 = (a + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.activeCrowdsourcer;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        UserBadge userBadge = this.userBadge;
        int hashCode12 = (hashCode11 + (userBadge == null ? 0 : userBadge.hashCode())) * 31;
        Long l3 = this.weeklyChallengeDailyBonusUsedAtTimestamp;
        int hashCode13 = (hashCode12 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool2 = this.ads;
        int e = dmi.e((hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.editor);
        String str6 = this.editorName;
        int c = dmi.c((e + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.providerType);
        List<Integer> list = this.events;
        int hashCode14 = (c + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.teams;
        int hashCode15 = (hashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.leagues;
        int hashCode16 = (hashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.mutedEvents;
        int hashCode17 = (hashCode16 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Integer> list5 = this.players;
        int hashCode18 = (hashCode17 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<Integer> list6 = this.pinnedLeagues;
        int hashCode19 = (hashCode18 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<Integer> list7 = this.stages;
        int hashCode20 = (hashCode19 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<Integer> list8 = this.uniqueStages;
        int hashCode21 = (hashCode20 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<Integer> list9 = this.mutedStages;
        int hashCode22 = (hashCode21 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<Integer> list10 = this.fantasyCompetitions;
        int hashCode23 = (hashCode22 + (list10 == null ? 0 : list10.hashCode())) * 31;
        Integer num = this.leaderboardId;
        int hashCode24 = (hashCode23 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.previousLeaderboardId;
        int hashCode25 = (hashCode24 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxLeagueLevel;
        int hashCode26 = (hashCode25 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool3 = this.fantasyUser;
        int hashCode27 = (hashCode26 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<Integer> list11 = this.favoriteEvents;
        int hashCode28 = (hashCode27 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<Integer> list12 = this.favoriteTeams;
        int hashCode29 = (hashCode28 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<Integer> list13 = this.favoriteLeagues;
        int hashCode30 = (hashCode29 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<Integer> list14 = this.favoritePlayers;
        int hashCode31 = (hashCode30 + (list14 == null ? 0 : list14.hashCode())) * 31;
        Integer num4 = this.weeklyChallengePreviousWeeklyStreak;
        int hashCode32 = (hashCode31 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.weeklyChallengeCurrentWeeklyStreak;
        int hashCode33 = (hashCode32 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.weeklyChallengeMaxWeeklyStreak;
        int hashCode34 = (hashCode33 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.weeklyChallengeMaxFinishedLeagueLevel;
        int hashCode35 = (hashCode34 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.weeklyChallengeBestRank;
        int hashCode36 = (hashCode35 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Boolean bool4 = this.hasPremium;
        int hashCode37 = (hashCode36 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.dataSharingOptOut;
        int hashCode38 = (hashCode37 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Long l4 = this.premiumTokenExpirationTimestamp;
        return hashCode38 + (l4 != null ? l4.hashCode() : 0);
    }

    public final boolean isActiveCrowdsourcer() {
        Boolean bool = this.activeCrowdsourcer;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.nickname;
        String str3 = this.imageURL;
        VoteStatisticsWrapper voteStatisticsWrapper = this.voteStatistics;
        CrowdsourcingAggregates crowdsourcingAggregates = this.userCrowdsourcingAggregates;
        EditorAggregates editorAggregates = this.userEditorScoreAggregates;
        Long l = this.createdTimestamp;
        String str4 = this.chatRole;
        String str5 = this.chatFlag;
        Long l2 = this.updatedTimestamp;
        int i = this.tvContributions;
        Double d = this.credibilityScore;
        Boolean bool = this.activeCrowdsourcer;
        UserBadge userBadge = this.userBadge;
        Long l3 = this.weeklyChallengeDailyBonusUsedAtTimestamp;
        Boolean bool2 = this.ads;
        boolean z = this.editor;
        String str6 = this.editorName;
        String str7 = this.providerType;
        List<Integer> list = this.events;
        List<Integer> list2 = this.teams;
        List<Integer> list3 = this.leagues;
        List<Integer> list4 = this.mutedEvents;
        List<Integer> list5 = this.players;
        List<Integer> list6 = this.pinnedLeagues;
        List<Integer> list7 = this.stages;
        List<Integer> list8 = this.uniqueStages;
        List<Integer> list9 = this.mutedStages;
        List<Integer> list10 = this.fantasyCompetitions;
        Integer num = this.leaderboardId;
        Integer num2 = this.previousLeaderboardId;
        Integer num3 = this.maxLeagueLevel;
        Boolean bool3 = this.fantasyUser;
        List<Integer> list11 = this.favoriteEvents;
        List<Integer> list12 = this.favoriteTeams;
        List<Integer> list13 = this.favoriteLeagues;
        List<Integer> list14 = this.favoritePlayers;
        Integer num4 = this.weeklyChallengePreviousWeeklyStreak;
        Integer num5 = this.weeklyChallengeCurrentWeeklyStreak;
        Integer num6 = this.weeklyChallengeMaxWeeklyStreak;
        Integer num7 = this.weeklyChallengeMaxFinishedLeagueLevel;
        Integer num8 = this.weeklyChallengeBestRank;
        Boolean bool4 = this.hasPremium;
        Boolean bool5 = this.dataSharingOptOut;
        Long l4 = this.premiumTokenExpirationTimestamp;
        StringBuilder s = mz1.s("ProfileData(id=", str, ", nickname=", str2, ", imageURL=");
        s.append(str3);
        s.append(", voteStatistics=");
        s.append(voteStatisticsWrapper);
        s.append(", userCrowdsourcingAggregates=");
        s.append(crowdsourcingAggregates);
        s.append(", userEditorScoreAggregates=");
        s.append(editorAggregates);
        s.append(", createdTimestamp=");
        s.append(l);
        s.append(", chatRole=");
        s.append(str4);
        s.append(", chatFlag=");
        s.append(str5);
        s.append(", updatedTimestamp=");
        s.append(l2);
        s.append(", tvContributions=");
        s.append(i);
        s.append(", credibilityScore=");
        s.append(d);
        s.append(", activeCrowdsourcer=");
        s.append(bool);
        s.append(", userBadge=");
        s.append(userBadge);
        s.append(", weeklyChallengeDailyBonusUsedAtTimestamp=");
        s.append(l3);
        s.append(", ads=");
        s.append(bool2);
        s.append(", editor=");
        s.append(z);
        s.append(", editorName=");
        s.append(str6);
        s.append(", providerType=");
        s.append(str7);
        s.append(", events=");
        s.append(list);
        s.append(", teams=");
        vxd.w(s, list2, ", leagues=", list3, ", mutedEvents=");
        vxd.w(s, list4, ", players=", list5, ", pinnedLeagues=");
        vxd.w(s, list6, ", stages=", list7, ", uniqueStages=");
        vxd.w(s, list8, ", mutedStages=", list9, ", fantasyCompetitions=");
        s.append(list10);
        s.append(", leaderboardId=");
        s.append(num);
        s.append(", previousLeaderboardId=");
        vxd.r(num2, num3, ", maxLeagueLevel=", ", fantasyUser=", s);
        s.append(bool3);
        s.append(", favoriteEvents=");
        s.append(list11);
        s.append(", favoriteTeams=");
        vxd.w(s, list12, ", favoriteLeagues=", list13, ", favoritePlayers=");
        s.append(list14);
        s.append(", weeklyChallengePreviousWeeklyStreak=");
        s.append(num4);
        s.append(", weeklyChallengeCurrentWeeklyStreak=");
        vxd.r(num5, num6, ", weeklyChallengeMaxWeeklyStreak=", ", weeklyChallengeMaxFinishedLeagueLevel=", s);
        vxd.r(num7, num8, ", weeklyChallengeBestRank=", ", hasPremium=", s);
        i.q(s, bool4, ", dataSharingOptOut=", bool5, ", premiumTokenExpirationTimestamp=");
        s.append(l4);
        s.append(")");
        return s.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProfileData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable VoteStatisticsWrapper voteStatisticsWrapper, @Nullable CrowdsourcingAggregates crowdsourcingAggregates, @Nullable EditorAggregates editorAggregates, @Nullable Long l, @Nullable String str4, @Nullable String str5, @Nullable Long l2, int i, @Nullable Double d, @Nullable Boolean bool, @Nullable UserBadge userBadge, @Nullable Long l3, @Nullable Boolean bool2, boolean z, @Nullable String str6, @NotNull String str7, @Nullable List<Integer> list, @Nullable List<Integer> list2, @Nullable List<Integer> list3, @Nullable List<Integer> list4, @Nullable List<Integer> list5, @Nullable List<Integer> list6, @Nullable List<Integer> list7, @Nullable List<Integer> list8, @Nullable List<Integer> list9, @Nullable List<Integer> list10, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool3, @Nullable List<Integer> list11, @Nullable List<Integer> list12, @Nullable List<Integer> list13, @Nullable List<Integer> list14, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Long l4) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        str7.getClass();
        this.id = str;
        this.nickname = str2;
        this.imageURL = str3;
        this.voteStatistics = voteStatisticsWrapper;
        this.userCrowdsourcingAggregates = crowdsourcingAggregates;
        this.userEditorScoreAggregates = editorAggregates;
        this.createdTimestamp = l;
        this.chatRole = str4;
        this.chatFlag = str5;
        this.updatedTimestamp = l2;
        this.tvContributions = i;
        this.credibilityScore = d;
        this.activeCrowdsourcer = bool;
        this.userBadge = userBadge;
        this.weeklyChallengeDailyBonusUsedAtTimestamp = l3;
        this.ads = bool2;
        this.editor = z;
        this.editorName = str6;
        this.providerType = str7;
        this.events = list;
        this.teams = list2;
        this.leagues = list3;
        this.mutedEvents = list4;
        this.players = list5;
        this.pinnedLeagues = list6;
        this.stages = list7;
        this.uniqueStages = list8;
        this.mutedStages = list9;
        this.fantasyCompetitions = list10;
        this.leaderboardId = num;
        this.previousLeaderboardId = num2;
        this.maxLeagueLevel = num3;
        this.fantasyUser = bool3;
        this.favoriteEvents = list11;
        this.favoriteTeams = list12;
        this.favoriteLeagues = list13;
        this.favoritePlayers = list14;
        this.weeklyChallengePreviousWeeklyStreak = num4;
        this.weeklyChallengeCurrentWeeklyStreak = num5;
        this.weeklyChallengeMaxWeeklyStreak = num6;
        this.weeklyChallengeMaxFinishedLeagueLevel = num7;
        this.weeklyChallengeBestRank = num8;
        this.hasPremium = bool4;
        this.dataSharingOptOut = bool5;
        this.premiumTokenExpirationTimestamp = l4;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/ProfileData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/ProfileData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProfileData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
