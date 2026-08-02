package ru.ozon.app.android.cart.ui.performTwoActions;

import Vg.d;
import androidx.lifecycle.K;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.cart.ui.addToCart.AddToCartActionHandler;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cart/ui/performTwoActions/PerformTwoActionsHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(LVg/d;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LVg/d;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PerformTwoActionsHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<Class<AddToCartActionHandler>> supportedCustomActionHandlers = e0.h(AddToCartActionHandler.class);

    @NotNull
    private final String actionId;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;

    @NotNull
    private final JsonParser jsonDeserializer;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/ui/performTwoActions/PerformTwoActionsHandler$Companion;", "", "<init>", "()V", "supportedCustomActionHandlers", "", "Ljava/lang/Class;", "Lru/ozon/app/android/cart/ui/addToCart/AddToCartActionHandler;", "getSupportedCustomActionHandlers", "()Ljava/util/Set;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Class<AddToCartActionHandler>> getSupportedCustomActionHandlers() {
            return PerformTwoActionsHandler.supportedCustomActionHandlers;
        }

        private Companion() {
        }
    }

    public PerformTwoActionsHandler(@NotNull d customActionHandlersStoreFactory, @NotNull JsonParser jsonDeserializer, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.jsonDeserializer = jsonDeserializer;
        this.dispatcherProvider = dispatcherProvider;
        this.actionId = "performTwoActions";
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
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.Click) || (params = (click = (AtomAction.Click) action).getParams()) == null || (str = params.get("firstAction")) == null || (params2 = click.getParams()) == null || (str2 = params2.get("secondAction")) == null) {
            return;
        }
        C10727i.c(K.a(handlerRefs.getRefs().getContainer().f()), new PerformTwoActionsHandler$processAction$$inlined$CoroutineExceptionHandler$1(J.f105405n0), null, new PerformTwoActionsHandler$processAction$2(this, str, str2, handlerRefs, null), 2);
    }
}
