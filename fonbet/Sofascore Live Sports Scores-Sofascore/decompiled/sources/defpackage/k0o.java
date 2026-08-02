package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcnw;
import com.google.android.gms.internal.ads.zzdsm;
import com.ironsource.U3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0o implements zzbqh {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k0o(zzdsm zzdsmVar, View view, WindowManager windowManager) {
        this.b = zzdsmVar;
        this.c = view;
        this.d = windowManager;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [l0o] */
    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        int i;
        int i2 = 2;
        switch (this.a) {
            case 0:
                zzdsm zzdsmVar = (zzdsm) this.b;
                WindowManager windowManager = (WindowManager) this.d;
                View view = (View) this.c;
                zzclm zzclmVar = (zzclm) obj;
                int i3 = zze.zza;
                zzo.zzd("Hide native ad policy validator overlay.");
                zzclmVar.zzE().setVisibility(8);
                if (zzclmVar.zzE().getWindowToken() != null) {
                    windowManager.removeView(zzclmVar.zzE());
                }
                zzclmVar.destroy();
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (zzdsmVar.c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                    return;
                }
                viewTreeObserver.removeOnScrollChangedListener(zzdsmVar.c);
                return;
            case 1:
                zzdsm zzdsmVar2 = (zzdsm) this.b;
                final View view2 = (View) this.c;
                final WindowManager windowManager2 = (WindowManager) this.d;
                final zzclm zzclmVar2 = (zzclm) obj;
                zzclmVar2.zzP().g = new f0o(i2, zzdsmVar2, map);
                if (map == null) {
                    return;
                }
                Context context = view2.getContext();
                String str = (String) map.get("validator_width");
                int intValue = ((Integer) zzba.zzc().a(zzbjg.w9)).intValue();
                try {
                    intValue = Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                }
                zzay.zza();
                int zzE = zzf.zzE(context, intValue);
                String str2 = (String) map.get("validator_height");
                int intValue2 = ((Integer) zzba.zzc().a(zzbjg.x9)).intValue();
                try {
                    intValue2 = Integer.parseInt(str2);
                } catch (NumberFormatException unused2) {
                }
                zzay.zza();
                int zzE2 = zzf.zzE(context, intValue2);
                int i4 = 0;
                try {
                    i = Integer.parseInt((String) map.get("validator_x"));
                } catch (NumberFormatException unused3) {
                    i = 0;
                }
                zzay.zza();
                int zzE3 = zzf.zzE(context, i);
                try {
                    i4 = Integer.parseInt((String) map.get("validator_y"));
                } catch (NumberFormatException unused4) {
                }
                zzay.zza();
                int zzE4 = zzf.zzE(context, i4);
                zzclmVar2.J(new zzcnw(1, zzE, zzE2));
                try {
                    zzclmVar2.zzD().getSettings().setUseWideViewPort(((Boolean) zzba.zzc().a(zzbjg.y9)).booleanValue());
                    zzclmVar2.zzD().getSettings().setLoadWithOverviewMode(((Boolean) zzba.zzc().a(zzbjg.z9)).booleanValue());
                } catch (NullPointerException unused5) {
                }
                final WindowManager.LayoutParams zzk = zzbs.zzk();
                zzk.x = zzE3;
                zzk.y = zzE4;
                windowManager2.updateViewLayout(zzclmVar2.zzE(), zzk);
                final String str3 = (String) map.get(U3.i.n);
                Rect rect = new Rect();
                if (view2.getGlobalVisibleRect(rect)) {
                    final int i5 = (("1".equals(str3) || "2".equals(str3)) ? rect.bottom : rect.top) - zzE4;
                    zzdsmVar2.c = new ViewTreeObserver.OnScrollChangedListener() { // from class: l0o
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final /* synthetic */ void onScrollChanged() {
                            Rect rect2 = new Rect();
                            if (view2.getGlobalVisibleRect(rect2)) {
                                zzclm zzclmVar3 = zzclmVar2;
                                if (zzclmVar3.zzE().getWindowToken() == null) {
                                    return;
                                }
                                String str4 = str3;
                                boolean equals = "1".equals(str4);
                                int i6 = i5;
                                WindowManager.LayoutParams layoutParams = zzk;
                                if (equals || "2".equals(str4)) {
                                    layoutParams.y = rect2.bottom - i6;
                                } else {
                                    layoutParams.y = rect2.top - i6;
                                }
                                windowManager2.updateViewLayout(zzclmVar3.zzE(), layoutParams);
                            }
                        }
                    };
                    ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                    if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.addOnScrollChangedListener(zzdsmVar2.c);
                    }
                }
                String str4 = (String) map.get("overlay_url");
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                zzclmVar2.loadUrl(str4);
                return;
            default:
                zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                zzbum zzbumVar = (zzbum) this.c;
                synchronized (zzbumVar.a) {
                    try {
                        zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        zzo.zzh("JS Engine is requesting an update");
                        if (zzbumVar.g == 0) {
                            zzo.zzh("Starting reload.");
                            zzbumVar.g = 2;
                            zzbumVar.a();
                        }
                        ((zzbtp) this.b).a0("/requestReload", (zzbqh) ((zzbv) this.d).zza());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
        }
    }

    public /* synthetic */ k0o(zzdsm zzdsmVar, WindowManager windowManager, View view) {
        this.b = zzdsmVar;
        this.d = windowManager;
        this.c = view;
    }

    public k0o(zzbum zzbumVar, zzbtp zzbtpVar, zzbv zzbvVar) {
        this.b = zzbtpVar;
        this.d = zzbvVar;
        this.c = zzbumVar;
    }
}
