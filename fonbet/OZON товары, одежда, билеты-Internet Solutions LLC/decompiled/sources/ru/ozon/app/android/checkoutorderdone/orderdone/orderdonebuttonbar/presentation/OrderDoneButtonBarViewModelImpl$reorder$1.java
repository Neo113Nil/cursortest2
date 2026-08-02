package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation;

import Ge.f;
import He.b;
import Sc.s;
import Wc.a;
import io.reactivex.y;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.data.DataForReorder;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl;
import ru.ozon.app.android.network.utils.UriExtKt;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl$reorder$1", f = "OrderDoneButtonBarViewModel.kt", l = {75, 76, 90, 90, 90}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OrderDoneButtonBarViewModelImpl$reorder$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Long $id;
    final /* synthetic */ String $reorderInfo;
    Object L$0;
    int label;
    final /* synthetic */ OrderDoneButtonBarViewModelImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/cart/common/data/CartAddItemDTO;"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl$reorder$1$1", f = "OrderDoneButtonBarViewModel.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl$reorder$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super CartAddItemDTO>, Object> {
        final /* synthetic */ Long $id;
        final /* synthetic */ String $reorderInfo;
        int label;
        final /* synthetic */ OrderDoneButtonBarViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl, String str, Long l11, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = orderDoneButtonBarViewModelImpl;
            this.$reorderInfo = str;
            this.$id = l11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$reorderInfo, this.$id, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JsonParser jsonParser;
            Map map;
            List mapToAnalyticEvents;
            CartService cartService;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            jsonParser = this.this$0.jsonDeserializer;
            DataForReorder dataForReorder = (DataForReorder) jsonParser.fromJson(UriExtKt.base64Decode(this.$reorderInfo), DataForReorder.class);
            map = this.this$0.toMap(dataForReorder);
            mapToAnalyticEvents = this.this$0.mapToAnalyticEvents(dataForReorder, this.$id);
            AddProductsWithTokenizedAnalytics addProductsWithTokenizedAnalytics = new AddProductsWithTokenizedAnalytics(map, mapToAnalyticEvents, null, this.$id, null, 20, null);
            cartService = this.this$0.cartService;
            y<CartAddItemDTO> addMultipleProductsWithCustomAnalytics = cartService.addMultipleProductsWithCustomAnalytics(addProductsWithTokenizedAnalytics);
            this.label = 1;
            Object b11 = f.b(addMultipleProductsWithCustomAnalytics, this);
            return b11 == aVar ? aVar : b11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super CartAddItemDTO> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderDoneButtonBarViewModelImpl$reorder$1(OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl, String str, Long l11, d<? super OrderDoneButtonBarViewModelImpl$reorder$1> dVar) {
        super(2, dVar);
        this.this$0 = orderDoneButtonBarViewModelImpl;
        this.$reorderInfo = str;
        this.$id = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OrderDoneButtonBarViewModelImpl$reorder$1(this.this$0, this.$reorderInfo, this.$id, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r11 != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r11 != r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object hideLoader;
        Object hideLoader2;
        Object showLoader;
        Object hideLoader3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
            } catch (Exception e11) {
                Lm0.a.f17149a.e(e11);
                OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl = this.this$0;
                this.label = 4;
                hideLoader2 = orderDoneButtonBarViewModelImpl.hideLoader(this);
            }
        } catch (Throwable th2) {
            OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl2 = this.this$0;
            this.L$0 = th2;
            this.label = 5;
            hideLoader = orderDoneButtonBarViewModelImpl2.hideLoader(this);
            if (hideLoader != aVar) {
                throw th2;
            }
        }
        if (i11 == 0) {
            s.b(obj);
            OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl3 = this.this$0;
            this.label = 1;
            showLoader = orderDoneButtonBarViewModelImpl3.showLoader(this);
            if (showLoader == aVar) {
                return aVar;
            }
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 == 3 || i11 == 4) {
                    s.b(obj);
                    return Unit.f71690a;
                }
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th3 = (Throwable) this.L$0;
                s.b(obj);
                throw th3;
            }
            s.b(obj);
            this.this$0.getActions().setValue(OrderDoneButtonBarViewModelImpl.Action.OpenCart.INSTANCE);
            OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl4 = this.this$0;
            this.label = 3;
            hideLoader3 = orderDoneButtonBarViewModelImpl4.hideLoader(this);
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        b bVar = b.f10879b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$reorderInfo, this.$id, null);
        this.label = 2;
        if (C10727i.f(bVar, anonymousClass1, this) == aVar) {
            return aVar;
        }
        this.this$0.getActions().setValue(OrderDoneButtonBarViewModelImpl.Action.OpenCart.INSTANCE);
        OrderDoneButtonBarViewModelImpl orderDoneButtonBarViewModelImpl42 = this.this$0;
        this.label = 3;
        hideLoader3 = orderDoneButtonBarViewModelImpl42.hideLoader(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OrderDoneButtonBarViewModelImpl$reorder$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
