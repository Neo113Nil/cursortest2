package ru.ozon.uni.android.ds.compose.component.tagbutton;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsTagButtonKt$DsLoaderTagButton$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ DsTagButtonSize $size;
    final /* synthetic */ DsTagButtonStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsTagButtonKt$DsLoaderTagButton$4(e eVar, DsTagButtonSize dsTagButtonSize, DsTagButtonStyle dsTagButtonStyle, float f7, boolean z11, Function0<Unit> function0, q qVar, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$size = dsTagButtonSize;
        this.$style = dsTagButtonStyle;
        this.$cornerRadius = f7;
        this.$selected = z11;
        this.$onClick = function0;
        this.$interactionSource = qVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsTagButtonKt.m1809DsLoaderTagButtonb7W0Lw(this.$modifier, this.$size, this.$style, this.$cornerRadius, this.$selected, this.$onClick, this.$interactionSource, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
