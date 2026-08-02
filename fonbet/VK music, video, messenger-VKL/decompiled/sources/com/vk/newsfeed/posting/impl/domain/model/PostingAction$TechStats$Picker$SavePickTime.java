package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import xsna.epx;
import xsna.iq;
import xsna.zcl;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$TechStats$Picker$SavePickTime implements PostingAction.TechStats {
    public static final Parcelable.Creator<PostingAction$TechStats$Picker$SavePickTime> CREATOR = new a();
    public final MobileOfficialAppsFeedStat$PickerType b;
    public final Long c;
    public final Long d;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$TechStats$Picker$SavePickTime> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$TechStats$Picker$SavePickTime createFromParcel(Parcel parcel) {
            return new PostingAction$TechStats$Picker$SavePickTime(MobileOfficialAppsFeedStat$PickerType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$TechStats$Picker$SavePickTime[] newArray(int i) {
            return new PostingAction$TechStats$Picker$SavePickTime[i];
        }
    }

    public PostingAction$TechStats$Picker$SavePickTime(MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType, Long l, Long l2) {
        this.b = mobileOfficialAppsFeedStat$PickerType;
        this.c = l;
        this.d = l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingAction$TechStats$Picker$SavePickTime)) {
            return false;
        }
        PostingAction$TechStats$Picker$SavePickTime postingAction$TechStats$Picker$SavePickTime = (PostingAction$TechStats$Picker$SavePickTime) obj;
        return this.b == postingAction$TechStats$Picker$SavePickTime.b && epx.f(this.c, postingAction$TechStats$Picker$SavePickTime.c) && epx.f(this.d, postingAction$TechStats$Picker$SavePickTime.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavePickTime(pickerType=");
        sb.append(this.b);
        sb.append(", pickElapsedTime=");
        sb.append(this.c);
        sb.append(", interactElapsedTime=");
        return iq.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        Long l = this.c;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
        }
        Long l2 = this.d;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l2);
        }
    }

    public /* synthetic */ PostingAction$TechStats$Picker$SavePickTime(MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType, Long l, Long l2, int i, zcl zclVar) {
        this(mobileOfficialAppsFeedStat$PickerType, l, (i & 4) != 0 ? null : l2);
    }
}
