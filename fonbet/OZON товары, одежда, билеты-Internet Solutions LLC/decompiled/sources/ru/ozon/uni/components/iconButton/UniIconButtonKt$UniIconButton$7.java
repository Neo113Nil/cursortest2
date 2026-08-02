package ru.ozon.uni.components.iconButton;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import n0.C8391l;
import q1.AbstractC8972b;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniIconButtonKt$UniIconButton$7 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8391l $border;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isHoverEnabled;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ boolean $isRounded;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ UniIconButtonResizing $resizing;
    final /* synthetic */ UniIconButtonSize $size;
    final /* synthetic */ UniIconButtonStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniIconButtonKt$UniIconButton$7(AbstractC8972b abstractC8972b, UniIconButtonStyle uniIconButtonStyle, UniIconButtonSize uniIconButtonSize, e eVar, UniIconButtonResizing uniIconButtonResizing, C8391l c8391l, boolean z11, boolean z12, boolean z13, boolean z14, Function0<Unit> function0, q qVar, int i11, int i12, int i13) {
        super(2);
        this.$icon = abstractC8972b;
        this.$style = uniIconButtonStyle;
        this.$size = uniIconButtonSize;
        this.$modifier = eVar;
        this.$resizing = uniIconButtonResizing;
        this.$border = c8391l;
        this.$isLoading = z11;
        this.$isEnabled = z12;
        this.$isRounded = z13;
        this.$isHoverEnabled = z14;
        this.$onClick = function0;
        this.$interactionSource = qVar;
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
        UniIconButtonKt.UniIconButton(this.$icon, this.$style, this.$size, this.$modifier, this.$resizing, this.$border, this.$isLoading, this.$isEnabled, this.$isRounded, this.$isHoverEnabled, this.$onClick, this.$interactionSource, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
