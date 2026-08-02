package ru.ozon.app.android.analytics.startup;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/analytics/startup/OpenGlVersionProvider;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getOpenGlVersion", "", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OpenGlVersionProvider {

    @NotNull
    private final Context context;

    public OpenGlVersionProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final String getOpenGlVersion() {
        Object systemService = this.context.getSystemService("activity");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        String glEsVersion = ((ActivityManager) systemService).getDeviceConfigurationInfo().getGlEsVersion();
        Intrinsics.checkNotNullExpressionValue(glEsVersion, "getGlEsVersion(...)");
        return glEsVersion;
    }
}
