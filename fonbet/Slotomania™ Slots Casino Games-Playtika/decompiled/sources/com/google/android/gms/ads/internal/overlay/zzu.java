package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbie;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzah zzb;

    public zzu(Context context, zzt zztVar, zzah zzahVar) {
        super(context);
        this.zzb = zzahVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzay.zza();
        int zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zza);
        zzay.zza();
        int zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, 0);
        zzay.zza();
        int zzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzb);
        zzay.zza();
        imageButton.setPadding(zzE, zzE2, zzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzay.zza();
        int zzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzd + zztVar.zza + zztVar.zzb);
        zzay.zza();
        addView(imageButton, new FrameLayout.LayoutParams(zzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzd + zztVar.zzc), 17));
        long longValue = ((Long) zzba.zzc().zzd(zzbie.zzbO)).longValue();
        if (longValue <= 0) {
            return;
        }
        zzs zzsVar = ((Boolean) zzba.zzc().zzd(zzbie.zzbP)).booleanValue() ? new zzs(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzsVar);
    }

    private final void zzc() {
        String str = (String) zzba.zzc().zzd(zzbie.zzbN);
        if (TextUtils.isEmpty(str) || "default".equals(str)) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (zzf == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = zzf.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = zzf.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross);
            }
        } catch (Resources.NotFoundException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        ImageButton imageButton = this.zza;
        imageButton.setImageDrawable(drawable);
        imageButton.setScaleType(ImageView.ScaleType.CENTER);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(h.h, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzah zzahVar = this.zzb;
        if (zzahVar != null) {
            zzahVar.zzd();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void zza(boolean z) {
        if (!z) {
            this.zza.setVisibility(0);
            return;
        }
        ImageButton imageButton = this.zza;
        imageButton.setVisibility(8);
        if (((Long) zzba.zzc().zzd(zzbie.zzbO)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }

    final /* synthetic */ ImageButton zzb() {
        return this.zza;
    }
}
