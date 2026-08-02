package d8;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.android.billingclient.api.n0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f8279o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f8280a;

    /* renamed from: b, reason: collision with root package name */
    public final n f8281b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8286g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f8287h;

    /* renamed from: m, reason: collision with root package name */
    public n0 f8291m;

    /* renamed from: n, reason: collision with root package name */
    public m f8292n;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8283d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f8284e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f8285f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final p f8289k = new p(0, this);

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f8290l = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f8282c = "IntegrityService";

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.play.core.integrity.d f8288i = com.google.android.play.core.integrity.d.f6028b;
    public final WeakReference j = new WeakReference(null);

    public c(Context context, n nVar, Intent intent) {
        this.f8280a = context;
        this.f8281b = nVar;
        this.f8287h = intent;
    }

    public static void b(c cVar, com.google.android.play.core.integrity.e eVar) {
        m mVar = cVar.f8292n;
        n nVar = cVar.f8281b;
        ArrayList arrayList = cVar.f8283d;
        if (mVar != null || cVar.f8286g) {
            if (!cVar.f8286g) {
                eVar.run();
                return;
            } else {
                nVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(eVar);
                return;
            }
        }
        nVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(eVar);
        n0 n0Var = new n0(1, cVar);
        cVar.f8291m = n0Var;
        cVar.f8286g = true;
        if (cVar.f8280a.bindService(cVar.f8287h, n0Var, 1)) {
            return;
        }
        nVar.a("Failed to bind to the service.", new Object[0]);
        cVar.f8286g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(new d("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f8279o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f8282c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f8282c, 10);
                    handlerThread.start();
                    hashMap.put(this.f8282c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f8282c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f8284e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((w7.g) it.next()).c(new RemoteException(String.valueOf(this.f8282c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
