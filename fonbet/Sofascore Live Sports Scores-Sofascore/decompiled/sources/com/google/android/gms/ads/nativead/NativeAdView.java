package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbmz;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class NativeAdView extends FrameLayout {
    public final FrameLayout a;
    public final zzbmz b;

    public NativeAdView(@NonNull Context context) {
        super(context);
        this.a = c(context);
        this.b = d();
    }

    public final View a(String str) {
        zzbmz zzbmzVar = this.b;
        if (zzbmzVar != null) {
            try {
                IObjectWrapper zzb = zzbmzVar.zzb(str);
                if (zzb != null) {
                    return (View) ObjectWrapper.Z1(zzb);
                }
            } catch (RemoteException e) {
                zzo.zzg("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.a);
    }

    public final void b(View view, String str) {
        zzbmz zzbmzVar = this.b;
        if (zzbmzVar == null) {
            return;
        }
        try {
            zzbmzVar.zza(str, new ObjectWrapper(view));
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@NonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final FrameLayout c(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    public final zzbmz d() {
        if (isInEditMode()) {
            return null;
        }
        zzaw zzb = zzay.zzb();
        FrameLayout frameLayout = this.a;
        return zzb.zze(frameLayout.getContext(), this, frameLayout);
    }

    public void destroy() {
        zzbmz zzbmzVar = this.b;
        if (zzbmzVar == null) {
            return;
        }
        try {
            zzbmzVar.zzd();
        } catch (RemoteException e) {
            zzo.zzg("Unable to destroy native ad view", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        zzbmz zzbmzVar = this.b;
        if (zzbmzVar != null) {
            if (((Boolean) zzba.zzc().a(zzbjg.jd)).booleanValue()) {
                try {
                    zzbmzVar.zzdD(new ObjectWrapper(motionEvent));
                } catch (RemoteException e) {
                    zzo.zzg("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public AdChoicesView getAdChoicesView() {
        View a = a("3011");
        if (a instanceof AdChoicesView) {
            return (AdChoicesView) a;
        }
        return null;
    }

    @Nullable
    public final View getAdvertiserView() {
        return a("3005");
    }

    @Nullable
    public final View getBodyView() {
        return a("3004");
    }

    @Nullable
    public final View getCallToActionView() {
        return a("3002");
    }

    @Nullable
    public final View getHeadlineView() {
        return a("3001");
    }

    @Nullable
    public final View getIconView() {
        return a("3003");
    }

    @Nullable
    public final View getImageView() {
        return a("3008");
    }

    @Nullable
    public final MediaView getMediaView() {
        View a = a("3010");
        if (a instanceof MediaView) {
            return (MediaView) a;
        }
        if (a == null) {
            return null;
        }
        zzo.zzd("View is not an instance of MediaView");
        return null;
    }

    @Nullable
    public final View getPriceView() {
        return a("3007");
    }

    @Nullable
    public final View getStarRatingView() {
        return a("3009");
    }

    @Nullable
    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        zzbmz zzbmzVar = this.b;
        if (zzbmzVar == null) {
            return;
        }
        try {
            zzbmzVar.zze(new ObjectWrapper(view), i);
        } catch (RemoteException e) {
            zzo.zzg("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@NonNull View view) {
        if (this.a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(@Nullable AdChoicesView adChoicesView) {
        b(adChoicesView, "3011");
    }

    public final void setAdvertiserView(@Nullable View view) {
        b(view, "3005");
    }

    public final void setBodyView(@Nullable View view) {
        b(view, "3004");
    }

    public final void setCallToActionView(@Nullable View view) {
        b(view, "3002");
    }

    public final void setClickConfirmingView(@Nullable View view) {
        zzbmz zzbmzVar = this.b;
        if (zzbmzVar == null) {
            return;
        }
        try {
            zzbmzVar.zzdB(new ObjectWrapper(view));
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(@Nullable View view) {
        b(view, "3001");
    }

    public final void setIconView(@Nullable View view) {
        b(view, "3003");
    }

    public final void setImageView(@Nullable View view) {
        b(view, "3008");
    }

    public final void setMediaView(@Nullable MediaView mediaView) {
        b(mediaView, "3010");
        if (mediaView == null) {
            return;
        }
        zzbmh zzbmhVar = new zzbmh() { // from class: com.google.android.gms.ads.nativead.zzb
            @Override // com.google.android.gms.internal.ads.zzbmh
            public final /* synthetic */ void zza(MediaContent mediaContent) {
                zzbmz zzbmzVar = NativeAdView.this.b;
                if (zzbmzVar == null) {
                    return;
                }
                try {
                    if (mediaContent instanceof zzfb) {
                        zzbmzVar.zzdE(((zzfb) mediaContent).zzc());
                    } else if (mediaContent == null) {
                        zzbmzVar.zzdE(null);
                    } else {
                        zzo.zzd("Use MediaContent provided by NativeAd.getMediaContent");
                    }
                } catch (RemoteException e) {
                    zzo.zzg("Unable to call setMediaContent on delegate", e);
                }
            }
        };
        synchronized (mediaView) {
            mediaView.c = zzbmhVar;
            if (mediaView.b) {
                zzbmhVar.zza(mediaView.a);
            }
        }
        zzbmj zzbmjVar = new zzbmj() { // from class: com.google.android.gms.ads.nativead.zza
            @Override // com.google.android.gms.internal.ads.zzbmj
            public final void zza(ImageView.ScaleType scaleType) {
                zzbmz zzbmzVar = NativeAdView.this.b;
                if (zzbmzVar == null || scaleType == null) {
                    return;
                }
                try {
                    zzbmzVar.zzdC(new ObjectWrapper(scaleType));
                } catch (RemoteException e) {
                    zzo.zzg("Unable to call setMediaViewImageScaleType on delegate", e);
                }
            }
        };
        synchronized (mediaView) {
            mediaView.f = zzbmjVar;
            if (mediaView.e) {
                zzbmjVar.zza(mediaView.d);
            }
        }
    }

    public void setNativeAd(@NonNull NativeAd nativeAd) {
        zzbmz zzbmzVar = this.b;
        if (zzbmzVar == null) {
            return;
        }
        try {
            zzbmzVar.zzc(nativeAd.a());
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(@Nullable View view) {
        b(view, "3007");
    }

    public final void setStarRatingView(@Nullable View view) {
        b(view, "3009");
    }

    public final void setStoreView(@Nullable View view) {
        b(view, "3006");
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = c(context);
        this.b = d();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = c(context);
        this.b = d();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = c(context);
        this.b = d();
    }
}
