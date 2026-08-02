package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes6.dex */
public final class zzbx extends WebView {
    private final Handler zza;
    private final zzcd zzb;
    private boolean zzc;

    public zzbx(zzbz zzbzVar, Handler handler, zzcd zzcdVar) {
        super(zzbzVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzcdVar;
    }

    static /* bridge */ /* synthetic */ boolean zzf(zzbx zzbxVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(h.h, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void zzc() {
        final zzcd zzcdVar = this.zzb;
        Objects.requireNonNull(zzcdVar);
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbu
            @Override // java.lang.Runnable
            public final void run() {
                zzcd.this.zzd();
            }
        });
    }

    public final void zzd(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbt
            @Override // java.lang.Runnable
            public final void run() {
                zzda.zza(zzbx.this, str3);
            }
        });
    }
}
