package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import xsna.b5j;
import xsna.ppx0;
import xsna.xkq0;
import xsna.ykq0;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes12.dex */
public final class zzbb implements b5j {
    private final Application zzb;
    private final zzbw zzc;
    private final zzap zzd;
    private final zzbp zze;
    private final zzds zzf;
    private Dialog zzg;
    private zzbu zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    boolean zza = false;

    public zzbb(Application application, zzab zzabVar, zzbw zzbwVar, zzap zzapVar, zzbp zzbpVar, zzds zzdsVar) {
        this.zzb = application;
        this.zzc = zzbwVar;
        this.zzd = zzapVar;
        this.zze = zzbpVar;
        this.zzf = zzdsVar;
    }

    private final void zzk() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzay zzayVar = (zzay) this.zzl.getAndSet(null);
        if (zzayVar != null) {
            zzayVar.zzb();
        }
    }

    @Override // xsna.b5j
    public final void show(Activity activity, b5j.a aVar) {
        zzcr.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            aVar.a(new zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza());
            return;
        }
        this.zzh.zzc();
        zzay zzayVar = new zzay(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzayVar);
        this.zzl.set(zzayVar);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.a(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(C.DEFAULT_MUXED_BUFFER_SIZE, C.DEFAULT_MUXED_BUFFER_SIZE);
        ppx0.b(window, false);
        this.zzk.set(aVar);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    public final zzbu zzc() {
        return this.zzh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(ykq0 ykq0Var, xkq0 xkq0Var) {
        zzbu zza = ((zzbv) this.zzf).zza();
        this.zzh = zza;
        zza.setBackgroundColor(0);
        zza.getSettings().setJavaScriptEnabled(true);
        zza.setWebViewClient(new zzbt(zza, null));
        this.zzj.set(new zzba(ykq0Var, xkq0Var, 0 == true ? 1 : 0));
        zzbu zzbuVar = this.zzh;
        zzbp zzbpVar = this.zze;
        zzbuVar.loadDataWithBaseURL(zzbpVar.zza(), zzbpVar.zzb(), "text/html", C.UTF8_NAME, null);
        zzcr.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzax
            @Override // java.lang.Runnable
            public final void run() {
                zzbb.this.zzj(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void zzg(int i) {
        zzk();
        b5j.a aVar = (b5j.a) this.zzk.getAndSet(null);
        if (aVar == null) {
            return;
        }
        this.zzd.zzg(3);
        aVar.a(null);
    }

    public final void zzh(zzg zzgVar) {
        zzk();
        b5j.a aVar = (b5j.a) this.zzk.getAndSet(null);
        if (aVar == null) {
            return;
        }
        aVar.a(zzgVar.zza());
    }

    public final void zzi() {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadSuccess(this);
    }

    public final void zzj(zzg zzgVar) {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
