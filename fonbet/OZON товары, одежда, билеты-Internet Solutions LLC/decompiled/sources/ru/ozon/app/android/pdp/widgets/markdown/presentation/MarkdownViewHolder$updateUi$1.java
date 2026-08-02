package ru.ozon.app.android.pdp.widgets.markdown.presentation;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.databinding.PdpWidgetMarkdownBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/PdpWidgetMarkdownBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MarkdownViewHolder$updateUi$1 extends AbstractC7737t implements Function1<PdpWidgetMarkdownBinding, Unit> {
    final /* synthetic */ MarkdownViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownViewHolder$updateUi$1(MarkdownViewHolder markdownViewHolder) {
        super(1);
        this.this$0 = markdownViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetMarkdownBinding pdpWidgetMarkdownBinding) {
        invoke2(pdpWidgetMarkdownBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpWidgetMarkdownBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        MarkdownVO markdownVO = this.this$0.item;
        if (markdownVO != null) {
            MarkdownViewHolder markdownViewHolder = this.this$0;
            OzonSpannableString description = markdownVO.getDescription();
            if ((description == null || description.length() == 0) && markdownVO.getCharacteristics().isEmpty()) {
                TextView markdownDescriptionTv = binding.markdownDescriptionTv;
                Intrinsics.checkNotNullExpressionValue(markdownDescriptionTv, "markdownDescriptionTv");
                ViewExtKt.show(markdownDescriptionTv);
            }
            RecyclerView characteristicsRv = binding.characteristicsRv;
            Intrinsics.checkNotNullExpressionValue(characteristicsRv, "characteristicsRv");
            ViewExtKt.showOrGone(characteristicsRv, Boolean.valueOf(!markdownVO.getCharacteristics().isEmpty()));
            OzonSpannableString description2 = markdownVO.getDescription();
            if (description2 != null && description2.length() != 0) {
                binding.markdownDescriptionTv.setText(markdownVO.getDescription());
                TextView markdownDescriptionTv2 = binding.markdownDescriptionTv;
                Intrinsics.checkNotNullExpressionValue(markdownDescriptionTv2, "markdownDescriptionTv");
                ViewExtKt.show(markdownDescriptionTv2);
            }
            markdownViewHolder.characteristicsAdapter.submitList(markdownVO.getCharacteristics());
        }
    }
}
