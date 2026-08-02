package ru.ozon.uni.android.ds.compose.component.button;

import A0.h;
import P0.p2;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.y0;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsButtonKt$DsButton$3$3$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ String $dataText;
    final /* synthetic */ DsButtonStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsButtonKt$DsButton$3$3$1(DsButtonStyle dsButtonStyle, String str) {
        super(2);
        this.$style = dsButtonStyle;
        this.$dataText = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        b11 = androidx.compose.foundation.e.b(C6988h.a(e.f40358c0, h.b(this.$style.getDataCornerRadius())), this.$style.getDataBackgroundColor(), y0.a());
        e e11 = T.e(b11, this.$style.getDataContentPadding());
        K1.T dataTextStyle = this.$style.getDataTextStyle();
        p2.b(this.$dataText, e11, this.$style.getDataTextColor(), 0L, 0L, null, 0L, 2, false, 1, 0, dataTextStyle, interfaceC3967k, 0, 3120, 55288);
    }
}
