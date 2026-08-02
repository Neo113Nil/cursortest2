package ru.ozon.app.android.travel.feature.general.order.widgets.orderPassengersDetails.presentation;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.order.databinding.WidgetOrderPassengersDetailsBinding;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderPassengersDetails.presentation.decoration.OrderPassengersDetailsDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPassengersDetails/presentation/OrderPassengersDetailsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPassengersDetails/presentation/OrderPassengersDetailsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/orderPassengersDetails/presentation/OrderPassengersDetailsVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/order/databinding/WidgetOrderPassengersDetailsBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/order/databinding/WidgetOrderPassengersDetailsBinding;", "passengersVO", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPassengersDetails/presentation/OrderPassengersDetailsVO;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderPassengersDetailsWidgetViewHolder extends k<OrderPassengersDetailsVO> {

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final WidgetOrderPassengersDetailsBinding binding;

    @NotNull
    private final View containerView;
    private OrderPassengersDetailsVO passengersVO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPassengersDetailsWidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetOrderPassengersDetailsBinding bind = WidgetOrderPassengersDetailsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        VerticalAtomsLayout verticalAtomsLayout = bind.passengersAtomsVal;
        verticalAtomsLayout.setAdapter(atomsAdapter);
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setDecorator(new OrderPassengersDetailsDecoration(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderPassengersDetailsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.passengersVO = item;
        ImageView logoIv = this.binding.logoIv;
        Intrinsics.checkNotNullExpressionValue(logoIv, "logoIv");
        ImageViewExtKt.load$default(logoIv, item.getIcon(), null, null, null, null, false, null, 126, null);
        this.binding.titleTv.setText(item.getTitle());
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context = getContext();
        List<TextAtom> passengers = item.getPassengers();
        if (passengers == null) {
            passengers = K.f71697a;
        }
        atomsAdapter.bind(context, passengers);
    }
}
