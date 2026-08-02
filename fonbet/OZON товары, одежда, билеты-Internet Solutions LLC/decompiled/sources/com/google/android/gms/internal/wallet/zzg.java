package com.google.android.gms.internal.wallet;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
final class zzg implements zzf {
    private zzg() {
    }

    @Override // com.google.android.gms.internal.wallet.zzf
    @NonNull
    public final ExecutorService zza(int i11) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }
}
