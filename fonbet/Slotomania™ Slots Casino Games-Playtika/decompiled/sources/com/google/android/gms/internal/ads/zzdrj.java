package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes8.dex */
public final class zzdrj implements zzdpp, zzdhh {
    private final zzbvf zza;
    private final zzdcx zzb;
    private final zzdey zzc;
    private final zzdcd zzd;
    private final zzdkk zze;
    private final Context zzf;
    private final zzfjt zzg;
    private final VersionInfoParcel zzh;
    private final zzfkm zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbvb zzm;
    private final zzbvc zzn;

    public zzdrj(zzbvb zzbvbVar, zzbvc zzbvcVar, zzbvf zzbvfVar, zzdcx zzdcxVar, zzdey zzdeyVar, zzdcd zzdcdVar, zzdkk zzdkkVar, Context context, zzfjt zzfjtVar, VersionInfoParcel versionInfoParcel, zzfkm zzfkmVar) {
        this.zzm = zzbvbVar;
        this.zzn = zzbvcVar;
        this.zza = zzbvfVar;
        this.zzb = zzdcxVar;
        this.zzc = zzdeyVar;
        this.zzd = zzdcdVar;
        this.zze = zzdkkVar;
        this.zzf = context;
        this.zzg = zzfjtVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzfkmVar;
    }

    private static final HashMap zzB(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    private final void zzi(View view) {
        try {
            zzbvf zzbvfVar = this.zza;
            if (zzbvfVar != null && !zzbvfVar.zzu()) {
                zzbvfVar.zzw(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmf)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbvb zzbvbVar = this.zzm;
            if (zzbvbVar != null && !zzbvbVar.zzq()) {
                zzbvbVar.zzn(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmf)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbvc zzbvcVar = this.zzn;
            if (zzbvcVar == null || zzbvcVar.zzo()) {
                return;
            }
            zzbvcVar.zzl(ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmf)).booleanValue()) {
                this.zze.zzdu();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzA() {
        try {
            zzbvf zzbvfVar = this.zza;
            if (zzbvfVar != null) {
                zzbvfVar.zzC();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call destroy", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzq;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzg.zzaj;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzci)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcj)).booleanValue() && next.equals("3010")) {
                                zzbvf zzbvfVar = this.zza;
                                Object obj2 = null;
                                if (zzbvfVar != null) {
                                    try {
                                        zzq = zzbvfVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbvb zzbvbVar = this.zzm;
                                    if (zzbvbVar != null) {
                                        zzq = zzbvbVar.zzw();
                                    } else {
                                        zzbvc zzbvcVar = this.zzn;
                                        zzq = zzbvcVar != null ? zzbvcVar.zzu() : null;
                                    }
                                }
                                if (zzq != null) {
                                    obj2 = ObjectWrapper.unwrap(zzq);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbp.zza(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzc();
                                ClassLoader classLoader = this.zzf.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzl = z;
            HashMap zzB = zzB(map);
            HashMap zzB2 = zzB(map2);
            zzbvf zzbvfVar2 = this.zza;
            if (zzbvfVar2 != null) {
                zzbvfVar2.zzx(wrap, ObjectWrapper.wrap(zzB), ObjectWrapper.wrap(zzB2));
                return;
            }
            zzbvb zzbvbVar2 = this.zzm;
            if (zzbvbVar2 != null) {
                zzbvbVar2.zzy(wrap, ObjectWrapper.wrap(zzB), ObjectWrapper.wrap(zzB2));
                zzbvbVar2.zzo(wrap);
                return;
            }
            zzbvc zzbvcVar2 = this.zzn;
            if (zzbvcVar2 != null) {
                zzbvcVar2.zzw(wrap, ObjectWrapper.wrap(zzB), ObjectWrapper.wrap(zzB2));
                zzbvcVar2.zzm(wrap);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzb(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbvf zzbvfVar = this.zza;
            if (zzbvfVar != null) {
                zzbvfVar.zzy(wrap);
                return;
            }
            zzbvb zzbvbVar = this.zzm;
            if (zzbvbVar != null) {
                zzbvbVar.zzs(wrap);
                return;
            }
            zzbvc zzbvcVar = this.zzn;
            if (zzbvcVar != null) {
                zzbvcVar.zzq(wrap);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzc(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzdH() {
        try {
            zzbvf zzbvfVar = this.zza;
            if (zzbvfVar == null || !zzbvfVar.zzt()) {
                return;
            }
            zzfjt zzfjtVar = this.zzg;
            if (zzfjtVar.zze == 4 || zzfjtVar.zzaD) {
                zzbvfVar.zzv();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to report impression from an adapter", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzf(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzk) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzi(view2);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzo(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzp(zzbng zzbngVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzr(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzs(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzt() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbvf zzbvfVar = this.zza;
                if (zzbvfVar == null) {
                    zzbvb zzbvbVar = this.zzm;
                    if (zzbvbVar != null && !zzbvbVar.zzp()) {
                        zzbvbVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbvc zzbvcVar = this.zzn;
                    if (zzbvcVar == null || zzbvcVar.zzn()) {
                        return;
                    }
                    zzbvcVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzfjt zzfjtVar = this.zzg;
                if (zzfjtVar.zzaD) {
                    if (zzbvfVar.zzt()) {
                        return;
                    }
                    zzbvfVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbvfVar.zzt() && zzfjtVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbvfVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final boolean zzz(Bundle bundle) {
        return false;
    }
}
