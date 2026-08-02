package ru.ozon.uni.ozi.components.button;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.ozi.components.button.presets.size.OziButtonSize;
import ru.ozon.uni.ozi.components.button.presets.style.OziButtonStyle;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziButtonKt$OziButtonImpl$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ OziButtonResizing $resizing;
    final /* synthetic */ OziButtonSize $size;
    final /* synthetic */ OziButtonStyle $style;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziButtonKt$OziButtonImpl$3(e eVar, String str, String str2, AbstractC8972b abstractC8972b, boolean z11, OziButtonResizing oziButtonResizing, boolean z12, OziButtonStyle oziButtonStyle, OziButtonSize oziButtonSize, q qVar, Function0<Unit> function0, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$title = str;
        this.$subtitle = str2;
        this.$icon = abstractC8972b;
        this.$enabled = z11;
        this.$resizing = oziButtonResizing;
        this.$isLoading = z12;
        this.$style = oziButtonStyle;
        this.$size = oziButtonSize;
        this.$interactionSource = qVar;
        this.$onClick = function0;
        this.$$changed = i11;
        this.$$changed1 = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziButtonKt.OziButtonImpl(this.$modifier, this.$title, this.$subtitle, this.$icon, this.$enabled, this.$resizing, this.$isLoading, this.$style, this.$size, this.$interactionSource, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1));
    }
}
