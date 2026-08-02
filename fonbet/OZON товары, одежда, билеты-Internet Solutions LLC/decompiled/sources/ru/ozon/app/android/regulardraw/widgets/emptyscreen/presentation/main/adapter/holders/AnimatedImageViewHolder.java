package ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter.holders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import jk0.j;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.regulardraw.R$drawable;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.AnimatedImageDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/AnimatedImageViewHolder;", "Ljk0/j;", "Landroid/view/View;", "containerView", "Landroidx/appcompat/widget/AppCompatImageView;", "raysView", "glowView", "starsView", "prizeView", "<init>", "(Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;)V", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/AnimatedImageDTO;", "item", "", "bind", "(Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/AnimatedImageDTO;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/AnimationManager;", "animationManager", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/AnimationManager;", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnimatedImageViewHolder extends j {

    @NotNull
    private final AnimationManager animationManager;

    @NotNull
    private final AppCompatImageView glowView;

    @NotNull
    private final ImageSize imageSize;

    @NotNull
    private final AppCompatImageView prizeView;

    @NotNull
    private final AppCompatImageView raysView;

    @NotNull
    private final AppCompatImageView starsView;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/AnimatedImageViewHolder$Companion;", "", "<init>", "()V", "FIGMA_SCREEN_WIDTH_PX", "", "PRIZE_VIEW_SCALE", "create", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/AnimatedImageViewHolder;", "context", "Landroid/content/Context;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AnimatedImageViewHolder create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int i11 = context.getResources().getDisplayMetrics().widthPixels;
            int i12 = (int) (i11 * 0.67948717f);
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i11);
            layoutParams.gravity = 17;
            appCompatImageView.setLayoutParams(layoutParams);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
            appCompatImageView.setScaleType(scaleType);
            appCompatImageView.setImageResource(R$drawable.prize_rays);
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i11);
            layoutParams2.gravity = 17;
            appCompatImageView2.setLayoutParams(layoutParams2);
            appCompatImageView2.setScaleType(scaleType);
            appCompatImageView2.setImageResource(R$drawable.prize_stars);
            AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i12, i12);
            layoutParams3.gravity = 17;
            appCompatImageView3.setLayoutParams(layoutParams3);
            appCompatImageView3.setScaleType(scaleType);
            AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i11, i11);
            layoutParams4.gravity = 17;
            appCompatImageView4.setLayoutParams(layoutParams4);
            appCompatImageView4.setScaleType(scaleType);
            appCompatImageView4.setImageResource(R$drawable.prize_glow);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new RecyclerView.p(-1, i12));
            frameLayout.addView(appCompatImageView);
            frameLayout.addView(appCompatImageView4);
            frameLayout.addView(appCompatImageView3);
            frameLayout.addView(appCompatImageView2);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            return new AnimatedImageViewHolder(frameLayout, appCompatImageView, appCompatImageView4, appCompatImageView2, appCompatImageView3);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedImageViewHolder(@NotNull View containerView, @NotNull AppCompatImageView raysView, @NotNull AppCompatImageView glowView, @NotNull AppCompatImageView starsView, @NotNull AppCompatImageView prizeView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(raysView, "raysView");
        Intrinsics.checkNotNullParameter(glowView, "glowView");
        Intrinsics.checkNotNullParameter(starsView, "starsView");
        Intrinsics.checkNotNullParameter(prizeView, "prizeView");
        this.raysView = raysView;
        this.glowView = glowView;
        this.starsView = starsView;
        this.prizeView = prizeView;
        this.animationManager = new AnimationManager(raysView, glowView, prizeView, starsView);
        this.imageSize = new ImageSize(prizeView.getLayoutParams().width, prizeView.getLayoutParams().height);
    }

    public final void bind(@NotNull AnimatedImageDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.animationManager.resetAnimation();
        ImageViewExtKt.load$default(this.prizeView, item.getImageUrl(), C7714v.a0(item.getFitType() == AnimatedImageDTO.FitType.FIT_CENTER ? ImageTransformation.FitCenter.INSTANCE : ImageTransformation.CenterCrop.INSTANCE), new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter.holders.AnimatedImageViewHolder$bind$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                AnimationManager animationManager;
                animationManager = AnimatedImageViewHolder.this.animationManager;
                animationManager.startAnimation();
            }
        }, null, this.imageSize, false, null, 104, null);
    }
}
