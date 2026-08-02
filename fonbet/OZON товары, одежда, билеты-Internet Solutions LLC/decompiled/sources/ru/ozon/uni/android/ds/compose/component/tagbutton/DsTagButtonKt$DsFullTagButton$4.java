package ru.ozon.uni.android.ds.compose.component.tagbutton;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.component.image.ImageVO;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsTagButtonKt$DsFullTagButton$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $closable;
    final /* synthetic */ e $closeIconModifier;
    final /* synthetic */ q $closeInteractionSource;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ e $imageModifier;
    final /* synthetic */ ImageVO $imageVO;
    final /* synthetic */ InterfaceC6511n<DsTagButtonScope, InterfaceC3967k, Integer, Unit> $indicator;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ DsTagButtonSize $size;
    final /* synthetic */ DsTagButtonStyle $style;
    final /* synthetic */ String $text;
    final /* synthetic */ e $textModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsTagButtonKt$DsFullTagButton$4(e eVar, String str, e eVar2, AbstractC8972b abstractC8972b, e eVar3, ImageVO imageVO, e eVar4, InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, boolean z11, e eVar5, DsTagButtonSize dsTagButtonSize, DsTagButtonStyle dsTagButtonStyle, boolean z12, boolean z13, float f7, Function0<Unit> function0, Function0<Unit> function02, q qVar, q qVar2, int i11, int i12, int i13) {
        super(2);
        this.$modifier = eVar;
        this.$text = str;
        this.$textModifier = eVar2;
        this.$icon = abstractC8972b;
        this.$iconModifier = eVar3;
        this.$imageVO = imageVO;
        this.$imageModifier = eVar4;
        this.$indicator = interfaceC6511n;
        this.$closable = z11;
        this.$closeIconModifier = eVar5;
        this.$size = dsTagButtonSize;
        this.$style = dsTagButtonStyle;
        this.$selected = z12;
        this.$enabled = z13;
        this.$cornerRadius = f7;
        this.$onClick = function0;
        this.$onCloseClick = function02;
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
        DsTagButtonKt.m1808DsFullTagButtoncZC2P0Y(this.$modifier, this.$text, this.$textModifier, this.$icon, this.$iconModifier, this.$imageVO, this.$imageModifier, this.$indicator, this.$closable, this.$closeIconModifier, this.$size, this.$style, this.$selected, this.$enabled, this.$cornerRadius, this.$onClick, this.$onCloseClick, this.$interactionSource, this.$closeInteractionSource, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
