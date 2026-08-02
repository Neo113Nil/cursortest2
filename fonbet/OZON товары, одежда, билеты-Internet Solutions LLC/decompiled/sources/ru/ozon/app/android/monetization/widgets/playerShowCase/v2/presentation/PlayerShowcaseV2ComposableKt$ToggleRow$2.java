package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseV2ComposableKt$ToggleRow$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ String $label;
    final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlayerShowcaseV2ComposableKt$ToggleRow$2(String str, boolean z11, Function1<? super Boolean, Unit> function1, int i11) {
        super(2);
        this.$label = str;
        this.$checked = z11;
        this.$onCheckedChange = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        PlayerShowcaseV2ComposableKt.ToggleRow(this.$label, this.$checked, this.$onCheckedChange, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
