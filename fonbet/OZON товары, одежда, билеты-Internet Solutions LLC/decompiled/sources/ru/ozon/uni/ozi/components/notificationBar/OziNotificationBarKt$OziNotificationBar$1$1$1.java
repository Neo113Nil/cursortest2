package ru.ozon.uni.ozi.components.notificationBar;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarStatus;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziNotificationBarKt$OziNotificationBar$1$1$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ InterfaceC6511n<OziNotificationBarIconScope, InterfaceC3967k, Integer, Unit> $icon;
    final /* synthetic */ OziNotificationBarStatus $status;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziNotificationBarKt$OziNotificationBar$1$1$1(InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, OziNotificationBarStatus oziNotificationBarStatus) {
        super(2);
        this.$icon = interfaceC6511n;
        this.$status = oziNotificationBarStatus;
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
            this.$icon.invoke(new OziNotificationBarIconScope(this.$status.getIconBackgroundImage()), interfaceC3967k, 0);
        }
    }
}
