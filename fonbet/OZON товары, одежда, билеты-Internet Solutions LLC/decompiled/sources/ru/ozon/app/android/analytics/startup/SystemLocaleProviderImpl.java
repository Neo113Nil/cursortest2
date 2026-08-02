package ru.ozon.app.android.analytics.startup;

import android.content.res.Resources;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/analytics/startup/SystemLocaleProviderImpl;", "Lru/ozon/app/android/analytics/startup/SystemLocaleProvider;", "<init>", "()V", "getLocale", "Ljava/util/Locale;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SystemLocaleProviderImpl implements SystemLocaleProvider {
    @Override // ru.ozon.app.android.analytics.startup.SystemLocaleProvider
    @NotNull
    public Locale getLocale() {
        Locale locale = Resources.getSystem().getConfiguration().getLocales().get(0);
        Intrinsics.checkNotNullExpressionValue(locale, "get(...)");
        return locale;
    }
}
