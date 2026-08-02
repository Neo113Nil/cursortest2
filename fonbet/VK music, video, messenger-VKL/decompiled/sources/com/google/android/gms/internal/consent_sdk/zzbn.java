package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import com.google.android.ump.ConsentInformation;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import xsna.b5j;
import xsna.d8s;
import xsna.xkq0;
import xsna.ykq0;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes12.dex */
public final class zzbn {
    private final zzds zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    public zzbn(zzds zzdsVar, Executor executor) {
        this.zza = zzdsVar;
        this.zzb = executor;
    }

    public final /* synthetic */ void zza(zzbb zzbbVar) {
        final AtomicReference atomicReference = this.zzd;
        Objects.requireNonNull(atomicReference);
        zzbbVar.zzf(new ykq0() { // from class: com.google.android.gms.internal.consent_sdk.zzbe
            @Override // xsna.ykq0
            public final void onConsentFormLoadSuccess(b5j b5jVar) {
                atomicReference.set(b5jVar);
            }
        }, new xkq0() { // from class: com.google.android.gms.internal.consent_sdk.zzbf
            @Override // xsna.xkq0
            public final void onConsentFormLoadFailure(d8s d8sVar) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(d8sVar.b)));
            }
        });
    }

    public final void zzb(ykq0 ykq0Var, xkq0 xkq0Var) {
        zzcr.zza();
        zzbp zzbpVar = (zzbp) this.zzc.get();
        if (zzbpVar == null) {
            xkq0Var.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
        } else {
            ((zzav) this.zza.zza()).zza(zzbpVar).zzb().zza().zzf(ykq0Var, xkq0Var);
        }
    }

    public final void zzc() {
        zzbp zzbpVar = (zzbp) this.zzc.get();
        if (zzbpVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final zzbb zza = ((zzav) this.zza.zza()).zza(zzbpVar).zzb().zza();
        zza.zza = true;
        zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbd
            @Override // java.lang.Runnable
            public final void run() {
                zzbn.this.zza(zza);
            }
        });
    }

    public final void zzd(zzbp zzbpVar) {
        this.zzc.set(zzbpVar);
    }

    public final void zze(Activity activity, final b5j.a aVar) {
        zzcr.zza();
        zzj zzb = zza.zza(activity).zzb();
        if (zzb == null) {
            zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
                @Override // java.lang.Runnable
                public final void run() {
                    b5j.a.this.a(new zzg(1, "No consentInformation.").zza());
                }
            });
            return;
        }
        if (!zzb.isConsentFormAvailable() && zzb.getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                @Override // java.lang.Runnable
                public final void run() {
                    b5j.a.this.a(new zzg(3, "No valid response received yet.").zza());
                }
            });
            zzb.zza(activity);
        } else {
            if (zzb.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
                zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
                    @Override // java.lang.Runnable
                    public final void run() {
                        b5j.a.this.a(new zzg(3, "Privacy options form is not required.").zza());
                    }
                });
                return;
            }
            b5j b5jVar = (b5j) this.zzd.get();
            if (b5jVar == null) {
                zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                    @Override // java.lang.Runnable
                    public final void run() {
                        b5j.a.this.a(new zzg(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
            } else {
                b5jVar.show(activity, aVar);
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbn.this.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
