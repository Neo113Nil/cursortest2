package ru.ozon.app.android.session.sessionList.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.sessionList.mapper.CurrentSessionTitleMapper;
import ru.ozon.app.android.session.sessionList.presentation.viewFactory.SessionListTitleViewFactory;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/session/sessionList/di/CurrentSessionTitleComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/session/sessionList/mapper/CurrentSessionTitleMapper;", "getMapper", "()Lru/ozon/app/android/session/sessionList/mapper/CurrentSessionTitleMapper;", "mapper", "Lru/ozon/app/android/session/sessionList/presentation/viewFactory/SessionListTitleViewFactory;", "getViewFactory", "()Lru/ozon/app/android/session/sessionList/presentation/viewFactory/SessionListTitleViewFactory;", "viewFactory", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CurrentSessionTitleComponent extends InterfaceC6958a {
    @NotNull
    CurrentSessionTitleMapper getMapper();

    @NotNull
    SessionListTitleViewFactory getViewFactory();
}
