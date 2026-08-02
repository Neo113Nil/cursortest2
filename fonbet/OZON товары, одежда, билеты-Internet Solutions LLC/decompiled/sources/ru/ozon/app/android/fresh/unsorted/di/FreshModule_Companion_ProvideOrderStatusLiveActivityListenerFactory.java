package ru.ozon.app.android.fresh.unsorted.di;

import Jb.e;
import Jb.j;
import Pc.a;
import android.app.Application;
import bh0.InterfaceC5666b;
import ru.ozon.app.android.fresh.unsorted.liveActivity.LiveActivityNotificationProvider;

/* loaded from: classes6.dex */
public final class FreshModule_Companion_ProvideOrderStatusLiveActivityListenerFactory implements e<InterfaceC5666b> {
    private final a<Application> applicationProvider;
    private final a<LiveActivityNotificationProvider> notificationProvider;

    public FreshModule_Companion_ProvideOrderStatusLiveActivityListenerFactory(a<Application> aVar, a<LiveActivityNotificationProvider> aVar2) {
        this.applicationProvider = aVar;
        this.notificationProvider = aVar2;
    }

    public static FreshModule_Companion_ProvideOrderStatusLiveActivityListenerFactory create(a<Application> aVar, a<LiveActivityNotificationProvider> aVar2) {
        return new FreshModule_Companion_ProvideOrderStatusLiveActivityListenerFactory(aVar, aVar2);
    }

    public static InterfaceC5666b provideOrderStatusLiveActivityListener(Application application, LiveActivityNotificationProvider liveActivityNotificationProvider) {
        InterfaceC5666b provideOrderStatusLiveActivityListener = FreshModule.INSTANCE.provideOrderStatusLiveActivityListener(application, liveActivityNotificationProvider);
        j.d(provideOrderStatusLiveActivityListener);
        return provideOrderStatusLiveActivityListener;
    }

    @Override // Pc.a
    public InterfaceC5666b get() {
        return provideOrderStatusLiveActivityListener(this.applicationProvider.get(), this.notificationProvider.get());
    }
}
