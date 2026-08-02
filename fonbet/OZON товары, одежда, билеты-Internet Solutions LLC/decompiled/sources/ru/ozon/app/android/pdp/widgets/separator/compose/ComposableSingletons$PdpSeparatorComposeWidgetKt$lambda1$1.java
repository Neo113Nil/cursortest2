package ru.ozon.app.android.pdp.widgets.separator.compose;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.separator.presentation.PdpSeparatorVO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/separator/presentation/PdpSeparatorVO;", "it", "", "invoke", "(Lru/ozon/app/android/pdp/widgets/separator/presentation/PdpSeparatorVO;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.pdp.widgets.separator.compose.ComposableSingletons$PdpSeparatorComposeWidgetKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes13.dex */
final class ComposableSingletons$PdpSeparatorComposeWidgetKt$lambda1$1 extends AbstractC7737t implements InterfaceC6511n<PdpSeparatorVO, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$PdpSeparatorComposeWidgetKt$lambda1$1 INSTANCE = new ComposableSingletons$PdpSeparatorComposeWidgetKt$lambda1$1();

    ComposableSingletons$PdpSeparatorComposeWidgetKt$lambda1$1() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(PdpSeparatorVO pdpSeparatorVO, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(pdpSeparatorVO, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(PdpSeparatorVO it, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(it) ? 4 : 2;
        }
        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            PdpSeparatorComposableKt.PdpSeparatorComposable(it, interfaceC3967k, i11 & 14);
        }
    }
}
