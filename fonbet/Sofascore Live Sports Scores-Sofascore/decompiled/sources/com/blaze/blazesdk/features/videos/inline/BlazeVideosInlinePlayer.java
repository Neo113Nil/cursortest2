package com.blaze.blazesdk.features.videos.inline;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazePlayerInInlineDelegate;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.features.videos.models.ui.a;
import com.blaze.blazesdk.features.videos.models.ui.e;
import com.blaze.blazesdk.features.videos.models.ui.g;
import com.blaze.blazesdk.features.videos.models.ui.h;
import com.blaze.blazesdk.features.videos.players.ui.VideosPlayerActivity;
import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import com.blaze.blazesdk.players.inline.contracts.BlazePlayerFullScreenContract;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.shared.results.l0;
import com.blaze.blazesdk.shared.results.m0;
import com.blaze.blazesdk.shared.results.n;
import com.blaze.blazesdk.style.players.videos.BlazeVideosInlineInteractivePlayerStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosInlinePreviewPlayerStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import defpackage.a9m;
import defpackage.evl;
import defpackage.fsl;
import defpackage.gfm;
import defpackage.gq5;
import defpackage.j1m;
import defpackage.ln2;
import defpackage.mm3;
import defpackage.n0n;
import defpackage.ogm;
import defpackage.qbm;
import defpackage.qh;
import defpackage.qom;
import defpackage.rpl;
import defpackage.rq3;
import defpackage.rum;
import defpackage.sx1;
import defpackage.tl3;
import defpackage.ttk;
import defpackage.u6b;
import defpackage.w3m;
import defpackage.xwm;
import defpackage.yx1;
import defpackage.za4;
import defpackage.zzl;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 o2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0006:\u0002poB_\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u0013H\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b&\u0010'J7\u0010,\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010+\u001a\u00020\"H\u0014¢\u0006\u0004\b,\u0010-J\u001b\u00101\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u001f2\u0006\u00104\u001a\u000203H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001fH\u0014¢\u0006\u0004\b7\u00108J$\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050;0:2\u0006\u00109\u001a\u00020\u0013H\u0094@¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001fH\u0014¢\u0006\u0004\b>\u00108J\u000f\u0010?\u001a\u00020\u001fH\u0017¢\u0006\u0004\b?\u00108J\u000f\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u000200H\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u000200H\u0002¢\u0006\u0004\bG\u0010HJ#\u0010J\u001a\u00020\u001f2\u0006\u00104\u001a\u0002032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u001f2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\bL\u00106J!\u0010M\u001a\u00020\u001f2\u0006\u0010F\u001a\u0002002\b\u0010I\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bM\u0010NJ!\u0010Q\u001a\u00020\u001f2\u0006\u0010P\u001a\u00020O2\b\u0010I\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bQ\u0010RJ'\u0010U\u001a\u00020\u001f2\u0006\u0010P\u001a\u00020O2\u0006\u0010T\u001a\u00020S2\u0006\u0010I\u001a\u00020\u0004H\u0002¢\u0006\u0004\bU\u0010VJ\u0013\u0010X\u001a\u00020W*\u00020\u0011H\u0002¢\u0006\u0004\bX\u0010YR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010ZR\u001a\u0010\u0016\u001a\u00020\u00158\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b\\\u0010]R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010^R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010_R\u001a\u0010`\u001a\u00020\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010g\u001a\u00020f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010n\u001a\u00020k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006q"}, d2 = {"Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer;", "Lcom/blaze/blazesdk/players/inline/BlazeBaseInlinePlayerContainer;", "Lw3m;", "Lcom/blaze/blazesdk/features/videos/players/ui/a;", "Lcom/blaze/blazesdk/features/videos/models/args/b;", "Lcom/blaze/blazesdk/features/videos/models/ui/VideoModel;", "Lcom/blaze/blazesdk/players/inline/contracts/BlazePlayerFullScreenContract;", "Lu6b;", "lifecycleOwner", "Lttk;", "storeOwner", "Landroid/widget/FrameLayout;", "containerView", "", "containerId", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "dataSource", "Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode;", "playerMode", "", "shouldOrderContentsByReadStatus", "Lcom/blaze/blazesdk/delegates/BlazePlayerInInlineDelegate;", "playerDelegate", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "cachePolicyLevel", "Lcom/blaze/blazesdk/ads/models/ui/BlazeVideosAdsConfigType;", "videosAdsConfigType", "<init>", "(Lu6b;Lttk;Landroid/widget/FrameLayout;Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode;ZLcom/blaze/blazesdk/delegates/BlazePlayerInInlineDelegate;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Lcom/blaze/blazesdk/ads/models/ui/BlazeVideosAdsConfigType;)V", "initialItemId", "shouldAutoPlayOnStart", "", "createOrUpdatePlayerViewArgs", "(Ljava/lang/String;Z)V", "Lrpl;", "middlemanView", "onContainerMiddlemanViewAttached", "(Lrpl;Lu6b;)V", "onContainerMiddlemanViewDetached", "(Lrpl;)V", "Landroid/content/Context;", "context", "args", "wrapperView", "createPlayerViewAndAddToWrapper", "(Landroid/content/Context;Lcom/blaze/blazesdk/features/videos/models/args/b;Lu6b;Lttk;Lrpl;)V", "Lkotlin/Pair;", "Landroid/view/ViewGroup;", "Landroid/widget/ImageView;", "createPlaceholderStructure", "()Lkotlin/Pair;", "Lrum;", "viewingRecord", "configurePlaceholderWithLatestRecord", "(Lrum;)V", "releasePlaceholderResources", "()V", "shouldPrefetchBeforePlaying", "Lgfm;", "", "preloadContent", "(ZLrq3;)Ljava/lang/Object;", "cleanupContainerResources", "enterFullScreen", "Landroidx/constraintlayout/widget/ConstraintLayout;", "createAspectRatioWrapper", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "createPlaceholderImageView", "()Landroid/widget/ImageView;", "container", "imageView", "configureImageViewInAspectRatioWrapper", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;)V", "playerArgs", "configurePlaceholder", "(Lrum;Lcom/blaze/blazesdk/features/videos/models/args/b;)V", "updatePlaceholderImage", "setupPlaceholderClickListener", "(Landroid/widget/ImageView;Lcom/blaze/blazesdk/features/videos/models/args/b;)V", "Landroid/view/View;", "sourceView", "handlePlaceholderClicked", "(Landroid/view/View;Lcom/blaze/blazesdk/features/videos/models/args/b;)V", "Lcom/blaze/blazesdk/features/videos/models/ui/a$c;", "originatedFrom", "launchFullscreenPlayer", "(Landroid/view/View;Lcom/blaze/blazesdk/features/videos/models/ui/a$c;Lcom/blaze/blazesdk/features/videos/models/args/b;)V", "Lcom/blaze/blazesdk/features/videos/models/ui/a;", "toInternalPresentationModeWithDefaultState", "(Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode;)Lcom/blaze/blazesdk/features/videos/models/ui/a;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "Lcom/blaze/blazesdk/delegates/BlazePlayerInInlineDelegate;", "getPlayerDelegate", "()Lcom/blaze/blazesdk/delegates/BlazePlayerInInlineDelegate;", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "Lcom/blaze/blazesdk/ads/models/ui/BlazeVideosAdsConfigType;", "shouldOrderByReadStatus", "Z", "getShouldOrderByReadStatus", "()Z", "internalPlayerPresentationMode", "Lcom/blaze/blazesdk/features/videos/models/ui/a;", "Lxwm;", "viewingRecordManager", "Lxwm;", "getViewingRecordManager$blazesdk_release", "()Lxwm;", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "getPlayerStyle", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "playerStyle", "Companion", "PlayerMode", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeVideosInlinePlayer extends BlazeBaseInlinePlayerContainer<w3m, com.blaze.blazesdk.features.videos.players.ui.a, com.blaze.blazesdk.features.videos.models.args.b, VideoModel> implements BlazePlayerFullScreenContract {

    @NotNull
    private static final String TAG = "InlineVideoPlayerContainer";

    @NotNull
    private BlazeCachingLevel cachePolicyLevel;

    @NotNull
    private BlazeDataSourceType dataSource;

    @NotNull
    private com.blaze.blazesdk.features.videos.models.ui.a internalPlayerPresentationMode;

    @NotNull
    private final BlazePlayerInInlineDelegate playerDelegate;
    private final boolean shouldOrderByReadStatus;

    @NotNull
    private BlazeVideosAdsConfigType videosAdsConfigType;

    @NotNull
    private final xwm viewingRecordManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final za4 contentLoadingCoordinator = new za4();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeVideosInlinePlayer(@NotNull u6b u6bVar, @NotNull ttk ttkVar, @NotNull FrameLayout frameLayout, @NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull PlayerMode playerMode, boolean z, @NotNull BlazePlayerInInlineDelegate blazePlayerInInlineDelegate, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeVideosAdsConfigType blazeVideosAdsConfigType) {
        super(frameLayout, str, u6bVar, ttkVar);
        u6bVar.getClass();
        ttkVar.getClass();
        frameLayout.getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        playerMode.getClass();
        blazePlayerInInlineDelegate.getClass();
        blazeCachingLevel.getClass();
        blazeVideosAdsConfigType.getClass();
        this.dataSource = blazeDataSourceType;
        this.playerDelegate = blazePlayerInInlineDelegate;
        this.cachePolicyLevel = blazeCachingLevel;
        this.videosAdsConfigType = blazeVideosAdsConfigType;
        this.shouldOrderByReadStatus = z;
        this.internalPlayerPresentationMode = toInternalPresentationModeWithDefaultState(playerMode);
        this.viewingRecordManager = new xwm(str, qom.b);
    }

    private final void configureImageViewInAspectRatioWrapper(ConstraintLayout container, ImageView imageView) {
        container.addView(imageView, new tl3(0, 0));
        mm3 mm3Var = new mm3();
        mm3Var.e(container);
        mm3Var.s(imageView.getId());
        mm3Var.j(imageView.getId()).d.w = 0.5f;
        mm3Var.f(imageView.getId(), 3, 0, 3);
        mm3Var.f(imageView.getId(), 6, 0, 6);
        mm3Var.f(imageView.getId(), 7, 0, 7);
        mm3Var.f(imageView.getId(), 4, 0, 4);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        mm3Var.a(container);
    }

    private final void configurePlaceholder(rum viewingRecord, com.blaze.blazesdk.features.videos.models.args.b playerArgs) {
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

    public static /* synthetic */ void configurePlaceholder$default(BlazeVideosInlinePlayer blazeVideosInlinePlayer, rum rumVar, com.blaze.blazesdk.features.videos.models.args.b bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        blazeVideosInlinePlayer.configurePlaceholder(rumVar, bVar);
    }

    private final ConstraintLayout createAspectRatioWrapper() {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContainerView().getContext());
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        constraintLayout.setBackgroundColor(getPlayerStyle().getBackgroundColor());
        return constraintLayout;
    }

    private final ImageView createPlaceholderImageView() {
        ImageView imageView = new ImageView(getContainerView().getContext());
        imageView.setId(View.generateViewId());
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createPlayerViewAndAddToWrapper$lambda$1$lambda$0(rpl rplVar, com.blaze.blazesdk.features.videos.models.args.b bVar, BlazeVideosInlinePlayer blazeVideosInlinePlayer, Context context, u6b u6bVar, ttk ttkVar, B b) {
        b.getClass();
        rplVar.removeAllViews();
        blazeVideosInlinePlayer.createPlayerViewAndAddToWrapper(context, com.blaze.blazesdk.features.videos.models.args.b.copy$default(bVar, null, null, null, null, null, b, null, null, false, null, false, false, false, null, null, 32735, null), u6bVar, ttkVar, rplVar);
        return Unit.a;
    }

    private final BlazeVideosPlayerStyle getPlayerStyle() {
        return h.a(this.internalPlayerPresentationMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePlaceholderClicked(View sourceView, com.blaze.blazesdk.features.videos.models.args.b playerArgs) {
        com.blaze.blazesdk.features.videos.models.ui.a aVar = this.internalPlayerPresentationMode;
        aVar.getClass();
        if (!(aVar instanceof a.b)) {
            if (aVar instanceof a.C0011a) {
                Unit unused = Unit.a;
                return;
            } else if (aVar instanceof a.e) {
                Unit unused2 = Unit.a;
                return;
            } else {
                zzl.b();
                return;
            }
        }
        a.d dVar = ((a.b) aVar).c;
        if (dVar instanceof a.d.C0014a) {
            Unit unused3 = Unit.a;
        } else if (dVar instanceof g) {
            handlePlaceholderClicked$lambda$10(this, playerArgs, sourceView);
        } else {
            zzl.b();
        }
    }

    private static final Unit handlePlaceholderClicked$lambda$10(BlazeVideosInlinePlayer blazeVideosInlinePlayer, com.blaze.blazesdk.features.videos.models.args.b bVar, View view) {
        blazeVideosInlinePlayer.getPlayerDelegate().onPlaceholderClicked(BlazePlayerType.VIDEOS, blazeVideosInlinePlayer.getContainerId());
        Context context = blazeVideosInlinePlayer.getContainerView().getContext();
        if ((context instanceof AppCompatActivity ? (AppCompatActivity) context : null) == null) {
            return null;
        }
        if (bVar != null) {
            blazeVideosInlinePlayer.launchFullscreenPlayer(view, e.a, bVar);
        }
        return Unit.a;
    }

    private final void launchFullscreenPlayer(View sourceView, a.c originatedFrom, com.blaze.blazesdk.features.videos.models.args.b playerArgs) {
        com.blaze.blazesdk.features.videos.models.ui.a a = playerArgs.a.a(originatedFrom);
        VideosPlayerActivity.a aVar = VideosPlayerActivity.u;
        Context context = getContainerView().getContext();
        context.getClass();
        boolean z = false;
        VideosPlayerActivity.a.startScaledUpActivityAndDismissOtherPlayers$default(aVar, context, sourceView, new com.blaze.blazesdk.features.videos.models.args.a(a.a(originatedFrom), playerArgs.b, playerArgs.c, playerArgs.d, playerArgs.e, playerArgs.f, playerArgs.g, playerArgs.h, playerArgs.i, playerArgs.j, z, getShouldClearRepoAfterSessionEnd(), playerArgs.m, null, null, 24576, null), null, 8, null);
    }

    private final void setupPlaceholderClickListener(ImageView imageView, com.blaze.blazesdk.features.videos.models.args.b playerArgs) {
        imageView.setClickable(true);
        imageView.setFocusable(true);
        imageView.setOnClickListener(new qh(8, this, imageView, playerArgs));
    }

    private final com.blaze.blazesdk.features.videos.models.ui.a toInternalPresentationModeWithDefaultState(PlayerMode playerMode) {
        if (!(playerMode instanceof PlayerMode.Preview)) {
            if (!(playerMode instanceof PlayerMode.Interactive)) {
                zzl.b();
                return null;
            }
            PlayerMode.Interactive interactive = (PlayerMode.Interactive) playerMode;
            BlazeVideosInlineInteractivePlayerStyle blazeVideosInlineInteractivePlayerStyle = (BlazeVideosInlineInteractivePlayerStyle) ParcelableExtensionKt.blazeDeepCopy(interactive.getInteractivePlayerStyle());
            blazeVideosInlineInteractivePlayerStyle.getClass();
            BlazeVideosPlayerStyle base = BlazeVideosPlayerStyle.INSTANCE.base();
            base.setHeadingText(blazeVideosInlineInteractivePlayerStyle.getHeadingText());
            base.setBackgroundColor(blazeVideosInlineInteractivePlayerStyle.getBackgroundColor());
            base.setSeekBar(blazeVideosInlineInteractivePlayerStyle.getSeekBar());
            BlazeVideosPlayerButtonsStyle buttons = base.getButtons();
            buttons.setMute(blazeVideosInlineInteractivePlayerStyle.getButtons().getMute());
            buttons.setShare(blazeVideosInlineInteractivePlayerStyle.getButtons().getShare());
            buttons.setLike(blazeVideosInlineInteractivePlayerStyle.getButtons().getLike());
            buttons.setPlayPause(blazeVideosInlineInteractivePlayerStyle.getButtons().getPlayPause());
            buttons.setPrevious(blazeVideosInlineInteractivePlayerStyle.getButtons().getPrevious());
            buttons.setNext(blazeVideosInlineInteractivePlayerStyle.getButtons().getNext());
            buttons.setFullScreen(blazeVideosInlineInteractivePlayerStyle.getButtons().getFullScreen());
            buttons.setReplay(blazeVideosInlineInteractivePlayerStyle.getButtons().getReplay());
            buttons.setCaptions(blazeVideosInlineInteractivePlayerStyle.getButtons().getCaptions$blazesdk_release());
            buttons.setSettings$blazesdk_release(blazeVideosInlineInteractivePlayerStyle.getButtons().getSettings$blazesdk_release());
            BlazeVideosPlayerButtonStyle.INSTANCE.getClass();
            BlazeVideosPlayerButtonStyle b = BlazeVideosPlayerButtonStyle.Companion.b();
            b.setVisible(false);
            buttons.setExit(b);
            BlazeVideosPlayerButtonStyle b2 = BlazeVideosPlayerButtonStyle.Companion.b();
            b2.setVisible(false);
            buttons.setForceRotation(b2);
            BlazeVideosPlayerButtonStyle b3 = BlazeVideosPlayerButtonStyle.Companion.b();
            b3.setVisible(false);
            buttons.setPip(b3);
            base.getCast().setVisible(false);
            BlazeVideosPlayerStyle fullScreenPlayerStyle = interactive.getFullScreenPlayerStyle();
            if (fullScreenPlayerStyle == null) {
                fullScreenPlayerStyle = n0n.b;
            }
            return new a.C0011a(base, fullScreenPlayerStyle, g.a);
        }
        PlayerMode.Preview preview = (PlayerMode.Preview) playerMode;
        BlazeVideosInlinePreviewPlayerStyle blazeVideosInlinePreviewPlayerStyle = (BlazeVideosInlinePreviewPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(preview.getPreviewPlayerStyle());
        blazeVideosInlinePreviewPlayerStyle.getClass();
        BlazeVideosPlayerStyle base2 = BlazeVideosPlayerStyle.INSTANCE.base();
        base2.getHeadingText().setVisible(false);
        base2.getSeekBar().setVisible(false);
        BlazeVideosPlayerButtonsStyle buttons2 = base2.getButtons();
        buttons2.setMute(blazeVideosInlinePreviewPlayerStyle.getButtons().getMute());
        buttons2.setReplay(blazeVideosInlinePreviewPlayerStyle.getButtons().getReplay());
        BlazeVideosPlayerButtonStyle.INSTANCE.getClass();
        BlazeVideosPlayerButtonStyle b4 = BlazeVideosPlayerButtonStyle.Companion.b();
        b4.setVisible(false);
        buttons2.setExit(b4);
        BlazeVideosPlayerButtonStyle b5 = BlazeVideosPlayerButtonStyle.Companion.b();
        b5.setVisible(false);
        buttons2.setShare(b5);
        BlazeVideosPlayerButtonStyle b6 = BlazeVideosPlayerButtonStyle.Companion.b();
        b6.setVisible(false);
        buttons2.setLike(b6);
        BlazeVideosPlayerButtonStyle b7 = BlazeVideosPlayerButtonStyle.Companion.b();
        b7.setVisible(false);
        buttons2.setPlayPause(b7);
        BlazeVideosPlayerButtonStyle b8 = BlazeVideosPlayerButtonStyle.Companion.b();
        b8.setVisible(false);
        buttons2.setPrevious(b8);
        BlazeVideosPlayerButtonStyle b9 = BlazeVideosPlayerButtonStyle.Companion.b();
        b9.setVisible(false);
        buttons2.setNext(b9);
        BlazeVideosPlayerButtonStyle b10 = BlazeVideosPlayerButtonStyle.Companion.b();
        b10.setVisible(false);
        buttons2.setFullScreen(b10);
        BlazeVideosPlayerButtonStyle b11 = BlazeVideosPlayerButtonStyle.Companion.b();
        b11.setVisible(false);
        buttons2.setCaptions(b11);
        BlazeVideosPlayerButtonStyle b12 = BlazeVideosPlayerButtonStyle.Companion.b();
        b12.setVisible(false);
        buttons2.setSettings$blazesdk_release(b12);
        BlazeVideosPlayerButtonStyle b13 = BlazeVideosPlayerButtonStyle.Companion.b();
        b13.setVisible(false);
        buttons2.setForceRotation(b13);
        BlazeVideosPlayerButtonStyle b14 = BlazeVideosPlayerButtonStyle.Companion.b();
        b14.setVisible(false);
        buttons2.setPip(b14);
        base2.getCast().setVisible(false);
        BlazeVideosPlayerStyle fullScreenPlayerStyle2 = preview.getFullScreenPlayerStyle();
        if (fullScreenPlayerStyle2 == null) {
            fullScreenPlayerStyle2 = n0n.b;
        }
        return new a.b(base2, fullScreenPlayerStyle2, g.a);
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
            evl.loadAndCacheImage$default(placeholderImageView, viewingRecord.d, null, null, null, false, null, null, new sx1(23), null, null, null, 1918, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePlaceholderImage$lambda$5(gq5 gq5Var) {
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
        String containerId = getContainerId();
        String containerId2 = getContainerId();
        String analyticsLabelExpressionRepresentation$blazesdk_release = this.dataSource.getAnalyticsLabelExpressionRepresentation$blazesdk_release();
        B b = new B(F.INLINE, null, null, null, null, null, 62, null);
        BlazeCachingLevel blazeCachingLevel = this.cachePolicyLevel;
        WidgetType widgetType = null;
        boolean z = false;
        boolean z2 = true;
        setPlayerArgs(new com.blaze.blazesdk.features.videos.models.args.b(this.internalPlayerPresentationMode, containerId, containerId2, analyticsLabelExpressionRepresentation$blazesdk_release, widgetType, b, this.videosAdsConfigType, initialItemId, z, blazeCachingLevel, z2, getShouldClearRepoAfterSessionEnd(), shouldAutoPlayOnStart, null, null, 24832, null));
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    @NotNull
    public Pair<ViewGroup, ImageView> createPlaceholderStructure() {
        ConstraintLayout createAspectRatioWrapper = createAspectRatioWrapper();
        ImageView createPlaceholderImageView = createPlaceholderImageView();
        configureImageViewInAspectRatioWrapper(createAspectRatioWrapper, createPlaceholderImageView);
        return new Pair<>(createAspectRatioWrapper, createPlaceholderImageView);
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    public void createPlayerViewAndAddToWrapper(@NotNull Context context, @NotNull com.blaze.blazesdk.features.videos.models.args.b args, @NotNull u6b lifecycleOwner, @NotNull ttk storeOwner, @NotNull rpl wrapperView) {
        context.getClass();
        args.getClass();
        lifecycleOwner.getClass();
        storeOwner.getClass();
        wrapperView.getClass();
        com.blaze.blazesdk.features.videos.players.ui.a aVar = new com.blaze.blazesdk.features.videos.players.ui.a(context, args, null, lifecycleOwner, storeOwner, 4, null);
        setPlayerView(aVar);
        aVar.setNotifyOnFullScreenDismissal(new yx1(wrapperView, args, this, context, lifecycleOwner, storeOwner, 0));
        wrapperView.addView(aVar, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.blaze.blazesdk.players.inline.contracts.BlazePlayerFullScreenContract
    @Keep
    public void enterFullScreen() {
        com.blaze.blazesdk.features.videos.players.ui.a playerView = getPlayerView();
        if (playerView != null) {
            playerView.M();
        }
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
        return INSTANCE.internalPreloadContent(getContainerId(), this.dataSource, this.cachePolicyLevel, getShouldOrderByReadStatus(), z, rq3Var);
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    public void releasePlaceholderResources() {
        ImageView placeholderImageView = getPlaceholderImageView();
        if (placeholderImageView != null) {
            placeholderImageView.setImageDrawable(null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJD\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$Companion;", "", "<init>", "()V", "", "containerId", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "dataSource", "", "shouldOrderVideosByReadStatus", "La9m;", "", "Lcom/blaze/blazesdk/features/videos/models/ui/VideoModel;", "fetchVideos", "(Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;ZLrq3;)Ljava/lang/Object;", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "cachePolicyLevel", "shouldPrefetchBeforePlaying", "Lgfm;", "internalPreloadContent", "(Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;ZZLrq3;)Ljava/lang/Object;", "shouldOrderContentsByReadStatus", "", "prepareVideos", "(Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;ZLcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;)V", "cleanupPerContainerLoadingSynchronization$blazesdk_release", "(Ljava/lang/String;)V", "cleanupPerContainerLoadingSynchronization", "TAG", "Ljava/lang/String;", "Lza4;", "contentLoadingCoordinator", "Lza4;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object fetchVideos(String str, BlazeDataSourceType blazeDataSourceType, boolean z, rq3<? super a9m> rq3Var) {
            qom qomVar = qom.b;
            if (fsl.hasDataSourceChanged$default(qomVar, str, blazeDataSourceType, z, str, null, null, 48, null)) {
                return fsl.getVideos$default(qomVar, blazeDataSourceType, str, str, false, z, null, null, null, rq3Var, 232, null);
            }
            qomVar.getClass();
            List l = qom.l(str);
            return l.isEmpty() ? fsl.getVideos$default(qomVar, blazeDataSourceType, str, str, false, z, null, null, null, rq3Var, 232, null) : new qbm(l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object internalPreloadContent(String str, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, boolean z, boolean z2, rq3<? super gfm> rq3Var) {
            try {
                com.blaze.blazesdk.data_source.a.validate$default(blazeDataSourceType, ogm.CONTAINER, false, 2, null);
                return BlazeVideosInlinePlayer.contentLoadingCoordinator.a(str, new a(str, blazeDataSourceType, z, z2, blazeCachingLevel, null), rq3Var);
            } catch (Throwable th) {
                j1m j1mVar = j1m.a;
                m0 m0Var = new m0();
                m0Var.f = th;
                m0Var.b(th.getMessage());
                j1m.a(m0Var);
                return m0Var;
            }
        }

        public static /* synthetic */ void prepareVideos$default(Companion companion, String str, BlazeDataSourceType blazeDataSourceType, boolean z, BlazeCachingLevel blazeCachingLevel, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            if ((i & 8) != 0) {
                blazeCachingLevel = BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release();
            }
            companion.prepareVideos(str, blazeDataSourceType, z, blazeCachingLevel);
        }

        public final void cleanupPerContainerLoadingSynchronization$blazesdk_release(@NotNull String containerId) {
            containerId.getClass();
            za4 za4Var = BlazeVideosInlinePlayer.contentLoadingCoordinator;
            za4Var.getClass();
            za4Var.a.remove(containerId);
            ln2 ln2Var = (ln2) za4Var.b.remove(containerId);
            if (ln2Var != null) {
                ln2Var.r(null);
            }
        }

        @Keep
        public final void prepareVideos(@NotNull String containerId, @NotNull BlazeDataSourceType dataSource, boolean shouldOrderContentsByReadStatus, @NotNull BlazeCachingLevel cachePolicyLevel) {
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
        public final void prepareVideos(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, boolean z) {
            str.getClass();
            blazeDataSourceType.getClass();
            prepareVideos$default(this, str, blazeDataSourceType, z, null, 8, null);
        }

        @Keep
        public final void prepareVideos(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType) {
            str.getClass();
            blazeDataSourceType.getClass();
            prepareVideos$default(this, str, blazeDataSourceType, false, null, 12, null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode;", "", "<init>", "()V", "Preview", "Interactive", "Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode$Interactive;", "Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode$Preview;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PlayerMode {
        public static final int $stable = 0;

        public /* synthetic */ PlayerMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PlayerMode() {
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode$Interactive;", "Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode;", "interactivePlayerStyle", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlineInteractivePlayerStyle;", "fullScreenPlayerStyle", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "<init>", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlineInteractivePlayerStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;)V", "getInteractivePlayerStyle", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlineInteractivePlayerStyle;", "getFullScreenPlayerStyle", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Interactive extends PlayerMode {
            public static final int $stable = 8;

            @Nullable
            private final BlazeVideosPlayerStyle fullScreenPlayerStyle;

            @NotNull
            private final BlazeVideosInlineInteractivePlayerStyle interactivePlayerStyle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Interactive(@NotNull BlazeVideosInlineInteractivePlayerStyle blazeVideosInlineInteractivePlayerStyle, @Nullable BlazeVideosPlayerStyle blazeVideosPlayerStyle) {
                super(null);
                blazeVideosInlineInteractivePlayerStyle.getClass();
                this.interactivePlayerStyle = blazeVideosInlineInteractivePlayerStyle;
                this.fullScreenPlayerStyle = blazeVideosPlayerStyle;
            }

            public static /* synthetic */ Interactive copy$default(Interactive interactive, BlazeVideosInlineInteractivePlayerStyle blazeVideosInlineInteractivePlayerStyle, BlazeVideosPlayerStyle blazeVideosPlayerStyle, int i, Object obj) {
                if ((i & 1) != 0) {
                    blazeVideosInlineInteractivePlayerStyle = interactive.interactivePlayerStyle;
                }
                if ((i & 2) != 0) {
                    blazeVideosPlayerStyle = interactive.fullScreenPlayerStyle;
                }
                return interactive.copy(blazeVideosInlineInteractivePlayerStyle, blazeVideosPlayerStyle);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final BlazeVideosInlineInteractivePlayerStyle getInteractivePlayerStyle() {
                return this.interactivePlayerStyle;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final BlazeVideosPlayerStyle getFullScreenPlayerStyle() {
                return this.fullScreenPlayerStyle;
            }

            @NotNull
            public final Interactive copy(@NotNull BlazeVideosInlineInteractivePlayerStyle interactivePlayerStyle, @Nullable BlazeVideosPlayerStyle fullScreenPlayerStyle) {
                interactivePlayerStyle.getClass();
                return new Interactive(interactivePlayerStyle, fullScreenPlayerStyle);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Interactive)) {
                    return false;
                }
                Interactive interactive = (Interactive) other;
                return Intrinsics.c(this.interactivePlayerStyle, interactive.interactivePlayerStyle) && Intrinsics.c(this.fullScreenPlayerStyle, interactive.fullScreenPlayerStyle);
            }

            @Nullable
            public final BlazeVideosPlayerStyle getFullScreenPlayerStyle() {
                return this.fullScreenPlayerStyle;
            }

            @NotNull
            public final BlazeVideosInlineInteractivePlayerStyle getInteractivePlayerStyle() {
                return this.interactivePlayerStyle;
            }

            public int hashCode() {
                int hashCode = this.interactivePlayerStyle.hashCode() * 31;
                BlazeVideosPlayerStyle blazeVideosPlayerStyle = this.fullScreenPlayerStyle;
                return hashCode + (blazeVideosPlayerStyle == null ? 0 : blazeVideosPlayerStyle.hashCode());
            }

            @NotNull
            public String toString() {
                return "Interactive(interactivePlayerStyle=" + this.interactivePlayerStyle + ", fullScreenPlayerStyle=" + this.fullScreenPlayerStyle + ')';
            }

            public /* synthetic */ Interactive(BlazeVideosInlineInteractivePlayerStyle blazeVideosInlineInteractivePlayerStyle, BlazeVideosPlayerStyle blazeVideosPlayerStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(blazeVideosInlineInteractivePlayerStyle, (i & 2) != 0 ? null : blazeVideosPlayerStyle);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode$Preview;", "Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode;", "previewPlayerStyle", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlinePreviewPlayerStyle;", "fullScreenPlayerStyle", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "<init>", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlinePreviewPlayerStyle;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;)V", "getPreviewPlayerStyle", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlinePreviewPlayerStyle;", "getFullScreenPlayerStyle", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Preview extends PlayerMode {
            public static final int $stable = 8;

            @Nullable
            private final BlazeVideosPlayerStyle fullScreenPlayerStyle;

            @NotNull
            private final BlazeVideosInlinePreviewPlayerStyle previewPlayerStyle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Preview(@NotNull BlazeVideosInlinePreviewPlayerStyle blazeVideosInlinePreviewPlayerStyle, @Nullable BlazeVideosPlayerStyle blazeVideosPlayerStyle) {
                super(null);
                blazeVideosInlinePreviewPlayerStyle.getClass();
                this.previewPlayerStyle = blazeVideosInlinePreviewPlayerStyle;
                this.fullScreenPlayerStyle = blazeVideosPlayerStyle;
            }

            public static /* synthetic */ Preview copy$default(Preview preview, BlazeVideosInlinePreviewPlayerStyle blazeVideosInlinePreviewPlayerStyle, BlazeVideosPlayerStyle blazeVideosPlayerStyle, int i, Object obj) {
                if ((i & 1) != 0) {
                    blazeVideosInlinePreviewPlayerStyle = preview.previewPlayerStyle;
                }
                if ((i & 2) != 0) {
                    blazeVideosPlayerStyle = preview.fullScreenPlayerStyle;
                }
                return preview.copy(blazeVideosInlinePreviewPlayerStyle, blazeVideosPlayerStyle);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final BlazeVideosInlinePreviewPlayerStyle getPreviewPlayerStyle() {
                return this.previewPlayerStyle;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final BlazeVideosPlayerStyle getFullScreenPlayerStyle() {
                return this.fullScreenPlayerStyle;
            }

            @NotNull
            public final Preview copy(@NotNull BlazeVideosInlinePreviewPlayerStyle previewPlayerStyle, @Nullable BlazeVideosPlayerStyle fullScreenPlayerStyle) {
                previewPlayerStyle.getClass();
                return new Preview(previewPlayerStyle, fullScreenPlayerStyle);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Preview)) {
                    return false;
                }
                Preview preview = (Preview) other;
                return Intrinsics.c(this.previewPlayerStyle, preview.previewPlayerStyle) && Intrinsics.c(this.fullScreenPlayerStyle, preview.fullScreenPlayerStyle);
            }

            @Nullable
            public final BlazeVideosPlayerStyle getFullScreenPlayerStyle() {
                return this.fullScreenPlayerStyle;
            }

            @NotNull
            public final BlazeVideosInlinePreviewPlayerStyle getPreviewPlayerStyle() {
                return this.previewPlayerStyle;
            }

            public int hashCode() {
                int hashCode = this.previewPlayerStyle.hashCode() * 31;
                BlazeVideosPlayerStyle blazeVideosPlayerStyle = this.fullScreenPlayerStyle;
                return hashCode + (blazeVideosPlayerStyle == null ? 0 : blazeVideosPlayerStyle.hashCode());
            }

            @NotNull
            public String toString() {
                return "Preview(previewPlayerStyle=" + this.previewPlayerStyle + ", fullScreenPlayerStyle=" + this.fullScreenPlayerStyle + ')';
            }

            public /* synthetic */ Preview(BlazeVideosInlinePreviewPlayerStyle blazeVideosInlinePreviewPlayerStyle, BlazeVideosPlayerStyle blazeVideosPlayerStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(blazeVideosInlinePreviewPlayerStyle, (i & 2) != 0 ? null : blazeVideosPlayerStyle);
            }
        }
    }

    @Override // com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer
    @NotNull
    public BlazePlayerInInlineDelegate getPlayerDelegate() {
        return this.playerDelegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeVideosInlinePlayer(@NotNull u6b u6bVar, @NotNull ttk ttkVar, @NotNull FrameLayout frameLayout, @NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull PlayerMode playerMode, boolean z, @NotNull BlazePlayerInInlineDelegate blazePlayerInInlineDelegate) {
        this(u6bVar, ttkVar, frameLayout, str, blazeDataSourceType, playerMode, z, blazePlayerInInlineDelegate, null, null, 768, null);
        u6bVar.getClass();
        ttkVar.getClass();
        frameLayout.getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        playerMode.getClass();
        blazePlayerInInlineDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeVideosInlinePlayer(@NotNull u6b u6bVar, @NotNull ttk ttkVar, @NotNull FrameLayout frameLayout, @NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull PlayerMode playerMode, boolean z, @NotNull BlazePlayerInInlineDelegate blazePlayerInInlineDelegate, @NotNull BlazeCachingLevel blazeCachingLevel) {
        this(u6bVar, ttkVar, frameLayout, str, blazeDataSourceType, playerMode, z, blazePlayerInInlineDelegate, blazeCachingLevel, null, 512, null);
        u6bVar.getClass();
        ttkVar.getClass();
        frameLayout.getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        playerMode.getClass();
        blazePlayerInInlineDelegate.getClass();
        blazeCachingLevel.getClass();
    }

    public /* synthetic */ BlazeVideosInlinePlayer(u6b u6bVar, ttk ttkVar, FrameLayout frameLayout, String str, BlazeDataSourceType blazeDataSourceType, PlayerMode playerMode, boolean z, BlazePlayerInInlineDelegate blazePlayerInInlineDelegate, BlazeCachingLevel blazeCachingLevel, BlazeVideosAdsConfigType blazeVideosAdsConfigType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(u6bVar, ttkVar, frameLayout, str, blazeDataSourceType, playerMode, (i & 64) != 0 ? true : z, blazePlayerInInlineDelegate, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release() : blazeCachingLevel, (i & 512) != 0 ? BlazeVideosAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG : blazeVideosAdsConfigType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeVideosInlinePlayer(@NotNull u6b u6bVar, @NotNull ttk ttkVar, @NotNull FrameLayout frameLayout, @NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull PlayerMode playerMode, @NotNull BlazePlayerInInlineDelegate blazePlayerInInlineDelegate) {
        this(u6bVar, ttkVar, frameLayout, str, blazeDataSourceType, playerMode, false, blazePlayerInInlineDelegate, null, null, 832, null);
        u6bVar.getClass();
        ttkVar.getClass();
        frameLayout.getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        playerMode.getClass();
        blazePlayerInInlineDelegate.getClass();
    }
}
