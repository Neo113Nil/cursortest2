package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import Sc.s;
import Wc.a;
import io.reactivex.AbstractC7094b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileViewModel$changeProductQuantity$1", f = "FreshTileViewModel.kt", l = {180, 190}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshTileViewModel$changeProductQuantity$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $actionTrackingInfo;
    final /* synthetic */ boolean $isIncrease;
    final /* synthetic */ int $newValue;
    final /* synthetic */ ProductActionBarVO.State.QuantityControl $quantityControl;
    final /* synthetic */ String $sku;
    final /* synthetic */ long $widgetId;
    int label;
    final /* synthetic */ FreshTileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshTileViewModel$changeProductQuantity$1(FreshTileViewModel freshTileViewModel, boolean z11, ProductActionBarVO.State.QuantityControl quantityControl, String str, int i11, Map<String, TokenizedTrackingInfo> map, long j11, d<? super FreshTileViewModel$changeProductQuantity$1> dVar) {
        super(2, dVar);
        this.this$0 = freshTileViewModel;
        this.$isIncrease = z11;
        this.$quantityControl = quantityControl;
        this.$sku = str;
        this.$newValue = i11;
        this.$actionTrackingInfo = map;
        this.$widgetId = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FreshTileViewModel$changeProductQuantity$1(this.this$0, this.$isIncrease, this.$quantityControl, this.$sku, this.$newValue, this.$actionTrackingInfo, this.$widgetId, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (Ge.f.a(r2, r17) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
    
        if (xe.Y.b(250, r17) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        cartService = this.this$0.cartService;
        AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService, this.$sku, this.$newValue, this.$quantityControl.getSelectedDeliverySchema(), this.$actionTrackingInfo, new Long(this.$widgetId), this.$isIncrease ? "plusButtonClick" : "minusButtonClick", null, null, null, null, 960, null);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FreshTileViewModel$changeProductQuantity$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
