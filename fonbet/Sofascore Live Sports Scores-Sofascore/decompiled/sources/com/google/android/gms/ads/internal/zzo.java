package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.internal.ads.zzfmy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzo extends WebViewClient {
    public final /* synthetic */ zzs a;

    public zzo(zzs zzsVar) {
        this.a = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzs zzsVar = this.a;
        zzbh zzbhVar = zzsVar.f;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzc(zzfmy.d(1, null, null));
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        zzbh zzbhVar2 = zzsVar.f;
        if (zzbhVar2 != null) {
            try {
                zzbhVar2.zzb(0);
            } catch (RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzs zzsVar = this.a;
        Context context = zzsVar.c;
        int i = 0;
        if (str.startsWith(zzsVar.F4())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzbh zzbhVar = zzsVar.f;
            if (zzbhVar != null) {
                try {
                    zzbhVar.zzc(zzfmy.d(3, null, null));
                } catch (RemoteException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
            zzbh zzbhVar2 = zzsVar.f;
            if (zzbhVar2 != null) {
                try {
                    zzbhVar2.zzb(3);
                } catch (RemoteException e2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                }
            }
            zzsVar.E4(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzbh zzbhVar3 = zzsVar.f;
            if (zzbhVar3 != null) {
                try {
                    zzbhVar3.zzc(zzfmy.d(1, null, null));
                } catch (RemoteException e3) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzbh zzbhVar4 = zzsVar.f;
            if (zzbhVar4 != null) {
                try {
                    zzbhVar4.zzb(0);
                } catch (RemoteException e4) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                }
            }
            zzsVar.E4(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            zzbh zzbhVar5 = zzsVar.f;
            if (zzbhVar5 != null) {
                try {
                    zzbhVar5.zze();
                } catch (RemoteException e5) {
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e5);
                }
            }
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    zzay.zza();
                    i = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
            zzsVar.E4(i);
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        zzbh zzbhVar6 = zzsVar.f;
        if (zzbhVar6 != null) {
            try {
                zzbhVar6.zzg();
                zzsVar.f.zzd();
            } catch (RemoteException e6) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
        return true;
    }
}
