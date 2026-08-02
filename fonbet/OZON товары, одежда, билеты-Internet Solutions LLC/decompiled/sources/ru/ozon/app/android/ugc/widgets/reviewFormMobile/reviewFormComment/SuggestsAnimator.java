package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.Editable;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.SuggestsAnimator;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/SuggestsAnimator;", "", "inputView", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "placeholderView", "Landroid/widget/TextView;", SuggestionDTO.TYPE_SUGGEST, "", "", "defaultPlaceholder", "delay", "", "<init>", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;Landroid/widget/TextView;Ljava/util/List;Ljava/lang/String;I)V", "index", "animatorSet", "Landroid/animation/AnimatorSet;", "wasPaused", "", "focusListener", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "windowFocusListener", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "hasText", "getHasText", "()Z", "attach", "", "detach", "pause", "setDefault", "resume", "animateLoop", "observeInputFocus", "observeWindow", "removeFocusObserver", "removeWindowObserver", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SuggestsAnimator {
    private AnimatorSet animatorSet;
    private final String defaultPlaceholder;
    private final int delay;
    private ViewTreeObserver.OnGlobalFocusChangeListener focusListener;
    private int index;

    @NotNull
    private final OzonTextInput inputView;

    @NotNull
    private final TextView placeholderView;

    @NotNull
    private final List<String> suggests;
    private boolean wasPaused;
    private ViewTreeObserver.OnWindowFocusChangeListener windowFocusListener;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/SuggestsAnimator$Companion;", "", "<init>", "()V", "FADE_DURATION", "", "DEFAULT_ALPHA", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SuggestsAnimator(@NotNull OzonTextInput inputView, @NotNull TextView placeholderView, @NotNull List<String> suggests, String str, int i11) {
        Intrinsics.checkNotNullParameter(inputView, "inputView");
        Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
        Intrinsics.checkNotNullParameter(suggests, "suggests");
        this.inputView = inputView;
        this.placeholderView = placeholderView;
        this.suggests = suggests;
        this.defaultPlaceholder = str;
        this.delay = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateLoop() {
        this.placeholderView.setText(this.suggests.get(this.index));
        TextView textView = this.placeholderView;
        Property property = View.ALPHA;
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f, 0.6f).setDuration(400L);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.placeholderView, (Property<TextView, Float>) property, 0.6f).setDuration(this.delay);
        Intrinsics.checkNotNullExpressionValue(duration2, "setDuration(...)");
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.placeholderView, (Property<TextView, Float>) property, 0.6f, 0.0f).setDuration(400L);
        Intrinsics.checkNotNullExpressionValue(duration3, "setDuration(...)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2, duration3);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.SuggestsAnimator$animateLoop$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                boolean z11;
                int i11;
                List list;
                Intrinsics.checkNotNullParameter(animation, "animation");
                z11 = SuggestsAnimator.this.wasPaused;
                if (z11) {
                    return;
                }
                SuggestsAnimator suggestsAnimator = SuggestsAnimator.this;
                i11 = suggestsAnimator.index;
                list = SuggestsAnimator.this.suggests;
                suggestsAnimator.index = (i11 + 1) % list.size();
                SuggestsAnimator.this.animatorSet = null;
                SuggestsAnimator.this.animateLoop();
            }
        });
        if (getHasText()) {
            pause(true);
        } else {
            animatorSet.start();
        }
        this.animatorSet = animatorSet;
    }

    private final boolean getHasText() {
        Editable text = this.inputView.getText();
        return !(text == null || h.K(text));
    }

    private final void observeInputFocus() {
        if (this.focusListener != null) {
            return;
        }
        this.focusListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: sW.f
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                SuggestsAnimator.observeInputFocus$lambda$1(SuggestsAnimator.this, view, view2);
            }
        };
        this.inputView.getViewTreeObserver().addOnGlobalFocusChangeListener(this.focusListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeInputFocus$lambda$1(SuggestsAnimator suggestsAnimator, View view, View view2) {
        if (Intrinsics.d(view2, suggestsAnimator.inputView)) {
            suggestsAnimator.pause(true);
        } else if (Intrinsics.d(view, suggestsAnimator.inputView)) {
            suggestsAnimator.resume();
        }
    }

    private final void observeWindow() {
        if (this.windowFocusListener != null) {
            return;
        }
        this.windowFocusListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: sW.g
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z11) {
                SuggestsAnimator.observeWindow$lambda$2(SuggestsAnimator.this, z11);
            }
        };
        this.inputView.getViewTreeObserver().addOnWindowFocusChangeListener(this.windowFocusListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeWindow$lambda$2(SuggestsAnimator suggestsAnimator, boolean z11) {
        if (z11) {
            suggestsAnimator.resume();
        } else {
            suggestsAnimator.pause(false);
        }
    }

    private final void pause(boolean setDefault) {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        this.wasPaused = true;
        if (setDefault) {
            this.placeholderView.setText(this.defaultPlaceholder);
        }
    }

    private final void removeFocusObserver() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = this.focusListener;
        if (onGlobalFocusChangeListener != null && this.inputView.getViewTreeObserver().isAlive()) {
            this.inputView.getViewTreeObserver().removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
        this.focusListener = null;
    }

    private final void removeWindowObserver() {
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = this.windowFocusListener;
        if (onWindowFocusChangeListener != null && this.inputView.getViewTreeObserver().isAlive()) {
            this.inputView.getViewTreeObserver().removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
        }
        this.windowFocusListener = null;
    }

    private final void resume() {
        if (getHasText() || this.inputView.isFocused()) {
            return;
        }
        this.placeholderView.setText(this.suggests.get(this.index));
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet == null || !animatorSet.isStarted()) {
            AnimatorSet animatorSet2 = this.animatorSet;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        } else {
            AnimatorSet animatorSet3 = this.animatorSet;
            if (animatorSet3 != null) {
                animatorSet3.resume();
            }
        }
        this.wasPaused = false;
    }

    public final void attach() {
        if (this.animatorSet != null || this.suggests.isEmpty()) {
            return;
        }
        if (this.suggests.size() > 1) {
            animateLoop();
        } else {
            this.placeholderView.setText(this.suggests.get(this.index));
        }
        observeInputFocus();
        observeWindow();
    }

    public final void detach() {
        this.wasPaused = true;
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.animatorSet = null;
        removeFocusObserver();
        removeWindowObserver();
    }
}
