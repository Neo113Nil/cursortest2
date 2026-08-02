package ru.ozon.app.android.initializers;

import Kr.b;
import Mc.a;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractor;
import ru.ozon.app.android.initializers.AdvertisingMessagingInitializer;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import uc.i;
import vc.C10302g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/initializers/AdvertisingMessagingInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "advertisingMessagingInteractor", "Lru/ozon/app/android/ads/data/messaging/AdvertisingMessagingInteractor;", "<init>", "(Lru/ozon/app/android/ads/data/messaging/AdvertisingMessagingInteractor;)V", "init", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvertisingMessagingInitializer implements ActionInitializer {

    @NotNull
    private final AdvertisingMessagingInteractor advertisingMessagingInteractor;

    public AdvertisingMessagingInitializer(@NotNull AdvertisingMessagingInteractor advertisingMessagingInteractor) {
        Intrinsics.checkNotNullParameter(advertisingMessagingInteractor, "advertisingMessagingInteractor");
        this.advertisingMessagingInteractor = advertisingMessagingInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(AdvertisingMessagingInitializer advertisingMessagingInitializer) {
        advertisingMessagingInitializer.advertisingMessagingInteractor.loadAdvertisingInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1() {
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    @SuppressLint({"CheckResult"})
    public void init() {
        new C10302g(new InterfaceC9019a() { // from class: Ny.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                AdvertisingMessagingInitializer.init$lambda$0(AdvertisingMessagingInitializer.this);
            }
        }).k(a.b()).a(new i(new b(new AdvertisingMessagingInitializer$init$3(Lm0.a.f17149a), 2), new Ny.b()));
    }
}
