package ru.ozon.uni.android.ds.compose.component.input;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class DsInputBaseImplKt$getFinalEndContent$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $hasCopyButton;
    final /* synthetic */ DsInputBaseLocator $locators;
    final /* synthetic */ Function0<Unit> $onCopyClick;
    final /* synthetic */ InterfaceC9890C $this_getFinalEndContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsInputBaseImplKt$getFinalEndContent$2(DsInputBaseLocator dsInputBaseLocator, InterfaceC9890C interfaceC9890C, boolean z11, Function0<Unit> function0) {
        super(2);
        this.$locators = dsInputBaseLocator;
        this.$this_getFinalEndContent = interfaceC9890C;
        this.$hasCopyButton = z11;
        this.$onCopyClick = function0;
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
        UniIconToken ic_m_lock_closed_filled = uniTheme.getIconTokens().getIc_m_lock_closed_filled();
        e.a aVar = e.f40358c0;
        e testTag = AtomLocatorKt.testTag(aVar, this.$locators.getReadOnlyIcon().invoke());
        InterfaceC9890C interfaceC9890C = this.$this_getFinalEndContent;
        boolean z11 = this.$hasCopyButton;
        int i12 = UniIconToken.$stable;
        DsInputBaseImplKt.m1737IconSlotfWhpE4E(interfaceC9890C, ic_m_lock_closed_filled, testTag, 0L, null, z11, interfaceC3967k, i12 << 3, 12);
        if (this.$hasCopyButton) {
            DsInputBaseImplKt.m1737IconSlotfWhpE4E(this.$this_getFinalEndContent, uniTheme.getIconTokens().getIc_m_copy_filled(), AtomLocatorKt.testTag(aVar, this.$locators.getCopyButton().invoke()), 0L, this.$onCopyClick, false, interfaceC3967k, (i12 << 3) | 196608, 4);
        }
    }
}
