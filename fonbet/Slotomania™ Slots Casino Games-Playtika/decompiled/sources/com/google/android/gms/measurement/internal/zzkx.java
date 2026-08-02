package com.google.android.gms.measurement.internal;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
final class zzkx implements zzew {
    final /* synthetic */ String zza;
    final /* synthetic */ zzlg zzb;

    zzkx(zzlg zzlgVar, String str) {
        this.zzb = zzlgVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzew
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.zzb.zzK(i, th, bArr, this.zza);
    }
}
