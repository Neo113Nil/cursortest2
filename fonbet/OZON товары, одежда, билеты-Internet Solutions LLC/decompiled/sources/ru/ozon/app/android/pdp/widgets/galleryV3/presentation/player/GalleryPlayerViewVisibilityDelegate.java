package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player;

import Sc.InterfaceC4008j;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryPlayerViewVisibilityDelegate;", "", "<init>", "()V", "Landroidx/media3/ui/PlayerView;", "playerView", "", "onBindPlayerView", "(Landroidx/media3/ui/PlayerView;)V", "onRenderedFirstFrame", "clear", "Landroidx/media3/ui/PlayerView;", "", "isSurfaceCreated", "Z", "Ljava/lang/Runnable;", "checkSurfaceCreatedRunnable$delegate", "LSc/j;", "getCheckSurfaceCreatedRunnable", "()Ljava/lang/Runnable;", "checkSurfaceCreatedRunnable", "Landroid/view/SurfaceHolder$Callback2;", "surfaceHolderCallback$delegate", "getSurfaceHolderCallback", "()Landroid/view/SurfaceHolder$Callback2;", "surfaceHolderCallback", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryPlayerViewVisibilityDelegate {
    private boolean isSurfaceCreated;
    private PlayerView playerView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: checkSurfaceCreatedRunnable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j checkSurfaceCreatedRunnable = DelegatesKt.lazyUnsafe(new GalleryPlayerViewVisibilityDelegate$checkSurfaceCreatedRunnable$2(this));

    /* renamed from: surfaceHolderCallback$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j surfaceHolderCallback = DelegatesKt.lazyUnsafe(new GalleryPlayerViewVisibilityDelegate$surfaceHolderCallback$2(this));

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryPlayerViewVisibilityDelegate$Companion;", "", "<init>", "()V", "CHECK_SURFACE_CREATED_FALLBACK_DELAY", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final Runnable getCheckSurfaceCreatedRunnable() {
        return (Runnable) this.checkSurfaceCreatedRunnable.getValue();
    }

    private final SurfaceHolder.Callback2 getSurfaceHolderCallback() {
        return (SurfaceHolder.Callback2) this.surfaceHolderCallback.getValue();
    }

    public final void clear() {
        PlayerView playerView = this.playerView;
        View t2 = playerView != null ? playerView.t() : null;
        if (t2 instanceof SurfaceView) {
            ((SurfaceView) t2).getHolder().removeCallback(getSurfaceHolderCallback());
        }
        PlayerView playerView2 = this.playerView;
        if (playerView2 != null) {
            playerView2.removeCallbacks(getCheckSurfaceCreatedRunnable());
        }
        this.isSurfaceCreated = false;
        this.playerView = null;
    }

    public final void onBindPlayerView(@NotNull PlayerView playerView) {
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        View t2 = playerView.t();
        if (t2 instanceof SurfaceView) {
            ViewExtKt.invisible(playerView);
            this.playerView = playerView;
            ((SurfaceView) t2).getHolder().addCallback(getSurfaceHolderCallback());
            playerView.postDelayed(getCheckSurfaceCreatedRunnable(), 500L);
        }
    }

    public final void onRenderedFirstFrame() {
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            ViewExtKt.show(playerView);
        }
        clear();
    }
}
