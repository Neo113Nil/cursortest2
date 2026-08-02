package ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerControllerInternal;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "kotlin.jvm.PlatformType", "", "invoke", "()Ljava/util/Set;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AbstractPlayerPoolStorage$acquiredControllers$2 extends AbstractC7737t implements Function0<Set<PoolPlayerControllerInternal>> {
    public static final AbstractPlayerPoolStorage$acquiredControllers$2 INSTANCE = new AbstractPlayerPoolStorage$acquiredControllers$2();

    AbstractPlayerPoolStorage$acquiredControllers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<PoolPlayerControllerInternal> invoke() {
        return Collections.newSetFromMap(new WeakHashMap());
    }
}
