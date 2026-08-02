package ru.ozon.uni.android.ds.compose.component.selectionControls.toggle;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.selectionControls.ToggleSize;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class DsToggleKt$DsToggle$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;
    final /* synthetic */ ToggleSize $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsToggleKt$DsToggle$2(e eVar, boolean z11, boolean z12, ToggleSize toggleSize, Function1<? super Boolean, Unit> function1, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$isSelected = z11;
        this.$isEnabled = z12;
        this.$size = toggleSize;
        this.$onCheckedChange = function1;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsToggleKt.DsToggle(this.$modifier, this.$isSelected, this.$isEnabled, this.$size, this.$onCheckedChange, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
