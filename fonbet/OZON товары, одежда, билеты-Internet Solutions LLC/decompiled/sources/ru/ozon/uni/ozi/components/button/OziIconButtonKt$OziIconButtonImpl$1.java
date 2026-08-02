package ru.ozon.uni.ozi.components.button;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.button.presets.size.OziIconButtonSize;
import ru.ozon.uni.ozi.components.loader.OziLoaderKt;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziIconButtonKt$OziIconButtonImpl$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ long $iconColor;
    final /* synthetic */ OziIconButtonSize $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziIconButtonKt$OziIconButtonImpl$1(long j11, OziIconButtonSize oziIconButtonSize) {
        super(2);
        this.$iconColor = j11;
        this.$size = oziIconButtonSize;
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
            OziLoaderKt.m3108OziLoader3IgeMak(OziTestTagsKt.oziTestTag(e.f40358c0, OziIconButtonTestTags.Loader, null, interfaceC3967k, 54, 2), this.$iconColor, this.$size.getLoaderSize(), interfaceC3967k, 0, 0);
        }
    }
}
