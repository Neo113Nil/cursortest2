package ru.ozon.app.android.videomoleculecompose.interaction;

import S0.C3956f1;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import S0.Q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "playerController", "", "rememberVideoMoleculeMediaResetVersion", "(Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;LS0/k;I)I", "resetVersion", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeMediaResetKt {
    public static final int rememberVideoMoleculeMediaResetVersion(@NotNull BasePlayerController playerController, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(playerController, "playerController");
        interfaceC3967k.o(1695731522);
        interfaceC3967k.o(739454060);
        boolean n11 = interfaceC3967k.n(playerController);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = C3956f1.a(0);
            interfaceC3967k.x(C11);
        }
        InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(739457909);
        boolean n12 = interfaceC3967k.n(interfaceC3972m0) | interfaceC3967k.F(playerController);
        Object C12 = interfaceC3967k.C();
        if (n12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new VideoMoleculeMediaResetKt$rememberVideoMoleculeMediaResetVersion$1$1(playerController, interfaceC3972m0);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        Q.c(playerController, (Function1) C12, interfaceC3967k);
        int intValue = interfaceC3972m0.getIntValue();
        interfaceC3967k.k();
        return intValue;
    }
}
