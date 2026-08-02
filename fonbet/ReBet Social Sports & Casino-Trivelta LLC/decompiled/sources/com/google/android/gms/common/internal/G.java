package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class G implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final F f32630a;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f32637h;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f32631b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f32632c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f32633d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f32634e = false;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f32635f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f32636g = false;

    /* renamed from: i, reason: collision with root package name */
    public final Object f32638i = new Object();

    public G(Looper looper, F f10) {
        this.f32630a = f10;
        this.f32637h = new zau(looper, this);
    }

    public final void a() {
        this.f32634e = false;
        this.f32635f.incrementAndGet();
    }

    public final void b() {
        this.f32634e = true;
    }

    public final void c(ConnectionResult connectionResult) {
        AbstractC3191o.e(this.f32637h, "onConnectionFailure must only be called on the Handler thread");
        this.f32637h.removeMessages(1);
        synchronized (this.f32638i) {
            try {
                ArrayList arrayList = new ArrayList(this.f32633d);
                int i10 = this.f32635f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f.c cVar = (f.c) it.next();
                    if (this.f32634e && this.f32635f.get() == i10) {
                        if (this.f32633d.contains(cVar)) {
                            cVar.c(connectionResult);
                        }
                    }
                    return;
                }
            } finally {
            }
        }
    }

    public final void d(Bundle bundle) {
        AbstractC3191o.e(this.f32637h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f32638i) {
            try {
                AbstractC3191o.p(!this.f32636g);
                this.f32637h.removeMessages(1);
                this.f32636g = true;
                AbstractC3191o.p(this.f32632c.isEmpty());
                ArrayList arrayList = new ArrayList(this.f32631b);
                int i10 = this.f32635f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f.b bVar = (f.b) it.next();
                    if (!this.f32634e || !this.f32630a.isConnected() || this.f32635f.get() != i10) {
                        break;
                    } else if (!this.f32632c.contains(bVar)) {
                        bVar.g(bundle);
                    }
                }
                this.f32632c.clear();
                this.f32636g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(int i10) {
        AbstractC3191o.e(this.f32637h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f32637h.removeMessages(1);
        synchronized (this.f32638i) {
            try {
                this.f32636g = true;
                ArrayList arrayList = new ArrayList(this.f32631b);
                int i11 = this.f32635f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f.b bVar = (f.b) it.next();
                    if (!this.f32634e || this.f32635f.get() != i11) {
                        break;
                    } else if (this.f32631b.contains(bVar)) {
                        bVar.i(i10);
                    }
                }
                this.f32632c.clear();
                this.f32636g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(f.b bVar) {
        AbstractC3191o.m(bVar);
        synchronized (this.f32638i) {
            try {
                if (this.f32631b.contains(bVar)) {
                    Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(bVar) + " is already registered");
                } else {
                    this.f32631b.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f32630a.isConnected()) {
            Handler handler = this.f32637h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(f.c cVar) {
        AbstractC3191o.m(cVar);
        synchronized (this.f32638i) {
            try {
                if (this.f32633d.contains(cVar)) {
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(cVar) + " is already registered");
                } else {
                    this.f32633d.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(f.c cVar) {
        AbstractC3191o.m(cVar);
        synchronized (this.f32638i) {
            try {
                if (!this.f32633d.remove(cVar)) {
                    Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + String.valueOf(cVar) + " not found");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i10, new Exception());
            return false;
        }
        f.b bVar = (f.b) message.obj;
        synchronized (this.f32638i) {
            try {
                if (this.f32634e && this.f32630a.isConnected() && this.f32631b.contains(bVar)) {
                    bVar.g(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
