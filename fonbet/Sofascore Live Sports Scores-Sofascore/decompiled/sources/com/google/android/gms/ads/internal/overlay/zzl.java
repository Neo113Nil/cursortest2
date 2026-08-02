package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.util.zzbr;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzl extends com.google.android.gms.ads.internal.util.zzb {
    public final /* synthetic */ zzm b;

    public /* synthetic */ zzl(zzm zzmVar) {
        this.b = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        zzbr zzy = com.google.android.gms.ads.internal.zzt.zzy();
        zzm zzmVar = this.b;
        Bitmap zza = zzy.zza(Integer.valueOf(zzmVar.b.zzo.zzf));
        if (zza != null) {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.zzl zzlVar = zzmVar.b.zzo;
            boolean z = zzlVar.zzd;
            float f = zzlVar.zze;
            Activity activity = zzmVar.a;
            if (!z || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), zza);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(zza, zza.getWidth(), zza.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), zza);
                }
            }
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzl.this.b.a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
