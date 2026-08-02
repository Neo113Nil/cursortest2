package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgqw implements zzgqe {
    public long a = -1;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public final long i = SystemClock.uptimeMillis();

    public static boolean d(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object invoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) invoke.getClass().getField("adType").get(invoke);
            num.intValue();
            String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (str.contains("INTERSTITIAL") || str.contains("APP_OPEN")) {
                return true;
            }
            return str.contains("REWARDED");
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (d(r8) != false) goto L30;
     */
    @Override // com.google.android.gms.internal.ads.zzgqe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(HashMap hashMap, Context context, View view) {
        WindowManager windowManager;
        try {
            this.d = this.c;
            this.c = SystemClock.uptimeMillis();
            long j = this.e;
            if (j != -1) {
                this.f = j;
            }
            DisplayMetrics displayMetrics = null;
            if ((Build.VERSION.SDK_INT < 33 || context.isUiContext()) && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                displayMetrics = new DisplayMetrics();
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (NoSuchMethodError unused) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
            if (displayMetrics != null) {
                int i = displayMetrics.widthPixels * displayMetrics.heightPixels;
                if (view != null) {
                    int min = Math.min(view.getWidth(), displayMetrics.widthPixels) * Math.min(view.getHeight(), displayMetrics.heightPixels);
                    if (min + min < i) {
                        if (min == 0) {
                        }
                    }
                    this.e = this.c;
                    e(hashMap);
                }
            }
            this.e = -1L;
            e(hashMap);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final synchronized void b(HashMap hashMap) {
        this.h = this.g;
        this.g = SystemClock.uptimeMillis();
        e(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final synchronized void c(HashMap hashMap) {
        this.b = this.a;
        this.a = SystemClock.uptimeMillis();
        e(hashMap);
    }

    public final void e(HashMap hashMap) {
        hashMap.put("tcq", Long.valueOf(this.a));
        hashMap.put("tpq", Long.valueOf(this.b));
        hashMap.put("tcc", Long.valueOf(this.g));
        hashMap.put("tpc", Long.valueOf(this.h));
        hashMap.put("tpv", Long.valueOf(this.d));
        hashMap.put("tcv", Long.valueOf(this.c));
        hashMap.put("tchv", Long.valueOf(this.e));
        hashMap.put("tphv", Long.valueOf(this.f));
        hashMap.put("tst", Long.valueOf(this.i));
    }
}
