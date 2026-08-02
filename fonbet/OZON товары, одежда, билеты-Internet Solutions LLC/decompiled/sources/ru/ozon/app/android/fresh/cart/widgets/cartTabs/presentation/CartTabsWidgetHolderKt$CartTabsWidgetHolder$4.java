package ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.l;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTabsWidgetHolderKt$CartTabsWidgetHolder$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ CartTabsVO $item;
    final /* synthetic */ long $listBackgroundColor;
    final /* synthetic */ String $locator;
    final /* synthetic */ e $modifier;
    final /* synthetic */ float $roundedCornersSize;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTabsWidgetHolderKt$CartTabsWidgetHolder$4(e eVar, CartTabsVO cartTabsVO, Function1<? super AtomAction, Unit> function1, InterfaceC7851b interfaceC7851b, l lVar, long j11, long j12, float f7, String str, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$item = cartTabsVO;
        this.$actionHandler = function1;
        this.$controller = interfaceC7851b;
        this.$tokenizedAnalytics = lVar;
        this.$backgroundColor = j11;
        this.$listBackgroundColor = j12;
        this.$roundedCornersSize = f7;
        this.$locator = str;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CartTabsWidgetHolderKt.m707CartTabsWidgetHolder8LwENs(this.$modifier, this.$item, this.$actionHandler, this.$controller, this.$tokenizedAnalytics, this.$backgroundColor, this.$listBackgroundColor, this.$roundedCornersSize, this.$locator, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
