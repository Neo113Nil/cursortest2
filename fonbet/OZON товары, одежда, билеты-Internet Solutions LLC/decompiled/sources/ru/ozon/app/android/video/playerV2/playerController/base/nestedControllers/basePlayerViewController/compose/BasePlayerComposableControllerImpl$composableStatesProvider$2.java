package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/ComposableStatesProviderImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BasePlayerComposableControllerImpl$composableStatesProvider$2 extends AbstractC7737t implements Function0<ComposableStatesProviderImpl> {
    final /* synthetic */ BasePlayerComposableControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePlayerComposableControllerImpl$composableStatesProvider$2(BasePlayerComposableControllerImpl basePlayerComposableControllerImpl) {
        super(0);
        this.this$0 = basePlayerComposableControllerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ComposableStatesProviderImpl invoke() {
        ExoPlayer exoPlayer;
        exoPlayer = this.this$0.exoPlayer;
        return new ComposableStatesProviderImpl(exoPlayer);
    }
}
