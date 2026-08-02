package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.input;

import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.general.booking.databinding.ItemTravelAddNewPassengerFormV2BirthCertificateBinding;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$BirthCertificateCommonInputVO;", "Lru/ozon/app/android/travel/feature/general/booking/databinding/ItemTravelAddNewPassengerFormV2BirthCertificateBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BirthCertificateAdapterDelegateKt$birthCertificateAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<CommonInputVO.BirthCertificateCommonInputVO, ItemTravelAddNewPassengerFormV2BirthCertificateBinding>, Unit> {
    final /* synthetic */ Function1<Long, Unit> $onSelectorClicked;
    final /* synthetic */ InterfaceC6511n<Long, String, CharSequence, Unit> $onTextInputChanged;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.input.BirthCertificateAdapterDelegateKt$birthCertificateAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
        final /* synthetic */ InterfaceC6511n<Long, String, CharSequence, Unit> $onTextInputChanged;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<CommonInputVO.BirthCertificateCommonInputVO, ItemTravelAddNewPassengerFormV2BirthCertificateBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> interfaceC6511n, AdapterDelegateViewBindingViewHolder<CommonInputVO.BirthCertificateCommonInputVO, ItemTravelAddNewPassengerFormV2BirthCertificateBinding> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$onTextInputChanged = interfaceC6511n;
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            this.$onTextInputChanged.invoke(Long.valueOf(this.$this_adapterDelegateViewBinding.getItem().getSeriesTextInput().getId()), this.$this_adapterDelegateViewBinding.getItem().getValue(), charSequence);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payload", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.input.BirthCertificateAdapterDelegateKt$birthCertificateAdapterDelegate$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<Long, Unit> $onSelectorClicked;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<CommonInputVO.BirthCertificateCommonInputVO, ItemTravelAddNewPassengerFormV2BirthCertificateBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(AdapterDelegateViewBindingViewHolder<CommonInputVO.BirthCertificateCommonInputVO, ItemTravelAddNewPassengerFormV2BirthCertificateBinding> adapterDelegateViewBindingViewHolder, Function1<? super Long, Unit> function1) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onSelectorClicked = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.contains(InputPayload.BIRTH_CERTIFICATE_SERIES_TEXT_ERROR)) {
                this.$this_adapterDelegateViewBinding.getBinding().seriesTextInputView.bindError(this.$this_adapterDelegateViewBinding.getItem().getSeriesTextInput());
            } else if (payload.contains(InputPayload.BIRTH_CERTIFICATE_SERIES_SELECTOR)) {
                this.$this_adapterDelegateViewBinding.getBinding().seriesSelectorInputView.bind(this.$this_adapterDelegateViewBinding.getItem().getSeriesSelector(), this.$onSelectorClicked);
            } else {
                this.$this_adapterDelegateViewBinding.getBinding().seriesSelectorInputView.bind(this.$this_adapterDelegateViewBinding.getItem().getSeriesSelector(), this.$onSelectorClicked);
                CommonTextInputView.bind$default(this.$this_adapterDelegateViewBinding.getBinding().seriesTextInputView, this.$this_adapterDelegateViewBinding.getItem().getSeriesTextInput(), false, 2, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BirthCertificateAdapterDelegateKt$birthCertificateAdapterDelegate$2(InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> interfaceC6511n, Function1<? super Long, Unit> function1) {
        super(1);
        this.$onTextInputChanged = interfaceC6511n;
        this.$onSelectorClicked = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<CommonInputVO.BirthCertificateCommonInputVO, ItemTravelAddNewPassengerFormV2BirthCertificateBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<CommonInputVO.BirthCertificateCommonInputVO, ItemTravelAddNewPassengerFormV2BirthCertificateBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.getBinding().seriesTextInputView.setTextWatcher(new DebouncedTextWatcher(0L, null, new AnonymousClass1(this.$onTextInputChanged, adapterDelegateViewBinding), 3, null));
        adapterDelegateViewBinding.bind(new AnonymousClass3(adapterDelegateViewBinding, this.$onSelectorClicked));
    }
}
