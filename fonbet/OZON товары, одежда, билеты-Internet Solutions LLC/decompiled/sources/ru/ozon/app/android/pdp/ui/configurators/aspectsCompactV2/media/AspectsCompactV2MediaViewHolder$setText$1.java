package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.media;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsCompactV2MediaLayoutBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2MediaLayoutBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsCompactV2MediaViewHolder$setText$1 extends AbstractC7737t implements Function1<WidgetAspectsCompactV2MediaLayoutBinding, Unit> {
    final /* synthetic */ AspectsCompactMediaVariantV2VO $this_setText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsCompactV2MediaViewHolder$setText$1(AspectsCompactMediaVariantV2VO aspectsCompactMediaVariantV2VO) {
        super(1);
        this.$this_setText = aspectsCompactMediaVariantV2VO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WidgetAspectsCompactV2MediaLayoutBinding widgetAspectsCompactV2MediaLayoutBinding) {
        invoke2(widgetAspectsCompactV2MediaLayoutBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WidgetAspectsCompactV2MediaLayoutBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        TextAtomV2View titleTav = binding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bindOrGone$default(titleTav, this.$this_setText.getText(), null, 2, null);
        TextAtomV2View subtitleTav = binding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextHolderKt.bindOrGone$default(subtitleTav, this.$this_setText.getSubtitle(), null, 2, null);
        if (this.$this_setText.getIsAvailable()) {
            return;
        }
        binding.titleTav.setAlpha(this.$this_setText.isNotAvailableTextAlpha());
        binding.subtitleTav.setAlpha(this.$this_setText.isNotAvailableTextAlpha());
    }
}
