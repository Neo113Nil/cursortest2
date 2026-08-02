package ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation;

import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.di.AddressPartsInputComponent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputCustomActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "processClickAction", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "vm", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressPartsInputCustomActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "addressPartsInputAction";

    private final void processClickAction(AtomAction.Click action, AddressPartsInputViewModel vm) {
        Map<String, String> params = action.getParams();
        boolean parseBoolean = Boolean.parseBoolean(params != null ? params.get("dismiss") : null);
        if (vm != null) {
            vm.saveAddressParts(action.getLink(), parseBoolean);
        }
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull final CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        r a11 = handlerRefs.getRefs().getContainer().a();
        AddressPartsInputViewModel addressPartsInputViewModel = a11 != null ? (AddressPartsInputViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputCustomActionHandler$processAction$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AddressPartsInputViewModel viewModel = ((AddressPartsInputComponent) CustomActionHandler.HandlerReferences.this.getRefs().getWidgetComponent(AddressPartsInputComponent.class)).getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(AddressPartsInputViewModel.class) : null;
        if (action instanceof AtomAction.Click) {
            processClickAction((AtomAction.Click) action, addressPartsInputViewModel);
        }
    }
}
