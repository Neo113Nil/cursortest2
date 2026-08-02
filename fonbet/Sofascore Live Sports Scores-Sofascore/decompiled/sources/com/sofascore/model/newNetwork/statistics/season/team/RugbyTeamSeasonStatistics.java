package com.sofascore.model.newNetwork.statistics.season.team;

import defpackage.a7a;
import defpackage.fc6;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q5h("RugbyTeamSeasonStatistics")
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b6\b\u0087\b\u0018\u0000 \u00ad\u00012\u00020\u00012\u00020\u0002:\u0004®\u0001\u00ad\u0001BÑ\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b2\u00103Bí\u0003\b\u0010\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b2\u00108J\u0010\u00109\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b=\u0010<J\u0012\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b>\u0010<J\u0012\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b?\u0010<J\u0012\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b@\u0010<J\u0012\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bA\u0010<J\u0012\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bB\u0010<J\u0012\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bC\u0010<J\u0012\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bD\u0010<J\u0012\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bE\u0010<J\u0012\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bF\u0010<J\u0012\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bG\u0010<J\u0012\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bH\u0010<J\u0012\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bI\u0010<J\u0012\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bJ\u0010<J\u0012\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bK\u0010<J\u0012\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bL\u0010<J\u0012\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bM\u0010<J\u0012\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bN\u0010<J\u0012\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bO\u0010<J\u0012\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bP\u0010<J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bQ\u0010<J\u0012\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bR\u0010<J\u0012\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bS\u0010<J\u0012\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bT\u0010<J\u0012\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bU\u0010<J\u0012\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bV\u0010<J\u0012\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bW\u0010<J\u0012\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bX\u0010<J\u0012\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bY\u0010<J\u0012\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bZ\u0010<J\u0012\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b[\u0010<J\u0012\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\\\u0010<J\u0012\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b]\u0010<J\u0012\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b^\u0010<J\u0012\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b_\u0010<J\u0012\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b`\u0010<J\u0012\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\ba\u0010<J\u0012\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bb\u0010<J\u0012\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bc\u0010<J\u0012\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bd\u0010<J\u0012\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\be\u0010<J\u0012\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bf\u0010<J\u0012\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bg\u0010<J\u0012\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bh\u0010<J¶\u0004\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\bi\u0010jJ\u0010\u0010l\u001a\u00020kHÖ\u0001¢\u0006\u0004\bl\u0010mJ\u0010\u0010n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bn\u0010:J\u001a\u0010r\u001a\u00020q2\b\u0010p\u001a\u0004\u0018\u00010oHÖ\u0003¢\u0006\u0004\br\u0010sJ'\u0010|\u001a\u00020y2\u0006\u0010t\u001a\u00020\u00002\u0006\u0010v\u001a\u00020u2\u0006\u0010x\u001a\u00020wH\u0001¢\u0006\u0004\bz\u0010{R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010}\u001a\u0004\b~\u0010:R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0005\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010<R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0006\u0010\u007f\u001a\u0005\b\u0081\u0001\u0010<R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0007\u0010\u007f\u001a\u0005\b\u0082\u0001\u0010<R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\b\u0010\u007f\u001a\u0005\b\u0083\u0001\u0010<R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\t\u0010\u007f\u001a\u0005\b\u0084\u0001\u0010<R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\n\u0010\u007f\u001a\u0005\b\u0085\u0001\u0010<R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u000b\u0010\u007f\u001a\u0005\b\u0086\u0001\u0010<R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\f\u0010\u007f\u001a\u0005\b\u0087\u0001\u0010<R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\r\u0010\u007f\u001a\u0005\b\u0088\u0001\u0010<R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u000e\u0010\u007f\u001a\u0005\b\u0089\u0001\u0010<R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u000f\u0010\u007f\u001a\u0005\b\u008a\u0001\u0010<R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0010\u0010\u007f\u001a\u0005\b\u008b\u0001\u0010<R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0011\u0010\u007f\u001a\u0005\b\u008c\u0001\u0010<R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0012\u0010\u007f\u001a\u0005\b\u008d\u0001\u0010<R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0013\u0010\u007f\u001a\u0005\b\u008e\u0001\u0010<R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0014\u0010\u007f\u001a\u0005\b\u008f\u0001\u0010<R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0015\u0010\u007f\u001a\u0005\b\u0090\u0001\u0010<R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0016\u0010\u007f\u001a\u0005\b\u0091\u0001\u0010<R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0017\u0010\u007f\u001a\u0005\b\u0092\u0001\u0010<R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0018\u0010\u007f\u001a\u0005\b\u0093\u0001\u0010<R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0019\u0010\u007f\u001a\u0005\b\u0094\u0001\u0010<R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001a\u0010\u007f\u001a\u0005\b\u0095\u0001\u0010<R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001b\u0010\u007f\u001a\u0005\b\u0096\u0001\u0010<R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001c\u0010\u007f\u001a\u0005\b\u0097\u0001\u0010<R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001d\u0010\u007f\u001a\u0005\b\u0098\u0001\u0010<R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001e\u0010\u007f\u001a\u0005\b\u0099\u0001\u0010<R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001f\u0010\u007f\u001a\u0005\b\u009a\u0001\u0010<R\u001a\u0010 \u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b \u0010\u007f\u001a\u0005\b\u009b\u0001\u0010<R\u001a\u0010!\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b!\u0010\u007f\u001a\u0005\b\u009c\u0001\u0010<R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\"\u0010\u007f\u001a\u0005\b\u009d\u0001\u0010<R\u001a\u0010#\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b#\u0010\u007f\u001a\u0005\b\u009e\u0001\u0010<R\u001a\u0010$\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b$\u0010\u007f\u001a\u0005\b\u009f\u0001\u0010<R\u001a\u0010%\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b%\u0010\u007f\u001a\u0005\b \u0001\u0010<R\u001a\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b&\u0010\u007f\u001a\u0005\b¡\u0001\u0010<R\u001a\u0010'\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b'\u0010\u007f\u001a\u0005\b¢\u0001\u0010<R\u001a\u0010(\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b(\u0010\u007f\u001a\u0005\b£\u0001\u0010<R\u001a\u0010)\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b)\u0010\u007f\u001a\u0005\b¤\u0001\u0010<R\u001a\u0010*\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b*\u0010\u007f\u001a\u0005\b¥\u0001\u0010<R\u001a\u0010+\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b+\u0010\u007f\u001a\u0005\b¦\u0001\u0010<R\u001a\u0010,\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b,\u0010\u007f\u001a\u0005\b§\u0001\u0010<R\u001a\u0010-\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b-\u0010\u007f\u001a\u0005\b¨\u0001\u0010<R\u001a\u0010.\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b.\u0010\u007f\u001a\u0005\b©\u0001\u0010<R\u001a\u0010/\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b/\u0010\u007f\u001a\u0005\bª\u0001\u0010<R\u001a\u00100\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b0\u0010\u007f\u001a\u0005\b«\u0001\u0010<R\u001a\u00101\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b1\u0010\u007f\u001a\u0005\b¬\u0001\u0010<¨\u0006¯\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/RugbyTeamSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "Ljava/io/Serializable;", "", "id", "matches", "points", "tries", "penaltyTries", "penaltyGoals", "penaltyGoalsMissed", "conversions", "conversionsMissed", "dropGoals", "passesTotal", "passesSuccessful", "offloads", "carries", "cleanBreaks", "defendersBeaten", "metresMade", "handlingError", "carriesCrossedGainLine", "carriesNotMadeGainLine", "postContactMetres", "tackles", "tacklesTotal", "missedTackles", "dominantTackles", "penDefs", "penOffs", "scrumsWon", "scrumsSuccess", "scrumsTotal", "lineoutsWon", "lineoutsLost", "kickMetres", "kickFromHand", "rucksWon", "rucksLost", "rucksTotal", "ruckArrival", "ruckArrivalAttack", "ruckArrivalDefence", "ruckSpeed03", "ruckSpeed36", "ruckSpeed6Plus", "yellowCards", "redCards", "penaltyGoalsConceded", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/statistics/season/team/RugbyTeamSeasonStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/team/RugbyTeamSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/Integer;", "getMatches", "getPoints", "getTries", "getPenaltyTries", "getPenaltyGoals", "getPenaltyGoalsMissed", "getConversions", "getConversionsMissed", "getDropGoals", "getPassesTotal", "getPassesSuccessful", "getOffloads", "getCarries", "getCleanBreaks", "getDefendersBeaten", "getMetresMade", "getHandlingError", "getCarriesCrossedGainLine", "getCarriesNotMadeGainLine", "getPostContactMetres", "getTackles", "getTacklesTotal", "getMissedTackles", "getDominantTackles", "getPenDefs", "getPenOffs", "getScrumsWon", "getScrumsSuccess", "getScrumsTotal", "getLineoutsWon", "getLineoutsLost", "getKickMetres", "getKickFromHand", "getRucksWon", "getRucksLost", "getRucksTotal", "getRuckArrival", "getRuckArrivalAttack", "getRuckArrivalDefence", "getRuckSpeed03", "getRuckSpeed36", "getRuckSpeed6Plus", "getYellowCards", "getRedCards", "getPenaltyGoalsConceded", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RugbyTeamSeasonStatistics implements TeamSeasonStatistics, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer carries;

    @Nullable
    private final Integer carriesCrossedGainLine;

    @Nullable
    private final Integer carriesNotMadeGainLine;

    @Nullable
    private final Integer cleanBreaks;

    @Nullable
    private final Integer conversions;

    @Nullable
    private final Integer conversionsMissed;

    @Nullable
    private final Integer defendersBeaten;

    @Nullable
    private final Integer dominantTackles;

    @Nullable
    private final Integer dropGoals;

    @Nullable
    private final Integer handlingError;
    private final int id;

    @Nullable
    private final Integer kickFromHand;

    @Nullable
    private final Integer kickMetres;

    @Nullable
    private final Integer lineoutsLost;

    @Nullable
    private final Integer lineoutsWon;

    @Nullable
    private final Integer matches;

    @Nullable
    private final Integer metresMade;

    @Nullable
    private final Integer missedTackles;

    @Nullable
    private final Integer offloads;

    @Nullable
    private final Integer passesSuccessful;

    @Nullable
    private final Integer passesTotal;

    @Nullable
    private final Integer penDefs;

    @Nullable
    private final Integer penOffs;

    @Nullable
    private final Integer penaltyGoals;

    @Nullable
    private final Integer penaltyGoalsConceded;

    @Nullable
    private final Integer penaltyGoalsMissed;

    @Nullable
    private final Integer penaltyTries;

    @Nullable
    private final Integer points;

    @Nullable
    private final Integer postContactMetres;

    @Nullable
    private final Integer redCards;

    @Nullable
    private final Integer ruckArrival;

    @Nullable
    private final Integer ruckArrivalAttack;

    @Nullable
    private final Integer ruckArrivalDefence;

    @Nullable
    private final Integer ruckSpeed03;

    @Nullable
    private final Integer ruckSpeed36;

    @Nullable
    private final Integer ruckSpeed6Plus;

    @Nullable
    private final Integer rucksLost;

    @Nullable
    private final Integer rucksTotal;

    @Nullable
    private final Integer rucksWon;

    @Nullable
    private final Integer scrumsSuccess;

    @Nullable
    private final Integer scrumsTotal;

    @Nullable
    private final Integer scrumsWon;

    @Nullable
    private final Integer tackles;

    @Nullable
    private final Integer tacklesTotal;

    @Nullable
    private final Integer tries;

    @Nullable
    private final Integer yellowCards;

    public /* synthetic */ RugbyTeamSeasonStatistics(int i, int i2, int i3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, Integer num35, Integer num36, Integer num37, Integer num38, Integer num39, Integer num40, Integer num41, Integer num42, Integer num43, Integer num44, Integer num45, t5h t5hVar) {
        if ((16383 != (i2 & 16383)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, 16383}, RugbyTeamSeasonStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.matches = num;
        this.points = num2;
        this.tries = num3;
        this.penaltyTries = num4;
        this.penaltyGoals = num5;
        this.penaltyGoalsMissed = num6;
        this.conversions = num7;
        this.conversionsMissed = num8;
        this.dropGoals = num9;
        this.passesTotal = num10;
        this.passesSuccessful = num11;
        this.offloads = num12;
        this.carries = num13;
        this.cleanBreaks = num14;
        this.defendersBeaten = num15;
        this.metresMade = num16;
        this.handlingError = num17;
        this.carriesCrossedGainLine = num18;
        this.carriesNotMadeGainLine = num19;
        this.postContactMetres = num20;
        this.tackles = num21;
        this.tacklesTotal = num22;
        this.missedTackles = num23;
        this.dominantTackles = num24;
        this.penDefs = num25;
        this.penOffs = num26;
        this.scrumsWon = num27;
        this.scrumsSuccess = num28;
        this.scrumsTotal = num29;
        this.lineoutsWon = num30;
        this.lineoutsLost = num31;
        this.kickMetres = num32;
        this.kickFromHand = num33;
        this.rucksWon = num34;
        this.rucksLost = num35;
        this.rucksTotal = num36;
        this.ruckArrival = num37;
        this.ruckArrivalAttack = num38;
        this.ruckArrivalDefence = num39;
        this.ruckSpeed03 = num40;
        this.ruckSpeed36 = num41;
        this.ruckSpeed6Plus = num42;
        this.yellowCards = num43;
        this.redCards = num44;
        this.penaltyGoalsConceded = num45;
    }

    public static final /* synthetic */ void write$Self$model_release(RugbyTeamSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.matches);
        output.h(serialDesc, 2, a7aVar, self.points);
        output.h(serialDesc, 3, a7aVar, self.tries);
        output.h(serialDesc, 4, a7aVar, self.penaltyTries);
        output.h(serialDesc, 5, a7aVar, self.penaltyGoals);
        output.h(serialDesc, 6, a7aVar, self.penaltyGoalsMissed);
        output.h(serialDesc, 7, a7aVar, self.conversions);
        output.h(serialDesc, 8, a7aVar, self.conversionsMissed);
        output.h(serialDesc, 9, a7aVar, self.dropGoals);
        output.h(serialDesc, 10, a7aVar, self.passesTotal);
        output.h(serialDesc, 11, a7aVar, self.passesSuccessful);
        output.h(serialDesc, 12, a7aVar, self.offloads);
        output.h(serialDesc, 13, a7aVar, self.carries);
        output.h(serialDesc, 14, a7aVar, self.cleanBreaks);
        output.h(serialDesc, 15, a7aVar, self.defendersBeaten);
        output.h(serialDesc, 16, a7aVar, self.metresMade);
        output.h(serialDesc, 17, a7aVar, self.handlingError);
        output.h(serialDesc, 18, a7aVar, self.carriesCrossedGainLine);
        output.h(serialDesc, 19, a7aVar, self.carriesNotMadeGainLine);
        output.h(serialDesc, 20, a7aVar, self.postContactMetres);
        output.h(serialDesc, 21, a7aVar, self.tackles);
        output.h(serialDesc, 22, a7aVar, self.tacklesTotal);
        output.h(serialDesc, 23, a7aVar, self.missedTackles);
        output.h(serialDesc, 24, a7aVar, self.dominantTackles);
        output.h(serialDesc, 25, a7aVar, self.penDefs);
        output.h(serialDesc, 26, a7aVar, self.penOffs);
        output.h(serialDesc, 27, a7aVar, self.scrumsWon);
        output.h(serialDesc, 28, a7aVar, self.scrumsSuccess);
        output.h(serialDesc, 29, a7aVar, self.scrumsTotal);
        output.h(serialDesc, 30, a7aVar, self.lineoutsWon);
        output.h(serialDesc, 31, a7aVar, self.lineoutsLost);
        output.h(serialDesc, 32, a7aVar, self.kickMetres);
        output.h(serialDesc, 33, a7aVar, self.kickFromHand);
        output.h(serialDesc, 34, a7aVar, self.rucksWon);
        output.h(serialDesc, 35, a7aVar, self.rucksLost);
        output.h(serialDesc, 36, a7aVar, self.rucksTotal);
        output.h(serialDesc, 37, a7aVar, self.ruckArrival);
        output.h(serialDesc, 38, a7aVar, self.ruckArrivalAttack);
        output.h(serialDesc, 39, a7aVar, self.ruckArrivalDefence);
        output.h(serialDesc, 40, a7aVar, self.ruckSpeed03);
        output.h(serialDesc, 41, a7aVar, self.ruckSpeed36);
        output.h(serialDesc, 42, a7aVar, self.ruckSpeed6Plus);
        output.h(serialDesc, 43, a7aVar, self.yellowCards);
        output.h(serialDesc, 44, a7aVar, self.redCards);
        output.h(serialDesc, 45, a7aVar, self.penaltyGoalsConceded);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getDropGoals() {
        return this.dropGoals;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getPassesTotal() {
        return this.passesTotal;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getPassesSuccessful() {
        return this.passesSuccessful;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getOffloads() {
        return this.offloads;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getCarries() {
        return this.carries;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getCleanBreaks() {
        return this.cleanBreaks;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getDefendersBeaten() {
        return this.defendersBeaten;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getMetresMade() {
        return this.metresMade;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getHandlingError() {
        return this.handlingError;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getCarriesCrossedGainLine() {
        return this.carriesCrossedGainLine;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getCarriesNotMadeGainLine() {
        return this.carriesNotMadeGainLine;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getPostContactMetres() {
        return this.postContactMetres;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getTackles() {
        return this.tackles;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getTacklesTotal() {
        return this.tacklesTotal;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getMissedTackles() {
        return this.missedTackles;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getDominantTackles() {
        return this.dominantTackles;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getPenDefs() {
        return this.penDefs;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getPenOffs() {
        return this.penOffs;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getScrumsWon() {
        return this.scrumsWon;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Integer getScrumsSuccess() {
        return this.scrumsSuccess;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getScrumsTotal() {
        return this.scrumsTotal;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getLineoutsWon() {
        return this.lineoutsWon;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getLineoutsLost() {
        return this.lineoutsLost;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Integer getKickMetres() {
        return this.kickMetres;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Integer getKickFromHand() {
        return this.kickFromHand;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Integer getRucksWon() {
        return this.rucksWon;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final Integer getRucksLost() {
        return this.rucksLost;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final Integer getRucksTotal() {
        return this.rucksTotal;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final Integer getRuckArrival() {
        return this.ruckArrival;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final Integer getRuckArrivalAttack() {
        return this.ruckArrivalAttack;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getTries() {
        return this.tries;
    }

    @Nullable
    /* renamed from: component40, reason: from getter */
    public final Integer getRuckArrivalDefence() {
        return this.ruckArrivalDefence;
    }

    @Nullable
    /* renamed from: component41, reason: from getter */
    public final Integer getRuckSpeed03() {
        return this.ruckSpeed03;
    }

    @Nullable
    /* renamed from: component42, reason: from getter */
    public final Integer getRuckSpeed36() {
        return this.ruckSpeed36;
    }

    @Nullable
    /* renamed from: component43, reason: from getter */
    public final Integer getRuckSpeed6Plus() {
        return this.ruckSpeed6Plus;
    }

    @Nullable
    /* renamed from: component44, reason: from getter */
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    @Nullable
    /* renamed from: component45, reason: from getter */
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    /* renamed from: component46, reason: from getter */
    public final Integer getPenaltyGoalsConceded() {
        return this.penaltyGoalsConceded;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getPenaltyTries() {
        return this.penaltyTries;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getPenaltyGoalsMissed() {
        return this.penaltyGoalsMissed;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getConversions() {
        return this.conversions;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getConversionsMissed() {
        return this.conversionsMissed;
    }

    @NotNull
    public final RugbyTeamSeasonStatistics copy(int id, @Nullable Integer matches, @Nullable Integer points, @Nullable Integer tries, @Nullable Integer penaltyTries, @Nullable Integer penaltyGoals, @Nullable Integer penaltyGoalsMissed, @Nullable Integer conversions, @Nullable Integer conversionsMissed, @Nullable Integer dropGoals, @Nullable Integer passesTotal, @Nullable Integer passesSuccessful, @Nullable Integer offloads, @Nullable Integer carries, @Nullable Integer cleanBreaks, @Nullable Integer defendersBeaten, @Nullable Integer metresMade, @Nullable Integer handlingError, @Nullable Integer carriesCrossedGainLine, @Nullable Integer carriesNotMadeGainLine, @Nullable Integer postContactMetres, @Nullable Integer tackles, @Nullable Integer tacklesTotal, @Nullable Integer missedTackles, @Nullable Integer dominantTackles, @Nullable Integer penDefs, @Nullable Integer penOffs, @Nullable Integer scrumsWon, @Nullable Integer scrumsSuccess, @Nullable Integer scrumsTotal, @Nullable Integer lineoutsWon, @Nullable Integer lineoutsLost, @Nullable Integer kickMetres, @Nullable Integer kickFromHand, @Nullable Integer rucksWon, @Nullable Integer rucksLost, @Nullable Integer rucksTotal, @Nullable Integer ruckArrival, @Nullable Integer ruckArrivalAttack, @Nullable Integer ruckArrivalDefence, @Nullable Integer ruckSpeed03, @Nullable Integer ruckSpeed36, @Nullable Integer ruckSpeed6Plus, @Nullable Integer yellowCards, @Nullable Integer redCards, @Nullable Integer penaltyGoalsConceded) {
        return new RugbyTeamSeasonStatistics(id, matches, points, tries, penaltyTries, penaltyGoals, penaltyGoalsMissed, conversions, conversionsMissed, dropGoals, passesTotal, passesSuccessful, offloads, carries, cleanBreaks, defendersBeaten, metresMade, handlingError, carriesCrossedGainLine, carriesNotMadeGainLine, postContactMetres, tackles, tacklesTotal, missedTackles, dominantTackles, penDefs, penOffs, scrumsWon, scrumsSuccess, scrumsTotal, lineoutsWon, lineoutsLost, kickMetres, kickFromHand, rucksWon, rucksLost, rucksTotal, ruckArrival, ruckArrivalAttack, ruckArrivalDefence, ruckSpeed03, ruckSpeed36, ruckSpeed6Plus, yellowCards, redCards, penaltyGoalsConceded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RugbyTeamSeasonStatistics)) {
            return false;
        }
        RugbyTeamSeasonStatistics rugbyTeamSeasonStatistics = (RugbyTeamSeasonStatistics) other;
        return this.id == rugbyTeamSeasonStatistics.id && Intrinsics.c(this.matches, rugbyTeamSeasonStatistics.matches) && Intrinsics.c(this.points, rugbyTeamSeasonStatistics.points) && Intrinsics.c(this.tries, rugbyTeamSeasonStatistics.tries) && Intrinsics.c(this.penaltyTries, rugbyTeamSeasonStatistics.penaltyTries) && Intrinsics.c(this.penaltyGoals, rugbyTeamSeasonStatistics.penaltyGoals) && Intrinsics.c(this.penaltyGoalsMissed, rugbyTeamSeasonStatistics.penaltyGoalsMissed) && Intrinsics.c(this.conversions, rugbyTeamSeasonStatistics.conversions) && Intrinsics.c(this.conversionsMissed, rugbyTeamSeasonStatistics.conversionsMissed) && Intrinsics.c(this.dropGoals, rugbyTeamSeasonStatistics.dropGoals) && Intrinsics.c(this.passesTotal, rugbyTeamSeasonStatistics.passesTotal) && Intrinsics.c(this.passesSuccessful, rugbyTeamSeasonStatistics.passesSuccessful) && Intrinsics.c(this.offloads, rugbyTeamSeasonStatistics.offloads) && Intrinsics.c(this.carries, rugbyTeamSeasonStatistics.carries) && Intrinsics.c(this.cleanBreaks, rugbyTeamSeasonStatistics.cleanBreaks) && Intrinsics.c(this.defendersBeaten, rugbyTeamSeasonStatistics.defendersBeaten) && Intrinsics.c(this.metresMade, rugbyTeamSeasonStatistics.metresMade) && Intrinsics.c(this.handlingError, rugbyTeamSeasonStatistics.handlingError) && Intrinsics.c(this.carriesCrossedGainLine, rugbyTeamSeasonStatistics.carriesCrossedGainLine) && Intrinsics.c(this.carriesNotMadeGainLine, rugbyTeamSeasonStatistics.carriesNotMadeGainLine) && Intrinsics.c(this.postContactMetres, rugbyTeamSeasonStatistics.postContactMetres) && Intrinsics.c(this.tackles, rugbyTeamSeasonStatistics.tackles) && Intrinsics.c(this.tacklesTotal, rugbyTeamSeasonStatistics.tacklesTotal) && Intrinsics.c(this.missedTackles, rugbyTeamSeasonStatistics.missedTackles) && Intrinsics.c(this.dominantTackles, rugbyTeamSeasonStatistics.dominantTackles) && Intrinsics.c(this.penDefs, rugbyTeamSeasonStatistics.penDefs) && Intrinsics.c(this.penOffs, rugbyTeamSeasonStatistics.penOffs) && Intrinsics.c(this.scrumsWon, rugbyTeamSeasonStatistics.scrumsWon) && Intrinsics.c(this.scrumsSuccess, rugbyTeamSeasonStatistics.scrumsSuccess) && Intrinsics.c(this.scrumsTotal, rugbyTeamSeasonStatistics.scrumsTotal) && Intrinsics.c(this.lineoutsWon, rugbyTeamSeasonStatistics.lineoutsWon) && Intrinsics.c(this.lineoutsLost, rugbyTeamSeasonStatistics.lineoutsLost) && Intrinsics.c(this.kickMetres, rugbyTeamSeasonStatistics.kickMetres) && Intrinsics.c(this.kickFromHand, rugbyTeamSeasonStatistics.kickFromHand) && Intrinsics.c(this.rucksWon, rugbyTeamSeasonStatistics.rucksWon) && Intrinsics.c(this.rucksLost, rugbyTeamSeasonStatistics.rucksLost) && Intrinsics.c(this.rucksTotal, rugbyTeamSeasonStatistics.rucksTotal) && Intrinsics.c(this.ruckArrival, rugbyTeamSeasonStatistics.ruckArrival) && Intrinsics.c(this.ruckArrivalAttack, rugbyTeamSeasonStatistics.ruckArrivalAttack) && Intrinsics.c(this.ruckArrivalDefence, rugbyTeamSeasonStatistics.ruckArrivalDefence) && Intrinsics.c(this.ruckSpeed03, rugbyTeamSeasonStatistics.ruckSpeed03) && Intrinsics.c(this.ruckSpeed36, rugbyTeamSeasonStatistics.ruckSpeed36) && Intrinsics.c(this.ruckSpeed6Plus, rugbyTeamSeasonStatistics.ruckSpeed6Plus) && Intrinsics.c(this.yellowCards, rugbyTeamSeasonStatistics.yellowCards) && Intrinsics.c(this.redCards, rugbyTeamSeasonStatistics.redCards) && Intrinsics.c(this.penaltyGoalsConceded, rugbyTeamSeasonStatistics.penaltyGoalsConceded);
    }

    @Nullable
    public final Integer getCarries() {
        return this.carries;
    }

    @Nullable
    public final Integer getCarriesCrossedGainLine() {
        return this.carriesCrossedGainLine;
    }

    @Nullable
    public final Integer getCarriesNotMadeGainLine() {
        return this.carriesNotMadeGainLine;
    }

    @Nullable
    public final Integer getCleanBreaks() {
        return this.cleanBreaks;
    }

    @Nullable
    public final Integer getConversions() {
        return this.conversions;
    }

    @Nullable
    public final Integer getConversionsMissed() {
        return this.conversionsMissed;
    }

    @Nullable
    public final Integer getDefendersBeaten() {
        return this.defendersBeaten;
    }

    @Nullable
    public final Integer getDominantTackles() {
        return this.dominantTackles;
    }

    @Nullable
    public final Integer getDropGoals() {
        return this.dropGoals;
    }

    @Nullable
    public final Integer getHandlingError() {
        return this.handlingError;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getKickFromHand() {
        return this.kickFromHand;
    }

    @Nullable
    public final Integer getKickMetres() {
        return this.kickMetres;
    }

    @Nullable
    public final Integer getLineoutsLost() {
        return this.lineoutsLost;
    }

    @Nullable
    public final Integer getLineoutsWon() {
        return this.lineoutsWon;
    }

    @Nullable
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    public final Integer getMetresMade() {
        return this.metresMade;
    }

    @Nullable
    public final Integer getMissedTackles() {
        return this.missedTackles;
    }

    @Nullable
    public final Integer getOffloads() {
        return this.offloads;
    }

    @Nullable
    public final Integer getPassesSuccessful() {
        return this.passesSuccessful;
    }

    @Nullable
    public final Integer getPassesTotal() {
        return this.passesTotal;
    }

    @Nullable
    public final Integer getPenDefs() {
        return this.penDefs;
    }

    @Nullable
    public final Integer getPenOffs() {
        return this.penOffs;
    }

    @Nullable
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    public final Integer getPenaltyGoalsConceded() {
        return this.penaltyGoalsConceded;
    }

    @Nullable
    public final Integer getPenaltyGoalsMissed() {
        return this.penaltyGoalsMissed;
    }

    @Nullable
    public final Integer getPenaltyTries() {
        return this.penaltyTries;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPostContactMetres() {
        return this.postContactMetres;
    }

    @Nullable
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    public final Integer getRuckArrival() {
        return this.ruckArrival;
    }

    @Nullable
    public final Integer getRuckArrivalAttack() {
        return this.ruckArrivalAttack;
    }

    @Nullable
    public final Integer getRuckArrivalDefence() {
        return this.ruckArrivalDefence;
    }

    @Nullable
    public final Integer getRuckSpeed03() {
        return this.ruckSpeed03;
    }

    @Nullable
    public final Integer getRuckSpeed36() {
        return this.ruckSpeed36;
    }

    @Nullable
    public final Integer getRuckSpeed6Plus() {
        return this.ruckSpeed6Plus;
    }

    @Nullable
    public final Integer getRucksLost() {
        return this.rucksLost;
    }

    @Nullable
    public final Integer getRucksTotal() {
        return this.rucksTotal;
    }

    @Nullable
    public final Integer getRucksWon() {
        return this.rucksWon;
    }

    @Nullable
    public final Integer getScrumsSuccess() {
        return this.scrumsSuccess;
    }

    @Nullable
    public final Integer getScrumsTotal() {
        return this.scrumsTotal;
    }

    @Nullable
    public final Integer getScrumsWon() {
        return this.scrumsWon;
    }

    @Nullable
    public final Integer getTackles() {
        return this.tackles;
    }

    @Nullable
    public final Integer getTacklesTotal() {
        return this.tacklesTotal;
    }

    @Nullable
    public final Integer getTries() {
        return this.tries;
    }

    @Nullable
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.matches;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.points;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.tries;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.penaltyTries;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.penaltyGoals;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.penaltyGoalsMissed;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.conversions;
        int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.conversionsMissed;
        int hashCode9 = (hashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.dropGoals;
        int hashCode10 = (hashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.passesTotal;
        int hashCode11 = (hashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.passesSuccessful;
        int hashCode12 = (hashCode11 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.offloads;
        int hashCode13 = (hashCode12 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.carries;
        int hashCode14 = (hashCode13 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.cleanBreaks;
        int hashCode15 = (hashCode14 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.defendersBeaten;
        int hashCode16 = (hashCode15 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.metresMade;
        int hashCode17 = (hashCode16 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.handlingError;
        int hashCode18 = (hashCode17 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.carriesCrossedGainLine;
        int hashCode19 = (hashCode18 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.carriesNotMadeGainLine;
        int hashCode20 = (hashCode19 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.postContactMetres;
        int hashCode21 = (hashCode20 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.tackles;
        int hashCode22 = (hashCode21 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.tacklesTotal;
        int hashCode23 = (hashCode22 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.missedTackles;
        int hashCode24 = (hashCode23 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.dominantTackles;
        int hashCode25 = (hashCode24 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.penDefs;
        int hashCode26 = (hashCode25 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.penOffs;
        int hashCode27 = (hashCode26 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.scrumsWon;
        int hashCode28 = (hashCode27 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Integer num28 = this.scrumsSuccess;
        int hashCode29 = (hashCode28 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Integer num29 = this.scrumsTotal;
        int hashCode30 = (hashCode29 + (num29 == null ? 0 : num29.hashCode())) * 31;
        Integer num30 = this.lineoutsWon;
        int hashCode31 = (hashCode30 + (num30 == null ? 0 : num30.hashCode())) * 31;
        Integer num31 = this.lineoutsLost;
        int hashCode32 = (hashCode31 + (num31 == null ? 0 : num31.hashCode())) * 31;
        Integer num32 = this.kickMetres;
        int hashCode33 = (hashCode32 + (num32 == null ? 0 : num32.hashCode())) * 31;
        Integer num33 = this.kickFromHand;
        int hashCode34 = (hashCode33 + (num33 == null ? 0 : num33.hashCode())) * 31;
        Integer num34 = this.rucksWon;
        int hashCode35 = (hashCode34 + (num34 == null ? 0 : num34.hashCode())) * 31;
        Integer num35 = this.rucksLost;
        int hashCode36 = (hashCode35 + (num35 == null ? 0 : num35.hashCode())) * 31;
        Integer num36 = this.rucksTotal;
        int hashCode37 = (hashCode36 + (num36 == null ? 0 : num36.hashCode())) * 31;
        Integer num37 = this.ruckArrival;
        int hashCode38 = (hashCode37 + (num37 == null ? 0 : num37.hashCode())) * 31;
        Integer num38 = this.ruckArrivalAttack;
        int hashCode39 = (hashCode38 + (num38 == null ? 0 : num38.hashCode())) * 31;
        Integer num39 = this.ruckArrivalDefence;
        int hashCode40 = (hashCode39 + (num39 == null ? 0 : num39.hashCode())) * 31;
        Integer num40 = this.ruckSpeed03;
        int hashCode41 = (hashCode40 + (num40 == null ? 0 : num40.hashCode())) * 31;
        Integer num41 = this.ruckSpeed36;
        int hashCode42 = (hashCode41 + (num41 == null ? 0 : num41.hashCode())) * 31;
        Integer num42 = this.ruckSpeed6Plus;
        int hashCode43 = (hashCode42 + (num42 == null ? 0 : num42.hashCode())) * 31;
        Integer num43 = this.yellowCards;
        int hashCode44 = (hashCode43 + (num43 == null ? 0 : num43.hashCode())) * 31;
        Integer num44 = this.redCards;
        int hashCode45 = (hashCode44 + (num44 == null ? 0 : num44.hashCode())) * 31;
        Integer num45 = this.penaltyGoalsConceded;
        return hashCode45 + (num45 != null ? num45.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Integer num = this.matches;
        Integer num2 = this.points;
        Integer num3 = this.tries;
        Integer num4 = this.penaltyTries;
        Integer num5 = this.penaltyGoals;
        Integer num6 = this.penaltyGoalsMissed;
        Integer num7 = this.conversions;
        Integer num8 = this.conversionsMissed;
        Integer num9 = this.dropGoals;
        Integer num10 = this.passesTotal;
        Integer num11 = this.passesSuccessful;
        Integer num12 = this.offloads;
        Integer num13 = this.carries;
        Integer num14 = this.cleanBreaks;
        Integer num15 = this.defendersBeaten;
        Integer num16 = this.metresMade;
        Integer num17 = this.handlingError;
        Integer num18 = this.carriesCrossedGainLine;
        Integer num19 = this.carriesNotMadeGainLine;
        Integer num20 = this.postContactMetres;
        Integer num21 = this.tackles;
        Integer num22 = this.tacklesTotal;
        Integer num23 = this.missedTackles;
        Integer num24 = this.dominantTackles;
        Integer num25 = this.penDefs;
        Integer num26 = this.penOffs;
        Integer num27 = this.scrumsWon;
        Integer num28 = this.scrumsSuccess;
        Integer num29 = this.scrumsTotal;
        Integer num30 = this.lineoutsWon;
        Integer num31 = this.lineoutsLost;
        Integer num32 = this.kickMetres;
        Integer num33 = this.kickFromHand;
        Integer num34 = this.rucksWon;
        Integer num35 = this.rucksLost;
        Integer num36 = this.rucksTotal;
        Integer num37 = this.ruckArrival;
        Integer num38 = this.ruckArrivalAttack;
        Integer num39 = this.ruckArrivalDefence;
        Integer num40 = this.ruckSpeed03;
        Integer num41 = this.ruckSpeed36;
        Integer num42 = this.ruckSpeed6Plus;
        Integer num43 = this.yellowCards;
        Integer num44 = this.redCards;
        Integer num45 = this.penaltyGoalsConceded;
        StringBuilder r = fc6.r("RugbyTeamSeasonStatistics(id=", ", matches=", ", points=", num, i);
        vxd.r(num2, num3, ", tries=", ", penaltyTries=", r);
        vxd.r(num4, num5, ", penaltyGoals=", ", penaltyGoalsMissed=", r);
        vxd.r(num6, num7, ", conversions=", ", conversionsMissed=", r);
        vxd.r(num8, num9, ", dropGoals=", ", passesTotal=", r);
        vxd.r(num10, num11, ", passesSuccessful=", ", offloads=", r);
        vxd.r(num12, num13, ", carries=", ", cleanBreaks=", r);
        vxd.r(num14, num15, ", defendersBeaten=", ", metresMade=", r);
        vxd.r(num16, num17, ", handlingError=", ", carriesCrossedGainLine=", r);
        vxd.r(num18, num19, ", carriesNotMadeGainLine=", ", postContactMetres=", r);
        vxd.r(num20, num21, ", tackles=", ", tacklesTotal=", r);
        vxd.r(num22, num23, ", missedTackles=", ", dominantTackles=", r);
        vxd.r(num24, num25, ", penDefs=", ", penOffs=", r);
        vxd.r(num26, num27, ", scrumsWon=", ", scrumsSuccess=", r);
        vxd.r(num28, num29, ", scrumsTotal=", ", lineoutsWon=", r);
        vxd.r(num30, num31, ", lineoutsLost=", ", kickMetres=", r);
        vxd.r(num32, num33, ", kickFromHand=", ", rucksWon=", r);
        vxd.r(num34, num35, ", rucksLost=", ", rucksTotal=", r);
        vxd.r(num36, num37, ", ruckArrival=", ", ruckArrivalAttack=", r);
        vxd.r(num38, num39, ", ruckArrivalDefence=", ", ruckSpeed03=", r);
        vxd.r(num40, num41, ", ruckSpeed36=", ", ruckSpeed6Plus=", r);
        vxd.r(num42, num43, ", yellowCards=", ", redCards=", r);
        return fc6.l(num44, num45, ", penaltyGoalsConceded=", ")", r);
    }

    public RugbyTeamSeasonStatistics(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24, @Nullable Integer num25, @Nullable Integer num26, @Nullable Integer num27, @Nullable Integer num28, @Nullable Integer num29, @Nullable Integer num30, @Nullable Integer num31, @Nullable Integer num32, @Nullable Integer num33, @Nullable Integer num34, @Nullable Integer num35, @Nullable Integer num36, @Nullable Integer num37, @Nullable Integer num38, @Nullable Integer num39, @Nullable Integer num40, @Nullable Integer num41, @Nullable Integer num42, @Nullable Integer num43, @Nullable Integer num44, @Nullable Integer num45) {
        this.id = i;
        this.matches = num;
        this.points = num2;
        this.tries = num3;
        this.penaltyTries = num4;
        this.penaltyGoals = num5;
        this.penaltyGoalsMissed = num6;
        this.conversions = num7;
        this.conversionsMissed = num8;
        this.dropGoals = num9;
        this.passesTotal = num10;
        this.passesSuccessful = num11;
        this.offloads = num12;
        this.carries = num13;
        this.cleanBreaks = num14;
        this.defendersBeaten = num15;
        this.metresMade = num16;
        this.handlingError = num17;
        this.carriesCrossedGainLine = num18;
        this.carriesNotMadeGainLine = num19;
        this.postContactMetres = num20;
        this.tackles = num21;
        this.tacklesTotal = num22;
        this.missedTackles = num23;
        this.dominantTackles = num24;
        this.penDefs = num25;
        this.penOffs = num26;
        this.scrumsWon = num27;
        this.scrumsSuccess = num28;
        this.scrumsTotal = num29;
        this.lineoutsWon = num30;
        this.lineoutsLost = num31;
        this.kickMetres = num32;
        this.kickFromHand = num33;
        this.rucksWon = num34;
        this.rucksLost = num35;
        this.rucksTotal = num36;
        this.ruckArrival = num37;
        this.ruckArrivalAttack = num38;
        this.ruckArrivalDefence = num39;
        this.ruckSpeed03 = num40;
        this.ruckSpeed36 = num41;
        this.ruckSpeed6Plus = num42;
        this.yellowCards = num43;
        this.redCards = num44;
        this.penaltyGoalsConceded = num45;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/RugbyTeamSeasonStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/team/RugbyTeamSeasonStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RugbyTeamSeasonStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
