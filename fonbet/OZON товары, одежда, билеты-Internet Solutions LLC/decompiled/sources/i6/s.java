package i6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import androidx.annotation.NonNull;
import i6.InterfaceC7015b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p6.f;

/* loaded from: classes.dex */
final class s {

    /* renamed from: d, reason: collision with root package name */
    private static volatile s f65900d;

    /* renamed from: a, reason: collision with root package name */
    private final c f65901a;

    /* renamed from: b, reason: collision with root package name */
    final HashSet f65902b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f65903c;

    final class a implements f.b<ConnectivityManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f65904a;

        a(Context context) {
            this.f65904a = context;
        }

        @Override // p6.f.b
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.f65904a.getSystemService("connectivity");
        }
    }

    final class b implements InterfaceC7015b.a {
        b() {
        }

        @Override // i6.InterfaceC7015b.a
        public final void a(boolean z11) {
            ArrayList arrayList;
            p6.l.a();
            synchronized (s.this) {
                arrayList = new ArrayList(s.this.f65902b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC7015b.a) it.next()).a(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f65906a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC7015b.a f65907b;

        /* renamed from: c, reason: collision with root package name */
        private final f.b<ConnectivityManager> f65908c;

        /* renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f65909d = new a();

        final class a extends ConnectivityManager.NetworkCallback {
            a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(@NonNull Network network) {
                p6.l.j(new t(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(@NonNull Network network) {
                p6.l.j(new t(this, false));
            }
        }

        c(f.b<ConnectivityManager> bVar, InterfaceC7015b.a aVar) {
            this.f65908c = bVar;
            this.f65907b = aVar;
        }

        @SuppressLint({"MissingPermission"})
        public final boolean a() {
            f.b<ConnectivityManager> bVar = this.f65908c;
            this.f65906a = bVar.get().getActiveNetwork() != null;
            try {
                bVar.get().registerDefaultNetworkCallback(this.f65909d);
                return true;
            } catch (RuntimeException e11) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e11);
                }
                return false;
            }
        }

        public final void b() {
            this.f65908c.get().unregisterNetworkCallback(this.f65909d);
        }
    }

    private s(@NonNull Context context) {
        this.f65901a = new c(p6.f.a(new a(context)), new b());
    }

    static s a(@NonNull Context context) {
        if (f65900d == null) {
            synchronized (s.class) {
                try {
                    if (f65900d == null) {
                        f65900d = new s(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f65900d;
    }

    final synchronized void b(InterfaceC7015b.a aVar) {
        this.f65902b.add(aVar);
        if (!this.f65903c && !this.f65902b.isEmpty()) {
            this.f65903c = this.f65901a.a();
        }
    }

    final synchronized void c(InterfaceC7015b.a aVar) {
        this.f65902b.remove(aVar);
        if (this.f65903c && this.f65902b.isEmpty()) {
            this.f65901a.b();
            this.f65903c = false;
        }
    }
}
