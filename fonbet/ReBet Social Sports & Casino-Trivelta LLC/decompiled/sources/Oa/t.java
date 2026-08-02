package Oa;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: o, reason: collision with root package name */
    public static final Map f8594o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f8595a;

    /* renamed from: b, reason: collision with root package name */
    public final i f8596b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8601g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f8602h;

    /* renamed from: l, reason: collision with root package name */
    public ServiceConnection f8606l;

    /* renamed from: m, reason: collision with root package name */
    public IInterface f8607m;

    /* renamed from: n, reason: collision with root package name */
    public final Na.d f8608n;

    /* renamed from: d, reason: collision with root package name */
    public final List f8598d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Set f8599e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f8600f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f8604j = new IBinder.DeathRecipient() { // from class: Oa.l
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.h(t.this);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f8605k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f8597c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f8603i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, Na.d dVar, o oVar, byte[] bArr) {
        this.f8595a = context;
        this.f8596b = iVar;
        this.f8602h = intent;
        this.f8608n = dVar;
    }

    public static /* synthetic */ void h(t tVar) {
        tVar.f8596b.d("reportBinderDeath", new Object[0]);
        android.support.v4.media.session.b.a(tVar.f8603i.get());
        tVar.f8596b.d("%s : Binder has died.", tVar.f8597c);
        Iterator it = tVar.f8598d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(tVar.s());
        }
        tVar.f8598d.clear();
        tVar.t();
    }

    public static /* bridge */ /* synthetic */ void m(t tVar, j jVar) {
        if (tVar.f8607m != null || tVar.f8601g) {
            if (!tVar.f8601g) {
                jVar.run();
                return;
            } else {
                tVar.f8596b.d("Waiting to bind to the service.", new Object[0]);
                tVar.f8598d.add(jVar);
                return;
            }
        }
        tVar.f8596b.d("Initiate binding to the service.", new Object[0]);
        tVar.f8598d.add(jVar);
        s sVar = new s(tVar, null);
        tVar.f8606l = sVar;
        tVar.f8601g = true;
        if (tVar.f8595a.bindService(tVar.f8602h, sVar, 1)) {
            return;
        }
        tVar.f8596b.d("Failed to bind to the service.", new Object[0]);
        tVar.f8601g = false;
        Iterator it = tVar.f8598d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new u());
        }
        tVar.f8598d.clear();
    }

    public static /* bridge */ /* synthetic */ void n(t tVar) {
        tVar.f8596b.d("linkToDeath", new Object[0]);
        try {
            tVar.f8607m.asBinder().linkToDeath(tVar.f8604j, 0);
        } catch (RemoteException e10) {
            tVar.f8596b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void o(t tVar) {
        tVar.f8596b.d("unlinkToDeath", new Object[0]);
        tVar.f8607m.asBinder().unlinkToDeath(tVar.f8604j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f8594o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f8597c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f8597c, 10);
                    handlerThread.start();
                    map.put(this.f8597c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f8597c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f8607m;
    }

    public final void p(j jVar, final TaskCompletionSource taskCompletionSource) {
        synchronized (this.f8600f) {
            this.f8599e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: Oa.k
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    t.this.q(taskCompletionSource, task);
                }
            });
        }
        synchronized (this.f8600f) {
            try {
                if (this.f8605k.getAndIncrement() > 0) {
                    this.f8596b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c().post(new m(this, jVar.b(), jVar));
    }

    public final /* synthetic */ void q(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f8600f) {
            this.f8599e.remove(taskCompletionSource);
        }
    }

    public final void r(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f8600f) {
            this.f8599e.remove(taskCompletionSource);
        }
        synchronized (this.f8600f) {
            try {
                if (this.f8605k.get() > 0 && this.f8605k.decrementAndGet() > 0) {
                    this.f8596b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new n(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final RemoteException s() {
        return new RemoteException(String.valueOf(this.f8597c).concat(" : Binder has died."));
    }

    public final void t() {
        synchronized (this.f8600f) {
            try {
                Iterator it = this.f8599e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(s());
                }
                this.f8599e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
