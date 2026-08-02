package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.util.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static volatile q f30116d;

    /* renamed from: a, reason: collision with root package name */
    public final c f30117a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f30118b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f30119c;

    public class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f30120a;

        public a(Context context) {
            this.f30120a = context;
        }

        @Override // com.bumptech.glide.util.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f30120a.getSystemService("connectivity");
        }
    }

    public class b implements b.a {
        public b() {
        }

        @Override // com.bumptech.glide.manager.b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            com.bumptech.glide.util.l.b();
            synchronized (q.this) {
                arrayList = new ArrayList(q.this.f30118b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z10);
            }
        }
    }

    public interface c {
        boolean register();

        void unregister();
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f30123a;

        /* renamed from: b, reason: collision with root package name */
        public final b.a f30124b;

        /* renamed from: c, reason: collision with root package name */
        public final f.b f30125c;

        /* renamed from: d, reason: collision with root package name */
        public final ConnectivityManager.NetworkCallback f30126d = new a();

        public class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: com.bumptech.glide.manager.q$d$a$a, reason: collision with other inner class name */
            public class RunnableC0474a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f30128a;

                public RunnableC0474a(boolean z10) {
                    this.f30128a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f30128a);
                }
            }

            public a() {
            }

            public void a(boolean z10) {
                com.bumptech.glide.util.l.b();
                d dVar = d.this;
                boolean z11 = dVar.f30123a;
                dVar.f30123a = z10;
                if (z11 != z10) {
                    dVar.f30124b.a(z10);
                }
            }

            public final void b(boolean z10) {
                com.bumptech.glide.util.l.w(new RunnableC0474a(z10));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        public d(f.b bVar, b.a aVar) {
            this.f30125c = bVar;
            this.f30124b = aVar;
        }

        @Override // com.bumptech.glide.manager.q.c
        public boolean register() {
            this.f30123a = ((ConnectivityManager) this.f30125c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f30125c.get()).registerDefaultNetworkCallback(this.f30126d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.q.c
        public void unregister() {
            ((ConnectivityManager) this.f30125c.get()).unregisterNetworkCallback(this.f30126d);
        }
    }

    public q(Context context) {
        this.f30117a = new d(com.bumptech.glide.util.f.a(new a(context)), new b());
    }

    public static q a(Context context) {
        if (f30116d == null) {
            synchronized (q.class) {
                try {
                    if (f30116d == null) {
                        f30116d = new q(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f30116d;
    }

    public final void b() {
        if (this.f30119c || this.f30118b.isEmpty()) {
            return;
        }
        this.f30119c = this.f30117a.register();
    }

    public final void c() {
        if (this.f30119c && this.f30118b.isEmpty()) {
            this.f30117a.unregister();
            this.f30119c = false;
        }
    }

    public synchronized void d(b.a aVar) {
        this.f30118b.add(aVar);
        b();
    }

    public synchronized void e(b.a aVar) {
        this.f30118b.remove(aVar);
        c();
    }
}
