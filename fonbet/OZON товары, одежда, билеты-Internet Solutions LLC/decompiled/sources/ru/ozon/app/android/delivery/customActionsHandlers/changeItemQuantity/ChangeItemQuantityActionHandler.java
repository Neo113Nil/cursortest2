package ru.ozon.app.android.delivery.customActionsHandlers.changeItemQuantity;

import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001d\b\u0007\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/changeItemQuantity/ChangeItemQuantityActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "cartEventController", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeItemQuantityActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final CartEventsController cartEventController;

    @NotNull
    private final JsonParser jsonDeserializer;

    public ChangeItemQuantityActionHandler(@NotNull JsonParser jsonDeserializer, @NotNull CartEventsController cartEventController) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(cartEventController, "cartEventController");
        this.jsonDeserializer = jsonDeserializer;
        this.cartEventController = cartEventController;
        this.actionId = "changeItemQuantity";
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
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            String link = click.getLink();
            Map<String, String> params = click.getParams();
            String str = params != null ? params.get("postBody") : null;
            if (link == null || str == null) {
                return;
            }
            this.cartEventController.handleEvent(CartRefreshReason.CheckoutItemQuantityChanged.INSTANCE);
            C10727i.c(K.a(handlerRefs.getRefs().getContainer().g()), C10720e0.a(), null, new ChangeItemQuantityActionHandler$processAction$1(this, str, action, handlerRefs, link, null), 2);
        }
    }
}
