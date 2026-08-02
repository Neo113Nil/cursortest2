package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder;

import Ae.C;
import Ae.C2399j;
import Ae.InterfaceC2397i;
import Ge.n;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.cscore.adultimage.DeliveryAdultImageView;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.view.ProductToPayWidgetView;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewItem.ProductsToPayVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder.ProductsToPayWidgetViewHolder$onAttachViewModel$1", f = "ProductsToPayWidgetViewHolder.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ProductsToPayWidgetViewHolder$onAttachViewModel$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ProductsToPayWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LAe/i;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductImageVO;", "kotlin.jvm.PlatformType", "", "e", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder.ProductsToPayWidgetViewHolder$onAttachViewModel$1$1", f = "ProductsToPayWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder.ProductsToPayWidgetViewHolder$onAttachViewModel$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements InterfaceC6511n<InterfaceC2397i<? super ProductsToPayVO.ProductImageVO>, Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super ProductsToPayVO.ProductImageVO> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = th2;
            return anonymousClass1.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Lm0.a.f17149a.e((Throwable) this.L$0);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "item", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductImageVO;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder.ProductsToPayWidgetViewHolder$onAttachViewModel$1$2", f = "ProductsToPayWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder.ProductsToPayWidgetViewHolder$onAttachViewModel$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<ProductsToPayVO.ProductImageVO, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ProductsToPayWidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ProductsToPayWidgetViewHolder productsToPayWidgetViewHolder, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = productsToPayWidgetViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ProductToPayWidgetView productToPayWidgetView;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ProductsToPayVO.ProductImageVO productImageVO = (ProductsToPayVO.ProductImageVO) this.L$0;
            productToPayWidgetView = this.this$0.view;
            DeliveryAdultImageView.bind$default(productToPayWidgetView.getImageView(), productImageVO.getImage().getImage(), productImageVO.getShouldBlur(), null, 4, null);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProductsToPayVO.ProductImageVO productImageVO, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(productImageVO, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsToPayWidgetViewHolder$onAttachViewModel$1(ProductsToPayWidgetViewHolder productsToPayWidgetViewHolder, d<? super ProductsToPayWidgetViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = productsToPayWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProductsToPayWidgetViewHolder$onAttachViewModel$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AdultDelegate adultDelegate;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            adultDelegate = this.this$0.adultDelegate;
            C c11 = new C(n.a(adultDelegate.observeItem()), new AnonymousClass1(null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (C2399j.h(c11, anonymousClass2, this) == aVar) {
                return aVar;
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
        return ((ProductsToPayWidgetViewHolder$onAttachViewModel$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
