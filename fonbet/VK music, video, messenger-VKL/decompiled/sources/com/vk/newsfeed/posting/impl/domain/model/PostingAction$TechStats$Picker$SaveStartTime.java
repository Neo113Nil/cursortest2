package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import xsna.vu5;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$TechStats$Picker$SaveStartTime implements PostingAction.TechStats {
    public static final Parcelable.Creator<PostingAction$TechStats$Picker$SaveStartTime> CREATOR = new a();
    public final MobileOfficialAppsFeedStat$PickerType b;
    public final long c;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$TechStats$Picker$SaveStartTime> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$TechStats$Picker$SaveStartTime createFromParcel(Parcel parcel) {
            return new PostingAction$TechStats$Picker$SaveStartTime(MobileOfficialAppsFeedStat$PickerType.valueOf(parcel.readString()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$TechStats$Picker$SaveStartTime[] newArray(int i) {
            return new PostingAction$TechStats$Picker$SaveStartTime[i];
        }
    }

    public PostingAction$TechStats$Picker$SaveStartTime(MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType, long j) {
        this.b = mobileOfficialAppsFeedStat$PickerType;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingAction$TechStats$Picker$SaveStartTime)) {
            return false;
        }
        PostingAction$TechStats$Picker$SaveStartTime postingAction$TechStats$Picker$SaveStartTime = (PostingAction$TechStats$Picker$SaveStartTime) obj;
        return this.b == postingAction$TechStats$Picker$SaveStartTime.b && this.c == postingAction$TechStats$Picker$SaveStartTime.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveStartTime(pickerType=");
        sb.append(this.b);
        sb.append(", elapsedTime=");
        return vu5.a(')', this.c, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeLong(this.c);
    }
}
