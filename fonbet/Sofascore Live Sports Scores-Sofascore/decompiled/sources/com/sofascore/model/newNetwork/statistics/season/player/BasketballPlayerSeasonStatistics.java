package com.sofascore.model.newNetwork.statistics.season.player;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.vungle.ads.internal.protos.Sdk;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b1\b\u0087\b\u0018\u0000 \u009c\u00012\u00020\u00012\u00020\u0002:\u0004\u009c\u0001\u009d\u0001B\u0089\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010(\u001a\u0004\u0018\u00010\b\u0012\b\u0010)\u001a\u0004\u0018\u00010\b\u0012\b\u0010*\u001a\u0004\u0018\u00010\b\u0012\b\u0010+\u001a\u0004\u0018\u00010\b\u0012\b\u0010,\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b-\u0010.B§\u0003\b\u0010\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010(\u001a\u0004\u0018\u00010\b\u0012\b\u0010)\u001a\u0004\u0018\u00010\b\u0012\b\u0010*\u001a\u0004\u0018\u00010\b\u0012\b\u0010+\u001a\u0004\u0018\u00010\b\u0012\b\u0010,\u001a\u0004\u0018\u00010\b\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b-\u00103J\u0010\u00104\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b<\u0010;J\u0012\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b=\u00109J\u0012\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b>\u00109J\u0012\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b?\u00109J\u0012\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b@\u00109J\u0012\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bA\u00109J\u0012\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bB\u00109J\u0012\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bC\u00109J\u0012\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bD\u00109J\u0012\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bE\u00109J\u0012\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bF\u00109J\u0012\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bG\u00109J\u0012\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bH\u00109J\u0012\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bI\u00109J\u0012\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bJ\u00109J\u0012\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bK\u00109J\u0012\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bL\u00109J\u0012\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bM\u00109J\u0012\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bN\u00109J\u0012\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bO\u00109J\u0012\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bP\u00109J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bQ\u00109J\u0012\u0010R\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bR\u0010;J\u0012\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bS\u0010;J\u0012\u0010T\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bT\u0010;J\u0012\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bU\u0010;J\u0012\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bV\u00109J\u0012\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bW\u00109J\u0012\u0010X\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bX\u0010;J\u0012\u0010Y\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bY\u0010;J\u0012\u0010Z\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bZ\u0010;J\u0012\u0010[\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b[\u0010;J\u0012\u0010\\\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\\\u0010;J\u0012\u0010]\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b]\u0010;J\u0012\u0010^\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b^\u0010;Jà\u0003\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\ba\u00107J\u0010\u0010b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bb\u00105J\u001a\u0010f\u001a\u00020e2\b\u0010d\u001a\u0004\u0018\u00010cHÖ\u0003¢\u0006\u0004\bf\u0010gJ'\u0010p\u001a\u00020m2\u0006\u0010h\u001a\u00020\u00002\u0006\u0010j\u001a\u00020i2\u0006\u0010l\u001a\u00020kH\u0001¢\u0006\u0004\bn\u0010oR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010q\u001a\u0004\br\u00105R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010s\u001a\u0004\bt\u00107R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010u\u001a\u0004\bv\u00109R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010w\u001a\u0004\bx\u0010;R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010w\u001a\u0004\by\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010u\u001a\u0004\bz\u00109R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010u\u001a\u0004\b{\u00109R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010u\u001a\u0004\b|\u00109R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010u\u001a\u0004\b}\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010u\u001a\u0004\b~\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010u\u001a\u0004\b\u007f\u00109R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0011\u0010u\u001a\u0005\b\u0080\u0001\u00109R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0012\u0010u\u001a\u0005\b\u0081\u0001\u00109R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0013\u0010u\u001a\u0005\b\u0082\u0001\u00109R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0014\u0010u\u001a\u0005\b\u0083\u0001\u00109R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0015\u0010u\u001a\u0005\b\u0084\u0001\u00109R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0016\u0010u\u001a\u0005\b\u0085\u0001\u00109R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0017\u0010u\u001a\u0005\b\u0086\u0001\u00109R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0018\u0010u\u001a\u0005\b\u0087\u0001\u00109R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0019\u0010u\u001a\u0005\b\u0088\u0001\u00109R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001a\u0010u\u001a\u0005\b\u0089\u0001\u00109R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001b\u0010u\u001a\u0005\b\u008a\u0001\u00109R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001c\u0010u\u001a\u0005\b\u008b\u0001\u00109R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001d\u0010u\u001a\u0005\b\u008c\u0001\u00109R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001e\u0010u\u001a\u0005\b\u008d\u0001\u00109R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001f\u0010u\u001a\u0005\b\u008e\u0001\u00109R\u001a\u0010 \u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b \u0010w\u001a\u0005\b\u008f\u0001\u0010;R\u001a\u0010!\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b!\u0010w\u001a\u0005\b\u0090\u0001\u0010;R\u001a\u0010\"\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b\"\u0010w\u001a\u0005\b\u0091\u0001\u0010;R\u001a\u0010#\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b#\u0010w\u001a\u0005\b\u0092\u0001\u0010;R\u001a\u0010$\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b$\u0010u\u001a\u0005\b\u0093\u0001\u00109R\u001a\u0010%\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b%\u0010u\u001a\u0005\b\u0094\u0001\u00109R\u001a\u0010&\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b&\u0010w\u001a\u0005\b\u0095\u0001\u0010;R\u001a\u0010'\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b'\u0010w\u001a\u0005\b\u0096\u0001\u0010;R\u001a\u0010(\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b(\u0010w\u001a\u0005\b\u0097\u0001\u0010;R\u001a\u0010)\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b)\u0010w\u001a\u0005\b\u0098\u0001\u0010;R\u001a\u0010*\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b*\u0010w\u001a\u0005\b\u0099\u0001\u0010;R\u001a\u0010+\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b+\u0010w\u001a\u0005\b\u009a\u0001\u0010;R\u001a\u0010,\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b,\u0010w\u001a\u0005\b\u009b\u0001\u0010;¨\u0006\u009e\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/BasketballPlayerSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "Ljava/io/Serializable;", "", "id", "", "type", "appearances", "", CampaignEx.JSON_KEY_STAR, "totalRating", "countRating", "secondsPlayed", "points", "twoPointsMade", "twoPointAttempts", "threePointsMade", "threePointAttempts", "freeThrowsMade", "freeThrowAttempts", "fieldGoalsMade", "fieldGoalAttempts", "rebounds", "defensiveRebounds", "offensiveRebounds", "turnovers", "blocks", "personalFouls", "assists", "steals", "plusMinus", "pir", "fieldGoalsPercentage", "freeThrowsPercentage", "threePointsPercentage", "twoPointsPercentage", "doubleDoubles", "tripleDoubles", "assistTurnoverRatio", "trueShootingPercentage", "effectiveFieldGoalPercentage", "usage", "individualOffensiveRating", "individualDefensiveRating", "playerEfficiencyRating", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sofascore/model/newNetwork/statistics/season/player/BasketballPlayerSeasonStatistics;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/BasketballPlayerSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getType", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/Double;", "getRating", "getTotalRating", "getCountRating", "getSecondsPlayed", "getPoints", "getTwoPointsMade", "getTwoPointAttempts", "getThreePointsMade", "getThreePointAttempts", "getFreeThrowsMade", "getFreeThrowAttempts", "getFieldGoalsMade", "getFieldGoalAttempts", "getRebounds", "getDefensiveRebounds", "getOffensiveRebounds", "getTurnovers", "getBlocks", "getPersonalFouls", "getAssists", "getSteals", "getPlusMinus", "getPir", "getFieldGoalsPercentage", "getFreeThrowsPercentage", "getThreePointsPercentage", "getTwoPointsPercentage", "getDoubleDoubles", "getTripleDoubles", "getAssistTurnoverRatio", "getTrueShootingPercentage", "getEffectiveFieldGoalPercentage", "getUsage", "getIndividualOffensiveRating", "getIndividualDefensiveRating", "getPlayerEfficiencyRating", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BasketballPlayerSeasonStatistics extends AbstractPlayerSeasonStatistics implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Double assistTurnoverRatio;

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer blocks;

    @Nullable
    private final Integer countRating;

    @Nullable
    private final Integer defensiveRebounds;

    @Nullable
    private final Integer doubleDoubles;

    @Nullable
    private final Double effectiveFieldGoalPercentage;

    @Nullable
    private final Integer fieldGoalAttempts;

    @Nullable
    private final Integer fieldGoalsMade;

    @Nullable
    private final Double fieldGoalsPercentage;

    @Nullable
    private final Integer freeThrowAttempts;

    @Nullable
    private final Integer freeThrowsMade;

    @Nullable
    private final Double freeThrowsPercentage;
    private final int id;

    @Nullable
    private final Double individualDefensiveRating;

    @Nullable
    private final Double individualOffensiveRating;

    @Nullable
    private final Integer offensiveRebounds;

    @Nullable
    private final Integer personalFouls;

    @Nullable
    private final Integer pir;

    @Nullable
    private final Double playerEfficiencyRating;

    @Nullable
    private final Integer plusMinus;

    @Nullable
    private final Integer points;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer rebounds;

    @Nullable
    private final Integer secondsPlayed;

    @Nullable
    private final Integer steals;

    @Nullable
    private final Integer threePointAttempts;

    @Nullable
    private final Integer threePointsMade;

    @Nullable
    private final Double threePointsPercentage;

    @Nullable
    private final Double totalRating;

    @Nullable
    private final Integer tripleDoubles;

    @Nullable
    private final Double trueShootingPercentage;

    @Nullable
    private final Integer turnovers;

    @Nullable
    private final Integer twoPointAttempts;

    @Nullable
    private final Integer twoPointsMade;

    @Nullable
    private final Double twoPointsPercentage;

    @NotNull
    private final String type;

    @Nullable
    private final Double usage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketballPlayerSeasonStatistics(int i, int i2, int i3, String str, Integer num, Double d, Double d2, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Double d3, Double d4, Double d5, Double d6, Integer num23, Integer num24, Double d7, Double d8, Double d9, Double d10, Double d11, Double d12, Double d13, t5h t5hVar) {
        super(i, t5hVar);
        if ((127 != (i2 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE}, BasketballPlayerSeasonStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.totalRating = d2;
        this.countRating = num2;
        this.secondsPlayed = num3;
        this.points = num4;
        this.twoPointsMade = num5;
        this.twoPointAttempts = num6;
        this.threePointsMade = num7;
        this.threePointAttempts = num8;
        this.freeThrowsMade = num9;
        this.freeThrowAttempts = num10;
        this.fieldGoalsMade = num11;
        this.fieldGoalAttempts = num12;
        this.rebounds = num13;
        this.defensiveRebounds = num14;
        this.offensiveRebounds = num15;
        this.turnovers = num16;
        this.blocks = num17;
        this.personalFouls = num18;
        this.assists = num19;
        this.steals = num20;
        this.plusMinus = num21;
        this.pir = num22;
        this.fieldGoalsPercentage = d3;
        this.freeThrowsPercentage = d4;
        this.threePointsPercentage = d5;
        this.twoPointsPercentage = d6;
        this.doubleDoubles = num23;
        this.tripleDoubles = num24;
        this.assistTurnoverRatio = d7;
        this.trueShootingPercentage = d8;
        this.effectiveFieldGoalPercentage = d9;
        this.usage = d10;
        this.individualOffensiveRating = d11;
        this.individualDefensiveRating = d12;
        this.playerEfficiencyRating = d13;
    }

    public static /* synthetic */ BasketballPlayerSeasonStatistics copy$default(BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics, int i, String str, Integer num, Double d, Double d2, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Double d3, Double d4, Double d5, Double d6, Integer num23, Integer num24, Double d7, Double d8, Double d9, Double d10, Double d11, Double d12, Double d13, int i2, int i3, Object obj) {
        Double d14;
        Double d15;
        Integer num25;
        Integer num26;
        Integer num27;
        Integer num28;
        Double d16;
        Double d17;
        Double d18;
        Double d19;
        Integer num29;
        Integer num30;
        Double d20;
        Double d21;
        Double d22;
        Double d23;
        Double d24;
        Integer num31;
        Integer num32;
        Integer num33;
        Integer num34;
        Integer num35;
        Integer num36;
        Integer num37;
        Integer num38;
        Integer num39;
        Integer num40;
        Integer num41;
        Integer num42;
        Integer num43;
        Integer num44;
        Integer num45;
        String str2;
        Integer num46;
        Double d25;
        Double d26;
        Integer num47;
        Integer num48;
        int i4 = (i2 & 1) != 0 ? basketballPlayerSeasonStatistics.id : i;
        String str3 = (i2 & 2) != 0 ? basketballPlayerSeasonStatistics.type : str;
        Integer num49 = (i2 & 4) != 0 ? basketballPlayerSeasonStatistics.appearances : num;
        Double d27 = (i2 & 8) != 0 ? basketballPlayerSeasonStatistics.rating : d;
        Double d28 = (i2 & 16) != 0 ? basketballPlayerSeasonStatistics.totalRating : d2;
        Integer num50 = (i2 & 32) != 0 ? basketballPlayerSeasonStatistics.countRating : num2;
        Integer num51 = (i2 & 64) != 0 ? basketballPlayerSeasonStatistics.secondsPlayed : num3;
        Integer num52 = (i2 & 128) != 0 ? basketballPlayerSeasonStatistics.points : num4;
        Integer num53 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? basketballPlayerSeasonStatistics.twoPointsMade : num5;
        Integer num54 = (i2 & 512) != 0 ? basketballPlayerSeasonStatistics.twoPointAttempts : num6;
        Integer num55 = (i2 & 1024) != 0 ? basketballPlayerSeasonStatistics.threePointsMade : num7;
        Integer num56 = (i2 & a.o) != 0 ? basketballPlayerSeasonStatistics.threePointAttempts : num8;
        Integer num57 = (i2 & 4096) != 0 ? basketballPlayerSeasonStatistics.freeThrowsMade : num9;
        Integer num58 = (i2 & 8192) != 0 ? basketballPlayerSeasonStatistics.freeThrowAttempts : num10;
        int i5 = i4;
        Integer num59 = (i2 & 16384) != 0 ? basketballPlayerSeasonStatistics.fieldGoalsMade : num11;
        Integer num60 = (i2 & 32768) != 0 ? basketballPlayerSeasonStatistics.fieldGoalAttempts : num12;
        Integer num61 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? basketballPlayerSeasonStatistics.rebounds : num13;
        Integer num62 = (i2 & 131072) != 0 ? basketballPlayerSeasonStatistics.defensiveRebounds : num14;
        Integer num63 = (i2 & 262144) != 0 ? basketballPlayerSeasonStatistics.offensiveRebounds : num15;
        Integer num64 = (i2 & 524288) != 0 ? basketballPlayerSeasonStatistics.turnovers : num16;
        Integer num65 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? basketballPlayerSeasonStatistics.blocks : num17;
        Integer num66 = (i2 & 2097152) != 0 ? basketballPlayerSeasonStatistics.personalFouls : num18;
        Integer num67 = (i2 & 4194304) != 0 ? basketballPlayerSeasonStatistics.assists : num19;
        Integer num68 = (i2 & 8388608) != 0 ? basketballPlayerSeasonStatistics.steals : num20;
        Integer num69 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? basketballPlayerSeasonStatistics.plusMinus : num21;
        Integer num70 = (i2 & 33554432) != 0 ? basketballPlayerSeasonStatistics.pir : num22;
        Double d29 = (i2 & 67108864) != 0 ? basketballPlayerSeasonStatistics.fieldGoalsPercentage : d3;
        Double d30 = (i2 & 134217728) != 0 ? basketballPlayerSeasonStatistics.freeThrowsPercentage : d4;
        Double d31 = (i2 & 268435456) != 0 ? basketballPlayerSeasonStatistics.threePointsPercentage : d5;
        Double d32 = (i2 & 536870912) != 0 ? basketballPlayerSeasonStatistics.twoPointsPercentage : d6;
        Integer num71 = (i2 & 1073741824) != 0 ? basketballPlayerSeasonStatistics.doubleDoubles : num23;
        Integer num72 = (i2 & Integer.MIN_VALUE) != 0 ? basketballPlayerSeasonStatistics.tripleDoubles : num24;
        Double d33 = (i3 & 1) != 0 ? basketballPlayerSeasonStatistics.assistTurnoverRatio : d7;
        Double d34 = (i3 & 2) != 0 ? basketballPlayerSeasonStatistics.trueShootingPercentage : d8;
        Double d35 = (i3 & 4) != 0 ? basketballPlayerSeasonStatistics.effectiveFieldGoalPercentage : d9;
        Double d36 = (i3 & 8) != 0 ? basketballPlayerSeasonStatistics.usage : d10;
        Double d37 = (i3 & 16) != 0 ? basketballPlayerSeasonStatistics.individualOffensiveRating : d11;
        Double d38 = (i3 & 32) != 0 ? basketballPlayerSeasonStatistics.individualDefensiveRating : d12;
        if ((i3 & 64) != 0) {
            d15 = d38;
            d14 = basketballPlayerSeasonStatistics.playerEfficiencyRating;
            num26 = num68;
            num27 = num69;
            num28 = num70;
            d16 = d29;
            d17 = d30;
            d18 = d31;
            d19 = d32;
            num29 = num71;
            num30 = num72;
            d20 = d33;
            d21 = d34;
            d22 = d35;
            d23 = d36;
            d24 = d37;
            num31 = num59;
            num33 = num53;
            num34 = num54;
            num35 = num55;
            num36 = num56;
            num37 = num57;
            num38 = num58;
            num39 = num60;
            num40 = num61;
            num41 = num62;
            num42 = num63;
            num43 = num64;
            num44 = num65;
            num45 = num66;
            num25 = num67;
            str2 = str3;
            num46 = num49;
            d25 = d27;
            d26 = d28;
            num47 = num50;
            num48 = num51;
            num32 = num52;
        } else {
            d14 = d13;
            d15 = d38;
            num25 = num67;
            num26 = num68;
            num27 = num69;
            num28 = num70;
            d16 = d29;
            d17 = d30;
            d18 = d31;
            d19 = d32;
            num29 = num71;
            num30 = num72;
            d20 = d33;
            d21 = d34;
            d22 = d35;
            d23 = d36;
            d24 = d37;
            num31 = num59;
            num32 = num52;
            num33 = num53;
            num34 = num54;
            num35 = num55;
            num36 = num56;
            num37 = num57;
            num38 = num58;
            num39 = num60;
            num40 = num61;
            num41 = num62;
            num42 = num63;
            num43 = num64;
            num44 = num65;
            num45 = num66;
            str2 = str3;
            num46 = num49;
            d25 = d27;
            d26 = d28;
            num47 = num50;
            num48 = num51;
        }
        return basketballPlayerSeasonStatistics.copy(i5, str2, num46, d25, d26, num47, num48, num32, num33, num34, num35, num36, num37, num38, num31, num39, num40, num41, num42, num43, num44, num45, num25, num26, num27, num28, d16, d17, d18, d19, num29, num30, d20, d21, d22, d23, d24, d15, d14);
    }

    public static final /* synthetic */ void write$Self$model_release(BasketballPlayerSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
        AbstractPlayerSeasonStatistics.write$Self(self, output, serialDesc);
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.getType());
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.getAppearances());
        h75 h75Var = h75.a;
        output.h(serialDesc, 3, h75Var, self.getRating());
        output.h(serialDesc, 4, h75Var, self.totalRating);
        output.h(serialDesc, 5, a7aVar, self.countRating);
        output.h(serialDesc, 6, a7aVar, self.secondsPlayed);
        output.h(serialDesc, 7, a7aVar, self.points);
        output.h(serialDesc, 8, a7aVar, self.twoPointsMade);
        output.h(serialDesc, 9, a7aVar, self.twoPointAttempts);
        output.h(serialDesc, 10, a7aVar, self.threePointsMade);
        output.h(serialDesc, 11, a7aVar, self.threePointAttempts);
        output.h(serialDesc, 12, a7aVar, self.freeThrowsMade);
        output.h(serialDesc, 13, a7aVar, self.freeThrowAttempts);
        output.h(serialDesc, 14, a7aVar, self.fieldGoalsMade);
        output.h(serialDesc, 15, a7aVar, self.fieldGoalAttempts);
        output.h(serialDesc, 16, a7aVar, self.rebounds);
        output.h(serialDesc, 17, a7aVar, self.defensiveRebounds);
        output.h(serialDesc, 18, a7aVar, self.offensiveRebounds);
        output.h(serialDesc, 19, a7aVar, self.turnovers);
        output.h(serialDesc, 20, a7aVar, self.blocks);
        output.h(serialDesc, 21, a7aVar, self.personalFouls);
        output.h(serialDesc, 22, a7aVar, self.assists);
        output.h(serialDesc, 23, a7aVar, self.steals);
        output.h(serialDesc, 24, a7aVar, self.plusMinus);
        output.h(serialDesc, 25, a7aVar, self.pir);
        output.h(serialDesc, 26, h75Var, self.fieldGoalsPercentage);
        output.h(serialDesc, 27, h75Var, self.freeThrowsPercentage);
        output.h(serialDesc, 28, h75Var, self.threePointsPercentage);
        output.h(serialDesc, 29, h75Var, self.twoPointsPercentage);
        output.h(serialDesc, 30, a7aVar, self.doubleDoubles);
        output.h(serialDesc, 31, a7aVar, self.tripleDoubles);
        output.h(serialDesc, 32, h75Var, self.assistTurnoverRatio);
        output.h(serialDesc, 33, h75Var, self.trueShootingPercentage);
        output.h(serialDesc, 34, h75Var, self.effectiveFieldGoalPercentage);
        output.h(serialDesc, 35, h75Var, self.usage);
        output.h(serialDesc, 36, h75Var, self.individualOffensiveRating);
        output.h(serialDesc, 37, h75Var, self.individualDefensiveRating);
        output.h(serialDesc, 38, h75Var, self.playerEfficiencyRating);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getTwoPointAttempts() {
        return this.twoPointAttempts;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getThreePointAttempts() {
        return this.threePointAttempts;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getFreeThrowsMade() {
        return this.freeThrowsMade;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getFreeThrowAttempts() {
        return this.freeThrowAttempts;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getFieldGoalsMade() {
        return this.fieldGoalsMade;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getFieldGoalAttempts() {
        return this.fieldGoalAttempts;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getRebounds() {
        return this.rebounds;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getTurnovers() {
        return this.turnovers;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getBlocks() {
        return this.blocks;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getPersonalFouls() {
        return this.personalFouls;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getPir() {
        return this.pir;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Double getFieldGoalsPercentage() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Double getFreeThrowsPercentage() {
        return this.freeThrowsPercentage;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Double getThreePointsPercentage() {
        return this.threePointsPercentage;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Double getTwoPointsPercentage() {
        return this.twoPointsPercentage;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getDoubleDoubles() {
        return this.doubleDoubles;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getTripleDoubles() {
        return this.tripleDoubles;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Double getAssistTurnoverRatio() {
        return this.assistTurnoverRatio;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Double getTrueShootingPercentage() {
        return this.trueShootingPercentage;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Double getEffectiveFieldGoalPercentage() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final Double getUsage() {
        return this.usage;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final Double getIndividualOffensiveRating() {
        return this.individualOffensiveRating;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final Double getIndividualDefensiveRating() {
        return this.individualDefensiveRating;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final Double getPlayerEfficiencyRating() {
        return this.playerEfficiencyRating;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getTotalRating() {
        return this.totalRating;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getCountRating() {
        return this.countRating;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getSecondsPlayed() {
        return this.secondsPlayed;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getTwoPointsMade() {
        return this.twoPointsMade;
    }

    @NotNull
    public final BasketballPlayerSeasonStatistics copy(int id, @NotNull String type, @Nullable Integer appearances, @Nullable Double rating, @Nullable Double totalRating, @Nullable Integer countRating, @Nullable Integer secondsPlayed, @Nullable Integer points, @Nullable Integer twoPointsMade, @Nullable Integer twoPointAttempts, @Nullable Integer threePointsMade, @Nullable Integer threePointAttempts, @Nullable Integer freeThrowsMade, @Nullable Integer freeThrowAttempts, @Nullable Integer fieldGoalsMade, @Nullable Integer fieldGoalAttempts, @Nullable Integer rebounds, @Nullable Integer defensiveRebounds, @Nullable Integer offensiveRebounds, @Nullable Integer turnovers, @Nullable Integer blocks, @Nullable Integer personalFouls, @Nullable Integer assists, @Nullable Integer steals, @Nullable Integer plusMinus, @Nullable Integer pir, @Nullable Double fieldGoalsPercentage, @Nullable Double freeThrowsPercentage, @Nullable Double threePointsPercentage, @Nullable Double twoPointsPercentage, @Nullable Integer doubleDoubles, @Nullable Integer tripleDoubles, @Nullable Double assistTurnoverRatio, @Nullable Double trueShootingPercentage, @Nullable Double effectiveFieldGoalPercentage, @Nullable Double usage, @Nullable Double individualOffensiveRating, @Nullable Double individualDefensiveRating, @Nullable Double playerEfficiencyRating) {
        type.getClass();
        return new BasketballPlayerSeasonStatistics(id, type, appearances, rating, totalRating, countRating, secondsPlayed, points, twoPointsMade, twoPointAttempts, threePointsMade, threePointAttempts, freeThrowsMade, freeThrowAttempts, fieldGoalsMade, fieldGoalAttempts, rebounds, defensiveRebounds, offensiveRebounds, turnovers, blocks, personalFouls, assists, steals, plusMinus, pir, fieldGoalsPercentage, freeThrowsPercentage, threePointsPercentage, twoPointsPercentage, doubleDoubles, tripleDoubles, assistTurnoverRatio, trueShootingPercentage, effectiveFieldGoalPercentage, usage, individualOffensiveRating, individualDefensiveRating, playerEfficiencyRating);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketballPlayerSeasonStatistics)) {
            return false;
        }
        BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics = (BasketballPlayerSeasonStatistics) other;
        return this.id == basketballPlayerSeasonStatistics.id && Intrinsics.c(this.type, basketballPlayerSeasonStatistics.type) && Intrinsics.c(this.appearances, basketballPlayerSeasonStatistics.appearances) && Intrinsics.c(this.rating, basketballPlayerSeasonStatistics.rating) && Intrinsics.c(this.totalRating, basketballPlayerSeasonStatistics.totalRating) && Intrinsics.c(this.countRating, basketballPlayerSeasonStatistics.countRating) && Intrinsics.c(this.secondsPlayed, basketballPlayerSeasonStatistics.secondsPlayed) && Intrinsics.c(this.points, basketballPlayerSeasonStatistics.points) && Intrinsics.c(this.twoPointsMade, basketballPlayerSeasonStatistics.twoPointsMade) && Intrinsics.c(this.twoPointAttempts, basketballPlayerSeasonStatistics.twoPointAttempts) && Intrinsics.c(this.threePointsMade, basketballPlayerSeasonStatistics.threePointsMade) && Intrinsics.c(this.threePointAttempts, basketballPlayerSeasonStatistics.threePointAttempts) && Intrinsics.c(this.freeThrowsMade, basketballPlayerSeasonStatistics.freeThrowsMade) && Intrinsics.c(this.freeThrowAttempts, basketballPlayerSeasonStatistics.freeThrowAttempts) && Intrinsics.c(this.fieldGoalsMade, basketballPlayerSeasonStatistics.fieldGoalsMade) && Intrinsics.c(this.fieldGoalAttempts, basketballPlayerSeasonStatistics.fieldGoalAttempts) && Intrinsics.c(this.rebounds, basketballPlayerSeasonStatistics.rebounds) && Intrinsics.c(this.defensiveRebounds, basketballPlayerSeasonStatistics.defensiveRebounds) && Intrinsics.c(this.offensiveRebounds, basketballPlayerSeasonStatistics.offensiveRebounds) && Intrinsics.c(this.turnovers, basketballPlayerSeasonStatistics.turnovers) && Intrinsics.c(this.blocks, basketballPlayerSeasonStatistics.blocks) && Intrinsics.c(this.personalFouls, basketballPlayerSeasonStatistics.personalFouls) && Intrinsics.c(this.assists, basketballPlayerSeasonStatistics.assists) && Intrinsics.c(this.steals, basketballPlayerSeasonStatistics.steals) && Intrinsics.c(this.plusMinus, basketballPlayerSeasonStatistics.plusMinus) && Intrinsics.c(this.pir, basketballPlayerSeasonStatistics.pir) && Intrinsics.c(this.fieldGoalsPercentage, basketballPlayerSeasonStatistics.fieldGoalsPercentage) && Intrinsics.c(this.freeThrowsPercentage, basketballPlayerSeasonStatistics.freeThrowsPercentage) && Intrinsics.c(this.threePointsPercentage, basketballPlayerSeasonStatistics.threePointsPercentage) && Intrinsics.c(this.twoPointsPercentage, basketballPlayerSeasonStatistics.twoPointsPercentage) && Intrinsics.c(this.doubleDoubles, basketballPlayerSeasonStatistics.doubleDoubles) && Intrinsics.c(this.tripleDoubles, basketballPlayerSeasonStatistics.tripleDoubles) && Intrinsics.c(this.assistTurnoverRatio, basketballPlayerSeasonStatistics.assistTurnoverRatio) && Intrinsics.c(this.trueShootingPercentage, basketballPlayerSeasonStatistics.trueShootingPercentage) && Intrinsics.c(this.effectiveFieldGoalPercentage, basketballPlayerSeasonStatistics.effectiveFieldGoalPercentage) && Intrinsics.c(this.usage, basketballPlayerSeasonStatistics.usage) && Intrinsics.c(this.individualOffensiveRating, basketballPlayerSeasonStatistics.individualOffensiveRating) && Intrinsics.c(this.individualDefensiveRating, basketballPlayerSeasonStatistics.individualDefensiveRating) && Intrinsics.c(this.playerEfficiencyRating, basketballPlayerSeasonStatistics.playerEfficiencyRating);
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    public final Double getAssistTurnoverRatio() {
        return this.assistTurnoverRatio;
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final Integer getBlocks() {
        return this.blocks;
    }

    @Nullable
    public final Integer getCountRating() {
        return this.countRating;
    }

    @Nullable
    public final Integer getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    public final Integer getDoubleDoubles() {
        return this.doubleDoubles;
    }

    @Nullable
    public final Double getEffectiveFieldGoalPercentage() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    public final Integer getFieldGoalAttempts() {
        return this.fieldGoalAttempts;
    }

    @Nullable
    public final Integer getFieldGoalsMade() {
        return this.fieldGoalsMade;
    }

    @Nullable
    public final Double getFieldGoalsPercentage() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    public final Integer getFreeThrowAttempts() {
        return this.freeThrowAttempts;
    }

    @Nullable
    public final Integer getFreeThrowsMade() {
        return this.freeThrowsMade;
    }

    @Nullable
    public final Double getFreeThrowsPercentage() {
        return this.freeThrowsPercentage;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Double getIndividualDefensiveRating() {
        return this.individualDefensiveRating;
    }

    @Nullable
    public final Double getIndividualOffensiveRating() {
        return this.individualOffensiveRating;
    }

    @Nullable
    public final Integer getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    public final Integer getPersonalFouls() {
        return this.personalFouls;
    }

    @Nullable
    public final Integer getPir() {
        return this.pir;
    }

    @Nullable
    public final Double getPlayerEfficiencyRating() {
        return this.playerEfficiencyRating;
    }

    @Nullable
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getRebounds() {
        return this.rebounds;
    }

    @Nullable
    public final Integer getSecondsPlayed() {
        return this.secondsPlayed;
    }

    @Nullable
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    public final Integer getThreePointAttempts() {
        return this.threePointAttempts;
    }

    @Nullable
    public final Integer getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    public final Double getThreePointsPercentage() {
        return this.threePointsPercentage;
    }

    @Nullable
    public final Double getTotalRating() {
        return this.totalRating;
    }

    @Nullable
    public final Integer getTripleDoubles() {
        return this.tripleDoubles;
    }

    @Nullable
    public final Double getTrueShootingPercentage() {
        return this.trueShootingPercentage;
    }

    @Nullable
    public final Integer getTurnovers() {
        return this.turnovers;
    }

    @Nullable
    public final Integer getTwoPointAttempts() {
        return this.twoPointAttempts;
    }

    @Nullable
    public final Integer getTwoPointsMade() {
        return this.twoPointsMade;
    }

    @Nullable
    public final Double getTwoPointsPercentage() {
        return this.twoPointsPercentage;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @NotNull
    public String getType() {
        return this.type;
    }

    @Nullable
    public final Double getUsage() {
        return this.usage;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.type);
        Integer num = this.appearances;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.rating;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.totalRating;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num2 = this.countRating;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.secondsPlayed;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.points;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.twoPointsMade;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.twoPointAttempts;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.threePointsMade;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.threePointAttempts;
        int hashCode10 = (hashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.freeThrowsMade;
        int hashCode11 = (hashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.freeThrowAttempts;
        int hashCode12 = (hashCode11 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.fieldGoalsMade;
        int hashCode13 = (hashCode12 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.fieldGoalAttempts;
        int hashCode14 = (hashCode13 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.rebounds;
        int hashCode15 = (hashCode14 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.defensiveRebounds;
        int hashCode16 = (hashCode15 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.offensiveRebounds;
        int hashCode17 = (hashCode16 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.turnovers;
        int hashCode18 = (hashCode17 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.blocks;
        int hashCode19 = (hashCode18 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.personalFouls;
        int hashCode20 = (hashCode19 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.assists;
        int hashCode21 = (hashCode20 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.steals;
        int hashCode22 = (hashCode21 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.plusMinus;
        int hashCode23 = (hashCode22 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.pir;
        int hashCode24 = (hashCode23 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Double d3 = this.fieldGoalsPercentage;
        int hashCode25 = (hashCode24 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.freeThrowsPercentage;
        int hashCode26 = (hashCode25 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.threePointsPercentage;
        int hashCode27 = (hashCode26 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.twoPointsPercentage;
        int hashCode28 = (hashCode27 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num23 = this.doubleDoubles;
        int hashCode29 = (hashCode28 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.tripleDoubles;
        int hashCode30 = (hashCode29 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Double d7 = this.assistTurnoverRatio;
        int hashCode31 = (hashCode30 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.trueShootingPercentage;
        int hashCode32 = (hashCode31 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.effectiveFieldGoalPercentage;
        int hashCode33 = (hashCode32 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d10 = this.usage;
        int hashCode34 = (hashCode33 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.individualOffensiveRating;
        int hashCode35 = (hashCode34 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.individualDefensiveRating;
        int hashCode36 = (hashCode35 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.playerEfficiencyRating;
        return hashCode36 + (d13 != null ? d13.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        Integer num = this.appearances;
        Double d = this.rating;
        Double d2 = this.totalRating;
        Integer num2 = this.countRating;
        Integer num3 = this.secondsPlayed;
        Integer num4 = this.points;
        Integer num5 = this.twoPointsMade;
        Integer num6 = this.twoPointAttempts;
        Integer num7 = this.threePointsMade;
        Integer num8 = this.threePointAttempts;
        Integer num9 = this.freeThrowsMade;
        Integer num10 = this.freeThrowAttempts;
        Integer num11 = this.fieldGoalsMade;
        Integer num12 = this.fieldGoalAttempts;
        Integer num13 = this.rebounds;
        Integer num14 = this.defensiveRebounds;
        Integer num15 = this.offensiveRebounds;
        Integer num16 = this.turnovers;
        Integer num17 = this.blocks;
        Integer num18 = this.personalFouls;
        Integer num19 = this.assists;
        Integer num20 = this.steals;
        Integer num21 = this.plusMinus;
        Integer num22 = this.pir;
        Double d3 = this.fieldGoalsPercentage;
        Double d4 = this.freeThrowsPercentage;
        Double d5 = this.threePointsPercentage;
        Double d6 = this.twoPointsPercentage;
        Integer num23 = this.doubleDoubles;
        Integer num24 = this.tripleDoubles;
        Double d7 = this.assistTurnoverRatio;
        Double d8 = this.trueShootingPercentage;
        Double d9 = this.effectiveFieldGoalPercentage;
        Double d10 = this.usage;
        Double d11 = this.individualOffensiveRating;
        Double d12 = this.individualDefensiveRating;
        Double d13 = this.playerEfficiencyRating;
        StringBuilder t = dmi.t(i, "BasketballPlayerSeasonStatistics(id=", ", type=", str, ", appearances=");
        fn0.v(d, num, ", rating=", ", totalRating=", t);
        mz1.x(d2, num2, ", countRating=", ", secondsPlayed=", t);
        vxd.r(num3, num4, ", points=", ", twoPointsMade=", t);
        vxd.r(num5, num6, ", twoPointAttempts=", ", threePointsMade=", t);
        vxd.r(num7, num8, ", threePointAttempts=", ", freeThrowsMade=", t);
        vxd.r(num9, num10, ", freeThrowAttempts=", ", fieldGoalsMade=", t);
        vxd.r(num11, num12, ", fieldGoalAttempts=", ", rebounds=", t);
        vxd.r(num13, num14, ", defensiveRebounds=", ", offensiveRebounds=", t);
        vxd.r(num15, num16, ", turnovers=", ", blocks=", t);
        vxd.r(num17, num18, ", personalFouls=", ", assists=", t);
        vxd.r(num19, num20, ", steals=", ", plusMinus=", t);
        vxd.r(num21, num22, ", pir=", ", fieldGoalsPercentage=", t);
        fc6.A(t, d3, ", freeThrowsPercentage=", d4, ", threePointsPercentage=");
        fc6.A(t, d5, ", twoPointsPercentage=", d6, ", doubleDoubles=");
        vxd.r(num23, num24, ", tripleDoubles=", ", assistTurnoverRatio=", t);
        fc6.A(t, d7, ", trueShootingPercentage=", d8, ", effectiveFieldGoalPercentage=");
        fc6.A(t, d9, ", usage=", d10, ", individualOffensiveRating=");
        fc6.A(t, d11, ", individualDefensiveRating=", d12, ", playerEfficiencyRating=");
        t.append(d13);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/BasketballPlayerSeasonStatistics$Companion;", "", "<init>", "()V", "aggregate", "Lcom/sofascore/model/newNetwork/statistics/season/player/BasketballPlayerSeasonStatistics;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BasketballPlayerSeasonStatistics aggregate(@NotNull List<BasketballPlayerSeasonStatistics> statistics) {
            statistics.getClass();
            int id = ((BasketballPlayerSeasonStatistics) CollectionsKt.Y(statistics)).getId();
            String type = ((BasketballPlayerSeasonStatistics) CollectionsKt.Y(statistics)).getType();
            AbstractPlayerSeasonStatistics.Companion companion = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = statistics.iterator();
            while (it.hasNext()) {
                Integer appearances = ((BasketballPlayerSeasonStatistics) it.next()).getAppearances();
                if (appearances != null) {
                    arrayList.add(appearances);
                }
            }
            Integer m690nullableSum = companion.m690nullableSum((List<Integer>) arrayList);
            AbstractPlayerSeasonStatistics.Companion companion2 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = statistics.iterator();
            while (it2.hasNext()) {
                Double rating = ((BasketballPlayerSeasonStatistics) it2.next()).getRating();
                if (rating != null) {
                    arrayList2.add(rating);
                }
            }
            Double nullableSum = companion2.nullableSum((List<Double>) arrayList2);
            AbstractPlayerSeasonStatistics.Companion companion3 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = statistics.iterator();
            while (it3.hasNext()) {
                Double totalRating = ((BasketballPlayerSeasonStatistics) it3.next()).getTotalRating();
                if (totalRating != null) {
                    arrayList3.add(totalRating);
                }
            }
            Double nullableSum2 = companion3.nullableSum((List<Double>) arrayList3);
            AbstractPlayerSeasonStatistics.Companion companion4 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it4 = statistics.iterator();
            while (it4.hasNext()) {
                Integer countRating = ((BasketballPlayerSeasonStatistics) it4.next()).getCountRating();
                if (countRating != null) {
                    arrayList4.add(countRating);
                }
            }
            Integer m690nullableSum2 = companion4.m690nullableSum((List<Integer>) arrayList4);
            AbstractPlayerSeasonStatistics.Companion companion5 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it5 = statistics.iterator();
            while (it5.hasNext()) {
                Integer secondsPlayed = ((BasketballPlayerSeasonStatistics) it5.next()).getSecondsPlayed();
                if (secondsPlayed != null) {
                    arrayList5.add(secondsPlayed);
                }
            }
            Integer m690nullableSum3 = companion5.m690nullableSum((List<Integer>) arrayList5);
            AbstractPlayerSeasonStatistics.Companion companion6 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList6 = new ArrayList();
            Iterator<T> it6 = statistics.iterator();
            while (it6.hasNext()) {
                Integer points = ((BasketballPlayerSeasonStatistics) it6.next()).getPoints();
                if (points != null) {
                    arrayList6.add(points);
                }
            }
            Integer m690nullableSum4 = companion6.m690nullableSum((List<Integer>) arrayList6);
            AbstractPlayerSeasonStatistics.Companion companion7 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList7 = new ArrayList();
            Iterator<T> it7 = statistics.iterator();
            while (it7.hasNext()) {
                Integer twoPointsMade = ((BasketballPlayerSeasonStatistics) it7.next()).getTwoPointsMade();
                if (twoPointsMade != null) {
                    arrayList7.add(twoPointsMade);
                }
            }
            Integer m690nullableSum5 = companion7.m690nullableSum((List<Integer>) arrayList7);
            AbstractPlayerSeasonStatistics.Companion companion8 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList8 = new ArrayList();
            Iterator<T> it8 = statistics.iterator();
            while (it8.hasNext()) {
                Integer twoPointAttempts = ((BasketballPlayerSeasonStatistics) it8.next()).getTwoPointAttempts();
                if (twoPointAttempts != null) {
                    arrayList8.add(twoPointAttempts);
                }
            }
            Integer m690nullableSum6 = companion8.m690nullableSum((List<Integer>) arrayList8);
            AbstractPlayerSeasonStatistics.Companion companion9 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList9 = new ArrayList();
            Iterator<T> it9 = statistics.iterator();
            while (it9.hasNext()) {
                Integer threePointsMade = ((BasketballPlayerSeasonStatistics) it9.next()).getThreePointsMade();
                if (threePointsMade != null) {
                    arrayList9.add(threePointsMade);
                }
            }
            Integer m690nullableSum7 = companion9.m690nullableSum((List<Integer>) arrayList9);
            AbstractPlayerSeasonStatistics.Companion companion10 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList10 = new ArrayList();
            Iterator<T> it10 = statistics.iterator();
            while (it10.hasNext()) {
                Integer threePointAttempts = ((BasketballPlayerSeasonStatistics) it10.next()).getThreePointAttempts();
                if (threePointAttempts != null) {
                    arrayList10.add(threePointAttempts);
                }
            }
            Integer m690nullableSum8 = companion10.m690nullableSum((List<Integer>) arrayList10);
            AbstractPlayerSeasonStatistics.Companion companion11 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList11 = new ArrayList();
            Iterator<T> it11 = statistics.iterator();
            while (it11.hasNext()) {
                Integer freeThrowsMade = ((BasketballPlayerSeasonStatistics) it11.next()).getFreeThrowsMade();
                if (freeThrowsMade != null) {
                    arrayList11.add(freeThrowsMade);
                }
            }
            Integer m690nullableSum9 = companion11.m690nullableSum((List<Integer>) arrayList11);
            AbstractPlayerSeasonStatistics.Companion companion12 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList12 = new ArrayList();
            Iterator<T> it12 = statistics.iterator();
            while (it12.hasNext()) {
                int i = id;
                Integer freeThrowAttempts = ((BasketballPlayerSeasonStatistics) it12.next()).getFreeThrowAttempts();
                if (freeThrowAttempts != null) {
                    arrayList12.add(freeThrowAttempts);
                }
                id = i;
            }
            int i2 = id;
            Integer m690nullableSum10 = companion12.m690nullableSum((List<Integer>) arrayList12);
            AbstractPlayerSeasonStatistics.Companion companion13 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList13 = new ArrayList();
            Iterator it13 = statistics.iterator();
            while (it13.hasNext()) {
                Iterator it14 = it13;
                Integer fieldGoalsMade = ((BasketballPlayerSeasonStatistics) it13.next()).getFieldGoalsMade();
                if (fieldGoalsMade != null) {
                    arrayList13.add(fieldGoalsMade);
                }
                it13 = it14;
            }
            Integer m690nullableSum11 = companion13.m690nullableSum((List<Integer>) arrayList13);
            AbstractPlayerSeasonStatistics.Companion companion14 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList14 = new ArrayList();
            Iterator it15 = statistics.iterator();
            while (it15.hasNext()) {
                Iterator it16 = it15;
                Integer fieldGoalAttempts = ((BasketballPlayerSeasonStatistics) it15.next()).getFieldGoalAttempts();
                if (fieldGoalAttempts != null) {
                    arrayList14.add(fieldGoalAttempts);
                }
                it15 = it16;
            }
            Integer m690nullableSum12 = companion14.m690nullableSum((List<Integer>) arrayList14);
            AbstractPlayerSeasonStatistics.Companion companion15 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList15 = new ArrayList();
            Iterator it17 = statistics.iterator();
            while (it17.hasNext()) {
                Iterator it18 = it17;
                Integer rebounds = ((BasketballPlayerSeasonStatistics) it17.next()).getRebounds();
                if (rebounds != null) {
                    arrayList15.add(rebounds);
                }
                it17 = it18;
            }
            Integer m690nullableSum13 = companion15.m690nullableSum((List<Integer>) arrayList15);
            AbstractPlayerSeasonStatistics.Companion companion16 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList16 = new ArrayList();
            Iterator it19 = statistics.iterator();
            while (it19.hasNext()) {
                Iterator it20 = it19;
                Integer defensiveRebounds = ((BasketballPlayerSeasonStatistics) it19.next()).getDefensiveRebounds();
                if (defensiveRebounds != null) {
                    arrayList16.add(defensiveRebounds);
                }
                it19 = it20;
            }
            Integer m690nullableSum14 = companion16.m690nullableSum((List<Integer>) arrayList16);
            AbstractPlayerSeasonStatistics.Companion companion17 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList17 = new ArrayList();
            Iterator it21 = statistics.iterator();
            while (it21.hasNext()) {
                Iterator it22 = it21;
                Integer offensiveRebounds = ((BasketballPlayerSeasonStatistics) it21.next()).getOffensiveRebounds();
                if (offensiveRebounds != null) {
                    arrayList17.add(offensiveRebounds);
                }
                it21 = it22;
            }
            Integer m690nullableSum15 = companion17.m690nullableSum((List<Integer>) arrayList17);
            AbstractPlayerSeasonStatistics.Companion companion18 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList18 = new ArrayList();
            Iterator it23 = statistics.iterator();
            while (it23.hasNext()) {
                Iterator it24 = it23;
                Integer turnovers = ((BasketballPlayerSeasonStatistics) it23.next()).getTurnovers();
                if (turnovers != null) {
                    arrayList18.add(turnovers);
                }
                it23 = it24;
            }
            Integer m690nullableSum16 = companion18.m690nullableSum((List<Integer>) arrayList18);
            AbstractPlayerSeasonStatistics.Companion companion19 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList19 = new ArrayList();
            Iterator it25 = statistics.iterator();
            while (it25.hasNext()) {
                Iterator it26 = it25;
                Integer blocks = ((BasketballPlayerSeasonStatistics) it25.next()).getBlocks();
                if (blocks != null) {
                    arrayList19.add(blocks);
                }
                it25 = it26;
            }
            Integer m690nullableSum17 = companion19.m690nullableSum((List<Integer>) arrayList19);
            AbstractPlayerSeasonStatistics.Companion companion20 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList20 = new ArrayList();
            Iterator it27 = statistics.iterator();
            while (it27.hasNext()) {
                Iterator it28 = it27;
                Integer personalFouls = ((BasketballPlayerSeasonStatistics) it27.next()).getPersonalFouls();
                if (personalFouls != null) {
                    arrayList20.add(personalFouls);
                }
                it27 = it28;
            }
            Integer m690nullableSum18 = companion20.m690nullableSum((List<Integer>) arrayList20);
            AbstractPlayerSeasonStatistics.Companion companion21 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList21 = new ArrayList();
            Iterator it29 = statistics.iterator();
            while (it29.hasNext()) {
                Iterator it30 = it29;
                Integer assists = ((BasketballPlayerSeasonStatistics) it29.next()).getAssists();
                if (assists != null) {
                    arrayList21.add(assists);
                }
                it29 = it30;
            }
            Integer m690nullableSum19 = companion21.m690nullableSum((List<Integer>) arrayList21);
            AbstractPlayerSeasonStatistics.Companion companion22 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList22 = new ArrayList();
            Iterator it31 = statistics.iterator();
            while (it31.hasNext()) {
                Iterator it32 = it31;
                Integer steals = ((BasketballPlayerSeasonStatistics) it31.next()).getSteals();
                if (steals != null) {
                    arrayList22.add(steals);
                }
                it31 = it32;
            }
            Integer m690nullableSum20 = companion22.m690nullableSum((List<Integer>) arrayList22);
            AbstractPlayerSeasonStatistics.Companion companion23 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList23 = new ArrayList();
            Iterator it33 = statistics.iterator();
            while (it33.hasNext()) {
                Iterator it34 = it33;
                Integer plusMinus = ((BasketballPlayerSeasonStatistics) it33.next()).getPlusMinus();
                if (plusMinus != null) {
                    arrayList23.add(plusMinus);
                }
                it33 = it34;
            }
            Integer m690nullableSum21 = companion23.m690nullableSum((List<Integer>) arrayList23);
            AbstractPlayerSeasonStatistics.Companion companion24 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList24 = new ArrayList();
            Iterator it35 = statistics.iterator();
            while (it35.hasNext()) {
                Iterator it36 = it35;
                Integer pir = ((BasketballPlayerSeasonStatistics) it35.next()).getPir();
                if (pir != null) {
                    arrayList24.add(pir);
                }
                it35 = it36;
            }
            Integer m690nullableSum22 = companion24.m690nullableSum((List<Integer>) arrayList24);
            AbstractPlayerSeasonStatistics.Companion companion25 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList25 = new ArrayList();
            Iterator it37 = statistics.iterator();
            while (it37.hasNext()) {
                Iterator it38 = it37;
                Integer doubleDoubles = ((BasketballPlayerSeasonStatistics) it37.next()).getDoubleDoubles();
                if (doubleDoubles != null) {
                    arrayList25.add(doubleDoubles);
                }
                it37 = it38;
            }
            Integer m690nullableSum23 = companion25.m690nullableSum((List<Integer>) arrayList25);
            AbstractPlayerSeasonStatistics.Companion companion26 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList26 = new ArrayList();
            Iterator it39 = statistics.iterator();
            while (it39.hasNext()) {
                Iterator it40 = it39;
                Integer tripleDoubles = ((BasketballPlayerSeasonStatistics) it39.next()).getTripleDoubles();
                if (tripleDoubles != null) {
                    arrayList26.add(tripleDoubles);
                }
                it39 = it40;
            }
            Integer m690nullableSum24 = companion26.m690nullableSum((List<Integer>) arrayList26);
            AbstractPlayerSeasonStatistics.Companion companion27 = AbstractPlayerSeasonStatistics.INSTANCE;
            ArrayList arrayList27 = new ArrayList();
            Iterator it41 = statistics.iterator();
            while (it41.hasNext()) {
                Iterator it42 = it41;
                Double assistTurnoverRatio = ((BasketballPlayerSeasonStatistics) it41.next()).getAssistTurnoverRatio();
                if (assistTurnoverRatio != null) {
                    arrayList27.add(assistTurnoverRatio);
                }
                it41 = it42;
            }
            return new BasketballPlayerSeasonStatistics(i2, type, m690nullableSum, nullableSum, nullableSum2, m690nullableSum2, m690nullableSum3, m690nullableSum4, m690nullableSum5, m690nullableSum6, m690nullableSum7, m690nullableSum8, m690nullableSum9, m690nullableSum10, m690nullableSum11, m690nullableSum12, m690nullableSum13, m690nullableSum14, m690nullableSum15, m690nullableSum16, m690nullableSum17, m690nullableSum18, m690nullableSum19, m690nullableSum20, m690nullableSum21, m690nullableSum22, null, null, null, null, m690nullableSum23, m690nullableSum24, companion27.nullableSum((List<Double>) arrayList27), null, null, null, null, null, null);
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketballPlayerSeasonStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BasketballPlayerSeasonStatistics(int i, @NotNull String str, @Nullable Integer num, @Nullable Double d, @Nullable Double d2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Double d6, @Nullable Integer num23, @Nullable Integer num24, @Nullable Double d7, @Nullable Double d8, @Nullable Double d9, @Nullable Double d10, @Nullable Double d11, @Nullable Double d12, @Nullable Double d13) {
        str.getClass();
        this.id = i;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.totalRating = d2;
        this.countRating = num2;
        this.secondsPlayed = num3;
        this.points = num4;
        this.twoPointsMade = num5;
        this.twoPointAttempts = num6;
        this.threePointsMade = num7;
        this.threePointAttempts = num8;
        this.freeThrowsMade = num9;
        this.freeThrowAttempts = num10;
        this.fieldGoalsMade = num11;
        this.fieldGoalAttempts = num12;
        this.rebounds = num13;
        this.defensiveRebounds = num14;
        this.offensiveRebounds = num15;
        this.turnovers = num16;
        this.blocks = num17;
        this.personalFouls = num18;
        this.assists = num19;
        this.steals = num20;
        this.plusMinus = num21;
        this.pir = num22;
        this.fieldGoalsPercentage = d3;
        this.freeThrowsPercentage = d4;
        this.threePointsPercentage = d5;
        this.twoPointsPercentage = d6;
        this.doubleDoubles = num23;
        this.tripleDoubles = num24;
        this.assistTurnoverRatio = d7;
        this.trueShootingPercentage = d8;
        this.effectiveFieldGoalPercentage = d9;
        this.usage = d10;
        this.individualOffensiveRating = d11;
        this.individualDefensiveRating = d12;
        this.playerEfficiencyRating = d13;
    }
}
