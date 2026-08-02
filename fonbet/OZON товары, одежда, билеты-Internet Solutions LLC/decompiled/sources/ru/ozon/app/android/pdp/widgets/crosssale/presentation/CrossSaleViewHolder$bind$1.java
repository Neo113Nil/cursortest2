package ru.ozon.app.android.pdp.widgets.crosssale.presentation;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.databinding.PdpWidgetCrossSaleItemBinding;
import ru.ozon.app.android.pdp.utils.CollectionsExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/PdpWidgetCrossSaleItemBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CrossSaleViewHolder$bind$1 extends AbstractC7737t implements Function1<PdpWidgetCrossSaleItemBinding, Unit> {
    final /* synthetic */ CrossSaleVO $item;
    final /* synthetic */ CrossSaleViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrossSaleViewHolder$bind$1(CrossSaleViewHolder crossSaleViewHolder, CrossSaleVO crossSaleVO) {
        super(1);
        this.this$0 = crossSaleViewHolder;
        this.$item = crossSaleVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetCrossSaleItemBinding pdpWidgetCrossSaleItemBinding) {
        invoke2(pdpWidgetCrossSaleItemBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpWidgetCrossSaleItemBinding binding) {
        boolean z11;
        View itemView;
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        this.this$0.item = this.$item;
        binding.titleTv.setText(this.$item.getTitle());
        binding.subtitleTv.setText(this.$item.getSubtitle());
        ImageView disclosureIv = binding.disclosureIv;
        Intrinsics.checkNotNullExpressionValue(disclosureIv, "disclosureIv");
        ViewExtKt.showOrGone(disclosureIv, Boolean.valueOf(this.$item.getDeeplink() != null));
        ConstraintLayout constraintLayout = binding.itemCrossaleCl;
        z11 = this.this$0.isSelect;
        constraintLayout.setBackground(z11 ? null : (this.$item.getSubitems() == null && this.$item.getDeeplink() == null) ? this.this$0.colorDrawable : this.this$0.rippleDrawable);
        ConstraintLayout itemCrossaleCl = binding.itemCrossaleCl;
        Intrinsics.checkNotNullExpressionValue(itemCrossaleCl, "itemCrossaleCl");
        Flow containerFlow = binding.containerFlow;
        Intrinsics.checkNotNullExpressionValue(containerFlow, "containerFlow");
        ru.ozon.app.android.pdp.view.ViewExtKt.cleanUpFlow(itemCrossaleCl, containerFlow);
        if (CollectionsExtKt.isNotNullOrEmpty(this.$item.getImages())) {
            List<String> images = this.$item.getImages();
            if (images == null) {
                images = K.f71697a;
            }
            List<String> list = images;
            CrossSaleViewHolder crossSaleViewHolder = this.this$0;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                itemView = crossSaleViewHolder.getItemView((String) it.next());
                arrayList.add(itemView);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                binding.itemCrossaleCl.addView((View) it2.next());
            }
            Flow flow = binding.containerFlow;
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((View) it3.next()).getId()));
            }
            flow.setReferencedIds(C7714v.T0(arrayList2));
        }
        OnBoardingDTO onboarding = this.$item.getOnboarding();
        if (onboarding != null) {
            this.this$0.onOnBoardingShow(onboarding);
        }
    }
}
