package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Category$$serializer;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.c88;
import defpackage.dmi;
import defpackage.ec6;
import defpackage.fn0;
import defpackage.gz1;
import defpackage.joa;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b4\b\u0087\b\u0018\u0000 ¢\u00012\u00020\u0001:\u0004£\u0001¢\u0001Bµ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010!\u001a\u00020\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010%\u001a\u00020\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010'\u001a\u00020\u0016\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010)\u001a\u00020\u0016\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010+\u001a\u00020\b\u0012\u0006\u0010,\u001a\u00020\b\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b.\u0010/BÛ\u0002\b\u0010\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010!\u001a\u00020\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010%\u001a\u00020\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010'\u001a\u00020\u0016\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010)\u001a\u00020\u0016\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010+\u001a\u00020\b\u0012\u0006\u0010,\u001a\u00020\b\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b.\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b=\u0010:J\u0010\u0010>\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b>\u0010:J\u0010\u0010?\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b?\u0010:J\u0010\u0010@\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bB\u0010AJ\u0012\u0010C\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bC\u0010AJ\u0010\u0010D\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bF\u00106J\u0010\u0010G\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bG\u00106J\u0012\u0010H\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0018\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bT\u0010MJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bU\u0010:J\u0010\u0010V\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bV\u0010MJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b[\u0010MJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\\\u0010XJ\u0010\u0010]\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b]\u0010MJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b^\u0010XJ\u0010\u0010_\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b_\u0010MJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b`\u0010XJ\u0010\u0010a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\ba\u0010EJ\u0010\u0010b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bb\u0010EJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bc\u0010:Jþ\u0002\u0010d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00162\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010!\u001a\u00020\u00162\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010%\u001a\u00020\u00162\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010'\u001a\u00020\u00162\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010)\u001a\u00020\u00162\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010+\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bf\u0010:J\u0010\u0010g\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bg\u00106J\u001a\u0010i\u001a\u00020\u00162\b\u0010h\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bi\u0010jJ'\u0010s\u001a\u00020p2\u0006\u0010k\u001a\u00020\u00002\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020nH\u0001¢\u0006\u0004\bq\u0010rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010t\u001a\u0004\bu\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010v\u001a\u0004\bw\u00108R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010x\u001a\u0004\by\u0010:R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010z\u001a\u0004\b{\u0010<R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010x\u001a\u0004\b|\u0010:R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010x\u001a\u0004\b}\u0010:R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010x\u001a\u0004\b~\u0010:R\u0018\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\r\n\u0004\b\u000e\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010AR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\r\n\u0004\b\u000f\u0010\u007f\u001a\u0005\b\u0081\u0001\u0010AR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\r\n\u0004\b\u0010\u0010\u007f\u001a\u0005\b\u0082\u0001\u0010AR\u0019\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010ER\u0018\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u0012\u0010t\u001a\u0005\b\u0085\u0001\u00106R\u0018\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u0013\u0010t\u001a\u0005\b\u0086\u0001\u00106R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010IR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010KR\u0018\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\r\n\u0005\b\u0018\u0010\u008b\u0001\u001a\u0004\b\u0018\u0010MR!\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00198\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010OR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010QR\u0019\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010SR\u0019\u0010\u001f\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u008b\u0001\u001a\u0005\b\u0092\u0001\u0010MR\u001a\u0010 \u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\r\n\u0004\b \u0010x\u001a\u0005\b\u0093\u0001\u0010:R\u0019\u0010!\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b!\u0010\u008b\u0001\u001a\u0005\b\u0094\u0001\u0010MR\u001b\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u0010XR\u001b\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010ZR\u0019\u0010%\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b%\u0010\u008b\u0001\u001a\u0005\b\u0099\u0001\u0010MR\u001b\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0095\u0001\u001a\u0005\b\u009a\u0001\u0010XR\u0019\u0010'\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b'\u0010\u008b\u0001\u001a\u0005\b\u009b\u0001\u0010MR\u001b\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0095\u0001\u001a\u0005\b\u009c\u0001\u0010XR\u0019\u0010)\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b)\u0010\u008b\u0001\u001a\u0005\b\u009d\u0001\u0010MR\u001b\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b*\u0010\u0095\u0001\u001a\u0005\b\u009e\u0001\u0010XR\u0019\u0010+\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b+\u0010\u0083\u0001\u001a\u0005\b\u009f\u0001\u0010ER\u0019\u0010,\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b,\u0010\u0083\u0001\u001a\u0005\b \u0001\u0010ER\u001a\u0010-\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\r\n\u0004\b-\u0010x\u001a\u0005\b¡\u0001\u0010:¨\u0006¤\u0001"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyCompetition;", "", "", "id", "Lcom/sofascore/model/fantasy/FantasyCompetitionType;", "type", "", "name", "", "scoreUpdatedAtTimestamp", "sponsor", "prize", "rules", "Lcom/sofascore/model/fantasy/FantasyRound;", "currentRound", "nextRound", "previousRound", "totalPlayers", "roundCount", "currentRoundSequence", "", "averageScore", "", StatusKt.STATUS_FINISHED, "isAlpha", "", "countries", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "Lcom/sofascore/model/mvvm/model/Category;", "category", "official", "officialPartnerName", "officialAssetsRestricted", "globalLeagueId", "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "tripleCaptainAllowed", "tripleCaptainRenewalSequence", "wildcardAllowed", "wildcardRenewalSequence", "freeHitAllowed", "freeHitRenewalSequence", "startTimestamp", "endTimestamp", "competitionColor", "<init>", "(ILcom/sofascore/model/fantasy/FantasyCompetitionType;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/fantasy/FantasyRound;Lcom/sofascore/model/fantasy/FantasyRound;Lcom/sofascore/model/fantasy/FantasyRound;JIILjava/lang/Float;Ljava/lang/Boolean;ZLjava/util/List;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/Category;ZLjava/lang/String;ZLjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Season;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;JJLjava/lang/String;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IIILcom/sofascore/model/fantasy/FantasyCompetitionType;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/fantasy/FantasyRound;Lcom/sofascore/model/fantasy/FantasyRound;Lcom/sofascore/model/fantasy/FantasyRound;JIILjava/lang/Float;Ljava/lang/Boolean;ZLjava/util/List;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/Category;ZLjava/lang/String;ZLjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Season;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;JJLjava/lang/String;Lt5h;)V", "component1", "()I", "component2", "()Lcom/sofascore/model/fantasy/FantasyCompetitionType;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Long;", "component5", "component6", "component7", "component8", "()Lcom/sofascore/model/fantasy/FantasyRound;", "component9", "component10", "component11", "()J", "component12", "component13", "component14", "()Ljava/lang/Float;", "component15", "()Ljava/lang/Boolean;", "component16", "()Z", "component17", "()Ljava/util/List;", "component18", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "component19", "()Lcom/sofascore/model/mvvm/model/Category;", "component20", "component21", "component22", "component23", "()Ljava/lang/Integer;", "component24", "()Lcom/sofascore/model/mvvm/model/Season;", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "copy", "(ILcom/sofascore/model/fantasy/FantasyCompetitionType;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/fantasy/FantasyRound;Lcom/sofascore/model/fantasy/FantasyRound;Lcom/sofascore/model/fantasy/FantasyRound;JIILjava/lang/Float;Ljava/lang/Boolean;ZLjava/util/List;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/Category;ZLjava/lang/String;ZLjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Season;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;JJLjava/lang/String;)Lcom/sofascore/model/fantasy/FantasyCompetition;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyCompetition;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/fantasy/FantasyCompetitionType;", "getType", "Ljava/lang/String;", "getName", "Ljava/lang/Long;", "getScoreUpdatedAtTimestamp", "getSponsor", "getPrize", "getRules", "Lcom/sofascore/model/fantasy/FantasyRound;", "getCurrentRound", "getNextRound", "getPreviousRound", "J", "getTotalPlayers", "getRoundCount", "getCurrentRoundSequence", "Ljava/lang/Float;", "getAverageScore", "Ljava/lang/Boolean;", "getFinished", "Z", "Ljava/util/List;", "getCountries", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "Lcom/sofascore/model/mvvm/model/Category;", "getCategory", "getOfficial", "getOfficialPartnerName", "getOfficialAssetsRestricted", "Ljava/lang/Integer;", "getGlobalLeagueId", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "getTripleCaptainAllowed", "getTripleCaptainRenewalSequence", "getWildcardAllowed", "getWildcardRenewalSequence", "getFreeHitAllowed", "getFreeHitRenewalSequence", "getStartTimestamp", "getEndTimestamp", "getCompetitionColor", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyCompetition {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float averageScore;

    @NotNull
    private final Category category;

    @Nullable
    private final String competitionColor;

    @Nullable
    private final List<String> countries;

    @NotNull
    private final FantasyRound currentRound;
    private final int currentRoundSequence;
    private final long endTimestamp;

    @Nullable
    private final Boolean finished;
    private final boolean freeHitAllowed;

    @Nullable
    private final Integer freeHitRenewalSequence;

    @Nullable
    private final Integer globalLeagueId;
    private final int id;
    private final boolean isAlpha;

    @NotNull
    private final String name;

    @Nullable
    private final FantasyRound nextRound;
    private final boolean official;
    private final boolean officialAssetsRestricted;

    @Nullable
    private final String officialPartnerName;

    @Nullable
    private final FantasyRound previousRound;

    @NotNull
    private final String prize;
    private final int roundCount;

    @NotNull
    private final String rules;

    @Nullable
    private final Long scoreUpdatedAtTimestamp;

    @Nullable
    private final Season season;

    @Nullable
    private final String sponsor;
    private final long startTimestamp;
    private final long totalPlayers;
    private final boolean tripleCaptainAllowed;

    @Nullable
    private final Integer tripleCaptainRenewalSequence;

    @NotNull
    private final FantasyCompetitionType type;

    @Nullable
    private final UniqueTournament uniqueTournament;
    private final boolean wildcardAllowed;

    @Nullable
    private final Integer wildcardRenewalSequence;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new ec6(27)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new ec6(28)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ FantasyCompetition(int i, int i2, int i3, FantasyCompetitionType fantasyCompetitionType, String str, Long l, String str2, String str3, String str4, FantasyRound fantasyRound, FantasyRound fantasyRound2, FantasyRound fantasyRound3, long j, int i4, int i5, Float f, Boolean bool, boolean z, List list, UniqueTournament uniqueTournament, Category category, boolean z2, String str5, boolean z3, Integer num, Season season, boolean z4, Integer num2, boolean z5, Integer num3, boolean z6, Integer num4, long j2, long j3, String str6, t5h t5hVar) {
        if ((-3 != (i & (-3))) || (1 != (i2 & 1))) {
            oea.y(new int[]{i, i2}, new int[]{-3, 1}, FantasyCompetition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        if ((i & 2) == 0) {
            this.type = FantasyCompetitionType.SEASON;
        } else {
            this.type = fantasyCompetitionType;
        }
        this.name = str;
        this.scoreUpdatedAtTimestamp = l;
        this.sponsor = str2;
        this.prize = str3;
        this.rules = str4;
        this.currentRound = fantasyRound;
        this.nextRound = fantasyRound2;
        this.previousRound = fantasyRound3;
        this.totalPlayers = j;
        this.roundCount = i4;
        this.currentRoundSequence = i5;
        this.averageScore = f;
        this.finished = bool;
        this.isAlpha = z;
        this.countries = list;
        this.uniqueTournament = uniqueTournament;
        this.category = category;
        this.official = z2;
        this.officialPartnerName = str5;
        this.officialAssetsRestricted = z3;
        this.globalLeagueId = num;
        this.season = season;
        this.tripleCaptainAllowed = z4;
        this.tripleCaptainRenewalSequence = num2;
        this.wildcardAllowed = z5;
        this.wildcardRenewalSequence = num3;
        this.freeHitAllowed = z6;
        this.freeHitRenewalSequence = num4;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.competitionColor = str6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return FantasyCompetitionType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(uhi.a, 0);
    }

    public static /* synthetic */ FantasyCompetition copy$default(FantasyCompetition fantasyCompetition, int i, FantasyCompetitionType fantasyCompetitionType, String str, Long l, String str2, String str3, String str4, FantasyRound fantasyRound, FantasyRound fantasyRound2, FantasyRound fantasyRound3, long j, int i2, int i3, Float f, Boolean bool, boolean z, List list, UniqueTournament uniqueTournament, Category category, boolean z2, String str5, boolean z3, Integer num, Season season, boolean z4, Integer num2, boolean z5, Integer num3, boolean z6, Integer num4, long j2, long j3, String str6, int i4, int i5, Object obj) {
        String str7;
        long j4;
        UniqueTournament uniqueTournament2;
        Category category2;
        boolean z7;
        String str8;
        boolean z8;
        Integer num5;
        Season season2;
        boolean z9;
        Integer num6;
        boolean z10;
        Integer num7;
        boolean z11;
        Integer num8;
        long j5;
        Boolean bool2;
        Long l2;
        String str9;
        String str10;
        String str11;
        FantasyRound fantasyRound4;
        FantasyRound fantasyRound5;
        FantasyRound fantasyRound6;
        long j6;
        int i6;
        int i7;
        Float f2;
        boolean z12;
        List list2;
        FantasyCompetitionType fantasyCompetitionType2;
        String str12;
        int i8 = (i4 & 1) != 0 ? fantasyCompetition.id : i;
        FantasyCompetitionType fantasyCompetitionType3 = (i4 & 2) != 0 ? fantasyCompetition.type : fantasyCompetitionType;
        String str13 = (i4 & 4) != 0 ? fantasyCompetition.name : str;
        Long l3 = (i4 & 8) != 0 ? fantasyCompetition.scoreUpdatedAtTimestamp : l;
        String str14 = (i4 & 16) != 0 ? fantasyCompetition.sponsor : str2;
        String str15 = (i4 & 32) != 0 ? fantasyCompetition.prize : str3;
        String str16 = (i4 & 64) != 0 ? fantasyCompetition.rules : str4;
        FantasyRound fantasyRound7 = (i4 & 128) != 0 ? fantasyCompetition.currentRound : fantasyRound;
        FantasyRound fantasyRound8 = (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? fantasyCompetition.nextRound : fantasyRound2;
        FantasyRound fantasyRound9 = (i4 & 512) != 0 ? fantasyCompetition.previousRound : fantasyRound3;
        long j7 = (i4 & 1024) != 0 ? fantasyCompetition.totalPlayers : j;
        int i9 = (i4 & a.o) != 0 ? fantasyCompetition.roundCount : i2;
        int i10 = (i4 & 4096) != 0 ? fantasyCompetition.currentRoundSequence : i3;
        int i11 = i8;
        Float f3 = (i4 & 8192) != 0 ? fantasyCompetition.averageScore : f;
        Boolean bool3 = (i4 & 16384) != 0 ? fantasyCompetition.finished : bool;
        boolean z13 = (i4 & 32768) != 0 ? fantasyCompetition.isAlpha : z;
        List list3 = (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? fantasyCompetition.countries : list;
        UniqueTournament uniqueTournament3 = (i4 & 131072) != 0 ? fantasyCompetition.uniqueTournament : uniqueTournament;
        Category category3 = (i4 & 262144) != 0 ? fantasyCompetition.category : category;
        boolean z14 = (i4 & 524288) != 0 ? fantasyCompetition.official : z2;
        String str17 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? fantasyCompetition.officialPartnerName : str5;
        boolean z15 = (i4 & 2097152) != 0 ? fantasyCompetition.officialAssetsRestricted : z3;
        Integer num9 = (i4 & 4194304) != 0 ? fantasyCompetition.globalLeagueId : num;
        Season season3 = (i4 & 8388608) != 0 ? fantasyCompetition.season : season;
        boolean z16 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? fantasyCompetition.tripleCaptainAllowed : z4;
        Integer num10 = (i4 & 33554432) != 0 ? fantasyCompetition.tripleCaptainRenewalSequence : num2;
        boolean z17 = (i4 & 67108864) != 0 ? fantasyCompetition.wildcardAllowed : z5;
        Integer num11 = (i4 & 134217728) != 0 ? fantasyCompetition.wildcardRenewalSequence : num3;
        boolean z18 = (i4 & 268435456) != 0 ? fantasyCompetition.freeHitAllowed : z6;
        Integer num12 = (i4 & 536870912) != 0 ? fantasyCompetition.freeHitRenewalSequence : num4;
        Boolean bool4 = bool3;
        long j8 = (i4 & 1073741824) != 0 ? fantasyCompetition.startTimestamp : j2;
        long j9 = (i4 & Integer.MIN_VALUE) != 0 ? fantasyCompetition.endTimestamp : j3;
        if ((i5 & 1) != 0) {
            j4 = j9;
            str7 = fantasyCompetition.competitionColor;
            z7 = z14;
            str8 = str17;
            z8 = z15;
            num5 = num9;
            season2 = season3;
            z9 = z16;
            num6 = num10;
            z10 = z17;
            num7 = num11;
            z11 = z18;
            num8 = num12;
            j5 = j8;
            bool2 = bool4;
            str10 = str15;
            str11 = str16;
            fantasyRound4 = fantasyRound7;
            fantasyRound5 = fantasyRound8;
            fantasyRound6 = fantasyRound9;
            j6 = j7;
            i6 = i9;
            i7 = i10;
            f2 = f3;
            z12 = z13;
            list2 = list3;
            uniqueTournament2 = uniqueTournament3;
            category2 = category3;
            fantasyCompetitionType2 = fantasyCompetitionType3;
            str12 = str13;
            l2 = l3;
            str9 = str14;
        } else {
            str7 = str6;
            j4 = j9;
            uniqueTournament2 = uniqueTournament3;
            category2 = category3;
            z7 = z14;
            str8 = str17;
            z8 = z15;
            num5 = num9;
            season2 = season3;
            z9 = z16;
            num6 = num10;
            z10 = z17;
            num7 = num11;
            z11 = z18;
            num8 = num12;
            j5 = j8;
            bool2 = bool4;
            l2 = l3;
            str9 = str14;
            str10 = str15;
            str11 = str16;
            fantasyRound4 = fantasyRound7;
            fantasyRound5 = fantasyRound8;
            fantasyRound6 = fantasyRound9;
            j6 = j7;
            i6 = i9;
            i7 = i10;
            f2 = f3;
            z12 = z13;
            list2 = list3;
            fantasyCompetitionType2 = fantasyCompetitionType3;
            str12 = str13;
        }
        return fantasyCompetition.copy(i11, fantasyCompetitionType2, str12, l2, str9, str10, str11, fantasyRound4, fantasyRound5, fantasyRound6, j6, i6, i7, f2, bool2, z12, list2, uniqueTournament2, category2, z7, str8, z8, num5, season2, z9, num6, z10, num7, z11, num8, j5, j4, str7);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyCompetition self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        if (output.o(serialDesc) || self.type != FantasyCompetitionType.SEASON) {
            output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.type);
        }
        output.y(serialDesc, 2, self.name);
        output.h(serialDesc, 3, lkb.a, self.scoreUpdatedAtTimestamp);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 4, uhiVar, self.sponsor);
        output.y(serialDesc, 5, self.prize);
        output.y(serialDesc, 6, self.rules);
        FantasyRound$$serializer fantasyRound$$serializer = FantasyRound$$serializer.INSTANCE;
        output.f(serialDesc, 7, fantasyRound$$serializer, self.currentRound);
        output.h(serialDesc, 8, fantasyRound$$serializer, self.nextRound);
        output.h(serialDesc, 9, fantasyRound$$serializer, self.previousRound);
        output.E(serialDesc, 10, self.totalPlayers);
        output.u(11, self.roundCount, serialDesc);
        output.u(12, self.currentRoundSequence, serialDesc);
        output.h(serialDesc, 13, c88.a, self.averageScore);
        output.h(serialDesc, 14, gz1.a, self.finished);
        output.x(serialDesc, 15, self.isAlpha);
        output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.countries);
        output.h(serialDesc, 17, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        output.f(serialDesc, 18, Category$$serializer.INSTANCE, self.category);
        output.x(serialDesc, 19, self.official);
        output.h(serialDesc, 20, uhiVar, self.officialPartnerName);
        output.x(serialDesc, 21, self.officialAssetsRestricted);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 22, a7aVar, self.globalLeagueId);
        output.h(serialDesc, 23, Season$$serializer.INSTANCE, self.season);
        output.x(serialDesc, 24, self.tripleCaptainAllowed);
        output.h(serialDesc, 25, a7aVar, self.tripleCaptainRenewalSequence);
        output.x(serialDesc, 26, self.wildcardAllowed);
        output.h(serialDesc, 27, a7aVar, self.wildcardRenewalSequence);
        output.x(serialDesc, 28, self.freeHitAllowed);
        output.h(serialDesc, 29, a7aVar, self.freeHitRenewalSequence);
        output.E(serialDesc, 30, self.startTimestamp);
        output.E(serialDesc, 31, self.endTimestamp);
        output.h(serialDesc, 32, uhiVar, self.competitionColor);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final FantasyRound getPreviousRound() {
        return this.previousRound;
    }

    /* renamed from: component11, reason: from getter */
    public final long getTotalPlayers() {
        return this.totalPlayers;
    }

    /* renamed from: component12, reason: from getter */
    public final int getRoundCount() {
        return this.roundCount;
    }

    /* renamed from: component13, reason: from getter */
    public final int getCurrentRoundSequence() {
        return this.currentRoundSequence;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Float getAverageScore() {
        return this.averageScore;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Boolean getFinished() {
        return this.finished;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsAlpha() {
        return this.isAlpha;
    }

    @Nullable
    public final List<String> component17() {
        return this.countries;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FantasyCompetitionType getType() {
        return this.type;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getOfficial() {
        return this.official;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final String getOfficialPartnerName() {
        return this.officialPartnerName;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getOfficialAssetsRestricted() {
        return this.officialAssetsRestricted;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getGlobalLeagueId() {
        return this.globalLeagueId;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Season getSeason() {
        return this.season;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getTripleCaptainAllowed() {
        return this.tripleCaptainAllowed;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getTripleCaptainRenewalSequence() {
        return this.tripleCaptainRenewalSequence;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getWildcardAllowed() {
        return this.wildcardAllowed;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getWildcardRenewalSequence() {
        return this.wildcardRenewalSequence;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getFreeHitAllowed() {
        return this.freeHitAllowed;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Integer getFreeHitRenewalSequence() {
        return this.freeHitRenewalSequence;
    }

    /* renamed from: component31, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* renamed from: component32, reason: from getter */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final String getCompetitionColor() {
        return this.competitionColor;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getScoreUpdatedAtTimestamp() {
        return this.scoreUpdatedAtTimestamp;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getSponsor() {
        return this.sponsor;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getPrize() {
        return this.prize;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getRules() {
        return this.rules;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final FantasyRound getCurrentRound() {
        return this.currentRound;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final FantasyRound getNextRound() {
        return this.nextRound;
    }

    @NotNull
    public final FantasyCompetition copy(int id, @NotNull FantasyCompetitionType type, @NotNull String name, @Nullable Long scoreUpdatedAtTimestamp, @Nullable String sponsor, @NotNull String prize, @NotNull String rules, @NotNull FantasyRound currentRound, @Nullable FantasyRound nextRound, @Nullable FantasyRound previousRound, long totalPlayers, int roundCount, int currentRoundSequence, @Nullable Float averageScore, @Nullable Boolean finished, boolean isAlpha, @Nullable List<String> countries, @Nullable UniqueTournament uniqueTournament, @NotNull Category category, boolean official, @Nullable String officialPartnerName, boolean officialAssetsRestricted, @Nullable Integer globalLeagueId, @Nullable Season season, boolean tripleCaptainAllowed, @Nullable Integer tripleCaptainRenewalSequence, boolean wildcardAllowed, @Nullable Integer wildcardRenewalSequence, boolean freeHitAllowed, @Nullable Integer freeHitRenewalSequence, long startTimestamp, long endTimestamp, @Nullable String competitionColor) {
        type.getClass();
        name.getClass();
        prize.getClass();
        rules.getClass();
        currentRound.getClass();
        category.getClass();
        return new FantasyCompetition(id, type, name, scoreUpdatedAtTimestamp, sponsor, prize, rules, currentRound, nextRound, previousRound, totalPlayers, roundCount, currentRoundSequence, averageScore, finished, isAlpha, countries, uniqueTournament, category, official, officialPartnerName, officialAssetsRestricted, globalLeagueId, season, tripleCaptainAllowed, tripleCaptainRenewalSequence, wildcardAllowed, wildcardRenewalSequence, freeHitAllowed, freeHitRenewalSequence, startTimestamp, endTimestamp, competitionColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyCompetition)) {
            return false;
        }
        FantasyCompetition fantasyCompetition = (FantasyCompetition) other;
        return this.id == fantasyCompetition.id && this.type == fantasyCompetition.type && Intrinsics.c(this.name, fantasyCompetition.name) && Intrinsics.c(this.scoreUpdatedAtTimestamp, fantasyCompetition.scoreUpdatedAtTimestamp) && Intrinsics.c(this.sponsor, fantasyCompetition.sponsor) && Intrinsics.c(this.prize, fantasyCompetition.prize) && Intrinsics.c(this.rules, fantasyCompetition.rules) && Intrinsics.c(this.currentRound, fantasyCompetition.currentRound) && Intrinsics.c(this.nextRound, fantasyCompetition.nextRound) && Intrinsics.c(this.previousRound, fantasyCompetition.previousRound) && this.totalPlayers == fantasyCompetition.totalPlayers && this.roundCount == fantasyCompetition.roundCount && this.currentRoundSequence == fantasyCompetition.currentRoundSequence && Intrinsics.c(this.averageScore, fantasyCompetition.averageScore) && Intrinsics.c(this.finished, fantasyCompetition.finished) && this.isAlpha == fantasyCompetition.isAlpha && Intrinsics.c(this.countries, fantasyCompetition.countries) && Intrinsics.c(this.uniqueTournament, fantasyCompetition.uniqueTournament) && Intrinsics.c(this.category, fantasyCompetition.category) && this.official == fantasyCompetition.official && Intrinsics.c(this.officialPartnerName, fantasyCompetition.officialPartnerName) && this.officialAssetsRestricted == fantasyCompetition.officialAssetsRestricted && Intrinsics.c(this.globalLeagueId, fantasyCompetition.globalLeagueId) && Intrinsics.c(this.season, fantasyCompetition.season) && this.tripleCaptainAllowed == fantasyCompetition.tripleCaptainAllowed && Intrinsics.c(this.tripleCaptainRenewalSequence, fantasyCompetition.tripleCaptainRenewalSequence) && this.wildcardAllowed == fantasyCompetition.wildcardAllowed && Intrinsics.c(this.wildcardRenewalSequence, fantasyCompetition.wildcardRenewalSequence) && this.freeHitAllowed == fantasyCompetition.freeHitAllowed && Intrinsics.c(this.freeHitRenewalSequence, fantasyCompetition.freeHitRenewalSequence) && this.startTimestamp == fantasyCompetition.startTimestamp && this.endTimestamp == fantasyCompetition.endTimestamp && Intrinsics.c(this.competitionColor, fantasyCompetition.competitionColor);
    }

    @Nullable
    public final Float getAverageScore() {
        return this.averageScore;
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    public final String getCompetitionColor() {
        return this.competitionColor;
    }

    @Nullable
    public final List<String> getCountries() {
        return this.countries;
    }

    @NotNull
    public final FantasyRound getCurrentRound() {
        return this.currentRound;
    }

    public final int getCurrentRoundSequence() {
        return this.currentRoundSequence;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final Boolean getFinished() {
        return this.finished;
    }

    public final boolean getFreeHitAllowed() {
        return this.freeHitAllowed;
    }

    @Nullable
    public final Integer getFreeHitRenewalSequence() {
        return this.freeHitRenewalSequence;
    }

    @Nullable
    public final Integer getGlobalLeagueId() {
        return this.globalLeagueId;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final FantasyRound getNextRound() {
        return this.nextRound;
    }

    public final boolean getOfficial() {
        return this.official;
    }

    public final boolean getOfficialAssetsRestricted() {
        return this.officialAssetsRestricted;
    }

    @Nullable
    public final String getOfficialPartnerName() {
        return this.officialPartnerName;
    }

    @Nullable
    public final FantasyRound getPreviousRound() {
        return this.previousRound;
    }

    @NotNull
    public final String getPrize() {
        return this.prize;
    }

    public final int getRoundCount() {
        return this.roundCount;
    }

    @NotNull
    public final String getRules() {
        return this.rules;
    }

    @Nullable
    public final Long getScoreUpdatedAtTimestamp() {
        return this.scoreUpdatedAtTimestamp;
    }

    @Nullable
    public final Season getSeason() {
        return this.season;
    }

    @Nullable
    public final String getSponsor() {
        return this.sponsor;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final long getTotalPlayers() {
        return this.totalPlayers;
    }

    public final boolean getTripleCaptainAllowed() {
        return this.tripleCaptainAllowed;
    }

    @Nullable
    public final Integer getTripleCaptainRenewalSequence() {
        return this.tripleCaptainRenewalSequence;
    }

    @NotNull
    public final FantasyCompetitionType getType() {
        return this.type;
    }

    @Nullable
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    public final boolean getWildcardAllowed() {
        return this.wildcardAllowed;
    }

    @Nullable
    public final Integer getWildcardRenewalSequence() {
        return this.wildcardRenewalSequence;
    }

    public int hashCode() {
        int c = dmi.c((this.type.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.name);
        Long l = this.scoreUpdatedAtTimestamp;
        int hashCode = (c + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.sponsor;
        int hashCode2 = (this.currentRound.hashCode() + dmi.c(dmi.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.prize), 31, this.rules)) * 31;
        FantasyRound fantasyRound = this.nextRound;
        int hashCode3 = (hashCode2 + (fantasyRound == null ? 0 : fantasyRound.hashCode())) * 31;
        FantasyRound fantasyRound2 = this.previousRound;
        int a = wv8.a(this.currentRoundSequence, wv8.a(this.roundCount, ljg.c((hashCode3 + (fantasyRound2 == null ? 0 : fantasyRound2.hashCode())) * 31, 31, this.totalPlayers), 31), 31);
        Float f = this.averageScore;
        int hashCode4 = (a + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.finished;
        int e = dmi.e((hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isAlpha);
        List<String> list = this.countries;
        int hashCode5 = (e + (list == null ? 0 : list.hashCode())) * 31;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        int e2 = dmi.e((this.category.hashCode() + ((hashCode5 + (uniqueTournament == null ? 0 : uniqueTournament.hashCode())) * 31)) * 31, 31, this.official);
        String str2 = this.officialPartnerName;
        int e3 = dmi.e((e2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.officialAssetsRestricted);
        Integer num = this.globalLeagueId;
        int hashCode6 = (e3 + (num == null ? 0 : num.hashCode())) * 31;
        Season season = this.season;
        int e4 = dmi.e((hashCode6 + (season == null ? 0 : season.hashCode())) * 31, 31, this.tripleCaptainAllowed);
        Integer num2 = this.tripleCaptainRenewalSequence;
        int e5 = dmi.e((e4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.wildcardAllowed);
        Integer num3 = this.wildcardRenewalSequence;
        int e6 = dmi.e((e5 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.freeHitAllowed);
        Integer num4 = this.freeHitRenewalSequence;
        int c2 = ljg.c(ljg.c((e6 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.startTimestamp), 31, this.endTimestamp);
        String str3 = this.competitionColor;
        return c2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isAlpha() {
        return this.isAlpha;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        FantasyCompetitionType fantasyCompetitionType = this.type;
        String str = this.name;
        Long l = this.scoreUpdatedAtTimestamp;
        String str2 = this.sponsor;
        String str3 = this.prize;
        String str4 = this.rules;
        FantasyRound fantasyRound = this.currentRound;
        FantasyRound fantasyRound2 = this.nextRound;
        FantasyRound fantasyRound3 = this.previousRound;
        long j = this.totalPlayers;
        int i2 = this.roundCount;
        int i3 = this.currentRoundSequence;
        Float f = this.averageScore;
        Boolean bool = this.finished;
        boolean z = this.isAlpha;
        List<String> list = this.countries;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        Category category = this.category;
        boolean z2 = this.official;
        String str5 = this.officialPartnerName;
        boolean z3 = this.officialAssetsRestricted;
        Integer num = this.globalLeagueId;
        Season season = this.season;
        boolean z4 = this.tripleCaptainAllowed;
        Integer num2 = this.tripleCaptainRenewalSequence;
        boolean z5 = this.wildcardAllowed;
        Integer num3 = this.wildcardRenewalSequence;
        boolean z6 = this.freeHitAllowed;
        Integer num4 = this.freeHitRenewalSequence;
        long j2 = this.startTimestamp;
        long j3 = this.endTimestamp;
        String str6 = this.competitionColor;
        StringBuilder sb = new StringBuilder("FantasyCompetition(id=");
        sb.append(i);
        sb.append(", type=");
        sb.append(fantasyCompetitionType);
        sb.append(", name=");
        sb.append(str);
        sb.append(", scoreUpdatedAtTimestamp=");
        sb.append(l);
        sb.append(", sponsor=");
        bf3.v(sb, str2, ", prize=", str3, ", rules=");
        sb.append(str4);
        sb.append(", currentRound=");
        sb.append(fantasyRound);
        sb.append(", nextRound=");
        sb.append(fantasyRound2);
        sb.append(", previousRound=");
        sb.append(fantasyRound3);
        sb.append(", totalPlayers=");
        sb.append(j);
        sb.append(", roundCount=");
        sb.append(i2);
        sb.append(", currentRoundSequence=");
        sb.append(i3);
        sb.append(", averageScore=");
        sb.append(f);
        sb.append(", finished=");
        sb.append(bool);
        sb.append(", isAlpha=");
        sb.append(z);
        sb.append(", countries=");
        sb.append(list);
        sb.append(", uniqueTournament=");
        sb.append(uniqueTournament);
        sb.append(", category=");
        sb.append(category);
        sb.append(", official=");
        sb.append(z2);
        sb.append(", officialPartnerName=");
        sb.append(str5);
        sb.append(", officialAssetsRestricted=");
        sb.append(z3);
        sb.append(", globalLeagueId=");
        sb.append(num);
        sb.append(", season=");
        sb.append(season);
        sb.append(", tripleCaptainAllowed=");
        sb.append(z4);
        sb.append(", tripleCaptainRenewalSequence=");
        sb.append(num2);
        sb.append(", wildcardAllowed=");
        sb.append(z5);
        sb.append(", wildcardRenewalSequence=");
        sb.append(num3);
        sb.append(", freeHitAllowed=");
        sb.append(z6);
        sb.append(", freeHitRenewalSequence=");
        sb.append(num4);
        fn0.t(j2, ", startTimestamp=", ", endTimestamp=", sb);
        sb.append(j3);
        sb.append(", competitionColor=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyCompetition$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyCompetition;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyCompetition$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyCompetition(int i, @NotNull FantasyCompetitionType fantasyCompetitionType, @NotNull String str, @Nullable Long l, @Nullable String str2, @NotNull String str3, @NotNull String str4, @NotNull FantasyRound fantasyRound, @Nullable FantasyRound fantasyRound2, @Nullable FantasyRound fantasyRound3, long j, int i2, int i3, @Nullable Float f, @Nullable Boolean bool, boolean z, @Nullable List<String> list, @Nullable UniqueTournament uniqueTournament, @NotNull Category category, boolean z2, @Nullable String str5, boolean z3, @Nullable Integer num, @Nullable Season season, boolean z4, @Nullable Integer num2, boolean z5, @Nullable Integer num3, boolean z6, @Nullable Integer num4, long j2, long j3, @Nullable String str6) {
        fantasyCompetitionType.getClass();
        str.getClass();
        str3.getClass();
        str4.getClass();
        fantasyRound.getClass();
        category.getClass();
        this.id = i;
        this.type = fantasyCompetitionType;
        this.name = str;
        this.scoreUpdatedAtTimestamp = l;
        this.sponsor = str2;
        this.prize = str3;
        this.rules = str4;
        this.currentRound = fantasyRound;
        this.nextRound = fantasyRound2;
        this.previousRound = fantasyRound3;
        this.totalPlayers = j;
        this.roundCount = i2;
        this.currentRoundSequence = i3;
        this.averageScore = f;
        this.finished = bool;
        this.isAlpha = z;
        this.countries = list;
        this.uniqueTournament = uniqueTournament;
        this.category = category;
        this.official = z2;
        this.officialPartnerName = str5;
        this.officialAssetsRestricted = z3;
        this.globalLeagueId = num;
        this.season = season;
        this.tripleCaptainAllowed = z4;
        this.tripleCaptainRenewalSequence = num2;
        this.wildcardAllowed = z5;
        this.wildcardRenewalSequence = num3;
        this.freeHitAllowed = z6;
        this.freeHitRenewalSequence = num4;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.competitionColor = str6;
    }

    public /* synthetic */ FantasyCompetition(int i, FantasyCompetitionType fantasyCompetitionType, String str, Long l, String str2, String str3, String str4, FantasyRound fantasyRound, FantasyRound fantasyRound2, FantasyRound fantasyRound3, long j, int i2, int i3, Float f, Boolean bool, boolean z, List list, UniqueTournament uniqueTournament, Category category, boolean z2, String str5, boolean z3, Integer num, Season season, boolean z4, Integer num2, boolean z5, Integer num3, boolean z6, Integer num4, long j2, long j3, String str6, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? FantasyCompetitionType.SEASON : fantasyCompetitionType, str, l, str2, str3, str4, fantasyRound, fantasyRound2, fantasyRound3, j, i2, i3, f, bool, z, list, uniqueTournament, category, z2, str5, z3, num, season, z4, num2, z5, num3, z6, num4, j2, j3, str6);
    }
}
