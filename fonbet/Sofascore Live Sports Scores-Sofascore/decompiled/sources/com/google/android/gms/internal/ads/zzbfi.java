package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.f2n;
import defpackage.sln;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbfi implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long o = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.d2)).longValue();
    public final Context a;
    public final Application b;
    public final PowerManager c;
    public final KeyguardManager d;
    public com.facebook.internal.d e;
    public WeakReference f;
    public final WeakReference g;
    public final sln h;
    public final com.google.android.gms.ads.internal.util.zzbu i = new com.google.android.gms.ads.internal.util.zzbu(o);
    public boolean j = false;
    public int k = -1;
    public final HashSet l = new HashSet();
    public final DisplayMetrics m;
    public final Rect n;

    public zzbfi(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.c = (PowerManager) applicationContext.getSystemService("power");
        this.d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.b = (Application) applicationContext;
            this.h = new sln((Application) applicationContext, this);
        }
        this.m = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.n = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.g;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.g = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f = rect.left;
        float f2 = this.m.density;
        return new Rect((int) (f / f2), (int) (rect.top / f2), (int) (rect.right / f2), (int) (rect.bottom / f2));
    }

    public final void b() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new f2n(this, 15));
    }

    public final void c(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.g;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.k = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0159, code lost:
    
        if (r10 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0134, code lost:
    
        if (r10 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0136, code lost:
    
        r4 = 1;
        r14 = true;
        r15 = true;
        r10 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r27v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i) {
        WeakReference weakReference;
        int i2;
        boolean z;
        boolean z2;
        View view;
        ?? r0;
        int i3;
        PowerManager powerManager;
        HashSet hashSet;
        boolean z3;
        int i4;
        HashSet hashSet2 = this.l;
        if (hashSet2.isEmpty() || (weakReference = this.g) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            z = view2.getGlobalVisibleRect(rect2);
            z2 = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
                i2 = 0;
            } catch (Exception e) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                i2 = 0;
                zzo.zzg("Failure getting view location.", e);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.i6)).booleanValue()) {
                i4 = iArr2[i2];
                rect.left = i4;
                rect.top = iArr2[1];
            } else {
                i4 = iArr[i2];
                rect.left = i4;
                rect.top = iArr[1];
            }
            rect.right = view2.getWidth() + i4;
            rect.bottom = view2.getHeight() + rect.top;
            view = view2;
        } else {
            i2 = 0;
            z = false;
            z2 = false;
            view = null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.g2)).booleanValue() || view == null) {
            r0 = Collections.EMPTY_LIST;
        } else {
            try {
                r0 = new ArrayList();
                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        r0.add(a(rect5));
                    }
                }
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.zzt.zzh().d("PositionWatcher.getParentScrollViewRects", e2);
                r0 = Collections.EMPTY_LIST;
            }
        }
        List list = r0;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i6 = this.k;
        if (i6 != -1) {
            windowVisibility = i6;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long zzy = com.google.android.gms.ads.internal.util.zzs.zzy(view);
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ic)).booleanValue();
        KeyguardManager keyguardManager = this.d;
        PowerManager powerManager2 = this.c;
        if (booleanValue) {
            if (view2 != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzX(view, powerManager2, keyguardManager)) {
                    if (z) {
                        if (z2) {
                            if (zzy >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.lc)).intValue()) {
                            }
                            z = true;
                            z2 = true;
                        }
                        z = true;
                        i3 = i2;
                        z2 = i3;
                    }
                    i3 = i2;
                    z = i3;
                }
            }
            i3 = i2;
        } else {
            if (view2 != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzX(view, powerManager2, keyguardManager)) {
                    if (z) {
                        if (z2) {
                        }
                        z = true;
                        i3 = i2;
                        z2 = i3;
                    }
                    i3 = i2;
                    z = i3;
                }
            }
            i3 = i2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.nc)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            int i7 = true != com.google.android.gms.ads.internal.util.zzs.zzX(view, powerManager2, keyguardManager) ? i2 : 64;
            int i8 = true != z ? i2 : 8;
            int i9 = true != z2 ? i2 : 16;
            powerManager = powerManager2;
            hashSet = hashSet2;
            int i10 = windowVisibility == 0 ? 128 : i2;
            int i11 = i7;
            int i12 = zzy >= ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.lc)).intValue()) ? 32 : i2;
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzM(view, i12 | i11 | i8 | i9 | i10 | i3, null);
        } else {
            powerManager = powerManager2;
            hashSet = hashSet2;
        }
        if (i == 1 && !this.i.zza() && i3 == this.j) {
            return;
        }
        if (i3 != 0 || this.j) {
            z3 = true;
        } else {
            z3 = true;
            if (i == 1) {
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        powerManager.isScreenOn();
        ?? r18 = (view == null || !view.isAttachedToWindow()) ? i2 : z3;
        int windowVisibility2 = view != null ? view.getWindowVisibility() : 8;
        Rect a = a(this.n);
        Rect a2 = a(rect);
        Rect a3 = a(rect2);
        Rect a4 = a(rect3);
        Rect a5 = a(rect4);
        float f = this.m.density;
        ?? r27 = i3;
        zzbff zzbffVar = new zzbff(r18, windowVisibility2, a, a2, a3, z, a4, z2, a5, r27, list);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((zzbfg) it.next()).A(zzbffVar);
        }
        this.j = r27;
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.e = new com.facebook.internal.d(this, 13);
            com.google.android.gms.ads.internal.zzt.zzA().zzb(this.a, this.e, intentFilter);
        }
        Application application = this.b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.h);
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f = null;
            }
        } catch (Exception e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.e != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzA().zzc(this.a, this.e);
            } catch (IllegalStateException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzt.zzh().d("ActiveViewUnit.stopScreenStatusMonitoring", e4);
            }
            this.e = null;
        }
        Application application = this.b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.h);
            } catch (Exception e5) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity, 4);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d(3);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d(2);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.k = -1;
        e(view);
        d(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.k = -1;
        d(3);
        b();
        f(view);
    }
}
