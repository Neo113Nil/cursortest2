package T7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class N implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11019a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f11020b;

    /* renamed from: c, reason: collision with root package name */
    public b f11021c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11022d;

    /* renamed from: e, reason: collision with root package name */
    public Messenger f11023e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11024f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11025g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11026h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11027i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11028j;

    public static final class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(message, "message");
                N.this.d(message);
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }
    }

    public interface b {
        void a(Bundle bundle);
    }

    public N(Context context, int i10, int i11, int i12, String applicationId, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f11019a = applicationContext != null ? applicationContext : context;
        this.f11024f = i10;
        this.f11025g = i11;
        this.f11026h = applicationId;
        this.f11027i = i12;
        this.f11028j = str;
        this.f11020b = new a();
    }

    public final void a(Bundle bundle) {
        if (this.f11022d) {
            this.f11022d = false;
            b bVar = this.f11021c;
            if (bVar == null) {
                return;
            }
            bVar.a(bundle);
        }
    }

    public final void b() {
        this.f11022d = false;
    }

    public final Context c() {
        return this.f11019a;
    }

    public final void d(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.what == this.f11025g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                a(null);
            } else {
                a(data);
            }
            try {
                this.f11019a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public abstract void e(Bundle bundle);

    public final void f() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f11026h);
        String str = this.f11028j;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        e(bundle);
        Message obtain = Message.obtain((Handler) null, this.f11024f);
        obtain.arg1 = this.f11027i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f11020b);
        try {
            Messenger messenger = this.f11023e;
            if (messenger == null) {
                return;
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    public final void g(b bVar) {
        this.f11021c = bVar;
    }

    public final boolean h() {
        synchronized (this) {
            boolean z10 = false;
            if (this.f11022d) {
                return false;
            }
            M m10 = M.f11009a;
            if (M.w(this.f11027i) == -1) {
                return false;
            }
            Intent m11 = M.m(c());
            if (m11 != null) {
                z10 = true;
                this.f11022d = true;
                c().bindService(m11, this, 1);
            }
            return z10;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f11023e = new Messenger(service);
        f();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f11023e = null;
        try {
            this.f11019a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
