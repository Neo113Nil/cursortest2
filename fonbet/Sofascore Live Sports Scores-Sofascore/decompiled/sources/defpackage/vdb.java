package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import com.facebook.internal.d;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vdb {
    public boolean a;
    public boolean b;
    public Object c;
    public final Object d;
    public Object e;
    public Object f;
    public final Cloneable g;
    public final Object h;
    public final Object i;

    public vdb(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, tqi tqiVar, sdb sdbVar, boolean z) {
        this.c = thread;
        this.f = copyOnWriteArraySet;
        this.e = sdbVar;
        this.i = new Object();
        this.g = new ArrayDeque();
        this.h = new ArrayDeque();
        if (looper == null || tqiVar == null || sdbVar == null) {
            this.d = null;
        } else {
            this.d = tqiVar.a(looper, new odb(this, 0));
        }
        this.b = z;
    }

    public void a(Object obj) {
        obj.getClass();
        synchronized (this.i) {
            try {
                if (this.a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f).add(new udb(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        zqi zqiVar = (zqi) this.d;
        ArrayDeque arrayDeque = (ArrayDeque) this.g;
        if (this.b) {
            z1a.E(Thread.currentThread() == ((Thread) this.c));
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.h;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        if (((sdb) this.e) != null) {
            zqiVar.getClass();
            Handler handler = zqiVar.a;
            if (!handler.hasMessages(1)) {
                xqi a = zqiVar.a(1);
                Message message = a.a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                a.a();
            }
        }
        boolean isEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (isEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }

    public void c(int i, qdb qdbVar) {
        if (this.b) {
            z1a.E(Thread.currentThread() == ((Thread) this.c));
        }
        ((ArrayDeque) this.h).add(new uu1(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f), i, qdbVar, 8));
    }

    public void d() {
        if (this.b) {
            z1a.E(Thread.currentThread() == ((Thread) this.c));
        }
        synchronized (this.i) {
            this.a = true;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f).iterator();
        while (it.hasNext()) {
            udb udbVar = (udb) it.next();
            sdb sdbVar = (sdb) this.e;
            udbVar.d = true;
            if (sdbVar != null && udbVar.c) {
                udbVar.c = false;
                sdbVar.a(udbVar.a, udbVar.b.d());
            }
        }
        ((CopyOnWriteArraySet) this.f).clear();
    }

    public void e(wke wkeVar) {
        if (this.b) {
            z1a.E(Thread.currentThread() == ((Thread) this.c));
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            udb udbVar = (udb) it.next();
            if (udbVar.a.equals(wkeVar)) {
                sdb sdbVar = (sdb) this.e;
                udbVar.d = true;
                if (sdbVar != null && udbVar.c) {
                    udbVar.c = false;
                    sdbVar.a(udbVar.a, udbVar.b.d());
                }
                copyOnWriteArraySet.remove(udbVar);
            }
        }
    }

    public void f() {
        int i;
        yz8 yz8Var = (yz8) this.d;
        Context context = (Context) this.c;
        PackageManager packageManager = (PackageManager) this.f;
        ArrayList arrayList = (ArrayList) this.g;
        if (this.b) {
            ArrayList<ServiceInfo> arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (!this.a || TextUtils.equals(context.getPackageName(), serviceInfo.packageName)) {
                        arrayList3.add(serviceInfo);
                    }
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                ServiceInfo serviceInfo2 = it2.next().serviceInfo;
                if (serviceInfo2 != null) {
                    if ((pbc.c == null ? false : pbc.c().i()) && !arrayList2.isEmpty()) {
                        for (ServiceInfo serviceInfo3 : arrayList2) {
                            if (!serviceInfo2.packageName.equals(serviceInfo3.packageName) || !serviceInfo2.name.equals(serviceInfo3.name)) {
                            }
                        }
                    }
                    String str = serviceInfo2.packageName;
                    String str2 = serviceInfo2.name;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        }
                        ComponentName componentName = ((gvf) arrayList.get(i3)).i;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 < 0) {
                        gvf gvfVar = new gvf(context, new ComponentName(serviceInfo2.packageName, serviceInfo2.name));
                        gvfVar.p = new imf(this, gvfVar);
                        if (!gvfVar.l) {
                            gvfVar.l = true;
                            gvfVar.p();
                        }
                        i = i2 + 1;
                        arrayList.add(i2, gvfVar);
                        yz8Var.a(gvfVar, false);
                    } else if (i3 >= i2) {
                        gvf gvfVar2 = (gvf) arrayList.get(i3);
                        if (!gvfVar2.l) {
                            gvfVar2.l = true;
                            gvfVar2.p();
                        }
                        if (gvfVar2.n == null && gvfVar2.l && (gvfVar2.e != null || !gvfVar2.k.isEmpty())) {
                            gvfVar2.o();
                            gvfVar2.l();
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i3, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i2; size2--) {
                    gvf gvfVar3 = (gvf) arrayList.get(size2);
                    nbc d = yz8Var.d(gvfVar3);
                    if (d != null) {
                        gvfVar3.getClass();
                        pbc.b();
                        gvfVar3.d = null;
                        gvfVar3.j(null);
                        yz8Var.o(d, null);
                        yz8Var.a.b(514, d);
                        yz8Var.l.remove(d);
                    }
                    arrayList.remove(gvfVar3);
                    gvfVar3.p = null;
                    if (gvfVar3.l) {
                        gvfVar3.l = false;
                        gvfVar3.p();
                    }
                }
            }
        }
    }

    public void g(int i, qdb qdbVar) {
        c(i, qdbVar);
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(String str, String str2) {
        lda a;
        mqn mqnVar;
        s7o s7oVar = (s7o) this.f;
        if (s7oVar == null) {
            return;
        }
        try {
            int hashCode = str2.hashCode();
            if (hashCode != 48) {
                if (hashCode == 52 && str2.equals("4")) {
                    a = s7oVar.b(str);
                    new StringBuilder(String.valueOf(a).length() + 25);
                    mqnVar = (mqn) this.e;
                    if (mqnVar != null) {
                        return;
                    }
                    mqnVar.b(a);
                    return;
                }
                a = null;
                new StringBuilder(String.valueOf(a).length() + 25);
                mqnVar = (mqn) this.e;
                if (mqnVar != null) {
                }
            } else {
                if (str2.equals("0")) {
                    a = s7oVar.a(str);
                    new StringBuilder(String.valueOf(a).length() + 25);
                    mqnVar = (mqn) this.e;
                    if (mqnVar != null) {
                    }
                }
                a = null;
                new StringBuilder(String.valueOf(a).length() + 25);
                mqnVar = (mqn) this.e;
                if (mqnVar != null) {
                }
            }
        } catch (IllegalArgumentException unused) {
            new StringBuilder(String.valueOf(str).length() + 104);
        } catch (Exception unused2) {
            new StringBuilder(String.valueOf(str).length() + 75);
        }
    }

    public void i(String str, ksn ksnVar, ksn ksnVar2) {
        if (((b2p) this.c).d()) {
            WebView webView = ((fln) ((b2p) this.c).g()).a;
            try {
                webView.evaluateJavascript(str, ksnVar);
            } catch (IllegalStateException unused) {
                webView.loadUrl(str);
                if (ksnVar2 != null) {
                    ksnVar2.onReceiveValue(null);
                }
            }
        }
    }

    public vdb(Context context, yz8 yz8Var) {
        this.g = new ArrayList();
        this.h = new d(this, 7);
        this.i = new kac(this, 11);
        this.c = context;
        this.d = yz8Var;
        this.e = new Handler();
        this.f = context.getPackageManager();
    }

    public vdb(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public vdb(Looper looper, sdb sdbVar) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), tqi.a, sdbVar, true);
    }

    public vdb(sen senVar, TestingConfiguration testingConfiguration) {
        this.c = u1p.a;
        this.h = new w2o();
        this.i = Collections.newSetFromMap(new ConcurrentHashMap());
        this.a = false;
        this.b = false;
        this.d = new Handler(Looper.getMainLooper());
        this.g = senVar;
        this.f = new s7o(testingConfiguration);
    }
}
