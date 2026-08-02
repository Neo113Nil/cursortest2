package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qbp {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final f79 b;
    public boolean g;
    public final Intent h;
    public zxc l;
    public z6o m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final fnn j = new fnn(this, 2);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    public qbp(Context context, f79 f79Var, Intent intent) {
        this.a = context;
        this.b = f79Var;
        this.h = intent;
    }

    public static void b(qbp qbpVar, kyo kyoVar) {
        z6o z6oVar = qbpVar.m;
        f79 f79Var = qbpVar.b;
        ArrayList arrayList = qbpVar.d;
        if (z6oVar != null || qbpVar.g) {
            if (!qbpVar.g) {
                kyoVar.run();
                return;
            } else {
                f79Var.f("Waiting to bind to the service.", new Object[0]);
                arrayList.add(kyoVar);
                return;
            }
        }
        f79Var.f("Initiate binding to the service.", new Object[0]);
        arrayList.add(kyoVar);
        zxc zxcVar = new zxc(qbpVar, 3);
        qbpVar.l = zxcVar;
        qbpVar.g = true;
        if (qbpVar.a.bindService(qbpVar.h, zxcVar, 1)) {
            return;
        }
        f79Var.f("Failed to bind to the service.", new Object[0]);
        qbpVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kyo kyoVar2 = (kyo) it.next();
            fb3 fb3Var = new fb3("Failed to bind to the service.", 17);
            TaskCompletionSource taskCompletionSource = kyoVar2.a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(fb3Var);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new u3p(this, 0));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
