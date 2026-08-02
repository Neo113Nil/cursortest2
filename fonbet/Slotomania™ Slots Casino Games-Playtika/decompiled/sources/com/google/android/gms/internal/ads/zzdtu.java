package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdtu extends zzbmi {
    private final Context zza;
    private final zzdph zzb;
    private zzdqg zzc;
    private zzdpc zzd;

    public zzdtu(Context context, zzdph zzdphVar, zzdqg zzdqgVar, zzdpc zzdpcVar) {
        this.zza = context;
        this.zzb = zzdphVar;
        this.zzc = zzdqgVar;
        this.zzd = zzdpcVar;
    }

    final /* synthetic */ zzdpc zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final zzbls zzf(String str) {
        return (zzbls) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final List zzg() {
        try {
            zzdph zzdphVar = this.zzb;
            SimpleArrayMap zzaa = zzdphVar.zzaa();
            SimpleArrayMap zzad = zzdphVar.zzad();
            String[] strArr = new String[zzaa.getSize() + zzad.getSize()];
            int i = 0;
            for (int i2 = 0; i2 < zzaa.getSize(); i2++) {
                strArr[i] = (String) zzaa.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < zzad.getSize(); i3++) {
                strArr[i] = (String) zzad.keyAt(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzi(String str) {
        zzdpc zzdpcVar = this.zzd;
        if (zzdpcVar != null) {
            zzdpcVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzj() {
        zzdpc zzdpcVar = this.zzd;
        if (zzdpcVar != null) {
            zzdpcVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final com.google.android.gms.ads.internal.client.zzea zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzl() {
        zzdpc zzdpcVar = this.zzd;
        if (zzdpcVar != null) {
            zzdpcVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final boolean zzn(IObjectWrapper iObjectWrapper) {
        zzdqg zzdqgVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdqgVar = this.zzc) == null || !zzdqgVar.zzd((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzT().zzaq(new zzdtt(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final boolean zzo() {
        zzdpc zzdpcVar = this.zzd;
        if (zzdpcVar != null && !zzdpcVar.zzM()) {
            return false;
        }
        zzdph zzdphVar = this.zzb;
        return zzdphVar.zzW() != null && zzdphVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final boolean zzp() {
        zzdph zzdphVar = this.zzb;
        zzelb zzZ = zzdphVar.zzZ();
        if (zzZ == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zze(zzZ.zza());
        if (zzdphVar.zzW() == null) {
            return true;
        }
        zzdphVar.zzW().zze("onSdkLoaded", new ArrayMap());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzdpc zzdpcVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzb.zzZ() == null || (zzdpcVar = this.zzd) == null) {
            return;
        }
        zzdpcVar.zzN((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzr() {
        try {
            String zzac = this.zzb.zzac();
            if (Objects.equals(zzac, "Google")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(zzac)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdpc zzdpcVar = this.zzd;
                if (zzdpcVar != null) {
                    zzdpcVar.zzL(zzac, false);
                }
            }
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final zzblp zzs() throws RemoteException {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        zzdqg zzdqgVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdqgVar = this.zzc) == null || !zzdqgVar.zze((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzU().zzaq(new zzdtt(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }
}
