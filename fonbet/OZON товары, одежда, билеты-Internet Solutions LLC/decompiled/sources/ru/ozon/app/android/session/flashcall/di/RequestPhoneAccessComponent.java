package ru.ozon.app.android.session.flashcall.di;

import Pc.a;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.session.flashcall.core.RequestPhoneAccessMapper;
import ru.ozon.app.android.session.flashcall.presentation.RequestPhoneAccessViewModel;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\nJ\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/session/flashcall/di/RequestPhoneAccessComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LPc/a;", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessViewModel;", "getWidgetViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/session/flashcall/core/RequestPhoneAccessMapper;", "getMapper", "()Lru/ozon/app/android/session/flashcall/core/RequestPhoneAccessMapper;", "Factory", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RequestPhoneAccessComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/flashcall/di/RequestPhoneAccessComponent$Factory;", "", "create", "Lru/ozon/app/android/session/flashcall/di/RequestPhoneAccessComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        RequestPhoneAccessComponent create(@NotNull NetworkComponentApi networkComponentApi, @NotNull ActionComponentApi actionComponentApi);
    }

    @NotNull
    RequestPhoneAccessMapper getMapper();

    @NotNull
    a<RequestPhoneAccessViewModel> getWidgetViewModelProvider();
}
