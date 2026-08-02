package ru.ozon.uni.ozi.components.notificationBar;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.icon.presets.OziIconShape;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/ozi/components/notificationBar/OziNotificationBarIconScope;", "", "DefaultNotificationBarIcon", "(Lru/ozon/uni/ozi/components/notificationBar/OziNotificationBarIconScope;LS0/k;I)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNotificationBarIconScopeKt {
    public static final void DefaultNotificationBarIcon(@NotNull OziNotificationBarIconScope oziNotificationBarIconScope, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(oziNotificationBarIconScope, "<this>");
        C3969l u11 = interfaceC3967k.u(263582047);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(oziNotificationBarIconScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            oziNotificationBarIconScope.m3122OziNotificationBarIconR_BKmV8(null, null, null, null, OziIconShape.Squircle, null, false, false, null, null, u11, 24582, i12 & 14, 1006);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OziNotificationBarIconScopeKt$DefaultNotificationBarIcon$1(oziNotificationBarIconScope, i11));
        }
    }
}
