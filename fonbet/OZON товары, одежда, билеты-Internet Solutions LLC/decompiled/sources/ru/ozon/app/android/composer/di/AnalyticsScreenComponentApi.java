package ru.ozon.app.android.composer.di;

import Sg.a;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0013\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004H'¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/composer/di/AnalyticsScreenComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "getAnalyticsScreenStorage", "()LSg/a;", "getApplicationAnalyticsScreenStorage", "Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "getAnalyticsEventExecutor", "()Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "getAnalyticsDataLayer", "()Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AnalyticsScreenComponentApi extends InterfaceC6958a {
    @NotNull
    AnalyticsDataLayer getAnalyticsDataLayer();

    @NotNull
    AnalyticsEventExecutor getAnalyticsEventExecutor();

    @NotNull
    a getAnalyticsScreenStorage();

    @NotNull
    a getApplicationAnalyticsScreenStorage();
}
