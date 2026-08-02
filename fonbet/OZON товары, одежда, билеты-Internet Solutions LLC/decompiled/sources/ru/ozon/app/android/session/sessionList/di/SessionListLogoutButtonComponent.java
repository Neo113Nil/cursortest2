package ru.ozon.app.android.session.sessionList.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.session.sessionList.mapper.SessionListLogoutButtonMapper;
import ru.ozon.app.android.session.sessionList.presentation.SessionListViewModel;
import ru.ozon.app.android.session.sessionList.presentation.viewFactory.SessionListLogoutButtonViewFactory;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/session/sessionList/di/SessionListLogoutButtonComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/session/sessionList/mapper/SessionListLogoutButtonMapper;", "getMapper", "()Lru/ozon/app/android/session/sessionList/mapper/SessionListLogoutButtonMapper;", "mapper", "Lru/ozon/app/android/session/sessionList/presentation/viewFactory/SessionListLogoutButtonViewFactory;", "getViewFactory", "()Lru/ozon/app/android/session/sessionList/presentation/viewFactory/SessionListLogoutButtonViewFactory;", "viewFactory", "Lru/ozon/app/android/session/sessionList/presentation/SessionListViewModel;", "getViewModel", "()Lru/ozon/app/android/session/sessionList/presentation/SessionListViewModel;", "viewModel", "Factory", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SessionListLogoutButtonComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/sessionList/di/SessionListLogoutButtonComponent$Factory;", "", "create", "Lru/ozon/app/android/session/sessionList/di/SessionListLogoutButtonComponent;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "accountComponent", "Lru/ozon/app/android/account/di/AccountComponentApi;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        SessionListLogoutButtonComponent create(@NotNull ActionComponentApi actionComponentApi, @NotNull AccountComponentApi accountComponent);
    }

    @NotNull
    SessionListLogoutButtonMapper getMapper();

    @NotNull
    SessionListLogoutButtonViewFactory getViewFactory();

    @NotNull
    SessionListViewModel getViewModel();
}
