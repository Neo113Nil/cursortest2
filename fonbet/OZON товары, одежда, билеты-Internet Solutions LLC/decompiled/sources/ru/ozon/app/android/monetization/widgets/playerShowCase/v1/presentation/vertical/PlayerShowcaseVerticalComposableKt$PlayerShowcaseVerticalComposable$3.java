package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.vertical;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di.PlayerShowcaseComponent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseVerticalComposableKt$PlayerShowcaseVerticalComposable$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ PlayerShowcaseComponent $component;
    final /* synthetic */ PlayerShowcaseVerticalVI $item;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseVerticalComposableKt$PlayerShowcaseVerticalComposable$3(PlayerShowcaseVerticalVI playerShowcaseVerticalVI, PlayerShowcaseComponent playerShowcaseComponent, e eVar, int i11, int i12) {
        super(2);
        this.$item = playerShowcaseVerticalVI;
        this.$component = playerShowcaseComponent;
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
        PlayerShowcaseVerticalComposableKt.PlayerShowcaseVerticalComposable(this.$item, this.$component, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
