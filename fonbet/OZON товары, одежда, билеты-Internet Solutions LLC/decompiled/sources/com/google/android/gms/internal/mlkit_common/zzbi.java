package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import java.io.IOException;
import r8.b;
import r8.c;
import r8.g;

/* loaded from: classes9.dex */
final class zzbi implements g {
    private boolean zza = false;
    private boolean zzb = false;
    private c zzc;
    private final zzbe zzd;

    zzbi(zzbe zzbeVar) {
        this.zzd = zzbeVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    @NonNull
    public final g add(double d11) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, d11, this.zzb);
        return this;
    }

    final void zza(c cVar, boolean z11) {
        this.zza = false;
        this.zzc = cVar;
        this.zzb = z11;
    }

    @NonNull
    public final g add(float f7) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, f7, this.zzb);
        return this;
    }

    @NonNull
    public final g add(int i11) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, i11, this.zzb);
        return this;
    }

    @NonNull
    public final g add(long j11) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j11, this.zzb);
        return this;
    }

    @Override // r8.g
    @NonNull
    public final g add(String str) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // r8.g
    @NonNull
    public final g add(boolean z11) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z11 ? 1 : 0, this.zzb);
        return this;
    }

    @NonNull
    public final g add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}
