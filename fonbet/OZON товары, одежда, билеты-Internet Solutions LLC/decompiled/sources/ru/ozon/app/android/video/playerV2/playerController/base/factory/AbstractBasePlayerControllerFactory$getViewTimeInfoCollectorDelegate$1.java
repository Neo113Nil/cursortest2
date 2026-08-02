package ru.ozon.app.android.video.playerV2.playerController.base.factory;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfoCollector;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/playerV2/data/ViewTimeInfoCollector;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AbstractBasePlayerControllerFactory$getViewTimeInfoCollectorDelegate$1 extends AbstractC7737t implements Function0<ViewTimeInfoCollector> {
    public static final AbstractBasePlayerControllerFactory$getViewTimeInfoCollectorDelegate$1 INSTANCE = new AbstractBasePlayerControllerFactory$getViewTimeInfoCollectorDelegate$1();

    AbstractBasePlayerControllerFactory$getViewTimeInfoCollectorDelegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewTimeInfoCollector invoke() {
        return new ViewTimeInfoCollector();
    }
}
