package ru.ozon.uni.android.ds.compose.component.tabs;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsTabsAtomKt$TabRow$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TabsDTO.TabDTO $dto;
    final /* synthetic */ long $titleColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsTabsAtomKt$TabRow$3(TabsDTO.TabDTO tabDTO, long j11, int i11) {
        super(2);
        this.$dto = tabDTO;
        this.$titleColor = j11;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsTabsAtomKt.m1791TabRowRPmYEkk(this.$dto, this.$titleColor, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
