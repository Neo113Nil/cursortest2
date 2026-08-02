package ru.ozon.app.android.ordertracking.v4;

import A00.a;
import Ap.C2441a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.cscore.orderTracking.configurators.updater.OrderTrackingV4UpdateEvent;
import ru.ozon.app.android.csma.orderTracking.data.OrderTrackingV4DTO;
import ru.ozon.app.android.ordertracking.R$layout;
import ru.ozon.app.android.ordertracking.v4.di.OrderTrackingV4WidgetComponent;
import ru.ozon.app.android.ordertracking.v4.presentation.mapper.OrderTrackingV4Mapper;
import ru.ozon.app.android.ordertracking.v4.presentation.model.OrderTrackingV4VO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR,\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/OrderTrackingV4ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ordertracking/v4/di/OrderTrackingV4WidgetComponent;", "Lru/ozon/app/android/csma/orderTracking/data/OrderTrackingV4DTO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingV4VO;", "<init>", "()V", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingV4VO;Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingV4VO;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "LA00/a$J$a;", "update", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingV4VO;)Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingV4VO;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ordertracking/v4/OrderTrackingV4ViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/ordertracking/v4/presentation/mapper/OrderTrackingV4Mapper;", "getMapper", "()Lru/ozon/app/android/ordertracking/v4/presentation/mapper/OrderTrackingV4Mapper;", "mapper", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderTrackingV4ViewMapper extends WidgetViewMapper2<OrderTrackingV4WidgetComponent, OrderTrackingV4DTO, OrderTrackingV4VO> {
    private final int layout = R$layout.widget_order_tracking_v4;

    @NotNull
    private final Function2<View, ComposerReferences, OrderTrackingV4ViewHolder> holderProducer = new OrderTrackingV4ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(OrderTrackingV4UpdateEvent.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderTrackingV4WidgetComponent widgetComponent$lambda$0(C7475g c7475g) {
        return OrderTrackingV4WidgetComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, OrderTrackingV4ViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    public void getPayload(@NotNull OrderTrackingV4VO oldItem, @NotNull OrderTrackingV4VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OrderTrackingV4WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(OrderTrackingV4WidgetComponent.class), new C2441a(storage, 4));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public OrderTrackingV4Mapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Object getPayload(c cVar, c cVar2) {
        getPayload((OrderTrackingV4VO) cVar, (OrderTrackingV4VO) cVar2);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public OrderTrackingV4VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull OrderTrackingV4VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update instanceof OrderTrackingV4UpdateEvent ? OrderTrackingV4VO.copy$default(component().getMapper().mapByStateOnly(((OrderTrackingV4UpdateEvent) update).getOrderTrackingDto(), oldItem.getId()), 0L, null, null, null, null, oldItem.getLayoutManagerState(), 31, null) : oldItem;
    }
}
