package com.sofascore.results.player.statistics.career.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import defpackage.wk2;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        wk2 valueOf = wk2.valueOf(parcel.readString());
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i != readInt; i++) {
            arrayList.add(parcel.readSerializable());
        }
        return new PickerItem.Category(valueOf, arrayList, parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PickerItem.Category[i];
    }
}
