package ru.ozon.app.android.initializers;

import BZ.a;
import Ej.b;
import android.app.Activity;
import android.app.Application;
import gk0.q;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/initializers/ScreenRouterActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Landroid/app/Application;", "application", "", "LIZ/a;", "deeplinkHandlers", "LEZ/a;", "navigationHandlers", "LBZ/a;", "appHandlers", "LnZ/a;", "compass", "<init>", "(Landroid/app/Application;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;LnZ/a;)V", "", "init", "()V", "Landroid/app/Application;", "Ljava/util/Set;", "LnZ/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScreenRouterActionInitializer implements ActionInitializer {

    @NotNull
    private final Set<a> appHandlers;

    @NotNull
    private final Application application;

    @NotNull
    private final C8475a compass;

    @NotNull
    private final Set<IZ.a> deeplinkHandlers;

    @NotNull
    private final Set<EZ.a<?>> navigationHandlers;

    public ScreenRouterActionInitializer(@NotNull Application application, @NotNull Set<IZ.a> deeplinkHandlers, @NotNull Set<EZ.a<?>> navigationHandlers, @NotNull Set<a> appHandlers, @NotNull C8475a compass) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(deeplinkHandlers, "deeplinkHandlers");
        Intrinsics.checkNotNullParameter(navigationHandlers, "navigationHandlers");
        Intrinsics.checkNotNullParameter(appHandlers, "appHandlers");
        Intrinsics.checkNotNullParameter(compass, "compass");
        this.application = application;
        this.deeplinkHandlers = deeplinkHandlers;
        this.navigationHandlers = navigationHandlers;
        this.appHandlers = appHandlers;
        this.compass = compass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(Activity activity, int i11) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        q qVar = q.f64554a;
        qVar.b(activity);
        qVar.d(activity, null);
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        this.compass.h(this.application);
        this.compass.f(this.deeplinkHandlers);
        this.compass.g(this.navigationHandlers);
        this.compass.e(this.appHandlers);
        this.compass.l().i(new b());
    }
}
