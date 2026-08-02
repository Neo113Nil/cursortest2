package Qa;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: Qa.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC1515e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1516f f9575a;

    public /* synthetic */ ServiceConnectionC1515e(C1516f c1516f, AbstractC1514d abstractC1514d) {
        this.f9575a = c1516f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        G g10;
        g10 = this.f9575a.f9578b;
        g10.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f9575a.c().post(new C1512b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        G g10;
        g10 = this.f9575a.f9578b;
        g10.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f9575a.c().post(new C1513c(this));
    }
}
