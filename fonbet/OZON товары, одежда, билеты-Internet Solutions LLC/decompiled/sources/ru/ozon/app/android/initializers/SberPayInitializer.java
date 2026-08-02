package ru.ozon.app.android.initializers;

import He.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayManager;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import xe.C10720e0;
import xe.C10727i;
import xe.N;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/initializers/SberPayInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "sberPayManager", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManager;", "<init>", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManager;)V", "init", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SberPayInitializer implements ActionInitializer {

    @NotNull
    private final SberPayManager sberPayManager;

    public SberPayInitializer(@NotNull SberPayManager sberPayManager) {
        Intrinsics.checkNotNullParameter(sberPayManager, "sberPayManager");
        this.sberPayManager = sberPayManager;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(N.a(b.f10879b), null, null, new SberPayInitializer$init$1(this, null), 3);
    }
}
