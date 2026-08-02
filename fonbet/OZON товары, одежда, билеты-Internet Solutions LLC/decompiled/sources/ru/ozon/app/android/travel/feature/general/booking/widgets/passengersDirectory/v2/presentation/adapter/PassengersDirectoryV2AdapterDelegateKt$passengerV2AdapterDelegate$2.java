package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.adapter;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.travel.feature.general.booking.databinding.ItemPassengersDirectoryPassengerV2Binding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.PassengersDirectoryV2VO;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$PassengerV2VO;", "Lru/ozon/app/android/travel/feature/general/booking/databinding/ItemPassengersDirectoryPassengerV2Binding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PassengersDirectoryV2AdapterDelegateKt$passengerV2AdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<PassengersDirectoryV2VO.PassengerV2VO, ItemPassengersDirectoryPassengerV2Binding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.adapter.PassengersDirectoryV2AdapterDelegateKt$passengerV2AdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<PassengersDirectoryV2VO.PassengerV2VO, ItemPassengersDirectoryPassengerV2Binding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<PassengersDirectoryV2VO.PassengerV2VO, ItemPassengersDirectoryPassengerV2Binding> adapterDelegateViewBindingViewHolder, Function1<? super AtomAction, Unit> function1) {
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
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            PassengersDirectoryV2VO.PassengerV2VO item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<PassengersDirectoryV2VO.PassengerV2VO, ItemPassengersDirectoryPassengerV2Binding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            Function1<AtomAction, Unit> function1 = this.$actionHandler;
            PassengersDirectoryV2VO.PassengerV2VO passengerV2VO = item;
            TextAtomView fullNameTav = adapterDelegateViewBindingViewHolder.getBinding().fullNameTav;
            Intrinsics.checkNotNullExpressionValue(fullNameTav, "fullNameTav");
            TextAtomHolderKt.bind$default(fullNameTav, passengerV2VO.getFullName(), null, 2, null);
            TextAtomView personalInfoTAV = adapterDelegateViewBindingViewHolder.getBinding().personalInfoTAV;
            Intrinsics.checkNotNullExpressionValue(personalInfoTAV, "personalInfoTAV");
            TextAtomHolderKt.bind$default(personalInfoTAV, passengerV2VO.getPersonalInfo(), null, 2, null);
            SmallIconButtonView additionalActionsSIBV = adapterDelegateViewBindingViewHolder.getBinding().additionalActionsSIBV;
            Intrinsics.checkNotNullExpressionValue(additionalActionsSIBV, "additionalActionsSIBV");
            WrappedIconButtonHolderKt.bind(additionalActionsSIBV, passengerV2VO.getAdditionalActions(), function1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PassengersDirectoryV2AdapterDelegateKt$passengerV2AdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$actionHandler = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 function1, AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder, View view) {
        function1.invoke(((PassengersDirectoryV2VO.PassengerV2VO) adapterDelegateViewBindingViewHolder.getItem()).getAction());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<PassengersDirectoryV2VO.PassengerV2VO, ItemPassengersDirectoryPassengerV2Binding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<PassengersDirectoryV2VO.PassengerV2VO, ItemPassengersDirectoryPassengerV2Binding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ConstraintLayout constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        final Function1<AtomAction, Unit> function1 = this.$actionHandler;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PassengersDirectoryV2AdapterDelegateKt$passengerV2AdapterDelegate$2.invoke$lambda$0(Function1.this, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding, this.$actionHandler));
    }
}
