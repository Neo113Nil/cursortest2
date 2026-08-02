package ru.ozon.app.android.pdp.widgets.selectCrossSale.presentation;

import A0.h;
import Ej.b;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import fd.InterfaceC6512o;
import i1.C6988h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import u0.EnumC9909s;
import u0.InterfaceC9894c;
import v0.InterfaceC10165e;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv0/e;", "", "it", "", "invoke", "(Lv0/e;ILS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
public final class SelectCrossSaleWidgetKt$SelectCrossSaleContent$1$2$1$invoke$$inlined$itemsIndexed$default$3 extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1 $actionHandler$inlined;
    final /* synthetic */ InterfaceC9894c $boxScope$inlined;
    final /* synthetic */ float $horizontalPadding$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ SelectCrossSaleVI $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCrossSaleWidgetKt$SelectCrossSaleContent$1$2$1$invoke$$inlined$itemsIndexed$default$3(List list, SelectCrossSaleVI selectCrossSaleVI, InterfaceC9894c interfaceC9894c, float f7, Function1 function1) {
        super(4);
        this.$items = list;
        this.$state$inlined = selectCrossSaleVI;
        this.$boxScope$inlined = interfaceC9894c;
        this.$horizontalPadding$inlined = f7;
        this.$actionHandler$inlined = function1;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        invoke(interfaceC10165e, num.intValue(), interfaceC3967k, num2.intValue());
        return Unit.f71690a;
    }

    public final void invoke(@NotNull InterfaceC10165e interfaceC10165e, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        String a11;
        CornerRadius cornerRadius;
        TestInfo testInfo;
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
        CellDTO cellDTO = (CellDTO) this.$items.get(i11);
        interfaceC3967k.o(1410157663);
        float f7 = i11 == C7714v.P(this.$state$inlined.getCells()) ? 0 : 16;
        e.a aVar = e.f40358c0;
        CommonControlSettings common = cellDTO.getCommon();
        if (common == null || (testInfo = common.getTestInfo()) == null || (a11 = testInfo.getAutomatizationId()) == null) {
            a11 = b.a(i11, "DsCellAtom_");
        }
        e a12 = Q1.a(aVar, a11);
        CellDTO.Settings settings = cellDTO.getSettings();
        DsCellAtomKt.DsCellAtom(cellDTO, M.c(a0.t(C6988h.a(a12, h.b((settings == null || (cornerRadius = settings.getCornerRadius()) == null) ? 0 : cornerRadius.m1866getDpD9Ej5fM())), 0.0f, (this.$boxScope$inlined.d() - f7) - (this.$horizontalPadding$inlined * 2), 1), EnumC9909s.Max), this.$actionHandler$inlined, interfaceC3967k, CellDTO.$stable, 0);
        interfaceC3967k.k();
    }
}
