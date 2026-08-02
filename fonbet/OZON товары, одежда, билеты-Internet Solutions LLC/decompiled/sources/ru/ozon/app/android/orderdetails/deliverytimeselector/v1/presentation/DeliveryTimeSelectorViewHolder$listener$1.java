package ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation;

import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation.DeliveryTimeSelectorViewHolder;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"ru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSelectorViewHolder$listener$1", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSelectorViewHolder$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$e;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$e;)V", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeVO;", "item", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeVO;", "getItem", "()Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeVO;", "setItem", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeVO;)V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryTimeSelectorViewHolder$listener$1 extends DeliveryTimeSelectorViewHolder.OnTabSelectedListener {
    private DeliveryTimeVO item;
    final /* synthetic */ DeliveryTimeSelectorViewHolder this$0;

    DeliveryTimeSelectorViewHolder$listener$1(DeliveryTimeSelectorViewHolder deliveryTimeSelectorViewHolder) {
        this.this$0 = deliveryTimeSelectorViewHolder;
    }

    @Override // com.google.android.material.tabs.TabLayout.b
    public void onTabSelected(TabLayout.e tab) {
        List<DeliveryDateVO> dates;
        DeliveryDateVO deliveryDateVO;
        List<DeliveryTimeSlotVO> timeslots;
        DeliveryTimeSlotAdapter deliveryTimeSlotAdapter;
        Intrinsics.checkNotNullParameter(tab, "tab");
        DeliveryTimeVO deliveryTimeVO = this.item;
        if (deliveryTimeVO == null || (dates = deliveryTimeVO.getDates()) == null || (deliveryDateVO = dates.get(tab.d())) == null || (timeslots = deliveryDateVO.getTimeslots()) == null) {
            return;
        }
        deliveryTimeSlotAdapter = this.this$0.adapter;
        deliveryTimeSlotAdapter.submitList(timeslots);
    }

    public final void setItem(DeliveryTimeVO deliveryTimeVO) {
        this.item = deliveryTimeVO;
    }
}
