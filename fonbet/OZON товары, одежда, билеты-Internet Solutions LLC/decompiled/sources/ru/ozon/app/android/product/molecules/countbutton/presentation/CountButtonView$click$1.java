package ru.ozon.app.android.product.molecules.countbutton.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CountButtonView$click$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ CountButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CountButtonView$click$1(CountButtonView countButtonView) {
        super(1);
        this.this$0 = countButtonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        boolean z11;
        CountButtonViewModel viewModel;
        DisposableActionHandler disposableActionHandler;
        Intrinsics.checkNotNullParameter(it, "it");
        z11 = this.this$0.isHapticEnabled;
        if (z11) {
            HapticVibrator.INSTANCE.vibrate(this.this$0, HapticToken.SOFT);
        }
        viewModel = this.this$0.getViewModel();
        disposableActionHandler = this.this$0.actionHandler;
        viewModel.onButtonClicked(disposableActionHandler);
    }
}
