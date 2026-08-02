package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.tooltip;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import android.view.View;
import d2.C6041S;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonV5TooltipKt$CartButtonV5Tooltip$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ View $anchorView;
    final /* synthetic */ CartButtonV5DTO.CartButton.Button.Tooltip $dto;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    final /* synthetic */ C6041S $properties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5TooltipKt$CartButtonV5Tooltip$3(CartButtonV5DTO.CartButton.Button.Tooltip tooltip, boolean z11, View view, C6041S c6041s, Function0<Unit> function0, Function0<Unit> function02, int i11) {
        super(2);
        this.$dto = tooltip;
        this.$isVisible = z11;
        this.$anchorView = view;
        this.$properties = c6041s;
        this.$onDismissRequest = function0;
        this.$onCloseClick = function02;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CartButtonV5TooltipKt.CartButtonV5Tooltip(this.$dto, this.$isVisible, this.$anchorView, this.$properties, this.$onDismissRequest, this.$onCloseClick, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
