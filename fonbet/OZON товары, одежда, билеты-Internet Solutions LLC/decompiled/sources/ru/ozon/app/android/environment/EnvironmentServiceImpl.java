package ru.ozon.app.android.environment;

import Hg0.a;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.environment.OnEnvironmentChangeListener;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001c\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0010¨\u0006'"}, d2 = {"Lru/ozon/app/android/environment/EnvironmentServiceImpl;", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "Landroid/app/Application;", "application", "Lru/ozon/app/android/platform/flavor/FlavorType;", "flavorType", "<init>", "(Landroid/app/Application;Lru/ozon/app/android/platform/flavor/FlavorType;)V", "", "isProd", "", "onChanged", "(Z)V", "enable", "()V", "changeEnvFromArg", "()Z", "isStage", "changeEnvironment", "toggleEnvironment", "Lru/ozon/app/android/storage/environment/OnEnvironmentChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnEnvironmentChangeListener", "(Lru/ozon/app/android/storage/environment/OnEnvironmentChangeListener;)V", "Lru/ozon/app/android/platform/flavor/FlavorType;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "sharedPreferences", "Landroid/content/SharedPreferences;", "", "environmentChangeListeners", "Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isProdEnv", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isChanged", "Z", "isEnabled", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CommitPrefEdits"})
/* loaded from: classes6.dex */
public final class EnvironmentServiceImpl implements EnvironmentService {

    @NotNull
    private final List<OnEnvironmentChangeListener> environmentChangeListeners;

    @NotNull
    private final FlavorType flavorType;
    private boolean isChanged;

    @NotNull
    private final AtomicBoolean isProdEnv;
    private final SharedPreferences sharedPreferences;
    public static final int $stable = 8;

    public EnvironmentServiceImpl(@NotNull Application application, @NotNull FlavorType flavorType) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(flavorType, "flavorType");
        this.flavorType = flavorType;
        SharedPreferences sharedPreferences = application.getSharedPreferences("OZON_PREFS", 0);
        this.sharedPreferences = sharedPreferences;
        this.environmentChangeListeners = new ArrayList();
        this.isProdEnv = new AtomicBoolean(sharedPreferences.getBoolean("IS_PROD_ENV", true));
        if (flavorType == FlavorType.f93213QA) {
            changeEnvFromArg();
            enable();
        }
    }

    private final void changeEnvFromArg() {
        if (a.b("debug.ozon.envStg") != null) {
            changeEnvironment(!r0.booleanValue());
        }
    }

    private final void enable() {
        this.sharedPreferences.edit().putBoolean("BACKEND_SWITCH_ENABLED", true).apply();
    }

    private final void onChanged(boolean isProd) {
        if (this.flavorType != FlavorType.f93213QA) {
            return;
        }
        this.isChanged = true;
        Iterator<T> it = this.environmentChangeListeners.iterator();
        while (it.hasNext()) {
            ((OnEnvironmentChangeListener) it.next()).onChanged(isProd);
        }
    }

    @Override // ru.ozon.app.android.storage.environment.EnvironmentService
    public void addOnEnvironmentChangeListener(@NotNull OnEnvironmentChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.isChanged) {
            listener.onChanged(this.isProdEnv.get());
        }
        this.environmentChangeListeners.add(listener);
    }

    @Override // ru.ozon.app.android.storage.environment.EnvironmentService
    public void changeEnvironment(boolean isProd) {
        if (this.isProdEnv.compareAndSet(!isProd, isProd)) {
            this.sharedPreferences.edit().putBoolean("IS_PROD_ENV", isProd).commit();
            onChanged(isProd);
        }
    }

    @Override // ru.ozon.app.android.storage.environment.EnvironmentService
    public boolean isEnabled() {
        return this.sharedPreferences.getBoolean("BACKEND_SWITCH_ENABLED", false);
    }

    @Override // ru.ozon.app.android.storage.environment.EnvironmentService
    public boolean isProd() {
        return this.isProdEnv.get();
    }

    @Override // ru.ozon.app.android.storage.environment.EnvironmentService
    public boolean isStage() {
        return !isProd();
    }

    @Override // ru.ozon.app.android.storage.environment.EnvironmentService
    public void toggleEnvironment() {
        changeEnvironment(!this.isProdEnv.get());
    }
}
