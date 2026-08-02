package ru.ozon.app.android.cabinet.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.domain.session.receiver.AuthDeeplinkReceiver;

/* loaded from: classes6.dex */
public final class AuthModule_Companion_ProvideAuthDeeplinkReceiverFactory implements e<AuthDeeplinkReceiver> {
    public static AuthDeeplinkReceiver provideAuthDeeplinkReceiver() {
        AuthDeeplinkReceiver provideAuthDeeplinkReceiver = AuthModule.INSTANCE.provideAuthDeeplinkReceiver();
        j.d(provideAuthDeeplinkReceiver);
        return provideAuthDeeplinkReceiver;
    }
}
