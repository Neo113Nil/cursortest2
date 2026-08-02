package ru.ozon.app.android.checkoutcomposer.common.configurator;

import Sc.o;
import a00.C4908c;
import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.BaseActionHandler;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.di.AddressPartsInputComponent;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputViewModel;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0007H\u0014J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/configurator/AddressPartsInputPageConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onComposerInitialized", "handleState", "state", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel$State;", "showDefaultError", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressPartsInputPageConfigurator extends ComposerScreenConfig.PageConfigurator {
    private Function1<? super AtomAction, Unit> actionHandler;

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState(AddressPartsInputViewModel.State state) {
        if (!(state instanceof AddressPartsInputViewModel.State.Action)) {
            if (!(state instanceof AddressPartsInputViewModel.State.Error)) {
                throw new o();
            }
            showDefaultError();
        } else {
            Function1<? super AtomAction, Unit> function1 = this.actionHandler;
            if (function1 != null) {
                function1.invoke(((AddressPartsInputViewModel.State.Action) state).getAction());
            }
        }
    }

    private final void showDefaultError() {
        ConfiguratorReferences references;
        C4911f ownerContainer;
        C4908c g10;
        C4911f ownerContainer2;
        ConfiguratorReferences references2 = getReferences();
        ViewGroup rootView = ContextExtKt.getRootView((references2 == null || (ownerContainer2 = references2.getOwnerContainer()) == null) ? null : ownerContainer2.a());
        if (rootView == null || (references = getReferences()) == null || (ownerContainer = references.getOwnerContainer()) == null || (g10 = ownerContainer.g()) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, g10, 62, null).show();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        P<AddressPartsInputViewModel.State> state;
        final AddressPartsInputViewModel viewModel;
        r a11;
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        ConfiguratorReferences references2 = getReferences();
        AddressPartsInputViewModel addressPartsInputViewModel = null;
        AddressPartsInputComponent addressPartsInputComponent = (AddressPartsInputComponent) ((references2 == null || (composerWidgetComponentStorage = references2.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(AddressPartsInputComponent.class));
        if (addressPartsInputComponent != null && (viewModel = addressPartsInputComponent.getViewModel()) != null && (a11 = references.getOwnerContainer().a()) != null) {
            addressPartsInputViewModel = (AddressPartsInputViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.common.configurator.AddressPartsInputPageConfigurator$onComposerInitialized$lambda$1$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    AddressPartsInputViewModel addressPartsInputViewModel2 = AddressPartsInputViewModel.this;
                    Intrinsics.g(addressPartsInputViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return addressPartsInputViewModel2;
                }
            }).a(AddressPartsInputViewModel.class);
        }
        if (addressPartsInputViewModel != null && (state = addressPartsInputViewModel.getState()) != null) {
            state.observe(references.getOwnerContainer().g(), new AddressPartsInputPageConfigurator$sam$androidx_lifecycle_Observer$0(new AddressPartsInputPageConfigurator$onComposerInitialized$1(this)));
        }
        this.actionHandler = BaseActionHandler.Builder.INSTANCE.invoke(references.getNavigator(), new ActionUsageAnalyticsTracking.ByComponentStorage(references.getComposerWidgetComponentStorage())).onClick(new AddressPartsInputPageConfigurator$onComposerInitialized$2(references)).buildHandler();
    }
}
