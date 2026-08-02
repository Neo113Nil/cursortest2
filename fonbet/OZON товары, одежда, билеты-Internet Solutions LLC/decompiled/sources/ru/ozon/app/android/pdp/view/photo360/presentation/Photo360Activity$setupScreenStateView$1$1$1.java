package ru.ozon.app.android.pdp.view.photo360.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.databinding.PdpActivityPhoto360viewerBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Photo360Activity$setupScreenStateView$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ PdpActivityPhoto360viewerBinding $this_with;
    final /* synthetic */ Photo360Activity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360Activity$setupScreenStateView$1$1$1(Photo360Activity photo360Activity, PdpActivityPhoto360viewerBinding pdpActivityPhoto360viewerBinding) {
        super(0);
        this.this$0 = photo360Activity;
        this.$this_with = pdpActivityPhoto360viewerBinding;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Photo360ViewModel viewModel;
        viewModel = this.this$0.getViewModel();
        viewModel.loadInitialState(this.$this_with.imagePv.getWidth(), this.$this_with.imagePv.getHeight());
    }
}
