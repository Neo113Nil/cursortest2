package ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation.TravelInputViewIntent;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newText", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelInputContentKt$TravelInputContent$3$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ TravelInputViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelInputContentKt$TravelInputContent$3$1$1(TravelInputViewModel travelInputViewModel) {
        super(1);
        this.$viewModel = travelInputViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        this.$viewModel.onViewIntent(new TravelInputViewIntent.TextChanged(newText));
    }
}
