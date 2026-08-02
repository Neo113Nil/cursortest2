package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbnm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class MediaView extends FrameLayout {
    public MediaContent a;
    public boolean b;
    public zzbmh c;
    public ImageView.ScaleType d;
    public boolean e;
    public zzbmj f;

    public MediaView(@NonNull Context context) {
        super(context);
    }

    @Nullable
    public MediaContent getMediaContent() {
        return this.a;
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.e = true;
        this.d = scaleType;
        zzbmj zzbmjVar = this.f;
        if (zzbmjVar != null) {
            zzbmjVar.zza(scaleType);
        }
    }

    public void setMediaContent(@Nullable MediaContent mediaContent) {
        boolean r;
        this.b = true;
        this.a = mediaContent;
        zzbmh zzbmhVar = this.c;
        if (zzbmhVar != null) {
            zzbmhVar.zza(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            zzbnm zzb = mediaContent.zzb();
            if (zzb != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zza()) {
                        r = zzb.r(new ObjectWrapper(this));
                    }
                    removeAllViews();
                }
                r = zzb.w0(new ObjectWrapper(this));
                if (r) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            zzo.zzg("", e);
        }
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
