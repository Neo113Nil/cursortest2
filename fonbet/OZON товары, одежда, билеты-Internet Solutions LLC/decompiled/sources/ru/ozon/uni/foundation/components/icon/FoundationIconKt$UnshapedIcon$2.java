package ru.ozon.uni.foundation.components.icon;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import l1.C7807Z;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationIconKt$UnshapedIcon$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AbstractC7799Q $brush;
    final /* synthetic */ C7807Z $color;
    final /* synthetic */ float $contentSize;
    final /* synthetic */ e $graphicModifier;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ boolean $isLabel;
    final /* synthetic */ e $labelModifier;
    final /* synthetic */ e $modifier;
    final /* synthetic */ T $style;
    final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationIconKt$UnshapedIcon$2(e eVar, boolean z11, AbstractC8972b abstractC8972b, C7807Z c7807z, AbstractC7799Q abstractC7799Q, String str, T t2, e eVar2, e eVar3, float f7, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$isLabel = z11;
        this.$icon = abstractC8972b;
        this.$color = c7807z;
        this.$brush = abstractC7799Q;
        this.$text = str;
        this.$style = t2;
        this.$graphicModifier = eVar2;
        this.$labelModifier = eVar3;
        this.$contentSize = f7;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationIconKt.m2993UnshapedIcondE3IV7s(this.$modifier, this.$isLabel, this.$icon, this.$color, this.$brush, this.$text, this.$style, this.$graphicModifier, this.$labelModifier, this.$contentSize, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
