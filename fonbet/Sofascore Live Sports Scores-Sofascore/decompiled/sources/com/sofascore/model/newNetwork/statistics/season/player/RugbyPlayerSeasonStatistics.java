package com.sofascore.model.newNetwork.statistics.season.player;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.internal.protos.Sdk;
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
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b1\b\u0087\b\u0018\u0000 \u009e\u00012\u00020\u00012\u00020\u0002:\u0004\u009f\u0001\u009e\u0001B\u0089\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b-\u0010.B§\u0003\b\u0010\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b-\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b?\u0010<J\u0012\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b@\u0010<J\u0012\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bA\u0010<J\u0012\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bB\u0010<J\u0012\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bC\u0010<J\u0012\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bD\u0010<J\u0012\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bE\u0010<J\u0012\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bF\u0010<J\u0012\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bG\u0010<J\u0012\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bH\u0010<J\u0012\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bI\u0010<J\u0012\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bJ\u0010<J\u0012\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bK\u0010<J\u0012\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bL\u0010<J\u0012\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bM\u0010<J\u0012\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bN\u0010<J\u0012\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bO\u0010<J\u0012\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bP\u0010<J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bQ\u0010<J\u0012\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bR\u0010<J\u0012\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bS\u0010<J\u0012\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bT\u0010<J\u0012\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bU\u0010<J\u0012\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bV\u0010<J\u0012\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bW\u0010<J\u0012\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bX\u0010<J\u0012\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bY\u0010<J\u0012\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bZ\u0010<J\u0012\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b[\u0010<J\u0012\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\\\u0010<J\u0012\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b]\u0010<J\u0012\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b^\u0010<J\u0012\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b_\u0010<J\u0012\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b`\u0010<J\u0012\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\ba\u0010<Jà\u0003\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bd\u0010:J\u0010\u0010e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\be\u00108J\u001a\u0010h\u001a\u0002042\b\u0010g\u001a\u0004\u0018\u00010fHÖ\u0003¢\u0006\u0004\bh\u0010iJ'\u0010r\u001a\u00020o2\u0006\u0010j\u001a\u00020\u00002\u0006\u0010l\u001a\u00020k2\u0006\u0010n\u001a\u00020mH\u0001¢\u0006\u0004\bp\u0010qR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010s\u001a\u0004\bt\u00108R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010u\u001a\u0004\bv\u0010:R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010w\u001a\u0004\bx\u0010<R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010y\u001a\u0004\bz\u0010>R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010w\u001a\u0004\b{\u0010<R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010w\u001a\u0004\b|\u0010<R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010w\u001a\u0004\b}\u0010<R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010w\u001a\u0004\b~\u0010<R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010w\u001a\u0004\b\u007f\u0010<R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u000f\u0010w\u001a\u0005\b\u0080\u0001\u0010<R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0010\u0010w\u001a\u0005\b\u0081\u0001\u0010<R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0011\u0010w\u001a\u0005\b\u0082\u0001\u0010<R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0012\u0010w\u001a\u0005\b\u0083\u0001\u0010<R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0013\u0010w\u001a\u0005\b\u0084\u0001\u0010<R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0014\u0010w\u001a\u0005\b\u0085\u0001\u0010<R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0015\u0010w\u001a\u0005\b\u0086\u0001\u0010<R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0016\u0010w\u001a\u0005\b\u0087\u0001\u0010<R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0017\u0010w\u001a\u0005\b\u0088\u0001\u0010<R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0018\u0010w\u001a\u0005\b\u0089\u0001\u0010<R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u0019\u0010w\u001a\u0005\b\u008a\u0001\u0010<R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001a\u0010w\u001a\u0005\b\u008b\u0001\u0010<R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001b\u0010w\u001a\u0005\b\u008c\u0001\u0010<R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001c\u0010w\u001a\u0005\b\u008d\u0001\u0010<R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001d\u0010w\u001a\u0005\b\u008e\u0001\u0010<R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001e\u0010w\u001a\u0005\b\u008f\u0001\u0010<R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\u001f\u0010w\u001a\u0005\b\u0090\u0001\u0010<R\u001a\u0010 \u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b \u0010w\u001a\u0005\b\u0091\u0001\u0010<R\u001a\u0010!\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b!\u0010w\u001a\u0005\b\u0092\u0001\u0010<R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b\"\u0010w\u001a\u0005\b\u0093\u0001\u0010<R\u001a\u0010#\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b#\u0010w\u001a\u0005\b\u0094\u0001\u0010<R\u001a\u0010$\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b$\u0010w\u001a\u0005\b\u0095\u0001\u0010<R\u001a\u0010%\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b%\u0010w\u001a\u0005\b\u0096\u0001\u0010<R\u001a\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b&\u0010w\u001a\u0005\b\u0097\u0001\u0010<R\u001a\u0010'\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b'\u0010w\u001a\u0005\b\u0098\u0001\u0010<R\u001a\u0010(\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b(\u0010w\u001a\u0005\b\u0099\u0001\u0010<R\u001a\u0010)\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b)\u0010w\u001a\u0005\b\u009a\u0001\u0010<R\u001a\u0010*\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b*\u0010w\u001a\u0005\b\u009b\u0001\u0010<R\u001a\u0010+\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b+\u0010w\u001a\u0005\b\u009c\u0001\u0010<R\u001a\u0010,\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b,\u0010w\u001a\u0005\b\u009d\u0001\u0010<¨\u0006 \u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/RugbyPlayerSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "Ljava/io/Serializable;", "", "id", "", "type", "appearances", "", CampaignEx.JSON_KEY_STAR, "points", "tries", "carries", "minutesPlayed", "penaltyGoals", "penaltyGoalsMissed", "conversions", "conversionMissed", "dropGoals", "passesTotal", "passesSuccessful", "offloads", "cleanBreaks", "defendersBeaten", "metresMade", "handlingError", "carriesCrossedGainLine", "carriesNotMadeGainLine", "postContactMetres", "tryAssist", "tackles", "tacklesTotal", "dominantTackles", "penDefs", "penOffs", "lineoutsToOwnPlayer", "lineoutsWon", "lineoutWonSteal", "kickMetres", "kicksFromHand", "ruckArrival", "ruckArrivalAttack", "ruckArrivalDefence", "yellowCards", "redCards", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "", "sportHasRating", "()Z", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/statistics/season/player/RugbyPlayerSeasonStatistics;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/RugbyPlayerSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getType", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/Double;", "getRating", "getPoints", "getTries", "getCarries", "getMinutesPlayed", "getPenaltyGoals", "getPenaltyGoalsMissed", "getConversions", "getConversionMissed", "getDropGoals", "getPassesTotal", "getPassesSuccessful", "getOffloads", "getCleanBreaks", "getDefendersBeaten", "getMetresMade", "getHandlingError", "getCarriesCrossedGainLine", "getCarriesNotMadeGainLine", "getPostContactMetres", "getTryAssist", "getTackles", "getTacklesTotal", "getDominantTackles", "getPenDefs", "getPenOffs", "getLineoutsToOwnPlayer", "getLineoutsWon", "getLineoutWonSteal", "getKickMetres", "getKicksFromHand", "getRuckArrival", "getRuckArrivalAttack", "getRuckArrivalDefence", "getYellowCards", "getRedCards", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RugbyPlayerSeasonStatistics extends AbstractPlayerSeasonStatistics implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Integer carries;

    @Nullable
    private final Integer carriesCrossedGainLine;

    @Nullable
    private final Integer carriesNotMadeGainLine;

    @Nullable
    private final Integer cleanBreaks;

    @Nullable
    private final Integer conversionMissed;

    @Nullable
    private final Integer conversions;

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
    private final Integer kickMetres;

    @Nullable
    private final Integer kicksFromHand;

    @Nullable
    private final Integer lineoutWonSteal;

    @Nullable
    private final Integer lineoutsToOwnPlayer;

    @Nullable
    private final Integer lineoutsWon;

    @Nullable
    private final Integer metresMade;

    @Nullable
    private final Integer minutesPlayed;

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
    private final Integer penaltyGoalsMissed;

    @Nullable
    private final Integer points;

    @Nullable
    private final Integer postContactMetres;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer redCards;

    @Nullable
    private final Integer ruckArrival;

    @Nullable
    private final Integer ruckArrivalAttack;

    @Nullable
    private final Integer ruckArrivalDefence;

    @Nullable
    private final Integer tackles;

    @Nullable
    private final Integer tacklesTotal;

    @Nullable
    private final Integer tries;

    @Nullable
    private final Integer tryAssist;

    @NotNull
    private final String type;

    @Nullable
    private final Integer yellowCards;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RugbyPlayerSeasonStatistics(int i, int i2, int i3, String str, Integer num, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, Integer num35, Integer num36, t5h t5hVar) {
        super(i, t5hVar);
        if ((127 != (i2 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE}, RugbyPlayerSeasonStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.points = num2;
        this.tries = num3;
        this.carries = num4;
        this.minutesPlayed = num5;
        this.penaltyGoals = num6;
        this.penaltyGoalsMissed = num7;
        this.conversions = num8;
        this.conversionMissed = num9;
        this.dropGoals = num10;
        this.passesTotal = num11;
        this.passesSuccessful = num12;
        this.offloads = num13;
        this.cleanBreaks = num14;
        this.defendersBeaten = num15;
        this.metresMade = num16;
        this.handlingError = num17;
        this.carriesCrossedGainLine = num18;
        this.carriesNotMadeGainLine = num19;
        this.postContactMetres = num20;
        this.tryAssist = num21;
        this.tackles = num22;
        this.tacklesTotal = num23;
        this.dominantTackles = num24;
        this.penDefs = num25;
        this.penOffs = num26;
        this.lineoutsToOwnPlayer = num27;
        this.lineoutsWon = num28;
        this.lineoutWonSteal = num29;
        this.kickMetres = num30;
        this.kicksFromHand = num31;
        this.ruckArrival = num32;
        this.ruckArrivalAttack = num33;
        this.ruckArrivalDefence = num34;
        this.yellowCards = num35;
        this.redCards = num36;
    }

    public static /* synthetic */ RugbyPlayerSeasonStatistics copy$default(RugbyPlayerSeasonStatistics rugbyPlayerSeasonStatistics, int i, String str, Integer num, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, Integer num35, Integer num36, int i2, int i3, Object obj) {
        Integer num37;
        Integer num38;
        Integer num39;
        Integer num40;
        Integer num41;
        Integer num42;
        Integer num43;
        Integer num44;
        Integer num45;
        Integer num46;
        Integer num47;
        Integer num48;
        Integer num49;
        Integer num50;
        Integer num51;
        Integer num52;
        Integer num53;
        Integer num54;
        Integer num55;
        Integer num56;
        Integer num57;
        Integer num58;
        Integer num59;
        Integer num60;
        Integer num61;
        Integer num62;
        Integer num63;
        Integer num64;
        Integer num65;
        Integer num66;
        Integer num67;
        Integer num68;
        String str2;
        Integer num69;
        Double d2;
        Integer num70;
        Integer num71;
        Integer num72;
        int i4 = (i2 & 1) != 0 ? rugbyPlayerSeasonStatistics.id : i;
        String str3 = (i2 & 2) != 0 ? rugbyPlayerSeasonStatistics.type : str;
        Integer num73 = (i2 & 4) != 0 ? rugbyPlayerSeasonStatistics.appearances : num;
        Double d3 = (i2 & 8) != 0 ? rugbyPlayerSeasonStatistics.rating : d;
        Integer num74 = (i2 & 16) != 0 ? rugbyPlayerSeasonStatistics.points : num2;
        Integer num75 = (i2 & 32) != 0 ? rugbyPlayerSeasonStatistics.tries : num3;
        Integer num76 = (i2 & 64) != 0 ? rugbyPlayerSeasonStatistics.carries : num4;
        Integer num77 = (i2 & 128) != 0 ? rugbyPlayerSeasonStatistics.minutesPlayed : num5;
        Integer num78 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? rugbyPlayerSeasonStatistics.penaltyGoals : num6;
        Integer num79 = (i2 & 512) != 0 ? rugbyPlayerSeasonStatistics.penaltyGoalsMissed : num7;
        Integer num80 = (i2 & 1024) != 0 ? rugbyPlayerSeasonStatistics.conversions : num8;
        Integer num81 = (i2 & a.o) != 0 ? rugbyPlayerSeasonStatistics.conversionMissed : num9;
        Integer num82 = (i2 & 4096) != 0 ? rugbyPlayerSeasonStatistics.dropGoals : num10;
        Integer num83 = (i2 & 8192) != 0 ? rugbyPlayerSeasonStatistics.passesTotal : num11;
        int i5 = i4;
        Integer num84 = (i2 & 16384) != 0 ? rugbyPlayerSeasonStatistics.passesSuccessful : num12;
        Integer num85 = (i2 & 32768) != 0 ? rugbyPlayerSeasonStatistics.offloads : num13;
        Integer num86 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? rugbyPlayerSeasonStatistics.cleanBreaks : num14;
        Integer num87 = (i2 & 131072) != 0 ? rugbyPlayerSeasonStatistics.defendersBeaten : num15;
        Integer num88 = (i2 & 262144) != 0 ? rugbyPlayerSeasonStatistics.metresMade : num16;
        Integer num89 = (i2 & 524288) != 0 ? rugbyPlayerSeasonStatistics.handlingError : num17;
        Integer num90 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? rugbyPlayerSeasonStatistics.carriesCrossedGainLine : num18;
        Integer num91 = (i2 & 2097152) != 0 ? rugbyPlayerSeasonStatistics.carriesNotMadeGainLine : num19;
        Integer num92 = (i2 & 4194304) != 0 ? rugbyPlayerSeasonStatistics.postContactMetres : num20;
        Integer num93 = (i2 & 8388608) != 0 ? rugbyPlayerSeasonStatistics.tryAssist : num21;
        Integer num94 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? rugbyPlayerSeasonStatistics.tackles : num22;
        Integer num95 = (i2 & 33554432) != 0 ? rugbyPlayerSeasonStatistics.tacklesTotal : num23;
        Integer num96 = (i2 & 67108864) != 0 ? rugbyPlayerSeasonStatistics.dominantTackles : num24;
        Integer num97 = (i2 & 134217728) != 0 ? rugbyPlayerSeasonStatistics.penDefs : num25;
        Integer num98 = (i2 & 268435456) != 0 ? rugbyPlayerSeasonStatistics.penOffs : num26;
        Integer num99 = (i2 & 536870912) != 0 ? rugbyPlayerSeasonStatistics.lineoutsToOwnPlayer : num27;
        Integer num100 = (i2 & 1073741824) != 0 ? rugbyPlayerSeasonStatistics.lineoutsWon : num28;
        Integer num101 = (i2 & Integer.MIN_VALUE) != 0 ? rugbyPlayerSeasonStatistics.lineoutWonSteal : num29;
        Integer num102 = (i3 & 1) != 0 ? rugbyPlayerSeasonStatistics.kickMetres : num30;
        Integer num103 = (i3 & 2) != 0 ? rugbyPlayerSeasonStatistics.kicksFromHand : num31;
        Integer num104 = (i3 & 4) != 0 ? rugbyPlayerSeasonStatistics.ruckArrival : num32;
        Integer num105 = (i3 & 8) != 0 ? rugbyPlayerSeasonStatistics.ruckArrivalAttack : num33;
        Integer num106 = (i3 & 16) != 0 ? rugbyPlayerSeasonStatistics.ruckArrivalDefence : num34;
        Integer num107 = (i3 & 32) != 0 ? rugbyPlayerSeasonStatistics.yellowCards : num35;
        if ((i3 & 64) != 0) {
            num38 = num107;
            num37 = rugbyPlayerSeasonStatistics.redCards;
            num40 = num93;
            num41 = num94;
            num42 = num95;
            num43 = num96;
            num44 = num97;
            num45 = num98;
            num46 = num99;
            num47 = num100;
            num48 = num101;
            num49 = num102;
            num50 = num103;
            num51 = num104;
            num52 = num105;
            num53 = num106;
            num54 = num84;
            num56 = num78;
            num57 = num79;
            num58 = num80;
            num59 = num81;
            num60 = num82;
            num61 = num83;
            num62 = num85;
            num63 = num86;
            num64 = num87;
            num65 = num88;
            num66 = num89;
            num67 = num90;
            num68 = num91;
            num39 = num92;
            str2 = str3;
            num69 = num73;
            d2 = d3;
            num70 = num74;
            num71 = num75;
            num72 = num76;
            num55 = num77;
        } else {
            num37 = num36;
            num38 = num107;
            num39 = num92;
            num40 = num93;
            num41 = num94;
            num42 = num95;
            num43 = num96;
            num44 = num97;
            num45 = num98;
            num46 = num99;
            num47 = num100;
            num48 = num101;
            num49 = num102;
            num50 = num103;
            num51 = num104;
            num52 = num105;
            num53 = num106;
            num54 = num84;
            num55 = num77;
            num56 = num78;
            num57 = num79;
            num58 = num80;
            num59 = num81;
            num60 = num82;
            num61 = num83;
            num62 = num85;
            num63 = num86;
            num64 = num87;
            num65 = num88;
            num66 = num89;
            num67 = num90;
            num68 = num91;
            str2 = str3;
            num69 = num73;
            d2 = d3;
            num70 = num74;
            num71 = num75;
            num72 = num76;
        }
        return rugbyPlayerSeasonStatistics.copy(i5, str2, num69, d2, num70, num71, num72, num55, num56, num57, num58, num59, num60, num61, num54, num62, num63, num64, num65, num66, num67, num68, num39, num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51, num52, num53, num38, num37);
    }

    public static final /* synthetic */ void write$Self$model_release(RugbyPlayerSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
        AbstractPlayerSeasonStatistics.write$Self(self, output, serialDesc);
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.getType());
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.getAppearances());
        output.h(serialDesc, 3, h75.a, self.getRating());
        output.h(serialDesc, 4, a7aVar, self.points);
        output.h(serialDesc, 5, a7aVar, self.tries);
        output.h(serialDesc, 6, a7aVar, self.carries);
        output.h(serialDesc, 7, a7aVar, self.minutesPlayed);
        output.h(serialDesc, 8, a7aVar, self.penaltyGoals);
        output.h(serialDesc, 9, a7aVar, self.penaltyGoalsMissed);
        output.h(serialDesc, 10, a7aVar, self.conversions);
        output.h(serialDesc, 11, a7aVar, self.conversionMissed);
        output.h(serialDesc, 12, a7aVar, self.dropGoals);
        output.h(serialDesc, 13, a7aVar, self.passesTotal);
        output.h(serialDesc, 14, a7aVar, self.passesSuccessful);
        output.h(serialDesc, 15, a7aVar, self.offloads);
        output.h(serialDesc, 16, a7aVar, self.cleanBreaks);
        output.h(serialDesc, 17, a7aVar, self.defendersBeaten);
        output.h(serialDesc, 18, a7aVar, self.metresMade);
        output.h(serialDesc, 19, a7aVar, self.handlingError);
        output.h(serialDesc, 20, a7aVar, self.carriesCrossedGainLine);
        output.h(serialDesc, 21, a7aVar, self.carriesNotMadeGainLine);
        output.h(serialDesc, 22, a7aVar, self.postContactMetres);
        output.h(serialDesc, 23, a7aVar, self.tryAssist);
        output.h(serialDesc, 24, a7aVar, self.tackles);
        output.h(serialDesc, 25, a7aVar, self.tacklesTotal);
        output.h(serialDesc, 26, a7aVar, self.dominantTackles);
        output.h(serialDesc, 27, a7aVar, self.penDefs);
        output.h(serialDesc, 28, a7aVar, self.penOffs);
        output.h(serialDesc, 29, a7aVar, self.lineoutsToOwnPlayer);
        output.h(serialDesc, 30, a7aVar, self.lineoutsWon);
        output.h(serialDesc, 31, a7aVar, self.lineoutWonSteal);
        output.h(serialDesc, 32, a7aVar, self.kickMetres);
        output.h(serialDesc, 33, a7aVar, self.kicksFromHand);
        output.h(serialDesc, 34, a7aVar, self.ruckArrival);
        output.h(serialDesc, 35, a7aVar, self.ruckArrivalAttack);
        output.h(serialDesc, 36, a7aVar, self.ruckArrivalDefence);
        output.h(serialDesc, 37, a7aVar, self.yellowCards);
        output.h(serialDesc, 38, a7aVar, self.redCards);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getPenaltyGoalsMissed() {
        return this.penaltyGoalsMissed;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getConversions() {
        return this.conversions;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getConversionMissed() {
        return this.conversionMissed;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getDropGoals() {
        return this.dropGoals;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getPassesTotal() {
        return this.passesTotal;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getPassesSuccessful() {
        return this.passesSuccessful;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getOffloads() {
        return this.offloads;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getCleanBreaks() {
        return this.cleanBreaks;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getDefendersBeaten() {
        return this.defendersBeaten;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getMetresMade() {
        return this.metresMade;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getHandlingError() {
        return this.handlingError;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getCarriesCrossedGainLine() {
        return this.carriesCrossedGainLine;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getCarriesNotMadeGainLine() {
        return this.carriesNotMadeGainLine;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getPostContactMetres() {
        return this.postContactMetres;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getTryAssist() {
        return this.tryAssist;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getTackles() {
        return this.tackles;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getTacklesTotal() {
        return this.tacklesTotal;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getDominantTackles() {
        return this.dominantTackles;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getPenDefs() {
        return this.penDefs;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Integer getPenOffs() {
        return this.penOffs;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getLineoutsToOwnPlayer() {
        return this.lineoutsToOwnPlayer;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getLineoutsWon() {
        return this.lineoutsWon;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getLineoutWonSteal() {
        return this.lineoutWonSteal;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Integer getKickMetres() {
        return this.kickMetres;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Integer getKicksFromHand() {
        return this.kicksFromHand;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Integer getRuckArrival() {
        return this.ruckArrival;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final Integer getRuckArrivalAttack() {
        return this.ruckArrivalAttack;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final Integer getRuckArrivalDefence() {
        return this.ruckArrivalDefence;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getTries() {
        return this.tries;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getCarries() {
        return this.carries;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getMinutesPlayed() {
        return this.minutesPlayed;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @NotNull
    public final RugbyPlayerSeasonStatistics copy(int id, @NotNull String type, @Nullable Integer appearances, @Nullable Double rating, @Nullable Integer points, @Nullable Integer tries, @Nullable Integer carries, @Nullable Integer minutesPlayed, @Nullable Integer penaltyGoals, @Nullable Integer penaltyGoalsMissed, @Nullable Integer conversions, @Nullable Integer conversionMissed, @Nullable Integer dropGoals, @Nullable Integer passesTotal, @Nullable Integer passesSuccessful, @Nullable Integer offloads, @Nullable Integer cleanBreaks, @Nullable Integer defendersBeaten, @Nullable Integer metresMade, @Nullable Integer handlingError, @Nullable Integer carriesCrossedGainLine, @Nullable Integer carriesNotMadeGainLine, @Nullable Integer postContactMetres, @Nullable Integer tryAssist, @Nullable Integer tackles, @Nullable Integer tacklesTotal, @Nullable Integer dominantTackles, @Nullable Integer penDefs, @Nullable Integer penOffs, @Nullable Integer lineoutsToOwnPlayer, @Nullable Integer lineoutsWon, @Nullable Integer lineoutWonSteal, @Nullable Integer kickMetres, @Nullable Integer kicksFromHand, @Nullable Integer ruckArrival, @Nullable Integer ruckArrivalAttack, @Nullable Integer ruckArrivalDefence, @Nullable Integer yellowCards, @Nullable Integer redCards) {
        type.getClass();
        return new RugbyPlayerSeasonStatistics(id, type, appearances, rating, points, tries, carries, minutesPlayed, penaltyGoals, penaltyGoalsMissed, conversions, conversionMissed, dropGoals, passesTotal, passesSuccessful, offloads, cleanBreaks, defendersBeaten, metresMade, handlingError, carriesCrossedGainLine, carriesNotMadeGainLine, postContactMetres, tryAssist, tackles, tacklesTotal, dominantTackles, penDefs, penOffs, lineoutsToOwnPlayer, lineoutsWon, lineoutWonSteal, kickMetres, kicksFromHand, ruckArrival, ruckArrivalAttack, ruckArrivalDefence, yellowCards, redCards);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RugbyPlayerSeasonStatistics)) {
            return false;
        }
        RugbyPlayerSeasonStatistics rugbyPlayerSeasonStatistics = (RugbyPlayerSeasonStatistics) other;
        return this.id == rugbyPlayerSeasonStatistics.id && Intrinsics.c(this.type, rugbyPlayerSeasonStatistics.type) && Intrinsics.c(this.appearances, rugbyPlayerSeasonStatistics.appearances) && Intrinsics.c(this.rating, rugbyPlayerSeasonStatistics.rating) && Intrinsics.c(this.points, rugbyPlayerSeasonStatistics.points) && Intrinsics.c(this.tries, rugbyPlayerSeasonStatistics.tries) && Intrinsics.c(this.carries, rugbyPlayerSeasonStatistics.carries) && Intrinsics.c(this.minutesPlayed, rugbyPlayerSeasonStatistics.minutesPlayed) && Intrinsics.c(this.penaltyGoals, rugbyPlayerSeasonStatistics.penaltyGoals) && Intrinsics.c(this.penaltyGoalsMissed, rugbyPlayerSeasonStatistics.penaltyGoalsMissed) && Intrinsics.c(this.conversions, rugbyPlayerSeasonStatistics.conversions) && Intrinsics.c(this.conversionMissed, rugbyPlayerSeasonStatistics.conversionMissed) && Intrinsics.c(this.dropGoals, rugbyPlayerSeasonStatistics.dropGoals) && Intrinsics.c(this.passesTotal, rugbyPlayerSeasonStatistics.passesTotal) && Intrinsics.c(this.passesSuccessful, rugbyPlayerSeasonStatistics.passesSuccessful) && Intrinsics.c(this.offloads, rugbyPlayerSeasonStatistics.offloads) && Intrinsics.c(this.cleanBreaks, rugbyPlayerSeasonStatistics.cleanBreaks) && Intrinsics.c(this.defendersBeaten, rugbyPlayerSeasonStatistics.defendersBeaten) && Intrinsics.c(this.metresMade, rugbyPlayerSeasonStatistics.metresMade) && Intrinsics.c(this.handlingError, rugbyPlayerSeasonStatistics.handlingError) && Intrinsics.c(this.carriesCrossedGainLine, rugbyPlayerSeasonStatistics.carriesCrossedGainLine) && Intrinsics.c(this.carriesNotMadeGainLine, rugbyPlayerSeasonStatistics.carriesNotMadeGainLine) && Intrinsics.c(this.postContactMetres, rugbyPlayerSeasonStatistics.postContactMetres) && Intrinsics.c(this.tryAssist, rugbyPlayerSeasonStatistics.tryAssist) && Intrinsics.c(this.tackles, rugbyPlayerSeasonStatistics.tackles) && Intrinsics.c(this.tacklesTotal, rugbyPlayerSeasonStatistics.tacklesTotal) && Intrinsics.c(this.dominantTackles, rugbyPlayerSeasonStatistics.dominantTackles) && Intrinsics.c(this.penDefs, rugbyPlayerSeasonStatistics.penDefs) && Intrinsics.c(this.penOffs, rugbyPlayerSeasonStatistics.penOffs) && Intrinsics.c(this.lineoutsToOwnPlayer, rugbyPlayerSeasonStatistics.lineoutsToOwnPlayer) && Intrinsics.c(this.lineoutsWon, rugbyPlayerSeasonStatistics.lineoutsWon) && Intrinsics.c(this.lineoutWonSteal, rugbyPlayerSeasonStatistics.lineoutWonSteal) && Intrinsics.c(this.kickMetres, rugbyPlayerSeasonStatistics.kickMetres) && Intrinsics.c(this.kicksFromHand, rugbyPlayerSeasonStatistics.kicksFromHand) && Intrinsics.c(this.ruckArrival, rugbyPlayerSeasonStatistics.ruckArrival) && Intrinsics.c(this.ruckArrivalAttack, rugbyPlayerSeasonStatistics.ruckArrivalAttack) && Intrinsics.c(this.ruckArrivalDefence, rugbyPlayerSeasonStatistics.ruckArrivalDefence) && Intrinsics.c(this.yellowCards, rugbyPlayerSeasonStatistics.yellowCards) && Intrinsics.c(this.redCards, rugbyPlayerSeasonStatistics.redCards);
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Integer getAppearances() {
        return this.appearances;
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
    public final Integer getConversionMissed() {
        return this.conversionMissed;
    }

    @Nullable
    public final Integer getConversions() {
        return this.conversions;
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

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getKickMetres() {
        return this.kickMetres;
    }

    @Nullable
    public final Integer getKicksFromHand() {
        return this.kicksFromHand;
    }

    @Nullable
    public final Integer getLineoutWonSteal() {
        return this.lineoutWonSteal;
    }

    @Nullable
    public final Integer getLineoutsToOwnPlayer() {
        return this.lineoutsToOwnPlayer;
    }

    @Nullable
    public final Integer getLineoutsWon() {
        return this.lineoutsWon;
    }

    @Nullable
    public final Integer getMetresMade() {
        return this.metresMade;
    }

    @Nullable
    public final Integer getMinutesPlayed() {
        return this.minutesPlayed;
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
    public final Integer getPenaltyGoalsMissed() {
        return this.penaltyGoalsMissed;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPostContactMetres() {
        return this.postContactMetres;
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    @Nullable
    public Double getRating() {
        return this.rating;
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
    public final Integer getTryAssist() {
        return this.tryAssist;
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
        Integer num2 = this.points;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.tries;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.carries;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.minutesPlayed;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.penaltyGoals;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.penaltyGoalsMissed;
        int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.conversions;
        int hashCode9 = (hashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.conversionMissed;
        int hashCode10 = (hashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.dropGoals;
        int hashCode11 = (hashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.passesTotal;
        int hashCode12 = (hashCode11 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.passesSuccessful;
        int hashCode13 = (hashCode12 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.offloads;
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
        Integer num21 = this.tryAssist;
        int hashCode22 = (hashCode21 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.tackles;
        int hashCode23 = (hashCode22 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.tacklesTotal;
        int hashCode24 = (hashCode23 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.dominantTackles;
        int hashCode25 = (hashCode24 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.penDefs;
        int hashCode26 = (hashCode25 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.penOffs;
        int hashCode27 = (hashCode26 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.lineoutsToOwnPlayer;
        int hashCode28 = (hashCode27 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Integer num28 = this.lineoutsWon;
        int hashCode29 = (hashCode28 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Integer num29 = this.lineoutWonSteal;
        int hashCode30 = (hashCode29 + (num29 == null ? 0 : num29.hashCode())) * 31;
        Integer num30 = this.kickMetres;
        int hashCode31 = (hashCode30 + (num30 == null ? 0 : num30.hashCode())) * 31;
        Integer num31 = this.kicksFromHand;
        int hashCode32 = (hashCode31 + (num31 == null ? 0 : num31.hashCode())) * 31;
        Integer num32 = this.ruckArrival;
        int hashCode33 = (hashCode32 + (num32 == null ? 0 : num32.hashCode())) * 31;
        Integer num33 = this.ruckArrivalAttack;
        int hashCode34 = (hashCode33 + (num33 == null ? 0 : num33.hashCode())) * 31;
        Integer num34 = this.ruckArrivalDefence;
        int hashCode35 = (hashCode34 + (num34 == null ? 0 : num34.hashCode())) * 31;
        Integer num35 = this.yellowCards;
        int hashCode36 = (hashCode35 + (num35 == null ? 0 : num35.hashCode())) * 31;
        Integer num36 = this.redCards;
        return hashCode36 + (num36 != null ? num36.hashCode() : 0);
    }

    @Override // com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics
    public boolean sportHasRating() {
        return false;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        Integer num = this.appearances;
        Double d = this.rating;
        Integer num2 = this.points;
        Integer num3 = this.tries;
        Integer num4 = this.carries;
        Integer num5 = this.minutesPlayed;
        Integer num6 = this.penaltyGoals;
        Integer num7 = this.penaltyGoalsMissed;
        Integer num8 = this.conversions;
        Integer num9 = this.conversionMissed;
        Integer num10 = this.dropGoals;
        Integer num11 = this.passesTotal;
        Integer num12 = this.passesSuccessful;
        Integer num13 = this.offloads;
        Integer num14 = this.cleanBreaks;
        Integer num15 = this.defendersBeaten;
        Integer num16 = this.metresMade;
        Integer num17 = this.handlingError;
        Integer num18 = this.carriesCrossedGainLine;
        Integer num19 = this.carriesNotMadeGainLine;
        Integer num20 = this.postContactMetres;
        Integer num21 = this.tryAssist;
        Integer num22 = this.tackles;
        Integer num23 = this.tacklesTotal;
        Integer num24 = this.dominantTackles;
        Integer num25 = this.penDefs;
        Integer num26 = this.penOffs;
        Integer num27 = this.lineoutsToOwnPlayer;
        Integer num28 = this.lineoutsWon;
        Integer num29 = this.lineoutWonSteal;
        Integer num30 = this.kickMetres;
        Integer num31 = this.kicksFromHand;
        Integer num32 = this.ruckArrival;
        Integer num33 = this.ruckArrivalAttack;
        Integer num34 = this.ruckArrivalDefence;
        Integer num35 = this.yellowCards;
        Integer num36 = this.redCards;
        StringBuilder t = dmi.t(i, "RugbyPlayerSeasonStatistics(id=", ", type=", str, ", appearances=");
        fn0.v(d, num, ", rating=", ", points=", t);
        vxd.r(num2, num3, ", tries=", ", carries=", t);
        vxd.r(num4, num5, ", minutesPlayed=", ", penaltyGoals=", t);
        vxd.r(num6, num7, ", penaltyGoalsMissed=", ", conversions=", t);
        vxd.r(num8, num9, ", conversionMissed=", ", dropGoals=", t);
        vxd.r(num10, num11, ", passesTotal=", ", passesSuccessful=", t);
        vxd.r(num12, num13, ", offloads=", ", cleanBreaks=", t);
        vxd.r(num14, num15, ", defendersBeaten=", ", metresMade=", t);
        vxd.r(num16, num17, ", handlingError=", ", carriesCrossedGainLine=", t);
        vxd.r(num18, num19, ", carriesNotMadeGainLine=", ", postContactMetres=", t);
        vxd.r(num20, num21, ", tryAssist=", ", tackles=", t);
        vxd.r(num22, num23, ", tacklesTotal=", ", dominantTackles=", t);
        vxd.r(num24, num25, ", penDefs=", ", penOffs=", t);
        vxd.r(num26, num27, ", lineoutsToOwnPlayer=", ", lineoutsWon=", t);
        vxd.r(num28, num29, ", lineoutWonSteal=", ", kickMetres=", t);
        vxd.r(num30, num31, ", kicksFromHand=", ", ruckArrival=", t);
        vxd.r(num32, num33, ", ruckArrivalAttack=", ", ruckArrivalDefence=", t);
        vxd.r(num34, num35, ", yellowCards=", ", redCards=", t);
        return vxd.n(t, num36, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/RugbyPlayerSeasonStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/player/RugbyPlayerSeasonStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RugbyPlayerSeasonStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RugbyPlayerSeasonStatistics(int i, @NotNull String str, @Nullable Integer num, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24, @Nullable Integer num25, @Nullable Integer num26, @Nullable Integer num27, @Nullable Integer num28, @Nullable Integer num29, @Nullable Integer num30, @Nullable Integer num31, @Nullable Integer num32, @Nullable Integer num33, @Nullable Integer num34, @Nullable Integer num35, @Nullable Integer num36) {
        str.getClass();
        this.id = i;
        this.type = str;
        this.appearances = num;
        this.rating = d;
        this.points = num2;
        this.tries = num3;
        this.carries = num4;
        this.minutesPlayed = num5;
        this.penaltyGoals = num6;
        this.penaltyGoalsMissed = num7;
        this.conversions = num8;
        this.conversionMissed = num9;
        this.dropGoals = num10;
        this.passesTotal = num11;
        this.passesSuccessful = num12;
        this.offloads = num13;
        this.cleanBreaks = num14;
        this.defendersBeaten = num15;
        this.metresMade = num16;
        this.handlingError = num17;
        this.carriesCrossedGainLine = num18;
        this.carriesNotMadeGainLine = num19;
        this.postContactMetres = num20;
        this.tryAssist = num21;
        this.tackles = num22;
        this.tacklesTotal = num23;
        this.dominantTackles = num24;
        this.penDefs = num25;
        this.penOffs = num26;
        this.lineoutsToOwnPlayer = num27;
        this.lineoutsWon = num28;
        this.lineoutWonSteal = num29;
        this.kickMetres = num30;
        this.kicksFromHand = num31;
        this.ruckArrival = num32;
        this.ruckArrivalAttack = num33;
        this.ruckArrivalDefence = num34;
        this.yellowCards = num35;
        this.redCards = num36;
    }
}
