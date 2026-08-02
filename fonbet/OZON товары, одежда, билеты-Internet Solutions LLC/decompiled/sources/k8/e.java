package k8;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import androidx.core.os.n;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n8.C8451a;
import n8.l;
import n8.r;
import y8.InterfaceC10861a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f71067j = new Object();

    /* renamed from: k, reason: collision with root package name */
    static final C5132a f71068k = new C5132a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f71069a;

    /* renamed from: b, reason: collision with root package name */
    private final String f71070b;

    /* renamed from: c, reason: collision with root package name */
    private final f f71071c;

    /* renamed from: d, reason: collision with root package name */
    private final l f71072d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f71073e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f71074f;

    /* renamed from: g, reason: collision with root package name */
    private final r<E8.a> f71075g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC10861a<w8.e> f71076h;

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArrayList f71077i;

    @KeepForSdk
    public interface a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z11);
    }

    @TargetApi(14)
    private static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference<b> f71078a = new AtomicReference<>();

        static void a(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                AtomicReference<b> atomicReference = f71078a;
                if (atomicReference.get() == null) {
                    b bVar = new b();
                    while (!atomicReference.compareAndSet(null, bVar)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(bVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z11) {
            synchronized (e.f71067j) {
                try {
                    Iterator it = new ArrayList(e.f71068k.values()).iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (eVar.f71073e.get()) {
                            e.f(eVar, z11);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @TargetApi(24)
    /* loaded from: classes9.dex */
    private static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference<c> f71079b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        private final Context f71080a;

        public c(Context context) {
            this.f71080a = context;
        }

        static void a(Context context) {
            AtomicReference<c> atomicReference = f71079b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (!atomicReference.compareAndSet(null, cVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (e.f71067j) {
                try {
                    Iterator it = e.f71068k.values().iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).n();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f71080a.unregisterReceiver(this);
        }
    }

    protected e(final Context context, String str, f fVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f71073e = atomicBoolean;
        this.f71074f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f71077i = copyOnWriteArrayList;
        new CopyOnWriteArrayList();
        this.f71069a = (Context) Preconditions.checkNotNull(context);
        this.f71070b = Preconditions.checkNotEmpty(str);
        this.f71071c = (f) Preconditions.checkNotNull(fVar);
        g a11 = FirebaseInitProvider.a();
        ArrayList a12 = n8.d.b(context, ComponentDiscoveryService.class).a();
        l.a g10 = l.g(o8.c.INSTANCE);
        g10.c(a12);
        g10.b(new FirebaseCommonRegistrar());
        g10.b(new ExecutorsRegistrar());
        g10.a(C8451a.n(context, Context.class, new Class[0]));
        g10.a(C8451a.n(this, e.class, new Class[0]));
        g10.a(C8451a.n(fVar, f.class, new Class[0]));
        g10.e(new I8.b());
        if (n.a(context) && FirebaseInitProvider.b()) {
            g10.a(C8451a.n(a11, g.class, new Class[0]));
        }
        l d11 = g10.d();
        this.f71072d = d11;
        this.f71075g = new r<>(new InterfaceC10861a() { // from class: k8.c
            @Override // y8.InterfaceC10861a
            public final Object get() {
                return e.b(e.this, context);
            }
        });
        this.f71076h = d11.d(w8.e.class);
        a aVar = new a() { // from class: k8.d
            @Override // k8.e.a
            public final void onBackgroundStateChanged(boolean z11) {
                e.a(e.this, z11);
            }
        };
        g();
        if (atomicBoolean.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar.onBackgroundStateChanged(true);
        }
        copyOnWriteArrayList.add(aVar);
    }

    public static /* synthetic */ void a(e eVar, boolean z11) {
        if (z11) {
            eVar.getClass();
        } else {
            eVar.f71076h.get().f();
        }
    }

    public static /* synthetic */ E8.a b(e eVar, Context context) {
        return new E8.a(context, eVar.m(), (v8.c) eVar.f71072d.a(v8.c.class));
    }

    static void f(e eVar, boolean z11) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = eVar.f71077i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onBackgroundStateChanged(z11);
        }
    }

    private void g() {
        Preconditions.checkState(!this.f71074f.get(), "FirebaseApp was deleted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static e j() {
        e eVar;
        synchronized (f71067j) {
            try {
                eVar = (e) f71068k.get("[DEFAULT]");
                if (eVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                eVar.f71076h.get().f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Context context = this.f71069a;
        boolean a11 = n.a(context);
        String str = this.f71070b;
        if (!a11) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            g();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            c.a(context);
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        g();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        this.f71072d.i(r());
        this.f71076h.get().f();
    }

    public static e o(@NonNull Context context) {
        synchronized (f71067j) {
            try {
                if (f71068k.containsKey("[DEFAULT]")) {
                    return j();
                }
                f a11 = f.a(context);
                if (a11 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return p(context, a11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static e p(@NonNull Context context, @NonNull f fVar) {
        e eVar;
        b.a(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f71067j) {
            C5132a c5132a = f71068k;
            Preconditions.checkState(!c5132a.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            eVar = new e(context, "[DEFAULT]", fVar);
            c5132a.put("[DEFAULT]", eVar);
        }
        eVar.n();
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.g();
        return this.f71070b.equals(eVar.f71070b);
    }

    @KeepForSdk
    public final <T> T h(Class<T> cls) {
        g();
        return (T) this.f71072d.a(cls);
    }

    public final int hashCode() {
        return this.f71070b.hashCode();
    }

    @NonNull
    public final Context i() {
        g();
        return this.f71069a;
    }

    @NonNull
    public final String k() {
        g();
        return this.f71070b;
    }

    @NonNull
    public final f l() {
        g();
        return this.f71071c;
    }

    @KeepForSdk
    public final String m() {
        StringBuilder sb2 = new StringBuilder();
        g();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f71070b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        g();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f71071c.c().getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    @KeepForSdk
    public final boolean q() {
        g();
        return this.f71075g.get().a();
    }

    @KeepForSdk
    public final boolean r() {
        g();
        return "[DEFAULT]".equals(this.f71070b);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f71070b).add("options", this.f71071c).toString();
    }
}
