package ru.ozon.app.android.product.skuthinscroll.presentation;

import Lm0.a;
import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import qc.g;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import uc.i;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SkuThinScrollViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ CartService $cartService;
    final /* synthetic */ SkuThinScrollViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewHolder$actionHandler$1$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewHolder$actionHandler$1$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass4(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuThinScrollViewHolder$actionHandler$1(SkuThinScrollViewHolder skuThinScrollViewHolder, CartService cartService) {
        super(1);
        this.this$0 = skuThinScrollViewHolder;
        this.$cartService = cartService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2() {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click it) {
        SkuThinScrollVO.ItemVO.ActionParams safeValueOf;
        C8486a c8486a;
        C8486a c8486a2;
        Intrinsics.checkNotNullParameter(it, "it");
        String id2 = it.getId();
        if (Intrinsics.d(id2, "addToCart")) {
            SkuThinScrollVO.ItemVO.ActionParams safeValueOf2 = SkuThinScrollVO.ItemVO.ActionParams.INSTANCE.safeValueOf(it.getParams());
            if (safeValueOf2 == null) {
                return;
            }
            c8486a2 = this.this$0.addToCartDisposables;
            CartService cartService = this.$cartService;
            String valueOf = String.valueOf(safeValueOf2.getSku());
            int quantity = safeValueOf2.getQuantity();
            Long selectedDeliverySchema = safeValueOf2.getSelectedDeliverySchema();
            SkuThinScrollVO boundedData = this.this$0.getBoundedData();
            AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService, valueOf, quantity, selectedDeliverySchema, null, boundedData != null ? Long.valueOf(boundedData.getId()) : null, null, null, null, null, null, 992, null);
            a aVar = new a();
            final AnonymousClass2 anonymousClass2 = new AnonymousClass2(Lm0.a.f17149a);
            g gVar = new g() { // from class: ru.ozon.app.android.product.skuthinscroll.presentation.b
                @Override // qc.g
                public final void accept(Object obj) {
                    Function1.this.invoke(obj);
                }
            };
            addProductToCart$default.getClass();
            i iVar = new i(gVar, aVar);
            addProductToCart$default.a(iVar);
            Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
            RxExtKt.plusAssign(c8486a2, iVar);
            return;
        }
        if (!Intrinsics.d(id2, "removeFromCart") || (safeValueOf = SkuThinScrollVO.ItemVO.ActionParams.INSTANCE.safeValueOf(it.getParams())) == null) {
            return;
        }
        c8486a = this.this$0.addToCartDisposables;
        CartService cartService2 = this.$cartService;
        String valueOf2 = String.valueOf(safeValueOf.getSku());
        int quantity2 = safeValueOf.getQuantity();
        Long selectedDeliverySchema2 = safeValueOf.getSelectedDeliverySchema();
        SkuThinScrollVO boundedData2 = this.this$0.getBoundedData();
        AbstractC7094b removeProductFromCart$default = CartService.DefaultImpls.removeProductFromCart$default(cartService2, valueOf2, quantity2, selectedDeliverySchema2, null, boundedData2 != null ? Long.valueOf(boundedData2.getId()) : null, null, null, 96, null);
        c cVar = new c();
        final AnonymousClass4 anonymousClass4 = new AnonymousClass4(Lm0.a.f17149a);
        g gVar2 = new g() { // from class: ru.ozon.app.android.product.skuthinscroll.presentation.d
            @Override // qc.g
            public final void accept(Object obj) {
                Function1.this.invoke(obj);
            }
        };
        removeProductFromCart$default.getClass();
        i iVar2 = new i(gVar2, cVar);
        removeProductFromCart$default.a(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar2);
    }
}
