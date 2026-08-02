package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzazy implements zzfyg {
    final /* synthetic */ zzfwl zza;

    zzazy(zzbaa zzbaaVar, zzfwl zzfwlVar) {
        this.zza = zzfwlVar;
        Objects.requireNonNull(zzbaaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyg
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
