package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzbrm;
import com.google.android.gms.internal.ads.zzbrn;
import com.google.android.gms.internal.ads.zzbro;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final /* synthetic */ class zzaj implements com.google.android.gms.ads.internal.util.client.zzq {
    public static final /* synthetic */ zzaj a = new zzaj();

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    /* renamed from: zza */
    public final Object mo910zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = zzbrn.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        return queryLocalInterface instanceof zzbro ? (zzbro) queryLocalInterface : new zzbrm(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }
}
