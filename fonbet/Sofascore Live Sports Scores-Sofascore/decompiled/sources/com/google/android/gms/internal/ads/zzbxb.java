package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbxb extends zzbwi {
    public final UnifiedNativeAdMapper a;

    public zzbxb(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.a = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void B(IObjectWrapper iObjectWrapper) {
        this.a.handleClick((View) ObjectWrapper.Z1(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void M2(IObjectWrapper iObjectWrapper) {
        this.a.untrackView((View) ObjectWrapper.Z1(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void e() {
        this.a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void e2() {
        this.a.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void f0(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        HashMap hashMap = (HashMap) ObjectWrapper.Z1(iObjectWrapper2);
        HashMap hashMap2 = (HashMap) ObjectWrapper.Z1(iObjectWrapper3);
        this.a.trackViews((View) ObjectWrapper.Z1(iObjectWrapper), hashMap, hashMap2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final float zzA() {
        return this.a.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final float zzB() {
        return this.a.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zze() {
        return this.a.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final List zzf() {
        List<NativeAd.Image> images = this.a.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzbmg(image.getDrawable(), image.getUri(), image.getScale(), image.zza(), image.zzb(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzg() {
        return this.a.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final zzbmv zzh() {
        NativeAd.Image icon = this.a.getIcon();
        if (icon != null) {
            return new zzbmg(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zza(), icon.zzb(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzi() {
        return this.a.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzj() {
        return this.a.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final double zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.a;
        if (unifiedNativeAdMapper.getStarRating() != null) {
            return unifiedNativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzl() {
        return this.a.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzm() {
        return this.a.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final com.google.android.gms.ads.internal.client.zzea zzn() {
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.a;
        if (unifiedNativeAdMapper.zzc() != null) {
            return unifiedNativeAdMapper.zzc().zzb();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final zzbmo zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final IObjectWrapper zzp() {
        View adChoicesContent = this.a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return new ObjectWrapper(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final IObjectWrapper zzq() {
        View zzd = this.a.zzd();
        if (zzd == null) {
            return null;
        }
        return new ObjectWrapper(zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final IObjectWrapper zzr() {
        Object zze = this.a.zze();
        if (zze == null) {
            return null;
        }
        return new ObjectWrapper(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final Bundle zzs() {
        return this.a.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final boolean zzt() {
        return this.a.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final boolean zzu() {
        return this.a.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final float zzz() {
        return this.a.getMediaContentAspectRatio();
    }
}
