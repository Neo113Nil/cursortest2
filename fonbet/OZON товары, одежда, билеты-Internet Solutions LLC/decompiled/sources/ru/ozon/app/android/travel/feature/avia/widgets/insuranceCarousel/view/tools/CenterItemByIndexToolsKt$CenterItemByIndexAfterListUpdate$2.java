package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view.tools;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselViewModelAction;
import v0.I;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class CenterItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $index;
    final /* synthetic */ int $itemWidthPx;
    final /* synthetic */ int $lastSelectedIndex;
    final /* synthetic */ Function1<InsuranceCarouselViewModelAction, Unit> $onAction;
    final /* synthetic */ I $this_CenterItemByIndexAfterListUpdate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CenterItemByIndexToolsKt$CenterItemByIndexAfterListUpdate$2(I i11, int i12, int i13, int i14, Function1<? super InsuranceCarouselViewModelAction, Unit> function1, int i15) {
        super(2);
        this.$this_CenterItemByIndexAfterListUpdate = i11;
        this.$index = i12;
        this.$lastSelectedIndex = i13;
        this.$itemWidthPx = i14;
        this.$onAction = function1;
        this.$$changed = i15;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CenterItemByIndexToolsKt.CenterItemByIndexAfterListUpdate(this.$this_CenterItemByIndexAfterListUpdate, this.$index, this.$lastSelectedIndex, this.$itemWidthPx, this.$onAction, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
