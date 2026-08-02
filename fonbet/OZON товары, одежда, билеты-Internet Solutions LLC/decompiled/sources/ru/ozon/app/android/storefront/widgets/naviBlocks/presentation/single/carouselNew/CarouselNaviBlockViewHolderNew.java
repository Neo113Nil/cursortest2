package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carouselNew;

import android.animation.Animator;
import android.animation.ValueAnimator;
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
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.NaviBlockPositionVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.NaviBlockViewHolderDelegate;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.RoundedCornerVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carousel.CarouselNaviBlockVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carouselNew.CarouselNaviBlockViewHolderNew;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0015J#\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010#\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0011\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carouselNew/CarouselNaviBlockViewHolderNew;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/CarouselNaviBlockVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carouselNew/CarouselViewNew;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carouselNew/CarouselViewNew;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "isIdle", "", "onFrameScrollStateChanged", "(Z)V", "", "position", "onFrameSelected", "(I)V", "restartAnimation", "()V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/CarouselNaviBlockVO;Ll20/d;)V", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/RoundedCornerVO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "bindOuterBackground", "(Ljava/util/List;Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;)V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carouselNew/CarouselViewNew;", "getContainerView", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carouselNew/CarouselViewNew;", "Lru/ozon/app/android/composer/ComposerReferences;", "getReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "currentFramePosition", "I", "Landroid/animation/ValueAnimator;", "frameAnimation", "Landroid/animation/ValueAnimator;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carouselNew/FramesAdapterNew;", "framesAdapter", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carouselNew/FramesAdapterNew;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselNaviBlockViewHolderNew extends k<CarouselNaviBlockVO> {
    private final /* synthetic */ NaviBlockViewHolderDelegate $$delegate_0;

    @NotNull
    private final CarouselViewNew containerView;
    private int currentFramePosition;

    @NotNull
    private final ValueAnimator frameAnimation;

    @NotNull
    private final FramesAdapterNew framesAdapter;

    @NotNull
    private final ComposerReferences references;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carouselNew.CarouselNaviBlockViewHolderNew$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<Boolean, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, CarouselNaviBlockViewHolderNew.class, "onFrameScrollStateChanged", "onFrameScrollStateChanged(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            ((CarouselNaviBlockViewHolderNew) this.receiver).onFrameScrollStateChanged(z11);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carouselNew.CarouselNaviBlockViewHolderNew$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Integer, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, CarouselNaviBlockViewHolderNew.class, "onFrameSelected", "onFrameSelected(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11) {
            ((CarouselNaviBlockViewHolderNew) this.receiver).onFrameSelected(i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselNaviBlockViewHolderNew(@NotNull CarouselViewNew containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.$$delegate_0 = new NaviBlockViewHolderDelegate(containerView);
        this.containerView = containerView;
        this.references = references;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oL.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CarouselNaviBlockViewHolderNew.frameAnimation$lambda$2$lambda$0(CarouselNaviBlockViewHolderNew.this, ofFloat, valueAnimator);
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carouselNew.CarouselNaviBlockViewHolderNew$frameAnimation$lambda$2$$inlined$doOnRepeat$1
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
                List<FrameVO> frames;
                CarouselNaviBlockViewHolderNew carouselNaviBlockViewHolderNew = CarouselNaviBlockViewHolderNew.this;
                i11 = carouselNaviBlockViewHolderNew.currentFramePosition;
                int i13 = i11 + 1;
                CarouselNaviBlockVO boundedData = CarouselNaviBlockViewHolderNew.this.getBoundedData();
                carouselNaviBlockViewHolderNew.currentFramePosition = i13 % ((boundedData == null || (frames = boundedData.getFrames()) == null) ? 0 : frames.size());
                CarouselViewNew containerView2 = CarouselNaviBlockViewHolderNew.this.getContainerView();
                i12 = CarouselNaviBlockViewHolderNew.this.currentFramePosition;
                containerView2.swipeFrameTo(i12);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        this.frameAnimation = ofFloat;
        FramesAdapterNew framesAdapterNew = new FramesAdapterNew(new ActionHandler.Builder(references, this).buildHandler(), references, new CarouselNaviBlockViewHolderNew$framesAdapter$1(ofFloat), new CarouselNaviBlockViewHolderNew$framesAdapter$2(this));
        this.framesAdapter = framesAdapterNew;
        containerView.initFrameRecyclerView(framesAdapterNew, new AnonymousClass1(this), new AnonymousClass2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void frameAnimation$lambda$2$lambda$0(CarouselNaviBlockViewHolderNew carouselNaviBlockViewHolderNew, ValueAnimator valueAnimator, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CarouselViewNew carouselViewNew = carouselNaviBlockViewHolderNew.containerView;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        carouselViewNew.setFrameProgress(((Float) animatedValue).floatValue());
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

    public void bindOuterBackground(@NotNull List<? extends RoundedCornerVO> roundedCorners, @NotNull NaviBlockPositionVO position) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(position, "position");
        this.$$delegate_0.bindOuterBackground(roundedCorners, position);
    }

    @NotNull
    public final CarouselViewNew getContainerView() {
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
    public void bind(@NotNull CarouselNaviBlockVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.currentFramePosition = 0;
        this.frameAnimation.setDuration(item.getFrameDuration());
        bindOuterBackground(item.getRoundedCorners(), item.getPosition());
        this.framesAdapter.setItems(item.getFrames());
        this.containerView.setup(item.getFrames().size());
        restartAnimation();
    }
}
