package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzew extends zzdf {
    public final String a;
    public final String b;

    public zzew(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String zze() throws RemoteException {
        return this.a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String zzf() throws RemoteException {
        return this.b;
    }
}
