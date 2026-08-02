package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.IntervalTimerDelegate;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusV3Mapper;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusV3ViewModel;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0016\u001a\u00060\u0012j\u0002`\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/di/OrderStatusV3Component$Companion$create$1$1", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/di/OrderStatusV3Component;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/IntervalTimerDelegate;", "timerDelegate", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/IntervalTimerDelegate;", "getTimerDelegate", "()Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/IntervalTimerDelegate;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3Mapper;", "mapper", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3ViewModel;", "viewModel$delegate", "getViewModel", "()Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3ViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderStatusV3Component$Companion$create$1$1 implements OrderStatusV3Component {
    final /* synthetic */ C7475g $storage;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel;
    private final IntervalTimerDelegate timerDelegate = new IntervalTimerDelegate();

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(OrderStatusV3Component$Companion$create$1$1$mapper$2.INSTANCE);

    OrderStatusV3Component$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModel = k.b(new OrderStatusV3Component$Companion$create$1$1$viewModel$2(c7475g, this));
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.di.OrderStatusV3Component
    public OrderStatusV3Mapper getMapper() {
        return (OrderStatusV3Mapper) this.mapper.getValue();
    }

    public IntervalTimerDelegate getTimerDelegate() {
        return this.timerDelegate;
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.di.OrderStatusV3Component
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.di.OrderStatusV3Component
    public OrderStatusV3ViewModel getViewModel() {
        return (OrderStatusV3ViewModel) this.viewModel.getValue();
    }
}
