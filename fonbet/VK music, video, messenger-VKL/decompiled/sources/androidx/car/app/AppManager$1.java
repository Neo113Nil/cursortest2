package androidx.car.app;

import android.content.pm.PackageManager;
import androidx.car.app.IAppManager;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;
import xsna.lch0;
import xsna.p7;

/* loaded from: classes11.dex */
class AppManager$1 extends IAppManager.Stub {
    final /* synthetic */ d this$0;
    final /* synthetic */ n val$carContext;

    public AppManager$1(d dVar, n nVar) {
        this.this$0 = dVar;
        this.val$carContext = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$onBackPressed$0(n nVar) throws BundlerException {
        nVar.getClass();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$startLocationUpdates$1(n nVar) throws BundlerException {
        ((d) nVar.a(d.class)).getClass();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$stopLocationUpdates$2(n nVar) throws BundlerException {
        ((d) nVar.a(d.class)).getClass();
        throw null;
    }

    @Override // androidx.car.app.IAppManager
    public void getTemplate(IOnDoneCallback iOnDoneCallback) {
        this.this$0.getClass();
        lch0 lch0Var = (lch0) this.val$carContext.a(lch0.class);
        Objects.requireNonNull(lch0Var);
        RemoteUtils.c(null, iOnDoneCallback, "getTemplate", new p7(lch0Var, 1));
    }

    @Override // androidx.car.app.IAppManager
    public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
        this.this$0.getClass();
        RemoteUtils.c(null, iOnDoneCallback, "onBackPressed", new a());
    }

    @Override // androidx.car.app.IAppManager
    public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        PackageManager packageManager = this.val$carContext.getPackageManager();
        boolean z = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", this.val$carContext.getPackageName()) == -1;
        boolean z2 = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", this.val$carContext.getPackageName()) == -1;
        if (z && z2) {
            RemoteUtils.e(iOnDoneCallback, new SecurityException("Location permission(s) not granted."), "startLocationUpdates");
        }
        this.this$0.getClass();
        RemoteUtils.c(null, iOnDoneCallback, "startLocationUpdates", new c());
    }

    @Override // androidx.car.app.IAppManager
    public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        this.this$0.getClass();
        RemoteUtils.c(null, iOnDoneCallback, "stopLocationUpdates", new b());
    }
}
