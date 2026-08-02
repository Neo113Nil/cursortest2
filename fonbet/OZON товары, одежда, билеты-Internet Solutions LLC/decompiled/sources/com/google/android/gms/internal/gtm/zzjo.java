package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.Logger;

/* loaded from: classes9.dex */
final class zzjo implements Logger {
    zzjo() {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void error(Exception exc) {
        zzhl.zzb("", exc);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final int getLogLevel() {
        return 3;
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void info(String str) {
        zzhl.zzc(str);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void setLogLevel(int i11) {
        zzhl.zze("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void verbose(String str) {
        zzhl.zzd(str);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void warn(String str) {
        zzhl.zze(str);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void error(String str) {
        zzhl.zza(str);
    }
}
