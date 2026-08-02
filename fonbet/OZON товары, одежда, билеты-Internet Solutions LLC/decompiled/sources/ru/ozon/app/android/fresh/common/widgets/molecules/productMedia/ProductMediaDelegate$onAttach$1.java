package ru.ozon.app.android.fresh.common.widgets.molecules.productMedia;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "<unused var>", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.ProductMediaDelegate$onAttach$1", f = "ProductMediaDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ProductMediaDelegate$onAttach$1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ProductMediaDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductMediaDelegate$onAttach$1(ProductMediaDelegate productMediaDelegate, d<? super ProductMediaDelegate$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = productMediaDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProductMediaDelegate$onAttach$1(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, d<? super Unit> dVar) {
        return ((ProductMediaDelegate$onAttach$1) create(bool, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProductMediaVO productMediaVO;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        productMediaVO = this.this$0.currentState;
        if (productMediaVO != null) {
            this.this$0.setState(productMediaVO);
        }
        return Unit.f71690a;
    }
}
