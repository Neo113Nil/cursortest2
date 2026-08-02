package ru.ozon.app.android.cart.ui.addToCart;

import Pc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cart/ui/addToCart/AddToCartActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LPc/a;", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "viewModelProvider", "<init>", "(LPc/a;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LPc/a;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddToCartActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final a<AddToCartViewModel> viewModelProvider;

    public AddToCartActionHandler(@NotNull a<AddToCartViewModel> viewModelProvider) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.viewModelProvider = viewModelProvider;
        this.actionId = "addToCart";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            AddToCartViewModel addToCartViewModel = (AddToCartViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.cart.ui.addToCart.AddToCartActionHandler$processAction$$inlined$sharedViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = AddToCartActionHandler.this.viewModelProvider;
                    AddToCartViewModel addToCartViewModel2 = (AddToCartViewModel) aVar.get();
                    Intrinsics.g(addToCartViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return addToCartViewModel2;
                }
            }).a(AddToCartViewModel.class);
            addToCartViewModel.attach(handlerRefs.getRefs().getTokenizedAnalytics());
            addToCartViewModel.addToCart(((AtomAction.ComposerAction) action).getParams(), handlerRefs.getVoId());
        }
    }
}
