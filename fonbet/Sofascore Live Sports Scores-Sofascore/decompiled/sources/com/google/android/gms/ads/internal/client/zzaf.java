package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzcfh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final /* synthetic */ class zzaf implements com.google.android.gms.ads.internal.util.client.zzq {
    public static final /* synthetic */ zzaf a = new zzaf();

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    /* renamed from: zza */
    public final Object mo910zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = zzcfg.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return queryLocalInterface instanceof zzcfh ? (zzcfh) queryLocalInterface : new zzcff(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }
}
