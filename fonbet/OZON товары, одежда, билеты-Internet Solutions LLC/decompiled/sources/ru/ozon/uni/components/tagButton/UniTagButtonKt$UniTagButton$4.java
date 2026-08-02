package ru.ozon.uni.components.tagButton;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniTagButtonKt$UniTagButton$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $closable;
    final /* synthetic */ q $closeInteractionSource;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $image;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $indicator;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ boolean $rounded;
    final /* synthetic */ UniTagButtonSize $size;
    final /* synthetic */ UniTagButtonState $state;
    final /* synthetic */ UniTagButtonStyle $style;
    final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UniTagButtonKt$UniTagButton$4(e eVar, String str, Function0<Unit> function0, Function0<Unit> function02, AbstractC8972b abstractC8972b, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, UniTagButtonState uniTagButtonState, UniTagButtonStyle uniTagButtonStyle, UniTagButtonSize uniTagButtonSize, boolean z11, boolean z12, q qVar, q qVar2, int i11, int i12, int i13) {
        super(2);
        this.$modifier = eVar;
        this.$text = str;
        this.$onClick = function0;
        this.$onCloseClick = function02;
        this.$icon = abstractC8972b;
        this.$image = function2;
        this.$indicator = function22;
        this.$state = uniTagButtonState;
        this.$style = uniTagButtonStyle;
        this.$size = uniTagButtonSize;
        this.$closable = z11;
        this.$rounded = z12;
        this.$interactionSource = qVar;
        this.$closeInteractionSource = qVar2;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        UniTagButtonKt.UniTagButton(this.$modifier, this.$text, this.$onClick, this.$onCloseClick, this.$icon, this.$image, this.$indicator, this.$state, this.$style, this.$size, this.$closable, this.$rounded, this.$interactionSource, this.$closeInteractionSource, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
