package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        int[] iArr2 = null;
        byte[][] bArr7 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 4:
                    bArr2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    bArr3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    bArr4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    bArr5 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\b':
                    iArr = SafeParcelReader.e(parcel, readInt);
                    break;
                case '\t':
                    bArr6 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\n':
                    iArr2 = SafeParcelReader.e(parcel, readInt);
                    break;
                case 11:
                    bArr7 = SafeParcelReader.d(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzjl(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6, iArr2, bArr7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjl[i];
    }
}
