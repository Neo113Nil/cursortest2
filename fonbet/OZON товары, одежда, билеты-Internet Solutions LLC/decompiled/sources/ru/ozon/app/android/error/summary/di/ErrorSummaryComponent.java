package ru.ozon.app.android.error.summary.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryFragment;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.uikit.screenstate.ScreenState;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/error/summary/di/ErrorSummaryComponent;", "", "inject", "", "fragment", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryFragment;", "Factory", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ErrorSummaryComponent {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/error/summary/di/ErrorSummaryComponent$Factory;", "", "create", "Lru/ozon/app/android/error/summary/di/ErrorSummaryComponent;", "serverIssue", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        ErrorSummaryComponent create(ScreenState.ServerIssue serverIssue, @NotNull StorageComponentApi storageComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull NetworkComponentApi networkComponentApi);
    }

    void inject(@NotNull ErrorSummaryFragment fragment);
}
