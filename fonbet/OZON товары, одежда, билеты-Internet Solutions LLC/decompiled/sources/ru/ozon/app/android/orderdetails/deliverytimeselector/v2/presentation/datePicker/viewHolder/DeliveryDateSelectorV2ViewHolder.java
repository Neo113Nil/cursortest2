package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewHolder;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.WidgetDeliveryDateSelectorV2Binding;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewHolder.adapter.DeliveryDateSlotAdapter;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewHolder.adapter.DeliveryDateSlotItemDecorator;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewItem.DeliveryDateSelectorV2VO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewHolder/DeliveryDateSelectorV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/orderdetails/databinding/WidgetDeliveryDateSelectorV2Binding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/WidgetDeliveryDateSelectorV2Binding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/WidgetDeliveryDateSelectorV2Binding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewHolder/adapter/DeliveryDateSlotAdapter;", "adapter", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewHolder/adapter/DeliveryDateSlotAdapter;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryDateSelectorV2ViewHolder extends k<DeliveryDateSelectorV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final DeliveryDateSlotAdapter adapter;

    @NotNull
    private final WidgetDeliveryDateSelectorV2Binding binding;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeliveryDateSelectorV2ViewHolder(@NotNull WidgetDeliveryDateSelectorV2Binding binding, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        RecyclerView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        DeliveryDateSlotAdapter deliveryDateSlotAdapter = new DeliveryDateSlotAdapter(new DeliveryDateSelectorV2ViewHolder$adapter$1(this));
        this.adapter = deliveryDateSlotAdapter;
        binding.dateTabRecyclerView.setAdapter(deliveryDateSlotAdapter);
        binding.dateTabRecyclerView.addItemDecoration(new DeliveryDateSlotItemDecorator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryDateSelectorV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.submitList(item.getDeliveryDates());
    }
}
