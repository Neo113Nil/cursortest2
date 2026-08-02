package ru.ozon.uni.components.button;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.utils.DeferredColor;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class UniButtonKt$UniButton$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ UniButtonSize $sizeType;
    final /* synthetic */ UniButtonStyleType $styleType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniButtonKt$UniButton$2(UniButtonSize uniButtonSize, UniButtonStyleType uniButtonStyleType) {
        super(2);
        this.$sizeType = uniButtonSize;
        this.$styleType = uniButtonStyleType;
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
            UniButtonKt.m1885LoaderRPmYEkk(this.$sizeType, DeferredColor.getValue(this.$styleType.getIconColor(), interfaceC3967k, 0), interfaceC3967k, 0);
        }
    }
}
