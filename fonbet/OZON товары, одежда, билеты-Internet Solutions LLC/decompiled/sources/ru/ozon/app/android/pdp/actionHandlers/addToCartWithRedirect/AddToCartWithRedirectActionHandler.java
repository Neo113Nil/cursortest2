package ru.ozon.app.android.pdp.actionHandlers.addToCartWithRedirect;

import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/actionHandlers/addToCartWithRedirect/AddToCartWithRedirectActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "cartService", "Lru/ozon/app/android/cart/common/domain/CartService;", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddToCartWithRedirectActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final CartService cartService;

    public AddToCartWithRedirectActionHandler(@NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.cartService = cartService;
        this.actionId = "addToCartWithRedirect";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        AtomAction.Click click;
        Map<String, String> params;
        String str;
        Map<String, String> params2;
        String str2;
        Integer w02;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.Click) || (params = (click = (AtomAction.Click) action).getParams()) == null || (str = params.get("sku")) == null || (params2 = click.getParams()) == null || (str2 = params2.get("quantity")) == null || (w02 = h.w0(str2)) == null) {
            return;
        }
        int intValue = w02.intValue();
        Map<String, String> params3 = click.getParams();
        Long y02 = (params3 == null || (str4 = params3.get("selectedDeliverySchema")) == null) ? null : h.y0(str4);
        Map<String, String> params4 = click.getParams();
        C10727i.c(K.a(handlerRefs.getRefs().getContainer().g()), null, null, new AddToCartWithRedirectActionHandler$processAction$1(this, str, intValue, y02, handlerRefs, (params4 == null || (str3 = params4.get("wholeQuant")) == null) ? null : h.t0(str3), action, null), 3);
    }
}
