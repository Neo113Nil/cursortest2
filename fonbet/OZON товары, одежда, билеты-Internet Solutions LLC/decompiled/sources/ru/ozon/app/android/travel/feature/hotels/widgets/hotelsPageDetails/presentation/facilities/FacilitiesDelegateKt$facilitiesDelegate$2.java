package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.facilities;

import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsPageDetailsCharacteristicBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.HotelsPageDetailsVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$FacilitiesVO;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsPageDetailsCharacteristicBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FacilitiesDelegateKt$facilitiesDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<HotelsPageDetailsVO.FacilitiesVO, ItemHotelsPageDetailsCharacteristicBinding>, Unit> {
    public static final FacilitiesDelegateKt$facilitiesDelegate$2 INSTANCE = new FacilitiesDelegateKt$facilitiesDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.facilities.FacilitiesDelegateKt$facilitiesDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AppCompatTextView $characteristicNameTv;
        final /* synthetic */ AppCompatTextView $characteristicValueTv;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<HotelsPageDetailsVO.FacilitiesVO, ItemHotelsPageDetailsCharacteristicBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AppCompatTextView appCompatTextView, AdapterDelegateViewBindingViewHolder<HotelsPageDetailsVO.FacilitiesVO, ItemHotelsPageDetailsCharacteristicBinding> adapterDelegateViewBindingViewHolder, AppCompatTextView appCompatTextView2) {
            super(1);
            this.$characteristicNameTv = appCompatTextView;
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$characteristicValueTv = appCompatTextView2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$characteristicNameTv.setText(this.$this_adapterDelegateViewBinding.getItem().getKey());
            this.$characteristicValueTv.setText(this.$this_adapterDelegateViewBinding.getItem().getValue());
        }
    }

    FacilitiesDelegateKt$facilitiesDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<HotelsPageDetailsVO.FacilitiesVO, ItemHotelsPageDetailsCharacteristicBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<HotelsPageDetailsVO.FacilitiesVO, ItemHotelsPageDetailsCharacteristicBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        AppCompatTextView characteristicNameTv = adapterDelegateViewBinding.getBinding().characteristicNameTv;
        Intrinsics.checkNotNullExpressionValue(characteristicNameTv, "characteristicNameTv");
        AppCompatTextView characteristicValueTv = adapterDelegateViewBinding.getBinding().characteristicValueTv;
        Intrinsics.checkNotNullExpressionValue(characteristicValueTv, "characteristicValueTv");
        adapterDelegateViewBinding.bind(new AnonymousClass1(characteristicNameTv, adapterDelegateViewBinding, characteristicValueTv));
    }
}
