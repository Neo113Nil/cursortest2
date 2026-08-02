package ru.ozon.android.messenger.framework.analytics;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface i {
    void appendPageState(@NotNull g gVar);

    void processEvents(@NotNull Map<String, MessengerTrackingInfo> map);

    void sendCustomEvent(@NotNull d dVar);

    void sendMetrics(@NotNull f fVar);

    void sendPageView(@NotNull e eVar);
}
