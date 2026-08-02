package ru.ozon.debugMenu.internal.core.ui.widgets.toggle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DebugMenuToggleKt$DebugMenuToggle$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ boolean $isToggled;
    final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebugMenuToggleKt$DebugMenuToggle$2$1(Function1<? super Boolean, Unit> function1, boolean z11) {
        super(0);
        this.$onCheckedChange = function1;
        this.$isToggled = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1<Boolean, Unit> function1 = this.$onCheckedChange;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this.$isToggled));
        }
    }
}
