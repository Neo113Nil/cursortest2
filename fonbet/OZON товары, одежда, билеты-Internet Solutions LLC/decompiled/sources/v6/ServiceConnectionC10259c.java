package v6;

import B4.V;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import t6.C9772g;
import v6.C10260d;

/* renamed from: v6.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ServiceConnectionC10259c implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2223c f102422a;

    /* renamed from: b, reason: collision with root package name */
    private Context f102423b;

    /* renamed from: c, reason: collision with root package name */
    private final Messenger f102424c = new Messenger(new a());

    /* renamed from: d, reason: collision with root package name */
    private Messenger f102425d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f102426e = false;

    /* renamed from: f, reason: collision with root package name */
    private AtomicInteger f102427f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private final SparseArray<b> f102428g = new SparseArray<>();

    /* renamed from: h, reason: collision with root package name */
    private final Object f102429h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Object f102430i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final Object f102431j = new Object();

    /* renamed from: v6.c$a */
    private class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ServiceConnectionC10259c.a(ServiceConnectionC10259c.this, message);
        }
    }

    /* renamed from: v6.c$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private C10262f f102433a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f102434b;

        b(C10262f c10262f, boolean z11) {
            this.f102433a = c10262f;
            this.f102434b = z11;
        }

        final C10262f a() {
            return this.f102433a;
        }

        final boolean b() {
            return this.f102434b;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ResponseHolder{mCallResult=");
            sb2.append(this.f102433a);
            sb2.append(", mIsConversionError=");
            return V.d(sb2, this.f102434b, '}');
        }
    }

    /* renamed from: v6.c$c, reason: collision with other inner class name */
    public interface InterfaceC2223c {
        void a(ServiceConnectionC10259c serviceConnectionC10259c);
    }

    public ServiceConnectionC10259c(Context context, InterfaceC2223c interfaceC2223c) {
        this.f102422a = interfaceC2223c;
        this.f102423b = context;
    }

    static void a(ServiceConnectionC10259c serviceConnectionC10259c, Message message) {
        b bVar;
        synchronized (serviceConnectionC10259c.f102430i) {
            int i11 = message.arg1;
            V9.a.a();
            try {
                bVar = new b(C10258b.a(message), false);
            } catch (IllegalArgumentException unused) {
                V9.a.c();
                bVar = new b(null, true);
            }
            serviceConnectionC10259c.f102428g.append(message.arg1, bVar);
            synchronized (serviceConnectionC10259c.f102431j) {
                serviceConnectionC10259c.f102431j.notify();
            }
        }
    }

    private void b() throws C9772g {
        synchronized (this.f102429h) {
            try {
                if (!this.f102426e) {
                    throw new C9772g("Attempt to use closed connection", C9772g.b.DISCONNECTED);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() throws C9772g {
        synchronized (this.f102429h) {
            try {
                if (!this.f102426e) {
                    throw new C9772g("Connection already closed", C9772g.b.DISCONNECTED);
                }
                try {
                    this.f102423b.unbindService(this);
                    this.f102426e = false;
                    this.f102425d = null;
                    this.f102422a.getClass();
                } catch (IllegalArgumentException e11) {
                    throw new C9772g("Connection already closed", C9772g.b.DISCONNECTED, e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C10262f d(C10260d c10260d) throws C9772g {
        int i11;
        b bVar;
        b();
        C10260d.a c11 = c10260d.c();
        switch (C10257a.f102421a[c11.ordinal()]) {
            case 1:
                i11 = 0;
                break;
            case 2:
                i11 = 1;
                break;
            case 3:
                i11 = 2;
                break;
            case 4:
                i11 = 3;
                break;
            case 5:
                i11 = 4;
                break;
            case 6:
                i11 = 5;
                break;
            case 7:
                i11 = 6;
                break;
            case 8:
                i11 = 7;
                break;
            default:
                throw new IllegalArgumentException("Unsupported callType: " + c11);
        }
        b bVar2 = null;
        Message obtain = Message.obtain((Handler) null, i11);
        Bundle bundle = new Bundle();
        if (c10260d.e() != null) {
            bundle.putString("SESSION_ID", c10260d.e());
        }
        bundle.putString("DATA", c10260d.d());
        obtain.setData(bundle);
        int andIncrement = this.f102427f.getAndIncrement();
        obtain.arg1 = andIncrement;
        obtain.replyTo = this.f102424c;
        synchronized (this.f102429h) {
            try {
                if (!this.f102426e) {
                    throw new C9772g("Attempt to use closed connection", C9772g.b.DISCONNECTED);
                }
                this.f102425d.send(obtain);
            } catch (RemoteException e11) {
                throw new C9772g("Failed to send message", C9772g.b.INTERNAL_ERROR, e11);
            }
        }
        while (bVar2 == null) {
            b();
            synchronized (this.f102430i) {
                synchronized (this.f102430i) {
                    try {
                        V9.a.a();
                        bVar = this.f102428g.get(andIncrement);
                        Objects.toString(bVar);
                        V9.a.a();
                        if (bVar != null) {
                            this.f102428g.remove(andIncrement);
                        }
                    } finally {
                    }
                }
            }
            if (bVar == null) {
                try {
                    synchronized (this.f102431j) {
                        this.f102431j.wait();
                    }
                } catch (InterruptedException unused) {
                    V9.a.c();
                }
            }
            bVar2 = bVar;
        }
        if (bVar2.b()) {
            throw new C9772g("Failed to parse serialized response", C9772g.b.INTERNAL_ERROR);
        }
        return bVar2.a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f102429h) {
            System.currentTimeMillis();
            V9.a.b();
            this.f102425d = new Messenger(iBinder);
            this.f102426e = true;
            this.f102422a.a(this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f102429h) {
            System.currentTimeMillis();
            V9.a.b();
            this.f102426e = false;
            this.f102425d = null;
            this.f102422a.getClass();
        }
    }
}
