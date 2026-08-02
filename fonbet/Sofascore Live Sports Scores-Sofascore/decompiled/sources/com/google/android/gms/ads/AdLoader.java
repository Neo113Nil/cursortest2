package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbos;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbov;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzi;
import defpackage.a70;
import defpackage.gon;
import defpackage.hon;
import defpackage.nqn;
import defpackage.oqn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class AdLoader {
    public final zzq a;
    public final Context b;
    public final zzbn c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        public final Context a;
        public final zzbq b;

        public Builder(@NonNull Context context, @NonNull String str) {
            Preconditions.j(context, "context cannot be null");
            zzbq zzc = zzay.zzb().zzc(context, str, new zzbvq());
            this.a = context;
            this.b = zzc;
        }

        @NonNull
        public AdLoader build() {
            Context context = this.a;
            try {
                return new AdLoader(context, this.b.zze(), zzq.zza);
            } catch (RemoteException e) {
                zzo.zzg("Failed to build AdLoader.", e);
                return new AdLoader(context, new zzff().zza(), zzq.zza);
            }
        }

        @NonNull
        public Builder forAdManagerAdView(@NonNull OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, @NonNull AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                a70.p("The supported ad sizes must contain at least one valid ad size.");
                return null;
            }
            try {
                this.b.zzk(new zzbou(onAdManagerAdViewLoadedListener), new zzr(this.a, adSizeArr));
                return this;
            } catch (RemoteException e) {
                zzo.zzj("Failed to add Google Ad Manager banner ad listener", e);
                return this;
            }
        }

        @NonNull
        public Builder forCustomFormatAd(@NonNull String str, @NonNull NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @Nullable NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbzg zzbzgVar = new zzbzg(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.b.zzi(str, new oqn(zzbzgVar), onCustomClickListener == null ? null : new nqn(zzbzgVar));
                return this;
            } catch (RemoteException e) {
                zzo.zzj("Failed to add custom format ad listener", e);
                return this;
            }
        }

        @NonNull
        public Builder forNativeAd(@NonNull NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.b.zzm(new zzbzi(onNativeAdLoadedListener));
                return this;
            } catch (RemoteException e) {
                zzo.zzj("Failed to add google native ad listener", e);
                return this;
            }
        }

        @NonNull
        public Builder withAdListener(@NonNull AdListener adListener) {
            try {
                this.b.zzf(new com.google.android.gms.ads.internal.client.zzg(adListener));
                return this;
            } catch (RemoteException e) {
                zzo.zzj("Failed to set AdListener.", e);
                return this;
            }
        }

        @NonNull
        public Builder withAdManagerAdViewOptions(@NonNull AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.b.zzp(adManagerAdViewOptions);
                return this;
            } catch (RemoteException e) {
                zzo.zzj("Failed to specify Ad Manager banner ad options", e);
                return this;
            }
        }

        @NonNull
        public Builder withNativeAdOptions(@NonNull NativeAdOptions nativeAdOptions) {
            try {
                this.b.zzj(new zzbmk(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfw(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zzb(), nativeAdOptions.zzc(), nativeAdOptions.zzd() - 1));
                return this;
            } catch (RemoteException e) {
                zzo.zzj("Failed to specify native ad options", e);
                return this;
            }
        }

        @Deprecated
        public final Builder zza(com.google.android.gms.ads.formats.zzg zzgVar) {
            try {
                this.b.zzm(new zzbov(zzgVar));
                return this;
            } catch (RemoteException e) {
                zzo.zzj("Failed to add google native ad listener", e);
                return this;
            }
        }

        @Deprecated
        public final Builder zzb(String str, com.google.android.gms.ads.formats.zze zzeVar, @Nullable com.google.android.gms.ads.formats.zzd zzdVar) {
            zzbos zzbosVar = new zzbos(zzeVar, zzdVar);
            try {
                this.b.zzi(str, new hon(zzbosVar), zzdVar == null ? null : new gon(zzbosVar));
                return this;
            } catch (RemoteException e) {
                zzo.zzj("Failed to add custom template ad listener", e);
                return this;
            }
        }

        @NonNull
        @Deprecated
        public final Builder zzc(@NonNull com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.b.zzj(new zzbmk(nativeAdOptions));
                return this;
            } catch (RemoteException e) {
                zzo.zzj("Failed to specify native ad options", e);
                return this;
            }
        }
    }

    public AdLoader(Context context, zzbn zzbnVar, zzq zzqVar) {
        this.b = context;
        this.c = zzbnVar;
        this.a = zzqVar;
    }

    public final void a(final zzeh zzehVar) {
        Context context = this.b;
        zzbjg.a(context);
        if (((Boolean) zzblf.c.c()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdLoader adLoader = AdLoader.this;
                        try {
                            adLoader.c.zze(adLoader.a.zza(adLoader.b, zzehVar));
                        } catch (RemoteException e) {
                            zzo.zzg("Failed to load ad.", e);
                        }
                    }
                });
                return;
            }
        }
        try {
            this.c.zze(this.a.zza(context, zzehVar));
        } catch (RemoteException e) {
            zzo.zzg("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.c.zzg();
        } catch (RemoteException e) {
            zzo.zzj("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(@NonNull AdRequest adRequest) {
        a(adRequest.a);
    }

    public void loadAds(@NonNull AdRequest adRequest, int i) {
        try {
            this.c.zzi(this.a.zza(this.b, adRequest.a), i);
        } catch (RemoteException e) {
            zzo.zzg("Failed to load ads.", e);
        }
    }

    public void loadAd(@NonNull AdManagerAdRequest adManagerAdRequest) {
        a(adManagerAdRequest.a);
    }
}
