package ru.ozon.tracker.sendEvent.runner;

import fi0.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxe/M;", "scope", "Lfi0/x;", "settings", "Lru/ozon/tracker/sendEvent/runner/DelayTimeProvider;", "fastEventDelayTimeProvider", "(Lxe/M;Lfi0/x;)Lru/ozon/tracker/sendEvent/runner/DelayTimeProvider;", "tracker-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DelayTimeProviderKt {
    @NotNull
    public static final DelayTimeProvider fastEventDelayTimeProvider(@NotNull M scope, @NotNull x settings) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new FastEventDelayTimeProvider(scope, settings);
    }
}
