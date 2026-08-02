package ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.b2b.databinding.ItemTravelModalPersonalManagerAdvantageBinding;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation.TravelModalPersonalManagerVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/TravelModalPersonalManagerVO$AdvantageVO;", "Lru/ozon/app/android/travel/feature/b2b/databinding/ItemTravelModalPersonalManagerAdvantageBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TravelModalPersonalManagerAdvantageAdapterDelegateKt$travelModalPersonalManagerAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TravelModalPersonalManagerVO.AdvantageVO, ItemTravelModalPersonalManagerAdvantageBinding>, Unit> {
    public static final TravelModalPersonalManagerAdvantageAdapterDelegateKt$travelModalPersonalManagerAdapterDelegate$2 INSTANCE = new TravelModalPersonalManagerAdvantageAdapterDelegateKt$travelModalPersonalManagerAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation.adapter.TravelModalPersonalManagerAdvantageAdapterDelegateKt$travelModalPersonalManagerAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelModalPersonalManagerVO.AdvantageVO, ItemTravelModalPersonalManagerAdvantageBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<TravelModalPersonalManagerVO.AdvantageVO, ItemTravelModalPersonalManagerAdvantageBinding> adapterDelegateViewBindingViewHolder) {
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
            TravelModalPersonalManagerVO.AdvantageVO item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<TravelModalPersonalManagerVO.AdvantageVO, ItemTravelModalPersonalManagerAdvantageBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            TravelModalPersonalManagerVO.AdvantageVO advantageVO = item;
            TextAtomView travelModalPersonalTextTAV = adapterDelegateViewBindingViewHolder.getBinding().travelModalPersonalTextTAV;
            Intrinsics.checkNotNullExpressionValue(travelModalPersonalTextTAV, "travelModalPersonalTextTAV");
            TextAtomHolderKt.bind$default(travelModalPersonalTextTAV, advantageVO.getText(), null, 2, null);
            StyleParser styleParser = StyleParser.INSTANCE;
            Integer parseTextStyle = styleParser.parseTextStyle(advantageVO.getText().getTextStyle());
            if (parseTextStyle != null) {
                adapterDelegateViewBindingViewHolder.getBinding().travelModalPersonalBulletTV.setTextAppearance(parseTextStyle.intValue());
            }
            Integer parseColor = styleParser.parseColor(adapterDelegateViewBindingViewHolder.getContext(), advantageVO.getText().getTextColor());
            if (parseColor != null) {
                adapterDelegateViewBindingViewHolder.getBinding().travelModalPersonalBulletTV.setTextColor(parseColor.intValue());
            }
        }
    }

    TravelModalPersonalManagerAdvantageAdapterDelegateKt$travelModalPersonalManagerAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TravelModalPersonalManagerVO.AdvantageVO, ItemTravelModalPersonalManagerAdvantageBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<TravelModalPersonalManagerVO.AdvantageVO, ItemTravelModalPersonalManagerAdvantageBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding));
    }
}
