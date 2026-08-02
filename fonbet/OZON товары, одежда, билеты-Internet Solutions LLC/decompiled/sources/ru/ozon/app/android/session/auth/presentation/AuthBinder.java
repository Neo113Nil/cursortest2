package ru.ozon.app.android.session.auth.presentation;

import Lm0.a;
import Sc.o;
import W10.c;
import a00.C4908c;
import a00.C4911f;
import android.os.Handler;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import r.o;
import ru.ozon.app.android.account.auth.biometry.AuthenticationSignCallback;
import ru.ozon.app.android.account.auth.biometry.BiometryAuthenicator;
import ru.ozon.app.android.account.auth.biometry.keystore.Signer;
import ru.ozon.app.android.domain.session.models.BiometricDialogConfig;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.session.R$string;
import ru.ozon.app.android.session.auth.data.Action;
import ru.ozon.app.android.session.auth.data.AuthVO;
import ru.ozon.app.android.session.auth.data.FieldAction;
import ru.ozon.app.android.session.auth.data.HintClickDTO;
import ru.ozon.app.android.session.auth.presentation.AuthBinder;
import ru.ozon.app.android.session.auth.presentation.viewHolder.AuthView;
import ru.ozon.app.android.session.auth.presentation.viewmodel.AuthViewModel;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.ui.session.biometry.BiometricAction;
import ru.ozon.app.android.ui.session.biometry.BiometricAuthViewModel;
import ru.ozon.app.android.ui.session.biometry.BiometricDialogFragment;
import ru.ozon.app.android.ui.session.routing.AuthRouter;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\"\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lru/ozon/app/android/session/auth/presentation/AuthBinder;", "", "Lru/ozon/app/android/session/auth/presentation/viewHolder/AuthView;", "view", "Lru/ozon/app/android/session/auth/presentation/viewmodel/AuthViewModel;", "viewModel", "Lru/ozon/app/android/ui/session/routing/AuthRouter;", "authRouter", "Lru/ozon/app/android/account/auth/biometry/BiometryAuthenicator;", "biometryAuthenicator", "Lru/ozon/app/android/ui/session/biometry/BiometricAuthViewModel;", "biometricViewModel", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "<init>", "(Lru/ozon/app/android/session/auth/presentation/viewHolder/AuthView;Lru/ozon/app/android/session/auth/presentation/viewmodel/AuthViewModel;Lru/ozon/app/android/ui/session/routing/AuthRouter;Lru/ozon/app/android/account/auth/biometry/BiometryAuthenicator;Lru/ozon/app/android/ui/session/biometry/BiometricAuthViewModel;Ll10/b;La00/f;)V", "Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;", "biometricDialogConfig", "", "showBiometryDialog", "(Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;)V", "Lru/ozon/app/android/session/auth/data/Action$SequentialDialog;", "sequentialDialog", "showSequentialDialog", "(Lru/ozon/app/android/session/auth/data/Action$SequentialDialog;)V", "Lru/ozon/app/android/session/auth/data/AuthVO;", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "bind", "(Lru/ozon/app/android/session/auth/data/AuthVO;LW10/c;)V", "onDestroyView", "()V", "Lru/ozon/app/android/session/auth/presentation/viewHolder/AuthView;", "getView", "()Lru/ozon/app/android/session/auth/presentation/viewHolder/AuthView;", "Lru/ozon/app/android/session/auth/presentation/viewmodel/AuthViewModel;", "Lru/ozon/app/android/ui/session/routing/AuthRouter;", "Lru/ozon/app/android/account/auth/biometry/BiometryAuthenicator;", "La00/f;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroidx/lifecycle/J;", "owner", "Landroidx/lifecycle/J;", "Landroidx/fragment/app/r;", "getActivity", "()Landroidx/fragment/app/r;", "activity", "Landroidx/fragment/app/m;", "getFragment", "()Landroidx/fragment/app/m;", "fragment", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthBinder {

    @NotNull
    private final AuthRouter authRouter;

    @NotNull
    private final BiometryAuthenicator biometryAuthenicator;

    @NotNull
    private final Handler handler;

    @NotNull
    private final J owner;

    @NotNull
    private final C4911f ownerContainer;

    @NotNull
    private final AuthView view;

    @NotNull
    private final AuthViewModel viewModel;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lru/ozon/app/android/session/auth/data/AuthVO;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.auth.presentation.AuthBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Pair<? extends AuthVO, ? extends Boolean>, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends AuthVO, ? extends Boolean> pair) {
            invoke2((Pair<AuthVO, Boolean>) pair);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<AuthVO, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<destruct>");
            AuthBinder.this.getView().bind(pair.a(), pair.b().booleanValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.auth.presentation.AuthBinder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/ui/session/biometry/BiometricAction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/ui/session/biometry/BiometricAction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.auth.presentation.AuthBinder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<BiometricAction, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BiometricAction biometricAction) {
            invoke2(biometricAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BiometricAction biometricAction) {
            if (biometricAction instanceof BiometricAction.ErrorAction) {
                AuthBinder.this.getView().onError(((BiometricAction.ErrorAction) biometricAction).getMessage());
            } else {
                if (!(biometricAction instanceof BiometricAction.CompleteAction)) {
                    throw new o();
                }
                AuthBinder.this.viewModel.completeAuthorization(((BiometricAction.CompleteAction) biometricAction).getDeeplink());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/session/auth/data/Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/session/auth/data/Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.auth.presentation.AuthBinder$4, reason: invalid class name */
    public static final class AnonymousClass4 extends AbstractC7737t implements Function1<Action, Unit> {
        final /* synthetic */ InterfaceC7851b $controller;

        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"ru/ozon/app/android/session/auth/presentation/AuthBinder$4$3", "Lru/ozon/app/android/account/auth/biometry/AuthenticationSignCallback;", "onAuthenticationSucceeded", "", "signer", "Lru/ozon/app/android/account/auth/biometry/keystore/Signer;", "onAuthenticationError", "errorCode", "", "errString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.session.auth.presentation.AuthBinder$4$3, reason: invalid class name */
        public static final class AnonymousClass3 extends AuthenticationSignCallback {
            final /* synthetic */ Action $it;
            final /* synthetic */ AuthBinder this$0;

            AnonymousClass3(AuthBinder authBinder, Action action) {
                this.this$0 = authBinder;
                this.$it = action;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void onAuthenticationSucceeded$lambda$0(Signer signer, Action action, AuthBinder authBinder) {
                Action.AuthDialog authDialog = (Action.AuthDialog) action;
                authBinder.viewModel.authByBiometry(authDialog.getAction(), signer.sign(authDialog.getMessage()));
            }

            @Override // ru.ozon.app.android.account.auth.biometry.AuthenticationSignCallback
            public void onAuthenticationError(int errorCode, CharSequence errString) {
                Intrinsics.checkNotNullParameter(errString, "errString");
                super.onAuthenticationError(errorCode, errString);
                if (errorCode == -1) {
                    this.this$0.viewModel.deleteKey();
                }
            }

            @Override // ru.ozon.app.android.account.auth.biometry.AuthenticationSignCallback
            public void onAuthenticationSucceeded(final Signer signer) {
                Intrinsics.checkNotNullParameter(signer, "signer");
                super.onAuthenticationSucceeded(signer);
                Handler handler = this.this$0.handler;
                final Action action = this.$it;
                final AuthBinder authBinder = this.this$0;
                handler.post(new Runnable() { // from class: oJ.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AuthBinder.AnonymousClass4.AnonymousClass3.onAuthenticationSucceeded$lambda$0(Signer.this, action, authBinder);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(InterfaceC7851b interfaceC7851b) {
            super(1);
            this.$controller = interfaceC7851b;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Action action) {
            Unit unit;
            if (action instanceof Action.Progress) {
                if (action instanceof Action.Progress.Show) {
                    AuthBinder.this.getView().onProgress();
                } else {
                    AuthBinder.this.getView().onHideProgress();
                }
                unit = Unit.f71690a;
            } else if (action instanceof Action.Completed) {
                AuthRouter.completeFlow$default(AuthBinder.this.authRouter, ((Action.Completed) action).getDeeplink(), null, 2, null);
                unit = Unit.f71690a;
            } else if (action instanceof Action.Error) {
                AuthBinder.this.getView().onError(((Action.Error) action).getMessage());
                unit = Unit.f71690a;
            } else if (action instanceof Action.Reload) {
                Action.Reload reload = (Action.Reload) action;
                String message = reload.getMessage();
                if (message != null) {
                    AuthBinder.this.getView().onError(message);
                }
                InterfaceC7851b.a.a(this.$controller, reload.getDeeplink(), null, reload.getPostData(), null, 10);
                unit = Unit.f71690a;
            } else if (action instanceof Action.SilentReload) {
                InterfaceC7851b.a.e(this.$controller, null, null, null, 7);
                unit = Unit.f71690a;
            } else if (action instanceof Action.Redirect) {
                Action.Redirect redirect = (Action.Redirect) action;
                String deeplink = redirect.getDeeplink();
                if (deeplink != null) {
                    AuthBinder.this.authRouter.openFlowDeeplink(deeplink, redirect.getPostData());
                    unit = Unit.f71690a;
                } else {
                    unit = null;
                }
            } else if (action instanceof Action.BiometryDialog) {
                AuthBinder.this.showBiometryDialog(((Action.BiometryDialog) action).getBiometricDialogConfig());
                unit = Unit.f71690a;
            } else if (action instanceof Action.AuthDialog) {
                ComponentCallbacksC5392m fragment = AuthBinder.this.getFragment();
                if (fragment != null) {
                    o.d.a aVar = new o.d.a();
                    aVar.f(StringProvider.getString(R$string.cabinet_auth_biometry_android));
                    aVar.d(StringProvider.getString(ru.ozon.app.android.uikit.R$string.common_action_cancel));
                    o.d a11 = aVar.a();
                    Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
                    AuthBinder.this.biometryAuthenicator.authenticate(fragment, a11, new AnonymousClass3(AuthBinder.this, action));
                }
                unit = Unit.f71690a;
            } else if (action instanceof Action.SberLogin) {
                String uri = LinkGenerator.INSTANCE.externalLink(((Action.SberLogin) action).getUrl(), true).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                AuthBinder.this.authRouter.openExternalDeeplink(uri);
                unit = Unit.f71690a;
            } else {
                if (!(action instanceof Action.SequentialDialog)) {
                    throw new Sc.o();
                }
                AuthBinder.this.showSequentialDialog((Action.SequentialDialog) action);
                unit = Unit.f71690a;
            }
            WhenExtKt.getExhaustive(unit);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dto", "Lru/ozon/app/android/session/auth/data/HintClickDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.auth.presentation.AuthBinder$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<HintClickDTO, Unit> {
        final /* synthetic */ InterfaceC7851b $controller;
        final /* synthetic */ AuthBinder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(InterfaceC7851b interfaceC7851b, AuthBinder authBinder) {
            super(1);
            this.$controller = interfaceC7851b;
            this.this$0 = authBinder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HintClickDTO hintClickDTO) {
            invoke2(hintClickDTO);
            return Unit.f71690a;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HintClickDTO dto) {
            String action;
            String deeplink;
            Intrinsics.checkNotNullParameter(dto, "dto");
            String type = dto.getType();
            switch (type.hashCode()) {
                case -1422950858:
                    if (type.equals("action") && (action = dto.getAction()) != null) {
                        this.this$0.viewModel.onActionClick(action);
                        break;
                    }
                    break;
                case -934641255:
                    if (type.equals(DeleteAccountApiResponse.Error.TYPE_RELOAD)) {
                        InterfaceC7851b.a.a(this.$controller, dto.getDeeplink(), null, dto.getPostData(), null, 10);
                        break;
                    }
                    break;
                case 629233382:
                    if (type.equals("deeplink") && (deeplink = dto.getDeeplink()) != null) {
                        this.this$0.authRouter.openFlowDeeplink(deeplink, dto.getPostData());
                        break;
                    }
                    break;
                case 976950555:
                    if (type.equals("biometry")) {
                        AuthViewModel authViewModel = this.this$0.viewModel;
                        String action2 = dto.getAction();
                        Map<String, Object> postData = dto.getPostData();
                        Object obj = postData != null ? postData.get("biometry_chalenge") : null;
                        authViewModel.tryShowAuthDialog(action2, obj instanceof String ? (String) obj : null);
                        break;
                    }
                    break;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.auth.presentation.AuthBinder$6, reason: invalid class name */
    /* synthetic */ class AnonymousClass6 extends C7735q implements Function0<Unit> {
        AnonymousClass6(Object obj) {
            super(0, obj, AuthViewModel.class, "onSubmitButtonClicked", "onSubmitButtonClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AuthViewModel) this.receiver).onSubmitButtonClicked();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.auth.presentation.AuthBinder$7, reason: invalid class name */
    /* synthetic */ class AnonymousClass7 extends C7735q implements Function1<FieldAction, Unit> {
        AnonymousClass7(Object obj) {
            super(1, obj, AuthViewModel.class, "onFieldAction", "onFieldAction(Lru/ozon/app/android/session/auth/data/FieldAction;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FieldAction fieldAction) {
            invoke2(fieldAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FieldAction p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((AuthViewModel) this.receiver).onFieldAction(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.auth.presentation.AuthBinder$8, reason: invalid class name */
    /* synthetic */ class AnonymousClass8 extends C7735q implements Function0<Unit> {
        AnonymousClass8(Object obj) {
            super(0, obj, AuthViewModel.class, "authBySberId", "authBySberId()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AuthViewModel) this.receiver).authBySberId();
        }
    }

    public AuthBinder(@NotNull AuthView view, @NotNull AuthViewModel viewModel, @NotNull AuthRouter authRouter, @NotNull BiometryAuthenicator biometryAuthenicator, @NotNull BiometricAuthViewModel biometricViewModel, @NotNull InterfaceC7851b controller, @NotNull C4911f ownerContainer) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(authRouter, "authRouter");
        Intrinsics.checkNotNullParameter(biometryAuthenicator, "biometryAuthenicator");
        Intrinsics.checkNotNullParameter(biometricViewModel, "biometricViewModel");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        this.view = view;
        this.viewModel = viewModel;
        this.authRouter = authRouter;
        this.biometryAuthenicator = biometryAuthenicator;
        this.ownerContainer = ownerContainer;
        this.handler = new Handler();
        C4908c g10 = ownerContainer.g();
        this.owner = g10;
        RxExtKt.observe$default(viewModel.pageSource(), g10, new AnonymousClass1(), new AnonymousClass2(a.f17149a), null, 8, null);
        biometricViewModel.getBiometricActions().observe(g10, new AuthBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass3()));
        viewModel.getActionLiveData().observe(g10, new AuthBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass4(controller)));
        view.setOnHintClicked(new AnonymousClass5(controller, this));
        view.setOnSubmitButtonClicked(new AnonymousClass6(viewModel));
        view.setOnFieldAction(new AnonymousClass7(viewModel));
        view.setOnSberAuthClicked(new AnonymousClass8(viewModel));
    }

    private final r getActivity() {
        return this.ownerContainer.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComponentCallbacksC5392m getFragment() {
        return this.ownerContainer.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBiometryDialog(BiometricDialogConfig biometricDialogConfig) {
        BiometricDialogFragment.INSTANCE.newInstance(biometricDialogConfig).show(getActivity().getSupportFragmentManager(), "BiometricDialogFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSequentialDialog(Action.SequentialDialog sequentialDialog) {
        if (sequentialDialog.getBiometricConfig() != null) {
            BiometricDialogFragment.INSTANCE.newInstance(sequentialDialog.getBiometricConfig()).show(getActivity().getSupportFragmentManager(), "BiometricDialogFragment");
        }
    }

    public final void bind(@NotNull AuthVO item, c trackingData) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.bind(item);
        this.viewModel.setTrackingData(trackingData);
    }

    @NotNull
    public final AuthView getView() {
        return this.view;
    }

    public final void onDestroyView() {
        this.view.onDestroyView();
    }
}
