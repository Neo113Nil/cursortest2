package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbfa extends zzbeu implements zzbfc {
    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void G(ObjectWrapper objectWrapper) {
        Parcel J = J();
        zzbew.e(J, objectWrapper);
        J.writeString("GMA_SDK");
        Z1(J, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void h(int i) {
        Parcel J = J();
        J.writeInt(0);
        Z1(J, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void o1(byte[] bArr) {
        Parcel J = J();
        J.writeByteArray(bArr);
        Z1(J, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void p(int i) {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void w() {
        Parcel J = J();
        J.writeIntArray(null);
        Z1(J, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void zzf() {
        Z1(J(), 3);
    }
}
