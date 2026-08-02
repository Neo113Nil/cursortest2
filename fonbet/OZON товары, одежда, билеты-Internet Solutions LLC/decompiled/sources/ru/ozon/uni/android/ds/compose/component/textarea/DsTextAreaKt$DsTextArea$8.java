package ru.ozon.uni.android.ds.compose.component.textarea;

import Q1.K;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class DsTextAreaKt$DsTextArea$8 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $hasBottomBar;
    final /* synthetic */ Function1<K, Unit> $internalOnValueChange;
    final /* synthetic */ Function0<Unit> $onClearButtonClicked;
    final /* synthetic */ DsTextAreaStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsTextAreaKt$DsTextArea$8(DsTextAreaStyle dsTextAreaStyle, boolean z11, Function1<? super K, Unit> function1, Function0<Unit> function0) {
        super(2);
        this.$style = dsTextAreaStyle;
        this.$hasBottomBar = z11;
        this.$internalOnValueChange = function1;
        this.$onClearButtonClicked = function0;
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
        AbstractC8972b icon = TokensExtKt.getIcon(UniTheme.INSTANCE.getIconTokens().getIc_m_cross_compact(), interfaceC3967k, UniIconToken.$stable);
        DsTextAreaStyle dsTextAreaStyle = this.$style;
        boolean z11 = this.$hasBottomBar;
        interfaceC3967k.o(-1539433509);
        boolean n11 = interfaceC3967k.n(this.$internalOnValueChange) | interfaceC3967k.n(this.$onClearButtonClicked);
        Function1<K, Unit> function1 = this.$internalOnValueChange;
        Function0<Unit> function0 = this.$onClearButtonClicked;
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new DsTextAreaKt$DsTextArea$8$1$1(function1, function0);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        DsTextAreaKt.ClickableIcon(icon, dsTextAreaStyle, z11, (Function0) C11, interfaceC3967k, 0);
    }
}
