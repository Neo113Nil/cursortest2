package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbkc;
import com.google.android.gms.internal.ads.zzbzm;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    @Override // com.google.android.gms.ads.BaseAdView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(h.h, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public AdSize[] getAdSizes() {
        return this.zza.zzd();
    }

    public AppEventListener getAppEventListener() {
        return this.zza.zzf();
    }

    public VideoController getVideoController() {
        return this.zza.zzy();
    }

    public VideoOptions getVideoOptions() {
        return this.zza.zzB();
    }

    public void loadAd(final AdManagerAdRequest adManagerAdRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbie.zza(getContext());
        if (((Boolean) zzbkc.zzf.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzd(zzbie.zzmB)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdManagerAdView.this.zzb(adManagerAdRequest);
                    }
                });
                return;
            }
        }
        this.zza.zzg(adManagerAdRequest.zza());
    }

    @Override // com.google.android.gms.ads.BaseAdView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void recordManualImpression() {
        this.zza.zzi();
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zza.zzn(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.zza.zzp(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.zza.zzq(z);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.zza.zzA(videoOptions);
    }

    public final boolean zza(zzbu zzbuVar) {
        return this.zza.zzC(zzbuVar);
    }

    final /* synthetic */ void zzb(AdManagerAdRequest adManagerAdRequest) {
        try {
            this.zza.zzg(adManagerAdRequest.zza());
        } catch (IllegalStateException e) {
            zzbzm.zza(getContext()).zzh(e, "AdManagerAdView.loadAd");
        }
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }
}
