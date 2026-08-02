package ru.ozon.app.android.checkoutcomposer.common.localgoods;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.localgoods.LocalGoodsForCheckoutRepository;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\u0016\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0016R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/localgoods/LocalGoodsForCheckoutRepositoryImpl;", "Lru/ozon/app/android/checkoutgeo/checkout/localgoods/LocalGoodsForCheckoutRepository;", "<init>", "()V", "data", "", "", "", "putLocalGoods", "", "popLocalGoods", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalGoodsForCheckoutRepositoryImpl implements LocalGoodsForCheckoutRepository {
    private Map<String, ? extends Object> data;

    @Override // ru.ozon.app.android.checkoutgeo.checkout.localgoods.LocalGoodsForCheckoutRepository
    public Map<String, Object> popLocalGoods() {
        Map<String, ? extends Object> map = this.data;
        this.data = null;
        return map;
    }

    @Override // ru.ozon.app.android.checkoutgeo.checkout.localgoods.LocalGoodsForCheckoutRepository
    public void putLocalGoods(@NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }
}
