package w;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import g.InterfaceC4311a;
import g.InterfaceC4312b;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4312b f67194a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f67195b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f67196c;

    public c(InterfaceC4312b interfaceC4312b, ComponentName componentName, Context context) {
        this.f67194a = interfaceC4312b;
        this.f67195b = componentName;
        this.f67196c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    public final InterfaceC4311a.AbstractBinderC0678a c(w.b bVar) {
        return new b(bVar);
    }

    public f d(w.b bVar) {
        return e(bVar, null);
    }

    public final f e(w.b bVar, PendingIntent pendingIntent) {
        boolean E02;
        InterfaceC4311a.AbstractBinderC0678a c10 = c(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                E02 = this.f67194a.G(c10, bundle);
            } else {
                E02 = this.f67194a.E0(c10);
            }
            if (E02) {
                return new f(this.f67194a, c10, this.f67195b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean f(long j10) {
        try {
            return this.f67194a.f0(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public class a extends e {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f67197b;

        public a(Context context) {
            this.f67197b = context;
        }

        @Override // w.e
        public final void a(ComponentName componentName, c cVar) {
            cVar.f(0L);
            this.f67197b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class b extends InterfaceC4311a.AbstractBinderC0678a {

        /* renamed from: a, reason: collision with root package name */
        public Handler f67198a = new Handler(Looper.getMainLooper());

        public b(w.b bVar) {
        }

        @Override // g.InterfaceC4311a
        public Bundle y(String str, Bundle bundle) {
            return null;
        }

        @Override // g.InterfaceC4311a
        public void G0(Bundle bundle) {
        }

        @Override // g.InterfaceC4311a
        public void P(Bundle bundle) {
        }

        @Override // g.InterfaceC4311a
        public void g0(Bundle bundle) {
        }

        @Override // g.InterfaceC4311a
        public void j0(Bundle bundle) {
        }

        @Override // g.InterfaceC4311a
        public void C0(String str, Bundle bundle) {
        }

        @Override // g.InterfaceC4311a
        public void O(String str, Bundle bundle) {
        }

        @Override // g.InterfaceC4311a
        public void v0(int i10, Bundle bundle) {
        }

        @Override // g.InterfaceC4311a
        public void m0(int i10, int i11, Bundle bundle) {
        }

        @Override // g.InterfaceC4311a
        public void I0(int i10, Uri uri, boolean z10, Bundle bundle) {
        }

        @Override // g.InterfaceC4311a
        public void q(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
        }
    }
}
