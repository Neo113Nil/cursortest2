package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        double d2 = 0.0d;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                d = SafeParcelReader.r(parcel, readInt);
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                d2 = SafeParcelReader.r(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzk(d, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
