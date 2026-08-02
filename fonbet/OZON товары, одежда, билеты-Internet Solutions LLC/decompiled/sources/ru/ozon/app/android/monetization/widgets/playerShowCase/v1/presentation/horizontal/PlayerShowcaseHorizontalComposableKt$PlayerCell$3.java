package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.data.PlayerShowcaseDTO;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di.PlayerShowcaseComponent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseHorizontalComposableKt$PlayerCell$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ PlayerShowcaseComponent $component;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ String $url;
    final /* synthetic */ PlayerShowcaseDTO.VideoFormat $videoFormat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseHorizontalComposableKt$PlayerCell$3(String str, PlayerShowcaseDTO.VideoFormat videoFormat, boolean z11, PlayerShowcaseComponent playerShowcaseComponent, int i11) {
        super(2);
        this.$url = str;
        this.$videoFormat = videoFormat;
        this.$isVisible = z11;
        this.$component = playerShowcaseComponent;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        PlayerShowcaseHorizontalComposableKt.PlayerCell(this.$url, this.$videoFormat, this.$isVisible, this.$component, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
