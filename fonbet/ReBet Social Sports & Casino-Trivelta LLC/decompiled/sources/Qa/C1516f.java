package Qa;

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

/* renamed from: Qa.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1516f {

    /* renamed from: o, reason: collision with root package name */
    public static final Map f9576o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f9577a;

    /* renamed from: b, reason: collision with root package name */
    public final G f9578b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9579c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9583g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f9584h;

    /* renamed from: i, reason: collision with root package name */
    public final N f9585i;

    /* renamed from: m, reason: collision with root package name */
    public ServiceConnection f9589m;

    /* renamed from: n, reason: collision with root package name */
    public IInterface f9590n;

    /* renamed from: d, reason: collision with root package name */
    public final List f9580d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Set f9581e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f9582f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final IBinder.DeathRecipient f9587k = new IBinder.DeathRecipient() { // from class: Qa.I
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C1516f.k(C1516f.this);
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f9588l = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    public final WeakReference f9586j = new WeakReference(null);

    public C1516f(Context context, G g10, String str, Intent intent, N n10, M m10) {
        this.f9577a = context;
        this.f9578b = g10;
        this.f9579c = str;
        this.f9584h = intent;
        this.f9585i = n10;
    }

    public static /* synthetic */ void k(C1516f c1516f) {
        c1516f.f9578b.d("reportBinderDeath", new Object[0]);
        android.support.v4.media.session.b.a(c1516f.f9586j.get());
        c1516f.f9578b.d("%s : Binder has died.", c1516f.f9579c);
        Iterator it = c1516f.f9580d.iterator();
        while (it.hasNext()) {
            ((H) it.next()).a(c1516f.w());
        }
        c1516f.f9580d.clear();
        synchronized (c1516f.f9582f) {
            c1516f.x();
        }
    }

    public static /* bridge */ /* synthetic */ void o(final C1516f c1516f, final TaskCompletionSource taskCompletionSource) {
        c1516f.f9581e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: Qa.J
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1516f.this.u(taskCompletionSource, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void q(C1516f c1516f, H h10) {
        if (c1516f.f9590n != null || c1516f.f9583g) {
            if (!c1516f.f9583g) {
                h10.run();
                return;
            } else {
                c1516f.f9578b.d("Waiting to bind to the service.", new Object[0]);
                c1516f.f9580d.add(h10);
                return;
            }
        }
        c1516f.f9578b.d("Initiate binding to the service.", new Object[0]);
        c1516f.f9580d.add(h10);
        ServiceConnectionC1515e serviceConnectionC1515e = new ServiceConnectionC1515e(c1516f, null);
        c1516f.f9589m = serviceConnectionC1515e;
        c1516f.f9583g = true;
        if (c1516f.f9577a.bindService(c1516f.f9584h, serviceConnectionC1515e, 1)) {
            return;
        }
        c1516f.f9578b.d("Failed to bind to the service.", new Object[0]);
        c1516f.f9583g = false;
        Iterator it = c1516f.f9580d.iterator();
        while (it.hasNext()) {
            ((H) it.next()).a(new C1517g());
        }
        c1516f.f9580d.clear();
    }

    public static /* bridge */ /* synthetic */ void r(C1516f c1516f) {
        c1516f.f9578b.d("linkToDeath", new Object[0]);
        try {
            c1516f.f9590n.asBinder().linkToDeath(c1516f.f9587k, 0);
        } catch (RemoteException e10) {
            c1516f.f9578b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(C1516f c1516f) {
        c1516f.f9578b.d("unlinkToDeath", new Object[0]);
        c1516f.f9590n.asBinder().unlinkToDeath(c1516f.f9587k, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f9576o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f9579c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f9579c, 10);
                    handlerThread.start();
                    map.put(this.f9579c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f9579c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f9590n;
    }

    public final void t(H h10, TaskCompletionSource taskCompletionSource) {
        c().post(new K(this, h10.c(), taskCompletionSource, h10));
    }

    public final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f9582f) {
            this.f9581e.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f9582f) {
            this.f9581e.remove(taskCompletionSource);
        }
        c().post(new L(this));
    }

    public final RemoteException w() {
        return new RemoteException(String.valueOf(this.f9579c).concat(" : Binder has died."));
    }

    public final void x() {
        Iterator it = this.f9581e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f9581e.clear();
    }
}
