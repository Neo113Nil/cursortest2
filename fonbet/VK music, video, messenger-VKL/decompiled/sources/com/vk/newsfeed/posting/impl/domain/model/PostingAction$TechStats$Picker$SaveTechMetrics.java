package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import xsna.epx;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$TechStats$Picker$SaveTechMetrics implements PostingAction.TechStats {
    public static final Parcelable.Creator<PostingAction$TechStats$Picker$SaveTechMetrics> CREATOR = new a();
    public final MobileOfficialAppsFeedStat$PickerType b;
    public final PickerTechMetrics c;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$TechStats$Picker$SaveTechMetrics> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$TechStats$Picker$SaveTechMetrics createFromParcel(Parcel parcel) {
            return new PostingAction$TechStats$Picker$SaveTechMetrics(MobileOfficialAppsFeedStat$PickerType.valueOf(parcel.readString()), PickerTechMetrics.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$TechStats$Picker$SaveTechMetrics[] newArray(int i) {
            return new PostingAction$TechStats$Picker$SaveTechMetrics[i];
        }
    }

    public PostingAction$TechStats$Picker$SaveTechMetrics(MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType, PickerTechMetrics pickerTechMetrics) {
        this.b = mobileOfficialAppsFeedStat$PickerType;
        this.c = pickerTechMetrics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingAction$TechStats$Picker$SaveTechMetrics)) {
            return false;
        }
        PostingAction$TechStats$Picker$SaveTechMetrics postingAction$TechStats$Picker$SaveTechMetrics = (PostingAction$TechStats$Picker$SaveTechMetrics) obj;
        return this.b == postingAction$TechStats$Picker$SaveTechMetrics.b && epx.f(this.c, postingAction$TechStats$Picker$SaveTechMetrics.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SaveTechMetrics(pickerType=" + this.b + ", techMetrics=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        this.c.writeToParcel(parcel, i);
    }
}
