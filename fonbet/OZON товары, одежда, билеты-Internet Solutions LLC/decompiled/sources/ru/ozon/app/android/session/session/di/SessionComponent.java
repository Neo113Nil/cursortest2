package ru.ozon.app.android.session.session.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.session.session.mapper.SessionMapper;
import ru.ozon.app.android.session.session.presentation.viewModel.SessionViewModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/session/di/SessionComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/session/session/mapper/SessionMapper;", "getMapper", "()Lru/ozon/app/android/session/session/mapper/SessionMapper;", "mapper", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionViewModel;", "getViewModel", "()Lru/ozon/app/android/session/session/presentation/viewModel/SessionViewModel;", "viewModel", "Factory", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SessionComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/session/session/di/SessionComponent$Factory;", "", "create", "Lru/ozon/app/android/session/session/di/SessionComponent;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "widgetComponent", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        SessionComponent create(@NotNull ActionComponentApi actionComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull NetworkComponentApi widgetComponent);
    }

    @NotNull
    SessionMapper getMapper();

    @NotNull
    SessionViewModel getViewModel();
}
