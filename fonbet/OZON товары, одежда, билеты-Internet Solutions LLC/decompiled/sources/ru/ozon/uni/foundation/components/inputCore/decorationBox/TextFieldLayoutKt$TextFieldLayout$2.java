package ru.ozon.uni.foundation.components.inputCore.decorationBox;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.InterfaceC9914x;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TextFieldLayoutKt$TextFieldLayout$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $label;
    final /* synthetic */ float $labelTopPadding;
    final /* synthetic */ e $modifier;
    final /* synthetic */ InterfaceC9914x $paddingValues;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $textField;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextFieldLayoutKt$TextFieldLayout$2(e eVar, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, boolean z11, float f7, InterfaceC9914x interfaceC9914x, float f11, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$textField = function2;
        this.$label = function22;
        this.$placeholder = function23;
        this.$singleLine = z11;
        this.$animationProgress = f7;
        this.$paddingValues = interfaceC9914x;
        this.$labelTopPadding = f11;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TextFieldLayoutKt.m3018TextFieldLayout1sJa4KU(this.$modifier, this.$textField, this.$label, this.$placeholder, this.$singleLine, this.$animationProgress, this.$paddingValues, this.$labelTopPadding, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
