package com.blaze.blazesdk.features.videos.inline.compose;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazePlayerInInlineDelegate;
import com.blaze.blazesdk.features.videos.inline.BlazeVideosInlinePlayer;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.ironsource.U3;
import defpackage.sx1;
import defpackage.ttk;
import defpackage.u6b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001c\u001a\u00020\u00162\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001a\u0012\u0004\u0012\u00020\u00160\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0016H\u0007¢\u0006\u0004\b$\u0010\u001fJ\u000f\u0010%\u001a\u00020\u0016H\u0007¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010&\u001a\u00020\u0016H\u0007¢\u0006\u0004\b&\u0010\u001fJ\u000f\u0010'\u001a\u00020\u0016H\u0007¢\u0006\u0004\b'\u0010\u001fJ\u000f\u0010(\u001a\u00020\u0016H\u0007¢\u0006\u0004\b(\u0010\u001fJ\u000f\u0010)\u001a\u00020\u0016H\u0007¢\u0006\u0004\b)\u0010\u001fJ\u000f\u0010*\u001a\u00020\u0016H\u0007¢\u0006\u0004\b*\u0010\u001fJ\u000f\u0010+\u001a\u00020\u0016H\u0007¢\u0006\u0004\b+\u0010\u001fJ\u000f\u0010-\u001a\u00020\u0016H\u0000¢\u0006\u0004\b,\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR$\u0010C\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010I\u001a\u0004\u0018\u00010\u00108\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lcom/blaze/blazesdk/features/videos/inline/compose/BlazeVideosInlinePlayerComposeStateHandler;", "", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "dataSource", "Lcom/blaze/blazesdk/delegates/BlazePlayerInInlineDelegate;", "playerDelegate", "", "containerId", "Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode;", "playerMode", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "cachePolicyLevel", "Lcom/blaze/blazesdk/ads/models/ui/BlazeVideosAdsConfigType;", "videosAdsConfigType", "<init>", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/delegates/BlazePlayerInInlineDelegate;Ljava/lang/String;Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Lcom/blaze/blazesdk/ads/models/ui/BlazeVideosAdsConfigType;)V", "Landroid/widget/FrameLayout;", "containerView", "Lu6b;", "lifecycleOwner", "Lttk;", "storeOwner", "", "setContainerView", "(Landroid/widget/FrameLayout;Lu6b;Lttk;)V", "Lkotlin/Function1;", "Lcom/blaze/blazesdk/shared/results/BlazeResult;", "completion", "prepareVideos", "(Lkotlin/jvm/functions/Function1;)V", "embedPlaceholder", "()V", "", "shouldAutoPlayOnStart", "embedPlayer", "(Z)V", "resetToPlaceholder", "disposeContainer", "resumePlayer", "pausePlayer", "blockInteraction", "unblockInteraction", "enterFullScreen", "onVolumeChanged", "clean$blazesdk_release", "clean", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "getDataSource$blazesdk_release", "()Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "setDataSource$blazesdk_release", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;)V", "Lcom/blaze/blazesdk/delegates/BlazePlayerInInlineDelegate;", "getPlayerDelegate$blazesdk_release", "()Lcom/blaze/blazesdk/delegates/BlazePlayerInInlineDelegate;", "Ljava/lang/String;", "getContainerId$blazesdk_release", "()Ljava/lang/String;", "Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode;", "getPlayerMode$blazesdk_release", "()Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer$PlayerMode;", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "getCachePolicyLevel$blazesdk_release", "()Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "Lcom/blaze/blazesdk/ads/models/ui/BlazeVideosAdsConfigType;", "getVideosAdsConfigType$blazesdk_release", "()Lcom/blaze/blazesdk/ads/models/ui/BlazeVideosAdsConfigType;", "Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer;", "videosInlinePlayer", "Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer;", "getVideosInlinePlayer$blazesdk_release", "()Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer;", "setVideosInlinePlayer$blazesdk_release", "(Lcom/blaze/blazesdk/features/videos/inline/BlazeVideosInlinePlayer;)V", U3.i.X, "Landroid/widget/FrameLayout;", "getContainerView$blazesdk_release", "()Landroid/widget/FrameLayout;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeVideosInlinePlayerComposeStateHandler {
    public static final int $stable = 8;

    @NotNull
    private final BlazeCachingLevel cachePolicyLevel;

    @NotNull
    private final String containerId;

    @Nullable
    private FrameLayout containerView;

    @NotNull
    private BlazeDataSourceType dataSource;

    @NotNull
    private final BlazePlayerInInlineDelegate playerDelegate;

    @NotNull
    private final BlazeVideosInlinePlayer.PlayerMode playerMode;

    @NotNull
    private final BlazeVideosAdsConfigType videosAdsConfigType;

    @Nullable
    private BlazeVideosInlinePlayer videosInlinePlayer;

    @Keep
    public BlazeVideosInlinePlayerComposeStateHandler(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInInlineDelegate blazePlayerInInlineDelegate, @NotNull String str, @NotNull BlazeVideosInlinePlayer.PlayerMode playerMode, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeVideosAdsConfigType blazeVideosAdsConfigType) {
        blazeDataSourceType.getClass();
        blazePlayerInInlineDelegate.getClass();
        str.getClass();
        playerMode.getClass();
        blazeCachingLevel.getClass();
        blazeVideosAdsConfigType.getClass();
        this.dataSource = blazeDataSourceType;
        this.playerDelegate = blazePlayerInInlineDelegate;
        this.containerId = str;
        this.playerMode = playerMode;
        this.cachePolicyLevel = blazeCachingLevel;
        this.videosAdsConfigType = blazeVideosAdsConfigType;
    }

    public static /* synthetic */ void embedPlayer$default(BlazeVideosInlinePlayerComposeStateHandler blazeVideosInlinePlayerComposeStateHandler, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        blazeVideosInlinePlayerComposeStateHandler.embedPlayer(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void prepareVideos$default(BlazeVideosInlinePlayerComposeStateHandler blazeVideosInlinePlayerComposeStateHandler, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new sx1(25);
        }
        blazeVideosInlinePlayerComposeStateHandler.prepareVideos(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareVideos$lambda$1(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    @Keep
    public final void blockInteraction() {
        BlazeVideosInlinePlayer blazeVideosInlinePlayer = this.videosInlinePlayer;
        if (blazeVideosInlinePlayer != null) {
            blazeVideosInlinePlayer.blockInteraction();
        }
    }

    public final void clean$blazesdk_release() {
        BlazeVideosInlinePlayer blazeVideosInlinePlayer = this.videosInlinePlayer;
        if (blazeVideosInlinePlayer != null) {
            blazeVideosInlinePlayer.disposeContainer();
        }
        this.videosInlinePlayer = null;
        this.containerView = null;
    }

    @Keep
    public final void disposeContainer() {
        BlazeVideosInlinePlayer blazeVideosInlinePlayer = this.videosInlinePlayer;
        if (blazeVideosInlinePlayer != null) {
            blazeVideosInlinePlayer.disposeContainer();
        }
    }

    @Keep
    public final void embedPlaceholder() {
        BlazeVideosInlinePlayer blazeVideosInlinePlayer = this.videosInlinePlayer;
        if (blazeVideosInlinePlayer != null) {
            blazeVideosInlinePlayer.embedPlaceholder();
        }
    }

    @Keep
    public final void embedPlayer(boolean shouldAutoPlayOnStart) {
        BlazeVideosInlinePlayer blazeVideosInlinePlayer = this.videosInlinePlayer;
        if (blazeVideosInlinePlayer != null) {
            blazeVideosInlinePlayer.embedPlayer(shouldAutoPlayOnStart);
        }
    }

    @Keep
    public final void enterFullScreen() {
        BlazeVideosInlinePlayer blazeVideosInlinePlayer = this.videosInlinePlayer;
        if (blazeVideosInlinePlayer != null) {
            blazeVideosInlinePlayer.enterFullScreen();
        }
    }

    @NotNull
    /* renamed from: getCachePolicyLevel$blazesdk_release, reason: from getter */
    public final BlazeCachingLevel getCachePolicyLevel() {
        return this.cachePolicyLevel;
    }

    @NotNull
    /* renamed from: getContainerId$blazesdk_release, reason: from getter */
    public final String getContainerId() {
        return this.containerId;
    }

    @Nullable
    /* renamed from: getContainerView$blazesdk_release, reason: from getter */
    public final FrameLayout getContainerView() {
        return this.containerView;
    }

    @NotNull
    /* renamed from: getDataSource$blazesdk_release, reason: from getter */
    public final BlazeDataSourceType getDataSource() {
        return this.dataSource;
    }

    @NotNull
    /* renamed from: getPlayerDelegate$blazesdk_release, reason: from getter */
    public final BlazePlayerInInlineDelegate getPlayerDelegate() {
        return this.playerDelegate;
    }

    @NotNull
    /* renamed from: getPlayerMode$blazesdk_release, reason: from getter */
    public final BlazeVideosInlinePlayer.PlayerMode getPlayerMode() {
        return this.playerMode;
    }

    @NotNull
    /* renamed from: getVideosAdsConfigType$blazesdk_release, reason: from getter */
    public final BlazeVideosAdsConfigType getVideosAdsConfigType() {
        return this.videosAdsConfigType;
    }

    @Nullable
    /* renamed from: getVideosInlinePlayer$blazesdk_release, reason: from getter */
    public final BlazeVideosInlinePlayer getVideosInlinePlayer() {
        return this.videosInlinePlayer;
    }

    @Keep
    public final void onVolumeChanged() {
        BlazeVideosInlinePlayer blazeVideosInlinePlayer = this.videosInlinePlayer;
        if (blazeVideosInlinePlayer != null) {
            blazeVideosInlinePlayer.onVolumeChanged();
        }
    }

    @Keep
    public final void pausePlayer() {
        BlazeVideosInlinePlayer blazeVideosInlinePlayer = this.videosInlinePlayer;
        if (blazeVideosInlinePlayer != null) {
            blazeVideosInlinePlayer.pausePlayer();
        }
    }

    @Keep
    public final void prepareVideos(@NotNull Function1<? super BlazeResult<Unit>, Unit> completion) {
        completion.getClass();
        BlazeVideosInlinePlayer.Companion.prepareVideos$default(BlazeVideosInlinePlayer.INSTANCE, this.containerId, this.dataSource, false, this.cachePolicyLevel, 4, null);
    }

    @Keep
    public final void resetToPlaceholder() {
        BlazeVideosInlinePlayer blazeVideosInlinePlayer = this.videosInlinePlayer;
        if (blazeVideosInlinePlayer != null) {
            blazeVideosInlinePlayer.resetToPlaceholder();
        }
    }

    @Keep
    public final void resumePlayer() {
        BlazeVideosInlinePlayer blazeVideosInlinePlayer = this.videosInlinePlayer;
        if (blazeVideosInlinePlayer != null) {
            blazeVideosInlinePlayer.resumePlayer();
        }
    }

    public final void setContainerView(@NotNull FrameLayout containerView, @NotNull u6b lifecycleOwner, @NotNull ttk storeOwner) {
        containerView.getClass();
        lifecycleOwner.getClass();
        storeOwner.getClass();
        FrameLayout frameLayout = this.containerView;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.containerView = containerView;
        this.videosInlinePlayer = new BlazeVideosInlinePlayer(lifecycleOwner, storeOwner, containerView, this.containerId, this.dataSource, this.playerMode, false, this.playerDelegate, this.cachePolicyLevel, this.videosAdsConfigType, 64, null);
        embedPlaceholder();
    }

    public final void setDataSource$blazesdk_release(@NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeDataSourceType.getClass();
        this.dataSource = blazeDataSourceType;
    }

    public final void setVideosInlinePlayer$blazesdk_release(@Nullable BlazeVideosInlinePlayer blazeVideosInlinePlayer) {
        this.videosInlinePlayer = blazeVideosInlinePlayer;
    }

    @Keep
    public final void unblockInteraction() {
        BlazeVideosInlinePlayer blazeVideosInlinePlayer = this.videosInlinePlayer;
        if (blazeVideosInlinePlayer != null) {
            blazeVideosInlinePlayer.unblockInteraction();
        }
    }

    @Keep
    public final void embedPlayer() {
        embedPlayer$default(this, false, 1, null);
    }

    @Keep
    public final void prepareVideos() {
        prepareVideos$default(this, null, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeVideosInlinePlayerComposeStateHandler(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInInlineDelegate blazePlayerInInlineDelegate, @NotNull String str, @NotNull BlazeVideosInlinePlayer.PlayerMode playerMode, @NotNull BlazeCachingLevel blazeCachingLevel) {
        this(blazeDataSourceType, blazePlayerInInlineDelegate, str, playerMode, blazeCachingLevel, null, 32, null);
        blazeDataSourceType.getClass();
        blazePlayerInInlineDelegate.getClass();
        str.getClass();
        playerMode.getClass();
        blazeCachingLevel.getClass();
    }

    public /* synthetic */ BlazeVideosInlinePlayerComposeStateHandler(BlazeDataSourceType blazeDataSourceType, BlazePlayerInInlineDelegate blazePlayerInInlineDelegate, String str, BlazeVideosInlinePlayer.PlayerMode playerMode, BlazeCachingLevel blazeCachingLevel, BlazeVideosAdsConfigType blazeVideosAdsConfigType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(blazeDataSourceType, blazePlayerInInlineDelegate, str, playerMode, blazeCachingLevel, (i & 32) != 0 ? BlazeVideosAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG : blazeVideosAdsConfigType);
    }
}
