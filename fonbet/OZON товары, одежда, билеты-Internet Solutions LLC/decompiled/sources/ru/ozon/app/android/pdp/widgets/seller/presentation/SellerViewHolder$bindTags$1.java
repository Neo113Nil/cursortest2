package ru.ozon.app.android.pdp.widgets.seller.presentation;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.databinding.PdpWidgetSellerBinding;
import ru.ozon.app.android.seller.sellerTag.presentation.SellerTagVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/PdpWidgetSellerBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerViewHolder$bindTags$1 extends AbstractC7737t implements Function1<PdpWidgetSellerBinding, Unit> {
    final /* synthetic */ List<SellerTagVO> $tags;
    final /* synthetic */ SellerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerViewHolder$bindTags$1(List<SellerTagVO> list, SellerViewHolder sellerViewHolder) {
        super(1);
        this.$tags = list;
        this.this$0 = sellerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetSellerBinding pdpWidgetSellerBinding) {
        invoke2(pdpWidgetSellerBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpWidgetSellerBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        List<SellerTagVO> list = this.$tags;
        if (list == null) {
            RecyclerView tagsRv = binding.tagsRv;
            Intrinsics.checkNotNullExpressionValue(tagsRv, "tagsRv");
            ViewExtKt.gone(tagsRv);
        } else {
            this.this$0.tagsAdapter.submitList(list);
            RecyclerView tagsRv2 = binding.tagsRv;
            Intrinsics.checkNotNullExpressionValue(tagsRv2, "tagsRv");
            ViewExtKt.show(tagsRv2);
        }
    }
}
