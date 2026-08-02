package com.sofascore.model.newNetwork.mediaposts;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Round$$serializer;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Sport$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.NewsProvider;
import com.sofascore.model.newNetwork.NewsProvider$$serializer;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.a7a;
import defpackage.b1c;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.gz1;
import defpackage.joa;
import defpackage.l98;
import defpackage.ljg;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b=\b\u0087\b\u0018\u0000 ¢\u00012\u00020\u0001:\u0004£\u0001¢\u0001B\u0085\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,B\u0099\u0002\b\u0010\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bC\u0010BJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bJ\u0010IJ\u0018\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bK\u00104J\u0012\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bL\u0010IJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bM\u0010IJ\u0012\u0010N\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0018\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bP\u00104J\u0012\u0010Q\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bY\u0010ZJ¼\u0002\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)HÆ\u0001¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b]\u0010IJ\u0010\u0010^\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b^\u00102J\u001a\u0010`\u001a\u00020\u001e2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b`\u0010aJ'\u0010j\u001a\u00020g2\u0006\u0010b\u001a\u00020\u00002\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020eH\u0001¢\u0006\u0004\bh\u0010iR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010k\u001a\u0004\bl\u00102R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010m\u001a\u0004\bn\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010o\u001a\u0004\bp\u00106R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010q\u001a\u0004\br\u00108R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010s\u001a\u0004\bt\u0010:R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010u\u001a\u0004\bv\u0010<R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010w\u001a\u0004\bx\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010y\u001a\u0004\bz\u0010@R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010{\u001a\u0004\b|\u0010BR\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010{\u001a\u0004\b}\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010~\u001a\u0004\b\u007f\u0010ER\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010GR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010IR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u0082\u0001\u001a\u0005\b\u0084\u0001\u0010IR \u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b\u001b\u0010m\u001a\u0005\b\u0085\u0001\u00104R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u0082\u0001\u001a\u0005\b\u0086\u0001\u0010IR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0082\u0001\u001a\u0005\b\u0087\u0001\u0010IR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010OR \u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b \u0010m\u001a\u0005\b\u008a\u0001\u00104R\u001b\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010RR\u001b\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000e\n\u0005\b$\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010TR\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010VR\u001b\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010XR\u001b\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010ZR\u0016\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00028F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00028F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0096\u0001R\u0016\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00028F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u0096\u0001R\u0016\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00028F¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u0096\u0001R\u0016\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00028F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u0096\u0001R\u0016\u0010¡\u0001\u001a\u0004\u0018\u00010\u00028F¢\u0006\b\u001a\u0006\b \u0001\u0010\u0096\u0001¨\u0006¤\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/mediaposts/MediaPost;", "", "", "id", "", "", "tags", "Lcom/sofascore/model/newNetwork/mediaposts/MediaEvent;", "event", "Lcom/sofascore/model/newNetwork/mediaposts/MediaTeam;", "team", "Lcom/sofascore/model/newNetwork/mediaposts/MediaPlayer;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/newNetwork/mediaposts/MediaManager;", SearchResponseKt.MANAGER_ENTITY, "Lcom/sofascore/model/newNetwork/mediaposts/MediaUniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "Lcom/sofascore/model/mvvm/model/Sport;", SearchResponseKt.SPORT_ENTITY, "", "createdAtTimestamp", "publishedAtTimestamp", "contentDateTimestamp", "Lcom/sofascore/model/newNetwork/mediaposts/MediaType;", "type", "header", "description", "images", "contentId", "externalUrl", "", "embeddable", "mediaPostIds", "Lcom/sofascore/model/newNetwork/mediaposts/MediaVenue;", "venue", "Lcom/sofascore/model/mvvm/model/Round;", TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "Lcom/sofascore/model/newNetwork/NewsProvider;", "newsProvider", "Lcom/sofascore/model/newNetwork/mediaposts/MediaStage;", "stage", "<init>", "(ILjava/util/List;Lcom/sofascore/model/newNetwork/mediaposts/MediaEvent;Lcom/sofascore/model/newNetwork/mediaposts/MediaTeam;Lcom/sofascore/model/newNetwork/mediaposts/MediaPlayer;Lcom/sofascore/model/newNetwork/mediaposts/MediaManager;Lcom/sofascore/model/newNetwork/mediaposts/MediaUniqueTournament;Lcom/sofascore/model/mvvm/model/Sport;JJLjava/lang/Long;Lcom/sofascore/model/newNetwork/mediaposts/MediaType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/sofascore/model/newNetwork/mediaposts/MediaVenue;Lcom/sofascore/model/mvvm/model/Round;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/newNetwork/NewsProvider;Lcom/sofascore/model/newNetwork/mediaposts/MediaStage;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/util/List;Lcom/sofascore/model/newNetwork/mediaposts/MediaEvent;Lcom/sofascore/model/newNetwork/mediaposts/MediaTeam;Lcom/sofascore/model/newNetwork/mediaposts/MediaPlayer;Lcom/sofascore/model/newNetwork/mediaposts/MediaManager;Lcom/sofascore/model/newNetwork/mediaposts/MediaUniqueTournament;Lcom/sofascore/model/mvvm/model/Sport;JJLjava/lang/Long;Lcom/sofascore/model/newNetwork/mediaposts/MediaType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/sofascore/model/newNetwork/mediaposts/MediaVenue;Lcom/sofascore/model/mvvm/model/Round;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/newNetwork/NewsProvider;Lcom/sofascore/model/newNetwork/mediaposts/MediaStage;Lt5h;)V", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "()Lcom/sofascore/model/newNetwork/mediaposts/MediaEvent;", "component4", "()Lcom/sofascore/model/newNetwork/mediaposts/MediaTeam;", "component5", "()Lcom/sofascore/model/newNetwork/mediaposts/MediaPlayer;", "component6", "()Lcom/sofascore/model/newNetwork/mediaposts/MediaManager;", "component7", "()Lcom/sofascore/model/newNetwork/mediaposts/MediaUniqueTournament;", "component8", "()Lcom/sofascore/model/mvvm/model/Sport;", "component9", "()J", "component10", "component11", "()Ljava/lang/Long;", "component12", "()Lcom/sofascore/model/newNetwork/mediaposts/MediaType;", "component13", "()Ljava/lang/String;", "component14", "component15", "component16", "component17", "component18", "()Ljava/lang/Boolean;", "component19", "component20", "()Lcom/sofascore/model/newNetwork/mediaposts/MediaVenue;", "component21", "()Lcom/sofascore/model/mvvm/model/Round;", "component22", "()Lcom/sofascore/model/mvvm/model/Season;", "component23", "()Lcom/sofascore/model/newNetwork/NewsProvider;", "component24", "()Lcom/sofascore/model/newNetwork/mediaposts/MediaStage;", "copy", "(ILjava/util/List;Lcom/sofascore/model/newNetwork/mediaposts/MediaEvent;Lcom/sofascore/model/newNetwork/mediaposts/MediaTeam;Lcom/sofascore/model/newNetwork/mediaposts/MediaPlayer;Lcom/sofascore/model/newNetwork/mediaposts/MediaManager;Lcom/sofascore/model/newNetwork/mediaposts/MediaUniqueTournament;Lcom/sofascore/model/mvvm/model/Sport;JJLjava/lang/Long;Lcom/sofascore/model/newNetwork/mediaposts/MediaType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/sofascore/model/newNetwork/mediaposts/MediaVenue;Lcom/sofascore/model/mvvm/model/Round;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/newNetwork/NewsProvider;Lcom/sofascore/model/newNetwork/mediaposts/MediaStage;)Lcom/sofascore/model/newNetwork/mediaposts/MediaPost;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/mediaposts/MediaPost;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/util/List;", "getTags", "Lcom/sofascore/model/newNetwork/mediaposts/MediaEvent;", "getEvent", "Lcom/sofascore/model/newNetwork/mediaposts/MediaTeam;", "getTeam", "Lcom/sofascore/model/newNetwork/mediaposts/MediaPlayer;", "getPlayer", "Lcom/sofascore/model/newNetwork/mediaposts/MediaManager;", "getManager", "Lcom/sofascore/model/newNetwork/mediaposts/MediaUniqueTournament;", "getUniqueTournament", "Lcom/sofascore/model/mvvm/model/Sport;", "getSport", "J", "getCreatedAtTimestamp", "getPublishedAtTimestamp", "Ljava/lang/Long;", "getContentDateTimestamp", "Lcom/sofascore/model/newNetwork/mediaposts/MediaType;", "getType", "Ljava/lang/String;", "getHeader", "getDescription", "getImages", "getContentId", "getExternalUrl", "Ljava/lang/Boolean;", "getEmbeddable", "getMediaPostIds", "Lcom/sofascore/model/newNetwork/mediaposts/MediaVenue;", "getVenue", "Lcom/sofascore/model/mvvm/model/Round;", "getRound", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "Lcom/sofascore/model/newNetwork/NewsProvider;", "getNewsProvider", "Lcom/sofascore/model/newNetwork/mediaposts/MediaStage;", "getStage", "getEventId", "()Ljava/lang/Integer;", "eventId", "getTeamId", "teamId", "getPlayerId", "playerId", "getManagerId", "managerId", "getUniqueTournamentId", "uniqueTournamentId", "getStageId", "stageId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MediaPost {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long contentDateTimestamp;

    @Nullable
    private final String contentId;
    private final long createdAtTimestamp;

    @Nullable
    private final String description;

    @Nullable
    private final Boolean embeddable;

    @Nullable
    private final MediaEvent event;

    @Nullable
    private final String externalUrl;

    @Nullable
    private final String header;
    private final int id;

    @Nullable
    private final List<String> images;

    @Nullable
    private final MediaManager manager;

    @Nullable
    private final List<Integer> mediaPostIds;

    @Nullable
    private final NewsProvider newsProvider;

    @Nullable
    private final MediaPlayer player;
    private final long publishedAtTimestamp;

    @Nullable
    private final Round round;

    @Nullable
    private final Season season;

    @Nullable
    private final Sport sport;

    @Nullable
    private final MediaStage stage;

    @NotNull
    private final List<String> tags;

    @Nullable
    private final MediaTeam team;

    @Nullable
    private final MediaType type;

    @Nullable
    private final MediaUniqueTournament uniqueTournament;

    @Nullable
    private final MediaVenue venue;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new b1c(4)), null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new b1c(5)), null, null, ypa.a(ysaVar, new b1c(6)), null, null, null, ypa.a(ysaVar, new b1c(7)), null, null, null, null, null};
    }

    public /* synthetic */ MediaPost(int i, int i2, List list, MediaEvent mediaEvent, MediaTeam mediaTeam, MediaPlayer mediaPlayer, MediaManager mediaManager, MediaUniqueTournament mediaUniqueTournament, Sport sport, long j, long j2, Long l, MediaType mediaType, String str, String str2, List list2, String str3, String str4, Boolean bool, List list3, MediaVenue mediaVenue, Round round, Season season, NewsProvider newsProvider, MediaStage mediaStage, t5h t5hVar) {
        if (16776703 != (i & 16776703)) {
            oea.z(i, 16776703, MediaPost$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.tags = list;
        this.event = mediaEvent;
        this.team = mediaTeam;
        this.player = mediaPlayer;
        this.manager = mediaManager;
        this.uniqueTournament = mediaUniqueTournament;
        this.sport = sport;
        this.createdAtTimestamp = j;
        if ((i & 512) == 0) {
            this.publishedAtTimestamp = 0L;
        } else {
            this.publishedAtTimestamp = j2;
        }
        this.contentDateTimestamp = l;
        this.type = mediaType;
        this.header = str;
        this.description = str2;
        this.images = list2;
        this.contentId = str3;
        this.externalUrl = str4;
        this.embeddable = bool;
        this.mediaPostIds = list3;
        this.venue = mediaVenue;
        this.round = round;
        this.season = season;
        this.newsProvider = newsProvider;
        this.stage = mediaStage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(l98.W(uhi.a), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return MediaType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(uhi.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(a7a.a, 0);
    }

    public static /* synthetic */ MediaPost copy$default(MediaPost mediaPost, int i, List list, MediaEvent mediaEvent, MediaTeam mediaTeam, MediaPlayer mediaPlayer, MediaManager mediaManager, MediaUniqueTournament mediaUniqueTournament, Sport sport, long j, long j2, Long l, MediaType mediaType, String str, String str2, List list2, String str3, String str4, Boolean bool, List list3, MediaVenue mediaVenue, Round round, Season season, NewsProvider newsProvider, MediaStage mediaStage, int i2, Object obj) {
        MediaStage mediaStage2;
        NewsProvider newsProvider2;
        int i3 = (i2 & 1) != 0 ? mediaPost.id : i;
        List list4 = (i2 & 2) != 0 ? mediaPost.tags : list;
        MediaEvent mediaEvent2 = (i2 & 4) != 0 ? mediaPost.event : mediaEvent;
        MediaTeam mediaTeam2 = (i2 & 8) != 0 ? mediaPost.team : mediaTeam;
        MediaPlayer mediaPlayer2 = (i2 & 16) != 0 ? mediaPost.player : mediaPlayer;
        MediaManager mediaManager2 = (i2 & 32) != 0 ? mediaPost.manager : mediaManager;
        MediaUniqueTournament mediaUniqueTournament2 = (i2 & 64) != 0 ? mediaPost.uniqueTournament : mediaUniqueTournament;
        Sport sport2 = (i2 & 128) != 0 ? mediaPost.sport : sport;
        long j3 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? mediaPost.createdAtTimestamp : j;
        long j4 = (i2 & 512) != 0 ? mediaPost.publishedAtTimestamp : j2;
        Long l2 = (i2 & 1024) != 0 ? mediaPost.contentDateTimestamp : l;
        MediaType mediaType2 = (i2 & a.o) != 0 ? mediaPost.type : mediaType;
        int i4 = i3;
        String str5 = (i2 & 4096) != 0 ? mediaPost.header : str;
        String str6 = (i2 & 8192) != 0 ? mediaPost.description : str2;
        List list5 = (i2 & 16384) != 0 ? mediaPost.images : list2;
        String str7 = (i2 & 32768) != 0 ? mediaPost.contentId : str3;
        String str8 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? mediaPost.externalUrl : str4;
        Boolean bool2 = (i2 & 131072) != 0 ? mediaPost.embeddable : bool;
        List list6 = (i2 & 262144) != 0 ? mediaPost.mediaPostIds : list3;
        MediaVenue mediaVenue2 = (i2 & 524288) != 0 ? mediaPost.venue : mediaVenue;
        Round round2 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? mediaPost.round : round;
        Season season2 = (i2 & 2097152) != 0 ? mediaPost.season : season;
        NewsProvider newsProvider3 = (i2 & 4194304) != 0 ? mediaPost.newsProvider : newsProvider;
        if ((i2 & 8388608) != 0) {
            newsProvider2 = newsProvider3;
            mediaStage2 = mediaPost.stage;
        } else {
            mediaStage2 = mediaStage;
            newsProvider2 = newsProvider3;
        }
        return mediaPost.copy(i4, list4, mediaEvent2, mediaTeam2, mediaPlayer2, mediaManager2, mediaUniqueTournament2, sport2, j3, j4, l2, mediaType2, str5, str6, list5, str7, str8, bool2, list6, mediaVenue2, round2, season2, newsProvider2, mediaStage2);
    }

    public static final /* synthetic */ void write$Self$model_release(MediaPost self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.tags);
        output.h(serialDesc, 2, MediaEvent$$serializer.INSTANCE, self.event);
        output.h(serialDesc, 3, MediaTeam$$serializer.INSTANCE, self.team);
        output.h(serialDesc, 4, MediaPlayer$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 5, MediaManager$$serializer.INSTANCE, self.manager);
        output.h(serialDesc, 6, MediaUniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        output.h(serialDesc, 7, Sport$$serializer.INSTANCE, self.sport);
        output.E(serialDesc, 8, self.createdAtTimestamp);
        if (output.o(serialDesc) || self.publishedAtTimestamp != 0) {
            output.E(serialDesc, 9, self.publishedAtTimestamp);
        }
        output.h(serialDesc, 10, lkb.a, self.contentDateTimestamp);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.type);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 12, uhiVar, self.header);
        output.h(serialDesc, 13, uhiVar, self.description);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.images);
        output.h(serialDesc, 15, uhiVar, self.contentId);
        output.h(serialDesc, 16, uhiVar, self.externalUrl);
        output.h(serialDesc, 17, gz1.a, self.embeddable);
        output.h(serialDesc, 18, (KSerializer) joaVarArr[18].getValue(), self.mediaPostIds);
        output.h(serialDesc, 19, MediaVenue$$serializer.INSTANCE, self.venue);
        output.h(serialDesc, 20, Round$$serializer.INSTANCE, self.round);
        output.h(serialDesc, 21, Season$$serializer.INSTANCE, self.season);
        output.h(serialDesc, 22, NewsProvider$$serializer.INSTANCE, self.newsProvider);
        output.h(serialDesc, 23, MediaStage$$serializer.INSTANCE, self.stage);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getPublishedAtTimestamp() {
        return this.publishedAtTimestamp;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Long getContentDateTimestamp() {
        return this.contentDateTimestamp;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final MediaType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final List<String> component15() {
        return this.images;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getExternalUrl() {
        return this.externalUrl;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Boolean getEmbeddable() {
        return this.embeddable;
    }

    @Nullable
    public final List<Integer> component19() {
        return this.mediaPostIds;
    }

    @NotNull
    public final List<String> component2() {
        return this.tags;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final MediaVenue getVenue() {
        return this.venue;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Round getRound() {
        return this.round;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Season getSeason() {
        return this.season;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final NewsProvider getNewsProvider() {
        return this.newsProvider;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final MediaStage getStage() {
        return this.stage;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final MediaEvent getEvent() {
        return this.event;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final MediaTeam getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final MediaPlayer getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final MediaManager getManager() {
        return this.manager;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final MediaUniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Sport getSport() {
        return this.sport;
    }

    /* renamed from: component9, reason: from getter */
    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @NotNull
    public final MediaPost copy(int id, @NotNull List<String> tags, @Nullable MediaEvent event, @Nullable MediaTeam team, @Nullable MediaPlayer player, @Nullable MediaManager manager, @Nullable MediaUniqueTournament uniqueTournament, @Nullable Sport sport, long createdAtTimestamp, long publishedAtTimestamp, @Nullable Long contentDateTimestamp, @Nullable MediaType type, @Nullable String header, @Nullable String description, @Nullable List<String> images, @Nullable String contentId, @Nullable String externalUrl, @Nullable Boolean embeddable, @Nullable List<Integer> mediaPostIds, @Nullable MediaVenue venue, @Nullable Round round, @Nullable Season season, @Nullable NewsProvider newsProvider, @Nullable MediaStage stage) {
        tags.getClass();
        return new MediaPost(id, tags, event, team, player, manager, uniqueTournament, sport, createdAtTimestamp, publishedAtTimestamp, contentDateTimestamp, type, header, description, images, contentId, externalUrl, embeddable, mediaPostIds, venue, round, season, newsProvider, stage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaPost)) {
            return false;
        }
        MediaPost mediaPost = (MediaPost) other;
        return this.id == mediaPost.id && Intrinsics.c(this.tags, mediaPost.tags) && Intrinsics.c(this.event, mediaPost.event) && Intrinsics.c(this.team, mediaPost.team) && Intrinsics.c(this.player, mediaPost.player) && Intrinsics.c(this.manager, mediaPost.manager) && Intrinsics.c(this.uniqueTournament, mediaPost.uniqueTournament) && Intrinsics.c(this.sport, mediaPost.sport) && this.createdAtTimestamp == mediaPost.createdAtTimestamp && this.publishedAtTimestamp == mediaPost.publishedAtTimestamp && Intrinsics.c(this.contentDateTimestamp, mediaPost.contentDateTimestamp) && this.type == mediaPost.type && Intrinsics.c(this.header, mediaPost.header) && Intrinsics.c(this.description, mediaPost.description) && Intrinsics.c(this.images, mediaPost.images) && Intrinsics.c(this.contentId, mediaPost.contentId) && Intrinsics.c(this.externalUrl, mediaPost.externalUrl) && Intrinsics.c(this.embeddable, mediaPost.embeddable) && Intrinsics.c(this.mediaPostIds, mediaPost.mediaPostIds) && Intrinsics.c(this.venue, mediaPost.venue) && Intrinsics.c(this.round, mediaPost.round) && Intrinsics.c(this.season, mediaPost.season) && Intrinsics.c(this.newsProvider, mediaPost.newsProvider) && Intrinsics.c(this.stage, mediaPost.stage);
    }

    @Nullable
    public final Long getContentDateTimestamp() {
        return this.contentDateTimestamp;
    }

    @Nullable
    public final String getContentId() {
        return this.contentId;
    }

    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Boolean getEmbeddable() {
        return this.embeddable;
    }

    @Nullable
    public final MediaEvent getEvent() {
        return this.event;
    }

    @Nullable
    public final Integer getEventId() {
        MediaEvent mediaEvent = this.event;
        if (mediaEvent != null) {
            return Integer.valueOf(mediaEvent.getId());
        }
        return null;
    }

    @Nullable
    public final String getExternalUrl() {
        return this.externalUrl;
    }

    @Nullable
    public final String getHeader() {
        return this.header;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final List<String> getImages() {
        return this.images;
    }

    @Nullable
    public final MediaManager getManager() {
        return this.manager;
    }

    @Nullable
    public final Integer getManagerId() {
        MediaManager mediaManager = this.manager;
        if (mediaManager != null) {
            return Integer.valueOf(mediaManager.getId());
        }
        return null;
    }

    @Nullable
    public final List<Integer> getMediaPostIds() {
        return this.mediaPostIds;
    }

    @Nullable
    public final NewsProvider getNewsProvider() {
        return this.newsProvider;
    }

    @Nullable
    public final MediaPlayer getPlayer() {
        return this.player;
    }

    @Nullable
    public final Integer getPlayerId() {
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null) {
            return Integer.valueOf(mediaPlayer.getId());
        }
        return null;
    }

    public final long getPublishedAtTimestamp() {
        return this.publishedAtTimestamp;
    }

    @Nullable
    public final Round getRound() {
        return this.round;
    }

    @Nullable
    public final Season getSeason() {
        return this.season;
    }

    @Nullable
    public final Sport getSport() {
        return this.sport;
    }

    @Nullable
    public final MediaStage getStage() {
        return this.stage;
    }

    @Nullable
    public final Integer getStageId() {
        MediaStage mediaStage = this.stage;
        if (mediaStage != null) {
            return Integer.valueOf(mediaStage.getId());
        }
        return null;
    }

    @NotNull
    public final List<String> getTags() {
        return this.tags;
    }

    @Nullable
    public final MediaTeam getTeam() {
        return this.team;
    }

    @Nullable
    public final Integer getTeamId() {
        MediaTeam mediaTeam = this.team;
        if (mediaTeam != null) {
            return Integer.valueOf(mediaTeam.getId());
        }
        return null;
    }

    @Nullable
    public final MediaType getType() {
        return this.type;
    }

    @Nullable
    public final MediaUniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Nullable
    public final Integer getUniqueTournamentId() {
        MediaUniqueTournament mediaUniqueTournament = this.uniqueTournament;
        if (mediaUniqueTournament != null) {
            return Integer.valueOf(mediaUniqueTournament.getId());
        }
        return null;
    }

    @Nullable
    public final MediaVenue getVenue() {
        return this.venue;
    }

    public int hashCode() {
        int d = dmi.d(Integer.hashCode(this.id) * 31, 31, this.tags);
        MediaEvent mediaEvent = this.event;
        int hashCode = (d + (mediaEvent == null ? 0 : mediaEvent.hashCode())) * 31;
        MediaTeam mediaTeam = this.team;
        int hashCode2 = (hashCode + (mediaTeam == null ? 0 : mediaTeam.hashCode())) * 31;
        MediaPlayer mediaPlayer = this.player;
        int hashCode3 = (hashCode2 + (mediaPlayer == null ? 0 : mediaPlayer.hashCode())) * 31;
        MediaManager mediaManager = this.manager;
        int hashCode4 = (hashCode3 + (mediaManager == null ? 0 : mediaManager.hashCode())) * 31;
        MediaUniqueTournament mediaUniqueTournament = this.uniqueTournament;
        int hashCode5 = (hashCode4 + (mediaUniqueTournament == null ? 0 : mediaUniqueTournament.hashCode())) * 31;
        Sport sport = this.sport;
        int c = ljg.c(ljg.c((hashCode5 + (sport == null ? 0 : sport.hashCode())) * 31, 31, this.createdAtTimestamp), 31, this.publishedAtTimestamp);
        Long l = this.contentDateTimestamp;
        int hashCode6 = (c + (l == null ? 0 : l.hashCode())) * 31;
        MediaType mediaType = this.type;
        int hashCode7 = (hashCode6 + (mediaType == null ? 0 : mediaType.hashCode())) * 31;
        String str = this.header;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.images;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.contentId;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.externalUrl;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.embeddable;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Integer> list2 = this.mediaPostIds;
        int hashCode14 = (hashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MediaVenue mediaVenue = this.venue;
        int hashCode15 = (hashCode14 + (mediaVenue == null ? 0 : mediaVenue.hashCode())) * 31;
        Round round = this.round;
        int hashCode16 = (hashCode15 + (round == null ? 0 : round.hashCode())) * 31;
        Season season = this.season;
        int hashCode17 = (hashCode16 + (season == null ? 0 : season.hashCode())) * 31;
        NewsProvider newsProvider = this.newsProvider;
        int hashCode18 = (hashCode17 + (newsProvider == null ? 0 : newsProvider.hashCode())) * 31;
        MediaStage mediaStage = this.stage;
        return hashCode18 + (mediaStage != null ? mediaStage.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        List<String> list = this.tags;
        MediaEvent mediaEvent = this.event;
        MediaTeam mediaTeam = this.team;
        MediaPlayer mediaPlayer = this.player;
        MediaManager mediaManager = this.manager;
        MediaUniqueTournament mediaUniqueTournament = this.uniqueTournament;
        Sport sport = this.sport;
        long j = this.createdAtTimestamp;
        long j2 = this.publishedAtTimestamp;
        Long l = this.contentDateTimestamp;
        MediaType mediaType = this.type;
        String str = this.header;
        String str2 = this.description;
        List<String> list2 = this.images;
        String str3 = this.contentId;
        String str4 = this.externalUrl;
        Boolean bool = this.embeddable;
        List<Integer> list3 = this.mediaPostIds;
        MediaVenue mediaVenue = this.venue;
        Round round = this.round;
        Season season = this.season;
        NewsProvider newsProvider = this.newsProvider;
        MediaStage mediaStage = this.stage;
        StringBuilder sb = new StringBuilder("MediaPost(id=");
        sb.append(i);
        sb.append(", tags=");
        sb.append(list);
        sb.append(", event=");
        sb.append(mediaEvent);
        sb.append(", team=");
        sb.append(mediaTeam);
        sb.append(", player=");
        sb.append(mediaPlayer);
        sb.append(", manager=");
        sb.append(mediaManager);
        sb.append(", uniqueTournament=");
        sb.append(mediaUniqueTournament);
        sb.append(", sport=");
        sb.append(sport);
        sb.append(", createdAtTimestamp=");
        sb.append(j);
        fn0.t(j2, ", publishedAtTimestamp=", ", contentDateTimestamp=", sb);
        sb.append(l);
        sb.append(", type=");
        sb.append(mediaType);
        sb.append(", header=");
        bf3.v(sb, str, ", description=", str2, ", images=");
        sb.append(list2);
        sb.append(", contentId=");
        sb.append(str3);
        sb.append(", externalUrl=");
        sb.append(str4);
        sb.append(", embeddable=");
        sb.append(bool);
        sb.append(", mediaPostIds=");
        sb.append(list3);
        sb.append(", venue=");
        sb.append(mediaVenue);
        sb.append(", round=");
        sb.append(round);
        sb.append(", season=");
        sb.append(season);
        sb.append(", newsProvider=");
        sb.append(newsProvider);
        sb.append(", stage=");
        sb.append(mediaStage);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/mediaposts/MediaPost$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/mediaposts/MediaPost;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MediaPost$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MediaPost(int i, @NotNull List<String> list, @Nullable MediaEvent mediaEvent, @Nullable MediaTeam mediaTeam, @Nullable MediaPlayer mediaPlayer, @Nullable MediaManager mediaManager, @Nullable MediaUniqueTournament mediaUniqueTournament, @Nullable Sport sport, long j, long j2, @Nullable Long l, @Nullable MediaType mediaType, @Nullable String str, @Nullable String str2, @Nullable List<String> list2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable List<Integer> list3, @Nullable MediaVenue mediaVenue, @Nullable Round round, @Nullable Season season, @Nullable NewsProvider newsProvider, @Nullable MediaStage mediaStage) {
        list.getClass();
        this.id = i;
        this.tags = list;
        this.event = mediaEvent;
        this.team = mediaTeam;
        this.player = mediaPlayer;
        this.manager = mediaManager;
        this.uniqueTournament = mediaUniqueTournament;
        this.sport = sport;
        this.createdAtTimestamp = j;
        this.publishedAtTimestamp = j2;
        this.contentDateTimestamp = l;
        this.type = mediaType;
        this.header = str;
        this.description = str2;
        this.images = list2;
        this.contentId = str3;
        this.externalUrl = str4;
        this.embeddable = bool;
        this.mediaPostIds = list3;
        this.venue = mediaVenue;
        this.round = round;
        this.season = season;
        this.newsProvider = newsProvider;
        this.stage = mediaStage;
    }

    public /* synthetic */ MediaPost(int i, List list, MediaEvent mediaEvent, MediaTeam mediaTeam, MediaPlayer mediaPlayer, MediaManager mediaManager, MediaUniqueTournament mediaUniqueTournament, Sport sport, long j, long j2, Long l, MediaType mediaType, String str, String str2, List list2, String str3, String str4, Boolean bool, List list3, MediaVenue mediaVenue, Round round, Season season, NewsProvider newsProvider, MediaStage mediaStage, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, mediaEvent, mediaTeam, mediaPlayer, mediaManager, mediaUniqueTournament, sport, j, (i2 & 512) != 0 ? 0L : j2, l, mediaType, str, str2, list2, str3, str4, bool, list3, mediaVenue, round, season, newsProvider, mediaStage);
    }
}
