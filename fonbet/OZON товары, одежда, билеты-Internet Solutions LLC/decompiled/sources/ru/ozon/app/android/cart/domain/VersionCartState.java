package ru.ozon.app.android.cart.domain;

import Xc.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartType;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/domain/VersionCartState;", "", "<init>", "()V", "counters", "", "Lru/ozon/app/android/cart/common/domain/CartType;", "Ljava/util/concurrent/atomic/AtomicLong;", "next", "", "type", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VersionCartState {

    @NotNull
    private final Map<CartType, AtomicLong> counters;

    public VersionCartState() {
        a<CartType> entries = CartType.getEntries();
        int h11 = U.h(C7714v.z(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
        for (Object obj : entries) {
            linkedHashMap.put(obj, new AtomicLong());
        }
        this.counters = linkedHashMap;
    }

    public static /* synthetic */ long next$default(VersionCartState versionCartState, CartType cartType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cartType = CartType.MAIN_CART;
        }
        return versionCartState.next(cartType);
    }

    public final long next(@NotNull CartType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return ((AtomicLong) U.e(this.counters, type)).getAndIncrement();
    }
}
