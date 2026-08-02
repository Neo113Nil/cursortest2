package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.Lifecycle;
import xsna.f5z;
import xsna.ozl;

/* compiled from: LifecycleService.kt */
/* loaded from: classes12.dex */
public class LifecycleService extends Service implements f5z {
    public final c0 b = new c0(this);

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.b.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.a(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.a(Lifecycle.Event.ON_STOP);
        c0Var.a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @ozl
    public final void onStart(Intent intent, int i) {
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.a(Lifecycle.Event.ON_START);
        super.onStart(intent, i);
    }
}
