package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.MilesForBuyersCardViewBinder;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.util.MilesForBuyersViewUtilsKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.view.MilesForBuyersView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.app.android.uikit.utils.SimpleAnimatorListener;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00160\u001bj\u0002`\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020\u0016H\u0002J\b\u0010!\u001a\u00020\u0016H\u0002J\u001a\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002J\b\u0010&\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/MilesForBuyersCardViewBinder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/BaseMilesForBuyersViewBinder;", "view", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;)V", "dp1", "", "dp12", "dp16", "dp16F", "", "wobblingOffset", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "animationRunnable", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "prepareViewLayout", "", "bind", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "onViewCompletelyVisible", "onViewDetached", "hideViews", "updateConstraints", "setUpBackground", "backgroundColor", "", "borderColor", "prepareAnimation", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersCardViewBinder implements BaseMilesForBuyersViewBinder {
    private static boolean isAnimationShown;
    private Runnable animationRunnable;
    private final int dp1;
    private final int dp12;
    private final int dp16;
    private final float dp16F;

    @NotNull
    private final MilesForBuyersView view;
    private final float wobblingOffset;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/MilesForBuyersCardViewBinder$Companion;", "", "<init>", "()V", "", "SLIDE_IN_ANIMATION_DURATION_MS", "J", "WOBBLING_1_ANIMATION_DURATION_MS", "WOBBLING_2_ANIMATION_DURATION_MS", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MilesForBuyersCardViewBinder(@NotNull MilesForBuyersView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "<get-context>(...)");
        this.dp1 = ResourceExtKt.toPx(1, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "<get-context>(...)");
        this.dp12 = ResourceExtKt.toPx(12, context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "<get-context>(...)");
        this.dp16 = ResourceExtKt.toPx(16, context3);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "<get-context>(...)");
        this.dp16F = ResourceExtKt.toPxF(16, context4);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "<get-context>(...)");
        this.wobblingOffset = ResourceExtKt.toPxF(9, context5);
    }

    private final Context getContext() {
        return this.view.getContext();
    }

    private final void hideViews() {
        MilesForBuyersView milesForBuyersView = this.view;
        ViewExtKt.gone(milesForBuyersView.getProgressView());
        ViewExtKt.gone(milesForBuyersView.getBackgroundImageIv());
        ViewExtKt.gone(milesForBuyersView.getDescriptionTav());
        ViewExtKt.gone(milesForBuyersView.getSubtitleBadgeBv());
    }

    private final void prepareAnimation() {
        this.animationRunnable = new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.MilesForBuyersCardViewBinder$prepareAnimation$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                MilesForBuyersView milesForBuyersView;
                MilesForBuyersCardViewBinder.Companion unused;
                milesForBuyersView = MilesForBuyersCardViewBinder.this.view;
                final Image imageIv = milesForBuyersView.getImageIv();
                imageIv.setAlpha(0.0f);
                imageIv.setTranslationY(imageIv.getHeight() / 2.0f);
                imageIv.setTranslationZ(-1.0f);
                SimpleAnimatorListener simpleAnimatorListener = new SimpleAnimatorListener(null, null, new MilesForBuyersCardViewBinder$prepareAnimation$1$1$listener$1(imageIv), null, 11, null);
                ViewPropertyAnimator translationY = imageIv.animate().setDuration(600L).setInterpolator(new LinearInterpolator()).alpha(1.0f).translationY(0.0f);
                final MilesForBuyersCardViewBinder milesForBuyersCardViewBinder = MilesForBuyersCardViewBinder.this;
                translationY.withEndAction(new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.MilesForBuyersCardViewBinder$prepareAnimation$1$1$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        float f7;
                        Image.this.setTranslationZ(0.0f);
                        ViewPropertyAnimator interpolator = Image.this.animate().setDuration(700L).setInterpolator(new DecelerateInterpolator());
                        f7 = milesForBuyersCardViewBinder.wobblingOffset;
                        ViewPropertyAnimator translationY2 = interpolator.translationY(f7);
                        final Image image = Image.this;
                        translationY2.withEndAction(new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.MilesForBuyersCardViewBinder$prepareAnimation$1$1$1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Image.this.animate().setDuration(450L).translationY(0.0f).start();
                            }
                        }).start();
                    }
                }).setListener(simpleAnimatorListener).start();
                unused = MilesForBuyersCardViewBinder.Companion;
                MilesForBuyersCardViewBinder.isAnimationShown = true;
                MilesForBuyersCardViewBinder.this.animationRunnable = null;
            }
        };
    }

    private final void setUpBackground(String backgroundColor, String borderColor) {
        final MilesForBuyersView milesForBuyersView = this.view;
        View backgroundView = milesForBuyersView.getBackgroundView();
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = milesForBuyersView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, backgroundColor, UniColors.CLEAR_LIGHT_KEY_0.getResId());
        Context context2 = milesForBuyersView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        backgroundView.setBackground(roundedBackgroundProducer.produce(parseColor, styleParser.parseColor(context2, borderColor), this.dp1, this.dp16F));
        Image imageIv = milesForBuyersView.getImageIv();
        if (!imageIv.isLaidOut() || imageIv.isLayoutRequested()) {
            imageIv.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.MilesForBuyersCardViewBinder$setUpBackground$lambda$5$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ViewExtensionsKt.safeUpdateMargins$default(MilesForBuyersView.this.getBackgroundView(), Integer.valueOf(view.getHeight() / 2), null, null, null, 14, null);
                }
            });
        } else {
            ViewExtensionsKt.safeUpdateMargins$default(milesForBuyersView.getBackgroundView(), Integer.valueOf(imageIv.getHeight() / 2), null, null, null, 14, null);
        }
    }

    private final void updateConstraints() {
        MilesForBuyersView milesForBuyersView = this.view;
        ConstraintLayoutExtensionsKt.clearConstraints(milesForBuyersView);
        d dVar = new d();
        dVar.p(milesForBuyersView);
        ConstraintLayoutExtensionsKt.startToParent(dVar, milesForBuyersView.getBackgroundView());
        ConstraintLayoutExtensionsKt.endToParent(dVar, milesForBuyersView.getBackgroundView());
        ConstraintLayoutExtensionsKt.topToParent(dVar, milesForBuyersView.getBackgroundView());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, milesForBuyersView.getBackgroundView());
        ConstraintLayoutExtensionsKt.startToParent(dVar, milesForBuyersView.getImageIv(), this.dp16);
        ConstraintLayoutExtensionsKt.endToParent(dVar, milesForBuyersView.getImageIv(), this.dp16);
        ConstraintLayoutExtensionsKt.topToParent(dVar, milesForBuyersView.getImageIv());
        ConstraintLayoutExtensionsKt.startToParent(dVar, milesForBuyersView.getTitleTav(), this.dp16);
        ConstraintLayoutExtensionsKt.endToParent(dVar, milesForBuyersView.getTitleTav(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, milesForBuyersView.getTitleTav(), milesForBuyersView.getImageIv());
        ConstraintLayoutExtensionsKt.startToParent(dVar, milesForBuyersView.getSubtitleTav(), this.dp16);
        ConstraintLayoutExtensionsKt.endToParent(dVar, milesForBuyersView.getSubtitleTav(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, milesForBuyersView.getSubtitleTav(), milesForBuyersView.getTitleTav());
        ConstraintLayoutExtensionsKt.startToParent(dVar, milesForBuyersView.getButtonBv(), this.dp16);
        ConstraintLayoutExtensionsKt.endToParent(dVar, milesForBuyersView.getButtonBv(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, milesForBuyersView.getButtonBv(), milesForBuyersView.getSubtitleTav(), this.dp12);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, milesForBuyersView.getButtonBv(), this.dp16);
        dVar.f(milesForBuyersView);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.BaseMilesForBuyersViewBinder
    public void bind(@NotNull MilesForBuyersVO.State state, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        MilesForBuyersView milesForBuyersView = this.view;
        if (state instanceof MilesForBuyersVO.State.CardState) {
            milesForBuyersView.setBackground(null);
            milesForBuyersView.setForeground(null);
            ViewExtKt.show(milesForBuyersView.getBackgroundView());
            MilesForBuyersVO.State.CardState cardState = (MilesForBuyersVO.State.CardState) state;
            ImageHolderKt.bindOrGone$default(milesForBuyersView.getImageIv(), cardState.getImage(), null, 2, null);
            TextHolderKt.bindOrGone$default(milesForBuyersView.getTitleTav(), cardState.getTitle(), null, 2, null);
            MilesForBuyersViewUtilsKt.undoMovementMethod(milesForBuyersView.getTitleTav());
            TextHolderKt.bindOrGone$default(milesForBuyersView.getSubtitleTav(), cardState.getSubtitle(), null, 2, null);
            MilesForBuyersViewUtilsKt.undoMovementMethod(milesForBuyersView.getSubtitleTav());
            ButtonV3HolderKt.bindOrGone(milesForBuyersView.getButtonBv(), cardState.getActionButton(), onAction);
            setUpBackground(cardState.getBackgroundColor(), cardState.getBorderColor());
            if (!cardState.getWithAnimation() || isAnimationShown) {
                return;
            }
            prepareAnimation();
        }
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.BaseMilesForBuyersViewBinder
    public void onViewCompletelyVisible() {
        Runnable runnable = this.animationRunnable;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.BaseMilesForBuyersViewBinder
    public void onViewDetached() {
        this.view.getImageIv().animate().cancel();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.BaseMilesForBuyersViewBinder
    public void prepareViewLayout() {
        updateConstraints();
        hideViews();
    }
}
