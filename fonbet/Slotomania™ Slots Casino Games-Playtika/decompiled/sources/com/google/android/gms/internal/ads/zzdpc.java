package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdpc extends zzcxh {
    public static final zzgvz zzc = zzgvz.zzn("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdph zze;
    private final zzdpp zzf;
    private final zzdqg zzg;
    private final zzdpm zzh;
    private final zzdpr zzi;
    private final zzimc zzj;
    private final zzimc zzk;
    private final zzimc zzl;
    private final zzimc zzm;
    private final zzimc zzn;
    private zzdre zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzcdk zzt;
    private final zzbai zzu;
    private final VersionInfoParcel zzv;
    private final Context zzw;
    private final zzdpe zzx;
    private final zzest zzy;
    private final Map zzz;

    public zzdpc(zzcxg zzcxgVar, Executor executor, zzdph zzdphVar, zzdpp zzdppVar, zzdqg zzdqgVar, zzdpm zzdpmVar, zzdpr zzdprVar, zzimc zzimcVar, zzimc zzimcVar2, zzimc zzimcVar3, zzimc zzimcVar4, zzimc zzimcVar5, zzcdk zzcdkVar, zzbai zzbaiVar, VersionInfoParcel versionInfoParcel, Context context, zzdpe zzdpeVar, zzest zzestVar, zzbeh zzbehVar) {
        super(zzcxgVar);
        this.zzd = executor;
        this.zze = zzdphVar;
        this.zzf = zzdppVar;
        this.zzg = zzdqgVar;
        this.zzh = zzdpmVar;
        this.zzi = zzdprVar;
        this.zzj = zzimcVar;
        this.zzk = zzimcVar2;
        this.zzl = zzimcVar3;
        this.zzm = zzimcVar4;
        this.zzn = zzimcVar5;
        this.zzt = zzcdkVar;
        this.zzu = zzbaiVar;
        this.zzv = versionInfoParcel;
        this.zzw = context;
        this.zzx = zzdpeVar;
        this.zzy = zzestVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzI(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlX)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long zzy = com.google.android.gms.ads.internal.util.zzs.zzy(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (zzy >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlY)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(zzdre zzdreVar) {
        Iterator<String> keys;
        View view;
        zzbad zzb;
        if (!this.zzp) {
            this.zzo = zzdreVar;
            this.zzg.zza(zzdreVar);
            this.zzf.zza(zzdreVar.zzdF(), zzdreVar.zzj(), zzdreVar.zzk(), zzdreVar, zzdreVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdz)).booleanValue() && (zzb = this.zzu.zzb()) != null) {
                zzb.zzh(zzdreVar.zzdF());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcv)).booleanValue()) {
                zzfjt zzfjtVar = this.zzb;
                if (zzfjtVar.zzak && (keys = zzfjtVar.zzaj.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        zzdre zzdreVar2 = this.zzo;
                        WeakReference weakReference = zzdreVar2 == null ? null : (WeakReference) zzdreVar2.zzi().get(next);
                        this.zzz.put(next, false);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzbeg zzbegVar = new zzbeg(this.zzw, view);
                            this.zzA.add(zzbegVar);
                            zzbegVar.zza(new zzdor(this, next));
                        }
                    }
                }
            }
            if (zzdreVar.zzg() != null) {
                zzdreVar.zzg().zza(this.zzt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(zzdre zzdreVar) {
        this.zzf.zzb(zzdreVar.zzdF(), zzdreVar.zzi());
        if (zzdreVar.zzdA() != null) {
            zzdreVar.zzdA().setClickable(false);
            zzdreVar.zzdA().removeAllViews();
        }
        if (zzdreVar.zzg() != null) {
            zzdreVar.zzg().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        View zzag;
        if (!this.zzr && (zzag = zzag(map)) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpb)).booleanValue()) {
                Rect rect = new Rect();
                if (zzag.getGlobalVisibleRect(rect, new Point()) && zzag.getHeight() == rect.height() && zzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpc)).booleanValue()) {
                zzbhv zzbhvVar = zzbie.zzpd;
                if (((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).floatValue() > 0.0d) {
                    double floatValue = ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).floatValue();
                    if (zzag.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r1.height() * r1.width() >= zzag.getHeight() * zzag.getWidth() * (floatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(zzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    private final synchronized View zzag(Map map) {
        if (map != null) {
            zzgvz zzgvzVar = zzc;
            int size = zzgvzVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgvzVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzah() {
        zzdre zzdreVar = this.zzo;
        if (zzdreVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzn = zzdreVar.zzn();
        if (zzn != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzn);
        }
        return zzdqg.zza;
    }

    private final void zzai(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgr)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        ListenableFuture zzX = this.zze.zzX();
        if (zzX == null) {
            return;
        }
        zzhbi.zzr(zzX, new zzdos(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(View view, zzelb zzelbVar) {
        zzcki zzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzelbVar == null || zzW == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzelbVar.zza(), view);
    }

    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzf.zzr(zzdgVar);
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.zzf.zzs(zzdcVar);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        zzdre zzdreVar = this.zzo;
        if (zzdreVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdreVar instanceof zzdqa;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdox
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdpc.this.zzW(z);
                }
            });
        }
    }

    public final synchronized void zzE(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmW)).booleanValue()) {
            zzdre zzdreVar = this.zzo;
            if (zzdreVar == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdreVar instanceof zzdqa;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdpc.this.zzX(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final String zzK() {
        return this.zzh.zzf();
    }

    public final zzelb zzL(String str, boolean z) {
        boolean z2;
        String str2;
        zzekx zzekxVar;
        zzeky zzekyVar;
        zzdpm zzdpmVar = this.zzh;
        if (zzdpmVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdph zzdphVar = this.zze;
            zzcki zzW = zzdphVar.zzW();
            zzcki zzT = zzdphVar.zzT();
            if (zzW == null && zzT == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdpmVar.zzg();
            int zzc2 = zzdpmVar.zzg().zzc();
            int i2 = zzc2 - 1;
            boolean z3 = false;
            if (i2 != 0) {
                if (i2 != 1) {
                    String str3 = zzc2 != 1 ? zzc2 != 2 ? "UNKNOWN" : "DISPLAY" : ShareConstants.VIDEO_URL;
                    StringBuilder sb = new StringBuilder(str3.length() + 49);
                    sb.append("Unknown omid media type: ");
                    sb.append(str3);
                    sb.append(". Not initializing Omid.");
                    String sb2 = sb.toString();
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                    return null;
                }
                if (zzW == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was display but there was no display webview.");
                    return null;
                }
                z2 = false;
                z3 = true;
            } else if (zzT != null) {
                z2 = true;
            } else {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was video but there was no video webview.");
            }
            if (z3) {
                str2 = null;
            } else if (z2) {
                str2 = "javascript";
                zzW = zzT;
            } else {
                zzW = null;
                str2 = null;
            }
            if (zzW == null) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Webview is null in InternalNativeAd");
                return null;
            }
            if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzw)) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.zzv;
            int i8 = versionInfoParcel.buddyApkVersion;
            int i9 = versionInfoParcel.clientJarVersion;
            StringBuilder sb3 = new StringBuilder(String.valueOf(i8).length() + 1 + String.valueOf(i9).length());
            sb3.append(i8);
            sb3.append(".");
            sb3.append(i9);
            String sb4 = sb3.toString();
            if (z2) {
                zzekxVar = zzekx.VIDEO;
                zzekyVar = zzeky.DEFINED_BY_JAVASCRIPT;
            } else {
                zzekxVar = zzekx.NATIVE_DISPLAY;
                zzekyVar = zzdphVar.zzx() == 3 ? zzeky.UNSPECIFIED : zzeky.ONE_PIXEL;
            }
            zzelb zzd = com.google.android.gms.ads.internal.zzt.zzu().zzd(sb4, zzW.zzD(), "", "javascript", str2, str, zzekyVar, zzekxVar, this.zzb.zzal);
            if (zzd == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdphVar.zzq(zzd);
            zzW.zzak(zzd);
            if (z2) {
                zzftu zza = zzd.zza();
                if (zzT != null) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zza, zzT.zzE());
                }
                this.zzs = true;
            }
            if (z) {
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzd.zza());
                zzW.zze("onSdkLoaded", new ArrayMap());
            }
            return zzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgr)).booleanValue()) {
            zzdph zzdphVar = this.zze;
            if (zzdphVar.zzx() != 3) {
                zzcfk zzY = zzdphVar.zzY();
                if (zzY == null) {
                    return;
                }
                zzhbi.zzr(zzY, new zzdot(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(View view) {
        zzelb zzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzZ == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzZ.zza(), view);
    }

    public final zzdpe zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzy.zza(zzdqVar);
    }

    public final void zzR(Bundle bundle) {
        final zzcki zzT = this.zze.zzT();
        if (zzT == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgvz zzgvzVar = zzdpc.zzc;
                    zzcki.this.zzd("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error reading event signals", e);
        }
    }

    final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    final /* synthetic */ void zzW(boolean z) {
        zzdre zzdreVar = this.zzo;
        if (zzdreVar != null) {
            this.zzf.zzf(null, zzdreVar.zzdF(), this.zzo.zzi(), this.zzo.zzj(), z, zzah(), 0);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    final /* synthetic */ void zzX(View view, boolean z, int i) {
        zzdre zzdreVar = this.zzo;
        if (zzdreVar != null) {
            this.zzf.zzf(view, zzdreVar.zzdF(), this.zzo.zzi(), this.zzo.zzj(), z, zzah(), i);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    final /* synthetic */ zzdph zzZ() {
        return this.zze;
    }

    public final synchronized void zza(String str) {
        this.zzf.zzd(str);
    }

    final /* synthetic */ zzdre zzaa() {
        return this.zzo;
    }

    final /* synthetic */ Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zzf.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdou
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdpc.this.zzT();
            }
        });
        super.zzd();
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzz = this.zzf.zzz(bundle);
        this.zzq = zzz;
        return zzz;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(final zzdre zzdreVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzct)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdov
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdpc.this.zzU(zzdreVar);
                }
            });
        } else {
            zzU(zzdreVar);
        }
    }

    public final synchronized void zzh(final zzdre zzdreVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzct)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdow
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdpc.this.zzV(zzdreVar);
                }
            });
        } else {
            zzV(zzdreVar);
        }
    }

    public final synchronized void zzi(View view, View view2, Map map, Map map2, boolean z) {
        zzcki zzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z, zzah());
        if (this.zzs) {
            zzdph zzdphVar = this.zze;
            if (zzdphVar.zzT() != null && (zzT = zzdphVar.zzT()) != null) {
                zzT.zze("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzj() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpa
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdpc.this.zzS();
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzx() != 7) {
            final zzdpp zzdppVar = this.zzf;
            Objects.requireNonNull(zzdppVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdpp.this.zzy();
                }
            });
        }
        super.zzj();
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    public final synchronized void zzu(View view, Map map, Map map2, boolean z) {
        if (this.zzq) {
            zzaf(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcv)).booleanValue() && this.zzb.zzak) {
            Map map3 = this.zzz;
            Iterator it = map3.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) map3.get((String) it.next())).booleanValue()) {
                    break;
                }
            }
        }
        if (z) {
            zzae(view, map, map2);
            zzaf(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeM)).booleanValue() && map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view2 != null && zzI(view2)) {
                    zzae(view, map, map2);
                    return;
                }
            }
        }
    }

    public final synchronized JSONObject zzv(View view, Map map, Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized JSONObject zzw(View view, Map map, Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(zzbng zzbngVar) {
        this.zzf.zzp(zzbngVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }

    final /* synthetic */ void zzS() {
        try {
            zzdph zzdphVar = this.zze;
            int zzx = zzdphVar.zzx();
            if (zzx == 1) {
                zzbmq zza = this.zzi.zza();
                if (zza != null) {
                    zzai("Google", true);
                    zza.zze((zzbmg) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (zzx == 2) {
                zzbmn zzb = this.zzi.zzb();
                if (zzb != null) {
                    zzai("Google", true);
                    zzb.zze((zzbme) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzx == 3) {
                zzbmw zzf = this.zzi.zzf(zzdphVar.zzS());
                if (zzf != null) {
                    if (zzdphVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzf.zze((zzbmj) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (zzx == 6) {
                zzbnd zzc2 = this.zzi.zzc();
                if (zzc2 != null) {
                    zzai("Google", true);
                    zzc2.zze((zzbnj) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (zzx != 7) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrong native template id!");
            } else {
                zzbry zze = this.zzi.zze();
                if (zze != null) {
                    zze.zze((zzbrs) this.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}
