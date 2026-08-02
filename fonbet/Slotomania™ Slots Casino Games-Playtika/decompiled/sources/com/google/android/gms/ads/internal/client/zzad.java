package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzad implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzad zza = new zzad();

    private /* synthetic */ zzad() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
        return queryLocalInterface instanceof zzdu ? (zzdu) queryLocalInterface : new zzdu(iBinder);
    }
}
