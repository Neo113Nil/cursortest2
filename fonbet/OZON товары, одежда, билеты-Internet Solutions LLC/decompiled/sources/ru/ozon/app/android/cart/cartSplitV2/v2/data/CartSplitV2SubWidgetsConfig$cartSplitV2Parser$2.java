package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.serialize.JsonSerializer;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2Parser;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CartSplitV2SubWidgetsConfig$cartSplitV2Parser$2 extends AbstractC7737t implements Function0<CartSplitV2Parser> {
    final /* synthetic */ JsonParser $deserializer;
    final /* synthetic */ JsonSerializer $serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2SubWidgetsConfig$cartSplitV2Parser$2(JsonParser jsonParser, JsonSerializer jsonSerializer) {
        super(0);
        this.$deserializer = jsonParser;
        this.$serializer = jsonSerializer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CartSplitV2Parser invoke() {
        return new CartSplitV2Parser(this.$deserializer, this.$serializer);
    }
}
