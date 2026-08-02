package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzcaq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class BaseAdView extends ViewGroup {
    public final zzek a;

    public BaseAdView(Context context, AttributeSet attributeSet, int i, Object obj) {
        super(context, attributeSet, i);
        this.a = new zzek(this, attributeSet, true, 0);
    }

    public void destroy() {
        zzbjg.a(getContext());
        if (((Boolean) zzblf.e.c()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjg.Lc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.a.zza();
                        } catch (IllegalStateException e) {
                            zzcaq.c(baseAdView.getContext()).a("BaseAdView.destroy", e);
                        }
                    }
                });
                return;
            }
        }
        this.a.zza();
    }

    @NonNull
    public AdListener getAdListener() {
        return this.a.zzb();
    }

    @Nullable
    public AdSize getAdSize() {
        return this.a.zzc();
    }

    @NonNull
    public String getAdUnitId() {
        return this.a.zze();
    }

    @Nullable
    public OnPaidEventListener getOnPaidEventListener() {
        return this.a.zzx();
    }

    public long getPlacementId() {
        return this.a.zzv();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.a.zzt();
    }

    public boolean isCollapsible() {
        return this.a.zzr();
    }

    public boolean isLoading() {
        return this.a.zzs();
    }

    public void loadAd(@NonNull final AdRequest adRequest) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzbjg.a(getContext());
        if (((Boolean) zzblf.f.c()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdRequest adRequest2 = adRequest;
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.a.zzg(adRequest2.a);
                        } catch (IllegalStateException e) {
                            zzcaq.c(baseAdView.getContext()).a("BaseAdView.loadAd", e);
                        }
                    }
                });
                return;
            }
        }
        this.a.zzg(adRequest.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AdSize adSize;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzo.zzg("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        zzbjg.a(getContext());
        if (((Boolean) zzblf.g.c()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjg.Mc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.a.zzh();
                        } catch (IllegalStateException e) {
                            zzcaq.c(baseAdView.getContext()).a("BaseAdView.pause", e);
                        }
                    }
                });
                return;
            }
        }
        this.a.zzh();
    }

    public void resume() {
        zzbjg.a(getContext());
        if (((Boolean) zzblf.h.c()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjg.Kc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.a.zzj();
                        } catch (IllegalStateException e) {
                            zzcaq.c(baseAdView.getContext()).a("BaseAdView.resume", e);
                        }
                    }
                });
                return;
            }
        }
        this.a.zzj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(@NonNull AdListener adListener) {
        zzek zzekVar = this.a;
        zzekVar.zzk(adListener);
        if (adListener == 0) {
            zzekVar.zzl(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            zzekVar.zzl((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            zzekVar.zzp((AppEventListener) adListener);
        }
    }

    public void setAdSize(@NonNull AdSize adSize) {
        this.a.zzm(adSize);
    }

    public void setAdUnitId(@NonNull String str) {
        this.a.zzo(str);
    }

    public void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.a.zzu(onPaidEventListener);
    }

    public void setPlacementId(long j) {
        this.a.zzw(j);
    }

    public BaseAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new zzek(this, attributeSet, false, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.a = new zzek(this, attributeSet, false, 0);
    }

    public BaseAdView(Context context) {
        super(context);
        this.a = new zzek(this, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.a = new zzek(this, attributeSet, true);
    }
}
