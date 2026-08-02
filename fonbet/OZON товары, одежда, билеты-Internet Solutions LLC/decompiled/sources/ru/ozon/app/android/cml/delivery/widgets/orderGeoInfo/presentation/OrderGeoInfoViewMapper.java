package ru.ozon.app.android.cml.delivery.widgets.orderGeoInfo.presentation;

import c20.r;
import java.util.List;
import k20.C7471c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.WidgetExtKt;
import ru.ozon.app.android.cml.delivery.widgets.orderGeoInfo.data.OrderGeoInfoDTO;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderGeoInfo/presentation/OrderGeoInfoViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "", "Lru/ozon/app/android/cml/delivery/widgets/orderGeoInfo/data/OrderGeoInfoDTO;", "Lru/ozon/app/android/cml/delivery/widgets/orderGeoInfo/presentation/OrderGeoInfoVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/cml/delivery/widgets/orderGeoInfo/data/OrderGeoInfoDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Lru/ozon/app/android/cml/delivery/widgets/orderGeoInfo/presentation/OrderGeoInfoViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/cml/delivery/widgets/orderGeoInfo/presentation/OrderGeoInfoViewHolder;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/c;", "widgetComponent", "(Lk20/g;)Lk20/c;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderGeoInfoViewMapper extends OverlayWidgetScreenViewItemMapper2 {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r
    @NotNull
    public OrderGeoInfoViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new OrderGeoInfoViewHolder();
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<OrderGeoInfoVO> map(@NotNull OrderGeoInfoDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(new OrderGeoInfoVO(WidgetExtKt.getWidgetId(info), state.getGeoInfo()));
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7471c widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }
}
