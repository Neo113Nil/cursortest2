package ru.ozon.uni.ozi.components.inputs;

import Q1.X;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.ozi.components.button.OziIconButtonKt;
import ru.ozon.uni.ozi.components.button.presets.style.OziIconButtonStyle;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziInputKt$getFinalEndContent$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<String, Unit> $copyTextAction;
    final /* synthetic */ String $value;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziInputKt$getFinalEndContent$1(X x11, String str, Function1<? super String, Unit> function1) {
        super(2);
        this.$visualTransformation = x11;
        this.$value = str;
        this.$copyTextAction = function1;
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
        e oziTestTag = OziTestTagsKt.oziTestTag(e.f40358c0, OziInputTestTags.RightContent, null, interfaceC3967k, 54, 2);
        OziTheme.INSTANCE.getIcons();
        interfaceC3967k.B(1810476643);
        AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_copy_filled, "ic_m_copy_filled", interfaceC3967k, 48);
        interfaceC3967k.K();
        OziIconButtonStyle.NeutralTransparent neutralTransparent = OziIconButtonStyle.NeutralTransparent.INSTANCE;
        interfaceC3967k.o(-2018651673);
        boolean n11 = interfaceC3967k.n(this.$visualTransformation) | interfaceC3967k.n(this.$value) | interfaceC3967k.n(this.$copyTextAction);
        X x11 = this.$visualTransformation;
        String str = this.$value;
        Function1<String, Unit> function1 = this.$copyTextAction;
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new OziInputKt$getFinalEndContent$1$1$1(x11, str, function1);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        OziIconButtonKt.OziIconButton(uniPainterResource, (Function0) C11, oziTestTag, false, null, neutralTransparent, null, null, interfaceC3967k, 196608, 216);
    }
}
