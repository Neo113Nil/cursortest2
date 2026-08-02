package com.sofascore.model.newNetwork.statistics.season.player;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b>\b\u0087\b\u0018\u0000 Ã\u00012\u00020\u00012\u00020\u0002:\u0004Ã\u0001Ä\u0001B\u008b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\b\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\b\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b:\u0010;B©\u0004\b\u0010\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\b\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\b\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b:\u0010@J\u0010\u0010A\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bI\u0010FJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bJ\u0010FJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bK\u0010FJ\u0012\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bL\u0010HJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bM\u0010FJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bN\u0010FJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bO\u0010FJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bP\u0010FJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bQ\u0010FJ\u0012\u0010R\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bR\u0010HJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bS\u0010FJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bT\u0010FJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bU\u0010FJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bV\u0010FJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bW\u0010FJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bX\u0010FJ\u0012\u0010Y\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bY\u0010HJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bZ\u0010FJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b[\u0010FJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\\\u0010FJ\u0012\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b]\u0010FJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b^\u0010FJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b_\u0010FJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b`\u0010FJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\ba\u0010FJ\u0012\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bb\u0010FJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bc\u0010FJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bd\u0010FJ\u0012\u0010e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\be\u0010HJ\u0012\u0010f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bf\u0010HJ\u0012\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bg\u0010FJ\u0012\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bh\u0010FJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bi\u0010FJ\u0012\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bj\u0010FJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bk\u0010FJ\u0012\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bl\u0010FJ\u0012\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bm\u0010FJ\u0012\u0010n\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bn\u0010HJ\u0012\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bo\u0010FJ\u0012\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bp\u0010FJ\u0012\u0010q\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bq\u0010HJ\u0012\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\br\u0010FJ\u0012\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bs\u0010FJ\u0012\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bt\u0010FJ\u0012\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bu\u0010FJ\u0012\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bv\u0010FJ\u0012\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bw\u0010FJ\u0012\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bx\u0010FJü\u0004\u0010y\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\by\u0010zJ\u0010\u0010{\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b{\u0010DJ\u0010\u0010|\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b|\u0010BJ\u001d\u0010\u0080\u0001\u001a\u00020\u007f2\b\u0010~\u001a\u0004\u0018\u00010}HÖ\u0003¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J0\u0010\u008a\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u00002\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0004\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010BR\u001c\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0006\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010DR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010FR\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010HR\u001b\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\n\u0010\u008f\u0001\u001a\u0005\b\u0093\u0001\u0010FR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010\u008f\u0001\u001a\u0005\b\u0094\u0001\u0010FR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\f\u0010\u008f\u0001\u001a\u0005\b\u0095\u0001\u0010FR\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b\r\u0010\u0091\u0001\u001a\u0005\b\u0096\u0001\u0010HR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u008f\u0001\u001a\u0005\b\u0097\u0001\u0010FR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u008f\u0001\u001a\u0005\b\u0098\u0001\u0010FR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010\u008f\u0001\u001a\u0005\b\u0099\u0001\u0010FR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u008f\u0001\u001a\u0005\b\u009a\u0001\u0010FR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010\u008f\u0001\u001a\u0005\b\u009b\u0001\u0010FR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u0091\u0001\u001a\u0005\b\u009c\u0001\u0010HR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010\u008f\u0001\u001a\u0005\b\u009d\u0001\u0010FR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u008f\u0001\u001a\u0005\b\u009e\u0001\u0010FR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u008f\u0001\u001a\u0005\b\u009f\u0001\u0010FR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u008f\u0001\u001a\u0005\b \u0001\u0010FR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010\u008f\u0001\u001a\u0005\b¡\u0001\u0010FR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010\u008f\u0001\u001a\u0005\b¢\u0001\u0010FR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u0091\u0001\u001a\u0005\b£\u0001\u0010HR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u008f\u0001\u001a\u0005\b¤\u0001\u0010FR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u008f\u0001\u001a\u0005\b¥\u0001\u0010FR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u008f\u0001\u001a\u0005\b¦\u0001\u0010FR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u008f\u0001\u001a\u0005\b§\u0001\u0010FR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u008f\u0001\u001a\u0005\b¨\u0001\u0010FR\u001b\u0010 \u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b \u0010\u008f\u0001\u001a\u0005\b©\u0001\u0010FR\u001b\u0010!\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b!\u0010\u008f\u0001\u001a\u0005\bª\u0001\u0010FR\u001b\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u008f\u0001\u001a\u0005\b«\u0001\u0010FR\u001b\u0010#\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b#\u0010\u008f\u0001\u001a\u0005\b¬\u0001\u0010FR\u001b\u0010$\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b$\u0010\u008f\u0001\u001a\u0005\b\u00ad\u0001\u0010FR\u001b\u0010%\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b%\u0010\u008f\u0001\u001a\u0005\b®\u0001\u0010FR\u001b\u0010&\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0091\u0001\u001a\u0005\b¯\u0001\u0010HR\u001b\u0010'\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b'\u0010\u0091\u0001\u001a\u0005\b°\u0001\u0010HR\u001b\u0010(\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b(\u0010\u008f\u0001\u001a\u0005\b±\u0001\u0010FR\u001b\u0010)\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b)\u0010\u008f\u0001\u001a\u0005\b²\u0001\u0010FR\u001b\u0010*\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b*\u0010\u008f\u0001\u001a\u0005\b³\u0001\u0010FR\u001b\u0010+\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b+\u0010\u008f\u0001\u001a\u0005\b´\u0001\u0010FR\u001b\u0010,\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b,\u0010\u008f\u0001\u001a\u0005\bµ\u0001\u0010FR\u001b\u0010-\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b-\u0010\u008f\u0001\u001a\u0005\b¶\u0001\u0010FR\u001b\u0010.\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b.\u0010\u008f\u0001\u001a\u0005\b·\u0001\u0010FR\u001b\u0010/\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b/\u0010\u0091\u0001\u001a\u0005\b¸\u0001\u0010HR\u001b\u00100\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b0\u0010\u008f\u0001\u001a\u0005\b¹\u0001\u0010FR\u001b\u00101\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b1\u0010\u008f\u0001\u001a\u0005\bº\u0001\u0010FR\u001b\u00102\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b2\u0010\u0091\u0001\u001a\u0005\b»\u0001\u0010HR\u001b\u00103\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b3\u0010\u008f\u0001\u001a\u0005\b¼\u0001\u0010FR\u001b\u00104\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b4\u0010\u008f\u0001\u001a\u0005\b½\u0001\u0010FR\u001b\u00105\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b5\u0010\u008f\u0001\u001a\u0005\b¾\u0001\u0010FR\u001b\u00106\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b6\u0010\u008f\u0001\u001a\u0005\b¿\u0001\u0010FR\u001b\u00107\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b7\u0010\u008f\u0001\u001a\u0005\bÀ\u0001\u0010FR\u001b\u00108\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b8\u0010\u008f\u0001\u001a\u0005\bÁ\u0001\u0010FR\u001b\u00109\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b9\u0010\u008f\u0001\u001a\u0005\bÂ\u0001\u0010F¨\u0006Å\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/IceHockeyPlayerSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "Ljava/io/Serializable;", "", "id", "", "type", "appearances", "", CampaignEx.JSON_KEY_STAR, "assists", "blocked", "evenSaves", "evenSavePercentage", "evenShots", "evenGoals", "evenAssists", "evenPoints", "evenTimeOnIce", "faceOffPercentage", "faceOffTaken", "faceOffWins", "gameWinningGoals", "gamesStarted", "goals", "goalsAgainst", "goalsAgainstAverage", "hits", "overTimeGoals", "penaltyMinutes", "plusMinus", "points", "powerPlayGoals", "powerPlayPoints", "powerPlayAssists", "powerPlaySaves", "powerPlayShots", "powerPlayTimeOnIce", "powerPlaySavePercentage", "savePercentage", "saves", "shortHandedGoals", "shortHandedPoints", "shortHandedAssists", "shortHandedSaves", "shortHandedShots", "shortHandedTimeOnIce", "shortHandedSavePercentage", "shots", "shotsAgainst", "shotPercentage", "shutouts", "losses", "overTimeLosses", "shifts", "takeaways", "timeOnIce", "wins", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/statistics/season/player/IceHockeyPlayerSeasonStatistics;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/IceHockeyPlayerSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getType", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/Double;", "getRating", "getAssists", "getBlocked", "getEvenSaves", "getEvenSavePercentage", "getEvenShots", "getEvenGoals", "getEvenAssists", "getEvenPoints", "getEvenTimeOnIce", "getFaceOffPercentage", "getFaceOffTaken", "getFaceOffWins", "getGameWinningGoals", "getGamesStarted", "getGoals", "getGoalsAgainst", "getGoalsAgainstAverage", "getHits", "getOverTimeGoals", "getPenaltyMinutes", "getPlusMinus", "getPoints", "getPowerPlayGoals", "getPowerPlayPoints", "getPowerPlayAssists", "getPowerPlaySaves", "getPowerPlayShots", "getPowerPlayTimeOnIce", "getPowerPlaySavePercentage", "getSavePercentage", "getSaves", "getShortHandedGoals", "getShortHandedPoints", "getShortHandedAssists", "getShortHandedSaves", "getShortHandedShots", "getShortHandedTimeOnIce", "getShortHandedSavePercentage", "getShots", "getShotsAgainst", "getShotPercentage", "getShutouts", "getLosses", "getOverTimeLosses", "getShifts", "getTakeaways", "getTimeOnIce", "getWins", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class IceHockeyPlayerSeasonStatistics extends AbstractPlayerSeasonStatistics implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer blocked;

    @Nullable
    private final Integer evenAssists;

    @Nullable
    private final Integer evenGoals;

    @Nullable
    private final Integer evenPoints;

    @Nullable
    private final Double evenSavePercentage;

    @Nullable
    private final Integer evenSaves;

    @Nullable
    private final Integer evenShots;

    @Nullable
    private final Integer evenTimeOnIce;

    @Nullable
    private final Double faceOffPercentage;

    @Nullable
    private final Integer faceOffTaken;

    @Nullable
    private final Integer faceOffWins;

    @Nullable
    private final Integer gameWinningGoals;

    @Nullable
    private final Integer gamesStarted;

    @Nullable
    private final Integer goals;

    @Nullable
    private final Integer goalsAgainst;

    @Nullable
    private final Double goalsAgainstAverage;

    @Nullable
    private final Integer hits;
    private final int id;

    @Nullable
    private final Integer losses;

    @Nullable
    private final Integer overTimeGoals;

    @Nullable
    private final Integer overTimeLosses;

    @Nullable
    private final Integer penaltyMinutes;

    @Nullable
    private final Integer plusMinus;

    @Nullable
    private final Integer points;

    @Nullable
    private final Integer powerPlayAssists;

    @Nullable
    private final Integer powerPlayGoals;

    @Nullable
    private final Integer powerPlayPoints;

    @Nullable
    private final Double powerPlaySavePercentage;

    @Nullable
    private final Integer powerPlaySaves;

    @Nullable
    private final Integer powerPlayShots;

    @Nullable
    private final Integer powerPlayTimeOnIce;

    @Nullable
    private final Double rating;

    @Nullable
    private final Double savePercentage;

    @Nullable
    private final Integer saves;

    @Nullable
    private final Integer shifts;

    @Nullable
    private final Integer shortHandedAssists;

    @Nullable
    private final Integer shortHandedGoals;

    @Nullable
    private final Integer shortHandedPoints;

    @Nullable
    private final Double shortHandedSavePercentage;

    @Nullable
    private final Integer shortHandedSaves;

    @Nullable
    private final Integer shortHandedShots;

    @Nullable
    private final Integer shortHandedTimeOnIce;

    @Nullable
    private final Double shotPercentage;

    @Nullable
    private final Integer shots;

    @Nullable
    private final Integer shotsAgainst;

    @Nullable
    private final Integer shutouts;

    @Nullable
    private final Integer takeaways;

    @Nullable
    private final Integer timeOnIce;

    @NotNull
    private final String type;

    @Nullable
    private final Integer wins;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IceHockeyPlayerSeasonStatistics(int i, int i2, int i3, String str, Integer num, Double d, Integer num2, Integer num3, Integer num4, Double d2, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Double d3, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Double d4, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Double d5, Double d6, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Double d7, Integer num34, Integer num35, Double d8, Integer num36, Integer num37, Integer num38, Integer num39, Integer num40, Integer num41, Integer num42, t5h t5hVar) {
        super(i, t5hVar);
        if ((1048575 != (i2 & 1048575)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, 1048575}, IceHockeyPlayerSeasonStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.assists = num2;
        this.blocked = num3;
        this.evenSaves = num4;
        this.evenSavePercentage = d2;
        this.evenShots = num5;
        this.evenGoals = num6;
        this.evenAssists = num7;
        this.evenPoints = num8;
        this.evenTimeOnIce = num9;
        this.faceOffPercentage = d3;
        this.faceOffTaken = num10;
        this.faceOffWins = num11;
        this.gameWinningGoals = num12;
        this.gamesStarted = num13;
        this.goals = num14;
        this.goalsAgainst = num15;
        this.goalsAgainstAverage = d4;
        this.hits = num16;
        this.overTimeGoals = num17;
        this.penaltyMinutes = num18;
        this.plusMinus = num19;
        this.points = num20;
        this.powerPlayGoals = num21;
        this.powerPlayPoints = num22;
        this.powerPlayAssists = num23;
        this.powerPlaySaves = num24;
        this.powerPlayShots = num25;
        this.powerPlayTimeOnIce = num26;
        this.powerPlaySavePercentage = d5;
        this.savePercentage = d6;
        this.saves = num27;
        this.shortHandedGoals = num28;
        this.shortHandedPoints = num29;
        this.shortHandedAssists = num30;
        this.shortHandedSaves = num31;
        this.shortHandedShots = num32;
        this.shortHandedTimeOnIce = num33;
        this.shortHandedSavePercentage = d7;
        this.shots = num34;
        this.shotsAgainst = num35;
        this.shotPercentage = d8;
        this.shutouts = num36;
        this.losses = num37;
        this.overTimeLosses = num38;
        this.shifts = num39;
        this.takeaways = num40;
        this.timeOnIce = num41;
        this.wins = num42;
    }

    public static final /* synthetic */ void write$Self$model_release(IceHockeyPlayerSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
        AbstractPlayerSeasonStatistics.write$Self(self, output, serialDesc);
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.getType());
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.getAppearances());
        h75 h75Var = h75.a;
        output.h(serialDesc, 3, h75Var, self.getRating());
        output.h(serialDesc, 4, a7aVar, self.assists);
        output.h(serialDesc, 5, a7aVar, self.blocked);
        output.h(serialDesc, 6, a7aVar, self.evenSaves);
        output.h(serialDesc, 7, h75Var, self.evenSavePercentage);
        output.h(serialDesc, 8, a7aVar, self.evenShots);
        output.h(serialDesc, 9, a7aVar, self.evenGoals);
        output.h(serialDesc, 10, a7aVar, self.evenAssists);
        output.h(serialDesc, 11, a7aVar, self.evenPoints);
        output.h(serialDesc, 12, a7aVar, self.evenTimeOnIce);
        output.h(serialDesc, 13, h75Var, self.faceOffPercentage);
        output.h(serialDesc, 14, a7aVar, self.faceOffTaken);
        output.h(serialDesc, 15, a7aVar, self.faceOffWins);
        output.h(serialDesc, 16, a7aVar, self.gameWinningGoals);
        output.h(serialDesc, 17, a7aVar, self.gamesStarted);
        output.h(serialDesc, 18, a7aVar, self.goals);
        output.h(serialDesc, 19, a7aVar, self.goalsAgainst);
        output.h(serialDesc, 20, h75Var, self.goalsAgainstAverage);
        output.h(serialDesc, 21, a7aVar, self.hits);
        output.h(serialDesc, 22, a7aVar, self.overTimeGoals);
        output.h(serialDesc, 23, a7aVar, self.penaltyMinutes);
        output.h(serialDesc, 24, a7aVar, self.plusMinus);
        output.h(serialDesc, 25, a7aVar, self.points);
        output.h(serialDesc, 26, a7aVar, self.powerPlayGoals);
        output.h(serialDesc, 27, a7aVar, self.powerPlayPoints);
        output.h(serialDesc, 28, a7aVar, self.powerPlayAssists);
        output.h(serialDesc, 29, a7aVar, self.powerPlaySaves);
        output.h(serialDesc, 30, a7aVar, self.powerPlayShots);
        output.h(serialDesc, 31, a7aVar, self.powerPlayTimeOnIce);
        output.h(serialDesc, 32, h75Var, self.powerPlaySavePercentage);
        output.h(serialDesc, 33, h75Var, self.savePercentage);
        output.h(serialDesc, 34, a7aVar, self.saves);
        output.h(serialDesc, 35, a7aVar, self.shortHandedGoals);
        output.h(serialDesc, 36, a7aVar, self.shortHandedPoints);
        output.h(serialDesc, 37, a7aVar, self.shortHandedAssists);
        output.h(serialDesc, 38, a7aVar, self.shortHandedSaves);
        output.h(serialDesc, 39, a7aVar, self.shortHandedShots);
        output.h(serialDesc, 40, a7aVar, self.shortHandedTimeOnIce);
        output.h(serialDesc, 41, h75Var, self.shortHandedSavePercentage);
        output.h(serialDesc, 42, a7aVar, self.shots);
        output.h(serialDesc, 43, a7aVar, self.shotsAgainst);
        output.h(serialDesc, 44, h75Var, self.shotPercentage);
        output.h(serialDesc, 45, a7aVar, self.shutouts);
        output.h(serialDesc, 46, a7aVar, self.losses);
        output.h(serialDesc, 47, a7aVar, self.overTimeLosses);
        output.h(serialDesc, 48, a7aVar, self.shifts);
        output.h(serialDesc, 49, a7aVar, self.takeaways);
        output.h(serialDesc, 50, a7aVar, self.timeOnIce);
        output.h(serialDesc, 51, a7aVar, self.wins);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getEvenGoals() {
        return this.evenGoals;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getEvenAssists() {
        return this.evenAssists;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getEvenPoints() {
        return this.evenPoints;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getEvenTimeOnIce() {
        return this.evenTimeOnIce;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Double getFaceOffPercentage() {
        return this.faceOffPercentage;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getFaceOffTaken() {
        return this.faceOffTaken;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getFaceOffWins() {
        return this.faceOffWins;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getGameWinningGoals() {
        return this.gameWinningGoals;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getGamesStarted() {
        return this.gamesStarted;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getGoals() {
        return this.goals;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getGoalsAgainst() {
        return this.goalsAgainst;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Double getGoalsAgainstAverage() {
        return this.goalsAgainstAverage;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getHits() {
        return this.hits;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getOverTimeGoals() {
        return this.overTimeGoals;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getPenaltyMinutes() {
        return this.penaltyMinutes;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getPowerPlayGoals() {
        return this.powerPlayGoals;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getPowerPlayPoints() {
        return this.powerPlayPoints;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Integer getPowerPlayAssists() {
        return this.powerPlayAssists;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getPowerPlaySaves() {
        return this.powerPlaySaves;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getPowerPlayShots() {
        return this.powerPlayShots;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getPowerPlayTimeOnIce() {
        return this.powerPlayTimeOnIce;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Double getPowerPlaySavePercentage() {
        return this.powerPlaySavePercentage;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Double getSavePercentage() {
        return this.savePercentage;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Integer getSaves() {
        return this.saves;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final Integer getShortHandedGoals() {
        return this.shortHandedGoals;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final Integer getShortHandedPoints() {
        return this.shortHandedPoints;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final Integer getShortHandedAssists() {
        return this.shortHandedAssists;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final Integer getShortHandedSaves() {
        return this.shortHandedSaves;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component40, reason: from getter */
    public final Integer getShortHandedShots() {
        return this.shortHandedShots;
    }

    @Nullable
    /* renamed from: component41, reason: from getter */
    public final Integer getShortHandedTimeOnIce() {
        return this.shortHandedTimeOnIce;
    }

    @Nullable
    /* renamed from: component42, reason: from getter */
    public final Double getShortHandedSavePercentage() {
        return this.shortHandedSavePercentage;
    }

    @Nullable
    /* renamed from: component43, reason: from getter */
    public final Integer getShots() {
        return this.shots;
    }

    @Nullable
    /* renamed from: component44, reason: from getter */
    public final Integer getShotsAgainst() {
        return this.shotsAgainst;
    }

    @Nullable
    /* renamed from: component45, reason: from getter */
    public final Double getShotPercentage() {
        return this.shotPercentage;
    }

    @Nullable
    /* renamed from: component46, reason: from getter */
    public final Integer getShutouts() {
        return this.shutouts;
    }

    @Nullable
    /* renamed from: component47, reason: from getter */
    public final Integer getLosses() {
        return this.losses;
    }

    @Nullable
    /* renamed from: component48, reason: from getter */
    public final Integer getOverTimeLosses() {
        return this.overTimeLosses;
    }

    @Nullable
    /* renamed from: component49, reason: from getter */
    public final Integer getShifts() {
        return this.shifts;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component50, reason: from getter */
    public final Integer getTakeaways() {
        return this.takeaways;
    }

    @Nullable
    /* renamed from: component51, reason: from getter */
    public final Integer getTimeOnIce() {
        return this.timeOnIce;
    }

    @Nullable
    /* renamed from: component52, reason: from getter */
    public final Integer getWins() {
        return this.wins;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getBlocked() {
        return this.blocked;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getEvenSaves() {
        return this.evenSaves;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getEvenSavePercentage() {
        return this.evenSavePercentage;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getEvenShots() {
        return this.evenShots;
    }

    @NotNull
    public final IceHockeyPlayerSeasonStatistics copy(int id, @NotNull String type, @Nullable Integer appearances, @Nullable Double rating, @Nullable Integer assists, @Nullable Integer blocked, @Nullable Integer evenSaves, @Nullable Double evenSavePercentage, @Nullable Integer evenShots, @Nullable Integer evenGoals, @Nullable Integer evenAssists, @Nullable Integer evenPoints, @Nullable Integer evenTimeOnIce, @Nullable Double faceOffPercentage, @Nullable Integer faceOffTaken, @Nullable Integer faceOffWins, @Nullable Integer gameWinningGoals, @Nullable Integer gamesStarted, @Nullable Integer goals, @Nullable Integer goalsAgainst, @Nullable Double goalsAgainstAverage, @Nullable Integer hits, @Nullable Integer overTimeGoals, @Nullable Integer penaltyMinutes, @Nullable Integer plusMinus, @Nullable Integer points, @Nullable Integer powerPlayGoals, @Nullable Integer powerPlayPoints, @Nullable Integer powerPlayAssists, @Nullable Integer powerPlaySaves, @Nullable Integer powerPlayShots, @Nullable Integer powerPlayTimeOnIce, @Nullable Double powerPlaySavePercentage, @Nullable Double savePercentage, @Nullable Integer saves, @Nullable Integer shortHandedGoals, @Nullable Integer shortHandedPoints, @Nullable Integer shortHandedAssists, @Nullable Integer shortHandedSaves, @Nullable Integer shortHandedShots, @Nullable Integer shortHandedTimeOnIce, @Nullable Double shortHandedSavePercentage, @Nullable Integer shots, @Nullable Integer shotsAgainst, @Nullable Double shotPercentage, @Nullable Integer shutouts, @Nullable Integer losses, @Nullable Integer overTimeLosses, @Nullable Integer shifts, @Nullable Integer takeaways, @Nullable Integer timeOnIce, @Nullable Integer wins) {
        type.getClass();
        return new IceHockeyPlayerSeasonStatistics(id, type, appearances, rating, assists, blocked, evenSaves, evenSavePercentage, evenShots, evenGoals, evenAssists, evenPoints, evenTimeOnIce, faceOffPercentage, faceOffTaken, faceOffWins, gameWinningGoals, gamesStarted, goals, goalsAgainst, goalsAgainstAverage, hits, overTimeGoals, penaltyMinutes, plusMinus, points, powerPlayGoals, powerPlayPoints, powerPlayAssists, powerPlaySaves, powerPlayShots, powerPlayTimeOnIce, powerPlaySavePercentage, savePercentage, saves, shortHandedGoals, shortHandedPoints, shortHandedAssists, shortHandedSaves, shortHandedShots, shortHandedTimeOnIce, shortHandedSavePercentage, shots, shotsAgainst, shotPercentage, shutouts, losses, overTimeLosses, shifts, takeaways, timeOnIce, wins);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IceHockeyPlayerSeasonStatistics)) {
            return false;
        }
        IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics = (IceHockeyPlayerSeasonStatistics) other;
        return this.id == iceHockeyPlayerSeasonStatistics.id && Intrinsics.c(this.type, iceHockeyPlayerSeasonStatistics.type) && Intrinsics.c(this.appearances, iceHockeyPlayerSeasonStatistics.appearances) && Intrinsics.c(this.rating, iceHockeyPlayerSeasonStatistics.rating) && Intrinsics.c(this.assists, iceHockeyPlayerSeasonStatistics.assists) && Intrinsics.c(this.blocked, iceHockeyPlayerSeasonStatistics.blocked) && Intrinsics.c(this.evenSaves, iceHockeyPlayerSeasonStatistics.evenSaves) && Intrinsics.c(this.evenSavePercentage, iceHockeyPlayerSeasonStatistics.evenSavePercentage) && Intrinsics.c(this.evenShots, iceHockeyPlayerSeasonStatistics.evenShots) && Intrinsics.c(this.evenGoals, iceHockeyPlayerSeasonStatistics.evenGoals) && Intrinsics.c(this.evenAssists, iceHockeyPlayerSeasonStatistics.evenAssists) && Intrinsics.c(this.evenPoints, iceHockeyPlayerSeasonStatistics.evenPoints) && Intrinsics.c(this.evenTimeOnIce, iceHockeyPlayerSeasonStatistics.evenTimeOnIce) && Intrinsics.c(this.faceOffPercentage, iceHockeyPlayerSeasonStatistics.faceOffPercentage) && Intrinsics.c(this.faceOffTaken, iceHockeyPlayerSeasonStatistics.faceOffTaken) && Intrinsics.c(this.faceOffWins, iceHockeyPlayerSeasonStatistics.faceOffWins) && Intrinsics.c(this.gameWinningGoals, iceHockeyPlayerSeasonStatistics.gameWinningGoals) && Intrinsics.c(this.gamesStarted, iceHockeyPlayerSeasonStatistics.gamesStarted) && Intrinsics.c(this.goals, iceHockeyPlayerSeasonStatistics.goals) && Intrinsics.c(this.goalsAgainst, iceHockeyPlayerSeasonStatistics.goalsAgainst) && Intrinsics.c(this.goalsAgainstAverage, iceHockeyPlayerSeasonStatistics.goalsAgainstAverage) && Intrinsics.c(this.hits, iceHockeyPlayerSeasonStatistics.hits) && Intrinsics.c(this.overTimeGoals, iceHockeyPlayerSeasonStatistics.overTimeGoals) && Intrinsics.c(this.penaltyMinutes, iceHockeyPlayerSeasonStatistics.penaltyMinutes) && Intrinsics.c(this.plusMinus, iceHockeyPlayerSeasonStatistics.plusMinus) && Intrinsics.c(this.points, iceHockeyPlayerSeasonStatistics.points) && Intrinsics.c(this.powerPlayGoals, iceHockeyPlayerSeasonStatistics.powerPlayGoals) && Intrinsics.c(this.powerPlayPoints, iceHockeyPlayerSeasonStatistics.powerPlayPoints) && Intrinsics.c(this.powerPlayAssists, iceHockeyPlayerSeasonStatistics.powerPlayAssists) && Intrinsics.c(this.powerPlaySaves, iceHockeyPlayerSeasonStatistics.powerPlaySaves) && Intrinsics.c(this.powerPlayShots, iceHockeyPlayerSeasonStatistics.powerPlayShots) && Intrinsics.c(this.powerPlayTimeOnIce, iceHockeyPlayerSeasonStatistics.powerPlayTimeOnIce) && Intrinsics.c(this.powerPlaySavePercentage, iceHockeyPlayerSeasonStatistics.powerPlaySavePercentage) && Intrinsics.c(this.savePercentage, iceHockeyPlayerSeasonStatistics.savePercentage) && Intrinsics.c(this.saves, iceHockeyPlayerSeasonStatistics.saves) && Intrinsics.c(this.shortHandedGoals, iceHockeyPlayerSeasonStatistics.shortHandedGoals) && Intrinsics.c(this.shortHandedPoints, iceHockeyPlayerSeasonStatistics.shortHandedPoints) && Intrinsics.c(this.shortHandedAssists, iceHockeyPlayerSeasonStatistics.shortHandedAssists) && Intrinsics.c(this.shortHandedSaves, iceHockeyPlayerSeasonStatistics.shortHandedSaves) && Intrinsics.c(this.shortHandedShots, iceHockeyPlayerSeasonStatistics.shortHandedShots) && Intrinsics.c(this.shortHandedTimeOnIce, iceHockeyPlayerSeasonStatistics.shortHandedTimeOnIce) && Intrinsics.c(this.shortHandedSavePercentage, iceHockeyPlayerSeasonStatistics.shortHandedSavePercentage) && Intrinsics.c(this.shots, iceHockeyPlayerSeasonStatistics.shots) && Intrinsics.c(this.shotsAgainst, iceHockeyPlayerSeasonStatistics.shotsAgainst) && Intrinsics.c(this.shotPercentage, iceHockeyPlayerSeasonStatistics.shotPercentage) && Intrinsics.c(this.shutouts, iceHockeyPlayerSeasonStatistics.shutouts) && Intrinsics.c(this.losses, iceHockeyPlayerSeasonStatistics.losses) && Intrinsics.c(this.overTimeLosses, iceHockeyPlayerSeasonStatistics.overTimeLosses) && Intrinsics.c(this.shifts, iceHockeyPlayerSeasonStatistics.shifts) && Intrinsics.c(this.takeaways, iceHockeyPlayerSeasonStatistics.takeaways) && Intrinsics.c(this.timeOnIce, iceHockeyPlayerSeasonStatistics.timeOnIce) && Intrinsics.c(this.wins, iceHockeyPlayerSeasonStatistics.wins);
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
    public final Integer getBlocked() {
        return this.blocked;
    }

    @Nullable
    public final Integer getEvenAssists() {
        return this.evenAssists;
    }

    @Nullable
    public final Integer getEvenGoals() {
        return this.evenGoals;
    }

    @Nullable
    public final Integer getEvenPoints() {
        return this.evenPoints;
    }

    @Nullable
    public final Double getEvenSavePercentage() {
        return this.evenSavePercentage;
    }

    @Nullable
    public final Integer getEvenSaves() {
        return this.evenSaves;
    }

    @Nullable
    public final Integer getEvenShots() {
        return this.evenShots;
    }

    @Nullable
    public final Integer getEvenTimeOnIce() {
        return this.evenTimeOnIce;
    }

    @Nullable
    public final Double getFaceOffPercentage() {
        return this.faceOffPercentage;
    }

    @Nullable
    public final Integer getFaceOffTaken() {
        return this.faceOffTaken;
    }

    @Nullable
    public final Integer getFaceOffWins() {
        return this.faceOffWins;
    }

    @Nullable
    public final Integer getGameWinningGoals() {
        return this.gameWinningGoals;
    }

    @Nullable
    public final Integer getGamesStarted() {
        return this.gamesStarted;
    }

    @Nullable
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    public final Integer getGoalsAgainst() {
        return this.goalsAgainst;
    }

    @Nullable
    public final Double getGoalsAgainstAverage() {
        return this.goalsAgainstAverage;
    }

    @Nullable
    public final Integer getHits() {
        return this.hits;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getLosses() {
        return this.losses;
    }

    @Nullable
    public final Integer getOverTimeGoals() {
        return this.overTimeGoals;
    }

    @Nullable
    public final Integer getOverTimeLosses() {
        return this.overTimeLosses;
    }

    @Nullable
    public final Integer getPenaltyMinutes() {
        return this.penaltyMinutes;
    }

    @Nullable
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPowerPlayAssists() {
        return this.powerPlayAssists;
    }

    @Nullable
    public final Integer getPowerPlayGoals() {
        return this.powerPlayGoals;
    }

    @Nullable
    public final Integer getPowerPlayPoints() {
        return this.powerPlayPoints;
    }

    @Nullable
    public final Double getPowerPlaySavePercentage() {
        return this.powerPlaySavePercentage;
    }

    @Nullable
    public final Integer getPowerPlaySaves() {
        return this.powerPlaySaves;
    }

    @Nullable
    public final Integer getPowerPlayShots() {
        return this.powerPlayShots;
    }

    @Nullable
    public final Integer getPowerPlayTimeOnIce() {
        return this.powerPlayTimeOnIce;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Double getSavePercentage() {
        return this.savePercentage;
    }

    @Nullable
    public final Integer getSaves() {
        return this.saves;
    }

    @Nullable
    public final Integer getShifts() {
        return this.shifts;
    }

    @Nullable
    public final Integer getShortHandedAssists() {
        return this.shortHandedAssists;
    }

    @Nullable
    public final Integer getShortHandedGoals() {
        return this.shortHandedGoals;
    }

    @Nullable
    public final Integer getShortHandedPoints() {
        return this.shortHandedPoints;
    }

    @Nullable
    public final Double getShortHandedSavePercentage() {
        return this.shortHandedSavePercentage;
    }

    @Nullable
    public final Integer getShortHandedSaves() {
        return this.shortHandedSaves;
    }

    @Nullable
    public final Integer getShortHandedShots() {
        return this.shortHandedShots;
    }

    @Nullable
    public final Integer getShortHandedTimeOnIce() {
        return this.shortHandedTimeOnIce;
    }

    @Nullable
    public final Double getShotPercentage() {
        return this.shotPercentage;
    }

    @Nullable
    public final Integer getShots() {
        return this.shots;
    }

    @Nullable
    public final Integer getShotsAgainst() {
        return this.shotsAgainst;
    }

    @Nullable
    public final Integer getShutouts() {
        return this.shutouts;
    }

    @Nullable
    public final Integer getTakeaways() {
        return this.takeaways;
    }

    @Nullable
    public final Integer getTimeOnIce() {
        return this.timeOnIce;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @NotNull
    public String getType() {
        return this.type;
    }

    @Nullable
    public final Integer getWins() {
        return this.wins;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.type);
        Integer num = this.appearances;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.rating;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.assists;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.blocked;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.evenSaves;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d2 = this.evenSavePercentage;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num5 = this.evenShots;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.evenGoals;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.evenAssists;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.evenPoints;
        int hashCode10 = (hashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.evenTimeOnIce;
        int hashCode11 = (hashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Double d3 = this.faceOffPercentage;
        int hashCode12 = (hashCode11 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num10 = this.faceOffTaken;
        int hashCode13 = (hashCode12 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.faceOffWins;
        int hashCode14 = (hashCode13 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.gameWinningGoals;
        int hashCode15 = (hashCode14 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.gamesStarted;
        int hashCode16 = (hashCode15 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.goals;
        int hashCode17 = (hashCode16 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.goalsAgainst;
        int hashCode18 = (hashCode17 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Double d4 = this.goalsAgainstAverage;
        int hashCode19 = (hashCode18 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num16 = this.hits;
        int hashCode20 = (hashCode19 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.overTimeGoals;
        int hashCode21 = (hashCode20 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.penaltyMinutes;
        int hashCode22 = (hashCode21 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.plusMinus;
        int hashCode23 = (hashCode22 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.points;
        int hashCode24 = (hashCode23 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.powerPlayGoals;
        int hashCode25 = (hashCode24 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.powerPlayPoints;
        int hashCode26 = (hashCode25 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.powerPlayAssists;
        int hashCode27 = (hashCode26 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.powerPlaySaves;
        int hashCode28 = (hashCode27 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.powerPlayShots;
        int hashCode29 = (hashCode28 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.powerPlayTimeOnIce;
        int hashCode30 = (hashCode29 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Double d5 = this.powerPlaySavePercentage;
        int hashCode31 = (hashCode30 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.savePercentage;
        int hashCode32 = (hashCode31 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num27 = this.saves;
        int hashCode33 = (hashCode32 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Integer num28 = this.shortHandedGoals;
        int hashCode34 = (hashCode33 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Integer num29 = this.shortHandedPoints;
        int hashCode35 = (hashCode34 + (num29 == null ? 0 : num29.hashCode())) * 31;
        Integer num30 = this.shortHandedAssists;
        int hashCode36 = (hashCode35 + (num30 == null ? 0 : num30.hashCode())) * 31;
        Integer num31 = this.shortHandedSaves;
        int hashCode37 = (hashCode36 + (num31 == null ? 0 : num31.hashCode())) * 31;
        Integer num32 = this.shortHandedShots;
        int hashCode38 = (hashCode37 + (num32 == null ? 0 : num32.hashCode())) * 31;
        Integer num33 = this.shortHandedTimeOnIce;
        int hashCode39 = (hashCode38 + (num33 == null ? 0 : num33.hashCode())) * 31;
        Double d7 = this.shortHandedSavePercentage;
        int hashCode40 = (hashCode39 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num34 = this.shots;
        int hashCode41 = (hashCode40 + (num34 == null ? 0 : num34.hashCode())) * 31;
        Integer num35 = this.shotsAgainst;
        int hashCode42 = (hashCode41 + (num35 == null ? 0 : num35.hashCode())) * 31;
        Double d8 = this.shotPercentage;
        int hashCode43 = (hashCode42 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Integer num36 = this.shutouts;
        int hashCode44 = (hashCode43 + (num36 == null ? 0 : num36.hashCode())) * 31;
        Integer num37 = this.losses;
        int hashCode45 = (hashCode44 + (num37 == null ? 0 : num37.hashCode())) * 31;
        Integer num38 = this.overTimeLosses;
        int hashCode46 = (hashCode45 + (num38 == null ? 0 : num38.hashCode())) * 31;
        Integer num39 = this.shifts;
        int hashCode47 = (hashCode46 + (num39 == null ? 0 : num39.hashCode())) * 31;
        Integer num40 = this.takeaways;
        int hashCode48 = (hashCode47 + (num40 == null ? 0 : num40.hashCode())) * 31;
        Integer num41 = this.timeOnIce;
        int hashCode49 = (hashCode48 + (num41 == null ? 0 : num41.hashCode())) * 31;
        Integer num42 = this.wins;
        return hashCode49 + (num42 != null ? num42.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        Integer num = this.appearances;
        Double d = this.rating;
        Integer num2 = this.assists;
        Integer num3 = this.blocked;
        Integer num4 = this.evenSaves;
        Double d2 = this.evenSavePercentage;
        Integer num5 = this.evenShots;
        Integer num6 = this.evenGoals;
        Integer num7 = this.evenAssists;
        Integer num8 = this.evenPoints;
        Integer num9 = this.evenTimeOnIce;
        Double d3 = this.faceOffPercentage;
        Integer num10 = this.faceOffTaken;
        Integer num11 = this.faceOffWins;
        Integer num12 = this.gameWinningGoals;
        Integer num13 = this.gamesStarted;
        Integer num14 = this.goals;
        Integer num15 = this.goalsAgainst;
        Double d4 = this.goalsAgainstAverage;
        Integer num16 = this.hits;
        Integer num17 = this.overTimeGoals;
        Integer num18 = this.penaltyMinutes;
        Integer num19 = this.plusMinus;
        Integer num20 = this.points;
        Integer num21 = this.powerPlayGoals;
        Integer num22 = this.powerPlayPoints;
        Integer num23 = this.powerPlayAssists;
        Integer num24 = this.powerPlaySaves;
        Integer num25 = this.powerPlayShots;
        Integer num26 = this.powerPlayTimeOnIce;
        Double d5 = this.powerPlaySavePercentage;
        Double d6 = this.savePercentage;
        Integer num27 = this.saves;
        Integer num28 = this.shortHandedGoals;
        Integer num29 = this.shortHandedPoints;
        Integer num30 = this.shortHandedAssists;
        Integer num31 = this.shortHandedSaves;
        Integer num32 = this.shortHandedShots;
        Integer num33 = this.shortHandedTimeOnIce;
        Double d7 = this.shortHandedSavePercentage;
        Integer num34 = this.shots;
        Integer num35 = this.shotsAgainst;
        Double d8 = this.shotPercentage;
        Integer num36 = this.shutouts;
        Integer num37 = this.losses;
        Integer num38 = this.overTimeLosses;
        Integer num39 = this.shifts;
        Integer num40 = this.takeaways;
        Integer num41 = this.timeOnIce;
        Integer num42 = this.wins;
        StringBuilder t = dmi.t(i, "IceHockeyPlayerSeasonStatistics(id=", ", type=", str, ", appearances=");
        fn0.v(d, num, ", rating=", ", assists=", t);
        vxd.r(num2, num3, ", blocked=", ", evenSaves=", t);
        fn0.v(d2, num4, ", evenSavePercentage=", ", evenShots=", t);
        vxd.r(num5, num6, ", evenGoals=", ", evenAssists=", t);
        vxd.r(num7, num8, ", evenPoints=", ", evenTimeOnIce=", t);
        fn0.v(d3, num9, ", faceOffPercentage=", ", faceOffTaken=", t);
        vxd.r(num10, num11, ", faceOffWins=", ", gameWinningGoals=", t);
        vxd.r(num12, num13, ", gamesStarted=", ", goals=", t);
        vxd.r(num14, num15, ", goalsAgainst=", ", goalsAgainstAverage=", t);
        mz1.x(d4, num16, ", hits=", ", overTimeGoals=", t);
        vxd.r(num17, num18, ", penaltyMinutes=", ", plusMinus=", t);
        vxd.r(num19, num20, ", points=", ", powerPlayGoals=", t);
        vxd.r(num21, num22, ", powerPlayPoints=", ", powerPlayAssists=", t);
        vxd.r(num23, num24, ", powerPlaySaves=", ", powerPlayShots=", t);
        vxd.r(num25, num26, ", powerPlayTimeOnIce=", ", powerPlaySavePercentage=", t);
        fc6.A(t, d5, ", savePercentage=", d6, ", saves=");
        vxd.r(num27, num28, ", shortHandedGoals=", ", shortHandedPoints=", t);
        vxd.r(num29, num30, ", shortHandedAssists=", ", shortHandedSaves=", t);
        vxd.r(num31, num32, ", shortHandedShots=", ", shortHandedTimeOnIce=", t);
        fn0.v(d7, num33, ", shortHandedSavePercentage=", ", shots=", t);
        vxd.r(num34, num35, ", shotsAgainst=", ", shotPercentage=", t);
        mz1.x(d8, num36, ", shutouts=", ", losses=", t);
        vxd.r(num37, num38, ", overTimeLosses=", ", shifts=", t);
        vxd.r(num39, num40, ", takeaways=", ", timeOnIce=", t);
        return fc6.l(num41, num42, ", wins=", ")", t);
    }

    public IceHockeyPlayerSeasonStatistics(int i, @NotNull String str, @Nullable Integer num, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Double d2, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Double d3, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Double d4, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24, @Nullable Integer num25, @Nullable Integer num26, @Nullable Double d5, @Nullable Double d6, @Nullable Integer num27, @Nullable Integer num28, @Nullable Integer num29, @Nullable Integer num30, @Nullable Integer num31, @Nullable Integer num32, @Nullable Integer num33, @Nullable Double d7, @Nullable Integer num34, @Nullable Integer num35, @Nullable Double d8, @Nullable Integer num36, @Nullable Integer num37, @Nullable Integer num38, @Nullable Integer num39, @Nullable Integer num40, @Nullable Integer num41, @Nullable Integer num42) {
        str.getClass();
        this.id = i;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.assists = num2;
        this.blocked = num3;
        this.evenSaves = num4;
        this.evenSavePercentage = d2;
        this.evenShots = num5;
        this.evenGoals = num6;
        this.evenAssists = num7;
        this.evenPoints = num8;
        this.evenTimeOnIce = num9;
        this.faceOffPercentage = d3;
        this.faceOffTaken = num10;
        this.faceOffWins = num11;
        this.gameWinningGoals = num12;
        this.gamesStarted = num13;
        this.goals = num14;
        this.goalsAgainst = num15;
        this.goalsAgainstAverage = d4;
        this.hits = num16;
        this.overTimeGoals = num17;
        this.penaltyMinutes = num18;
        this.plusMinus = num19;
        this.points = num20;
        this.powerPlayGoals = num21;
        this.powerPlayPoints = num22;
        this.powerPlayAssists = num23;
        this.powerPlaySaves = num24;
        this.powerPlayShots = num25;
        this.powerPlayTimeOnIce = num26;
        this.powerPlaySavePercentage = d5;
        this.savePercentage = d6;
        this.saves = num27;
        this.shortHandedGoals = num28;
        this.shortHandedPoints = num29;
        this.shortHandedAssists = num30;
        this.shortHandedSaves = num31;
        this.shortHandedShots = num32;
        this.shortHandedTimeOnIce = num33;
        this.shortHandedSavePercentage = d7;
        this.shots = num34;
        this.shotsAgainst = num35;
        this.shotPercentage = d8;
        this.shutouts = num36;
        this.losses = num37;
        this.overTimeLosses = num38;
        this.shifts = num39;
        this.takeaways = num40;
        this.timeOnIce = num41;
        this.wins = num42;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/IceHockeyPlayerSeasonStatistics$Companion;", "", "<init>", "()V", "aggregate", "Lcom/sofascore/model/newNetwork/statistics/season/player/IceHockeyPlayerSeasonStatistics;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IceHockeyPlayerSeasonStatistics aggregate(@NotNull List<IceHockeyPlayerSeasonStatistics> statistics) {
            statistics.getClass();
            int id = ((IceHockeyPlayerSeasonStatistics) CollectionsKt.Y(statistics)).getId();
            String type = ((IceHockeyPlayerSeasonStatistics) CollectionsKt.Y(statistics)).getType();
            AbstractPlayerSeasonStatistics.Companion companion = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = statistics.iterator();
            while (it.hasNext()) {
                Integer appearances = ((IceHockeyPlayerSeasonStatistics) it.next()).getAppearances();
                if (appearances != null) {
                    arrayList.add(appearances);
                }
            }
            Integer m690nullableSum = companion.m690nullableSum((List<Integer>) arrayList);
            AbstractPlayerSeasonStatistics.Companion companion2 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = statistics.iterator();
            while (it2.hasNext()) {
                Integer assists = ((IceHockeyPlayerSeasonStatistics) it2.next()).getAssists();
                if (assists != null) {
                    arrayList2.add(assists);
                }
            }
            Integer m690nullableSum2 = companion2.m690nullableSum((List<Integer>) arrayList2);
            AbstractPlayerSeasonStatistics.Companion companion3 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = statistics.iterator();
            while (it3.hasNext()) {
                Integer blocked = ((IceHockeyPlayerSeasonStatistics) it3.next()).getBlocked();
                if (blocked != null) {
                    arrayList3.add(blocked);
                }
            }
            Integer m690nullableSum3 = companion3.m690nullableSum((List<Integer>) arrayList3);
            AbstractPlayerSeasonStatistics.Companion companion4 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it4 = statistics.iterator();
            while (it4.hasNext()) {
                Integer evenSaves = ((IceHockeyPlayerSeasonStatistics) it4.next()).getEvenSaves();
                if (evenSaves != null) {
                    arrayList4.add(evenSaves);
                }
            }
            Integer m690nullableSum4 = companion4.m690nullableSum((List<Integer>) arrayList4);
            AbstractPlayerSeasonStatistics.Companion companion5 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it5 = statistics.iterator();
            while (it5.hasNext()) {
                Integer evenShots = ((IceHockeyPlayerSeasonStatistics) it5.next()).getEvenShots();
                if (evenShots != null) {
                    arrayList5.add(evenShots);
                }
            }
            Integer m690nullableSum5 = companion5.m690nullableSum((List<Integer>) arrayList5);
            AbstractPlayerSeasonStatistics.Companion companion6 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList6 = new ArrayList();
            Iterator<T> it6 = statistics.iterator();
            while (it6.hasNext()) {
                Integer evenGoals = ((IceHockeyPlayerSeasonStatistics) it6.next()).getEvenGoals();
                if (evenGoals != null) {
                    arrayList6.add(evenGoals);
                }
            }
            Integer m690nullableSum6 = companion6.m690nullableSum((List<Integer>) arrayList6);
            AbstractPlayerSeasonStatistics.Companion companion7 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList7 = new ArrayList();
            Iterator<T> it7 = statistics.iterator();
            while (it7.hasNext()) {
                Integer evenAssists = ((IceHockeyPlayerSeasonStatistics) it7.next()).getEvenAssists();
                if (evenAssists != null) {
                    arrayList7.add(evenAssists);
                }
            }
            Integer m690nullableSum7 = companion7.m690nullableSum((List<Integer>) arrayList7);
            AbstractPlayerSeasonStatistics.Companion companion8 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList8 = new ArrayList();
            Iterator<T> it8 = statistics.iterator();
            while (it8.hasNext()) {
                Integer evenPoints = ((IceHockeyPlayerSeasonStatistics) it8.next()).getEvenPoints();
                if (evenPoints != null) {
                    arrayList8.add(evenPoints);
                }
            }
            Integer m690nullableSum8 = companion8.m690nullableSum((List<Integer>) arrayList8);
            AbstractPlayerSeasonStatistics.Companion companion9 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList9 = new ArrayList();
            Iterator<T> it9 = statistics.iterator();
            while (it9.hasNext()) {
                Integer evenTimeOnIce = ((IceHockeyPlayerSeasonStatistics) it9.next()).getEvenTimeOnIce();
                if (evenTimeOnIce != null) {
                    arrayList9.add(evenTimeOnIce);
                }
            }
            Integer m690nullableSum9 = companion9.m690nullableSum((List<Integer>) arrayList9);
            AbstractPlayerSeasonStatistics.Companion companion10 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList10 = new ArrayList();
            Iterator<T> it10 = statistics.iterator();
            while (it10.hasNext()) {
                Integer faceOffTaken = ((IceHockeyPlayerSeasonStatistics) it10.next()).getFaceOffTaken();
                if (faceOffTaken != null) {
                    arrayList10.add(faceOffTaken);
                }
            }
            Integer m690nullableSum10 = companion10.m690nullableSum((List<Integer>) arrayList10);
            AbstractPlayerSeasonStatistics.Companion companion11 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList11 = new ArrayList();
            Iterator<T> it11 = statistics.iterator();
            while (it11.hasNext()) {
                Integer faceOffWins = ((IceHockeyPlayerSeasonStatistics) it11.next()).getFaceOffWins();
                if (faceOffWins != null) {
                    arrayList11.add(faceOffWins);
                }
            }
            Integer m690nullableSum11 = companion11.m690nullableSum((List<Integer>) arrayList11);
            AbstractPlayerSeasonStatistics.Companion companion12 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList12 = new ArrayList();
            Iterator<T> it12 = statistics.iterator();
            while (it12.hasNext()) {
                Integer gameWinningGoals = ((IceHockeyPlayerSeasonStatistics) it12.next()).getGameWinningGoals();
                if (gameWinningGoals != null) {
                    arrayList12.add(gameWinningGoals);
                }
            }
            Integer m690nullableSum12 = companion12.m690nullableSum((List<Integer>) arrayList12);
            AbstractPlayerSeasonStatistics.Companion companion13 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList13 = new ArrayList();
            Iterator<T> it13 = statistics.iterator();
            while (it13.hasNext()) {
                Integer gamesStarted = ((IceHockeyPlayerSeasonStatistics) it13.next()).getGamesStarted();
                if (gamesStarted != null) {
                    arrayList13.add(gamesStarted);
                }
            }
            Integer m690nullableSum13 = companion13.m690nullableSum((List<Integer>) arrayList13);
            AbstractPlayerSeasonStatistics.Companion companion14 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList14 = new ArrayList();
            Iterator<T> it14 = statistics.iterator();
            while (it14.hasNext()) {
                Integer goals = ((IceHockeyPlayerSeasonStatistics) it14.next()).getGoals();
                if (goals != null) {
                    arrayList14.add(goals);
                }
            }
            Integer m690nullableSum14 = companion14.m690nullableSum((List<Integer>) arrayList14);
            AbstractPlayerSeasonStatistics.Companion companion15 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList15 = new ArrayList();
            Iterator<T> it15 = statistics.iterator();
            while (it15.hasNext()) {
                Integer goalsAgainst = ((IceHockeyPlayerSeasonStatistics) it15.next()).getGoalsAgainst();
                if (goalsAgainst != null) {
                    arrayList15.add(goalsAgainst);
                }
            }
            Integer m690nullableSum15 = companion15.m690nullableSum((List<Integer>) arrayList15);
            AbstractPlayerSeasonStatistics.Companion companion16 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList16 = new ArrayList();
            Iterator<T> it16 = statistics.iterator();
            while (it16.hasNext()) {
                Integer hits = ((IceHockeyPlayerSeasonStatistics) it16.next()).getHits();
                if (hits != null) {
                    arrayList16.add(hits);
                }
            }
            Integer m690nullableSum16 = companion16.m690nullableSum((List<Integer>) arrayList16);
            AbstractPlayerSeasonStatistics.Companion companion17 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList17 = new ArrayList();
            Iterator<T> it17 = statistics.iterator();
            while (it17.hasNext()) {
                Integer overTimeGoals = ((IceHockeyPlayerSeasonStatistics) it17.next()).getOverTimeGoals();
                if (overTimeGoals != null) {
                    arrayList17.add(overTimeGoals);
                }
            }
            Integer m690nullableSum17 = companion17.m690nullableSum((List<Integer>) arrayList17);
            AbstractPlayerSeasonStatistics.Companion companion18 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList18 = new ArrayList();
            Iterator<T> it18 = statistics.iterator();
            while (it18.hasNext()) {
                Integer penaltyMinutes = ((IceHockeyPlayerSeasonStatistics) it18.next()).getPenaltyMinutes();
                if (penaltyMinutes != null) {
                    arrayList18.add(penaltyMinutes);
                }
            }
            Integer m690nullableSum18 = companion18.m690nullableSum((List<Integer>) arrayList18);
            AbstractPlayerSeasonStatistics.Companion companion19 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList19 = new ArrayList();
            Iterator<T> it19 = statistics.iterator();
            while (it19.hasNext()) {
                Integer plusMinus = ((IceHockeyPlayerSeasonStatistics) it19.next()).getPlusMinus();
                if (plusMinus != null) {
                    arrayList19.add(plusMinus);
                }
            }
            Integer m690nullableSum19 = companion19.m690nullableSum((List<Integer>) arrayList19);
            AbstractPlayerSeasonStatistics.Companion companion20 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList20 = new ArrayList();
            Iterator<T> it20 = statistics.iterator();
            while (it20.hasNext()) {
                Integer points = ((IceHockeyPlayerSeasonStatistics) it20.next()).getPoints();
                if (points != null) {
                    arrayList20.add(points);
                }
            }
            Integer m690nullableSum20 = companion20.m690nullableSum((List<Integer>) arrayList20);
            AbstractPlayerSeasonStatistics.Companion companion21 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList21 = new ArrayList();
            Iterator<T> it21 = statistics.iterator();
            while (it21.hasNext()) {
                Integer powerPlayGoals = ((IceHockeyPlayerSeasonStatistics) it21.next()).getPowerPlayGoals();
                if (powerPlayGoals != null) {
                    arrayList21.add(powerPlayGoals);
                }
            }
            Integer m690nullableSum21 = companion21.m690nullableSum((List<Integer>) arrayList21);
            AbstractPlayerSeasonStatistics.Companion companion22 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList22 = new ArrayList();
            Iterator<T> it22 = statistics.iterator();
            while (it22.hasNext()) {
                Integer powerPlayPoints = ((IceHockeyPlayerSeasonStatistics) it22.next()).getPowerPlayPoints();
                if (powerPlayPoints != null) {
                    arrayList22.add(powerPlayPoints);
                }
            }
            Integer m690nullableSum22 = companion22.m690nullableSum((List<Integer>) arrayList22);
            AbstractPlayerSeasonStatistics.Companion companion23 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList23 = new ArrayList();
            Iterator<T> it23 = statistics.iterator();
            while (it23.hasNext()) {
                Integer powerPlayAssists = ((IceHockeyPlayerSeasonStatistics) it23.next()).getPowerPlayAssists();
                if (powerPlayAssists != null) {
                    arrayList23.add(powerPlayAssists);
                }
            }
            Integer m690nullableSum23 = companion23.m690nullableSum((List<Integer>) arrayList23);
            AbstractPlayerSeasonStatistics.Companion companion24 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList24 = new ArrayList();
            Iterator<T> it24 = statistics.iterator();
            while (it24.hasNext()) {
                Integer powerPlaySaves = ((IceHockeyPlayerSeasonStatistics) it24.next()).getPowerPlaySaves();
                if (powerPlaySaves != null) {
                    arrayList24.add(powerPlaySaves);
                }
            }
            Integer m690nullableSum24 = companion24.m690nullableSum((List<Integer>) arrayList24);
            AbstractPlayerSeasonStatistics.Companion companion25 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList25 = new ArrayList();
            Iterator<T> it25 = statistics.iterator();
            while (it25.hasNext()) {
                Integer powerPlayShots = ((IceHockeyPlayerSeasonStatistics) it25.next()).getPowerPlayShots();
                if (powerPlayShots != null) {
                    arrayList25.add(powerPlayShots);
                }
            }
            Integer m690nullableSum25 = companion25.m690nullableSum((List<Integer>) arrayList25);
            AbstractPlayerSeasonStatistics.Companion companion26 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList26 = new ArrayList();
            Iterator<T> it26 = statistics.iterator();
            while (it26.hasNext()) {
                Integer powerPlayTimeOnIce = ((IceHockeyPlayerSeasonStatistics) it26.next()).getPowerPlayTimeOnIce();
                if (powerPlayTimeOnIce != null) {
                    arrayList26.add(powerPlayTimeOnIce);
                }
            }
            Integer m690nullableSum26 = companion26.m690nullableSum((List<Integer>) arrayList26);
            AbstractPlayerSeasonStatistics.Companion companion27 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList27 = new ArrayList();
            Iterator<T> it27 = statistics.iterator();
            while (it27.hasNext()) {
                Integer saves = ((IceHockeyPlayerSeasonStatistics) it27.next()).getSaves();
                if (saves != null) {
                    arrayList27.add(saves);
                }
            }
            Integer m690nullableSum27 = companion27.m690nullableSum((List<Integer>) arrayList27);
            AbstractPlayerSeasonStatistics.Companion companion28 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList28 = new ArrayList();
            Iterator<T> it28 = statistics.iterator();
            while (it28.hasNext()) {
                Integer shortHandedGoals = ((IceHockeyPlayerSeasonStatistics) it28.next()).getShortHandedGoals();
                if (shortHandedGoals != null) {
                    arrayList28.add(shortHandedGoals);
                }
            }
            Integer m690nullableSum28 = companion28.m690nullableSum((List<Integer>) arrayList28);
            AbstractPlayerSeasonStatistics.Companion companion29 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList29 = new ArrayList();
            Iterator<T> it29 = statistics.iterator();
            while (it29.hasNext()) {
                Integer shortHandedPoints = ((IceHockeyPlayerSeasonStatistics) it29.next()).getShortHandedPoints();
                if (shortHandedPoints != null) {
                    arrayList29.add(shortHandedPoints);
                }
            }
            Integer m690nullableSum29 = companion29.m690nullableSum((List<Integer>) arrayList29);
            AbstractPlayerSeasonStatistics.Companion companion30 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList30 = new ArrayList();
            Iterator<T> it30 = statistics.iterator();
            while (it30.hasNext()) {
                Integer shortHandedAssists = ((IceHockeyPlayerSeasonStatistics) it30.next()).getShortHandedAssists();
                if (shortHandedAssists != null) {
                    arrayList30.add(shortHandedAssists);
                }
            }
            Integer m690nullableSum30 = companion30.m690nullableSum((List<Integer>) arrayList30);
            AbstractPlayerSeasonStatistics.Companion companion31 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList31 = new ArrayList();
            Iterator<T> it31 = statistics.iterator();
            while (it31.hasNext()) {
                Integer shortHandedSaves = ((IceHockeyPlayerSeasonStatistics) it31.next()).getShortHandedSaves();
                if (shortHandedSaves != null) {
                    arrayList31.add(shortHandedSaves);
                }
            }
            Integer m690nullableSum31 = companion31.m690nullableSum((List<Integer>) arrayList31);
            AbstractPlayerSeasonStatistics.Companion companion32 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList32 = new ArrayList();
            Iterator<T> it32 = statistics.iterator();
            while (it32.hasNext()) {
                Integer shortHandedShots = ((IceHockeyPlayerSeasonStatistics) it32.next()).getShortHandedShots();
                if (shortHandedShots != null) {
                    arrayList32.add(shortHandedShots);
                }
            }
            Integer m690nullableSum32 = companion32.m690nullableSum((List<Integer>) arrayList32);
            AbstractPlayerSeasonStatistics.Companion companion33 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList33 = new ArrayList();
            Iterator<T> it33 = statistics.iterator();
            while (it33.hasNext()) {
                Integer shortHandedTimeOnIce = ((IceHockeyPlayerSeasonStatistics) it33.next()).getShortHandedTimeOnIce();
                if (shortHandedTimeOnIce != null) {
                    arrayList33.add(shortHandedTimeOnIce);
                }
            }
            Integer m690nullableSum33 = companion33.m690nullableSum((List<Integer>) arrayList33);
            AbstractPlayerSeasonStatistics.Companion companion34 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList34 = new ArrayList();
            Iterator<T> it34 = statistics.iterator();
            while (it34.hasNext()) {
                Integer shots = ((IceHockeyPlayerSeasonStatistics) it34.next()).getShots();
                if (shots != null) {
                    arrayList34.add(shots);
                }
            }
            Integer m690nullableSum34 = companion34.m690nullableSum((List<Integer>) arrayList34);
            AbstractPlayerSeasonStatistics.Companion companion35 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList35 = new ArrayList();
            Iterator<T> it35 = statistics.iterator();
            while (it35.hasNext()) {
                Integer shotsAgainst = ((IceHockeyPlayerSeasonStatistics) it35.next()).getShotsAgainst();
                if (shotsAgainst != null) {
                    arrayList35.add(shotsAgainst);
                }
            }
            Integer m690nullableSum35 = companion35.m690nullableSum((List<Integer>) arrayList35);
            AbstractPlayerSeasonStatistics.Companion companion36 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList36 = new ArrayList();
            Iterator<T> it36 = statistics.iterator();
            while (it36.hasNext()) {
                Integer shutouts = ((IceHockeyPlayerSeasonStatistics) it36.next()).getShutouts();
                if (shutouts != null) {
                    arrayList36.add(shutouts);
                }
            }
            Integer m690nullableSum36 = companion36.m690nullableSum((List<Integer>) arrayList36);
            AbstractPlayerSeasonStatistics.Companion companion37 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList37 = new ArrayList();
            Iterator<T> it37 = statistics.iterator();
            while (it37.hasNext()) {
                Integer losses = ((IceHockeyPlayerSeasonStatistics) it37.next()).getLosses();
                if (losses != null) {
                    arrayList37.add(losses);
                }
            }
            Integer m690nullableSum37 = companion37.m690nullableSum((List<Integer>) arrayList37);
            AbstractPlayerSeasonStatistics.Companion companion38 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList38 = new ArrayList();
            Iterator<T> it38 = statistics.iterator();
            while (it38.hasNext()) {
                Integer overTimeLosses = ((IceHockeyPlayerSeasonStatistics) it38.next()).getOverTimeLosses();
                if (overTimeLosses != null) {
                    arrayList38.add(overTimeLosses);
                }
            }
            Integer m690nullableSum38 = companion38.m690nullableSum((List<Integer>) arrayList38);
            AbstractPlayerSeasonStatistics.Companion companion39 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList39 = new ArrayList();
            Iterator<T> it39 = statistics.iterator();
            while (it39.hasNext()) {
                Integer shifts = ((IceHockeyPlayerSeasonStatistics) it39.next()).getShifts();
                if (shifts != null) {
                    arrayList39.add(shifts);
                }
            }
            Integer m690nullableSum39 = companion39.m690nullableSum((List<Integer>) arrayList39);
            AbstractPlayerSeasonStatistics.Companion companion40 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList40 = new ArrayList();
            Iterator<T> it40 = statistics.iterator();
            while (it40.hasNext()) {
                Integer takeaways = ((IceHockeyPlayerSeasonStatistics) it40.next()).getTakeaways();
                if (takeaways != null) {
                    arrayList40.add(takeaways);
                }
            }
            Integer m690nullableSum40 = companion40.m690nullableSum((List<Integer>) arrayList40);
            AbstractPlayerSeasonStatistics.Companion companion41 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList41 = new ArrayList();
            Iterator<T> it41 = statistics.iterator();
            while (it41.hasNext()) {
                Integer timeOnIce = ((IceHockeyPlayerSeasonStatistics) it41.next()).getTimeOnIce();
                if (timeOnIce != null) {
                    arrayList41.add(timeOnIce);
                }
            }
            Integer m690nullableSum41 = companion41.m690nullableSum((List<Integer>) arrayList41);
            AbstractPlayerSeasonStatistics.Companion companion42 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList42 = new ArrayList();
            Iterator<T> it42 = statistics.iterator();
            while (it42.hasNext()) {
                Integer wins = ((IceHockeyPlayerSeasonStatistics) it42.next()).getWins();
                if (wins != null) {
                    arrayList42.add(wins);
                }
            }
            return new IceHockeyPlayerSeasonStatistics(id, type, m690nullableSum, null, m690nullableSum2, m690nullableSum3, m690nullableSum4, null, m690nullableSum5, m690nullableSum6, m690nullableSum7, m690nullableSum8, m690nullableSum9, null, m690nullableSum10, m690nullableSum11, m690nullableSum12, m690nullableSum13, m690nullableSum14, m690nullableSum15, null, m690nullableSum16, m690nullableSum17, m690nullableSum18, m690nullableSum19, m690nullableSum20, m690nullableSum21, m690nullableSum22, m690nullableSum23, m690nullableSum24, m690nullableSum25, m690nullableSum26, null, null, m690nullableSum27, m690nullableSum28, m690nullableSum29, m690nullableSum30, m690nullableSum31, m690nullableSum32, m690nullableSum33, null, m690nullableSum34, m690nullableSum35, null, m690nullableSum36, m690nullableSum37, m690nullableSum38, m690nullableSum39, m690nullableSum40, m690nullableSum41, companion42.m690nullableSum((List<Integer>) arrayList42));
        }

        @NotNull
        public final KSerializer serializer() {
            return IceHockeyPlayerSeasonStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
