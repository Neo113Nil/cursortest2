package ru.ozon.app.android.analytics.screen.storage.di.module;

import Sg.a;
import Sg.c;
import Sg.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/analytics/screen/storage/di/module/AnalyticsScreenStorageModule;", "", "<init>", "()V", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "provideAnalyticsScreenStorage", "()LSg/a;", "provideApplicationAnalyticsScreenStorage", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsScreenStorageModule {
    @NotNull
    public final a provideAnalyticsScreenStorage() {
        int i11 = a.f26232a;
        return new c();
    }

    @NotNull
    public final a provideApplicationAnalyticsScreenStorage() {
        return d.f26237b;
    }
}
