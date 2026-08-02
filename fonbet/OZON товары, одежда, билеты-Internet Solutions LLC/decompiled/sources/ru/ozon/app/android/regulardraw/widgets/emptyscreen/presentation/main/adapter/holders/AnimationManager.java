package ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter.holders;

import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\f\u0010\u000e\u001a\u00020\f*\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/AnimationManager;", "", "raysView", "Landroidx/appcompat/widget/AppCompatImageView;", "glowView", "prizeView", "starsView", "<init>", "(Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;)V", "interpolator", "Landroid/view/animation/DecelerateInterpolator;", "resetAnimation", "", "startAnimation", "setupAndStart", "Landroid/view/ViewPropertyAnimator;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnimationManager {

    @NotNull
    private final AppCompatImageView glowView;

    @NotNull
    private final DecelerateInterpolator interpolator;

    @NotNull
    private final AppCompatImageView prizeView;

    @NotNull
    private final AppCompatImageView raysView;

    @NotNull
    private final AppCompatImageView starsView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/AnimationManager$Companion;", "", "<init>", "()V", "ANIMATION_DURATION", "", "ANIMATION_DELAY", "RAYS_START_SCALE", "", "RAYS_START_ROTATION", "RAYS_START_ALPHA", "RAYS_END_ROTATION", "GLOW_START_ALPHA", "PRIZE_START_SCALE", "PRIZE_START_ROTATION", "PRIZE_START_ALPHA", "STARS_START_SCALE", "STARS_START_ROTATION", "STARS_START_ALPHA", "END_SCALE", "END_ALPHA", "END_ROTATION", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AnimationManager(@NotNull AppCompatImageView raysView, @NotNull AppCompatImageView glowView, @NotNull AppCompatImageView prizeView, @NotNull AppCompatImageView starsView) {
        Intrinsics.checkNotNullParameter(raysView, "raysView");
        Intrinsics.checkNotNullParameter(glowView, "glowView");
        Intrinsics.checkNotNullParameter(prizeView, "prizeView");
        Intrinsics.checkNotNullParameter(starsView, "starsView");
        this.raysView = raysView;
        this.glowView = glowView;
        this.prizeView = prizeView;
        this.starsView = starsView;
        this.interpolator = new DecelerateInterpolator();
    }

    private final void setupAndStart(ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.setStartDelay(100L).setDuration(750L).setInterpolator(this.interpolator).start();
    }

    public final void resetAnimation() {
        AppCompatImageView appCompatImageView = this.raysView;
        appCompatImageView.setScaleX(0.5f);
        appCompatImageView.setScaleY(0.5f);
        appCompatImageView.setRotation(0.0f);
        appCompatImageView.setAlpha(0.0f);
        this.glowView.setAlpha(0.0f);
        AppCompatImageView appCompatImageView2 = this.prizeView;
        appCompatImageView2.setScaleX(0.26f);
        appCompatImageView2.setScaleY(0.26f);
        appCompatImageView2.setRotation(-24.0f);
        appCompatImageView2.setAlpha(0.0f);
        AppCompatImageView appCompatImageView3 = this.starsView;
        appCompatImageView3.setScaleX(0.5f);
        appCompatImageView3.setScaleY(0.5f);
        appCompatImageView3.setRotation(-24.0f);
        appCompatImageView3.setAlpha(0.0f);
    }

    public final void startAnimation() {
        ViewPropertyAnimator alpha = this.raysView.animate().scaleX(1.0f).scaleY(1.0f).rotation(-114.0f).alpha(1.0f);
        Intrinsics.checkNotNullExpressionValue(alpha, "alpha(...)");
        setupAndStart(alpha);
        ViewPropertyAnimator alpha2 = this.glowView.animate().alpha(1.0f);
        Intrinsics.checkNotNullExpressionValue(alpha2, "alpha(...)");
        setupAndStart(alpha2);
        ViewPropertyAnimator alpha3 = this.prizeView.animate().scaleX(1.0f).scaleY(1.0f).rotation(0.0f).alpha(1.0f);
        Intrinsics.checkNotNullExpressionValue(alpha3, "alpha(...)");
        setupAndStart(alpha3);
        ViewPropertyAnimator alpha4 = this.starsView.animate().scaleX(1.0f).scaleY(1.0f).rotation(0.0f).alpha(1.0f);
        Intrinsics.checkNotNullExpressionValue(alpha4, "alpha(...)");
        setupAndStart(alpha4);
    }
}
