package ru.ozon.app.android.regulardraw.onboarding.dialog;

import Qc.c;
import Sc.InterfaceC4008j;
import WZ.l;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.C;
import androidx.activity.J;
import androidx.activity.s;
import androidx.core.view.C5334o0;
import androidx.core.view.Q0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.databinding.MorkovskHintDialogLayoutBinding;
import ru.ozon.app.android.regulardraw.onboarding.dialog.MorkovskHintDialog;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.TutorialScreensNavigator;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialSteps;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001?\b\u0001\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u00108\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0019R\u001b\u0010;\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u0010\u0019R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/MorkovskHintDialog;", "Landroidx/fragment/app/k;", "<init>", "()V", "", "bind", "fadeInBackgroundColor", "Lkotlin/Function0;", "onAnimationEnd", "fadeOutBackgroundColor", "(Lkotlin/jvm/functions/Function0;)V", "newApiLevelBlur", "oldApiLevelBlur", "unblurOldApiLevel", "Landroid/view/ViewGroup;", "getViewGroup", "()Landroid/view/ViewGroup;", "", "start", "end", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "getBackgroundColorAnimator", "(II)Landroid/animation/ObjectAnimator;", "getTheme", "()I", "Landroid/view/LayoutInflater;", "inflater", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;", "tutorialSteps", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/TutorialScreensNavigator;", "tutorialScreensNavigator", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/TutorialScreensNavigator;", "onDismissAction", "Lkotlin/jvm/functions/Function0;", "startColor$delegate", "LSc/j;", "getStartColor", "startColor", "endColor$delegate", "getEndColor", "endColor", "Lru/ozon/app/android/regulardraw/databinding/MorkovskHintDialogLayoutBinding;", "_binding", "Lru/ozon/app/android/regulardraw/databinding/MorkovskHintDialogLayoutBinding;", "ru/ozon/app/android/regulardraw/onboarding/dialog/MorkovskHintDialog$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/regulardraw/onboarding/dialog/MorkovskHintDialog$onBackPressedCallback$1;", "getBinding", "()Lru/ozon/app/android/regulardraw/databinding/MorkovskHintDialogLayoutBinding;", "binding", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskHintDialog extends DialogInterfaceOnCancelListenerC5390k {
    private MorkovskHintDialogLayoutBinding _binding;
    private Function0<Unit> onDismissAction;
    private l tokenizedAnalytics;
    private TutorialScreensNavigator tutorialScreensNavigator;
    private TutorialSteps tutorialSteps;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: startColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j startColor = LazyUtilsKt.unsafeLazy(new MorkovskHintDialog$startColor$2(this));

    /* renamed from: endColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j endColor = LazyUtilsKt.unsafeLazy(new MorkovskHintDialog$endColor$2(this));

    @NotNull
    private final MorkovskHintDialog$onBackPressedCallback$1 onBackPressedCallback = new C() { // from class: ru.ozon.app.android.regulardraw.onboarding.dialog.MorkovskHintDialog$onBackPressedCallback$1
        @Override // androidx.activity.C
        public void handleOnBackPressed() {
        }
    };

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/MorkovskHintDialog$Companion;", "", "<init>", "()V", "Landroidx/fragment/app/G;", "fragmentManager", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;", "tutorialSteps", "LWZ/l;", "tokenizedAnalytics", "", "newInstance", "(Landroidx/fragment/app/G;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialSteps;LWZ/l;)V", "", "BACKGROUND_FADE_DURATION", "J", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void newInstance(@NotNull G fragmentManager, @NotNull TutorialSteps tutorialSteps, l tokenizedAnalytics) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(tutorialSteps, "tutorialSteps");
            MorkovskHintDialog morkovskHintDialog = new MorkovskHintDialog();
            morkovskHintDialog.tutorialSteps = tutorialSteps;
            morkovskHintDialog.tokenizedAnalytics = tokenizedAnalytics;
            morkovskHintDialog.show(fragmentManager, "MorkovskHintDialog");
        }

        private Companion() {
        }
    }

    private final void bind() {
        TutorialSteps tutorialSteps = this.tutorialSteps;
        if (tutorialSteps == null) {
            dismiss();
            return;
        }
        l lVar = this.tokenizedAnalytics;
        if (lVar == null) {
            dismiss();
        } else {
            this.tutorialScreensNavigator = new TutorialScreensNavigator(tutorialSteps, lVar, new MorkovskHintDialog$bind$1(this));
            fadeInBackgroundColor();
        }
    }

    private final void fadeInBackgroundColor() {
        ObjectAnimator backgroundColorAnimator = getBackgroundColorAnimator(getStartColor(), getEndColor());
        backgroundColorAnimator.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.regulardraw.onboarding.dialog.MorkovskHintDialog$fadeInBackgroundColor$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                MorkovskHintDialog.this.oldApiLevelBlur();
            }
        });
        backgroundColorAnimator.setDuration((Build.VERSION.SDK_INT < 31 ? 600L : 0L) + 500);
        newApiLevelBlur();
        backgroundColorAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fadeOutBackgroundColor(final Function0<Unit> onAnimationEnd) {
        ObjectAnimator backgroundColorAnimator = getBackgroundColorAnimator(getEndColor(), getStartColor());
        backgroundColorAnimator.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.regulardraw.onboarding.dialog.MorkovskHintDialog$fadeOutBackgroundColor$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                onAnimationEnd.invoke();
            }
        });
        backgroundColorAnimator.setDuration(500L);
        backgroundColorAnimator.start();
    }

    private final ObjectAnimator getBackgroundColorAnimator(int start, int end) {
        Window window;
        Dialog dialog = getDialog();
        return ObjectAnimator.ofArgb((dialog == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView(), "backgroundColor", start, end);
    }

    private final MorkovskHintDialogLayoutBinding getBinding() {
        MorkovskHintDialogLayoutBinding morkovskHintDialogLayoutBinding = this._binding;
        Intrinsics.f(morkovskHintDialogLayoutBinding);
        return morkovskHintDialogLayoutBinding;
    }

    private final int getEndColor() {
        return ((Number) this.endColor.getValue()).intValue();
    }

    private final int getStartColor() {
        return ((Number) this.startColor.getValue()).intValue();
    }

    private final ViewGroup getViewGroup() {
        View decorView;
        Window window = requireActivity().getWindow();
        ViewGroup viewGroup = (window == null || (decorView = window.getDecorView()) == null) ? null : (ViewGroup) decorView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    private final void newApiLevelBlur() {
        Dialog dialog;
        Window window;
        if (Build.VERSION.SDK_INT < 31 || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.getAttributes().flags |= 4;
        window.getAttributes().setBlurBehindRadius(11);
        window.setAttributes(window.getAttributes());
        TutorialScreensNavigator tutorialScreensNavigator = this.tutorialScreensNavigator;
        if (tutorialScreensNavigator != null) {
            FrameLayout rootDialogContainer = getBinding().rootDialogContainer;
            Intrinsics.checkNotNullExpressionValue(rootDialogContainer, "rootDialogContainer");
            tutorialScreensNavigator.attach(rootDialogContainer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oldApiLevelBlur() {
        if (Build.VERSION.SDK_INT < 31) {
            final ViewGroup viewGroup = getViewGroup();
            if (viewGroup != null) {
                viewGroup.post(new Runnable() { // from class: QF.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        MorkovskHintDialog.oldApiLevelBlur$lambda$3(viewGroup);
                    }
                });
            }
            TutorialScreensNavigator tutorialScreensNavigator = this.tutorialScreensNavigator;
            if (tutorialScreensNavigator != null) {
                FrameLayout rootDialogContainer = getBinding().rootDialogContainer;
                Intrinsics.checkNotNullExpressionValue(rootDialogContainer, "rootDialogContainer");
                tutorialScreensNavigator.attach(rootDialogContainer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oldApiLevelBlur$lambda$3(ViewGroup viewGroup) {
        c.b bVar = new c.b(viewGroup.getContext());
        bVar.c(11);
        bVar.d();
        bVar.b(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unblurOldApiLevel() {
        ViewGroup viewGroup;
        View findViewWithTag;
        if (Build.VERSION.SDK_INT >= 31 || (findViewWithTag = (viewGroup = getViewGroup()).findViewWithTag("c")) == null) {
            return;
        }
        viewGroup.removeView(findViewWithTag);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public int getTheme() {
        return R$style.MorkovskHintDialogTheme;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Window window;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (savedInstanceState != null || this.tutorialSteps == null) {
            dismiss();
            return null;
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C5334o0.a(window, false);
            window.setNavigationBarColor(0);
            new Q0(window.getDecorView(), window).d(false);
        }
        this._binding = MorkovskHintDialogLayoutBinding.inflate(inflater, container, false);
        return getBinding().getConstraintLayout();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        TutorialScreensNavigator tutorialScreensNavigator = this.tutorialScreensNavigator;
        if (tutorialScreensNavigator != null) {
            tutorialScreensNavigator.detach();
        }
        this._binding = null;
        unblurOldApiLevel();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Function0<Unit> function0 = this.onDismissAction;
        if (function0 != null) {
            function0.invoke();
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        J onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        s sVar = dialog instanceof s ? (s) dialog : null;
        if (sVar != null && (onBackPressedDispatcher = sVar.getOnBackPressedDispatcher()) != null) {
            MorkovskHintDialog$onBackPressedCallback$1 onBackPressedCallback = this.onBackPressedCallback;
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            onBackPressedDispatcher.i(onBackPressedCallback);
        }
        bind();
    }
}
