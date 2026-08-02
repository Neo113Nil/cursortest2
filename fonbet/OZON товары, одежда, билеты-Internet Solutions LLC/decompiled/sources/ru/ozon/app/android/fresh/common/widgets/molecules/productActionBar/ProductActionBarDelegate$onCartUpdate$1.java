package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVOV2;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.ProductActionBarDelegate$onCartUpdate$1", f = "ProductActionBarDelegate.kt", l = {329}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ProductActionBarDelegate$onCartUpdate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ProductActionBarVOV2.QuantityPickerVO $quantityPicker;
    int label;
    final /* synthetic */ ProductActionBarDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductActionBarDelegate$onCartUpdate$1(ProductActionBarVOV2.QuantityPickerVO quantityPickerVO, ProductActionBarDelegate productActionBarDelegate, d<? super ProductActionBarDelegate$onCartUpdate$1> dVar) {
        super(2, dVar);
        this.$quantityPicker = quantityPickerVO;
        this.this$0 = productActionBarDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProductActionBarDelegate$onCartUpdate$1(this.$quantityPicker, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h hVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AtomAction additionalAction = this.$quantityPicker.getAdditionalAction();
            if (additionalAction != null) {
                hVar = this.this$0.actionsChannel;
                this.label = 1;
                if (hVar.n(additionalAction, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ProductActionBarDelegate$onCartUpdate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
