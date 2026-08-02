package ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation;

import S0.InterfaceC3967k;
import WZ.l;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation.BenefitListVO;
import v0.InterfaceC10165e;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv0/e;", "", "it", "", "invoke", "(Lv0/e;ILS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
public final class BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1$invoke$$inlined$items$default$4 extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1 $actionHandler$inlined;
    final /* synthetic */ float $badgesHeight$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ l $tokenizedAnalytics$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1$invoke$$inlined$items$default$4(List list, float f7, Function1 function1, l lVar) {
        super(4);
        this.$items = list;
        this.$badgesHeight$inlined = f7;
        this.$actionHandler$inlined = function1;
        this.$tokenizedAnalytics$inlined = lVar;
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
        BenefitListVO.Badge badge = (BenefitListVO.Badge) this.$items.get(i11);
        interfaceC3967k.o(142201271);
        e x11 = a0.x(a0.f(e.f40358c0, this.$badgesHeight$inlined), null, 3);
        interfaceC3967k.o(-1796522493);
        boolean n11 = interfaceC3967k.n(this.$actionHandler$inlined) | interfaceC3967k.F(this.$tokenizedAnalytics$inlined);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1$2$1$1(this.$actionHandler$inlined, this.$tokenizedAnalytics$inlined);
            interfaceC3967k.x(C11);
        }
        Function2 function2 = (Function2) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-1796516322);
        boolean F11 = interfaceC3967k.F(this.$tokenizedAnalytics$inlined);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1$2$2$1(this.$tokenizedAnalytics$inlined);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        BenefitLabelKt.m760BenefitLabelFJfuzF0(x11, badge, function2, (Function1) C12, 0.0f, interfaceC3967k, 0, 16);
        interfaceC3967k.k();
    }
}
