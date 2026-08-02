package ru.ozon.app.android.delivery.customActionsHandlers.reorder;

import Ge.f;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import io.reactivex.y;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.network.utils.UriExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/cart/common/data/CartAddItemDTO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.reorder.ReorderActionHandler$addToCart$2", f = "ReorderActionHandler.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ReorderActionHandler$addToCart$2 extends j implements Function2<M, d<? super CartAddItemDTO>, Object> {
    final /* synthetic */ String $reorderInfo;
    final /* synthetic */ Long $voId;
    int label;
    final /* synthetic */ ReorderActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReorderActionHandler$addToCart$2(ReorderActionHandler reorderActionHandler, String str, Long l11, d<? super ReorderActionHandler$addToCart$2> dVar) {
        super(2, dVar);
        this.this$0 = reorderActionHandler;
        this.$reorderInfo = str;
        this.$voId = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReorderActionHandler$addToCart$2(this.this$0, this.$reorderInfo, this.$voId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        JsonParser jsonParser;
        List mapToAnalyticsEvents;
        Map map;
        CartService cartService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        jsonParser = this.this$0.jsonDeserializer;
        DataForReorder dataForReorder = (DataForReorder) jsonParser.fromJson(UriExtKt.base64Decode(this.$reorderInfo), DataForReorder.class);
        mapToAnalyticsEvents = this.this$0.mapToAnalyticsEvents(dataForReorder, this.$voId);
        map = this.this$0.toMap(dataForReorder);
        AddProductsWithTokenizedAnalytics addProductsWithTokenizedAnalytics = new AddProductsWithTokenizedAnalytics(map, mapToAnalyticsEvents, null, this.$voId, null, 20, null);
        cartService = this.this$0.cartService;
        y<CartAddItemDTO> addMultipleProductsWithCustomAnalytics = cartService.addMultipleProductsWithCustomAnalytics(addProductsWithTokenizedAnalytics);
        this.label = 1;
        Object b11 = f.b(addMultipleProductsWithCustomAnalytics, this);
        return b11 == aVar ? aVar : b11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super CartAddItemDTO> dVar) {
        return ((ReorderActionHandler$addToCart$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
