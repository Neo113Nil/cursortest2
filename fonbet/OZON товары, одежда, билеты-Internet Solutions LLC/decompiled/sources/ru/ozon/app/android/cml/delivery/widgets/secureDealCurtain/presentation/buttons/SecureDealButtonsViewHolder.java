package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.buttons;

import Ae.C2399j;
import Ae.C2408n0;
import GZ.g;
import Sc.s;
import Wc.a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.H;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cml.delivery.widgets.input.presentation.keyboard.KeyboardKt;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.SecureDealCurtainViewModel;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.buttons.SecureDealButtonsViewHolder;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;BA\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u0013*\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00150*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R$\u0010/\u001a\u0012\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00150*j\u0002`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsViewHolder;", "Ld20/a;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsVO;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Ll10/i;", "container", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainViewModel;", "viewModel", "LGZ/g;", "ozonRouter", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Ll10/i;Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainViewModel;LGZ/g;Ld20/e;)V", "", "isKeyboardVisible", "", "updateSecondaryButtonMargin", "(Z)V", "", "getNavBarHeight", "()I", "targetBottomMargin", "Landroid/animation/ValueAnimator;", "createUpdatePaddingAnimator", "(I)Landroid/animation/ValueAnimator;", "", "isPaymentLink", "(Ljava/lang/String;)Z", "item", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsVO;)V", "onWidgetDestroyed", "()V", "Ll10/i;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainViewModel;", "LGZ/g;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "preProcessHandler", "Landroid/animation/Animator;", "bottomButtonPaddingAnimator", "Landroid/animation/Animator;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsView;", "getContainerView", "()Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsView;", "containerView", "Landroid/view/View;", "getBottomButton", "()Landroid/view/View;", "bottomButton", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SecureDealButtonsViewHolder extends AbstractC6064a<SecureDealButtonsVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private Animator bottomButtonPaddingAnimator;

    @NotNull
    private final i container;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final Function1<AtomAction, Unit> preProcessHandler;

    @NotNull
    private final SecureDealCurtainViewModel viewModel;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isKeyboardVisible", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.buttons.SecureDealButtonsViewHolder$1", f = "SecureDealButtonsViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.buttons.SecureDealButtonsViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = SecureDealButtonsViewHolder.this.new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            SecureDealButtonsViewHolder.this.updateSecondaryButtonMargin(this.Z$0);
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsViewHolder$Companion;", "", "<init>", "()V", "BOTTOM_BUTTON_PADDING_ANIMATION_DURATION", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureDealButtonsViewHolder(@NotNull Vg.d customActionHandlersStoreFactory, @NotNull HandlersInhibitor inhibitor, @NotNull i container, @NotNull SecureDealCurtainViewModel viewModel, @NotNull g ozonRouter, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.ozonRouter = ozonRouter;
        this.actionHandler = new ActionHandler.Builder(container, this).enableClickThrottling(inhibitor).customActionHandlers(new SecureDealButtonsViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.preProcessHandler = new SecureDealButtonsViewHolder$preProcessHandler$1(this);
        C2399j.C(new C2408n0(C2399j.o(C5427n.a(KeyboardKt.keyboardVisibilityChanges(container.K().a()), getLifecycle(), AbstractC5434v.b.STARTED)), new AnonymousClass1(null)), H.a(getLifecycle()));
    }

    private final ValueAnimator createUpdatePaddingAnimator(int targetBottomMargin) {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, targetBottomMargin);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rq.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SecureDealButtonsViewHolder.createUpdatePaddingAnimator$lambda$4$lambda$3(SecureDealButtonsViewHolder.this, valueAnimator);
            }
        });
        ofInt.setDuration(100L);
        Intrinsics.checkNotNullExpressionValue(ofInt, "apply(...)");
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createUpdatePaddingAnimator$lambda$4$lambda$3(SecureDealButtonsViewHolder secureDealButtonsViewHolder, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        View bottomButton = secureDealButtonsViewHolder.getBottomButton();
        ViewGroup.LayoutParams layoutParams = bottomButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
        bottomButton.setLayoutParams(marginLayoutParams);
    }

    private final View getBottomButton() {
        return getContainerView().getBottomButton();
    }

    private final SecureDealButtonsView getContainerView() {
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.buttons.SecureDealButtonsView");
        return (SecureDealButtonsView) view;
    }

    private final int getNavBarHeight() {
        View view;
        ComponentCallbacksC5392m b11 = this.container.K().b();
        if (b11 == null || (view = b11.getView()) == null) {
            return 0;
        }
        C5353y0 n11 = Y.n(view);
        androidx.core.graphics.d f7 = n11 != null ? n11.f(2) : null;
        Integer valueOf = f7 != null ? Integer.valueOf(f7.f42129d) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPaymentLink(String str) {
        return Intrinsics.d(Uri.parse(str).getAuthority(), "payment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSecondaryButtonMargin(boolean isKeyboardVisible) {
        int secondaryButtonBottomMargin = isKeyboardVisible ? SecureDealButtonsView.INSTANCE.getSecondaryButtonBottomMargin() : SecureDealButtonsView.INSTANCE.getSecondaryButtonBottomMargin() + getNavBarHeight();
        ViewGroup.LayoutParams layoutParams = getBottomButton().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) != secondaryButtonBottomMargin) {
            Animator animator = this.bottomButtonPaddingAnimator;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator createUpdatePaddingAnimator = createUpdatePaddingAnimator(secondaryButtonBottomMargin);
            createUpdatePaddingAnimator.start();
            this.bottomButtonPaddingAnimator = createUpdatePaddingAnimator;
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        Animator animator = this.bottomButtonPaddingAnimator;
        if (animator != null) {
            animator.cancel();
        }
        this.bottomButtonPaddingAnimator = null;
        super.onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull SecureDealButtonsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getContainerView().bind(item, this.preProcessHandler);
    }
}
