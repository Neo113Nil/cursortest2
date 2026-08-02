package com.android.billingclient.api;

import android.content.Context;
import com.google.android.datatransport.Priority;
import com.google.android.gms.internal.play_billing.zzlk;
import xsna.ijp;
import xsna.plp0;
import xsna.pop0;
import xsna.vu8;
import xsna.xl5;
import xsna.zop0;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes.dex */
final class zzcn {
    private boolean zza;
    private pop0 zzb;

    public zzcn(Context context) {
        try {
            zop0.b(context);
            this.zzb = zop0.a().c(vu8.e).a("PLAY_BILLING_LIBRARY", new ijp("proto"), new plp0() { // from class: com.android.billingclient.api.zzcm
                @Override // xsna.plp0
                public final Object apply(Object obj) {
                    return ((zzlk) obj).zzh();
                }
            });
        } catch (Throwable unused) {
            this.zza = true;
        }
    }

    public final void zza(zzlk zzlkVar) {
        if (this.zza) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.zzb.b(new xl5(null, zzlkVar, Priority.DEFAULT, null));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingLogger", "logging failed.");
        }
    }
}
