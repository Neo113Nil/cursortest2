package ru.ozon.app.android.videomoleculecompose.slots.lifecyclePlayback;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import e3.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "playerController", "", "DefaultVideoMoleculeLifecyclePlaybackEffect", "(Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;LS0/k;I)V", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultVideoMoleculeLifecyclePlaybackEffectKt {
    public static final void DefaultVideoMoleculeLifecyclePlaybackEffect(@NotNull BasePlayerController playerController, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(playerController, "playerController");
        C3969l u11 = interfaceC3967k.u(-1543643384);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(playerController) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            AbstractC5434v lifecycle = ((J) u11.m(r.a())).getLifecycle();
            u11.o(254210307);
            boolean F11 = u11.F(playerController) | u11.F(lifecycle);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new DefaultVideoMoleculeLifecyclePlaybackEffectKt$DefaultVideoMoleculeLifecyclePlaybackEffect$1$1(playerController, lifecycle);
                u11.x(C11);
            }
            u11.k();
            Q.b(lifecycle, playerController, (Function1) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DefaultVideoMoleculeLifecyclePlaybackEffectKt$DefaultVideoMoleculeLifecyclePlaybackEffect$2(playerController, i11));
        }
    }
}
