package ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel;

import W10.c;
import WZ.l;
import WZ.t;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.PaddingsUtilsKt;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010\u001fJ#\u0010'\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%H\u0014¢\u0006\u0004\b'\u0010(J)\u0010-\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardView;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "widgetBackgroundColor", "", "setBackground", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardView;Ljava/lang/String;)V", "", "spanIndex", "setPaddings", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardView;I)V", "", "isIdle", "onFrameScrollStateChanged", "(Z)V", "position", "onFrameSelected", "(I)V", "setFrameIndicatorShowOrGone", "restartAnimation", "()V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardView;", "getContainerView", "()Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardView;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "currentFramePosition", "I", "Landroid/animation/ValueAnimator;", "frameAnimation", "Landroid/animation/ValueAnimator;", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselFramesAdapter;", "framesAdapter", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselFramesAdapter;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselCardViewHolder extends k<CarouselCardVO> {

    @NotNull
    private final CarouselCardView containerView;
    private int currentFramePosition;

    @NotNull
    private final ValueAnimator frameAnimation;

    @NotNull
    private final CarouselFramesAdapter framesAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<Boolean, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, CarouselCardViewHolder.class, "onFrameScrollStateChanged", "onFrameScrollStateChanged(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            ((CarouselCardViewHolder) this.receiver).onFrameScrollStateChanged(z11);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardViewHolder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Integer, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, CarouselCardViewHolder.class, "onFrameSelected", "onFrameSelected(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11) {
            ((CarouselCardViewHolder) this.receiver).onFrameSelected(i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselCardViewHolder(@NotNull CarouselCardView containerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardViewHolder$frameAnimation$lambda$1$$inlined$doOnRepeat$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
                int i11;
                int i12;
                List<CarouselCardVO.Banner> banners;
                CarouselCardViewHolder carouselCardViewHolder = CarouselCardViewHolder.this;
                i11 = carouselCardViewHolder.currentFramePosition;
                int i13 = i11 + 1;
                CarouselCardVO boundData = CarouselCardViewHolder.this.getBoundData();
                carouselCardViewHolder.currentFramePosition = i13 % ((boundData == null || (banners = boundData.getBanners()) == null) ? 0 : banners.size());
                CarouselCardView containerView2 = CarouselCardViewHolder.this.getContainerView();
                i12 = CarouselCardViewHolder.this.currentFramePosition;
                containerView2.swipeFrameTo(i12);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        this.frameAnimation = ofFloat;
        CarouselFramesAdapter carouselFramesAdapter = new CarouselFramesAdapter(new ActionHandler.Builder(references, this).buildHandler(), new CarouselCardViewHolder$framesAdapter$1(ofFloat), new CarouselCardViewHolder$framesAdapter$2(this), tokenizedAnalytics);
        this.framesAdapter = carouselFramesAdapter;
        containerView.initFrameRecyclerView(carouselFramesAdapter, new AnonymousClass1(this), new AnonymousClass2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrameScrollStateChanged(boolean isIdle) {
        if (!isIdle && this.frameAnimation.isRunning()) {
            this.frameAnimation.pause();
        } else if (isIdle && this.frameAnimation.isPaused()) {
            this.frameAnimation.resume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrameSelected(int position) {
        setFrameIndicatorShowOrGone(position);
        if (position != this.currentFramePosition) {
            this.currentFramePosition = position;
            restartAnimation();
        }
    }

    private final void restartAnimation() {
        this.frameAnimation.cancel();
        this.frameAnimation.setCurrentFraction(0.0f);
        this.frameAnimation.start();
    }

    private final void setBackground(CarouselCardView carouselCardView, String str) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = carouselCardView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        carouselCardView.setBackgroundColor(styleParser.parseColor(context, str, UniColors.LAYER_FLOOR_1.getResId()));
    }

    private final void setFrameIndicatorShowOrGone(int position) {
        List<CarouselCardVO.Banner> banners;
        CarouselCardVO boundData = getBoundData();
        if (boundData == null || (banners = boundData.getBanners()) == null || banners.isEmpty() || position < 0) {
            return;
        }
        if (position > banners.size() - 1) {
            return;
        }
        ViewExtKt.showOrGone(this.containerView.getFrameIndicatorView(), Boolean.valueOf(banners.get(position).getButton() == null && banners.size() > 1));
    }

    private final void setPaddings(CarouselCardView carouselCardView, int i11) {
        Rect paddings = PaddingsUtilsKt.getPaddings(i11);
        carouselCardView.setPadding(paddings.left, paddings.top, paddings.right, paddings.bottom);
    }

    @NotNull
    public final CarouselCardView getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.frameAnimation.cancel();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        if (this.frameAnimation.isPaused()) {
            this.frameAnimation.resume();
        } else {
            this.frameAnimation.start();
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        this.frameAnimation.pause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CarouselCardVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.currentFramePosition = 0;
        this.frameAnimation.setDuration(item.getBannerDuration());
        CarouselCardView carouselCardView = this.containerView;
        setBackground(carouselCardView, item.getWidgetBackgroundColor());
        setPaddings(carouselCardView, item.getSpanIndex());
        carouselCardView.setup(item.getBanners().size());
        setFrameIndicatorShowOrGone(this.currentFramePosition);
        carouselCardView.setBannerHeight(item.getIsCompactSize());
        this.framesAdapter.setItems(item.getBanners());
        restartAnimation();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CarouselCardVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t widgetTokenizedEvent = item.getWidgetTokenizedEvent();
        if (widgetTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, widgetTokenizedEvent, null, 2, null);
        }
    }
}
