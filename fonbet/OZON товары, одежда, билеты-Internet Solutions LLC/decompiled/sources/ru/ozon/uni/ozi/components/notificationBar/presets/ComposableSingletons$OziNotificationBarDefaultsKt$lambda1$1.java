package ru.ozon.uni.ozi.components.notificationBar.presets;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.ozi.components.notificationBar.OziNotificationBarIconScope;
import ru.ozon.uni.ozi.components.notificationBar.OziNotificationBarIconScopeKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/ozon/uni/ozi/components/notificationBar/OziNotificationBarIconScope;", "", "invoke", "(Lru/ozon/uni/ozi/components/notificationBar/OziNotificationBarIconScope;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.uni.ozi.components.notificationBar.presets.ComposableSingletons$OziNotificationBarDefaultsKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$OziNotificationBarDefaultsKt$lambda1$1 extends AbstractC7737t implements InterfaceC6511n<OziNotificationBarIconScope, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$OziNotificationBarDefaultsKt$lambda1$1 INSTANCE = new ComposableSingletons$OziNotificationBarDefaultsKt$lambda1$1();

    ComposableSingletons$OziNotificationBarDefaultsKt$lambda1$1() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(OziNotificationBarIconScope oziNotificationBarIconScope, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(oziNotificationBarIconScope, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(OziNotificationBarIconScope oziNotificationBarIconScope, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(oziNotificationBarIconScope, "<this>");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(oziNotificationBarIconScope) ? 4 : 2;
        }
        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            OziNotificationBarIconScopeKt.DefaultNotificationBarIcon(oziNotificationBarIconScope, interfaceC3967k, i11 & 14);
        }
    }
}
