package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final /* synthetic */ class zzas implements com.google.android.gms.ads.internal.util.client.zzq {
    public static final /* synthetic */ zzas a = new zzas();

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    /* renamed from: zza */
    public final /* synthetic */ Object mo910zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof zzcz ? (zzcz) queryLocalInterface : new zzcz(iBinder);
    }
}
