package ru.ozon.app.android.sellerproducts.sellerProducts.binders;

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
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.sellerproducts.sellerProducts.views.CsmaSkuImageWrapper;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "items", "", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductAdultImageWithVideoCoverBinder$init$3", f = "ProductAdultImageWithVideoCoverBinder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProductAdultImageWithVideoCoverBinder$init$3 extends j implements Function2<List<? extends ProductVO.GalleryItem>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProductAdultImageWithVideoCoverBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductAdultImageWithVideoCoverBinder$init$3(ProductAdultImageWithVideoCoverBinder productAdultImageWithVideoCoverBinder, d<? super ProductAdultImageWithVideoCoverBinder$init$3> dVar) {
        super(2, dVar);
        this.this$0 = productAdultImageWithVideoCoverBinder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ProductAdultImageWithVideoCoverBinder$init$3 productAdultImageWithVideoCoverBinder$init$3 = new ProductAdultImageWithVideoCoverBinder$init$3(this.this$0, dVar);
        productAdultImageWithVideoCoverBinder$init$3.L$0 = obj;
        return productAdultImageWithVideoCoverBinder$init$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CsmaSkuImageWrapper imageContainer;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        List list = (List) this.L$0;
        if (this.this$0.getProduct().getIsAdult()) {
            Intrinsics.f(list);
            if (!list.isEmpty()) {
                imageContainer = this.this$0.getImageContainer();
                imageContainer.bindItem((ProductVO.GalleryItem) C7714v.M(list));
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends ProductVO.GalleryItem> list, d<? super Unit> dVar) {
        return ((ProductAdultImageWithVideoCoverBinder$init$3) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }
}
