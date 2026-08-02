package ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation;

import Bi.a;
import Hx.ViewOnClickListenerC3169a;
import Hx.b;
import Sc.InterfaceC4008j;
import Sc.k;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import iw.C7231a;
import iw.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchVO;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchViewController;
import ru.ozon.app.android.fresh.main.widgets.header.presentation.IslandDrawable;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010%\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\n0\"¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u001b\u00102\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010;R\u001b\u0010@\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchViewController;", "", "Landroid/widget/FrameLayout;", "containerView", "<init>", "(Landroid/widget/FrameLayout;)V", "", "stickyRoundingColor", "", "isSticky", "", "setStickyBackground", "(Ljava/lang/String;Z)V", "", "topCornerRadius", "bottomCornerRadius", "setCorners", "(FF)V", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$CornersVO;", "corners", "animateCornersChangeSticky", "(Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$CornersVO;)V", "", "top", "bottom", "horizontal", "setPaddings", "(III)V", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$PaddingsVO;", "paddings", "animatePaddingsChangeSticky", "(Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$PaddingsVO;)V", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO;Lkotlin/jvm/functions/Function1;)V", "setLocatorsTags", "(Z)V", "setup", "(Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO;Z)V", "animateSetup", "(Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO;)V", "Landroid/widget/FrameLayout;", "additionalContainer$delegate", "LSc/j;", "getAdditionalContainer", "()Landroid/widget/FrameLayout;", "additionalContainer", "Landroid/view/View;", "stickyBackgroundView$delegate", "getStickyBackgroundView", "()Landroid/view/View;", "stickyBackgroundView", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchView;", "fakeSearchView$delegate", "getFakeSearchView", "()Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchView;", "fakeSearchView", "islandColor$delegate", "getIslandColor", "()I", "islandColor", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FakeSearchViewController {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final TypeEvaluator<Pair<Float, Float>> cornersEvaluator = new c();

    /* renamed from: additionalContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j additionalContainer;

    @NotNull
    private final FrameLayout containerView;

    /* renamed from: fakeSearchView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fakeSearchView;

    /* renamed from: islandColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j islandColor;

    /* renamed from: stickyBackgroundView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j stickyBackgroundView;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchViewController$Companion;", "", "<init>", "()V", "", "NON_STICKY_INPUT_VIEW", "Ljava/lang/String;", "NON_STICKY_INPUT_VIEW_ADDITIONAL", "STICKY_INPUT_VIEW", "STICKY_INPUT_VIEW_ADDITIONAL", "", "ZERO_CORNERS_SIZE", "F", "ZERO_PADDING", "", "CORNERS_ARRAY_SIZE", "I", "", "ANIMATION_DURATION", "J", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FakeSearchViewController(@NotNull FrameLayout containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        this.additionalContainer = k.b(new FakeSearchViewController$additionalContainer$2(this));
        this.stickyBackgroundView = k.b(new FakeSearchViewController$stickyBackgroundView$2(this));
        this.fakeSearchView = k.b(new FakeSearchViewController$fakeSearchView$2(this));
        this.islandColor = k.b(new FakeSearchViewController$islandColor$2(this));
        getAdditionalContainer().addView(getFakeSearchView());
        containerView.addView(getStickyBackgroundView());
        containerView.addView(getAdditionalContainer());
    }

    private final void animateCornersChangeSticky(FakeSearchVO.CornersVO corners) {
        ValueAnimator ofObject = ValueAnimator.ofObject(cornersEvaluator, new Pair(Float.valueOf(0.0f), Float.valueOf(corners.getBottom())), new Pair(Float.valueOf(corners.getTopSticky()), Float.valueOf(corners.getBottomSticky())));
        ofObject.addUpdateListener(new C7231a(this, 0));
        ofObject.setDuration(250L);
        ofObject.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateCornersChangeSticky$lambda$5$lambda$4(FakeSearchViewController fakeSearchViewController, ValueAnimator valueAnimator) {
        Pair pair = (Pair) a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Pair<kotlin.Float, kotlin.Float>");
        fakeSearchViewController.setCorners(((Number) pair.a()).floatValue(), ((Number) pair.b()).floatValue());
    }

    private final void animatePaddingsChangeSticky(final FakeSearchVO.PaddingsVO paddings) {
        ValueAnimator ofInt = ValueAnimator.ofInt(paddings.getHorizontal(), paddings.getHorizontalSticky());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: iw.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FakeSearchViewController.animatePaddingsChangeSticky$lambda$7$lambda$6(FakeSearchViewController.this, paddings, valueAnimator);
            }
        });
        ofInt.setDuration(250L);
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animatePaddingsChangeSticky$lambda$7$lambda$6(FakeSearchViewController fakeSearchViewController, FakeSearchVO.PaddingsVO paddingsVO, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int top = paddingsVO.getTop();
        int bottom = paddingsVO.getBottom();
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        fakeSearchViewController.setPaddings(top, bottom, ((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(Function1 function1, FakeSearchVO fakeSearchVO, View view) {
        function1.invoke(fakeSearchVO.getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(Function1 function1, FakeSearchVO fakeSearchVO, View view) {
        function1.invoke(fakeSearchVO.getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair cornersEvaluator$lambda$8(float f7, Pair pair, Pair pair2) {
        float floatValue = ((Number) pair2.e()).floatValue() - ((Number) pair.e()).floatValue();
        return new Pair(Float.valueOf((floatValue * f7) + ((Number) pair.e()).floatValue()), Float.valueOf((f7 * (((Number) pair2.f()).floatValue() - ((Number) pair.f()).floatValue())) + ((Number) pair.f()).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getAdditionalContainer() {
        return (FrameLayout) this.additionalContainer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    private final FakeSearchView getFakeSearchView() {
        return (FakeSearchView) this.fakeSearchView.getValue();
    }

    private final int getIslandColor() {
        return ((Number) this.islandColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getStickyBackgroundView() {
        return (View) this.stickyBackgroundView.getValue();
    }

    private final void setCorners(float topCornerRadius, float bottomCornerRadius) {
        float[] fArr = new float[8];
        int i11 = 0;
        while (i11 < 8) {
            fArr[i11] = i11 < 4 ? topCornerRadius : bottomCornerRadius;
            i11++;
        }
        getAdditionalContainer().setBackground(new IslandDrawable(0, getIslandColor(), fArr, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    private final void setPaddings(int top, int bottom, int horizontal) {
        getAdditionalContainer().setPadding(horizontal, top, horizontal, bottom);
    }

    private final void setStickyBackground(String stickyRoundingColor, final boolean isSticky) {
        getStickyBackgroundView().setBackground(new ColorDrawable(StyleParser.INSTANCE.parseColor(getContext(), stickyRoundingColor, UniColors.WHITE_TRANSPARENT_0.getResId())));
        FrameLayout frameLayout = this.containerView;
        if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchViewController$setStickyBackground$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    View stickyBackgroundView = FakeSearchViewController.this.getStickyBackgroundView();
                    ViewGroup.LayoutParams layoutParams = stickyBackgroundView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = FakeSearchViewController.this.getAdditionalContainer().getHeight() / 2;
                    stickyBackgroundView.setLayoutParams(layoutParams);
                    FakeSearchViewController.this.getStickyBackgroundView().setVisibility(isSticky ? 0 : 8);
                }
            });
            return;
        }
        View stickyBackgroundView = getStickyBackgroundView();
        ViewGroup.LayoutParams layoutParams = stickyBackgroundView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = getAdditionalContainer().getHeight() / 2;
        stickyBackgroundView.setLayoutParams(layoutParams);
        getStickyBackgroundView().setVisibility(isSticky ? 0 : 8);
    }

    public final void animateSetup(@NotNull FakeSearchVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        animateCornersChangeSticky(vo.getCornerRadius());
        animatePaddingsChangeSticky(vo.getPaddings());
        setStickyBackground(vo.getStickyRoundingColor(), true);
    }

    public final void bind(@NotNull FakeSearchVO vo, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        int i11 = 3;
        this.containerView.setOnClickListener(new ViewOnClickListenerC3169a(i11, actionHandler, vo));
        getAdditionalContainer().setOnClickListener(new b(i11, actionHandler, vo));
        getFakeSearchView().bind(vo, actionHandler);
    }

    public final void setLocatorsTags(boolean isSticky) {
        if (isSticky) {
            getFakeSearchView().setContentDescription("fakeSearchStickyInputView");
            getAdditionalContainer().setContentDescription("fakeSearchStickyInputViewAdditional");
        } else {
            getFakeSearchView().setContentDescription("fakeSearchNonStickyInputView");
            getAdditionalContainer().setContentDescription("fakeSearchNonStickyInputViewAdditional");
        }
        getFakeSearchView().setLocatorToText(isSticky);
    }

    public final void setup(@NotNull FakeSearchVO vo, boolean isSticky) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        FakeSearchVO.CornersVO cornerRadius = vo.getCornerRadius();
        float topSticky = isSticky ? cornerRadius.getTopSticky() : cornerRadius.getTop();
        FakeSearchVO.CornersVO cornerRadius2 = vo.getCornerRadius();
        setCorners(topSticky, isSticky ? cornerRadius2.getBottomSticky() : cornerRadius2.getBottom());
        int top = vo.getPaddings().getTop();
        int bottom = vo.getPaddings().getBottom();
        FakeSearchVO.PaddingsVO paddings = vo.getPaddings();
        setPaddings(top, bottom, isSticky ? paddings.getHorizontalSticky() : paddings.getHorizontal());
        setStickyBackground(vo.getStickyRoundingColor(), isSticky);
    }
}
