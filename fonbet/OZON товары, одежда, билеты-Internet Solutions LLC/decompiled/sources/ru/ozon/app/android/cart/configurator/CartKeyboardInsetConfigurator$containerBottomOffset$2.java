package ru.ozon.app.android.cart.configurator;

import androidx.lifecycle.InterfaceC5431s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.uikit.container.ExternalOffsetHandler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartKeyboardInsetConfigurator$containerBottomOffset$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ CartKeyboardInsetConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartKeyboardInsetConfigurator$containerBottomOffset$2(CartKeyboardInsetConfigurator cartKeyboardInsetConfigurator) {
        super(0);
        this.this$0 = cartKeyboardInsetConfigurator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        InterfaceC5431s c11 = this.this$0.getContainer().c();
        ExternalOffsetHandler externalOffsetHandler = c11 instanceof ExternalOffsetHandler ? (ExternalOffsetHandler) c11 : null;
        return Integer.valueOf(externalOffsetHandler != null ? externalOffsetHandler.getMaxBottomOffset() : 0);
    }
}
