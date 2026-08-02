package ru.ozon.app.android.pdp.widgets.aspectsV2.presentation;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.databinding.WidgetAspectsV2LayoutBinding;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.AspectsDecorFactory;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsAdapter;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/WidgetAspectsV2LayoutBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsV2BaseViewHolder$setVariants$1 extends AbstractC7737t implements Function1<WidgetAspectsV2LayoutBinding, Unit> {
    final /* synthetic */ List<AspectsCompactVO$Variant> $variants;
    final /* synthetic */ AspectsV2BaseViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AspectsV2BaseViewHolder$setVariants$1(List<? extends AspectsCompactVO$Variant> list, AspectsV2BaseViewHolder aspectsV2BaseViewHolder) {
        super(1);
        this.$variants = list;
        this.this$0 = aspectsV2BaseViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WidgetAspectsV2LayoutBinding widgetAspectsV2LayoutBinding) {
        invoke2(widgetAspectsV2LayoutBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WidgetAspectsV2LayoutBinding binding) {
        AspectsDecorFactory aspectsDecorFactory;
        VariantsAdapter variantsAdapter;
        VariantsAdapter variantsAdapter2;
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        List<AspectsCompactVO$Variant> list = this.$variants;
        if (list == null || list.isEmpty()) {
            RecyclerView variantsRv = binding.variantsRv;
            Intrinsics.checkNotNullExpressionValue(variantsRv, "variantsRv");
            ViewExtKt.gone(variantsRv);
            return;
        }
        aspectsDecorFactory = this.this$0.aspectsDecorFactory;
        RecyclerView variantsRv2 = binding.variantsRv;
        Intrinsics.checkNotNullExpressionValue(variantsRv2, "variantsRv");
        aspectsDecorFactory.adjustPadding(variantsRv2, this.$variants);
        variantsAdapter = this.this$0.variantsAdapter;
        boolean z11 = variantsAdapter.getShimmersCount() == 0;
        variantsAdapter2 = this.this$0.variantsAdapter;
        variantsAdapter2.submitList(this.$variants);
        if (z11) {
            this.this$0.scrollToSelected();
            RecyclerView variantsRv3 = binding.variantsRv;
            Intrinsics.checkNotNullExpressionValue(variantsRv3, "variantsRv");
            ViewExtKt.show(variantsRv3);
        }
    }
}
