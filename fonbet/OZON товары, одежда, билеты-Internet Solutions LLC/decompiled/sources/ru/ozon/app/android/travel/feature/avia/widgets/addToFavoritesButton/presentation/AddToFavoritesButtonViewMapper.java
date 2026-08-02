package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation;

import a00.h;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.favorites.AddToFavoritesViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.data.AddToFavoritesButtonDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.di.AddToFavoritesButtonComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.view.AddToFavoritesButtonView;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/data/AddToFavoritesButtonDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/di/AddToFavoritesButtonComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/di/AddToFavoritesButtonComponent;)V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/data/AddToFavoritesButtonDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/di/AddToFavoritesButtonComponent;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddToFavoritesButtonViewMapper extends g<AddToFavoritesButtonDTO, AddToFavoritesButtonVI> {

    @NotNull
    private final AddToFavoritesButtonComponent component;

    public AddToFavoritesButtonViewMapper(@NotNull AddToFavoritesButtonComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<AddToFavoritesButtonVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        AddToFavoritesButtonView addToFavoritesButtonView = (AddToFavoritesButtonView) view;
        h a02 = container.a0();
        final AddToFavoritesButtonComponent addToFavoritesButtonComponent = this.component;
        return new AddToFavoritesButtonWidgetViewHolder(addToFavoritesButtonView, (AddToFavoritesViewModel) new z0(a02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation.AddToFavoritesButtonViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AddToFavoritesViewModel viewModel = AddToFavoritesButtonComponent.this.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(AddToFavoritesViewModel.class), (TravelOnboardingViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation.AddToFavoritesButtonViewMapper$createHolder$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                AddToFavoritesButtonComponent addToFavoritesButtonComponent2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                addToFavoritesButtonComponent2 = AddToFavoritesButtonViewMapper.this.component;
                TravelOnboardingViewModel onBoardingViewModel = addToFavoritesButtonComponent2.getOnBoardingViewModel();
                Intrinsics.g(onBoardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return onBoardingViewModel;
            }
        }).a(TravelOnboardingViewModel.class), this.component.getProductFavoriteDelegateProvider().provideV4Delegate(container), this.component.getFavoriteManager(), this.component.getCustomActionHandlersStoreFactory(), container);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AddToFavoritesButtonView addToFavoritesButtonView = new AddToFavoritesButtonView(context);
        addToFavoritesButtonView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Context context2 = addToFavoritesButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(44, context2);
        addToFavoritesButtonView.setMinimumWidth(px);
        addToFavoritesButtonView.setMinimumHeight(px);
        return addToFavoritesButtonView;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AddToFavoritesButtonVI> map(@NotNull AddToFavoritesButtonDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
