package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes6.dex */
public final class zzbfe extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbev zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbfe() {
        zzbev zzbevVar = new zzbev();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbevVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbjv.zzd.zze()).intValue();
        this.zzg = ((Long) zzbjv.zza.zze()).intValue();
        this.zzh = ((Long) zzbjv.zze.zze()).intValue();
        this.zzi = ((Long) zzbjv.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaH)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaI)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaJ)).intValue();
        this.zze = ((Long) zzbjv.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaL);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaM)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaN)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaO)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:
    
        if (r3.importance != 100) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzt.zzg().zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchThread: no activity. Sleeping.");
        zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0074, code lost:
    
        if (r0.getWindow() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007e, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0080, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0090, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0091, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, "ContentFetchTask.extractContent");
        r2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00db, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00dc, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ca, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e6 A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00e6->B:16:0x00e6, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        View view;
        while (true) {
            try {
                Context zze = com.google.android.gms.ads.internal.zzt.zzg().zze();
                if (zze != null) {
                    ActivityManager activityManager = (ActivityManager) zze.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) zze.getSystemService("keyguard");
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
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "ContentFetchTask.isInForeground");
            }
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchTask: sleeping");
            zze();
            Thread.sleep(this.zze * 1000);
            obj = this.zzc;
            synchronized (obj) {
                while (this.zzb) {
                    try {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchTask: waiting");
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new zzbfa(this, view));
        }
        Thread.sleep(this.zze * 1000);
        obj = this.zzc;
        synchronized (obj) {
        }
    }

    public final void zza() {
        synchronized (this.zzc) {
            if (this.zza) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Content hash thread already started, quitting...");
            } else {
                this.zza = true;
                start();
            }
        }
    }

    final void zzb(View view) {
        try {
            zzbeu zzbeuVar = new zzbeu(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context zze = com.google.android.gms.ads.internal.zzt.zzg().zze();
            if (zze != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(zze.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaK), "id", zze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzbfd zzc = zzc(view, zzbeuVar);
            zzbeuVar.zzi();
            if (zzc.zza == 0 && zzc.zzb == 0) {
                return;
            }
            int i = zzc.zzb;
            if (i == 0 && zzbeuVar.zzl() == 0) {
                return;
            }
            if (i == 0 && this.zzd.zza(zzbeuVar)) {
                return;
            }
            this.zzd.zzc(zzbeuVar);
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "ContentFetchTask.fetchContent");
        }
    }

    final zzbfd zzc(View view, zzbeu zzbeuVar) {
        if (view == null) {
            return new zzbfd(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbfd(this, 0, 0);
            }
            zzbeuVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbfd(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcki)) {
            WebView webView = (WebView) view;
            zzbeuVar.zze();
            webView.post(new zzbfc(this, zzbeuVar, webView, globalVisibleRect));
            return new zzbfd(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzbfd(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            zzbfd zzc = zzc(viewGroup.getChildAt(i3), zzbeuVar);
            i += zzc.zza;
            i2 += zzc.zzb;
        }
        return new zzbfd(this, i, i2);
    }

    final void zzd(zzbeu zzbeuVar, WebView webView, String str, boolean z) {
        zzbeu zzbeuVar2;
        zzbeuVar.zzd();
        try {
            if (TextUtils.isEmpty(str)) {
                zzbeuVar2 = zzbeuVar;
            } else {
                String optString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzbeuVar2 = zzbeuVar;
                    zzbeuVar2.zzf(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzbeuVar.zzf(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzbeuVar2 = zzbeuVar;
                }
            }
            if (zzbeuVar2.zza()) {
                this.zzd.zzb(zzbeuVar2);
            }
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Json string may be malformed.");
        } catch (Throwable th) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = true");
            String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        }
    }
}
