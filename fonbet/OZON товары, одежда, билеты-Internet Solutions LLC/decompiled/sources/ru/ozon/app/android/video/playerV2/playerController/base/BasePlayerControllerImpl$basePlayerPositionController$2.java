package ru.ozon.app.android.video.playerV2.playerController.base;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerPositionController;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BasePlayerControllerImpl$basePlayerPositionController$2 extends AbstractC7737t implements Function0<BasePlayerPositionController> {
    final /* synthetic */ BasePlayerControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePlayerControllerImpl$basePlayerPositionController$2(BasePlayerControllerImpl basePlayerControllerImpl) {
        super(0);
        this.this$0 = basePlayerControllerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BasePlayerPositionController invoke() {
        BasePlayerPositionController createPlayerPositionController;
        createPlayerPositionController = this.this$0.createPlayerPositionController();
        return createPlayerPositionController;
    }
}
