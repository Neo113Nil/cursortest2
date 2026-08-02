package ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.t;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTabKt$CartTab$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $defaultTabRadius;
    final /* synthetic */ CartTabsVO.CartTabItem $item;
    final /* synthetic */ String $locator;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function2<Integer, AtomAction, Unit> $onClick;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ int $position;
    final /* synthetic */ float $rowHorizontalPadding;
    final /* synthetic */ float $rowVerticalPadding;
    final /* synthetic */ float $spaceBetweenAtoms;
    final /* synthetic */ float $tabHeight;
    final /* synthetic */ long $transparentLayerColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTabKt$CartTab$4(e eVar, int i11, CartTabsVO.CartTabItem cartTabItem, Function2<? super Integer, ? super AtomAction, Unit> function2, Function1<? super t, Unit> function1, float f7, float f11, float f12, String str, float f13, float f14, long j11, int i12, int i13, int i14) {
        super(2);
        this.$modifier = eVar;
        this.$position = i11;
        this.$item = cartTabItem;
        this.$onClick = function2;
        this.$onView = function1;
        this.$spaceBetweenAtoms = f7;
        this.$rowHorizontalPadding = f11;
        this.$rowVerticalPadding = f12;
        this.$locator = str;
        this.$tabHeight = f13;
        this.$defaultTabRadius = f14;
        this.$transparentLayerColor = j11;
        this.$$changed = i12;
        this.$$changed1 = i13;
        this.$$default = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CartTabKt.m699CartTabPRecIgQ(this.$modifier, this.$position, this.$item, this.$onClick, this.$onView, this.$spaceBetweenAtoms, this.$rowHorizontalPadding, this.$rowVerticalPadding, this.$locator, this.$tabHeight, this.$defaultTabRadius, this.$transparentLayerColor, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
