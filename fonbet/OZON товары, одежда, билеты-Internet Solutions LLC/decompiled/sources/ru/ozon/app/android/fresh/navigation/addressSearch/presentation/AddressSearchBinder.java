package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import Sc.o;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModel;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchBinder;", "", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel;", "viewModel", "<init>", "(Landroidx/fragment/app/m;Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel;)V", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchView;", "view", "", "setView", "(Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchView;)V", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel;", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchView;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressSearchBinder {
    private AddressSearchView view;

    @NotNull
    private final AddressSearchViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$ScreenUI;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$ScreenUI;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AddressSearchViewModel.ScreenUI, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AddressSearchViewModel.ScreenUI screenUI) {
            invoke2(screenUI);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AddressSearchViewModel.ScreenUI screenUI) {
            AddressSearchView addressSearchView = AddressSearchBinder.this.view;
            if (addressSearchView == null) {
                Intrinsics.n("view");
                throw null;
            }
            Intrinsics.f(screenUI);
            addressSearchView.updateUi(screenUI);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchBinder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AddressSearchViewModel.Action, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AddressSearchViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AddressSearchViewModel.Action action) {
            if (action instanceof AddressSearchViewModel.Action.ChangeQuery) {
                AddressSearchView addressSearchView = AddressSearchBinder.this.view;
                if (addressSearchView == null) {
                    Intrinsics.n("view");
                    throw null;
                }
                addressSearchView.changeQuery(((AddressSearchViewModel.Action.ChangeQuery) action).getQuery());
            } else {
                if (!(action instanceof AddressSearchViewModel.Action.ShowError)) {
                    throw new o();
                }
                AddressSearchView addressSearchView2 = AddressSearchBinder.this.view;
                if (addressSearchView2 == null) {
                    Intrinsics.n("view");
                    throw null;
                }
                addressSearchView2.showError(((AddressSearchViewModel.Action.ShowError) action).getError());
            }
            ExtensionsKt.getExhaustive(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchBinder$3, reason: invalid class name */
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
                AddressSearchView addressSearchView = AddressSearchBinder.this.view;
                if (addressSearchView != null) {
                    addressSearchView.showLoader();
                    return;
                } else {
                    Intrinsics.n("view");
                    throw null;
                }
            }
            AddressSearchView addressSearchView2 = AddressSearchBinder.this.view;
            if (addressSearchView2 != null) {
                addressSearchView2.hideLoader();
            } else {
                Intrinsics.n("view");
                throw null;
            }
        }
    }

    public AddressSearchBinder(@NotNull ComponentCallbacksC5392m fragment, @NotNull AddressSearchViewModel viewModel) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
        viewModel.getScreenUI().observe(fragment, new AddressSearchBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        viewModel.getAction().observe(fragment, new AddressSearchBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
        viewModel.getLoader().observe(fragment, new AddressSearchBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass3()));
    }

    public final void setView(@NotNull AddressSearchView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        view.setOnSuggestClicked(new AddressSearchBinder$setView$1(this.viewModel));
    }
}
