package ru.ozon.uni.foundation.components.inputCore.decorationBox;

import J0.u3;
import K1.T;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class DecorationBoxKt$DecorationBox$1$2$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ String $placeholder;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ int $placeholderMaxLines;
    final /* synthetic */ e $placeholderModifier;
    final /* synthetic */ T $valueTextStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DecorationBoxKt$DecorationBox$1$2$1(String str, e eVar, long j11, int i11, T t2) {
        super(2);
        this.$placeholder = str;
        this.$placeholderModifier = eVar;
        this.$placeholderColor = j11;
        this.$placeholderMaxLines = i11;
        this.$valueTextStyle = t2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            u3.b(this.$placeholder, this.$placeholderModifier, this.$placeholderColor, 0L, null, 0L, null, 0L, 2, false, this.$placeholderMaxLines, 0, null, this.$valueTextStyle, interfaceC3967k, 0, 48, 55288);
        }
    }
}
