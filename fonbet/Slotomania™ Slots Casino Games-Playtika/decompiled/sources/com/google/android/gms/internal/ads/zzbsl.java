package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.exoplayer2.C;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public final class zzbsl implements zzbsd, zzbsb {
    private zzcki zza;

    public zzbsl(Context context, VersionInfoParcel versionInfoParcel, zzbai zzbaiVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzckx {
        com.google.android.gms.ads.internal.zzt.zzd();
        zzcki zza = zzcky.zza(context, zzcms.zzb(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbhd.zza(), null, null, null, null, null);
        this.zza = zza;
        zza.zzE().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbsl.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzf(String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbsl.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzg(final String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbsl.this.zzr(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzh(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbsl.this.zzq(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzi(final zzbsc zzbscVar) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzcmg zzP = zzckiVar.zzP();
            Objects.requireNonNull(zzbscVar);
            zzP.zzH(new zzcmf() { // from class: com.google.android.gms.internal.ads.zzbsf
                @Override // com.google.android.gms.internal.ads.zzcmf
                public final /* synthetic */ void zza() {
                    zzbsc.this.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzj() {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.destroy();
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final boolean zzk() {
        zzcki zzckiVar = this.zza;
        return zzckiVar == null || zzckiVar.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final zzbtk zzl() {
        return new zzbtk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzm(String str, zzbpe zzbpeVar) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.zzab(str, new zzbse(this, zzbpeVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzn(String str, final zzbpe zzbpeVar) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.zzad(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbsj
                @Override // com.google.android.gms.common.util.Predicate
                public final /* synthetic */ boolean apply(Object obj) {
                    zzbpe zzbpeVar2 = (zzbpe) obj;
                    if (zzbpeVar2 instanceof zzbse) {
                        return ((zzbse) zzbpeVar2).zzb().equals(zzbpe.this);
                    }
                    return false;
                }
            });
        }
    }

    final /* synthetic */ void zzo(String str) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.zza(str);
        }
    }

    final /* synthetic */ void zzp(String str) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.loadData(str, "text/html", C.UTF8_NAME);
        }
    }

    final /* synthetic */ void zzq(String str) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.loadData(str, "text/html", C.UTF8_NAME);
        }
    }

    final /* synthetic */ void zzr(String str) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.loadUrl(str);
        }
    }
}
