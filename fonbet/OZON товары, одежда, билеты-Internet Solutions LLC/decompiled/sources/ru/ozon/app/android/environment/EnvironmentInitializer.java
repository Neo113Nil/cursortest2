package ru.ozon.app.android.environment;

import He.b;
import Ob0.a;
import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.environment.EnvironmentInitializer;
import ru.ozon.app.android.network.auth.AuthNetworkService;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.environment.OnEnvironmentChangeListener;
import xe.C10720e0;
import xe.C10727i;
import xe.N;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/environment/EnvironmentInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Landroid/app/Application;", "application", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/app/android/network/auth/AuthNetworkService;", "authNetworkService", "LOb0/a;", "ozonIdAppApi", "<init>", "(Landroid/app/Application;Lru/ozon/app/android/storage/environment/EnvironmentService;Lru/ozon/app/android/network/auth/AuthNetworkService;LOb0/a;)V", "", "init", "()V", "Landroid/app/Application;", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "Lru/ozon/app/android/network/auth/AuthNetworkService;", "LOb0/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EnvironmentInitializer implements ActionInitializer {

    @NotNull
    private final Application application;

    @NotNull
    private final AuthNetworkService authNetworkService;

    @NotNull
    private final EnvironmentService environmentService;

    @NotNull
    private final a ozonIdAppApi;

    public EnvironmentInitializer(@NotNull Application application, @NotNull EnvironmentService environmentService, @NotNull AuthNetworkService authNetworkService, @NotNull a ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(authNetworkService, "authNetworkService");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        this.application = application;
        this.environmentService = environmentService;
        this.authNetworkService = authNetworkService;
        this.ozonIdAppApi = ozonIdAppApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(EnvironmentInitializer environmentInitializer, boolean z11) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(N.a(b.f10879b), null, null, new EnvironmentInitializer$init$1$1(environmentInitializer, null), 3);
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        this.environmentService.addOnEnvironmentChangeListener(new OnEnvironmentChangeListener() { // from class: Ks.a
            @Override // ru.ozon.app.android.storage.environment.OnEnvironmentChangeListener
            public final void onChanged(boolean z11) {
                EnvironmentInitializer.init$lambda$0(EnvironmentInitializer.this, z11);
            }
        });
    }
}
