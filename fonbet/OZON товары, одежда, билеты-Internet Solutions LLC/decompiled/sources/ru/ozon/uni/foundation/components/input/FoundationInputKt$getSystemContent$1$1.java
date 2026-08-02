package ru.ozon.uni.foundation.components.input;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.foundation.components.inputCore.DefaultTrailingIconKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class FoundationInputKt$getSystemContent$1$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ long $systemContentColor;
    final /* synthetic */ e $systemContentModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoundationInputKt$getSystemContent$1$1(AbstractC8972b abstractC8972b, long j11, e eVar) {
        super(2);
        this.$icon = abstractC8972b;
        this.$systemContentColor = j11;
        this.$systemContentModifier = eVar;
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
            DefaultTrailingIconKt.m3010DefaultTrailingIconN8B1yIo(this.$icon, this.$systemContentColor, this.$systemContentModifier, 0.0f, interfaceC3967k, 0, 8);
        }
    }
}
