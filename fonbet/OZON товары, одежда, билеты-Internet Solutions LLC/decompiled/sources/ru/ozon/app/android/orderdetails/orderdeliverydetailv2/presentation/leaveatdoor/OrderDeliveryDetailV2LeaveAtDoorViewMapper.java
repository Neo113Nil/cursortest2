package ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.leaveatdoor;

import android.view.View;
import java.util.List;
import k20.C7471c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.data.LeaveAtDoor;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.leaveatdoor.LeaveAtDoorVO;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.leaveatdoor.OrderDeliveryDetailLeaveAtDoorVO;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.data.OrderDeliveryDetailV2DTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007*\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R2\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR2\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/presentation/leaveatdoor/OrderDeliveryDetailV2LeaveAtDoorViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "", "Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTO;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/OrderDeliveryDetailLeaveAtDoorVO;", "<init>", "()V", "", "toLeaveAtDoor", "(Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTO;)Ljava/util/List;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/LeaveAtDoor;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/LeaveAtDoorVO;", "toVO", "(Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/LeaveAtDoor;)Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/LeaveAtDoorVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/c;", "widgetComponent", "(Lk20/g;)Lk20/c;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDeliveryDetailV2LeaveAtDoorViewMapper extends WidgetViewMapper2 {

    @NotNull
    private final Function2<OrderDeliveryDetailV2DTO, d, List<OrderDeliveryDetailLeaveAtDoorVO>> mapper = new OrderDeliveryDetailV2LeaveAtDoorViewMapper$mapper$1(this);
    private final int layout = R$layout.order_delivery_detail_leave_at_door;

    @NotNull
    private final Function2<View, ComposerReferences, k<OrderDeliveryDetailLeaveAtDoorVO>> holderProducer = OrderDeliveryDetailV2LeaveAtDoorViewMapper$holderProducer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public final List<OrderDeliveryDetailLeaveAtDoorVO> toLeaveAtDoor(OrderDeliveryDetailV2DTO orderDeliveryDetailV2DTO) {
        List<OrderDeliveryDetailLeaveAtDoorVO> a02;
        LeaveAtDoor leaveAtDoor = orderDeliveryDetailV2DTO.getLeaveAtDoor();
        return (leaveAtDoor == null || (a02 = C7714v.a0(new OrderDeliveryDetailLeaveAtDoorVO((long) leaveAtDoor.hashCode(), toVO(leaveAtDoor)))) == null) ? K.f71697a : a02;
    }

    private final LeaveAtDoorVO toVO(LeaveAtDoor leaveAtDoor) {
        return new LeaveAtDoorVO(leaveAtDoor.getTitle(), leaveAtDoor.getDelivered() ? R$drawable.ic_s_check : ru.ozon.uni.R$drawable.ic_m_ok, leaveAtDoor.getGallery());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<OrderDeliveryDetailLeaveAtDoorVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<OrderDeliveryDetailV2DTO, d, List<OrderDeliveryDetailLeaveAtDoorVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7471c widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }
}
