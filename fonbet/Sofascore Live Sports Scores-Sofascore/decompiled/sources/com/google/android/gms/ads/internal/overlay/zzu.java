package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {
    public final ImageButton a;
    public final zzah b;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzu(Context context, zzt zztVar, @Nullable zzah zzahVar) {
        super(context);
        Drawable drawable;
        this.b = zzahVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.a = imageButton;
        String str = (String) zzba.zzc().a(zzbjg.S1);
        if (TextUtils.isEmpty(str) || BuildConfig.FLAVOR.equals(str)) {
            imageButton.setImageResource(R.drawable.btn_dialog);
        } else {
            Resources c = com.google.android.gms.ads.internal.zzt.zzh().c();
            if (c != null) {
                try {
                } catch (Resources.NotFoundException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Close button resource not found, falling back to default.");
                    drawable = null;
                }
                if ("white".equals(str)) {
                    drawable = c.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross);
                } else {
                    if ("black".equals(str)) {
                        drawable = c.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross);
                    }
                    drawable = null;
                }
                if (drawable == null) {
                    imageButton.setImageResource(R.drawable.btn_dialog);
                } else {
                    imageButton.setImageDrawable(drawable);
                    imageButton.setScaleType(ImageView.ScaleType.CENTER);
                }
            } else {
                imageButton.setImageResource(R.drawable.btn_dialog);
            }
        }
        this.a.setBackgroundColor(0);
        this.a.setOnClickListener(this);
        ImageButton imageButton2 = this.a;
        zzay.zza();
        int zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zza);
        zzay.zza();
        int zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, 0);
        zzay.zza();
        int zzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzb);
        zzay.zza();
        imageButton2.setPadding(zzE, zzE2, zzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzc));
        this.a.setContentDescription("Interstitial close button");
        ImageButton imageButton3 = this.a;
        zzay.zza();
        int zzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzd + zztVar.zza + zztVar.zzb);
        zzay.zza();
        addView(imageButton3, new FrameLayout.LayoutParams(zzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzd + zztVar.zzc), 17));
        long longValue = ((Long) zzba.zzc().a(zzbjg.T1)).longValue();
        if (longValue <= 0) {
            return;
        }
        zzs zzsVar = ((Boolean) zzba.zzc().a(zzbjg.U1)).booleanValue() ? new zzs(this) : null;
        this.a.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.a.animate().alpha(1.0f).setDuration(longValue).setListener(zzsVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzah zzahVar = this.b;
        if (zzahVar != null) {
            zzahVar.zzc();
        }
    }

    public final void zza(boolean z) {
        ImageButton imageButton = this.a;
        if (!z) {
            imageButton.setVisibility(0);
            return;
        }
        imageButton.setVisibility(8);
        if (((Long) zzba.zzc().a(zzbjg.T1)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }
}
