package ru.ozon.android.messenger.framework.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Function1<String, Boolean> f86574a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Function1<? super String, Boolean> function1) {
        this.f86574a = function1;
    }

    @NotNull
    public final Map<String, MessengerTrackingInfo> a(@NotNull Map<String, MessengerTrackingInfo> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        Function1<String, Boolean> function1 = this.f86574a;
        if (function1 == null) {
            return events;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, MessengerTrackingInfo> entry : events.entrySet()) {
            if (function1.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
