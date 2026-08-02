package com.vk.video.ui.upload.impl.publish.presentation.description.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.nr;

/* compiled from: DescriptionArguments.kt */
/* loaded from: classes7.dex */
public final class DescriptionArguments implements Parcelable {
    public static final Parcelable.Creator<DescriptionArguments> CREATOR = new a();
    public final String b;
    public final Integer c;
    public final UserId d;

    /* compiled from: DescriptionArguments.kt */
    public static final class a implements Parcelable.Creator<DescriptionArguments> {
        @Override // android.os.Parcelable.Creator
        public final DescriptionArguments createFromParcel(Parcel parcel) {
            return new DescriptionArguments(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(DescriptionArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DescriptionArguments[] newArray(int i) {
            return new DescriptionArguments[i];
        }
    }

    public DescriptionArguments(String str, Integer num, UserId userId) {
        this.b = str;
        this.c = num;
        this.d = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescriptionArguments)) {
            return false;
        }
        DescriptionArguments descriptionArguments = (DescriptionArguments) obj;
        return epx.f(this.b, descriptionArguments.b) && epx.f(this.c, descriptionArguments.c) && epx.f(this.d, descriptionArguments.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        return Long.hashCode(this.d.b) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DescriptionArguments(description=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", ownerId=");
        return gp.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.d, i);
    }
}
