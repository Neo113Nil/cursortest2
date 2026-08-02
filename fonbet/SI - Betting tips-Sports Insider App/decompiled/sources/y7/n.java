package y7;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import androidx.fragment.app.i0;
import com.android.billingclient.api.n0;
import d8.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f25706n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f25707a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.a f25708b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25713g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f25714h;

    /* renamed from: l, reason: collision with root package name */
    public n0 f25717l;

    /* renamed from: m, reason: collision with root package name */
    public g f25718m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f25710d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f25711e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f25712f = new Object();
    public final p j = new p(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f25716k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f25709c = "AppUpdateService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f25715i = new WeakReference(null);

    public n(Context context, com.android.billingclient.api.a aVar, Intent intent) {
        this.f25707a = context;
        this.f25708b = aVar;
        this.f25714h = intent;
    }

    public static void b(n nVar, k kVar) {
        g gVar = nVar.f25718m;
        com.android.billingclient.api.a aVar = nVar.f25708b;
        ArrayList arrayList = nVar.f25710d;
        if (gVar != null || nVar.f25713g) {
            if (!nVar.f25713g) {
                kVar.run();
                return;
            } else {
                aVar.g("Waiting to bind to the service.", new Object[0]);
                arrayList.add(kVar);
                return;
            }
        }
        aVar.g("Initiate binding to the service.", new Object[0]);
        arrayList.add(kVar);
        n0 n0Var = new n0(2, nVar);
        nVar.f25717l = n0Var;
        nVar.f25713g = true;
        if (nVar.f25707a.bindService(nVar.f25714h, n0Var, 1)) {
            return;
        }
        aVar.g("Failed to bind to the service.", new Object[0]);
        nVar.f25713g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            i0 i0Var = new i0("Failed to bind to the service.");
            w7.g gVar2 = kVar2.f25701a;
            if (gVar2 != null) {
                gVar2.c(i0Var);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f25706n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f25709c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f25709c, 10);
                    handlerThread.start();
                    hashMap.put(this.f25709c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f25709c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(w7.g gVar) {
        synchronized (this.f25712f) {
            this.f25711e.remove(gVar);
        }
        a().post(new l(0, this));
    }

    public final void d() {
        HashSet hashSet = this.f25711e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((w7.g) it.next()).c(new RemoteException(String.valueOf(this.f25709c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
