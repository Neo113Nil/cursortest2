package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemInsurancePanelBenefitBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.InsurancePanelVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$BenefitVO;", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemInsurancePanelBenefitBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class InsurancePanelBenefitAdapterDelegateKt$insurancePanelBenefitAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<InsurancePanelVO.BenefitVO, ItemInsurancePanelBenefitBinding>, Unit> {
    final /* synthetic */ ConstraintLayout $clickHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter.InsurancePanelBenefitAdapterDelegateKt$insurancePanelBenefitAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<InsurancePanelVO.BenefitVO, ItemInsurancePanelBenefitBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<InsurancePanelVO.BenefitVO, ItemInsurancePanelBenefitBinding> adapterDelegateViewBindingViewHolder) {
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
            InsurancePanelVO.BenefitVO item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<InsurancePanelVO.BenefitVO, ItemInsurancePanelBenefitBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            InsurancePanelVO.BenefitVO benefitVO = item;
            ImageView statusIconIV = adapterDelegateViewBindingViewHolder.getBinding().statusIconIV;
            Intrinsics.checkNotNullExpressionValue(statusIconIV, "statusIconIV");
            ImageViewExtKt.load$default(statusIconIV, benefitVO.getStatusIcon().getImage(), null, null, null, null, false, null, 126, null);
            ImageView statusIconIV2 = adapterDelegateViewBindingViewHolder.getBinding().statusIconIV;
            Intrinsics.checkNotNullExpressionValue(statusIconIV2, "statusIconIV");
            ThemeExtKt.tint(statusIconIV2, StyleParser.INSTANCE.parseColor(adapterDelegateViewBindingViewHolder.getContext(), benefitVO.getStatusIcon().getTintColor()));
            TextAtomView titleTAV = adapterDelegateViewBindingViewHolder.getBinding().titleTAV;
            Intrinsics.checkNotNullExpressionValue(titleTAV, "titleTAV");
            TextAtomHolderKt.bind$default(titleTAV, benefitVO.getTitle(), null, 2, null);
            TextAtomView subtitleTAV = adapterDelegateViewBindingViewHolder.getBinding().subtitleTAV;
            Intrinsics.checkNotNullExpressionValue(subtitleTAV, "subtitleTAV");
            TextAtomHolderKt.bindOrGone$default(subtitleTAV, benefitVO.getSubtitle(), null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InsurancePanelBenefitAdapterDelegateKt$insurancePanelBenefitAdapterDelegate$2(ConstraintLayout constraintLayout) {
        super(1);
        this.$clickHandler = constraintLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<InsurancePanelVO.BenefitVO, ItemInsurancePanelBenefitBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<InsurancePanelVO.BenefitVO, ItemInsurancePanelBenefitBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ConstraintLayout constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        final ConstraintLayout constraintLayout2 = this.$clickHandler;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConstraintLayout.this.callOnClick();
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding));
    }
}
