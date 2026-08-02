package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import n0.d0;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class VerticalScrollbarKt$VerticalScrollbar$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ d0 $scrollState;
    final /* synthetic */ VerticalScrollbarStyle $scrollbarStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerticalScrollbarKt$VerticalScrollbar$2(VerticalScrollbarStyle verticalScrollbarStyle, d0 d0Var, int i11) {
        super(2);
        this.$scrollbarStyle = verticalScrollbarStyle;
        this.$scrollState = d0Var;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VerticalScrollbarKt.VerticalScrollbar(this.$scrollbarStyle, this.$scrollState, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
