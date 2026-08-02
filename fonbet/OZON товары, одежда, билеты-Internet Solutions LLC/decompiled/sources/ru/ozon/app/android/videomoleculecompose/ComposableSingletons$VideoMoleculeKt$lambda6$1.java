package ru.ozon.app.android.videomoleculecompose;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;
import ru.ozon.app.android.videomoleculecompose.slots.lifecyclePlayback.DefaultVideoMoleculeLifecyclePlaybackEffectKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "controller", "", "invoke", "(Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.videomoleculecompose.ComposableSingletons$VideoMoleculeKt$lambda-6$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$VideoMoleculeKt$lambda6$1 extends AbstractC7737t implements InterfaceC6511n<BasePlayerController, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$VideoMoleculeKt$lambda6$1 INSTANCE = new ComposableSingletons$VideoMoleculeKt$lambda6$1();

    ComposableSingletons$VideoMoleculeKt$lambda6$1() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(BasePlayerController basePlayerController, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(basePlayerController, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(BasePlayerController controller, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        DefaultVideoMoleculeLifecyclePlaybackEffectKt.DefaultVideoMoleculeLifecyclePlaybackEffect(controller, interfaceC3967k, i11 & 14);
    }
}
