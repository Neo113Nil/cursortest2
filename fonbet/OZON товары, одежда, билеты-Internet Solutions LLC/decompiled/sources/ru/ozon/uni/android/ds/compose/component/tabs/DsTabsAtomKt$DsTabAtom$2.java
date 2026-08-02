package ru.ozon.uni.android.ds.compose.component.tabs;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsTabsAtomKt$DsTabAtom$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ TabsDTO.TabDTO $dto;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onSelect;
    final /* synthetic */ boolean $roundCorners;
    final /* synthetic */ boolean $showSubtitle;
    final /* synthetic */ DsTabsStyle $style;
    final /* synthetic */ TabsDTO.Style $styleType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsTabsAtomKt$DsTabAtom$2(TabsDTO.TabDTO tabDTO, TabsDTO.Style style, Function0<Unit> function0, boolean z11, e eVar, DsTabsStyle dsTabsStyle, boolean z12, boolean z13, int i11, int i12) {
        super(2);
        this.$dto = tabDTO;
        this.$styleType = style;
        this.$onSelect = function0;
        this.$roundCorners = z11;
        this.$modifier = eVar;
        this.$style = dsTabsStyle;
        this.$isSelected = z12;
        this.$showSubtitle = z13;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsTabsAtomKt.DsTabAtom(this.$dto, this.$styleType, this.$onSelect, this.$roundCorners, this.$modifier, this.$style, this.$isSelected, this.$showSubtitle, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
