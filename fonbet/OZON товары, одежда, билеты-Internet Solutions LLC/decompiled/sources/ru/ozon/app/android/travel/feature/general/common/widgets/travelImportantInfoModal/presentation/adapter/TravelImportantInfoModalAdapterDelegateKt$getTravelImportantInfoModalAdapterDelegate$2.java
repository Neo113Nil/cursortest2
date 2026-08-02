package ru.ozon.app.android.travel.feature.general.common.widgets.travelImportantInfoModal.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.general.common.databinding.ItemTravelImportantInfoBinding;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelImportantInfoModal.presentation.TravelImportantInfoModalVO;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelImportantInfoModal/presentation/TravelImportantInfoModalVO$InfoVO;", "Lru/ozon/app/android/travel/feature/general/common/databinding/ItemTravelImportantInfoBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelImportantInfoModalAdapterDelegateKt$getTravelImportantInfoModalAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TravelImportantInfoModalVO.InfoVO, ItemTravelImportantInfoBinding>, Unit> {
    public static final TravelImportantInfoModalAdapterDelegateKt$getTravelImportantInfoModalAdapterDelegate$2 INSTANCE = new TravelImportantInfoModalAdapterDelegateKt$getTravelImportantInfoModalAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.travelImportantInfoModal.presentation.adapter.TravelImportantInfoModalAdapterDelegateKt$getTravelImportantInfoModalAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelImportantInfoModalVO.InfoVO, ItemTravelImportantInfoBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<TravelImportantInfoModalVO.InfoVO, ItemTravelImportantInfoBinding> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TextAtomView titleImportantInfoModalTAV = this.$this_adapterDelegateViewBinding.getBinding().titleImportantInfoModalTAV;
            Intrinsics.checkNotNullExpressionValue(titleImportantInfoModalTAV, "titleImportantInfoModalTAV");
            TextAtomHolderKt.bind$default(titleImportantInfoModalTAV, this.$this_adapterDelegateViewBinding.getItem().getTitle(), null, 2, null);
            TextAtomView bodyImportantInfoModalTAV = this.$this_adapterDelegateViewBinding.getBinding().bodyImportantInfoModalTAV;
            Intrinsics.checkNotNullExpressionValue(bodyImportantInfoModalTAV, "bodyImportantInfoModalTAV");
            TextAtomHolderKt.bind$default(bodyImportantInfoModalTAV, this.$this_adapterDelegateViewBinding.getItem().getBody(), null, 2, null);
        }
    }

    TravelImportantInfoModalAdapterDelegateKt$getTravelImportantInfoModalAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TravelImportantInfoModalVO.InfoVO, ItemTravelImportantInfoBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<TravelImportantInfoModalVO.InfoVO, ItemTravelImportantInfoBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding));
    }
}
