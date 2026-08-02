package androidx.window.layout.adapter.sidecar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import xsna.aor0;
import xsna.epx;
import xsna.erx0;
import xsna.h380;
import xsna.nlj0;
import xsna.o7j;
import xsna.plj0;
import xsna.s3q0;
import xsna.tcq;
import xsna.yy4;

/* compiled from: SidecarCompat.kt */
/* loaded from: classes12.dex */
public final class SidecarCompat implements tcq {
    public final SidecarInterface a;
    public final nlj0 b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public b e;

    /* compiled from: SidecarCompat.kt */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface sidecarInterface;
            Window window;
            WindowManager.LayoutParams attributes;
            Collection<Activity> values = SidecarCompat.this.c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : values) {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (iBinder != null && (sidecarInterface = sidecarCompat.a) != null) {
                    sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinder);
                }
                b bVar = sidecarCompat.e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.b.d(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            Activity activity = (Activity) SidecarCompat.this.c.get(iBinder);
            if (activity == null) {
                return;
            }
            SidecarCompat sidecarCompat = SidecarCompat.this;
            nlj0 nlj0Var = sidecarCompat.b;
            SidecarInterface sidecarInterface = sidecarCompat.a;
            if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            erx0 d = nlj0Var.d(sidecarWindowLayoutInfo, sidecarDeviceState);
            b bVar = SidecarCompat.this.e;
            if (bVar != null) {
                bVar.a(activity, d);
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    public static final class a {
        public static SidecarInterface a(Context context) {
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public static aor0 b() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                aor0 aor0Var = aor0.g;
                return aor0.a.a(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    public static final class b {
        public final plj0.a a;
        public final ReentrantLock b = new ReentrantLock();
        public final WeakHashMap<Activity, erx0> c = new WeakHashMap<>();

        public b(plj0.a aVar) {
            this.a = aVar;
        }

        public final void a(Activity activity, erx0 erx0Var) {
            WeakHashMap<Activity, erx0> weakHashMap = this.c;
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                if (erx0Var.equals(weakHashMap.get(activity))) {
                    return;
                }
                weakHashMap.put(activity, erx0Var);
                reentrantLock.unlock();
                Iterator<plj0.b> it = plj0.this.b.iterator();
                while (it.hasNext()) {
                    plj0.b next = it.next();
                    if (next.a.equals(activity)) {
                        next.d = erx0Var;
                        next.b.execute(new yy4(10, next, erx0Var));
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public SidecarCompat(Context context) {
        SidecarInterface a2 = a.a(context);
        nlj0 nlj0Var = new nlj0(0);
        this.a = a2;
        this.b = nlj0Var;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.tcq
    public final void a(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.d;
        o7j<Configuration> o7jVar = (o7j) linkedHashMap.get(activity);
        if (o7jVar != null) {
            if (activity instanceof h380) {
                ((h380) activity).removeOnConfigurationChangedListener(o7jVar);
            }
            linkedHashMap.remove(activity);
        }
        b bVar = this.e;
        if (bVar != null) {
            ReentrantLock reentrantLock = bVar.b;
            reentrantLock.lock();
            try {
                bVar.c.put(activity, null);
                s3q0 s3q0Var = s3q0.a;
            } finally {
                reentrantLock.unlock();
            }
        }
        LinkedHashMap linkedHashMap2 = this.c;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z || (sidecarInterface = this.a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    @Override // xsna.tcq
    public final void b(Activity activity) {
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder != null) {
            d(iBinder, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    public final erx0 c(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new erx0(EmptyList.b);
        }
        SidecarInterface sidecarInterface = this.a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinder) : null;
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.b.d(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(activity, c(activity));
        }
        LinkedHashMap linkedHashMap2 = this.d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof h380)) {
            o7j<Configuration> o7jVar = new o7j() { // from class: xsna.olj0
                @Override // xsna.o7j
                public final void accept(Object obj) {
                    SidecarCompat sidecarCompat = SidecarCompat.this;
                    SidecarCompat.b bVar2 = sidecarCompat.e;
                    if (bVar2 != null) {
                        Activity activity2 = activity;
                        bVar2.a(activity2, sidecarCompat.c(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, o7jVar);
            ((h380) activity).addOnConfigurationChangedListener(o7jVar);
        }
    }

    public final void e(plj0.a aVar) {
        this.e = new b(aVar);
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.b, new TranslatingCallback()));
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public final boolean f() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!epx.f(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!epx.f(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!epx.f(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!epx.f(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                if (((Integer) SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null)).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            sidecarDisplayFeature.setRect(sidecarDisplayFeature.getRect());
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                if (arrayList.equals((List) SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null))) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* compiled from: SidecarCompat.kt */
    public static final class c implements View.OnAttachStateChangeListener {
        public final SidecarCompat b;
        public final WeakReference<Activity> c;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            this.b = sidecarCompat;
            this.c = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            Window window;
            WindowManager.LayoutParams attributes;
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.c.get();
            IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            if (activity == null || iBinder == null) {
                return;
            }
            this.b.d(iBinder, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
