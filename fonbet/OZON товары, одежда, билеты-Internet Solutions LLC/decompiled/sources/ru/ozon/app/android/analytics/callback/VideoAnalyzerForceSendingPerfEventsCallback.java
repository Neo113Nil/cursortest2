package ru.ozon.app.android.analytics.callback;

import Qj0.InterfaceC3890j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.ForceSendingPerfAnalyticsUtilsKt;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/analytics/callback/VideoAnalyzerForceSendingPerfEventsCallback;", "LQj0/j;", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "userStatusStorage", "<init>", "(Lru/ozon/app/android/storage/user/UserStatusStorage;)V", "Lru/ozon/tracker/process/lifecycle/ApplicationLifecycleState;", "currentState", "", "countEvents", "", "onForcedSynced", "(Lru/ozon/tracker/process/lifecycle/ApplicationLifecycleState;I)V", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoAnalyzerForceSendingPerfEventsCallback implements InterfaceC3890j {

    @NotNull
    private final UserStatusStorage userStatusStorage;

    public VideoAnalyzerForceSendingPerfEventsCallback(@NotNull UserStatusStorage userStatusStorage) {
        Intrinsics.checkNotNullParameter(userStatusStorage, "userStatusStorage");
        this.userStatusStorage = userStatusStorage;
    }

    @Override // Qj0.InterfaceC3890j
    public void onForcedSynced(@NotNull ApplicationLifecycleState currentState, int countEvents) {
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        if (currentState == ApplicationLifecycleState.BACKGROUND && this.userStatusStorage.getIsAutoTestUser()) {
            ForceSendingPerfAnalyticsUtilsKt.printForcedSendingAnalyticsLog(countEvents);
        }
    }
}
