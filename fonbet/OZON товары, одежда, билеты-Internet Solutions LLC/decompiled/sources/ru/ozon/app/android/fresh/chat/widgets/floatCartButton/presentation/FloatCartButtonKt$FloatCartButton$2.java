package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FloatCartButtonKt$FloatCartButton$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $buttonCornerRadius;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ IconDTO $iconAtom;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ float $spaceBetween;
    final /* synthetic */ TextDTO $textAtom;
    final /* synthetic */ float $verticalPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatCartButtonKt$FloatCartButton$2(e eVar, IconDTO iconDTO, TextDTO textDTO, long j11, float f7, float f11, float f12, float f13, Function0<Unit> function0, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$iconAtom = iconDTO;
        this.$textAtom = textDTO;
        this.$backgroundColor = j11;
        this.$buttonCornerRadius = f7;
        this.$verticalPadding = f11;
        this.$horizontalPadding = f12;
        this.$spaceBetween = f13;
        this.$onClick = function0;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FloatCartButtonKt.m708FloatCartButton2FlEJow(this.$modifier, this.$iconAtom, this.$textAtom, this.$backgroundColor, this.$buttonCornerRadius, this.$verticalPadding, this.$horizontalPadding, this.$spaceBetween, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
