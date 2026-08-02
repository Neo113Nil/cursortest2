package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation;

import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.api.ProductsInBotApi;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.api.SelectedProductsBody;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.api.SelectedProductsResponse;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.ProductsInBotViewModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.ProductsInBotViewModel$sendProductsToBot$1", f = "ProductsInBotViewModel.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ProductsInBotViewModel$sendProductsToBot$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ProductsInBotViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsInBotViewModel$sendProductsToBot$1(ProductsInBotViewModel productsInBotViewModel, d<? super ProductsInBotViewModel$sendProductsToBot$1> dVar) {
        super(2, dVar);
        this.this$0 = productsInBotViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProductsInBotViewModel$sendProductsToBot$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V v11;
        Map map;
        ProductsInBotApi productsInBotApi;
        V v12;
        V v13;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                map = this.this$0.products;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new SelectedProductsBody.Product(((Number) entry.getKey()).longValue(), ((Number) entry.getValue()).intValue()));
                }
                productsInBotApi = this.this$0.productsInBotApi;
                SelectedProductsBody selectedProductsBody = new SelectedProductsBody(arrayList);
                this.label = 1;
                obj = productsInBotApi.sendProductsToBot(selectedProductsBody, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            ActionV2Response actionV2Response = (ActionV2Response) obj;
            SelectedProductsResponse selectedProductsResponse = (SelectedProductsResponse) actionV2Response.getData();
            if (selectedProductsResponse == null || !selectedProductsResponse.getSuccess()) {
                v12 = this.this$0.requestStatus;
                v12.postValue(ProductsInBotViewModel.Action.Error.INSTANCE);
            } else {
                v13 = this.this$0.requestStatus;
                v13.postValue(new ProductsInBotViewModel.Action.Success(AtomActionMapperKt.toAtomAction(new AtomActionDTO(AtomActionDTO.Behavior.DISMISS, null, null, null, 14, null), actionV2Response.getTrackingInfo())));
            }
        } catch (Exception e11) {
            v11 = this.this$0.requestStatus;
            v11.postValue(ProductsInBotViewModel.Action.Error.INSTANCE);
            Lm0.a.f17149a.e(e11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ProductsInBotViewModel$sendProductsToBot$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
