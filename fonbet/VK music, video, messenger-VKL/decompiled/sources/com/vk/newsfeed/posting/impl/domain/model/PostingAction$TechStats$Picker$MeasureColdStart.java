package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$TechStats$Picker$MeasureColdStart implements PostingAction.TechStats {
    public static final Parcelable.Creator<PostingAction$TechStats$Picker$MeasureColdStart> CREATOR = new a();
    public final MobileOfficialAppsFeedStat$PickerType b;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$TechStats$Picker$MeasureColdStart> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$TechStats$Picker$MeasureColdStart createFromParcel(Parcel parcel) {
            return new PostingAction$TechStats$Picker$MeasureColdStart(MobileOfficialAppsFeedStat$PickerType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$TechStats$Picker$MeasureColdStart[] newArray(int i) {
            return new PostingAction$TechStats$Picker$MeasureColdStart[i];
        }
    }

    public PostingAction$TechStats$Picker$MeasureColdStart(MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType) {
        this.b = mobileOfficialAppsFeedStat$PickerType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostingAction$TechStats$Picker$MeasureColdStart) && this.b == ((PostingAction$TechStats$Picker$MeasureColdStart) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "MeasureColdStart(pickerType=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
    }
}
