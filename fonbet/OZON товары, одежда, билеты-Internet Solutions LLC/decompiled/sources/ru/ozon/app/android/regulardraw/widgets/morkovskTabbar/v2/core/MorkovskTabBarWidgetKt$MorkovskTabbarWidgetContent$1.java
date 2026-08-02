package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarVI;
import ru.ozon.composer.compose.widget.i;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MorkovskTabBarWidgetKt$MorkovskTabbarWidgetContent$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ i<MorkovskTabbarVI> $this_MorkovskTabbarWidgetContent;
    final /* synthetic */ C7475g $widgetComponentStorage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskTabBarWidgetKt$MorkovskTabbarWidgetContent$1(i<MorkovskTabbarVI> iVar, C7475g c7475g, int i11) {
        super(2);
        this.$this_MorkovskTabbarWidgetContent = iVar;
        this.$widgetComponentStorage = c7475g;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        MorkovskTabBarWidgetKt.MorkovskTabbarWidgetContent(this.$this_MorkovskTabbarWidgetContent, this.$widgetComponentStorage, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
