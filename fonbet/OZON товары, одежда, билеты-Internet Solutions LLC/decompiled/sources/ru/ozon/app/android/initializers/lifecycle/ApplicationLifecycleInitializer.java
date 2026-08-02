package ru.ozon.app.android.initializers.lifecycle;

import android.app.Application;
import android.content.ComponentCallbacks;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/initializers/lifecycle/ApplicationLifecycleInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Landroid/app/Application;", "application", "Lru/ozon/app/android/initializers/lifecycle/ApplicationLifecycleObserver;", "applicationLifecycleObserver", "", "Landroid/content/ComponentCallbacks;", "componentCallbacks", "Landroid/app/Application$ActivityLifecycleCallbacks;", "activityLifecycleCallbacks", "<init>", "(Landroid/app/Application;Lru/ozon/app/android/initializers/lifecycle/ApplicationLifecycleObserver;Ljava/util/Set;Ljava/util/Set;)V", "", "init", "()V", "Landroid/app/Application;", "Lru/ozon/app/android/initializers/lifecycle/ApplicationLifecycleObserver;", "Ljava/util/Set;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApplicationLifecycleInitializer implements ActionInitializer {

    @NotNull
    private final Set<Application.ActivityLifecycleCallbacks> activityLifecycleCallbacks;

    @NotNull
    private final Application application;

    @NotNull
    private final ApplicationLifecycleObserver applicationLifecycleObserver;

    @NotNull
    private final Set<ComponentCallbacks> componentCallbacks;

    public ApplicationLifecycleInitializer(@NotNull Application application, @NotNull ApplicationLifecycleObserver applicationLifecycleObserver, @NotNull Set<ComponentCallbacks> componentCallbacks, @NotNull Set<Application.ActivityLifecycleCallbacks> activityLifecycleCallbacks) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(applicationLifecycleObserver, "applicationLifecycleObserver");
        Intrinsics.checkNotNullParameter(componentCallbacks, "componentCallbacks");
        Intrinsics.checkNotNullParameter(activityLifecycleCallbacks, "activityLifecycleCallbacks");
        this.application = application;
        this.applicationLifecycleObserver = applicationLifecycleObserver;
        this.componentCallbacks = componentCallbacks;
        this.activityLifecycleCallbacks = activityLifecycleCallbacks;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        ProcessLifecycleOwner processLifecycleOwner;
        int i11 = ProcessLifecycleOwner.f43231j;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a(this.applicationLifecycleObserver);
        Iterator<T> it = this.activityLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            this.application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) it.next());
        }
        Iterator<T> it2 = this.componentCallbacks.iterator();
        while (it2.hasNext()) {
            this.application.registerComponentCallbacks((ComponentCallbacks) it2.next());
        }
    }
}
