package ru.ozon.app.android.account.orders.commonBarcodeV2.presentation;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.BarcodeShareButton;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CommonBarcodeV2ComposableKt$ShareButton$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ BarcodeShareButton.Button $shareButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommonBarcodeV2ComposableKt$ShareButton$1(BarcodeShareButton.Button button, Function1<? super AtomAction, Unit> function1) {
        super(2);
        this.$shareButton = button;
        this.$onAction = function1;
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
            float f7 = 16;
            DsButtonAtomKt.DsButtonAtom(this.$shareButton.getButton(), T.i(a0.e(e.f40358c0, 1.0f), f7, 12, f7, 4), false, this.$onAction, interfaceC3967k, 48, 4);
        }
    }
}
