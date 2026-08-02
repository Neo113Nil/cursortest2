package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.data.FlightOrderDetailsV2DTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.di.FlightOrderDetailsV2Component;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.view.FlightOrderDetailsV2View;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R,\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR0\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001c¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/di/FlightOrderDetailsV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/di/FlightOrderDetailsV2Component;)V", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2Decoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/di/FlightOrderDetailsV2Component;", "getComponent", "()Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/di/FlightOrderDetailsV2Component;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV2ViewMapper extends WidgetViewMapper<FlightOrderDetailsV2DTO, FlightOrderDetailsV2VO> {

    @NotNull
    private final FlightOrderDetailsV2Component component;

    @NotNull
    private final Function2<View, ComposerReferences, FlightOrderDetailsV2WidgetViewHolder> holderProducer;

    public FlightOrderDetailsV2ViewMapper(@NotNull FlightOrderDetailsV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.holderProducer = new FlightOrderDetailsV2ViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FlightOrderDetailsV2View flightOrderDetailsV2View = (FlightOrderDetailsV2View) q.f64554a.i(N.b(FlightOrderDetailsV2View.class), parent.getContext());
        if (flightOrderDetailsV2View == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            flightOrderDetailsV2View = new FlightOrderDetailsV2View(context);
        }
        flightOrderDetailsV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return flightOrderDetailsV2View;
    }

    @NotNull
    public final FlightOrderDetailsV2Component getComponent() {
        return this.component;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<FlightOrderDetailsV2Decoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new FlightOrderDetailsV2Decoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<FlightOrderDetailsV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<FlightOrderDetailsV2DTO, d, List<FlightOrderDetailsV2VO>> getMapper() {
        return this.component.getFlightOrderDetailsV2Mapper();
    }
}
