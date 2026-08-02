package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.bnn;
import defpackage.f0o;
import defpackage.nkn;
import defpackage.ohn;
import defpackage.py3;
import defpackage.r18;
import defpackage.u4o;
import defpackage.v4o;
import defpackage.vng;
import defpackage.wjn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzemf implements zzemg {
    public static zzfvz j(String str) {
        return IronSourceConstants.EVENTS_NATIVE.equals(str) ? zzfvz.NATIVE : "javascript".equals(str) ? zzfvz.JAVASCRIPT : zzfvz.NONE;
    }

    public static zzfvu k(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1104128070) {
            if (hashCode != 1318088141) {
                if (hashCode == 1988248512 && str.equals("onePixel")) {
                    return zzfvu.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return zzfvu.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return zzfvu.BEGIN_TO_RENDER;
        }
        return zzfvu.UNSPECIFIED;
    }

    public static zzfvr l(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return zzfvr.HTML_DISPLAY;
            }
            return null;
        }
        if (hashCode == 112202875) {
            if (str.equals("video")) {
                return zzfvr.VIDEO;
            }
            return null;
        }
        if (hashCode == 714893483 && str.equals("nativeDisplay")) {
            return zzfvr.NATIVE_DISPLAY;
        }
        return null;
    }

    public static final Object m(v4o v4oVar) {
        try {
            return v4oVar.zzh();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().e("omid exception", e);
            return null;
        }
    }

    public static final void n(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().e("omid exception", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void a(zzfvy zzfvyVar, View view) {
        n(new nkn(zzfvyVar, view, false, 18));
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void b(zzfvq zzfvqVar, View view) {
        n(new nkn(zzfvqVar, view, false, 17));
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void c(zzfvq zzfvqVar, View view) {
        n(new bnn(15, zzfvqVar, view));
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void d(zzfvq zzfvqVar) {
        n(new u4o(zzfvqVar, 1));
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void e(zzfvq zzfvqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q6)).booleanValue() && zzfvk.a.a) {
            n(new u4o(zzfvqVar, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final zzeml f(WebView webView, zzemh zzemhVar, zzemi zzemiVar, String str, String str2, String str3, String str4) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q6)).booleanValue() && zzfvk.a.a) {
            return (zzeml) m(new r18(webView, zzemhVar, zzemiVar, str3, str, str2, str4));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void g(zzfvy zzfvyVar, ohn ohnVar) {
        n(new wjn(16, zzfvyVar, ohnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final zzeml h(String str, WebView webView, String str2, zzemi zzemiVar, zzemh zzemhVar, String str3) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q6)).booleanValue() && zzfvk.a.a) {
            return (zzeml) m(new vng(str, zzemhVar, str2, webView, str3, zzemiVar));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final zzfvy i(VersionInfoParcel versionInfoParcel, WebView webView) {
        return (zzfvy) m(new f0o(9, versionInfoParcel, webView));
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final boolean zza(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q6)).booleanValue()) {
            Boolean bool = (Boolean) m(new py3(context, 2));
            return bool != null && bool.booleanValue();
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final String zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q6)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }
}
