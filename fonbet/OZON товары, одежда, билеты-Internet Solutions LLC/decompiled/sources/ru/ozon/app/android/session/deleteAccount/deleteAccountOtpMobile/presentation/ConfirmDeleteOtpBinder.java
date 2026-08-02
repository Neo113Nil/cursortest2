package ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation;

import GZ.g;
import Sc.o;
import a00.C4911f;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.newrouter.RouterExtKt;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpBinder;", "", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel;", "viewModel", "LGZ/g;", "router", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "owner", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel;LGZ/g;La00/f;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "link", "", "finishFlow", "(Ljava/lang/String;)V", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpWidgetView;", "view", "setView", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpWidgetView;)V", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO;", "data", "bind", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO;)V", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel;", "LGZ/g;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpWidgetView;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConfirmDeleteOtpBinder {

    @NotNull
    private final g router;
    private ConfirmDeleteOtpWidgetView view;

    @NotNull
    private final ConfirmDeleteOtpViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<ConfirmDeleteOtpViewModel.Action, Unit> {
        final /* synthetic */ ComposerReferences $references;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComposerReferences composerReferences) {
            super(1);
            this.$references = composerReferences;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConfirmDeleteOtpViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ConfirmDeleteOtpViewModel.Action action) {
            Unit unit = null;
            if (action instanceof ConfirmDeleteOtpViewModel.Action.UpdateTimer) {
                ConfirmDeleteOtpWidgetView confirmDeleteOtpWidgetView = ConfirmDeleteOtpBinder.this.view;
                if (confirmDeleteOtpWidgetView != null) {
                    confirmDeleteOtpWidgetView.updateTimerButton((ConfirmDeleteOtpViewModel.Action.UpdateTimer) action);
                    unit = Unit.f71690a;
                }
            } else if (action instanceof ConfirmDeleteOtpViewModel.Action.Notification) {
                ConfirmDeleteOtpWidgetView confirmDeleteOtpWidgetView2 = ConfirmDeleteOtpBinder.this.view;
                if (confirmDeleteOtpWidgetView2 != null) {
                    confirmDeleteOtpWidgetView2.showMessage(((ConfirmDeleteOtpViewModel.Action.Notification) action).getMessage());
                    unit = Unit.f71690a;
                }
            } else if (action instanceof ConfirmDeleteOtpViewModel.Action.Error) {
                ConfirmDeleteOtpWidgetView confirmDeleteOtpWidgetView3 = ConfirmDeleteOtpBinder.this.view;
                if (confirmDeleteOtpWidgetView3 != null) {
                    confirmDeleteOtpWidgetView3.showError(((ConfirmDeleteOtpViewModel.Action.Error) action).getMessage());
                    unit = Unit.f71690a;
                }
            } else if (action instanceof ConfirmDeleteOtpViewModel.Action.Navigate) {
                ComposerNavigator.DefaultImpls.openDeeplink$default(this.$references.getNavigator(), ((ConfirmDeleteOtpViewModel.Action.Navigate) action).getLink(), null, 2, null);
                unit = Unit.f71690a;
            } else if (action instanceof ConfirmDeleteOtpViewModel.Action.Complete) {
                ConfirmDeleteOtpBinder.this.finishFlow(((ConfirmDeleteOtpViewModel.Action.Complete) action).getLink());
                unit = Unit.f71690a;
            } else if (Intrinsics.d(action, ConfirmDeleteOtpViewModel.Action.StartLoading.INSTANCE)) {
                this.$references.getController().e(new l.a.C1079a(0L, null, 3));
                unit = Unit.f71690a;
            } else {
                if (!Intrinsics.d(action, ConfirmDeleteOtpViewModel.Action.FinishLoading.INSTANCE)) {
                    throw new o();
                }
                this.$references.getController().hideLoader();
                unit = Unit.f71690a;
            }
            ExtensionsKt.getExhaustive(unit);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$State;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$State;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpBinder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<ConfirmDeleteOtpViewModel.State, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConfirmDeleteOtpViewModel.State state) {
            invoke2(state);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ConfirmDeleteOtpViewModel.State state) {
            ConfirmDeleteOtpWidgetView confirmDeleteOtpWidgetView = ConfirmDeleteOtpBinder.this.view;
            if (confirmDeleteOtpWidgetView != null) {
                confirmDeleteOtpWidgetView.bind(state.getData());
            }
        }
    }

    public ConfirmDeleteOtpBinder(@NotNull ConfirmDeleteOtpViewModel viewModel, @NotNull g router, @NotNull C4911f owner, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(references, "references");
        this.viewModel = viewModel;
        this.router = router;
        viewModel.getAction().observe(owner.g(), new ConfirmDeleteOtpBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(references)));
        viewModel.getState().observe(owner.g(), new ConfirmDeleteOtpBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishFlow(String link) {
        RouterExtKt.clearBackStack(this.router);
        if (link != null) {
            g.a.a(this.router, link, null, null, 6);
        }
    }

    public final void bind(@NotNull ConfirmDeleteOtpVO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.viewModel.bind(data);
    }

    public final void setView(@NotNull ConfirmDeleteOtpWidgetView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        view.setOnTryValidate(new ConfirmDeleteOtpBinder$setView$1(this.viewModel));
        view.setOnContinueClicked(new ConfirmDeleteOtpBinder$setView$2(this.viewModel));
        view.setOnResendCodeClicked(new ConfirmDeleteOtpBinder$setView$3(this.viewModel));
    }
}
