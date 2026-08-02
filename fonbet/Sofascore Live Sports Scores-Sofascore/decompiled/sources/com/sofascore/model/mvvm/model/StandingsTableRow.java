package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Incident;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
import defpackage.joa;
import defpackage.ljg;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.u9i;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.w1l;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bN\b\u0087\b\u0018\u0000 ½\u00012\u00020\u0001:\u0004¾\u0001½\u0001B\u0083\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b.\u0010/B±\u0003\b\u0010\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b.\u00105J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u00107J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010BJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010BJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010BJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010BJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u0010BJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010BJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u0010BJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u0010BJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u0010BJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u0010BJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u0010BJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u0010BJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u0010BJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u0010BJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u0010BJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u0010BJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u0010BJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bV\u0010BJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u0010BJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u0010BJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bY\u0010BJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u0010BJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b[\u0010BJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\\\u0010JJ\u0012\u0010]\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b]\u0010JJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b^\u0010JJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b_\u0010JJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b`\u0010JJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\ba\u0010BJ\u0012\u0010b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bb\u0010BJÖ\u0003\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\be\u0010?J\u0010\u0010f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bf\u00107J\u001a\u0010j\u001a\u00020i2\b\u0010h\u001a\u0004\u0018\u00010gHÖ\u0003¢\u0006\u0004\bj\u0010kJ'\u0010t\u001a\u00020q2\u0006\u0010l\u001a\u00020\u00002\u0006\u0010n\u001a\u00020m2\u0006\u0010p\u001a\u00020oH\u0001¢\u0006\u0004\br\u0010sR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010u\u001a\u0004\bv\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010w\u001a\u0004\bx\u00109R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010y\u001a\u0004\bz\u0010;\"\u0004\b{\u0010|R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\t\u0010}\u001a\u0004\b~\u0010=R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\r\n\u0004\b\u000b\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010?R%\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b\f\u0010u\u001a\u0005\b\u0081\u0001\u00107\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\r\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010BR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u0084\u0001\u001a\u0005\b\u0086\u0001\u0010BR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u0084\u0001\u001a\u0005\b\u0087\u0001\u0010BR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010\u0084\u0001\u001a\u0005\b\u0088\u0001\u0010BR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u0084\u0001\u001a\u0005\b\u0089\u0001\u0010BR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010\u0084\u0001\u001a\u0005\b\u008a\u0001\u0010BR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u0084\u0001\u001a\u0005\b\u008b\u0001\u0010BR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010JR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u0084\u0001\u001a\u0005\b\u008e\u0001\u0010BR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u0084\u0001\u001a\u0005\b\u008f\u0001\u0010BR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010\u0084\u0001\u001a\u0005\b\u0090\u0001\u0010BR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010\u0084\u0001\u001a\u0005\b\u0091\u0001\u0010BR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u0084\u0001\u001a\u0005\b\u0092\u0001\u0010BR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u0084\u0001\u001a\u0005\b\u0093\u0001\u0010BR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u0084\u0001\u001a\u0005\b\u0094\u0001\u0010BR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0084\u0001\u001a\u0005\b\u0095\u0001\u0010BR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u0084\u0001\u001a\u0005\b\u0096\u0001\u0010BR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u0084\u0001\u001a\u0005\b\u0097\u0001\u0010BR\u001b\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b \u0010\u0084\u0001\u001a\u0005\b\u0098\u0001\u0010BR\u001b\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b!\u0010\u0084\u0001\u001a\u0005\b\u0099\u0001\u0010BR\u001b\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0084\u0001\u001a\u0005\b\u009a\u0001\u0010BR\u001b\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b#\u0010\u0084\u0001\u001a\u0005\b\u009b\u0001\u0010BR\u001b\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0084\u0001\u001a\u0005\b\u009c\u0001\u0010BR\u001b\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b%\u0010\u0084\u0001\u001a\u0005\b\u009d\u0001\u0010BR\u001b\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0084\u0001\u001a\u0005\b\u009e\u0001\u0010BR\u001b\u0010'\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b'\u0010\u008c\u0001\u001a\u0005\b\u009f\u0001\u0010JR\u001b\u0010(\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b(\u0010\u008c\u0001\u001a\u0005\b \u0001\u0010JR\u001b\u0010)\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b)\u0010\u008c\u0001\u001a\u0005\b¡\u0001\u0010JR\u001b\u0010*\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b*\u0010\u008c\u0001\u001a\u0005\b¢\u0001\u0010JR\u001b\u0010+\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b+\u0010\u008c\u0001\u001a\u0005\b£\u0001\u0010JR\u001b\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b,\u0010\u0084\u0001\u001a\u0005\b¤\u0001\u0010BR\u001b\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b-\u0010\u0084\u0001\u001a\u0005\b¥\u0001\u0010BR+\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b2\u0010}\u001a\u0005\b¦\u0001\u0010=\"\u0006\b§\u0001\u0010¨\u0001R\u0015\u0010ª\u0001\u001a\u0004\u0018\u00010\n8F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010?R\u0015\u0010¬\u0001\u001a\u0004\u0018\u00010\n8F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010?R\u0015\u0010®\u0001\u001a\u0004\u0018\u00010\n8F¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010?R\u0015\u0010°\u0001\u001a\u0004\u0018\u00010\n8F¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010?R\u0015\u0010²\u0001\u001a\u0004\u0018\u00010\n8F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010?R\u0015\u0010´\u0001\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0007\u001a\u0005\b³\u0001\u0010BR\u0015\u0010¶\u0001\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010BR\u0015\u0010¸\u0001\u001a\u0004\u0018\u00010\n8F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010?R\u0015\u0010º\u0001\u001a\u0004\u0018\u00010\n8F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010?R\u0018\u0010¼\u0001\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010B¨\u0006¿\u0001"}, d2 = {"Lcom/sofascore/model/mvvm/model/StandingsTableRow;", "Ljava/io/Serializable;", "", "id", "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lcom/sofascore/model/mvvm/model/Description;", "promotion", "", "descriptions", "", "liveMatchWinnerCodeColumn", "position", "matches", "wins", "losses", "draws", "scoresFor", "scoresAgainst", "points", "", "pointsPerGame", "pointsCurrSeason", "pointsPrevSeason", "pointsPrevPrevSeason", "overtimeWins", "overtimeLosses", "penaltyWins", "penaltyLosses", "overtimeAndPenaltyWins", "overtimeAndPenaltyLosses", "noResult", "secondaryScoresFor", "secondaryScoresAgainst", Incident.GoalIncident.TYPE_THREE_POINT, Incident.GoalIncident.TYPE_TWO_POINT, Incident.GoalIncident.TYPE_ONE_POINT, "zeroPoint", "streak", "percentage", "gamesBehind", "netRunRate", "oversFor", "oversAgainst", "normaltimeWins", "normaltimeLosses", "<init>", "(ILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Description;Ljava/util/List;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "seen1", "form", "Lt5h;", "serializationConstructorMarker", "(IIILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Description;Ljava/util/List;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lt5h;)V", "component1", "()I", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "()Lcom/sofascore/model/mvvm/model/Description;", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/String;", "component6", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Ljava/lang/Double;", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "copy", "(ILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Description;Ljava/util/List;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/mvvm/model/StandingsTableRow;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/StandingsTableRow;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Lcom/sofascore/model/mvvm/model/Description;", "getPromotion", "setPromotion", "(Lcom/sofascore/model/mvvm/model/Description;)V", "Ljava/util/List;", "getDescriptions", "Ljava/lang/String;", "getLiveMatchWinnerCodeColumn", "getPosition", "setPosition", "(I)V", "Ljava/lang/Integer;", "getMatches", "getWins", "getLosses", "getDraws", "getScoresFor", "getScoresAgainst", "getPoints", "Ljava/lang/Double;", "getPointsPerGame", "getPointsCurrSeason", "getPointsPrevSeason", "getPointsPrevPrevSeason", "getOvertimeWins", "getOvertimeLosses", "getPenaltyWins", "getPenaltyLosses", "getOvertimeAndPenaltyWins", "getOvertimeAndPenaltyLosses", "getNoResult", "getSecondaryScoresFor", "getSecondaryScoresAgainst", "getThreePoints", "getTwoPoints", "getOnePoint", "getZeroPoint", "getStreak", "getPercentage", "getGamesBehind", "getNetRunRate", "getOversFor", "getOversAgainst", "getNormaltimeWins", "getNormaltimeLosses", "getForm", "setForm", "(Ljava/util/List;)V", "getScoreDiffFormatted", "scoreDiffFormatted", "getGoals", "goals", "getPctGoals", "pctGoals", "getWinLosses", "winLosses", "getWinsLossesTies", "winsLossesTies", "getAvailableLosses", "availableLosses", "getAvailableOvertimeLosses", "availableOvertimeLosses", "getOvertimeRecord", "overtimeRecord", "getShootoutRecord", "shootoutRecord", "getScoreDiff", "scoreDiff", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StandingsTableRow implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Description> descriptions;

    @Nullable
    private final Integer draws;

    @NotNull
    private List<String> form;

    @Nullable
    private final Double gamesBehind;
    private final int id;

    @Nullable
    private final String liveMatchWinnerCodeColumn;

    @Nullable
    private final Integer losses;

    @Nullable
    private final Integer matches;

    @Nullable
    private final Double netRunRate;

    @Nullable
    private final Integer noResult;

    @Nullable
    private final Integer normaltimeLosses;

    @Nullable
    private final Integer normaltimeWins;

    @Nullable
    private final Integer onePoint;

    @Nullable
    private final Double oversAgainst;

    @Nullable
    private final Double oversFor;

    @Nullable
    private final Integer overtimeAndPenaltyLosses;

    @Nullable
    private final Integer overtimeAndPenaltyWins;

    @Nullable
    private final Integer overtimeLosses;

    @Nullable
    private final Integer overtimeWins;

    @Nullable
    private final Integer penaltyLosses;

    @Nullable
    private final Integer penaltyWins;

    @Nullable
    private final Double percentage;

    @Nullable
    private final Integer points;

    @Nullable
    private final Integer pointsCurrSeason;

    @Nullable
    private final Double pointsPerGame;

    @Nullable
    private final Integer pointsPrevPrevSeason;

    @Nullable
    private final Integer pointsPrevSeason;
    private int position;

    @Nullable
    private Description promotion;

    @Nullable
    private final Integer scoresAgainst;

    @Nullable
    private final Integer scoresFor;

    @Nullable
    private final Integer secondaryScoresAgainst;

    @Nullable
    private final Integer secondaryScoresFor;

    @Nullable
    private final Integer streak;

    @NotNull
    private final Team team;

    @Nullable
    private final Integer threePoints;

    @Nullable
    private final Integer twoPoints;

    @Nullable
    private final Integer wins;

    @Nullable
    private final Integer zeroPoint;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new u9i(18)), null, ypa.a(ysaVar, new u9i(19)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new u9i(20))};
    }

    public /* synthetic */ StandingsTableRow(int i, int i2, int i3, Team team, Description description, List list, String str, int i4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Double d, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num25, Integer num26, List list2, t5h t5hVar) {
        if ((-33 != (i & (-33))) || (63 != (i2 & 63))) {
            oea.y(new int[]{i, i2}, new int[]{-33, 63}, StandingsTableRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.team = team;
        this.promotion = description;
        this.descriptions = list;
        this.liveMatchWinnerCodeColumn = str;
        if ((i & 32) == 0) {
            this.position = 0;
        } else {
            this.position = i4;
        }
        this.matches = num;
        this.wins = num2;
        this.losses = num3;
        this.draws = num4;
        this.scoresFor = num5;
        this.scoresAgainst = num6;
        this.points = num7;
        this.pointsPerGame = d;
        this.pointsCurrSeason = num8;
        this.pointsPrevSeason = num9;
        this.pointsPrevPrevSeason = num10;
        this.overtimeWins = num11;
        this.overtimeLosses = num12;
        this.penaltyWins = num13;
        this.penaltyLosses = num14;
        this.overtimeAndPenaltyWins = num15;
        this.overtimeAndPenaltyLosses = num16;
        this.noResult = num17;
        this.secondaryScoresFor = num18;
        this.secondaryScoresAgainst = num19;
        this.threePoints = num20;
        this.twoPoints = num21;
        this.onePoint = num22;
        this.zeroPoint = num23;
        this.streak = num24;
        this.percentage = d2;
        this.gamesBehind = d3;
        this.netRunRate = d4;
        this.oversFor = d5;
        this.oversAgainst = d6;
        this.normaltimeWins = num25;
        this.normaltimeLosses = num26;
        this.form = (i2 & 64) == 0 ? new ArrayList() : list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Description$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(uhi.a, 0);
    }

    public static /* synthetic */ StandingsTableRow copy$default(StandingsTableRow standingsTableRow, int i, Team team, Description description, List list, String str, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Double d, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num25, Integer num26, int i3, int i4, Object obj) {
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
        Double d7;
        Double d8;
        Double d9;
        Double d10;
        Double d11;
        Integer num39;
        Integer num40;
        Integer num41;
        Integer num42;
        Integer num43;
        Integer num44;
        Integer num45;
        Integer num46;
        Double d12;
        Integer num47;
        Integer num48;
        Integer num49;
        Integer num50;
        Integer num51;
        Integer num52;
        Team team2;
        Description description2;
        List list2;
        String str2;
        int i5;
        int i6 = (i3 & 1) != 0 ? standingsTableRow.id : i;
        Team team3 = (i3 & 2) != 0 ? standingsTableRow.team : team;
        Description description3 = (i3 & 4) != 0 ? standingsTableRow.promotion : description;
        List list3 = (i3 & 8) != 0 ? standingsTableRow.descriptions : list;
        String str3 = (i3 & 16) != 0 ? standingsTableRow.liveMatchWinnerCodeColumn : str;
        int i7 = (i3 & 32) != 0 ? standingsTableRow.position : i2;
        Integer num53 = (i3 & 64) != 0 ? standingsTableRow.matches : num;
        Integer num54 = (i3 & 128) != 0 ? standingsTableRow.wins : num2;
        Integer num55 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? standingsTableRow.losses : num3;
        Integer num56 = (i3 & 512) != 0 ? standingsTableRow.draws : num4;
        Integer num57 = (i3 & 1024) != 0 ? standingsTableRow.scoresFor : num5;
        Integer num58 = (i3 & a.o) != 0 ? standingsTableRow.scoresAgainst : num6;
        Integer num59 = (i3 & 4096) != 0 ? standingsTableRow.points : num7;
        Double d13 = (i3 & 8192) != 0 ? standingsTableRow.pointsPerGame : d;
        int i8 = i6;
        Integer num60 = (i3 & 16384) != 0 ? standingsTableRow.pointsCurrSeason : num8;
        Integer num61 = (i3 & 32768) != 0 ? standingsTableRow.pointsPrevSeason : num9;
        Integer num62 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? standingsTableRow.pointsPrevPrevSeason : num10;
        Integer num63 = (i3 & 131072) != 0 ? standingsTableRow.overtimeWins : num11;
        Integer num64 = (i3 & 262144) != 0 ? standingsTableRow.overtimeLosses : num12;
        Integer num65 = (i3 & 524288) != 0 ? standingsTableRow.penaltyWins : num13;
        Integer num66 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? standingsTableRow.penaltyLosses : num14;
        Integer num67 = (i3 & 2097152) != 0 ? standingsTableRow.overtimeAndPenaltyWins : num15;
        Integer num68 = (i3 & 4194304) != 0 ? standingsTableRow.overtimeAndPenaltyLosses : num16;
        Integer num69 = (i3 & 8388608) != 0 ? standingsTableRow.noResult : num17;
        Integer num70 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? standingsTableRow.secondaryScoresFor : num18;
        Integer num71 = (i3 & 33554432) != 0 ? standingsTableRow.secondaryScoresAgainst : num19;
        Integer num72 = (i3 & 67108864) != 0 ? standingsTableRow.threePoints : num20;
        Integer num73 = (i3 & 134217728) != 0 ? standingsTableRow.twoPoints : num21;
        Integer num74 = (i3 & 268435456) != 0 ? standingsTableRow.onePoint : num22;
        Integer num75 = (i3 & 536870912) != 0 ? standingsTableRow.zeroPoint : num23;
        Integer num76 = (i3 & 1073741824) != 0 ? standingsTableRow.streak : num24;
        Double d14 = (i3 & Integer.MIN_VALUE) != 0 ? standingsTableRow.percentage : d2;
        Double d15 = (i4 & 1) != 0 ? standingsTableRow.gamesBehind : d3;
        Double d16 = (i4 & 2) != 0 ? standingsTableRow.netRunRate : d4;
        Double d17 = (i4 & 4) != 0 ? standingsTableRow.oversFor : d5;
        Double d18 = (i4 & 8) != 0 ? standingsTableRow.oversAgainst : d6;
        Integer num77 = (i4 & 16) != 0 ? standingsTableRow.normaltimeWins : num25;
        if ((i4 & 32) != 0) {
            num28 = num77;
            num27 = standingsTableRow.normaltimeLosses;
            num30 = num68;
            num31 = num69;
            num32 = num70;
            num33 = num71;
            num34 = num72;
            num35 = num73;
            num36 = num74;
            num37 = num75;
            num38 = num76;
            d7 = d14;
            d8 = d15;
            d9 = d16;
            d10 = d17;
            d11 = d18;
            num39 = num60;
            num41 = num54;
            num42 = num55;
            num43 = num56;
            num44 = num57;
            num45 = num58;
            num46 = num59;
            d12 = d13;
            num47 = num61;
            num48 = num62;
            num49 = num63;
            num50 = num64;
            num51 = num65;
            num52 = num66;
            num29 = num67;
            team2 = team3;
            description2 = description3;
            list2 = list3;
            str2 = str3;
            i5 = i7;
            num40 = num53;
        } else {
            num27 = num26;
            num28 = num77;
            num29 = num67;
            num30 = num68;
            num31 = num69;
            num32 = num70;
            num33 = num71;
            num34 = num72;
            num35 = num73;
            num36 = num74;
            num37 = num75;
            num38 = num76;
            d7 = d14;
            d8 = d15;
            d9 = d16;
            d10 = d17;
            d11 = d18;
            num39 = num60;
            num40 = num53;
            num41 = num54;
            num42 = num55;
            num43 = num56;
            num44 = num57;
            num45 = num58;
            num46 = num59;
            d12 = d13;
            num47 = num61;
            num48 = num62;
            num49 = num63;
            num50 = num64;
            num51 = num65;
            num52 = num66;
            team2 = team3;
            description2 = description3;
            list2 = list3;
            str2 = str3;
            i5 = i7;
        }
        return standingsTableRow.copy(i8, team2, description2, list2, str2, i5, num40, num41, num42, num43, num44, num45, num46, d12, num39, num47, num48, num49, num50, num51, num52, num29, num30, num31, num32, num33, num34, num35, num36, num37, num38, d7, d8, d9, d10, d11, num28, num27);
    }

    private final Integer getScoreDiff() {
        Integer num = this.scoresFor;
        if (num == null || this.scoresAgainst == null) {
            return null;
        }
        return Integer.valueOf(num.intValue() - this.scoresAgainst.intValue());
    }

    public static final /* synthetic */ void write$Self$model_release(StandingsTableRow self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.team);
        output.h(serialDesc, 2, Description$$serializer.INSTANCE, self.promotion);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.descriptions);
        output.h(serialDesc, 4, uhi.a, self.liveMatchWinnerCodeColumn);
        if (output.o(serialDesc) || self.position != 0) {
            output.u(5, self.position, serialDesc);
        }
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 6, a7aVar, self.matches);
        output.h(serialDesc, 7, a7aVar, self.wins);
        output.h(serialDesc, 8, a7aVar, self.losses);
        output.h(serialDesc, 9, a7aVar, self.draws);
        output.h(serialDesc, 10, a7aVar, self.scoresFor);
        output.h(serialDesc, 11, a7aVar, self.scoresAgainst);
        output.h(serialDesc, 12, a7aVar, self.points);
        h75 h75Var = h75.a;
        output.h(serialDesc, 13, h75Var, self.pointsPerGame);
        output.h(serialDesc, 14, a7aVar, self.pointsCurrSeason);
        output.h(serialDesc, 15, a7aVar, self.pointsPrevSeason);
        output.h(serialDesc, 16, a7aVar, self.pointsPrevPrevSeason);
        output.h(serialDesc, 17, a7aVar, self.overtimeWins);
        output.h(serialDesc, 18, a7aVar, self.overtimeLosses);
        output.h(serialDesc, 19, a7aVar, self.penaltyWins);
        output.h(serialDesc, 20, a7aVar, self.penaltyLosses);
        output.h(serialDesc, 21, a7aVar, self.overtimeAndPenaltyWins);
        output.h(serialDesc, 22, a7aVar, self.overtimeAndPenaltyLosses);
        output.h(serialDesc, 23, a7aVar, self.noResult);
        output.h(serialDesc, 24, a7aVar, self.secondaryScoresFor);
        output.h(serialDesc, 25, a7aVar, self.secondaryScoresAgainst);
        output.h(serialDesc, 26, a7aVar, self.threePoints);
        output.h(serialDesc, 27, a7aVar, self.twoPoints);
        output.h(serialDesc, 28, a7aVar, self.onePoint);
        output.h(serialDesc, 29, a7aVar, self.zeroPoint);
        output.h(serialDesc, 30, a7aVar, self.streak);
        output.h(serialDesc, 31, h75Var, self.percentage);
        output.h(serialDesc, 32, h75Var, self.gamesBehind);
        output.h(serialDesc, 33, h75Var, self.netRunRate);
        output.h(serialDesc, 34, h75Var, self.oversFor);
        output.h(serialDesc, 35, h75Var, self.oversAgainst);
        output.h(serialDesc, 36, a7aVar, self.normaltimeWins);
        output.h(serialDesc, 37, a7aVar, self.normaltimeLosses);
        if (!output.o(serialDesc) && Intrinsics.c(self.form, new ArrayList())) {
            return;
        }
        output.f(serialDesc, 38, (KSerializer) joaVarArr[38].getValue(), self.form);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getDraws() {
        return this.draws;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getScoresFor() {
        return this.scoresFor;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getScoresAgainst() {
        return this.scoresAgainst;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Double getPointsPerGame() {
        return this.pointsPerGame;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getPointsCurrSeason() {
        return this.pointsCurrSeason;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getPointsPrevSeason() {
        return this.pointsPrevSeason;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getPointsPrevPrevSeason() {
        return this.pointsPrevPrevSeason;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getOvertimeWins() {
        return this.overtimeWins;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getOvertimeLosses() {
        return this.overtimeLosses;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getPenaltyWins() {
        return this.penaltyWins;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getPenaltyLosses() {
        return this.penaltyLosses;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getOvertimeAndPenaltyWins() {
        return this.overtimeAndPenaltyWins;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getOvertimeAndPenaltyLosses() {
        return this.overtimeAndPenaltyLosses;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getNoResult() {
        return this.noResult;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getSecondaryScoresFor() {
        return this.secondaryScoresFor;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getSecondaryScoresAgainst() {
        return this.secondaryScoresAgainst;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getThreePoints() {
        return this.threePoints;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getTwoPoints() {
        return this.twoPoints;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Integer getOnePoint() {
        return this.onePoint;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Description getPromotion() {
        return this.promotion;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getZeroPoint() {
        return this.zeroPoint;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getStreak() {
        return this.streak;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Double getPercentage() {
        return this.percentage;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Double getGamesBehind() {
        return this.gamesBehind;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Double getNetRunRate() {
        return this.netRunRate;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Double getOversFor() {
        return this.oversFor;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final Double getOversAgainst() {
        return this.oversAgainst;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final Integer getNormaltimeWins() {
        return this.normaltimeWins;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final Integer getNormaltimeLosses() {
        return this.normaltimeLosses;
    }

    @NotNull
    public final List<Description> component4() {
        return this.descriptions;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getLiveMatchWinnerCodeColumn() {
        return this.liveMatchWinnerCodeColumn;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getWins() {
        return this.wins;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getLosses() {
        return this.losses;
    }

    @NotNull
    public final StandingsTableRow copy(int id, @NotNull Team team, @Nullable Description promotion, @NotNull List<Description> descriptions, @Nullable String liveMatchWinnerCodeColumn, int position, @Nullable Integer matches, @Nullable Integer wins, @Nullable Integer losses, @Nullable Integer draws, @Nullable Integer scoresFor, @Nullable Integer scoresAgainst, @Nullable Integer points, @Nullable Double pointsPerGame, @Nullable Integer pointsCurrSeason, @Nullable Integer pointsPrevSeason, @Nullable Integer pointsPrevPrevSeason, @Nullable Integer overtimeWins, @Nullable Integer overtimeLosses, @Nullable Integer penaltyWins, @Nullable Integer penaltyLosses, @Nullable Integer overtimeAndPenaltyWins, @Nullable Integer overtimeAndPenaltyLosses, @Nullable Integer noResult, @Nullable Integer secondaryScoresFor, @Nullable Integer secondaryScoresAgainst, @Nullable Integer threePoints, @Nullable Integer twoPoints, @Nullable Integer onePoint, @Nullable Integer zeroPoint, @Nullable Integer streak, @Nullable Double percentage, @Nullable Double gamesBehind, @Nullable Double netRunRate, @Nullable Double oversFor, @Nullable Double oversAgainst, @Nullable Integer normaltimeWins, @Nullable Integer normaltimeLosses) {
        team.getClass();
        descriptions.getClass();
        return new StandingsTableRow(id, team, promotion, descriptions, liveMatchWinnerCodeColumn, position, matches, wins, losses, draws, scoresFor, scoresAgainst, points, pointsPerGame, pointsCurrSeason, pointsPrevSeason, pointsPrevPrevSeason, overtimeWins, overtimeLosses, penaltyWins, penaltyLosses, overtimeAndPenaltyWins, overtimeAndPenaltyLosses, noResult, secondaryScoresFor, secondaryScoresAgainst, threePoints, twoPoints, onePoint, zeroPoint, streak, percentage, gamesBehind, netRunRate, oversFor, oversAgainst, normaltimeWins, normaltimeLosses);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandingsTableRow)) {
            return false;
        }
        StandingsTableRow standingsTableRow = (StandingsTableRow) other;
        return this.id == standingsTableRow.id && Intrinsics.c(this.team, standingsTableRow.team) && Intrinsics.c(this.promotion, standingsTableRow.promotion) && Intrinsics.c(this.descriptions, standingsTableRow.descriptions) && Intrinsics.c(this.liveMatchWinnerCodeColumn, standingsTableRow.liveMatchWinnerCodeColumn) && this.position == standingsTableRow.position && Intrinsics.c(this.matches, standingsTableRow.matches) && Intrinsics.c(this.wins, standingsTableRow.wins) && Intrinsics.c(this.losses, standingsTableRow.losses) && Intrinsics.c(this.draws, standingsTableRow.draws) && Intrinsics.c(this.scoresFor, standingsTableRow.scoresFor) && Intrinsics.c(this.scoresAgainst, standingsTableRow.scoresAgainst) && Intrinsics.c(this.points, standingsTableRow.points) && Intrinsics.c(this.pointsPerGame, standingsTableRow.pointsPerGame) && Intrinsics.c(this.pointsCurrSeason, standingsTableRow.pointsCurrSeason) && Intrinsics.c(this.pointsPrevSeason, standingsTableRow.pointsPrevSeason) && Intrinsics.c(this.pointsPrevPrevSeason, standingsTableRow.pointsPrevPrevSeason) && Intrinsics.c(this.overtimeWins, standingsTableRow.overtimeWins) && Intrinsics.c(this.overtimeLosses, standingsTableRow.overtimeLosses) && Intrinsics.c(this.penaltyWins, standingsTableRow.penaltyWins) && Intrinsics.c(this.penaltyLosses, standingsTableRow.penaltyLosses) && Intrinsics.c(this.overtimeAndPenaltyWins, standingsTableRow.overtimeAndPenaltyWins) && Intrinsics.c(this.overtimeAndPenaltyLosses, standingsTableRow.overtimeAndPenaltyLosses) && Intrinsics.c(this.noResult, standingsTableRow.noResult) && Intrinsics.c(this.secondaryScoresFor, standingsTableRow.secondaryScoresFor) && Intrinsics.c(this.secondaryScoresAgainst, standingsTableRow.secondaryScoresAgainst) && Intrinsics.c(this.threePoints, standingsTableRow.threePoints) && Intrinsics.c(this.twoPoints, standingsTableRow.twoPoints) && Intrinsics.c(this.onePoint, standingsTableRow.onePoint) && Intrinsics.c(this.zeroPoint, standingsTableRow.zeroPoint) && Intrinsics.c(this.streak, standingsTableRow.streak) && Intrinsics.c(this.percentage, standingsTableRow.percentage) && Intrinsics.c(this.gamesBehind, standingsTableRow.gamesBehind) && Intrinsics.c(this.netRunRate, standingsTableRow.netRunRate) && Intrinsics.c(this.oversFor, standingsTableRow.oversFor) && Intrinsics.c(this.oversAgainst, standingsTableRow.oversAgainst) && Intrinsics.c(this.normaltimeWins, standingsTableRow.normaltimeWins) && Intrinsics.c(this.normaltimeLosses, standingsTableRow.normaltimeLosses);
    }

    @Nullable
    public final Integer getAvailableLosses() {
        Integer num = this.normaltimeLosses;
        return num == null ? this.losses : num;
    }

    @Nullable
    public final Integer getAvailableOvertimeLosses() {
        Integer num = this.overtimeAndPenaltyLosses;
        return num == null ? this.overtimeLosses : num;
    }

    @NotNull
    public final List<Description> getDescriptions() {
        return this.descriptions;
    }

    @Nullable
    public final Integer getDraws() {
        return this.draws;
    }

    @NotNull
    public final List<String> getForm() {
        return this.form;
    }

    @Nullable
    public final Double getGamesBehind() {
        return this.gamesBehind;
    }

    @Nullable
    public final String getGoals() {
        Integer num;
        Integer num2 = this.scoresFor;
        if (num2 == null || (num = this.scoresAgainst) == null) {
            return null;
        }
        return ljg.m(num2, num, ":");
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getLiveMatchWinnerCodeColumn() {
        return this.liveMatchWinnerCodeColumn;
    }

    @Nullable
    public final Integer getLosses() {
        return this.losses;
    }

    @Nullable
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    public final Double getNetRunRate() {
        return this.netRunRate;
    }

    @Nullable
    public final Integer getNoResult() {
        return this.noResult;
    }

    @Nullable
    public final Integer getNormaltimeLosses() {
        return this.normaltimeLosses;
    }

    @Nullable
    public final Integer getNormaltimeWins() {
        return this.normaltimeWins;
    }

    @Nullable
    public final Integer getOnePoint() {
        return this.onePoint;
    }

    @Nullable
    public final Double getOversAgainst() {
        return this.oversAgainst;
    }

    @Nullable
    public final Double getOversFor() {
        return this.oversFor;
    }

    @Nullable
    public final Integer getOvertimeAndPenaltyLosses() {
        return this.overtimeAndPenaltyLosses;
    }

    @Nullable
    public final Integer getOvertimeAndPenaltyWins() {
        return this.overtimeAndPenaltyWins;
    }

    @Nullable
    public final Integer getOvertimeLosses() {
        return this.overtimeLosses;
    }

    @Nullable
    public final String getOvertimeRecord() {
        Integer num;
        Integer num2 = this.overtimeWins;
        if (num2 == null || (num = this.overtimeLosses) == null) {
            return null;
        }
        return ljg.m(num2, num, "-");
    }

    @Nullable
    public final Integer getOvertimeWins() {
        return this.overtimeWins;
    }

    @Nullable
    public final String getPctGoals() {
        Integer num;
        if (this.scoresFor == null || (num = this.scoresAgainst) == null) {
            return null;
        }
        if (num.intValue() > 0) {
            return new DecimalFormat("0.##", new DecimalFormatSymbols(ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault())).format(this.scoresFor.intValue() / this.scoresAgainst.intValue());
        }
        return "∞";
    }

    @Nullable
    public final Integer getPenaltyLosses() {
        return this.penaltyLosses;
    }

    @Nullable
    public final Integer getPenaltyWins() {
        return this.penaltyWins;
    }

    @Nullable
    public final Double getPercentage() {
        return this.percentage;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPointsCurrSeason() {
        return this.pointsCurrSeason;
    }

    @Nullable
    public final Double getPointsPerGame() {
        return this.pointsPerGame;
    }

    @Nullable
    public final Integer getPointsPrevPrevSeason() {
        return this.pointsPrevPrevSeason;
    }

    @Nullable
    public final Integer getPointsPrevSeason() {
        return this.pointsPrevSeason;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final Description getPromotion() {
        return this.promotion;
    }

    @Nullable
    public final String getScoreDiffFormatted() {
        Integer scoreDiff = getScoreDiff();
        if (scoreDiff == null) {
            return null;
        }
        int intValue = scoreDiff.intValue();
        return intValue > 0 ? ljg.j(intValue, "+") : String.valueOf(intValue);
    }

    @Nullable
    public final Integer getScoresAgainst() {
        return this.scoresAgainst;
    }

    @Nullable
    public final Integer getScoresFor() {
        return this.scoresFor;
    }

    @Nullable
    public final Integer getSecondaryScoresAgainst() {
        return this.secondaryScoresAgainst;
    }

    @Nullable
    public final Integer getSecondaryScoresFor() {
        return this.secondaryScoresFor;
    }

    @Nullable
    public final String getShootoutRecord() {
        Integer num;
        Integer num2 = this.penaltyWins;
        if (num2 == null || (num = this.penaltyLosses) == null) {
            return null;
        }
        return ljg.m(num2, num, "-");
    }

    @Nullable
    public final Integer getStreak() {
        return this.streak;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final Integer getThreePoints() {
        return this.threePoints;
    }

    @Nullable
    public final Integer getTwoPoints() {
        return this.twoPoints;
    }

    @Nullable
    public final String getWinLosses() {
        Integer num;
        Integer num2 = this.wins;
        if (num2 == null || (num = this.losses) == null) {
            return null;
        }
        return ljg.m(num2, num, "-");
    }

    @Nullable
    public final Integer getWins() {
        return this.wins;
    }

    @Nullable
    public final String getWinsLossesTies() {
        Integer num;
        Integer num2 = this.wins;
        if (num2 == null || (num = this.losses) == null) {
            return null;
        }
        Integer num3 = this.draws;
        return num2 + "-" + num + "-" + (num3 != null ? num3.intValue() : 0);
    }

    @Nullable
    public final Integer getZeroPoint() {
        return this.zeroPoint;
    }

    public int hashCode() {
        int b = fc6.b(Integer.hashCode(this.id) * 31, 31, this.team);
        Description description = this.promotion;
        int d = dmi.d((b + (description == null ? 0 : description.hashCode())) * 31, 31, this.descriptions);
        String str = this.liveMatchWinnerCodeColumn;
        int a = wv8.a(this.position, (d + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.matches;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.wins;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.losses;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.draws;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.scoresFor;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.scoresAgainst;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.points;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Double d2 = this.pointsPerGame;
        int hashCode8 = (hashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num8 = this.pointsCurrSeason;
        int hashCode9 = (hashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.pointsPrevSeason;
        int hashCode10 = (hashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.pointsPrevPrevSeason;
        int hashCode11 = (hashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.overtimeWins;
        int hashCode12 = (hashCode11 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.overtimeLosses;
        int hashCode13 = (hashCode12 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.penaltyWins;
        int hashCode14 = (hashCode13 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.penaltyLosses;
        int hashCode15 = (hashCode14 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.overtimeAndPenaltyWins;
        int hashCode16 = (hashCode15 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.overtimeAndPenaltyLosses;
        int hashCode17 = (hashCode16 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.noResult;
        int hashCode18 = (hashCode17 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.secondaryScoresFor;
        int hashCode19 = (hashCode18 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.secondaryScoresAgainst;
        int hashCode20 = (hashCode19 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.threePoints;
        int hashCode21 = (hashCode20 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.twoPoints;
        int hashCode22 = (hashCode21 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.onePoint;
        int hashCode23 = (hashCode22 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.zeroPoint;
        int hashCode24 = (hashCode23 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.streak;
        int hashCode25 = (hashCode24 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Double d3 = this.percentage;
        int hashCode26 = (hashCode25 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.gamesBehind;
        int hashCode27 = (hashCode26 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.netRunRate;
        int hashCode28 = (hashCode27 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.oversFor;
        int hashCode29 = (hashCode28 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.oversAgainst;
        int hashCode30 = (hashCode29 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num25 = this.normaltimeWins;
        int hashCode31 = (hashCode30 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.normaltimeLosses;
        return hashCode31 + (num26 != null ? num26.hashCode() : 0);
    }

    public final void setForm(@NotNull List<String> list) {
        list.getClass();
        this.form = list;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setPromotion(@Nullable Description description) {
        this.promotion = description;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Team team = this.team;
        Description description = this.promotion;
        List<Description> list = this.descriptions;
        String str = this.liveMatchWinnerCodeColumn;
        int i2 = this.position;
        Integer num = this.matches;
        Integer num2 = this.wins;
        Integer num3 = this.losses;
        Integer num4 = this.draws;
        Integer num5 = this.scoresFor;
        Integer num6 = this.scoresAgainst;
        Integer num7 = this.points;
        Double d = this.pointsPerGame;
        Integer num8 = this.pointsCurrSeason;
        Integer num9 = this.pointsPrevSeason;
        Integer num10 = this.pointsPrevPrevSeason;
        Integer num11 = this.overtimeWins;
        Integer num12 = this.overtimeLosses;
        Integer num13 = this.penaltyWins;
        Integer num14 = this.penaltyLosses;
        Integer num15 = this.overtimeAndPenaltyWins;
        Integer num16 = this.overtimeAndPenaltyLosses;
        Integer num17 = this.noResult;
        Integer num18 = this.secondaryScoresFor;
        Integer num19 = this.secondaryScoresAgainst;
        Integer num20 = this.threePoints;
        Integer num21 = this.twoPoints;
        Integer num22 = this.onePoint;
        Integer num23 = this.zeroPoint;
        Integer num24 = this.streak;
        Double d2 = this.percentage;
        Double d3 = this.gamesBehind;
        Double d4 = this.netRunRate;
        Double d5 = this.oversFor;
        Double d6 = this.oversAgainst;
        Integer num25 = this.normaltimeWins;
        Integer num26 = this.normaltimeLosses;
        StringBuilder sb = new StringBuilder("StandingsTableRow(id=");
        sb.append(i);
        sb.append(", team=");
        sb.append(team);
        sb.append(", promotion=");
        sb.append(description);
        sb.append(", descriptions=");
        sb.append(list);
        sb.append(", liveMatchWinnerCodeColumn=");
        w1l.q(i2, str, ", position=", ", matches=", sb);
        vxd.r(num, num2, ", wins=", ", losses=", sb);
        vxd.r(num3, num4, ", draws=", ", scoresFor=", sb);
        vxd.r(num5, num6, ", scoresAgainst=", ", points=", sb);
        fn0.v(d, num7, ", pointsPerGame=", ", pointsCurrSeason=", sb);
        vxd.r(num8, num9, ", pointsPrevSeason=", ", pointsPrevPrevSeason=", sb);
        vxd.r(num10, num11, ", overtimeWins=", ", overtimeLosses=", sb);
        vxd.r(num12, num13, ", penaltyWins=", ", penaltyLosses=", sb);
        vxd.r(num14, num15, ", overtimeAndPenaltyWins=", ", overtimeAndPenaltyLosses=", sb);
        vxd.r(num16, num17, ", noResult=", ", secondaryScoresFor=", sb);
        vxd.r(num18, num19, ", secondaryScoresAgainst=", ", threePoints=", sb);
        vxd.r(num20, num21, ", twoPoints=", ", onePoint=", sb);
        vxd.r(num22, num23, ", zeroPoint=", ", streak=", sb);
        fn0.v(d2, num24, ", percentage=", ", gamesBehind=", sb);
        fc6.A(sb, d3, ", netRunRate=", d4, ", oversFor=");
        fc6.A(sb, d5, ", oversAgainst=", d6, ", normaltimeWins=");
        return fc6.l(num25, num26, ", normaltimeLosses=", ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/StandingsTableRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/StandingsTableRow;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StandingsTableRow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StandingsTableRow(int i, @NotNull Team team, @Nullable Description description, @NotNull List<Description> list, @Nullable String str, int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Double d, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Double d6, @Nullable Integer num25, @Nullable Integer num26) {
        team.getClass();
        list.getClass();
        this.id = i;
        this.team = team;
        this.promotion = description;
        this.descriptions = list;
        this.liveMatchWinnerCodeColumn = str;
        this.position = i2;
        this.matches = num;
        this.wins = num2;
        this.losses = num3;
        this.draws = num4;
        this.scoresFor = num5;
        this.scoresAgainst = num6;
        this.points = num7;
        this.pointsPerGame = d;
        this.pointsCurrSeason = num8;
        this.pointsPrevSeason = num9;
        this.pointsPrevPrevSeason = num10;
        this.overtimeWins = num11;
        this.overtimeLosses = num12;
        this.penaltyWins = num13;
        this.penaltyLosses = num14;
        this.overtimeAndPenaltyWins = num15;
        this.overtimeAndPenaltyLosses = num16;
        this.noResult = num17;
        this.secondaryScoresFor = num18;
        this.secondaryScoresAgainst = num19;
        this.threePoints = num20;
        this.twoPoints = num21;
        this.onePoint = num22;
        this.zeroPoint = num23;
        this.streak = num24;
        this.percentage = d2;
        this.gamesBehind = d3;
        this.netRunRate = d4;
        this.oversFor = d5;
        this.oversAgainst = d6;
        this.normaltimeWins = num25;
        this.normaltimeLosses = num26;
        this.form = new ArrayList();
    }

    public /* synthetic */ StandingsTableRow(int i, Team team, Description description, List list, String str, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Double d, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Double d2, Double d3, Double d4, Double d5, Double d6, Integer num25, Integer num26, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, team, description, list, str, (i3 & 32) != 0 ? 0 : i2, num, num2, num3, num4, num5, num6, num7, d, num8, num9, num10, num11, num12, num13, num14, num15, num16, num17, num18, num19, num20, num21, num22, num23, num24, d2, d3, d4, d5, d6, num25, num26);
    }
}
