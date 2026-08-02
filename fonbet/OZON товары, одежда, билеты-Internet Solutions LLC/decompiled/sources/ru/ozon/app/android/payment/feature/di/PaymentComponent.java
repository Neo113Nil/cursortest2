package ru.ozon.app.android.payment.feature.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.payment.feature.webpage.PaymentActivity;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.web.di.WebComponentApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/payment/feature/di/PaymentComponent;", "", "inject", "", "activity", "Lru/ozon/app/android/payment/feature/webpage/PaymentActivity;", "Factory", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PaymentComponent {

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J`\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/payment/feature/di/PaymentComponent$Factory;", "", "create", "Lru/ozon/app/android/payment/feature/di/PaymentComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "whitelistComponent", "Lru/ozon/app/android/network/whitelist/di/WhitelistComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "appLocaleComponentApi", "Lru/ozon/app/android/account/locale/app/di/AppLocaleComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "webComponentApi", "Lru/ozon/app/android/web/di/WebComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "componentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        PaymentComponent create(@NotNull NetworkComponentApi networkComponentApi, @NotNull WhitelistComponentApi whitelistComponent, @NotNull NavigationComponentApi navigationComponentApi, @NotNull AppLocaleComponentApi appLocaleComponentApi, @NotNull StorageComponentApi storageComponentApi, @NotNull AnalyticsComponentApi analyticsComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull WebComponentApi webComponentApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull ActionComponentApi actionComponentApi, @NotNull ContextComponentDependencies componentDependencies);
    }

    void inject(@NotNull PaymentActivity activity);
}
