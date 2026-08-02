package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.ICarApp;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import com.mbridge.msdk.MBridgeConstans;
import java.security.InvalidParameterException;
import java.util.Objects;
import xsna.hgv;
import xsna.is9;
import xsna.lhg;
import xsna.rro0;
import xsna.vsi0;

/* loaded from: classes11.dex */
final class CarAppBinder extends ICarApp.Stub {

    @Nullable
    private vsi0 mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;

    @Nullable
    private HandshakeInfo mHandshakeInfo;

    @Nullable
    private hgv mHostValidator;

    @Nullable
    private CarAppService mService;

    public CarAppBinder(@NonNull CarAppService carAppService, @NonNull SessionInfo sessionInfo) {
        this.mService = carAppService;
        this.mCurrentSessionInfo = sessionInfo;
    }

    @Nullable
    private Lifecycle getCurrentLifecycle() {
        return null;
    }

    private hgv getHostValidator() {
        CarAppService carAppService = this.mService;
        Objects.requireNonNull(carAppService);
        carAppService.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getManager$7(String str, IOnDoneCallback iOnDoneCallback) {
        Objects.requireNonNull(this.mCurrentSession);
        str.getClass();
        if (str.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
            throw null;
        }
        if (str.equals(NotificationCompat.CATEGORY_NAVIGATION)) {
            throw null;
        }
        Log.e("CarApp", str.concat("%s is not a valid manager"));
        RemoteUtils.e(iOnDoneCallback, new InvalidParameterException(str.concat(" is not a valid manager type")), "getManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$onAppCreate$0(ICarHost iCarHost, Configuration configuration, Intent intent) throws BundlerException {
        Objects.requireNonNull(this.mService);
        Objects.requireNonNull(this.mCurrentSessionInfo);
        throw new RuntimeException("Please override and implement CarAppService#onCreateSession(SessionInfo).");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppPause$3() throws BundlerException {
        vsi0 vsi0Var = this.mCurrentSession;
        Objects.requireNonNull(vsi0Var);
        vsi0Var.a(Lifecycle.Event.ON_PAUSE);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppResume$2() throws BundlerException {
        vsi0 vsi0Var = this.mCurrentSession;
        Objects.requireNonNull(vsi0Var);
        vsi0Var.a(Lifecycle.Event.ON_RESUME);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStart$1() throws BundlerException {
        vsi0 vsi0Var = this.mCurrentSession;
        Objects.requireNonNull(vsi0Var);
        vsi0Var.a(Lifecycle.Event.ON_START);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStop$4() throws BundlerException {
        vsi0 vsi0Var = this.mCurrentSession;
        Objects.requireNonNull(vsi0Var);
        vsi0Var.a(Lifecycle.Event.ON_STOP);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onConfigurationChanged$6(Configuration configuration) throws BundlerException {
        vsi0 vsi0Var = this.mCurrentSession;
        Objects.requireNonNull(vsi0Var);
        onConfigurationChangedInternal(vsi0Var, configuration);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onNewIntent$5(Intent intent) throws BundlerException {
        vsi0 vsi0Var = this.mCurrentSession;
        Objects.requireNonNull(vsi0Var);
        onNewIntentInternal(vsi0Var, intent);
        return null;
    }

    private void onConfigurationChangedInternal(vsi0 vsi0Var, Configuration configuration) {
        rro0.a();
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(configuration);
        }
        vsi0Var.getClass();
        throw null;
    }

    private void onNewIntentInternal(vsi0 vsi0Var, Intent intent) {
        rro0.a();
        vsi0Var.getClass();
    }

    public void destroy() {
        onDestroyLifecycle();
        this.mCurrentSession = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        try {
            CarAppService carAppService = this.mService;
            Objects.requireNonNull(carAppService);
            if (carAppService.b == null) {
                carAppService.b = AppInfo.create(carAppService);
            }
            RemoteUtils.f(iOnDoneCallback, carAppService.b, "getAppInfo");
        } catch (IllegalArgumentException e) {
            RemoteUtils.e(iOnDoneCallback, e, "getAppInfo");
        }
    }

    @Nullable
    public vsi0 getCurrentSession() {
        return this.mCurrentSession;
    }

    @NonNull
    public SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    @Nullable
    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(@NonNull final String str, final IOnDoneCallback iOnDoneCallback) {
        rro0.b(new Runnable() { // from class: androidx.car.app.j
            @Override // java.lang.Runnable
            public final void run() {
                CarAppBinder.this.lambda$getManager$7(str, iOnDoneCallback);
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(intent);
        }
        RemoteUtils.b(iOnDoneCallback, "onAppCreate", new RemoteUtils.a() { // from class: androidx.car.app.i
            @Override // androidx.car.app.utils.RemoteUtils.a
            public final Object a() {
                Object lambda$onAppCreate$0;
                lambda$onAppCreate$0 = CarAppBinder.this.lambda$onAppCreate$0(iCarHost, configuration, intent);
                return lambda$onAppCreate$0;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.c(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new RemoteUtils.a() { // from class: androidx.car.app.f
            @Override // androidx.car.app.utils.RemoteUtils.a
            public final Object a() {
                Object lambda$onAppPause$3;
                lambda$onAppPause$3 = CarAppBinder.this.lambda$onAppPause$3();
                return lambda$onAppPause$3;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.c(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new RemoteUtils.a() { // from class: androidx.car.app.l
            @Override // androidx.car.app.utils.RemoteUtils.a
            public final Object a() {
                Object lambda$onAppResume$2;
                lambda$onAppResume$2 = CarAppBinder.this.lambda$onAppResume$2();
                return lambda$onAppResume$2;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.c(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new RemoteUtils.a() { // from class: androidx.car.app.g
            @Override // androidx.car.app.utils.RemoteUtils.a
            public final Object a() {
                Object lambda$onAppStart$1;
                lambda$onAppStart$1 = CarAppBinder.this.lambda$onAppStart$1();
                return lambda$onAppStart$1;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.c(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new RemoteUtils.a() { // from class: androidx.car.app.h
            @Override // androidx.car.app.utils.RemoteUtils.a
            public final Object a() {
                Object lambda$onAppStop$4;
                lambda$onAppStop$4 = CarAppBinder.this.lambda$onAppStop$4();
                return lambda$onAppStop$4;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.c(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new RemoteUtils.a() { // from class: androidx.car.app.e
            @Override // androidx.car.app.utils.RemoteUtils.a
            public final Object a() {
                Object lambda$onConfigurationChanged$6;
                lambda$onConfigurationChanged$6 = CarAppBinder.this.lambda$onConfigurationChanged$6(configuration);
                return lambda$onConfigurationChanged$6;
            }
        });
    }

    public void onDestroyLifecycle() {
        this.mCurrentSession = null;
    }

    @Override // androidx.car.app.ICarApp
    public void onHandshakeCompleted(Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
        Objects.requireNonNull(this.mService);
        try {
            String hostPackageName = ((HandshakeInfo) bundleable.d()).getHostPackageName();
            Binder.getCallingUid();
            Objects.requireNonNull(hostPackageName);
            getHostValidator();
            throw null;
        } catch (BundlerException | IllegalArgumentException e) {
            RemoteUtils.e(iOnDoneCallback, e, "onHandshakeCompleted");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(final Intent intent, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.c(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new RemoteUtils.a() { // from class: androidx.car.app.k
            @Override // androidx.car.app.utils.RemoteUtils.a
            public final Object a() {
                Object lambda$onNewIntent$5;
                lambda$onNewIntent$5 = CarAppBinder.this.lambda$onNewIntent$5(intent);
                return lambda$onNewIntent$5;
            }
        });
    }

    public void setHandshakeInfo(@NonNull HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (hostCarAppApiLevel < 1 || hostCarAppApiLevel > is9.a()) {
            throw new IllegalArgumentException(lhg.a(hostCarAppApiLevel, "Invalid Car App API level received: "));
        }
        this.mHandshakeInfo = handshakeInfo;
    }

    public void onAutoDriveEnabled() {
    }
}
