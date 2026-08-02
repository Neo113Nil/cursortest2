package ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation;

import android.view.View;
import android.widget.ImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.databinding.ItemTimeSlotBinding;
import ru.ozon.app.android.uikit.view.recycler.adapter.ViewHolder;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/ViewHolder;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotVO;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getContainerView", "()Landroid/view/View;", "binding", "Lru/ozon/app/android/orderdetails/databinding/ItemTimeSlotBinding;", "bind", "", "item", "payloads", "", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryTimeSlotViewHolder extends ViewHolder<DeliveryTimeSlotVO> {

    @NotNull
    private final ItemTimeSlotBinding binding;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryTimeSlotViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        ItemTimeSlotBinding bind = ItemTimeSlotBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(Object obj, List list) {
        bind((DeliveryTimeSlotVO) obj, (List<? extends Object>) list);
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    public void bind(@NotNull DeliveryTimeSlotVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        ItemTimeSlotBinding itemTimeSlotBinding = this.binding;
        ImageView icon = itemTimeSlotBinding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        ViewExtKt.showOrInvisible(icon, item.getIsSelected());
        itemTimeSlotBinding.time.setText(item.getTitle());
    }
}
