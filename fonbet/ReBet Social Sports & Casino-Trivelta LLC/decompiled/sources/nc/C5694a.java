package nc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;

/* renamed from: nc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5694a {

    /* renamed from: a, reason: collision with root package name */
    public final c f57221a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f57222b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0832a f57223c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f57224d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f57225e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f57226f = false;

    /* renamed from: nc.a$a, reason: collision with other inner class name */
    public interface InterfaceC0832a {
        void a(boolean z10);
    }

    /* renamed from: nc.a$b */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (C5694a.this.f57226f) {
                C5694a.this.f57222b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                C5694a.this.f57225e.postDelayed(C5694a.this.f57224d, 10000L);
            }
        }

        public b() {
        }
    }

    /* renamed from: nc.a$c */
    public class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public boolean f57228a;

        /* renamed from: b, reason: collision with root package name */
        public Boolean f57229b;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z10;
            String action = intent == null ? null : intent.getAction();
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
                z10 = false;
            } else if (!"com.amazon.tv.networkmonitor.INTERNET_UP".equals(action)) {
                return;
            } else {
                z10 = true;
            }
            Boolean bool = this.f57229b;
            if (bool == null || bool.booleanValue() != z10) {
                this.f57229b = Boolean.valueOf(z10);
                C5694a.this.f57223c.a(z10);
            }
        }

        public c() {
            this.f57228a = false;
        }
    }

    public C5694a(Context context, InterfaceC0832a interfaceC0832a) {
        this.f57221a = new c();
        this.f57224d = new b();
        this.f57222b = context;
        this.f57223c = interfaceC0832a;
    }

    public final boolean f() {
        if (!Build.MANUFACTURER.equals("Amazon")) {
            return false;
        }
        String str = Build.MODEL;
        return str.startsWith("AF") || str.startsWith("KF");
    }

    public void g() {
        if (f()) {
            h();
            i();
        }
    }

    public final void h() {
        if (this.f57221a.f57228a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
        i.a(this.f57222b, this.f57221a, intentFilter, false);
        this.f57221a.f57228a = true;
    }

    public final void i() {
        if (this.f57226f) {
            return;
        }
        Handler handler = new Handler();
        this.f57225e = handler;
        this.f57226f = true;
        handler.post(this.f57224d);
    }

    public final void j() {
        if (this.f57226f) {
            this.f57226f = false;
            this.f57225e.removeCallbacksAndMessages(null);
            this.f57225e = null;
        }
    }

    public void k() {
        if (f()) {
            j();
            l();
        }
    }

    public final void l() {
        c cVar = this.f57221a;
        if (cVar.f57228a) {
            this.f57222b.unregisterReceiver(cVar);
            this.f57221a.f57228a = false;
        }
    }
}
