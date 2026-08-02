package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import xsna.x2o0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzn extends x2o0.f {
    private final /* synthetic */ Activity zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ int zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ int zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(zzm zzmVar, c cVar, Activity activity, int i, int i2, String str, String str2, int i3) {
        super(cVar);
        this.zza = activity;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
        this.zze = str2;
        this.zzf = i3;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* synthetic */ void doExecute(zzh zzhVar) throws RemoteException {
        ((zze) zzhVar.getService()).zza(this.zzc, this.zzd, this.zze, this.zzf, new zzj(this.zza, this.zzb));
        setResult((zzn) Status.f);
    }
}
