package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                strArr = SafeParcelReader.j(parcel, readInt);
            } else if (c == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.l(parcel, readInt, CursorWindow.CREATOR);
            } else if (c == 3) {
                i2 = SafeParcelReader.v(parcel, readInt);
            } else if (c == 4) {
                bundle = SafeParcelReader.b(parcel, readInt);
            } else if (c != 1000) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                i = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.c = new Bundle();
        int i3 = 0;
        while (true) {
            String[] strArr2 = dataHolder.b;
            if (i3 >= strArr2.length) {
                break;
            }
            dataHolder.c.putInt(strArr2[i3], i3);
            i3++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.d;
        dataHolder.g = new int[cursorWindowArr2.length];
        int i4 = 0;
        for (int i5 = 0; i5 < cursorWindowArr2.length; i5++) {
            dataHolder.g[i5] = i4;
            i4 += cursorWindowArr2[i5].getNumRows() - (i4 - cursorWindowArr2[i5].getStartPosition());
        }
        dataHolder.h = i4;
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
