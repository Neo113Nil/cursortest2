package com.blaze.blazesdk.features.moments.container;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.analytics.enums.EventNavigationDirection;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazePlayerInContainerDelegate;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.exceptions.BlazeException;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.ErrorDomain;
import com.blaze.blazesdk.shared.results.h0;
import com.blaze.blazesdk.shared.results.k0;
import com.blaze.blazesdk.shared.results.l0;
import com.blaze.blazesdk.shared.results.m0;
import com.blaze.blazesdk.shared.results.n0;
import com.blaze.blazesdk.shared.results.o0;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.a1n;
import defpackage.a6m;
import defpackage.a70;
import defpackage.a9m;
import defpackage.aim;
import defpackage.b3m;
import defpackage.d5m;
import defpackage.e7m;
import defpackage.evl;
import defpackage.ful;
import defpackage.gum;
import defpackage.gzk;
import defpackage.hag;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.i2a;
import defpackage.i6m;
import defpackage.ij8;
import defpackage.irm;
import defpackage.ix1;
import defpackage.j1m;
import defpackage.joa;
import defpackage.jrl;
import defpackage.k6b;
import defpackage.ke;
import defpackage.ln2;
import defpackage.lu3;
import defpackage.mcm;
import defpackage.ml4;
import defpackage.n1n;
import defpackage.ogm;
import defpackage.ori;
import defpackage.oym;
import defpackage.qbm;
import defpackage.qha;
import defpackage.rpl;
import defpackage.rq3;
import defpackage.rq4;
import defpackage.rsm;
import defpackage.s1;
import defpackage.sha;
import defpackage.sqm;
import defpackage.sx1;
import defpackage.sxl;
import defpackage.syl;
import defpackage.td4;
import defpackage.ttk;
import defpackage.tub;
import defpackage.tum;
import defpackage.u6b;
import defpackage.wca;
import defpackage.wx4;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.y9m;
import defpackage.yda;
import defpackage.yj1;
import defpackage.ypa;
import defpackage.ysm;
import defpackage.z45;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 g2\u00020\u0001:\u0001gB]\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B_\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0017J-\u0010\u001c\u001a\u00020\u001a2\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u001f\u001a\u00020\u001a2\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0001¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001aH\u0007¢\u0006\u0004\b \u0010!JK\u0010%\u001a\u00020\u001a2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001aH\u0007¢\u0006\u0004\b'\u0010!J\u000f\u0010(\u001a\u00020\u001aH\u0007¢\u0006\u0004\b(\u0010!J\u000f\u0010)\u001a\u00020\u001aH\u0007¢\u0006\u0004\b)\u0010!J\u0019\u0010+\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001aH\u0002¢\u0006\u0004\b-\u0010!J\u000f\u0010.\u001a\u00020\u001aH\u0002¢\u0006\u0004\b.\u0010!J\u001f\u00102\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00107\u001a\u0002062\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108J/\u0010>\u001a\u00020=2\u0006\u00105\u001a\u0002042\u0006\u00100\u001a\u00020/2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u001aH\u0002¢\u0006\u0004\b@\u0010!J\u0017\u0010A\u001a\u00020\u001a2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u001a2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bC\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010DR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010GR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010IR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010JR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010SR\u0016\u0010]\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010JR\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006h"}, d2 = {"Lcom/blaze/blazesdk/features/moments/container/BlazeMomentsPlayerContainer;", "", "Landroid/widget/FrameLayout;", "containerView", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "dataSource", "Lcom/blaze/blazesdk/delegates/BlazePlayerInContainerDelegate;", "playerInContainerDelegate", "", "shouldOrderMomentsByReadStatus", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "cachePolicyLevel", "", "containerId", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "momentsPlayerStyle", "Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;", "momentsAdsConfigType", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "momentsPlaybackConfiguration", "<init>", "(Landroid/widget/FrameLayout;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/delegates/BlazePlayerInContainerDelegate;ZLcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Ljava/lang/String;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;)V", "Landroidx/fragment/app/FragmentContainerView;", "(Landroidx/fragment/app/FragmentContainerView;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/delegates/BlazePlayerInContainerDelegate;ZLcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Ljava/lang/String;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;)V", "Lkotlin/Function1;", "Lcom/blaze/blazesdk/shared/results/BlazeResult;", "", "completion", "startPlaying", "(Lkotlin/jvm/functions/Function1;)V", "startPlayingAfterAttach$blazesdk_release", "startPlayingAfterAttach", "dismissPlayer", "()V", "dataSourceType", TtmlNode.TAG_STYLE, "adsConfigType", "updateContent", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Ljava/lang/Boolean;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;)V", "resumePlayer", "pausePlayer", "onVolumeChanged", "playbackConfiguration", "updatePlaybackConfiguration", "(Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;)V", "createMomentsArgs", "unregisterLifecycleObserver", "Lu6b;", "lifecycleOwner", "Landroid/view/ViewGroup;", "registerLifecycleObserver", "(Lu6b;Landroid/view/ViewGroup;)V", "Landroid/content/Context;", "context", "Lrq4;", "createLifeCycleObserver", "(Landroid/content/Context;)Lrq4;", "Lcom/blaze/blazesdk/features/moments/models/args/b;", "momentsArgs", "Lttk;", "storeOwner", "Lrpl;", "createMomentsPlayerWrapperView", "(Landroid/content/Context;Lu6b;Lcom/blaze/blazesdk/features/moments/models/args/b;Lttk;)Lrpl;", "clearAllCurrentAsyncTasks", "registerBroadcastReceivers", "(Landroid/content/Context;)V", "unregisterBroadcastReceivers", "Landroid/widget/FrameLayout;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "Lcom/blaze/blazesdk/delegates/BlazePlayerInContainerDelegate;", "Z", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "Ljava/lang/String;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;", "currentPlaybackConfiguration", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "Lyda;", "startPlayingJob", "Lyda;", "Lsxl;", "doOnAttachCancellable", "Lsxl;", "Landroid/content/BroadcastReceiver;", "playerInContainerBroadcast$delegate", "Ljoa;", "getPlayerInContainerBroadcast", "()Landroid/content/BroadcastReceiver;", "playerInContainerBroadcast", "lifecycleObserver", "Lrq4;", "lifecycleObserverCancellable", "playerStyle", "Lcom/blaze/blazesdk/features/moments/models/args/b;", "Lsyl;", "momentsPlayerView", "Lsyl;", "momentsPlayerWrapperView", "Lrpl;", "getBroadcasterId", "()Ljava/lang/String;", "broadcasterId", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeMomentsPlayerContainer {

    @NotNull
    private BlazeCachingLevel cachePolicyLevel;

    @NotNull
    private final String containerId;

    @NotNull
    private final FrameLayout containerView;

    @Nullable
    private BlazeMomentsPlaybackConfiguration currentPlaybackConfiguration;

    @NotNull
    private BlazeDataSourceType dataSource;

    @Nullable
    private sxl doOnAttachCancellable;

    @Nullable
    private rq4 lifecycleObserver;

    @Nullable
    private sxl lifecycleObserverCancellable;

    @NotNull
    private BlazeMomentsAdsConfigType momentsAdsConfigType;

    @Nullable
    private com.blaze.blazesdk.features.moments.models.args.b momentsArgs;

    @NotNull
    private final BlazeMomentsPlayerStyle momentsPlayerStyle;

    @Nullable
    private syl momentsPlayerView;

    @Nullable
    private rpl momentsPlayerWrapperView;

    /* renamed from: playerInContainerBroadcast$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa playerInContainerBroadcast;

    @NotNull
    private final BlazePlayerInContainerDelegate playerInContainerDelegate;

    @NotNull
    private BlazeMomentsPlayerStyle playerStyle;
    private boolean shouldOrderMomentsByReadStatus;

    @Nullable
    private yda startPlayingJob;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final AtomicBoolean areMomentsCurrentlyPrepared = new AtomicBoolean(false);

    @NotNull
    private static final ln2 preparationCompletionChannel = ml4.g(-1, 6, null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BlazeMomentsPlayerContainer(FragmentContainerView fragmentContainerView, BlazeDataSourceType blazeDataSourceType, BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, boolean z, BlazeCachingLevel blazeCachingLevel, String str, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentContainerView, blazeDataSourceType, blazePlayerInContainerDelegate, r6, r7, r8, (i & 64) != 0 ? rsm.b : blazeMomentsPlayerStyle, (i & 128) != 0 ? BlazeMomentsAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG : blazeMomentsAdsConfigType, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : blazeMomentsPlaybackConfiguration);
        String str2;
        boolean z2 = (i & 8) != 0 ? true : z;
        BlazeCachingLevel cachingLevel$blazesdk_release = (i & 16) != 0 ? BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release() : blazeCachingLevel;
        if ((i & 32) != 0) {
            str2 = blazeDataSourceType.getStringRepresentation$blazesdk_release() + System.currentTimeMillis();
        } else {
            str2 = str;
        }
    }

    private final void clearAllCurrentAsyncTasks() {
        yda ydaVar = this.startPlayingJob;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        sxl sxlVar = this.doOnAttachCancellable;
        if (sxlVar != null) {
            ((d5m) sxlVar).a();
        }
    }

    private final rq4 createLifeCycleObserver(Context context) {
        return new b3m(this, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void createMomentsArgs() {
        BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration = this.currentPlaybackConfiguration;
        if (blazeMomentsPlaybackConfiguration == null) {
            blazeMomentsPlaybackConfiguration = rsm.c;
        }
        com.blaze.blazesdk.features.moments.models.ui.a p = i2a.p(blazeMomentsPlaybackConfiguration);
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = this.playerStyle;
        String str = this.containerId;
        WidgetType widgetType = null;
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        this.momentsArgs = new com.blaze.blazesdk.features.moments.models.args.b(blazeMomentsPlayerStyle, str, str, this.dataSource.getAnalyticsLabelExpressionRepresentation$blazesdk_release(), widgetType, new B(F.ENTRYPOINT, null, null, null, null, null, 62, null), this.momentsAdsConfigType, objArr2, z, this.cachePolicyLevel, true, this.shouldOrderMomentsByReadStatus, objArr, p, 4480, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rpl createMomentsPlayerWrapperView(Context context, u6b lifecycleOwner, com.blaze.blazesdk.features.moments.models.args.b momentsArgs, ttk storeOwner) {
        return new rpl(context, new ke(this, lifecycleOwner, context, momentsArgs, storeOwner, 3), new s1(25, this, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createMomentsPlayerWrapperView$lambda$7(BlazeMomentsPlayerContainer blazeMomentsPlayerContainer, u6b u6bVar, Context context, com.blaze.blazesdk.features.moments.models.args.b bVar, ttk ttkVar, rpl rplVar) {
        rplVar.getClass();
        blazeMomentsPlayerContainer.registerLifecycleObserver(u6bVar, blazeMomentsPlayerContainer.containerView);
        syl sylVar = new syl(context, bVar, null, u6bVar, ttkVar, 4, null);
        blazeMomentsPlayerContainer.momentsPlayerView = sylVar;
        rplVar.addView(sylVar, new FrameLayout.LayoutParams(-1, -1));
        syl sylVar2 = blazeMomentsPlayerContainer.momentsPlayerView;
        if (sylVar2 != null) {
            ysm.h((sqm) sylVar2.getViewModel());
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createMomentsPlayerWrapperView$lambda$8(BlazeMomentsPlayerContainer blazeMomentsPlayerContainer, Context context, rpl rplVar) {
        rplVar.getClass();
        syl sylVar = blazeMomentsPlayerContainer.momentsPlayerView;
        if (sylVar != null) {
            ysm.e((sqm) sylVar.getViewModel(), EventNavigationDirection.CLOSE);
            ysm.g((sqm) sylVar.getViewModel(), H.BACK_BUTTON);
        }
        rplVar.removeAllViews();
        blazeMomentsPlayerContainer.momentsPlayerView = null;
        blazeMomentsPlayerContainer.unregisterLifecycleObserver();
        blazeMomentsPlayerContainer.unregisterBroadcastReceivers(context);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBroadcasterId, reason: from getter */
    public final String getContainerId() {
        return this.containerId;
    }

    private final BroadcastReceiver getPlayerInContainerBroadcast() {
        return (BroadcastReceiver) this.playerInContainerBroadcast.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BroadcastReceiver playerInContainerBroadcast_delegate$lambda$0(BlazeMomentsPlayerContainer blazeMomentsPlayerContainer) {
        return gzk.createPlayerBroadcastReceiver$blazesdk_release$default(gzk.a, blazeMomentsPlayerContainer.getContainerId(), blazeMomentsPlayerContainer.playerInContainerDelegate, ErrorDomain.CONTAINER, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerBroadcastReceivers(Context context) {
        LocalBroadcastManager.getInstance(context).registerReceiver(getPlayerInContainerBroadcast(), new IntentFilter("player_broadcast"));
    }

    private final void registerLifecycleObserver(u6b lifecycleOwner, ViewGroup containerView) {
        try {
            unregisterLifecycleObserver();
            Context context = containerView.getContext();
            context.getClass();
            rq4 createLifeCycleObserver = createLifeCycleObserver(context);
            lifecycleOwner.getLifecycle().a(createLifeCycleObserver);
            this.lifecycleObserverCancellable = new d5m(new ix1(10, lifecycleOwner, createLifeCycleObserver));
            this.lifecycleObserver = createLifeCycleObserver;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerLifecycleObserver$lambda$2$lambda$1(u6b u6bVar, rq4 rq4Var) {
        u6bVar.getLifecycle().d(rq4Var);
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startPlaying$default(BlazeMomentsPlayerContainer blazeMomentsPlayerContainer, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        blazeMomentsPlayerContainer.startPlaying(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startPlaying$lambda$3(BlazeMomentsPlayerContainer blazeMomentsPlayerContainer, Function1 function1, View view) {
        view.getClass();
        blazeMomentsPlayerContainer.startPlayingAfterAttach$blazesdk_release(function1);
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startPlayingAfterAttach$blazesdk_release$default(BlazeMomentsPlayerContainer blazeMomentsPlayerContainer, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        blazeMomentsPlayerContainer.startPlayingAfterAttach$blazesdk_release(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterBroadcastReceivers(Context context) {
        LocalBroadcastManager.getInstance(context).unregisterReceiver(getPlayerInContainerBroadcast());
    }

    private final void unregisterLifecycleObserver() {
        sxl sxlVar = this.lifecycleObserverCancellable;
        if (sxlVar != null) {
            ((d5m) sxlVar).a();
        }
        this.lifecycleObserverCancellable = null;
    }

    public static /* synthetic */ void updateContent$default(BlazeMomentsPlayerContainer blazeMomentsPlayerContainer, BlazeDataSourceType blazeDataSourceType, Boolean bool, BlazeCachingLevel blazeCachingLevel, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeDataSourceType = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            blazeCachingLevel = null;
        }
        if ((i & 8) != 0) {
            blazeMomentsPlayerStyle = null;
        }
        if ((i & 16) != 0) {
            blazeMomentsAdsConfigType = null;
        }
        blazeMomentsPlayerContainer.updateContent(blazeDataSourceType, bool, blazeCachingLevel, blazeMomentsPlayerStyle, blazeMomentsAdsConfigType);
    }

    @Keep
    public final void dismissPlayer() {
        com.blaze.blazesdk.features.moments.models.args.b bVar = this.momentsArgs;
        if (bVar == null) {
            return;
        }
        try {
            clearAllCurrentAsyncTasks();
            syl sylVar = this.momentsPlayerView;
            if (sylVar != null) {
                sylVar.j(H.APP_CLOSE);
            } else {
                FrameLayout frameLayout = this.containerView;
                if (frameLayout.isAttachedToWindow()) {
                    ttk u = sha.u(this.containerView);
                    if (u != null) {
                        ful.b bVar2 = ful.o;
                        String str = bVar.b;
                        bVar2.getClass();
                        ful.b.a(str, u);
                    }
                } else {
                    frameLayout.addOnAttachStateChangeListener(new a(frameLayout, this, bVar));
                }
            }
            this.containerView.removeAllViews();
            unregisterLifecycleObserver();
            Context context = this.containerView.getContext();
            context.getClass();
            unregisterBroadcastReceivers(context);
            this.momentsPlayerView = null;
            this.momentsPlayerWrapperView = null;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Keep
    public final void onVolumeChanged() {
        syl sylVar = this.momentsPlayerView;
        if (sylVar != null) {
            sylVar.v();
        }
    }

    @Keep
    public final void pausePlayer() {
        try {
            syl sylVar = this.momentsPlayerView;
            if (sylVar != null) {
                sylVar.g(hag.a);
            }
            syl sylVar2 = this.momentsPlayerView;
            if (sylVar2 != null) {
                sylVar2.e(n1n.a, true);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Keep
    public final void resumePlayer() {
        try {
            syl sylVar = this.momentsPlayerView;
            if (sylVar != null) {
                sylVar.g(ori.a);
            }
            syl sylVar2 = this.momentsPlayerView;
            if (sylVar2 != null) {
                sylVar2.e(a1n.a, true);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Keep
    public final void startPlaying(@Nullable Function1<? super BlazeResult<Unit>, Unit> completion) {
        d5m d5mVar;
        clearAllCurrentAsyncTasks();
        if (!Intrinsics.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            throw BlazeException.MainThreadRequiredException.INSTANCE;
        }
        this.containerView.removeAllViews();
        createMomentsArgs();
        FrameLayout frameLayout = this.containerView;
        s1 s1Var = new s1(26, this, completion);
        frameLayout.getClass();
        if (frameLayout.isAttachedToWindow()) {
            s1Var.invoke(frameLayout);
            d5mVar = null;
        } else {
            oym oymVar = new oym(frameLayout, s1Var);
            frameLayout.addOnAttachStateChangeListener(oymVar);
            d5mVar = new d5m(new ij8(5, frameLayout, oymVar));
        }
        this.doOnAttachCancellable = d5mVar;
    }

    public final void startPlayingAfterAttach$blazesdk_release(@Nullable Function1<? super BlazeResult<Unit>, Unit> completion) {
        com.blaze.blazesdk.features.moments.models.args.b bVar = this.momentsArgs;
        if (bVar == null) {
            return;
        }
        u6b w = qha.w(this.containerView);
        if (w == null) {
            j1m j1mVar = j1m.a;
            n0 n0Var = new n0();
            j1m.a(n0Var);
            if (completion != null) {
                completion.invoke(n0Var.d());
                return;
            }
            return;
        }
        ttk u = sha.u(this.containerView);
        if (u != null) {
            registerLifecycleObserver(w, this.containerView);
            k6b x = wca.x(w.getLifecycle());
            hs4 hs4Var = z45.a;
            this.startPlayingJob = xw3.L(x, hq4.c, null, new d(this, w, bVar, u, completion, null), 2);
            return;
        }
        j1m j1mVar2 = j1m.a;
        o0 o0Var = new o0();
        j1m.a(o0Var);
        if (completion != null) {
            completion.invoke(o0Var.d());
        }
    }

    @Keep
    public final void updateContent(@Nullable BlazeDataSourceType dataSourceType, @Nullable Boolean shouldOrderMomentsByReadStatus, @Nullable BlazeCachingLevel cachePolicyLevel, @Nullable BlazeMomentsPlayerStyle style, @Nullable BlazeMomentsAdsConfigType adsConfigType) {
        dismissPlayer();
        if (dataSourceType != null) {
            this.dataSource = dataSourceType;
        }
        if (shouldOrderMomentsByReadStatus != null) {
            this.shouldOrderMomentsByReadStatus = shouldOrderMomentsByReadStatus.booleanValue();
        }
        if (cachePolicyLevel != null) {
            this.cachePolicyLevel = cachePolicyLevel;
        }
        if (style != null) {
            this.playerStyle = (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(style);
        }
        if (adsConfigType != null) {
            this.momentsAdsConfigType = adsConfigType;
        }
        startPlaying$default(this, null, 1, null);
    }

    @Keep
    public final void updatePlaybackConfiguration(@Nullable BlazeMomentsPlaybackConfiguration playbackConfiguration) {
        this.currentPlaybackConfiguration = playbackConfiguration;
        syl sylVar = this.momentsPlayerView;
        if (sylVar != null) {
            if (playbackConfiguration == null) {
                try {
                    playbackConfiguration = rsm.c;
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                    return;
                }
            }
            ((sqm) sylVar.getViewModel()).y0 = i2a.p(playbackConfiguration);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016JO\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\b2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0014\u0012\u0004\u0012\u00020\u00180\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/blaze/blazesdk/features/moments/container/BlazeMomentsPlayerContainer$Companion;", "", "<init>", "()V", "", "containerId", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "dataSource", "", "shouldOrderMomentsByReadStatus", "La9m;", "", "Lcom/blaze/blazesdk/features/moments/models/ui/MomentModel;", "fetchMoments", "(Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;ZLrq3;)Ljava/lang/Object;", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "cachePolicyLevel", "shouldPrefetchBeforePlaying", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "playerStyle", "Lcom/blaze/blazesdk/shared/results/BlazeResult;", "internalPrepareMoments", "(Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;ZZLcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lrq3;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "completion", "prepareMoments", "(Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;ZLkotlin/jvm/functions/Function1;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "areMomentsCurrentlyPrepared", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lln2;", "preparationCompletionChannel", "Lln2;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object fetchMoments(String str, BlazeDataSourceType blazeDataSourceType, boolean z, rq3<? super a9m> rq3Var) {
            gum gumVar = gum.b;
            if (jrl.hasDataSourceChanged$default(gumVar, str, blazeDataSourceType, z, str, null, null, 48, null)) {
                return jrl.getMomentsAndSaveToCache$default(gumVar, blazeDataSourceType, str, str, false, z, null, null, null, false, rq3Var, 488, null);
            }
            gumVar.getClass();
            List q = gum.q(str);
            return q.isEmpty() ? jrl.getMomentsAndSaveToCache$default(gumVar, blazeDataSourceType, str, str, false, z, null, null, null, false, rq3Var, 488, null) : new qbm(q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0089 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:13:0x0083, B:15:0x0089, B:19:0x0099, B:22:0x00a5, B:23:0x00a3, B:24:0x00b7, B:27:0x00c6, B:29:0x00ca, B:31:0x0111, B:36:0x0127, B:52:0x005a, B:54:0x0064), top: B:51:0x005a }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c6 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:13:0x0083, B:15:0x0089, B:19:0x0099, B:22:0x00a5, B:23:0x00a3, B:24:0x00b7, B:27:0x00c6, B:29:0x00ca, B:31:0x0111, B:36:0x0127, B:52:0x005a, B:54:0x0064), top: B:51:0x005a }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object internalPrepareMoments(String str, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, boolean z, boolean z2, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, rq3<? super BlazeResult<? extends List<MomentModel>>> rq3Var) {
            com.blaze.blazesdk.features.moments.container.a aVar;
            int i;
            boolean z3;
            BlazeMomentsPlayerStyle blazeMomentsPlayerStyle2;
            boolean z4;
            BlazeCachingLevel blazeCachingLevel2;
            String str2;
            BlazeDataSourceType blazeDataSourceType2;
            a9m a9mVar;
            aim aimVar;
            String str3 = str;
            BlazeDataSourceType blazeDataSourceType3 = blazeDataSourceType;
            if (rq3Var instanceof com.blaze.blazesdk.features.moments.container.a) {
                aVar = (com.blaze.blazesdk.features.moments.container.a) rq3Var;
                int i2 = aVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.z = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.x;
                    Object obj2 = lu3.a;
                    i = aVar.z;
                    if (i != 0) {
                        y6a.M(obj);
                        try {
                            com.blaze.blazesdk.data_source.a.validate$default(blazeDataSourceType3, ogm.CONTAINER, false, 2, null);
                            try {
                                if (!BlazeMomentsPlayerContainer.areMomentsCurrentlyPrepared.compareAndSet(false, true)) {
                                    z3 = z2;
                                    blazeMomentsPlayerStyle2 = blazeMomentsPlayerStyle;
                                    z4 = z;
                                    blazeCachingLevel2 = blazeCachingLevel;
                                    str2 = str3;
                                    blazeDataSourceType2 = blazeDataSourceType3;
                                    try {
                                        return td4.t0(g.a, new b(str2, blazeDataSourceType2, blazeCachingLevel2, z4, z3, blazeMomentsPlayerStyle2, null));
                                    } catch (Throwable th) {
                                        th = th;
                                        str3 = str2;
                                        blazeDataSourceType3 = blazeDataSourceType2;
                                        BlazeMomentsPlayerContainer.areMomentsCurrentlyPrepared.set(false);
                                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                        h0 h0Var = new h0();
                                        h0Var.g = tub.h(new Pair("containerId", str3), new Pair("dataSource", blazeDataSourceType3.getStringRepresentation$blazesdk_release()));
                                        return h0Var.d();
                                    }
                                }
                                aVar.r = str3;
                                aVar.s = blazeDataSourceType3;
                                aVar.t = blazeCachingLevel;
                                blazeMomentsPlayerStyle2 = blazeMomentsPlayerStyle;
                                aVar.u = blazeMomentsPlayerStyle2;
                                aVar.v = z;
                                z3 = z2;
                                aVar.w = z3;
                                aVar.z = 1;
                                Object fetchMoments = fetchMoments(str3, blazeDataSourceType3, z, aVar);
                                if (fetchMoments == obj2) {
                                    return obj2;
                                }
                                obj = fetchMoments;
                                z4 = z;
                                blazeCachingLevel2 = blazeCachingLevel;
                            } catch (Throwable th2) {
                                th = th2;
                                BlazeMomentsPlayerContainer.areMomentsCurrentlyPrepared.set(false);
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                h0 h0Var2 = new h0();
                                h0Var2.g = tub.h(new Pair("containerId", str3), new Pair("dataSource", blazeDataSourceType3.getStringRepresentation$blazesdk_release()));
                                return h0Var2.d();
                            }
                        } catch (Throwable th3) {
                            j1m j1mVar = j1m.a;
                            m0 m0Var = new m0();
                            m0Var.g = tub.h(new Pair("containerId", str3), new Pair("dataSource", blazeDataSourceType3.getStringRepresentation$blazesdk_release()));
                            m0Var.f = th3;
                            m0Var.b(th3.getMessage());
                            j1m.a(m0Var);
                            return m0Var.d();
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z5 = aVar.w;
                        boolean z6 = aVar.v;
                        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle3 = aVar.u;
                        blazeCachingLevel2 = aVar.t;
                        BlazeDataSourceType blazeDataSourceType4 = aVar.s;
                        String str4 = aVar.r;
                        try {
                            y6a.M(obj);
                            z3 = z5;
                            z4 = z6;
                            blazeMomentsPlayerStyle2 = blazeMomentsPlayerStyle3;
                            str3 = str4;
                            blazeDataSourceType3 = blazeDataSourceType4;
                        } catch (Throwable th4) {
                            th = th4;
                            str3 = str4;
                            blazeDataSourceType3 = blazeDataSourceType4;
                            BlazeMomentsPlayerContainer.areMomentsCurrentlyPrepared.set(false);
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                            h0 h0Var22 = new h0();
                            h0Var22.g = tub.h(new Pair("containerId", str3), new Pair("dataSource", blazeDataSourceType3.getStringRepresentation$blazesdk_release()));
                            return h0Var22.d();
                        }
                    }
                    a9mVar = (a9m) obj;
                    if (a9mVar instanceof qbm) {
                        if (a9mVar instanceof a6m) {
                            a6m a6mVar = (a6m) a9mVar;
                            BlazeMomentsPlayerContainer.preparationCompletionChannel.d(Unit.a);
                            j1m j1mVar2 = j1m.a;
                            k0 k0Var = new k0();
                            k0Var.g = tub.h(new Pair("containerId", str3), new Pair("dataSource", blazeDataSourceType3.getStringRepresentation$blazesdk_release()));
                            k0Var.f = a6mVar.a();
                            k0Var.b(a6mVar.b());
                            j1m.a(k0Var);
                            return k0Var.d();
                        }
                        str2 = str3;
                        blazeDataSourceType2 = blazeDataSourceType3;
                        return td4.t0(g.a, new b(str2, blazeDataSourceType2, blazeCachingLevel2, z4, z3, blazeMomentsPlayerStyle2, null));
                    }
                    List list = (List) ((qbm) a9mVar).a;
                    if (!list.isEmpty() && z3) {
                        if (blazeMomentsPlayerStyle2 != null) {
                            aimVar = y9m.a(blazeMomentsPlayerStyle2);
                            if (aimVar == null) {
                            }
                            Function1 a = e7m.a(aimVar);
                            new irm();
                            irm.a(i6m.a(list), blazeCachingLevel2, a, tum.a);
                        }
                        aimVar = mcm.a;
                        Function1 a2 = e7m.a(aimVar);
                        new irm();
                        irm.a(i6m.a(list), blazeCachingLevel2, a2, tum.a);
                    }
                    BlazeMomentsPlayerContainer.preparationCompletionChannel.d(Unit.a);
                    return new BlazeResult.Success(list);
                }
            }
            aVar = new com.blaze.blazesdk.features.moments.container.a(this, rq3Var);
            Object obj3 = aVar.x;
            Object obj22 = lu3.a;
            i = aVar.z;
            if (i != 0) {
            }
            a9mVar = (a9m) obj3;
            if (a9mVar instanceof qbm) {
            }
        }

        public static /* synthetic */ void prepareMoments$default(Companion companion, String str, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, boolean z, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                blazeCachingLevel = BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release();
            }
            BlazeCachingLevel blazeCachingLevel2 = blazeCachingLevel;
            if ((i & 8) != 0) {
                z = true;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                function1 = new sx1(1);
            }
            companion.prepareMoments(str, blazeDataSourceType, blazeCachingLevel2, z2, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit prepareMoments$lambda$2(BlazeResult blazeResult) {
            blazeResult.getClass();
            return Unit.a;
        }

        @Keep
        public final void prepareMoments(@NotNull String containerId, @NotNull BlazeDataSourceType dataSource, @NotNull BlazeCachingLevel cachePolicyLevel, boolean shouldOrderMomentsByReadStatus, @NotNull Function1<? super BlazeResult<Unit>, Unit> completion) {
            containerId.getClass();
            dataSource.getClass();
            cachePolicyLevel.getClass();
            completion.getClass();
            if (com.blaze.blazesdk.data_source.a.b(dataSource)) {
                evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new c(containerId, dataSource, cachePolicyLevel, shouldOrderMomentsByReadStatus, completion, null), 1, null);
                return;
            }
            j1m j1mVar = j1m.a;
            l0 l0Var = new l0();
            l0Var.g = tub.h(new Pair("containerId", containerId), new Pair("dataSource", dataSource.getStringRepresentation$blazesdk_release()));
            l0Var.b("Preparing is not supported when using " + dataSource + ". You need to proceed to play the content directly, or contact support to discuss upgrade options.");
            j1m.a(l0Var);
            evl.l(l0Var.d(), completion);
        }

        private Companion() {
        }

        @Keep
        public final void prepareMoments(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel) {
            str.getClass();
            blazeDataSourceType.getClass();
            blazeCachingLevel.getClass();
            prepareMoments$default(this, str, blazeDataSourceType, blazeCachingLevel, false, null, 24, null);
        }

        @Keep
        public final void prepareMoments(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z) {
            str.getClass();
            blazeDataSourceType.getClass();
            blazeCachingLevel.getClass();
            prepareMoments$default(this, str, blazeDataSourceType, blazeCachingLevel, z, null, 16, null);
        }

        @Keep
        public final void prepareMoments(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType) {
            str.getClass();
            blazeDataSourceType.getClass();
            prepareMoments$default(this, str, blazeDataSourceType, null, false, null, 28, null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ BlazeMomentsPlayerContainer b;
        public final /* synthetic */ com.blaze.blazesdk.features.moments.models.args.b c;

        public a(View view, BlazeMomentsPlayerContainer blazeMomentsPlayerContainer, com.blaze.blazesdk.features.moments.models.args.b bVar) {
            this.a = view;
            this.b = blazeMomentsPlayerContainer;
            this.c = bVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            ttk u = sha.u(this.b.containerView);
            if (u != null) {
                ful.b bVar = ful.o;
                String str = this.c.b;
                bVar.getClass();
                ful.b.a(str, u);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    @Keep
    public final void updateContent(@Nullable BlazeDataSourceType blazeDataSourceType) {
        updateContent$default(this, blazeDataSourceType, null, null, null, null, 30, null);
    }

    @Keep
    public final void updateContent(@Nullable BlazeDataSourceType blazeDataSourceType, @Nullable Boolean bool) {
        updateContent$default(this, blazeDataSourceType, bool, null, null, null, 28, null);
    }

    @Keep
    public final void updateContent(@Nullable BlazeDataSourceType blazeDataSourceType, @Nullable Boolean bool, @Nullable BlazeCachingLevel blazeCachingLevel) {
        updateContent$default(this, blazeDataSourceType, bool, blazeCachingLevel, null, null, 24, null);
    }

    @Keep
    public final void updateContent(@Nullable BlazeDataSourceType blazeDataSourceType, @Nullable Boolean bool, @Nullable BlazeCachingLevel blazeCachingLevel, @Nullable BlazeMomentsPlayerStyle blazeMomentsPlayerStyle) {
        updateContent$default(this, blazeDataSourceType, bool, blazeCachingLevel, blazeMomentsPlayerStyle, null, 16, null);
    }

    @Keep
    public final void updateContent() {
        updateContent$default(this, null, null, null, null, null, 31, null);
    }

    @Keep
    public final void startPlaying() {
        startPlaying$default(this, null, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsPlayerContainer(@NotNull FrameLayout frameLayout, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str) {
        this(frameLayout, blazeDataSourceType, blazePlayerInContainerDelegate, z, blazeCachingLevel, str, (BlazeMomentsPlayerStyle) null, (BlazeMomentsAdsConfigType) null, (BlazeMomentsPlaybackConfiguration) null, 448, (DefaultConstructorMarker) null);
        frameLayout.getClass();
        blazeDataSourceType.getClass();
        blazePlayerInContainerDelegate.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsPlayerContainer(@NotNull FrameLayout frameLayout, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle) {
        this(frameLayout, blazeDataSourceType, blazePlayerInContainerDelegate, z, blazeCachingLevel, str, blazeMomentsPlayerStyle, (BlazeMomentsAdsConfigType) null, (BlazeMomentsPlaybackConfiguration) null, 384, (DefaultConstructorMarker) null);
        frameLayout.getClass();
        blazeDataSourceType.getClass();
        blazePlayerInContainerDelegate.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeMomentsPlayerStyle.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsPlayerContainer(@NotNull FrameLayout frameLayout, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType) {
        this(frameLayout, blazeDataSourceType, blazePlayerInContainerDelegate, z, blazeCachingLevel, str, blazeMomentsPlayerStyle, blazeMomentsAdsConfigType, (BlazeMomentsPlaybackConfiguration) null, NotificationCompat.FLAG_LOCAL_ONLY, (DefaultConstructorMarker) null);
        frameLayout.getClass();
        blazeDataSourceType.getClass();
        blazePlayerInContainerDelegate.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsAdsConfigType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsPlayerContainer(@NotNull FrameLayout frameLayout, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, boolean z, @NotNull String str) {
        this(frameLayout, blazeDataSourceType, blazePlayerInContainerDelegate, z, (BlazeCachingLevel) null, str, (BlazeMomentsPlayerStyle) null, (BlazeMomentsAdsConfigType) null, (BlazeMomentsPlaybackConfiguration) null, 464, (DefaultConstructorMarker) null);
        frameLayout.getClass();
        blazeDataSourceType.getClass();
        blazePlayerInContainerDelegate.getClass();
        str.getClass();
    }

    @Keep
    public BlazeMomentsPlayerContainer(@NotNull FrameLayout frameLayout, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, @Nullable BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        frameLayout.getClass();
        blazeDataSourceType.getClass();
        blazePlayerInContainerDelegate.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsAdsConfigType.getClass();
        this.containerView = frameLayout;
        this.dataSource = blazeDataSourceType;
        this.playerInContainerDelegate = blazePlayerInContainerDelegate;
        this.shouldOrderMomentsByReadStatus = z;
        this.cachePolicyLevel = blazeCachingLevel;
        this.containerId = str;
        this.momentsPlayerStyle = blazeMomentsPlayerStyle;
        this.momentsAdsConfigType = blazeMomentsAdsConfigType;
        this.currentPlaybackConfiguration = blazeMomentsPlaybackConfiguration;
        this.playerInContainerBroadcast = ypa.b(new yj1(this, 7));
        this.playerStyle = (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(blazeMomentsPlayerStyle);
    }

    public BlazeMomentsPlayerContainer(FrameLayout frameLayout, BlazeDataSourceType blazeDataSourceType, BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, boolean z, BlazeCachingLevel blazeCachingLevel, String str, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameLayout, blazeDataSourceType, blazePlayerInContainerDelegate, (i & 8) != 0 ? true : z, (i & 16) != 0 ? BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release() : blazeCachingLevel, str, (i & 64) != 0 ? rsm.b : blazeMomentsPlayerStyle, (i & 128) != 0 ? BlazeMomentsAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG : blazeMomentsAdsConfigType, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : blazeMomentsPlaybackConfiguration);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsPlayerContainer(@NotNull FrameLayout frameLayout, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, @NotNull String str) {
        this(frameLayout, blazeDataSourceType, blazePlayerInContainerDelegate, false, (BlazeCachingLevel) null, str, (BlazeMomentsPlayerStyle) null, (BlazeMomentsAdsConfigType) null, (BlazeMomentsPlaybackConfiguration) null, 472, (DefaultConstructorMarker) null);
        frameLayout.getClass();
        blazeDataSourceType.getClass();
        blazePlayerInContainerDelegate.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @wx4
    public BlazeMomentsPlayerContainer(@NotNull FragmentContainerView fragmentContainerView, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, @Nullable BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        this(new FrameLayout(fragmentContainerView.getContext()), blazeDataSourceType, blazePlayerInContainerDelegate, z, blazeCachingLevel, str, blazeMomentsPlayerStyle, blazeMomentsAdsConfigType, blazeMomentsPlaybackConfiguration);
        fragmentContainerView.getClass();
        blazeDataSourceType.getClass();
        blazePlayerInContainerDelegate.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsAdsConfigType.getClass();
        this.currentPlaybackConfiguration = blazeMomentsPlaybackConfiguration;
    }
}
