package com.google.android.gms.internal.fitness;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzfh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.m(parcel, readInt, DataType.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzfg(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfg[i];
    }
}
