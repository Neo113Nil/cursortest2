package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.domain.DeliveryWidgetV2Repository;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2ViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2ViewModel$sendAsyncUpdate$1", f = "DeliveryWidgetV2ViewModel.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DeliveryWidgetV2ViewModel$sendAsyncUpdate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Map<Long, CartItemInfo> $addedItems;
    final /* synthetic */ Map<Long, CartItemInfo> $removedItems;
    final /* synthetic */ Map<Long, CartItemInfo> $updatedItems;
    int label;
    final /* synthetic */ DeliveryWidgetV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV2ViewModel$sendAsyncUpdate$1(DeliveryWidgetV2ViewModel deliveryWidgetV2ViewModel, Map<Long, CartItemInfo> map, Map<Long, CartItemInfo> map2, Map<Long, CartItemInfo> map3, d<? super DeliveryWidgetV2ViewModel$sendAsyncUpdate$1> dVar) {
        super(2, dVar);
        this.this$0 = deliveryWidgetV2ViewModel;
        this.$addedItems = map;
        this.$updatedItems = map2;
        this.$removedItems = map3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DeliveryWidgetV2ViewModel$sendAsyncUpdate$1(this.this$0, this.$addedItems, this.$updatedItems, this.$removedItems, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DeliveryWidgetV2ViewModel$sendAsyncUpdate$1 deliveryWidgetV2ViewModel$sendAsyncUpdate$1;
        Exception exc;
        DeliveryWidgetV2Repository deliveryWidgetV2Repository;
        Map<Long, CartItemInfo> map;
        Map<Long, CartItemInfo> map2;
        Map<Long, CartItemInfo> map3;
        String str;
        List<Long> list;
        boolean z11;
        l20.d dVar;
        w0 w0Var;
        w0 w0Var2;
        w0 w0Var3;
        w0 w0Var4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            try {
                deliveryWidgetV2Repository = this.this$0.repository;
                map = this.$addedItems;
                map2 = this.$updatedItems;
                map3 = this.$removedItems;
                str = this.this$0.asyncUpdateKey;
                Intrinsics.f(str);
                list = this.this$0.allowedDeliverySchemas;
                z11 = this.this$0.isExpressContext;
                dVar = this.this$0.widgetInfo;
                Intrinsics.f(dVar);
                this.label = 1;
                deliveryWidgetV2ViewModel$sendAsyncUpdate$1 = this;
            } catch (Exception e11) {
                e = e11;
                deliveryWidgetV2ViewModel$sendAsyncUpdate$1 = this;
            }
            try {
                obj = deliveryWidgetV2Repository.requestUpdateByCartChanges(map, map2, map3, str, list, z11, dVar, deliveryWidgetV2ViewModel$sendAsyncUpdate$1);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (Exception e12) {
                e = e12;
                exc = e;
                Lm0.a.f17149a.e(exc);
                w0Var = deliveryWidgetV2ViewModel$sendAsyncUpdate$1.this$0._deliveryWidgetAction;
                w0Var.tryEmit(DeliveryWidgetV2ViewModel.DeliveryWidgetAction.CloseAction.INSTANCE);
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                s.b(obj);
                deliveryWidgetV2ViewModel$sendAsyncUpdate$1 = this;
            } catch (Exception e13) {
                exc = e13;
                deliveryWidgetV2ViewModel$sendAsyncUpdate$1 = this;
                Lm0.a.f17149a.e(exc);
                w0Var = deliveryWidgetV2ViewModel$sendAsyncUpdate$1.this$0._deliveryWidgetAction;
                w0Var.tryEmit(DeliveryWidgetV2ViewModel.DeliveryWidgetAction.CloseAction.INSTANCE);
                return Unit.f71690a;
            }
        }
        DeliveryWidgetV2VO deliveryWidgetV2VO = (DeliveryWidgetV2VO) obj;
        if (deliveryWidgetV2VO != null) {
            deliveryWidgetV2ViewModel$sendAsyncUpdate$1.this$0.allowedDeliverySchemas = deliveryWidgetV2VO.getAvailableDeliverySchemas();
            if ((deliveryWidgetV2VO instanceof DeliveryWidgetV2VO.SellerVOWidget) && ((DeliveryWidgetV2VO.SellerVOWidget) deliveryWidgetV2VO).getForceAction() != null) {
                w0Var4 = deliveryWidgetV2ViewModel$sendAsyncUpdate$1.this$0._deliveryWidgetAction;
                w0Var4.tryEmit(new DeliveryWidgetV2ViewModel.DeliveryWidgetAction.CurtainAction((DeliveryWidgetV2VO.SellerVOWidget) deliveryWidgetV2VO));
            } else if (deliveryWidgetV2VO instanceof DeliveryWidgetV2VO.HiddenStateVOWidget) {
                w0Var3 = deliveryWidgetV2ViewModel$sendAsyncUpdate$1.this$0._deliveryWidgetAction;
                w0Var3.tryEmit(DeliveryWidgetV2ViewModel.DeliveryWidgetAction.CloseAction.INSTANCE);
            } else {
                w0Var2 = deliveryWidgetV2ViewModel$sendAsyncUpdate$1.this$0._deliveryWidgetAction;
                w0Var2.tryEmit(new DeliveryWidgetV2ViewModel.DeliveryWidgetAction.ShowAction(deliveryWidgetV2VO));
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DeliveryWidgetV2ViewModel$sendAsyncUpdate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
