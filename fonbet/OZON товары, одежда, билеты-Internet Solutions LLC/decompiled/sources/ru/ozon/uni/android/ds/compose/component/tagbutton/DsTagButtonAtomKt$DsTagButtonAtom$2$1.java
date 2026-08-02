package ru.ozon.uni.android.ds.compose.component.tagbutton;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonScope;", "", "invoke", "(Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonScope;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class DsTagButtonAtomKt$DsTagButtonAtom$2$1 extends AbstractC7737t implements InterfaceC6511n<DsTagButtonScope, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ IndicatorDTO $indicatorDto;
    final /* synthetic */ DsTagButtonLocator $locator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsTagButtonAtomKt$DsTagButtonAtom$2$1(IndicatorDTO indicatorDTO, DsTagButtonLocator dsTagButtonLocator) {
        super(3);
        this.$indicatorDto = indicatorDTO;
        this.$locator = dsTagButtonLocator;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(DsTagButtonScope dsTagButtonScope, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(dsTagButtonScope, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(DsTagButtonScope let, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(let, "$this$let");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(let) ? 4 : 2;
        }
        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            DsTagButtonAtomKt.IndicatorAtom(let, this.$indicatorDto, AtomLocatorKt.testTag(e.f40358c0, this.$locator.getIndicator().invoke()), interfaceC3967k, i11 & 14, 0);
        }
    }
}
