package h8;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import g6.v;
import io.sentry.android.core.w0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import md.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final s.e f10400k = new s.e(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f10401a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10402b;

    /* renamed from: c, reason: collision with root package name */
    public final i f10403c;

    /* renamed from: d, reason: collision with root package name */
    public final o8.e f10404d;

    /* renamed from: g, reason: collision with root package name */
    public final o8.l f10407g;

    /* renamed from: h, reason: collision with root package name */
    public final a9.a f10408h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f10405e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f10406f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f10409i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(Context context, String str, i iVar) {
        ?? arrayList;
        int i5;
        int i10 = 0;
        new CopyOnWriteArrayList();
        this.f10401a = context;
        v.e(str);
        this.f10402b = str;
        this.f10403c = iVar;
        a aVar = FirebaseInitProvider.f6193a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                w0.m("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    w0.m("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            w0.m("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            w0.m("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
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
        while (true) {
            i5 = 1;
            if (!it.hasNext()) {
                break;
            } else {
                arrayList2.add(new b9.b(i5, (String) it.next()));
            }
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        p8.k kVar = p8.k.f21561a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i11 = 2;
        arrayList3.add(new b9.b(i11, new FirebaseCommonRegistrar()));
        arrayList3.add(new b9.b(i11, new ExecutorsRegistrar()));
        arrayList4.add(o8.b.c(context, Context.class, new Class[0]));
        arrayList4.add(o8.b.c(this, g.class, new Class[0]));
        arrayList4.add(o8.b.c(iVar, i.class, new Class[0]));
        o oVar = new o(i5);
        if (y3.u(context) && FirebaseInitProvider.f6194b.get()) {
            arrayList4.add(o8.b.c(aVar, a.class, new Class[0]));
        }
        o8.e eVar = new o8.e(arrayList3, arrayList4, oVar);
        this.f10404d = eVar;
        Trace.endSection();
        this.f10407g = new o8.l(new c(i10, this, context));
        this.f10408h = eVar.e(y8.c.class);
        d dVar = new d(this);
        a();
        if (this.f10405e.get()) {
            e6.c.f8679e.f8680a.get();
        }
        this.f10409i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (j) {
            try {
                gVar = (g) f10400k.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + q6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((y8.c) gVar.f10408h.get()).c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (j) {
            try {
                if (f10400k.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a7 = i.a(context);
                if (a7 == null) {
                    w0.m("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a7);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static g g(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.f10397a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f10397a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        e6.c.b(application);
                        e6.c.f8679e.a(eVar);
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
        synchronized (j) {
            s.e eVar2 = f10400k;
            v.j("FirebaseApp name [DEFAULT] already exists!", !eVar2.containsKey("[DEFAULT]"));
            v.i(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            eVar2.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        v.j("FirebaseApp was deleted", !this.f10406f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f10404d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(q6.b.c(this.f10402b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(q6.b.c(this.f10403c.f10416b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!y3.u(this.f10401a)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f10402b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f10401a;
            AtomicReference atomicReference = f.f10398b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f10402b);
        Log.i("FirebaseApp", sb3.toString());
        o8.e eVar = this.f10404d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f10402b);
        AtomicReference atomicReference2 = eVar.f21115f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (eVar) {
                    hashMap = new HashMap(eVar.f21110a);
                }
                eVar.d(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((y8.c) this.f10408h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f10402b.equals(gVar.f10402b);
    }

    public final boolean h() {
        boolean z5;
        a();
        f9.a aVar = (f9.a) this.f10407g.get();
        synchronized (aVar) {
            z5 = aVar.f9540a;
        }
        return z5;
    }

    public final int hashCode() {
        return this.f10402b.hashCode();
    }

    public final String toString() {
        l1.a aVar = new l1.a(this);
        aVar.i(this.f10402b, "name");
        aVar.i(this.f10403c, "options");
        return aVar.toString();
    }
}
