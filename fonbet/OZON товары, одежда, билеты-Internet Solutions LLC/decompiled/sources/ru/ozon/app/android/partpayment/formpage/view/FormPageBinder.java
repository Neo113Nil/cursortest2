package ru.ozon.app.android.partpayment.formpage.view;

import Lm0.a;
import Sc.o;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageBinder;", "", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel;", "viewModel", "Lru/ozon/app/android/partpayment/formpage/view/FormPageRouter;", "router", "Landroidx/fragment/app/m;", "fragment", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "bus", "<init>", "(Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel;Lru/ozon/app/android/partpayment/formpage/view/FormPageRouter;Landroidx/fragment/app/m;Ll10/b;)V", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$ShowPage;", "action", "", "forBackWithRefresh", "", "showPage", "(Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$ShowPage;Z)V", "backToPreviousPage", "()V", "Lru/ozon/app/android/partpayment/formpage/view/FormPageView;", "view", "setView", "(Lru/ozon/app/android/partpayment/formpage/view/FormPageView;)V", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageRouter;", "Landroidx/fragment/app/m;", "Ll10/b;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageView;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormPageBinder {

    @NotNull
    private final InterfaceC7851b bus;

    @NotNull
    private final ComponentCallbacksC5392m fragment;

    @NotNull
    private final FormPageRouter router;
    private FormPageView view;

    @NotNull
    private final FormPageViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.partpayment.formpage.view.FormPageBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Pair<? extends FormPageVO, ? extends Boolean>, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends FormPageVO, ? extends Boolean> pair) {
            invoke2((Pair<FormPageVO, Boolean>) pair);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<FormPageVO, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<destruct>");
            FormPageVO a11 = pair.a();
            boolean booleanValue = pair.b().booleanValue();
            FormPageView formPageView = FormPageBinder.this.view;
            if (formPageView == null) {
                Intrinsics.n("view");
                throw null;
            }
            formPageView.setTitle(a11.getTitle());
            FormPageView formPageView2 = FormPageBinder.this.view;
            if (formPageView2 != null) {
                formPageView2.setFields(a11.getFields(), booleanValue);
            } else {
                Intrinsics.n("view");
                throw null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.partpayment.formpage.view.FormPageBinder$2, reason: invalid class name */
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

    public FormPageBinder(@NotNull FormPageViewModel viewModel, @NotNull FormPageRouter router, @NotNull ComponentCallbacksC5392m fragment, @NotNull InterfaceC7851b bus) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(bus, "bus");
        this.viewModel = viewModel;
        this.router = router;
        this.fragment = fragment;
        this.bus = bus;
        RxExtKt.observe$default(viewModel.pageSource(), fragment, new AnonymousClass1(), new AnonymousClass2(a.f17149a), null, 8, null);
        viewModel.getAction().observe(fragment, new WB.a(this, 0));
        fragment.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.partpayment.formpage.view.FormPageBinder.4
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                FormPageBinder.this.viewModel.onStart();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(FormPageBinder formPageBinder, FormPageViewModel.Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof FormPageViewModel.Action.ClearFocus) {
            formPageBinder.backToPreviousPage();
        } else if (action instanceof FormPageViewModel.Action.Loading) {
            FormPageView formPageView = formPageBinder.view;
            if (formPageView == null) {
                Intrinsics.n("view");
                throw null;
            }
            formPageView.showLoading(((FormPageViewModel.Action.Loading) action).getIsShowing());
        } else if (action instanceof FormPageViewModel.Action.Alert) {
            FormPageView formPageView2 = formPageBinder.view;
            if (formPageView2 == null) {
                Intrinsics.n("view");
                throw null;
            }
            FormPageViewModel.Action.Alert alert = (FormPageViewModel.Action.Alert) action;
            formPageView2.showAlert(alert.getScreenState(), alert.getMessage());
        } else if (action instanceof FormPageViewModel.Action.ShowPickerScreen) {
            FormPageRouter formPageRouter = formPageBinder.router;
            ComponentCallbacksC5392m componentCallbacksC5392m = formPageBinder.fragment;
            FormPageViewModel.Action.ShowPickerScreen showPickerScreen = (FormPageViewModel.Action.ShowPickerScreen) action;
            String obj = showPickerScreen.getField().getTitle().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            formPageRouter.showPickerScreen(componentCallbacksC5392m, obj, showPickerScreen.getField().getOptions());
        } else if (action instanceof FormPageViewModel.Action.ShowPage) {
            FormPageViewModel.Action.ShowPage showPage = (FormPageViewModel.Action.ShowPage) action;
            formPageBinder.showPage(showPage, showPage.getForBackWithRefresh());
        } else if (!(action instanceof FormPageViewModel.Action.ShowCameraScreen)) {
            if (Intrinsics.d(action, FormPageViewModel.Action.Refresh.INSTANCE)) {
                InterfaceC7851b.a.a(formPageBinder.bus, null, null, null, null, 15);
            } else if (action instanceof FormPageViewModel.Action.RetryUploadPhoto) {
                FormPageView formPageView3 = formPageBinder.view;
                if (formPageView3 == null) {
                    Intrinsics.n("view");
                    throw null;
                }
                formPageView3.showRetrySnackBar(((FormPageViewModel.Action.RetryUploadPhoto) action).getRetryInfo());
            } else {
                if (!Intrinsics.d(action, FormPageViewModel.Action.GoBack.INSTANCE)) {
                    throw new o();
                }
                r requireActivity = formPageBinder.fragment.requireActivity();
                requireActivity.setResult(-1);
                requireActivity.finish();
            }
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    private final void backToPreviousPage() {
        FormPageView formPageView = this.view;
        if (formPageView == null) {
            Intrinsics.n("view");
            throw null;
        }
        formPageView.hideAlerts();
        this.router.backToPreviousPage(this.fragment);
    }

    private final void showPage(FormPageViewModel.Action.ShowPage action, boolean forBackWithRefresh) {
        if (forBackWithRefresh) {
            this.router.openDeeplinkForBackWithRefresh(action.getDeeplink());
        } else {
            this.router.openDeeplink(action.getDeeplink());
        }
    }

    public final void setView(@NotNull FormPageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        view.setOnFieldChanged(new FormPageBinder$setView$1(this.viewModel));
        view.setOnPickerClick(new FormPageBinder$setView$2(this.viewModel));
        view.setOnButtonClick(new FormPageBinder$setView$3(this.viewModel));
        view.setOnAutocompleteRequested(new FormPageBinder$setView$4(this.viewModel));
        view.setOnNewPaymentMethodSelected(new FormPageBinder$setView$5(this.viewModel));
        view.setOnEditFormClicked(new FormPageBinder$setView$6(this.viewModel));
        view.setOnActionClicked(new FormPageBinder$setView$7(this.viewModel));
        view.setOnReportErrorClicked(new FormPageBinder$setView$8(this.viewModel));
        view.setOnRetryClick(new FormPageBinder$setView$9(this.viewModel));
    }
}
