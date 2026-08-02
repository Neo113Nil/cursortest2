package ru.ozon.app.android.fresh.unsorted.di;

import Jb.e;
import Jb.j;
import Pc.a;
import android.app.Application;
import bh0.InterfaceC5666b;
import ru.ozon.app.android.fresh.unsorted.liveActivity.LiveActivityNotificationProvider;

/* loaded from: classes6.dex */
public final class FreshModule_Companion_ProvideClickLiveActivityListenerFactory implements e<InterfaceC5666b> {
    private final a<Application> applicationProvider;
    private final a<LiveActivityNotificationProvider> notificationProvider;

    public FreshModule_Companion_ProvideClickLiveActivityListenerFactory(a<Application> aVar, a<LiveActivityNotificationProvider> aVar2) {
        this.applicationProvider = aVar;
        this.notificationProvider = aVar2;
    }

    public static FreshModule_Companion_ProvideClickLiveActivityListenerFactory create(a<Application> aVar, a<LiveActivityNotificationProvider> aVar2) {
        return new FreshModule_Companion_ProvideClickLiveActivityListenerFactory(aVar, aVar2);
    }

    public static InterfaceC5666b provideClickLiveActivityListener(Application application, LiveActivityNotificationProvider liveActivityNotificationProvider) {
        InterfaceC5666b provideClickLiveActivityListener = FreshModule.INSTANCE.provideClickLiveActivityListener(application, liveActivityNotificationProvider);
        j.d(provideClickLiveActivityListener);
        return provideClickLiveActivityListener;
    }

    @Override // Pc.a
    public InterfaceC5666b get() {
        return provideClickLiveActivityListener(this.applicationProvider.get(), this.notificationProvider.get());
    }
}
