package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.composable;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TextWithTrailingIconKt$TextWithTrailingIcon$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ TextDTO $dto;
    final /* synthetic */ String $icon;
    final /* synthetic */ e $modifier;
    final /* synthetic */ boolean $timerEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextWithTrailingIconKt$TextWithTrailingIcon$2(TextDTO textDTO, String str, boolean z11, e eVar, int i11, int i12) {
        super(2);
        this.$dto = textDTO;
        this.$icon = str;
        this.$timerEnabled = z11;
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
        TextWithTrailingIconKt.TextWithTrailingIcon(this.$dto, this.$icon, this.$timerEnabled, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
