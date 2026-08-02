package ru.ozon.app.android.session.editCredential.otp.presentation;

import Sc.InterfaceC4003e;
import Sc.o;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.session.updatekey.OnTimerUpdate;
import ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetDTO;
import ru.ozon.app.android.session.editCredential.otp.presentation.Action;
import ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModel;
import ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.PageState;
import ru.ozon.app.android.ui.session.routing.AuthRouter;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetBinder;", "", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetView;", "view", "Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/OTPWidgetViewModel;", "otpWidgetViewModel", "Landroidx/lifecycle/J;", "owner", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "bus", "Lru/ozon/app/android/ui/session/routing/AuthRouter;", "authRouter", "<init>", "(Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetView;Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/OTPWidgetViewModel;Landroidx/lifecycle/J;Ll10/b;Lru/ozon/app/android/ui/session/routing/AuthRouter;)V", "", "deeplink", "trackClick", "", "proceedClickAction", "(Lru/ozon/app/android/ui/session/routing/AuthRouter;Ljava/lang/String;Ljava/lang/String;)V", "onDestroyView", "()V", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetView;", "Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/OTPWidgetViewModel;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OTPWidgetBinder {

    @NotNull
    private final OTPWidgetViewModel otpWidgetViewModel;

    @NotNull
    private final OTPWidgetView view;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/session/editCredential/otp/presentation/Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/session/editCredential/otp/presentation/Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Action, Unit> {
        final /* synthetic */ AuthRouter $authRouter;
        final /* synthetic */ InterfaceC7851b $bus;
        final /* synthetic */ OTPWidgetBinder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC7851b interfaceC7851b, AuthRouter authRouter, OTPWidgetBinder oTPWidgetBinder) {
            super(1);
            this.$bus = interfaceC7851b;
            this.$authRouter = authRouter;
            this.this$0 = oTPWidgetBinder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Action action) {
            if (action instanceof Action.Deeplink) {
                Action.Deeplink deeplink = (Action.Deeplink) action;
                if (!deeplink.getIsNewCode()) {
                    this.$authRouter.openFlowDeeplink(deeplink.getDeeplink(), deeplink.getData());
                    return;
                } else {
                    InterfaceC7851b.a.e(this.$bus, deeplink.getDeeplink(), null, deeplink.getData(), 2);
                    this.$bus.update(OnTimerUpdate.INSTANCE);
                    return;
                }
            }
            if (action instanceof Action.Complete) {
                this.this$0.otpWidgetViewModel.completeFlow();
                Action.Complete complete = (Action.Complete) action;
                this.$authRouter.completeFlow(complete.getDeeplink(), complete.getMessage());
            } else {
                if (action instanceof Action.ValidationError) {
                    this.this$0.view.onValidationError();
                    return;
                }
                if (action instanceof Action.Error) {
                    this.this$0.view.onError(((Action.Error) action).getMessage());
                    return;
                }
                if (action instanceof Action.Reload) {
                    Action.Reload reload = (Action.Reload) action;
                    InterfaceC7851b.a.a(this.$bus, reload.getDeeplink(), null, reload.getData(), null, 10);
                } else {
                    if (!(action instanceof Action.SelectorFastEntryAuth)) {
                        throw new o();
                    }
                    this.$authRouter.completeFlowAndOpenBottomsheet(((Action.SelectorFastEntryAuth) action).getDeeplink());
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetBinder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 implements W, InterfaceC7732n {
        final /* synthetic */ OTPWidgetView $tmp0;

        AnonymousClass2(OTPWidgetView oTPWidgetView) {
            this.$tmp0 = oTPWidgetView;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return new C7735q(1, this.$tmp0, OTPWidgetView.class, "updateTimer", "updateTimer(Lru/ozon/app/android/session/editCredential/otp/presentation/TimerAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.W
        public final void onChanged(TimerAction p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            this.$tmp0.updateTimer(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/PageState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/PageState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetBinder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<PageState, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PageState pageState) {
            invoke2(pageState);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PageState pageState) {
            OTPWidgetVO vo;
            if (pageState != null) {
                if (pageState.getSilentRefresh()) {
                    pageState = null;
                }
                if (pageState == null || (vo = pageState.getVo()) == null) {
                    return;
                }
                OTPWidgetBinder.this.view.bind(vo);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetBinder$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 extends C7735q implements Function1<OTPWidgetDTO.RetryButton, Unit> {
        AnonymousClass4(Object obj) {
            super(1, obj, OTPWidgetViewModel.class, "setTimer", "setTimer(Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OTPWidgetDTO.RetryButton retryButton) {
            invoke2(retryButton);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OTPWidgetDTO.RetryButton p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((OTPWidgetViewModel) this.receiver).setTimer(p02);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetBinder$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OTPWidgetViewModel.DefaultImpls.checkCode$default(OTPWidgetBinder.this.otpWidgetViewModel, null, 1, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetBinder$6, reason: invalid class name */
    /* synthetic */ class AnonymousClass6 extends C7735q implements Function1<String, Unit> {
        AnonymousClass6(Object obj) {
            super(1, obj, OTPWidgetViewModel.class, "checkCode", "checkCode(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            ((OTPWidgetViewModel) this.receiver).checkCode(str);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "deeplink", "", "trackClick", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetBinder$7, reason: invalid class name */
    static final class AnonymousClass7 extends AbstractC7737t implements Function2<String, String, Unit> {
        final /* synthetic */ AuthRouter $authRouter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(AuthRouter authRouter) {
            super(2);
            this.$authRouter = authRouter;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            invoke2(str, str2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String deeplink, String str) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            OTPWidgetBinder.this.proceedClickAction(this.$authRouter, deeplink, str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "deeplink", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetBinder$8, reason: invalid class name */
    static final class AnonymousClass8 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ AuthRouter $authRouter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(AuthRouter authRouter) {
            super(1);
            this.$authRouter = authRouter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            OTPWidgetBinder.proceedClickAction$default(OTPWidgetBinder.this, this.$authRouter, deeplink, null, 4, null);
        }
    }

    public OTPWidgetBinder(@NotNull OTPWidgetView view, @NotNull OTPWidgetViewModel otpWidgetViewModel, @NotNull J owner, @NotNull InterfaceC7851b bus, @NotNull AuthRouter authRouter) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(otpWidgetViewModel, "otpWidgetViewModel");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(bus, "bus");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        this.view = view;
        this.otpWidgetViewModel = otpWidgetViewModel;
        otpWidgetViewModel.getActions().observe(owner, new OTPWidgetBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(bus, authRouter, this)));
        otpWidgetViewModel.getTimerActions().observe(owner, new AnonymousClass2(view));
        otpWidgetViewModel.getPageState().observe(owner, new OTPWidgetBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass3()));
        view.setSetRetryTimer(new AnonymousClass4(otpWidgetViewModel));
        view.setOnGetNewCodeClicked(new AnonymousClass5());
        view.setOnTryValidate(new AnonymousClass6(otpWidgetViewModel));
        view.setOnDeeplinkClicked(new AnonymousClass7(authRouter));
        view.setOnSubtitleClicked(new AnonymousClass8(authRouter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void proceedClickAction(AuthRouter authRouter, String deeplink, String trackClick) {
        this.otpWidgetViewModel.trackClick(trackClick);
        AuthRouter.openFlowDeeplink$default(authRouter, deeplink, null, 2, null);
    }

    static /* synthetic */ void proceedClickAction$default(OTPWidgetBinder oTPWidgetBinder, AuthRouter authRouter, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        oTPWidgetBinder.proceedClickAction(authRouter, str, str2);
    }

    public final void onDestroyView() {
        this.view.onDestroyView();
    }
}
