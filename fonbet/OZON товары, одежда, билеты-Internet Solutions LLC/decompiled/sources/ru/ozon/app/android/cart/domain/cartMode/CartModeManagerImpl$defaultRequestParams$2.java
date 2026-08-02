package ru.ozon.app.android.cart.domain.cartMode;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.domain.cartMode.SetCartModeRequest;
import ru.ozon.app.android.network.serialize.JsonSerializer;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CartModeManagerImpl$defaultRequestParams$2 extends AbstractC7737t implements Function0<Map<String, ? extends String>> {
    final /* synthetic */ CartModeManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartModeManagerImpl$defaultRequestParams$2(CartModeManagerImpl cartModeManagerImpl) {
        super(0);
        this.this$0 = cartModeManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        JsonSerializer jsonSerializer;
        Pair pair = new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, "setCartMode");
        jsonSerializer = this.this$0.jsonSerializer;
        return U.j(pair, new Pair("params", jsonSerializer.toJson((JsonSerializer) new SetCartModeRequest(SetCartModeRequest.CartMode.SERVICE_DEFINED_MODE), (Class<JsonSerializer>) SetCartModeRequest.class)));
    }
}
