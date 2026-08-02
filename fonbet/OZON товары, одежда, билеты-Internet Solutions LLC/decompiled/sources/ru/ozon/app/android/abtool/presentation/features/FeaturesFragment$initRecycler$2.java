package ru.ozon.app.android.abtool.presentation.features;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.abtool.presentation.AbToggleViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "id", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FeaturesFragment$initRecycler$2 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ FeaturesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeaturesFragment$initRecycler$2(FeaturesFragment featuresFragment) {
        super(1);
        this.this$0 = featuresFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String id2) {
        AbToggleViewModel viewModel;
        Intrinsics.checkNotNullParameter(id2, "id");
        viewModel = this.this$0.getViewModel();
        viewModel.resetLocal(id2);
    }
}
