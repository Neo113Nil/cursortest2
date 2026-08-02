package ru.ozon.app.android.pdp.widgets.productStarsTile.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.widgets.productStarsTile.data.ProductStarsRepository;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel$handleCartState$1$1", f = "ProductStarsTileWidgetViewModel.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ProductStarsTileWidgetViewModel$handleCartState$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $productId;
    int label;
    final /* synthetic */ ProductStarsTileWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductStarsTileWidgetViewModel$handleCartState$1$1(ProductStarsTileWidgetViewModel productStarsTileWidgetViewModel, String str, d<? super ProductStarsTileWidgetViewModel$handleCartState$1$1> dVar) {
        super(2, dVar);
        this.this$0 = productStarsTileWidgetViewModel;
        this.$productId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProductStarsTileWidgetViewModel$handleCartState$1$1(this.this$0, this.$productId, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProductStarsRepository productStarsRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            productStarsRepository = this.this$0.starsRepository;
            String str = this.$productId;
            this.label = 1;
            obj = productStarsRepository.getStarsBalance(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            this.this$0.getCountItem().setValue(((Result.Success) result).getValue());
        } else {
            if (!(result instanceof Result.Failure)) {
                throw new o();
            }
            Lm0.a.f17149a.e(((Result.Failure) result).getThrowable());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ProductStarsTileWidgetViewModel$handleCartState$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
