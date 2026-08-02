package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b1p implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public gvo c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ zzv f;

    public b1p(zzv zzvVar) {
        this.f = zzvVar;
        com.google.android.gms.internal.cloudmessaging.zzv zzvVar2 = new com.google.android.gms.internal.cloudmessaging.zzv(Looper.getMainLooper(), new cy8(this, 4));
        Looper.getMainLooper();
        this.b = new Messenger(zzvVar2);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(s3p s3pVar) {
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        if (i != 0) {
            if (i == 1) {
                this.d.add(s3pVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(s3pVar);
            this.f.b.execute(new uro(this, i3));
            return true;
        }
        this.d.add(s3pVar);
        Preconditions.l(this.a == 0);
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            ConnectionTracker b = ConnectionTracker.b();
            zzv zzvVar = this.f;
            if (b.a(zzvVar.a, intent, this, 1)) {
                zzvVar.b.schedule(new uro(this, i2), 30L, TimeUnit.SECONDS);
            } else {
                d("Unable to bind to service");
            }
        } catch (SecurityException e) {
            f("Unable to bind to service", e);
        }
        return true;
    }

    public final synchronized void d(String str) {
        f(str, null);
    }

    public final synchronized void f(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            this.a = 4;
            ConnectionTracker.b().c(this.f.a, this);
            zzt zztVar = new zzt(str, securityException);
            ArrayDeque arrayDeque = this.d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((s3p) it.next()).c(zztVar);
            }
            arrayDeque.clear();
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = this.e;
                if (i2 >= sparseArray.size()) {
                    sparseArray.clear();
                    return;
                } else {
                    ((s3p) sparseArray.valueAt(i2)).c(zztVar);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void l() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            this.a = 3;
            ConnectionTracker.b().c(this.f.a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f.b.execute(new bnn(25, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f.b.execute(new uro(this, 2));
    }
}
