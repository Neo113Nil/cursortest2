package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Team;
import defpackage.a7a;
import defpackage.b1i;
import defpackage.bf3;
import defpackage.gz1;
import defpackage.h75;
import defpackage.hz8;
import defpackage.joa;
import defpackage.lkb;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.lang.annotation.Annotation;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bF\b\u0087\b\u0018\u0000 Þ\u00012\u00020\u0001:\u0004ß\u0001Þ\u0001BÅ\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010#\u001a\u0004\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010\r\u0012\b\u0010%\u001a\u0004\u0018\u00010\t\u0012\b\u0010&\u001a\u0004\u0018\u00010\t\u0012\b\u0010'\u001a\u0004\u0018\u00010\t\u0012\b\u0010(\u001a\u0004\u0018\u00010\t\u0012\b\u0010)\u001a\u0004\u0018\u00010\t\u0012\b\u0010*\u001a\u0004\u0018\u00010\r\u0012\b\u0010+\u001a\u0004\u0018\u00010\r\u0012\b\u0010,\u001a\u0004\u0018\u00010\r\u0012\b\u0010-\u001a\u0004\u0018\u00010\t\u0012\b\u0010.\u001a\u0004\u0018\u00010\r\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\b\u00100\u001a\u0004\u0018\u00010\r\u0012\b\u00101\u001a\u0004\u0018\u00010\t\u0012\b\u00102\u001a\u0004\u0018\u00010\t\u0012\b\u00103\u001a\u0004\u0018\u00010\r\u0012\b\u00104\u001a\u0004\u0018\u00010\r\u0012\b\u00105\u001a\u0004\u0018\u00010\r\u0012\b\u00106\u001a\u0004\u0018\u00010\t\u0012\b\u00107\u001a\u0004\u0018\u00010\t\u0012\b\u00108\u001a\u0004\u0018\u00010\t\u0012\b\u00109\u001a\u0004\u0018\u00010\t\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<\u0012\b\u0010?\u001a\u0004\u0018\u00010\t\u0012\b\u0010@\u001a\u0004\u0018\u00010\r\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010EBã\u0004\b\u0010\u0012\u0006\u0010F\u001a\u00020\t\u0012\u0006\u0010G\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010#\u001a\u0004\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010\r\u0012\b\u0010%\u001a\u0004\u0018\u00010\t\u0012\b\u0010&\u001a\u0004\u0018\u00010\t\u0012\b\u0010'\u001a\u0004\u0018\u00010\t\u0012\b\u0010(\u001a\u0004\u0018\u00010\t\u0012\b\u0010)\u001a\u0004\u0018\u00010\t\u0012\b\u0010*\u001a\u0004\u0018\u00010\r\u0012\b\u0010+\u001a\u0004\u0018\u00010\r\u0012\b\u0010,\u001a\u0004\u0018\u00010\r\u0012\b\u0010-\u001a\u0004\u0018\u00010\t\u0012\b\u0010.\u001a\u0004\u0018\u00010\r\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\b\u00100\u001a\u0004\u0018\u00010\r\u0012\b\u00101\u001a\u0004\u0018\u00010\t\u0012\b\u00102\u001a\u0004\u0018\u00010\t\u0012\b\u00103\u001a\u0004\u0018\u00010\r\u0012\b\u00104\u001a\u0004\u0018\u00010\r\u0012\b\u00105\u001a\u0004\u0018\u00010\r\u0012\b\u00106\u001a\u0004\u0018\u00010\t\u0012\b\u00107\u001a\u0004\u0018\u00010\t\u0012\b\u00108\u001a\u0004\u0018\u00010\t\u0012\b\u00109\u001a\u0004\u0018\u00010\t\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<\u0012\b\u0010?\u001a\u0004\u0018\u00010\t\u0012\b\u0010@\u001a\u0004\u0018\u00010\r\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bD\u0010JJ\u0010\u0010K\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u0010LJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bT\u0010SJ\u0012\u0010U\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bU\u0010SJ\u0012\u0010V\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bX\u0010WJ\u0012\u0010Y\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bY\u0010WJ\u0012\u0010Z\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bZ\u0010SJ\u0012\u0010[\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b[\u0010WJ\u0012\u0010\\\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\\\u0010SJ\u0012\u0010]\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b]\u0010SJ\u0012\u0010^\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b^\u0010SJ\u0012\u0010_\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b_\u0010WJ\u0012\u0010`\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b`\u0010WJ\u0012\u0010a\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\ba\u0010WJ\u0012\u0010b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bb\u0010SJ\u0012\u0010c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bc\u0010SJ\u0012\u0010d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bd\u0010SJ\u0012\u0010e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\be\u0010SJ\u0012\u0010f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bf\u0010SJ\u0012\u0010g\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bg\u0010SJ\u0012\u0010h\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bh\u0010SJ\u0012\u0010i\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bi\u0010SJ\u0012\u0010j\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bj\u0010SJ\u0012\u0010k\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bk\u0010WJ\u0012\u0010l\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bl\u0010SJ\u0012\u0010m\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bm\u0010WJ\u0012\u0010n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bn\u0010SJ\u0012\u0010o\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bo\u0010SJ\u0012\u0010p\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bp\u0010SJ\u0012\u0010q\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bq\u0010SJ\u0012\u0010r\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\br\u0010SJ\u0012\u0010s\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bs\u0010WJ\u0012\u0010t\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bt\u0010WJ\u0012\u0010u\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bu\u0010WJ\u0012\u0010v\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bv\u0010SJ\u0012\u0010w\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bw\u0010WJ\u0012\u0010x\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bx\u0010QJ\u0012\u0010y\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\by\u0010WJ\u0012\u0010z\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bz\u0010SJ\u0012\u0010{\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b{\u0010SJ\u0012\u0010|\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b|\u0010WJ\u0012\u0010}\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b}\u0010WJ\u0012\u0010~\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b~\u0010WJ\u0012\u0010\u007f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u007f\u0010SJ\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010SJ\u0014\u0010\u0081\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0005\b\u0081\u0001\u0010SJ\u0014\u0010\u0082\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0005\b\u0082\u0001\u0010SJ\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010:HÆ\u0003¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001b\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<HÆ\u0003¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0014\u0010\u0087\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010SJ\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0005\b\u0088\u0001\u0010WJ\u0014\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0005\b\u0089\u0001\u0010OJ\u0015\u0010\u008a\u0001\u001a\u0004\u0018\u00010BHÆ\u0003¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001JÃ\u0005\u0010\u008c\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010C\u001a\u0004\u0018\u00010BHÆ\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0012\u0010\u008e\u0001\u001a\u00020\rHÖ\u0001¢\u0006\u0005\b\u008e\u0001\u0010WJ\u0013\u0010\u008f\u0001\u001a\u00020\tHÖ\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001f\u0010\u0093\u0001\u001a\u00020\u00052\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u0001HÖ\u0003¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J0\u0010\u009d\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u0095\u0001\u001a\u00020\u00002\b\u0010\u0097\u0001\u001a\u00030\u0096\u00012\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010\u009e\u0001\u001a\u0005\b\u009f\u0001\u0010LR\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0004\u0010\u009e\u0001\u001a\u0005\b \u0001\u0010LR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0005\b\u0006\u0010¡\u0001\u001a\u0004\b\u0006\u0010OR\u001b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\b\u0010¢\u0001\u001a\u0005\b£\u0001\u0010QR\u001b\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\n\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010SR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010¤\u0001\u001a\u0005\b¦\u0001\u0010SR\u001b\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\f\u0010¤\u0001\u001a\u0005\b§\u0001\u0010SR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010¨\u0001\u001a\u0005\b©\u0001\u0010WR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010¨\u0001\u001a\u0005\bª\u0001\u0010WR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010¨\u0001\u001a\u0005\b«\u0001\u0010WR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010¤\u0001\u001a\u0005\b¬\u0001\u0010SR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010¨\u0001\u001a\u0005\b\u00ad\u0001\u0010WR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010¤\u0001\u001a\u0005\b®\u0001\u0010SR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010¤\u0001\u001a\u0005\b¯\u0001\u0010SR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010¤\u0001\u001a\u0005\b°\u0001\u0010SR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010¨\u0001\u001a\u0005\b±\u0001\u0010WR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010¨\u0001\u001a\u0005\b²\u0001\u0010WR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010¨\u0001\u001a\u0005\b³\u0001\u0010WR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010¤\u0001\u001a\u0005\b´\u0001\u0010SR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010¤\u0001\u001a\u0005\bµ\u0001\u0010SR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010¤\u0001\u001a\u0005\b¶\u0001\u0010SR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010¤\u0001\u001a\u0005\b·\u0001\u0010SR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010¤\u0001\u001a\u0005\b¸\u0001\u0010SR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010¤\u0001\u001a\u0005\b¹\u0001\u0010SR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010¤\u0001\u001a\u0005\bº\u0001\u0010SR\u001b\u0010 \u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b \u0010¤\u0001\u001a\u0005\b»\u0001\u0010SR\u001b\u0010!\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b!\u0010¤\u0001\u001a\u0005\b¼\u0001\u0010SR\u001b\u0010\"\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\"\u0010¨\u0001\u001a\u0005\b½\u0001\u0010WR\u001b\u0010#\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b#\u0010¤\u0001\u001a\u0005\b¾\u0001\u0010SR\u001b\u0010$\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b$\u0010¨\u0001\u001a\u0005\b¿\u0001\u0010WR\u001b\u0010%\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b%\u0010¤\u0001\u001a\u0005\bÀ\u0001\u0010SR\u001b\u0010&\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b&\u0010¤\u0001\u001a\u0005\bÁ\u0001\u0010SR\u001b\u0010'\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b'\u0010¤\u0001\u001a\u0005\bÂ\u0001\u0010SR\u001b\u0010(\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b(\u0010¤\u0001\u001a\u0005\bÃ\u0001\u0010SR\u001b\u0010)\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b)\u0010¤\u0001\u001a\u0005\bÄ\u0001\u0010SR\u001b\u0010*\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b*\u0010¨\u0001\u001a\u0005\bÅ\u0001\u0010WR\u001b\u0010+\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b+\u0010¨\u0001\u001a\u0005\bÆ\u0001\u0010WR\u001b\u0010,\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b,\u0010¨\u0001\u001a\u0005\bÇ\u0001\u0010WR\u001b\u0010-\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b-\u0010¤\u0001\u001a\u0005\bÈ\u0001\u0010SR\u001b\u0010.\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b.\u0010¨\u0001\u001a\u0005\bÉ\u0001\u0010WR\u001b\u0010/\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b/\u0010¢\u0001\u001a\u0005\bÊ\u0001\u0010QR\u001b\u00100\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b0\u0010¨\u0001\u001a\u0005\bË\u0001\u0010WR\u001b\u00101\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b1\u0010¤\u0001\u001a\u0005\bÌ\u0001\u0010SR\u001b\u00102\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b2\u0010¤\u0001\u001a\u0005\bÍ\u0001\u0010SR\u001b\u00103\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b3\u0010¨\u0001\u001a\u0005\bÎ\u0001\u0010WR\u001b\u00104\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b4\u0010¨\u0001\u001a\u0005\bÏ\u0001\u0010WR\u001b\u00105\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b5\u0010¨\u0001\u001a\u0005\bÐ\u0001\u0010WR\u001b\u00106\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b6\u0010¤\u0001\u001a\u0005\bÑ\u0001\u0010SR\u001b\u00107\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b7\u0010¤\u0001\u001a\u0005\bÒ\u0001\u0010SR\u001b\u00108\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b8\u0010¤\u0001\u001a\u0005\bÓ\u0001\u0010SR\u001b\u00109\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b9\u0010¤\u0001\u001a\u0005\bÔ\u0001\u0010SR\u001c\u0010;\u001a\u0004\u0018\u00010:8\u0006¢\u0006\u000f\n\u0005\b;\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010\u0084\u0001R\"\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<8\u0006¢\u0006\u000f\n\u0005\b>\u0010×\u0001\u001a\u0006\bØ\u0001\u0010\u0086\u0001R\u001b\u0010?\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b?\u0010¤\u0001\u001a\u0005\bÙ\u0001\u0010SR\u001b\u0010@\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b@\u0010¨\u0001\u001a\u0005\bÚ\u0001\u0010WR\u001b\u0010A\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bA\u0010¡\u0001\u001a\u0005\bÛ\u0001\u0010OR\u001c\u0010C\u001a\u0004\u0018\u00010B8\u0006¢\u0006\u000f\n\u0005\bC\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010\u008b\u0001¨\u0006à\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/StageStandingsItem;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Team;", "team", "parentTeam", "", "isLive", "", "points", "", "bonusPoints", "laps", "lapsLed", "", "lapTime", "avgTime", "totalTime", "position", "gap", "gridPosition", "number", "pitStops", "speed", "status", "subStatus", "didNotStart", "didNotFinish", "disqualified", "victories", "racesStarted", "racesWithPoints", "polePositions", "podiums", "fastestLaps", "fastestLapTime", "personalFastestLap", "personalFastestLapTime", "podiumsBothDrivers", "pointsBothDrivers", "doubleVictories", "top5", "top10", "handicap", "comment", "details", "misses", "skiingTime", "worldCupPoints", "distance", "sprint", "climb", "time", "youngRider", "teamTime", "sprintPosition", "climbPosition", "youngRiderPosition", "previousPosition", "", "updatedAtTimestamp", "", "Lcom/sofascore/model/newNetwork/TyrePeriod;", "tyreInfo", "lapsBehind", "interval", "startedFromPit", "Lcom/sofascore/model/newNetwork/CyclingShirtType;", "shirt", "<init>", "(Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/sofascore/model/newNetwork/CyclingShirtType;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/sofascore/model/newNetwork/CyclingShirtType;Lt5h;)V", "component1", "()Lcom/sofascore/model/mvvm/model/Team;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/Double;", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "()Ljava/lang/String;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "()Ljava/lang/Long;", "component53", "()Ljava/util/List;", "component54", "component55", "component56", "component57", "()Lcom/sofascore/model/newNetwork/CyclingShirtType;", "copy", "(Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/sofascore/model/newNetwork/CyclingShirtType;)Lcom/sofascore/model/newNetwork/StageStandingsItem;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/StageStandingsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "getParentTeam", "Ljava/lang/Boolean;", "Ljava/lang/Double;", "getPoints", "Ljava/lang/Integer;", "getBonusPoints", "getLaps", "getLapsLed", "Ljava/lang/String;", "getLapTime", "getAvgTime", "getTotalTime", "getPosition", "getGap", "getGridPosition", "getNumber", "getPitStops", "getSpeed", "getStatus", "getSubStatus", "getDidNotStart", "getDidNotFinish", "getDisqualified", "getVictories", "getRacesStarted", "getRacesWithPoints", "getPolePositions", "getPodiums", "getFastestLaps", "getFastestLapTime", "getPersonalFastestLap", "getPersonalFastestLapTime", "getPodiumsBothDrivers", "getPointsBothDrivers", "getDoubleVictories", "getTop5", "getTop10", "getHandicap", "getComment", "getDetails", "getMisses", "getSkiingTime", "getWorldCupPoints", "getDistance", "getSprint", "getClimb", "getTime", "getYoungRider", "getTeamTime", "getSprintPosition", "getClimbPosition", "getYoungRiderPosition", "getPreviousPosition", "Ljava/lang/Long;", "getUpdatedAtTimestamp", "Ljava/util/List;", "getTyreInfo", "getLapsBehind", "getInterval", "getStartedFromPit", "Lcom/sofascore/model/newNetwork/CyclingShirtType;", "getShirt", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StageStandingsItem implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String avgTime;

    @Nullable
    private final Integer bonusPoints;

    @Nullable
    private final Integer climb;

    @Nullable
    private final Integer climbPosition;

    @Nullable
    private final String comment;

    @Nullable
    private final String details;

    @Nullable
    private final Integer didNotFinish;

    @Nullable
    private final Integer didNotStart;

    @Nullable
    private final Integer disqualified;

    @Nullable
    private final String distance;

    @Nullable
    private final Integer doubleVictories;

    @Nullable
    private final String fastestLapTime;

    @Nullable
    private final Integer fastestLaps;

    @Nullable
    private final String gap;

    @Nullable
    private final Integer gridPosition;

    @Nullable
    private final String handicap;

    @Nullable
    private final String interval;

    @Nullable
    private final Boolean isLive;

    @Nullable
    private final String lapTime;

    @Nullable
    private final Integer laps;

    @Nullable
    private final Integer lapsBehind;

    @Nullable
    private final Integer lapsLed;

    @Nullable
    private final Integer misses;

    @Nullable
    private final Integer number;

    @Nullable
    private final Team parentTeam;

    @Nullable
    private final Integer personalFastestLap;

    @Nullable
    private final String personalFastestLapTime;

    @Nullable
    private final Integer pitStops;

    @Nullable
    private final Integer podiums;

    @Nullable
    private final Integer podiumsBothDrivers;

    @Nullable
    private final Double points;

    @Nullable
    private final Integer pointsBothDrivers;

    @Nullable
    private final Integer polePositions;

    @Nullable
    private final Integer position;

    @Nullable
    private final Integer previousPosition;

    @Nullable
    private final Integer racesStarted;

    @Nullable
    private final Integer racesWithPoints;

    @Nullable
    private final CyclingShirtType shirt;

    @Nullable
    private final String skiingTime;

    @Nullable
    private final String speed;

    @Nullable
    private final Integer sprint;

    @Nullable
    private final Integer sprintPosition;

    @Nullable
    private final Boolean startedFromPit;

    @Nullable
    private final String status;

    @Nullable
    private final String subStatus;

    @NotNull
    private final Team team;

    @Nullable
    private final String teamTime;

    @Nullable
    private final String time;

    @Nullable
    private final Integer top10;

    @Nullable
    private final Integer top5;

    @Nullable
    private final String totalTime;

    @Nullable
    private final List<TyrePeriod> tyreInfo;

    @Nullable
    private final Long updatedAtTimestamp;

    @Nullable
    private final Integer victories;

    @Nullable
    private final Double worldCupPoints;

    @Nullable
    private final String youngRider;

    @Nullable
    private final Integer youngRiderPosition;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new b1i(21)), ypa.a(ysaVar, new b1i(22)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new b1i(23)), null, null, null, ypa.a(ysaVar, new b1i(24))};
    }

    public /* synthetic */ StageStandingsItem(int i, int i2, Team team, Team team2, Boolean bool, Double d, Integer num, Integer num2, Integer num3, String str, String str2, String str3, Integer num4, String str4, Integer num5, Integer num6, Integer num7, String str5, String str6, String str7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, String str8, Integer num17, String str9, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, String str10, String str11, String str12, Integer num23, String str13, Double d2, String str14, Integer num24, Integer num25, String str15, String str16, String str17, Integer num26, Integer num27, Integer num28, Integer num29, Long l, List list, Integer num30, String str18, Boolean bool2, CyclingShirtType cyclingShirtType, t5h t5hVar) {
        if ((33554431 != (i2 & 33554431)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, 33554431}, StageStandingsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.team = team;
        this.parentTeam = team2;
        this.isLive = bool;
        this.points = d;
        this.bonusPoints = num;
        this.laps = num2;
        this.lapsLed = num3;
        this.lapTime = str;
        this.avgTime = str2;
        this.totalTime = str3;
        this.position = num4;
        this.gap = str4;
        this.gridPosition = num5;
        this.number = num6;
        this.pitStops = num7;
        this.speed = str5;
        this.status = str6;
        this.subStatus = str7;
        this.didNotStart = num8;
        this.didNotFinish = num9;
        this.disqualified = num10;
        this.victories = num11;
        this.racesStarted = num12;
        this.racesWithPoints = num13;
        this.polePositions = num14;
        this.podiums = num15;
        this.fastestLaps = num16;
        this.fastestLapTime = str8;
        this.personalFastestLap = num17;
        this.personalFastestLapTime = str9;
        this.podiumsBothDrivers = num18;
        this.pointsBothDrivers = num19;
        this.doubleVictories = num20;
        this.top5 = num21;
        this.top10 = num22;
        this.handicap = str10;
        this.comment = str11;
        this.details = str12;
        this.misses = num23;
        this.skiingTime = str13;
        this.worldCupPoints = d2;
        this.distance = str14;
        this.sprint = num24;
        this.climb = num25;
        this.time = str15;
        this.youngRider = str16;
        this.teamTime = str17;
        this.sprintPosition = num26;
        this.climbPosition = num27;
        this.youngRiderPosition = num28;
        this.previousPosition = num29;
        this.updatedAtTimestamp = l;
        this.tyreInfo = list;
        this.lapsBehind = num30;
        this.interval = str18;
        this.startedFromPit = bool2;
        this.shirt = cyclingShirtType;
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
        return new xg0(TyrePeriod$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return hz8.F("com.sofascore.model.newNetwork.CyclingShirtType", CyclingShirtType.values(), new String[]{"general", "sprint", "climb", "young"}, new Annotation[][]{null, null, null, null});
    }

    public static final /* synthetic */ void write$Self$model_release(StageStandingsItem self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.team);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.parentTeam);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 2, gz1Var, self.isLive);
        h75 h75Var = h75.a;
        output.h(serialDesc, 3, h75Var, self.points);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.bonusPoints);
        output.h(serialDesc, 5, a7aVar, self.laps);
        output.h(serialDesc, 6, a7aVar, self.lapsLed);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 7, uhiVar, self.lapTime);
        output.h(serialDesc, 8, uhiVar, self.avgTime);
        output.h(serialDesc, 9, uhiVar, self.totalTime);
        output.h(serialDesc, 10, a7aVar, self.position);
        output.h(serialDesc, 11, uhiVar, self.gap);
        output.h(serialDesc, 12, a7aVar, self.gridPosition);
        output.h(serialDesc, 13, a7aVar, self.number);
        output.h(serialDesc, 14, a7aVar, self.pitStops);
        output.h(serialDesc, 15, uhiVar, self.speed);
        output.h(serialDesc, 16, uhiVar, self.status);
        output.h(serialDesc, 17, uhiVar, self.subStatus);
        output.h(serialDesc, 18, a7aVar, self.didNotStart);
        output.h(serialDesc, 19, a7aVar, self.didNotFinish);
        output.h(serialDesc, 20, a7aVar, self.disqualified);
        output.h(serialDesc, 21, a7aVar, self.victories);
        output.h(serialDesc, 22, a7aVar, self.racesStarted);
        output.h(serialDesc, 23, a7aVar, self.racesWithPoints);
        output.h(serialDesc, 24, a7aVar, self.polePositions);
        output.h(serialDesc, 25, a7aVar, self.podiums);
        output.h(serialDesc, 26, a7aVar, self.fastestLaps);
        output.h(serialDesc, 27, uhiVar, self.fastestLapTime);
        output.h(serialDesc, 28, a7aVar, self.personalFastestLap);
        output.h(serialDesc, 29, uhiVar, self.personalFastestLapTime);
        output.h(serialDesc, 30, a7aVar, self.podiumsBothDrivers);
        output.h(serialDesc, 31, a7aVar, self.pointsBothDrivers);
        output.h(serialDesc, 32, a7aVar, self.doubleVictories);
        output.h(serialDesc, 33, a7aVar, self.top5);
        output.h(serialDesc, 34, a7aVar, self.top10);
        output.h(serialDesc, 35, uhiVar, self.handicap);
        output.h(serialDesc, 36, uhiVar, self.comment);
        output.h(serialDesc, 37, uhiVar, self.details);
        output.h(serialDesc, 38, a7aVar, self.misses);
        output.h(serialDesc, 39, uhiVar, self.skiingTime);
        output.h(serialDesc, 40, h75Var, self.worldCupPoints);
        output.h(serialDesc, 41, uhiVar, self.distance);
        output.h(serialDesc, 42, a7aVar, self.sprint);
        output.h(serialDesc, 43, a7aVar, self.climb);
        output.h(serialDesc, 44, uhiVar, self.time);
        output.h(serialDesc, 45, uhiVar, self.youngRider);
        output.h(serialDesc, 46, uhiVar, self.teamTime);
        output.h(serialDesc, 47, a7aVar, self.sprintPosition);
        output.h(serialDesc, 48, a7aVar, self.climbPosition);
        output.h(serialDesc, 49, a7aVar, self.youngRiderPosition);
        output.h(serialDesc, 50, a7aVar, self.previousPosition);
        output.h(serialDesc, 51, lkb.a, self.updatedAtTimestamp);
        output.h(serialDesc, 52, (KSerializer) joaVarArr[52].getValue(), self.tyreInfo);
        output.h(serialDesc, 53, a7aVar, self.lapsBehind);
        output.h(serialDesc, 54, uhiVar, self.interval);
        output.h(serialDesc, 55, gz1Var, self.startedFromPit);
        output.h(serialDesc, 56, (KSerializer) joaVarArr[56].getValue(), self.shirt);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getTotalTime() {
        return this.totalTime;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getGap() {
        return this.gap;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getGridPosition() {
        return this.gridPosition;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getNumber() {
        return this.number;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getPitStops() {
        return this.pitStops;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getSpeed() {
        return this.speed;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getSubStatus() {
        return this.subStatus;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getDidNotStart() {
        return this.didNotStart;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Team getParentTeam() {
        return this.parentTeam;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getDidNotFinish() {
        return this.didNotFinish;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getDisqualified() {
        return this.disqualified;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getVictories() {
        return this.victories;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getRacesStarted() {
        return this.racesStarted;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getRacesWithPoints() {
        return this.racesWithPoints;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getPolePositions() {
        return this.polePositions;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getPodiums() {
        return this.podiums;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getFastestLaps() {
        return this.fastestLaps;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final String getFastestLapTime() {
        return this.fastestLapTime;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Integer getPersonalFastestLap() {
        return this.personalFastestLap;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsLive() {
        return this.isLive;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final String getPersonalFastestLapTime() {
        return this.personalFastestLapTime;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getPodiumsBothDrivers() {
        return this.podiumsBothDrivers;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getPointsBothDrivers() {
        return this.pointsBothDrivers;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Integer getDoubleVictories() {
        return this.doubleVictories;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Integer getTop5() {
        return this.top5;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Integer getTop10() {
        return this.top10;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final String getHandicap() {
        return this.handicap;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final Integer getMisses() {
        return this.misses;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component40, reason: from getter */
    public final String getSkiingTime() {
        return this.skiingTime;
    }

    @Nullable
    /* renamed from: component41, reason: from getter */
    public final Double getWorldCupPoints() {
        return this.worldCupPoints;
    }

    @Nullable
    /* renamed from: component42, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    @Nullable
    /* renamed from: component43, reason: from getter */
    public final Integer getSprint() {
        return this.sprint;
    }

    @Nullable
    /* renamed from: component44, reason: from getter */
    public final Integer getClimb() {
        return this.climb;
    }

    @Nullable
    /* renamed from: component45, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @Nullable
    /* renamed from: component46, reason: from getter */
    public final String getYoungRider() {
        return this.youngRider;
    }

    @Nullable
    /* renamed from: component47, reason: from getter */
    public final String getTeamTime() {
        return this.teamTime;
    }

    @Nullable
    /* renamed from: component48, reason: from getter */
    public final Integer getSprintPosition() {
        return this.sprintPosition;
    }

    @Nullable
    /* renamed from: component49, reason: from getter */
    public final Integer getClimbPosition() {
        return this.climbPosition;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getBonusPoints() {
        return this.bonusPoints;
    }

    @Nullable
    /* renamed from: component50, reason: from getter */
    public final Integer getYoungRiderPosition() {
        return this.youngRiderPosition;
    }

    @Nullable
    /* renamed from: component51, reason: from getter */
    public final Integer getPreviousPosition() {
        return this.previousPosition;
    }

    @Nullable
    /* renamed from: component52, reason: from getter */
    public final Long getUpdatedAtTimestamp() {
        return this.updatedAtTimestamp;
    }

    @Nullable
    public final List<TyrePeriod> component53() {
        return this.tyreInfo;
    }

    @Nullable
    /* renamed from: component54, reason: from getter */
    public final Integer getLapsBehind() {
        return this.lapsBehind;
    }

    @Nullable
    /* renamed from: component55, reason: from getter */
    public final String getInterval() {
        return this.interval;
    }

    @Nullable
    /* renamed from: component56, reason: from getter */
    public final Boolean getStartedFromPit() {
        return this.startedFromPit;
    }

    @Nullable
    /* renamed from: component57, reason: from getter */
    public final CyclingShirtType getShirt() {
        return this.shirt;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getLaps() {
        return this.laps;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getLapsLed() {
        return this.lapsLed;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getLapTime() {
        return this.lapTime;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getAvgTime() {
        return this.avgTime;
    }

    @NotNull
    public final StageStandingsItem copy(@NotNull Team team, @Nullable Team parentTeam, @Nullable Boolean isLive, @Nullable Double points, @Nullable Integer bonusPoints, @Nullable Integer laps, @Nullable Integer lapsLed, @Nullable String lapTime, @Nullable String avgTime, @Nullable String totalTime, @Nullable Integer position, @Nullable String gap, @Nullable Integer gridPosition, @Nullable Integer number, @Nullable Integer pitStops, @Nullable String speed, @Nullable String status, @Nullable String subStatus, @Nullable Integer didNotStart, @Nullable Integer didNotFinish, @Nullable Integer disqualified, @Nullable Integer victories, @Nullable Integer racesStarted, @Nullable Integer racesWithPoints, @Nullable Integer polePositions, @Nullable Integer podiums, @Nullable Integer fastestLaps, @Nullable String fastestLapTime, @Nullable Integer personalFastestLap, @Nullable String personalFastestLapTime, @Nullable Integer podiumsBothDrivers, @Nullable Integer pointsBothDrivers, @Nullable Integer doubleVictories, @Nullable Integer top5, @Nullable Integer top10, @Nullable String handicap, @Nullable String comment, @Nullable String details, @Nullable Integer misses, @Nullable String skiingTime, @Nullable Double worldCupPoints, @Nullable String distance, @Nullable Integer sprint, @Nullable Integer climb, @Nullable String time, @Nullable String youngRider, @Nullable String teamTime, @Nullable Integer sprintPosition, @Nullable Integer climbPosition, @Nullable Integer youngRiderPosition, @Nullable Integer previousPosition, @Nullable Long updatedAtTimestamp, @Nullable List<TyrePeriod> tyreInfo, @Nullable Integer lapsBehind, @Nullable String interval, @Nullable Boolean startedFromPit, @Nullable CyclingShirtType shirt) {
        team.getClass();
        return new StageStandingsItem(team, parentTeam, isLive, points, bonusPoints, laps, lapsLed, lapTime, avgTime, totalTime, position, gap, gridPosition, number, pitStops, speed, status, subStatus, didNotStart, didNotFinish, disqualified, victories, racesStarted, racesWithPoints, polePositions, podiums, fastestLaps, fastestLapTime, personalFastestLap, personalFastestLapTime, podiumsBothDrivers, pointsBothDrivers, doubleVictories, top5, top10, handicap, comment, details, misses, skiingTime, worldCupPoints, distance, sprint, climb, time, youngRider, teamTime, sprintPosition, climbPosition, youngRiderPosition, previousPosition, updatedAtTimestamp, tyreInfo, lapsBehind, interval, startedFromPit, shirt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageStandingsItem)) {
            return false;
        }
        StageStandingsItem stageStandingsItem = (StageStandingsItem) other;
        return Intrinsics.c(this.team, stageStandingsItem.team) && Intrinsics.c(this.parentTeam, stageStandingsItem.parentTeam) && Intrinsics.c(this.isLive, stageStandingsItem.isLive) && Intrinsics.c(this.points, stageStandingsItem.points) && Intrinsics.c(this.bonusPoints, stageStandingsItem.bonusPoints) && Intrinsics.c(this.laps, stageStandingsItem.laps) && Intrinsics.c(this.lapsLed, stageStandingsItem.lapsLed) && Intrinsics.c(this.lapTime, stageStandingsItem.lapTime) && Intrinsics.c(this.avgTime, stageStandingsItem.avgTime) && Intrinsics.c(this.totalTime, stageStandingsItem.totalTime) && Intrinsics.c(this.position, stageStandingsItem.position) && Intrinsics.c(this.gap, stageStandingsItem.gap) && Intrinsics.c(this.gridPosition, stageStandingsItem.gridPosition) && Intrinsics.c(this.number, stageStandingsItem.number) && Intrinsics.c(this.pitStops, stageStandingsItem.pitStops) && Intrinsics.c(this.speed, stageStandingsItem.speed) && Intrinsics.c(this.status, stageStandingsItem.status) && Intrinsics.c(this.subStatus, stageStandingsItem.subStatus) && Intrinsics.c(this.didNotStart, stageStandingsItem.didNotStart) && Intrinsics.c(this.didNotFinish, stageStandingsItem.didNotFinish) && Intrinsics.c(this.disqualified, stageStandingsItem.disqualified) && Intrinsics.c(this.victories, stageStandingsItem.victories) && Intrinsics.c(this.racesStarted, stageStandingsItem.racesStarted) && Intrinsics.c(this.racesWithPoints, stageStandingsItem.racesWithPoints) && Intrinsics.c(this.polePositions, stageStandingsItem.polePositions) && Intrinsics.c(this.podiums, stageStandingsItem.podiums) && Intrinsics.c(this.fastestLaps, stageStandingsItem.fastestLaps) && Intrinsics.c(this.fastestLapTime, stageStandingsItem.fastestLapTime) && Intrinsics.c(this.personalFastestLap, stageStandingsItem.personalFastestLap) && Intrinsics.c(this.personalFastestLapTime, stageStandingsItem.personalFastestLapTime) && Intrinsics.c(this.podiumsBothDrivers, stageStandingsItem.podiumsBothDrivers) && Intrinsics.c(this.pointsBothDrivers, stageStandingsItem.pointsBothDrivers) && Intrinsics.c(this.doubleVictories, stageStandingsItem.doubleVictories) && Intrinsics.c(this.top5, stageStandingsItem.top5) && Intrinsics.c(this.top10, stageStandingsItem.top10) && Intrinsics.c(this.handicap, stageStandingsItem.handicap) && Intrinsics.c(this.comment, stageStandingsItem.comment) && Intrinsics.c(this.details, stageStandingsItem.details) && Intrinsics.c(this.misses, stageStandingsItem.misses) && Intrinsics.c(this.skiingTime, stageStandingsItem.skiingTime) && Intrinsics.c(this.worldCupPoints, stageStandingsItem.worldCupPoints) && Intrinsics.c(this.distance, stageStandingsItem.distance) && Intrinsics.c(this.sprint, stageStandingsItem.sprint) && Intrinsics.c(this.climb, stageStandingsItem.climb) && Intrinsics.c(this.time, stageStandingsItem.time) && Intrinsics.c(this.youngRider, stageStandingsItem.youngRider) && Intrinsics.c(this.teamTime, stageStandingsItem.teamTime) && Intrinsics.c(this.sprintPosition, stageStandingsItem.sprintPosition) && Intrinsics.c(this.climbPosition, stageStandingsItem.climbPosition) && Intrinsics.c(this.youngRiderPosition, stageStandingsItem.youngRiderPosition) && Intrinsics.c(this.previousPosition, stageStandingsItem.previousPosition) && Intrinsics.c(this.updatedAtTimestamp, stageStandingsItem.updatedAtTimestamp) && Intrinsics.c(this.tyreInfo, stageStandingsItem.tyreInfo) && Intrinsics.c(this.lapsBehind, stageStandingsItem.lapsBehind) && Intrinsics.c(this.interval, stageStandingsItem.interval) && Intrinsics.c(this.startedFromPit, stageStandingsItem.startedFromPit) && this.shirt == stageStandingsItem.shirt;
    }

    @Nullable
    public final String getAvgTime() {
        return this.avgTime;
    }

    @Nullable
    public final Integer getBonusPoints() {
        return this.bonusPoints;
    }

    @Nullable
    public final Integer getClimb() {
        return this.climb;
    }

    @Nullable
    public final Integer getClimbPosition() {
        return this.climbPosition;
    }

    @Nullable
    public final String getComment() {
        return this.comment;
    }

    @Nullable
    public final String getDetails() {
        return this.details;
    }

    @Nullable
    public final Integer getDidNotFinish() {
        return this.didNotFinish;
    }

    @Nullable
    public final Integer getDidNotStart() {
        return this.didNotStart;
    }

    @Nullable
    public final Integer getDisqualified() {
        return this.disqualified;
    }

    @Nullable
    public final String getDistance() {
        return this.distance;
    }

    @Nullable
    public final Integer getDoubleVictories() {
        return this.doubleVictories;
    }

    @Nullable
    public final String getFastestLapTime() {
        return this.fastestLapTime;
    }

    @Nullable
    public final Integer getFastestLaps() {
        return this.fastestLaps;
    }

    @Nullable
    public final String getGap() {
        return this.gap;
    }

    @Nullable
    public final Integer getGridPosition() {
        return this.gridPosition;
    }

    @Nullable
    public final String getHandicap() {
        return this.handicap;
    }

    @Nullable
    public final String getInterval() {
        return this.interval;
    }

    @Nullable
    public final String getLapTime() {
        return this.lapTime;
    }

    @Nullable
    public final Integer getLaps() {
        return this.laps;
    }

    @Nullable
    public final Integer getLapsBehind() {
        return this.lapsBehind;
    }

    @Nullable
    public final Integer getLapsLed() {
        return this.lapsLed;
    }

    @Nullable
    public final Integer getMisses() {
        return this.misses;
    }

    @Nullable
    public final Integer getNumber() {
        return this.number;
    }

    @Nullable
    public final Team getParentTeam() {
        return this.parentTeam;
    }

    @Nullable
    public final Integer getPersonalFastestLap() {
        return this.personalFastestLap;
    }

    @Nullable
    public final String getPersonalFastestLapTime() {
        return this.personalFastestLapTime;
    }

    @Nullable
    public final Integer getPitStops() {
        return this.pitStops;
    }

    @Nullable
    public final Integer getPodiums() {
        return this.podiums;
    }

    @Nullable
    public final Integer getPodiumsBothDrivers() {
        return this.podiumsBothDrivers;
    }

    @Nullable
    public final Double getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPointsBothDrivers() {
        return this.pointsBothDrivers;
    }

    @Nullable
    public final Integer getPolePositions() {
        return this.polePositions;
    }

    @Nullable
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    public final Integer getPreviousPosition() {
        return this.previousPosition;
    }

    @Nullable
    public final Integer getRacesStarted() {
        return this.racesStarted;
    }

    @Nullable
    public final Integer getRacesWithPoints() {
        return this.racesWithPoints;
    }

    @Nullable
    public final CyclingShirtType getShirt() {
        return this.shirt;
    }

    @Nullable
    public final String getSkiingTime() {
        return this.skiingTime;
    }

    @Nullable
    public final String getSpeed() {
        return this.speed;
    }

    @Nullable
    public final Integer getSprint() {
        return this.sprint;
    }

    @Nullable
    public final Integer getSprintPosition() {
        return this.sprintPosition;
    }

    @Nullable
    public final Boolean getStartedFromPit() {
        return this.startedFromPit;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSubStatus() {
        return this.subStatus;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final String getTeamTime() {
        return this.teamTime;
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    @Nullable
    public final Integer getTop10() {
        return this.top10;
    }

    @Nullable
    public final Integer getTop5() {
        return this.top5;
    }

    @Nullable
    public final String getTotalTime() {
        return this.totalTime;
    }

    @Nullable
    public final List<TyrePeriod> getTyreInfo() {
        return this.tyreInfo;
    }

    @Nullable
    public final Long getUpdatedAtTimestamp() {
        return this.updatedAtTimestamp;
    }

    @Nullable
    public final Integer getVictories() {
        return this.victories;
    }

    @Nullable
    public final Double getWorldCupPoints() {
        return this.worldCupPoints;
    }

    @Nullable
    public final String getYoungRider() {
        return this.youngRider;
    }

    @Nullable
    public final Integer getYoungRiderPosition() {
        return this.youngRiderPosition;
    }

    public int hashCode() {
        int hashCode = this.team.hashCode() * 31;
        Team team = this.parentTeam;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        Boolean bool = this.isLive;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.points;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.bonusPoints;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.laps;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.lapsLed;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.lapTime;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avgTime;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.totalTime;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.position;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.gap;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.gridPosition;
        int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.number;
        int hashCode14 = (hashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.pitStops;
        int hashCode15 = (hashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str5 = this.speed;
        int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int hashCode17 = (hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subStatus;
        int hashCode18 = (hashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num8 = this.didNotStart;
        int hashCode19 = (hashCode18 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.didNotFinish;
        int hashCode20 = (hashCode19 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.disqualified;
        int hashCode21 = (hashCode20 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.victories;
        int hashCode22 = (hashCode21 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.racesStarted;
        int hashCode23 = (hashCode22 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.racesWithPoints;
        int hashCode24 = (hashCode23 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.polePositions;
        int hashCode25 = (hashCode24 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.podiums;
        int hashCode26 = (hashCode25 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.fastestLaps;
        int hashCode27 = (hashCode26 + (num16 == null ? 0 : num16.hashCode())) * 31;
        String str8 = this.fastestLapTime;
        int hashCode28 = (hashCode27 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num17 = this.personalFastestLap;
        int hashCode29 = (hashCode28 + (num17 == null ? 0 : num17.hashCode())) * 31;
        String str9 = this.personalFastestLapTime;
        int hashCode30 = (hashCode29 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num18 = this.podiumsBothDrivers;
        int hashCode31 = (hashCode30 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.pointsBothDrivers;
        int hashCode32 = (hashCode31 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.doubleVictories;
        int hashCode33 = (hashCode32 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.top5;
        int hashCode34 = (hashCode33 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.top10;
        int hashCode35 = (hashCode34 + (num22 == null ? 0 : num22.hashCode())) * 31;
        String str10 = this.handicap;
        int hashCode36 = (hashCode35 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.comment;
        int hashCode37 = (hashCode36 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.details;
        int hashCode38 = (hashCode37 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num23 = this.misses;
        int hashCode39 = (hashCode38 + (num23 == null ? 0 : num23.hashCode())) * 31;
        String str13 = this.skiingTime;
        int hashCode40 = (hashCode39 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Double d2 = this.worldCupPoints;
        int hashCode41 = (hashCode40 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str14 = this.distance;
        int hashCode42 = (hashCode41 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num24 = this.sprint;
        int hashCode43 = (hashCode42 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.climb;
        int hashCode44 = (hashCode43 + (num25 == null ? 0 : num25.hashCode())) * 31;
        String str15 = this.time;
        int hashCode45 = (hashCode44 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.youngRider;
        int hashCode46 = (hashCode45 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.teamTime;
        int hashCode47 = (hashCode46 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num26 = this.sprintPosition;
        int hashCode48 = (hashCode47 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.climbPosition;
        int hashCode49 = (hashCode48 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Integer num28 = this.youngRiderPosition;
        int hashCode50 = (hashCode49 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Integer num29 = this.previousPosition;
        int hashCode51 = (hashCode50 + (num29 == null ? 0 : num29.hashCode())) * 31;
        Long l = this.updatedAtTimestamp;
        int hashCode52 = (hashCode51 + (l == null ? 0 : l.hashCode())) * 31;
        List<TyrePeriod> list = this.tyreInfo;
        int hashCode53 = (hashCode52 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num30 = this.lapsBehind;
        int hashCode54 = (hashCode53 + (num30 == null ? 0 : num30.hashCode())) * 31;
        String str18 = this.interval;
        int hashCode55 = (hashCode54 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool2 = this.startedFromPit;
        int hashCode56 = (hashCode55 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CyclingShirtType cyclingShirtType = this.shirt;
        return hashCode56 + (cyclingShirtType != null ? cyclingShirtType.hashCode() : 0);
    }

    @Nullable
    public final Boolean isLive() {
        return this.isLive;
    }

    @NotNull
    public String toString() {
        Team team = this.team;
        Team team2 = this.parentTeam;
        Boolean bool = this.isLive;
        Double d = this.points;
        Integer num = this.bonusPoints;
        Integer num2 = this.laps;
        Integer num3 = this.lapsLed;
        String str = this.lapTime;
        String str2 = this.avgTime;
        String str3 = this.totalTime;
        Integer num4 = this.position;
        String str4 = this.gap;
        Integer num5 = this.gridPosition;
        Integer num6 = this.number;
        Integer num7 = this.pitStops;
        String str5 = this.speed;
        String str6 = this.status;
        String str7 = this.subStatus;
        Integer num8 = this.didNotStart;
        Integer num9 = this.didNotFinish;
        Integer num10 = this.disqualified;
        Integer num11 = this.victories;
        Integer num12 = this.racesStarted;
        Integer num13 = this.racesWithPoints;
        Integer num14 = this.polePositions;
        Integer num15 = this.podiums;
        Integer num16 = this.fastestLaps;
        String str8 = this.fastestLapTime;
        Integer num17 = this.personalFastestLap;
        String str9 = this.personalFastestLapTime;
        Integer num18 = this.podiumsBothDrivers;
        Integer num19 = this.pointsBothDrivers;
        Integer num20 = this.doubleVictories;
        Integer num21 = this.top5;
        Integer num22 = this.top10;
        String str10 = this.handicap;
        String str11 = this.comment;
        String str12 = this.details;
        Integer num23 = this.misses;
        String str13 = this.skiingTime;
        Double d2 = this.worldCupPoints;
        String str14 = this.distance;
        Integer num24 = this.sprint;
        Integer num25 = this.climb;
        String str15 = this.time;
        String str16 = this.youngRider;
        String str17 = this.teamTime;
        Integer num26 = this.sprintPosition;
        Integer num27 = this.climbPosition;
        Integer num28 = this.youngRiderPosition;
        Integer num29 = this.previousPosition;
        Long l = this.updatedAtTimestamp;
        List<TyrePeriod> list = this.tyreInfo;
        Integer num30 = this.lapsBehind;
        String str18 = this.interval;
        Boolean bool2 = this.startedFromPit;
        CyclingShirtType cyclingShirtType = this.shirt;
        StringBuilder sb = new StringBuilder("StageStandingsItem(team=");
        sb.append(team);
        sb.append(", parentTeam=");
        sb.append(team2);
        sb.append(", isLive=");
        sb.append(bool);
        sb.append(", points=");
        sb.append(d);
        sb.append(", bonusPoints=");
        vxd.r(num, num2, ", laps=", ", lapsLed=", sb);
        vxd.s(num3, ", lapTime=", str, ", avgTime=", sb);
        bf3.v(sb, str2, ", totalTime=", str3, ", position=");
        vxd.s(num4, ", gap=", str4, ", gridPosition=", sb);
        vxd.r(num5, num6, ", number=", ", pitStops=", sb);
        vxd.s(num7, ", speed=", str5, ", status=", sb);
        bf3.v(sb, str6, ", subStatus=", str7, ", didNotStart=");
        vxd.r(num8, num9, ", didNotFinish=", ", disqualified=", sb);
        vxd.r(num10, num11, ", victories=", ", racesStarted=", sb);
        vxd.r(num12, num13, ", racesWithPoints=", ", polePositions=", sb);
        vxd.r(num14, num15, ", podiums=", ", fastestLaps=", sb);
        vxd.s(num16, ", fastestLapTime=", str8, ", personalFastestLap=", sb);
        vxd.s(num17, ", personalFastestLapTime=", str9, ", podiumsBothDrivers=", sb);
        vxd.r(num18, num19, ", pointsBothDrivers=", ", doubleVictories=", sb);
        vxd.r(num20, num21, ", top5=", ", top10=", sb);
        vxd.s(num22, ", handicap=", str10, ", comment=", sb);
        bf3.v(sb, str11, ", details=", str12, ", misses=");
        vxd.s(num23, ", skiingTime=", str13, ", worldCupPoints=", sb);
        sb.append(d2);
        sb.append(", distance=");
        sb.append(str14);
        sb.append(", sprint=");
        vxd.r(num24, num25, ", climb=", ", time=", sb);
        bf3.v(sb, str15, ", youngRider=", str16, ", teamTime=");
        me4.o(num26, str17, ", sprintPosition=", ", climbPosition=", sb);
        vxd.r(num27, num28, ", youngRiderPosition=", ", previousPosition=", sb);
        sb.append(num29);
        sb.append(", updatedAtTimestamp=");
        sb.append(l);
        sb.append(", tyreInfo=");
        sb.append(list);
        sb.append(", lapsBehind=");
        sb.append(num30);
        sb.append(", interval=");
        sb.append(str18);
        sb.append(", startedFromPit=");
        sb.append(bool2);
        sb.append(", shirt=");
        sb.append(cyclingShirtType);
        sb.append(")");
        return sb.toString();
    }

    public StageStandingsItem(@NotNull Team team, @Nullable Team team2, @Nullable Boolean bool, @Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num4, @Nullable String str4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable String str8, @Nullable Integer num17, @Nullable String str9, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Integer num23, @Nullable String str13, @Nullable Double d2, @Nullable String str14, @Nullable Integer num24, @Nullable Integer num25, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable Integer num26, @Nullable Integer num27, @Nullable Integer num28, @Nullable Integer num29, @Nullable Long l, @Nullable List<TyrePeriod> list, @Nullable Integer num30, @Nullable String str18, @Nullable Boolean bool2, @Nullable CyclingShirtType cyclingShirtType) {
        team.getClass();
        this.team = team;
        this.parentTeam = team2;
        this.isLive = bool;
        this.points = d;
        this.bonusPoints = num;
        this.laps = num2;
        this.lapsLed = num3;
        this.lapTime = str;
        this.avgTime = str2;
        this.totalTime = str3;
        this.position = num4;
        this.gap = str4;
        this.gridPosition = num5;
        this.number = num6;
        this.pitStops = num7;
        this.speed = str5;
        this.status = str6;
        this.subStatus = str7;
        this.didNotStart = num8;
        this.didNotFinish = num9;
        this.disqualified = num10;
        this.victories = num11;
        this.racesStarted = num12;
        this.racesWithPoints = num13;
        this.polePositions = num14;
        this.podiums = num15;
        this.fastestLaps = num16;
        this.fastestLapTime = str8;
        this.personalFastestLap = num17;
        this.personalFastestLapTime = str9;
        this.podiumsBothDrivers = num18;
        this.pointsBothDrivers = num19;
        this.doubleVictories = num20;
        this.top5 = num21;
        this.top10 = num22;
        this.handicap = str10;
        this.comment = str11;
        this.details = str12;
        this.misses = num23;
        this.skiingTime = str13;
        this.worldCupPoints = d2;
        this.distance = str14;
        this.sprint = num24;
        this.climb = num25;
        this.time = str15;
        this.youngRider = str16;
        this.teamTime = str17;
        this.sprintPosition = num26;
        this.climbPosition = num27;
        this.youngRiderPosition = num28;
        this.previousPosition = num29;
        this.updatedAtTimestamp = l;
        this.tyreInfo = list;
        this.lapsBehind = num30;
        this.interval = str18;
        this.startedFromPit = bool2;
        this.shirt = cyclingShirtType;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/StageStandingsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/StageStandingsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageStandingsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
