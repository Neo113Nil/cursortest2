package ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.tabs.TabLayout;
import java.util.Collection;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.databinding.WidgetDeliveryTimeSelectorBinding;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u0019\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u001cB\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSelectorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerBus", "<init>", "(Landroid/view/View;Ll10/b;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeVO;Ll20/d;)V", "Ll10/b;", "Lru/ozon/app/android/orderdetails/databinding/WidgetDeliveryTimeSelectorBinding;", "binding", "Lru/ozon/app/android/orderdetails/databinding/WidgetDeliveryTimeSelectorBinding;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotAdapter;", "adapter", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotAdapter;", "ru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSelectorViewHolder$listener$1", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSelectorViewHolder$listener$1;", "OnTabSelectedListener", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryTimeSelectorViewHolder extends k<DeliveryTimeVO> {

    @NotNull
    private final DeliveryTimeSlotAdapter adapter;

    @NotNull
    private final WidgetDeliveryTimeSelectorBinding binding;

    @NotNull
    private final InterfaceC7851b composerBus;

    @NotNull
    private final DeliveryTimeSelectorViewHolder$listener$1 listener;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSelectorViewHolder$OnTabSelectedListener;", "", "<init>", "()V", "Lcom/google/android/material/tabs/TabLayout$e;", "tab", "", "onTabReselected", "(Lcom/google/android/material/tabs/TabLayout$e;)V", "onTabUnselected", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static abstract class OnTabSelectedListener implements TabLayout.b {
        @Override // com.google.android.material.tabs.TabLayout.b
        public void onTabReselected(@NotNull TabLayout.e tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public void onTabUnselected(@NotNull TabLayout.e tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryTimeSelectorViewHolder(@NotNull View containerView, @NotNull InterfaceC7851b composerBus) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerBus, "composerBus");
        this.composerBus = composerBus;
        WidgetDeliveryTimeSelectorBinding bind = WidgetDeliveryTimeSelectorBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        DeliveryTimeSlotAdapter deliveryTimeSlotAdapter = new DeliveryTimeSlotAdapter(new DeliveryTimeSelectorViewHolder$adapter$1(this));
        this.adapter = deliveryTimeSlotAdapter;
        DeliveryTimeSelectorViewHolder$listener$1 deliveryTimeSelectorViewHolder$listener$1 = new DeliveryTimeSelectorViewHolder$listener$1(this);
        this.listener = deliveryTimeSelectorViewHolder$listener$1;
        bind.timeRecyclerView.setAdapter(deliveryTimeSlotAdapter);
        bind.timeRecyclerView.addItemDecoration(new DeliveryTimeSlotDecoration(getContext()));
        bind.tabLayout.c(deliveryTimeSelectorViewHolder$listener$1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009c  */
    @Override // ru.ozon.composer.ui.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull DeliveryTimeVO item, @NotNull d info) {
        TabLayout.e k11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TabLayout tabLayout = this.binding.tabLayout;
        if (tabLayout.l() == item.getDates().size()) {
            Iterable o11 = h.o(0, tabLayout.l());
            if (!(o11 instanceof Collection) || !((Collection) o11).isEmpty()) {
                C7665d it = o11.iterator();
                while (it.hasNext()) {
                    int b11 = it.b();
                    TabLayout.e k12 = tabLayout.k(b11);
                    if (!Intrinsics.d(k12 != null ? k12.f() : null, item.getDates().get(b11).getTitle())) {
                    }
                }
            }
            this.listener.setItem(item);
            k11 = tabLayout.k(tabLayout.j());
            if (k11 == null) {
                this.listener.onTabSelected(k11);
                return;
            }
            return;
        }
        tabLayout.o();
        for (DeliveryDateVO deliveryDateVO : item.getDates()) {
            TabLayout.e m11 = tabLayout.m();
            m11.n(deliveryDateVO.getTitle());
            tabLayout.e(m11, deliveryDateVO.getIsSelected());
        }
        this.listener.setItem(item);
        k11 = tabLayout.k(tabLayout.j());
        if (k11 == null) {
        }
    }
}
