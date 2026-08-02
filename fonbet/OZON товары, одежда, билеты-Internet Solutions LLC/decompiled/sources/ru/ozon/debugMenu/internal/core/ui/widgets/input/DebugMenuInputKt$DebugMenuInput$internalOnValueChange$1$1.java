package ru.ozon.debugMenu.internal.core.ui.widgets.input;

import Q1.K;
import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ1/K;", "newTextFieldValueState", "", "invoke", "(LQ1/K;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuInputKt$DebugMenuInput$internalOnValueChange$1$1 extends AbstractC7737t implements Function1<K, Unit> {
    final /* synthetic */ InterfaceC3978p0<String> $lastTextValue$delegate;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ InterfaceC3978p0<K> $textFieldValueState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebugMenuInputKt$DebugMenuInput$internalOnValueChange$1$1(Function1<? super String, Unit> function1, InterfaceC3978p0<K> interfaceC3978p0, InterfaceC3978p0<String> interfaceC3978p02) {
        super(1);
        this.$onValueChange = function1;
        this.$textFieldValueState$delegate = interfaceC3978p0;
        this.$lastTextValue$delegate = interfaceC3978p02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(K k11) {
        invoke2(k11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(K newTextFieldValueState) {
        String DebugMenuInput$lambda$11;
        Intrinsics.checkNotNullParameter(newTextFieldValueState, "newTextFieldValueState");
        this.$textFieldValueState$delegate.setValue(newTextFieldValueState);
        DebugMenuInput$lambda$11 = DebugMenuInputKt.DebugMenuInput$lambda$11(this.$lastTextValue$delegate);
        boolean d11 = Intrinsics.d(DebugMenuInput$lambda$11, newTextFieldValueState.f());
        this.$lastTextValue$delegate.setValue(newTextFieldValueState.f());
        if (d11) {
            return;
        }
        this.$onValueChange.invoke(newTextFieldValueState.f());
    }
}
