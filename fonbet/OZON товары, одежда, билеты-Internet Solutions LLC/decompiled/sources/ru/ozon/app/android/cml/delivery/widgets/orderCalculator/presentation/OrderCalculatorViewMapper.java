package ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.data.OrderCalculatorDTO;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.di.OrderCalculatorComponent;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.OrderCalculatorVO;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.view.OrderCalculatorView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R<\u0010\u001c\u001a$\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001aj\b\u0012\u0004\u0012\u00020\u0004`\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/di/OrderCalculatorComponent;", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO;", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO;Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "", "getMapper", "mapper", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderCalculatorViewMapper extends WidgetViewMapper2<OrderCalculatorComponent, OrderCalculatorDTO, OrderCalculatorVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<OrderCalculatorVO>> holderProducer = new OrderCalculatorViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new OrderCalculatorView(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<OrderCalculatorVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<OrderCalculatorDTO, d, List<OrderCalculatorVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OrderCalculatorComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return OrderCalculatorComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull OrderCalculatorVO oldItem, @NotNull OrderCalculatorVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        OrderCalculatorPayload orderCalculatorPayload = new OrderCalculatorPayload();
        OrderCalculatorVO.RegionsVO regions = oldItem.getRegions();
        OrderCalculatorVO.RegionsVO regions2 = newItem.getRegions();
        boolean d11 = Intrinsics.d(regions.getSource().getText(), regions2.getSource().getText());
        boolean d12 = Intrinsics.d(regions.getDestination().getText(), regions2.getDestination().getText());
        if (oldItem.getAreRegionsSwapped() && !d11 && !d12) {
            orderCalculatorPayload.setRegionsSwapped();
        }
        if (!d11) {
            orderCalculatorPayload.setSourceChanged();
        }
        if (!d12) {
            orderCalculatorPayload.setDestinationChanged();
        }
        if (orderCalculatorPayload.isNotEmpty()) {
            return orderCalculatorPayload;
        }
        return null;
    }
}
