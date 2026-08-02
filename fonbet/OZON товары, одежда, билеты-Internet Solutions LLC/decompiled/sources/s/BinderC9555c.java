package s;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import b.InterfaceC5493a;
import com.vk.id.internal.auth.AuthActivity$callback$1;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class BinderC9555c extends InterfaceC5493a.AbstractBinderC0825a {

    /* renamed from: e, reason: collision with root package name */
    private Handler f98011e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AuthActivity$callback$1 f98012f;

    /* renamed from: s.c$a */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f98013a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f98014b;

        a(int i11, Bundle bundle) {
            this.f98013a = i11;
            this.f98014b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BinderC9555c.this.f98012f.onNavigationEvent(this.f98013a, this.f98014b);
        }
    }

    /* renamed from: s.c$b */
    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98016a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f98017b;

        b(String str, Bundle bundle) {
            this.f98016a = str;
            this.f98017b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BinderC9555c.this.f98012f.extraCallback(this.f98016a, this.f98017b);
        }
    }

    /* renamed from: s.c$c, reason: collision with other inner class name */
    final class RunnableC2158c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f98019a;

        RunnableC2158c(Bundle bundle) {
            this.f98019a = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BinderC9555c.this.f98012f.onMessageChannelReady(this.f98019a);
        }
    }

    /* renamed from: s.c$d */
    final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98021a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f98022b;

        d(String str, Bundle bundle) {
            this.f98021a = str;
            this.f98022b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BinderC9555c.this.f98012f.onPostMessage(this.f98021a, this.f98022b);
        }
    }

    /* renamed from: s.c$e */
    final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f98024a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f98025b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f98026c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f98027d;

        e(int i11, Uri uri, boolean z11, Bundle bundle) {
            this.f98024a = i11;
            this.f98025b = uri;
            this.f98026c = z11;
            this.f98027d = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BinderC9555c.this.f98012f.onRelationshipValidationResult(this.f98024a, this.f98025b, this.f98026c, this.f98027d);
        }
    }

    BinderC9555c(AuthActivity$callback$1 authActivity$callback$1) {
        this.f98012f = authActivity$callback$1;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.f98011e = new Handler(Looper.getMainLooper());
    }

    @Override // b.InterfaceC5493a
    public final void E(String str, Bundle bundle) throws RemoteException {
        if (this.f98012f == null) {
            return;
        }
        this.f98011e.post(new d(str, bundle));
    }

    @Override // b.InterfaceC5493a
    public final void F(Bundle bundle) throws RemoteException {
        if (this.f98012f == null) {
            return;
        }
        this.f98011e.post(new RunnableC2158c(bundle));
    }

    @Override // b.InterfaceC5493a
    public final void G(int i11, Uri uri, boolean z11, Bundle bundle) throws RemoteException {
        if (this.f98012f == null) {
            return;
        }
        this.f98011e.post(new e(i11, uri, z11, bundle));
    }

    @Override // b.InterfaceC5493a
    public final Bundle d(@NonNull String str, Bundle bundle) throws RemoteException {
        AuthActivity$callback$1 authActivity$callback$1 = this.f98012f;
        if (authActivity$callback$1 == null) {
            return null;
        }
        return authActivity$callback$1.extraCallbackWithResult(str, bundle);
    }

    @Override // b.InterfaceC5493a
    public final void m(int i11, Bundle bundle) {
        if (this.f98012f == null) {
            return;
        }
        this.f98011e.post(new a(i11, bundle));
    }

    @Override // b.InterfaceC5493a
    public final void z(String str, Bundle bundle) throws RemoteException {
        if (this.f98012f == null) {
            return;
        }
        this.f98011e.post(new b(str, bundle));
    }
}
