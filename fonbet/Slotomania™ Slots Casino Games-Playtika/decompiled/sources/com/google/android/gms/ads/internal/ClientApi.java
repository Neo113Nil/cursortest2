package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzaj;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbuq;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbw;
import com.google.android.gms.internal.ads.zzcea;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.internal.ads.zzdqa;
import com.google.android.gms.internal.ads.zzdqc;
import com.google.android.gms.internal.ads.zzeaq;
import com.google.android.gms.internal.ads.zzerr;
import com.google.android.gms.internal.ads.zzfeu;
import com.google.android.gms.internal.ads.zzfgi;
import com.google.android.gms.internal.ads.zzfhy;
import com.google.android.gms.internal.ads.zzfjm;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public class ClientApi extends zzcn {
    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzb(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbuq zzbuqVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfgi zzj = zzcmx.zza(context, zzbuqVar, i).zzj();
        zzj.zzd(context);
        zzj.zzb(zzrVar);
        zzj.zzc(str);
        return zzj.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbuq zzbuqVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfhy zzn = zzcmx.zza(context, zzbuqVar, i).zzn();
        zzn.zzd(context);
        zzn.zzb(zzrVar);
        zzn.zzc(str);
        return zzn.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbq zzd(IObjectWrapper iObjectWrapper, String str, zzbuq zzbuqVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzerr(zzcmx.zza(context, zzbuqVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzblw zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdqc((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcbg zzf(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfjm zzq = zzcmx.zza(context, zzbuqVar, i).zzq();
        zzq.zzc(context);
        return zzq.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbyp zzg(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzw(activity);
        }
        int i = zza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new zzw(activity) : new zzag(activity) : new zzac(activity, zza) : new zzaj(activity) : new zzai(activity) : new zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzh(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i) {
        return zzcmx.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbuqVar, i).zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzi(IObjectWrapper iObjectWrapper, int i) {
        return zzcmx.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i).zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    @Deprecated
    public final zzbu zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzrVar, str, new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbmb zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdqa((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcbw zzl(IObjectWrapper iObjectWrapper, String str, zzbuq zzbuqVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfjm zzq = zzcmx.zza(context, zzbuqVar, i).zzq();
        zzq.zzc(context);
        zzq.zzb(str);
        return zzq.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzm(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbuq zzbuqVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfeu zzl = zzcmx.zza(context, zzbuqVar, i).zzl();
        zzl.zzb(str);
        zzl.zzc(context);
        return zzl.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcea zzn(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i) {
        return zzcmx.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbuqVar, i).zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbyi zzo(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i) {
        return zzcmx.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbuqVar, i).zzu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbqh zzp(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i, zzbqe zzbqeVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeaq zzA = zzcmx.zza(context, zzbuqVar, i).zzA();
        zzA.zzc(context);
        zzA.zzb(zzbqeVar);
        return zzA.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzq(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i) {
        return zzcmx.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbuqVar, i).zzC();
    }
}
