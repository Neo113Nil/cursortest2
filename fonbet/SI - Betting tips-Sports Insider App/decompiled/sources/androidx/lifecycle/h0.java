package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h0 extends Service implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.v0 f2183a = new androidx.appcompat.app.v0(this);

    @Override // androidx.lifecycle.e0
    public final y getLifecycle() {
        return (g0) this.f2183a.f364b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        androidx.appcompat.app.v0 v0Var = this.f2183a;
        v0Var.getClass();
        v0Var.V(w.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        androidx.appcompat.app.v0 v0Var = this.f2183a;
        v0Var.getClass();
        v0Var.V(w.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        androidx.appcompat.app.v0 v0Var = this.f2183a;
        v0Var.getClass();
        v0Var.V(w.ON_STOP);
        v0Var.V(w.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i5) {
        androidx.appcompat.app.v0 v0Var = this.f2183a;
        v0Var.getClass();
        v0Var.V(w.ON_START);
        super.onStart(intent, i5);
    }
}
