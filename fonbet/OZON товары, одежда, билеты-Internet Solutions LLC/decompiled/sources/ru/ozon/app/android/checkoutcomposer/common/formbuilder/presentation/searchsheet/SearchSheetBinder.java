package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet;

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
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetFragment;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModel;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetBinder;", "", "Landroidx/fragment/app/k;", "fragment", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel;", "viewModel", "<init>", "(Landroidx/fragment/app/k;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetFragment$Data;", "data", "", "passResult", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetFragment$Data;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetView;", "view", "setView", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetView;)V", "Landroidx/fragment/app/k;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetView;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchSheetBinder {

    @NotNull
    private final DialogInterfaceOnCancelListenerC5390k fragment;
    private SearchSheetView view;

    @NotNull
    private final SearchSheetViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel$ScreenUI;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel$ScreenUI;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<SearchSheetViewModel.ScreenUI, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SearchSheetViewModel.ScreenUI screenUI) {
            invoke2(screenUI);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SearchSheetViewModel.ScreenUI screenUI) {
            SearchSheetView searchSheetView = SearchSheetBinder.this.view;
            if (searchSheetView == null) {
                Intrinsics.n("view");
                throw null;
            }
            Intrinsics.f(screenUI);
            searchSheetView.updateUi(screenUI);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetBinder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<SearchSheetViewModel.Action, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SearchSheetViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SearchSheetViewModel.Action action) {
            if (Intrinsics.d(action, SearchSheetViewModel.Action.Dismiss.INSTANCE)) {
                SearchSheetBinder.this.fragment.dismiss();
            } else if (action instanceof SearchSheetViewModel.Action.ChangeQuery) {
                SearchSheetView searchSheetView = SearchSheetBinder.this.view;
                if (searchSheetView == null) {
                    Intrinsics.n("view");
                    throw null;
                }
                searchSheetView.changeQuery(((SearchSheetViewModel.Action.ChangeQuery) action).getQuery());
            } else {
                if (!(action instanceof SearchSheetViewModel.Action.SuggestSelected)) {
                    throw new o();
                }
                SearchSheetBinder.this.passResult(((SearchSheetViewModel.Action.SuggestSelected) action).getData());
            }
            WhenExtKt.getExhaustive(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetBinder$3, reason: invalid class name */
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
                SearchSheetView searchSheetView = SearchSheetBinder.this.view;
                if (searchSheetView != null) {
                    searchSheetView.showLoader();
                    return;
                } else {
                    Intrinsics.n("view");
                    throw null;
                }
            }
            SearchSheetView searchSheetView2 = SearchSheetBinder.this.view;
            if (searchSheetView2 != null) {
                searchSheetView2.hideLoader();
            } else {
                Intrinsics.n("view");
                throw null;
            }
        }
    }

    public SearchSheetBinder(@NotNull DialogInterfaceOnCancelListenerC5390k fragment, @NotNull SearchSheetViewModel viewModel) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.fragment = fragment;
        this.viewModel = viewModel;
        viewModel.getScreenUI().observe(fragment, new SearchSheetBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        viewModel.getAction().observe(fragment, new SearchSheetBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
        viewModel.getLoader().observe(fragment, new SearchSheetBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass3()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void passResult(SearchSheetFragment.Data data) {
        ComponentCallbacksC5392m targetFragment = this.fragment.getTargetFragment();
        if (targetFragment != null) {
            int targetRequestCode = this.fragment.getTargetRequestCode();
            Intent intent = new Intent();
            intent.putExtra("EXTRA_DATA", data);
            Unit unit = Unit.f71690a;
            targetFragment.onActivityResult(targetRequestCode, -1, intent);
        }
    }

    public final void setView(@NotNull SearchSheetView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        view.setOnSuggestClicked(new SearchSheetBinder$setView$1(this.viewModel));
        view.setOnTypedQuery(new SearchSheetBinder$setView$2(this.viewModel));
        view.setOnCloseClicked(new SearchSheetBinder$setView$3(this));
    }
}
