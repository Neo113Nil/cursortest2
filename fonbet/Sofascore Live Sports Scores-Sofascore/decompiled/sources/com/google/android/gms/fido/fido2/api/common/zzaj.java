package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.fido.zzgx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bArr = SafeParcelReader.c(parcel, readInt);
            } else if (c == 2) {
                bArr2 = SafeParcelReader.c(parcel, readInt);
            } else if (c == 3) {
                bArr3 = SafeParcelReader.c(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                i = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzai(bArr == null ? null : zzgx.r(bArr.length, bArr), bArr2 == null ? null : zzgx.r(bArr2.length, bArr2), bArr3 != null ? zzgx.r(bArr3.length, bArr3) : null, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzai[i];
    }
}
