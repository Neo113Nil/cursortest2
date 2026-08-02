package ru.ozon.app.android.bank.push.di.module;

import Jb.e;
import Jb.j;
import android.app.Application;
import eh0.d;

/* loaded from: classes6.dex */
public final class OzonBankPushHandlerModule_Companion_ProvideOzonBankPushHanlderFactory implements e<d> {
    public static d provideOzonBankPushHanlder(Application application) {
        d provideOzonBankPushHanlder = OzonBankPushHandlerModule.INSTANCE.provideOzonBankPushHanlder(application);
        j.d(provideOzonBankPushHanlder);
        return provideOzonBankPushHanlder;
    }
}
