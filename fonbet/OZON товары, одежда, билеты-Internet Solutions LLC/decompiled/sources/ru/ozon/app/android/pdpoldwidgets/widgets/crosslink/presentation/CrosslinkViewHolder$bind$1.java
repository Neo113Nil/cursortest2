package ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetCrosslinkBinding;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetCrosslinkBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CrosslinkViewHolder$bind$1 extends AbstractC7737t implements Function1<PdpWidgetCrosslinkBinding, Unit> {
    final /* synthetic */ d $info;
    final /* synthetic */ CrosslinkVO $item;
    final /* synthetic */ CrosslinkViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrosslinkViewHolder$bind$1(CrosslinkViewHolder crosslinkViewHolder, CrosslinkVO crosslinkVO, d dVar) {
        super(1);
        this.this$0 = crosslinkViewHolder;
        this.$item = crosslinkVO;
        this.$info = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetCrosslinkBinding pdpWidgetCrosslinkBinding) {
        invoke2(pdpWidgetCrosslinkBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpWidgetCrosslinkBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        this.this$0.item = this.$item;
        this.this$0.widgetInfo = this.$info;
        binding.brandTv.setText(this.$item.getTitle());
        binding.brandTv.setEnabled(!h.K(this.$item.getDeeplink()));
    }
}
