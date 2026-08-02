package ru.ozon.fintech.features.camera.ui.tips;

import Cw.ViewOnClickListenerC2787a;
import E30.g;
import H30.e;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q40.C8985b;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.camera.databinding.TextTipsViewBinding;
import ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperState;
import ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperView;

@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001(\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/ozon/fintech/features/camera/ui/tips/TextTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "fadeOutTextTips", "()V", "Lru/ozon/fintech/features/camera/ui/tips/TextTipsState;", "textTipsState", "bindsDrumAnimationState", "(Lru/ozon/fintech/features/camera/ui/tips/TextTipsState;)V", "bindsFadeAnimationState", "Lru/ozon/fintech/features/camera/databinding/TextTipsViewBinding;", "binding", "Lru/ozon/fintech/features/camera/databinding/TextTipsViewBinding;", "", "Lru/ozon/fintech/ui/textatomV2/TextAtomV2WrapperState;", "textItems", "Ljava/util/List;", "Lru/ozon/fintech/ui/textatomV2/TextAtomV2WrapperView;", "slaveView", "Lru/ozon/fintech/ui/textatomV2/TextAtomV2WrapperView;", "mainView", "currentIndex", "I", "", "isFirstIteration", "Z", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "Landroid/animation/AnimatorSet;", "animatorSet", "Landroid/animation/AnimatorSet;", "ru/ozon/fintech/features/camera/ui/tips/TextTipsView$fadeAnimationListener$2$1", "fadeAnimationListener$delegate", "LSc/j;", "getFadeAnimationListener", "()Lru/ozon/fintech/features/camera/ui/tips/TextTipsView$fadeAnimationListener$2$1;", "fadeAnimationListener", "Companion", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextTipsView extends ConstraintLayout {
    private static final long ANIMATION_DURATION = 500;
    private static final int ANIMATION_START_LIMIT = 1;
    private static final long FADE_ANIMATION_DURATION = 300;
    private static final long TIMEOUT_PAUSE = 3000;
    private ValueAnimator animator;
    private AnimatorSet animatorSet;

    @NotNull
    private final TextTipsViewBinding binding;
    private int currentIndex;

    /* renamed from: fadeAnimationListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fadeAnimationListener;
    private boolean isFirstIteration;
    private TextAtomV2WrapperView mainView;
    private TextAtomV2WrapperView slaveView;
    private List<TextAtomV2WrapperState> textItems;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextTipsView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.fintech.features.camera.ui.tips.TextTipsView$fadeAnimationListener$2$1] */
    public static final TextTipsView$fadeAnimationListener$2$1 fadeAnimationListener_delegate$lambda$0(final TextTipsView textTipsView) {
        return new Animator.AnimatorListener() { // from class: ru.ozon.fintech.features.camera.ui.tips.TextTipsView$fadeAnimationListener$2$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                List list;
                int i11;
                TextAtomV2WrapperView textAtomV2WrapperView;
                TextAtomV2WrapperView textAtomV2WrapperView2;
                TextAtomV2WrapperView textAtomV2WrapperView3;
                int i12;
                Intrinsics.checkNotNullParameter(animation, "animation");
                list = TextTipsView.this.textItems;
                if (list != null) {
                    TextTipsView textTipsView2 = TextTipsView.this;
                    i11 = textTipsView2.currentIndex;
                    textTipsView2.currentIndex = (i11 + 1) % list.size();
                    textAtomV2WrapperView = textTipsView2.mainView;
                    textAtomV2WrapperView2 = textTipsView2.slaveView;
                    textTipsView2.mainView = textAtomV2WrapperView2;
                    textTipsView2.slaveView = textAtomV2WrapperView;
                    textAtomV2WrapperView3 = textTipsView2.slaveView;
                    if (textAtomV2WrapperView3 != null) {
                        i12 = textTipsView2.currentIndex;
                        textAtomV2WrapperView3.bindState((TextAtomV2WrapperState) list.get(i12));
                    }
                    textTipsView2.fadeOutTextTips();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fadeOutTextTips() {
        g.a(new Function2() { // from class: ru.ozon.fintech.features.camera.ui.tips.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit fadeOutTextTips$lambda$5;
                fadeOutTextTips$lambda$5 = TextTipsView.fadeOutTextTips$lambda$5(TextTipsView.this, (TextAtomV2WrapperView) obj, (TextAtomV2WrapperView) obj2);
                return fadeOutTextTips$lambda$5;
            }
        }, this.mainView, this.slaveView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fadeOutTextTips$lambda$5(TextTipsView textTipsView, TextAtomV2WrapperView main, TextAtomV2WrapperView slave) {
        Intrinsics.checkNotNullParameter(main, "main");
        Intrinsics.checkNotNullParameter(slave, "slave");
        Context context = textTipsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (e.a(context)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(main, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(300L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(slave, "alpha", 0.0f, 1.0f);
            ofFloat2.setDuration(100L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setStartDelay(TIMEOUT_PAUSE);
            animatorSet.start();
            animatorSet.addListener(textTipsView.getFadeAnimationListener());
            textTipsView.animatorSet = animatorSet;
        }
        return Unit.f71690a;
    }

    private final TextTipsView$fadeAnimationListener$2$1 getFadeAnimationListener() {
        return (TextTipsView$fadeAnimationListener$2$1) this.fadeAnimationListener.getValue();
    }

    public final void bindsDrumAnimationState(@NotNull TextTipsState textTipsState) {
        Intrinsics.checkNotNullParameter(textTipsState, "textTipsState");
        setBackground(androidx.core.content.a.getDrawable(getContext(), R.drawable.fintech_camera_rounded_drum_view_background));
        View fadeItem = this.binding.fadeItem;
        Intrinsics.checkNotNullExpressionValue(fadeItem, "fadeItem");
        fadeItem.setVisibility(0);
        final List<TextAtomV2WrapperState> textAtoms = textTipsState.getTextAtoms();
        if (textAtoms.isEmpty()) {
            return;
        }
        this.currentIndex = 0;
        if (this.textItems != null && (!r1.isEmpty())) {
            this.binding.tvItem1.setTranslationY(0.0f);
        }
        this.textItems = textAtoms;
        this.binding.tvItem1.bindState(textAtoms.get(this.currentIndex));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (e.a(context) && textAtoms.size() > 1) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            ValueAnimator valueAnimator2 = this.animator;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
            }
            ValueAnimator valueAnimator3 = this.animator;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllUpdateListeners();
            }
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.fintech.features.camera.ui.tips.TextTipsView$bindsDrumAnimationState$$inlined$afterMeasured$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    TextTipsViewBinding textTipsViewBinding;
                    ValueAnimator valueAnimator4;
                    ValueAnimator valueAnimator5;
                    TextTipsViewBinding textTipsViewBinding2;
                    int i11;
                    TextTipsViewBinding textTipsViewBinding3;
                    TextTipsViewBinding textTipsViewBinding4;
                    TextTipsViewBinding textTipsViewBinding5;
                    TextTipsViewBinding textTipsViewBinding6;
                    ValueAnimator valueAnimator6;
                    ValueAnimator valueAnimator7;
                    ValueAnimator valueAnimator8;
                    ValueAnimator valueAnimator9;
                    if (this.getMeasuredWidth() <= 0 || this.getMeasuredHeight() <= 0) {
                        return;
                    }
                    this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    final TextTipsView textTipsView = (TextTipsView) this;
                    textTipsViewBinding = textTipsView.binding;
                    final int height = textTipsViewBinding.getRoot().getHeight();
                    textTipsView.animator = ValueAnimator.ofInt(0, height);
                    valueAnimator4 = textTipsView.animator;
                    if (valueAnimator4 != null) {
                        valueAnimator4.setDuration(500L);
                    }
                    valueAnimator5 = textTipsView.animator;
                    if (valueAnimator5 != null) {
                        valueAnimator5.setInterpolator(new OvershootInterpolator());
                    }
                    textTipsViewBinding2 = textTipsView.binding;
                    TextAtomV2WrapperView textAtomV2WrapperView = textTipsViewBinding2.tvItem2;
                    List list = textAtoms;
                    i11 = textTipsView.currentIndex;
                    textAtomV2WrapperView.bindState((TextAtomV2WrapperState) list.get((i11 + 1) % textAtoms.size()));
                    textTipsViewBinding3 = textTipsView.binding;
                    textTipsViewBinding3.tvItem2.setTranslationY(-height);
                    textTipsViewBinding4 = textTipsView.binding;
                    TextAtomV2WrapperView tvItem2 = textTipsViewBinding4.tvItem2;
                    Intrinsics.checkNotNullExpressionValue(tvItem2, "tvItem2");
                    tvItem2.setVisibility(0);
                    textTipsViewBinding5 = textTipsView.binding;
                    textTipsView.slaveView = textTipsViewBinding5.tvItem2;
                    textTipsViewBinding6 = textTipsView.binding;
                    textTipsView.mainView = textTipsViewBinding6.tvItem1;
                    valueAnimator6 = textTipsView.animator;
                    if (valueAnimator6 != null) {
                        valueAnimator6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.features.camera.ui.tips.TextTipsView$bindsDrumAnimationState$1$1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator10) {
                                TextAtomV2WrapperView textAtomV2WrapperView2;
                                TextAtomV2WrapperView textAtomV2WrapperView3;
                                int intValue = ((Integer) Bi.a.b(valueAnimator10, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                int i12 = (-height) + intValue;
                                textAtomV2WrapperView2 = textTipsView.slaveView;
                                if (textAtomV2WrapperView2 != null) {
                                    textAtomV2WrapperView2.setTranslationY(i12);
                                }
                                textAtomV2WrapperView3 = textTipsView.mainView;
                                if (textAtomV2WrapperView3 != null) {
                                    textAtomV2WrapperView3.setTranslationY(intValue);
                                }
                            }
                        });
                    }
                    valueAnimator7 = textTipsView.animator;
                    if (valueAnimator7 != null) {
                        valueAnimator7.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.fintech.features.camera.ui.tips.TextTipsView$bindsDrumAnimationState$1$2
                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationCancel(Animator animation) {
                                Intrinsics.checkNotNullParameter(animation, "animation");
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animation) {
                                List list2;
                                TextAtomV2WrapperView textAtomV2WrapperView2;
                                boolean z11;
                                int i12;
                                int i13;
                                TextAtomV2WrapperView textAtomV2WrapperView3;
                                ValueAnimator valueAnimator10;
                                ValueAnimator valueAnimator11;
                                ValueAnimator valueAnimator12;
                                int i14;
                                Intrinsics.checkNotNullParameter(animation, "animation");
                                list2 = TextTipsView.this.textItems;
                                if (list2 != null) {
                                    TextTipsView textTipsView2 = TextTipsView.this;
                                    int i15 = height;
                                    textAtomV2WrapperView2 = textTipsView2.mainView;
                                    if (textAtomV2WrapperView2 != null) {
                                        textAtomV2WrapperView2.setTranslationY(2 * (-i15));
                                        z11 = textTipsView2.isFirstIteration;
                                        if (z11) {
                                            textTipsView2.isFirstIteration = false;
                                            i14 = textTipsView2.currentIndex;
                                            i13 = i14 + 2;
                                        } else {
                                            i12 = textTipsView2.currentIndex;
                                            i13 = i12 + 1;
                                        }
                                        int size = i13 % list2.size();
                                        textAtomV2WrapperView2.bindState((TextAtomV2WrapperState) list2.get(size));
                                        textTipsView2.currentIndex = size;
                                        textAtomV2WrapperView3 = textTipsView2.slaveView;
                                        textTipsView2.mainView = textAtomV2WrapperView3;
                                        textTipsView2.slaveView = textAtomV2WrapperView2;
                                        valueAnimator10 = textTipsView2.animator;
                                        if (valueAnimator10 != null) {
                                            valueAnimator10.setIntValues(0, i15);
                                        }
                                        valueAnimator11 = textTipsView2.animator;
                                        if (valueAnimator11 != null) {
                                            valueAnimator11.setStartDelay(3000L);
                                        }
                                        valueAnimator12 = textTipsView2.animator;
                                        if (valueAnimator12 != null) {
                                            valueAnimator12.start();
                                        }
                                    }
                                }
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationRepeat(Animator animation) {
                                Intrinsics.checkNotNullParameter(animation, "animation");
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animation) {
                                Intrinsics.checkNotNullParameter(animation, "animation");
                            }
                        });
                    }
                    valueAnimator8 = textTipsView.animator;
                    if (valueAnimator8 != null) {
                        valueAnimator8.setStartDelay(3000L);
                    }
                    valueAnimator9 = textTipsView.animator;
                    if (valueAnimator9 != null) {
                        valueAnimator9.start();
                    }
                }
            });
        }
        Function0<Unit> onClick = textTipsState.getOnClick();
        if (onClick != null) {
            setOnClickListener(new ViewOnClickListenerC2787a(onClick, 15));
        }
    }

    public final void bindsFadeAnimationState(@NotNull TextTipsState textTipsState) {
        Intrinsics.checkNotNullParameter(textTipsState, "textTipsState");
        setBackground(null);
        View fadeItem = this.binding.fadeItem;
        Intrinsics.checkNotNullExpressionValue(fadeItem, "fadeItem");
        fadeItem.setVisibility(8);
        List<TextAtomV2WrapperState> textAtoms = textTipsState.getTextAtoms();
        if (textAtoms.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.animatorSet;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.currentIndex = 0;
        if (this.textItems != null && (!r1.isEmpty())) {
            TextAtomV2WrapperView tvItem1 = this.binding.tvItem1;
            Intrinsics.checkNotNullExpressionValue(tvItem1, "tvItem1");
            tvItem1.setVisibility(0);
            this.binding.tvItem2.setAlpha(1.0f);
        }
        this.textItems = textAtoms;
        this.binding.tvItem1.bindState(textAtoms.get(this.currentIndex));
        if (textAtoms.size() > 1) {
            TextTipsViewBinding textTipsViewBinding = this.binding;
            this.mainView = textTipsViewBinding.tvItem1;
            TextAtomV2WrapperView textAtomV2WrapperView = textTipsViewBinding.tvItem2;
            this.slaveView = textAtomV2WrapperView;
            if (textAtomV2WrapperView != null) {
                int i11 = this.currentIndex + 1;
                this.currentIndex = i11;
                textAtomV2WrapperView.bindState(textAtoms.get(i11));
            }
            this.binding.tvItem2.setAlpha(0.0f);
            TextAtomV2WrapperView tvItem2 = this.binding.tvItem2;
            Intrinsics.checkNotNullExpressionValue(tvItem2, "tvItem2");
            tvItem2.setVisibility(0);
            fadeOutTextTips();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextTipsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TextTipsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextTipsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextTipsViewBinding inflate = TextTipsViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setClipToOutline(true);
        this.isFirstIteration = true;
        this.fadeAnimationListener = k.a(n.PUBLICATION, new C8985b(this, 1));
    }
}
