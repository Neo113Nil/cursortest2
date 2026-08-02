package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.upload.vk.ui.impl.fragment.view.custom.stories.OnboardingType;
import com.vkontakte.android.R;
import xsna.vu5;
import xsna.zcl;

/* compiled from: AutoRepostToStoriesData.kt */
/* loaded from: classes17.dex */
public final class OnboardingDetails implements Parcelable {
    public static final Parcelable.Creator<OnboardingDetails> CREATOR = new a();
    public final OnboardingType b;
    public final int c;

    /* compiled from: AutoRepostToStoriesData.kt */
    public static final class a implements Parcelable.Creator<OnboardingDetails> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingDetails createFromParcel(Parcel parcel) {
            return new OnboardingDetails(OnboardingType.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingDetails[] newArray(int i) {
            return new OnboardingDetails[i];
        }
    }

    public OnboardingDetails(OnboardingType onboardingType, int i) {
        this.b = onboardingType;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingDetails)) {
            return false;
        }
        OnboardingDetails onboardingDetails = (OnboardingDetails) obj;
        return this.b == onboardingDetails.b && this.c == onboardingDetails.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingDetails(onboardingType=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c);
    }

    public /* synthetic */ OnboardingDetails(OnboardingType onboardingType, int i, int i2, zcl zclVar) {
        this(onboardingType, (i2 & 2) != 0 ? R.string.clips_publish_allow_auto_repost_subtitle : i);
    }
}
