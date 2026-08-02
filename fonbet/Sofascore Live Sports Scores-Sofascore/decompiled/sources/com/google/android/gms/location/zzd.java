package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList arrayList = null;
        boolean z = false;
        Bundle bundle = null;
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = SafeParcelReader.m(parcel, readInt, DetectedActivity.CREATOR);
            } else if (c == 2) {
                j = SafeParcelReader.x(parcel, readInt);
            } else if (c == 3) {
                j2 = SafeParcelReader.x(parcel, readInt);
            } else if (c == 4) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (c != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                bundle = SafeParcelReader.b(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult();
        Preconditions.a("Must have at least 1 detected activity", (arrayList == null || arrayList.isEmpty()) ? false : true);
        if (j > 0 && j2 > 0) {
            z = true;
        }
        Preconditions.a("Must set times", z);
        activityRecognitionResult.a = arrayList;
        activityRecognitionResult.b = j;
        activityRecognitionResult.c = j2;
        activityRecognitionResult.d = i;
        activityRecognitionResult.e = bundle;
        return activityRecognitionResult;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
