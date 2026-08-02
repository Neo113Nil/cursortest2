package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzbmj;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private boolean zzb;
    private zzble zzc;
    private ImageView.ScaleType zzd;
    private boolean zze;
    private zzblg zzf;

    public MediaView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(h.h, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public MediaContent getMediaContent() {
        return this.zza;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        zzblg zzblgVar = this.zzf;
        if (zzblgVar != null) {
            zzblgVar.zza(scaleType);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        boolean zzt;
        this.zzb = true;
        this.zza = mediaContent;
        zzble zzbleVar = this.zzc;
        if (zzbleVar != null) {
            zzbleVar.zza(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            zzbmj zzb = mediaContent.zzb();
            if (zzb != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zza()) {
                        zzt = zzb.zzt(ObjectWrapper.wrap(this));
                    }
                    removeAllViews();
                }
                zzt = zzb.zzn(ObjectWrapper.wrap(this));
                if (zzt) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            zzo.zzg("", e);
        }
    }

    protected final synchronized void zza(zzble zzbleVar) {
        this.zzc = zzbleVar;
        if (this.zzb) {
            zzbleVar.zza(this.zza);
        }
    }

    protected final synchronized void zzb(zzblg zzblgVar) {
        this.zzf = zzblgVar;
        if (this.zze) {
            zzblgVar.zza(this.zzd);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
