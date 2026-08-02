package ru.ozon.uni.components.indicator;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniIndicatorKt$UniIndicator$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ e $modifier;
    final /* synthetic */ UniIndicatorSize $size;
    final /* synthetic */ UniIndicatorStyle $styleType;
    final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniIndicatorKt$UniIndicator$2(e eVar, String str, AbstractC8972b abstractC8972b, UniIndicatorStyle uniIndicatorStyle, UniIndicatorSize uniIndicatorSize, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$text = str;
        this.$icon = abstractC8972b;
        this.$styleType = uniIndicatorStyle;
        this.$size = uniIndicatorSize;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        UniIndicatorKt.UniIndicator(this.$modifier, this.$text, this.$icon, this.$styleType, this.$size, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
