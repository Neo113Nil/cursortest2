package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewHolder;

import AW.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.databinding.ItemDateSlotV2Binding;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewItem.DeliveryDateSelectorV2VO;
import ru.ozon.app.android.uikit.view.recycler.adapter.ViewHolder;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewHolder/DeliveryDateSlotViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/ViewHolder;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO$DeliveryDateVO;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "clickListener", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "item", "", "", "payloads", "bind", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO$DeliveryDateVO;Ljava/util/List;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/orderdetails/databinding/ItemDateSlotV2Binding;", "binding", "Lru/ozon/app/android/orderdetails/databinding/ItemDateSlotV2Binding;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryDateSlotViewHolder extends ViewHolder<DeliveryDateSelectorV2VO.DeliveryDateVO> {

    @NotNull
    private final ItemDateSlotV2Binding binding;

    @NotNull
    private final Function1<AtomAction, Unit> clickListener;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryDateSlotViewHolder(@NotNull View containerView, @NotNull Function1<? super AtomAction, Unit> clickListener) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.containerView = containerView;
        this.clickListener = clickListener;
        ItemDateSlotV2Binding bind = ItemDateSlotV2Binding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.dateTV.setTextIsSelectable(false);
        bind.weekDayTV.setTextIsSelectable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(DeliveryDateSelectorV2VO.DeliveryDateVO deliveryDateVO, DeliveryDateSlotViewHolder deliveryDateSlotViewHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        CommonControlSettings common = deliveryDateVO.getWrapper().getCommon();
        if (common == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, null)) == null) {
            return;
        }
        deliveryDateSlotViewHolder.clickListener.invoke(atomAction);
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(Object obj, List list) {
        bind((DeliveryDateSelectorV2VO.DeliveryDateVO) obj, (List<? extends Object>) list);
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    public void bind(@NotNull DeliveryDateSelectorV2VO.DeliveryDateVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        ItemDateSlotV2Binding itemDateSlotV2Binding = this.binding;
        AspectView dateAspectView = itemDateSlotV2Binding.dateAspectView;
        Intrinsics.checkNotNullExpressionValue(dateAspectView, "dateAspectView");
        AspectHolderKt.bind$default(dateAspectView, item.getWrapper(), null, 2, null);
        TextAtomV2View dateTV = itemDateSlotV2Binding.dateTV;
        Intrinsics.checkNotNullExpressionValue(dateTV, "dateTV");
        TextHolderKt.bind$default(dateTV, item.getTitle(), null, 2, null);
        TextAtomV2View weekDayTV = itemDateSlotV2Binding.weekDayTV;
        Intrinsics.checkNotNullExpressionValue(weekDayTV, "weekDayTV");
        TextHolderKt.bind$default(weekDayTV, item.getSubtitle(), null, 2, null);
        this.itemView.setOnClickListener(new a(3, item, this));
    }
}
