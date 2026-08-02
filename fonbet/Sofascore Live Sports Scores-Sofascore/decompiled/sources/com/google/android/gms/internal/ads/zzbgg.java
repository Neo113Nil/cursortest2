package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.lv4;
import defpackage.pmn;
import defpackage.uif;
import defpackage.wjn;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbgg extends Thread {
    public boolean a;
    public boolean b;
    public final Object c;
    public final zzbfx d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final String m;
    public final boolean n;
    public final boolean o;

    public zzbgg() {
        zzbfx zzbfxVar = new zzbfx();
        this.a = false;
        this.b = false;
        this.d = zzbfxVar;
        this.c = new Object();
        this.f = ((Long) zzbky.d.c()).intValue();
        this.g = ((Long) zzbky.a.c()).intValue();
        this.h = ((Long) zzbky.e.c()).intValue();
        this.i = ((Long) zzbky.c.c()).intValue();
        this.j = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L0)).intValue();
        this.k = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M0)).intValue();
        this.l = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.N0)).intValue();
        this.e = ((Long) zzbky.f.c()).intValue();
        this.m = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.P0);
        this.n = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Q0)).booleanValue();
        this.o = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.R0)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S0)).getClass();
        setName("ContentFetchTask");
    }

    public final uif a(View view, zzbfw zzbfwVar) {
        if (view == null) {
            return new uif(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new uif(this, 0, 0);
            }
            zzbfwVar.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new uif(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzclm)) {
            WebView webView = (WebView) view;
            synchronized (zzbfwVar.g) {
                zzbfwVar.m++;
            }
            webView.post(new lv4(this, zzbfwVar, webView, globalVisibleRect));
            return new uif(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new uif(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            uif a = a(viewGroup.getChildAt(i3), zzbfwVar);
            i += a.b;
            i2 += a.c;
        }
        return new uif(this, i, i2);
    }

    public final void b() {
        synchronized (this.c) {
            this.b = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = true");
            String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd(sb2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r4.importance != 100) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r3.inKeyguardRestrictedInputMode() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r0.isScreenOn() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzt.zzg().d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (r0 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchThread: no activity. Sleeping.");
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0084, code lost:
    
        if (r0.getWindow() == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008e, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0090, code lost:
    
        r2 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a1, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().d("ContentFetchTask.extractContent", r0);
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x007e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ee, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x007c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00dd, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzh().d("ContentFetchTask.run", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8 A[EXC_TOP_SPLITTER, LOOP:2: B:37:0x00f8->B:44:0x00f8, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        View view;
        Application application;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        while (true) {
            try {
                zzbgb zzg = com.google.android.gms.ads.internal.zzt.zzg();
                synchronized (zzg.a) {
                    try {
                        pmn pmnVar = zzg.b;
                        view = null;
                        application = pmnVar != null ? pmnVar.b : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (application != null) {
                    ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) application.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (Process.myPid() == next.pid) {
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.zzt.zzh().d("ContentFetchTask.isInForeground", th2);
            }
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("ContentFetchTask: sleeping");
            b();
            Thread.sleep(this.e * 1000);
            obj = this.c;
            synchronized (obj) {
                while (this.b) {
                    try {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzd("ContentFetchTask: waiting");
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new wjn(1, this, view));
        }
        Thread.sleep(this.e * 1000);
        obj = this.c;
        synchronized (obj) {
        }
    }
}
