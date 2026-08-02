package ru.ozon.app.android.cml.delivery.widgets.order.v2.presentation;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.BaseOrderWidgetViewModel;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.OrderWidgetUpdate;
import ru.ozon.app.android.cml.delivery.widgets.order.v2.data.OrderWidgetV2DTO;
import ru.ozon.app.android.cml.delivery.widgets.order.v2.data.mapper.OrderWidgetV2AsyncUpdateMapper;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/v2/presentation/OrderWidgetV2ViewModel;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/BaseOrderWidgetViewModel;", "Lru/ozon/app/android/cml/delivery/widgets/order/v2/data/OrderWidgetV2DTO;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Lru/ozon/app/android/cml/delivery/widgets/order/v2/data/mapper/OrderWidgetV2AsyncUpdateMapper;", "mapper", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/cml/delivery/widgets/order/v2/data/mapper/OrderWidgetV2AsyncUpdateMapper;)V", "", "asyncData", "", "", "params", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "fetchAsyncState", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "state", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/OrderWidgetUpdate;", "mapAsyncState", "(Lru/ozon/app/android/cml/delivery/widgets/order/v2/data/OrderWidgetV2DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/cml/delivery/widgets/order/v2/data/mapper/OrderWidgetV2AsyncUpdateMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderWidgetV2ViewModel extends BaseOrderWidgetViewModel<OrderWidgetV2DTO> {

    @NotNull
    private final ComposerAsyncWidgetRepository asyncWidgetRepository;

    @NotNull
    private final OrderWidgetV2AsyncUpdateMapper mapper;

    public OrderWidgetV2ViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull OrderWidgetV2AsyncUpdateMapper mapper) {
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.asyncWidgetRepository = asyncWidgetRepository;
        this.mapper = mapper;
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.order.presentation.BaseOrderWidgetViewModel
    public Object fetchAsyncState(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull d<? super ComposerAsyncWidgetResponse<OrderWidgetV2DTO>> dVar) {
        return ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(this.asyncWidgetRepository, str, map, OrderWidgetV2DTO.class, null, dVar, 8, null);
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.order.presentation.BaseOrderWidgetViewModel
    @NotNull
    public List<OrderWidgetUpdate> mapAsyncState(@NotNull OrderWidgetV2DTO state, @NotNull l20.d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return this.mapper.invoke(state, widgetInfo);
    }
}
