package ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.presentation.CellListGroupView;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsItem;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem$ParamsGroup;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/adapter/CellListGroupViewBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CellListGroupDelegateKt$cellListGroupAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<OrderParamsItem.ParamsGroup, CellListGroupViewBinding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payloads", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter.CellListGroupDelegateKt$cellListGroupAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<OrderParamsItem.ParamsGroup, CellListGroupViewBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<OrderParamsItem.ParamsGroup, CellListGroupViewBinding> adapterDelegateViewBindingViewHolder, Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$actionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            View constraintLayout = this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout();
            Intrinsics.g(constraintLayout, "null cannot be cast to non-null type ru.ozon.app.android.cml.delivery.molecules.cellListGroup.presentation.CellListGroupView");
            CellListGroupView cellListGroupView = (CellListGroupView) constraintLayout;
            Object M11 = C7714v.M(payloads);
            Bundle bundle = M11 instanceof Bundle ? (Bundle) M11 : null;
            if (bundle != null) {
                CellListGroupDelegateKt.handlePayload(cellListGroupView, this.$this_adapterDelegateViewBinding.getItem().getCellListGroupVO(), bundle, this.$actionHandler);
            } else {
                cellListGroupView.bind(this.$this_adapterDelegateViewBinding.getItem().getCellListGroupVO(), this.$actionHandler);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CellListGroupDelegateKt$cellListGroupAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<OrderParamsItem.ParamsGroup, CellListGroupViewBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<OrderParamsItem.ParamsGroup, CellListGroupViewBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$actionHandler));
    }
}
