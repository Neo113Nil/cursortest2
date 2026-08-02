package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation;

import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.api.ProductsInBotV2Api;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.api.SelectedProductsBodyV2;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.api.SelectedProductsResponseV2;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.ProductsInBotV2ViewModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.ProductsInBotV2ViewModel$sendProductsToBot$1", f = "ProductsInBotV2ViewModel.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ProductsInBotV2ViewModel$sendProductsToBot$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ ProductsInBotV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsInBotV2ViewModel$sendProductsToBot$1(ProductsInBotV2ViewModel productsInBotV2ViewModel, String str, d<? super ProductsInBotV2ViewModel$sendProductsToBot$1> dVar) {
        super(2, dVar);
        this.this$0 = productsInBotV2ViewModel;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProductsInBotV2ViewModel$sendProductsToBot$1(this.this$0, this.$url, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V v11;
        Map map;
        ProductsInBotV2Api productsInBotV2Api;
        Object sendProductsToBot;
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
                    arrayList.add(new SelectedProductsBodyV2.Product(((Number) entry.getKey()).longValue(), ((Number) entry.getValue()).intValue()));
                }
                List l11 = h.l(h.h0('?', this.$url, ""), new char[]{'&'}, 0, 6);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = l11.iterator();
                while (it.hasNext()) {
                    String str = (String) C7714v.Q(1, h.l((String) it.next(), new char[]{'='}, 2, 2));
                    if (str == null || str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                productsInBotV2Api = this.this$0.productsInBotV2Api;
                String str2 = (String) C7714v.Q(0, arrayList2);
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = (String) C7714v.Q(1, arrayList2);
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = (String) C7714v.Q(2, arrayList2);
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = (String) C7714v.Q(3, arrayList2);
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = (String) C7714v.Q(4, arrayList2);
                String str7 = str6 != null ? str6 : "";
                String str8 = str4;
                SelectedProductsBodyV2 selectedProductsBodyV2 = new SelectedProductsBodyV2(arrayList);
                this.label = 1;
                sendProductsToBot = productsInBotV2Api.sendProductsToBot(str2, str3, str8, str5, str7, selectedProductsBodyV2, this);
                if (sendProductsToBot == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                sendProductsToBot = obj;
            }
            ActionV2Response actionV2Response = (ActionV2Response) sendProductsToBot;
            SelectedProductsResponseV2 selectedProductsResponseV2 = (SelectedProductsResponseV2) actionV2Response.getData();
            if (selectedProductsResponseV2 == null || !selectedProductsResponseV2.getSuccess()) {
                v12 = this.this$0.requestStatus;
                v12.postValue(ProductsInBotV2ViewModel.Action.Error.INSTANCE);
            } else {
                v13 = this.this$0.requestStatus;
                v13.postValue(new ProductsInBotV2ViewModel.Action.Success(AtomActionMapperKt.toAtomAction(new AtomActionDTO(AtomActionDTO.Behavior.DISMISS, null, null, null, 14, null), actionV2Response.getTrackingInfo())));
            }
        } catch (Exception e11) {
            v11 = this.this$0.requestStatus;
            v11.postValue(ProductsInBotV2ViewModel.Action.Error.INSTANCE);
            Lm0.a.f17149a.e(e11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ProductsInBotV2ViewModel$sendProductsToBot$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
