package ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.adapter;

import Cm.e;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemServicePackSelectionV3Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.data.ServicePackSelectionV3DTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$Benefit;", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemServicePackSelectionV3Binding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ServicePackSelectionV3AdapterDelegateKt$servicePackSelectionV3AdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<ServicePackSelectionV3DTO.Benefit, ItemServicePackSelectionV3Binding>, Unit> {
    public static final ServicePackSelectionV3AdapterDelegateKt$servicePackSelectionV3AdapterDelegate$2 INSTANCE = new ServicePackSelectionV3AdapterDelegateKt$servicePackSelectionV3AdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.adapter.ServicePackSelectionV3AdapterDelegateKt$servicePackSelectionV3AdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<ServicePackSelectionV3DTO.Benefit, ItemServicePackSelectionV3Binding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<ServicePackSelectionV3DTO.Benefit, ItemServicePackSelectionV3Binding> adapterDelegateViewBindingViewHolder) {
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
            ImageView statusIconIV = this.$this_adapterDelegateViewBinding.getBinding().statusIconIV;
            Intrinsics.checkNotNullExpressionValue(statusIconIV, "statusIconIV");
            ImageViewExtKt.load$default(statusIconIV, this.$this_adapterDelegateViewBinding.getItem().getStatusIcon().getImage(), null, null, null, null, false, null, 126, null);
            ImageView statusIconIV2 = this.$this_adapterDelegateViewBinding.getBinding().statusIconIV;
            Intrinsics.checkNotNullExpressionValue(statusIconIV2, "statusIconIV");
            StyleParser styleParser = StyleParser.INSTANCE;
            ThemeExtKt.tint(statusIconIV2, styleParser.parseColor(this.$this_adapterDelegateViewBinding.getContext(), this.$this_adapterDelegateViewBinding.getItem().getStatusIcon().getTintColor()));
            TextAtomView descriptionTAV = this.$this_adapterDelegateViewBinding.getBinding().descriptionTAV;
            Intrinsics.checkNotNullExpressionValue(descriptionTAV, "descriptionTAV");
            TextAtomHolderKt.bind$default(descriptionTAV, this.$this_adapterDelegateViewBinding.getItem().getDescription(), null, 2, null);
            View separatorV = this.$this_adapterDelegateViewBinding.getBinding().separatorV;
            Intrinsics.checkNotNullExpressionValue(separatorV, "separatorV");
            separatorV.setVisibility(this.$this_adapterDelegateViewBinding.getItem().isSeparatorHidden() ? 8 : 0);
            Icon darkBenefitIcon = ThemeExtKt.isDarkThemeActive(this.$this_adapterDelegateViewBinding.getContext()) ? this.$this_adapterDelegateViewBinding.getItem().getDarkBenefitIcon() : this.$this_adapterDelegateViewBinding.getItem().getBenefitIcon();
            ImageView imageView = this.$this_adapterDelegateViewBinding.getBinding().benefitIconIV;
            Intrinsics.f(imageView);
            ImageViewExtKt.loadImageOrGone(imageView, darkBenefitIcon != null ? darkBenefitIcon.getImage() : null);
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(imageView, styleParser.parseColor(context, darkBenefitIcon != null ? darkBenefitIcon.getTintColor() : null));
            ConstraintLayout constraintLayout = this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            AdapterDelegateViewBindingViewHolder<ServicePackSelectionV3DTO.Benefit, ItemServicePackSelectionV3Binding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            d b11 = e.b(constraintLayout);
            b11.s(adapterDelegateViewBindingViewHolder.getBinding().descriptionTAV.getId(), 7, darkBenefitIcon != null ? adapterDelegateViewBindingViewHolder.getBinding().guidelineG.getId() : 0, 7);
            b11.f(constraintLayout);
        }
    }

    ServicePackSelectionV3AdapterDelegateKt$servicePackSelectionV3AdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<ServicePackSelectionV3DTO.Benefit, ItemServicePackSelectionV3Binding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<ServicePackSelectionV3DTO.Benefit, ItemServicePackSelectionV3Binding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding));
    }
}
