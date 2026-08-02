package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbil;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdor implements zzddp, zzdlb {
    public final zzceo a;
    public final Context b;
    public final zzcer c;
    public final View d;
    public String e;
    public final zzbil.zza.EnumC0134zza f;
    public final zzfld g;

    public zzdor(zzceo zzceoVar, Context context, zzcer zzcerVar, WebView webView, zzbil.zza.EnumC0134zza enumC0134zza, zzfld zzfldVar) {
        this.a = zzceoVar;
        this.b = context;
        this.c = zzcerVar;
        this.d = webView;
        this.f = enumC0134zza;
        this.g = zzfldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void I() {
        if (this.g.G0) {
            this.a.c(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void L() {
        if (this.g.G0) {
            View view = this.d;
            if (view != null && this.e != null) {
                Context context = view.getContext();
                String str = this.e;
                zzcer zzcerVar = this.c;
                AtomicReference atomicReference = zzcerVar.h;
                if (zzcerVar.a(context) && (context instanceof Activity) && zzcerVar.m(context, Constants.FID_CLASS, atomicReference, false)) {
                    ConcurrentHashMap concurrentHashMap = zzcerVar.i;
                    Method method = (Method) concurrentHashMap.get("setCurrentScreen");
                    if (method == null) {
                        try {
                            method = context.getClassLoader().loadClass(Constants.FID_CLASS).getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            concurrentHashMap.put("setCurrentScreen", method);
                        } catch (Exception unused) {
                            zzcerVar.l("setCurrentScreen", false);
                            method = null;
                        }
                    }
                    try {
                        method.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        zzcerVar.l("setCurrentScreen", false);
                    }
                }
            }
            this.a.c(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void n(zzcce zzcceVar, String str, String str2) {
        zzcer zzcerVar = this.c;
        Context context = this.b;
        if (zzcerVar.a(context) && this.g.G0) {
            try {
                zzcerVar.e(context, zzcerVar.d(context), this.a.c, zzcceVar.b, zzcceVar.a);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlb
    public final void zzh() {
        zzbil.zza.EnumC0134zza enumC0134zza = zzbil.zza.EnumC0134zza.APP_OPEN;
        zzbil.zza.EnumC0134zza enumC0134zza2 = this.f;
        if (enumC0134zza2 != enumC0134zza && this.g.G0) {
            zzcer zzcerVar = this.c;
            Context context = this.b;
            String str = "";
            if (zzcerVar.a(context)) {
                AtomicReference atomicReference = zzcerVar.g;
                if (zzcerVar.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                    try {
                        String str2 = (String) zzcerVar.i(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                        if (str2 == null) {
                            str2 = (String) zzcerVar.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                    } catch (Exception unused) {
                        zzcerVar.l("getCurrentScreenName", false);
                    }
                }
            }
            this.e = str;
            this.e = str.concat(enumC0134zza2 == zzbil.zza.EnumC0134zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void a0() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlb
    public final void zzg() {
    }
}
