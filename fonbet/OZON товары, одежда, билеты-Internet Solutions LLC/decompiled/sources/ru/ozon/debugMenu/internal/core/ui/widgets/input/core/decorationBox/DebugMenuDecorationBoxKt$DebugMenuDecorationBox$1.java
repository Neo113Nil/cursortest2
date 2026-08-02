package ru.ozon.debugMenu.internal.core.ui.widgets.input.core.decorationBox;

import K1.T;
import Q1.X;
import S0.InterfaceC3967k;
import a1.C4912a;
import a1.c;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import t0.o;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "innerTextField", "invoke", "(Lkotlin/jvm/functions/Function2;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuDecorationBoxKt$DebugMenuDecorationBox$1 extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ InterfaceC9914x $contentPadding;
    final /* synthetic */ o $interactionSource;
    final /* synthetic */ String $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ T $labelTextStyle;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ String $value;
    final /* synthetic */ T $valueTextStyle;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugMenuDecorationBoxKt$DebugMenuDecorationBox$1(String str, String str2, String str3, X x11, o oVar, InterfaceC9914x interfaceC9914x, long j11, T t2, T t11) {
        super(3);
        this.$label = str;
        this.$placeholder = str2;
        this.$value = str3;
        this.$visualTransformation = x11;
        this.$interactionSource = oVar;
        this.$contentPadding = interfaceC9914x;
        this.$labelColor = j11;
        this.$labelTextStyle = t2;
        this.$valueTextStyle = t11;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> function2, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke((Function2<? super InterfaceC3967k, ? super Integer, Unit>) function2, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(Function2<? super InterfaceC3967k, ? super Integer, Unit> innerTextField, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3967k.F(innerTextField) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        String str = this.$label;
        interfaceC3967k.o(195603027);
        C4912a c11 = str == null ? null : c.c(1447809416, new DebugMenuDecorationBoxKt$DebugMenuDecorationBox$1$1$1(this.$label, this.$labelColor, this.$labelTextStyle), interfaceC3967k);
        interfaceC3967k.k();
        String str2 = this.$placeholder;
        interfaceC3967k.o(195612121);
        C4912a c12 = str2 != null ? c.c(544004232, new DebugMenuDecorationBoxKt$DebugMenuDecorationBox$1$2$1(this.$placeholder, this.$labelColor, this.$valueTextStyle), interfaceC3967k) : null;
        interfaceC3967k.k();
        TextFieldImplKt.CommonDecorationBox(this.$value, innerTextField, this.$visualTransformation, c11, c12, true, this.$interactionSource, this.$contentPadding, interfaceC3967k, 196608 | ((i12 << 3) & 112), 0);
    }
}
