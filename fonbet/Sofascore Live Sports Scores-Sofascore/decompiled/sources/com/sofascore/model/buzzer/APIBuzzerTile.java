package com.sofascore.model.buzzer;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.model.cuptree.CupTreeRound$$serializer;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.mvvm.model.Transfer$$serializer;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.EventSerializer;
import com.sofascore.model.newNetwork.RankingItem;
import com.sofascore.model.newNetwork.RankingItem$$serializer;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.c0;
import defpackage.gz1;
import defpackage.h75;
import defpackage.joa;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
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
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b7\b\u0087\b\u0018\u0000 ®\u00012\u00020\u0001:\u0004¯\u0001®\u0001BÑ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010\t\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\t\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104Bí\u0002\b\u0010\u0012\u0006\u00105\u001a\u00020\u0002\u0012\u0006\u00106\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010\t\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\t\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b3\u00109J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010;J\u0012\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bK\u0010HJ\u0012\u0010L\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bL\u0010HJ\u0012\u0010M\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bM\u0010HJ\u0012\u0010N\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bN\u0010HJ\u0012\u0010O\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bO\u0010HJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u0010JJ\u0010\u0010Q\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bQ\u0010;J\u0012\u0010R\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bR\u0010HJ\u0012\u0010S\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u0010JJ\u0012\u0010X\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bZ\u0010HJ\u0012\u0010[\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b[\u0010HJ\u0018\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#HÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0012\u0010^\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b`\u0010BJ\u0012\u0010a\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0012\u0010c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bc\u0010BJ\u0012\u0010d\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0012\u0010f\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0012\u0010h\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bh\u0010JJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bi\u0010JJ\u0012\u0010j\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0004\bj\u0010kJ\u009c\u0003\u0010l\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00102\u001a\u0004\u0018\u000101HÆ\u0001¢\u0006\u0004\bl\u0010mJ\u0010\u0010n\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bn\u0010HJ\u0010\u0010o\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bo\u0010;J\u001a\u0010r\u001a\u00020\r2\b\u0010q\u001a\u0004\u0018\u00010pHÖ\u0003¢\u0006\u0004\br\u0010sJ'\u0010|\u001a\u00020y2\u0006\u0010t\u001a\u00020\u00002\u0006\u0010v\u001a\u00020u2\u0006\u0010x\u001a\u00020wH\u0001¢\u0006\u0004\bz\u0010{R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010}\u001a\u0004\b~\u0010;R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010}\u001a\u0004\b\u007f\u0010;R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0006\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010>R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\b\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010@R\u001b\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b\n\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010BR\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b\f\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010DR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\r\n\u0005\b\u000e\u0010\u0088\u0001\u001a\u0004\b\u000e\u0010FR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010HR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010JR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010\u0089\u0001\u001a\u0005\b\u008d\u0001\u0010HR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u0089\u0001\u001a\u0005\b\u008e\u0001\u0010HR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010\u0089\u0001\u001a\u0005\b\u008f\u0001\u0010HR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u0089\u0001\u001a\u0005\b\u0090\u0001\u0010HR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u0089\u0001\u001a\u0005\b\u0091\u0001\u0010HR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u008b\u0001\u001a\u0005\b\u0092\u0001\u0010JR\u0018\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u0018\u0010}\u001a\u0005\b\u0093\u0001\u0010;R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010\u0089\u0001\u001a\u0005\b\u0094\u0001\u0010HR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u0010TR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010VR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u008b\u0001\u001a\u0005\b\u0099\u0001\u0010JR\u001b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b \u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010YR\u001b\u0010!\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b!\u0010\u0089\u0001\u001a\u0005\b\u009c\u0001\u0010HR\u001b\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0089\u0001\u001a\u0005\b\u009d\u0001\u0010HR!\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0006¢\u0006\u000e\n\u0005\b$\u0010\u009e\u0001\u001a\u0005\b\u009f\u0001\u0010]R\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010 \u0001\u001a\u0005\b¡\u0001\u0010_R\u001b\u0010'\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b'\u0010\u0084\u0001\u001a\u0005\b¢\u0001\u0010BR\u001b\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000e\n\u0005\b)\u0010£\u0001\u001a\u0005\b¤\u0001\u0010bR\u001b\u0010*\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u0084\u0001\u001a\u0005\b¥\u0001\u0010BR\u001b\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b,\u0010¦\u0001\u001a\u0005\b§\u0001\u0010eR\u001b\u0010.\u001a\u0004\u0018\u00010-8\u0006¢\u0006\u000e\n\u0005\b.\u0010¨\u0001\u001a\u0005\b©\u0001\u0010gR\u001b\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b/\u0010\u008b\u0001\u001a\u0005\bª\u0001\u0010JR\u001b\u00100\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b0\u0010\u008b\u0001\u001a\u0005\b«\u0001\u0010JR\u001b\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\u000e\n\u0005\b2\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010k¨\u0006°\u0001"}, d2 = {"Lcom/sofascore/model/buzzer/APIBuzzerTile;", "Ljava/io/Serializable;", "", "id", "type", "Lcom/sofascore/model/mvvm/model/Event;", "event", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "", CampaignEx.JSON_KEY_STAR, "", "isHome", "", "reason", "reasonSuborder", "text", "label", "labelBackground", "imageUrl", "imageBackground", "overlay", "action", "actionValue", "Lcom/sofascore/model/buzzer/BasketballTopStatistics;", "topStatistics", "Lcom/sofascore/model/newNetwork/RankingItem;", "ranking", "position", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "introText", "introImageUrl", "", "invisibleOn", "Lcom/sofascore/model/cuptree/CupTreeRound;", "nextCupRound", "winningTeam", "Lcom/sofascore/model/buzzer/Race;", "race", "polePositionWinner", "Lcom/sofascore/model/buzzer/InterestingStatisticsItem;", BuzzerConfigResponseKt.INTERESTING_STATISTIC, "Lcom/sofascore/model/mvvm/model/Transfer;", BuzzerConfigResponseKt.TRANSFER, "androidMinVersion", "androidMaxVersion", "Lcom/sofascore/model/buzzer/TeamOfTheWeekRoundBuzzer;", "teamOfTheWeekRound", "<init>", "(IILcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Lcom/sofascore/model/buzzer/BasketballTopStatistics;Lcom/sofascore/model/newNetwork/RankingItem;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/sofascore/model/cuptree/CupTreeRound;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/buzzer/Race;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/buzzer/InterestingStatisticsItem;Lcom/sofascore/model/mvvm/model/Transfer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/buzzer/TeamOfTheWeekRoundBuzzer;)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IIIILcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Lcom/sofascore/model/buzzer/BasketballTopStatistics;Lcom/sofascore/model/newNetwork/RankingItem;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/sofascore/model/cuptree/CupTreeRound;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/buzzer/Race;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/buzzer/InterestingStatisticsItem;Lcom/sofascore/model/mvvm/model/Transfer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/buzzer/TeamOfTheWeekRoundBuzzer;Lt5h;)V", "component1", "()I", "component2", "component3", "()Lcom/sofascore/model/mvvm/model/Event;", "component4", "()Lcom/sofascore/model/mvvm/model/Player;", "component5", "()Lcom/sofascore/model/mvvm/model/Team;", "component6", "()Ljava/lang/Double;", "component7", "()Ljava/lang/Boolean;", "component8", "()Ljava/lang/String;", "component9", "()Ljava/lang/Integer;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "()Lcom/sofascore/model/buzzer/BasketballTopStatistics;", "component19", "()Lcom/sofascore/model/newNetwork/RankingItem;", "component20", "component21", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "component22", "component23", "component24", "()Ljava/util/List;", "component25", "()Lcom/sofascore/model/cuptree/CupTreeRound;", "component26", "component27", "()Lcom/sofascore/model/buzzer/Race;", "component28", "component29", "()Lcom/sofascore/model/buzzer/InterestingStatisticsItem;", "component30", "()Lcom/sofascore/model/mvvm/model/Transfer;", "component31", "component32", "component33", "()Lcom/sofascore/model/buzzer/TeamOfTheWeekRoundBuzzer;", "copy", "(IILcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Lcom/sofascore/model/buzzer/BasketballTopStatistics;Lcom/sofascore/model/newNetwork/RankingItem;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/sofascore/model/cuptree/CupTreeRound;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/buzzer/Race;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/buzzer/InterestingStatisticsItem;Lcom/sofascore/model/mvvm/model/Transfer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/buzzer/TeamOfTheWeekRoundBuzzer;)Lcom/sofascore/model/buzzer/APIBuzzerTile;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/buzzer/APIBuzzerTile;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "getType", "Lcom/sofascore/model/mvvm/model/Event;", "getEvent", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Ljava/lang/Double;", "getRating", "Ljava/lang/Boolean;", "Ljava/lang/String;", "getReason", "Ljava/lang/Integer;", "getReasonSuborder", "getText", "getLabel", "getLabelBackground", "getImageUrl", "getImageBackground", "getOverlay", "getAction", "getActionValue", "Lcom/sofascore/model/buzzer/BasketballTopStatistics;", "getTopStatistics", "Lcom/sofascore/model/newNetwork/RankingItem;", "getRanking", "getPosition", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "getIntroText", "getIntroImageUrl", "Ljava/util/List;", "getInvisibleOn", "Lcom/sofascore/model/cuptree/CupTreeRound;", "getNextCupRound", "getWinningTeam", "Lcom/sofascore/model/buzzer/Race;", "getRace", "getPolePositionWinner", "Lcom/sofascore/model/buzzer/InterestingStatisticsItem;", "getInterestingStatistic", "Lcom/sofascore/model/mvvm/model/Transfer;", "getTransfer", "getAndroidMinVersion", "getAndroidMaxVersion", "Lcom/sofascore/model/buzzer/TeamOfTheWeekRoundBuzzer;", "getTeamOfTheWeekRound", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class APIBuzzerTile implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int action;

    @Nullable
    private final String actionValue;

    @Nullable
    private final Integer androidMaxVersion;

    @Nullable
    private final Integer androidMinVersion;

    @Nullable
    private final Event event;
    private final int id;

    @Nullable
    private final String imageBackground;

    @Nullable
    private final String imageUrl;

    @Nullable
    private final InterestingStatisticsItem interestingStatistic;

    @Nullable
    private final String introImageUrl;

    @Nullable
    private final String introText;

    @Nullable
    private final List<Integer> invisibleOn;

    @Nullable
    private final Boolean isHome;

    @Nullable
    private final String label;

    @Nullable
    private final String labelBackground;

    @Nullable
    private final CupTreeRound nextCupRound;

    @Nullable
    private final Integer overlay;

    @Nullable
    private final Player player;

    @Nullable
    private final Team polePositionWinner;

    @Nullable
    private final Integer position;

    @Nullable
    private final Race race;

    @Nullable
    private final RankingItem ranking;

    @Nullable
    private final Double rating;

    @Nullable
    private final String reason;

    @Nullable
    private final Integer reasonSuborder;

    @Nullable
    private final Team team;

    @Nullable
    private final TeamOfTheWeekRoundBuzzer teamOfTheWeekRound;

    @Nullable
    private final String text;

    @Nullable
    private final BasketballTopStatistics topStatistics;

    @Nullable
    private final Transfer transfer;
    private final int type;

    @Nullable
    private final UniqueTournament uniqueTournament;

    @Nullable
    private final Team winningTeam;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, ypa.a(ysaVar, new c0(0)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new c0(1)), null, ypa.a(ysaVar, new c0(2)), null, ypa.a(ysaVar, new c0(3)), null, null, null, null, null};
    }

    public /* synthetic */ APIBuzzerTile(int i, int i2, int i3, int i4, Event event, Player player, Team team, Double d, Boolean bool, String str, Integer num, String str2, String str3, String str4, String str5, String str6, Integer num2, int i5, String str7, BasketballTopStatistics basketballTopStatistics, RankingItem rankingItem, Integer num3, UniqueTournament uniqueTournament, String str8, String str9, List list, CupTreeRound cupTreeRound, Team team2, Race race, Team team3, InterestingStatisticsItem interestingStatisticsItem, Transfer transfer, Integer num4, Integer num5, TeamOfTheWeekRoundBuzzer teamOfTheWeekRoundBuzzer, t5h t5hVar) {
        if ((1 != (i2 & 1)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, 1}, APIBuzzerTile$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.type = i4;
        this.event = event;
        this.player = player;
        this.team = team;
        this.rating = d;
        this.isHome = bool;
        this.reason = str;
        this.reasonSuborder = num;
        this.text = str2;
        this.label = str3;
        this.labelBackground = str4;
        this.imageUrl = str5;
        this.imageBackground = str6;
        this.overlay = num2;
        this.action = i5;
        this.actionValue = str7;
        this.topStatistics = basketballTopStatistics;
        this.ranking = rankingItem;
        this.position = num3;
        this.uniqueTournament = uniqueTournament;
        this.introText = str8;
        this.introImageUrl = str9;
        this.invisibleOn = list;
        this.nextCupRound = cupTreeRound;
        this.winningTeam = team2;
        this.race = race;
        this.polePositionWinner = team3;
        this.interestingStatistic = interestingStatisticsItem;
        this.transfer = transfer;
        this.androidMinVersion = num4;
        this.androidMaxVersion = num5;
        this.teamOfTheWeekRound = teamOfTheWeekRoundBuzzer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ APIBuzzerTile copy$default(APIBuzzerTile aPIBuzzerTile, int i, int i2, Event event, Player player, Team team, Double d, Boolean bool, String str, Integer num, String str2, String str3, String str4, String str5, String str6, Integer num2, int i3, String str7, BasketballTopStatistics basketballTopStatistics, RankingItem rankingItem, Integer num3, UniqueTournament uniqueTournament, String str8, String str9, List list, CupTreeRound cupTreeRound, Team team2, Race race, Team team3, InterestingStatisticsItem interestingStatisticsItem, Transfer transfer, Integer num4, Integer num5, TeamOfTheWeekRoundBuzzer teamOfTheWeekRoundBuzzer, int i4, int i5, Object obj) {
        TeamOfTheWeekRoundBuzzer teamOfTheWeekRoundBuzzer2;
        Integer num6;
        String str10;
        BasketballTopStatistics basketballTopStatistics2;
        RankingItem rankingItem2;
        Integer num7;
        UniqueTournament uniqueTournament2;
        String str11;
        String str12;
        List list2;
        CupTreeRound cupTreeRound2;
        Team team4;
        Race race2;
        Team team5;
        InterestingStatisticsItem interestingStatisticsItem2;
        Transfer transfer2;
        Integer num8;
        Integer num9;
        int i6;
        Event event2;
        Player player2;
        Team team6;
        Double d2;
        Boolean bool2;
        String str13;
        Integer num10;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        int i7;
        int i8 = (i4 & 1) != 0 ? aPIBuzzerTile.id : i;
        int i9 = (i4 & 2) != 0 ? aPIBuzzerTile.type : i2;
        Event event3 = (i4 & 4) != 0 ? aPIBuzzerTile.event : event;
        Player player3 = (i4 & 8) != 0 ? aPIBuzzerTile.player : player;
        Team team7 = (i4 & 16) != 0 ? aPIBuzzerTile.team : team;
        Double d3 = (i4 & 32) != 0 ? aPIBuzzerTile.rating : d;
        Boolean bool3 = (i4 & 64) != 0 ? aPIBuzzerTile.isHome : bool;
        String str19 = (i4 & 128) != 0 ? aPIBuzzerTile.reason : str;
        Integer num11 = (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? aPIBuzzerTile.reasonSuborder : num;
        String str20 = (i4 & 512) != 0 ? aPIBuzzerTile.text : str2;
        String str21 = (i4 & 1024) != 0 ? aPIBuzzerTile.label : str3;
        String str22 = (i4 & a.o) != 0 ? aPIBuzzerTile.labelBackground : str4;
        String str23 = (i4 & 4096) != 0 ? aPIBuzzerTile.imageUrl : str5;
        String str24 = (i4 & 8192) != 0 ? aPIBuzzerTile.imageBackground : str6;
        int i10 = i8;
        Integer num12 = (i4 & 16384) != 0 ? aPIBuzzerTile.overlay : num2;
        int i11 = (i4 & 32768) != 0 ? aPIBuzzerTile.action : i3;
        String str25 = (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? aPIBuzzerTile.actionValue : str7;
        BasketballTopStatistics basketballTopStatistics3 = (i4 & 131072) != 0 ? aPIBuzzerTile.topStatistics : basketballTopStatistics;
        RankingItem rankingItem3 = (i4 & 262144) != 0 ? aPIBuzzerTile.ranking : rankingItem;
        Integer num13 = (i4 & 524288) != 0 ? aPIBuzzerTile.position : num3;
        UniqueTournament uniqueTournament3 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? aPIBuzzerTile.uniqueTournament : uniqueTournament;
        String str26 = (i4 & 2097152) != 0 ? aPIBuzzerTile.introText : str8;
        String str27 = (i4 & 4194304) != 0 ? aPIBuzzerTile.introImageUrl : str9;
        List list3 = (i4 & 8388608) != 0 ? aPIBuzzerTile.invisibleOn : list;
        CupTreeRound cupTreeRound3 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? aPIBuzzerTile.nextCupRound : cupTreeRound;
        Team team8 = (i4 & 33554432) != 0 ? aPIBuzzerTile.winningTeam : team2;
        Race race3 = (i4 & 67108864) != 0 ? aPIBuzzerTile.race : race;
        Team team9 = (i4 & 134217728) != 0 ? aPIBuzzerTile.polePositionWinner : team3;
        InterestingStatisticsItem interestingStatisticsItem3 = (i4 & 268435456) != 0 ? aPIBuzzerTile.interestingStatistic : interestingStatisticsItem;
        Transfer transfer3 = (i4 & 536870912) != 0 ? aPIBuzzerTile.transfer : transfer;
        Integer num14 = (i4 & 1073741824) != 0 ? aPIBuzzerTile.androidMinVersion : num4;
        Integer num15 = (i4 & Integer.MIN_VALUE) != 0 ? aPIBuzzerTile.androidMaxVersion : num5;
        if ((i5 & 1) != 0) {
            num6 = num15;
            teamOfTheWeekRoundBuzzer2 = aPIBuzzerTile.teamOfTheWeekRound;
            basketballTopStatistics2 = basketballTopStatistics3;
            rankingItem2 = rankingItem3;
            num7 = num13;
            uniqueTournament2 = uniqueTournament3;
            str11 = str26;
            str12 = str27;
            list2 = list3;
            cupTreeRound2 = cupTreeRound3;
            team4 = team8;
            race2 = race3;
            team5 = team9;
            interestingStatisticsItem2 = interestingStatisticsItem3;
            transfer2 = transfer3;
            num8 = num14;
            num9 = num12;
            event2 = event3;
            player2 = player3;
            team6 = team7;
            d2 = d3;
            bool2 = bool3;
            str13 = str19;
            num10 = num11;
            str14 = str20;
            str15 = str21;
            str16 = str22;
            str17 = str23;
            str18 = str24;
            i7 = i11;
            str10 = str25;
            i6 = i9;
        } else {
            teamOfTheWeekRoundBuzzer2 = teamOfTheWeekRoundBuzzer;
            num6 = num15;
            str10 = str25;
            basketballTopStatistics2 = basketballTopStatistics3;
            rankingItem2 = rankingItem3;
            num7 = num13;
            uniqueTournament2 = uniqueTournament3;
            str11 = str26;
            str12 = str27;
            list2 = list3;
            cupTreeRound2 = cupTreeRound3;
            team4 = team8;
            race2 = race3;
            team5 = team9;
            interestingStatisticsItem2 = interestingStatisticsItem3;
            transfer2 = transfer3;
            num8 = num14;
            num9 = num12;
            i6 = i9;
            event2 = event3;
            player2 = player3;
            team6 = team7;
            d2 = d3;
            bool2 = bool3;
            str13 = str19;
            num10 = num11;
            str14 = str20;
            str15 = str21;
            str16 = str22;
            str17 = str23;
            str18 = str24;
            i7 = i11;
        }
        return aPIBuzzerTile.copy(i10, i6, event2, player2, team6, d2, bool2, str13, num10, str14, str15, str16, str17, str18, num9, i7, str10, basketballTopStatistics2, rankingItem2, num7, uniqueTournament2, str11, str12, list2, cupTreeRound2, team4, race2, team5, interestingStatisticsItem2, transfer2, num8, num6, teamOfTheWeekRoundBuzzer2);
    }

    public static final /* synthetic */ void write$Self$model_release(APIBuzzerTile self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.u(1, self.type, serialDesc);
        output.h(serialDesc, 2, EventSerializer.INSTANCE, self.event);
        output.h(serialDesc, 3, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.team);
        output.h(serialDesc, 5, h75.a, self.rating);
        output.h(serialDesc, 6, gz1.a, self.isHome);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 7, uhiVar, self.reason);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 8, a7aVar, self.reasonSuborder);
        output.h(serialDesc, 9, uhiVar, self.text);
        output.h(serialDesc, 10, uhiVar, self.label);
        output.h(serialDesc, 11, uhiVar, self.labelBackground);
        output.h(serialDesc, 12, uhiVar, self.imageUrl);
        output.h(serialDesc, 13, uhiVar, self.imageBackground);
        output.h(serialDesc, 14, a7aVar, self.overlay);
        output.u(15, self.action, serialDesc);
        output.h(serialDesc, 16, uhiVar, self.actionValue);
        output.h(serialDesc, 17, BasketballTopStatistics$$serializer.INSTANCE, self.topStatistics);
        output.h(serialDesc, 18, RankingItem$$serializer.INSTANCE, self.ranking);
        output.h(serialDesc, 19, a7aVar, self.position);
        output.h(serialDesc, 20, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        output.h(serialDesc, 21, uhiVar, self.introText);
        output.h(serialDesc, 22, uhiVar, self.introImageUrl);
        output.h(serialDesc, 23, (KSerializer) joaVarArr[23].getValue(), self.invisibleOn);
        output.h(serialDesc, 24, CupTreeRound$$serializer.INSTANCE, self.nextCupRound);
        output.h(serialDesc, 25, (KSerializer) joaVarArr[25].getValue(), self.winningTeam);
        output.h(serialDesc, 26, Race$$serializer.INSTANCE, self.race);
        output.h(serialDesc, 27, (KSerializer) joaVarArr[27].getValue(), self.polePositionWinner);
        output.h(serialDesc, 28, InterestingStatisticsItem$$serializer.INSTANCE, self.interestingStatistic);
        output.h(serialDesc, 29, Transfer$$serializer.INSTANCE, self.transfer);
        output.h(serialDesc, 30, a7aVar, self.androidMinVersion);
        output.h(serialDesc, 31, a7aVar, self.androidMaxVersion);
        output.h(serialDesc, 32, TeamOfTheWeekRoundBuzzer$$serializer.INSTANCE, self.teamOfTheWeekRound);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getLabelBackground() {
        return this.labelBackground;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getImageBackground() {
        return this.imageBackground;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getOverlay() {
        return this.overlay;
    }

    /* renamed from: component16, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getActionValue() {
        return this.actionValue;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final BasketballTopStatistics getTopStatistics() {
        return this.topStatistics;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final RankingItem getRanking() {
        return this.ranking;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final String getIntroText() {
        return this.introText;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final String getIntroImageUrl() {
        return this.introImageUrl;
    }

    @Nullable
    public final List<Integer> component24() {
        return this.invisibleOn;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final CupTreeRound getNextCupRound() {
        return this.nextCupRound;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Team getWinningTeam() {
        return this.winningTeam;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Race getRace() {
        return this.race;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Team getPolePositionWinner() {
        return this.polePositionWinner;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final InterestingStatisticsItem getInterestingStatistic() {
        return this.interestingStatistic;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Transfer getTransfer() {
        return this.transfer;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Integer getAndroidMinVersion() {
        return this.androidMinVersion;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Integer getAndroidMaxVersion() {
        return this.androidMaxVersion;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final TeamOfTheWeekRoundBuzzer getTeamOfTheWeekRound() {
        return this.teamOfTheWeekRound;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getIsHome() {
        return this.isHome;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getReasonSuborder() {
        return this.reasonSuborder;
    }

    @NotNull
    public final APIBuzzerTile copy(int id, int type, @Nullable Event event, @Nullable Player player, @Nullable Team team, @Nullable Double rating, @Nullable Boolean isHome, @Nullable String reason, @Nullable Integer reasonSuborder, @Nullable String text, @Nullable String label, @Nullable String labelBackground, @Nullable String imageUrl, @Nullable String imageBackground, @Nullable Integer overlay, int action, @Nullable String actionValue, @Nullable BasketballTopStatistics topStatistics, @Nullable RankingItem ranking, @Nullable Integer position, @Nullable UniqueTournament uniqueTournament, @Nullable String introText, @Nullable String introImageUrl, @Nullable List<Integer> invisibleOn, @Nullable CupTreeRound nextCupRound, @Nullable Team winningTeam, @Nullable Race race, @Nullable Team polePositionWinner, @Nullable InterestingStatisticsItem interestingStatistic, @Nullable Transfer transfer, @Nullable Integer androidMinVersion, @Nullable Integer androidMaxVersion, @Nullable TeamOfTheWeekRoundBuzzer teamOfTheWeekRound) {
        return new APIBuzzerTile(id, type, event, player, team, rating, isHome, reason, reasonSuborder, text, label, labelBackground, imageUrl, imageBackground, overlay, action, actionValue, topStatistics, ranking, position, uniqueTournament, introText, introImageUrl, invisibleOn, nextCupRound, winningTeam, race, polePositionWinner, interestingStatistic, transfer, androidMinVersion, androidMaxVersion, teamOfTheWeekRound);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APIBuzzerTile)) {
            return false;
        }
        APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) other;
        return this.id == aPIBuzzerTile.id && this.type == aPIBuzzerTile.type && Intrinsics.c(this.event, aPIBuzzerTile.event) && Intrinsics.c(this.player, aPIBuzzerTile.player) && Intrinsics.c(this.team, aPIBuzzerTile.team) && Intrinsics.c(this.rating, aPIBuzzerTile.rating) && Intrinsics.c(this.isHome, aPIBuzzerTile.isHome) && Intrinsics.c(this.reason, aPIBuzzerTile.reason) && Intrinsics.c(this.reasonSuborder, aPIBuzzerTile.reasonSuborder) && Intrinsics.c(this.text, aPIBuzzerTile.text) && Intrinsics.c(this.label, aPIBuzzerTile.label) && Intrinsics.c(this.labelBackground, aPIBuzzerTile.labelBackground) && Intrinsics.c(this.imageUrl, aPIBuzzerTile.imageUrl) && Intrinsics.c(this.imageBackground, aPIBuzzerTile.imageBackground) && Intrinsics.c(this.overlay, aPIBuzzerTile.overlay) && this.action == aPIBuzzerTile.action && Intrinsics.c(this.actionValue, aPIBuzzerTile.actionValue) && Intrinsics.c(this.topStatistics, aPIBuzzerTile.topStatistics) && Intrinsics.c(this.ranking, aPIBuzzerTile.ranking) && Intrinsics.c(this.position, aPIBuzzerTile.position) && Intrinsics.c(this.uniqueTournament, aPIBuzzerTile.uniqueTournament) && Intrinsics.c(this.introText, aPIBuzzerTile.introText) && Intrinsics.c(this.introImageUrl, aPIBuzzerTile.introImageUrl) && Intrinsics.c(this.invisibleOn, aPIBuzzerTile.invisibleOn) && Intrinsics.c(this.nextCupRound, aPIBuzzerTile.nextCupRound) && Intrinsics.c(this.winningTeam, aPIBuzzerTile.winningTeam) && Intrinsics.c(this.race, aPIBuzzerTile.race) && Intrinsics.c(this.polePositionWinner, aPIBuzzerTile.polePositionWinner) && Intrinsics.c(this.interestingStatistic, aPIBuzzerTile.interestingStatistic) && Intrinsics.c(this.transfer, aPIBuzzerTile.transfer) && Intrinsics.c(this.androidMinVersion, aPIBuzzerTile.androidMinVersion) && Intrinsics.c(this.androidMaxVersion, aPIBuzzerTile.androidMaxVersion) && Intrinsics.c(this.teamOfTheWeekRound, aPIBuzzerTile.teamOfTheWeekRound);
    }

    public final int getAction() {
        return this.action;
    }

    @Nullable
    public final String getActionValue() {
        return this.actionValue;
    }

    @Nullable
    public final Integer getAndroidMaxVersion() {
        return this.androidMaxVersion;
    }

    @Nullable
    public final Integer getAndroidMinVersion() {
        return this.androidMinVersion;
    }

    @Nullable
    public final Event getEvent() {
        return this.event;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getImageBackground() {
        return this.imageBackground;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final InterestingStatisticsItem getInterestingStatistic() {
        return this.interestingStatistic;
    }

    @Nullable
    public final String getIntroImageUrl() {
        return this.introImageUrl;
    }

    @Nullable
    public final String getIntroText() {
        return this.introText;
    }

    @Nullable
    public final List<Integer> getInvisibleOn() {
        return this.invisibleOn;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getLabelBackground() {
        return this.labelBackground;
    }

    @Nullable
    public final CupTreeRound getNextCupRound() {
        return this.nextCupRound;
    }

    @Nullable
    public final Integer getOverlay() {
        return this.overlay;
    }

    @Nullable
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final Team getPolePositionWinner() {
        return this.polePositionWinner;
    }

    @Nullable
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    public final Race getRace() {
        return this.race;
    }

    @Nullable
    public final RankingItem getRanking() {
        return this.ranking;
    }

    @Nullable
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final Integer getReasonSuborder() {
        return this.reasonSuborder;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final TeamOfTheWeekRoundBuzzer getTeamOfTheWeekRound() {
        return this.teamOfTheWeekRound;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final BasketballTopStatistics getTopStatistics() {
        return this.topStatistics;
    }

    @Nullable
    public final Transfer getTransfer() {
        return this.transfer;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Nullable
    public final Team getWinningTeam() {
        return this.winningTeam;
    }

    public int hashCode() {
        int a = wv8.a(this.type, Integer.hashCode(this.id) * 31, 31);
        Event event = this.event;
        int hashCode = (a + (event == null ? 0 : event.hashCode())) * 31;
        Player player = this.player;
        int hashCode2 = (hashCode + (player == null ? 0 : player.hashCode())) * 31;
        Team team = this.team;
        int hashCode3 = (hashCode2 + (team == null ? 0 : team.hashCode())) * 31;
        Double d = this.rating;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.isHome;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.reason;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.reasonSuborder;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.text;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.labelBackground;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imageUrl;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.imageBackground;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.overlay;
        int a2 = wv8.a(this.action, (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        String str7 = this.actionValue;
        int hashCode13 = (a2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BasketballTopStatistics basketballTopStatistics = this.topStatistics;
        int hashCode14 = (hashCode13 + (basketballTopStatistics == null ? 0 : basketballTopStatistics.hashCode())) * 31;
        RankingItem rankingItem = this.ranking;
        int hashCode15 = (hashCode14 + (rankingItem == null ? 0 : rankingItem.hashCode())) * 31;
        Integer num3 = this.position;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        int hashCode17 = (hashCode16 + (uniqueTournament == null ? 0 : uniqueTournament.hashCode())) * 31;
        String str8 = this.introText;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.introImageUrl;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<Integer> list = this.invisibleOn;
        int hashCode20 = (hashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        CupTreeRound cupTreeRound = this.nextCupRound;
        int hashCode21 = (hashCode20 + (cupTreeRound == null ? 0 : cupTreeRound.hashCode())) * 31;
        Team team2 = this.winningTeam;
        int hashCode22 = (hashCode21 + (team2 == null ? 0 : team2.hashCode())) * 31;
        Race race = this.race;
        int hashCode23 = (hashCode22 + (race == null ? 0 : race.hashCode())) * 31;
        Team team3 = this.polePositionWinner;
        int hashCode24 = (hashCode23 + (team3 == null ? 0 : team3.hashCode())) * 31;
        InterestingStatisticsItem interestingStatisticsItem = this.interestingStatistic;
        int hashCode25 = (hashCode24 + (interestingStatisticsItem == null ? 0 : interestingStatisticsItem.hashCode())) * 31;
        Transfer transfer = this.transfer;
        int hashCode26 = (hashCode25 + (transfer == null ? 0 : transfer.hashCode())) * 31;
        Integer num4 = this.androidMinVersion;
        int hashCode27 = (hashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.androidMaxVersion;
        int hashCode28 = (hashCode27 + (num5 == null ? 0 : num5.hashCode())) * 31;
        TeamOfTheWeekRoundBuzzer teamOfTheWeekRoundBuzzer = this.teamOfTheWeekRound;
        return hashCode28 + (teamOfTheWeekRoundBuzzer != null ? teamOfTheWeekRoundBuzzer.hashCode() : 0);
    }

    @Nullable
    public final Boolean isHome() {
        return this.isHome;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.type;
        Event event = this.event;
        Player player = this.player;
        Team team = this.team;
        Double d = this.rating;
        Boolean bool = this.isHome;
        String str = this.reason;
        Integer num = this.reasonSuborder;
        String str2 = this.text;
        String str3 = this.label;
        String str4 = this.labelBackground;
        String str5 = this.imageUrl;
        String str6 = this.imageBackground;
        Integer num2 = this.overlay;
        int i3 = this.action;
        String str7 = this.actionValue;
        BasketballTopStatistics basketballTopStatistics = this.topStatistics;
        RankingItem rankingItem = this.ranking;
        Integer num3 = this.position;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        String str8 = this.introText;
        String str9 = this.introImageUrl;
        List<Integer> list = this.invisibleOn;
        CupTreeRound cupTreeRound = this.nextCupRound;
        Team team2 = this.winningTeam;
        Race race = this.race;
        Team team3 = this.polePositionWinner;
        InterestingStatisticsItem interestingStatisticsItem = this.interestingStatistic;
        Transfer transfer = this.transfer;
        Integer num4 = this.androidMinVersion;
        Integer num5 = this.androidMaxVersion;
        TeamOfTheWeekRoundBuzzer teamOfTheWeekRoundBuzzer = this.teamOfTheWeekRound;
        StringBuilder s = lnb.s(i, i2, "APIBuzzerTile(id=", ", type=", ", event=");
        s.append(event);
        s.append(", player=");
        s.append(player);
        s.append(", team=");
        s.append(team);
        s.append(", rating=");
        s.append(d);
        s.append(", isHome=");
        s.append(bool);
        s.append(", reason=");
        s.append(str);
        s.append(", reasonSuborder=");
        vxd.s(num, ", text=", str2, ", label=", s);
        bf3.v(s, str3, ", labelBackground=", str4, ", imageUrl=");
        bf3.v(s, str5, ", imageBackground=", str6, ", overlay=");
        s.append(num2);
        s.append(", action=");
        s.append(i3);
        s.append(", actionValue=");
        s.append(str7);
        s.append(", topStatistics=");
        s.append(basketballTopStatistics);
        s.append(", ranking=");
        s.append(rankingItem);
        s.append(", position=");
        s.append(num3);
        s.append(", uniqueTournament=");
        s.append(uniqueTournament);
        s.append(", introText=");
        s.append(str8);
        s.append(", introImageUrl=");
        s.append(str9);
        s.append(", invisibleOn=");
        s.append(list);
        s.append(", nextCupRound=");
        s.append(cupTreeRound);
        s.append(", winningTeam=");
        s.append(team2);
        s.append(", race=");
        s.append(race);
        s.append(", polePositionWinner=");
        s.append(team3);
        s.append(", interestingStatistic=");
        s.append(interestingStatisticsItem);
        s.append(", transfer=");
        s.append(transfer);
        s.append(", androidMinVersion=");
        vxd.r(num4, num5, ", androidMaxVersion=", ", teamOfTheWeekRound=", s);
        s.append(teamOfTheWeekRoundBuzzer);
        s.append(")");
        return s.toString();
    }

    public APIBuzzerTile(int i, int i2, @Nullable Event event, @Nullable Player player, @Nullable Team team, @Nullable Double d, @Nullable Boolean bool, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num2, int i3, @Nullable String str7, @Nullable BasketballTopStatistics basketballTopStatistics, @Nullable RankingItem rankingItem, @Nullable Integer num3, @Nullable UniqueTournament uniqueTournament, @Nullable String str8, @Nullable String str9, @Nullable List<Integer> list, @Nullable CupTreeRound cupTreeRound, @Nullable Team team2, @Nullable Race race, @Nullable Team team3, @Nullable InterestingStatisticsItem interestingStatisticsItem, @Nullable Transfer transfer, @Nullable Integer num4, @Nullable Integer num5, @Nullable TeamOfTheWeekRoundBuzzer teamOfTheWeekRoundBuzzer) {
        this.id = i;
        this.type = i2;
        this.event = event;
        this.player = player;
        this.team = team;
        this.rating = d;
        this.isHome = bool;
        this.reason = str;
        this.reasonSuborder = num;
        this.text = str2;
        this.label = str3;
        this.labelBackground = str4;
        this.imageUrl = str5;
        this.imageBackground = str6;
        this.overlay = num2;
        this.action = i3;
        this.actionValue = str7;
        this.topStatistics = basketballTopStatistics;
        this.ranking = rankingItem;
        this.position = num3;
        this.uniqueTournament = uniqueTournament;
        this.introText = str8;
        this.introImageUrl = str9;
        this.invisibleOn = list;
        this.nextCupRound = cupTreeRound;
        this.winningTeam = team2;
        this.race = race;
        this.polePositionWinner = team3;
        this.interestingStatistic = interestingStatisticsItem;
        this.transfer = transfer;
        this.androidMinVersion = num4;
        this.androidMaxVersion = num5;
        this.teamOfTheWeekRound = teamOfTheWeekRoundBuzzer;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/buzzer/APIBuzzerTile$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/buzzer/APIBuzzerTile;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return APIBuzzerTile$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
