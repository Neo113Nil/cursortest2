package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewMapper;

import android.view.View;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data.DeliveryDatesDTO;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data.DeliveryTimeSelectorV2Mapper;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.di.DeliveryTimeSelectorV2Component;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewItem.DeliveryDateSelectorV2VO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR<\u0010\"\u001a$\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040 j\b\u0012\u0004\u0012\u00020\u0004`!0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewMapper/DeliveryTimeSelectorV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/di/DeliveryTimeSelectorV2Component;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryDatesDTO;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO;Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2Mapper;", "getMapper", "()Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2Mapper;", "mapper", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryTimeSelectorV2ViewMapper extends WidgetViewMapper2<DeliveryTimeSelectorV2Component, DeliveryDatesDTO, DeliveryDateSelectorV2VO> {
    private final int layout = R$layout.widget_delivery_date_selector_v2;

    @NotNull
    private final Function2<View, ComposerReferences, k<DeliveryDateSelectorV2VO>> holderProducer = DeliveryTimeSelectorV2ViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof DeliveryDatesDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<DeliveryDateSelectorV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Object getPayload(c cVar, c cVar2) {
        getPayload((DeliveryDateSelectorV2VO) cVar, (DeliveryDateSelectorV2VO) cVar2);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<DeliveryTimeSelectorV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return DeliveryTimeSelectorV2Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public DeliveryTimeSelectorV2Mapper getMapper() {
        return component().getDeliveryTimeSelectorMapper();
    }

    public void getPayload(@NotNull DeliveryDateSelectorV2VO oldItem, @NotNull DeliveryDateSelectorV2VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
    }
}
