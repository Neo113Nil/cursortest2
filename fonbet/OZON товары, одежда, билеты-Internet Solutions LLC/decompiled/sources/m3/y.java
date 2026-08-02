package m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import m3.y;
import m3.y.d;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: f, reason: collision with root package name */
    private static y f74371f;

    /* renamed from: a, reason: collision with root package name */
    private final Executor f74372a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<c> f74373b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f74374c;

    /* renamed from: d, reason: collision with root package name */
    private int f74375d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f74376e;

    /* loaded from: classes8.dex */
    private static final class a {

        /* renamed from: m3.y$a$a, reason: collision with other inner class name */
        private static final class C1254a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            private final y f74377a;

            public C1254a(y yVar) {
                this.f74377a = yVar;
            }

            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f74377a.g(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, y yVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                C1254a c1254a = new C1254a(yVar);
                telephonyManager.registerTelephonyCallback(yVar.f74372a, c1254a);
                telephonyManager.unregisterTelephonyCallback(c1254a);
            } catch (RuntimeException unused) {
                yVar.g(5);
            }
        }
    }

    public interface b {
        void a(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<b> f74378a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f74379b;

        public c(J3.f fVar, Executor executor) {
            this.f74378a = new WeakReference<>(fVar);
            this.f74379b = executor;
        }

        public static /* synthetic */ void a(c cVar) {
            b bVar = cVar.f74378a.get();
            if (bVar != null) {
                bVar.a(y.this.e());
            }
        }

        public final void b() {
            this.f74379b.execute(new Runnable() { // from class: m3.z
                @Override // java.lang.Runnable
                public final void run() {
                    y.c.a(y.c.this);
                }
            });
        }

        public final boolean c() {
            return this.f74378a.get() == null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(final Context context, Intent intent) {
            y.this.f74372a.execute(new Runnable() { // from class: m3.A
                @Override // java.lang.Runnable
                public final void run() {
                    y.b(context, y.this);
                }
            });
        }
    }

    private y(final Context context) {
        Executor b11 = C8060b.b();
        this.f74372a = b11;
        this.f74373b = new CopyOnWriteArrayList<>();
        this.f74374c = new Object();
        this.f74375d = 0;
        b11.execute(new Runnable() { // from class: m3.w
            @Override // java.lang.Runnable
            public final void run() {
                y yVar = this;
                yVar.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(yVar.new d(), intentFilter);
            }
        });
    }

    static void b(Context context, y yVar) {
        yVar.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i11 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i11 = type != 9 ? 8 : 7;
                                }
                                i11 = 5;
                            }
                        }
                        i11 = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i11 = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i11 = 4;
                            break;
                        case 13:
                            i11 = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i11 = 6;
                            break;
                        case 18:
                            i11 = 2;
                            break;
                        case 20:
                            if (Build.VERSION.SDK_INT >= 29) {
                                i11 = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i11 = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 31 || i11 != 5) {
            yVar.g(i11);
        } else {
            a.a(context, yVar);
        }
    }

    public static synchronized y d(Context context) {
        y yVar;
        synchronized (y.class) {
            try {
                if (f74371f == null) {
                    f74371f = new y(context);
                }
                yVar = f74371f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i11) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f74373b;
        Iterator<c> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.c()) {
                copyOnWriteArrayList.remove(next);
            }
        }
        synchronized (this.f74374c) {
            try {
                if (this.f74376e && this.f74375d == i11) {
                    return;
                }
                this.f74376e = true;
                this.f74375d = i11;
                Iterator<c> it2 = this.f74373b.iterator();
                while (it2.hasNext()) {
                    it2.next().b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int e() {
        int i11;
        synchronized (this.f74374c) {
            i11 = this.f74375d;
        }
        return i11;
    }

    public final void f(J3.f fVar, Executor executor) {
        boolean z11;
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f74373b;
        Iterator<c> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.c()) {
                copyOnWriteArrayList.remove(next);
            }
        }
        c cVar = new c(fVar, executor);
        synchronized (this.f74374c) {
            this.f74373b.add(cVar);
            z11 = this.f74376e;
        }
        if (z11) {
            cVar.b();
        }
    }
}
