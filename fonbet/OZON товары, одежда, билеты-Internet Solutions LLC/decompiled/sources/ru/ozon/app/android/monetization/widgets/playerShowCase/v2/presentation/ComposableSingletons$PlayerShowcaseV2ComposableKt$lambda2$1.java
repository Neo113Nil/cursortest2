package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.ComposableSingletons$PlayerShowcaseV2ComposableKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes12.dex */
final class ComposableSingletons$PlayerShowcaseV2ComposableKt$lambda2$1 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$PlayerShowcaseV2ComposableKt$lambda2$1 INSTANCE = new ComposableSingletons$PlayerShowcaseV2ComposableKt$lambda2$1();

    ComposableSingletons$PlayerShowcaseV2ComposableKt$lambda2$1() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(eVar, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(e modifier, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(modifier) ? 4 : 2;
        }
        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            PlayerShowcaseV2CustomizationsSlots.INSTANCE.CustomizationHostOverlay(modifier, interfaceC3967k, (i11 & 14) | 48, 0);
        }
    }
}
