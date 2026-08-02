package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components;

import K1.K;
import S0.InterfaceC3972m0;
import Z1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LZ1/d;", "Lkotlin/Function0;", "LK1/K;", "textLayoutStateProvider", "", "invoke", "(LZ1/d;Lkotlin/jvm/functions/Function0;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CustomizableTextInputKt$CustomizableTextInput$2$3$1 extends AbstractC7737t implements Function2<d, Function0<? extends K>, Unit> {
    final /* synthetic */ InterfaceC3972m0 $lineCount$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomizableTextInputKt$CustomizableTextInput$2$3$1(InterfaceC3972m0 interfaceC3972m0) {
        super(2);
        this.$lineCount$delegate = interfaceC3972m0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(d dVar, Function0<? extends K> function0) {
        invoke2(dVar, (Function0<K>) function0);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d BasicTextField, Function0<K> textLayoutStateProvider) {
        Intrinsics.checkNotNullParameter(BasicTextField, "$this$BasicTextField");
        Intrinsics.checkNotNullParameter(textLayoutStateProvider, "textLayoutStateProvider");
        K invoke = textLayoutStateProvider.invoke();
        if (invoke != null) {
            this.$lineCount$delegate.d(invoke.m());
        }
    }
}
