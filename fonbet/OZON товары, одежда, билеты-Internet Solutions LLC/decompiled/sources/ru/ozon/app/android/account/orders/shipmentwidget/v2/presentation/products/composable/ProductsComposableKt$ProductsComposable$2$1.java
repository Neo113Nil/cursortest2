package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.composable;

import S0.A1;
import a1.C4912a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.viewItem.ProductImageVO;
import ru.ozon.uni.atoms.af.AtomAction;
import v0.G;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ProductsComposableKt$ProductsComposable$2$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ A1<List<ProductImageVO>> $products$delegate;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductImageVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.composable.ProductsComposableKt$ProductsComposable$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<ProductImageVO, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ProductImageVO it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Long.valueOf(it.getId());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsComposableKt$ProductsComposable$2$1(A1<? extends List<ProductImageVO>> a12, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$products$delegate = a12;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        List ProductsComposable$lambda$0;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        ProductsComposable$lambda$0 = ProductsComposableKt.ProductsComposable$lambda$0(this.$products$delegate);
        Intrinsics.checkNotNullExpressionValue(ProductsComposable$lambda$0, "access$ProductsComposable$lambda$0(...)");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        LazyRow.a(ProductsComposable$lambda$0.size(), anonymousClass1 != null ? new ProductsComposableKt$ProductsComposable$2$1$invoke$$inlined$items$default$2(anonymousClass1, ProductsComposable$lambda$0) : null, new ProductsComposableKt$ProductsComposable$2$1$invoke$$inlined$items$default$3(ProductsComposableKt$ProductsComposable$2$1$invoke$$inlined$items$default$1.INSTANCE, ProductsComposable$lambda$0), new C4912a(true, -632812321, new ProductsComposableKt$ProductsComposable$2$1$invoke$$inlined$items$default$4(ProductsComposable$lambda$0, function1)));
    }
}
