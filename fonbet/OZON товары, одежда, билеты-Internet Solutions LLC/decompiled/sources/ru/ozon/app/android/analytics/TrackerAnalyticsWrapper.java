package ru.ozon.app.android.analytics;

import UZ.b;
import UZ.d;
import ZZ.a;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/analytics/TrackerAnalyticsWrapper;", "LUZ/b;", "Lei0/b;", "tracker", "LZZ/a;", "screenToPageConverter", "<init>", "(Lei0/b;LZZ/a;)V", "LUZ/a;", "event", "", "sendEvent", "(LUZ/a;)V", "LZZ/b;", "delegate", "LZZ/b;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrackerAnalyticsWrapper implements b {

    @NotNull
    private final ZZ.b delegate;

    public TrackerAnalyticsWrapper(@NotNull InterfaceC6369b tracker, @NotNull a screenToPageConverter) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(screenToPageConverter, "screenToPageConverter");
        this.delegate = new ZZ.b(tracker, screenToPageConverter);
    }

    @Override // UZ.b
    public void sendEvent(@NotNull UZ.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof d) {
            XZ.d a11 = ((d) event).a();
            if ((a11 != null ? a11.i() : null) == null) {
                return;
            }
        }
        this.delegate.sendEvent(event);
    }
}
