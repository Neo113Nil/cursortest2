package ru.ozon.tracker.sendEvent;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PAGE_VIEW_TYPE", "", "isEquals", "", "", "other", "tracker-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventManagerKt {

    @NotNull
    private static final String PAGE_VIEW_TYPE = "page";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isEquals(Throwable th2, Throwable th3) {
        if (Intrinsics.d(th2 != null ? th2.getClass() : null, th3 != null ? th3.getClass() : null)) {
            return Intrinsics.d(th2 != null ? th2.getMessage() : null, th3 != null ? th3.getMessage() : null);
        }
        return false;
    }
}
