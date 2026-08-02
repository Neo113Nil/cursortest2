package ru.ozon.app.android.search.widgets.separatorBadge.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SeparatorBadgeWidgetKt$Divider$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ float $height;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeparatorBadgeWidgetKt$Divider$1(e eVar, long j11, float f7, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$color = j11;
        this.$height = f7;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        SeparatorBadgeWidgetKt.m989DividerRFCenO8(this.$modifier, this.$color, this.$height, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
