package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzbzw;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final /* synthetic */ class zzab implements com.google.android.gms.ads.internal.util.client.zzq {
    public static final /* synthetic */ zzab a = new zzab();

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    /* renamed from: zza */
    public final Object mo910zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = zzbzv.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbzw ? (zzbzw) queryLocalInterface : new zzbzu(iBinder);
    }
}
