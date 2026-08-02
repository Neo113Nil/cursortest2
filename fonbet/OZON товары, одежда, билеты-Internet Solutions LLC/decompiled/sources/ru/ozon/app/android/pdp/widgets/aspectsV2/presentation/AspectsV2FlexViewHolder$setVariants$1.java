package ru.ozon.app.android.pdp.widgets.aspectsV2.presentation;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsV2LayoutFlexBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsV2LayoutFlexBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsV2FlexViewHolder$setVariants$1 extends AbstractC7737t implements Function1<WidgetAspectsV2LayoutFlexBinding, Unit> {
    final /* synthetic */ List<AspectsCompactVO$Variant> $variants;
    final /* synthetic */ AspectsV2FlexViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AspectsV2FlexViewHolder$setVariants$1(List<? extends AspectsCompactVO$Variant> list, AspectsV2FlexViewHolder aspectsV2FlexViewHolder) {
        super(1);
        this.$variants = list;
        this.this$0 = aspectsV2FlexViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WidgetAspectsV2LayoutFlexBinding widgetAspectsV2LayoutFlexBinding) {
        invoke2(widgetAspectsV2LayoutFlexBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WidgetAspectsV2LayoutFlexBinding binding) {
        AspectV2FlexAdapter aspectV2FlexAdapter;
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        List<AspectsCompactVO$Variant> list = this.$variants;
        if (list == null || list.isEmpty()) {
            RecyclerView variantsFl = binding.variantsFl;
            Intrinsics.checkNotNullExpressionValue(variantsFl, "variantsFl");
            ViewExtKt.gone(variantsFl);
        } else {
            RecyclerView variantsFl2 = binding.variantsFl;
            Intrinsics.checkNotNullExpressionValue(variantsFl2, "variantsFl");
            ViewExtKt.show(variantsFl2);
            aspectV2FlexAdapter = this.this$0.adapter;
            aspectV2FlexAdapter.submitList(this.$variants);
        }
    }
}
