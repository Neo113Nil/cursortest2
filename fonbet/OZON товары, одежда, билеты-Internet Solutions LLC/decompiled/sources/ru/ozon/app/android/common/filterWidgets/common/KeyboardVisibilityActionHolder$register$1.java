package ru.ozon.app.android.common.filterWidgets.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class KeyboardVisibilityActionHolder$register$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ Function2<Boolean, DelayedKeyboardVisibilityAction, Unit> $onVisibilityChanged;
    final /* synthetic */ KeyboardVisibilityActionHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    KeyboardVisibilityActionHolder$register$1(KeyboardVisibilityActionHolder keyboardVisibilityActionHolder, Function2<? super Boolean, ? super DelayedKeyboardVisibilityAction, Unit> function2) {
        super(1);
        this.this$0 = keyboardVisibilityActionHolder;
        this.$onVisibilityChanged = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        DelayedKeyboardVisibilityAction delayedKeyboardVisibilityAction;
        delayedKeyboardVisibilityAction = this.this$0.delayedAction;
        if (delayedKeyboardVisibilityAction != null) {
            Function2<Boolean, DelayedKeyboardVisibilityAction, Unit> function2 = this.$onVisibilityChanged;
            KeyboardVisibilityActionHolder keyboardVisibilityActionHolder = this.this$0;
            function2.invoke(Boolean.valueOf(z11), delayedKeyboardVisibilityAction);
            keyboardVisibilityActionHolder.delayedAction = null;
        }
    }
}
