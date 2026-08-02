package ru.ozon.app.android.yandexsearchsheet;

import GZ.g;
import Sc.o;
import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModel;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetBinder;", "", "Landroidx/fragment/app/k;", "fragment", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel;", "viewModel", "LGZ/g;", "router", "<init>", "(Landroidx/fragment/app/k;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel;LGZ/g;)V", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "data", "", "passResult", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;)V", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action$DismissAndRedirect;", "action", "handleDismissAndRedirect", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action$DismissAndRedirect;)V", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetView;", "view", "setView", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetView;)V", "Landroidx/fragment/app/k;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel;", "LGZ/g;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetView;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YandexSearchSheetBinder {

    @NotNull
    private final DialogInterfaceOnCancelListenerC5390k fragment;

    @NotNull
    private final g router;
    private YandexSearchSheetView view;

    @NotNull
    private final YandexSearchSheetViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$ScreenUI;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$ScreenUI;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<YandexSearchSheetViewModel.ScreenUI, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(YandexSearchSheetViewModel.ScreenUI screenUI) {
            invoke2(screenUI);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(YandexSearchSheetViewModel.ScreenUI screenUI) {
            YandexSearchSheetView yandexSearchSheetView = YandexSearchSheetBinder.this.view;
            if (yandexSearchSheetView == null) {
                Intrinsics.n("view");
                throw null;
            }
            Intrinsics.f(screenUI);
            yandexSearchSheetView.updateUi(screenUI);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetBinder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<YandexSearchSheetViewModel.Action, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(YandexSearchSheetViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(YandexSearchSheetViewModel.Action action) {
            if (Intrinsics.d(action, YandexSearchSheetViewModel.Action.Dismiss.INSTANCE)) {
                YandexSearchSheetBinder.this.fragment.dismiss();
            } else if (action instanceof YandexSearchSheetViewModel.Action.ChangeQuery) {
                YandexSearchSheetView yandexSearchSheetView = YandexSearchSheetBinder.this.view;
                if (yandexSearchSheetView == null) {
                    Intrinsics.n("view");
                    throw null;
                }
                yandexSearchSheetView.changeQuery(((YandexSearchSheetViewModel.Action.ChangeQuery) action).getQuery());
            } else if (action instanceof YandexSearchSheetViewModel.Action.SuggestSelected) {
                YandexSearchSheetBinder.this.passResult(((YandexSearchSheetViewModel.Action.SuggestSelected) action).getData());
            } else {
                if (!(action instanceof YandexSearchSheetViewModel.Action.DismissAndRedirect)) {
                    throw new o();
                }
                YandexSearchSheetBinder.this.handleDismissAndRedirect((YandexSearchSheetViewModel.Action.DismissAndRedirect) action);
            }
            WhenExtKt.getExhaustive(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetBinder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (bool.booleanValue()) {
                YandexSearchSheetView yandexSearchSheetView = YandexSearchSheetBinder.this.view;
                if (yandexSearchSheetView != null) {
                    yandexSearchSheetView.showLoader();
                    return;
                } else {
                    Intrinsics.n("view");
                    throw null;
                }
            }
            YandexSearchSheetView yandexSearchSheetView2 = YandexSearchSheetBinder.this.view;
            if (yandexSearchSheetView2 != null) {
                yandexSearchSheetView2.hideLoader();
            } else {
                Intrinsics.n("view");
                throw null;
            }
        }
    }

    public YandexSearchSheetBinder(@NotNull DialogInterfaceOnCancelListenerC5390k fragment, @NotNull YandexSearchSheetViewModel viewModel, @NotNull g router) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        this.fragment = fragment;
        this.viewModel = viewModel;
        this.router = router;
        viewModel.getScreenUI().observe(fragment, new YandexSearchSheetBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        viewModel.getAction().observe(fragment, new YandexSearchSheetBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
        viewModel.getLoader().observe(fragment, new YandexSearchSheetBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass3()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDismissAndRedirect(YandexSearchSheetViewModel.Action.DismissAndRedirect action) {
        KeyboardUtilsKt.hideKeyboard(this.fragment);
        this.fragment.dismiss();
        g.a.a(this.router, action.getLink(), null, null, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void passResult(YandexSearchSheetFragment.Data data) {
        KeyboardUtilsKt.hideKeyboard(this.fragment);
        ComponentCallbacksC5392m targetFragment = this.fragment.getTargetFragment();
        if (targetFragment != null) {
            int targetRequestCode = this.fragment.getTargetRequestCode();
            Intent intent = new Intent();
            intent.putExtra("EXTRA_DATA", data);
            Unit unit = Unit.f71690a;
            targetFragment.onActivityResult(targetRequestCode, -1, intent);
        }
    }

    public final void setView(@NotNull YandexSearchSheetView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        view.setOnSuggestItemClicked(new YandexSearchSheetBinder$setView$1(this));
        view.setOnSuggestWarningClicked(new YandexSearchSheetBinder$setView$2(this.viewModel));
        view.setOnTypedQuery(new YandexSearchSheetBinder$setView$3(this.viewModel));
        view.setOnCloseClicked(new YandexSearchSheetBinder$setView$4(this));
    }
}
