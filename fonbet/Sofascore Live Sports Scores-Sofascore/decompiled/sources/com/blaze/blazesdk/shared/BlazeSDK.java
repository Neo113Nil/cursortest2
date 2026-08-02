package com.blaze.blazesdk.shared;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.blaze.blazesdk.ads.banners.BlazeGAMBannerAdsHandler;
import com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler;
import com.blaze.blazesdk.ads.ima.BlazeImaHandler;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.cast.BlazeCastingManager;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazePlayerEntryPointDelegate;
import com.blaze.blazesdk.delegates.BlazeSDKDelegate;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.features.videos.models.configuration.BlazeVideosPlaybackConfiguration;
import com.blaze.blazesdk.follow.IBlazeFollowEntitiesManager;
import com.blaze.blazesdk.hosting_app_context.BlazeHostingAppContextManager;
import com.blaze.blazesdk.hosting_app_context.IBlazeHostingAppContextManager;
import com.blaze.blazesdk.pip.BlazePiPManager;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.exceptions.BlazeException;
import com.blaze.blazesdk.shared.models.BlazeEntryPointTriggerSource;
import com.blaze.blazesdk.shared.models.BlazeLayoutDirection;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.ErrorDomain;
import com.blaze.blazesdk.shared.results.a;
import com.blaze.blazesdk.shared.results.a0;
import com.blaze.blazesdk.shared.results.b;
import com.blaze.blazesdk.shared.results.c;
import com.blaze.blazesdk.shared.results.d;
import com.blaze.blazesdk.shared.results.g;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.shared.results.y;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.ironsource.U3;
import com.ironsource.W3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.amm;
import defpackage.b1d;
import defpackage.bdm;
import defpackage.beh;
import defpackage.bum;
import defpackage.bxm;
import defpackage.cwm;
import defpackage.dvl;
import defpackage.e1m;
import defpackage.evl;
import defpackage.exl;
import defpackage.gfm;
import defpackage.gxl;
import defpackage.gzk;
import defpackage.h1m;
import defpackage.ihm;
import defpackage.iqm;
import defpackage.iwl;
import defpackage.j1m;
import defpackage.jdm;
import defpackage.js1;
import defpackage.jsl;
import defpackage.kgm;
import defpackage.lu3;
import defpackage.mim;
import defpackage.n0n;
import defpackage.nam;
import defpackage.ntl;
import defpackage.oam;
import defpackage.onm;
import defpackage.otl;
import defpackage.pnm;
import defpackage.q5m;
import defpackage.rq3;
import defpackage.rsm;
import defpackage.spm;
import defpackage.sx1;
import defpackage.sxm;
import defpackage.tul;
import defpackage.u4m;
import defpackage.vs1;
import defpackage.wba;
import defpackage.x7m;
import defpackage.y6a;
import defpackage.zzl;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008f\u0001\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b$\u0010%JK\u0010+\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\b+\u0010,Ji\u00103\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u0002012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\b3\u00104Jk\u00108\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u00042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010.\u001a\u00020-2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u0002012\u0006\u0010:\u001a\u00020\u0004H\u0007¢\u0006\u0004\b;\u0010<J?\u0010=\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\b=\u0010>JK\u0010?\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\b?\u0010,Js\u0010D\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020B2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u0002012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\bD\u0010EJ]\u0010G\u001a\u00020\u00132\u0006\u0010F\u001a\u00020\u00042\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020B2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\bG\u0010HJK\u0010I\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\bI\u0010,Js\u0010M\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010K\u001a\u00020J2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u0002012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010C\u001a\u00020L2\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\bM\u0010NJ]\u0010P\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u00042\b\b\u0002\u0010K\u001a\u00020J2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010C\u001a\u00020L2\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0013H\u0007¢\u0006\u0004\bR\u0010\u0003J\u000f\u0010S\u001a\u00020\u0013H\u0007¢\u0006\u0004\bS\u0010\u0003J\u000f\u0010T\u001a\u00020\u0013H\u0007¢\u0006\u0004\bT\u0010\u0003J\u0017\u0010U\u001a\u00020\u00132\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020-H\u0007¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00132\u0006\u0010A\u001a\u00020@H\u0007¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020@H\u0007¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00132\u0006\u0010C\u001a\u00020BH\u0007¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020BH\u0007¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020\u00132\u0006\u0010K\u001a\u00020JH\u0007¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020JH\u0007¢\u0006\u0004\bc\u0010dJ\u0019\u0010f\u001a\u00020\u00132\b\u0010e\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020\u00132\u0006\u0010C\u001a\u00020LH\u0007¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020LH\u0007¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00132\u0006\u0010l\u001a\u000201H\u0007¢\u0006\u0004\bm\u0010nJ5\u0010o\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\bo\u0010pJ5\u0010q\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\bq\u0010pJ\u000f\u0010r\u001a\u000201H\u0007¢\u0006\u0004\br\u0010sJ?\u0010u\u001a\u00020\u00132\u0006\u0010t\u001a\u00020\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\bu\u0010>JK\u0010x\u001a\u00020\u00132\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040v2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\bx\u0010yJ#\u0010z\u001a\u0002012\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040vH\u0007¢\u0006\u0004\bz\u0010{JE\u0010~\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00042\u0006\u0010|\u001a\u00020&2\b\b\u0002\u00102\u001a\u0002012\u001a\b\u0002\u0010}\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0081\u0001\u001a\u00020\u0013H\u0000¢\u0006\u0005\b\u0080\u0001\u0010\u0003J\u0011\u0010\u0083\u0001\u001a\u00020\u0013H\u0000¢\u0006\u0005\b\u0082\u0001\u0010\u0003J\u0013\u0010\u0084\u0001\u001a\u00020\u0013H\u0082@¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\u00132\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008a\u0001\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0011\u0010\u008c\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u008c\u0001\u0010\u0003J\u0011\u0010\u008d\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u008d\u0001\u0010\u0003J\u001e\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008b\u0001R!\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0092\u0001\u001a\u00020\u00078\u0002X\u0082T¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0094\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0095\u0001R&\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0016\n\u0005\b\u0005\u0010\u0095\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0005\b\u0099\u0001\u0010gR'\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\n\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R'\u0010\u009f\u0001\u001a\u0002018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0005\b¡\u0001\u0010s\"\u0005\b¢\u0001\u0010nR'\u0010£\u0001\u001a\u0002018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b£\u0001\u0010 \u0001\u001a\u0005\b¤\u0001\u0010s\"\u0005\b¥\u0001\u0010nR(\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u001b\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0005\b©\u0001\u0010\u001dR,\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\t\u0010ª\u0001\u001a\u0004\u0018\u00010\u001e8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b\u001f\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R(\u0010#\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b#\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0005\b±\u0001\u0010%R)\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u000f\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R)\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0011\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R,\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R)\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\r\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R\u001c\u0010É\u0001\u001a\u0005\u0018\u00010È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R'\u0010Í\u0001\u001a\n\u0012\u0005\u0012\u00030Ì\u00010Ë\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u001d\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0006¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u001d\u0010×\u0001\u001a\u00030Ö\u00018\u0006¢\u0006\u0010\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001R'\u0010Û\u0001\u001a\u0002018\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0006\bÛ\u0001\u0010 \u0001\u001a\u0005\bÜ\u0001\u0010s\"\u0005\bÝ\u0001\u0010nR(\u0010e\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\be\u0010\u0095\u0001\u001a\u0006\bÞ\u0001\u0010\u0098\u0001\"\u0005\bß\u0001\u0010gR\"\u0010á\u0001\u001a\u0005\u0018\u00010à\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001R\u001d\u0010æ\u0001\u001a\u00030å\u00018\u0006¢\u0006\u0010\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001R\u001d\u0010ë\u0001\u001a\u00030ê\u00018\u0006¢\u0006\u0010\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001R\u001d\u0010ð\u0001\u001a\u00030ï\u00018\u0006¢\u0006\u0010\n\u0006\bð\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001R6\u0010÷\u0001\u001a\u0019\u0012\u0005\u0012\u00030õ\u0001\u0012\u0007\u0012\u0005\u0018\u00010ö\u0001\u0012\u0004\u0012\u00020\u00130ô\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b÷\u0001\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001R\u001a\u0010þ\u0001\u001a\u0005\u0018\u00010û\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bü\u0001\u0010ý\u0001¨\u0006ÿ\u0001"}, d2 = {"Lcom/blaze/blazesdk/shared/BlazeSDK;", "", "<init>", "()V", "", "apiKey", "externalUserId", "", "cachingSize", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "cachingLevel", "geoLocation", "Lcom/blaze/blazesdk/shared/models/BlazeLayoutDirection;", "forceLayoutDirection", "Lcom/blaze/blazesdk/delegates/BlazeSDKDelegate;", "sdkDelegate", "Lcom/blaze/blazesdk/delegates/BlazePlayerEntryPointDelegate;", "playerEntryPointDelegate", "Lkotlin/Function0;", "", "completionBlock", "Lkotlin/Function1;", "Lcom/blaze/blazesdk/shared/results/BlazeResult$Error;", "errorBlock", "init", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Ljava/lang/String;Lcom/blaze/blazesdk/shared/models/BlazeLayoutDirection;Lcom/blaze/blazesdk/delegates/BlazeSDKDelegate;Lcom/blaze/blazesdk/delegates/BlazePlayerEntryPointDelegate;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler;", "googleCustomNativeAdsHandler", "setGoogleCustomNativeAdsHandler", "(Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler;)V", "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsHandler;", "googleBannerAdHandler", "setGoogleBannerAdsHandler", "(Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsHandler;)V", "Lcom/blaze/blazesdk/ads/ima/BlazeImaHandler;", "imaHandler", "setImaHandler", "(Lcom/blaze/blazesdk/ads/ima/BlazeImaHandler;)V", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "dataSource", "sourceId", "entryContentId", "Lcom/blaze/blazesdk/shared/results/BlazeResult;", "prepareStories", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;", "storyPlayerStyle", "Lcom/blaze/blazesdk/shared/models/BlazeEntryPointTriggerSource;", "triggerSource", "", "shouldOrderContentByReadStatus", "playStories", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;Lcom/blaze/blazesdk/shared/models/BlazeEntryPointTriggerSource;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "storyId", "pageId", "eventId", "playStory", "(Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;Ljava/lang/String;Lcom/blaze/blazesdk/shared/models/BlazeEntryPointTriggerSource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "link", "canHandleUniversalLink", "(Ljava/lang/String;)Z", "handleUniversalLink", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "prepareMoments", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "momentsPlayerStyle", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "playbackConfiguration", "playMoments", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;Lcom/blaze/blazesdk/shared/models/BlazeEntryPointTriggerSource;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "momentId", "playMoment", "(Ljava/lang/String;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;Lcom/blaze/blazesdk/shared/models/BlazeEntryPointTriggerSource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "prepareVideos", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "videosPlayerStyle", "Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration;", "playVideos", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;Lcom/blaze/blazesdk/shared/models/BlazeEntryPointTriggerSource;ZLjava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration;Lkotlin/jvm/functions/Function1;)V", "videoId", "playVideo", "(Ljava/lang/String;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;Lcom/blaze/blazesdk/shared/models/BlazeEntryPointTriggerSource;Ljava/lang/String;Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration;Lkotlin/jvm/functions/Function1;)V", "dismissCurrentPlayer", "pauseCurrentPlayer", "resumeCurrentPlayer", "setDefaultStoryPlayerStyle", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;)V", "getDefaultStoryPlayerStyle", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;", "setDefaultMomentsPlayerStyle", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;)V", "getDefaultMomentsPlayerStyle", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "setDefaultMomentsPlaybackConfiguration", "(Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;)V", "getDefaultMomentsPlaybackConfiguration", "()Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "setDefaultVideosPlayerStyle", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;)V", "getDefaultVideosPlayerStyle", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "preferredLanguage", "setPreferredLanguage", "(Ljava/lang/String;)V", "setDefaultVideosPlaybackConfiguration", "(Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration;)V", "getDefaultVideosPlaybackConfiguration", "()Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration;", "doNotTrackUser", "setDoNotTrack", "(Z)V", "setExternalUserId", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "updateGeoRestriction", "isInitialized", "()Z", "blazeNotificationBody", "handleNotificationValue", "", "payload", "handlePushNotificationPayload", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "canHandlePushNotification", "(Ljava/util/Map;)Z", "dataSourceType", "completion", "appendMomentsToPlayer", "(Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;ZLkotlin/jvm/functions/Function1;)V", "registerBroadcastReceiver$blazesdk_release", "registerBroadcastReceiver", "unregisterBroadcastReceiver$blazesdk_release", "unregisterBroadcastReceiver", "dispatchSDKInitializedEvent", "(Lrq3;)Ljava/lang/Object;", "Lh1m;", "state", "setSdkInitializationState", "(Lh1m;)V", "handleInternalConfigurationsAndReturnApiKey", "(Ljava/lang/String;)Ljava/lang/String;", "getUserActivity", "refreshWidgetAndGetUserData", "getModifiedProposedExternalUserID", "Ljava/util/concurrent/atomic/AtomicReference;", "sdkInitializationState", "Ljava/util/concurrent/atomic/AtomicReference;", "cacheVersion", "I", "DISABLE_UI_INTERACTION_AND_BLOCK_PLAYER_PLAY_PERMISSION", "Ljava/lang/String;", "ENABLE_UI_INTERACTION_AND_ALLOW_PLAYER_PLAY_PERMISSION", "getApiKey$blazesdk_release", "()Ljava/lang/String;", "setApiKey$blazesdk_release", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "getCachingLevel$blazesdk_release", "()Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "setCachingLevel$blazesdk_release", "(Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;)V", "isProd", "Z", "isProd$blazesdk_release", "setProd$blazesdk_release", "doNotTrack", "getDoNotTrack$blazesdk_release", "setDoNotTrack$blazesdk_release", "Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler;", "getGoogleCustomNativeAdsHandler$blazesdk_release", "()Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler;", "setGoogleCustomNativeAdsHandler$blazesdk_release", U3.i.X, "Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsHandler;", "getGoogleBannerAdHandler$blazesdk_release", "()Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerAdsHandler;", "Lcom/blaze/blazesdk/ads/ima/BlazeImaHandler;", "getImaHandler$blazesdk_release", "()Lcom/blaze/blazesdk/ads/ima/BlazeImaHandler;", "setImaHandler$blazesdk_release", "Lcom/blaze/blazesdk/delegates/BlazeSDKDelegate;", "getSdkDelegate$blazesdk_release", "()Lcom/blaze/blazesdk/delegates/BlazeSDKDelegate;", "setSdkDelegate$blazesdk_release", "(Lcom/blaze/blazesdk/delegates/BlazeSDKDelegate;)V", "Lcom/blaze/blazesdk/delegates/BlazePlayerEntryPointDelegate;", "getPlayerEntryPointDelegate$blazesdk_release", "()Lcom/blaze/blazesdk/delegates/BlazePlayerEntryPointDelegate;", "setPlayerEntryPointDelegate$blazesdk_release", "(Lcom/blaze/blazesdk/delegates/BlazePlayerEntryPointDelegate;)V", "Landroid/app/Application;", "application", "Landroid/app/Application;", "getApplication$blazesdk_release", "()Landroid/app/Application;", "setApplication$blazesdk_release", "(Landroid/app/Application;)V", "Lcom/blaze/blazesdk/shared/models/BlazeLayoutDirection;", "getForceLayoutDirection$blazesdk_release", "()Lcom/blaze/blazesdk/shared/models/BlazeLayoutDirection;", "setForceLayoutDirection$blazesdk_release", "(Lcom/blaze/blazesdk/shared/models/BlazeLayoutDirection;)V", "Landroid/content/BroadcastReceiver;", "entryPointBroadcast", "Landroid/content/BroadcastReceiver;", "Lb1d;", "Ly0m;", "dismissPlayerEventFlow", "Lb1d;", "getDismissPlayerEventFlow$blazesdk_release", "()Lb1d;", "Lcom/blaze/blazesdk/hosting_app_context/IBlazeHostingAppContextManager;", "hostingAppContext", "Lcom/blaze/blazesdk/hosting_app_context/IBlazeHostingAppContextManager;", "getHostingAppContext", "()Lcom/blaze/blazesdk/hosting_app_context/IBlazeHostingAppContextManager;", "Lcom/blaze/blazesdk/follow/IBlazeFollowEntitiesManager;", "followEntitiesManager", "Lcom/blaze/blazesdk/follow/IBlazeFollowEntitiesManager;", "getFollowEntitiesManager", "()Lcom/blaze/blazesdk/follow/IBlazeFollowEntitiesManager;", "disableAnalytics", "getDisableAnalytics", "setDisableAnalytics", "getPreferredLanguage$blazesdk_release", "setPreferredLanguage$blazesdk_release", "Ljsl;", "followEntitiesInternal", "Ljsl;", "getFollowEntitiesInternal$blazesdk_release", "()Ljsl;", "Lcom/blaze/blazesdk/cast/BlazeCastingManager;", "castingManager", "Lcom/blaze/blazesdk/cast/BlazeCastingManager;", "getCastingManager", "()Lcom/blaze/blazesdk/cast/BlazeCastingManager;", "Lcom/blaze/blazesdk/shared/BlazeScreens;", "screens", "Lcom/blaze/blazesdk/shared/BlazeScreens;", "getScreens", "()Lcom/blaze/blazesdk/shared/BlazeScreens;", "Lcom/blaze/blazesdk/pip/BlazePiPManager;", "pipManager", "Lcom/blaze/blazesdk/pip/BlazePiPManager;", "getPipManager", "()Lcom/blaze/blazesdk/pip/BlazePiPManager;", "Lkotlin/Function2;", "", "Lcom/blaze/blazesdk/shared/results/g0;", "globalThrowableCatcher", "Lkotlin/jvm/functions/Function2;", "getGlobalThrowableCatcher$blazesdk_release", "()Lkotlin/jvm/functions/Function2;", "Landroid/content/Context;", "getCurrActivityOrApplicationContext$blazesdk_release", "()Landroid/content/Context;", "currActivityOrApplicationContext", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlazeSDK {
    public static final int $stable;

    @NotNull
    public static final String DISABLE_UI_INTERACTION_AND_BLOCK_PLAYER_PLAY_PERMISSION = "disable_ui_interaction_and_block_player_play_permission";

    @NotNull
    public static final String ENABLE_UI_INTERACTION_AND_ALLOW_PLAYER_PLAY_PERMISSION = "enable_ui_interaction_and_allow_player_play_permission";
    public static String apiKey = null;

    @Nullable
    private static Application application = null;
    private static final int cacheVersion = 1;

    @NotNull
    private static final BlazeCastingManager castingManager;

    @Keep
    private static boolean disableAnalytics;
    private static boolean doNotTrack;

    @Nullable
    private static BroadcastReceiver entryPointBroadcast;

    @Nullable
    private static final jsl followEntitiesInternal;

    @NotNull
    private static final IBlazeFollowEntitiesManager followEntitiesManager;

    @Nullable
    private static BlazeLayoutDirection forceLayoutDirection;

    @NotNull
    private static final Function2<Throwable, g0, Unit> globalThrowableCatcher;

    @Nullable
    private static BlazeGAMBannerAdsHandler googleBannerAdHandler;

    @Nullable
    private static BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler;

    @Nullable
    private static BlazeImaHandler imaHandler;

    @NotNull
    private static final BlazePiPManager pipManager;

    @Nullable
    private static BlazePlayerEntryPointDelegate playerEntryPointDelegate;

    @Nullable
    private static String preferredLanguage;

    @NotNull
    private static final BlazeScreens screens;

    @Nullable
    private static BlazeSDKDelegate sdkDelegate;

    @NotNull
    public static final BlazeSDK INSTANCE = new BlazeSDK();

    @NotNull
    private static AtomicReference<h1m> sdkInitializationState = new AtomicReference<>(oam.a);

    @NotNull
    private static BlazeCachingLevel cachingLevel = BlazeCachingLevel.DEFAULT;
    private static boolean isProd = true;

    @NotNull
    private static final b1d dismissPlayerEventFlow = beh.b(0, 0, null, 7);

    @NotNull
    private static final IBlazeHostingAppContextManager hostingAppContext = new BlazeHostingAppContextManager();

    static {
        jsl jslVar = new jsl();
        followEntitiesManager = jslVar;
        followEntitiesInternal = jslVar;
        castingManager = new BlazeCastingManager();
        screens = new BlazeScreens();
        pipManager = new BlazePiPManager();
        globalThrowableCatcher = new js1((byte) 0, 28);
        $stable = 8;
    }

    private BlazeSDK() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void appendMomentsToPlayer$default(BlazeSDK blazeSDK, String str, BlazeDataSourceType blazeDataSourceType, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            function1 = new sx1(20);
        }
        blazeSDK.appendMomentsToPlayer(str, blazeDataSourceType, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appendMomentsToPlayer$lambda$22(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dispatchSDKInitializedEvent(rq3<? super Unit> rq3Var) {
        exl exlVar;
        Object obj;
        int i;
        if (rq3Var instanceof exl) {
            exlVar = (exl) rq3Var;
            int i2 = exlVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                exlVar.t = i2 - Integer.MIN_VALUE;
                obj = exlVar.r;
                lu3 lu3Var = lu3.a;
                i = exlVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    dvl dvlVar = dvl.a;
                    exlVar.t = 1;
                    obj = dvlVar.a(exlVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    spm.postEvent$default(cwm.a, EventActionName.SDK_INIT, EventCategoryType.WIDGET, null, null, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED, null);
                }
                return Unit.a;
            }
        }
        exlVar = new exl(this, rq3Var);
        obj = exlVar.r;
        lu3 lu3Var2 = lu3.a;
        i = exlVar.t;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getModifiedProposedExternalUserID(String externalUserId) {
        if (externalUserId == null || StringsKt.R(externalUserId)) {
            return null;
        }
        return externalUserId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getUserActivity() {
        evl.dispatchOnIO$default(this, null, new e1m(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit globalThrowableCatcher$lambda$27(Throwable th, g0 g0Var) {
        th.getClass();
        if (g0Var == null) {
            BlazeException blazeException = th instanceof BlazeException ? (BlazeException) th : null;
            if (blazeException != null) {
                if (blazeException instanceof BlazeException.a) {
                    g0Var = new y();
                } else if (blazeException instanceof BlazeException.b) {
                    g0Var = new a0();
                } else if (blazeException instanceof otl) {
                    g0Var = new c();
                }
                if (g0Var == null) {
                    g0Var = new a();
                }
            }
            g0Var = null;
            if (g0Var == null) {
            }
        }
        g0Var.f = th;
        j1m.a(g0Var);
        return Unit.a;
    }

    private final String handleInternalConfigurationsAndReturnApiKey(String apiKey2) {
        if (kotlin.text.c.n(apiKey2, "___env___uat", false)) {
            isProd = false;
            return StringsKt.W(apiKey2, "___env___uat");
        }
        isProd = true;
        return apiKey2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleNotificationValue$default(BlazeSDK blazeSDK, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new sx1(7);
        }
        blazeSDK.handleNotificationValue(str, str2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleNotificationValue$lambda$20(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handlePushNotificationPayload$default(BlazeSDK blazeSDK, Map map, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            function1 = new sx1(14);
        }
        blazeSDK.handlePushNotificationPayload(map, str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePushNotificationPayload$lambda$21(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleUniversalLink$default(BlazeSDK blazeSDK, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            function1 = new sx1(13);
        }
        blazeSDK.handleUniversalLink(str, str2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleUniversalLink$lambda$6(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void init$default(BlazeSDK blazeSDK, String str, String str2, Integer num, BlazeCachingLevel blazeCachingLevel, String str3, BlazeLayoutDirection blazeLayoutDirection, BlazeSDKDelegate blazeSDKDelegate, BlazePlayerEntryPointDelegate blazePlayerEntryPointDelegate, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            blazeCachingLevel = BlazeCachingLevel.DEFAULT;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            blazeLayoutDirection = null;
        }
        if ((i & 64) != 0) {
            blazeSDKDelegate = null;
        }
        if ((i & 128) != 0) {
            blazePlayerEntryPointDelegate = null;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            function0 = new vs1(15);
        }
        if ((i & 512) != 0) {
            function1 = new sx1(10);
        }
        blazeSDK.init(str, str2, num, blazeCachingLevel, str3, blazeLayoutDirection, blazeSDKDelegate, blazePlayerEntryPointDelegate, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$1(BlazeResult.Error error) {
        error.getClass();
        return Unit.a;
    }

    public static void playMoment$default(BlazeSDK blazeSDK, String str, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeMomentsPlayerStyle = rsm.b;
        }
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle2 = blazeMomentsPlayerStyle;
        if ((i & 4) != 0) {
            blazeMomentsPlaybackConfiguration = rsm.c;
        }
        BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration2 = blazeMomentsPlaybackConfiguration;
        if ((i & 8) != 0) {
            blazeEntryPointTriggerSource = BlazeEntryPointTriggerSource.ENTRYPOINT;
        }
        BlazeEntryPointTriggerSource blazeEntryPointTriggerSource2 = blazeEntryPointTriggerSource;
        if ((i & 16) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 32) != 0) {
            function1 = new sx1(11);
        }
        blazeSDK.playMoment(str, blazeMomentsPlayerStyle2, blazeMomentsPlaybackConfiguration2, blazeEntryPointTriggerSource2, str3, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playMoment$lambda$9(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    public static void playMoments$default(BlazeSDK blazeSDK, BlazeDataSourceType blazeDataSourceType, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z, String str, String str2, Function1 function1, int i, Object obj) {
        blazeSDK.playMoments(blazeDataSourceType, (i & 2) != 0 ? rsm.b : blazeMomentsPlayerStyle, (i & 4) != 0 ? rsm.c : blazeMomentsPlaybackConfiguration, (i & 8) != 0 ? BlazeEntryPointTriggerSource.ENTRYPOINT : blazeEntryPointTriggerSource, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : str, (i & 64) == 0 ? str2 : null, (i & 128) != 0 ? new sx1(18) : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playMoments$lambda$8(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    public static void playStories$default(BlazeSDK blazeSDK, BlazeDataSourceType blazeDataSourceType, BlazeStoryPlayerStyle blazeStoryPlayerStyle, BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z, String str, String str2, Function1 function1, int i, Object obj) {
        blazeSDK.playStories(blazeDataSourceType, (i & 2) != 0 ? bxm.b : blazeStoryPlayerStyle, (i & 4) != 0 ? BlazeEntryPointTriggerSource.ENTRYPOINT : blazeEntryPointTriggerSource, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str, (i & 32) == 0 ? str2 : null, (i & 64) != 0 ? new sx1(6) : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playStories$lambda$4(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void playStory$default(BlazeSDK blazeSDK, String str, String str2, BlazeStoryPlayerStyle blazeStoryPlayerStyle, String str3, BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, String str4, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            blazeStoryPlayerStyle = bxm.b;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            blazeEntryPointTriggerSource = BlazeEntryPointTriggerSource.ENTRYPOINT;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            function1 = new sx1(21);
        }
        blazeSDK.playStory(str, str2, blazeStoryPlayerStyle, str3, blazeEntryPointTriggerSource, str4, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playStory$lambda$5(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    public static void playVideo$default(BlazeSDK blazeSDK, String str, BlazeVideosPlayerStyle blazeVideosPlayerStyle, BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, String str2, BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeVideosPlayerStyle = n0n.b;
        }
        BlazeVideosPlayerStyle blazeVideosPlayerStyle2 = blazeVideosPlayerStyle;
        if ((i & 4) != 0) {
            blazeEntryPointTriggerSource = BlazeEntryPointTriggerSource.ENTRYPOINT;
        }
        BlazeEntryPointTriggerSource blazeEntryPointTriggerSource2 = blazeEntryPointTriggerSource;
        if ((i & 8) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            blazeVideosPlaybackConfiguration = n0n.c;
        }
        BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration2 = blazeVideosPlaybackConfiguration;
        if ((i & 32) != 0) {
            function1 = new sx1(16);
        }
        blazeSDK.playVideo(str, blazeVideosPlayerStyle2, blazeEntryPointTriggerSource2, str3, blazeVideosPlaybackConfiguration2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playVideo$lambda$12(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    public static void playVideos$default(BlazeSDK blazeSDK, BlazeDataSourceType blazeDataSourceType, BlazeVideosPlayerStyle blazeVideosPlayerStyle, BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z, String str, String str2, BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration, Function1 function1, int i, Object obj) {
        blazeSDK.playVideos(blazeDataSourceType, (i & 2) != 0 ? n0n.b : blazeVideosPlayerStyle, (i & 4) != 0 ? BlazeEntryPointTriggerSource.ENTRYPOINT : blazeEntryPointTriggerSource, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str, (i & 32) == 0 ? str2 : null, (i & 64) != 0 ? n0n.c : blazeVideosPlaybackConfiguration, (i & 128) != 0 ? new sx1(8) : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playVideos$lambda$11(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void prepareMoments$default(BlazeSDK blazeSDK, BlazeDataSourceType blazeDataSourceType, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            function1 = new sx1(15);
        }
        blazeSDK.prepareMoments(blazeDataSourceType, str, str2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareMoments$lambda$7(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void prepareStories$default(BlazeSDK blazeSDK, BlazeDataSourceType blazeDataSourceType, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            function1 = new sx1(19);
        }
        blazeSDK.prepareStories(blazeDataSourceType, str, str2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareStories$lambda$3(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void prepareVideos$default(BlazeSDK blazeSDK, BlazeDataSourceType blazeDataSourceType, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            function1 = new sx1(12);
        }
        blazeSDK.prepareVideos(blazeDataSourceType, str, str2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareVideos$lambda$10(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshWidgetAndGetUserData() {
        try {
            evl.dispatchOnIO$default(this, null, new onm(null), 1, null);
        } catch (Throwable th) {
            globalThrowableCatcher.invoke(th, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setExternalUserId$default(BlazeSDK blazeSDK, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new sx1(9);
        }
        blazeSDK.setExternalUserId(str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setExternalUserId$lambda$18(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSdkInitializationState(h1m state) {
        sdkInitializationState.set(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateGeoRestriction$default(BlazeSDK blazeSDK, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new sx1(17);
        }
        blazeSDK.updateGeoRestriction(str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGeoRestriction$lambda$19(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    @Keep
    public final void appendMomentsToPlayer(@NotNull String sourceId, @NotNull BlazeDataSourceType dataSourceType, boolean shouldOrderContentByReadStatus, @NotNull Function1<? super BlazeResult<Unit>, Unit> completion) {
        sourceId.getClass();
        dataSourceType.getClass();
        completion.getClass();
        evl.dispatchOnMain$default(this, null, new ntl(sourceId, dataSourceType, shouldOrderContentByReadStatus, completion, null), 1, null);
    }

    @Keep
    public final boolean canHandlePushNotification(@NotNull Map<String, String> payload) {
        payload.getClass();
        return payload.containsKey("WscIasData");
    }

    @Keep
    public final boolean canHandleUniversalLink(@NotNull String link) {
        String str;
        q5m q5mVar;
        link.getClass();
        tul tulVar = jdm.d;
        if ((tulVar == null || (q5mVar = tulVar.d) == null || (str = q5mVar.c) == null) && (str = jdm.e) == null) {
            str = "mvp.fan";
        }
        return StringsKt.J(link, str, false);
    }

    @Keep
    public final void dismissCurrentPlayer() {
        bxm bxmVar = bxm.a;
        BlazeSDK blazeSDK = INSTANCE;
        evl.dispatchOnMain$default(blazeSDK, null, new bum(null), 1, null);
        rsm rsmVar = rsm.a;
        evl.dispatchOnMain$default(blazeSDK, null, new pnm(null), 1, null);
        n0n n0nVar = n0n.a;
        evl.dispatchOnMain$default(blazeSDK, null, new sxm(null), 1, null);
    }

    @NotNull
    public final String getApiKey$blazesdk_release() {
        String str = apiKey;
        if (str != null) {
            return str;
        }
        Intrinsics.i("apiKey");
        throw null;
    }

    @Nullable
    public final Application getApplication$blazesdk_release() {
        return application;
    }

    @NotNull
    public final BlazeCachingLevel getCachingLevel$blazesdk_release() {
        return cachingLevel;
    }

    @NotNull
    public final BlazeCastingManager getCastingManager() {
        return castingManager;
    }

    @Nullable
    public final Context getCurrActivityOrApplicationContext$blazesdk_release() {
        Activity a = iwl.a();
        return a != null ? a : application;
    }

    @Keep
    @NotNull
    public final BlazeMomentsPlaybackConfiguration getDefaultMomentsPlaybackConfiguration() {
        return BlazeMomentsPlaybackConfiguration.copy$default(rsm.c, null, 1, null);
    }

    @Keep
    @NotNull
    public final BlazeMomentsPlayerStyle getDefaultMomentsPlayerStyle() {
        return (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(rsm.b);
    }

    @Keep
    @NotNull
    public final BlazeStoryPlayerStyle getDefaultStoryPlayerStyle() {
        return (BlazeStoryPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(bxm.b);
    }

    @Keep
    @NotNull
    public final BlazeVideosPlaybackConfiguration getDefaultVideosPlaybackConfiguration() {
        return BlazeVideosPlaybackConfiguration.copy$default(n0n.c, false, false, null, 7, null);
    }

    @Keep
    @NotNull
    public final BlazeVideosPlayerStyle getDefaultVideosPlayerStyle() {
        return (BlazeVideosPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(n0n.b);
    }

    public final boolean getDisableAnalytics() {
        return disableAnalytics;
    }

    @NotNull
    public final b1d getDismissPlayerEventFlow$blazesdk_release() {
        return dismissPlayerEventFlow;
    }

    public final boolean getDoNotTrack$blazesdk_release() {
        return doNotTrack;
    }

    @Nullable
    public final jsl getFollowEntitiesInternal$blazesdk_release() {
        return followEntitiesInternal;
    }

    @NotNull
    public final IBlazeFollowEntitiesManager getFollowEntitiesManager() {
        return followEntitiesManager;
    }

    @Nullable
    public final BlazeLayoutDirection getForceLayoutDirection$blazesdk_release() {
        return forceLayoutDirection;
    }

    @NotNull
    public final Function2<Throwable, g0, Unit> getGlobalThrowableCatcher$blazesdk_release() {
        return globalThrowableCatcher;
    }

    @Nullable
    public final BlazeGAMBannerAdsHandler getGoogleBannerAdHandler$blazesdk_release() {
        return googleBannerAdHandler;
    }

    @Nullable
    public final BlazeGoogleCustomNativeAdsHandler getGoogleCustomNativeAdsHandler$blazesdk_release() {
        return googleCustomNativeAdsHandler;
    }

    @NotNull
    public final IBlazeHostingAppContextManager getHostingAppContext() {
        return hostingAppContext;
    }

    @Nullable
    public final BlazeImaHandler getImaHandler$blazesdk_release() {
        return imaHandler;
    }

    @NotNull
    public final BlazePiPManager getPipManager() {
        return pipManager;
    }

    @Nullable
    public final BlazePlayerEntryPointDelegate getPlayerEntryPointDelegate$blazesdk_release() {
        return playerEntryPointDelegate;
    }

    @Nullable
    public final String getPreferredLanguage$blazesdk_release() {
        return preferredLanguage;
    }

    @NotNull
    public final BlazeScreens getScreens() {
        return screens;
    }

    @Nullable
    public final BlazeSDKDelegate getSdkDelegate$blazesdk_release() {
        return sdkDelegate;
    }

    @Keep
    public final void handleNotificationValue(@NotNull String blazeNotificationBody, @Nullable String sourceId, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        blazeNotificationBody.getClass();
        completionBlock.getClass();
        evl.dispatchOnIO$default(this, null, new nam(blazeNotificationBody, sourceId, completionBlock, null), 1, null);
    }

    @Keep
    public final void handlePushNotificationPayload(@NotNull Map<String, String> payload, @Nullable String sourceId, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        payload.getClass();
        completionBlock.getClass();
        evl.dispatchOnIO$default(this, null, new bdm(payload, sourceId, completionBlock, null), 1, null);
    }

    @Keep
    public final void handleUniversalLink(@NotNull String link, @Nullable String sourceId, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        link.getClass();
        completionBlock.getClass();
        try {
            evl.dispatchOnIO$default(this, null, new kgm(link, sourceId, completionBlock, null), 1, null);
        } catch (Throwable th) {
            globalThrowableCatcher.invoke(th, null);
            evl.dispatchOnMain$default(this, null, new mim(completionBlock, null), 1, null);
        }
    }

    @Keep
    public final void init(@NotNull String apiKey2, @Nullable String externalUserId, @Nullable Integer cachingSize, @NotNull BlazeCachingLevel cachingLevel2, @Nullable String geoLocation, @Nullable BlazeLayoutDirection forceLayoutDirection2, @Nullable BlazeSDKDelegate sdkDelegate2, @Nullable BlazePlayerEntryPointDelegate playerEntryPointDelegate2, @NotNull Function0<Unit> completionBlock, @NotNull Function1<? super BlazeResult.Error, Unit> errorBlock) {
        Function1<? super BlazeResult.Error, Unit> function1;
        Throwable th;
        apiKey2.getClass();
        cachingLevel2.getClass();
        completionBlock.getClass();
        errorBlock.getClass();
        try {
            try {
                if (sdkInitializationState.get().a()) {
                    j1m j1mVar = j1m.a;
                    b bVar = new b();
                    j1m.a(bVar);
                    errorBlock.invoke(bVar.d());
                    return;
                }
                setSdkInitializationState(x7m.a);
                Application application2 = application;
                if (application2 == null) {
                    j1m j1mVar2 = j1m.a;
                    c cVar = new c();
                    j1m.a(cVar);
                    setSdkInitializationState(new h1m.a(cVar.d()));
                    errorBlock.invoke(cVar.d());
                    return;
                }
                if (StringsKt.R(apiKey2)) {
                    j1m j1mVar3 = j1m.a;
                    d dVar = new d();
                    j1m.a(dVar);
                    setSdkInitializationState(new h1m.a(dVar.d()));
                    errorBlock.invoke(dVar.d());
                    return;
                }
                setApiKey$blazesdk_release(handleInternalConfigurationsAndReturnApiKey(apiKey2));
                cachingLevel = cachingLevel2;
                forceLayoutDirection = forceLayoutDirection2;
                sdkDelegate = sdkDelegate2;
                playerEntryPointDelegate = playerEntryPointDelegate2;
                function1 = errorBlock;
                try {
                    evl.dispatchOnIO$default(this, null, new amm(externalUserId, application2, cachingSize, geoLocation, function1, completionBlock, null), 1, null);
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    globalThrowableCatcher.invoke(th, null);
                    g gVar = new g();
                    gVar.f = th;
                    setSdkInitializationState(new h1m.a(gVar.d()));
                    function1.invoke(gVar.d());
                }
            } catch (Throwable th3) {
                th = th3;
                function1 = errorBlock;
                globalThrowableCatcher.invoke(th, null);
                g gVar2 = new g();
                gVar2.f = th;
                setSdkInitializationState(new h1m.a(gVar2.d()));
                function1.invoke(gVar2.d());
            }
        } catch (Throwable th4) {
            th = th4;
            function1 = errorBlock;
        }
    }

    @Keep
    public final boolean isInitialized() {
        return Intrinsics.c(sdkInitializationState.get(), u4m.a);
    }

    public final boolean isProd$blazesdk_release() {
        return isProd;
    }

    @Keep
    public final void pauseCurrentPlayer() {
        try {
            Application application2 = application;
            if (application2 != null) {
                LocalBroadcastManager.getInstance(application2).sendBroadcast(new Intent(DISABLE_UI_INTERACTION_AND_BLOCK_PLAYER_PLAY_PERMISSION));
            }
        } catch (Throwable th) {
            globalThrowableCatcher.invoke(th, null);
        }
    }

    @Keep
    public final void playMoment(@NotNull String str, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource) {
        str.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsPlaybackConfiguration.getClass();
        blazeEntryPointTriggerSource.getClass();
        playMoment$default(this, str, blazeMomentsPlayerStyle, blazeMomentsPlaybackConfiguration, blazeEntryPointTriggerSource, null, null, 48, null);
    }

    @Keep
    public final void playMoments(@NotNull BlazeDataSourceType dataSource, @NotNull BlazeMomentsPlayerStyle momentsPlayerStyle, @NotNull BlazeMomentsPlaybackConfiguration playbackConfiguration, @NotNull BlazeEntryPointTriggerSource triggerSource, boolean shouldOrderContentByReadStatus, @Nullable String sourceId, @Nullable String entryContentId, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        dataSource.getClass();
        momentsPlayerStyle.getClass();
        playbackConfiguration.getClass();
        triggerSource.getClass();
        completionBlock.getClass();
        rsm rsmVar = rsm.a;
        rsm.a(dataSource, momentsPlayerStyle, playbackConfiguration, gxl.a(triggerSource), shouldOrderContentByReadStatus, sourceId, entryContentId, null, completionBlock);
    }

    @Keep
    public final void playStories(@NotNull BlazeDataSourceType dataSource, @NotNull BlazeStoryPlayerStyle storyPlayerStyle, @NotNull BlazeEntryPointTriggerSource triggerSource, boolean shouldOrderContentByReadStatus, @Nullable String sourceId, @Nullable String entryContentId, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        dataSource.getClass();
        storyPlayerStyle.getClass();
        triggerSource.getClass();
        completionBlock.getClass();
        bxm bxmVar = bxm.a;
        bxm.a(dataSource, storyPlayerStyle, gxl.a(triggerSource), shouldOrderContentByReadStatus, sourceId, entryContentId, null, null, completionBlock);
    }

    @Keep
    public final void playStory(@NotNull String str, @Nullable String str2, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @Nullable String str3, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, @Nullable String str4) {
        str.getClass();
        blazeStoryPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        playStory$default(this, str, str2, blazeStoryPlayerStyle, str3, blazeEntryPointTriggerSource, str4, null, 64, null);
    }

    @Keep
    public final void playVideo(@NotNull String str, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, @Nullable String str2, @NotNull BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration) {
        str.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        blazeVideosPlaybackConfiguration.getClass();
        playVideo$default(this, str, blazeVideosPlayerStyle, blazeEntryPointTriggerSource, str2, blazeVideosPlaybackConfiguration, null, 32, null);
    }

    @Keep
    public final void playVideos(@NotNull BlazeDataSourceType dataSource, @NotNull BlazeVideosPlayerStyle videosPlayerStyle, @NotNull BlazeEntryPointTriggerSource triggerSource, boolean shouldOrderContentByReadStatus, @Nullable String sourceId, @Nullable String entryContentId, @NotNull BlazeVideosPlaybackConfiguration playbackConfiguration, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        dataSource.getClass();
        videosPlayerStyle.getClass();
        triggerSource.getClass();
        playbackConfiguration.getClass();
        completionBlock.getClass();
        n0n n0nVar = n0n.a;
        n0n.a(dataSource, videosPlayerStyle, gxl.a(triggerSource), shouldOrderContentByReadStatus, sourceId, entryContentId, null, playbackConfiguration, completionBlock);
    }

    @Keep
    public final void prepareMoments(@NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeDataSourceType.getClass();
        prepareMoments$default(this, blazeDataSourceType, null, null, null, 14, null);
    }

    @Keep
    public final void prepareStories(@NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeDataSourceType.getClass();
        prepareStories$default(this, blazeDataSourceType, null, null, null, 14, null);
    }

    @Keep
    public final void prepareVideos(@NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeDataSourceType.getClass();
        prepareVideos$default(this, blazeDataSourceType, null, null, null, 14, null);
    }

    public final void registerBroadcastReceiver$blazesdk_release() {
        unregisterBroadcastReceiver$blazesdk_release();
        Application application2 = application;
        if (application2 != null) {
            BroadcastReceiver createPlayerBroadcastReceiver$blazesdk_release$default = gzk.createPlayerBroadcastReceiver$blazesdk_release$default(gzk.a, "entry_points_broadcast_id", playerEntryPointDelegate, ErrorDomain.ENTRY_POINT, null, 8, null);
            LocalBroadcastManager.getInstance(application2).registerReceiver(createPlayerBroadcastReceiver$blazesdk_release$default, new IntentFilter("player_broadcast"));
            entryPointBroadcast = createPlayerBroadcastReceiver$blazesdk_release$default;
        }
    }

    @Keep
    public final void resumeCurrentPlayer() {
        try {
            Application application2 = application;
            if (application2 != null) {
                LocalBroadcastManager.getInstance(application2).sendBroadcast(new Intent(ENABLE_UI_INTERACTION_AND_ALLOW_PLAYER_PLAY_PERMISSION));
            }
        } catch (Throwable th) {
            globalThrowableCatcher.invoke(th, null);
        }
    }

    public final void setApiKey$blazesdk_release(@NotNull String str) {
        str.getClass();
        apiKey = str;
    }

    public final void setApplication$blazesdk_release(@Nullable Application application2) {
        application = application2;
    }

    public final void setCachingLevel$blazesdk_release(@NotNull BlazeCachingLevel blazeCachingLevel) {
        blazeCachingLevel.getClass();
        cachingLevel = blazeCachingLevel;
    }

    @Keep
    public final void setDefaultMomentsPlaybackConfiguration(@NotNull BlazeMomentsPlaybackConfiguration playbackConfiguration) {
        playbackConfiguration.getClass();
        rsm rsmVar = rsm.a;
        BlazeMomentsPlaybackConfiguration copy$default = BlazeMomentsPlaybackConfiguration.copy$default(playbackConfiguration, null, 1, null);
        copy$default.getClass();
        rsm.c = copy$default;
    }

    @Keep
    public final void setDefaultMomentsPlayerStyle(@NotNull BlazeMomentsPlayerStyle momentsPlayerStyle) {
        momentsPlayerStyle.getClass();
        rsm rsmVar = rsm.a;
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(momentsPlayerStyle);
        blazeMomentsPlayerStyle.getClass();
        rsm.b = blazeMomentsPlayerStyle;
    }

    @Keep
    public final void setDefaultStoryPlayerStyle(@NotNull BlazeStoryPlayerStyle storyPlayerStyle) {
        storyPlayerStyle.getClass();
        bxm bxmVar = bxm.a;
        BlazeStoryPlayerStyle blazeStoryPlayerStyle = (BlazeStoryPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(storyPlayerStyle);
        blazeStoryPlayerStyle.getClass();
        bxm.b = blazeStoryPlayerStyle;
    }

    @Keep
    public final void setDefaultVideosPlaybackConfiguration(@NotNull BlazeVideosPlaybackConfiguration playbackConfiguration) {
        playbackConfiguration.getClass();
        n0n n0nVar = n0n.a;
        BlazeVideosPlaybackConfiguration copy$default = BlazeVideosPlaybackConfiguration.copy$default(playbackConfiguration, false, false, null, 7, null);
        copy$default.getClass();
        n0n.c = copy$default;
    }

    @Keep
    public final void setDefaultVideosPlayerStyle(@NotNull BlazeVideosPlayerStyle videosPlayerStyle) {
        videosPlayerStyle.getClass();
        n0n n0nVar = n0n.a;
        BlazeVideosPlayerStyle blazeVideosPlayerStyle = (BlazeVideosPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(videosPlayerStyle);
        blazeVideosPlayerStyle.getClass();
        n0n.b = blazeVideosPlayerStyle;
    }

    public final void setDisableAnalytics(boolean z) {
        disableAnalytics = z;
    }

    @Keep
    public final void setDoNotTrack(boolean doNotTrackUser) {
        doNotTrack = doNotTrackUser;
    }

    public final void setDoNotTrack$blazesdk_release(boolean z) {
        doNotTrack = z;
    }

    @Keep
    public final void setExternalUserId(@Nullable String externalUserId, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        completionBlock.getClass();
        evl.dispatchOnIO$default(this, null, new iqm(externalUserId, completionBlock, null), 1, null);
    }

    public final void setForceLayoutDirection$blazesdk_release(@Nullable BlazeLayoutDirection blazeLayoutDirection) {
        forceLayoutDirection = blazeLayoutDirection;
    }

    @Keep
    public final void setGoogleBannerAdsHandler(@Nullable BlazeGAMBannerAdsHandler googleBannerAdHandler2) {
        googleBannerAdHandler = googleBannerAdHandler2;
    }

    @Keep
    public final void setGoogleCustomNativeAdsHandler(@Nullable BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler2) {
        googleCustomNativeAdsHandler = googleCustomNativeAdsHandler2;
    }

    public final void setGoogleCustomNativeAdsHandler$blazesdk_release(@Nullable BlazeGoogleCustomNativeAdsHandler blazeGoogleCustomNativeAdsHandler) {
        googleCustomNativeAdsHandler = blazeGoogleCustomNativeAdsHandler;
    }

    @Keep
    public final void setImaHandler(@Nullable BlazeImaHandler imaHandler2) {
        imaHandler = imaHandler2;
    }

    public final void setImaHandler$blazesdk_release(@Nullable BlazeImaHandler blazeImaHandler) {
        imaHandler = blazeImaHandler;
    }

    public final void setPlayerEntryPointDelegate$blazesdk_release(@Nullable BlazePlayerEntryPointDelegate blazePlayerEntryPointDelegate) {
        playerEntryPointDelegate = blazePlayerEntryPointDelegate;
    }

    @Keep
    public final void setPreferredLanguage(@Nullable String preferredLanguage2) {
        String str;
        if (preferredLanguage2 == null || (str = StringsKt.l0(preferredLanguage2).toString()) == null || str.length() <= 0) {
            str = null;
        }
        preferredLanguage = str;
    }

    public final void setPreferredLanguage$blazesdk_release(@Nullable String str) {
        preferredLanguage = str;
    }

    public final void setProd$blazesdk_release(boolean z) {
        isProd = z;
    }

    public final void setSdkDelegate$blazesdk_release(@Nullable BlazeSDKDelegate blazeSDKDelegate) {
        sdkDelegate = blazeSDKDelegate;
    }

    public final void unregisterBroadcastReceiver$blazesdk_release() {
        BroadcastReceiver broadcastReceiver;
        Application application2 = application;
        if (application2 == null || (broadcastReceiver = entryPointBroadcast) == null) {
            return;
        }
        LocalBroadcastManager.getInstance(application2).unregisterReceiver(broadcastReceiver);
    }

    @Keep
    public final void updateGeoRestriction(@Nullable String geoLocation, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        Object error;
        completionBlock.getClass();
        gfm k = wba.k(geoLocation);
        if (k instanceof ihm) {
            error = new BlazeResult.Success(Unit.a);
        } else if (!(k instanceof g0)) {
            zzl.b();
            return;
        } else {
            g0 g0Var = (g0) k;
            error = new BlazeResult.Error(null, g0Var.b, g0Var.c, g0Var.d, null, null, 17, null);
        }
        completionBlock.invoke(error);
    }

    @Keep
    public final void setExternalUserId(@Nullable String str) {
        setExternalUserId$default(this, str, null, 2, null);
    }

    @Keep
    public final void prepareMoments(@NotNull BlazeDataSourceType blazeDataSourceType, @Nullable String str) {
        blazeDataSourceType.getClass();
        prepareMoments$default(this, blazeDataSourceType, str, null, null, 12, null);
    }

    @Keep
    public final void prepareStories(@NotNull BlazeDataSourceType blazeDataSourceType, @Nullable String str) {
        blazeDataSourceType.getClass();
        prepareStories$default(this, blazeDataSourceType, str, null, null, 12, null);
    }

    @Keep
    public final void prepareVideos(@NotNull BlazeDataSourceType blazeDataSourceType, @Nullable String str) {
        blazeDataSourceType.getClass();
        prepareVideos$default(this, blazeDataSourceType, str, null, null, 12, null);
    }

    @Keep
    public final void prepareMoments(@NotNull BlazeDataSourceType blazeDataSourceType, @Nullable String str, @Nullable String str2) {
        blazeDataSourceType.getClass();
        prepareMoments$default(this, blazeDataSourceType, str, str2, null, 8, null);
    }

    @Keep
    public final void prepareStories(@NotNull BlazeDataSourceType blazeDataSourceType, @Nullable String str, @Nullable String str2) {
        blazeDataSourceType.getClass();
        prepareStories$default(this, blazeDataSourceType, str, str2, null, 8, null);
    }

    @Keep
    public final void prepareVideos(@NotNull BlazeDataSourceType blazeDataSourceType, @Nullable String str, @Nullable String str2) {
        blazeDataSourceType.getClass();
        prepareVideos$default(this, blazeDataSourceType, str, str2, null, 8, null);
    }

    @Keep
    public final void handleNotificationValue(@NotNull String str, @Nullable String str2) {
        str.getClass();
        handleNotificationValue$default(this, str, str2, null, 4, null);
    }

    @Keep
    public final void handlePushNotificationPayload(@NotNull Map<String, String> map, @Nullable String str) {
        map.getClass();
        handlePushNotificationPayload$default(this, map, str, null, 4, null);
    }

    @Keep
    public final void prepareMoments(@NotNull BlazeDataSourceType dataSource, @Nullable String sourceId, @Nullable String entryContentId, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        dataSource.getClass();
        completionBlock.getClass();
        rsm.b(dataSource, sourceId, entryContentId, completionBlock);
    }

    @Keep
    public final void prepareStories(@NotNull BlazeDataSourceType dataSource, @Nullable String sourceId, @Nullable String entryContentId, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        dataSource.getClass();
        completionBlock.getClass();
        bxm.b(dataSource, sourceId, entryContentId, completionBlock);
    }

    @Keep
    public final void prepareVideos(@NotNull BlazeDataSourceType dataSource, @Nullable String sourceId, @Nullable String entryContentId, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        dataSource.getClass();
        completionBlock.getClass();
        n0n.b(dataSource, sourceId, entryContentId, completionBlock);
    }

    @Keep
    public final void handleNotificationValue(@NotNull String str) {
        str.getClass();
        handleNotificationValue$default(this, str, null, null, 6, null);
    }

    @Keep
    public final void handlePushNotificationPayload(@NotNull Map<String, String> map) {
        map.getClass();
        handlePushNotificationPayload$default(this, map, null, null, 6, null);
    }

    @Keep
    public final void appendMomentsToPlayer(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, boolean z) {
        str.getClass();
        blazeDataSourceType.getClass();
        appendMomentsToPlayer$default(this, str, blazeDataSourceType, z, null, 8, null);
    }

    @Keep
    public final void playStory(@NotNull String str, @Nullable String str2) {
        str.getClass();
        playStory$default(this, str, str2, null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
    }

    @Keep
    public final void appendMomentsToPlayer(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType) {
        str.getClass();
        blazeDataSourceType.getClass();
        appendMomentsToPlayer$default(this, str, blazeDataSourceType, false, null, 12, null);
    }

    @Keep
    public final void playMoment(@NotNull String str, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle) {
        str.getClass();
        blazeMomentsPlayerStyle.getClass();
        playMoment$default(this, str, blazeMomentsPlayerStyle, null, null, null, null, 60, null);
    }

    @Keep
    public final void playStory(@NotNull String str, @Nullable String str2, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle) {
        str.getClass();
        blazeStoryPlayerStyle.getClass();
        playStory$default(this, str, str2, blazeStoryPlayerStyle, null, null, null, null, 120, null);
    }

    @Keep
    public final void playVideo(@NotNull String str, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle) {
        str.getClass();
        blazeVideosPlayerStyle.getClass();
        playVideo$default(this, str, blazeVideosPlayerStyle, null, null, null, null, 60, null);
    }

    @Keep
    public final void playMoment(@NotNull String str, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        str.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsPlaybackConfiguration.getClass();
        playMoment$default(this, str, blazeMomentsPlayerStyle, blazeMomentsPlaybackConfiguration, null, null, null, 56, null);
    }

    @Keep
    public final void playStory(@NotNull String str, @Nullable String str2, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @Nullable String str3) {
        str.getClass();
        blazeStoryPlayerStyle.getClass();
        playStory$default(this, str, str2, blazeStoryPlayerStyle, str3, null, null, null, 112, null);
    }

    @Keep
    public final void playVideo(@NotNull String str, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource) {
        str.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        playVideo$default(this, str, blazeVideosPlayerStyle, blazeEntryPointTriggerSource, null, null, null, 56, null);
    }

    @Keep
    public final void playMoment(@NotNull String str) {
        str.getClass();
        playMoment$default(this, str, null, null, null, null, null, 62, null);
    }

    @Keep
    public final void playStory(@NotNull String str, @Nullable String str2, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @Nullable String str3, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource) {
        str.getClass();
        blazeStoryPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        playStory$default(this, str, str2, blazeStoryPlayerStyle, str3, blazeEntryPointTriggerSource, null, null, 96, null);
    }

    @Keep
    public final void playVideo(@NotNull String str, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, @Nullable String str2) {
        str.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        playVideo$default(this, str, blazeVideosPlayerStyle, blazeEntryPointTriggerSource, str2, null, null, 48, null);
    }

    @Keep
    public final void playMoment(@NotNull String str, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, @Nullable String str2) {
        str.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsPlaybackConfiguration.getClass();
        blazeEntryPointTriggerSource.getClass();
        playMoment$default(this, str, blazeMomentsPlayerStyle, blazeMomentsPlaybackConfiguration, blazeEntryPointTriggerSource, str2, null, 32, null);
    }

    @Keep
    public final void playStory(@NotNull String str) {
        str.getClass();
        playStory$default(this, str, null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
    }

    @Keep
    public final void playVideo(@NotNull String str) {
        str.getClass();
        playVideo$default(this, str, null, null, null, null, null, 62, null);
    }

    @Keep
    public final void playMoment(@NotNull String momentId, @NotNull BlazeMomentsPlayerStyle momentsPlayerStyle, @NotNull BlazeMomentsPlaybackConfiguration playbackConfiguration, @NotNull BlazeEntryPointTriggerSource triggerSource, @Nullable String sourceId, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        momentId.getClass();
        momentsPlayerStyle.getClass();
        playbackConfiguration.getClass();
        triggerSource.getClass();
        completionBlock.getClass();
        rsm.a.c(momentId, momentsPlayerStyle, playbackConfiguration, gxl.a(triggerSource), sourceId, completionBlock);
    }

    @Keep
    public final void playStory(@NotNull String storyId, @Nullable String pageId, @NotNull BlazeStoryPlayerStyle storyPlayerStyle, @Nullable String eventId, @NotNull BlazeEntryPointTriggerSource triggerSource, @Nullable String sourceId, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        storyId.getClass();
        storyPlayerStyle.getClass();
        triggerSource.getClass();
        completionBlock.getClass();
        bxm.a.c(storyId, pageId, storyPlayerStyle, eventId, gxl.a(triggerSource), sourceId, completionBlock);
    }

    @Keep
    public final void playVideo(@NotNull String videoId, @NotNull BlazeVideosPlayerStyle videosPlayerStyle, @NotNull BlazeEntryPointTriggerSource triggerSource, @Nullable String sourceId, @NotNull BlazeVideosPlaybackConfiguration playbackConfiguration, @NotNull Function1<? super BlazeResult<Unit>, Unit> completionBlock) {
        videoId.getClass();
        videosPlayerStyle.getClass();
        triggerSource.getClass();
        playbackConfiguration.getClass();
        completionBlock.getClass();
        n0n.a.c(videoId, videosPlayerStyle, gxl.a(triggerSource), sourceId, playbackConfiguration, completionBlock);
    }

    @Keep
    public final void playStories(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle) {
        blazeDataSourceType.getClass();
        blazeStoryPlayerStyle.getClass();
        playStories$default(this, blazeDataSourceType, blazeStoryPlayerStyle, null, false, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
    }

    @Keep
    public final void handleUniversalLink(@NotNull String str, @Nullable String str2) {
        str.getClass();
        handleUniversalLink$default(this, str, str2, null, 4, null);
    }

    @Keep
    public final void playStories(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource) {
        blazeDataSourceType.getClass();
        blazeStoryPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        playStories$default(this, blazeDataSourceType, blazeStoryPlayerStyle, blazeEntryPointTriggerSource, false, null, null, null, 120, null);
    }

    @Keep
    public final void handleUniversalLink(@NotNull String str) {
        str.getClass();
        handleUniversalLink$default(this, str, null, null, 6, null);
    }

    @Keep
    public final void playStories(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z) {
        blazeDataSourceType.getClass();
        blazeStoryPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        playStories$default(this, blazeDataSourceType, blazeStoryPlayerStyle, blazeEntryPointTriggerSource, z, null, null, null, 112, null);
    }

    @Keep
    public final void playStories(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z, @Nullable String str) {
        blazeDataSourceType.getClass();
        blazeStoryPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        playStories$default(this, blazeDataSourceType, blazeStoryPlayerStyle, blazeEntryPointTriggerSource, z, str, null, null, 96, null);
    }

    @Keep
    public final void playMoments(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle) {
        blazeDataSourceType.getClass();
        blazeMomentsPlayerStyle.getClass();
        playMoments$default(this, blazeDataSourceType, blazeMomentsPlayerStyle, null, null, false, null, null, null, 252, null);
    }

    @Keep
    public final void playStories(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z, @Nullable String str, @Nullable String str2) {
        blazeDataSourceType.getClass();
        blazeStoryPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        playStories$default(this, blazeDataSourceType, blazeStoryPlayerStyle, blazeEntryPointTriggerSource, z, str, str2, null, 64, null);
    }

    @Keep
    public final void playVideos(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle) {
        blazeDataSourceType.getClass();
        blazeVideosPlayerStyle.getClass();
        playVideos$default(this, blazeDataSourceType, blazeVideosPlayerStyle, null, false, null, null, null, null, 252, null);
    }

    @Keep
    public final void playMoments(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        blazeDataSourceType.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsPlaybackConfiguration.getClass();
        playMoments$default(this, blazeDataSourceType, blazeMomentsPlayerStyle, blazeMomentsPlaybackConfiguration, null, false, null, null, null, 248, null);
    }

    @Keep
    public final void playStories(@NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeDataSourceType.getClass();
        playStories$default(this, blazeDataSourceType, null, null, false, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
    }

    @Keep
    public final void playVideos(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource) {
        blazeDataSourceType.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        playVideos$default(this, blazeDataSourceType, blazeVideosPlayerStyle, blazeEntryPointTriggerSource, false, null, null, null, null, 248, null);
    }

    @Keep
    public final void playMoments(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource) {
        blazeDataSourceType.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsPlaybackConfiguration.getClass();
        blazeEntryPointTriggerSource.getClass();
        playMoments$default(this, blazeDataSourceType, blazeMomentsPlayerStyle, blazeMomentsPlaybackConfiguration, blazeEntryPointTriggerSource, false, null, null, null, 240, null);
    }

    @Keep
    public final void playVideos(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z) {
        blazeDataSourceType.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        playVideos$default(this, blazeDataSourceType, blazeVideosPlayerStyle, blazeEntryPointTriggerSource, z, null, null, null, null, 240, null);
    }

    @Keep
    public final void playMoments(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z) {
        blazeDataSourceType.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsPlaybackConfiguration.getClass();
        blazeEntryPointTriggerSource.getClass();
        playMoments$default(this, blazeDataSourceType, blazeMomentsPlayerStyle, blazeMomentsPlaybackConfiguration, blazeEntryPointTriggerSource, z, null, null, null, 224, null);
    }

    @Keep
    public final void playVideos(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z, @Nullable String str) {
        blazeDataSourceType.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        playVideos$default(this, blazeDataSourceType, blazeVideosPlayerStyle, blazeEntryPointTriggerSource, z, str, null, null, null, 224, null);
    }

    @Keep
    public final void playMoments(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z, @Nullable String str) {
        blazeDataSourceType.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsPlaybackConfiguration.getClass();
        blazeEntryPointTriggerSource.getClass();
        playMoments$default(this, blazeDataSourceType, blazeMomentsPlayerStyle, blazeMomentsPlaybackConfiguration, blazeEntryPointTriggerSource, z, str, null, null, PsExtractor.AUDIO_STREAM, null);
    }

    @Keep
    public final void playVideos(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z, @Nullable String str, @Nullable String str2) {
        blazeDataSourceType.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        playVideos$default(this, blazeDataSourceType, blazeVideosPlayerStyle, blazeEntryPointTriggerSource, z, str, str2, null, null, PsExtractor.AUDIO_STREAM, null);
    }

    @Keep
    public final void playMoments(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z, @Nullable String str, @Nullable String str2) {
        blazeDataSourceType.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsPlaybackConfiguration.getClass();
        blazeEntryPointTriggerSource.getClass();
        playMoments$default(this, blazeDataSourceType, blazeMomentsPlayerStyle, blazeMomentsPlaybackConfiguration, blazeEntryPointTriggerSource, z, str, str2, null, 128, null);
    }

    @Keep
    public final void playVideos(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeEntryPointTriggerSource blazeEntryPointTriggerSource, boolean z, @Nullable String str, @Nullable String str2, @NotNull BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration) {
        blazeDataSourceType.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeEntryPointTriggerSource.getClass();
        blazeVideosPlaybackConfiguration.getClass();
        playVideos$default(this, blazeDataSourceType, blazeVideosPlayerStyle, blazeEntryPointTriggerSource, z, str, str2, blazeVideosPlaybackConfiguration, null, 128, null);
    }

    @Keep
    public final void playMoments(@NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeDataSourceType.getClass();
        playMoments$default(this, blazeDataSourceType, null, null, null, false, null, null, null, 254, null);
    }

    @Keep
    public final void playVideos(@NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeDataSourceType.getClass();
        playVideos$default(this, blazeDataSourceType, null, null, false, null, null, null, null, 254, null);
    }

    @Keep
    public final void updateGeoRestriction(@Nullable String str) {
        updateGeoRestriction$default(this, str, null, 2, null);
    }

    @Keep
    public final void init(@NotNull String str, @Nullable String str2) {
        str.getClass();
        init$default(this, str, str2, null, null, null, null, null, null, null, null, 1020, null);
    }

    @Keep
    public final void init(@NotNull String str, @Nullable String str2, @Nullable Integer num) {
        str.getClass();
        init$default(this, str, str2, num, null, null, null, null, null, null, null, W3.l, null);
    }

    @Keep
    public final void init(@NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull BlazeCachingLevel blazeCachingLevel) {
        str.getClass();
        blazeCachingLevel.getClass();
        init$default(this, str, str2, num, blazeCachingLevel, null, null, null, null, null, null, 1008, null);
    }

    @Keep
    public final void init(@NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull BlazeCachingLevel blazeCachingLevel, @Nullable String str3) {
        str.getClass();
        blazeCachingLevel.getClass();
        init$default(this, str, str2, num, blazeCachingLevel, str3, null, null, null, null, null, 992, null);
    }

    @Keep
    public final void init(@NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull BlazeCachingLevel blazeCachingLevel, @Nullable String str3, @Nullable BlazeLayoutDirection blazeLayoutDirection) {
        str.getClass();
        blazeCachingLevel.getClass();
        init$default(this, str, str2, num, blazeCachingLevel, str3, blazeLayoutDirection, null, null, null, null, 960, null);
    }

    @Keep
    public final void init(@NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull BlazeCachingLevel blazeCachingLevel, @Nullable String str3, @Nullable BlazeLayoutDirection blazeLayoutDirection, @Nullable BlazeSDKDelegate blazeSDKDelegate) {
        str.getClass();
        blazeCachingLevel.getClass();
        init$default(this, str, str2, num, blazeCachingLevel, str3, blazeLayoutDirection, blazeSDKDelegate, null, null, null, 896, null);
    }

    @Keep
    public final void init(@NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull BlazeCachingLevel blazeCachingLevel, @Nullable String str3, @Nullable BlazeLayoutDirection blazeLayoutDirection, @Nullable BlazeSDKDelegate blazeSDKDelegate, @Nullable BlazePlayerEntryPointDelegate blazePlayerEntryPointDelegate) {
        str.getClass();
        blazeCachingLevel.getClass();
        init$default(this, str, str2, num, blazeCachingLevel, str3, blazeLayoutDirection, blazeSDKDelegate, blazePlayerEntryPointDelegate, null, null, 768, null);
    }

    @Keep
    public final void init(@NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull BlazeCachingLevel blazeCachingLevel, @Nullable String str3, @Nullable BlazeLayoutDirection blazeLayoutDirection, @Nullable BlazeSDKDelegate blazeSDKDelegate, @Nullable BlazePlayerEntryPointDelegate blazePlayerEntryPointDelegate, @NotNull Function0<Unit> function0) {
        str.getClass();
        blazeCachingLevel.getClass();
        function0.getClass();
        init$default(this, str, str2, num, blazeCachingLevel, str3, blazeLayoutDirection, blazeSDKDelegate, blazePlayerEntryPointDelegate, function0, null, 512, null);
    }

    @Keep
    public final void init(@NotNull String str) {
        str.getClass();
        init$default(this, str, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, null);
    }
}
