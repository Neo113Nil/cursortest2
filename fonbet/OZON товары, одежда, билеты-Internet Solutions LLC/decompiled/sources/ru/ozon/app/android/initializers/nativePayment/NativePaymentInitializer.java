package ru.ozon.app.android.initializers.nativePayment;

import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import xe.C10727i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/initializers/nativePayment/NativePaymentInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "googlePayManager", "Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "config", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "context", "Landroid/content/Context;", "<init>", "(Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;Landroid/content/Context;)V", "init", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NativePaymentInitializer implements ActionInitializer {

    @NotNull
    private final AndroidPlatformComponentConfig config;

    @NotNull
    private final Context context;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final GooglePayManager googlePayManager;

    public NativePaymentInitializer(@NotNull GooglePayManager googlePayManager, @NotNull FeatureChecker featureChecker, @NotNull AndroidPlatformComponentConfig config, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        this.googlePayManager = googlePayManager;
        this.featureChecker = featureChecker;
        this.config = config;
        this.context = context;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        ProcessLifecycleOwner processLifecycleOwner;
        int i11 = ProcessLifecycleOwner.f43231j;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.initializers.nativePayment.NativePaymentInitializer$init$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                ProcessLifecycleOwner processLifecycleOwner2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                processLifecycleOwner2 = ProcessLifecycleOwner.f43230i;
                C10727i.c(K.a(processLifecycleOwner2), null, null, new NativePaymentInitializer$init$1$onStart$1(NativePaymentInitializer.this, null), 3);
            }
        });
    }
}
