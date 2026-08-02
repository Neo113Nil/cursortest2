package w;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import g.InterfaceC4311a;
import g.InterfaceC4312b;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f67214a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4312b f67215b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4311a f67216c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f67217d;

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f67218e;

    public f(InterfaceC4312b interfaceC4312b, InterfaceC4311a interfaceC4311a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f67215b = interfaceC4312b;
        this.f67216c = interfaceC4311a;
        this.f67217d = componentName;
        this.f67218e = pendingIntent;
    }

    public final void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f67218e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    public final Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public IBinder c() {
        return this.f67216c.asBinder();
    }

    public ComponentName d() {
        return this.f67217d;
    }

    public PendingIntent e() {
        return this.f67218e;
    }

    public boolean f(Uri uri, Bundle bundle, List list) {
        try {
            return this.f67215b.o(this.f67216c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
