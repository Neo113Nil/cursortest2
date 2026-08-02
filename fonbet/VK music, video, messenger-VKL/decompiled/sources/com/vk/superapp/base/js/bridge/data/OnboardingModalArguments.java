package com.vk.superapp.base.js.bridge.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;

/* compiled from: OnboardingModalArguments.kt */
/* loaded from: classes6.dex */
public final class OnboardingModalArguments implements Parcelable {
    public static final Parcelable.Creator<OnboardingModalArguments> CREATOR = new a();
    public final List<OnboardingStep> b;

    /* compiled from: OnboardingModalArguments.kt */
    public static final class a implements Parcelable.Creator<OnboardingModalArguments> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingModalArguments createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(OnboardingStep.CREATOR, parcel, arrayList, i, 1);
            }
            return new OnboardingModalArguments(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingModalArguments[] newArray(int i) {
            return new OnboardingModalArguments[i];
        }
    }

    public OnboardingModalArguments(List<OnboardingStep> list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((OnboardingStep) a2.next()).writeToParcel(parcel, i);
        }
    }
}
