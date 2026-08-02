package ru.ozon.uni.android.ds.compose.component.button;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.J0;
import q1.AbstractC8972b;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsIconButtonKt$DsIconButton$6 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $containerModifier;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $hoverDisabled;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $loader;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ J0 $shape;
    final /* synthetic */ DsIconButtonStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsIconButtonKt$DsIconButton$6(AbstractC8972b abstractC8972b, DsIconButtonStyle dsIconButtonStyle, J0 j02, e eVar, e eVar2, e eVar3, boolean z11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z12, q qVar, Function0<Unit> function0, int i11, int i12, int i13) {
        super(2);
        this.$icon = abstractC8972b;
        this.$style = dsIconButtonStyle;
        this.$shape = j02;
        this.$modifier = eVar;
        this.$iconModifier = eVar2;
        this.$containerModifier = eVar3;
        this.$enabled = z11;
        this.$loader = function2;
        this.$hoverDisabled = z12;
        this.$interactionSource = qVar;
        this.$onClick = function0;
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
        DsIconButtonKt.DsIconButton(this.$icon, this.$style, this.$shape, this.$modifier, this.$iconModifier, this.$containerModifier, this.$enabled, this.$loader, this.$hoverDisabled, this.$interactionSource, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
