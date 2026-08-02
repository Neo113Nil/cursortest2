package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.configurator;

import Ib.a;
import a00.h;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.B0;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.ConfirmDateButtonViewModel;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/configurator/ConfirmDeliveryDateActionButtonsConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LIb/a;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel;", "viewModel", "<init>", "(LIb/a;)V", "Landroidx/fragment/app/r;", "activity", "", "nextPage", "(Landroidx/fragment/app/r;)V", "onComposerInitialized", "()V", "LIb/a;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmDeliveryDateActionButtonsConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<ConfirmDateButtonViewModel> viewModel;
    public static final int $stable = 8;

    public ConfirmDeliveryDateActionButtonsConfigurator(@NotNull a<ConfirmDateButtonViewModel> viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nextPage(r activity) {
        ComponentCallbacksC5392m j11 = getContainer().j();
        if (j11.isAdded()) {
            ComponentCallbacksC5392m requireParentFragment = j11.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
            if (requireParentFragment.isAdded()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("update_order_details_key", true);
                requireParentFragment.getParentFragmentManager().m1(bundle, "update_order_details_result");
                activity.onBackPressed();
            }
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        P<ConfirmDateButtonViewModel.State> actions;
        P<Boolean> loading;
        h viewModelOwnerProvider;
        B0 a11;
        ConfiguratorReferences references = getReferences();
        ConfirmDateButtonViewModel confirmDateButtonViewModel = (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (a11 = viewModelOwnerProvider.a()) == null) ? null : (ConfirmDateButtonViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.orderdetails.deliverytimeselector.v2.configurator.ConfirmDeliveryDateActionButtonsConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = ConfirmDeliveryDateActionButtonsConfigurator.this.viewModel;
                ConfirmDateButtonViewModel confirmDateButtonViewModel2 = (ConfirmDateButtonViewModel) aVar.get();
                Intrinsics.g(confirmDateButtonViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return confirmDateButtonViewModel2;
            }
        }).a(ConfirmDateButtonViewModel.class);
        if (confirmDateButtonViewModel != null && (loading = confirmDateButtonViewModel.getLoading()) != null) {
            loading.observe(getOwner(), new ConfirmDeliveryDateActionButtonsConfigurator$sam$androidx_lifecycle_Observer$0(new ConfirmDeliveryDateActionButtonsConfigurator$onComposerInitialized$1(this)));
        }
        if (confirmDateButtonViewModel == null || (actions = confirmDateButtonViewModel.getActions()) == null) {
            return;
        }
        actions.observe(getOwner(), new ConfirmDeliveryDateActionButtonsConfigurator$sam$androidx_lifecycle_Observer$0(new ConfirmDeliveryDateActionButtonsConfigurator$onComposerInitialized$2(this)));
    }
}
