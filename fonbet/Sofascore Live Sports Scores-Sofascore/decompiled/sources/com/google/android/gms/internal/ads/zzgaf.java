package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgaf extends zzbeu implements zzgah {
    @Override // com.google.android.gms.internal.ads.zzgah
    public final void M1() {
        Parcel J = J();
        J.writeIntArray(null);
        Z1(J, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final void g(int i) {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final void h(int i) {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final void x(ObjectWrapper objectWrapper, String str) {
        Parcel J = J();
        zzbew.e(J, objectWrapper);
        J.writeString(str);
        J.writeString(null);
        Z1(J, 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final void y(byte[] bArr) {
        Parcel J = J();
        J.writeByteArray(bArr);
        Z1(J, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final void zze() {
        Z1(J(), 3);
    }
}
