package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final /* synthetic */ class zzad implements com.google.android.gms.ads.internal.util.client.zzq {
    public static final /* synthetic */ zzad a = new zzad();

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    /* renamed from: zza */
    public final Object mo910zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
        return queryLocalInterface instanceof zzdu ? (zzdu) queryLocalInterface : new zzdu(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }
}
