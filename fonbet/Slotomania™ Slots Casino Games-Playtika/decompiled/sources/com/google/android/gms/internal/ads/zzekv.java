package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzekv implements zzekw {
    static /* synthetic */ zzelb zzl(String str, String str2, String str3, zzekx zzekxVar, String str4, WebView webView, String str5, String str6, zzeky zzekyVar) {
        zzfui zza = zzfui.zza("Google", str2);
        zzfuh zzn = zzn("javascript");
        zzftz zzp = zzp(zzekxVar.toString());
        zzfuh zzfuhVar = zzfuh.NONE;
        if (zzn == zzfuhVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzp == null) {
            String valueOf = String.valueOf(zzekxVar);
            String.valueOf(valueOf);
            String valueOf2 = String.valueOf(valueOf);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(valueOf2));
            return null;
        }
        zzfuh zzn2 = zzn(str4);
        if (zzp != zzftz.VIDEO || zzn2 != zzfuhVar) {
            zzftw zza2 = zzftw.zza(zza, webView, str5, "");
            return new zzelb(zzftu.zze(zzftv.zza(zzp, zzo(zzekyVar.toString()), zzn, zzn2, true), zza2), zza2);
        }
        String.valueOf(str4);
        String valueOf3 = String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf3));
        return null;
    }

    static /* synthetic */ zzelb zzm(String str, String str2, String str3, String str4, zzekx zzekxVar, WebView webView, String str5, String str6, zzeky zzekyVar) {
        zzfui zza = zzfui.zza(str, str2);
        zzfuh zzn = zzn("javascript");
        zzfuh zzn2 = zzn(str4);
        zzftz zzp = zzp(zzekxVar.toString());
        zzfuh zzfuhVar = zzfuh.NONE;
        if (zzn == zzfuhVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzp == null) {
            String valueOf = String.valueOf(zzekxVar);
            String.valueOf(valueOf);
            String valueOf2 = String.valueOf(valueOf);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(valueOf2));
            return null;
        }
        if (zzp != zzftz.VIDEO || zzn2 != zzfuhVar) {
            zzftw zzb = zzftw.zzb(zza, webView, str5, "");
            return new zzelb(zzftu.zze(zzftv.zza(zzp, zzo(zzekyVar.toString()), zzn, zzn2, true), zzb), zzb);
        }
        String.valueOf(str4);
        String valueOf3 = String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf3));
        return null;
    }

    private static zzfuh zzn(String str) {
        return "native".equals(str) ? zzfuh.NATIVE : "javascript".equals(str) ? zzfuh.JAVASCRIPT : zzfuh.NONE;
    }

    private static zzfuc zzo(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? zzfuc.UNSPECIFIED : zzfuc.ONE_PIXEL : zzfuc.DEFINED_BY_JAVASCRIPT : zzfuc.BEGIN_TO_RENDER;
    }

    private static zzftz zzp(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            return zzftz.HTML_DISPLAY;
        }
        if (c == 1) {
            return zzftz.NATIVE_DISPLAY;
        }
        if (c != 2) {
            return null;
        }
        return zzftz.VIDEO;
    }

    private static final Object zzq(zzeku zzekuVar) {
        try {
            return zzekuVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzeku() { // from class: com.google.android.gms.internal.ads.zzekt
                @Override // com.google.android.gms.internal.ads.zzeku
                public final /* synthetic */ Object zza() {
                    if (zzfts.zzb()) {
                        return true;
                    }
                    zzfts.zza(context);
                    return Boolean.valueOf(zzfts.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue()) {
            return (String) zzq(zzekk.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final zzelb zzc(final String str, final WebView webView, String str2, String str3, final String str4, final zzeky zzekyVar, final zzekx zzekxVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue() || !zzfts.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzelb) zzq(new zzeku(str7, str, str6, zzekxVar, str4, webView, str5, str8, zzekyVar) { // from class: com.google.android.gms.internal.ads.zzekl
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzekx zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzeky zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzekxVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzekyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeku
            public final /* synthetic */ Object zza() {
                return zzekv.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final zzelb zzd(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzeky zzekyVar, final zzekx zzekxVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue() || !zzfts.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzelb) zzq(new zzeku(str5, str, str8, str4, zzekxVar, webView, str6, str7, zzekyVar) { // from class: com.google.android.gms.internal.ads.zzekm
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzekx zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzeky zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzekxVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzekyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeku
            public final /* synthetic */ Object zza() {
                return zzekv.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zze(final zzftu zzftuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue() && zzfts.zzb()) {
            Objects.requireNonNull(zzftuVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzftu.this.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zzf(final zzftu zzftuVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue() && zzfts.zzb()) {
                    zzftu.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zzg(final zzftu zzftuVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeko
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue() && zzfts.zzb()) {
                    zzftu.this.zzd(view, zzfub.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zzh(final zzftu zzftuVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue() && zzfts.zzb()) {
                    zzftu.this.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final zzfug zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z) {
        final boolean z2 = true;
        return (zzfug) zzq(new zzeku(webView, z2) { // from class: com.google.android.gms.internal.ads.zzekq
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeku
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
                int i = versionInfoParcel2.buddyApkVersion;
                int i2 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                return zzfug.zza(zzfui.zza("Google", sb.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zzj(final zzfug zzfugVar, final zzfuf zzfufVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfug.this.zzb(zzfufVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zzk(final zzfug zzfugVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeks
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfug.this.zzd(view, zzfub.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}
