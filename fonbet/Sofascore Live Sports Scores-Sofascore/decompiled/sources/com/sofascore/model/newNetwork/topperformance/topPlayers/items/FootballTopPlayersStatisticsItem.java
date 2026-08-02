package com.sofascore.model.newNetwork.topperformance.topPlayers.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b1\b\u0087\b\u0018\u0000 \u009b\u00012\u00020\u0001:\u0004\u009c\u0001\u009b\u0001B\u0089\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\b\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b,\u0010-B§\u0003\b\u0010\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\b\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\b\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b,\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u00106J\u0012\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u00106J\u0012\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b=\u0010;J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u00106J\u0012\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b?\u0010;J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u00106J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u00106J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u00106J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00106J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u00106J\u0012\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bE\u0010;J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u00106J\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u00106J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00106J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u00106J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u00106J\u0012\u0010K\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bK\u0010;J\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u00106J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u00106J\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u00106J\u0012\u0010O\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bO\u0010;J\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u00106J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u00106J\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u00106J\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u00106J\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u00106J\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u00106J\u0012\u0010V\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bV\u00106J\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u00106J\u0012\u0010X\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bX\u0010;J\u0012\u0010Y\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bY\u00106J\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u00106J\u0012\u0010[\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b[\u0010;J\u0012\u0010\\\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\\\u00106J\u0012\u0010]\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b]\u0010;Jà\u0003\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b`\u00108J\u0010\u0010a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\ba\u00104J\u001a\u0010e\u001a\u00020d2\b\u0010c\u001a\u0004\u0018\u00010bHÖ\u0003¢\u0006\u0004\be\u0010fJ'\u0010o\u001a\u00020l2\u0006\u0010g\u001a\u00020\u00002\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020jH\u0001¢\u0006\u0004\bm\u0010nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010p\u001a\u0004\bq\u00104R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010r\u001a\u0004\bs\u00106R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010t\u001a\u0004\bu\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010r\u001a\u0004\bv\u00106R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010w\u001a\u0004\bx\u0010;R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010r\u001a\u0004\by\u00106R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010w\u001a\u0004\bz\u0010;R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010r\u001a\u0004\b{\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010w\u001a\u0004\b|\u0010;R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010r\u001a\u0004\b}\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010r\u001a\u0004\b~\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010r\u001a\u0004\b\u007f\u00106R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0011\u0010r\u001a\u0005\b\u0080\u0001\u00106R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0012\u0010r\u001a\u0005\b\u0081\u0001\u00106R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b\u0013\u0010w\u001a\u0005\b\u0082\u0001\u0010;R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0014\u0010r\u001a\u0005\b\u0083\u0001\u00106R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0015\u0010r\u001a\u0005\b\u0084\u0001\u00106R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0016\u0010r\u001a\u0005\b\u0085\u0001\u00106R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0017\u0010r\u001a\u0005\b\u0086\u0001\u00106R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0018\u0010r\u001a\u0005\b\u0087\u0001\u00106R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b\u0019\u0010w\u001a\u0005\b\u0088\u0001\u0010;R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001a\u0010r\u001a\u0005\b\u0089\u0001\u00106R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001b\u0010r\u001a\u0005\b\u008a\u0001\u00106R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001c\u0010r\u001a\u0005\b\u008b\u0001\u00106R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b\u001d\u0010w\u001a\u0005\b\u008c\u0001\u0010;R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001e\u0010r\u001a\u0005\b\u008d\u0001\u00106R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001f\u0010r\u001a\u0005\b\u008e\u0001\u00106R\u001a\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b \u0010r\u001a\u0005\b\u008f\u0001\u00106R\u001a\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b!\u0010r\u001a\u0005\b\u0090\u0001\u00106R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\"\u0010r\u001a\u0005\b\u0091\u0001\u00106R\u001a\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b#\u0010r\u001a\u0005\b\u0092\u0001\u00106R\u001a\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b$\u0010r\u001a\u0005\b\u0093\u0001\u00106R\u001a\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b%\u0010r\u001a\u0005\b\u0094\u0001\u00106R\u001a\u0010&\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b&\u0010w\u001a\u0005\b\u0095\u0001\u0010;R\u001a\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b'\u0010r\u001a\u0005\b\u0096\u0001\u00106R\u001a\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b(\u0010r\u001a\u0005\b\u0097\u0001\u00106R\u001a\u0010)\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b)\u0010w\u001a\u0005\b\u0098\u0001\u0010;R\u001a\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b*\u0010r\u001a\u0005\b\u0099\u0001\u00106R\u001a\u0010+\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\b+\u0010w\u001a\u0005\b\u009a\u0001\u0010;¨\u0006\u009d\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/FootballTopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseTopPlayersStatisticsItem;", "", "id", "appearances", "", "type", "minutesPlayed", "", CampaignEx.JSON_KEY_STAR, "goals", "expectedGoals", "assists", "expectedAssists", "penaltyGoals", "penaltiesTaken", "goalsAssistsSum", "freeKickGoal", "shotFromSetPiece", "scoringFrequency", "totalShots", "shotsOnTarget", "bigChancesMissed", "bigChancesCreated", "accuratePasses", "accuratePassesPercentage", "keyPasses", "accurateLongBalls", "successfulDribbles", "successfulDribblesPercentage", "penaltyWon", "tackles", "interceptions", "clearances", "possessionLost", "yellowCards", "redCards", "saves", "goalsPrevented", "goalsConceded", "cleanSheet", "kilometersCovered", "numberOfSprints", "topSpeed", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/lang/Double;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/FootballTopPlayersStatisticsItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/FootballTopPlayersStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/String;", "getType", "getMinutesPlayed", "Ljava/lang/Double;", "getRating", "getGoals", "getExpectedGoals", "getAssists", "getExpectedAssists", "getPenaltyGoals", "getPenaltiesTaken", "getGoalsAssistsSum", "getFreeKickGoal", "getShotFromSetPiece", "getScoringFrequency", "getTotalShots", "getShotsOnTarget", "getBigChancesMissed", "getBigChancesCreated", "getAccuratePasses", "getAccuratePassesPercentage", "getKeyPasses", "getAccurateLongBalls", "getSuccessfulDribbles", "getSuccessfulDribblesPercentage", "getPenaltyWon", "getTackles", "getInterceptions", "getClearances", "getPossessionLost", "getYellowCards", "getRedCards", "getSaves", "getGoalsPrevented", "getGoalsConceded", "getCleanSheet", "getKilometersCovered", "getNumberOfSprints", "getTopSpeed", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FootballTopPlayersStatisticsItem extends BaseTopPlayersStatisticsItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer accurateLongBalls;

    @Nullable
    private final Integer accuratePasses;

    @Nullable
    private final Double accuratePassesPercentage;

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer bigChancesCreated;

    @Nullable
    private final Integer bigChancesMissed;

    @Nullable
    private final Integer cleanSheet;

    @Nullable
    private final Integer clearances;

    @Nullable
    private final Double expectedAssists;

    @Nullable
    private final Double expectedGoals;

    @Nullable
    private final Integer freeKickGoal;

    @Nullable
    private final Integer goals;

    @Nullable
    private final Integer goalsAssistsSum;

    @Nullable
    private final Integer goalsConceded;

    @Nullable
    private final Double goalsPrevented;
    private final int id;

    @Nullable
    private final Integer interceptions;

    @Nullable
    private final Integer keyPasses;

    @Nullable
    private final Double kilometersCovered;

    @Nullable
    private final Integer minutesPlayed;

    @Nullable
    private final Integer numberOfSprints;

    @Nullable
    private final Integer penaltiesTaken;

    @Nullable
    private final Integer penaltyGoals;

    @Nullable
    private final Integer penaltyWon;

    @Nullable
    private final Integer possessionLost;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer redCards;

    @Nullable
    private final Integer saves;

    @Nullable
    private final Double scoringFrequency;

    @Nullable
    private final Integer shotFromSetPiece;

    @Nullable
    private final Integer shotsOnTarget;

    @Nullable
    private final Integer successfulDribbles;

    @Nullable
    private final Double successfulDribblesPercentage;

    @Nullable
    private final Integer tackles;

    @Nullable
    private final Double topSpeed;

    @Nullable
    private final Integer totalShots;

    @NotNull
    private final String type;

    @Nullable
    private final Integer yellowCards;

    public /* synthetic */ FootballTopPlayersStatisticsItem(int i, int i2, int i3, Integer num, String str, Integer num2, Double d, Integer num3, Double d2, Integer num4, Double d3, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Double d4, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Double d5, Integer num15, Integer num16, Integer num17, Double d6, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Double d7, Integer num26, Integer num27, Double d8, Integer num28, Double d9, t5h t5hVar) {
        if ((127 != (i2 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE}, FootballTopPlayersStatisticsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.appearances = num;
        this.type = str;
        this.minutesPlayed = num2;
        this.rating = d;
        this.goals = num3;
        this.expectedGoals = d2;
        this.assists = num4;
        this.expectedAssists = d3;
        this.penaltyGoals = num5;
        this.penaltiesTaken = num6;
        this.goalsAssistsSum = num7;
        this.freeKickGoal = num8;
        this.shotFromSetPiece = num9;
        this.scoringFrequency = d4;
        this.totalShots = num10;
        this.shotsOnTarget = num11;
        this.bigChancesMissed = num12;
        this.bigChancesCreated = num13;
        this.accuratePasses = num14;
        this.accuratePassesPercentage = d5;
        this.keyPasses = num15;
        this.accurateLongBalls = num16;
        this.successfulDribbles = num17;
        this.successfulDribblesPercentage = d6;
        this.penaltyWon = num18;
        this.tackles = num19;
        this.interceptions = num20;
        this.clearances = num21;
        this.possessionLost = num22;
        this.yellowCards = num23;
        this.redCards = num24;
        this.saves = num25;
        this.goalsPrevented = d7;
        this.goalsConceded = num26;
        this.cleanSheet = num27;
        this.kilometersCovered = d8;
        this.numberOfSprints = num28;
        this.topSpeed = d9;
    }

    public static /* synthetic */ FootballTopPlayersStatisticsItem copy$default(FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem, int i, Integer num, String str, Integer num2, Double d, Integer num3, Double d2, Integer num4, Double d3, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Double d4, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Double d5, Integer num15, Integer num16, Integer num17, Double d6, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Double d7, Integer num26, Integer num27, Double d8, Integer num28, Double d9, int i2, int i3, Object obj) {
        Double d10;
        Integer num29;
        Integer num30;
        Integer num31;
        Double d11;
        Integer num32;
        Integer num33;
        Integer num34;
        Integer num35;
        Integer num36;
        Integer num37;
        Integer num38;
        Integer num39;
        Double d12;
        Integer num40;
        Integer num41;
        Double d13;
        Double d14;
        Integer num42;
        Double d15;
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
        Double d16;
        Integer num53;
        Integer num54;
        String str2;
        Integer num55;
        Double d17;
        Integer num56;
        Double d18;
        int i4 = (i2 & 1) != 0 ? footballTopPlayersStatisticsItem.id : i;
        Integer num57 = (i2 & 2) != 0 ? footballTopPlayersStatisticsItem.appearances : num;
        String str3 = (i2 & 4) != 0 ? footballTopPlayersStatisticsItem.type : str;
        Integer num58 = (i2 & 8) != 0 ? footballTopPlayersStatisticsItem.minutesPlayed : num2;
        Double d19 = (i2 & 16) != 0 ? footballTopPlayersStatisticsItem.rating : d;
        Integer num59 = (i2 & 32) != 0 ? footballTopPlayersStatisticsItem.goals : num3;
        Double d20 = (i2 & 64) != 0 ? footballTopPlayersStatisticsItem.expectedGoals : d2;
        Integer num60 = (i2 & 128) != 0 ? footballTopPlayersStatisticsItem.assists : num4;
        Double d21 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? footballTopPlayersStatisticsItem.expectedAssists : d3;
        Integer num61 = (i2 & 512) != 0 ? footballTopPlayersStatisticsItem.penaltyGoals : num5;
        Integer num62 = (i2 & 1024) != 0 ? footballTopPlayersStatisticsItem.penaltiesTaken : num6;
        Integer num63 = (i2 & a.o) != 0 ? footballTopPlayersStatisticsItem.goalsAssistsSum : num7;
        Integer num64 = (i2 & 4096) != 0 ? footballTopPlayersStatisticsItem.freeKickGoal : num8;
        Integer num65 = (i2 & 8192) != 0 ? footballTopPlayersStatisticsItem.shotFromSetPiece : num9;
        int i5 = i4;
        Double d22 = (i2 & 16384) != 0 ? footballTopPlayersStatisticsItem.scoringFrequency : d4;
        Integer num66 = (i2 & 32768) != 0 ? footballTopPlayersStatisticsItem.totalShots : num10;
        Integer num67 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? footballTopPlayersStatisticsItem.shotsOnTarget : num11;
        Integer num68 = (i2 & 131072) != 0 ? footballTopPlayersStatisticsItem.bigChancesMissed : num12;
        Integer num69 = (i2 & 262144) != 0 ? footballTopPlayersStatisticsItem.bigChancesCreated : num13;
        Integer num70 = (i2 & 524288) != 0 ? footballTopPlayersStatisticsItem.accuratePasses : num14;
        Double d23 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? footballTopPlayersStatisticsItem.accuratePassesPercentage : d5;
        Integer num71 = (i2 & 2097152) != 0 ? footballTopPlayersStatisticsItem.keyPasses : num15;
        Integer num72 = (i2 & 4194304) != 0 ? footballTopPlayersStatisticsItem.accurateLongBalls : num16;
        Integer num73 = (i2 & 8388608) != 0 ? footballTopPlayersStatisticsItem.successfulDribbles : num17;
        Double d24 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? footballTopPlayersStatisticsItem.successfulDribblesPercentage : d6;
        Integer num74 = (i2 & 33554432) != 0 ? footballTopPlayersStatisticsItem.penaltyWon : num18;
        Integer num75 = (i2 & 67108864) != 0 ? footballTopPlayersStatisticsItem.tackles : num19;
        Integer num76 = (i2 & 134217728) != 0 ? footballTopPlayersStatisticsItem.interceptions : num20;
        Integer num77 = (i2 & 268435456) != 0 ? footballTopPlayersStatisticsItem.clearances : num21;
        Integer num78 = (i2 & 536870912) != 0 ? footballTopPlayersStatisticsItem.possessionLost : num22;
        Integer num79 = (i2 & 1073741824) != 0 ? footballTopPlayersStatisticsItem.yellowCards : num23;
        Integer num80 = (i2 & Integer.MIN_VALUE) != 0 ? footballTopPlayersStatisticsItem.redCards : num24;
        Integer num81 = (i3 & 1) != 0 ? footballTopPlayersStatisticsItem.saves : num25;
        Double d25 = (i3 & 2) != 0 ? footballTopPlayersStatisticsItem.goalsPrevented : d7;
        Integer num82 = (i3 & 4) != 0 ? footballTopPlayersStatisticsItem.goalsConceded : num26;
        Integer num83 = (i3 & 8) != 0 ? footballTopPlayersStatisticsItem.cleanSheet : num27;
        Double d26 = (i3 & 16) != 0 ? footballTopPlayersStatisticsItem.kilometersCovered : d8;
        Integer num84 = (i3 & 32) != 0 ? footballTopPlayersStatisticsItem.numberOfSprints : num28;
        if ((i3 & 64) != 0) {
            num29 = num84;
            d10 = footballTopPlayersStatisticsItem.topSpeed;
            num31 = num73;
            d11 = d24;
            num32 = num74;
            num33 = num75;
            num34 = num76;
            num35 = num77;
            num36 = num78;
            num37 = num79;
            num38 = num80;
            num39 = num81;
            d12 = d25;
            num40 = num82;
            num41 = num83;
            d13 = d26;
            d14 = d22;
            d15 = d21;
            num43 = num61;
            num44 = num62;
            num45 = num63;
            num46 = num64;
            num47 = num65;
            num48 = num66;
            num49 = num67;
            num50 = num68;
            num51 = num69;
            num52 = num70;
            d16 = d23;
            num53 = num71;
            num30 = num72;
            num54 = num57;
            str2 = str3;
            num55 = num58;
            d17 = d19;
            num56 = num59;
            d18 = d20;
            num42 = num60;
        } else {
            d10 = d9;
            num29 = num84;
            num30 = num72;
            num31 = num73;
            d11 = d24;
            num32 = num74;
            num33 = num75;
            num34 = num76;
            num35 = num77;
            num36 = num78;
            num37 = num79;
            num38 = num80;
            num39 = num81;
            d12 = d25;
            num40 = num82;
            num41 = num83;
            d13 = d26;
            d14 = d22;
            num42 = num60;
            d15 = d21;
            num43 = num61;
            num44 = num62;
            num45 = num63;
            num46 = num64;
            num47 = num65;
            num48 = num66;
            num49 = num67;
            num50 = num68;
            num51 = num69;
            num52 = num70;
            d16 = d23;
            num53 = num71;
            num54 = num57;
            str2 = str3;
            num55 = num58;
            d17 = d19;
            num56 = num59;
            d18 = d20;
        }
        return footballTopPlayersStatisticsItem.copy(i5, num54, str2, num55, d17, num56, d18, num42, d15, num43, num44, num45, num46, num47, d14, num48, num49, num50, num51, num52, d16, num53, num30, num31, d11, num32, num33, num34, num35, num36, num37, num38, num39, d12, num40, num41, d13, num29, d10);
    }

    public static final /* synthetic */ void write$Self$model_release(FootballTopPlayersStatisticsItem self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.getAppearances());
        output.y(serialDesc, 2, self.getType());
        output.h(serialDesc, 3, a7aVar, self.minutesPlayed);
        h75 h75Var = h75.a;
        output.h(serialDesc, 4, h75Var, self.getRating());
        output.h(serialDesc, 5, a7aVar, self.goals);
        output.h(serialDesc, 6, h75Var, self.expectedGoals);
        output.h(serialDesc, 7, a7aVar, self.assists);
        output.h(serialDesc, 8, h75Var, self.expectedAssists);
        output.h(serialDesc, 9, a7aVar, self.penaltyGoals);
        output.h(serialDesc, 10, a7aVar, self.penaltiesTaken);
        output.h(serialDesc, 11, a7aVar, self.goalsAssistsSum);
        output.h(serialDesc, 12, a7aVar, self.freeKickGoal);
        output.h(serialDesc, 13, a7aVar, self.shotFromSetPiece);
        output.h(serialDesc, 14, h75Var, self.scoringFrequency);
        output.h(serialDesc, 15, a7aVar, self.totalShots);
        output.h(serialDesc, 16, a7aVar, self.shotsOnTarget);
        output.h(serialDesc, 17, a7aVar, self.bigChancesMissed);
        output.h(serialDesc, 18, a7aVar, self.bigChancesCreated);
        output.h(serialDesc, 19, a7aVar, self.accuratePasses);
        output.h(serialDesc, 20, h75Var, self.accuratePassesPercentage);
        output.h(serialDesc, 21, a7aVar, self.keyPasses);
        output.h(serialDesc, 22, a7aVar, self.accurateLongBalls);
        output.h(serialDesc, 23, a7aVar, self.successfulDribbles);
        output.h(serialDesc, 24, h75Var, self.successfulDribblesPercentage);
        output.h(serialDesc, 25, a7aVar, self.penaltyWon);
        output.h(serialDesc, 26, a7aVar, self.tackles);
        output.h(serialDesc, 27, a7aVar, self.interceptions);
        output.h(serialDesc, 28, a7aVar, self.clearances);
        output.h(serialDesc, 29, a7aVar, self.possessionLost);
        output.h(serialDesc, 30, a7aVar, self.yellowCards);
        output.h(serialDesc, 31, a7aVar, self.redCards);
        output.h(serialDesc, 32, a7aVar, self.saves);
        output.h(serialDesc, 33, h75Var, self.goalsPrevented);
        output.h(serialDesc, 34, a7aVar, self.goalsConceded);
        output.h(serialDesc, 35, a7aVar, self.cleanSheet);
        output.h(serialDesc, 36, h75Var, self.kilometersCovered);
        output.h(serialDesc, 37, a7aVar, self.numberOfSprints);
        output.h(serialDesc, 38, h75Var, self.topSpeed);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getPenaltiesTaken() {
        return this.penaltiesTaken;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getGoalsAssistsSum() {
        return this.goalsAssistsSum;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getFreeKickGoal() {
        return this.freeKickGoal;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getShotFromSetPiece() {
        return this.shotFromSetPiece;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Double getScoringFrequency() {
        return this.scoringFrequency;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getTotalShots() {
        return this.totalShots;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getShotsOnTarget() {
        return this.shotsOnTarget;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getBigChancesMissed() {
        return this.bigChancesMissed;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getBigChancesCreated() {
        return this.bigChancesCreated;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getAccuratePasses() {
        return this.accuratePasses;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Double getAccuratePassesPercentage() {
        return this.accuratePassesPercentage;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getKeyPasses() {
        return this.keyPasses;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getAccurateLongBalls() {
        return this.accurateLongBalls;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getSuccessfulDribbles() {
        return this.successfulDribbles;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Double getSuccessfulDribblesPercentage() {
        return this.successfulDribblesPercentage;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getPenaltyWon() {
        return this.penaltyWon;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getTackles() {
        return this.tackles;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getInterceptions() {
        return this.interceptions;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Integer getClearances() {
        return this.clearances;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getPossessionLost() {
        return this.possessionLost;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Integer getSaves() {
        return this.saves;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Double getGoalsPrevented() {
        return this.goalsPrevented;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Integer getGoalsConceded() {
        return this.goalsConceded;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final Integer getCleanSheet() {
        return this.cleanSheet;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final Double getKilometersCovered() {
        return this.kilometersCovered;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final Integer getNumberOfSprints() {
        return this.numberOfSprints;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final Double getTopSpeed() {
        return this.topSpeed;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getMinutesPlayed() {
        return this.minutesPlayed;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getExpectedGoals() {
        return this.expectedGoals;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Double getExpectedAssists() {
        return this.expectedAssists;
    }

    @NotNull
    public final FootballTopPlayersStatisticsItem copy(int id, @Nullable Integer appearances, @NotNull String type, @Nullable Integer minutesPlayed, @Nullable Double rating, @Nullable Integer goals, @Nullable Double expectedGoals, @Nullable Integer assists, @Nullable Double expectedAssists, @Nullable Integer penaltyGoals, @Nullable Integer penaltiesTaken, @Nullable Integer goalsAssistsSum, @Nullable Integer freeKickGoal, @Nullable Integer shotFromSetPiece, @Nullable Double scoringFrequency, @Nullable Integer totalShots, @Nullable Integer shotsOnTarget, @Nullable Integer bigChancesMissed, @Nullable Integer bigChancesCreated, @Nullable Integer accuratePasses, @Nullable Double accuratePassesPercentage, @Nullable Integer keyPasses, @Nullable Integer accurateLongBalls, @Nullable Integer successfulDribbles, @Nullable Double successfulDribblesPercentage, @Nullable Integer penaltyWon, @Nullable Integer tackles, @Nullable Integer interceptions, @Nullable Integer clearances, @Nullable Integer possessionLost, @Nullable Integer yellowCards, @Nullable Integer redCards, @Nullable Integer saves, @Nullable Double goalsPrevented, @Nullable Integer goalsConceded, @Nullable Integer cleanSheet, @Nullable Double kilometersCovered, @Nullable Integer numberOfSprints, @Nullable Double topSpeed) {
        type.getClass();
        return new FootballTopPlayersStatisticsItem(id, appearances, type, minutesPlayed, rating, goals, expectedGoals, assists, expectedAssists, penaltyGoals, penaltiesTaken, goalsAssistsSum, freeKickGoal, shotFromSetPiece, scoringFrequency, totalShots, shotsOnTarget, bigChancesMissed, bigChancesCreated, accuratePasses, accuratePassesPercentage, keyPasses, accurateLongBalls, successfulDribbles, successfulDribblesPercentage, penaltyWon, tackles, interceptions, clearances, possessionLost, yellowCards, redCards, saves, goalsPrevented, goalsConceded, cleanSheet, kilometersCovered, numberOfSprints, topSpeed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FootballTopPlayersStatisticsItem)) {
            return false;
        }
        FootballTopPlayersStatisticsItem footballTopPlayersStatisticsItem = (FootballTopPlayersStatisticsItem) other;
        return this.id == footballTopPlayersStatisticsItem.id && Intrinsics.c(this.appearances, footballTopPlayersStatisticsItem.appearances) && Intrinsics.c(this.type, footballTopPlayersStatisticsItem.type) && Intrinsics.c(this.minutesPlayed, footballTopPlayersStatisticsItem.minutesPlayed) && Intrinsics.c(this.rating, footballTopPlayersStatisticsItem.rating) && Intrinsics.c(this.goals, footballTopPlayersStatisticsItem.goals) && Intrinsics.c(this.expectedGoals, footballTopPlayersStatisticsItem.expectedGoals) && Intrinsics.c(this.assists, footballTopPlayersStatisticsItem.assists) && Intrinsics.c(this.expectedAssists, footballTopPlayersStatisticsItem.expectedAssists) && Intrinsics.c(this.penaltyGoals, footballTopPlayersStatisticsItem.penaltyGoals) && Intrinsics.c(this.penaltiesTaken, footballTopPlayersStatisticsItem.penaltiesTaken) && Intrinsics.c(this.goalsAssistsSum, footballTopPlayersStatisticsItem.goalsAssistsSum) && Intrinsics.c(this.freeKickGoal, footballTopPlayersStatisticsItem.freeKickGoal) && Intrinsics.c(this.shotFromSetPiece, footballTopPlayersStatisticsItem.shotFromSetPiece) && Intrinsics.c(this.scoringFrequency, footballTopPlayersStatisticsItem.scoringFrequency) && Intrinsics.c(this.totalShots, footballTopPlayersStatisticsItem.totalShots) && Intrinsics.c(this.shotsOnTarget, footballTopPlayersStatisticsItem.shotsOnTarget) && Intrinsics.c(this.bigChancesMissed, footballTopPlayersStatisticsItem.bigChancesMissed) && Intrinsics.c(this.bigChancesCreated, footballTopPlayersStatisticsItem.bigChancesCreated) && Intrinsics.c(this.accuratePasses, footballTopPlayersStatisticsItem.accuratePasses) && Intrinsics.c(this.accuratePassesPercentage, footballTopPlayersStatisticsItem.accuratePassesPercentage) && Intrinsics.c(this.keyPasses, footballTopPlayersStatisticsItem.keyPasses) && Intrinsics.c(this.accurateLongBalls, footballTopPlayersStatisticsItem.accurateLongBalls) && Intrinsics.c(this.successfulDribbles, footballTopPlayersStatisticsItem.successfulDribbles) && Intrinsics.c(this.successfulDribblesPercentage, footballTopPlayersStatisticsItem.successfulDribblesPercentage) && Intrinsics.c(this.penaltyWon, footballTopPlayersStatisticsItem.penaltyWon) && Intrinsics.c(this.tackles, footballTopPlayersStatisticsItem.tackles) && Intrinsics.c(this.interceptions, footballTopPlayersStatisticsItem.interceptions) && Intrinsics.c(this.clearances, footballTopPlayersStatisticsItem.clearances) && Intrinsics.c(this.possessionLost, footballTopPlayersStatisticsItem.possessionLost) && Intrinsics.c(this.yellowCards, footballTopPlayersStatisticsItem.yellowCards) && Intrinsics.c(this.redCards, footballTopPlayersStatisticsItem.redCards) && Intrinsics.c(this.saves, footballTopPlayersStatisticsItem.saves) && Intrinsics.c(this.goalsPrevented, footballTopPlayersStatisticsItem.goalsPrevented) && Intrinsics.c(this.goalsConceded, footballTopPlayersStatisticsItem.goalsConceded) && Intrinsics.c(this.cleanSheet, footballTopPlayersStatisticsItem.cleanSheet) && Intrinsics.c(this.kilometersCovered, footballTopPlayersStatisticsItem.kilometersCovered) && Intrinsics.c(this.numberOfSprints, footballTopPlayersStatisticsItem.numberOfSprints) && Intrinsics.c(this.topSpeed, footballTopPlayersStatisticsItem.topSpeed);
    }

    @Nullable
    public final Integer getAccurateLongBalls() {
        return this.accurateLongBalls;
    }

    @Nullable
    public final Integer getAccuratePasses() {
        return this.accuratePasses;
    }

    @Nullable
    public final Double getAccuratePassesPercentage() {
        return this.accuratePassesPercentage;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @Nullable
    public Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final Integer getBigChancesCreated() {
        return this.bigChancesCreated;
    }

    @Nullable
    public final Integer getBigChancesMissed() {
        return this.bigChancesMissed;
    }

    @Nullable
    public final Integer getCleanSheet() {
        return this.cleanSheet;
    }

    @Nullable
    public final Integer getClearances() {
        return this.clearances;
    }

    @Nullable
    public final Double getExpectedAssists() {
        return this.expectedAssists;
    }

    @Nullable
    public final Double getExpectedGoals() {
        return this.expectedGoals;
    }

    @Nullable
    public final Integer getFreeKickGoal() {
        return this.freeKickGoal;
    }

    @Nullable
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    public final Integer getGoalsAssistsSum() {
        return this.goalsAssistsSum;
    }

    @Nullable
    public final Integer getGoalsConceded() {
        return this.goalsConceded;
    }

    @Nullable
    public final Double getGoalsPrevented() {
        return this.goalsPrevented;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getInterceptions() {
        return this.interceptions;
    }

    @Nullable
    public final Integer getKeyPasses() {
        return this.keyPasses;
    }

    @Nullable
    public final Double getKilometersCovered() {
        return this.kilometersCovered;
    }

    @Nullable
    public final Integer getMinutesPlayed() {
        return this.minutesPlayed;
    }

    @Nullable
    public final Integer getNumberOfSprints() {
        return this.numberOfSprints;
    }

    @Nullable
    public final Integer getPenaltiesTaken() {
        return this.penaltiesTaken;
    }

    @Nullable
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    public final Integer getPenaltyWon() {
        return this.penaltyWon;
    }

    @Nullable
    public final Integer getPossessionLost() {
        return this.possessionLost;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    public final Integer getSaves() {
        return this.saves;
    }

    @Nullable
    public final Double getScoringFrequency() {
        return this.scoringFrequency;
    }

    @Nullable
    public final Integer getShotFromSetPiece() {
        return this.shotFromSetPiece;
    }

    @Nullable
    public final Integer getShotsOnTarget() {
        return this.shotsOnTarget;
    }

    @Nullable
    public final Integer getSuccessfulDribbles() {
        return this.successfulDribbles;
    }

    @Nullable
    public final Double getSuccessfulDribblesPercentage() {
        return this.successfulDribblesPercentage;
    }

    @Nullable
    public final Integer getTackles() {
        return this.tackles;
    }

    @Nullable
    public final Double getTopSpeed() {
        return this.topSpeed;
    }

    @Nullable
    public final Integer getTotalShots() {
        return this.totalShots;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @NotNull
    public String getType() {
        return this.type;
    }

    @Nullable
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.appearances;
        int c = dmi.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.type);
        Integer num2 = this.minutesPlayed;
        int hashCode2 = (c + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.rating;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.goals;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d2 = this.expectedGoals;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num4 = this.assists;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d3 = this.expectedAssists;
        int hashCode7 = (hashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num5 = this.penaltyGoals;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.penaltiesTaken;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.goalsAssistsSum;
        int hashCode10 = (hashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.freeKickGoal;
        int hashCode11 = (hashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.shotFromSetPiece;
        int hashCode12 = (hashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Double d4 = this.scoringFrequency;
        int hashCode13 = (hashCode12 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num10 = this.totalShots;
        int hashCode14 = (hashCode13 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.shotsOnTarget;
        int hashCode15 = (hashCode14 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.bigChancesMissed;
        int hashCode16 = (hashCode15 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.bigChancesCreated;
        int hashCode17 = (hashCode16 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.accuratePasses;
        int hashCode18 = (hashCode17 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Double d5 = this.accuratePassesPercentage;
        int hashCode19 = (hashCode18 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num15 = this.keyPasses;
        int hashCode20 = (hashCode19 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.accurateLongBalls;
        int hashCode21 = (hashCode20 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.successfulDribbles;
        int hashCode22 = (hashCode21 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Double d6 = this.successfulDribblesPercentage;
        int hashCode23 = (hashCode22 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num18 = this.penaltyWon;
        int hashCode24 = (hashCode23 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.tackles;
        int hashCode25 = (hashCode24 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.interceptions;
        int hashCode26 = (hashCode25 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.clearances;
        int hashCode27 = (hashCode26 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.possessionLost;
        int hashCode28 = (hashCode27 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.yellowCards;
        int hashCode29 = (hashCode28 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.redCards;
        int hashCode30 = (hashCode29 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.saves;
        int hashCode31 = (hashCode30 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Double d7 = this.goalsPrevented;
        int hashCode32 = (hashCode31 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num26 = this.goalsConceded;
        int hashCode33 = (hashCode32 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.cleanSheet;
        int hashCode34 = (hashCode33 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Double d8 = this.kilometersCovered;
        int hashCode35 = (hashCode34 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Integer num28 = this.numberOfSprints;
        int hashCode36 = (hashCode35 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Double d9 = this.topSpeed;
        return hashCode36 + (d9 != null ? d9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Integer num = this.appearances;
        String str = this.type;
        Integer num2 = this.minutesPlayed;
        Double d = this.rating;
        Integer num3 = this.goals;
        Double d2 = this.expectedGoals;
        Integer num4 = this.assists;
        Double d3 = this.expectedAssists;
        Integer num5 = this.penaltyGoals;
        Integer num6 = this.penaltiesTaken;
        Integer num7 = this.goalsAssistsSum;
        Integer num8 = this.freeKickGoal;
        Integer num9 = this.shotFromSetPiece;
        Double d4 = this.scoringFrequency;
        Integer num10 = this.totalShots;
        Integer num11 = this.shotsOnTarget;
        Integer num12 = this.bigChancesMissed;
        Integer num13 = this.bigChancesCreated;
        Integer num14 = this.accuratePasses;
        Double d5 = this.accuratePassesPercentage;
        Integer num15 = this.keyPasses;
        Integer num16 = this.accurateLongBalls;
        Integer num17 = this.successfulDribbles;
        Double d6 = this.successfulDribblesPercentage;
        Integer num18 = this.penaltyWon;
        Integer num19 = this.tackles;
        Integer num20 = this.interceptions;
        Integer num21 = this.clearances;
        Integer num22 = this.possessionLost;
        Integer num23 = this.yellowCards;
        Integer num24 = this.redCards;
        Integer num25 = this.saves;
        Double d7 = this.goalsPrevented;
        Integer num26 = this.goalsConceded;
        Integer num27 = this.cleanSheet;
        Double d8 = this.kilometersCovered;
        Integer num28 = this.numberOfSprints;
        Double d9 = this.topSpeed;
        StringBuilder r = fc6.r("FootballTopPlayersStatisticsItem(id=", ", appearances=", ", type=", num, i);
        me4.o(num2, str, ", minutesPlayed=", ", rating=", r);
        mz1.x(d, num3, ", goals=", ", expectedGoals=", r);
        mz1.x(d2, num4, ", assists=", ", expectedAssists=", r);
        mz1.x(d3, num5, ", penaltyGoals=", ", penaltiesTaken=", r);
        vxd.r(num6, num7, ", goalsAssistsSum=", ", freeKickGoal=", r);
        vxd.r(num8, num9, ", shotFromSetPiece=", ", scoringFrequency=", r);
        mz1.x(d4, num10, ", totalShots=", ", shotsOnTarget=", r);
        vxd.r(num11, num12, ", bigChancesMissed=", ", bigChancesCreated=", r);
        vxd.r(num13, num14, ", accuratePasses=", ", accuratePassesPercentage=", r);
        mz1.x(d5, num15, ", keyPasses=", ", accurateLongBalls=", r);
        vxd.r(num16, num17, ", successfulDribbles=", ", successfulDribblesPercentage=", r);
        mz1.x(d6, num18, ", penaltyWon=", ", tackles=", r);
        vxd.r(num19, num20, ", interceptions=", ", clearances=", r);
        vxd.r(num21, num22, ", possessionLost=", ", yellowCards=", r);
        vxd.r(num23, num24, ", redCards=", ", saves=", r);
        fn0.v(d7, num25, ", goalsPrevented=", ", goalsConceded=", r);
        vxd.r(num26, num27, ", cleanSheet=", ", kilometersCovered=", r);
        mz1.x(d8, num28, ", numberOfSprints=", ", topSpeed=", r);
        r.append(d9);
        r.append(")");
        return r.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/FootballTopPlayersStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/FootballTopPlayersStatisticsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FootballTopPlayersStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FootballTopPlayersStatisticsItem(int i, @Nullable Integer num, @NotNull String str, @Nullable Integer num2, @Nullable Double d, @Nullable Integer num3, @Nullable Double d2, @Nullable Integer num4, @Nullable Double d3, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Double d4, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Double d5, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Double d6, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24, @Nullable Integer num25, @Nullable Double d7, @Nullable Integer num26, @Nullable Integer num27, @Nullable Double d8, @Nullable Integer num28, @Nullable Double d9) {
        str.getClass();
        this.id = i;
        this.appearances = num;
        this.type = str;
        this.minutesPlayed = num2;
        this.rating = d;
        this.goals = num3;
        this.expectedGoals = d2;
        this.assists = num4;
        this.expectedAssists = d3;
        this.penaltyGoals = num5;
        this.penaltiesTaken = num6;
        this.goalsAssistsSum = num7;
        this.freeKickGoal = num8;
        this.shotFromSetPiece = num9;
        this.scoringFrequency = d4;
        this.totalShots = num10;
        this.shotsOnTarget = num11;
        this.bigChancesMissed = num12;
        this.bigChancesCreated = num13;
        this.accuratePasses = num14;
        this.accuratePassesPercentage = d5;
        this.keyPasses = num15;
        this.accurateLongBalls = num16;
        this.successfulDribbles = num17;
        this.successfulDribblesPercentage = d6;
        this.penaltyWon = num18;
        this.tackles = num19;
        this.interceptions = num20;
        this.clearances = num21;
        this.possessionLost = num22;
        this.yellowCards = num23;
        this.redCards = num24;
        this.saves = num25;
        this.goalsPrevented = d7;
        this.goalsConceded = num26;
        this.cleanSheet = num27;
        this.kilometersCovered = d8;
        this.numberOfSprints = num28;
        this.topSpeed = d9;
    }
}
