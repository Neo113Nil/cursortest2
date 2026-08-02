package ru.ozon.debugMenu.internal.core.ui.widgets.text;

import Bl0.C2652m;
import K1.K;
import K1.T;
import P1.A;
import P1.AbstractC3809p;
import P1.F;
import S0.InterfaceC3967k;
import V1.h;
import V1.i;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TextKt$Text$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ AbstractC3809p $fontFamily;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ A $fontStyle;
    final /* synthetic */ F $fontWeight;
    final /* synthetic */ long $letterSpacing;
    final /* synthetic */ long $lineHeight;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<K, Unit> $onTextLayout;
    final /* synthetic */ int $overflow;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ T $style;
    final /* synthetic */ String $text;
    final /* synthetic */ h $textAlign;
    final /* synthetic */ i $textDecoration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextKt$Text$2(String str, e eVar, long j11, long j12, A a11, F f7, AbstractC3809p abstractC3809p, long j13, i iVar, h hVar, long j14, int i11, boolean z11, int i12, int i13, Function1<? super K, Unit> function1, T t2, int i14, int i15, int i16) {
        super(2);
        this.$text = str;
        this.$modifier = eVar;
        this.$color = j11;
        this.$fontSize = j12;
        this.$fontStyle = a11;
        this.$fontWeight = f7;
        this.$fontFamily = abstractC3809p;
        this.$letterSpacing = j13;
        this.$textDecoration = iVar;
        this.$textAlign = hVar;
        this.$lineHeight = j14;
        this.$overflow = i11;
        this.$softWrap = z11;
        this.$maxLines = i12;
        this.$minLines = i13;
        this.$onTextLayout = function1;
        this.$style = t2;
        this.$$changed = i14;
        this.$$changed1 = i15;
        this.$$default = i16;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TextKt.m1643Text4IGK_g(this.$text, this.$modifier, this.$color, this.$fontSize, this.$fontStyle, this.$fontWeight, this.$fontFamily, this.$letterSpacing, this.$textDecoration, this.$textAlign, this.$lineHeight, this.$overflow, this.$softWrap, this.$maxLines, this.$minLines, this.$onTextLayout, this.$style, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
