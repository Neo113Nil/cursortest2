package org.maplibre.android.net;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.log.Logger;

/* loaded from: classes10.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: e, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static b f79961e;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private CopyOnWriteArrayList f79962a;

    /* renamed from: b, reason: collision with root package name */
    private Context f79963b;

    /* renamed from: c, reason: collision with root package name */
    private int f79964c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f79965d;

    public static synchronized b c(@NonNull Context context) {
        b bVar;
        synchronized (b.class) {
            try {
                if (f79961e == null) {
                    Context applicationContext = context.getApplicationContext();
                    b bVar2 = new b();
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    bVar2.f79962a = copyOnWriteArrayList;
                    bVar2.f79963b = applicationContext;
                    f79961e = bVar2;
                    copyOnWriteArrayList.add(new NativeConnectivityListener());
                }
                bVar = f79961e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    private boolean e() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f79963b.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private void f(boolean z11) {
        Logger.v("Mbgl-ConnectivityReceiver", z11 ? "connected - true" : "connected - false");
        Iterator it = this.f79962a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z11);
        }
    }

    public final void a() {
        if (this.f79964c == 0) {
            this.f79963b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        this.f79964c++;
    }

    public final void b() {
        int i11 = this.f79964c - 1;
        this.f79964c = i11;
        if (i11 == 0) {
            this.f79963b.unregisterReceiver(f79961e);
        }
    }

    public final boolean d() {
        Boolean bool = this.f79965d;
        return bool != null ? bool.booleanValue() : e();
    }

    public final void g(Boolean bool) {
        this.f79965d = bool;
        f(bool != null ? bool.booleanValue() : e());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, Intent intent) {
        if (this.f79965d != null) {
            return;
        }
        f(e());
    }
}
