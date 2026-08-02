package ru.ozon.app.android.returns.compose;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.actionModal.presentation.viewObject.ReturnActionModalVO;
import ru.ozon.app.android.returns.ui.data.components.Component;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "text", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnActionModalComposableKt$ComponentsItem$1$1$2$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ ReturnActionModalVO.ActionComponent $actionComponent;
    final /* synthetic */ InterfaceC3978p0<String> $inputText$delegate;
    final /* synthetic */ Function2<Component, String, Unit> $onTextEntered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReturnActionModalComposableKt$ComponentsItem$1$1$2$1(Function2<? super Component, ? super String, Unit> function2, ReturnActionModalVO.ActionComponent actionComponent, InterfaceC3978p0<String> interfaceC3978p0) {
        super(1);
        this.$onTextEntered = function2;
        this.$actionComponent = actionComponent;
        this.$inputText$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.$inputText$delegate.setValue(text);
        this.$onTextEntered.invoke(this.$actionComponent.getComponent(), text);
    }
}
