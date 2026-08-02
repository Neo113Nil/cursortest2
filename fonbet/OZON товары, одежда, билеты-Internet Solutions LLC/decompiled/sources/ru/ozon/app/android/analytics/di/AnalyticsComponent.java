package ru.ozon.app.android.analytics.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.firebase.di.FirebaseAnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/analytics/di/AnalyticsComponent;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/analytics/di/PerformanceAnalyticsApi;", "Factory", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AnalyticsComponent extends AnalyticsComponentApi, PerformanceAnalyticsApi {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/analytics/di/AnalyticsComponent$Factory;", "", "create", "Lru/ozon/app/android/analytics/di/AnalyticsComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "analyticsComponentDependencies", "Lru/ozon/app/android/analytics/di/AnalyticsComponentDependencies;", "firebaseAnalyticsComponentApi", "Lru/ozon/app/android/analytics/firebase/di/FirebaseAnalyticsComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        AnalyticsComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull AnalyticsComponentDependencies analyticsComponentDependencies, @NotNull FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, @NotNull AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi);
    }
}
