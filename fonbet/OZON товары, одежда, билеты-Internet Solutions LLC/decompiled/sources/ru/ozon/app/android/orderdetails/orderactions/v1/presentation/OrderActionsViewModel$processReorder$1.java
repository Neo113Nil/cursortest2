package ru.ozon.app.android.orderdetails.orderactions.v1.presentation;

import Ge.f;
import Sc.s;
import Wc.a;
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
import ru.ozon.app.android.orderdetails.orderactions.v1.data.DataForReorder;
import ru.ozon.app.android.orderdetails.orderactions.v1.presentation.Action;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.orderdetails.orderactions.v1.presentation.OrderActionsViewModel$processReorder$1", f = "OrderActionsViewModel.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OrderActionsViewModel$processReorder$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ OrderActionVO $item;
    final /* synthetic */ String $serializedData;
    int label;
    final /* synthetic */ OrderActionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderActionsViewModel$processReorder$1(OrderActionsViewModel orderActionsViewModel, String str, OrderActionVO orderActionVO, d<? super OrderActionsViewModel$processReorder$1> dVar) {
        super(2, dVar);
        this.this$0 = orderActionsViewModel;
        this.$serializedData = str;
        this.$item = orderActionVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OrderActionsViewModel$processReorder$1(this.this$0, this.$serializedData, this.$item, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        JsonParser jsonParser;
        List mapToAnalyticEvents;
        Map map;
        CartService cartService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                jsonParser = this.this$0.jsonDeserializer;
                DataForReorder dataForReorder = (DataForReorder) jsonParser.fromJson(UriExtKt.base64Decode(this.$serializedData), DataForReorder.class);
                mapToAnalyticEvents = this.this$0.mapToAnalyticEvents(dataForReorder, this.$item);
                map = this.this$0.toMap(dataForReorder);
                OrderActionVO orderActionVO = this.$item;
                AddProductsWithTokenizedAnalytics addProductsWithTokenizedAnalytics = new AddProductsWithTokenizedAnalytics(map, mapToAnalyticEvents, null, orderActionVO != null ? new Long(orderActionVO.getId()) : null, null, 20, null);
                cartService = this.this$0.cartService;
                y<CartAddItemDTO> addMultipleProductsWithCustomAnalytics = cartService.addMultipleProductsWithCustomAnalytics(addProductsWithTokenizedAnalytics);
                this.label = 1;
                obj = f.b(addMultipleProductsWithCustomAnalytics, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            if (((CartAddItemDTO) obj).getSuccess()) {
                this.this$0.getActions().postValue(Action.OpenCart.INSTANCE);
            }
        } catch (Exception e11) {
            this.this$0.getActions().postValue(Action.Fail.INSTANCE);
            Lm0.a.f17149a.e(e11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OrderActionsViewModel$processReorder$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
