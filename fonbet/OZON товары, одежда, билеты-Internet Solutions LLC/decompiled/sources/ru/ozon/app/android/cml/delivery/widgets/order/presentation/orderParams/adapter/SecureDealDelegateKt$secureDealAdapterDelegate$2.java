package ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.presentation.SecureDealMoleculeView;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsItem;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem$SecureDeal;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/adapter/SecureDealViewBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SecureDealDelegateKt$secureDealAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<OrderParamsItem.SecureDeal, SecureDealViewBinding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payloads", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter.SecureDealDelegateKt$secureDealAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<OrderParamsItem.SecureDeal, SecureDealViewBinding> $this_adapterDelegateViewBinding;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "event", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter.SecureDealDelegateKt$secureDealAdapterDelegate$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17541 extends AbstractC7737t implements Function1<MotionEvent, Boolean> {
            final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
            final /* synthetic */ AdapterDelegateViewBindingViewHolder<OrderParamsItem.SecureDeal, SecureDealViewBinding> $this_adapterDelegateViewBinding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C17541(AdapterDelegateViewBindingViewHolder<OrderParamsItem.SecureDeal, SecureDealViewBinding> adapterDelegateViewBindingViewHolder, Function1<? super AtomAction, Unit> function1) {
                super(1);
                this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
                this.$actionHandler = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                int action = event.getAction();
                boolean z11 = true;
                if (action == 0) {
                    AtomActionDTO action2 = this.$this_adapterDelegateViewBinding.getItem().getSecureDeal().getCommonControlSettings().getAction();
                    if (action2 != null) {
                        this.$actionHandler.invoke(AtomActionMapperKt.toAtomAction(action2, null));
                    }
                } else if (action != 1) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<OrderParamsItem.SecureDeal, SecureDealViewBinding> adapterDelegateViewBindingViewHolder, Function1<? super AtomAction, Unit> function1) {
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
            Intrinsics.g(constraintLayout, "null cannot be cast to non-null type ru.ozon.app.android.cml.delivery.molecules.secureDeal.presentation.SecureDealMoleculeView");
            SecureDealMoleculeView secureDealMoleculeView = (SecureDealMoleculeView) constraintLayout;
            Object M11 = C7714v.M(payloads);
            Bundle bundle = M11 instanceof Bundle ? (Bundle) M11 : null;
            if (bundle != null) {
                SecureDealDelegateKt.handlePayload(secureDealMoleculeView, this.$this_adapterDelegateViewBinding.getItem().getSecureDeal(), bundle, this.$actionHandler);
            } else {
                secureDealMoleculeView.bind(this.$this_adapterDelegateViewBinding.getItem().getSecureDeal(), this.$actionHandler);
            }
            secureDealMoleculeView.setOnToggleTouchEvent(new C17541(this.$this_adapterDelegateViewBinding, this.$actionHandler));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter.SecureDealDelegateKt$secureDealAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<OrderParamsItem.SecureDeal, SecureDealViewBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<OrderParamsItem.SecureDeal, SecureDealViewBinding> adapterDelegateViewBindingViewHolder) {
            super(0);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View constraintLayout = this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout();
            Intrinsics.g(constraintLayout, "null cannot be cast to non-null type ru.ozon.app.android.cml.delivery.molecules.secureDeal.presentation.SecureDealMoleculeView");
            ((SecureDealMoleculeView) constraintLayout).setOnToggleTouchEvent(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SecureDealDelegateKt$secureDealAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<OrderParamsItem.SecureDeal, SecureDealViewBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<OrderParamsItem.SecureDeal, SecureDealViewBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$actionHandler));
        adapterDelegateViewBinding.onViewRecycled(new AnonymousClass2(adapterDelegateViewBinding));
    }
}
