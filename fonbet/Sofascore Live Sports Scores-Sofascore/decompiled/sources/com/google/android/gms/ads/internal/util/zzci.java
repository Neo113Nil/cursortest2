package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import defpackage.isn;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzci {
    public final View a;
    public Activity b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ViewTreeObserver.OnGlobalLayoutListener f;

    public zzci(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.b = activity;
        this.a = view;
        this.f = onGlobalLayoutListener;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        if (this.c) {
            return;
        }
        Activity activity = this.b;
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        com.google.android.gms.ads.internal.zzt.zzC();
        isn isnVar = new isn(this.a, onGlobalLayoutListener);
        View view = (View) ((WeakReference) isnVar.b).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            isnVar.R(viewTreeObserver2);
        }
        this.c = true;
    }

    public final void zza(Activity activity) {
        this.b = activity;
    }

    public final void zzb() {
        this.e = true;
        if (this.d) {
            a();
        }
    }

    public final void zzc() {
        View decorView;
        this.e = false;
        Activity activity = this.b;
        if (activity != null && this.c) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f);
            }
            this.c = false;
        }
    }

    public final void zzd() {
        this.d = true;
        if (this.e) {
            a();
        }
    }

    public final void zze() {
        View decorView;
        this.d = false;
        Activity activity = this.b;
        if (activity != null && this.c) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f);
            }
            this.c = false;
        }
    }
}
