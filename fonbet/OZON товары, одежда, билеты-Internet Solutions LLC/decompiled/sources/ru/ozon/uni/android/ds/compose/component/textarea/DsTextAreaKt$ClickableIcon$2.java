package ru.ozon.uni.android.ds.compose.component.textarea;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsTextAreaKt$ClickableIcon$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $hasBottomBar;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ DsTextAreaStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsTextAreaKt$ClickableIcon$2(AbstractC8972b abstractC8972b, DsTextAreaStyle dsTextAreaStyle, boolean z11, Function0<Unit> function0, int i11) {
        super(2);
        this.$icon = abstractC8972b;
        this.$style = dsTextAreaStyle;
        this.$hasBottomBar = z11;
        this.$onClick = function0;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsTextAreaKt.ClickableIcon(this.$icon, this.$style, this.$hasBottomBar, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
