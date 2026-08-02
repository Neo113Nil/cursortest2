package ru.ozon.app.android.cart.common.presentation.utils;

import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.M;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.CartItemInfo;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "currentState", "Lru/ozon/app/android/cart/common/domain/CartState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt$collectRemoteUpdates$1", f = "Extensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ExtensionsKt$collectRemoteUpdates$1 extends j implements Function2<CartState, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC6511n<Map<Long, CartItemInfo>, Map<Long, CartItemInfo>, Map<Long, CartItemInfo>, Unit> $callback;
    final /* synthetic */ M<CartState> $previousState;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ExtensionsKt$collectRemoteUpdates$1(M<CartState> m11, InterfaceC6511n<? super Map<Long, CartItemInfo>, ? super Map<Long, CartItemInfo>, ? super Map<Long, CartItemInfo>, Unit> interfaceC6511n, d<? super ExtensionsKt$collectRemoteUpdates$1> dVar) {
        super(2, dVar);
        this.$previousState = m11;
        this.$callback = interfaceC6511n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ExtensionsKt$collectRemoteUpdates$1 extensionsKt$collectRemoteUpdates$1 = new ExtensionsKt$collectRemoteUpdates$1(this.$previousState, this.$callback, dVar);
        extensionsKt$collectRemoteUpdates$1.L$0 = obj;
        return extensionsKt$collectRemoteUpdates$1;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [T, ru.ozon.app.android.cart.common.domain.CartState] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map<Long, CartItemInfo> originalItems;
        Map<Long, CartItemInfo> originalItems2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ?? r11 = (CartState) this.L$0;
        M<CartState> m11 = this.$previousState;
        if (m11.f71787a == null) {
            m11.f71787a = r11;
            return Unit.f71690a;
        }
        if (r11.getSource() == CartSource.REMOTE) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Map<Long, CartItemInfo> originalItems3 = r11.getOriginalItems();
            M<CartState> m12 = this.$previousState;
            for (Map.Entry<Long, CartItemInfo> entry : originalItems3.entrySet()) {
                long longValue = entry.getKey().longValue();
                CartItemInfo value = entry.getValue();
                CartState cartState = m12.f71787a;
                CartItemInfo cartItemInfo = (cartState == null || (originalItems2 = cartState.getOriginalItems()) == null) ? null : originalItems2.get(new Long(longValue));
                if (cartItemInfo == null) {
                    linkedHashMap.put(new Long(longValue), value);
                } else if (!cartItemInfo.equals(value)) {
                    linkedHashMap2.put(new Long(longValue), value);
                }
            }
            CartState cartState2 = this.$previousState.f71787a;
            if (cartState2 != null && (originalItems = cartState2.getOriginalItems()) != null) {
                for (Map.Entry<Long, CartItemInfo> entry2 : originalItems.entrySet()) {
                    long longValue2 = entry2.getKey().longValue();
                    CartItemInfo value2 = entry2.getValue();
                    if (r11.getOriginalItems().get(new Long(longValue2)) == null) {
                        linkedHashMap3.put(new Long(longValue2), value2);
                    }
                }
            }
            this.$callback.invoke(linkedHashMap, linkedHashMap2, linkedHashMap3);
        }
        this.$previousState.f71787a = r11;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartState cartState, d<? super Unit> dVar) {
        return ((ExtensionsKt$collectRemoteUpdates$1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
