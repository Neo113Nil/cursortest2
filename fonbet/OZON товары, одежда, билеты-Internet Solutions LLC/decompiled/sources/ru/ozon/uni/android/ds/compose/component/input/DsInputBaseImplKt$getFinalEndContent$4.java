package ru.ozon.uni.android.ds.compose.component.input;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class DsInputBaseImplKt$getFinalEndContent$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ DsInputBaseLocator $locators;
    final /* synthetic */ InterfaceC9890C $this_getFinalEndContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsInputBaseImplKt$getFinalEndContent$4(DsInputBaseLocator dsInputBaseLocator, InterfaceC9890C interfaceC9890C) {
        super(2);
        this.$locators = dsInputBaseLocator;
        this.$this_getFinalEndContent = interfaceC9890C;
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
        UniTheme uniTheme = UniTheme.INSTANCE;
        UniIconToken ic_m_danger_filled = uniTheme.getIconTokens().getIc_m_danger_filled();
        long graphicNegativePrimary = uniTheme.getColors(interfaceC3967k, UniTheme.$stable).getGraphicNegativePrimary();
        DsInputBaseImplKt.m1737IconSlotfWhpE4E(this.$this_getFinalEndContent, ic_m_danger_filled, AtomLocatorKt.testTag(e.f40358c0, this.$locators.getErrorIcon().invoke()), graphicNegativePrimary, null, false, interfaceC3967k, UniIconToken.$stable << 3, 24);
    }
}
