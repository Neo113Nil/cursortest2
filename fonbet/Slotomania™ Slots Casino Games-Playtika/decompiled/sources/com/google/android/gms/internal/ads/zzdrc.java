package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdrc {
    private final zzdvw zza;
    private final zzdul zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdrc(zzdvw zzdvwVar, zzdul zzdulVar) {
        this.zza = zzdvwVar;
        this.zzb = zzdulVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzckx {
        zzcki zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zza.zzE().setVisibility(4);
        zza.zzE().setContentDescription("policy_validator");
        zza.zzab("/sendMessageToSdk", new zzbpe() { // from class: com.google.android.gms.internal.ads.zzdrb
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdrc.this.zzb((zzcki) obj, map);
            }
        });
        zza.zzab("/hideValidatorOverlay", new zzbpe() { // from class: com.google.android.gms.internal.ads.zzdqw
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdrc.this.zzc(windowManager, view, (zzcki) obj, map);
            }
        });
        zza.zzab("/open", new zzbpr(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zza);
        zzbpe zzbpeVar = new zzbpe() { // from class: com.google.android.gms.internal.ads.zzdqx
            @Override // com.google.android.gms.internal.ads.zzbpe
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdrc.this.zzd(view, windowManager, (zzcki) obj, map);
            }
        };
        zzdul zzdulVar = this.zzb;
        zzdulVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzbpeVar);
        zzdulVar.zzh(new WeakReference(zza), "/showValidatorOverlay", zzdqy.zza);
        return zza.zzE();
    }

    final /* synthetic */ void zzb(zzcki zzckiVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcki zzckiVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hide native ad policy validator overlay.");
        zzckiVar.zzE().setVisibility(8);
        if (zzckiVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzckiVar.zzE());
        }
        zzckiVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    final /* synthetic */ void zzd(final View view, final WindowManager windowManager, zzcki zzckiVar, final Map map) {
        final zzcki zzckiVar2;
        zzckiVar.zzP().zzG(new zzcme() { // from class: com.google.android.gms.internal.ads.zzdra
            @Override // com.google.android.gms.internal.ads.zzcme
            public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
                zzdrc.this.zze(map, z, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjo)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjp)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzckiVar.zzaf(zzcms.zzc(zzf, zzf2));
        try {
            zzckiVar.zzD().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjq)).booleanValue());
            zzckiVar.zzD().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjr)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzk = com.google.android.gms.ads.internal.util.zzbs.zzk();
        zzk.x = zzf3;
        zzk.y = zzf4;
        windowManager.updateViewLayout(zzckiVar.zzE(), zzk);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - zzf4;
            zzckiVar2 = zzckiVar;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdqz
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final /* synthetic */ void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcki zzckiVar3 = zzckiVar2;
                        if (zzckiVar3.zzE().getWindowToken() == null) {
                            return;
                        }
                        int i2 = i;
                        WindowManager.LayoutParams layoutParams = zzk;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i2;
                        } else {
                            layoutParams.y = rect2.top - i2;
                        }
                        windowManager.updateViewLayout(zzckiVar3.zzE(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        } else {
            zzckiVar2 = zzckiVar;
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzckiVar2.loadUrl(str2);
    }

    final /* synthetic */ void zze(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", hashMap);
    }
}
