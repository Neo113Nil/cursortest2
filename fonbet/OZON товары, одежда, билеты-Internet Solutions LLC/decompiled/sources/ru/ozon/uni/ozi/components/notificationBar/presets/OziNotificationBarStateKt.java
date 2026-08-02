package ru.ozon.uni.ozi.components.notificationBar.presets;

import S0.InterfaceC3967k;
import androidx.compose.ui.platform.C5239d1;
import b1.C5503f;
import b1.C5516s;
import b1.InterfaceC5515r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import l0.m0;
import m0.InterfaceC7976A;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarState;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState$Companion;", "Lm0/A;", "", "decayAnimationSpec", "Lb1/r;", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState;", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarVisibility;", "Saver", "(Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState$Companion;Lm0/A;)Lb1/r;", "rememberNotificationBarState", "(LS0/k;I)Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNotificationBarStateKt {
    private static final InterfaceC5515r<OziNotificationBarState, OziNotificationBarVisibility> Saver(OziNotificationBarState.Companion companion, InterfaceC7976A<Float> interfaceC7976A) {
        return C5516s.a(OziNotificationBarStateKt$Saver$1.INSTANCE, new OziNotificationBarStateKt$Saver$2(interfaceC7976A));
    }

    @NotNull
    public static final OziNotificationBarState rememberNotificationBarState(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(1923556253);
        boolean booleanValue = ((Boolean) interfaceC3967k.m(C5239d1.a())).booleanValue();
        InterfaceC7976A<Float> b11 = m0.b(interfaceC3967k);
        OziNotificationBarState.Companion companion = OziNotificationBarState.INSTANCE;
        companion.setDecayAnimationSpec$uni_release(b11);
        Object[] objArr = new Object[0];
        InterfaceC5515r<OziNotificationBarState, OziNotificationBarVisibility> Saver = Saver(companion, b11);
        interfaceC3967k.o(542941004);
        boolean F11 = interfaceC3967k.F(b11) | interfaceC3967k.p(booleanValue);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new OziNotificationBarStateKt$rememberNotificationBarState$state$1$1(b11, booleanValue);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        OziNotificationBarState oziNotificationBarState = (OziNotificationBarState) C5503f.c(objArr, Saver, (Function0) C11, interfaceC3967k, 0, 4);
        interfaceC3967k.k();
        return oziNotificationBarState;
    }
}
