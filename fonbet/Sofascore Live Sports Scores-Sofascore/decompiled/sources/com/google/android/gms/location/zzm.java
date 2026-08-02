package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        byte b = 0;
        long j = 0;
        while (true) {
            float[] fArr = null;
            while (parcel.dataPosition() < B) {
                int readInt = parcel.readInt();
                char c = (char) readInt;
                if (c != 1) {
                    switch (c) {
                        case 4:
                            f = SafeParcelReader.t(parcel, readInt);
                            break;
                        case 5:
                            f2 = SafeParcelReader.t(parcel, readInt);
                            break;
                        case 6:
                            j = SafeParcelReader.x(parcel, readInt);
                            break;
                        case 7:
                            b = SafeParcelReader.q(parcel, readInt);
                            break;
                        case '\b':
                            f3 = SafeParcelReader.t(parcel, readInt);
                            break;
                        case '\t':
                            f4 = SafeParcelReader.t(parcel, readInt);
                            break;
                        default:
                            SafeParcelReader.A(parcel, readInt);
                            break;
                    }
                } else {
                    int z = SafeParcelReader.z(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (z == 0) {
                        break;
                    }
                    float[] createFloatArray = parcel.createFloatArray();
                    parcel.setDataPosition(dataPosition + z);
                    fArr = createFloatArray;
                }
            }
            SafeParcelReader.n(parcel, B);
            return new DeviceOrientation(fArr, f, f2, j, b, f3, f4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientation[i];
    }
}
