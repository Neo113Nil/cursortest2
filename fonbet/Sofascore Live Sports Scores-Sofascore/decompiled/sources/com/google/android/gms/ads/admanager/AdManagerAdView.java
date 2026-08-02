package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzcaq;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Preconditions.j(context, "Context cannot be null");
    }

    @Nullable
    public AdSize[] getAdSizes() {
        return this.a.zzd();
    }

    @Nullable
    public AppEventListener getAppEventListener() {
        return this.a.zzf();
    }

    @NonNull
    public VideoController getVideoController() {
        return this.a.zzy();
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.a.zzB();
    }

    public void loadAd(@NonNull final AdManagerAdRequest adManagerAdRequest) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzbjg.a(getContext());
        if (((Boolean) zzblf.f.c()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdManagerAdView adManagerAdView = AdManagerAdView.this;
                        try {
                            adManagerAdView.a.zzg(adManagerAdRequest.zza());
                        } catch (IllegalStateException e) {
                            zzcaq.c(adManagerAdView.getContext()).a("AdManagerAdView.loadAd", e);
                        }
                    }
                });
                return;
            }
        }
        this.a.zzg(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.a.zzi();
    }

    public void setAdSizes(@NonNull AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            a70.p("The supported ad sizes must contain at least one valid ad size.");
        } else {
            this.a.zzn(adSizeArr);
        }
    }

    public void setAppEventListener(@Nullable AppEventListener appEventListener) {
        this.a.zzp(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.a.zzq(z);
    }

    public void setVideoOptions(@NonNull VideoOptions videoOptions) {
        this.a.zzA(videoOptions);
    }

    public final boolean zza(zzbu zzbuVar) {
        return this.a.zzC(zzbuVar);
    }

    public AdManagerAdView(@NonNull Context context) {
        super(context);
        Preconditions.j(context, "Context cannot be null");
    }

    public AdManagerAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, (Object) null);
        Preconditions.j(context, "Context cannot be null");
    }
}
