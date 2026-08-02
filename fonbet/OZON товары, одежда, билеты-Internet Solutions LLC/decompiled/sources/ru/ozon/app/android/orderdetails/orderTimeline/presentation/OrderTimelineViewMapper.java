package ru.ozon.app.android.orderdetails.orderTimeline.presentation;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import k20.C7471c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.orderdetails.R$drawable;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.app.android.orderdetails.orderTimeline.data.OrderTimelineDTO;
import ru.ozon.app.android.orderdetails.orderTimeline.data.StepsItem;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007*\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR2\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR2\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001d0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015¨\u0006 "}, d2 = {"Lru/ozon/app/android/orderdetails/orderTimeline/presentation/OrderTimelineViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "", "Lru/ozon/app/android/orderdetails/orderTimeline/data/OrderTimelineDTO;", "Lru/ozon/app/android/orderdetails/orderTimeline/presentation/OrderTimelineVO;", "<init>", "()V", "", "toVO", "(Lru/ozon/app/android/orderdetails/orderTimeline/data/OrderTimelineDTO;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/c;", "widgetComponent", "(Lk20/g;)Lk20/c;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderTimelineViewMapper extends WidgetViewMapper2 {

    @NotNull
    private final Function2<OrderTimelineDTO, d, List<OrderTimelineVO>> mapper = new OrderTimelineViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_order_timeline_layout;

    @NotNull
    private final Function2<View, ComposerReferences, k<OrderTimelineVO>> holderProducer = OrderTimelineViewMapper$holderProducer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public final List<OrderTimelineVO> toVO(OrderTimelineDTO orderTimelineDTO) {
        int size = orderTimelineDTO.getSteps().size() - 1;
        List<StepsItem> steps = orderTimelineDTO.getSteps();
        ArrayList arrayList = new ArrayList(C7714v.z(steps, 10));
        int i11 = 0;
        for (Object obj : steps) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            StepsItem stepsItem = (StepsItem) obj;
            arrayList.add(new OrderTimelineVO(orderTimelineDTO.hashCode(), stepsItem.getTitle(), stepsItem.getSubtitle(), stepsItem.getAddress(), i11 <= orderTimelineDTO.getCurrentStep() ? R$drawable.bg_timeline_status_complete : R$drawable.bg_timeline_status_incomplete, i11 == size ? UniColors.WHITE_TRANSPARENT_0 : (i11 < 0 || i11 >= orderTimelineDTO.getCurrentStep()) ? UniColors.GRAPHIC_TERTIARY : UniColors.GRAPHIC_ACTION_PRIMARY));
            i11 = i12;
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<OrderTimelineVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<OrderTimelineDTO, d, List<OrderTimelineVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7471c widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }
}
