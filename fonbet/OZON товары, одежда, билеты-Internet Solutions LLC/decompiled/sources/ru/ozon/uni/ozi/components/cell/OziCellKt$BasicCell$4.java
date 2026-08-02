package ru.ozon.uni.ozi.components.cell;

import P9.a;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.foundation.components.button.FoundationSeparatorKt;
import ru.ozon.uni.ozi.components.separator.OziSeparatorTestTags;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziCellKt$BasicCell$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ float $separatorThickness;
    final /* synthetic */ boolean $showSeparator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziCellKt$BasicCell$4(boolean z11, float f7) {
        super(2);
        this.$showSeparator = z11;
        this.$separatorThickness = f7;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        if (this.$showSeparator) {
            e oziTestTag = OziTestTagsKt.oziTestTag(e.f40358c0, OziCellTestTags.Separator, null, interfaceC3967k, 54, 2);
            a.b(oziTestTag, "separator");
            long graphicNeutralTransparent = OziTheme.INSTANCE.getColors(interfaceC3967k, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getGraphicNeutralTransparent();
            float f7 = this.$separatorThickness;
            interfaceC3967k.o(1766179876);
            FoundationSeparatorKt.m2985FoundationSeparatoraMcp0Q(OziTestTagsKt.oziTestTag(oziTestTag, OziSeparatorTestTags.Container, null, interfaceC3967k, 48, 2), graphicNeutralTransparent, f7, false, interfaceC3967k, 0);
            interfaceC3967k.k();
        }
    }
}
