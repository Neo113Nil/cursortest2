package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.ironsource.Ua;
import defpackage.a70;
import defpackage.anb;
import defpackage.d4a;
import defpackage.dh0;
import defpackage.dx1;
import defpackage.hjg;
import defpackage.je4;
import defpackage.jz8;
import defpackage.k03;
import defpackage.kik;
import defpackage.kn4;
import defpackage.m41;
import defpackage.ml4;
import defpackage.n0g;
import defpackage.nz8;
import defpackage.oz8;
import defpackage.p0g;
import defpackage.qc;
import defpackage.sn5;
import defpackage.sw9;
import defpackage.t9d;
import defpackage.ufa;
import defpackage.uxf;
import defpackage.w1a;
import defpackage.xmb;
import defpackage.yih;
import defpackage.zz0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a h;
    public static volatile boolean i;
    public final dx1 a;
    public final anb b;
    public final jz8 c;
    public final kn4 d;
    public final p0g e;
    public final hjg f;
    public final ArrayList g = new ArrayList();

    public a(Context context, sn5 sn5Var, anb anbVar, dx1 dx1Var, kn4 kn4Var, p0g p0gVar, hjg hjgVar, k03 k03Var, dh0 dh0Var, List list, ArrayList arrayList, ml4 ml4Var, t9d t9dVar) {
        this.a = dx1Var;
        this.d = kn4Var;
        this.b = anbVar;
        this.e = p0gVar;
        this.f = hjgVar;
        this.c = new jz8(context, kn4Var, new yih(this, arrayList, ml4Var), k03Var, dh0Var, list, sn5Var, t9dVar);
    }

    public static a a(Context context) {
        if (h == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                sw9.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
                return null;
            } catch (InstantiationException e2) {
                sw9.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                sw9.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                sw9.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
                return null;
            }
            synchronized (a.class) {
                if (h == null) {
                    if (i) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    i = true;
                    try {
                        b(context, generatedAppGlideModule);
                        i = false;
                    } catch (Throwable th) {
                        i = false;
                        throw th;
                    }
                }
            }
        }
        return h;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        dh0 dh0Var = new dh0(0);
        int i2 = 1;
        je4 je4Var = new je4(1);
        k03 k03Var = new k03();
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(ufa.E(str));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) it.next();
                if (hashSet.contains(okHttpGlideModule.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        okHttpGlideModule.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((OkHttpGlideModule) it2.next()).getClass().toString();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((OkHttpGlideModule) it3.next()).getClass();
        }
        qc qcVar = new qc(i2);
        if (oz8.b == 0) {
            oz8.b = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i3 = oz8.b;
        if (TextUtils.isEmpty("source")) {
            a70.p("Name must be non-null and non-empty, but given: source");
            return;
        }
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        nz8 nz8Var = new nz8(qcVar, "source", false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oz8 oz8Var = new oz8(new ThreadPoolExecutor(i3, i3, 0L, timeUnit, priorityBlockingQueue, nz8Var));
        qc qcVar2 = new qc(i2);
        if (TextUtils.isEmpty("disk-cache")) {
            a70.p("Name must be non-null and non-empty, but given: disk-cache");
            return;
        }
        oz8 oz8Var2 = new oz8(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new nz8(qcVar2, "disk-cache", true)));
        if (oz8.b == 0) {
            oz8.b = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i4 = oz8.b >= 4 ? 2 : 1;
        qc qcVar3 = new qc(i2);
        if (TextUtils.isEmpty("animation")) {
            a70.p("Name must be non-null and non-empty, but given: animation");
            return;
        }
        oz8 oz8Var3 = new oz8(new ThreadPoolExecutor(i4, i4, 0L, timeUnit, new PriorityBlockingQueue(), new nz8(qcVar3, "animation", true)));
        zz0 zz0Var = new zz0(new m41(applicationContext));
        hjg hjgVar = new hjg();
        int i5 = zz0Var.b;
        dx1 xmbVar = i5 > 0 ? new xmb(i5) : new uxf(17);
        kn4 kn4Var = new kn4(zz0Var.d);
        anb anbVar = new anb(zz0Var.c);
        sn5 sn5Var = new sn5(anbVar, new d4a(applicationContext), oz8Var2, oz8Var, new oz8(new ThreadPoolExecutor(0, Integer.MAX_VALUE, Ua.s, timeUnit, new SynchronousQueue(), new nz8(new qc(i2), "source-unlimited", false))), oz8Var3);
        List list2 = Collections.EMPTY_LIST;
        t9d t9dVar = new t9d();
        t9dVar.a = Collections.unmodifiableMap(new HashMap(je4Var.a));
        a aVar = new a(applicationContext, sn5Var, anbVar, xmbVar, kn4Var, new p0g(), hjgVar, k03Var, dh0Var, list2, arrayList, generatedAppGlideModule, t9dVar);
        applicationContext.registerComponentCallbacks(aVar);
        h = aVar;
    }

    public static n0g c(Context context) {
        w1a.m(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).e.b(context);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        kik.g();
        this.b.h(0L);
        this.a.p();
        kn4 kn4Var = this.d;
        synchronized (kn4Var) {
            kn4Var.c(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        long j;
        kik.g();
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((n0g) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        anb anbVar = this.b;
        anbVar.getClass();
        if (i2 >= 40) {
            anbVar.h(0L);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (anbVar) {
                j = anbVar.a;
            }
            anbVar.h(j / 2);
        }
        this.a.b(i2);
        kn4 kn4Var = this.d;
        synchronized (kn4Var) {
            if (i2 >= 40) {
                synchronized (kn4Var) {
                    kn4Var.c(0);
                }
            } else if (i2 >= 20 || i2 == 15) {
                kn4Var.c(kn4Var.a / 2);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
