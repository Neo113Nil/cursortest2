package e1;

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
import e1.C4133C;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: e1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4133C {

    /* renamed from: f, reason: collision with root package name */
    public static C4133C f45467f;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f45468a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f45469b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f45470c;

    /* renamed from: d, reason: collision with root package name */
    public int f45471d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45472e;

    /* renamed from: e1.C$b */
    public static final class b {

        /* renamed from: e1.C$b$a */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            public final C4133C f45473a;

            public a(C4133C c4133c) {
                this.f45473a = c4133c;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f45473a.m(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, C4133C c4133c) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) AbstractC4134a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(c4133c);
                telephonyManager.registerTelephonyCallback(c4133c.f45468a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                c4133c.m(5);
            }
        }
    }

    /* renamed from: e1.C$c */
    public interface c {
        void a(int i10);
    }

    /* renamed from: e1.C$d */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f45474a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f45475b;

        public d(c cVar, Executor executor) {
            this.f45474a = new WeakReference(cVar);
            this.f45475b = executor;
        }

        public static /* synthetic */ void a(d dVar) {
            c cVar = (c) dVar.f45474a.get();
            if (cVar != null) {
                cVar.a(C4133C.this.g());
            }
        }

        public void b() {
            this.f45475b.execute(new Runnable() { // from class: e1.G
                @Override // java.lang.Runnable
                public final void run() {
                    C4133C.d.a(C4133C.d.this);
                }
            });
        }

        public boolean c() {
            return this.f45474a.get() == null;
        }
    }

    /* renamed from: e1.C$e */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            C4133C.this.f45468a.execute(new Runnable() { // from class: e1.H
                @Override // java.lang.Runnable
                public final void run() {
                    C4133C.this.i(context);
                }
            });
        }
    }

    public C4133C(final Context context) {
        Executor a10 = AbstractC4136c.a();
        this.f45468a = a10;
        this.f45469b = new CopyOnWriteArrayList();
        this.f45470c = new Object();
        this.f45471d = 0;
        a10.execute(new Runnable() { // from class: e1.B
            @Override // java.lang.Runnable
            public final void run() {
                C4133C.this.j(context);
            }
        });
    }

    public static synchronized C4133C e(Context context) {
        C4133C c4133c;
        synchronized (C4133C.class) {
            try {
                if (f45467f == null) {
                    f45467f = new C4133C(context);
                }
                c4133c = f45467f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4133c;
    }

    public static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
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
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return Build.VERSION.SDK_INT >= 29 ? 9 : 0;
        }
    }

    public static int h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return f(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    public int g() {
        int i10;
        synchronized (this.f45470c) {
            i10 = this.f45471d;
        }
        return i10;
    }

    public final void i(Context context) {
        int h10 = h(context);
        if (Build.VERSION.SDK_INT < 31 || h10 != 5) {
            m(h10);
        } else {
            b.a(context, this);
        }
    }

    public final void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new e(), intentFilter);
    }

    public void k(c cVar, Executor executor) {
        boolean z10;
        l();
        d dVar = new d(cVar, executor);
        synchronized (this.f45470c) {
            this.f45469b.add(dVar);
            z10 = this.f45472e;
        }
        if (z10) {
            dVar.b();
        }
    }

    public final void l() {
        Iterator it = this.f45469b.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.c()) {
                this.f45469b.remove(dVar);
            }
        }
    }

    public final void m(int i10) {
        l();
        synchronized (this.f45470c) {
            try {
                if (this.f45472e && this.f45471d == i10) {
                    return;
                }
                this.f45472e = true;
                this.f45471d = i10;
                Iterator it = this.f45469b.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
