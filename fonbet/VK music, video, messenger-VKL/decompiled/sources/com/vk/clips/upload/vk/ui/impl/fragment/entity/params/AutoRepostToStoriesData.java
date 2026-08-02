package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.upload.vk.ui.impl.fragment.view.custom.stories.OnboardingType;
import xsna.epx;
import xsna.zcl;

/* compiled from: AutoRepostToStoriesData.kt */
/* loaded from: classes17.dex */
public final class AutoRepostToStoriesData implements Parcelable {
    public static final Parcelable.Creator<AutoRepostToStoriesData> CREATOR = new a();
    public final boolean b;
    public final OnboardingDetails c;

    /* compiled from: AutoRepostToStoriesData.kt */
    public static final class a implements Parcelable.Creator<AutoRepostToStoriesData> {
        @Override // android.os.Parcelable.Creator
        public final AutoRepostToStoriesData createFromParcel(Parcel parcel) {
            return new AutoRepostToStoriesData(parcel.readInt() != 0, OnboardingDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoRepostToStoriesData[] newArray(int i) {
            return new AutoRepostToStoriesData[i];
        }
    }

    public AutoRepostToStoriesData(boolean z, OnboardingDetails onboardingDetails) {
        this.b = z;
        this.c = onboardingDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoRepostToStoriesData)) {
            return false;
        }
        AutoRepostToStoriesData autoRepostToStoriesData = (AutoRepostToStoriesData) obj;
        return this.b == autoRepostToStoriesData.b && epx.f(this.c, autoRepostToStoriesData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "AutoRepostToStoriesData(allowed=" + this.b + ", onboardingDetails=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        this.c.writeToParcel(parcel, i);
    }

    public /* synthetic */ AutoRepostToStoriesData(boolean z, OnboardingDetails onboardingDetails, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? new OnboardingDetails(OnboardingType.NONE, 0, 2, null) : onboardingDetails);
    }
}
