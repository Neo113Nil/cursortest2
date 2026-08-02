package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.internal.d;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kso implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final Handler m = new Handler(Looper.getMainLooper());
    public final Context a;
    public final Application b;
    public final PowerManager c;
    public final KeyguardManager d;
    public d e;
    public final jro f;
    public WeakReference g;
    public WeakReference h;
    public final sln i;
    public byte j = -1;
    public int k = -1;
    public long l = -3;

    public kso(Context context, jro jroVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f = jroVar;
        this.c = (PowerManager) applicationContext.getSystemService("power");
        this.d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.b = (Application) applicationContext;
            this.i = new sln((Application) applicationContext, this);
        }
        a(null);
    }

    public final void a(View view) {
        long j;
        WeakReference weakReference = this.h;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            e(view2);
        }
        this.h = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                d(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.l = j;
    }

    public final void b(Activity activity, int i) {
        Window window;
        if (this.h == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        WeakReference weakReference = this.h;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.k = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        if ((r1.flags & 524288) != 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Activity activity;
        WeakReference weakReference = this.h;
        if (weakReference == null) {
            return;
        }
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            this.l = -3L;
            this.j = (byte) -1;
            return;
        }
        int i = view.getVisibility() != 0 ? 1 : 0;
        if (!view.isShown()) {
            i |= 2;
        }
        PowerManager powerManager = this.c;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i |= 4;
        }
        if (!this.f.a) {
            KeyguardManager keyguardManager = this.d;
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                View rootView = view.getRootView();
                if (rootView == null) {
                    rootView = view;
                }
                Context context = rootView.getContext();
                for (int i2 = 0; (context instanceof ContextWrapper) && i2 < 10; i2++) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                activity = null;
                if (activity != null) {
                    Window window = activity.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                    }
                }
            }
            i |= 8;
        }
        if (!view.getGlobalVisibleRect(new Rect())) {
            i |= 16;
        }
        if (!view.getLocalVisibleRect(new Rect())) {
            i |= 32;
        }
        int windowVisibility = view.getWindowVisibility();
        int i3 = this.k;
        if (i3 != -1) {
            windowVisibility = i3;
        }
        if (windowVisibility != 0) {
            i |= 64;
        }
        if (this.j != i) {
            this.j = (byte) i;
            this.l = i == 0 ? SystemClock.elapsedRealtime() : (-3) - i;
        }
    }

    public final void d(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            d dVar = new d(this, 20);
            this.e = dVar;
            this.a.registerReceiver(dVar, intentFilter);
        }
        Application application = this.b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.i);
            } catch (Exception unused) {
            }
        }
    }

    public final void e(View view) {
        try {
            WeakReference weakReference = this.g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.g = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        d dVar = this.e;
        if (dVar != null) {
            try {
                this.a.unregisterReceiver(dVar);
            } catch (Exception unused3) {
            }
            this.e = null;
        }
        Application application = this.b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.i);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c();
        m.post(new dno(this, 3));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.k = -1;
        d(view);
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.k = -1;
        c();
        m.post(new dno(this, 3));
        e(view);
    }
}
