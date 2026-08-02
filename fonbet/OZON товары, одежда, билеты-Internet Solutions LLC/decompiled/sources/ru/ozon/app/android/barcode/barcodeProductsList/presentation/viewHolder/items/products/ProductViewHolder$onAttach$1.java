package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products.ProductViewHolder$onAttach$1", f = "ProductViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ProductViewHolder$onAttach$1 extends j implements Function2<List<? extends ImageVO>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProductViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductViewHolder$onAttach$1(ProductViewHolder productViewHolder, d<? super ProductViewHolder$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = productViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ProductViewHolder$onAttach$1 productViewHolder$onAttach$1 = new ProductViewHolder$onAttach$1(this.this$0, dVar);
        productViewHolder$onAttach$1.L$0 = obj;
        return productViewHolder$onAttach$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ImageVO> list, d<? super Unit> dVar) {
        return invoke2((List<ImageVO>) list, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProductView productView;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        List list = (List) this.L$0;
        Intrinsics.f(list);
        ImageVO imageVO = (ImageVO) C7714v.M(list);
        if (imageVO != null) {
            productView = this.this$0.view;
            productView.getImageViewHolder().bind(imageVO);
        }
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ImageVO> list, d<? super Unit> dVar) {
        return ((ProductViewHolder$onAttach$1) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }
}
