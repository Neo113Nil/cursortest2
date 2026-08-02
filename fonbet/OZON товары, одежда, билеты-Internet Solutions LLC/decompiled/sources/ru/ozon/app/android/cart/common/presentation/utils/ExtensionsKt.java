package ru.ozon.app.android.cart.common.presentation.utils;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import UZ.a;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import fd.InterfaceC6511n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002B\u0010\u0007\u001a>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u0013\u001a\u00020\u0006*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014\u001aa\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182(\u0010\u001b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LAe/h;", "Lru/ozon/app/android/cart/common/domain/CartState;", "Lkotlin/Function3;", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "", "callback", "collectRemoteUpdates", "(LAe/h;Lfd/n;)LAe/h;", "LWZ/l;", "LWZ/t;", "tokenizedEvent", "", "quantity", "", "", "custom", "totalQuantity", "processChangeCart", "(LWZ/l;LWZ/t;ILjava/util/Map;Ljava/lang/Integer;)V", "T", "Landroid/view/View;", "view", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "Lkotlin/coroutines/d;", "action", "onEachOutOfLayoutView", "(LAe/h;Landroid/view/View;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lfd/n;)LAe/h;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtensionsKt {
    @NotNull
    public static final InterfaceC2395h<CartState> collectRemoteUpdates(@NotNull InterfaceC2395h<CartState> interfaceC2395h, @NotNull InterfaceC6511n<? super Map<Long, CartItemInfo>, ? super Map<Long, CartItemInfo>, ? super Map<Long, CartItemInfo>, Unit> callback) {
        Intrinsics.checkNotNullParameter(interfaceC2395h, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new C2408n0(interfaceC2395h, new ExtensionsKt$collectRemoteUpdates$1(new M(), callback, null));
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> onEachOutOfLayoutView(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull View view, CoroutineDispatcherProvider coroutineDispatcherProvider, @NotNull InterfaceC6511n<? super T, ? super View, ? super d<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(interfaceC2395h, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        return C2399j.A(new ExtensionsKt$onEachOutOfLayoutView$$inlined$transform$1(interfaceC2395h, null, view, coroutineDispatcherProvider, action));
    }

    public static /* synthetic */ InterfaceC2395h onEachOutOfLayoutView$default(InterfaceC2395h interfaceC2395h, View view, CoroutineDispatcherProvider coroutineDispatcherProvider, InterfaceC6511n interfaceC6511n, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            coroutineDispatcherProvider = null;
        }
        return onEachOutOfLayoutView(interfaceC2395h, view, coroutineDispatcherProvider, interfaceC6511n);
    }

    public static final void processChangeCart(@NotNull l lVar, @NotNull t tokenizedEvent, final int i11, @NotNull final Map<String, ? extends Object> custom, final Integer num) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(tokenizedEvent, "tokenizedEvent");
        Intrinsics.checkNotNullParameter(custom, "custom");
        m.a(lVar, tokenizedEvent, new e() { // from class: yn.a
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g processChangeCart$lambda$1;
                processChangeCart$lambda$1 = ExtensionsKt.processChangeCart$lambda$1(custom, i11, num, (UZ.d) aVar, gVar);
                return processChangeCart$lambda$1;
            }
        });
    }

    public static /* synthetic */ void processChangeCart$default(l lVar, t tVar, int i11, Map map, Integer num, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            map = U.c();
        }
        if ((i12 & 8) != 0) {
            num = null;
        }
        processChangeCart(lVar, tVar, i11, map, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g processChangeCart$lambda$1(Map map, int i11, Integer num, a event, g params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        if (!(event instanceof UZ.d)) {
            return params;
        }
        Map<String, Object> b11 = params.b();
        if (b11 == null) {
            b11 = U.c();
        }
        LinkedHashMap u11 = U.u(b11);
        if (!map.isEmpty()) {
            u11.putAll(map);
        }
        u11.put("quantity", Integer.valueOf(i11));
        if (num != null) {
            u11.put("total_quantity", Integer.valueOf(num.intValue()));
        }
        return g.a(params, u11, null, 2);
    }
}
