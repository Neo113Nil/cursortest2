package com.blaze.blazesdk.features.moments.inline;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazePlayerInContainerDelegate;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.moments.inline.BlazeMomentsInlinePlayer;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.shared.results.l0;
import com.blaze.blazesdk.shared.results.m0;
import com.blaze.blazesdk.shared.results.n;
import com.blaze.blazesdk.style.players.BlazePlayerDisplayMode;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.a9m;
import defpackage.cnb;
import defpackage.erm;
import defpackage.evl;
import defpackage.gfm;
import defpackage.gq5;
import defpackage.gum;
import defpackage.i2a;
import defpackage.izl;
import defpackage.j1m;
import defpackage.jrl;
import defpackage.ln2;
import defpackage.mm3;
import defpackage.ogm;
import defpackage.qbm;
import defpackage.rpl;
import defpackage.rq3;
import defpackage.rsm;
import defpackage.rum;
import defpackage.sqm;
import defpackage.sx1;
import defpackage.syl;
import defpackage.tl3;
import defpackage.ttk;
import defpackage.u6b;
import defpackage.xwm;
import defpackage.za4;
import defpackage.zzl;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 z2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001zBm\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b'\u0010(J7\u0010-\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010,\u001a\u00020#H\u0014¢\u0006\u0004\b-\u0010.J\u001b\u00102\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020 2\u0006\u00105\u001a\u000204H\u0014¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020 H\u0014¢\u0006\u0004\b8\u00109J$\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050<0;2\u0006\u0010:\u001a\u00020\u000eH\u0094@¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020 H\u0014¢\u0006\u0004\b?\u00109J\u0019\u0010A\u001a\u00020 2\b\u0010@\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\bA\u0010BJK\u0010G\u001a\u00020 2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u000201H\u0002¢\u0006\u0004\bL\u0010MJ'\u0010R\u001a\u00020 2\u0006\u0010N\u001a\u00020I2\u0006\u0010O\u001a\u0002012\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ#\u0010U\u001a\u00020 2\u0006\u00105\u001a\u0002042\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020 2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bW\u00107J!\u0010X\u001a\u00020 2\u0006\u0010O\u001a\u0002012\b\u0010T\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bX\u0010YJ\u0019\u0010Z\u001a\u00020 2\b\u0010T\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bZ\u0010[R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\\R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010]R\u001a\u0010\u0015\u001a\u00020\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010^\u001a\u0004\b_\u0010`R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010aR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010bR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010cR\"\u0010d\u001a\u00020\u000e8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010]R*\u0010l\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR*\u0010r\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010m\u001a\u0004\bs\u0010o\"\u0004\bt\u0010qR\u001a\u0010v\u001a\u00020u8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y¨\u0006{"}, d2 = {"Lcom/blaze/blazesdk/features/moments/inline/BlazeMomentsInlinePlayer;", "Lcom/blaze/blazesdk/players/inline/BlazeBaseInlinePlayerContainer;", "Lsqm;", "Lsyl;", "Lcom/blaze/blazesdk/features/moments/models/args/b;", "Lcom/blaze/blazesdk/features/moments/models/ui/MomentModel;", "Lu6b;", "lifecycleOwner", "Lttk;", "storeOwner", "Landroid/widget/FrameLayout;", "containerView", "", "containerId", "", "shouldOrderContentsByReadStatus", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "dataSource", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "momentsPlayerStyle", "Lcom/blaze/blazesdk/delegates/BlazePlayerInContainerDelegate;", "playerDelegate", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "cachePolicyLevel", "Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;", "momentsAdsConfigType", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "momentsPlaybackConfiguration", "<init>", "(Lu6b;Lttk;Landroid/widget/FrameLayout;Ljava/lang/String;ZLcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/delegates/BlazePlayerInContainerDelegate;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;)V", "initialItemId", "shouldAutoPlayOnStart", "", "createOrUpdatePlayerViewArgs", "(Ljava/lang/String;Z)V", "Lrpl;", "middlemanView", "onContainerMiddlemanViewAttached", "(Lrpl;Lu6b;)V", "onContainerMiddlemanViewDetached", "(Lrpl;)V", "Landroid/content/Context;", "context", "args", "wrapperView", "createPlayerViewAndAddToWrapper", "(Landroid/content/Context;Lcom/blaze/blazesdk/features/moments/models/args/b;Lu6b;Lttk;Lrpl;)V", "Lkotlin/Pair;", "Landroid/view/ViewGroup;", "Landroid/widget/ImageView;", "createPlaceholderStructure", "()Lkotlin/Pair;", "Lrum;", "viewingRecord", "configurePlaceholderWithLatestRecord", "(Lrum;)V", "releasePlaceholderResources", "()V", "shouldPrefetchBeforePlaying", "Lgfm;", "", "preloadContent", "(ZLrq3;)Ljava/lang/Object;", "cleanupContainerResources", "playbackConfiguration", "updatePlaybackConfiguration", "(Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;)V", "dataSourceType", "shouldOrderMomentsByReadStatus", TtmlNode.TAG_STYLE, "adsConfigType", "updateContent", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Ljava/lang/Boolean;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "createAspectRatioWrapper", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "createPlaceholderImageView", "()Landroid/widget/ImageView;", "container", "imageView", "Lcom/blaze/blazesdk/style/players/BlazePlayerDisplayMode;", "displayMode", "configureImageViewInAspectRatioWrapper", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Lcom/blaze/blazesdk/style/players/BlazePlayerDisplayMode;)V", "playerArgs", "configurePlaceholder", "(Lrum;Lcom/blaze/blazesdk/features/moments/models/args/b;)V", "updatePlaceholderImage", "setupPlaceholderClickListener", "(Landroid/widget/ImageView;Lcom/blaze/blazesdk/features/moments/models/args/b;)V", "handlePlaceholderClicked", "(Lcom/blaze/blazesdk/features/moments/models/args/b;)V", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "Lcom/blaze/blazesdk/delegates/BlazePlayerInContainerDelegate;", "getPlayerDelegate", "()Lcom/blaze/blazesdk/delegates/BlazePlayerInContainerDelegate;", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "shouldOrderByReadStatus", "Z", "getShouldOrderByReadStatus", "()Z", "setShouldOrderByReadStatus", "(Z)V", "playerStyle", "Lkotlin/Function0;", "onFirstTimeSlideStarted", "Lkotlin/jvm/functions/Function0;", "getOnFirstTimeSlideStarted", "()Lkotlin/jvm/functions/Function0;", "setOnFirstTimeSlideStarted", "(Lkotlin/jvm/functions/Function0;)V", "onFirstTimeSlideDismissed", "getOnFirstTimeSlideDismissed", "setOnFirstTimeSlideDismissed", "Lxwm;", "viewingRecordManager", "Lxwm;", "getViewingRecordManager$blazesdk_release", "()Lxwm;", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeMomentsInlinePlayer extends BlazeBaseInlinePlayerContainer<sqm, syl, com.blaze.blazesdk.features.moments.models.args.b, MomentModel> {

    @NotNull
    private static final String TAG = "InlineMomentsPlayerContainer";

    @NotNull
    private BlazeCachingLevel cachePolicyLevel;

    @NotNull
    private BlazeDataSourceType dataSource;

    @NotNull
    private BlazeMomentsAdsConfigType momentsAdsConfigType;

    @Nullable
    private final BlazeMomentsPlaybackConfiguration momentsPlaybackConfiguration;

    @NotNull
    private final BlazeMomentsPlayerStyle momentsPlayerStyle;

    @Nullable
    private Function0<Unit> onFirstTimeSlideDismissed;

    @Nullable
    private Function0<Unit> onFirstTimeSlideStarted;

    @NotNull
    private final BlazePlayerInContainerDelegate playerDelegate;

    @NotNull
    private BlazeMomentsPlayerStyle playerStyle;
    private boolean shouldOrderByReadStatus;

    @NotNull
    private final xwm viewingRecordManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final za4 contentLoadingCoordinator = new za4();

    public BlazeMomentsInlinePlayer(u6b u6bVar, ttk ttkVar, FrameLayout frameLayout, String str, boolean z, BlazeDataSourceType blazeDataSourceType, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, BlazeCachingLevel blazeCachingLevel, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(u6bVar, ttkVar, frameLayout, str, (i & 16) != 0 ? true : z, blazeDataSourceType, (i & 64) != 0 ? rsm.b : blazeMomentsPlayerStyle, blazePlayerInContainerDelegate, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release() : blazeCachingLevel, (i & 512) != 0 ? BlazeMomentsAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG : blazeMomentsAdsConfigType, (i & 1024) != 0 ? null : blazeMomentsPlaybackConfiguration);
    }

    private final void configureImageViewInAspectRatioWrapper(ConstraintLayout container, ImageView imageView, BlazePlayerDisplayMode displayMode) {
        container.addView(imageView, new tl3(0, 0));
        mm3 mm3Var = new mm3();
        mm3Var.e(container);
        int i = izl.a[displayMode.ordinal()];
        if (i == 1) {
            mm3Var.f(imageView.getId(), 3, 0, 3);
            mm3Var.f(imageView.getId(), 6, 0, 6);
            mm3Var.f(imageView.getId(), 7, 0, 7);
            mm3Var.f(imageView.getId(), 4, 0, 4);
            mm3Var.o(imageView.getId(), "9:16");
            mm3Var.s(imageView.getId());
            imageView.setScaleType(ImageView.ScaleType.FIT_START);
        } else if (i != 2) {
            if (i != 3) {
                zzl.b();
                return;
            }
            mm3Var.f(imageView.getId(), 3, 0, 3);
            mm3Var.f(imageView.getId(), 6, 0, 6);
            mm3Var.f(imageView.getId(), 7, 0, 7);
            mm3Var.f(imageView.getId(), 4, 0, 4);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        mm3Var.a(container);
    }

    private final void configurePlaceholder(rum viewingRecord, com.blaze.blazesdk.features.moments.models.args.b playerArgs) {
        ImageView placeholderImageView = getPlaceholderImageView();
        if (placeholderImageView == null) {
            return;
        }
        if (playerArgs == null) {
            getContainerId();
        } else {
            updatePlaceholderImage(viewingRecord);
            setupPlaceholderClickListener(placeholderImageView, playerArgs);
        }
    }

    public static /* synthetic */ void configurePlaceholder$default(BlazeMomentsInlinePlayer blazeMomentsInlinePlayer, rum rumVar, com.blaze.blazesdk.features.moments.models.args.b bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        blazeMomentsInlinePlayer.configurePlaceholder(rumVar, bVar);
    }

    private final ConstraintLayout createAspectRatioWrapper() {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContainerView().getContext());
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        constraintLayout.setBackgroundColor(this.playerStyle.getBackgroundColor());
        return constraintLayout;
    }

    private final ImageView createPlaceholderImageView() {
        ImageView imageView = new ImageView(getContainerView().getContext());
        imageView.setId(View.generateViewId());
        imageView.setScaleType(ImageView.ScaleType.FIT_START);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createPlayerViewAndAddToWrapper$lambda$2$lambda$0(BlazeMomentsInlinePlayer blazeMomentsInlinePlayer) {
        blazeMomentsInlinePlayer.triggerPlaceholderToPlayerTransition();
        Function0<Unit> function0 = blazeMomentsInlinePlayer.onFirstTimeSlideStarted;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createPlayerViewAndAddToWrapper$lambda$2$lambda$1(BlazeMomentsInlinePlayer blazeMomentsInlinePlayer) {
        Function0<Unit> function0 = blazeMomentsInlinePlayer.onFirstTimeSlideDismissed;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.a;
    }

    public static /* synthetic */ void updateContent$default(BlazeMomentsInlinePlayer blazeMomentsInlinePlayer, BlazeDataSourceType blazeDataSourceType, Boolean bool, BlazeCachingLevel blazeCachingLevel, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, int i, Object obj) {
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
        blazeMomentsInlinePlayer.updateContent(blazeDataSourceType, bool, blazeCachingLevel, blazeMomentsPlayerStyle, blazeMomentsAdsConfigType);
    }

    private final void updatePlaceholderImage(rum viewingRecord) {
        ImageView placeholderImageView = getPlaceholderImageView();
        if (placeholderImageView == null) {
            return;
        }
        Bitmap bitmap = viewingRecord.e;
        if (bitmap != null) {
            placeholderImageView.setImageBitmap(bitmap);
            return;
        }
        String str = viewingRecord.d;
        if (str == null || str.length() == 0) {
            placeholderImageView.setImageDrawable(null);
        } else {
            evl.loadAndCacheImage$default(placeholderImageView, viewingRecord.d, null, null, null, false, null, null, new sx1(0), null, null, null, 1918, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePlaceholderImage$lambda$6(gq5 gq5Var) {
        gq5Var.getClass();
        Function2<Throwable, g0, Unit> globalThrowableCatcher$blazesdk_release = BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release();
        Throwable th = gq5Var.c;
        n nVar = new n();
        nVar.f = th;
        globalThrowableCatcher$blazesdk_release.invoke(th, nVar);
        return Unit.a;
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    public void cleanupContainerResources() {
        INSTANCE.cleanupPerContainerLoadingSynchronization$blazesdk_release(getContainerId());
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    public void configurePlaceholderWithLatestRecord(@NotNull rum viewingRecord) {
        viewingRecord.getClass();
        configurePlaceholder(viewingRecord, getPlayerArgs());
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    public void createOrUpdatePlayerViewArgs(@Nullable String initialItemId, boolean shouldAutoPlayOnStart) {
        BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration = this.momentsPlaybackConfiguration;
        if (blazeMomentsPlaybackConfiguration == null) {
            blazeMomentsPlaybackConfiguration = rsm.c;
        }
        com.blaze.blazesdk.features.moments.models.ui.a p = i2a.p(blazeMomentsPlaybackConfiguration);
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = this.playerStyle;
        String containerId = getContainerId();
        String containerId2 = getContainerId();
        String analyticsLabelExpressionRepresentation$blazesdk_release = this.dataSource.getAnalyticsLabelExpressionRepresentation$blazesdk_release();
        B b = new B(F.INLINE, null, null, null, null, null, 62, null);
        BlazeCachingLevel blazeCachingLevel = this.cachePolicyLevel;
        WidgetType widgetType = null;
        boolean z = false;
        boolean z2 = true;
        setPlayerArgs(new com.blaze.blazesdk.features.moments.models.args.b(blazeMomentsPlayerStyle, containerId, containerId2, analyticsLabelExpressionRepresentation$blazesdk_release, widgetType, b, this.momentsAdsConfigType, initialItemId, z, blazeCachingLevel, z2, getShouldClearRepoAfterSessionEnd(), null, p, 4352, null));
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    @NotNull
    public Pair<ViewGroup, ImageView> createPlaceholderStructure() {
        ConstraintLayout createAspectRatioWrapper = createAspectRatioWrapper();
        ImageView createPlaceholderImageView = createPlaceholderImageView();
        Context context = createPlaceholderImageView.getContext();
        context.getClass();
        configureImageViewInAspectRatioWrapper(createAspectRatioWrapper, createPlaceholderImageView, cnb.i(context) ? BlazePlayerDisplayMode.FIXED_RATIO_9_16 : this.playerStyle.getPlayerDisplayMode());
        return new Pair<>(createAspectRatioWrapper, createPlaceholderImageView);
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    public void createPlayerViewAndAddToWrapper(@NotNull Context context, @NotNull com.blaze.blazesdk.features.moments.models.args.b args, @NotNull u6b lifecycleOwner, @NotNull ttk storeOwner, @NotNull rpl wrapperView) {
        context.getClass();
        args.getClass();
        lifecycleOwner.getClass();
        storeOwner.getClass();
        wrapperView.getClass();
        syl sylVar = new syl(context, args, null, lifecycleOwner, storeOwner, 4, null);
        setPlayerView(sylVar);
        final int i = 0;
        sylVar.setOnFirstTimeSlideStarted(new Function0(this) { // from class: tx1
            public final /* synthetic */ BlazeMomentsInlinePlayer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit createPlayerViewAndAddToWrapper$lambda$2$lambda$0;
                Unit createPlayerViewAndAddToWrapper$lambda$2$lambda$1;
                int i2 = i;
                BlazeMomentsInlinePlayer blazeMomentsInlinePlayer = this.b;
                switch (i2) {
                    case 0:
                        createPlayerViewAndAddToWrapper$lambda$2$lambda$0 = BlazeMomentsInlinePlayer.createPlayerViewAndAddToWrapper$lambda$2$lambda$0(blazeMomentsInlinePlayer);
                        return createPlayerViewAndAddToWrapper$lambda$2$lambda$0;
                    default:
                        createPlayerViewAndAddToWrapper$lambda$2$lambda$1 = BlazeMomentsInlinePlayer.createPlayerViewAndAddToWrapper$lambda$2$lambda$1(blazeMomentsInlinePlayer);
                        return createPlayerViewAndAddToWrapper$lambda$2$lambda$1;
                }
            }
        });
        final int i2 = 1;
        sylVar.setOnFirstTimeSlideDismissed(new Function0(this) { // from class: tx1
            public final /* synthetic */ BlazeMomentsInlinePlayer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit createPlayerViewAndAddToWrapper$lambda$2$lambda$0;
                Unit createPlayerViewAndAddToWrapper$lambda$2$lambda$1;
                int i22 = i2;
                BlazeMomentsInlinePlayer blazeMomentsInlinePlayer = this.b;
                switch (i22) {
                    case 0:
                        createPlayerViewAndAddToWrapper$lambda$2$lambda$0 = BlazeMomentsInlinePlayer.createPlayerViewAndAddToWrapper$lambda$2$lambda$0(blazeMomentsInlinePlayer);
                        return createPlayerViewAndAddToWrapper$lambda$2$lambda$0;
                    default:
                        createPlayerViewAndAddToWrapper$lambda$2$lambda$1 = BlazeMomentsInlinePlayer.createPlayerViewAndAddToWrapper$lambda$2$lambda$1(blazeMomentsInlinePlayer);
                        return createPlayerViewAndAddToWrapper$lambda$2$lambda$1;
                }
            }
        });
        wrapperView.addView(sylVar, new FrameLayout.LayoutParams(-1, -1));
    }

    @Nullable
    public final Function0<Unit> getOnFirstTimeSlideDismissed() {
        return this.onFirstTimeSlideDismissed;
    }

    @Nullable
    public final Function0<Unit> getOnFirstTimeSlideStarted() {
        return this.onFirstTimeSlideStarted;
    }

    public boolean getShouldOrderByReadStatus() {
        return this.shouldOrderByReadStatus;
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    @NotNull
    /* renamed from: getViewingRecordManager$blazesdk_release, reason: from getter */
    public xwm getViewingRecordManager() {
        return this.viewingRecordManager;
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    public void onContainerMiddlemanViewAttached(@NotNull rpl middlemanView, @NotNull u6b lifecycleOwner) {
        middlemanView.getClass();
        lifecycleOwner.getClass();
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    public void onContainerMiddlemanViewDetached(@NotNull rpl middlemanView) {
        middlemanView.getClass();
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    @Nullable
    public Object preloadContent(boolean z, @NotNull rq3<? super gfm> rq3Var) {
        return INSTANCE.internalPreloadContent(getContainerId(), this.dataSource, this.cachePolicyLevel, getShouldOrderByReadStatus(), z, this.playerStyle, rq3Var);
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    public void releasePlaceholderResources() {
        ImageView placeholderImageView = getPlaceholderImageView();
        if (placeholderImageView != null) {
            placeholderImageView.setImageDrawable(null);
        }
    }

    public final void setOnFirstTimeSlideDismissed(@Nullable Function0<Unit> function0) {
        this.onFirstTimeSlideDismissed = function0;
    }

    public final void setOnFirstTimeSlideStarted(@Nullable Function0<Unit> function0) {
        this.onFirstTimeSlideStarted = function0;
    }

    public void setShouldOrderByReadStatus(boolean z) {
        this.shouldOrderByReadStatus = z;
    }

    @Keep
    public final void updateContent(@Nullable BlazeDataSourceType dataSourceType, @Nullable Boolean shouldOrderMomentsByReadStatus, @Nullable BlazeCachingLevel cachePolicyLevel, @Nullable BlazeMomentsPlayerStyle style, @Nullable BlazeMomentsAdsConfigType adsConfigType) {
        erm ermVar = getModeManager().a;
        disposeContainer();
        if (dataSourceType != null) {
            this.dataSource = dataSourceType;
        }
        if (shouldOrderMomentsByReadStatus != null) {
            setShouldOrderByReadStatus(shouldOrderMomentsByReadStatus.booleanValue());
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
        int ordinal = ermVar.ordinal();
        if (ordinal == 1) {
            embedPlaceholder();
        } else {
            if (ordinal != 2) {
                return;
            }
            embedPlayer(true);
        }
    }

    @Keep
    public final void updatePlaybackConfiguration(@Nullable BlazeMomentsPlaybackConfiguration playbackConfiguration) {
        syl playerView = getPlayerView();
        if (playerView != null) {
            if (playbackConfiguration == null) {
                try {
                    playbackConfiguration = rsm.c;
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                    return;
                }
            }
            ((sqm) playerView.getViewModel()).y0 = i2a.p(playbackConfiguration);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/blaze/blazesdk/features/moments/inline/BlazeMomentsInlinePlayer$Companion;", "", "<init>", "()V", "", "containerId", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "dataSource", "", "shouldOrderMomentsByReadStatus", "La9m;", "", "Lcom/blaze/blazesdk/features/moments/models/ui/MomentModel;", "fetchMoments", "(Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;ZLrq3;)Ljava/lang/Object;", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "cachePolicyLevel", "shouldPrefetchBeforePlaying", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "playerStyle", "Lgfm;", "internalPreloadContent", "(Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;ZZLcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lrq3;)Ljava/lang/Object;", "shouldOrderContentsByReadStatus", "", "prepareMoments", "(Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;ZLcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;)V", "cleanupPerContainerLoadingSynchronization$blazesdk_release", "(Ljava/lang/String;)V", "cleanupPerContainerLoadingSynchronization", "TAG", "Ljava/lang/String;", "Lza4;", "contentLoadingCoordinator", "Lza4;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        public final Object internalPreloadContent(String str, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, boolean z, boolean z2, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, rq3<? super gfm> rq3Var) {
            try {
                com.blaze.blazesdk.data_source.a.validate$default(blazeDataSourceType, ogm.CONTAINER, false, 2, null);
                return BlazeMomentsInlinePlayer.contentLoadingCoordinator.a(str, new a(str, blazeDataSourceType, z, z2, blazeMomentsPlayerStyle, blazeCachingLevel, null), rq3Var);
            } catch (Throwable th) {
                j1m j1mVar = j1m.a;
                m0 m0Var = new m0();
                m0Var.f = th;
                m0Var.b(th.getMessage());
                j1m.a(m0Var);
                return m0Var;
            }
        }

        public static /* synthetic */ void prepareMoments$default(Companion companion, String str, BlazeDataSourceType blazeDataSourceType, boolean z, BlazeCachingLevel blazeCachingLevel, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            if ((i & 8) != 0) {
                blazeCachingLevel = BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release();
            }
            companion.prepareMoments(str, blazeDataSourceType, z, blazeCachingLevel);
        }

        public final void cleanupPerContainerLoadingSynchronization$blazesdk_release(@NotNull String containerId) {
            containerId.getClass();
            za4 za4Var = BlazeMomentsInlinePlayer.contentLoadingCoordinator;
            za4Var.getClass();
            za4Var.a.remove(containerId);
            ln2 ln2Var = (ln2) za4Var.b.remove(containerId);
            if (ln2Var != null) {
                ln2Var.r(null);
            }
        }

        @Keep
        public final void prepareMoments(@NotNull String containerId, @NotNull BlazeDataSourceType dataSource, boolean shouldOrderContentsByReadStatus, @NotNull BlazeCachingLevel cachePolicyLevel) {
            containerId.getClass();
            dataSource.getClass();
            cachePolicyLevel.getClass();
            if (com.blaze.blazesdk.data_source.a.b(dataSource)) {
                evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new b(containerId, dataSource, cachePolicyLevel, shouldOrderContentsByReadStatus, null), 1, null);
                return;
            }
            j1m j1mVar = j1m.a;
            l0 l0Var = new l0();
            l0Var.b("Preparing is not supported when using " + dataSource + ". You need to proceed to play the content directly.");
            j1m.a(l0Var);
        }

        private Companion() {
        }

        @Keep
        public final void prepareMoments(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, boolean z) {
            str.getClass();
            blazeDataSourceType.getClass();
            prepareMoments$default(this, str, blazeDataSourceType, z, null, 8, null);
        }

        @Keep
        public final void prepareMoments(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType) {
            str.getClass();
            blazeDataSourceType.getClass();
            prepareMoments$default(this, str, blazeDataSourceType, false, null, 12, null);
        }
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    @NotNull
    public BlazePlayerInContainerDelegate getPlayerDelegate() {
        return this.playerDelegate;
    }

    private final void handlePlaceholderClicked(com.blaze.blazesdk.features.moments.models.args.b playerArgs) {
    }

    private final void setupPlaceholderClickListener(ImageView imageView, com.blaze.blazesdk.features.moments.models.args.b playerArgs) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsInlinePlayer(@NotNull u6b u6bVar, @NotNull ttk ttkVar, @NotNull FrameLayout frameLayout, @NotNull String str, boolean z, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate) {
        this(u6bVar, ttkVar, frameLayout, str, z, blazeDataSourceType, null, blazePlayerInContainerDelegate, null, null, null, 1856, null);
        u6bVar.getClass();
        ttkVar.getClass();
        frameLayout.getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        blazePlayerInContainerDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsInlinePlayer(@NotNull u6b u6bVar, @NotNull ttk ttkVar, @NotNull FrameLayout frameLayout, @NotNull String str, boolean z, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate) {
        this(u6bVar, ttkVar, frameLayout, str, z, blazeDataSourceType, blazeMomentsPlayerStyle, blazePlayerInContainerDelegate, null, null, null, 1792, null);
        u6bVar.getClass();
        ttkVar.getClass();
        frameLayout.getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazePlayerInContainerDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsInlinePlayer(@NotNull u6b u6bVar, @NotNull ttk ttkVar, @NotNull FrameLayout frameLayout, @NotNull String str, boolean z, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, @NotNull BlazeCachingLevel blazeCachingLevel) {
        this(u6bVar, ttkVar, frameLayout, str, z, blazeDataSourceType, blazeMomentsPlayerStyle, blazePlayerInContainerDelegate, blazeCachingLevel, null, null, 1536, null);
        u6bVar.getClass();
        ttkVar.getClass();
        frameLayout.getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazePlayerInContainerDelegate.getClass();
        blazeCachingLevel.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsInlinePlayer(@NotNull u6b u6bVar, @NotNull ttk ttkVar, @NotNull FrameLayout frameLayout, @NotNull String str, boolean z, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType) {
        this(u6bVar, ttkVar, frameLayout, str, z, blazeDataSourceType, blazeMomentsPlayerStyle, blazePlayerInContainerDelegate, blazeCachingLevel, blazeMomentsAdsConfigType, null, 1024, null);
        u6bVar.getClass();
        ttkVar.getClass();
        frameLayout.getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazePlayerInContainerDelegate.getClass();
        blazeCachingLevel.getClass();
        blazeMomentsAdsConfigType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsInlinePlayer(@NotNull u6b u6bVar, @NotNull ttk ttkVar, @NotNull FrameLayout frameLayout, @NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate) {
        this(u6bVar, ttkVar, frameLayout, str, false, blazeDataSourceType, null, blazePlayerInContainerDelegate, null, null, null, 1872, null);
        u6bVar.getClass();
        ttkVar.getClass();
        frameLayout.getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        blazePlayerInContainerDelegate.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsInlinePlayer(@NotNull u6b u6bVar, @NotNull ttk ttkVar, @NotNull FrameLayout frameLayout, @NotNull String str, boolean z, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, @Nullable BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        super(frameLayout, str, u6bVar, ttkVar);
        u6bVar.getClass();
        ttkVar.getClass();
        frameLayout.getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazePlayerInContainerDelegate.getClass();
        blazeCachingLevel.getClass();
        blazeMomentsAdsConfigType.getClass();
        this.dataSource = blazeDataSourceType;
        this.momentsPlayerStyle = blazeMomentsPlayerStyle;
        this.playerDelegate = blazePlayerInContainerDelegate;
        this.cachePolicyLevel = blazeCachingLevel;
        this.momentsAdsConfigType = blazeMomentsAdsConfigType;
        this.momentsPlaybackConfiguration = blazeMomentsPlaybackConfiguration;
        this.shouldOrderByReadStatus = z;
        this.playerStyle = (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(blazeMomentsPlayerStyle);
        this.viewingRecordManager = new xwm(str, gum.b);
    }
}
