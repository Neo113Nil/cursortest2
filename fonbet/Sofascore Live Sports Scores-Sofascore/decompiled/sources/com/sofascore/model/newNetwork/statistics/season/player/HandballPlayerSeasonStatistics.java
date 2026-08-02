package com.sofascore.model.newNetwork.statistics.season.player;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.h75;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b4\b\u0087\b\u0018\u0000 ¨\u00012\u00020\u00012\u00020\u0002:\u0004©\u0001¨\u0001B§\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\b\u0012\b\u0010/\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b0\u00101BÅ\u0003\b\u0010\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\b\u0012\b\u0010/\u001a\u0004\u0018\u00010\b\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b0\u00106J\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u000207¢\u0006\u0004\b:\u00109J\u0010\u0010;\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bC\u0010@J\u0012\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bD\u0010@J\u0012\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bE\u0010@J\u0012\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bF\u0010@J\u0012\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bG\u0010@J\u0012\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bH\u0010@J\u0012\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bI\u0010@J\u0012\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bJ\u0010@J\u0012\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bK\u0010@J\u0012\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bL\u0010@J\u0012\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bM\u0010@J\u0012\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bN\u0010@J\u0012\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bO\u0010@J\u0012\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bP\u0010@J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bQ\u0010@J\u0012\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bR\u0010@J\u0012\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bS\u0010@J\u0012\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bT\u0010@J\u0012\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bU\u0010@J\u0012\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bV\u0010@J\u0012\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bW\u0010@J\u0012\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bX\u0010@J\u0012\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bY\u0010@J\u0012\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bZ\u0010@J\u0012\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b[\u0010@J\u0012\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\\\u0010@J\u0012\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b]\u0010@J\u0012\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b^\u0010@J\u0012\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b_\u0010@J\u0012\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b`\u0010@J\u0012\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\ba\u0010@J\u0012\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bb\u0010@J\u0012\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bc\u0010@J\u0012\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bd\u0010@J\u0012\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\be\u0010@J\u0012\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bf\u0010@J\u0012\u0010g\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bg\u0010BJ\u0012\u0010h\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bh\u0010BJ\u0084\u0004\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\bi\u0010jJ\u0010\u0010k\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bk\u0010>J\u0010\u0010l\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bl\u0010<J\u001a\u0010o\u001a\u0002072\b\u0010n\u001a\u0004\u0018\u00010mHÖ\u0003¢\u0006\u0004\bo\u0010pJ'\u0010y\u001a\u00020v2\u0006\u0010q\u001a\u00020\u00002\u0006\u0010s\u001a\u00020r2\u0006\u0010u\u001a\u00020tH\u0001¢\u0006\u0004\bw\u0010xR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010z\u001a\u0004\b{\u0010<R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010|\u001a\u0004\b}\u0010>R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010~\u001a\u0004\b\u007f\u0010@R\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010BR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\n\u0010~\u001a\u0005\b\u0082\u0001\u0010@R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u000b\u0010~\u001a\u0005\b\u0083\u0001\u0010@R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\f\u0010~\u001a\u0005\b\u0084\u0001\u0010@R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\r\u0010~\u001a\u0005\b\u0085\u0001\u0010@R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u000e\u0010~\u001a\u0005\b\u0086\u0001\u0010@R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u000f\u0010~\u001a\u0005\b\u0087\u0001\u0010@R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0010\u0010~\u001a\u0005\b\u0088\u0001\u0010@R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0011\u0010~\u001a\u0005\b\u0089\u0001\u0010@R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0012\u0010~\u001a\u0005\b\u008a\u0001\u0010@R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0013\u0010~\u001a\u0005\b\u008b\u0001\u0010@R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0014\u0010~\u001a\u0005\b\u008c\u0001\u0010@R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0015\u0010~\u001a\u0005\b\u008d\u0001\u0010@R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0016\u0010~\u001a\u0005\b\u008e\u0001\u0010@R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0017\u0010~\u001a\u0005\b\u008f\u0001\u0010@R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0018\u0010~\u001a\u0005\b\u0090\u0001\u0010@R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0019\u0010~\u001a\u0005\b\u0091\u0001\u0010@R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001a\u0010~\u001a\u0005\b\u0092\u0001\u0010@R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001b\u0010~\u001a\u0005\b\u0093\u0001\u0010@R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001c\u0010~\u001a\u0005\b\u0094\u0001\u0010@R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001d\u0010~\u001a\u0005\b\u0095\u0001\u0010@R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001e\u0010~\u001a\u0005\b\u0096\u0001\u0010@R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001f\u0010~\u001a\u0005\b\u0097\u0001\u0010@R\u001a\u0010 \u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b \u0010~\u001a\u0005\b\u0098\u0001\u0010@R\u001a\u0010!\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b!\u0010~\u001a\u0005\b\u0099\u0001\u0010@R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\"\u0010~\u001a\u0005\b\u009a\u0001\u0010@R\u001a\u0010#\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b#\u0010~\u001a\u0005\b\u009b\u0001\u0010@R\u001a\u0010$\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b$\u0010~\u001a\u0005\b\u009c\u0001\u0010@R\u001a\u0010%\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b%\u0010~\u001a\u0005\b\u009d\u0001\u0010@R\u001a\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b&\u0010~\u001a\u0005\b\u009e\u0001\u0010@R\u001a\u0010'\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b'\u0010~\u001a\u0005\b\u009f\u0001\u0010@R\u001a\u0010(\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b(\u0010~\u001a\u0005\b \u0001\u0010@R\u001a\u0010)\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b)\u0010~\u001a\u0005\b¡\u0001\u0010@R\u001a\u0010*\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b*\u0010~\u001a\u0005\b¢\u0001\u0010@R\u001a\u0010+\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b+\u0010~\u001a\u0005\b£\u0001\u0010@R\u001a\u0010,\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b,\u0010~\u001a\u0005\b¤\u0001\u0010@R\u001a\u0010-\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b-\u0010~\u001a\u0005\b¥\u0001\u0010@R\u001b\u0010.\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b.\u0010\u0080\u0001\u001a\u0005\b¦\u0001\u0010BR\u001b\u0010/\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b/\u0010\u0080\u0001\u001a\u0005\b§\u0001\u0010B¨\u0006ª\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/HandballPlayerSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "Ljava/io/Serializable;", "", "id", "", "type", "appearances", "", CampaignEx.JSON_KEY_STAR, "saves", "twoMinutePenalties", "technicalFaults", "yellowCards", "gkShots", "gk7mGoals", "gk7mShots", "gk6mSaves", "gk6mShots", "gkPivotSaves", "gkPivotShots", "gk9mSaves", "gk9mShots", "gkBreakthroughSaves", "gkBreakthroughShots", "gkFastbreakGoals", "gkFastbreakShots", "shotsTaken", "goals", "assists", "goals7m", "shots7m", "goals6m", "shots6m", "goals9m", "shots9m", "breakthroughGoals", "breakthroughShots", "pivotGoals", "pivotShots", "fastbreakGoals", "fastbreakShots", "steals", "blockedShots", "gk7mSaves", "gkFastbreakSaves", "shootingEfficiencyPercentage", "goalkeeperEfficiencyPercentage", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lt5h;)V", "", "shouldShowAttacking", "()Z", "shouldShowGoalkeeping", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sofascore/model/newNetwork/statistics/season/player/HandballPlayerSeasonStatistics;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/HandballPlayerSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getType", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/Double;", "getRating", "getSaves", "getTwoMinutePenalties", "getTechnicalFaults", "getYellowCards", "getGkShots", "getGk7mGoals", "getGk7mShots", "getGk6mSaves", "getGk6mShots", "getGkPivotSaves", "getGkPivotShots", "getGk9mSaves", "getGk9mShots", "getGkBreakthroughSaves", "getGkBreakthroughShots", "getGkFastbreakGoals", "getGkFastbreakShots", "getShotsTaken", "getGoals", "getAssists", "getGoals7m", "getShots7m", "getGoals6m", "getShots6m", "getGoals9m", "getShots9m", "getBreakthroughGoals", "getBreakthroughShots", "getPivotGoals", "getPivotShots", "getFastbreakGoals", "getFastbreakShots", "getSteals", "getBlockedShots", "getGk7mSaves", "getGkFastbreakSaves", "getShootingEfficiencyPercentage", "getGoalkeeperEfficiencyPercentage", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HandballPlayerSeasonStatistics extends AbstractPlayerSeasonStatistics implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer blockedShots;

    @Nullable
    private final Integer breakthroughGoals;

    @Nullable
    private final Integer breakthroughShots;

    @Nullable
    private final Integer fastbreakGoals;

    @Nullable
    private final Integer fastbreakShots;

    @Nullable
    private final Integer gk6mSaves;

    @Nullable
    private final Integer gk6mShots;

    @Nullable
    private final Integer gk7mGoals;

    @Nullable
    private final Integer gk7mSaves;

    @Nullable
    private final Integer gk7mShots;

    @Nullable
    private final Integer gk9mSaves;

    @Nullable
    private final Integer gk9mShots;

    @Nullable
    private final Integer gkBreakthroughSaves;

    @Nullable
    private final Integer gkBreakthroughShots;

    @Nullable
    private final Integer gkFastbreakGoals;

    @Nullable
    private final Integer gkFastbreakSaves;

    @Nullable
    private final Integer gkFastbreakShots;

    @Nullable
    private final Integer gkPivotSaves;

    @Nullable
    private final Integer gkPivotShots;

    @Nullable
    private final Integer gkShots;

    @Nullable
    private final Double goalkeeperEfficiencyPercentage;

    @Nullable
    private final Integer goals;

    @Nullable
    private final Integer goals6m;

    @Nullable
    private final Integer goals7m;

    @Nullable
    private final Integer goals9m;
    private final int id;

    @Nullable
    private final Integer pivotGoals;

    @Nullable
    private final Integer pivotShots;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer saves;

    @Nullable
    private final Double shootingEfficiencyPercentage;

    @Nullable
    private final Integer shots6m;

    @Nullable
    private final Integer shots7m;

    @Nullable
    private final Integer shots9m;

    @Nullable
    private final Integer shotsTaken;

    @Nullable
    private final Integer steals;

    @Nullable
    private final Integer technicalFaults;

    @Nullable
    private final Integer twoMinutePenalties;

    @NotNull
    private final String type;

    @Nullable
    private final Integer yellowCards;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandballPlayerSeasonStatistics(int i, int i2, int i3, String str, Integer num, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, Integer num35, Integer num36, Integer num37, Double d2, Double d3, t5h t5hVar) {
        super(i, t5hVar);
        if ((1023 != (i2 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE}, HandballPlayerSeasonStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.saves = num2;
        this.twoMinutePenalties = num3;
        this.technicalFaults = num4;
        this.yellowCards = num5;
        this.gkShots = num6;
        this.gk7mGoals = num7;
        this.gk7mShots = num8;
        this.gk6mSaves = num9;
        this.gk6mShots = num10;
        this.gkPivotSaves = num11;
        this.gkPivotShots = num12;
        this.gk9mSaves = num13;
        this.gk9mShots = num14;
        this.gkBreakthroughSaves = num15;
        this.gkBreakthroughShots = num16;
        this.gkFastbreakGoals = num17;
        this.gkFastbreakShots = num18;
        this.shotsTaken = num19;
        this.goals = num20;
        this.assists = num21;
        this.goals7m = num22;
        this.shots7m = num23;
        this.goals6m = num24;
        this.shots6m = num25;
        this.goals9m = num26;
        this.shots9m = num27;
        this.breakthroughGoals = num28;
        this.breakthroughShots = num29;
        this.pivotGoals = num30;
        this.pivotShots = num31;
        this.fastbreakGoals = num32;
        this.fastbreakShots = num33;
        this.steals = num34;
        this.blockedShots = num35;
        this.gk7mSaves = num36;
        this.gkFastbreakSaves = num37;
        this.shootingEfficiencyPercentage = d2;
        this.goalkeeperEfficiencyPercentage = d3;
    }

    public static final /* synthetic */ void write$Self$model_release(HandballPlayerSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
        AbstractPlayerSeasonStatistics.write$Self(self, output, serialDesc);
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.getType());
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.getAppearances());
        h75 h75Var = h75.a;
        output.h(serialDesc, 3, h75Var, self.getRating());
        output.h(serialDesc, 4, a7aVar, self.saves);
        output.h(serialDesc, 5, a7aVar, self.twoMinutePenalties);
        output.h(serialDesc, 6, a7aVar, self.technicalFaults);
        output.h(serialDesc, 7, a7aVar, self.yellowCards);
        output.h(serialDesc, 8, a7aVar, self.gkShots);
        output.h(serialDesc, 9, a7aVar, self.gk7mGoals);
        output.h(serialDesc, 10, a7aVar, self.gk7mShots);
        output.h(serialDesc, 11, a7aVar, self.gk6mSaves);
        output.h(serialDesc, 12, a7aVar, self.gk6mShots);
        output.h(serialDesc, 13, a7aVar, self.gkPivotSaves);
        output.h(serialDesc, 14, a7aVar, self.gkPivotShots);
        output.h(serialDesc, 15, a7aVar, self.gk9mSaves);
        output.h(serialDesc, 16, a7aVar, self.gk9mShots);
        output.h(serialDesc, 17, a7aVar, self.gkBreakthroughSaves);
        output.h(serialDesc, 18, a7aVar, self.gkBreakthroughShots);
        output.h(serialDesc, 19, a7aVar, self.gkFastbreakGoals);
        output.h(serialDesc, 20, a7aVar, self.gkFastbreakShots);
        output.h(serialDesc, 21, a7aVar, self.shotsTaken);
        output.h(serialDesc, 22, a7aVar, self.goals);
        output.h(serialDesc, 23, a7aVar, self.assists);
        output.h(serialDesc, 24, a7aVar, self.goals7m);
        output.h(serialDesc, 25, a7aVar, self.shots7m);
        output.h(serialDesc, 26, a7aVar, self.goals6m);
        output.h(serialDesc, 27, a7aVar, self.shots6m);
        output.h(serialDesc, 28, a7aVar, self.goals9m);
        output.h(serialDesc, 29, a7aVar, self.shots9m);
        output.h(serialDesc, 30, a7aVar, self.breakthroughGoals);
        output.h(serialDesc, 31, a7aVar, self.breakthroughShots);
        output.h(serialDesc, 32, a7aVar, self.pivotGoals);
        output.h(serialDesc, 33, a7aVar, self.pivotShots);
        output.h(serialDesc, 34, a7aVar, self.fastbreakGoals);
        output.h(serialDesc, 35, a7aVar, self.fastbreakShots);
        output.h(serialDesc, 36, a7aVar, self.steals);
        output.h(serialDesc, 37, a7aVar, self.blockedShots);
        output.h(serialDesc, 38, a7aVar, self.gk7mSaves);
        output.h(serialDesc, 39, a7aVar, self.gkFastbreakSaves);
        output.h(serialDesc, 40, h75Var, self.shootingEfficiencyPercentage);
        output.h(serialDesc, 41, h75Var, self.goalkeeperEfficiencyPercentage);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getGk7mGoals() {
        return this.gk7mGoals;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getGk7mShots() {
        return this.gk7mShots;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getGk6mSaves() {
        return this.gk6mSaves;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getGk6mShots() {
        return this.gk6mShots;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getGkPivotSaves() {
        return this.gkPivotSaves;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getGkPivotShots() {
        return this.gkPivotShots;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getGk9mSaves() {
        return this.gk9mSaves;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getGk9mShots() {
        return this.gk9mShots;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getGkBreakthroughSaves() {
        return this.gkBreakthroughSaves;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getGkBreakthroughShots() {
        return this.gkBreakthroughShots;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getGkFastbreakGoals() {
        return this.gkFastbreakGoals;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getGkFastbreakShots() {
        return this.gkFastbreakShots;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getShotsTaken() {
        return this.shotsTaken;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getGoals7m() {
        return this.goals7m;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getShots7m() {
        return this.shots7m;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getGoals6m() {
        return this.goals6m;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getShots6m() {
        return this.shots6m;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Integer getGoals9m() {
        return this.goals9m;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getShots9m() {
        return this.shots9m;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getBreakthroughGoals() {
        return this.breakthroughGoals;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getBreakthroughShots() {
        return this.breakthroughShots;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Integer getPivotGoals() {
        return this.pivotGoals;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Integer getPivotShots() {
        return this.pivotShots;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Integer getFastbreakGoals() {
        return this.fastbreakGoals;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final Integer getFastbreakShots() {
        return this.fastbreakShots;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final Integer getBlockedShots() {
        return this.blockedShots;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final Integer getGk7mSaves() {
        return this.gk7mSaves;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component40, reason: from getter */
    public final Integer getGkFastbreakSaves() {
        return this.gkFastbreakSaves;
    }

    @Nullable
    /* renamed from: component41, reason: from getter */
    public final Double getShootingEfficiencyPercentage() {
        return this.shootingEfficiencyPercentage;
    }

    @Nullable
    /* renamed from: component42, reason: from getter */
    public final Double getGoalkeeperEfficiencyPercentage() {
        return this.goalkeeperEfficiencyPercentage;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getSaves() {
        return this.saves;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getTwoMinutePenalties() {
        return this.twoMinutePenalties;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getTechnicalFaults() {
        return this.technicalFaults;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getGkShots() {
        return this.gkShots;
    }

    @NotNull
    public final HandballPlayerSeasonStatistics copy(int id, @NotNull String type, @Nullable Integer appearances, @Nullable Double rating, @Nullable Integer saves, @Nullable Integer twoMinutePenalties, @Nullable Integer technicalFaults, @Nullable Integer yellowCards, @Nullable Integer gkShots, @Nullable Integer gk7mGoals, @Nullable Integer gk7mShots, @Nullable Integer gk6mSaves, @Nullable Integer gk6mShots, @Nullable Integer gkPivotSaves, @Nullable Integer gkPivotShots, @Nullable Integer gk9mSaves, @Nullable Integer gk9mShots, @Nullable Integer gkBreakthroughSaves, @Nullable Integer gkBreakthroughShots, @Nullable Integer gkFastbreakGoals, @Nullable Integer gkFastbreakShots, @Nullable Integer shotsTaken, @Nullable Integer goals, @Nullable Integer assists, @Nullable Integer goals7m, @Nullable Integer shots7m, @Nullable Integer goals6m, @Nullable Integer shots6m, @Nullable Integer goals9m, @Nullable Integer shots9m, @Nullable Integer breakthroughGoals, @Nullable Integer breakthroughShots, @Nullable Integer pivotGoals, @Nullable Integer pivotShots, @Nullable Integer fastbreakGoals, @Nullable Integer fastbreakShots, @Nullable Integer steals, @Nullable Integer blockedShots, @Nullable Integer gk7mSaves, @Nullable Integer gkFastbreakSaves, @Nullable Double shootingEfficiencyPercentage, @Nullable Double goalkeeperEfficiencyPercentage) {
        type.getClass();
        return new HandballPlayerSeasonStatistics(id, type, appearances, rating, saves, twoMinutePenalties, technicalFaults, yellowCards, gkShots, gk7mGoals, gk7mShots, gk6mSaves, gk6mShots, gkPivotSaves, gkPivotShots, gk9mSaves, gk9mShots, gkBreakthroughSaves, gkBreakthroughShots, gkFastbreakGoals, gkFastbreakShots, shotsTaken, goals, assists, goals7m, shots7m, goals6m, shots6m, goals9m, shots9m, breakthroughGoals, breakthroughShots, pivotGoals, pivotShots, fastbreakGoals, fastbreakShots, steals, blockedShots, gk7mSaves, gkFastbreakSaves, shootingEfficiencyPercentage, goalkeeperEfficiencyPercentage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandballPlayerSeasonStatistics)) {
            return false;
        }
        HandballPlayerSeasonStatistics handballPlayerSeasonStatistics = (HandballPlayerSeasonStatistics) other;
        return this.id == handballPlayerSeasonStatistics.id && Intrinsics.c(this.type, handballPlayerSeasonStatistics.type) && Intrinsics.c(this.appearances, handballPlayerSeasonStatistics.appearances) && Intrinsics.c(this.rating, handballPlayerSeasonStatistics.rating) && Intrinsics.c(this.saves, handballPlayerSeasonStatistics.saves) && Intrinsics.c(this.twoMinutePenalties, handballPlayerSeasonStatistics.twoMinutePenalties) && Intrinsics.c(this.technicalFaults, handballPlayerSeasonStatistics.technicalFaults) && Intrinsics.c(this.yellowCards, handballPlayerSeasonStatistics.yellowCards) && Intrinsics.c(this.gkShots, handballPlayerSeasonStatistics.gkShots) && Intrinsics.c(this.gk7mGoals, handballPlayerSeasonStatistics.gk7mGoals) && Intrinsics.c(this.gk7mShots, handballPlayerSeasonStatistics.gk7mShots) && Intrinsics.c(this.gk6mSaves, handballPlayerSeasonStatistics.gk6mSaves) && Intrinsics.c(this.gk6mShots, handballPlayerSeasonStatistics.gk6mShots) && Intrinsics.c(this.gkPivotSaves, handballPlayerSeasonStatistics.gkPivotSaves) && Intrinsics.c(this.gkPivotShots, handballPlayerSeasonStatistics.gkPivotShots) && Intrinsics.c(this.gk9mSaves, handballPlayerSeasonStatistics.gk9mSaves) && Intrinsics.c(this.gk9mShots, handballPlayerSeasonStatistics.gk9mShots) && Intrinsics.c(this.gkBreakthroughSaves, handballPlayerSeasonStatistics.gkBreakthroughSaves) && Intrinsics.c(this.gkBreakthroughShots, handballPlayerSeasonStatistics.gkBreakthroughShots) && Intrinsics.c(this.gkFastbreakGoals, handballPlayerSeasonStatistics.gkFastbreakGoals) && Intrinsics.c(this.gkFastbreakShots, handballPlayerSeasonStatistics.gkFastbreakShots) && Intrinsics.c(this.shotsTaken, handballPlayerSeasonStatistics.shotsTaken) && Intrinsics.c(this.goals, handballPlayerSeasonStatistics.goals) && Intrinsics.c(this.assists, handballPlayerSeasonStatistics.assists) && Intrinsics.c(this.goals7m, handballPlayerSeasonStatistics.goals7m) && Intrinsics.c(this.shots7m, handballPlayerSeasonStatistics.shots7m) && Intrinsics.c(this.goals6m, handballPlayerSeasonStatistics.goals6m) && Intrinsics.c(this.shots6m, handballPlayerSeasonStatistics.shots6m) && Intrinsics.c(this.goals9m, handballPlayerSeasonStatistics.goals9m) && Intrinsics.c(this.shots9m, handballPlayerSeasonStatistics.shots9m) && Intrinsics.c(this.breakthroughGoals, handballPlayerSeasonStatistics.breakthroughGoals) && Intrinsics.c(this.breakthroughShots, handballPlayerSeasonStatistics.breakthroughShots) && Intrinsics.c(this.pivotGoals, handballPlayerSeasonStatistics.pivotGoals) && Intrinsics.c(this.pivotShots, handballPlayerSeasonStatistics.pivotShots) && Intrinsics.c(this.fastbreakGoals, handballPlayerSeasonStatistics.fastbreakGoals) && Intrinsics.c(this.fastbreakShots, handballPlayerSeasonStatistics.fastbreakShots) && Intrinsics.c(this.steals, handballPlayerSeasonStatistics.steals) && Intrinsics.c(this.blockedShots, handballPlayerSeasonStatistics.blockedShots) && Intrinsics.c(this.gk7mSaves, handballPlayerSeasonStatistics.gk7mSaves) && Intrinsics.c(this.gkFastbreakSaves, handballPlayerSeasonStatistics.gkFastbreakSaves) && Intrinsics.c(this.shootingEfficiencyPercentage, handballPlayerSeasonStatistics.shootingEfficiencyPercentage) && Intrinsics.c(this.goalkeeperEfficiencyPercentage, handballPlayerSeasonStatistics.goalkeeperEfficiencyPercentage);
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final Integer getBlockedShots() {
        return this.blockedShots;
    }

    @Nullable
    public final Integer getBreakthroughGoals() {
        return this.breakthroughGoals;
    }

    @Nullable
    public final Integer getBreakthroughShots() {
        return this.breakthroughShots;
    }

    @Nullable
    public final Integer getFastbreakGoals() {
        return this.fastbreakGoals;
    }

    @Nullable
    public final Integer getFastbreakShots() {
        return this.fastbreakShots;
    }

    @Nullable
    public final Integer getGk6mSaves() {
        return this.gk6mSaves;
    }

    @Nullable
    public final Integer getGk6mShots() {
        return this.gk6mShots;
    }

    @Nullable
    public final Integer getGk7mGoals() {
        return this.gk7mGoals;
    }

    @Nullable
    public final Integer getGk7mSaves() {
        return this.gk7mSaves;
    }

    @Nullable
    public final Integer getGk7mShots() {
        return this.gk7mShots;
    }

    @Nullable
    public final Integer getGk9mSaves() {
        return this.gk9mSaves;
    }

    @Nullable
    public final Integer getGk9mShots() {
        return this.gk9mShots;
    }

    @Nullable
    public final Integer getGkBreakthroughSaves() {
        return this.gkBreakthroughSaves;
    }

    @Nullable
    public final Integer getGkBreakthroughShots() {
        return this.gkBreakthroughShots;
    }

    @Nullable
    public final Integer getGkFastbreakGoals() {
        return this.gkFastbreakGoals;
    }

    @Nullable
    public final Integer getGkFastbreakSaves() {
        return this.gkFastbreakSaves;
    }

    @Nullable
    public final Integer getGkFastbreakShots() {
        return this.gkFastbreakShots;
    }

    @Nullable
    public final Integer getGkPivotSaves() {
        return this.gkPivotSaves;
    }

    @Nullable
    public final Integer getGkPivotShots() {
        return this.gkPivotShots;
    }

    @Nullable
    public final Integer getGkShots() {
        return this.gkShots;
    }

    @Nullable
    public final Double getGoalkeeperEfficiencyPercentage() {
        return this.goalkeeperEfficiencyPercentage;
    }

    @Nullable
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    public final Integer getGoals6m() {
        return this.goals6m;
    }

    @Nullable
    public final Integer getGoals7m() {
        return this.goals7m;
    }

    @Nullable
    public final Integer getGoals9m() {
        return this.goals9m;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getPivotGoals() {
        return this.pivotGoals;
    }

    @Nullable
    public final Integer getPivotShots() {
        return this.pivotShots;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getSaves() {
        return this.saves;
    }

    @Nullable
    public final Double getShootingEfficiencyPercentage() {
        return this.shootingEfficiencyPercentage;
    }

    @Nullable
    public final Integer getShots6m() {
        return this.shots6m;
    }

    @Nullable
    public final Integer getShots7m() {
        return this.shots7m;
    }

    @Nullable
    public final Integer getShots9m() {
        return this.shots9m;
    }

    @Nullable
    public final Integer getShotsTaken() {
        return this.shotsTaken;
    }

    @Nullable
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    public final Integer getTechnicalFaults() {
        return this.technicalFaults;
    }

    @Nullable
    public final Integer getTwoMinutePenalties() {
        return this.twoMinutePenalties;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @NotNull
    public String getType() {
        return this.type;
    }

    @Nullable
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.type);
        Integer num = this.appearances;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.rating;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.saves;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.twoMinutePenalties;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.technicalFaults;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.yellowCards;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.gkShots;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.gk7mGoals;
        int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.gk7mShots;
        int hashCode9 = (hashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.gk6mSaves;
        int hashCode10 = (hashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.gk6mShots;
        int hashCode11 = (hashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.gkPivotSaves;
        int hashCode12 = (hashCode11 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.gkPivotShots;
        int hashCode13 = (hashCode12 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.gk9mSaves;
        int hashCode14 = (hashCode13 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.gk9mShots;
        int hashCode15 = (hashCode14 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.gkBreakthroughSaves;
        int hashCode16 = (hashCode15 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.gkBreakthroughShots;
        int hashCode17 = (hashCode16 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.gkFastbreakGoals;
        int hashCode18 = (hashCode17 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.gkFastbreakShots;
        int hashCode19 = (hashCode18 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.shotsTaken;
        int hashCode20 = (hashCode19 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.goals;
        int hashCode21 = (hashCode20 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.assists;
        int hashCode22 = (hashCode21 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.goals7m;
        int hashCode23 = (hashCode22 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.shots7m;
        int hashCode24 = (hashCode23 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.goals6m;
        int hashCode25 = (hashCode24 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.shots6m;
        int hashCode26 = (hashCode25 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.goals9m;
        int hashCode27 = (hashCode26 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.shots9m;
        int hashCode28 = (hashCode27 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Integer num28 = this.breakthroughGoals;
        int hashCode29 = (hashCode28 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Integer num29 = this.breakthroughShots;
        int hashCode30 = (hashCode29 + (num29 == null ? 0 : num29.hashCode())) * 31;
        Integer num30 = this.pivotGoals;
        int hashCode31 = (hashCode30 + (num30 == null ? 0 : num30.hashCode())) * 31;
        Integer num31 = this.pivotShots;
        int hashCode32 = (hashCode31 + (num31 == null ? 0 : num31.hashCode())) * 31;
        Integer num32 = this.fastbreakGoals;
        int hashCode33 = (hashCode32 + (num32 == null ? 0 : num32.hashCode())) * 31;
        Integer num33 = this.fastbreakShots;
        int hashCode34 = (hashCode33 + (num33 == null ? 0 : num33.hashCode())) * 31;
        Integer num34 = this.steals;
        int hashCode35 = (hashCode34 + (num34 == null ? 0 : num34.hashCode())) * 31;
        Integer num35 = this.blockedShots;
        int hashCode36 = (hashCode35 + (num35 == null ? 0 : num35.hashCode())) * 31;
        Integer num36 = this.gk7mSaves;
        int hashCode37 = (hashCode36 + (num36 == null ? 0 : num36.hashCode())) * 31;
        Integer num37 = this.gkFastbreakSaves;
        int hashCode38 = (hashCode37 + (num37 == null ? 0 : num37.hashCode())) * 31;
        Double d2 = this.shootingEfficiencyPercentage;
        int hashCode39 = (hashCode38 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.goalkeeperEfficiencyPercentage;
        return hashCode39 + (d3 != null ? d3.hashCode() : 0);
    }

    public final boolean shouldShowAttacking() {
        List<Integer> j = b.j(this.goals, this.assists, this.goals6m, this.goals7m, this.goals9m, this.steals, this.twoMinutePenalties);
        if (j != null && j.isEmpty()) {
            return false;
        }
        for (Integer num : j) {
            if ((num != null ? num.intValue() : 0) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldShowGoalkeeping() {
        List<Integer> j = b.j(this.saves, this.gk9mSaves, this.gk7mSaves, this.gk6mSaves);
        if (j == null || !j.isEmpty()) {
            for (Integer num : j) {
                if ((num != null ? num.intValue() : 0) > 0) {
                    return true;
                }
            }
        }
        Double d = this.goalkeeperEfficiencyPercentage;
        return (d != null ? d.doubleValue() : 0.0d) > 0.0d;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        Integer num = this.appearances;
        Double d = this.rating;
        Integer num2 = this.saves;
        Integer num3 = this.twoMinutePenalties;
        Integer num4 = this.technicalFaults;
        Integer num5 = this.yellowCards;
        Integer num6 = this.gkShots;
        Integer num7 = this.gk7mGoals;
        Integer num8 = this.gk7mShots;
        Integer num9 = this.gk6mSaves;
        Integer num10 = this.gk6mShots;
        Integer num11 = this.gkPivotSaves;
        Integer num12 = this.gkPivotShots;
        Integer num13 = this.gk9mSaves;
        Integer num14 = this.gk9mShots;
        Integer num15 = this.gkBreakthroughSaves;
        Integer num16 = this.gkBreakthroughShots;
        Integer num17 = this.gkFastbreakGoals;
        Integer num18 = this.gkFastbreakShots;
        Integer num19 = this.shotsTaken;
        Integer num20 = this.goals;
        Integer num21 = this.assists;
        Integer num22 = this.goals7m;
        Integer num23 = this.shots7m;
        Integer num24 = this.goals6m;
        Integer num25 = this.shots6m;
        Integer num26 = this.goals9m;
        Integer num27 = this.shots9m;
        Integer num28 = this.breakthroughGoals;
        Integer num29 = this.breakthroughShots;
        Integer num30 = this.pivotGoals;
        Integer num31 = this.pivotShots;
        Integer num32 = this.fastbreakGoals;
        Integer num33 = this.fastbreakShots;
        Integer num34 = this.steals;
        Integer num35 = this.blockedShots;
        Integer num36 = this.gk7mSaves;
        Integer num37 = this.gkFastbreakSaves;
        Double d2 = this.shootingEfficiencyPercentage;
        Double d3 = this.goalkeeperEfficiencyPercentage;
        StringBuilder t = dmi.t(i, "HandballPlayerSeasonStatistics(id=", ", type=", str, ", appearances=");
        fn0.v(d, num, ", rating=", ", saves=", t);
        vxd.r(num2, num3, ", twoMinutePenalties=", ", technicalFaults=", t);
        vxd.r(num4, num5, ", yellowCards=", ", gkShots=", t);
        vxd.r(num6, num7, ", gk7mGoals=", ", gk7mShots=", t);
        vxd.r(num8, num9, ", gk6mSaves=", ", gk6mShots=", t);
        vxd.r(num10, num11, ", gkPivotSaves=", ", gkPivotShots=", t);
        vxd.r(num12, num13, ", gk9mSaves=", ", gk9mShots=", t);
        vxd.r(num14, num15, ", gkBreakthroughSaves=", ", gkBreakthroughShots=", t);
        vxd.r(num16, num17, ", gkFastbreakGoals=", ", gkFastbreakShots=", t);
        vxd.r(num18, num19, ", shotsTaken=", ", goals=", t);
        vxd.r(num20, num21, ", assists=", ", goals7m=", t);
        vxd.r(num22, num23, ", shots7m=", ", goals6m=", t);
        vxd.r(num24, num25, ", shots6m=", ", goals9m=", t);
        vxd.r(num26, num27, ", shots9m=", ", breakthroughGoals=", t);
        vxd.r(num28, num29, ", breakthroughShots=", ", pivotGoals=", t);
        vxd.r(num30, num31, ", pivotShots=", ", fastbreakGoals=", t);
        vxd.r(num32, num33, ", fastbreakShots=", ", steals=", t);
        vxd.r(num34, num35, ", blockedShots=", ", gk7mSaves=", t);
        vxd.r(num36, num37, ", gkFastbreakSaves=", ", shootingEfficiencyPercentage=", t);
        t.append(d2);
        t.append(", goalkeeperEfficiencyPercentage=");
        t.append(d3);
        t.append(")");
        return t.toString();
    }

    public HandballPlayerSeasonStatistics(int i, @NotNull String str, @Nullable Integer num, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24, @Nullable Integer num25, @Nullable Integer num26, @Nullable Integer num27, @Nullable Integer num28, @Nullable Integer num29, @Nullable Integer num30, @Nullable Integer num31, @Nullable Integer num32, @Nullable Integer num33, @Nullable Integer num34, @Nullable Integer num35, @Nullable Integer num36, @Nullable Integer num37, @Nullable Double d2, @Nullable Double d3) {
        str.getClass();
        this.id = i;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.saves = num2;
        this.twoMinutePenalties = num3;
        this.technicalFaults = num4;
        this.yellowCards = num5;
        this.gkShots = num6;
        this.gk7mGoals = num7;
        this.gk7mShots = num8;
        this.gk6mSaves = num9;
        this.gk6mShots = num10;
        this.gkPivotSaves = num11;
        this.gkPivotShots = num12;
        this.gk9mSaves = num13;
        this.gk9mShots = num14;
        this.gkBreakthroughSaves = num15;
        this.gkBreakthroughShots = num16;
        this.gkFastbreakGoals = num17;
        this.gkFastbreakShots = num18;
        this.shotsTaken = num19;
        this.goals = num20;
        this.assists = num21;
        this.goals7m = num22;
        this.shots7m = num23;
        this.goals6m = num24;
        this.shots6m = num25;
        this.goals9m = num26;
        this.shots9m = num27;
        this.breakthroughGoals = num28;
        this.breakthroughShots = num29;
        this.pivotGoals = num30;
        this.pivotShots = num31;
        this.fastbreakGoals = num32;
        this.fastbreakShots = num33;
        this.steals = num34;
        this.blockedShots = num35;
        this.gk7mSaves = num36;
        this.gkFastbreakSaves = num37;
        this.shootingEfficiencyPercentage = d2;
        this.goalkeeperEfficiencyPercentage = d3;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/HandballPlayerSeasonStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/player/HandballPlayerSeasonStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HandballPlayerSeasonStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
