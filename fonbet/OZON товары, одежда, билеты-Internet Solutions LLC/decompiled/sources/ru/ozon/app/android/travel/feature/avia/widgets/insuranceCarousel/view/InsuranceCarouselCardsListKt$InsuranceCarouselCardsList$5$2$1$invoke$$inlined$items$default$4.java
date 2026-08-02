package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselVI;
import v0.InterfaceC10165e;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv0/e;", "", "it", "", "invoke", "(Lv0/e;ILS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
public final class InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$2$1$invoke$$inlined$items$default$4 extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1 $actionHandler$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ float $maxHeight$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$2$1$invoke$$inlined$items$default$4(List list, float f7, Function1 function1) {
        super(4);
        this.$items = list;
        this.$maxHeight$inlined = f7;
        this.$actionHandler$inlined = function1;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        invoke(interfaceC10165e, num.intValue(), interfaceC3967k, num2.intValue());
        return Unit.f71690a;
    }

    public final void invoke(@NotNull InterfaceC10165e interfaceC10165e, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        if ((i12 & 6) == 0) {
            i13 = (interfaceC3967k.n(interfaceC10165e) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= interfaceC3967k.r(i11) ? 32 : 16;
        }
        if ((i13 & 147) == 146 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        InsuranceCarouselVI.InsuranceCarouselCardVI insuranceCarouselCardVI = (InsuranceCarouselVI.InsuranceCarouselCardVI) this.$items.get(i11);
        interfaceC3967k.o(138422909);
        InsuranceCarouselCardKt.InsuranceCarouselCard(a0.f(a0.r(e.f40358c0, 220), this.$maxHeight$inlined), insuranceCarouselCardVI, this.$actionHandler$inlined, interfaceC3967k, 0, 0);
        interfaceC3967k.k();
    }
}
