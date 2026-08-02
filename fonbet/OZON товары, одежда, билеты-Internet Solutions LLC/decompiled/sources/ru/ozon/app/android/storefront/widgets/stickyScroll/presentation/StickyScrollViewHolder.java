package ru.ozon.app.android.storefront.widgets.stickyScroll.presentation;

import Ez.ViewOnClickListenerC2978b;
import Hy.RunnableC3170a;
import IC.b;
import W10.c;
import WZ.t;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.databinding.WidgetStickyScrollBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 -2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001-B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010,\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)¨\u0006."}, d2 = {"Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "bindDynamicParameters", "(Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollVO;)V", "bindStaticParameters", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/databinding/WidgetStickyScrollBinding;", "binding", "Lru/ozon/app/android/storefront/databinding/WidgetStickyScrollBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/os/Handler;", "forcedScrollHandler", "Landroid/os/Handler;", "Landroid/animation/AnimatorSet;", "scaleDownAnimatorSet", "Landroid/animation/AnimatorSet;", "removeTextAnimatorSet", "moveIconAnimatorSet", "shrinkAnimSet", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StickyScrollViewHolder extends k<StickyScrollVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetStickyScrollBinding binding;

    @NotNull
    private final Handler forcedScrollHandler;

    @NotNull
    private final AnimatorSet moveIconAnimatorSet;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final AnimatorSet removeTextAnimatorSet;

    @NotNull
    private final AnimatorSet scaleDownAnimatorSet;

    @NotNull
    private final AnimatorSet shrinkAnimSet;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyScrollViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
        WidgetStickyScrollBinding bind = WidgetStickyScrollBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.forcedScrollHandler = new Handler(Looper.getMainLooper());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.storefront.widgets.stickyScroll.presentation.StickyScrollViewHolder$scaleDownAnimatorSet$lambda$2$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                WidgetStickyScrollBinding widgetStickyScrollBinding;
                widgetStickyScrollBinding = StickyScrollViewHolder.this.binding;
                TextView stickyText = widgetStickyScrollBinding.stickyText;
                Intrinsics.checkNotNullExpressionValue(stickyText, "stickyText");
                ViewExtKt.gone(stickyText);
            }
        });
        animatorSet.play(ObjectAnimator.ofFloat(bind.getConstraintLayout(), "scaleY", 1.0f, 0.0f)).with(ObjectAnimator.ofFloat(bind.getConstraintLayout(), "scaleX", 1.0f, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.storefront.widgets.stickyScroll.presentation.StickyScrollViewHolder$scaleDownAnimatorSet$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                WidgetStickyScrollBinding widgetStickyScrollBinding;
                widgetStickyScrollBinding = StickyScrollViewHolder.this.binding;
                LinearLayout constraintLayout = widgetStickyScrollBinding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                ViewExtKt.gone(constraintLayout);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        this.scaleDownAnimatorSet = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ObjectAnimator.ofFloat(bind.stickyText, "translationX", 200.0f));
        animatorSet2.setDuration(100L);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.storefront.widgets.stickyScroll.presentation.StickyScrollViewHolder$removeTextAnimatorSet$lambda$6$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                WidgetStickyScrollBinding widgetStickyScrollBinding;
                widgetStickyScrollBinding = StickyScrollViewHolder.this.binding;
                TextView textView = widgetStickyScrollBinding.stickyText;
                Intrinsics.f(textView);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = UiExtKt.toDp(0);
                layoutParams.height = UiExtKt.toDp(0);
                textView.setLayoutParams(layoutParams);
                ViewExtKt.gone(textView);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        this.removeTextAnimatorSet = animatorSet2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(ObjectAnimator.ofFloat(bind.fireIv, "translationX", 1.0f));
        animatorSet3.setDuration(100L);
        this.moveIconAnimatorSet = animatorSet3;
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(animatorSet2, animatorSet3);
        this.shrinkAnimSet = animatorSet4;
        LinearLayout constraintLayout = bind.getConstraintLayout();
        constraintLayout.setLayoutTransition(new LayoutTransition());
        constraintLayout.getLayoutTransition().enableTransitionType(3);
        constraintLayout.getLayoutTransition().enableTransitionType(4);
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 != null) {
            J viewLifecycleOwner = c11.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            final AbstractC5434v lifecycle = viewLifecycleOwner.getLifecycle();
            if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
                this.forcedScrollHandler.removeCallbacksAndMessages(null);
            } else {
                lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.widgets.stickyScroll.presentation.StickyScrollViewHolder$lambda$14$lambda$10$$inlined$whenDestroyed$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onDestroy(J owner) {
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        this.forcedScrollHandler.removeCallbacksAndMessages(null);
                        AbstractC5434v.this.e(this);
                    }
                });
            }
        }
        constraintLayout.setOnClickListener(new ViewOnClickListenerC2978b(this, 5));
    }

    private final void bindDynamicParameters(StickyScrollVO item) {
        WidgetStickyScrollBinding widgetStickyScrollBinding = this.binding;
        if (item.getShouldShrink() && !item.getHasShrunk()) {
            this.shrinkAnimSet.start();
            item.setHasShrunk(true);
            return;
        }
        if (item.getShouldBeGone() && !item.getHasGone()) {
            this.scaleDownAnimatorSet.start();
            item.setHasGone(true);
            return;
        }
        if (!item.getShouldShrink() && !item.getShouldBeGone()) {
            this.forcedScrollHandler.postDelayed(new b(widgetStickyScrollBinding, 1), 100L);
            LinearLayout constraintLayout = widgetStickyScrollBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewExtKt.show(constraintLayout);
            item.setHasShrunk(false);
            return;
        }
        if (item.getHasGone()) {
            LinearLayout constraintLayout2 = widgetStickyScrollBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            ViewExtKt.gone(constraintLayout2);
        } else {
            TextView stickyText = widgetStickyScrollBinding.stickyText;
            Intrinsics.checkNotNullExpressionValue(stickyText, "stickyText");
            ViewExtKt.gone(stickyText);
            LinearLayout constraintLayout3 = widgetStickyScrollBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "getRoot(...)");
            ViewExtKt.show(constraintLayout3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindDynamicParameters$lambda$18$lambda$17(WidgetStickyScrollBinding widgetStickyScrollBinding) {
        TextView stickyText = widgetStickyScrollBinding.stickyText;
        Intrinsics.checkNotNullExpressionValue(stickyText, "stickyText");
        ViewExtKt.show(stickyText);
        TextView stickyText2 = widgetStickyScrollBinding.stickyText;
        Intrinsics.checkNotNullExpressionValue(stickyText2, "stickyText");
        ViewGroup.LayoutParams layoutParams = stickyText2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        stickyText2.setLayoutParams(layoutParams);
        widgetStickyScrollBinding.stickyText.setTranslationY(0.0f);
        widgetStickyScrollBinding.stickyText.setTranslationX(0.0f);
    }

    private final void bindStaticParameters(StickyScrollVO item) {
        WidgetStickyScrollBinding widgetStickyScrollBinding = this.binding;
        IconView fireIv = widgetStickyScrollBinding.fireIv;
        Intrinsics.checkNotNullExpressionValue(fireIv, "fireIv");
        IconHolderKt.bind$default(fireIv, item.getIcon(), null, 2, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        String backgroundColor = item.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.BG_ACTION_PRIMARY.getToken();
        }
        Integer mapColor = styleParser.mapColor(context, backgroundColor);
        if (mapColor != null) {
            int intValue = mapColor.intValue();
            Drawable background = widgetStickyScrollBinding.getConstraintLayout().getBackground();
            Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            Drawable mutate = ((GradientDrawable) background).mutate();
            Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
            ColorStateList colorStateList = a.getColorStateList(widgetStickyScrollBinding.getConstraintLayout().getContext(), intValue);
            Intrinsics.g(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) mutate).setColor(colorStateList);
        }
        widgetStickyScrollBinding.stickyText.setText(item.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$14$lambda$13(StickyScrollViewHolder stickyScrollViewHolder, View view) {
        stickyScrollViewHolder.shrinkAnimSet.start();
        stickyScrollViewHolder.forcedScrollHandler.postDelayed(new RunnableC3170a(stickyScrollViewHolder, 2), 400L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$14$lambda$13$lambda$12(StickyScrollViewHolder stickyScrollViewHolder) {
        StickyScrollVO boundedData = stickyScrollViewHolder.getBoundedData();
        if (boundedData != null) {
            stickyScrollViewHolder.actionHandler.invoke(boundedData.getAction());
            boundedData.setHasShrunk(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull StickyScrollVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindStaticParameters(item);
        bindDynamicParameters(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull StickyScrollVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((StickyScrollViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
