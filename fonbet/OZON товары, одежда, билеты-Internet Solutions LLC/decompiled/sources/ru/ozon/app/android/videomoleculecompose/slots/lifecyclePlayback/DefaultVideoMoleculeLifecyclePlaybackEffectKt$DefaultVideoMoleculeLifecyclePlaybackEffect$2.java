package ru.ozon.app.android.videomoleculecompose.slots.lifecyclePlayback;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultVideoMoleculeLifecyclePlaybackEffectKt$DefaultVideoMoleculeLifecyclePlaybackEffect$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ BasePlayerController $playerController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultVideoMoleculeLifecyclePlaybackEffectKt$DefaultVideoMoleculeLifecyclePlaybackEffect$2(BasePlayerController basePlayerController, int i11) {
        super(2);
        this.$playerController = basePlayerController;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DefaultVideoMoleculeLifecyclePlaybackEffectKt.DefaultVideoMoleculeLifecyclePlaybackEffect(this.$playerController, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
