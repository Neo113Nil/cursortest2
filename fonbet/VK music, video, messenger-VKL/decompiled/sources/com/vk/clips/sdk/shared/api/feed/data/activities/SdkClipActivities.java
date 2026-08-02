package com.vk.clips.sdk.shared.api.feed.data.activities;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;

/* compiled from: SdkClipActivities.kt */
/* loaded from: classes17.dex */
public final class SdkClipActivities implements Parcelable {
    public static final Parcelable.Creator<SdkClipActivities> CREATOR = new a();
    public final SdkClipActivitiesTarget b;
    public final List<SdkClipActivity> c;

    /* compiled from: SdkClipActivities.kt */
    public static final class a implements Parcelable.Creator<SdkClipActivities> {
        @Override // android.os.Parcelable.Creator
        public final SdkClipActivities createFromParcel(Parcel parcel) {
            SdkClipActivitiesTarget createFromParcel = SdkClipActivitiesTarget.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(SdkClipActivities.class, parcel, arrayList, i, 1);
            }
            return new SdkClipActivities(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SdkClipActivities[] newArray(int i) {
            return new SdkClipActivities[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdkClipActivities(SdkClipActivitiesTarget sdkClipActivitiesTarget, List<? extends SdkClipActivity> list) {
        this.b = sdkClipActivitiesTarget;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkClipActivities)) {
            return false;
        }
        SdkClipActivities sdkClipActivities = (SdkClipActivities) obj;
        return epx.f(this.b, sdkClipActivities.b) && epx.f(this.c, sdkClipActivities.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkClipActivities(target=");
        sb.append(this.b);
        sb.append(", activities=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
