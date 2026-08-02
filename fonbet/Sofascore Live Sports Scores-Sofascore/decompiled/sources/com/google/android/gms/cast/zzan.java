package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                f = SafeParcelReader.t(parcel, readInt);
            } else if (c == 3) {
                f2 = SafeParcelReader.t(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                f3 = SafeParcelReader.t(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzam(f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzam[i];
    }
}
