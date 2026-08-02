package ru.ozon.uni.android.input.textinput.domain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "uiState", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OzonTextInputLayoutDelegate$stateConfigurator$1 extends AbstractC7737t implements Function1<OzonTextInputUIModel, Unit> {
    final /* synthetic */ OzonTextInputLayoutDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonTextInputLayoutDelegate$stateConfigurator$1(OzonTextInputLayoutDelegate ozonTextInputLayoutDelegate) {
        super(1);
        this.this$0 = ozonTextInputLayoutDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OzonTextInputUIModel ozonTextInputUIModel) {
        invoke2(ozonTextInputUIModel);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OzonTextInputUIModel uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.this$0.configureOffset(uiState);
        this.this$0.configureInput(uiState);
        this.this$0.configureLabel(uiState);
        this.this$0.configureStrokeBG(uiState);
        this.this$0.setActionButtons(uiState);
        this.this$0.currentState = uiState;
    }
}
