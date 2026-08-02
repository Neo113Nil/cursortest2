package ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.presentation;

import De.s;
import Vg.d;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.checkout.databinding.WidgetEnableNotificationWithReplacementButtonBinding;
import ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.presentation.EnableNotificationWithReplacementButtonVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.notifications.utils.NotificationHelper;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import xe.C10720e0;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001)\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/checkout/databinding/WidgetEnableNotificationWithReplacementButtonBinding;", "binding", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "notificationsHandler", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/checkout/databinding/WidgetEnableNotificationWithReplacementButtonBinding;Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;LVg/d;)V", "item", "", "bindButton", "(Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO;)V", "", "isEnabled", "bindRedDot", "(Z)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "firstTimeSuggestAction", "suggestEnablePush", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO;Ll20/d;)V", "onDetach", "()V", "Lru/ozon/app/android/checkout/databinding/WidgetEnableNotificationWithReplacementButtonBinding;", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "Lxe/M;", "scope", "Lxe/M;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVH$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVH$lifecycleObserver$1;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnableNotificationWithReplacementButtonVH extends k<EnableNotificationWithReplacementButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetEnableNotificationWithReplacementButtonBinding binding;

    @NotNull
    private final EnableNotificationWithReplacementButtonVH$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final EnableNotificationsSuggestingHandler notificationsHandler;

    @NotNull
    private final M scope;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0057, code lost:
    
        if (r5 == null) goto L6;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.lifecycle.I, ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.presentation.EnableNotificationWithReplacementButtonVH$lifecycleObserver$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EnableNotificationWithReplacementButtonVH(@NotNull ComposerReferences refs, @NotNull WidgetEnableNotificationWithReplacementButtonBinding binding, @NotNull EnableNotificationsSuggestingHandler notificationsHandler, @NotNull d customActionHandlersStoreFactory) {
        super(r0);
        AbstractC5434v abstractC5434v;
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(notificationsHandler, "notificationsHandler");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.notificationsHandler = notificationsHandler;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(s.f6650a);
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new EnableNotificationWithReplacementButtonVH$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        ?? r42 = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.presentation.EnableNotificationWithReplacementButtonVH$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                EnableNotificationWithReplacementButtonVO boundedData = EnableNotificationWithReplacementButtonVH.this.getBoundedData();
                if (boundedData != null) {
                    EnableNotificationWithReplacementButtonVH.this.bindButton(boundedData);
                }
            }
        };
        this.lifecycleObserver = r42;
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 != null) {
            AbstractC5434v lifecycle = c11.getLifecycle();
            abstractC5434v = lifecycle;
        }
        r a11 = refs.getContainer().a();
        abstractC5434v = a11 != null ? a11.getLifecycle() : 0;
        if (abstractC5434v != 0) {
            abstractC5434v.a(r42);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButton(EnableNotificationWithReplacementButtonVO item) {
        ButtonV3Atom.SmallIconButton smallIconButton;
        if (!NotificationHelper.INSTANCE.isSystemNotificationsTurnedOn(getContext())) {
            ButtonV3Atom.SmallIconButton button = item.getEnableNotificationButton().getButton();
            bindRedDot(item.getEnableNotificationButton().getHasRedDot());
            if (!this.notificationsHandler.isEnablePushNotificationsOptionSuggestedByFirstTime()) {
                suggestEnablePush(item.getEnableNotificationButton().getButton().getAction());
            }
            smallIconButton = button;
        } else if (item.getReplacementButton() != null) {
            smallIconButton = item.getReplacementButton();
            bindRedDot(false);
        } else if (item.getReplacementButtonWithRedDot() != null) {
            EnableNotificationWithReplacementButtonVO.ButtonWithRedDotVO replacementButtonWithRedDot = item.getReplacementButtonWithRedDot();
            bindRedDot(replacementButtonWithRedDot.getHasRedDot());
            smallIconButton = replacementButtonWithRedDot.getButton();
        } else {
            bindRedDot(false);
            smallIconButton = null;
        }
        SmallIconButtonView notificationIconButton = this.binding.notificationIconButton;
        Intrinsics.checkNotNullExpressionValue(notificationIconButton, "notificationIconButton");
        WrappedIconButtonHolderKt.bindOrGone(notificationIconButton, smallIconButton, this.actionHandler);
    }

    private final void bindRedDot(boolean isEnabled) {
        DotWithCircleView notificationDot = this.binding.notificationDot;
        Intrinsics.checkNotNullExpressionValue(notificationDot, "notificationDot");
        notificationDot.setVisibility(isEnabled ? 0 : 8);
    }

    private final void suggestEnablePush(AtomActionDTO firstTimeSuggestAction) {
        if (firstTimeSuggestAction != null) {
            this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(firstTimeSuggestAction, null));
            this.notificationsHandler.setEnablePushNotificationsOptionSuggestedByFirstTime(true);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        N.c(this.scope, null);
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EnableNotificationWithReplacementButtonVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindButton(item);
    }
}
