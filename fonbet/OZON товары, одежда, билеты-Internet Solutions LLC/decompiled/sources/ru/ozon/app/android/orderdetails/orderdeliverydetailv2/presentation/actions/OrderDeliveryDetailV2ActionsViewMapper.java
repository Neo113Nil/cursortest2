package ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.actions;

import AV.a;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.actions.OrderDeliveryDetailActionVO;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.data.OrderDeliveryDetailV2DTO;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.di.OrderDeliveryDetailV2ActionsComponent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007*\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR2\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR2\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001d0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015¨\u0006 "}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/presentation/actions/OrderDeliveryDetailV2ActionsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/di/OrderDeliveryDetailV2ActionsComponent;", "Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTO;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/actions/OrderDeliveryDetailActionVO;", "<init>", "()V", "", "toActions", "(Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTO;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDeliveryDetailV2ActionsViewMapper extends WidgetViewMapper2<OrderDeliveryDetailV2ActionsComponent, OrderDeliveryDetailV2DTO, OrderDeliveryDetailActionVO> {

    @NotNull
    private final Function2<OrderDeliveryDetailV2DTO, d, List<OrderDeliveryDetailActionVO>> mapper = new OrderDeliveryDetailV2ActionsViewMapper$mapper$1(this);
    private final int layout = R$layout.order_delivery_detail_action;

    @NotNull
    private final Function2<View, ComposerReferences, k<OrderDeliveryDetailActionVO>> holderProducer = new OrderDeliveryDetailV2ActionsViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final List<OrderDeliveryDetailActionVO> toActions(OrderDeliveryDetailV2DTO orderDeliveryDetailV2DTO) {
        List<ButtonV3Atom.LargeBorderlessButton> actions = orderDeliveryDetailV2DTO.getActions();
        if (actions == null) {
            return K.f71697a;
        }
        List<ButtonV3Atom.LargeBorderlessButton> list = actions;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new OrderDeliveryDetailActionVO(r1.hashCode(), (ButtonV3Atom.LargeBorderlessButton) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDeliveryDetailV2ActionsComponent widgetComponent$lambda$0(C7475g c7475g) {
        return OrderDeliveryDetailV2ActionsComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<OrderDeliveryDetailActionVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<OrderDeliveryDetailV2DTO, d, List<OrderDeliveryDetailActionVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OrderDeliveryDetailV2ActionsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(OrderDeliveryDetailV2ActionsComponent.class), new a(storage, 14));
    }
}
