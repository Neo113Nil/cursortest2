package ru.ozon.app.android.cart.ui.cartActionProcessor;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/common/di/CartComponentApi;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CartActionsProcessorConfigurator$component$2 extends AbstractC7737t implements Function0<CartComponentApi> {
    final /* synthetic */ CartActionsProcessorConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartActionsProcessorConfigurator$component$2(CartActionsProcessorConfigurator cartActionsProcessorConfigurator) {
        super(0);
        this.this$0 = cartActionsProcessorConfigurator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CartComponentApi invoke() {
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = this.this$0.getReferences();
        return (CartComponentApi) ((references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(CartComponentApi.class));
    }
}
