package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.domain.EdoProvidersV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class EdoProvidersV2ComposableKt$CustomCellContent$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $badgeListBetweenPadding;
    final /* synthetic */ EdoProvidersV2VO.CustomCell $customCell;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<AtomAction, Unit> $onAtomAction;
    final /* synthetic */ float $textBetweenPadding;
    final /* synthetic */ float $verticalPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EdoProvidersV2ComposableKt$CustomCellContent$2(EdoProvidersV2VO.CustomCell customCell, Function1<? super AtomAction, Unit> function1, float f7, float f11, float f12, float f13, e eVar, int i11, int i12) {
        super(2);
        this.$customCell = customCell;
        this.$onAtomAction = function1;
        this.$horizontalPadding = f7;
        this.$verticalPadding = f11;
        this.$textBetweenPadding = f12;
        this.$badgeListBetweenPadding = f13;
        this.$modifier = eVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        EdoProvidersV2ComposableKt.m742CustomCellContentJ8oBhFo(this.$customCell, this.$onAtomAction, this.$horizontalPadding, this.$verticalPadding, this.$textBetweenPadding, this.$badgeListBetweenPadding, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
