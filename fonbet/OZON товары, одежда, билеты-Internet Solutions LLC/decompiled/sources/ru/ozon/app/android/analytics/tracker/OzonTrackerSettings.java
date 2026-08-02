package ru.ozon.app.android.analytics.tracker;

import fi0.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u0004\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/analytics/tracker/OzonTrackerSettings;", "", "", "isTestMode", "isEnabled", "Lfi0/x;", "trackerSettings", "<init>", "(Ljava/lang/Boolean;ZLfi0/x;)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Z", "()Z", "Lfi0/x;", "getTrackerSettings", "()Lfi0/x;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonTrackerSettings {
    private final boolean isEnabled;
    private final Boolean isTestMode;

    @NotNull
    private final x trackerSettings;

    public OzonTrackerSettings(Boolean bool, boolean z11, @NotNull x trackerSettings) {
        Intrinsics.checkNotNullParameter(trackerSettings, "trackerSettings");
        this.isTestMode = bool;
        this.isEnabled = z11;
        this.trackerSettings = trackerSettings;
    }

    @NotNull
    public final x getTrackerSettings() {
        return this.trackerSettings;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: isTestMode, reason: from getter */
    public final Boolean getIsTestMode() {
        return this.isTestMode;
    }
}
