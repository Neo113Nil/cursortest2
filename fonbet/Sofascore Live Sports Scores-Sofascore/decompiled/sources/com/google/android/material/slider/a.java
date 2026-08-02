package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        BaseSlider$SliderState baseSlider$SliderState = new BaseSlider$SliderState(parcel);
        baseSlider$SliderState.a = parcel.readFloat();
        baseSlider$SliderState.b = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        baseSlider$SliderState.c = arrayList;
        parcel.readList(arrayList, Float.class.getClassLoader());
        baseSlider$SliderState.d = parcel.readFloat();
        baseSlider$SliderState.e = parcel.createBooleanArray()[0];
        return baseSlider$SliderState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BaseSlider$SliderState[i];
    }
}
