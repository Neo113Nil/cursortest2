package ru.ozon.app.android.commonwidgets.widgets.error.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.error.ErrorAnalytics;
import ru.ozon.app.android.composer.di.ComposerComponent;
import ru.ozon.app.android.composer.di.composer.RetainAnalyticsComponentApi;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/error/di/ErrorWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/commonwidgets/widgets/error/ErrorAnalytics;", "getErrorAnalytics", "()Lru/ozon/app/android/commonwidgets/widgets/error/ErrorAnalytics;", "Factory", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ErrorWidgetComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/error/di/ErrorWidgetComponent$Factory;", "", "create", "Lru/ozon/app/android/commonwidgets/widgets/error/di/ErrorWidgetComponent;", "composerComponent", "Lru/ozon/app/android/composer/di/ComposerComponent;", "retainAnalyticsComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainAnalyticsComponentApi;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public interface Factory {
        @NotNull
        ErrorWidgetComponent create(@NotNull ComposerComponent composerComponent, @NotNull RetainAnalyticsComponentApi retainAnalyticsComponentApi);
    }

    @NotNull
    ErrorAnalytics getErrorAnalytics();
}
