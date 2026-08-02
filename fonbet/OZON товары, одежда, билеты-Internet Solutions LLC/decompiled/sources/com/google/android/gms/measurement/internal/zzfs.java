package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes9.dex */
public final class zzfs {
    final zzgk zza;

    zzfs(zzll zzllVar) {
        this.zza = zzllVar.zzq();
    }

    @VisibleForTesting
    final boolean zza() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.zza.zzau());
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", UserVerificationMethods.USER_VERIFY_PATTERN).versionCode >= 80837300;
            }
            this.zza.zzay().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e11) {
            this.zza.zzay().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e11);
            return false;
        }
    }
}
