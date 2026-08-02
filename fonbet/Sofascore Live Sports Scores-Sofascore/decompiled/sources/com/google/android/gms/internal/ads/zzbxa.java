package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbxa implements NativeMediationAdRequest {
    public final Date a;
    public final int b;
    public final Set c;
    public final boolean d;
    public final Location e;
    public final int f;
    public final zzbmk g;
    public final boolean i;
    public final ArrayList h = new ArrayList();
    public final HashMap j = new HashMap();

    public zzbxa(Date date, int i, HashSet hashSet, Location location, boolean z, int i2, zzbmk zzbmkVar, List list, boolean z2) {
        this.a = date;
        this.b = i;
        this.c = hashSet;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = zzbmkVar;
        this.i = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] split = str.split(":", 3);
                    if (split.length == 3) {
                        String str2 = split[2];
                        if ("true".equals(str2)) {
                            this.j.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(str2)) {
                            this.j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.h.add(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return com.google.android.gms.ads.internal.client.zzeu.zzb().zzg();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Date getBirthday() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int getGender() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        Parcelable.Creator<zzbmk> creator = zzbmk.CREATOR;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        zzbmk zzbmkVar = this.g;
        if (zzbmkVar == null) {
            return builder.build();
        }
        int i = zzbmkVar.a;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbmkVar.g);
                    builder.setMediaAspectRatio(zzbmkVar.h);
                }
                builder.setReturnUrlsForImageAssets(zzbmkVar.b);
                builder.setImageOrientation(zzbmkVar.c);
                builder.setRequestMultipleImages(zzbmkVar.d);
                return builder.build();
            }
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbmkVar.f;
            if (zzfwVar != null) {
                builder.setVideoOptions(new VideoOptions(zzfwVar));
            }
        }
        builder.setAdChoicesPlacement(zzbmkVar.e);
        builder.setReturnUrlsForImageAssets(zzbmkVar.b);
        builder.setImageOrientation(zzbmkVar.c);
        builder.setRequestMultipleImages(zzbmkVar.d);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbmk.Y0(this.g);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return com.google.android.gms.ads.internal.client.zzeu.zzb().zzi();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isDesignedForFamilies() {
        return this.i;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.h.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zza() {
        return this.h.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zzb() {
        return this.j;
    }
}
