package ru.ozon.app.android.pdpoldwidgets.widgets.caption.presentation;

import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetCaptionBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetCaptionBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CaptionViewHolder$bind$1 extends AbstractC7737t implements Function1<PdpWidgetCaptionBinding, Unit> {
    final /* synthetic */ CaptionVO $item;
    final /* synthetic */ CaptionViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptionViewHolder$bind$1(CaptionVO captionVO, CaptionViewHolder captionViewHolder) {
        super(1);
        this.$item = captionVO;
        this.this$0 = captionViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetCaptionBinding pdpWidgetCaptionBinding) {
        invoke2(pdpWidgetCaptionBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpWidgetCaptionBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        binding.pdpCaptionTitleTv.setText(this.$item.getText());
        this.this$0.itemView.setBackgroundColor(this.$item.getBackgroundColor());
        ImageView pdpCaptionImageIv = binding.pdpCaptionImageIv;
        Intrinsics.checkNotNullExpressionValue(pdpCaptionImageIv, "pdpCaptionImageIv");
        ImageViewExtKt.loadImageOrGone(pdpCaptionImageIv, this.$item.getImage());
        ImageView chevronIv = binding.chevronIv;
        Intrinsics.checkNotNullExpressionValue(chevronIv, "chevronIv");
        ViewExtKt.showOrGone(chevronIv, Boolean.valueOf(this.$item.getAction() != null));
    }
}
