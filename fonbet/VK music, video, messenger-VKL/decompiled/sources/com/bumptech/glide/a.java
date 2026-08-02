package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.a1u;
import xsna.b1u;
import xsna.bgd;
import xsna.cl3;
import xsna.e320;
import xsna.fj00;
import xsna.i900;
import xsna.j900;
import xsna.k43;
import xsna.klp;
import xsna.oec;
import xsna.r4j;
import xsna.s2r0;
import xsna.s900;
import xsna.tc7;
import xsna.uc7;
import xsna.y7g0;
import xsna.ycl;
import xsna.z0u;
import xsna.z7g0;
import xsna.zfx;
import xsna.zk3;

/* compiled from: Glide.java */
/* loaded from: classes12.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a i;
    public static volatile boolean j;
    public final tc7 b;
    public final s900 c;
    public final c d;
    public final cl3 e;
    public final z7g0 f;
    public final r4j g;
    public final ArrayList h = new ArrayList();

    /* compiled from: Glide.java */
    /* renamed from: com.bumptech.glide.a$a, reason: collision with other inner class name */
    public interface InterfaceC0097a {
    }

    public a(@NonNull Context context, @NonNull klp klpVar, @NonNull s900 s900Var, @NonNull tc7 tc7Var, @NonNull cl3 cl3Var, @NonNull z7g0 z7g0Var, @NonNull r4j r4jVar, int i2, @NonNull InterfaceC0097a interfaceC0097a, @NonNull Map map, @NonNull List list, @NonNull ArrayList arrayList, @Nullable k43 k43Var, @NonNull a1u a1uVar) {
        this.b = tc7Var;
        this.e = cl3Var;
        this.c = s900Var;
        this.f = z7g0Var;
        this.g = r4jVar;
        this.d = new c(context, cl3Var, new oec(this, arrayList, k43Var), interfaceC0097a, map, list, klpVar, a1uVar, i2);
    }

    @NonNull
    public static a a(@NonNull Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (i == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (a.class) {
                if (i == null) {
                    if (j) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    j = true;
                    try {
                        b(context, generatedAppGlideModule);
                        j = false;
                    } catch (Throwable th) {
                        j = false;
                        throw th;
                    }
                }
            }
        }
        return i;
    }

    public static void b(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        zk3 zk3Var = new zk3();
        a1u.a aVar = new a1u.a();
        b bVar = new b();
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
                        arrayList.add(fj00.a(str));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b1u b1uVar = (b1u) it.next();
                if (hashSet.contains(b1uVar.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        b1uVar.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((b1u) it2.next()).getClass().toString();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((b1u) it3.next()).b();
        }
        z0u.a aVar2 = new z0u.a();
        if (z0u.d == 0) {
            z0u.d = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = z0u.d;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        z0u z0uVar = new z0u(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new z0u.b(aVar2, "source", false)));
        int i3 = z0u.d;
        z0u.a aVar3 = new z0u.a();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        z0u z0uVar2 = new z0u(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new z0u.b(aVar3, "disk-cache", true)));
        if (z0u.d == 0) {
            z0u.d = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i4 = z0u.d >= 4 ? 2 : 1;
        z0u.a aVar4 = new z0u.a();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        z0u z0uVar3 = new z0u(new ThreadPoolExecutor(i4, i4, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new z0u.b(aVar4, "animation", true)));
        e320 e320Var = new e320(new e320.a(applicationContext));
        ycl yclVar = new ycl();
        int i5 = e320Var.a;
        tc7 j900Var = i5 > 0 ? new j900(i5) : new uc7();
        i900 i900Var = new i900(e320Var.c);
        s900 s900Var = new s900(e320Var.b);
        a aVar5 = new a(applicationContext, new klp(s900Var, new zfx(new bgd(applicationContext)), z0uVar2, z0uVar, new z0u(new ThreadPoolExecutor(0, Integer.MAX_VALUE, z0u.c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new z0u.b(new z0u.a(), "source-unlimited", false))), z0uVar3), s900Var, j900Var, i900Var, new z7g0(), yclVar, 4, bVar, zk3Var, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new a1u(aVar));
        applicationContext.registerComponentCallbacks(aVar5);
        i = aVar5;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        s2r0.a();
        this.c.e(0L);
        this.b.a();
        this.e.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        long j2;
        s2r0.a();
        synchronized (this.h) {
            try {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    ((y7g0) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        s900 s900Var = this.c;
        s900Var.getClass();
        if (i2 >= 40) {
            s900Var.e(0L);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (s900Var) {
                j2 = s900Var.b;
            }
            s900Var.e(j2 / 2);
        }
        this.b.b(i2);
        this.e.b(i2);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
