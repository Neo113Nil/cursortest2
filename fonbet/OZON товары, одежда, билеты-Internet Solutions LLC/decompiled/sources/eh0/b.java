package eh0;

import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.service.RemoteMessage;

/* loaded from: classes7.dex */
public interface b {
    void handle(@NotNull RemoteMessage remoteMessage);

    boolean shouldHandle(@NotNull RemoteMessage remoteMessage, boolean z11);
}
