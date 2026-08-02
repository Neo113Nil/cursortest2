package eb;

import K9.q;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC2177b;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C3122c;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mb.C5576c;
import mb.n;
import mb.w;
import nb.B;
import tb.InterfaceC6458c;
import u0.p;
import ub.C6540f;
import wb.InterfaceC6736b;
import z.C6900a;

/* renamed from: eb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4196f {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f45872k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Map f45873l = new C6900a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f45874a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45875b;

    /* renamed from: c, reason: collision with root package name */
    public final m f45876c;

    /* renamed from: d, reason: collision with root package name */
    public final mb.n f45877d;

    /* renamed from: g, reason: collision with root package name */
    public final w f45880g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC6736b f45881h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f45878e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f45879f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final List f45882i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final List f45883j = new CopyOnWriteArrayList();

    /* renamed from: eb.f$a */
    public interface a {
        void a(boolean z10);
    }

    /* renamed from: eb.f$b */
    public static class b implements ComponentCallbacks2C3122c.a {

        /* renamed from: a, reason: collision with root package name */
        public static AtomicReference f45884a = new AtomicReference();

        public static void c(Context context) {
            if (K9.n.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f45884a.get() == null) {
                    b bVar = new b();
                    if (AbstractC2177b.a(f45884a, null, bVar)) {
                        ComponentCallbacks2C3122c.c(application);
                        ComponentCallbacks2C3122c.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3122c.a
        public void a(boolean z10) {
            synchronized (C4196f.f45872k) {
                try {
                    Iterator it = new ArrayList(C4196f.f45873l.values()).iterator();
                    while (it.hasNext()) {
                        C4196f c4196f = (C4196f) it.next();
                        if (c4196f.f45878e.get()) {
                            c4196f.z(z10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: eb.f$c */
    public static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public static AtomicReference f45885b = new AtomicReference();

        /* renamed from: a, reason: collision with root package name */
        public final Context f45886a;

        public c(Context context) {
            this.f45886a = context;
        }

        public static void b(Context context) {
            if (f45885b.get() == null) {
                c cVar = new c(context);
                if (AbstractC2177b.a(f45885b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f45886a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C4196f.f45872k) {
                try {
                    Iterator it = C4196f.f45873l.values().iterator();
                    while (it.hasNext()) {
                        ((C4196f) it.next()).s();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c();
        }
    }

    public C4196f(final Context context, String str, m mVar) {
        this.f45874a = (Context) AbstractC3191o.m(context);
        this.f45875b = AbstractC3191o.g(str);
        this.f45876c = (m) AbstractC3191o.m(mVar);
        o b10 = FirebaseInitProvider.b();
        Fb.c.b("Firebase");
        Fb.c.b("ComponentDiscovery");
        List b11 = mb.f.c(context, ComponentDiscoveryService.class).b();
        Fb.c.a();
        Fb.c.b("Runtime");
        n.b f10 = mb.n.k(B.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C5576c.q(context, Context.class, new Class[0])).b(C5576c.q(this, C4196f.class, new Class[0])).b(C5576c.q(mVar, m.class, new Class[0])).f(new Fb.b());
        if (p.a(context) && FirebaseInitProvider.c()) {
            f10.b(C5576c.q(b10, o.class, new Class[0]));
        }
        mb.n e10 = f10.e();
        this.f45877d = e10;
        Fb.c.a();
        this.f45880g = new w(new InterfaceC6736b() { // from class: eb.d
            @Override // wb.InterfaceC6736b
            public final Object get() {
                return C4196f.b(C4196f.this, context);
            }
        });
        this.f45881h = e10.f(C6540f.class);
        g(new a() { // from class: eb.e
            @Override // eb.C4196f.a
            public final void a(boolean z10) {
                C4196f.a(C4196f.this, z10);
            }
        });
        Fb.c.a();
    }

    public static /* synthetic */ void a(C4196f c4196f, boolean z10) {
        if (z10) {
            c4196f.getClass();
        } else {
            ((C6540f) c4196f.f45881h.get()).h();
        }
    }

    public static /* synthetic */ Ab.a b(C4196f c4196f, Context context) {
        return new Ab.a(context, c4196f.r(), (InterfaceC6458c) c4196f.f45877d.a(InterfaceC6458c.class));
    }

    public static List k() {
        ArrayList arrayList = new ArrayList();
        synchronized (f45872k) {
            try {
                Iterator it = f45873l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((C4196f) it.next()).p());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List m(Context context) {
        ArrayList arrayList;
        synchronized (f45872k) {
            arrayList = new ArrayList(f45873l.values());
        }
        return arrayList;
    }

    public static C4196f n() {
        C4196f c4196f;
        synchronized (f45872k) {
            try {
                c4196f = (C4196f) f45873l.get("[DEFAULT]");
                if (c4196f == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + q.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C6540f) c4196f.f45881h.get()).h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4196f;
    }

    public static C4196f o(String str) {
        C4196f c4196f;
        String str2;
        synchronized (f45872k) {
            try {
                c4196f = (C4196f) f45873l.get(y(str));
                if (c4196f == null) {
                    List k10 = k();
                    if (k10.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", k10);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((C6540f) c4196f.f45881h.get()).h();
            } finally {
            }
        }
        return c4196f;
    }

    public static C4196f t(Context context) {
        synchronized (f45872k) {
            try {
                if (f45873l.containsKey("[DEFAULT]")) {
                    return n();
                }
                m a10 = m.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return u(context, a10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static C4196f u(Context context, m mVar) {
        return v(context, mVar, "[DEFAULT]");
    }

    public static C4196f v(Context context, m mVar, String str) {
        C4196f c4196f;
        b.c(context);
        String y10 = y(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f45872k) {
            Map map = f45873l;
            AbstractC3191o.q(!map.containsKey(y10), "FirebaseApp name " + y10 + " already exists!");
            AbstractC3191o.n(context, "Application context cannot be null.");
            c4196f = new C4196f(context, y10, mVar);
            map.put(y10, c4196f);
        }
        c4196f.s();
        return c4196f;
    }

    public static String y(String str) {
        return str.trim();
    }

    public final void A() {
        Iterator it = this.f45883j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public void B(boolean z10) {
        h();
        if (this.f45878e.compareAndSet(!z10, z10)) {
            boolean d10 = ComponentCallbacks2C3122c.b().d();
            if (z10 && d10) {
                z(true);
            } else {
                if (z10 || !d10) {
                    return;
                }
                z(false);
            }
        }
    }

    public void C(Boolean bool) {
        h();
        ((Ab.a) this.f45880g.get()).e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4196f) {
            return this.f45875b.equals(((C4196f) obj).p());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f45878e.get() && ComponentCallbacks2C3122c.b().d()) {
            aVar.a(true);
        }
        this.f45882i.add(aVar);
    }

    public final void h() {
        AbstractC3191o.q(!this.f45879f.get(), "FirebaseApp was deleted");
    }

    public int hashCode() {
        return this.f45875b.hashCode();
    }

    public void i() {
        if (this.f45879f.compareAndSet(false, true)) {
            synchronized (f45872k) {
                f45873l.remove(this.f45875b);
            }
            A();
        }
    }

    public Object j(Class cls) {
        h();
        return this.f45877d.a(cls);
    }

    public Context l() {
        h();
        return this.f45874a;
    }

    public String p() {
        h();
        return this.f45875b;
    }

    public m q() {
        h();
        return this.f45876c;
    }

    public String r() {
        return K9.c.e(p().getBytes(Charset.defaultCharset())) + "+" + K9.c.e(q().c().getBytes(Charset.defaultCharset()));
    }

    public final void s() {
        if (!p.a(this.f45874a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + p());
            c.b(this.f45874a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + p());
        this.f45877d.n(x());
        ((C6540f) this.f45881h.get()).h();
    }

    public String toString() {
        return AbstractC3189m.d(this).a("name", this.f45875b).a("options", this.f45876c).toString();
    }

    public boolean w() {
        h();
        return ((Ab.a) this.f45880g.get()).b();
    }

    public boolean x() {
        return "[DEFAULT]".equals(p());
    }

    public final void z(boolean z10) {
        Iterator it = this.f45882i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z10);
        }
    }
}
