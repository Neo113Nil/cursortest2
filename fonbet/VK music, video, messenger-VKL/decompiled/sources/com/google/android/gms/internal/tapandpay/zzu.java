package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import xsna.x2o0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzu extends x2o0.f {
    private final /* synthetic */ Activity zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ PushTokenizeRequest zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzm zzmVar, c cVar, Activity activity, int i, PushTokenizeRequest pushTokenizeRequest) {
        super(cVar);
        this.zza = activity;
        this.zzb = i;
        this.zzc = pushTokenizeRequest;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* synthetic */ void doExecute(zzh zzhVar) throws RemoteException {
        ((zze) zzhVar.getService()).zza(this.zzc, new zzj(this.zza, this.zzb));
        setResult((zzu) Status.f);
    }
}
