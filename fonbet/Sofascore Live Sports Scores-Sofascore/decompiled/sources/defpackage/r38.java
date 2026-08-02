package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r38 {
    public static final Object k = new Object();
    public static final dh0 l = new dh0(0);
    public final Context a;
    public final String b;
    public final s48 c;
    public final nc3 d;
    public final koa g;
    public final vff h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public r38(Context context, String str, s48 s48Var) {
        ?? arrayList;
        int i = 0;
        this.a = context;
        Preconditions.f(str);
        this.b = str;
        this.c = s48Var;
        dv0 dv0Var = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Objects.toString(ComponentDiscoveryService.class);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new dc3((String) it.next(), i));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        f9k f9kVar = f9k.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new dc3(new FirebaseCommonRegistrar(), i2));
        arrayList3.add(new dc3(new ExecutorsRegistrar(), i2));
        arrayList4.add(kb3.c(context, Context.class, new Class[0]));
        arrayList4.add(kb3.c(this, r38.class, new Class[0]));
        arrayList4.add(kb3.c(s48Var, s48.class, new Class[0]));
        ug5 ug5Var = new ug5();
        if (kda.D(context) && FirebaseInitProvider.b.get()) {
            arrayList4.add(kb3.c(dv0Var, dv0.class, new Class[0]));
        }
        f9k f9kVar2 = f9k.a;
        nc3 nc3Var = new nc3();
        nc3Var.a = new HashMap();
        nc3Var.b = new HashMap();
        nc3Var.c = new HashMap();
        nc3Var.d = new HashSet();
        nc3Var.f = new AtomicReference();
        rv5 rv5Var = new rv5();
        nc3Var.e = rv5Var;
        nc3Var.g = ug5Var;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(kb3.c(rv5Var, rv5.class, hki.class, wgf.class));
        arrayList5.add(kb3.c(nc3Var, nc3.class, new Class[0]));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            kb3 kb3Var = (kb3) it2.next();
            if (kb3Var != null) {
                arrayList5.add(kb3Var);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList6.add(it3.next());
        }
        ArrayList arrayList7 = new ArrayList();
        synchronized (nc3Var) {
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((vff) it4.next()).get();
                    if (componentRegistrar != null) {
                        arrayList5.addAll(((ug5) nc3Var.g).z(componentRegistrar));
                        it4.remove();
                    }
                } catch (oaa unused2) {
                    it4.remove();
                }
            }
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Object[] array = ((kb3) it5.next()).b.toArray();
                int length = array.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        Object obj = array[i3];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) nc3Var.d).contains(obj.toString())) {
                                it5.remove();
                                break;
                            }
                            ((HashSet) nc3Var.d).add(obj.toString());
                        }
                        i3++;
                    }
                }
            }
            if (((HashMap) nc3Var.a).isEmpty()) {
                l98.N(arrayList5);
            } else {
                ArrayList arrayList8 = new ArrayList(((HashMap) nc3Var.a).keySet());
                arrayList8.addAll(arrayList5);
                l98.N(arrayList8);
            }
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                kb3 kb3Var2 = (kb3) it6.next();
                ((HashMap) nc3Var.a).put(kb3Var2, new koa(new lc3(i, nc3Var, kb3Var2)));
            }
            arrayList7.addAll(nc3Var.v(arrayList5));
            arrayList7.addAll(nc3Var.w());
            nc3Var.u();
        }
        Iterator it7 = arrayList7.iterator();
        while (it7.hasNext()) {
            ((Runnable) it7.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) nc3Var.f).get();
        if (bool != null) {
            nc3Var.n((HashMap) nc3Var.a, bool.booleanValue());
        }
        this.d = nc3Var;
        Trace.endSection();
        this.g = new koa(new lc3(2, this, context));
        this.h = nc3Var.j(op4.class);
        o38 o38Var = new o38(this);
        a();
        if (this.e.get()) {
            BackgroundDetector.e.a.get();
        }
        this.i.add(o38Var);
        Trace.endSection();
    }

    public static r38 c() {
        r38 r38Var;
        synchronized (k) {
            try {
                r38Var = (r38) l.get("[DEFAULT]");
                if (r38Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((op4) r38Var.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return r38Var;
    }

    public static r38 f(Context context, s48 s48Var) {
        r38 r38Var;
        AtomicReference atomicReference = p38.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = p38.a;
            if (atomicReference2.get() == null) {
                p38 p38Var = new p38();
                while (true) {
                    if (atomicReference2.compareAndSet(null, p38Var)) {
                        BackgroundDetector.b(application);
                        BackgroundDetector.e.a(p38Var);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            dh0 dh0Var = l;
            Preconditions.k("FirebaseApp name [DEFAULT] already exists!", !dh0Var.containsKey("[DEFAULT]"));
            Preconditions.j(context, "Application context cannot be null.");
            r38Var = new r38(context, "[DEFAULT]", s48Var);
            dh0Var.put("[DEFAULT]", r38Var);
        }
        r38Var.e();
        return r38Var;
    }

    public final void a() {
        Preconditions.k("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.e(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(Base64Utils.b(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(Base64Utils.b(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!kda.D(this.a)) {
            a();
            Context context = this.a;
            AtomicReference atomicReference = q38.b;
            if (atomicReference.get() == null) {
                q38 q38Var = new q38(context);
                while (!atomicReference.compareAndSet(null, q38Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(q38Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        nc3 nc3Var = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) nc3Var.f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (nc3Var) {
                    hashMap = new HashMap((HashMap) nc3Var.a);
                }
                nc3Var.n(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((op4) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r38)) {
            return false;
        }
        r38 r38Var = (r38) obj;
        r38Var.a();
        return this.b.equals(r38Var.b);
    }

    public final boolean g() {
        boolean z;
        a();
        sd4 sd4Var = (sd4) this.g.get();
        synchronized (sd4Var) {
            z = sd4Var.b;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.b, "name");
        toStringHelper.a(this.c, "options");
        return toStringHelper.toString();
    }
}
