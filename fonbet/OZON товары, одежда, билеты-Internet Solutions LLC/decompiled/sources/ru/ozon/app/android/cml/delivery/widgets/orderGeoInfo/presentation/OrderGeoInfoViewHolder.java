package ru.ozon.app.android.cml.delivery.widgets.orderGeoInfo.presentation;

import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.data.PreorderParamsStore;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderGeoInfo/presentation/OrderGeoInfoViewHolder;", "Ld20/b;", "Lru/ozon/app/android/cml/delivery/widgets/orderGeoInfo/presentation/OrderGeoInfoVO;", "<init>", "()V", "item", "", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/orderGeoInfo/presentation/OrderGeoInfoVO;)V", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderGeoInfoViewHolder extends AbstractC6065b<OrderGeoInfoVO> {
    private final View metricView;

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull OrderGeoInfoVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PreorderParamsStore.INSTANCE.saveGeoInfo(item.getGeoInfo());
    }
}
