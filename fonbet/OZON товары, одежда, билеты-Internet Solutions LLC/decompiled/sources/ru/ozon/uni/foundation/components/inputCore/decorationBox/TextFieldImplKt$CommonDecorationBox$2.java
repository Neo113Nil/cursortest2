package ru.ozon.uni.foundation.components.inputCore.decorationBox;

import Bl0.C2652m;
import Q1.X;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import t0.o;
import u0.InterfaceC9914x;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class TextFieldImplKt$CommonDecorationBox$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC9914x $contentPadding;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $innerTextField;
    final /* synthetic */ o $interactionSource;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $label;
    final /* synthetic */ float $labelTopPadding;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ String $value;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextFieldImplKt$CommonDecorationBox$2(String str, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, X x11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, boolean z11, o oVar, InterfaceC9914x interfaceC9914x, float f7, int i11, int i12) {
        super(2);
        this.$value = str;
        this.$innerTextField = function2;
        this.$visualTransformation = x11;
        this.$label = function22;
        this.$placeholder = function23;
        this.$singleLine = z11;
        this.$interactionSource = oVar;
        this.$contentPadding = interfaceC9914x;
        this.$labelTopPadding = f7;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TextFieldImplKt.m3017CommonDecorationBoxeKw1uXw(this.$value, this.$innerTextField, this.$visualTransformation, this.$label, this.$placeholder, this.$singleLine, this.$interactionSource, this.$contentPadding, this.$labelTopPadding, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
