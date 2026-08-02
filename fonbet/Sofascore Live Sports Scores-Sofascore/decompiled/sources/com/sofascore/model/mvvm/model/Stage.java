package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.ServerTypeSerializer;
import com.sofascore.model.util.EventInterface;
import defpackage.a7a;
import defpackage.b1i;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.joa;
import defpackage.lkb;
import defpackage.oea;
import defpackage.qq3;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.w1l;
import defpackage.wf3;
import defpackage.wth;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.HashSet;
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
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bY\b\u0087\b\u0018\u0000 æ\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004ç\u0001æ\u0001B¡\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0000\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010+BA\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010,B¥\u0003\b\u0010\u0012\u0006\u0010-\u001a\u00020\u0010\u0012\u0006\u0010.\u001a\u00020\u0010\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0000\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/\u0012\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\u0006\u00105\u001a\u00020\u0018\u0012\b\u00106\u001a\u0004\u0018\u00010\u0000\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\u0006\u0010;\u001a\u00020\"\u0012\u0006\u0010<\u001a\u00020\"\u0012\u0006\u0010=\u001a\u00020\"\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b*\u0010@J\u000f\u0010A\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u000107¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\u0018¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u00020D2\u0006\u0010L\u001a\u00020\u0018¢\u0006\u0004\bM\u0010NJ\u001d\u0010P\u001a\u0012\u0012\u0004\u0012\u0002000/j\b\u0012\u0004\u0012\u000200`O¢\u0006\u0004\bP\u0010QJ%\u0010S\u001a\u00020D2\u0016\u0010R\u001a\u0012\u0012\u0004\u0012\u0002000/j\b\u0012\u0004\u0012\u000200`O¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020D2\b\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\"H\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0006H\u0016¢\u0006\u0004\b[\u0010VJ\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010ZJ\u0017\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u0004\u0018\u00010'¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bb\u0010VJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bc\u0010VJ\u0012\u0010d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0012\u0010f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0012\u0010h\u001a\u0004\u0018\u00010\u0000HÆ\u0003¢\u0006\u0004\bh\u0010BJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0000HÆ\u0003¢\u0006\u0004\bi\u0010BJ\u0018\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bj\u0010]J\u0012\u0010k\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bk\u0010VJ\u0010\u0010l\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0012\u0010p\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0012\u0010r\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\br\u0010sJ\u0012\u0010t\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bt\u0010uJ\u0018\u0010v\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bv\u0010]J\u0012\u0010w\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bw\u0010xJ\u0012\u0010y\u001a\u0004\u0018\u00010\u0000HÆ\u0003¢\u0006\u0004\by\u0010BJ\u0012\u0010z\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bz\u0010{J\u0018\u0010|\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b|\u0010]J\u0018\u0010}\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b}\u0010]J\u0012\u0010~\u001a\u0004\u0018\u00010\u0000HÆ\u0003¢\u0006\u0004\b~\u0010BJ\u0012\u0010\u007f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u007f\u0010VJß\u0002\u0010\u0080\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0012\u0010\u0082\u0001\u001a\u00020\u0006HÖ\u0001¢\u0006\u0005\b\u0082\u0001\u0010VJ\u0012\u0010\u0083\u0001\u001a\u00020\u0010HÖ\u0001¢\u0006\u0005\b\u0083\u0001\u0010mJ\u001f\u0010\u0086\u0001\u001a\u00020\"2\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001HÖ\u0003¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0018HÂ\u0003¢\u0006\u0005\b\u0088\u0001\u0010sJ\u0014\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0018HÂ\u0003¢\u0006\u0005\b\u0089\u0001\u0010sJ\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0005\b\u008a\u0001\u0010VJ\u0014\u0010\u008b\u0001\u001a\u0004\u0018\u00010'HÂ\u0003¢\u0006\u0005\b\u008b\u0001\u0010_J/\u0010\u0093\u0001\u001a\u00020D2\u0007\u0010\u008c\u0001\u001a\u00020\u00002\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001R(\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b\u0005\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010a\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010VR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\b\u0010\u0098\u0001\u001a\u0005\b\u009a\u0001\u0010VR&\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\n\u0010\u009b\u0001\u0012\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0005\b\u009c\u0001\u0010eR\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\f\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010gR'\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\r\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010B\"\u0005\b£\u0001\u0010FR'\u0010\u000e\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u000e\u0010¡\u0001\u001a\u0005\b¤\u0001\u0010B\"\u0005\b¥\u0001\u0010FR$\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010¦\u0001\u001a\u0005\b§\u0001\u0010]R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010\u0098\u0001\u001a\u0005\b¨\u0001\u0010VR\u001c\u0010\u0013\u001a\u00020\u00108\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010©\u0001\u001a\u0005\bª\u0001\u0010mR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010«\u0001\u001a\u0005\b¬\u0001\u0010oR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u00ad\u0001\u001a\u0005\b®\u0001\u0010qR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010¯\u0001R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010¯\u0001R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010¯\u0001\u001a\u0005\b°\u0001\u0010sR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010±\u0001\u001a\u0005\b²\u0001\u0010uR$\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010¦\u0001\u001a\u0005\b³\u0001\u0010]R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010´\u0001\u001a\u0005\bµ\u0001\u0010xR\u0019\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0010\u0098\u0001R'\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b!\u0010¡\u0001\u001a\u0005\b¶\u0001\u0010B\"\u0005\b·\u0001\u0010FR(\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b#\u0010¸\u0001\u001a\u0005\b¹\u0001\u0010{\"\u0006\bº\u0001\u0010»\u0001R.\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b$\u0010¦\u0001\u001a\u0005\b¼\u0001\u0010]\"\u0006\b½\u0001\u0010¾\u0001R.\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b%\u0010¦\u0001\u001a\u0005\b¿\u0001\u0010]\"\u0006\bÀ\u0001\u0010¾\u0001R\u001e\u0010&\u001a\u0004\u0018\u00010\u00008\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010¡\u0001\u001a\u0005\bÁ\u0001\u0010BR\u0017\u0010(\u001a\u0004\u0018\u00010'8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b(\u0010Â\u0001R\u001e\u0010)\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010\u0098\u0001\u001a\u0005\bÃ\u0001\u0010VR+\u00101\u001a\u0016\u0012\u0004\u0012\u000200\u0018\u00010/j\n\u0012\u0004\u0012\u000200\u0018\u0001`O8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b1\u0010Ä\u0001R.\u00102\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b2\u0010¦\u0001\u001a\u0005\bÅ\u0001\u0010]\"\u0006\bÆ\u0001\u0010¾\u0001R4\u00104\u001a\u0004\u0018\u0001032\t\u0010Ç\u0001\u001a\u0004\u0018\u0001038F@FX\u0087\u000e¢\u0006\u0017\n\u0005\b4\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R%\u00105\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b5\u0010Í\u0001\u001a\u0005\bÎ\u0001\u0010K\"\u0005\bÏ\u0001\u0010NR\u0019\u00106\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b6\u0010¡\u0001R\u0019\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b8\u0010Ð\u0001R4\u0010:\u001a\u0004\u0018\u0001092\t\u0010Ç\u0001\u001a\u0004\u0018\u0001098F@FX\u0087\u000e¢\u0006\u0017\n\u0005\b:\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R%\u0010;\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b;\u0010Ö\u0001\u001a\u0004\b;\u0010Z\"\u0006\b×\u0001\u0010Ø\u0001R%\u0010<\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b<\u0010Ö\u0001\u001a\u0004\b<\u0010Z\"\u0006\bÙ\u0001\u0010Ø\u0001R%\u0010=\u001a\u00020\"8\u0016@\u0016X\u0097\u000e¢\u0006\u0015\n\u0005\b=\u0010Ö\u0001\u001a\u0004\b=\u0010Z\"\u0006\bÚ\u0001\u0010Ø\u0001R\u0015\u0010Ü\u0001\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010xR\u0016\u0010Þ\u0001\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010mR\u0015\u0010L\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bß\u0001\u0010KR\u0016\u0010á\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bà\u0001\u0010VR\u0016\u0010ã\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010VR\u0018\u0010å\u0001\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bä\u0001\u0010V¨\u0006è\u0001"}, d2 = {"Lcom/sofascore/model/mvvm/model/Stage;", "Lcom/sofascore/model/util/EventInterface;", "Lcom/sofascore/model/mvvm/IRecent;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/UniqueStage;", SearchResponseKt.UNIQUE_STAGE_ENTITY, "", "description", "slug", "Lcom/sofascore/model/mvvm/model/ServerType;", "type", "Lcom/sofascore/model/mvvm/model/Status;", "status", "currentSubstage", "substage", "", "", "substageStartDateTimestamps", "year", "id", "Lcom/sofascore/model/mvvm/model/Country;", "country", "Lcom/sofascore/model/mvvm/model/StageInfo;", "info", "", "startTimestamp", "startDateTimestamp", "endDateTimestamp", "Lcom/sofascore/model/mvvm/model/StageWinner;", "winner", "partSubstages", "sequence", "flag", "stageParent", "", "hasBet365LiveStream", "bet365ExcludedCountryCodes", "substages", "raceStage", "Lcom/sofascore/model/mvvm/model/Category;", "category", "shortName", "<init>", "(Lcom/sofascore/model/mvvm/model/UniqueStage;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/ServerType;Lcom/sofascore/model/mvvm/model/Status;Lcom/sofascore/model/mvvm/model/Stage;Lcom/sofascore/model/mvvm/model/Stage;Ljava/util/List;Ljava/lang/String;ILcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/StageInfo;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/StageWinner;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Stage;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Stage;Lcom/sofascore/model/mvvm/model/Category;Ljava/lang/String;)V", "(Ljava/lang/String;Lcom/sofascore/model/mvvm/model/ServerType;Lcom/sofascore/model/mvvm/model/Status;ILcom/sofascore/model/mvvm/model/StageWinner;Ljava/lang/String;)V", "seen0", "seen1", "Ljava/util/HashSet;", "Lcom/sofascore/model/mvvm/model/StageType;", "typeList", "allSubStages", "Lcom/sofascore/model/mvvm/model/StageEvent;", "parentEvent", "lastUpdate", "stageEvent", "Lcom/sofascore/model/mvvm/model/StageDiscipline;", "stageDiscipline", "Lcom/sofascore/model/mvvm/model/StageSeason;", "stageSeason", "isMuted", "isHidden", "isRecent", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/mvvm/model/UniqueStage;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/ServerType;Lcom/sofascore/model/mvvm/model/Status;Lcom/sofascore/model/mvvm/model/Stage;Lcom/sofascore/model/mvvm/model/Stage;Ljava/util/List;Ljava/lang/String;ILcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/StageInfo;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/StageWinner;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Stage;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Stage;Lcom/sofascore/model/mvvm/model/Category;Ljava/lang/String;Ljava/util/HashSet;Ljava/util/List;Lcom/sofascore/model/mvvm/model/StageEvent;JLcom/sofascore/model/mvvm/model/Stage;Lcom/sofascore/model/mvvm/model/StageDiscipline;Lcom/sofascore/model/mvvm/model/StageSeason;ZZZLt5h;)V", "getStageEvent", "()Lcom/sofascore/model/mvvm/model/Stage;", "event", "", "setStageEvent", "(Lcom/sofascore/model/mvvm/model/Stage;)V", "stage", "setStageDiscipline", "(Lcom/sofascore/model/mvvm/model/StageDiscipline;)V", "getStartDateTimestamp", "()J", "timestamp", "setStartDateTimestamp", "(J)V", "Lkotlin/collections/HashSet;", "getTypeList", "()Ljava/util/HashSet;", "list", "setTypeList", "(Ljava/util/HashSet;)V", "getFlag", "()Ljava/lang/String;", "setFlag", "(Ljava/lang/String;)V", "hasExtraInfo", "()Z", "tvChannelString", "countriesWithBlockedBet365Stream", "()Ljava/util/List;", "getCategory", "()Lcom/sofascore/model/mvvm/model/Category;", "component1", "()Lcom/sofascore/model/mvvm/model/UniqueStage;", "component2", "component3", "component4", "()Lcom/sofascore/model/mvvm/model/ServerType;", "component5", "()Lcom/sofascore/model/mvvm/model/Status;", "component6", "component7", "component8", "component9", "component10", "()I", "component11", "()Lcom/sofascore/model/mvvm/model/Country;", "component12", "()Lcom/sofascore/model/mvvm/model/StageInfo;", "component15", "()Ljava/lang/Long;", "component16", "()Lcom/sofascore/model/mvvm/model/StageWinner;", "component17", "component18", "()Ljava/lang/Integer;", "component20", "component21", "()Ljava/lang/Boolean;", "component22", "component23", "component24", "component26", "copy", "(Lcom/sofascore/model/mvvm/model/UniqueStage;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/ServerType;Lcom/sofascore/model/mvvm/model/Status;Lcom/sofascore/model/mvvm/model/Stage;Lcom/sofascore/model/mvvm/model/Stage;Ljava/util/List;Ljava/lang/String;ILcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/StageInfo;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/StageWinner;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Stage;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Stage;Lcom/sofascore/model/mvvm/model/Category;Ljava/lang/String;)Lcom/sofascore/model/mvvm/model/Stage;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "component13", "component14", "component19", "component25", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Stage;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/UniqueStage;", "getUniqueStage", "setUniqueStage", "(Lcom/sofascore/model/mvvm/model/UniqueStage;)V", "Ljava/lang/String;", "getDescription", "getSlug", "Lcom/sofascore/model/mvvm/model/ServerType;", "getType", "getType$annotations", "()V", "Lcom/sofascore/model/mvvm/model/Status;", "getStatus", "Lcom/sofascore/model/mvvm/model/Stage;", "getCurrentSubstage", "setCurrentSubstage", "getSubstage", "setSubstage", "Ljava/util/List;", "getSubstageStartDateTimestamps", "getYear", "I", "getId", "Lcom/sofascore/model/mvvm/model/Country;", "getCountry", "Lcom/sofascore/model/mvvm/model/StageInfo;", "getInfo", "Ljava/lang/Long;", "getEndDateTimestamp", "Lcom/sofascore/model/mvvm/model/StageWinner;", "getWinner", "getPartSubstages", "Ljava/lang/Integer;", "getSequence", "getStageParent", "setStageParent", "Ljava/lang/Boolean;", "getHasBet365LiveStream", "setHasBet365LiveStream", "(Ljava/lang/Boolean;)V", "getBet365ExcludedCountryCodes", "setBet365ExcludedCountryCodes", "(Ljava/util/List;)V", "getSubstages", "setSubstages", "getRaceStage", "Lcom/sofascore/model/mvvm/model/Category;", "getShortName", "Ljava/util/HashSet;", "getAllSubStages", "setAllSubStages", U3.i.X, "Lcom/sofascore/model/mvvm/model/StageEvent;", "getParentEvent", "()Lcom/sofascore/model/mvvm/model/StageEvent;", "setParentEvent", "(Lcom/sofascore/model/mvvm/model/StageEvent;)V", "J", "getLastUpdate", "setLastUpdate", "Lcom/sofascore/model/mvvm/model/StageDiscipline;", "Lcom/sofascore/model/mvvm/model/StageSeason;", "getStageSeason", "()Lcom/sofascore/model/mvvm/model/StageSeason;", "setStageSeason", "(Lcom/sofascore/model/mvvm/model/StageSeason;)V", "Z", "setMuted", "(Z)V", "setHidden", "setRecent", "getUniqueStageId", "uniqueStageId", "getChatId", "chatId", "getTimestamp", "getStatusType", "statusType", "getChannelName", "channelName", "getSportSlug", "sportSlug", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Stage implements EventInterface, IRecent, Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<Stage> allSubStages;

    @Nullable
    private List<String> bet365ExcludedCountryCodes;

    @Nullable
    private final Category category;

    @Nullable
    private final Country country;

    @Nullable
    private Stage currentSubstage;

    @NotNull
    private final String description;

    @Nullable
    private final Long endDateTimestamp;

    @Nullable
    private String flag;

    @Nullable
    private Boolean hasBet365LiveStream;
    private final int id;

    @Nullable
    private final StageInfo info;
    private boolean isHidden;
    private boolean isMuted;
    private boolean isRecent;
    private long lastUpdate;

    @Nullable
    private StageEvent parentEvent;

    @Nullable
    private final List<Stage> partSubstages;

    @Nullable
    private final Stage raceStage;

    @Nullable
    private final Integer sequence;

    @Nullable
    private final String shortName;

    @Nullable
    private final String slug;

    @Nullable
    private StageDiscipline stageDiscipline;

    @Nullable
    private Stage stageEvent;

    @Nullable
    private Stage stageParent;

    @Nullable
    private StageSeason stageSeason;

    @Nullable
    private Long startDateTimestamp;

    @Nullable
    private Long startTimestamp;

    @Nullable
    private final Status status;

    @Nullable
    private Stage substage;

    @Nullable
    private final List<Integer> substageStartDateTimestamps;

    @Nullable
    private List<Stage> substages;

    @Nullable
    private final ServerType type;

    @Nullable
    private HashSet<StageType> typeList;

    @Nullable
    private UniqueStage uniqueStage;

    @Nullable
    private final StageWinner winner;

    @Nullable
    private final String year;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, ypa.a(ysaVar, new wth(27)), null, null, null, null, null, null, null, null, ypa.a(ysaVar, new wth(28)), null, null, null, null, ypa.a(ysaVar, new wth(29)), ypa.a(ysaVar, new b1i(0)), null, null, null, ypa.a(ysaVar, new b1i(1)), ypa.a(ysaVar, new b1i(2)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ Stage(int i, int i2, UniqueStage uniqueStage, String str, String str2, ServerType serverType, Status status, Stage stage, Stage stage2, List list, String str3, int i3, Country country, StageInfo stageInfo, Long l, Long l2, Long l3, StageWinner stageWinner, List list2, Integer num, String str4, Stage stage3, Boolean bool, List list3, List list4, Stage stage4, Category category, String str5, HashSet hashSet, List list5, StageEvent stageEvent, long j, Stage stage5, StageDiscipline stageDiscipline, StageSeason stageSeason, boolean z, boolean z2, boolean z3, t5h t5hVar) {
        if (66584575 != (i & 66584575)) {
            oea.y(new int[]{i, i2}, new int[]{66584575, 0}, Stage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.uniqueStage = uniqueStage;
        this.description = str;
        this.slug = str2;
        this.type = serverType;
        this.status = status;
        this.currentSubstage = stage;
        this.substage = stage2;
        this.substageStartDateTimestamps = list;
        this.year = str3;
        this.id = i3;
        this.country = country;
        this.info = stageInfo;
        this.startTimestamp = l;
        this.startDateTimestamp = l2;
        this.endDateTimestamp = l3;
        this.winner = stageWinner;
        this.partSubstages = list2;
        this.sequence = num;
        this.flag = str4;
        if ((524288 & i) == 0) {
            this.stageParent = null;
        } else {
            this.stageParent = stage3;
        }
        this.hasBet365LiveStream = bool;
        this.bet365ExcludedCountryCodes = list3;
        this.substages = list4;
        this.raceStage = stage4;
        this.category = category;
        this.shortName = str5;
        if ((67108864 & i) == 0) {
            this.typeList = null;
        } else {
            this.typeList = hashSet;
        }
        if ((134217728 & i) == 0) {
            this.allSubStages = null;
        } else {
            this.allSubStages = list5;
        }
        if ((268435456 & i) == 0) {
            this.parentEvent = null;
        } else {
            this.parentEvent = stageEvent;
        }
        this.lastUpdate = (536870912 & i) == 0 ? 0L : j;
        if ((1073741824 & i) == 0) {
            this.stageEvent = null;
        } else {
            this.stageEvent = stage5;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.stageDiscipline = null;
        } else {
            this.stageDiscipline = stageDiscipline;
        }
        if ((i2 & 1) == 0) {
            this.stageSeason = null;
        } else {
            this.stageSeason = stageSeason;
        }
        if ((i2 & 2) == 0) {
            this.isMuted = false;
        } else {
            this.isMuted = z;
        }
        if ((i2 & 4) == 0) {
            this.isHidden = false;
        } else {
            this.isHidden = z2;
        }
        if ((i2 & 8) == 0) {
            this.isRecent = false;
        } else {
            this.isRecent = z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Stage$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(uhi.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(Stage$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$3() {
        StageType[] values = StageType.values();
        values.getClass();
        return new xg0(new qq3("com.sofascore.model.mvvm.model.StageType", (Enum[]) values), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(Stage$$serializer.INSTANCE, 0);
    }

    /* renamed from: component13, reason: from getter */
    private final Long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* renamed from: component14, reason: from getter */
    private final Long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    /* renamed from: component19, reason: from getter */
    private final String getFlag() {
        return this.flag;
    }

    /* renamed from: component25, reason: from getter */
    private final Category getCategory() {
        return this.category;
    }

    public static /* synthetic */ Stage copy$default(Stage stage, UniqueStage uniqueStage, String str, String str2, ServerType serverType, Status status, Stage stage2, Stage stage3, List list, String str3, int i, Country country, StageInfo stageInfo, Long l, Long l2, Long l3, StageWinner stageWinner, List list2, Integer num, String str4, Stage stage4, Boolean bool, List list3, List list4, Stage stage5, Category category, String str5, int i2, Object obj) {
        String str6;
        Category category2;
        UniqueStage uniqueStage2 = (i2 & 1) != 0 ? stage.uniqueStage : uniqueStage;
        String str7 = (i2 & 2) != 0 ? stage.description : str;
        String str8 = (i2 & 4) != 0 ? stage.slug : str2;
        ServerType serverType2 = (i2 & 8) != 0 ? stage.type : serverType;
        Status status2 = (i2 & 16) != 0 ? stage.status : status;
        Stage stage6 = (i2 & 32) != 0 ? stage.currentSubstage : stage2;
        Stage stage7 = (i2 & 64) != 0 ? stage.substage : stage3;
        List list5 = (i2 & 128) != 0 ? stage.substageStartDateTimestamps : list;
        String str9 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? stage.year : str3;
        int i3 = (i2 & 512) != 0 ? stage.id : i;
        Country country2 = (i2 & 1024) != 0 ? stage.country : country;
        StageInfo stageInfo2 = (i2 & a.o) != 0 ? stage.info : stageInfo;
        Long l4 = (i2 & 4096) != 0 ? stage.startTimestamp : l;
        Long l5 = (i2 & 8192) != 0 ? stage.startDateTimestamp : l2;
        UniqueStage uniqueStage3 = uniqueStage2;
        Long l6 = (i2 & 16384) != 0 ? stage.endDateTimestamp : l3;
        StageWinner stageWinner2 = (i2 & 32768) != 0 ? stage.winner : stageWinner;
        List list6 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? stage.partSubstages : list2;
        Integer num2 = (i2 & 131072) != 0 ? stage.sequence : num;
        String str10 = (i2 & 262144) != 0 ? stage.flag : str4;
        Stage stage8 = (i2 & 524288) != 0 ? stage.stageParent : stage4;
        Boolean bool2 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? stage.hasBet365LiveStream : bool;
        List list7 = (i2 & 2097152) != 0 ? stage.bet365ExcludedCountryCodes : list3;
        List list8 = (i2 & 4194304) != 0 ? stage.substages : list4;
        Stage stage9 = (i2 & 8388608) != 0 ? stage.raceStage : stage5;
        Category category3 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? stage.category : category;
        if ((i2 & 33554432) != 0) {
            category2 = category3;
            str6 = stage.shortName;
        } else {
            str6 = str5;
            category2 = category3;
        }
        return stage.copy(uniqueStage3, str7, str8, serverType2, status2, stage6, stage7, list5, str9, i3, country2, stageInfo2, l4, l5, l6, stageWinner2, list6, num2, str10, stage8, bool2, list7, list8, stage9, category2, str6);
    }

    public static final /* synthetic */ void write$Self$model_release(Stage self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, UniqueStage$$serializer.INSTANCE, self.uniqueStage);
        output.y(serialDesc, 1, self.description);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.slug);
        output.h(serialDesc, 3, ServerTypeSerializer.INSTANCE, self.type);
        output.h(serialDesc, 4, Status$$serializer.INSTANCE, self.status);
        Stage$$serializer stage$$serializer = Stage$$serializer.INSTANCE;
        output.h(serialDesc, 5, stage$$serializer, self.currentSubstage);
        output.h(serialDesc, 6, stage$$serializer, self.substage);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.substageStartDateTimestamps);
        output.h(serialDesc, 8, uhiVar, self.year);
        output.u(9, self.getId(), serialDesc);
        output.h(serialDesc, 10, Country$$serializer.INSTANCE, self.country);
        output.h(serialDesc, 11, StageInfo$$serializer.INSTANCE, self.info);
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 12, lkbVar, self.startTimestamp);
        output.h(serialDesc, 13, lkbVar, self.startDateTimestamp);
        output.h(serialDesc, 14, lkbVar, self.endDateTimestamp);
        output.h(serialDesc, 15, StageWinner$$serializer.INSTANCE, self.winner);
        output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.partSubstages);
        output.h(serialDesc, 17, a7a.a, self.sequence);
        output.h(serialDesc, 18, uhiVar, self.flag);
        if (output.o(serialDesc) || self.stageParent != null) {
            output.h(serialDesc, 19, stage$$serializer, self.stageParent);
        }
        output.h(serialDesc, 20, gz1.a, self.hasBet365LiveStream);
        output.h(serialDesc, 21, (KSerializer) joaVarArr[21].getValue(), self.bet365ExcludedCountryCodes);
        output.h(serialDesc, 22, (KSerializer) joaVarArr[22].getValue(), self.substages);
        output.h(serialDesc, 23, stage$$serializer, self.raceStage);
        output.h(serialDesc, 24, Category$$serializer.INSTANCE, self.category);
        output.h(serialDesc, 25, uhiVar, self.shortName);
        if (output.o(serialDesc) || self.typeList != null) {
            output.h(serialDesc, 26, (KSerializer) joaVarArr[26].getValue(), self.typeList);
        }
        if (output.o(serialDesc) || self.allSubStages != null) {
            output.h(serialDesc, 27, (KSerializer) joaVarArr[27].getValue(), self.allSubStages);
        }
        if (output.o(serialDesc) || self.getParentEvent() != null) {
            output.h(serialDesc, 28, StageEvent$$serializer.INSTANCE, self.getParentEvent());
        }
        if (output.o(serialDesc) || self.lastUpdate != 0) {
            output.E(serialDesc, 29, self.lastUpdate);
        }
        if (output.o(serialDesc) || self.stageEvent != null) {
            output.h(serialDesc, 30, stage$$serializer, self.stageEvent);
        }
        if (output.o(serialDesc) || self.stageDiscipline != null) {
            output.h(serialDesc, 31, StageDiscipline$$serializer.INSTANCE, self.stageDiscipline);
        }
        if (output.o(serialDesc) || self.getStageSeason() != null) {
            output.h(serialDesc, 32, StageSeason$$serializer.INSTANCE, self.getStageSeason());
        }
        if (output.o(serialDesc) || self.isMuted) {
            output.x(serialDesc, 33, self.isMuted);
        }
        if (output.o(serialDesc) || self.isHidden) {
            output.x(serialDesc, 34, self.isHidden);
        }
        if (output.o(serialDesc) || self.getIsRecent()) {
            output.x(serialDesc, 35, self.getIsRecent());
        }
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final UniqueStage getUniqueStage() {
        return this.uniqueStage;
    }

    /* renamed from: component10, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final StageInfo getInfo() {
        return this.info;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Long getEndDateTimestamp() {
        return this.endDateTimestamp;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final StageWinner getWinner() {
        return this.winner;
    }

    @Nullable
    public final List<Stage> component17() {
        return this.partSubstages;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getSequence() {
        return this.sequence;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Stage getStageParent() {
        return this.stageParent;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Boolean getHasBet365LiveStream() {
        return this.hasBet365LiveStream;
    }

    @Nullable
    public final List<String> component22() {
        return this.bet365ExcludedCountryCodes;
    }

    @Nullable
    public final List<Stage> component23() {
        return this.substages;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Stage getRaceStage() {
        return this.raceStage;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ServerType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Stage getCurrentSubstage() {
        return this.currentSubstage;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Stage getSubstage() {
        return this.substage;
    }

    @Nullable
    public final List<Integer> component8() {
        return this.substageStartDateTimestamps;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    @NotNull
    public final Stage copy(@Nullable UniqueStage uniqueStage, @NotNull String description, @Nullable String slug, @Nullable ServerType type, @Nullable Status status, @Nullable Stage currentSubstage, @Nullable Stage substage, @Nullable List<Integer> substageStartDateTimestamps, @Nullable String year, int id, @Nullable Country country, @Nullable StageInfo info, @Nullable Long startTimestamp, @Nullable Long startDateTimestamp, @Nullable Long endDateTimestamp, @Nullable StageWinner winner, @Nullable List<Stage> partSubstages, @Nullable Integer sequence, @Nullable String flag, @Nullable Stage stageParent, @Nullable Boolean hasBet365LiveStream, @Nullable List<String> bet365ExcludedCountryCodes, @Nullable List<Stage> substages, @Nullable Stage raceStage, @Nullable Category category, @Nullable String shortName) {
        description.getClass();
        return new Stage(uniqueStage, description, slug, type, status, currentSubstage, substage, substageStartDateTimestamps, year, id, country, info, startTimestamp, startDateTimestamp, endDateTimestamp, winner, partSubstages, sequence, flag, stageParent, hasBet365LiveStream, bet365ExcludedCountryCodes, substages, raceStage, category, shortName);
    }

    @Override // com.sofascore.model.util.EventInterface
    @Nullable
    public List<String> countriesWithBlockedBet365Stream() {
        return this.bet365ExcludedCountryCodes;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stage)) {
            return false;
        }
        Stage stage = (Stage) other;
        return Intrinsics.c(this.uniqueStage, stage.uniqueStage) && Intrinsics.c(this.description, stage.description) && Intrinsics.c(this.slug, stage.slug) && this.type == stage.type && Intrinsics.c(this.status, stage.status) && Intrinsics.c(this.currentSubstage, stage.currentSubstage) && Intrinsics.c(this.substage, stage.substage) && Intrinsics.c(this.substageStartDateTimestamps, stage.substageStartDateTimestamps) && Intrinsics.c(this.year, stage.year) && this.id == stage.id && Intrinsics.c(this.country, stage.country) && Intrinsics.c(this.info, stage.info) && Intrinsics.c(this.startTimestamp, stage.startTimestamp) && Intrinsics.c(this.startDateTimestamp, stage.startDateTimestamp) && Intrinsics.c(this.endDateTimestamp, stage.endDateTimestamp) && Intrinsics.c(this.winner, stage.winner) && Intrinsics.c(this.partSubstages, stage.partSubstages) && Intrinsics.c(this.sequence, stage.sequence) && Intrinsics.c(this.flag, stage.flag) && Intrinsics.c(this.stageParent, stage.stageParent) && Intrinsics.c(this.hasBet365LiveStream, stage.hasBet365LiveStream) && Intrinsics.c(this.bet365ExcludedCountryCodes, stage.bet365ExcludedCountryCodes) && Intrinsics.c(this.substages, stage.substages) && Intrinsics.c(this.raceStage, stage.raceStage) && Intrinsics.c(this.category, stage.category) && Intrinsics.c(this.shortName, stage.shortName);
    }

    @Nullable
    public final List<Stage> getAllSubStages() {
        return this.allSubStages;
    }

    @Nullable
    public final List<String> getBet365ExcludedCountryCodes() {
        return this.bet365ExcludedCountryCodes;
    }

    @Nullable
    public final Category getCategory() {
        Category category;
        UniqueStage uniqueStage = this.uniqueStage;
        return (uniqueStage == null || (category = uniqueStage.getCategory()) == null) ? this.category : category;
    }

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getChannelName() {
        return "stage";
    }

    @Override // com.sofascore.model.util.ChatInterface
    public int getChatId() {
        return getId();
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    public final Stage getCurrentSubstage() {
        return this.currentSubstage;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Long getEndDateTimestamp() {
        return this.endDateTimestamp;
    }

    @Nullable
    public final String getFlag() {
        String str = this.flag;
        if (str != null) {
            return str;
        }
        Stage stage = this.stageEvent;
        if (stage != null) {
            return stage.getFlag();
        }
        return null;
    }

    @Nullable
    public final Boolean getHasBet365LiveStream() {
        return this.hasBet365LiveStream;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public int getId() {
        return this.id;
    }

    @Nullable
    public final StageInfo getInfo() {
        return this.info;
    }

    public final long getLastUpdate() {
        return this.lastUpdate;
    }

    @Nullable
    public final StageEvent getParentEvent() {
        Stage stage = this.stageEvent;
        return stage != null ? new StageEvent(stage.getId(), stage.description, stage.startDateTimestamp, stage.flag) : this.parentEvent;
    }

    @Nullable
    public final List<Stage> getPartSubstages() {
        return this.partSubstages;
    }

    @Nullable
    public final Stage getRaceStage() {
        return this.raceStage;
    }

    @Nullable
    public final Integer getSequence() {
        return this.sequence;
    }

    @Nullable
    public final String getShortName() {
        return this.shortName;
    }

    @Nullable
    public final String getSlug() {
        return this.slug;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    @Nullable
    public String getSportSlug() {
        Sport sport;
        Category category;
        Sport sport2;
        String slug;
        UniqueStage uniqueStage = this.uniqueStage;
        if (uniqueStage != null && (category = uniqueStage.getCategory()) != null && (sport2 = category.getSport()) != null && (slug = sport2.getSlug()) != null) {
            return slug;
        }
        Category category2 = this.category;
        if (category2 == null || (sport = category2.getSport()) == null) {
            return null;
        }
        return sport.getSlug();
    }

    @Nullable
    public final Stage getStageEvent() {
        Stage stage;
        StageEvent parentEvent = getParentEvent();
        return (parentEvent == null || (stage = StageKt.toStage(parentEvent)) == null) ? this.stageEvent : stage;
    }

    @Nullable
    public final Stage getStageParent() {
        return this.stageParent;
    }

    @Nullable
    public final StageSeason getStageSeason() {
        Stage stage = this.stageEvent;
        if (stage != null) {
            if (stage != null) {
                return stage.getStageSeason();
            }
            return null;
        }
        StageDiscipline stageDiscipline = this.stageDiscipline;
        if (stageDiscipline == null) {
            return this.stageSeason;
        }
        if (stageDiscipline != null) {
            return stageDiscipline.getStageSeason();
        }
        return null;
    }

    public final long getStartDateTimestamp() {
        Long l = this.startDateTimestamp;
        if (l != null) {
            return l.longValue();
        }
        Long l2 = this.startTimestamp;
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    @Nullable
    public final Status getStatus() {
        return this.status;
    }

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getStatusType() {
        String type;
        Status status = this.status;
        return (status == null || (type = status.getType()) == null) ? "" : type;
    }

    @Nullable
    public final Stage getSubstage() {
        return this.substage;
    }

    @Nullable
    public final List<Integer> getSubstageStartDateTimestamps() {
        return this.substageStartDateTimestamps;
    }

    @Nullable
    public final List<Stage> getSubstages() {
        return this.substages;
    }

    @Override // com.sofascore.model.util.ChatInterface
    public long getTimestamp() {
        return getStartDateTimestamp();
    }

    @Nullable
    public final ServerType getType() {
        return this.type;
    }

    @NotNull
    public final HashSet<StageType> getTypeList() {
        HashSet<StageType> hashSet = this.typeList;
        if (hashSet != null) {
            return hashSet;
        }
        HashSet<StageType> hashSet2 = new HashSet<>();
        this.typeList = hashSet2;
        return hashSet2;
    }

    @Nullable
    public final UniqueStage getUniqueStage() {
        return this.uniqueStage;
    }

    @Nullable
    public final Integer getUniqueStageId() {
        UniqueStage uniqueStage;
        int id;
        UniqueStage uniqueStage2 = this.uniqueStage;
        if (uniqueStage2 != null) {
            id = uniqueStage2.getId();
        } else {
            StageSeason stageSeason = getStageSeason();
            if (stageSeason == null || (uniqueStage = stageSeason.getUniqueStage()) == null) {
                return null;
            }
            id = uniqueStage.getId();
        }
        return Integer.valueOf(id);
    }

    @Nullable
    public final StageWinner getWinner() {
        return this.winner;
    }

    @Nullable
    public final String getYear() {
        return this.year;
    }

    @Override // com.sofascore.model.util.EventInterface
    public boolean hasBet365LiveStream() {
        Boolean bool = this.hasBet365LiveStream;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.sofascore.model.util.EventInterface
    public boolean hasExtraInfo() {
        return false;
    }

    public int hashCode() {
        UniqueStage uniqueStage = this.uniqueStage;
        int c = dmi.c((uniqueStage == null ? 0 : uniqueStage.hashCode()) * 31, 31, this.description);
        String str = this.slug;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        ServerType serverType = this.type;
        int hashCode2 = (hashCode + (serverType == null ? 0 : serverType.hashCode())) * 31;
        Status status = this.status;
        int hashCode3 = (hashCode2 + (status == null ? 0 : status.hashCode())) * 31;
        Stage stage = this.currentSubstage;
        int hashCode4 = (hashCode3 + (stage == null ? 0 : stage.hashCode())) * 31;
        Stage stage2 = this.substage;
        int hashCode5 = (hashCode4 + (stage2 == null ? 0 : stage2.hashCode())) * 31;
        List<Integer> list = this.substageStartDateTimestamps;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.year;
        int a = wv8.a(this.id, (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Country country = this.country;
        int hashCode7 = (a + (country == null ? 0 : country.hashCode())) * 31;
        StageInfo stageInfo = this.info;
        int hashCode8 = (hashCode7 + (stageInfo == null ? 0 : stageInfo.hashCode())) * 31;
        Long l = this.startTimestamp;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.startDateTimestamp;
        int hashCode10 = (hashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.endDateTimestamp;
        int hashCode11 = (hashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        StageWinner stageWinner = this.winner;
        int hashCode12 = (hashCode11 + (stageWinner == null ? 0 : stageWinner.hashCode())) * 31;
        List<Stage> list2 = this.partSubstages;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.sequence;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.flag;
        int hashCode15 = (hashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Stage stage3 = this.stageParent;
        int hashCode16 = (hashCode15 + (stage3 == null ? 0 : stage3.hashCode())) * 31;
        Boolean bool = this.hasBet365LiveStream;
        int hashCode17 = (hashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list3 = this.bet365ExcludedCountryCodes;
        int hashCode18 = (hashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Stage> list4 = this.substages;
        int hashCode19 = (hashCode18 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Stage stage4 = this.raceStage;
        int hashCode20 = (hashCode19 + (stage4 == null ? 0 : stage4.hashCode())) * 31;
        Category category = this.category;
        int hashCode21 = (hashCode20 + (category == null ? 0 : category.hashCode())) * 31;
        String str4 = this.shortName;
        return hashCode21 + (str4 != null ? str4.hashCode() : 0);
    }

    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    /* renamed from: isMuted, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    /* renamed from: isRecent, reason: from getter */
    public boolean getIsRecent() {
        return this.isRecent;
    }

    public final void setAllSubStages(@Nullable List<Stage> list) {
        this.allSubStages = list;
    }

    public final void setBet365ExcludedCountryCodes(@Nullable List<String> list) {
        this.bet365ExcludedCountryCodes = list;
    }

    public final void setCurrentSubstage(@Nullable Stage stage) {
        this.currentSubstage = stage;
    }

    public final void setFlag(@Nullable String flag) {
        this.flag = flag;
    }

    public final void setHasBet365LiveStream(@Nullable Boolean bool) {
        this.hasBet365LiveStream = bool;
    }

    public final void setHidden(boolean z) {
        this.isHidden = z;
    }

    public final void setLastUpdate(long j) {
        this.lastUpdate = j;
    }

    public final void setMuted(boolean z) {
        this.isMuted = z;
    }

    public final void setParentEvent(@Nullable StageEvent stageEvent) {
        this.parentEvent = stageEvent;
        this.stageEvent = stageEvent != null ? StageKt.toStage(stageEvent) : null;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public void setRecent(boolean z) {
        this.isRecent = z;
    }

    public final void setStageDiscipline(@Nullable StageDiscipline stage) {
        this.stageEvent = null;
        this.stageDiscipline = stage;
    }

    public final void setStageEvent(@Nullable Stage event) {
        this.stageEvent = event;
        setStageSeason(null);
        this.stageDiscipline = null;
    }

    public final void setStageParent(@Nullable Stage stage) {
        this.stageParent = stage;
    }

    public final void setStageSeason(@Nullable StageSeason stageSeason) {
        if (stageSeason == null) {
            return;
        }
        this.stageEvent = null;
        StageDiscipline stageDiscipline = this.stageDiscipline;
        if (stageDiscipline != null) {
            stageDiscipline.setStageSeason(stageSeason);
        }
        this.stageSeason = stageSeason;
    }

    public final void setStartDateTimestamp(long timestamp) {
        this.startDateTimestamp = Long.valueOf(timestamp);
    }

    public final void setSubstage(@Nullable Stage stage) {
        this.substage = stage;
    }

    public final void setSubstages(@Nullable List<Stage> list) {
        this.substages = list;
    }

    public final void setTypeList(@NotNull HashSet<StageType> list) {
        list.getClass();
        this.typeList = list;
    }

    public final void setUniqueStage(@Nullable UniqueStage uniqueStage) {
        this.uniqueStage = uniqueStage;
    }

    @NotNull
    public String toString() {
        UniqueStage uniqueStage = this.uniqueStage;
        String str = this.description;
        String str2 = this.slug;
        ServerType serverType = this.type;
        Status status = this.status;
        Stage stage = this.currentSubstage;
        Stage stage2 = this.substage;
        List<Integer> list = this.substageStartDateTimestamps;
        String str3 = this.year;
        int i = this.id;
        Country country = this.country;
        StageInfo stageInfo = this.info;
        Long l = this.startTimestamp;
        Long l2 = this.startDateTimestamp;
        Long l3 = this.endDateTimestamp;
        StageWinner stageWinner = this.winner;
        List<Stage> list2 = this.partSubstages;
        Integer num = this.sequence;
        String str4 = this.flag;
        Stage stage3 = this.stageParent;
        Boolean bool = this.hasBet365LiveStream;
        List<String> list3 = this.bet365ExcludedCountryCodes;
        List<Stage> list4 = this.substages;
        Stage stage4 = this.raceStage;
        Category category = this.category;
        String str5 = this.shortName;
        StringBuilder sb = new StringBuilder("Stage(uniqueStage=");
        sb.append(uniqueStage);
        sb.append(", description=");
        sb.append(str);
        sb.append(", slug=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(serverType);
        sb.append(", status=");
        sb.append(status);
        sb.append(", currentSubstage=");
        sb.append(stage);
        sb.append(", substage=");
        sb.append(stage2);
        sb.append(", substageStartDateTimestamps=");
        sb.append(list);
        sb.append(", year=");
        w1l.q(i, str3, ", id=", ", country=", sb);
        sb.append(country);
        sb.append(", info=");
        sb.append(stageInfo);
        sb.append(", startTimestamp=");
        sb.append(l);
        sb.append(", startDateTimestamp=");
        sb.append(l2);
        sb.append(", endDateTimestamp=");
        sb.append(l3);
        sb.append(", winner=");
        sb.append(stageWinner);
        sb.append(", partSubstages=");
        sb.append(list2);
        sb.append(", sequence=");
        sb.append(num);
        sb.append(", flag=");
        sb.append(str4);
        sb.append(", stageParent=");
        sb.append(stage3);
        sb.append(", hasBet365LiveStream=");
        sb.append(bool);
        sb.append(", bet365ExcludedCountryCodes=");
        sb.append(list3);
        sb.append(", substages=");
        sb.append(list4);
        sb.append(", raceStage=");
        sb.append(stage4);
        sb.append(", category=");
        sb.append(category);
        sb.append(", shortName=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.sofascore.model.util.EventInterface
    @NotNull
    public String tvChannelString() {
        return this.description;
    }

    public Stage(@Nullable UniqueStage uniqueStage, @NotNull String str, @Nullable String str2, @Nullable ServerType serverType, @Nullable Status status, @Nullable Stage stage, @Nullable Stage stage2, @Nullable List<Integer> list, @Nullable String str3, int i, @Nullable Country country, @Nullable StageInfo stageInfo, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable StageWinner stageWinner, @Nullable List<Stage> list2, @Nullable Integer num, @Nullable String str4, @Nullable Stage stage3, @Nullable Boolean bool, @Nullable List<String> list3, @Nullable List<Stage> list4, @Nullable Stage stage4, @Nullable Category category, @Nullable String str5) {
        str.getClass();
        this.uniqueStage = uniqueStage;
        this.description = str;
        this.slug = str2;
        this.type = serverType;
        this.status = status;
        this.currentSubstage = stage;
        this.substage = stage2;
        this.substageStartDateTimestamps = list;
        this.year = str3;
        this.id = i;
        this.country = country;
        this.info = stageInfo;
        this.startTimestamp = l;
        this.startDateTimestamp = l2;
        this.endDateTimestamp = l3;
        this.winner = stageWinner;
        this.partSubstages = list2;
        this.sequence = num;
        this.flag = str4;
        this.stageParent = stage3;
        this.hasBet365LiveStream = bool;
        this.bet365ExcludedCountryCodes = list3;
        this.substages = list4;
        this.raceStage = stage4;
        this.category = category;
        this.shortName = str5;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Stage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Stage;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Stage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @r5h(with = ServerTypeSerializer.class)
    public static /* synthetic */ void getType$annotations() {
    }

    public /* synthetic */ Stage(UniqueStage uniqueStage, String str, String str2, ServerType serverType, Status status, Stage stage, Stage stage2, List list, String str3, int i, Country country, StageInfo stageInfo, Long l, Long l2, Long l3, StageWinner stageWinner, List list2, Integer num, String str4, Stage stage3, Boolean bool, List list3, List list4, Stage stage4, Category category, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uniqueStage, str, str2, serverType, status, stage, stage2, list, str3, i, country, stageInfo, l, l2, l3, stageWinner, list2, num, str4, (i2 & 524288) != 0 ? null : stage3, bool, list3, list4, stage4, category, str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stage(@NotNull String str, @Nullable ServerType serverType, @Nullable Status status, int i, @Nullable StageWinner stageWinner, @Nullable String str2) {
        this(null, str, "", serverType, status, null, null, null, null, i, null, null, null, null, null, stageWinner, null, null, str2, null, null, null, null, null, null, null);
        str.getClass();
    }
}
